package com.bytedance.crash.p498g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.C9871c.C9872a;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.event.C9887a;
import com.bytedance.crash.event.C9888b;
import com.bytedance.crash.event.Event;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p491b.C9864g;
import com.bytedance.crash.p492c.C9874b;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p501j.C9949e;
import com.bytedance.crash.p501j.p502a.C9924c.C9925a;
import com.bytedance.crash.p501j.p502a.C9930f;
import com.bytedance.crash.p504l.C9972a;
import com.bytedance.crash.p504l.C9982g;
import com.bytedance.crash.p504l.C9992m;
import com.bytedance.crash.p504l.C9999s;
import com.bytedance.crash.upload.C10016a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.g.c */
public final class C9903c implements C9902b {

    /* renamed from: a */
    public Context f27012a;

    public C9903c(Context context) {
        this.f27012a = context;
    }

    /* renamed from: a */
    public final void mo24515a(long j, Thread thread, Throwable th, String str, File file) {
        final Throwable th2 = th;
        Event a = C9887a.m29169a(CrashType.JAVA, C9872a.f26933e, j, th2);
        C9888b.m29186b(a);
        final Event clone = a.clone();
        final Event eventType = a.clone().eventType(C9872a.f26935g);
        File file2 = new File(C9992m.m29591a(this.f27012a), C9992m.m29594a(str));
        C9901a.m29272a().mo24511a(file2.getName());
        file2.mkdirs();
        C9982g.m29560e(file2);
        final boolean b = C9999s.m29656b(th);
        C9930f a2 = C9930f.m29397a();
        final long j2 = j;
        Event event = a;
        C99041 r15 = r1;
        final Thread thread2 = thread;
        CrashType crashType = CrashType.JAVA;
        final File file3 = file2;
        final String str2 = str;
        File file4 = file2;
        final File file5 = file;
        C99041 r1 = new C9925a() {

            /* renamed from: a */
            long f27013a;

            /* renamed from: a */
            public final void mo24518a(Throwable th) {
                C9888b.m29186b(eventType.state(301).errorInfo(th));
            }

            /* renamed from: a */
            public final C9896a mo24516a(int i, C9896a aVar) {
                String str;
                String str2;
                String str3;
                this.f27013a = SystemClock.uptimeMillis();
                switch (i) {
                    case 0:
                        aVar.mo24492a("data", (Object) C9999s.m29644a(th2));
                        aVar.mo24492a("isOOM", (Object) Boolean.valueOf(b));
                        aVar.mo24492a("isJava", (Object) Integer.valueOf(1));
                        aVar.mo24492a("crash_time", (Object) Long.valueOf(j2));
                        break;
                    case 1:
                        String str4 = "crash_thread_name";
                        if (thread2 != null) {
                            str = thread2.getName();
                        } else {
                            str = "";
                        }
                        aVar.mo24492a(str4, (Object) str);
                        aVar.mo24492a("tid", (Object) Integer.valueOf(Process.myTid()));
                        String str5 = "crash_after_crash";
                        if (C9912i.m29322d()) {
                            str2 = "true";
                        } else {
                            str2 = "false";
                        }
                        aVar.mo24487a(str5, str2);
                        String str6 = "crash_after_native";
                        if (NativeImpl.m29693d()) {
                            str3 = "true";
                        } else {
                            str3 = "false";
                        }
                        aVar.mo24487a(str6, str3);
                        C9901a.m29272a();
                        C9901a.m29275a(thread2, th2, false, aVar);
                        break;
                    case 2:
                        if (b) {
                            C9972a.m29501a(C9903c.this.f27012a, aVar.f26984a);
                        }
                        JSONArray c = C9864g.m29119c();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject a = C9864g.m29113a(uptimeMillis);
                        JSONArray a2 = C9864g.m29112a(100, uptimeMillis);
                        aVar.mo24492a("history_message", (Object) c);
                        aVar.mo24492a("current_message", (Object) a);
                        aVar.mo24492a("pending_messages", (Object) a2);
                        aVar.mo24487a("npth_force_apm_crash", String.valueOf(C9874b.m29128a()));
                        aVar.mo24489a("memory_info", C9949e.m29446b(file3));
                        break;
                    case 3:
                        JSONObject b = C9999s.m29654b(Thread.currentThread().getName());
                        if (b != null) {
                            aVar.mo24492a("all_thread_stacks", (Object) b);
                        }
                        aVar.mo24492a("logcat", (Object) C9949e.m29444a(file3));
                        break;
                    case 4:
                        if (!b) {
                            C9972a.m29501a(C9903c.this.f27012a, aVar.f26984a);
                            break;
                        }
                        break;
                    case 5:
                        aVar.mo24492a("crash_uuid", (Object) str2);
                        break;
                }
                return aVar;
            }

            /* renamed from: a */
            public final C9896a mo24517a(int i, C9896a aVar, boolean z) {
                try {
                    File file = file3;
                    StringBuilder sb = new StringBuilder();
                    sb.append(file3.getName());
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(i);
                    C9982g.m29543a(new File(file, sb.toString()), aVar.f26984a, false);
                } catch (IOException unused) {
                }
                C9982g.m29547a(file5);
                Event event = clone;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C9872a.f26934f);
                sb2.append(i);
                event.eventType(sb2.toString());
                C9888b.m29186b(clone);
                return aVar;
            }
        };
        C9896a a3 = a2.mo24555a(crashType, null, r15, true);
        long currentTimeMillis = System.currentTimeMillis() - j;
        try {
            a3.mo24487a("crash_type", "normal");
            a3.mo24494b("crash_cost", String.valueOf(currentTimeMillis));
            a3.mo24487a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        } catch (Throwable th3) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th3);
        }
        C10016a.m29765a();
        String b2 = C10016a.m29768b(a3.f26984a, file4);
        Event crashTime = event.clone().eventType(C9872a.f26936h).crashTime(currentTimeMillis);
        if (b2 == null) {
            C9888b.m29186b(crashTime.state(C34943c.f91128x));
        } else {
            C9888b.m29186b(crashTime.state(0));
        }
        if (!C9912i.m29324f()) {
        }
    }
}
