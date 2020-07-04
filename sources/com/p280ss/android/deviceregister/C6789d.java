package com.p280ss.android.deviceregister;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.common.C6730a;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.deviceregister.p289a.C6779b;
import com.p280ss.android.deviceregister.p289a.C6780c;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.deviceregister.p290b.C6782a;
import com.p280ss.android.deviceregister.p290b.C6786b;
import com.p280ss.android.deviceregister.p290b.p291a.C6784a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;

/* renamed from: com.ss.android.deviceregister.d */
public class C6789d {

    /* renamed from: a */
    private static volatile C6789d f19363a;

    /* renamed from: b */
    private static volatile boolean f19364b;

    /* renamed from: c */
    private static Context f19365c;

    /* renamed from: d */
    private static boolean f19366d;

    /* renamed from: e */
    private static boolean f19367e;

    /* renamed from: f */
    private final C6786b f19368f = new C6786b(f19365c);

    /* renamed from: com.ss.android.deviceregister.d$a */
    public interface C6790a {
        void onDeviceRegistrationInfoChanged(String str, String str2);

        void onDidLoadLocally(boolean z);

        void onRemoteConfigUpdate(boolean z, boolean z2);
    }

    /* renamed from: a */
    public static void m21056a(Context context) throws IllegalArgumentException {
        C6791e.m21094a(context);
    }

    /* renamed from: a */
    public static void m21066a(Map map) {
        C6791e.m21095a(map);
    }

    /* renamed from: b */
    public static String m21070b() {
        return C6791e.m21093a();
    }

    /* renamed from: d */
    public static String m21080d() {
        return C6791e.m21096b();
    }

    /* renamed from: g */
    public static void m21087g() {
        C6786b.m21026c();
    }

    /* renamed from: h */
    public static void m21088h() {
        C6786b.m21026c();
    }

    /* renamed from: k */
    public static boolean m21091k() {
        return f19367e;
    }

    /* renamed from: a */
    public static boolean m21069a() {
        return f19364b;
    }

    /* renamed from: a */
    public static void m21067a(boolean z) {
        f19366d = z;
    }

    /* renamed from: a */
    public static void m21068a(String[] strArr) {
        C6782a.m20995a(strArr);
    }

    /* renamed from: a */
    public static void m21065a(String str) {
        C6781d.m20987d(str);
    }

    /* renamed from: i */
    public static void m21089i() {
        C6786b.m21015a(f19365c);
    }

    /* renamed from: c */
    public static String m21076c() {
        C6789d dVar = f19363a;
        String str = "";
        if (dVar != null) {
            return dVar.f19368f.f19348p;
        }
        return str;
    }

    /* renamed from: e */
    public static String m21083e() {
        C6789d dVar = f19363a;
        String str = "";
        if (dVar != null) {
            return dVar.f19368f.mo16584b();
        }
        return str;
    }

    /* renamed from: f */
    public static String m21086f() {
        C6789d dVar = f19363a;
        String str = "";
        if (dVar != null) {
            return dVar.f19368f.mo16587f();
        }
        return str;
    }

    /* renamed from: j */
    public static void m21090j() {
        C6789d dVar = f19363a;
        if (dVar != null) {
            dVar.f19368f.mo16581a();
        }
    }

    /* renamed from: l */
    private static String m21092l() {
        C6789d dVar = f19363a;
        String str = "";
        if (dVar != null) {
            return dVar.f19368f.mo16585d();
        }
        return str;
    }

    /* renamed from: a */
    public static void m21055a(int i) {
        C6781d.m20967a(i);
    }

    /* renamed from: b */
    public static void m21073b(String str) {
        C6781d.m20989e(str);
    }

    /* renamed from: c */
    public static void m21078c(String str) {
        C6781d.m20985c(str);
    }

    /* renamed from: d */
    public static void m21082d(boolean z) {
        C6778a.m20962a(z);
    }

    /* renamed from: e */
    public static void m21084e(boolean z) {
        f19367e = z;
    }

