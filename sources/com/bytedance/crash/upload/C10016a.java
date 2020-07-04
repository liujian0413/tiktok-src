package com.bytedance.crash.upload;

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
import com.bytedance.crash.p493d.C9876a;
import com.bytedance.crash.p493d.p494a.C9877a;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p504l.C9982g;
import com.bytedance.crash.p504l.C9992m;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.a */
public final class C10016a {

    /* renamed from: a */
    private static volatile C10016a f27279a;

    /* renamed from: b */
    private volatile Context f27280b;

    /* renamed from: a */
    public static C10016a m29765a() {
        if (f27279a == null) {
            f27279a = new C10016a(C9918j.m29342g());
        }
        return f27279a;
    }

    private C10016a(Context context) {
        this.f27280b = context;
    }

    /* renamed from: a */
    public final void mo24638a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String b = CrashUploader.m29761b(C9918j.m29332a().mo24525a());
                String a = C9982g.m29539a(C9992m.m29591a(this.f27280b), C9992m.m29604d(), b, jSONObject, true);
                if (CrashUploader.m29745a(b, jSONObject.toString()).mo24657a()) {
                    C9982g.m29548a(a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static String m29768b(JSONObject jSONObject, File file) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        try {
            return C9982g.m29539a(file, file.getName(), CrashUploader.m29751a(C9918j.m29332a().mo24525a()), jSONObject, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m29769c(JSONObject jSONObject, File file) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        try {
            return C9982g.m29539a(file, file.getName(), CrashUploader.m29761b(C9918j.m29332a().mo24525a()), jSONObject, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m29767a(org.json.JSONObject r5, java.io.File r6) {
        /*
            r0 = 0
            r1 = 0
            com.bytedance.crash.CrashType r2 = com.bytedance.crash.CrashType.NATIVE     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r3 = com.bytedance.crash.C9871c.C9872a.f26937i     // Catch:{ Throwable -> 0x0055 }
            com.bytedance.crash.event.Event r2 = com.bytedance.crash.event.C9887a.m29172a(r2, r3, r5)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r3 = "total_cost"
            long r3 = r5.optLong(r3)     // Catch:{ Throwable -> 0x0055 }
            r2.crashTime(r3)     // Catch:{ Throwable -> 0x0055 }
            com.bytedance.crash.event.C9888b.m29183a(r2)     // Catch:{ Throwable -> 0x0055 }
            com.bytedance.crash.event.Event r2 = r2.clone()     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r3 = com.bytedance.crash.C9871c.C9872a.f26938j     // Catch:{ Throwable -> 0x0055 }
            com.bytedance.crash.event.Event r2 = r2.eventType(r3)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r1 = com.bytedance.crash.upload.CrashUploader.m29759b()     // Catch:{ Throwable -> 0x0053 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0053 }
            com.bytedance.crash.upload.i r5 = com.bytedance.crash.upload.CrashUploader.m29746a(r1, r5, r6)     // Catch:{ Throwable -> 0x0053 }
            boolean r6 = r5.mo24657a()     // Catch:{ Throwable -> 0x0053 }
            if (r6 == 0) goto L_0x0044
            r6 = 1
            com.bytedance.crash.event.Event r0 = r2.state(r0)     // Catch:{ Throwable -> 0x0041 }
            org.json.JSONObject r5 = r5.f27307c     // Catch:{ Throwable -> 0x0041 }
            r0.errorInfo(r5)     // Catch:{ Throwable -> 0x0041 }
            com.bytedance.crash.event.C9888b.m29183a(r2)     // Catch:{ Throwable -> 0x0041 }
            r0 = 1
            goto L_0x0065
        L_0x0041:
            r5 = move-exception
            r0 = 1
            goto L_0x0057
        L_0x0044:
            int r6 = r5.f27305a     // Catch:{ Throwable -> 0x0053 }
            com.bytedance.crash.event.Event r6 = r2.state(r6)     // Catch:{ Throwable -> 0x0053 }
            java.lang.String r5 = r5.f27306b     // Catch:{ Throwable -> 0x0053 }
            r6.errorInfo(r5)     // Catch:{ Throwable -> 0x0053 }
            com.bytedance.crash.event.C9888b.m29183a(r2)     // Catch:{ Throwable -> 0x0053 }
            goto L_0x0065
        L_0x0053:
            r5 = move-exception
            goto L_0x0057
        L_0x0055:
            r5 = move-exception
            r2 = r1
        L_0x0057:
            if (r2 == 0) goto L_0x0065
            r6 = 211(0xd3, float:2.96E-43)
            com.bytedance.crash.event.Event r6 = r2.state(r6)
            r6.errorInfo(r5)
            com.bytedance.crash.event.C9888b.m29183a(r2)
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.C10016a.m29767a(org.json.JSONObject, java.io.File):boolean");
    }

    /* renamed from: a */
    public final void mo24639a(JSONObject jSONObject, long j, boolean z) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String a = CrashUploader.m29751a(C9918j.m29332a().mo24525a());
                File file = new File(C9992m.m29591a(this.f27280b), C9918j.m29333a(j, CrashType.ANR));
                C9982g.m29539a(file, file.getName(), a, jSONObject, true);
                if (z) {
                    if (!C9912i.m29324f()) {
                        jSONObject.put("upload_scene", "direct");
                        jSONObject.put("crash_uuid", file.getName());
                        if (CrashUploader.m29756b(a, jSONObject.toString()).mo24657a()) {
                            C9982g.m29547a(file);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m29766a(String str, String str2, String str3, List<String> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || list == null || list.size() == 0) {
            return false;
        }
        try {
            return CrashUploader.m29753a(CrashUploader.m29749a(), str, str2, str3, list);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo24637a(C9896a aVar, File file, String str, boolean z) {
        String str2;
        Event a = C9887a.m29171a(CrashType.JAVA, C9872a.f26937i, aVar);
        C9888b.m29186b(a);
        Event eventType = a.clone().eventType(C9872a.f26938j);
        if (aVar == null) {
            C9888b.m29186b(eventType.state(C34943c.f91127w));
            return;
        }
        JSONObject jSONObject = aVar.f26984a;
        if (jSONObject == null || jSONObject.length() <= 0) {
            C9888b.m29186b(eventType.state(C34943c.f91127w));
            return;
        }
        try {
            aVar.mo24487a("sdk_version", "3.1.2-rc.0-oversea");
            String str3 = "is_root";
            if (C10008c.m29714p()) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            aVar.mo24487a(str3, str2);
            aVar.mo24497b();
            aVar.mo24502d();
            aVar.mo24500c();
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
        String b = m29768b(jSONObject, null);
        try {
            String a2 = CrashUploader.m29751a(C9918j.m29332a().mo24525a());
            jSONObject.put("upload_scene", "direct");
            C10029i b2 = CrashUploader.m29756b(a2, jSONObject.toString());
            if (b2.mo24657a()) {
                C9888b.m29186b(eventType.state(0).errorInfo(b2.f27307c));
                if (!C9982g.m29547a((File) null)) {
                    C9876a.m29132a().mo24441a(C9877a.m29137a(b));
                }
            } else {
                C9888b.m29186b(eventType.state(b2.f27305a).errorInfo(b2.f27306b));
            }
        } catch (Throwable th2) {
            C9888b.m29186b(eventType.state(208).errorInfo(th2));
        }
    }
}
