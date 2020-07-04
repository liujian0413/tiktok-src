package com.facebook.internal;

import com.C1642a;
import com.facebook.C13499h;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.internal.t */
public final class C13949t {

    /* renamed from: b */
    private static final HashMap<String, String> f36907b = new HashMap<>();

    /* renamed from: a */
    public int f36908a = 3;

    /* renamed from: c */
    private final LoggingBehavior f36909c;

    /* renamed from: d */
    private final String f36910d;

    /* renamed from: e */
    private StringBuilder f36911e;

    /* renamed from: b */
    private boolean m41135b() {
        return C13499h.m39715b(this.f36909c);
    }

    /* renamed from: a */
    public final void mo33602a() {
        m41137d(this.f36911e.toString());
        this.f36911e = new StringBuilder();
    }

    /* renamed from: d */
    private void m41137d(String str) {
        m41128a(this.f36909c, this.f36908a, this.f36910d, str);
    }

    /* renamed from: b */
    public final void mo33604b(String str) {
        if (m41135b()) {
            this.f36911e.append(str);
        }
    }

    /* renamed from: c */
    private static synchronized String m41136c(String str) {
        synchronized (C13949t.class) {
            for (Entry entry : f36907b.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m41132a(String str) {
        synchronized (C13949t.class) {
            if (!C13499h.m39715b(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                m41133a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public C13949t(LoggingBehavior loggingBehavior, String str) {
        C13876aa.m40979a(str, "tag");
        this.f36909c = loggingBehavior;
        StringBuilder sb = new StringBuilder("FacebookSDK.");
        sb.append(str);
        this.f36910d = sb.toString();
        this.f36911e = new StringBuilder();
    }

    /* renamed from: a */
    private static synchronized void m41133a(String str, String str2) {
        synchronized (C13949t.class) {
            f36907b.put(str, str2);
        }
    }

    /* renamed from: a */
    private void m41134a(String str, Object... objArr) {
        if (m41135b()) {
            this.f36911e.append(C1642a.m8034a(str, objArr));
        }
    }

    /* renamed from: a */
    public final void mo33603a(String str, Object obj) {
        m41134a("  %s:\t%s\n", str, obj);
    }

    /* renamed from: a */
    public static void m41130a(LoggingBehavior loggingBehavior, String str, String str2) {
        m41128a(loggingBehavior, 3, str, str2);
    }

    /* renamed from: a */
    public static void m41128a(LoggingBehavior loggingBehavior, int i, String str, String str2) {
        if (C13499h.m39715b(loggingBehavior)) {
            m41136c(str2);
            if (!str.startsWith("FacebookSDK.")) {
                new StringBuilder("FacebookSDK.").append(str);
            }
        }
    }

    /* renamed from: a */
    public static void m41131a(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        if (C13499h.m39715b(loggingBehavior)) {
            m41128a(loggingBehavior, 3, str, C1642a.m8034a(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m41129a(LoggingBehavior loggingBehavior, int i, String str, String str2, Object... objArr) {
        if (C13499h.m39715b(loggingBehavior)) {
            m41128a(loggingBehavior, 5, str, C1642a.m8034a(str2, objArr));
        }
    }
}
