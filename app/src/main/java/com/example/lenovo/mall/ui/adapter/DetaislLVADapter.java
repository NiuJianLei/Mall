package com.example.lenovo.mall.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.duanc.app.shopcart.AddMinusView;
import com.example.lenovo.mall.R;
import com.example.lenovo.mall.bean.DetailsBean;
import com.example.lenovo.mall.util.ImageLoader;

import java.util.List;

public class DetaislLVADapter extends BaseAdapter {
    private boolean isShow = true;//是否显示编辑/完成
    private List<DetailsBean.DlistEntity> list;
    private CheckInterface checkInterface;
    private ModifyCountInterface modifyCountInterface;


    public void setList(List<DetailsBean.DlistEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public DetaislLVADapter(Context context) {
        this.context = context;
    }

    /**
     * 单选接口
     *
     * @param checkInterface
     */
    public void setCheckInterface(CheckInterface checkInterface) {
        this.checkInterface = checkInterface;
    }

    /**
     * 改变商品数量接口
     *
     * @param modifyCountInterface
     */
    public void setModifyCountInterface(ModifyCountInterface modifyCountInterface) {
        this.modifyCountInterface = modifyCountInterface;
    }

    private Context context;

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    /**
     * 是否显示可编辑
     *
     * @param flag
     */
    public void isShow(boolean flag) {
        isShow = flag;
        notifyDataSetChanged();
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_details, null, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        DetailsBean.DlistEntity dlistEntity = list.get(i);
        holder.name.setText(list.get(i).getName());
        holder.price.setText(list.get(i).getPrice());
        ImageLoader.setImage(context,list.get(i).getPic(),holder.image,R.drawable.a5);
        holder.add.setInventory(20)
                .setOnNowNumListener(new AddMinusView.onNumListener() {
                    @Override
                    public void onNowNum(int i) {
                        Toast.makeText(context, ""+i, Toast.LENGTH_SHORT).show();
                    }
                });

        return view;

    }

    /**
     * 复选框接口
     */
    public interface CheckInterface {
        /**
         * 组选框状态改变触发的事件
         *
         * @param position  元素位置
         * @param isChecked 元素选中与否
         */
        void checkGroup(int position, boolean isChecked);
    }


    /**
     * 改变数量的接口
     */
    public interface ModifyCountInterface {
        /**
         * 增加操作
         *
         * @param position      组元素位置
         * @param showCountView 用于展示变化后数量的View
         * @param isChecked     子元素选中与否
         */
        void doIncrease(int position, View showCountView, boolean isChecked);

        /**
         * 删减操作
         *
         * @param position      组元素位置
         * @param showCountView 用于展示变化后数量的View
         * @param isChecked     子元素选中与否
         */
        void doDecrease(int position, View showCountView, boolean isChecked);

        /**
         * 删除子item
         *
         * @param position
         */
        void childDelete(int position);
    }


    class ViewHolder {
        private AddMinusView add;
        private ImageView image;
        private TextView name;
        private TextView price;
        private TextView check;

        public ViewHolder(View itemView) {
            add = itemView.findViewById(R.id.details_add);
            image = itemView.findViewById(R.id.details_image);
            name = itemView.findViewById(R.id.details_name);
            price = itemView.findViewById(R.id.details_price);
            check = itemView.findViewById(R.id.check);
        }


    }
}

