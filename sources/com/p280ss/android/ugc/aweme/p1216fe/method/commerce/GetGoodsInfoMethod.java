package com.p280ss.android.ugc.aweme.p1216fe.method.commerce;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25243ap;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.GetGoodsInfoMethod */
public final class GetGoodsInfoMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27960a f73662a = new C27960a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.GetGoodsInfoMethod$a */
    public static final class C27960a {
        private C27960a() {
        }

        public /* synthetic */ C27960a(C7571f fVar) {
            this();
        }
    }

    public GetGoodsInfoMethod() {
        this(null, 1, null);
    }

    /* renamed from: c */
    private static SimplePromotion m91538c() {
        Aweme a = C25243ap.m82980a();
        if (a != null) {
            return a.getPromotion();
        }
        return null;
    }

    public GetGoodsInfoMethod(C11087a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        if (r12 == null) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209a(org.json.JSONObject r12, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r13) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r12 = m91538c()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r12 != 0) goto L_0x0012
            java.lang.String r12 = "code"
            r1 = 0
            r0.put(r12, r1)
            goto L_0x0057
        L_0x0012:
            java.lang.String r1 = "code"
            r2 = 1
            r0.put(r1, r2)
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r1 = r12.getVisitor()
            java.lang.String r2 = "goodsInfo"
            java.lang.String r4 = r12.getElasticTitle()
            java.lang.String r5 = r12.getTitle()
            java.util.List r6 = r12.getElasticImages()
            java.util.List r8 = r12.getLabels()
            if (r1 == 0) goto L_0x0036
            java.util.List r12 = r1.getAvatars()
            if (r12 != 0) goto L_0x003a
        L_0x0036:
            java.util.List r12 = kotlin.collections.C7525m.m23461a()
        L_0x003a:
            if (r1 == 0) goto L_0x0041
            long r9 = r1.getCount()
            goto L_0x0043
        L_0x0041:
            r9 = 0
        L_0x0043:
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r1 = new com.ss.android.ugc.aweme.commerce.model.PromotionVisitor
            r1.<init>(r12, r9)
            com.ss.android.ugc.aweme.commerce.service.models.a r12 = new com.ss.android.ugc.aweme.commerce.service.models.a
            r7 = 0
            r3 = r12
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r12 = com.alibaba.fastjson.JSON.toJSONString(r12)
            r0.put(r2, r12)
        L_0x0057:
            r13.mo71365a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.commerce.GetGoodsInfoMethod.mo64209a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ GetGoodsInfoMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
