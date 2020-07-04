package com.bytedance.android.live.uikit.viewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabsPagerAdapter extends FragmentPagerAdapter implements C0935e, OnTabChangeListener {

    /* renamed from: a */
    public boolean f10763a;

    /* renamed from: b */
    private final Context f10764b;

    /* renamed from: c */
    private final TabHost f10765c;

    /* renamed from: d */
    private final ViewPager f10766d;

    /* renamed from: e */
    private final ArrayList<C3591a> f10767e;

    /* renamed from: f */
    private final OnTabChangeListener f10768f;

    /* renamed from: com.bytedance.android.live.uikit.viewpager.FragmentTabsPagerAdapter$a */
    static final class C3591a {

        /* renamed from: a */
        public final Class<?> f10769a;

        /* renamed from: b */
        public final Bundle f10770b;

        /* renamed from: c */
        Fragment f10771c;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public int getCount() {
        return this.f10767e.size();
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        C3591a aVar = (C3591a) this.f10767e.get(i);
        return Fragment.instantiate(this.f10764b, aVar.f10769a.getName(), aVar.f10770b);
    }

    public void onPageSelected(int i) {
        TabWidget tabWidget = this.f10765c.getTabWidget();
        int descendantFocusability = tabWidget.getDescendantFocusability();
        tabWidget.setDescendantFocusability(393216);
        this.f10765c.setCurrentTab(i);
        tabWidget.setDescendantFocusability(descendantFocusability);
    }

    public void onTabChanged(String str) {
        this.f10766d.setCurrentItem(this.f10765c.getCurrentTab(), this.f10763a);
        if (this.f10768f != null) {
            this.f10768f.onTabChanged(str);
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        if (instantiateItem != null && (instantiateItem instanceof Fragment) && i >= 0 && i < this.f10767e.size()) {
            ((C3591a) this.f10767e.get(i)).f10771c = (Fragment) instantiateItem;
        }
        return instantiateItem;
    }
}
