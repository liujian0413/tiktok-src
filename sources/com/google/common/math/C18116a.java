package com.google.common.math;

import java.math.RoundingMode;

/* renamed from: com.google.common.math.a */
public final class C18116a {

    /* renamed from: a */
    static final double[] f49464a = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: b */
    private static final double f49465b = Math.log(2.0d);

    /* renamed from: com.google.common.math.a$1 */
    static /* synthetic */ class C181171 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49466a = new int[RoundingMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49466a = r0
                int[] r0 = f49466a     // Catch:{ NoSuchFieldError -> 0x0014 }
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f49466a     // Catch:{ NoSuchFieldError -> 0x001f }
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f49466a     // Catch:{ NoSuchFieldError -> 0x002a }
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f49466a     // Catch:{ NoSuchFieldError -> 0x0035 }
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f49466a     // Catch:{ NoSuchFieldError -> 0x0040 }
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f49466a     // Catch:{ NoSuchFieldError -> 0x004b }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f49466a     // Catch:{ NoSuchFieldError -> 0x0056 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f49466a     // Catch:{ NoSuchFieldError -> 0x0062 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.C18116a.C181171.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static boolean m59881a(double d) {
        if (!C18118b.m59884b(d) || (d != 0.0d && 52 - Long.numberOfTrailingZeros(C18118b.m59883a(d)) > Math.getExponent(d))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m59880a(double d, RoundingMode roundingMode) {
        boolean z;
        double b = m59882b(d, roundingMode);
        boolean z2 = false;
        if (-9.223372036854776E18d - b < 1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (b < 9.223372036854776E18d) {
            z2 = true;
        }
        C18129f.m59901b(z2 & z);
        return (long) b;
    }

    /* renamed from: b */
    private static double m59882b(double d, RoundingMode roundingMode) {
        int i;
        if (C18118b.m59884b(d)) {
            switch (C181171.f49466a[roundingMode.ordinal()]) {
                case 1:
                    C18129f.m59899a(m59881a(d));
                    return d;
                case 2:
                    if (d >= 0.0d || m59881a(d)) {
                        return d;
                    }
                    return (double) (((long) d) - 1);
                case 3:
                    if (d <= 0.0d || m59881a(d)) {
                        return d;
                    }
                    return (double) (((long) d) + 1);
                case 4:
                    return d;
                case 5:
                    if (m59881a(d)) {
                        return d;
                    }
                    long j = (long) d;
                    if (d > 0.0d) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    return (double) (j + ((long) i));
                case 6:
                    return Math.rint(d);
                case 7:
                    double rint = Math.rint(d);
                    if (Math.abs(d - rint) == 0.5d) {
                        return d + Math.copySign(0.5d, d);
                    }
                    return rint;
                case 8:
                    double rint2 = Math.rint(d);
                    if (Math.abs(d - rint2) == 0.5d) {
                        return d;
                    }
                    return rint2;
                default:
                    throw new AssertionError();
            }
        } else {
            throw new ArithmeticException("input is infinite or NaN");
        }
    }
}
