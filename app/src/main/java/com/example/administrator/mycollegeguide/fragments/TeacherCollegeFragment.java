package com.example.administrator.mycollegeguide.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.mycollegeguide.R;
import com.example.administrator.mycollegeguide.model.Teacher;
import com.example.administrator.mycollegeguide.temp_singleton.TeacherFactory;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class TeacherCollegeFragment extends Fragment {



    private RecyclerView recyclerTeacher;
    private TeacherAdapter teacherAdapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.teacher_list_fragment, container,false);

        recyclerTeacher = view.findViewById(R.id.recycler_teacher);
        recyclerTeacher.setLayoutManager(new LinearLayoutManager(getActivity()));

        getUI();

        return view;
    }




    /**
     * set the views to the ui
     */
    private void getUI(){
        TeacherFactory teacherFactory = TeacherFactory.getInstace(getActivity());
        List<Teacher> teachers = teacherFactory.getTeachers();

        if (teacherAdapter == null){
            teacherAdapter = new TeacherAdapter(teachers);
            recyclerTeacher.setAdapter(teacherAdapter);
        } else {
            recyclerTeacher.setAdapter(teacherAdapter);
        }
    }




    /**
     * holder class that create the view
     */
    public class TeacherHolder extends RecyclerView.ViewHolder{

        Teacher teacher;

        private ImageView teacherPhoto;
        private TextView teacherName;
        private TextView teacherPhone;
        private TextView teacherEmail;
        private TextView teacherOffice;


        public TeacherHolder(View itemView) {
            super(itemView);
        }


        public TeacherHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.teacher_list_layout, parent, false));


            teacherPhoto = itemView.findViewById(R.id.teacher_photo);
            teacherName = itemView.findViewById(R.id.teacher_name);
            teacherPhone = itemView.findViewById(R.id.teacher_phone);
            teacherEmail = itemView.findViewById(R.id.teacher_email);
            teacherOffice = itemView.findViewById(R.id.teacher_office);

        }


        public void bind(Teacher th){
            teacher = th;

            teacherPhoto.setImageResource(teacher.getTeacherPhoto());
            teacherName.setText(teacher.getTeacherName());
            teacherPhone.setText(teacher.getTeacherPhone());
            teacherEmail.setText(teacher.getTeacherEmail());
            teacherOffice.setText(teacher.getTeacherOffice());

        }
    }






    /**
     * the adapter class to create the holder and bind the view
     */

    public class TeacherAdapter extends RecyclerView.Adapter<TeacherHolder>{


        List<Teacher> teachers;


        public TeacherAdapter(List<Teacher> teacherList){
            teachers = teacherList;
        }

        @Override
        public TeacherHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new TeacherHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(TeacherHolder holder, int position) {
            holder.bind(teachers.get(position));
        }

        @Override
        public int getItemCount() {
            return teachers.size();
        }
    }
}
