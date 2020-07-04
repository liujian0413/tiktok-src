package com.p280ss.android.ugc.aweme.p1216fe.method.commerce;

import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.OpenTaobaoGoodMethod */
public final class OpenTaobaoGoodMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27964a f73666a = new C27964a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.OpenTaobaoGoodMethod$a */
    public static final class C27964a {
        private C27964a() {
        }

        public /* synthetic */ C27964a(C7571f fVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r12 == null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r0 == null) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209a(org.json.JSONObject r11, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x000c
            java.lang.String r12 = "goodPromotionID"
            java.lang.String r0 = "STRING_NOT_SET"
            java.lang.String r12 = r11.optString(r12, r0)
            if (r12 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r12 = "STRING_NOT_SET"
        L_0x000e:
            if (r11 == 0) goto L_0x001d
            java.lang.String r0 = "goodUrl"
            java.lang.String r1 = "STRING_NOT_SET"
            java.lang.String r0 = r11.optString(r0, r1)
            if (r0 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r3 = r0
            goto L_0x0020
        L_0x001d:
            java.lang.String r0 = "STRING_NOT_SET"
            goto L_0x001b
        L_0x0020:
            r0 = 0
            if (r11 == 0) goto L_0x002a
            java.lang.String r1 = "ec_show_aweme_return"
            org.json.JSONObject r11 = r11.optJSONObject(r1)
            goto L_0x002b
        L_0x002a:
            r11 = r0
        L_0x002b:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r1 = "STRING_NOT_SET"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r12 = android.text.TextUtils.equals(r12, r1)
            if (r12 != 0) goto L_0x00b9
            r12 = r3
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r1 = "STRING_NOT_SET"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r12 = android.text.TextUtils.equals(r12, r1)
            if (r12 == 0) goto L_0x0046
            goto L_0x00b9
        L_0x0046:
            java.lang.ref.WeakReference r12 = r10.f73443f
            if (r12 == 0) goto L_0x00b8
            java.lang.Object r12 = r12.get()
            r2 = r12
            android.content.Context r2 = (android.content.Context) r2
            if (r2 != 0) goto L_0x0055
            goto L_0x00b8
        L_0x0055:
            java.lang.String r12 = "mContextRef?.get() ?: return"
            kotlin.jvm.internal.C7573i.m23582a(r2, r12)
            java.lang.String r12 = "com.taobao.taobao"
            boolean r12 = com.p280ss.android.common.util.C6776h.m20948b(r2, r12)
            if (r12 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.commerce.service.ICommerceService r1 = com.p280ss.android.ugc.aweme.commerce.service.C24436a.m80356a()
            if (r11 == 0) goto L_0x0070
            java.lang.String r12 = "commodity_id"
            java.lang.String r12 = r11.optString(r12)
            r4 = r12
            goto L_0x0071
        L_0x0070:
            r4 = r0
        L_0x0071:
            if (r11 == 0) goto L_0x007f
            java.lang.String r12 = "commodity_type"
            int r12 = r11.optInt(r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r5 = r12
            goto L_0x0080
        L_0x007f:
            r5 = r0
        L_0x0080:
            if (r11 == 0) goto L_0x008a
            java.lang.String r12 = "group_id"
            java.lang.String r12 = r11.optString(r12)
            r6 = r12
            goto L_0x008b
        L_0x008a:
            r6 = r0
        L_0x008b:
            if (r11 == 0) goto L_0x0095
            java.lang.String r12 = "author_id"
            java.lang.String r12 = r11.optString(r12)
            r7 = r12
            goto L_0x0096
        L_0x0095:
            r7 = r0
        L_0x0096:
            if (r11 == 0) goto L_0x00a0
            java.lang.String r12 = "previous_page"
            java.lang.String r11 = r11.optString(r12)
            r8 = r11
            goto L_0x00a1
        L_0x00a0:
            r8 = r0
        L_0x00a1:
            r9 = 0
            r1.openTaobao(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x00a6:
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r12 = com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r11.<init>(r2, r12)
            android.net.Uri r12 = android.net.Uri.parse(r3)
            r11.setData(r12)
            r2.startActivity(r11)
            return
        L_0x00b8:
            return
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.commerce.OpenTaobaoGoodMethod.mo64209a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
