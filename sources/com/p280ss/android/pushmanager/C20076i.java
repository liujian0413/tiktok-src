package com.p280ss.android.pushmanager;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.message.C19809a;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.p280ss.android.pushmanager.thirdparty.IPushAdapter;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ss.android.pushmanager.i */
public class C20076i {

    /* renamed from: j */
    private static C20076i f54281j;

    /* renamed from: l */
    private static final Set<Integer> f54282l = new CopyOnWriteArraySet();

    /* renamed from: a */
    private boolean f54283a = true;

    /* renamed from: b */
    private boolean f54284b = true;

    /* renamed from: c */
    private boolean f54285c = true;

    /* renamed from: d */
    private boolean f54286d = true;

    /* renamed from: e */
    private boolean f54287e = true;

    /* renamed from: f */
    private boolean f54288f = true;

    /* renamed from: g */
    private boolean f54289g = true;

    /* renamed from: h */
    private boolean f54290h = true;

    /* renamed from: i */
    private boolean f54291i = true;

    /* renamed from: k */
    private boolean f54292k;

    /* renamed from: b */
    private void m66117b() {
        if (!this.f54292k) {
            synchronized (this) {
                if (!this.f54292k) {
                    m66118b(C19809a.m65408a());
                    this.f54292k = true;
                }
            }
        }
    }

    /* renamed from: c */
    private static void m66119c() {
        if (f54282l.isEmpty()) {
            m66115a(C20090b.m66187a().mo53791q(), false);
        }
    }

    /* renamed from: a */
    public final JSONArray mo53715a() {
        m66117b();
        JSONArray jSONArray = new JSONArray();
        if (this.f54283a) {
            jSONArray.put(1);
        }
        if (this.f54284b) {
            jSONArray.put(2);
        }
        if (this.f54285c) {
            jSONArray.put(6);
        }
        if (this.f54286d) {
            jSONArray.put(7);
        }
        if (this.f54287e) {
            jSONArray.put(8);
        }
        if (this.f54288f) {
            jSONArray.put(10);
        }
        if (this.f54289g) {
            jSONArray.put(11);
        }
        if (this.f54290h) {
            jSONArray.put(5);
        }
        if (this.f54291i) {
            jSONArray.put(14);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static boolean m66116a(int i) {
        m66119c();
        return f54282l.contains(Integer.valueOf(i));
    }

    private C20076i(Context context) {
        C19809a.m65409a((Application) context.getApplicationContext());
    }

    /* renamed from: a */
    public static C20076i m66114a(Context context) {
        if (f54281j == null) {
            synchronized (C20076i.class) {
                if (f54281j == null) {
                    f54281j = new C20076i(context);
                }
            }
        }
        return f54281j;
    }

    /* renamed from: b */
    private void m66118b(Context context) {
        Object newInstance;
        boolean z;
        Object newInstance2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        try {
            if (Class.forName("com.xiaomi.MiPushAdapter").newInstance() instanceof IPushAdapter) {
                C20074g.m66102a().mo53711b();
                z5 = true;
            } else {
                z5 = false;
            }
            this.f54283a = z5;
        } catch (Throwable unused) {
            this.f54283a = false;
        }
        try {
            this.f54285c = Class.forName("com.umeng.UmengPushAdapter").newInstance() instanceof IPushAdapter;
        } catch (Throwable unused2) {
            this.f54285c = false;
        }
        try {
            this.f54286d = Class.forName("com.huawei.HWPushAdapter").newInstance() instanceof IPushAdapter;
        } catch (Throwable unused3) {
            this.f54286d = false;
        }
        try {
            if (Class.forName("com.meizu.MzPushAdapter").newInstance() instanceof IPushAdapter) {
                C20074g.m66102a().mo53712c();
                z4 = true;
            } else {
                z4 = false;
            }
            this.f54287e = z4;
        } catch (Throwable unused4) {
            this.f54287e = false;
        }
        try {
            Object newInstance3 = Class.forName("com.coloros.OppoPushAdapter").newInstance();
            if (newInstance3 instanceof IPushAdapter) {
                C20074g.m66102a().mo53713d();
                if (((IPushAdapter) newInstance3).isPushAvailable(context, 10)) {
                    z3 = true;
                    this.f54288f = z3;
                    newInstance2 = Class.forName("com.vivo.VivoPushAdapter").newInstance();
                    if ((newInstance2 instanceof IPushAdapter) || !((IPushAdapter) newInstance2).isPushAvailable(context, 11)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    this.f54289g = z2;
                    if ((Class.forName("com.fcm.FcmPushAdapter").newInstance() instanceof IPushAdapter) || !C6776h.m20948b(context, "com.android.vending") || !C6776h.m20948b(context, "com.google.android.gms")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f54290h = z;
                    newInstance = Class.forName("com.adm.push.AdmPushAdapter").newInstance();
                    if ((newInstance instanceof IPushAdapter) || !((IPushAdapter) newInstance).isPushAvailable(context, 14)) {
                        z6 = false;
                    }
                    this.f54291i = z6;
                }
            }
            z3 = false;
            this.f54288f = z3;
        } catch (Throwable unused5) {
            this.f54288f = false;
        }
        try {
            newInstance2 = Class.forName("com.vivo.VivoPushAdapter").newInstance();
            if (newInstance2 instanceof IPushAdapter) {
            }
            z2 = false;
            this.f54289g = z2;
        } catch (Throwable unused6) {
            this.f54289g = false;
        }
        try {
            if (Class.forName("com.fcm.FcmPushAdapter").newInstance() instanceof IPushAdapter) {
            }
            z = false;
            this.f54290h = z;
        } catch (Throwable unused7) {
            this.f54290h = false;
        }
        try {
            newInstance = Class.forName("com.adm.push.AdmPushAdapter").newInstance();
            if (newInstance instanceof IPushAdapter) {
            }
            z6 = false;
            this.f54291i = z6;
        } catch (Throwable unused8) {
            this.f54291i = false;
        }
    }

    /* renamed from: a */
    public final boolean mo53716a(String str) {
        m66117b();
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!"[]".equals(str)) {
                    JSONArray jSONArray = new JSONArray(str);
                    if (jSONArray.length() <= 0) {
                        return false;
                    }
                    if (jSONArray.optInt(0) == -9307) {
                        return true;
                    }
                    String jSONArray2 = mo53715a().toString();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        int optInt = jSONArray.optInt(i);
                        StringBuilder sb = new StringBuilder();
                        sb.append(optInt);
                        if (jSONArray2.contains(sb.toString())) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m66115a(String str, boolean z) {
        if (z) {
            C20090b.m66187a().mo53778g(str);
        }
        if (!TextUtils.isEmpty(str)) {
            JSONArray jSONArray = null;
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException unused) {
            }
            if (jSONArray != null) {
                f54282l.clear();
                int length = jSONArray.length();
                boolean z2 = false;
                for (int i = 0; i < length; i++) {
                    int optInt = jSONArray.optInt(i);
                    if (optInt > 0) {
                        f54282l.add(Integer.valueOf(optInt));
                        if (optInt == 2) {
                            z2 = true;
                        }
                    }
                }
                C20090b.m66187a().mo53771d(z2);
            }
        }
    }
}
