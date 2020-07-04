package android.support.p022v4.p026d;

import java.util.Locale;

/* renamed from: android.support.v4.d.e */
public final class C0713e {

    /* renamed from: a */
    public static final C0712d f2703a = new C0718e(null, false);

    /* renamed from: b */
    public static final C0712d f2704b = new C0718e(null, true);

    /* renamed from: c */
    public static final C0712d f2705c = new C0718e(C0715b.f2712a, false);

    /* renamed from: d */
    public static final C0712d f2706d = new C0718e(C0715b.f2712a, true);

    /* renamed from: e */
    public static final C0712d f2707e = new C0718e(C0714a.f2709a, false);

    /* renamed from: f */
    public static final C0712d f2708f = C0719f.f2715a;

    /* renamed from: android.support.v4.d.e$a */
    static class C0714a implements C0716c {

        /* renamed from: a */
        static final C0714a f2709a = new C0714a(true);

        /* renamed from: b */
        static final C0714a f2710b = new C0714a(false);

        /* renamed from: c */
        private final boolean f2711c;

        private C0714a(boolean z) {
            this.f2711c = z;
        }

        /* renamed from: a */
        public final int mo2876a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                switch (C0713e.m3033a(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0:
                        if (this.f2711c) {
                            return 0;
                        }
                        break;
                    case 1:
                        if (!this.f2711c) {
                            return 1;
                        }
                        break;
                }
                z = true;
                i++;
            }
            if (!z) {
                return 2;
            }
            if (this.f2711c) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: android.support.v4.d.e$b */
    static class C0715b implements C0716c {

        /* renamed from: a */
        static final C0715b f2712a = new C0715b();

        private C0715b() {
        }

        /* renamed from: a */
        public final int mo2876a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0713e.m3034b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: android.support.v4.d.e$c */
    interface C0716c {
        /* renamed from: a */
        int mo2876a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: android.support.v4.d.e$d */
    static abstract class C0717d implements C0712d {

        /* renamed from: a */
        private final C0716c f2713a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo2877a();

        C0717d(C0716c cVar) {
            this.f2713a = cVar;
        }

        /* renamed from: b */
        private boolean m3038b(CharSequence charSequence, int i, int i2) {
            switch (this.f2713a.mo2876a(charSequence, i, i2)) {
                case 0:
                    return true;
                case 1:
                    return false;
                default:
                    return mo2877a();
            }
        }

        /* renamed from: a */
        public final boolean mo2875a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
                throw new IllegalArgumentException();
            } else if (this.f2713a == null) {
                return mo2877a();
            } else {
                return m3038b(charSequence, 0, i2);
            }
        }
    }

    /* renamed from: android.support.v4.d.e$e */
    static class C0718e extends C0717d {

        /* renamed from: a */
        private final boolean f2714a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo2877a() {
            return this.f2714a;
        }

        C0718e(C0716c cVar, boolean z) {
            super(cVar);
            this.f2714a = z;
        }
    }

    /* renamed from: android.support.v4.d.e$f */
    static class C0719f extends C0717d {

        /* renamed from: a */
        static final C0719f f2715a = new C0719f();

        C0719f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo2877a() {
            if (C0720f.m3043a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    static int m3033a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m3034b(int r0) {
        /*
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0008;
                case 2: goto L_0x0008;
                default: goto L_0x0003;
            }
        L_0x0003:
            switch(r0) {
                case 14: goto L_0x000a;
                case 15: goto L_0x000a;
                case 16: goto L_0x0008;
                case 17: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r0 = 2
            return r0
        L_0x0008:
            r0 = 0
            return r0
        L_0x000a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.p026d.C0713e.m3034b(int):int");
    }
}
