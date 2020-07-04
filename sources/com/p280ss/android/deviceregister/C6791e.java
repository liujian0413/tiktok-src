package com.p280ss.android.deviceregister;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.lancet.C7109b;
import com.p280ss.android.ugc.aweme.lancet.C7111c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;

/* renamed from: com.ss.android.deviceregister.e */
final class C6791e {
    /* renamed from: a */
    static String m21093a() {
        if (!C7111c.f19976a) {
            AwemeApplication a = AwemeApplication.m21341a();
            if (a != null) {
                return C7285c.m22838a(a, C6778a.m20960a(), 0).getString("install_id", "");
            }
        }
        return C6789d.m21076c();
    }

    /* renamed from: a */
    static void m21094a(Context context) throws IllegalArgumentException {
        m21097b(context);
        C7111c.f19976a = true;
    }

    /* renamed from: a */
    static void m21095a(Map map) {
        if (!C7109b.f19975c) {
            AwemeApplication a = AwemeApplication.m21341a();
            if (a != null) {
                SharedPreferences a2 = C7285c.m22838a(a, C6778a.m20960a(), 0);
                String string = a2.getString("device_id", "");
                if (!TextUtils.isEmpty(string)) {
                    map.put("device_id", string);
                }
                String string2 = a2.getString("install_id", "");
                if (!TextUtils.isEmpty(string2)) {
                    map.put("install_id", string2);
                }
                String string3 = C7285c.m22838a(a, C6778a.m20964c(), 0).getString("openudid", null);
                if (!TextUtils.isEmpty(string3)) {
                    map.put("openudid", string3);
                }
            }
        }
        C6789d.m21074b(map);
    }

    /* renamed from: b */
    static String m21096b() {
        if (!C7109b.f19975c) {
            AwemeApplication a = AwemeApplication.m21341a();
            if (a != null) {
                return C7285c.m22838a(a, C6778a.m20960a(), 0).getString("device_id", "");
            }
        }
        return C6789d.m21083e();
    }

    /* renamed from: b */
    private static void m21097b(Context context) throws IllegalArgumentException {
        C6789d.m21071b(context);
        C7109b.f19975c = true;
    }
}
