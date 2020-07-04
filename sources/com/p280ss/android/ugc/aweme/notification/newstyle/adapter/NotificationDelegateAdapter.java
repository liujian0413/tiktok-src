package com.p280ss.android.ugc.aweme.notification.newstyle.adapter;

import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.delegate.C34527d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.NotificationDelegateAdapter */
public final class NotificationDelegateAdapter extends BaseAdapter<BaseNotice> {

    /* renamed from: a */
    public static final C34509a f90026a = new C34509a(null);

    /* renamed from: b */
    private final HashMap<String, BaseNotice> f90027b = new HashMap<>(this.f90030e);

    /* renamed from: c */
    private final int f90028c = ((int) C9738o.m28708b(C6399b.m19921a(), 8.0f));

    /* renamed from: d */
    private final C34527d f90029d;

    /* renamed from: e */
    private int f90030e;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.NotificationDelegateAdapter$a */
    public static final class C34509a {
        private C34509a() {
        }

        public /* synthetic */ C34509a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: f */
    public final void mo87824f() {
        this.f90030e = 0;
    }

    /* renamed from: b */
    public final void mo61577b(List<BaseNotice> list) {
        if (list != null) {
            list = this.f90029d.mo87837a(list);
        }
        super.mo61577b(list);
    }

    /* renamed from: a */
    public final void mo58045a(List<BaseNotice> list) {
        if (list != null) {
            list = this.f90029d.mo87837a(list);
        }
        super.mo58045a(list);
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        int c = C0683b.m2912c(viewGroup.getContext(), R.color.a53);
        this.f67550q = c;
        C1293v a_ = super.mo61886a_(viewGroup);
        DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
        dmtTextView.setGravity(17);
        dmtTextView.setTextColor(c);
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setText(R.string.bmc);
        DmtTextView dmtTextView2 = new DmtTextView(viewGroup.getContext());
        dmtTextView2.setGravity(17);
        dmtTextView2.setTextColor(c);
        dmtTextView2.setTextSize(13.0f);
        dmtTextView2.setText(R.string.bnk);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) dmtTextView2));
            C7573i.m23582a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C34527d dVar = this.f90029d;
        if (viewGroup == null) {
            C7573i.m23580a();
        }
        return dVar.mo87835a(viewGroup, i);
    }

    public NotificationDelegateAdapter(C34527d dVar, int i) {
        C7573i.m23587b(dVar, "mDetailProxy");
        this.f90029d = dVar;
        this.f90030e = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58033a(android.support.p029v7.widget.RecyclerView.C1293v r8, int r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f67539l
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice) r3
            int r0 = r7.f90030e
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r9 <= r0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != 0) goto L_0x0028
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice> r4 = r7.f90027b
            java.lang.String r5 = "notice"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            java.lang.String r5 = r3.getNid()
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L_0x0028
            r6 = 1
            goto L_0x0029
        L_0x0028:
            r6 = r0
        L_0x0029:
            if (r8 == 0) goto L_0x0050
            android.view.View r0 = r8.itemView
            java.lang.String r1 = "holder.itemView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x0048
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            if (r9 != 0) goto L_0x0040
            int r2 = r7.f90028c
        L_0x0040:
            int r4 = r0.rightMargin
            int r5 = r0.bottomMargin
            r0.setMargins(r1, r2, r4, r5)
            goto L_0x0050
        L_0x0048:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r8.<init>(r9)
            throw r8
        L_0x0050:
            com.ss.android.ugc.aweme.notification.newstyle.delegate.d r1 = r7.f90029d
            if (r8 != 0) goto L_0x0057
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0057:
            java.lang.String r0 = "notice"
            kotlin.jvm.internal.C7573i.m23582a(r3, r0)
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice> r5 = r7.f90027b
            r2 = r8
            r4 = r9
            r1.mo87838a(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.adapter.NotificationDelegateAdapter.mo58033a(android.support.v7.widget.RecyclerView$v, int):void");
    }
}
