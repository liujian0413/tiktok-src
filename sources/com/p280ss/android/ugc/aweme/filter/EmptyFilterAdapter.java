package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.EmptyFilterAdapter */
public class EmptyFilterAdapter extends AbsPagerAdapter {

    /* renamed from: d */
    public List<C29296g> f76929d = new ArrayList();

    /* renamed from: e */
    public boolean f76930e;

    /* renamed from: f */
    private List<C29296g> f76931f = new ArrayList();

    /* renamed from: b */
    private void m95632b() {
        notifyDataSetChanged();
    }

    public int getCount() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final List<C29296g> mo74664a() {
        if (this.f76930e) {
            return this.f76929d;
        }
        return this.f76931f;
    }

    public EmptyFilterAdapter(Context context) {
        super(context, LayoutInflater.from(context));
    }

    /* renamed from: a */
    public final void mo74665a(List<C29296g> list) {
        if (this.f76929d.size() != list.size()) {
            this.f76929d.clear();
            this.f76929d.addAll(list);
            if (this.f76930e) {
                m95632b();
            }
        }
    }

    /* renamed from: a */
    public final void mo74667a(boolean z) {
        if (this.f76930e != z) {
            this.f76930e = z;
            m95632b();
        }
    }

    /* renamed from: a */
    public final void mo74666a(List<C29296g> list, boolean z) {
        if (this.f76931f.size() != list.size()) {
            this.f76931f.clear();
            this.f76931f.addAll(list);
            if (!this.f76930e && z) {
                m95632b();
            }
        }
    }

    /* renamed from: a */
    public final View mo26999a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            return new View(viewGroup.getContext());
        }
        return view;
    }
}
