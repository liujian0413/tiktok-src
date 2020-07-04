package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import android.net.Uri.Builder;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.b */
public final class C30375b implements C30394n {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f79861a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30375b.class), "uri", "getUri()Landroid/net/Uri;"))};

    /* renamed from: b */
    public final String f79862b;

    /* renamed from: c */
    public final String f79863c;

    /* renamed from: d */
    public final String f79864d;

    /* renamed from: e */
    private final C7541d f79865e = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C30376a(this));

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.b$a */
    static final class C30376a extends Lambda implements C7561a<Uri> {

        /* renamed from: a */
        final /* synthetic */ C30375b f79866a;

        C30376a(C30375b bVar) {
            this.f79866a = bVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Uri invoke() {
            return Uri.parse(this.f79866a.f79862b);
        }
    }

    /* renamed from: a */
    private Uri m99260a() {
        return (Uri) this.f79865e.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f79864d, (java.lang.Object) r3.f79864d) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.hybrid.monitor.b r3 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b) r3
            java.lang.String r0 = r2.f79862b
            java.lang.String r1 = r3.f79862b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f79863c
            java.lang.String r1 = r3.f79863c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f79864d
            java.lang.String r3 = r3.f79864d
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f79862b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f79863c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f79864d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiRequest(url=");
        sb.append(this.f79862b);
        sb.append(", method=");
        sb.append(this.f79863c);
        sb.append(", body=");
        sb.append(this.f79864d);
        sb.append(")");
        return sb.toString();
    }

    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", new Builder().scheme(m99260a().getScheme()).authority(m99260a().getAuthority()).build());
        jSONObject.put("path", m99260a().getPath());
        jSONObject.put("url", new Builder().scheme(m99260a().getScheme()).authority(m99260a().getAuthority()).path(m99260a().getPath()).build());
        jSONObject.put("method", this.f79863c);
        return jSONObject;
    }

    public C30375b(String str, String str2, String str3) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "method");
        C7573i.m23587b(str3, "body");
        this.f79862b = str;
        this.f79863c = str2;
        this.f79864d = str3;
    }
}
