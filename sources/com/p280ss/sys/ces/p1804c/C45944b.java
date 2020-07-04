package com.p280ss.sys.ces.p1804c;

import android.content.Context;
import com.p280ss.p811a.p812a.C18875a;
import com.p280ss.p811a.p812a.C18876b;
import com.p280ss.sys.ces.C45939c;
import com.p280ss.sys.ces.p1802a.C45932c;

/* renamed from: com.ss.sys.ces.c.b */
public final class C45944b extends C18876b {

    /* renamed from: b */
    private Context f117438b;

    public C45944b(Context context, String str, int i) {
        super(context, str);
        this.f117438b = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18875a.m61613c(i));
        sb.append("/v2/r");
        sb.append(m144096a(i));
        this.f50878a = sb.toString();
    }

    /* renamed from: a */
    private String m144096a(int i) {
        String str = "?os=0&ver=0.6.10.25.17-IH-Ov&m=2";
        String str2 = "";
        try {
            str2 = this.f117438b.getPackageManager().getPackageInfo(this.f117438b.getPackageName(), 0).versionName;
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&app_ver=");
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("&region=");
        sb3.append(C45932c.m144057c(this.f117438b));
        String sb4 = sb3.toString();
        if (i == 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append("&aid=");
            sb5.append(C45939c.m144082b());
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("&did=");
            sb7.append(C45939c.m144085d());
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            sb9.append("&iid=");
            sb9.append(C45939c.m144086e());
            sb4 = sb9.toString();
        }
        if (i != 1) {
            return sb4;
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(sb4);
        sb10.append("&appkey=");
        sb10.append(C45939c.m144088g().NM_getAppKey());
        String sb11 = sb10.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb11);
        sb12.append("&did=");
        sb12.append(C45939c.m144088g().NM_getDeviceId());
        return sb12.toString();
    }

    /* renamed from: a */
    public final boolean mo50247a(int i, byte[] bArr) {
        if (i == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    if (bArr.length == 37) {
                        C45939c.f117417k = true;
                    } else {
                        C45939c.f117417k = false;
                    }
                }
            } catch (Throwable unused) {
                C45939c.f117417k = false;
            }
        }
        return true;
    }
}
