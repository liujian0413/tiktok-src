package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.u */
public final class C30403u implements C30400r {

    /* renamed from: a */
    public final C30402t f79897a;

    /* renamed from: b */
    public C30402t f79898b;

    /* renamed from: c */
    public Uri f79899c;

    /* renamed from: d */
    public final Uri f79900d;

    /* renamed from: e */
    public final String f79901e;

    /* renamed from: f */
    public final String f79902f;

    /* renamed from: a */
    public final String mo80027a() {
        String uri = new Builder().scheme(this.f79897a.f79893a.getScheme()).authority(this.f79897a.f79893a.getAuthority()).path(this.f79897a.f79893a.getPath()).build().toString();
        C7573i.m23582a((Object) uri, "Uri.Builder()\n          …      .build().toString()");
        return uri;
    }

    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        C30377c.m99262a(jSONObject, this.f79898b.getFormatData());
        C30377c.m99262a(jSONObject, this.f79897a.getFormatData());
        String str = this.f79901e;
        if (str != null) {
            jSONObject.put("chrome_version", str);
        }
        String str2 = this.f79902f;
        if (str2 != null) {
            jSONObject.put("package", str2);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo80028a(Uri uri) {
        C7573i.m23587b(uri, "value");
        this.f79899c = uri;
        C30402t tVar = new C30402t(this.f79899c, "page_", null, null, 12, null);
        this.f79898b = tVar;
    }

    public C30403u(Uri uri, Uri uri2, String str, String str2) {
        C7573i.m23587b(uri, "referrerUri");
        C7573i.m23587b(uri2, "pageUri");
        this.f79900d = uri;
        this.f79901e = str;
        this.f79902f = str2;
        C30402t tVar = new C30402t(this.f79900d, "referrer_", null, null, 12, null);
        this.f79897a = tVar;
        C30402t tVar2 = new C30402t(uri2, "page_", null, null, 12, null);
        this.f79898b = tVar2;
        this.f79899c = uri2;
    }
}
