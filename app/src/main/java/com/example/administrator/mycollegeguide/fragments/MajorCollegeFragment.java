package com.example.administrator.mycollegeguide.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.mycollegeguide.R;
import com.example.administrator.mycollegeguide.model.MajorModel;
import com.example.administrator.mycollegeguide.temp_singleton.MajorFactory;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class MajorCollegeFragment extends Fragment {

    private RecyclerView recyclerMajor;
    private MajorAdapter majorAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.major_fragment_layout, container, false);


        recyclerMajor = view.findViewById(R.id.recycler);
        recyclerMajor.setLayoutManager(new LinearLayoutManager(getActivity()));

        getUI();

        return view;
    }




    /**
     * set the views to the ui
     */
    private void getUI(){
        MajorFactory majorFactory = MajorFactory.getInstance(getActivity());
        List<MajorModel> majorModels = majorFactory.getMajorModels();

        if (majorAdapter == null){
            majorAdapter = new MajorAdapter(majorModels);
            recyclerMajor.setAdapter(majorAdapter);
        } else {
            recyclerMajor.setAdapter(majorAdapter);
        }
    }





    /**
     * holder class that create the view
     */
    public class MajorHolder extends RecyclerView.ViewHolder{

        MajorModel major;

        private TextView majorName;
        private TextView department;

        public MajorHolder(View itemView) {
            super(itemView);
        }


        public MajorHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.major_list_layout, parent, false));

            majorName = itemView.findViewById(R.id.major_name);
            department = itemView.findViewById(R.id.major_department);

        }


        public void bind(MajorModel majorModel){
            major = majorModel;

            majorName.setText(major.getName());
            department.setText(major.getDepartment());

        }
    }




    /**
     * the adapter class to create the holder and bind the view
     */

    public class MajorAdapter extends RecyclerView.Adapter<MajorHolder>{


        List<MajorModel> majors;

        public MajorAdapter(List<MajorModel> majorModels){
            majors = majorModels;
        }

        @Override
        public MajorHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new MajorHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(MajorHolder holder, int position) {
            holder.bind(majors.get(position));

        }

        @Override
        public int getItemCount() {
            return majors.size();
        }
    }
}
