package com.p280ss.android.p817ad.splash.p833d;

import android.net.Uri;
import com.p280ss.android.p817ad.splash.p836g.C19132j;

/* renamed from: com.ss.android.ad.splash.d.a */
public final class C19110a {

    /* renamed from: a */
    public String f51689a;

    /* renamed from: b */
    private String f51690b;

    /* renamed from: c */
    private String f51691c;

    /* renamed from: d */
    private String f51692d;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!C19132j.m62736a(this.f51690b)) {
            sb.append("&iid=");
            sb.append(Uri.encode(this.f51690b));
        }
        if (!C19132j.m62736a(this.f51689a)) {
            sb.append("&device_id=");
            sb.append(Uri.encode(this.f51689a));
        }
        if (!C19132j.m62736a(this.f51692d)) {
            sb.append("&openudid=");
            sb.append(Uri.encode(this.f51692d));
        }
        if (!C19132j.m62736a(this.f51691c)) {
            sb.append("&uuid=");
            sb.append(Uri.encode(this.f51691c));
        }
        return sb.toString();
    }
}
