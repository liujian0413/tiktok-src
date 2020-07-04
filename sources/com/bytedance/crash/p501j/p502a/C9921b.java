package com.bytedance.crash.p501j.p502a;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p504l.C9973b;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.a.b */
public class C9921b {

    /* renamed from: v */
    private static volatile C9921b f27071v;

    /* renamed from: a */
    public List<String> f27072a = new ArrayList();

    /* renamed from: b */
    public List<Long> f27073b = new ArrayList();

    /* renamed from: c */
    public List<String> f27074c = new ArrayList();

    /* renamed from: d */
    public List<Long> f27075d = new ArrayList();

    /* renamed from: e */
    public String f27076e;

    /* renamed from: f */
    public long f27077f;

    /* renamed from: g */
    public String f27078g;

    /* renamed from: h */
    public long f27079h;

    /* renamed from: i */
    public String f27080i;

    /* renamed from: j */
    public long f27081j;

    /* renamed from: k */
    public String f27082k;

    /* renamed from: l */
    public long f27083l;

    /* renamed from: m */
    public String f27084m;

    /* renamed from: n */
    public long f27085n;

    /* renamed from: o */
    public boolean f27086o = false;

    /* renamed from: p */
    public long f27087p = -1;

    /* renamed from: q */
    public int f27088q = 50;

    /* renamed from: r */
    public int f27089r;

    /* renamed from: s */
    private Application f27090s;

    /* renamed from: t */
    private Context f27091t;

    /* renamed from: u */
    private LinkedList<C9923a> f27092u = new LinkedList<>();

    /* renamed from: com.bytedance.crash.j.a.b$a */
    static class C9923a {

        /* renamed from: a */
        String f27094a;

        /* renamed from: b */
        String f27095b;

