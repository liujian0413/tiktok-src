package net.openid.appauth.p1889c;

import android.util.Log;
import com.C1642a;
import net.openid.appauth.C48280n;

/* renamed from: net.openid.appauth.c.a */
public final class C48254a {

    /* renamed from: a */
    private static C48254a f123239a;

    /* renamed from: b */
    private final C48256b f123240b;

    /* renamed from: c */
    private final int f123241c;

    /* renamed from: net.openid.appauth.c.a$a */
    static final class C48255a implements C48256b {

        /* renamed from: a */
        public static final C48255a f123242a = new C48255a();

        private C48255a() {
        }

        /* renamed from: a */
        public final String mo120622a(Throwable th) {
            return Log.getStackTraceString(th);
        }

        /* renamed from: a */
        public final boolean mo120623a(String str, int i) {
            return Log.isLoggable(str, i);
        }
    }

    /* renamed from: net.openid.appauth.c.a$b */
    public interface C48256b {
        /* renamed from: a */
        String mo120622a(Throwable th);

        /* renamed from: a */
        boolean mo120623a(String str, int i);
    }

    /* renamed from: a */
    private static synchronized C48254a m149684a() {
        C48254a aVar;
        synchronized (C48254a.class) {
            if (f123239a == null) {
                f123239a = new C48254a(C48255a.f123242a);
            }
            aVar = f123239a;
        }
        return aVar;
    }

    private C48254a(C48256b bVar) {
        this.f123240b = (C48256b) C48280n.m149788a(bVar);
        int i = 7;
        while (i >= 2 && this.f123240b.mo120623a("AppAuth", i)) {
            i--;
        }
        this.f123241c = i + 1;
    }

    /* renamed from: a */
    public static void m149686a(String str, Object... objArr) {
        m149684a().m149685a(3, null, str, objArr);
    }

    /* renamed from: b */
    public static void m149688b(String str, Object... objArr) {
        m149684a().m149685a(4, null, str, objArr);
    }

    /* renamed from: c */
    public static void m149689c(String str, Object... objArr) {
        m149684a().m149685a(5, null, str, objArr);
    }

    /* renamed from: d */
    public static void m149690d(String str, Object... objArr) {
        m149684a().m149685a(6, null, str, objArr);
    }

    /* renamed from: a */
    public static void m149687a(Throwable th, String str, Object... objArr) {
        m149684a().m149685a(3, th, str, objArr);
    }

    /* renamed from: a */
    private void m149685a(int i, Throwable th, String str, Object... objArr) {
        if (this.f123241c <= i) {
            if (objArr != null && objArr.length > 0) {
                str = C1642a.m8034a(str, objArr);
            }
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("\n");
                sb.append(this.f123240b.mo120622a(th));
            }
        }
    }
}
