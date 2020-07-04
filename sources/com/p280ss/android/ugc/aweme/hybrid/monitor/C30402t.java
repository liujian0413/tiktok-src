package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import android.net.Uri.Builder;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.t */
public final class C30402t implements C30400r {

    /* renamed from: a */
    public final Uri f79893a;

    /* renamed from: b */
    public final String f79894b;

    /* renamed from: c */
    public final String f79895c;

    /* renamed from: d */
    public final String f79896d;

    /* renamed from: a */
    public final String mo80027a() {
        String uri = new Builder().scheme(this.f79893a.getScheme()).authority(this.f79893a.getAuthority()).path(this.f79893a.getPath()).build().toString();
        C7573i.m23582a((Object) uri, "Uri.Builder()\n          …      .build().toString()");
        return uri;
    }

    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f79894b);
        sb.append("host");
        jSONObject.put(sb.toString(), new Builder().scheme(this.f79893a.getScheme()).authority(this.f79893a.getAuthority()).build());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f79894b);
        sb2.append("path");
        jSONObject.put(sb2.toString(), this.f79893a.getPath());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f79894b);
        sb3.append("url");
        jSONObject.put(sb3.toString(), new Builder().scheme(this.f79893a.getScheme()).authority(this.f79893a.getAuthority()).path(this.f79893a.getPath()).build());
        String str = this.f79895c;
        if (str != null) {
            jSONObject.put("chrome_version", str);
        }
        String str2 = this.f79896d;
        if (str2 != null) {
            jSONObject.put("package", str2);
        }
        return jSONObject;
    }

    private C30402t(Uri uri, String str, String str2, String str3) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "prefix");
        this.f79893a = uri;
        this.f79894b = str;
        this.f79895c = str2;
        this.f79896d = str3;
    }

    public /* synthetic */ C30402t(Uri uri, String str, String str2, String str3, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        this(uri, str, str2, str3);
    }
}
