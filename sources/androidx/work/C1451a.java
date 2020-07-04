package androidx.work;

import android.os.Build.VERSION;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.a */
public final class C1451a {

    /* renamed from: a */
    public final Executor f5644a;

    /* renamed from: b */
    public final C1577j f5645b;

    /* renamed from: c */
    public final int f5646c;

    /* renamed from: d */
    public final int f5647d;

    /* renamed from: e */
    public final int f5648e;

    /* renamed from: f */
    private final int f5649f;

    /* renamed from: androidx.work.a$a */
    public static final class C1452a {

        /* renamed from: a */
        Executor f5650a;

        /* renamed from: b */
        C1577j f5651b;

        /* renamed from: c */
        int f5652c = 4;

        /* renamed from: d */
        int f5653d;

        /* renamed from: e */
        int f5654e = Integer.MAX_VALUE;

        /* renamed from: f */
        int f5655f = 20;

        /* renamed from: a */
        public final C1451a mo6680a() {
            return new C1451a(this);
        }
    }

    /* renamed from: a */
    public final int mo6679a() {
        if (VERSION.SDK_INT == 23) {
            return this.f5649f / 2;
        }
        return this.f5649f;
    }

    /* renamed from: b */
    private static Executor m7307b() {
        return C1453b.m7310a(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    C1451a(C1452a aVar) {
        if (aVar.f5650a == null) {
            this.f5644a = m7307b();
        } else {
            this.f5644a = aVar.f5650a;
        }
        if (aVar.f5651b == null) {
            this.f5645b = C1577j.m7676a();
        } else {
            this.f5645b = aVar.f5651b;
        }
        this.f5646c = aVar.f5652c;
        this.f5647d = aVar.f5653d;
        this.f5648e = aVar.f5654e;
        this.f5649f = aVar.f5655f;
    }
}
