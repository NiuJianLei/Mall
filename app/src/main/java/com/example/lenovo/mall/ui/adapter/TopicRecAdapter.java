package com.example.lenovo.mall.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.bean.TopicTabBean;
import com.example.lenovo.mall.util.ImageLoader;

import java.util.ArrayList;

public class TopicRecAdapter extends RecyclerView.Adapter<TopicRecAdapter.ViewHolder> {
    private ArrayList<TopicTabBean.CategoryEntity> list=new ArrayList<>();
    private Context context;

    public void setList(ArrayList<TopicTabBean.CategoryEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public TopicRecAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= View.inflate(context,R.layout.item_topic,null);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        for (int j = 0; j < list.size(); j++) {
            viewHolder.like.setText(list.get(j).getList().get(i).getSubheading());
            viewHolder.name.setText(list.get(j).getList().get(i).getCategory_name());
            viewHolder.title.setText(list.get(j).getList().get(i).getTitle());
            viewHolder.price.setText("￥"+list.get(j).getList().get(i).getPrice());
            ImageLoader.setCircleImage(context,list.get(j).getList().get(i).getPic(),viewHolder.photo,R.drawable.a5);
            ImageLoader.setImage(context,list.get(j).getList().get(i).getPic(),viewHolder.image,R.drawable.a5);

        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView title;
        private TextView price;
        private TextView like;
        private ImageView photo;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.topic_photo);
            name = itemView.findViewById(R.id.topic_name);
            image = itemView.findViewById(R.id.topic_image);
            title = itemView.findViewById(R.id.topic_title);
            price = itemView.findViewById(R.id.topic_price);
            like = itemView.findViewById(R.id.topic_like);



        }
    }
}
