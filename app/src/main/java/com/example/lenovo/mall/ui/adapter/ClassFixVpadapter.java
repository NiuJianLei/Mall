package com.example.lenovo.mall.ui.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import com.example.lenovo.mall.bean.ClassFixTablayoutBean;

import java.util.ArrayList;

public class ClassFixVpadapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> fraglist=new ArrayList<>();
    private ArrayList<ClassFixTablayoutBean.DlistEntity> titlelist=new ArrayList<>();

    public ClassFixVpadapter(FragmentManager fm,ArrayList<Fragment> fraglist,ArrayList<ClassFixTablayoutBean.DlistEntity> titlelist) {
        super(fm);
        this.fraglist=fraglist;
        this.titlelist=titlelist;

    }

    @Override
    public Fragment getItem(int i) {
        return fraglist.get(i);
    }

    @Override
    public int getCount() {
        return fraglist.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titlelist.get(position).getName();
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

    }
}
