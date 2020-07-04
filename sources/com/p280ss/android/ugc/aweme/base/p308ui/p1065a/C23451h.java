package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.app.Activity;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.h */
public final class C23451h extends C23443b {

    /* renamed from: a */
    public final ViewGroup f61877a;

    /* renamed from: b */
    public final Activity f61878b;

    /* renamed from: l */
    public final String f61879l;

    /* renamed from: d */
    public final int mo61056d() {
        return R.drawable.lp;
    }

    /* renamed from: a */
    public final void mo59065a() {
        C6907h.m21525a("anchor_entrance_show", m76973e());
    }

    /* renamed from: b */
    public final void mo59068b() {
        C6907h.m21525a("anchor_entrance_click", m76973e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r2 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r2 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r2 == null) goto L_0x0035;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject m76973e() {
        /*
            r4 = this;
            org.json.JSONObject r0 = r4.f61859k
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = "request_id"
            java.lang.String r0 = r0.optString(r1)
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r1.<init>()
            r1.setImprId(r0)
            com.ss.android.ugc.aweme.common.j r0 = new com.ss.android.ugc.aweme.common.j
            r0.<init>()
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.ae r3 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            java.lang.String r1 = r3.mo71790a(r1)
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r2, r1)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f61858j
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x0037
        L_0x0035:
            java.lang.String r2 = ""
        L_0x0037:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f61858j
            if (r2 == 0) goto L_0x0047
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x0049
        L_0x0047:
            java.lang.String r2 = ""
        L_0x0049:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r4.f61879l
            if (r2 != 0) goto L_0x0055
            java.lang.String r2 = ""
        L_0x0055:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            java.lang.String r1 = "mv_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f61858j
            if (r2 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct r2 = r2.getUploadMiscInfoStruct()
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = r2.mvThemeId
            if (r2 != 0) goto L_0x006b
        L_0x0069:
            java.lang.String r2 = ""
        L_0x006b:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = "mv_page"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            org.json.JSONObject r0 = r0.mo16967a()
            java.lang.String r1 = "MobJsonHelper()\n        …\n                .build()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23451h.m76973e():org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r1 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r3 == null) goto L_0x0011;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59066a(android.view.View r3) {
        /*
            r2 = this;
            super.mo59066a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r2.f61858j
            if (r3 == 0) goto L_0x0011
            com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct r3 = r3.getUploadMiscInfoStruct()
            if (r3 == 0) goto L_0x0011
            java.lang.String r3 = r3.mvThemeId
            if (r3 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r3 = ""
        L_0x0013:
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001d
            return
        L_0x001d:
            android.app.Activity r0 = r2.f61878b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "//movie/detail"
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r1)
            java.lang.String r1 = "mv_id"
            com.bytedance.router.SmartRoute r3 = r0.withParam(r1, r3)
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = r2.f61879l
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = ""
        L_0x0035:
            com.bytedance.router.SmartRoute r3 = r3.withParam(r0, r1)
            java.lang.String r0 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r2.f61858j
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = r1.getAid()
            if (r1 != 0) goto L_0x0047
        L_0x0045:
            java.lang.String r1 = ""
        L_0x0047:
            com.bytedance.router.SmartRoute r3 = r3.withParam(r0, r1)
            r0 = 10086(0x2766, float:1.4133E-41)
            r3.open(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23451h.mo59066a(android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59067a(com.p280ss.android.ugc.aweme.feed.model.Aweme r2, org.json.JSONObject r3) {
        /*
            r1 = this;
            super.mo59067a(r2, r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r1.f61851c
            r0 = 2131232058(0x7f08053a, float:1.8080215E38)
            r3.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f61852d
            if (r2 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct r0 = r2.getUploadMiscInfoStruct()
            if (r0 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r0 = r0.mvInfo
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r0.getName()
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setText(r0)
            if (r2 != 0) goto L_0x0029
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0029:
            boolean r2 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95568d(r2)
            if (r2 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.h.c r2 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95572g()
            java.lang.String r3 = "CommonFestivalActivityHelper.getFestivalEntity()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.f79518h
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0085
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.f61857i
            r3 = 0
            r2.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.f61857i
            android.app.Activity r3 = r1.f61878b
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131100110(0x7f0601ce, float:1.7812592E38)
            int r3 = r3.getColor(r0)
            r2.setTextColor(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.f61857i
            com.ss.android.ugc.aweme.h.c r3 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95572g()
            if (r3 == 0) goto L_0x007e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "#"
            r3.<init>(r0)
            com.ss.android.ugc.aweme.h.c r0 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95572g()
            if (r0 != 0) goto L_0x0072
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0072:
            java.lang.String r0 = r0.f79518h
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L_0x0082
        L_0x007e:
            java.lang.String r3 = ""
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L_0x0082:
            r2.setText(r3)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23451h.mo59067a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23451h(ViewGroup viewGroup, Activity activity, String str) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(activity, "activity");
        super(viewGroup);
        this.f61877a = viewGroup;
        this.f61878b = activity;
        this.f61879l = str;
    }
}
