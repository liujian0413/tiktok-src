package com.zhihu.matisse.internal.p1856ui.adapter;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p1856ui.PreviewItemFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zhihu.matisse.internal.ui.adapter.PreviewPagerAdapter */
public class PreviewPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    private ArrayList<Item> f121526a = new ArrayList<>();

    /* renamed from: b */
    private C47357a f121527b = null;

    /* renamed from: com.zhihu.matisse.internal.ui.adapter.PreviewPagerAdapter$a */
    public interface C47357a {
    }

    public int getCount() {
        return this.f121526a.size();
    }

    /* renamed from: a */
    public final void mo119417a(List<Item> list) {
        this.f121526a.addAll(list);
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        return PreviewItemFragment.m147877a((Item) this.f121526a.get(i));
    }

    /* renamed from: c */
    public final Item mo119418c(int i) {
        return (Item) this.f121526a.get(i);
    }

    public PreviewPagerAdapter(C0608j jVar, C47357a aVar) {
        super(jVar);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
