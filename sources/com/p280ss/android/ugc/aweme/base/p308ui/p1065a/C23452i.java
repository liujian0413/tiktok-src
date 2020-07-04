package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.opensdk.C34672b;
import com.p280ss.android.ugc.aweme.opensdk.model.AnchorInfo;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.i */
public final class C23452i extends C23443b {

    /* renamed from: a */
    public final ViewGroup f61880a;

    /* renamed from: b */
    public final Activity f61881b;

    /* renamed from: l */
    public final String f61882l;

    /* renamed from: a */
    public final void mo59065a() {
        C6907h.m21524a("anchor_entrance_show", m76981g());
    }

    /* renamed from: b */
    public final void mo59068b() {
        C6907h.m21524a("anchor_entrance_click", m76981g());
    }

    /* renamed from: e */
    private final String m76979e() {
        Aweme aweme = this.f61858j;
        if (aweme != null) {
            OpenPlatformStruct openPlatformStruct = aweme.getOpenPlatformStruct();
            if (openPlatformStruct != null) {
                OpenPlatformRawData rawData = openPlatformStruct.getRawData();
                if (rawData != null) {
                    AnchorInfo anchor = rawData.getAnchor();
                    if (anchor != null) {
                        String name = anchor.getName();
                        if (name != null) {
                            return name;
                        }
                    }
                }
            }
        }
        return "";
    }

    /* renamed from: f */
    private final String m76980f() {
        Aweme aweme = this.f61858j;
        if (aweme != null) {
            OpenPlatformStruct openPlatformStruct = aweme.getOpenPlatformStruct();
            if (openPlatformStruct != null) {
                OpenPlatformRawData rawData = openPlatformStruct.getRawData();
                if (rawData != null) {
                    AnchorInfo anchor = rawData.getAnchor();
                    if (anchor != null) {
                        String icon = anchor.getIcon();
                        if (icon != null) {
                            return icon;
                        }
                    }
                }
            }
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r2 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        if (r3 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        if (r5 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009e, code lost:
        if (r5 == null) goto L_0x00a0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.String> m76981g() {
        /*
            r7 = this;
            org.json.JSONObject r0 = r7.f61859k
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
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f61858j
            if (r0 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct r0 = r0.getOpenPlatformStruct()
            if (r0 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData r0 = r0.getRawData()
            if (r0 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.opensdk.model.BaseInfo r0 = r0.getBase()
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.getClientKey()
            if (r0 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r0 = ""
        L_0x0034:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f61858j
            if (r2 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct r2 = r2.getOpenPlatformStruct()
            if (r2 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData r2 = r2.getRawData()
            if (r2 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.opensdk.model.Share r2 = r2.getShare()
            if (r2 == 0) goto L_0x0050
            java.lang.String r2 = r2.getStyleId()
            if (r2 != 0) goto L_0x0052
        L_0x0050:
            java.lang.String r2 = ""
        L_0x0052:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f61858j
            if (r3 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct r3 = r3.getOpenPlatformStruct()
            if (r3 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData r3 = r3.getRawData()
            if (r3 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.opensdk.model.Share r3 = r3.getShare()
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = r3.getShareId()
            if (r3 != 0) goto L_0x0070
        L_0x006e:
            java.lang.String r3 = ""
        L_0x0070:
            com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r5 = "logpb"
            com.ss.android.ugc.aweme.feed.ae r6 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            java.lang.String r1 = r6.mo71790a(r1)
            com.ss.android.ugc.aweme.app.g.d r1 = r4.mo59973a(r5, r1)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f61858j
            if (r5 == 0) goto L_0x008e
            java.lang.String r5 = r5.getAuthorUid()
            if (r5 != 0) goto L_0x0090
        L_0x008e:
            java.lang.String r5 = ""
        L_0x0090:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r4, r5)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f61858j
            if (r5 == 0) goto L_0x00a0
            java.lang.String r5 = r5.getAid()
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            java.lang.String r5 = ""
        L_0x00a2:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r4, r5)
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = r7.f61882l
            if (r5 != 0) goto L_0x00ae
            java.lang.String r5 = ""
        L_0x00ae:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r4, r5)
            java.lang.String r4 = "anchor_type"
            java.lang.String r5 = "third_party"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r4, r5)
            java.lang.String r4 = "client_key"
            com.ss.android.ugc.aweme.app.g.d r0 = r1.mo59973a(r4, r0)
            java.lang.String r1 = "style_id"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "share_id"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            java.lang.String r1 = "EventMapBuilder.newBuild…               .builder()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23452i.m76981g():java.util.Map");
    }

    /* renamed from: a */
    public final void mo59066a(View view) {
        super.mo59066a(view);
        Aweme aweme = this.f61858j;
        if (aweme != null) {
            C34672b.m111967a(this.f61881b, aweme);
        }
    }

    /* renamed from: a */
    public final void mo59067a(Aweme aweme, JSONObject jSONObject) {
        super.mo59067a(aweme, jSONObject);
        C23323e.m76514a(this.f61851c, m76980f());
        this.f61852d.setText(m76979e());
    }

    public C23452i(ViewGroup viewGroup, Activity activity, String str) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(activity, "activity");
        super(viewGroup);
        this.f61880a = viewGroup;
        this.f61881b = activity;
        this.f61882l = str;
    }
}
