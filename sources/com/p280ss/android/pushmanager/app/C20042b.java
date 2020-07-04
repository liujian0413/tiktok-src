package com.p280ss.android.pushmanager.app;

import android.app.Service;
import android.app.job.JobService;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.bytedance.common.utility.reflect.C6322b;
import com.p280ss.android.message.p885a.C19826j;

/* renamed from: com.ss.android.pushmanager.app.b */
public final class C20042b {

    /* renamed from: com.ss.android.pushmanager.app.b$a */
    static class C20043a implements Callback {

        /* renamed from: a */
        Handler f54236a;

        /* renamed from: b */
        Callback f54237b;

        public final boolean handleMessage(Message message) {
            boolean z;
            if (message != null) {
                try {
                    if (this.f54237b != null) {
                        z = this.f54237b.handleMessage(message);
                    } else {
                        z = false;
                    }
                    if (!z && this.f54236a != null) {
                        this.f54236a.handleMessage(message);
                    }
                    return true;
                } catch (Throwable unused) {
                }
            }
            if (this.f54237b != null) {
                return this.f54237b.handleMessage(message);
            }
            return false;
        }

        public C20043a(Handler handler, Callback callback) {
            this.f54236a = handler;
            this.f54237b = callback;
        }
    }

    /* renamed from: a */
    public static void m66003a(Service service) {
        if (service instanceof JobService) {
            try {
                JobService jobService = (JobService) service;
                if (!C19826j.m65474c(jobService) && VERSION.SDK_INT >= 21 && VERSION.SDK_INT < 26) {
                    C6322b a = C6322b.m19610a((Object) jobService);
                    a.mo15160b("ensureHandler");
                    Handler handler = (Handler) a.mo15161b("mHandler", Class.forName("android.app.job.JobService$JobHandler")).f18556a;
                    if (handler != null) {
                        C6322b a2 = C6322b.m19610a((Object) handler);
                        a2.mo15157a("mCallback", (Object) new C20043a(handler, (Callback) a2.mo15161b("mCallback", Callback.class).f18556a));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
