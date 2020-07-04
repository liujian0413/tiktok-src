package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.m */
public final class C23457m extends C23443b {

    /* renamed from: a */
    public final ViewGroup f61903a;

    /* renamed from: b */
    public final Activity f61904b;

    /* renamed from: l */
    public final String f61905l;

    /* renamed from: d */
    public final int mo61056d() {
        return R.drawable.lp;
    }

    /* renamed from: a */
    public final void mo59065a() {
        C6907h.m21525a("anchor_entrance_show", m77020a(""));
    }

    /* renamed from: b */
    public final void mo59068b() {
        String t = C33230ac.m107245t(this.f61858j);
        C7573i.m23582a((Object) t, "MobUtils.getDistributeTypeDes(aweme)");
        C6907h.m21528b("enter_prop_detail", m77020a(t));
        C6907h.m21525a("anchor_entrance_click", m77020a(""));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m77021e() {
        /*
            r2 = this;
            org.json.JSONObject r0 = r2.f61859k
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
            com.ss.android.ugc.aweme.feed.ae r0 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            java.lang.String r0 = r0.mo71790a(r1)
            java.lang.String r1 = "LogPbManager.getInstance().formatLogPb(logPb)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23457m.m77021e():java.lang.String");
    }

    /* renamed from: a */
    public final void mo59066a(View view) {
        super.mo59066a(view);
        Aweme aweme = this.f61858j;
        if (aweme != null) {
            C6903bc.m21500s().mo102611a(aweme, this.f61904b, m77021e());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r2 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r2 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r2 == null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject m77020a(java.lang.String r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.common.j r0 = new com.ss.android.ugc.aweme.common.j
            r0.<init>()
            java.lang.String r1 = "log_pb"
            java.lang.String r2 = r3.m77021e()
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f61858j
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x001d
        L_0x001b:
            java.lang.String r2 = ""
        L_0x001d:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f61858j
            if (r2 == 0) goto L_0x002d
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x002f
        L_0x002d:
            java.lang.String r2 = ""
        L_0x002f:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.f61905l
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = ""
        L_0x003b:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            java.lang.String r1 = "prop_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f61858j
            if (r2 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r2 = r2.getStickerEntranceInfo()
            if (r2 == 0) goto L_0x004f
            java.lang.String r2 = r2.f108868id
            if (r2 != 0) goto L_0x0051
        L_0x004f:
            java.lang.String r2 = ""
        L_0x0051:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = "prop"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "impr_type"
            r0.mo16966a(r1, r4)
        L_0x006b:
            org.json.JSONObject r4 = r0.mo16967a()
            java.lang.String r0 = "helper.build()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23457m.m77020a(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59067a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3, org.json.JSONObject r4) {
        /*
            r2 = this;
            super.mo59067a(r3, r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r2.f61851c
            r0 = 2131232454(0x7f0806c6, float:1.8081018E38)
            r4.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r2.f61852d
            if (r3 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r0 = r3.getStickerEntranceInfo()
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.name
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            if (r3 != 0) goto L_0x0023
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0023:
            boolean r3 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95566c(r3)
            if (r3 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.h.c r3 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95572g()
            java.lang.String r4 = "CommonFestivalActivityHelper.getFestivalEntity()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            java.lang.String r3 = r3.f79518h
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x007f
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r2.f61857i
            com.ss.android.ugc.aweme.h.c r4 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95572g()
            if (r4 == 0) goto L_0x0060
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "#"
            r4.<init>(r0)
            com.ss.android.ugc.aweme.h.c r0 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95572g()
            java.lang.String r1 = "CommonFestivalActivityHelper.getFestivalEntity()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r0 = r0.f79518h
            r4.append(r0)
            java.lang.String r4 = r4.toString()
        L_0x005d:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            goto L_0x0063
        L_0x0060:
            java.lang.String r4 = ""
            goto L_0x005d
        L_0x0063:
            r3.setText(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r2.f61857i
            r4 = 0
            r3.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r2.f61857i
            android.app.Activity r4 = r2.f61904b
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131100110(0x7f0601ce, float:1.7812592E38)
            int r4 = r4.getColor(r0)
            r3.setTextColor(r4)
            return
        L_0x007f:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r2.f61857i
            r4 = 8
            r3.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23457m.mo59067a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23457m(ViewGroup viewGroup, Activity activity, String str) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(activity, "activity");
        super(viewGroup);
        this.f61903a = viewGroup;
        this.f61904b = activity;
        this.f61905l = str;
    }
}
