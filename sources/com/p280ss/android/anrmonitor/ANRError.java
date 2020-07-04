package com.p280ss.android.anrmonitor;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.anrmonitor.ANRError */
public class ANRError extends Error {
    private static final long serialVersionUID = 1;
    private final Map<Thread, StackTraceElement[]> stackTraces;

    /* renamed from: com.ss.android.anrmonitor.ANRError$a */
    static class C19212a {

        /* renamed from: a */
        public final String f51872a;

        /* renamed from: b */
        public final StackTraceElement[] f51873b;

        /* renamed from: com.ss.android.anrmonitor.ANRError$a$a */
        class C19213a extends Throwable {
            public final Throwable fillInStackTrace() {
                setStackTrace(C19212a.this.f51873b);
                return this;
            }

            private C19213a(C19213a aVar) {
                super(C19212a.this.f51872a, aVar);
            }
        }

        private C19212a(String str, StackTraceElement[] stackTraceElementArr) {
            this.f51872a = str;
            this.f51873b = stackTraceElementArr;
        }
    }

    public Map<Thread, StackTraceElement[]> getStackTraces() {
        return this.stackTraces;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public static ANRError NewMainOnly() {
        Thread thread = Looper.getMainLooper().getThread();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        HashMap hashMap = new HashMap(1);
        hashMap.put(thread, stackTrace);
        C19212a aVar = new C19212a(thread.getName(), stackTrace);
        aVar.getClass();
        return new ANRError(new C19213a(), hashMap);
    }

    public ANRError(C19213a aVar, Map<Thread, StackTraceElement[]> map) {
        super("Application Not Responding", aVar);
        this.stackTraces = map;
    }
}
