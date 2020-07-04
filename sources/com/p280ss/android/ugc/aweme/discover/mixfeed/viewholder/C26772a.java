package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.discover.mixfeed.StaggeredGridSpacingItemDecoration;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collections;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.a */
public final class C26772a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f70605a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26772a.class), "tvTitle", "getTvTitle()Landroid/widget/TextView;"))};

    /* renamed from: b */
    public final RecomWordsDisplayAdapter f70606b = new RecomWordsDisplayAdapter();

    /* renamed from: c */
    public final StaggeredGridLayoutManager f70607c = new StaggeredGridLayoutManager(this.f70609e, 0);

    /* renamed from: d */
    public final View f70608d;

    /* renamed from: e */
    public final int f70609e;

    /* renamed from: f */
    private final RecyclerView f70610f = ((RecyclerView) this.f70608d.findViewById(R.id.a1l));

    /* renamed from: g */
    private final C7541d f70611g = C7546e.m23569a(new C26773a(this));

    /* renamed from: h */
    private final StaggeredGridSpacingItemDecoration f70612h = new StaggeredGridSpacingItemDecoration((int) C9738o.m28708b(this.f70608d.getContext(), 12.0f), (int) C9738o.m28708b(this.f70608d.getContext(), 16.0f), this.f70609e);

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.a$a */
    static final class C26773a extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C26772a f70613a;

        C26773a(C26772a aVar) {
            this.f70613a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f70613a.f70608d.findViewById(R.id.e3f);
        }
    }

    /* renamed from: b */
    public final boolean mo68539b() {
        if (this.f70608d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo68538a() {
        RecomWordsDisplayAdapter recomWordsDisplayAdapter = this.f70606b;
        List emptyList = Collections.emptyList();
        C7573i.m23582a((Object) emptyList, "Collections.emptyList()");
        recomWordsDisplayAdapter.mo68505a(emptyList);
        this.f70606b.notifyDataSetChanged();
        this.f70608d.setVisibility(8);
    }

    public C26772a(View view, int i) {
        C7573i.m23587b(view, "rootView");
        this.f70608d = view;
        this.f70609e = i;
        this.f70610f.mo5525a((C1272h) this.f70612h);
        RecyclerView recyclerView = this.f70610f;
        C7573i.m23582a((Object) recyclerView, "wordContainer");
        recyclerView.setLayoutManager(this.f70607c);
        RecyclerView recyclerView2 = this.f70610f;
        C7573i.m23582a((Object) recyclerView2, "wordContainer");
        recyclerView2.setAdapter(this.f70606b);
        mo68538a();
    }
}