    /* renamed from: c */
    public static void m21079c(boolean z) {
        C6781d.m20977a(z);
    }

    /* renamed from: e */
    public static boolean m21085e(Context context) {
        return C6792f.m21102b(context);
    }

    /* renamed from: b */
    public static void m21075b(boolean z) {
        C6782a.m20994a(z);
    }

    /* renamed from: d */
    public static String m21081d(Context context) {
        return C6781d.m20966a(context);
    }

    private C6789d(int i) {
        C6782a.m20997b(f19366d);
        C6781d.m20971a(this.f19368f);
        this.f19368f.mo16582a(i);
    }

    /* renamed from: c */
    public static void m21077c(Context context) {
        if (context != null && f19365c == null) {
            synchronized (C6789d.class) {
                if (f19365c == null) {
                    f19365c = context.getApplicationContext();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m21060a(Bundle bundle) {
        if (bundle != null && bundle.size() > 0) {
            C6786b.m21017a(bundle);
        }
    }

    /* renamed from: b */
    public static void m21071b(Context context) throws IllegalArgumentException {
        if (context != null) {
            f19364b = true;
            int b = C6793k.m21104a().mo16604b();
            if (context instanceof Activity) {
                f19366d = true;
            }
            m21077c(context);
            if (f19363a == null) {
                synchronized (C6789d.class) {
                    if (f19363a == null) {
                        f19363a = new C6789d(b);
                    }
                }
            }
            C6793k.m21104a().mo16596a(b);
            C6794m.m21123a().mo16614b();
            return;
        }
        throw new IllegalArgumentException("context = null");
    }

    /* renamed from: a */
    public static void m21061a(C6730a aVar) {
        C6781d.m20969a(aVar);
        NetUtil.setAppContext(aVar);
    }

    /* renamed from: b */
    public static void m21074b(Map<String, String> map) {
        C6789d dVar = f19363a;
        if (map == null || dVar == null) {
            if (dVar == null && f19365c != null) {
                SharedPreferences a = C7285c.m22838a(f19365c, C6778a.m20960a(), 0);
                String string = a.getString("device_id", "");
                if (!TextUtils.isEmpty(string)) {
                    map.put("device_id", string);
                }
                String string2 = a.getString("install_id", "");
                if (!TextUtils.isEmpty(string2)) {
                    map.put("install_id", string2);
                }
                String string3 = C7285c.m22838a(f19365c, C6778a.m20964c(), 0).getString("openudid", null);
                if (!TextUtils.isEmpty(string3)) {
                    map.put("openudid", string3);
                }
            }
            return;
        }
        String l = m21092l();
        if (l != null) {
            map.put("openudid", l);
        }
        String f = m21086f();
        if (f != null) {
            map.put("clientudid", f);
        }
        String b = m21070b();
        if (b != null) {
            map.put("install_id", b);
        }
        String d = m21080d();
        if (d != null) {
            map.put("device_id", d);
        }
    }

    /* renamed from: a */
    public static void m21062a(C6779b bVar) {
        C6786b.m21018a(bVar);
    }

    /* renamed from: a */
    public static void m21063a(C6780c cVar) {
        C6786b.m21019a(cVar);
    }

    /* renamed from: a */
    public static void m21064a(C6790a aVar) {
        C6786b.m21020a(aVar);
    }

    /* renamed from: a */
    public static void m21057a(Context context, Account account) {
        C6792f.m21099a(context, account);
    }

    /* renamed from: a */
    public static void m21058a(Context context, String str) {
        C6789d dVar = f19363a;
        if (f19363a != null) {
            dVar.f19368f.mo16583a(context, str);
        }
    }

    /* renamed from: b */
    public static void m21072b(Context context, String str) {
        if (f19364b) {
            C6784a a = C6792f.m21098a(context);
            if (a instanceof C6788c) {
                ((C6788c) a).mo16595a(context, str);
                return;
            }
            return;
        }
        throw new IllegalStateException("please init first");
    }

    /* renamed from: a */
    public static void m21059a(Context context, boolean z) {
        C6792f.m21100a(context, z);
    }
}
