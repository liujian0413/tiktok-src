package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commerce.model.PromotionVisitor;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.a */
public final class C24483a {
    @C6593c(mo15949a = "elastic_title")

    /* renamed from: a */
    public String f64599a;
    @C6593c(mo15949a = "title")

    /* renamed from: b */
    public String f64600b;
    @C6593c(mo15949a = "elastic_img")

    /* renamed from: c */
    public List<? extends UrlModel> f64601c;
    @C6593c(mo15949a = "image")

    /* renamed from: d */
    public UrlModel f64602d = null;
    @C6593c(mo15949a = "label")

    /* renamed from: e */
    public List<String> f64603e;
    @C6593c(mo15949a = "visitor")

    /* renamed from: f */
    public PromotionVisitor f64604f;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f64604f, (java.lang.Object) r3.f64604f) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commerce.service.models.C24483a
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.commerce.service.models.a r3 = (com.p280ss.android.ugc.aweme.commerce.service.models.C24483a) r3
            java.lang.String r0 = r2.f64599a
            java.lang.String r1 = r3.f64599a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f64600b
            java.lang.String r1 = r3.f64600b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> r0 = r2.f64601c
            java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> r1 = r3.f64601c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.f64602d
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.f64602d
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<java.lang.String> r0 = r2.f64603e
            java.util.List<java.lang.String> r1 = r3.f64603e
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r0 = r2.f64604f
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r3 = r3.f64604f
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.models.C24483a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f64599a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f64600b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<? extends UrlModel> list = this.f64601c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f64602d;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        List<String> list2 = this.f64603e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        PromotionVisitor promotionVisitor = this.f64604f;
        if (promotionVisitor != null) {
            i = promotionVisitor.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardPromotion(elasticTitle=");
        sb.append(this.f64599a);
        sb.append(", title=");
        sb.append(this.f64600b);
        sb.append(", elasticImages=");
        sb.append(this.f64601c);
        sb.append(", image=");
        sb.append(this.f64602d);
        sb.append(", labels=");
        sb.append(this.f64603e);
        sb.append(", visitor=");
        sb.append(this.f64604f);
        sb.append(")");
        return sb.toString();
    }

    public C24483a(String str, String str2, List<? extends UrlModel> list, UrlModel urlModel, List<String> list2, PromotionVisitor promotionVisitor) {
        C7573i.m23587b(list2, "labels");
        this.f64599a = str;
        this.f64600b = str2;
        this.f64601c = list;
        this.f64603e = list2;
        this.f64604f = promotionVisitor;
    }
}
