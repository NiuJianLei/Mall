package com.example.lenovo.mall.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.bean.HaoWuBean;
import com.example.lenovo.mall.util.ImageLoader;

import java.util.ArrayList;

public class HaoWuRecAdapter extends RecyclerView.Adapter<HaoWuRecAdapter.ViewHolder> {
    private Context context;
    private ArrayList<HaoWuBean.ListEntity> list=new ArrayList<>();

    public void setList(ArrayList<HaoWuBean.ListEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public HaoWuRecAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=View.inflate(context, R.layout.item_haowu,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            viewHolder.jianjie.setText(list.get(i).getName());
            viewHolder.title.setText(list.get(i).getSubTitle());
            viewHolder.price.setText(list.get(i).getPrice());
        ImageLoader.setImage(context,list.get(i).getPic(),viewHolder.iamge,R.drawable.a5);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView price;
        private TextView jianjie;
        private TextView title;
        private ImageView iamge;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iamge = itemView.findViewById(R.id.haowu_image);
            price = itemView.findViewById(R.id.haowu_price);
            jianjie = itemView.findViewById(R.id.haowu_jianjie);
            title = itemView.findViewById(R.id.haowu_title);
        }
    }
}
