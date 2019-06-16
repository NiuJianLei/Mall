package com.example.lenovo.mall.ui.adapter;

import android.content.ContentProvider;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.duanc.app.shopcart.AddMinusView;
import com.example.lenovo.mall.R;
import com.example.lenovo.mall.bean.DetailsBean;
import com.example.lenovo.mall.util.ImageLoader;

import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailsRecAdapter extends RecyclerView.Adapter<DetailsRecAdapter.ViewHolder> {
    private ArrayList<DetailsBean.DlistEntity> list=new ArrayList<>();
    private Context context;
    private HashMap<Integer,Boolean> isSelected ;
    private OnClickListener listener;
    private OnJianClickListener jianListener;
    private OnAddClickListener addListener;
    private int countSum;
    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void setAddListener(OnAddClickListener addListener) {
        this.addListener = addListener;
    }

    public void setIsSelected(HashMap<Integer, Boolean> isSelected) {
        this.isSelected = isSelected;
    }

    public void setList(ArrayList<DetailsBean.DlistEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }
    public DetailsRecAdapter(Context context,ArrayList<DetailsBean.DlistEntity> list) {
        this.context = context;
        this.list=list;
        isSelected= new HashMap<>();
        //默认初始商品状态未选中，保存状态值
        for (int i = 0; i < list.size(); i++) {
            isSelected.put(i,false);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=View.inflate(context,R.layout.item_details,null);

            return new ViewHolder(view);
    }

    public void setCountSum(int countSum) {
        this.countSum = countSum;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
            viewHolder.name.setText(list.get(i).getName());
            viewHolder.price.setText(list.get(i).getPrice());
        ImageLoader.setImage(context,list.get(i).getPic(),viewHolder.image,R.drawable.a5);
        //加减
        viewHolder.add.setInventory(20)
                .setOnNowNumListener(new AddMinusView.onNumListener() {
                    @Override
                    public void onNowNum(int i) {
                        Toast.makeText(context, ""+i,Toast.LENGTH_SHORT).show();
                    }
                });

        viewHolder.check.setChecked(isSelected.get(i));
        //check的选中监听
        viewHolder.check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //是否选中商品
                if(isSelected.get(i)){
                    //改变集合中保存的状态值
                    isSelected.put(i,false);
                    setIsSelected(isSelected);
                }else{
                    //改变集合中保存的状态值
                    isSelected.put(i,true);
                    setIsSelected(isSelected);
                }
                //回调接口
                listener.OnClick(isSelected,i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private AddMinusView add;
        private ImageView image;
        private TextView name;
        private TextView price;
        private CheckBox check;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.details_image);
            name = itemView.findViewById(R.id.details_name);
            price = itemView.findViewById(R.id.details_price);
            check = itemView.findViewById(R.id.check);
            add = itemView.findViewById(R.id.details_add);
        }
    }

    public interface OnClickListener{
        void OnClick(HashMap<Integer, Boolean> map,int position);
    }

    public interface OnJianClickListener{
        void OnJianClick(View view,int position,Boolean boo);
    }

    public interface OnAddClickListener{
        void OnAddClick(View view,int position,Boolean boo);
    }
}
