package com.bytedance.p073ad.symphony.p083f;

import android.net.Uri;
import com.bytedance.common.utility.C6319n;

/* renamed from: com.bytedance.ad.symphony.f.a */
public final class C2152a {

    /* renamed from: a */
    private String f7309a;

    /* renamed from: b */
    private String f7310b;

    /* renamed from: c */
    private String f7311c;

    /* renamed from: d */
    private String f7312d;

    /* renamed from: e */
    private String f7313e;

    /* renamed from: f */
    private String f7314f;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!C6319n.m19593a(this.f7309a)) {
            sb.append("&aid=");
            sb.append(Uri.encode(this.f7309a));
        }
        if (!C6319n.m19593a(this.f7310b)) {
            sb.append("&channel=");
            sb.append(Uri.encode(this.f7310b));
        }
        if (!C6319n.m19593a(this.f7311c)) {
            sb.append("&device_id=");
            sb.append(Uri.encode(this.f7311c));
        }
        if (!C6319n.m19593a(this.f7312d)) {
            sb.append("&openudid=");
            sb.append(Uri.encode(this.f7312d));
        }
        if (!C6319n.m19593a(this.f7313e)) {
            sb.append("&iid=");
            sb.append(Uri.encode(this.f7313e));
        }
        if (!C6319n.m19593a(this.f7314f)) {
            sb.append("&version_code=");
            sb.append(Uri.encode(this.f7314f));
        }
        return sb.toString();
    }
}
