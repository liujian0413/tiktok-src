package com.p280ss.android.ugc.aweme.base.widget.recyclerview;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;
import com.p280ss.android.ugc.aweme.base.widget.BaseRecyclerView;
import com.p280ss.android.ugc.aweme.base.widget.commonitem.p1068a.C23508a;
import com.p280ss.android.ugc.aweme.base.widget.commonitem.p1068a.C23509b;
import com.p280ss.android.ugc.aweme.base.widget.recyclerview.p1069a.C23521a;
import com.p280ss.android.ugc.aweme.base.widget.recyclerview.p1069a.C23522b;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter */
public abstract class PageLoadingListMultiTypeAdapter extends MultiTypeAdapter<C23360e> implements C23522b {

    /* renamed from: a */
    public C23521a f62087a;

    /* renamed from: b */
    private BaseRecyclerView f62088b;

    /* renamed from: c */
    private C1281m f62089c = new C1281m() {
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            BaseRecyclerView baseRecyclerView = (BaseRecyclerView) recyclerView;
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && baseRecyclerView.mo61102n()) {
                PageLoadingListMultiTypeAdapter.this.f62087a.mo61173a();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    };

    /* renamed from: c */
    public final void mo61169c() {
        this.f62087a.mo61174b();
    }

    /* renamed from: d */
    public final void mo61170d() {
        this.f62087a.mo61175c();
    }

    /* renamed from: e */
    public final void mo61171e() {
        this.f62087a.mo61176d();
    }

    /* renamed from: f */
    public final void mo61172f() {
        this.f62088b.mo61103o();
    }

    /* renamed from: a */
    public final C23360e mo61167a() {
        return new C23509b();
    }

    /* renamed from: b */
    public C23360e mo61168b() {
        return new C23508a("已显示全部内容");
    }

    /* renamed from: a */
    private void m77253a(BaseRecyclerView baseRecyclerView) {
        baseRecyclerView.mo5545b(this.f62089c);
    }

    /* renamed from: b */
    private void m77254b(BaseRecyclerView baseRecyclerView) {
        baseRecyclerView.mo5528a(this.f62089c);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView instanceof BaseRecyclerView) {
            BaseRecyclerView baseRecyclerView = (BaseRecyclerView) recyclerView;
            this.f62088b = baseRecyclerView;
            super.onAttachedToRecyclerView(recyclerView);
            m77254b(baseRecyclerView);
            return;
        }
        StringBuilder sb = new StringBuilder("RecyclerView to hold PageLoadingListMultiTypeAdapter must be a ");
        sb.append(BaseRecyclerView.class.getName());
        sb.append(" !");
        throw new IllegalArgumentException(sb.toString());
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (recyclerView instanceof BaseRecyclerView) {
            this.f62088b = null;
            super.onDetachedFromRecyclerView(recyclerView);
            m77253a((BaseRecyclerView) recyclerView);
            return;
        }
        StringBuilder sb = new StringBuilder("RecyclerView to hold PageLoadingListMultiTypeAdapter must be a ");
        sb.append(BaseRecyclerView.class.getName());
        sb.append(" !");
        throw new IllegalArgumentException(sb.toString());
    }

    public PageLoadingListMultiTypeAdapter(Context context, List<C23360e> list, Map<Class, Class> map) {
        super(context, list, C23521a.m77264a(map));
        this.f62087a = new C23521a(list, this);
    }
}
