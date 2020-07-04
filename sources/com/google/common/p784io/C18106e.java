package com.google.common.p784io;

import com.google.common.base.C17439m;
import com.google.common.base.C17462u;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.io.e */
public final class C18106e implements Closeable {

    /* renamed from: b */
    private static final C18109c f49452b;

    /* renamed from: a */
    final C18109c f49453a;

    /* renamed from: c */
    private final Deque<Closeable> f49454c = new ArrayDeque(4);

    /* renamed from: d */
    private Throwable f49455d;

    /* renamed from: com.google.common.io.e$a */
    static final class C18107a implements C18109c {

        /* renamed from: a */
        static final C18107a f49456a = new C18107a();

        C18107a() {
        }

        /* renamed from: a */
        public final void mo46733a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = C18105d.f49451a;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Suppressing exception thrown when closing ");
            sb.append(closeable);
            logger.log(level, sb.toString(), th2);
        }
    }

    /* renamed from: com.google.common.io.e$b */
    static final class C18108b implements C18109c {

        /* renamed from: a */
        static final C18108b f49457a = new C18108b();

        /* renamed from: b */
        static final Method f49458b = m59864b();

        C18108b() {
        }

        /* renamed from: a */
        static boolean m59863a() {
            if (f49458b != null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private static Method m59864b() {
            try {
                return Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final void mo46733a(Closeable closeable, Throwable th, Throwable th2) {
            if (th != th2) {
                try {
                    f49458b.invoke(th, new Object[]{th2});
                } catch (Throwable unused) {
                    C18107a.f49456a.mo46733a(closeable, th, th2);
                }
            }
        }
    }

    /* renamed from: com.google.common.io.e$c */
    interface C18109c {
        /* renamed from: a */
        void mo46733a(Closeable closeable, Throwable th, Throwable th2);
    }

    /* renamed from: a */
    public static C18106e m59859a() {
        return new C18106e(f49452b);
    }

    static {
        C18109c cVar;
        if (C18108b.m59863a()) {
            cVar = C18108b.f49457a;
        } else {
            cVar = C18107a.f49456a;
        }
        f49452b = cVar;
    }

    public final void close() throws IOException {
        Throwable th = this.f49455d;
        while (!this.f49454c.isEmpty()) {
            Closeable closeable = (Closeable) this.f49454c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f49453a.mo46733a(closeable, th, th2);
                }
            }
        }
        if (this.f49455d == null && th != null) {
            C17462u.m58023a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    /* renamed from: a */
    public final <C extends Closeable> C mo46730a(C c) {
        if (c != null) {
            this.f49454c.addFirst(c);
        }
        return c;
    }

    private C18106e(C18109c cVar) {
        this.f49453a = (C18109c) C17439m.m57962a(cVar);
    }

    /* renamed from: a */
    public final RuntimeException mo46731a(Throwable th) throws IOException {
        C17439m.m57962a(th);
        this.f49455d = th;
        C17462u.m58023a(th, IOException.class);
        throw new RuntimeException(th);
    }
}
