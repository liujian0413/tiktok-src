package android.support.p029v7.recyclerview.extensions;

import android.support.p029v7.util.C1143a.C1147c;
import java.util.concurrent.Executor;

/* renamed from: android.support.v7.recyclerview.extensions.a */
public final class C1135a<T> {

    /* renamed from: a */
    public final Executor f4086a;

    /* renamed from: b */
    public final Executor f4087b;

    /* renamed from: c */
    public final C1147c<T> f4088c;

    /* renamed from: android.support.v7.recyclerview.extensions.a$a */
    public static final class C1136a<T> {

        /* renamed from: d */
        private static final Object f4089d = new Object();

        /* renamed from: e */
        private static Executor f4090e = null;

        /* renamed from: a */
        private Executor f4091a;

        /* renamed from: b */
        private Executor f4092b;

        /* renamed from: c */
        private final C1147c<T> f4093c;

        /* renamed from: a */
        public final C1135a<T> mo4537a() {
            if (this.f4092b == null) {
                synchronized (f4089d) {
                    if (f4090e == null) {
                        f4090e = C1137b.m5042a(2);
                    }
                }
                this.f4092b = f4090e;
            }
            return new C1135a<>(this.f4091a, this.f4092b, this.f4093c);
        }

        public C1136a(C1147c<T> cVar) {
            this.f4093c = cVar;
        }
    }

    C1135a(Executor executor, Executor executor2, C1147c<T> cVar) {
        this.f4086a = executor;
        this.f4087b = executor2;
        this.f4088c = cVar;
    }
}
