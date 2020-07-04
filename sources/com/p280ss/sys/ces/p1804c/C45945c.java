package com.p280ss.sys.ces.p1804c;

import android.content.Context;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.p811a.p812a.C18875a;
import com.p280ss.p811a.p812a.C18876b;
import com.p280ss.sys.ces.C45928a;
import com.p280ss.sys.ces.C45939c;
import com.p280ss.sys.ces.C45958g;
import com.p280ss.sys.ces.p1802a.C45932c;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ces.c.c */
public final class C45945c extends C18876b {

    /* renamed from: b */
    private Context f117439b;

    public C45945c(Context context, String str) {
        super(context, str);
        this.f117439b = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18875a.m61613c(0));
        sb.append("/v2/s");
        sb.append(m144098a());
        this.f50878a = sb.toString();
    }

    /* renamed from: a */
    private String m144098a() {
        String str = "?os=0&ver=0.6.10.25.17-IH-Ov&m=2";
        String str2 = "";
        try {
            str2 = this.f117439b.getPackageManager().getPackageInfo(this.f117439b.getPackageName(), 0).versionName;
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
        sb3.append(C45932c.m144057c(this.f117439b));
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("&aid=");
        sb5.append(C45939c.m144082b());
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(sb6);
        sb7.append("&did=");
        sb7.append(C45939c.m144085d());
        return sb7.toString();
    }

    /* renamed from: a */
    public final boolean mo50247a(int i, byte[] bArr) {
        if (i == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str = (String) C45928a.meta(C34943c.f91127w, this.f117439b, bArr);
                    if (str != null && str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("result", 0);
                        int optInt2 = jSONObject.optInt("t1", C45958g.f117461a);
                        int optInt3 = jSONObject.optInt("t2", C45958g.f117462b);
                        int optInt4 = jSONObject.optInt("t3", C45958g.f117463c);
                        if (optInt == 1) {
                            C45958g.f117461a = optInt2;
                            C45958g.f117462b = optInt3;
                            C45958g.f117463c = optInt4;
                            C45939c.f117418l = true;
                            return true;
                        }
                        C45939c.f117418l = false;
                    }
                }
            } catch (Throwable unused) {
                C45939c.f117418l = false;
            }
        }
        return false;
    }
}
