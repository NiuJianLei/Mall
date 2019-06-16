package com.example.lenovo.mall.weigth;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class VP extends ViewPager {
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }

    public VP(@NonNull Context context) {
        super(context);
    }

    public VP(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}
