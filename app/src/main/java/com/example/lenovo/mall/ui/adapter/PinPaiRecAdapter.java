package com.example.lenovo.mall.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.bean.PinPaiBean;
import com.example.lenovo.mall.util.ImageLoader;

import java.util.ArrayList;

public class PinPaiRecAdapter extends RecyclerView.Adapter<PinPaiRecAdapter.ViewHolder> {
    private ArrayList<PinPaiBean.DlistEntity> list = new ArrayList<>();
    private Context context;

    public void setList(ArrayList<PinPaiBean.DlistEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public PinPaiRecAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=View.inflate(context,R.layout.item_pinpai,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.price.setText(list.get(i).getZuidijia()+"");
        viewHolder.title.setText(list.get(i).getName());
        ImageLoader.setImage(context,list.get(i).getBigPic(),viewHolder.image,R.drawable.a5);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView title;
        private TextView price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.pinpai_image);
            title = itemView.findViewById(R.id.pinpai_title);
            price = itemView.findViewById(R.id.pinpai_price);
        }
    }
}
