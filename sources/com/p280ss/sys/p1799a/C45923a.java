package com.p280ss.sys.p1799a;

import android.content.Context;
import android.util.Base64;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.sys.p1799a.p1800a.C45924a;
import org.json.JSONObject;

/* renamed from: com.ss.sys.a.a */
public class C45923a {

    /* renamed from: g */
    private static volatile C45923a f117390g;

    /* renamed from: a */
    protected long f117391a;

    /* renamed from: b */
    protected int f117392b = 504;

    /* renamed from: c */
    protected boolean f117393c;

    /* renamed from: d */
    protected long f117394d;

    /* renamed from: e */
    protected String f117395e = "";

    /* renamed from: f */
    protected String f117396f = "";

    private C45923a() {
    }

    /* renamed from: a */
    public static C45923a m144033a() {
        if (f117390g == null) {
            synchronized (C45923a.class) {
                if (f117390g == null) {
                    f117390g = new C45923a();
                }
            }
        }
        return f117390g;
    }

    /* renamed from: b */
    public static String m144034b() {
        String str;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put(C38347c.f99551f, "1.0.3");
            if (m144033a().f117393c) {
                str = "token_id";
                str2 = m144033a().f117396f;
            } else {
                str = "token_id";
                str2 = "";
            }
            jSONObject.put(str, str2);
            jSONObject.put("code", m144033a().f117392b);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final void mo111208a(Context context, long j, C45924a aVar) {
        if (this.f117392b != 102 && this.f117392b != 202 && this.f117392b != 200) {
            this.f117391a = System.currentTimeMillis();
            this.f117393c = false;
            this.f117394d = j;
            this.f117392b = 102;
            new C45925b(context, aVar).mo111210a();
        }
    }
}
