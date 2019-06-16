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
import com.example.lenovo.mall.bean.TuiJIanBean;
import com.example.lenovo.mall.util.ImageLoader;

import java.util.ArrayList;

public class TuiJianRecAdapter extends RecyclerView.Adapter<TuiJianRecAdapter.ViewHolder> {
    private Context context;
    private ArrayList<TuiJIanBean.DlistEntity> list=new ArrayList<>();

    public void setList(ArrayList<TuiJIanBean.DlistEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public TuiJianRecAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=View.inflate(context, R.layout.item_tuijian,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.title.setText(list.get(i).getName());
        viewHolder.jianjie.setText(list.get(i).getNote());
        ImageLoader.setImage(context,list.get(i).getPic(),viewHolder.iamge,R.drawable.a5);
        viewHolder.price.setText("$"+list.get(i).getAmount());

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
            iamge = itemView.findViewById(R.id.tuijian_image);
            price = itemView.findViewById(R.id.tuijian_price);
            jianjie = itemView.findViewById(R.id.tuijian_jianjie);
            title = itemView.findViewById(R.id.tuijian_title);
        }
    }
}
