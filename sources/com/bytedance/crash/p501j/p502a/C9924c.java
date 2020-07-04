package com.bytedance.crash.p501j.p502a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.C9847a;
import com.bytedance.crash.C9895f;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p501j.C9949e;
import com.bytedance.crash.p504l.C10001t;
import com.bytedance.crash.p504l.C9972a;
import com.bytedance.crash.p504l.C9981f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.a.c */
public abstract class C9924c {

    /* renamed from: a */
    protected CrashType f27097a;

    /* renamed from: b */
    protected Context f27098b;

    /* renamed from: c */
    protected C9895f f27099c = C9918j.m29332a().f27069a;

    /* renamed from: d */
    protected C9921b f27100d;

    /* renamed from: e */
    protected C9926d f27101e;

    /* renamed from: com.bytedance.crash.j.a.c$a */
    public interface C9925a {
        /* renamed from: a */
        C9896a mo24516a(int i, C9896a aVar);

        /* renamed from: a */
        C9896a mo24517a(int i, C9896a aVar, boolean z);

        /* renamed from: a */
        void mo24518a(Throwable th);
    }

    /* renamed from: a */
    public C9896a mo24531a(C9896a aVar) {
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24532a() {
        return false;
    }

    /* renamed from: b */
    public int mo24547b() {
        return 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo24549c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo24550d() {
        return true;
    }

    /* renamed from: f */
    private C9896a m29376f(C9896a aVar) {
        if (mo24550d()) {
            aVar.mo24501d(C10001t.m29663a(this.f27098b));
        }
        return aVar;
    }

    /* renamed from: h */
    private C9896a m29378h(C9896a aVar) {
        if (mo24532a()) {
            mo24548c(aVar);
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo24548c(C9896a aVar) {
        aVar.mo24495b(C9949e.m29443a(C9918j.m29344i().f27121g, C9918j.m29344i().f27122h));
    }

    /* renamed from: g */
    private C9896a m29377g(C9896a aVar) {
        int i;
        aVar.mo24486a(C9918j.m29332a().mo24529e());
        String str = "battery";
        if (this.f27101e == null) {
            i = 0;
        } else {
            i = this.f27101e.f27102a;
        }
        aVar.mo24492a(str, (Object) Integer.valueOf(i));
        aVar.mo24498c(C9918j.m29337b().f26859a);
        return aVar;
    }

    /* renamed from: d */
    private C9896a m29374d(C9896a aVar) {
        aVar.mo24482a(C9918j.m29350o(), C9918j.m29351p());
        if (C9918j.m29348m()) {
            aVar.mo24492a("is_mp", (Object) Integer.valueOf(1));
        }
        try {
            aVar.mo24491a(null);
        } catch (Throwable unused) {
        }
        aVar.mo24496b((Map<Integer, String>) C9918j.m29349n());
        aVar.mo24492a("process_name", (Object) C9972a.m29507c(C9918j.m29342g()));
        return aVar;
    }

    /* renamed from: e */
    private C9896a m29375e(C9896a aVar) {
        if (!C9972a.m29506b(C9918j.m29342g())) {
            aVar.mo24492a("remote_process", (Object) Integer.valueOf(1));
        }
        aVar.mo24492a("pid", (Object) Integer.valueOf(Process.myPid()));
        aVar.mo24483a(C9918j.m29345j());
        if (mo24549c() && this.f27100d != null) {
            aVar.mo24485a(this.f27100d);
        }
        try {
            aVar.mo24490a(null);
        } catch (Throwable unused) {
        }
        String k = C9918j.m29346k();
        if (k != null) {
            aVar.mo24492a("business", (Object) k);
        }
        aVar.mo24492a("is_background", (Object) Boolean.valueOf(true ^ C9972a.m29504a(this.f27098b)));
        return aVar;
    }

    /* renamed from: b */
    static void m29373b(C9896a aVar) {
        Map a = C9918j.m29332a().mo24525a();
        if (a != null) {
            if (a.containsKey("app_version")) {
                aVar.mo24492a("crash_version", a.get("app_version"));
            }
            if (a.containsKey("version_name")) {
                aVar.mo24492a("app_version", a.get("version_name"));
            }
            if (a.containsKey("version_code")) {
                try {
                    aVar.mo24492a("crash_version_code", (Object) Integer.valueOf(Integer.parseInt(a.get("version_code").toString())));
                } catch (Exception unused) {
                    aVar.mo24492a("crash_version_code", a.get("version_code"));
                }
            }
            if (a.containsKey("update_version_code")) {
                try {
                    aVar.mo24492a("crash_update_version_code", (Object) Integer.valueOf(Integer.parseInt(a.get("update_version_code").toString())));
                } catch (Exception unused2) {
                    aVar.mo24492a("crash_update_version_code", a.get("update_version_code"));
                }
            }
        }
    }

    /* renamed from: i */
    private void m29379i(C9896a aVar) {
        List a = C9918j.m29337b().mo24421a(this.f27097a);
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = aVar.f26984a.optJSONObject("custom");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            aVar.mo24492a("custom", (Object) optJSONObject);
        }
        if (a != null) {
            for (int i = 0; i < a.size(); i++) {
                try {
                    C9847a aVar2 = (C9847a) a.get(i);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C9896a.m29213a(optJSONObject, aVar2.mo24411a(this.f27097a));
                    StringBuilder sb = new StringBuilder("custom_cost_");
                    sb.append(aVar2.getClass().getName());
                    sb.append("_");
                    sb.append(hashMap.size());
                    hashMap.put(sb.toString(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                } catch (Throwable th) {
                    C9896a.m29212a(optJSONObject, th);
                }
            }
        }
        try {
            optJSONObject.put("fd_count", C9981f.m29534b());
        } catch (Throwable unused) {
        }
        List b = C9918j.m29337b().mo24425b(this.f27097a);
        if (b != null) {
            JSONObject optJSONObject2 = aVar.f26984a.optJSONObject("custom_long");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
                aVar.mo24492a("custom_long", (Object) optJSONObject2);
            }
            for (int i2 = 0; i2 < b.size(); i2++) {
                try {
                    C9847a aVar3 = (C9847a) b.get(i2);
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    C9896a.m29213a(optJSONObject2, aVar3.mo24411a(this.f27097a));
                    StringBuilder sb2 = new StringBuilder("custom_cost_");
                    sb2.append(aVar3.getClass().getName());
                    sb2.append("_");
                    sb2.append(hashMap.size());
                    hashMap.put(sb2.toString(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                } catch (Throwable th2) {
                    C9896a.m29212a(optJSONObject2, th2);
                }
            }
        }
        for (Entry entry : hashMap.entrySet()) {
            try {
                optJSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public C9896a mo24545a(int i, C9896a aVar) {
        if (aVar == null) {
            aVar = new C9896a();
        }
        switch (i) {
            case 0:
                m29374d(aVar);
                break;
            case 1:
                m29375e(aVar);
                m29379i(aVar);
                break;
            case 2:
                m29377g(aVar);
                break;
            case 4:
                m29378h(aVar);
                break;
            case 5:
                m29376f(aVar);
                break;
        }
        return aVar;
    }

    /* renamed from: a */
    public final C9896a mo24546a(C9896a aVar, C9925a aVar2, boolean z) {
        if (aVar == null) {
            aVar = new C9896a();
        }
        C9896a aVar3 = aVar;
        C9896a aVar4 = aVar3;
        for (int i = 0; i < mo24547b(); i++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar4 = aVar2.mo24516a(i, aVar4);
                } catch (Throwable th) {
                    aVar2.mo24518a(th);
                }
            }
            try {
                aVar4 = mo24545a(i, aVar4);
            } catch (Throwable th2) {
                if (aVar2 != null) {
                    aVar2.mo24518a(th2);
                }
            }
            if (aVar2 != null) {
                try {
                    boolean z2 = true;
                    if (i != mo24547b() - 1) {
                        z2 = false;
                    }
                    aVar4 = aVar2.mo24517a(i, aVar4, z2);
                } catch (Throwable th3) {
                    aVar2.mo24518a(th3);
                }
                if (z) {
                    if (i != 0) {
                        aVar3.mo24503e(aVar4.f26984a);
                    } else {
                        aVar3 = aVar4;
                    }
                    aVar4 = new C9896a();
                }
            }
            StringBuilder sb = new StringBuilder("step_cost_");
            sb.append(i);
            aVar3.mo24494b(sb.toString(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return mo24531a(aVar3);
    }

    C9924c(CrashType crashType, Context context, C9921b bVar, C9926d dVar) {
        this.f27097a = crashType;
        this.f27098b = context;
        this.f27100d = bVar;
        this.f27101e = dVar;
    }
}
