package com.p280ss.sys.p1806ck.p1807a;

import android.app.Application;
import android.content.Context;
import com.p280ss.sys.p1806ck.SCCheckUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.ss.sys.ck.a.e */
public class C45978e {

    /* renamed from: a */
    public static Context f117507a = null;

    /* renamed from: b */
    public static int f117508b = 25200;

    /* renamed from: c */
    public static int f117509c = 100;

    /* renamed from: d */
    private static C45976c f117510d;

    /* renamed from: com.ss.sys.ck.a.e$a */
    public static class C45979a extends Thread {

        /* renamed from: a */
        private String f117511a;

        public C45979a(String str) {
            this.f117511a = str;
        }

        public final void run() {
            C45978e.m144162a(this.f117511a);
            C45978e.m144161a((Context) null);
        }
    }

    public C45978e() {
        f117510d = C45976c.m144151a(m144160a());
    }

    /* renamed from: a */
    private static long m144159a(JSONObject jSONObject) {
        long j;
        try {
            j = jSONObject.getLong("time");
        } catch (Throwable unused) {
            j = 0;
        }
        if (j == 0) {
            j = System.currentTimeMillis() / 1000;
            try {
                jSONObject.put("time", j);
            } catch (JSONException unused2) {
            }
        }
        return j;
    }

    /* renamed from: a */
    private static Context m144160a() {
        if (f117507a != null) {
            return f117507a;
        }
        try {
            Context applicationContext = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
            f117507a = applicationContext;
            return applicationContext;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m144161a(Context context) {
        Context a = m144160a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long currentTimeMillis2 = (System.currentTimeMillis() / 1000) - ((long) f117508b);
            String a2 = m144165b().mo111327a(currentTimeMillis2, ">?", (long) f117509c);
            if (!a2.equals("")) {
                byte[] bytes = a2.getBytes();
                try {
                    new C45982h(a).mo111333a(bytes);
                } catch (Throwable unused) {
                    new C45977d(a, SCCheckUtils.getInstance().getSession()).mo50246a(1, 1, bytes);
                }
                C45977d.f117506c = currentTimeMillis;
                C45977d.f117505b = currentTimeMillis2;
            }
        }
    }

    /* renamed from: a */
    public static void m144162a(String str) {
        if (str != null && !str.equals("")) {
            try {
                Object nextValue = new JSONTokener(str).nextValue();
                if (nextValue instanceof JSONObject) {
                    m144166b((JSONObject) nextValue);
                } else if (nextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) nextValue;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        m144166b((JSONObject) jSONArray.get(i));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m144163a(long j, String str) {
        try {
            m144165b().mo111328a(j, str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static long m144164b(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static C45976c m144165b() {
        synchronized (C45978e.class) {
            if (f117510d == null) {
                f117510d = C45976c.m144151a(m144160a());
            }
        }
        return f117510d;
    }

    /* renamed from: b */
    private static boolean m144166b(JSONObject jSONObject) {
        try {
            long a = m144159a(jSONObject);
            jSONObject.put("did", m144164b(SCCheckUtils.getInstance().getDid()));
            jSONObject.put("iid", m144164b(SCCheckUtils.getInstance().getIid()));
            jSONObject.put("aid", m144164b(SCCheckUtils.getInstance().getAid()));
            jSONObject.put("ip", C45986j.m144179b());
            jSONObject.put("uid", 0);
            jSONObject.put("version_code", m144164b(C45986j.m144178a()));
            jSONObject.put("os", "0");
            jSONObject.put("channel", SCCheckUtils.getInstance().getChannel());
            String jSONObject2 = jSONObject.toString();
            C45976c b = m144165b();
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("_");
            sb.append(C45976c.m144150a());
            b.mo111329a(sb.toString(), a, jSONObject2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
