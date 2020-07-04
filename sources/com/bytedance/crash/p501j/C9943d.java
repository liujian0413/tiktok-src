package com.bytedance.crash.p501j;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C9871c.C9872a;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.event.C9887a;
import com.bytedance.crash.event.C9888b;
import com.bytedance.crash.event.Event;
import com.bytedance.crash.nativecrash.C10008c;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p490a.C9848a;
import com.bytedance.crash.p491b.C9863f;
import com.bytedance.crash.p492c.C9873a;
import com.bytedance.crash.p493d.C9876a;
import com.bytedance.crash.p493d.p494a.C9877a;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p497f.C9898c;
import com.bytedance.crash.p497f.C9899d;
import com.bytedance.crash.p498g.C9901a;
import com.bytedance.crash.p500i.C9915a;
import com.bytedance.crash.p504l.C10001t;
import com.bytedance.crash.p504l.C9972a;
import com.bytedance.crash.p504l.C9981f;
import com.bytedance.crash.p504l.C9982g;
import com.bytedance.crash.p504l.C9985j;
import com.bytedance.crash.p504l.C9992m;
import com.bytedance.crash.p504l.C9993n;
import com.bytedance.crash.upload.C10016a;
import com.bytedance.crash.upload.C10029i;
import com.bytedance.crash.upload.CrashUploader;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.d */
public final class C9943d {

    /* renamed from: c */
    private static volatile C9943d f27133c;

    /* renamed from: a */
    public volatile boolean f27134a;

    /* renamed from: b */
    private Context f27135b;

    /* renamed from: d */
    private int f27136d = -1;

    /* renamed from: e */
    private C9948b f27137e;

    /* renamed from: f */
    private HashMap<String, C9948b> f27138f;

    /* renamed from: g */
    private Runnable f27139g = new Runnable() {
        public final void run() {
            C9943d.this.mo24566d();
        }
    };

    /* renamed from: h */
    private Runnable f27140h = new Runnable() {
        public final void run() {
            C9943d.this.mo24565c();
        }
    };

    /* renamed from: com.bytedance.crash.j.d$a */
    static class C9947a {

        /* renamed from: a */
        File f27145a;

        /* renamed from: b */
        long f27146b = -1;

        /* renamed from: c */
        CrashType f27147c;

        C9947a(File file, CrashType crashType) {
            this.f27145a = file;
            this.f27147c = crashType;
        }

        C9947a(File file, long j, CrashType crashType) {
            this.f27145a = file;
            this.f27146b = j;
            this.f27147c = crashType;
        }
    }

    /* renamed from: com.bytedance.crash.j.d$b */
    static class C9948b {

        /* renamed from: a */
        String f27148a;

        /* renamed from: b */
        List<C9947a> f27149b = new ArrayList();

        /* renamed from: c */
        List<C9947a> f27150c = new ArrayList();

        /* renamed from: d */
        C9947a f27151d;

        /* renamed from: e */
        C9947a f27152e;

        /* renamed from: f */
        boolean f27153f = false;

        C9948b(String str) {
            this.f27148a = str;
        }
    }

    /* renamed from: a */
    public final void mo24563a(boolean z) {
        if (!C9912i.m29324f() && z) {
            m29434f();
            m29436h();
            C9981f.m29536d();
            C9863f.m29108a(this.f27135b).f26897a.mo24430d();
            C9888b.m29185b();
            C9873a.m29127a();
        }
    }

