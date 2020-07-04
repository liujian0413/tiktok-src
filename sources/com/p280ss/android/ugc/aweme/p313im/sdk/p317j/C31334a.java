package com.p280ss.android.ugc.aweme.p313im.sdk.p317j;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.j.a */
public final class C31334a {

    /* renamed from: a */
    public long f82109a;

    /* renamed from: b */
    public int f82110b;

    /* renamed from: c */
    public int f82111c;

    /* renamed from: d */
    public HashMap<String, String> f82112d;

    /* renamed from: e */
    public String f82113e;

    /* renamed from: f */
    public String f82114f;

    /* renamed from: g */
    public byte[] f82115g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("WsChannelMsg{logId=");
        sb.append(this.f82109a);
        sb.append(", service=");
        sb.append(this.f82110b);
        sb.append(", method=");
        sb.append(this.f82111c);
        sb.append(", msgHeaders=");
        sb.append(this.f82112d);
        sb.append(", payloadEncoding='");
        sb.append(this.f82113e);
        sb.append('\'');
        sb.append(", payloadType='");
        sb.append(this.f82114f);
        sb.append('\'');
        sb.append(", payload=");
        sb.append(Arrays.toString(this.f82115g));
        sb.append('}');
        return sb.toString();
    }
}
