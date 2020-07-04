package com.bytedance.jedi.ext.adapter.multitype;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.multitype.C11738c;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import java.util.List;
import kotlin.jvm.internal.C7573i;

public abstract class MultiTypeRawAdapter<VH extends MultiTypeViewHolder<?>, M extends C11738c<VH>> extends C1262a<VH> implements C11737b<VH, M> {
    /* renamed from: a */
    private static void m34407a(VH vh, int i) {
        C7573i.m23587b(vh, "holder");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29263a(C11743d<VH> dVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo29203b(int i, boolean z);

    public final int getItemViewType(int i) {
        return mo29202b().mo29318b(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        mo29202b().mo29316a(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        mo29202b().mo29319b(recyclerView);
    }

    public /* synthetic */ void onBindViewHolder(C1293v vVar, int i) {
        m34407a((VH) (MultiTypeViewHolder) vVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return mo29202b().mo29313a(viewGroup, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        C7573i.m23587b(vh, "holder");
        C7573i.m23587b(list, "payloads");
        C11738c.m34422a(vh, mo29203b(i, true), i, list);
    }
}
