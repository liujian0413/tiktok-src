package com.bytedance.android.livesdk.overscroll.adapters;

public class ViewPagerOverScrollDecorAdapter implements IOverScrollDecoratorAdapter {

    /* renamed from: a */
    protected int f23756a;

    /* renamed from: b */
    protected float f23757b;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageSelected(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.f23756a = i;
        this.f23757b = f;
    }
}