        /* renamed from: c */
        long f27096c;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C9973b.m29512a().format(new Date(this.f27096c)));
            sb.append(" : ");
            sb.append(this.f27094a);
            sb.append(' ');
            sb.append(this.f27095b);
            return sb.toString();
        }

        C9923a(String str, String str2, long j) {
            this.f27095b = str2;
            this.f27096c = j;
            this.f27094a = str;
        }
    }

    /* renamed from: b */
    public final long mo24534b() {
        return SystemClock.uptimeMillis() - this.f27087p;
    }

    /* renamed from: a */
    public static C9921b m29364a() {
        if (f27071v == null) {
            synchronized (C9921b.class) {
                if (f27071v == null) {
                    f27071v = new C9921b(C9918j.m29343h());
                }
            }
        }
        return f27071v;
    }

    /* renamed from: e */
    private void m29366e() {
        if (VERSION.SDK_INT >= 14 && this.f27090s != null) {
            this.f27090s.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityResumed(Activity activity) {
                    C9921b.this.f27080i = activity.getClass().getName();
                    C9921b.this.f27081j = System.currentTimeMillis();
                    C9921b.this.f27089r++;
                    C9921b.this.f27086o = true;
                    C9921b.this.mo24533a(C9921b.this.f27080i, C9921b.this.f27081j, "onResume");
                }

                public final void onActivityStarted(Activity activity) {
                    C9921b.this.f27078g = activity.getClass().getName();
                    C9921b.this.f27079h = System.currentTimeMillis();
                    C9921b.this.mo24533a(C9921b.this.f27078g, C9921b.this.f27079h, "onStart");
                }

                public final void onActivityStopped(Activity activity) {
                    C9921b.this.f27084m = activity.getClass().getName();
                    C9921b.this.f27085n = System.currentTimeMillis();
                    C9921b.this.mo24533a(C9921b.this.f27084m, C9921b.this.f27085n, "onStop");
                }

                public final void onActivityDestroyed(Activity activity) {
                    String name = activity.getClass().getName();
                    int indexOf = C9921b.this.f27072a.indexOf(name);
                    if (indexOf >= 0 && indexOf < C9921b.this.f27072a.size()) {
                        C9921b.this.f27072a.remove(indexOf);
                        C9921b.this.f27073b.remove(indexOf);
                    }
                    C9921b.this.f27074c.add(name);
                    long currentTimeMillis = System.currentTimeMillis();
                    C9921b.this.f27075d.add(Long.valueOf(currentTimeMillis));
                    C9921b.this.mo24533a(name, currentTimeMillis, "onDestroy");
                }

                public final void onActivityPaused(Activity activity) {
                    C9921b.this.f27082k = activity.getClass().getName();
                    C9921b.this.f27083l = System.currentTimeMillis();
                    C9921b.this.f27089r--;
                    if (C9921b.this.f27089r == 0) {
                        C9921b.this.f27086o = false;
                        C9921b.this.f27087p = SystemClock.uptimeMillis();
                    } else if (C9921b.this.f27089r < 0) {
                        C9921b.this.f27089r = 0;
                        C9921b.this.f27086o = false;
                        C9921b.this.f27087p = SystemClock.uptimeMillis();
                    }
                    C9921b.this.mo24533a(C9921b.this.f27082k, C9921b.this.f27083l, "onPause");
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C9921b.this.f27076e = activity.getClass().getName();
                    C9921b.this.f27077f = System.currentTimeMillis();
                    C9921b.this.f27072a.add(C9921b.this.f27076e);
                    C9921b.this.f27073b.add(Long.valueOf(C9921b.this.f27077f));
                    C9921b.this.mo24533a(C9921b.this.f27076e, C9921b.this.f27077f, "onCreate");
                }
            });
        }
    }

    /* renamed from: f */
    private JSONArray m29367f() {
        JSONArray jSONArray = new JSONArray();
        if (this.f27072a == null || this.f27072a.isEmpty()) {
            return jSONArray;
        }
        int i = 0;
        while (i < this.f27072a.size()) {
            try {
                jSONArray.put(m29365a((String) this.f27072a.get(i), ((Long) this.f27073b.get(i)).longValue()));
                i++;
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: g */
    private JSONArray m29368g() {
        JSONArray jSONArray = new JSONArray();
        if (this.f27074c == null || this.f27074c.isEmpty()) {
            return jSONArray;
        }
        int i = 0;
        while (i < this.f27074c.size()) {
            try {
                jSONArray.put(m29365a((String) this.f27074c.get(i), ((Long) this.f27075d.get(i)).longValue()));
                i++;
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    public final JSONArray mo24536d() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f27092u).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C9923a) it.next()).toString());
        }
        return jSONArray;
    }

    /* renamed from: c */
    public final JSONObject mo24535c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", m29365a(this.f27076e, this.f27077f));
            jSONObject.put("last_start_activity", m29365a(this.f27078g, this.f27079h));
            jSONObject.put("last_resume_activity", m29365a(this.f27080i, this.f27081j));
            jSONObject.put("last_pause_activity", m29365a(this.f27082k, this.f27083l));
            jSONObject.put("last_stop_activity", m29365a(this.f27084m, this.f27085n));
            jSONObject.put("alive_activities", m29367f());
            jSONObject.put("finish_activities", m29368g());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private C9921b(Application application) {
        this.f27091t = application;
        this.f27090s = application;
        try {
            m29366e();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static JSONObject m29365a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private C9923a m29363a(String str, String str2, long j) {
        C9923a aVar;
        if (this.f27092u.size() >= this.f27088q) {
            aVar = (C9923a) this.f27092u.poll();
            if (aVar != null) {
                this.f27092u.add(aVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        C9923a aVar2 = new C9923a(str, str2, j);
        this.f27092u.add(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo24533a(String str, long j, String str2) {
        try {
            C9923a a = m29363a(str, str2, j);
            a.f27095b = str2;
            a.f27094a = str;
            a.f27096c = j;
        } catch (Throwable unused) {
        }
    }
}
