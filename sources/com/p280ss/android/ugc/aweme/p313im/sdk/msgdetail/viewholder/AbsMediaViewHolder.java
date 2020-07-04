package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewholder;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a.C31547a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.C31583a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.C31584b;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.MediaBrowserViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C31574a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.AbsMediaViewHolder */
public abstract class AbsMediaViewHolder extends C1293v implements C31584b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82595a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AbsMediaViewHolder.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/msgdetail/viewmodel/MediaBrowserViewModel;"))};

    /* renamed from: f */
    public static final C31554a f82596f = new C31554a(null);

    /* renamed from: b */
    public final RecyclerView f82597b;

    /* renamed from: c */
    public boolean f82598c;

    /* renamed from: d */
    public C31583a f82599d = new C31583a(0, 0, 0);

    /* renamed from: e */
    public C31547a<BaseContent> f82600e;

    /* renamed from: g */
    private final C7541d f82601g = C7546e.m23569a(new C31555b(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.AbsMediaViewHolder$a */
    public static final class C31554a {
        private C31554a() {
        }

        public /* synthetic */ C31554a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.AbsMediaViewHolder$b */
    static final class C31555b extends Lambda implements C7561a<MediaBrowserViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbsMediaViewHolder f82602a;

        C31555b(AbsMediaViewHolder absMediaViewHolder) {
            this.f82602a = absMediaViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MediaBrowserViewModel invoke() {
            FragmentActivity b = this.f82602a.mo82280b();
            if (b == null) {
                C7573i.m23580a();
            }
            return C31574a.m102663a(b);
        }
    }

    /* renamed from: j */
    private MediaBrowserViewModel mo82288j() {
        return (MediaBrowserViewModel) this.f82601g.getValue();
    }

    /* renamed from: a */
    public void mo82277a(View view) {
        C7573i.m23587b(view, "itemView");
    }

    /* renamed from: d */
    public boolean mo82282d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo82283e() {
        return false;
    }

    /* renamed from: f */
    public final void mo82284f() {
        this.f82598c = true;
    }

    /* renamed from: g */
    public void mo82285g() {
        this.f82598c = false;
    }

    /* renamed from: h */
    public void mo82286h() {
    }

    /* renamed from: i */
    public void mo82287i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final FragmentActivity mo82280b() {
        Activity e = C23487o.m77158e(this.itemView);
        if (!(e instanceof FragmentActivity)) {
            e = null;
        }
        return (FragmentActivity) e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Context mo82275a() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        return context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo82281c() {
        MediaBrowserViewModel j = mo82288j();
        if (!this.f82599d.mo82317a()) {
            j = null;
        }
        if (j != null) {
            j.mo82316l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo82276a(int i) {
        T findViewById = this.itemView.findViewById(i);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(id)");
        return findViewById;
    }

    /* renamed from: a */
    public void mo82278a(C31547a<BaseContent> aVar) {
        C7573i.m23587b(aVar, "data");
        if (this.f82600e != aVar) {
            this.f82600e = aVar;
        }
    }

    /* renamed from: a */
    public void mo82279a(C31583a aVar) {
        C7573i.m23587b(aVar, "dragState");
        this.f82599d = aVar;
    }

    public AbsMediaViewHolder(View view, RecyclerView recyclerView) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(recyclerView, "_recyclerView");
        super(view);
        this.f82597b = recyclerView;
        mo82277a(view);
        mo82288j().mo82312a((C31584b) this);
    }
}
