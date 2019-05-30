package com.example.lenovo.mall.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.bean.MiaoShaBean;
import com.example.lenovo.mall.util.ImageLoader;

import java.util.ArrayList;

public class MiaoShaRecAdapter extends RecyclerView.Adapter<MiaoShaRecAdapter.Viewholder> {
    private Context context;
    private ArrayList<MiaoShaBean.DlistEntity> list=new ArrayList<>();

    public void setList(ArrayList<MiaoShaBean.DlistEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public MiaoShaRecAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=View.inflate(context,R.layout.item_miaosha,null);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int i) {
        viewholder.title.setText(list.get(i).getName());
        viewholder.jianjie.setText(list.get(i).getQuen_id().getName());
        viewholder.dangPrice.setText(list.get(i).getPrice());
        viewholder.price.setText(list.get(i).getCeckil_price());
        ImageLoader.setImage(context,R.drawable.a5,viewholder.image,R.drawable.a5);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        private TextView dangPrice;
        private ImageView image;
        private TextView jianjie;
        private TextView price;
        private TextView title;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.miaosha_image);
            jianjie = itemView.findViewById(R.id.miaosha_jianjie);
            price = itemView.findViewById(R.id.miaosha_price);
            title = itemView.findViewById(R.id.miaosha_title);
            dangPrice = itemView.findViewById(R.id.miaosha_dangPrice);
        }
    }
}
