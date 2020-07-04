package com.p280ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25243ap;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.GetGoodsInfoMethod */
public final class GetGoodsInfoMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23569a f62175c = new C23569a(null);

    /* renamed from: d */
    private final String f62176d = "getGoodsInfo";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.GetGoodsInfoMethod$a */
    public static final class C23569a {
        private C23569a() {
        }

        public /* synthetic */ C23569a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62176d;
    }

    /* renamed from: e */
    private static SimplePromotion m77387e() {
        Aweme a = C25243ap.m82980a();
        if (a != null) {
            return a.getPromotion();
        }
        return null;
    }

    public GetGoodsInfoMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r12 == null) goto L_0x0040;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61491a(org.json.JSONObject r12, com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a r13) {
        /*
            r11 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.C7573i.m23587b(r12, r0)
            java.lang.String r12 = "iReturn"
            kotlin.jvm.internal.C7573i.m23587b(r13, r12)
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r12 = m77387e()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0065 }
            r0.<init>()     // Catch:{ JSONException -> 0x0065 }
            if (r12 != 0) goto L_0x001c
            java.lang.String r12 = "code"
            r1 = 0
            r0.put(r12, r1)     // Catch:{ JSONException -> 0x0065 }
            goto L_0x0061
        L_0x001c:
            java.lang.String r1 = "code"
            r2 = 1
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0065 }
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r1 = r12.getVisitor()     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r2 = "goodsInfo"
            java.lang.String r4 = r12.getElasticTitle()     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r5 = r12.getTitle()     // Catch:{ JSONException -> 0x0065 }
            java.util.List r6 = r12.getElasticImages()     // Catch:{ JSONException -> 0x0065 }
            java.util.List r8 = r12.getLabels()     // Catch:{ JSONException -> 0x0065 }
            if (r1 == 0) goto L_0x0040
            java.util.List r12 = r1.getAvatars()     // Catch:{ JSONException -> 0x0065 }
            if (r12 != 0) goto L_0x0044
        L_0x0040:
            java.util.List r12 = kotlin.collections.C7525m.m23461a()     // Catch:{ JSONException -> 0x0065 }
        L_0x0044:
            if (r1 == 0) goto L_0x004b
            long r9 = r1.getCount()     // Catch:{ JSONException -> 0x0065 }
            goto L_0x004d
        L_0x004b:
            r9 = 0
        L_0x004d:
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r1 = new com.ss.android.ugc.aweme.commerce.model.PromotionVisitor     // Catch:{ JSONException -> 0x0065 }
            r1.<init>(r12, r9)     // Catch:{ JSONException -> 0x0065 }
            com.ss.android.ugc.aweme.commerce.service.models.a r12 = new com.ss.android.ugc.aweme.commerce.service.models.a     // Catch:{ JSONException -> 0x0065 }
            r7 = 0
            r3 = r12
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r12 = com.alibaba.fastjson.JSON.toJSONString(r12)     // Catch:{ JSONException -> 0x0065 }
            r0.put(r2, r12)     // Catch:{ JSONException -> 0x0065 }
        L_0x0061:
            r13.mo61495a(r0)     // Catch:{ JSONException -> 0x0065 }
            return
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.bullet.bridge.commerce.GetGoodsInfoMethod.mo61491a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridge$a):void");
    }
}
