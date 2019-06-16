package com.example.lenovo.mall.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.bean.ClassFixTablayoutBean;

import java.util.ArrayList;

public class ClassFixRecAdapter extends RecyclerView.Adapter<ClassFixRecAdapter.ViewHolder> {
    private ArrayList<ClassFixTablayoutBean.DlistEntity.ListEntity> list=new ArrayList<>();
    private Context context;


    public ClassFixRecAdapter(Context context,ArrayList<ClassFixTablayoutBean.DlistEntity.ListEntity> list) {
        this.context = context;
        this.list=list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=View.inflate(context,R.layout.item_classfixrec,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.title.setText(list.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.class_title);
        }
    }
}
