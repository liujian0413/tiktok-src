package android.support.p022v4.p025c;

import android.support.p022v4.util.C0903j;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.c.a */
public final class C0657a {

    /* renamed from: a */
    public final String f2539a;

    /* renamed from: b */
    public final String f2540b;

    /* renamed from: c */
    public final String f2541c;

    /* renamed from: d */
    public final List<List<byte[]>> f2542d;

    /* renamed from: e */
    public final int f2543e = 0;

    /* renamed from: f */
    public final String f2544f;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.f2539a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f2540b);
        sb2.append(", mQuery: ");
        sb2.append(this.f2541c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f2542d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f2542d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(this.f2543e);
        sb.append(sb3.toString());
        return sb.toString();
    }

    public C0657a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2539a = (String) C0903j.m3840a(str);
        this.f2540b = (String) C0903j.m3840a(str2);
        this.f2541c = (String) C0903j.m3840a(str3);
        this.f2542d = (List) C0903j.m3840a(list);
        StringBuilder sb = new StringBuilder(this.f2539a);
        sb.append("-");
        sb.append(this.f2540b);
        sb.append("-");
        sb.append(this.f2541c);
        this.f2544f = sb.toString();
    }
}
