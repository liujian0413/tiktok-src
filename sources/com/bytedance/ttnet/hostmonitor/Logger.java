package com.bytedance.ttnet.hostmonitor;

import com.bytedance.common.utility.C6312h;

public final class Logger {

    /* renamed from: a */
    private LogLevel f34386a;

    /* renamed from: b */
    private C12984a f34387b;

    public enum LogLevel {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* renamed from: com.bytedance.ttnet.hostmonitor.Logger$a */
    public interface C12984a {
    }

    /* renamed from: com.bytedance.ttnet.hostmonitor.Logger$b */
    static class C12985b {

        /* renamed from: a */
        public static final Logger f34388a = new Logger();
    }

    private Logger() {
        LogLevel logLevel;
        if (C6312h.m19578b()) {
            logLevel = LogLevel.DEBUG;
        } else {
            logLevel = LogLevel.OFF;
        }
        this.f34386a = logLevel;
        this.f34387b = new C12986a();
    }

    /* renamed from: a */
    public static void m37867a(String str, String str2) {
        C12985b.f34388a.f34386a.compareTo(LogLevel.ERROR);
    }

    /* renamed from: b */
    public static void m37869b(String str, String str2) {
        C12985b.f34388a.f34386a.compareTo(LogLevel.INFO);
    }

    /* renamed from: c */
    public static void m37870c(String str, String str2) {
        C12985b.f34388a.f34386a.compareTo(LogLevel.DEBUG);
    }

    /* renamed from: a */
    public static void m37868a(String str, String str2, Throwable th) {
        C12985b.f34388a.f34386a.compareTo(LogLevel.ERROR);
    }
}
