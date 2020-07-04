package com.p280ss.android.ugc.aweme.base.arch;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.multitype.C11737b;
import com.bytedance.jedi.ext.adapter.multitype.C11738c;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.arch.MultiTypeAdapter */
public abstract class MultiTypeAdapter<VH extends MultiTypeViewHolder<?>, M extends C11738c<VH>> extends LoadMoreRecyclerViewAdapter implements C11737b<VH, M> {

    /* renamed from: b */
    public static final C23272a f61305b = new C23272a(null);

    /* renamed from: a */
    private View f61306a;

    /* renamed from: com.ss.android.ugc.aweme.base.arch.MultiTypeAdapter$a */
    public static final class C23272a {
        private C23272a() {
        }

        public /* synthetic */ C23272a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo60560a(C11743d<VH> dVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo60556b(int i, boolean z);

    /* renamed from: e */
    public int mo60563e() {
        if (this.f61306a == null) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public int mo58029a(int i) {
        if (i < mo60563e()) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    /* renamed from: b_ */
    public void mo60562b_(View view) {
        if (view != null) {
            this.f61306a = view;
            notifyItemInserted(0);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        mo29202b().mo29316a(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        mo29202b().mo29319b(recyclerView);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public VH mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i != Integer.MAX_VALUE) {
            return mo29202b().mo29313a(viewGroup, i);
        }
        View view = this.f61306a;
        if (view == null) {
            C7573i.m23580a();
        }
        return (MultiTypeViewHolder) new JediHeaderViewHolder(view);
    }

    public void onBindViewHolder(C1293v vVar, int i, List<Object> list) {
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list, "payloads");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            super.onBindViewHolder(vVar, i, list);
            return;
        }
        if (getItemViewType(i) != Integer.MAX_VALUE) {
            C11738c.m34422a((MultiTypeViewHolder) vVar, mo60556b(i, true), i - mo60563e(), list);
        }
    }
}
