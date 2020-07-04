package com.bytedance.ies.bullet.core.monitor;

import android.net.Uri;
import android.net.Uri.Builder;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.core.monitor.e */
public final class C10427e implements C10426d {

    /* renamed from: a */
    public final Uri f28172a;

    /* renamed from: b */
    public final String f28173b;

    public final JSONObject getFormatData() {
        boolean z;
        String str = this.f28173b;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('_');
            str = sb.toString();
        }
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("host");
        jSONObject.put(sb2.toString(), new Builder().scheme(this.f28172a.getScheme()).authority(this.f28172a.getAuthority()).build());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("path");
        jSONObject.put(sb3.toString(), this.f28172a.getPath());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("url");
        jSONObject.put(sb4.toString(), new Builder().scheme(this.f28172a.getScheme()).authority(this.f28172a.getAuthority()).path(this.f28172a.getPath()).build());
        return jSONObject;
    }

    public C10427e(Uri uri, String str) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "prefix");
        this.f28172a = uri;
        this.f28173b = str;
    }

    public /* synthetic */ C10427e(Uri uri, String str, int i, C7571f fVar) {
        this(uri, "");
    }
}
