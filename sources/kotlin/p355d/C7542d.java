package kotlin.p355d;

import kotlin.internal.C47969b;
import kotlin.jvm.internal.C7571f;

/* renamed from: kotlin.d.d */
public abstract class C7542d {

    /* renamed from: a */
    public static final C7542d f20872a = C47969b.f122806a.mo120165a();

    /* renamed from: b */
    public static final C7543a f20873b = C7543a.f20875d;

    /* renamed from: c */
    public static final C7544b f20874c = new C7544b(null);

    /* renamed from: kotlin.d.d$a */
    public static final class C7543a extends C7542d {

        /* renamed from: d */
        public static final C7543a f20875d = new C7543a();

        private C7543a() {
        }

        /* renamed from: a */
        public final int mo19425a(int i) {
            return C7542d.f20874c.mo19425a(i);
        }
    }

    /* renamed from: kotlin.d.d$b */
    public static final class C7544b extends C7542d {
        private C7544b() {
        }

        /* renamed from: b */
        public final int mo19427b() {
            return C7542d.f20872a.mo19427b();
        }

        /* renamed from: c */
        public final double mo19428c() {
            return C7542d.f20872a.mo19428c();
        }

        public /* synthetic */ C7544b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final int mo19425a(int i) {
            return C7542d.f20872a.mo19425a(i);
        }

        /* renamed from: a */
        public final int mo19426a(int i, int i2) {
            return C7542d.f20872a.mo19426a(i, i2);
        }
    }

    /* renamed from: a */
    public abstract int mo19425a(int i);

    /* renamed from: b */
    public int mo19427b() {
        return mo19425a(32);
    }

    /* renamed from: c */
    public double mo19428c() {
        return C47962c.m148902a(mo19425a(26), mo19425a(27));
    }

    /* renamed from: a */
    public int mo19426a(int i, int i2) {
        int i3;
        int b;
        int i4;
        C7545e.m23551b(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i3 = mo19425a(C7545e.m23550b(i5));
            } else {
                do {
                    b = mo19427b() >>> 1;
                    i4 = b % i5;
                } while ((b - i4) + (i5 - 1) < 0);
                i3 = i4;
            }
            return i + i3;
        }
        while (true) {
            int b2 = mo19427b();
            if (i <= b2 && i2 > b2) {
                return b2;
            }
        }
    }
}
