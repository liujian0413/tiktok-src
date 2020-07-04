package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShowPoiSpuAwemeMethod */
public final class ShowPoiSpuAwemeMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C27931a f73595b = new C27931a(null);

    /* renamed from: a */
    public final WeakReference<Context> f73596a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShowPoiSpuAwemeMethod$a */
    public static final class C27931a {
        private C27931a() {
        }

        public /* synthetic */ C27931a(C7571f fVar) {
            this();
        }
    }

    public ShowPoiSpuAwemeMethod(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        this.f73596a = weakReference;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r1 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        if (r9 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r10 == null) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209a(org.json.JSONObject r9, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x000a
            java.lang.String r10 = "spu_id"
            java.lang.String r10 = r9.getString(r10)
            if (r10 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r10 = ""
        L_0x000c:
            if (r9 == 0) goto L_0x0016
            java.lang.String r0 = "poi_id"
            java.lang.String r0 = r9.getString(r0)
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r0 = ""
        L_0x0018:
            if (r9 == 0) goto L_0x0022
            java.lang.String r1 = "aweme_id"
            java.lang.String r1 = r9.getString(r1)
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            java.lang.String r1 = ""
        L_0x0024:
            if (r9 == 0) goto L_0x002d
            java.lang.String r2 = "page_size"
            int r2 = r9.getInt(r2)
            goto L_0x002f
        L_0x002d:
            r2 = 20
        L_0x002f:
            java.lang.String r3 = ""
            r4 = 0
            if (r9 == 0) goto L_0x004d
            java.lang.String r5 = "tracker_data"
            boolean r5 = r9.isNull(r5)
            if (r5 != 0) goto L_0x004d
            java.lang.String r3 = "tracker_data"
            java.lang.String r3 = r9.getString(r3)
            java.lang.String r9 = "params.getString(PARAM_KEY_TRACKER_DATA)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>(r3)
            goto L_0x004e
        L_0x004d:
            r9 = r4
        L_0x004e:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "id"
            r5.putString(r6, r1)
            java.lang.String r1 = "video_from"
            java.lang.String r6 = "from_poi_spu_rate_aweme_rn"
            r5.putString(r1, r6)
            java.lang.String r1 = "userid"
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r7 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            java.lang.String r6 = r6.getCurUserId()
            r5.putString(r1, r6)
            java.lang.String r1 = "refer"
            if (r9 == 0) goto L_0x007d
            java.lang.String r6 = "enter_from"
            java.lang.String r9 = r9.getString(r6)
            if (r9 != 0) goto L_0x007f
        L_0x007d:
            java.lang.String r9 = ""
        L_0x007f:
            r5.putString(r1, r9)
            java.lang.String r9 = "from_post_list"
            r1 = 0
            r5.putInt(r9, r1)
            java.lang.String r9 = "spu_id"
            r5.putString(r9, r10)
            java.lang.String r9 = "page_size"
            r5.putInt(r9, r2)
            java.lang.String r9 = "content_source"
            java.lang.String r1 = "rate"
            r5.putString(r9, r1)
            java.lang.String r9 = "poi_id"
            r5.putString(r9, r0)
            java.lang.String r9 = "tracker_data"
            r5.putString(r9, r3)
            com.ss.android.ugc.aweme.poi.rate.a.b r9 = new com.ss.android.ugc.aweme.poi.rate.a.b
            r9.<init>(r10, r2, r0)
            com.ss.android.ugc.aweme.common.e.a r9 = (com.p280ss.android.ugc.aweme.common.p1144e.C25673a) r9
            com.p280ss.android.ugc.aweme.feed.p1234j.C28503s.m93679a(r9)
            android.content.Intent r9 = new android.content.Intent
            java.lang.ref.WeakReference<android.content.Context> r10 = r8.f73596a
            java.lang.Object r10 = r10.get()
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Class<com.ss.android.ugc.aweme.detail.ui.DetailActivity> r0 = com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity.class
            r9.<init>(r10, r0)
            r9.putExtras(r5)
            java.lang.ref.WeakReference<android.content.Context> r10 = r8.f73596a
            java.lang.Object r10 = r10.get()
            android.content.Context r10 = (android.content.Context) r10
            com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity.m86050a(r10, r9, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.ShowPoiSpuAwemeMethod.mo64209a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
