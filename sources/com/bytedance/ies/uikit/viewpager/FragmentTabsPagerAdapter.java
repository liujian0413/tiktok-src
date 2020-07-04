package com.bytedance.ies.uikit.viewpager;

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
    public boolean f30121a;

    /* renamed from: b */
    private final Context f30122b;

    /* renamed from: c */
    private final TabHost f30123c;

    /* renamed from: d */
    private final ViewPager f30124d;

    /* renamed from: e */
    private final ArrayList<C11080a> f30125e;

    /* renamed from: f */
    private final OnTabChangeListener f30126f;

    /* renamed from: com.bytedance.ies.uikit.viewpager.FragmentTabsPagerAdapter$a */
    static final class C11080a {

        /* renamed from: a */
        public final Class<?> f30127a;

        /* renamed from: b */
        public final Bundle f30128b;

        /* renamed from: c */
        Fragment f30129c;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public int getCount() {
        return this.f30125e.size();
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        C11080a aVar = (C11080a) this.f30125e.get(i);
        return Fragment.instantiate(this.f30122b, aVar.f30127a.getName(), aVar.f30128b);
    }

    public void onPageSelected(int i) {
        TabWidget tabWidget = this.f30123c.getTabWidget();
        int descendantFocusability = tabWidget.getDescendantFocusability();
        tabWidget.setDescendantFocusability(393216);
        this.f30123c.setCurrentTab(i);
        tabWidget.setDescendantFocusability(descendantFocusability);
    }

    public void onTabChanged(String str) {
        this.f30124d.setCurrentItem(this.f30123c.getCurrentTab(), this.f30121a);
        if (this.f30126f != null) {
            this.f30126f.onTabChanged(str);
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        if (instantiateItem != null && (instantiateItem instanceof Fragment) && i >= 0 && i < this.f30125e.size()) {
            ((C11080a) this.f30125e.get(i)).f30129c = (Fragment) instantiateItem;
        }
        return instantiateItem;
    }
}
