package com.bytedance.apm.p239c;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p241f.p242a.C6191a;
import com.bytedance.apm.p241f.p243b.C9598c;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p252m.C6277c;
import com.taobao.android.dexposed.ClassUtils;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.d */
public class C9589d {

    /* renamed from: e */
    private static volatile C9589d f26200e;

    /* renamed from: a */
    public long f26201a = 2500;

    /* renamed from: b */
    public final String f26202b = C6175a.class.getName();

    /* renamed from: c */
    public ConcurrentLinkedQueue<C9587b> f26203c;

    /* renamed from: d */
    public C9587b f26204d;

    /* renamed from: f */
    private C6277c f26205f;

    /* renamed from: g */
    private final Runnable f26206g = new Runnable() {
        public final void run() {
            try {
                StringBuilder sb = new StringBuilder();
                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                if (!stackTrace[0].getClassName().startsWith(C9589d.this.f26202b)) {
                    if (C6174c.m19149g()) {
                        m28385a(stackTrace);
                    }
                    int i = 0;
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        i++;
                        StringBuilder sb2 = new StringBuilder("\tat ");
                        sb2.append(stackTraceElement.getClassName());
                        sb.append(sb2.toString());
                        sb.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb.append(stackTraceElement.getMethodName());
                        sb.append("(");
                        sb.append(stackTraceElement.getFileName());
                        sb.append(":");
                        sb.append(stackTraceElement.getLineNumber());
                        sb.append(")\n");
                        if (i > 50) {
                            break;
                        }
                    }
                    C9589d.this.f26204d.f26199c = sb.toString();
                    if (C9589d.this.f26203c.size() > 5) {
                        C9589d.this.f26203c.poll();
                    }
                    C9589d.this.f26203c.add(C9589d.this.f26204d);
                }
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        private void m28385a(StackTraceElement[] stackTraceElementArr) {
            if (stackTraceElementArr != null) {
                StringBuilder sb = new StringBuilder("main thread task execute more than ");
                sb.append(C9589d.this.f26201a);
                sb.append("ms");
                new TimeoutException(sb.toString()).setStackTrace(stackTraceElementArr);
            }
        }
    };

    private C9589d() {
    }

    /* renamed from: a */
    public static C9589d m28379a() {
        if (f26200e == null) {
            synchronized (C9589d.class) {
                if (f26200e == null) {
                    f26200e = new C9589d();
                }
            }
        }
        return f26200e;
    }

    /* renamed from: e */
    private void m28380e() {
        if (!this.f26203c.isEmpty()) {
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    C9587b bVar;
                    try {
                        bVar = (C9587b) C9589d.this.f26203c.poll();
                    } catch (Throwable unused) {
                        bVar = null;
                    }
                    if (bVar != null && bVar.f26199c != null) {
                        if (bVar.f26198b == -1) {
                            bVar.f26198b = SystemClock.uptimeMillis();
                        }
                        if (bVar.f26198b - bVar.f26197a < C9589d.this.f26201a) {
                            bVar.f26199c = "InvalidStack.TimeOutGetStackTrace: 卡顿发生有效，但抓取堆栈线程的调度延时，导致抓取堆栈无效.\n";
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("stack", bVar.f26199c);
                            jSONObject.put("timestamp", System.currentTimeMillis());
                            jSONObject.put("crash_time", System.currentTimeMillis());
                            jSONObject.put("is_main_process", C6174c.m19145c());
                            jSONObject.put("process_name", C6174c.m19141b());
                            jSONObject.put("block_duration", bVar.f26198b - bVar.f26197a);
                            jSONObject.put("event_type", "lag");
                            C6191a.m19218b().mo14915a(new C9598c("block_monitor", jSONObject));
                        } catch (Exception unused2) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo23911b() {
        this.f26203c = new ConcurrentLinkedQueue<>();
        this.f26205f = new C6277c("caton_dump_stack", 10);
        this.f26205f.mo15070a();
    }

    /* renamed from: c */
    public final void mo23912c() {
        try {
            if (this.f26205f.mo15074b()) {
                this.f26204d = new C9587b();
                this.f26204d.f26197a = SystemClock.uptimeMillis();
                this.f26205f.mo15072a(this.f26206g, this.f26201a);
            }
        } catch (IllegalMonitorStateException unused) {
        }
    }

    /* renamed from: d */
    public final void mo23913d() {
        try {
            if (this.f26205f.mo15074b()) {
                this.f26205f.mo15073b(this.f26206g);
                if (this.f26204d != null) {
                    this.f26204d.f26198b = SystemClock.uptimeMillis();
                    if (this.f26204d.f26199c != null) {
                        m28380e();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo23910a(long j) {
        if (j < 70) {
            j = 2500;
        }
        this.f26201a = j;
    }
}
