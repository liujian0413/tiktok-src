package com.p280ss.android.ugc.aweme.commercialize.model;

import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.a */
public final class C24988a {

    /* renamed from: a */
    public final AwemeRawAd f65881a;

    /* renamed from: b */
    public final String f65882b;

    /* renamed from: c */
    public final JSONObject f65883c;

    public C24988a() {
        this(null, null, null, 7, null);
    }

    public C24988a(AwemeRawAd awemeRawAd, String str) {
        this(awemeRawAd, str, null, 4, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f65883c, (java.lang.Object) r3.f65883c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commercialize.model.C24988a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.commercialize.model.a r3 = (com.p280ss.android.ugc.aweme.commercialize.model.C24988a) r3
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.f65881a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r3.f65881a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f65882b
            java.lang.String r1 = r3.f65882b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            org.json.JSONObject r0 = r2.f65883c
            org.json.JSONObject r3 = r3.f65883c
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.model.C24988a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        AwemeRawAd awemeRawAd = this.f65881a;
        int i = 0;
        int hashCode = (awemeRawAd != null ? awemeRawAd.hashCode() : 0) * 31;
        String str = this.f65882b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f65883c;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdDownloadExtObj(rawAd=");
        sb.append(this.f65881a);
        sb.append(", refer=");
        sb.append(this.f65882b);
        sb.append(", adExtraData=");
        sb.append(this.f65883c);
        sb.append(")");
        return sb.toString();
    }

    public C24988a(AwemeRawAd awemeRawAd, String str, JSONObject jSONObject) {
        this.f65881a = awemeRawAd;
        this.f65882b = str;
        this.f65883c = jSONObject;
    }

    private /* synthetic */ C24988a(AwemeRawAd awemeRawAd, String str, JSONObject jSONObject, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            awemeRawAd = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        this(awemeRawAd, str, null);
    }
}
