package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27699d;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a.C27753a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder */
public final class MediumCollectViewHolder extends C1293v implements C27753a {

    /* renamed from: b */
    public static final C27820a f73347b = new C27820a(null);

    /* renamed from: a */
    public C27699d f73348a;

    /* renamed from: c */
    private final RemoteImageView f73349c;

    /* renamed from: d */
    private final DmtTextView f73350d;

    /* renamed from: e */
    private final DmtTextView f73351e;

    /* renamed from: f */
    private final DmtTextView f73352f;

    /* renamed from: g */
    private final DmtTextView f73353g;

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder$a */
    public static final class C27820a {
        private C27820a() {
        }

        public /* synthetic */ C27820a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MediumCollectViewHolder m91227a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "view");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tt, viewGroup, false);
            C7573i.m23582a((Object) inflate, "inflate");
            return new MediumCollectViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder$b */
    static final class C27821b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediumCollectViewHolder f73354a;

        C27821b(MediumCollectViewHolder mediumCollectViewHolder) {
            this.f73354a = mediumCollectViewHolder;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
            if (r2 == null) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
            if (r1 == null) goto L_0x0016;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            if (r4 == null) goto L_0x0037;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r4)
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r0 = "movie_id"
                com.ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder r1 = r3.f73354a
                com.ss.android.ugc.aweme.favorites.a.d r1 = r1.f73348a
                if (r1 == 0) goto L_0x0016
                java.lang.String r1 = r1.f73013a
                if (r1 != 0) goto L_0x0018
            L_0x0016:
                java.lang.String r1 = ""
            L_0x0018:
                r4.put(r0, r1)
                java.lang.String r0 = "enter_from"
                java.lang.String r1 = "favorite_page"
                r4.put(r0, r1)
                java.lang.String r0 = com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa.m132237a()
                java.lang.String r4 = com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b.m107784a(r0, r4)
                com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa.m132240a(r4)
                com.ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder r4 = r3.f73354a
                com.ss.android.ugc.aweme.favorites.a.d r4 = r4.f73348a
                if (r4 == 0) goto L_0x0037
                java.lang.String r4 = r4.f73013a
                if (r4 != 0) goto L_0x0039
            L_0x0037:
                java.lang.String r4 = ""
            L_0x0039:
                java.lang.String r0 = "favorite_page"
                java.lang.String r1 = "entertainment"
                com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a.m90988f(r4, r0, r1)
                java.lang.String r4 = "enter_entertainment_detail"
                com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "favorite_page"
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "entertainment_id"
                com.ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder r2 = r3.f73354a
                com.ss.android.ugc.aweme.favorites.a.d r2 = r2.f73348a
                if (r2 == 0) goto L_0x005a
                java.lang.String r2 = r2.f73013a
                if (r2 != 0) goto L_0x005c
            L_0x005a:
                java.lang.String r2 = ""
            L_0x005c:
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder.C27821b.onClick(android.view.View):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r0 == null) goto L_0x0008;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71237a() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.favorites.a.d r0 = r2.f73348a
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f73013a
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            r1 = 1
            com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a.m90980b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder.mo71237a():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m91224b() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.f73349c
            com.ss.android.ugc.aweme.favorites.a.d r1 = r7.f73348a
            r2 = 0
            if (r1 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.f73020h
            goto L_0x000b
        L_0x000a:
            r1 = r2
        L_0x000b:
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f73350d
            java.lang.String r1 = "mTitle"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.favorites.a.d r1 = r7.f73348a
            if (r1 == 0) goto L_0x001b
            java.lang.String r2 = r1.f73014b
        L_0x001b:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f73353g
            java.lang.String r1 = "mLabel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.favorites.a.d r1 = r7.f73348a
            if (r1 == 0) goto L_0x0034
            java.lang.Integer r1 = r1.f73015c
            if (r1 == 0) goto L_0x0034
            int r1 = r1.intValue()
            goto L_0x0035
        L_0x0034:
            r1 = -1
        L_0x0035:
            java.lang.String r1 = com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa.m132238a(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.ss.android.ugc.aweme.favorites.a.d r1 = r7.f73348a
            if (r1 == 0) goto L_0x0066
            java.util.List<java.lang.String> r1 = r1.f73018f
            if (r1 == 0) goto L_0x0066
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0051:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "/"
            r0.append(r2)
            goto L_0x0051
        L_0x0066:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            char r1 = r0.charAt(r1)
            r3 = 47
            r4 = 0
            if (r1 != r3) goto L_0x0097
            int r1 = r0.length()
            int r1 = r1 - r2
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = r0.substring(r4, r1)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            goto L_0x0097
        L_0x008f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0097:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f73351e
            java.lang.String r3 = "mPeople"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f73352f
            java.lang.String r1 = "mCount"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.view.View r1 = r7.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            android.content.Context r1 = r1.getContext()
            r3 = 2131827080(0x7f111988, float:1.9287063E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.ss.android.ugc.aweme.favorites.a.d r5 = r7.f73348a
            if (r5 == 0) goto L_0x00c7
            java.lang.Long r5 = r5.f73019g
            if (r5 == 0) goto L_0x00c7
            long r5 = r5.longValue()
            goto L_0x00c9
        L_0x00c7:
            r5 = 0
        L_0x00c9:
            java.lang.String r5 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r5)
            r2[r4] = r5
            java.lang.String r1 = r1.getString(r3, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewholder.MediumCollectViewHolder.m91224b():void");
    }

    /* renamed from: a */
    public final void mo71304a(C27699d dVar) {
        C7573i.m23587b(dVar, "data");
        this.f73348a = dVar;
        m91224b();
        this.itemView.setOnClickListener(new C27821b(this));
    }

    public MediumCollectViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f73349c = (RemoteImageView) view.findViewById(R.id.a4g);
        this.f73350d = (DmtTextView) view.findViewById(R.id.title);
        this.f73351e = (DmtTextView) view.findViewById(R.id.ca7);
        this.f73352f = (DmtTextView) view.findViewById(R.id.a3d);
        this.f73353g = (DmtTextView) view.findViewById(R.id.dwg);
    }
}
