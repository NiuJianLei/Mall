package com.example.lenovo.mall.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.bean.LikeBean;
import com.example.lenovo.mall.util.ImageLoader;

import java.util.ArrayList;

public class LikeRecAdapter extends RecyclerView.Adapter<LikeRecAdapter.ViewHolder> {
    private ArrayList<LikeBean.DlistEntity> list = new ArrayList<>();
    private Context context;

    public LikeRecAdapter(Context context) {
        this.context = context;
    }

    public void setList(ArrayList<LikeBean.DlistEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(context, R.layout.item_like, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.jianjie.setText(list.get(i).getDescription());
        viewHolder.price.setText("$"+list.get(i).getAmount());
        viewHolder.title.setText(list.get(i).getName());
        ImageLoader.setImage(context, list.get(i).getPic(), viewHolder.image, R.drawable.a5);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView jianjie;
        private TextView price;
        private TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.like_image);
            jianjie = itemView.findViewById(R.id.like_jianjie);
            price = itemView.findViewById(R.id.like_price);
            title = itemView.findViewById(R.id.like_title);
        }
    }
}