    /* renamed from: a */
    private File[] m29429a(File file, final String str) {
        File[] fileArr;
        if (!file.exists()) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            fileArr = file.listFiles();
        } else {
            fileArr = file.listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    if (str == null || !str.endsWith(str)) {
                        return false;
                    }
                    return true;
                }
            });
        }
        return fileArr;
    }

    /* renamed from: a */
    public static C9943d m29423a() {
        if (f27133c == null) {
            synchronized (C9943d.class) {
                if (f27133c == null) {
                    f27133c = new C9943d(C9918j.m29342g());
                }
            }
        }
        return f27133c;
    }

    /* renamed from: b */
    public final void mo24564b() {
        try {
            if (!this.f27134a) {
                if (C9972a.m29506b(C9918j.m29342g())) {
                    C9954g.m29460b().mo24596a(this.f27140h);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private boolean m29435g() {
        if (this.f27136d == -1) {
            if (C9918j.m29344i().mo24559b() == null || !C9918j.m29344i().mo24559b().getLogTypeSwitch("upload_crash_crash")) {
                this.f27136d = 0;
            } else {
                this.f27136d = 1;
            }
        }
        if (this.f27136d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo24566d() {
        if (!this.f27134a) {
            if (System.currentTimeMillis() - C9918j.m29345j() > 300000 || C9918j.m29344i().mo24559b() != null || !C9938b.m29414c() || C9912i.m29321c()) {
                mo24565c();
            } else {
                C9954g.m29460b().mo24597a(this.f27139g, (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);
            }
        }
    }

    /* renamed from: f */
    private void m29434f() {
        if (this.f27137e == null) {
            this.f27137e = new C9948b("old_uuid");
            this.f27138f = new HashMap<>();
            m29432b(this.f27138f, this.f27137e);
            m29433c(this.f27138f, this.f27137e);
            m29426a(this.f27138f, this.f27137e);
            m29431b(this.f27137e, true);
            m29425a(this.f27137e, true);
            this.f27137e = null;
            if (this.f27138f.isEmpty()) {
                this.f27134a = true;
                NativeImpl.m29699i();
                return;
            }
            mo24566d();
        }
    }

    /* renamed from: h */
    private void m29436h() {
        File[] listFiles = C9992m.m29611h(this.f27135b).listFiles();
        if (listFiles != null) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                if (file.getName().endsWith(".atmp")) {
                    C9848a.m29064a().mo24414a(file.getAbsolutePath());
                } else {
                    try {
                        C9899d e = C9982g.m29559e(file.getAbsolutePath());
                        if (e != null) {
                            if (e.f26995b != null) {
                                e.f26995b.put("upload_scene", "launch_scan");
                            }
                            if (CrashUploader.m29753a(CrashUploader.m29749a(), e.f26999f, e.f26998e, e.f27000g, e.f27001h)) {
                                C9982g.m29547a(file);
                                C9982g.m29548a(e.f26996c);
                            }
                        } else {
                            C9982g.m29547a(file);
                        }
                    } catch (Throwable th) {
                        C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: e */
    public final void mo24567e() {
        try {
            File[] a = m29429a(C9992m.m29611h(this.f27135b), ".atmp");
            if (a != null) {
                Arrays.sort(a, Collections.reverseOrder());
                int i = 0;
                while (i < a.length && i < 5) {
                    File file = a[i];
                    if (file.getName().endsWith(".atmp")) {
                        C9848a.m29064a().mo24414a(file.getAbsolutePath());
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
    }

    /* renamed from: c */
    public final void mo24565c() {
        if (!this.f27134a && this.f27138f != null) {
            boolean g = m29435g();
            for (C9948b b : this.f27138f.values()) {
                m29431b(b, g);
            }
            for (C9948b a : this.f27138f.values()) {
                m29425a(a, g);
            }
            this.f27134a = true;
            this.f27138f = null;
            NativeImpl.m29699i();
        }
    }

    private C9943d(Context context) {
        this.f27135b = context;
    }

    /* renamed from: a */
    private static JSONObject m29424a(C10008c cVar) {
        JSONObject f = cVar.mo24622f();
        if (f == null || f.length() == 0) {
            if (C9918j.m29339d()) {
                cVar.mo24630o();
                cVar.mo24629n();
                return null;
            } else if (!cVar.mo24621e()) {
                cVar.mo24623g();
                cVar.mo24629n();
                return null;
            } else if (!cVar.mo24625i()) {
                cVar.mo24629n();
                return null;
            } else if (cVar.mo24626j()) {
                cVar.mo24629n();
                return null;
            } else {
                cVar.mo24623g();
                cVar.mo24624h();
                f = cVar.mo24628m();
            }
        }
        return f;
    }

    /* renamed from: b */
    private C9899d m29430b(File file) {
        C9899d dVar;
        Throwable th;
        try {
            if (file.isFile()) {
                dVar = C9982g.m29557d(file);
                try {
                    if (dVar.f26995b != null) {
                        try {
                            dVar.f26995b.put("upload_scene", "simple_crash");
                        } catch (JSONException unused) {
                        }
                    } else {
                        C9982g.m29547a(file);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                return dVar;
            }
            dVar = C9982g.m29558d(new File(file, file.getName()).getAbsolutePath());
            if (dVar == null) {
                dVar = C9982g.m29554c(file);
            }
            if (dVar == null || dVar.f26995b == null) {
                C9982g.m29547a(file);
                return dVar;
            }
            JSONObject jSONObject = dVar.f26995b;
            CrashType a = m29422a(file.getName(), jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (a == CrashType.LAUNCH) {
                jSONObject = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            }
            if (jSONObject == null) {
                C9982g.m29547a(file);
                return null;
            }
            if (optJSONObject == null) {
                optJSONObject = C9898c.m29249a(this.f27135b, jSONObject.optLong("crash_time", 0)).f26992a;
            }
            String optString = optJSONObject.optString("sdk_version_name", null);
            String str = "filters";
            String str2 = "sdk_version";
            if (optString == null) {
                optString = "3.1.2-rc.0-oversea";
            }
            C9896a.m29211a(jSONObject, str, str2, optString);
            if (C9982g.m29549a(jSONObject.optJSONArray("logcat"))) {
                jSONObject.put("logcat", C9949e.m29444a(file));
            }
            C9896a.m29211a(jSONObject, "filters", "has_logcat", String.valueOf(!C9985j.m29570a(jSONObject, "logcat")));
            C9896a.m29211a(jSONObject, "filters", "memory_leak", String.valueOf(C9896a.m29219b(jSONObject)));
            C9896a.m29211a(jSONObject, "filters", "is_64_devices", String.valueOf(C9898c.m29252a()));
            C9896a.m29211a(jSONObject, "filters", "is_64_runtime", String.valueOf(NativeImpl.m29695e()));
            C9896a.m29211a(jSONObject, "filters", "is_x86_devices", String.valueOf(C9898c.m29254b()));
            C9896a.m29211a(jSONObject, "filters", "has_meminfo_file", String.valueOf(C9896a.m29215a(jSONObject)));
            C9896a.m29211a(jSONObject, "filters", "is_root", String.valueOf(C10008c.m29714p()));
            if (C9898c.m29256c(optJSONObject)) {
                C9896a.m29211a(jSONObject, "filters", "unauthentic_version", "unauthentic_version");
            }
            String d = C9898c.m29258d(optJSONObject);
            if (d != null) {
                C9896a.m29211a(jSONObject, "filters", "dex_err_manifest", d);
            }
            jSONObject.put("launch_did", C9915a.m29325a(this.f27135b));
            jSONObject.put("crash_uuid", file.getName());
            if (jSONObject.opt("storage") == null) {
                C9896a.m29214a(jSONObject, C10001t.m29663a(C9918j.m29342g()));
            }
            dVar.f26995b.put("upload_scene", "launch_scan");
            return dVar;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            dVar = null;
            th = th4;
            C9982g.m29547a(file);
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            return dVar;
        }
    }

    /* renamed from: a */
    private static boolean m29428a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static CrashType m29422a(String str, JSONObject jSONObject) {
        if (jSONObject == null && TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("launch_")) {
            return CrashType.LAUNCH;
        }
        if (str.contains("anr_")) {
            return CrashType.ANR;
        }
        if (!str.contains("java_")) {
            return null;
        }
        if (jSONObject.optInt("is_dart") == 1) {
            return CrashType.DART;
        }
        return CrashType.JAVA;
    }

    /* renamed from: b */
    private void m29432b(HashMap<String, C9948b> hashMap, C9948b bVar) {
        File[] listFiles = C9992m.m29591a(this.f27135b).listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, Collections.reverseOrder());
            for (File file : listFiles) {
                try {
                    if (C9876a.m29132a().mo24442a(file.getAbsolutePath())) {
                        C9982g.m29547a(file);
                    } else if (!C9982g.m29561f(file)) {
                        if (!C9901a.m29272a().mo24512b(file.getName())) {
                            if (file.isFile()) {
                                C9982g.m29547a(file);
                            } else {
                                m29427a(hashMap, bVar, file, file.getName());
                            }
                        }
                    }
                } catch (Throwable th) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                }
            }
        }
    }

    /* renamed from: c */
    private void m29433c(HashMap<String, C9948b> hashMap, C9948b bVar) {
        File[] listFiles = C9992m.m29595b(this.f27135b).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                try {
                    if (file.getName().endsWith("logcat.txt")) {
                        file.delete();
                    } else if (C9876a.m29132a().mo24442a(file.getAbsolutePath())) {
                        C9982g.m29547a(file);
                    } else if (!C9982g.m29561f(file)) {
                        if (!C9901a.m29272a().mo24513c(file.getName())) {
                            m29427a(hashMap, bVar, file, file.getName().substring(file.getName().indexOf("_") + 1));
                        }
                    }
                } catch (Throwable th) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                }
            }
        }
    }

    /* renamed from: a */
    private void m29425a(C9948b bVar, boolean z) {
        JSONObject jSONObject;
        if (!bVar.f27149b.isEmpty()) {
            if (bVar.f27152e == null) {
                bVar.f27152e = bVar.f27151d;
            }
            for (C9947a aVar : bVar.f27149b) {
                try {
                    File file = aVar.f27145a;
                    CrashType crashType = aVar.f27147c;
                    C9899d b = m29430b(file);
                    if (b == null) {
                        C9982g.m29547a(file);
                    } else {
                        JSONObject jSONObject2 = b.f26995b;
                        if (jSONObject2 == null) {
                            C9982g.m29547a(file);
                        } else {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("header");
                            if (optJSONObject == null) {
                                C9982g.m29547a(file);
                            } else {
                                if (crashType == CrashType.LAUNCH) {
                                    jSONObject = ((JSONArray) jSONObject2.opt("data")).optJSONObject(0);
                                } else {
                                    jSONObject = jSONObject2;
                                }
                                if (!z && bVar.f27152e != aVar) {
                                    C9896a.m29211a(jSONObject, "filters", "aid", String.valueOf(String.valueOf(optJSONObject.opt("aid"))));
                                    optJSONObject.put("aid", 2010);
                                }
                                C9896a.m29211a(jSONObject, "filters", "start_uuid", bVar.f27148a);
                                Event a = C9887a.m29172a(crashType, C9872a.f26937i, jSONObject2);
                                C9888b.m29183a(a);
                                Event eventType = a.clone().eventType(C9872a.f26938j);
                                C10029i a2 = CrashUploader.m29747a(b.f26994a, jSONObject2.toString(), b.f26997d);
                                if (a2.mo24657a()) {
                                    if (!C9982g.m29547a(file)) {
                                        C9876a.m29132a().mo24441a(C9877a.m29137a(file.getAbsolutePath()));
                                    }
                                    if (eventType != null) {
                                        C9888b.m29183a(eventType.state(0));
                                    }
                                } else if (eventType != null) {
                                    C9888b.m29183a(eventType.state(a2.f27305a).errorInfo(a2.f27306b));
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                    C9982g.m29547a(aVar.f27145a);
                }
            }
        }
    }

    /* renamed from: b */
    private void m29431b(C9948b bVar, boolean z) {
        if (bVar.f27150c.size() > 1 || !bVar.f27150c.isEmpty()) {
            boolean b = C9993n.m29622b(this.f27135b);
            bVar.f27152e = bVar.f27151d;
            C10008c cVar = new C10008c(this.f27135b);
            for (C9947a aVar : bVar.f27150c) {
                File file = aVar.f27145a;
                try {
                    cVar.mo24617a(file);
                    JSONObject a = m29424a(cVar);
                    if (a != null) {
                        if (a.length() != 0) {
                            if (a.length() != 0) {
                                if (!z) {
                                    long optLong = a.optLong("crash_time");
                                    if (bVar.f27152e == null) {
                                        bVar.f27152e = aVar;
                                        bVar.f27153f = true;
                                    } else if (bVar.f27153f || optLong >= bVar.f27152e.f27146b) {
                                        C9896a.m29211a(a, "filters", "aid", String.valueOf(a.optJSONObject("header").opt("aid")));
                                        a.optJSONObject("header").put("aid", 2010);
                                    } else {
                                        bVar.f27152e = aVar;
                                        m29428a(file);
                                        bVar.f27153f = true;
                                    }
                                }
                                C9896a.m29211a(a, "filters", "start_uuid", bVar.f27148a);
                                if (b) {
                                    File a2 = C9992m.m29592a(file);
                                    C10016a.m29765a();
                                    if (C10016a.m29767a(a, a2) && !cVar.mo24629n()) {
                                        cVar.mo24627k();
                                    }
                                }
                            }
                        }
                    }
                    cVar.mo24629n();
                } catch (Throwable th) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                    C9982g.m29547a(file);
                }
            }
            return;
        }
        bVar.f27152e = bVar.f27151d;
    }

    /* renamed from: a */
    private void m29426a(HashMap<String, C9948b> hashMap, C9948b bVar) {
        File[] listFiles = C9992m.m29605e(this.f27135b).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (!file.isDirectory()) {
                        C9982g.m29547a(file);
                    } else if (file.getName().endsWith("U")) {
                        String name = file.getName();
                        C9948b bVar2 = (C9948b) hashMap.get(name);
                        if (bVar2 == null) {
                            bVar2 = new C9948b(name);
                            hashMap.put(name, bVar2);
                        }
                        bVar2.f27150c.add(new C9947a(file, CrashType.NATIVE));
                    } else {
                        bVar.f27150c.add(new C9947a(file, CrashType.NATIVE));
                    }
                } catch (Throwable th) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                    C9982g.m29547a(file);
                }
                i++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        if (r0.equals("java") == false) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m29427a(java.util.HashMap<java.lang.String, com.bytedance.crash.p501j.C9943d.C9948b> r10, com.bytedance.crash.p501j.C9943d.C9948b r11, java.io.File r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "U"
            boolean r0 = r13.endsWith(r0)
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = "_"
            java.lang.String[] r0 = r13.split(r0)
            int r1 = r0.length
            r2 = 4
            if (r1 >= r2) goto L_0x003b
            java.util.List<com.bytedance.crash.j.d$a> r10 = r11.f27149b
            com.bytedance.crash.j.d$a r11 = new com.bytedance.crash.j.d$a
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA
            r11.<init>(r12, r0)
            r10.add(r11)
            com.bytedance.crash.e r10 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r11 = "NPTH_CATCH"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "err format uuid:"
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            r10.mo24453a(r11, r12)
            return
        L_0x003b:
            r1 = 0
            r2 = r0[r1]     // Catch:{ Throwable -> 0x0104 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ Throwable -> 0x0104 }
            r4 = 0
            r5 = 2
            r6 = r0[r5]
            java.lang.String r7 = "U"
            boolean r7 = r6.endsWith(r7)
            if (r7 != 0) goto L_0x0077
            java.util.List<com.bytedance.crash.j.d$a> r10 = r11.f27149b
            com.bytedance.crash.j.d$a r11 = new com.bytedance.crash.j.d$a
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA
            r11.<init>(r12, r0)
            r10.add(r11)
            com.bytedance.crash.e r10 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r11 = "NPTH_CATCH"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "err format nativeUUID:"
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            r10.mo24453a(r11, r12)
            return
        L_0x0077:
            r11 = 1
            r0 = r0[r11]
            r7 = -1
            int r8 = r0.hashCode()
            r9 = -1109843021(0xffffffffbdd923b3, float:-0.10602512)
            if (r8 == r9) goto L_0x00a2
            r1 = 96741(0x179e5, float:1.35563E-40)
            if (r8 == r1) goto L_0x0098
            r1 = 3254818(0x31aa22, float:4.560971E-39)
            if (r8 == r1) goto L_0x008f
            goto L_0x00ac
        L_0x008f:
            java.lang.String r1 = "java"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x0098:
            java.lang.String r11 = "anr"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x00ac
            r11 = 2
            goto L_0x00ad
        L_0x00a2:
            java.lang.String r11 = "launch"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x00ac
            r11 = 0
            goto L_0x00ad
        L_0x00ac:
            r11 = -1
        L_0x00ad:
            switch(r11) {
                case 0: goto L_0x00b7;
                case 1: goto L_0x00b4;
                case 2: goto L_0x00b1;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            goto L_0x00b9
        L_0x00b1:
            com.bytedance.crash.CrashType r4 = com.bytedance.crash.CrashType.ANR
            goto L_0x00b9
        L_0x00b4:
            com.bytedance.crash.CrashType r4 = com.bytedance.crash.CrashType.JAVA
            goto L_0x00b9
        L_0x00b7:
            com.bytedance.crash.CrashType r4 = com.bytedance.crash.CrashType.LAUNCH
        L_0x00b9:
            if (r4 != 0) goto L_0x00d9
            com.bytedance.crash.CrashType r4 = com.bytedance.crash.CrashType.JAVA
            com.bytedance.crash.e r11 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r0 = "NPTH_CATCH"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "err format crashType:"
            r5.<init>(r7)
            r5.append(r13)
            java.lang.String r13 = r5.toString()
            r1.<init>(r13)
            r11.mo24453a(r0, r1)
        L_0x00d9:
            java.lang.Object r11 = r10.get(r6)
            com.bytedance.crash.j.d$b r11 = (com.bytedance.crash.p501j.C9943d.C9948b) r11
            if (r11 != 0) goto L_0x00e9
            com.bytedance.crash.j.d$b r11 = new com.bytedance.crash.j.d$b
            r11.<init>(r6)
            r10.put(r6, r11)
        L_0x00e9:
            com.bytedance.crash.j.d$a r10 = new com.bytedance.crash.j.d$a
            r10.<init>(r12, r2, r4)
            com.bytedance.crash.j.d$a r12 = r11.f27151d
            if (r12 == 0) goto L_0x00fc
            com.bytedance.crash.j.d$a r12 = r11.f27151d
            long r12 = r12.f27146b
            long r0 = r10.f27146b
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fe
        L_0x00fc:
            r11.f27151d = r10
        L_0x00fe:
            java.util.List<com.bytedance.crash.j.d$a> r11 = r11.f27149b
            r11.add(r10)
            return
        L_0x0104:
            java.util.List<com.bytedance.crash.j.d$a> r10 = r11.f27149b
            com.bytedance.crash.j.d$a r11 = new com.bytedance.crash.j.d$a
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA
            r11.<init>(r12, r0)
            r10.add(r11)
            com.bytedance.crash.e r10 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r11 = "NPTH_CATCH"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "err format crashTime:"
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            r10.mo24453a(r11, r12)
            return
        L_0x012d:
            java.util.List<com.bytedance.crash.j.d$a> r10 = r11.f27149b
            com.bytedance.crash.j.d$a r11 = new com.bytedance.crash.j.d$a
            com.bytedance.crash.CrashType r13 = com.bytedance.crash.CrashType.JAVA
            r11.<init>(r12, r13)
            r10.add(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p501j.C9943d.m29427a(java.util.HashMap, com.bytedance.crash.j.d$b, java.io.File, java.lang.String):void");
    }
}
