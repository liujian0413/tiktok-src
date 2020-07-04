package com.p280ss.android.ugc.aweme.poi.utils;

import com.C1642a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.a */
public final class C35440a {

    /* renamed from: a */
    static double f92948a = 52.35987755982988d;

    /* renamed from: b */
    static double f92949b = 3.141592653589793d;

    /* renamed from: c */
    static double f92950c = 6378245.0d;

    /* renamed from: d */
    static double f92951d = 0.006693421622965943d;

    /* renamed from: f */
    private static boolean m114458f(double d, double d2) {
        return true;
    }

    /* renamed from: a */
    public static String[] m114452a(LocationResult locationResult) {
        String str;
        String str2;
        if (locationResult.isGaode()) {
            double[] c = m114455c(locationResult.getLongitude(), locationResult.getLatitude());
            str2 = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(c[0])});
            str = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(c[1])});
        } else {
            str2 = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(locationResult.getLongitude())});
            str = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(locationResult.getLatitude())});
        }
        return new String[]{str, str2};
    }

    /* renamed from: a */
    public static String[] m114453a(LocationBundle locationBundle) {
        String str;
        String str2;
        if (locationBundle.isGaode) {
            double[] c = m114455c(locationBundle.longitude, locationBundle.latitude);
            str2 = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(c[0])});
            str = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(c[1])});
        } else {
            str2 = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(locationBundle.longitude)});
            str = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(locationBundle.latitude)});
        }
        return new String[]{str, str2};
    }

    /* renamed from: a */
    public static double[] m114451a(double d, double d2) {
        double sqrt = Math.sqrt((d * d) + (d2 * d2)) + (Math.sin(f92948a * d2) * 2.0E-5d);
        double atan2 = Math.atan2(d2, d) + (Math.cos(d * f92948a) * 3.0E-6d);
        return new double[]{(Math.cos(atan2) * sqrt) + 0.0065d, (sqrt * Math.sin(atan2)) + 0.006d};
    }

    /* renamed from: b */
    public static double[] m114454b(double d, double d2) {
        if (m114458f(d, d2)) {
            return new double[]{d, d2};
        }
        double d3 = d - 105.0d;
        double d4 = d2 - 35.0d;
        double d5 = m114456d(d3, d4);
        double e = m114457e(d3, d4);
        double d6 = (d2 / 180.0d) * f92949b;
        double sin = Math.sin(d6);
        double d7 = 1.0d - ((f92951d * sin) * sin);
        double sqrt = Math.sqrt(d7);
        return new double[]{d + ((e * 180.0d) / (((f92950c / sqrt) * Math.cos(d6)) * f92949b)), d2 + ((d5 * 180.0d) / (((f92950c * (1.0d - f92951d)) / (d7 * sqrt)) * f92949b))};
    }

    /* renamed from: c */
    public static double[] m114455c(double d, double d2) {
        if (m114458f(d, d2)) {
            return new double[]{d, d2};
        }
        double d3 = d - 105.0d;
        double d4 = d2 - 35.0d;
        double d5 = m114456d(d3, d4);
        double e = m114457e(d3, d4);
        double d6 = (d2 / 180.0d) * f92949b;
        double sin = Math.sin(d6);
        double d7 = 1.0d - ((f92951d * sin) * sin);
        double sqrt = Math.sqrt(d7);
        double d8 = d * 2.0d;
        return new double[]{d8 - (d + ((e * 180.0d) / (((f92950c / sqrt) * Math.cos(d6)) * f92949b))), (d2 * 2.0d) - (d2 + ((d5 * 180.0d) / (((f92950c * (1.0d - f92951d)) / (d7 * sqrt)) * f92949b)))};
    }

    /* renamed from: d */
    private static double m114456d(double d, double d2) {
        double d3 = d * 2.0d;
        return -100.0d + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(Math.abs(d)) * 0.2d) + ((((Math.sin((d * 6.0d) * f92949b) * 20.0d) + (Math.sin(d3 * f92949b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f92949b * d2) * 20.0d) + (Math.sin((d2 / 3.0d) * f92949b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * f92949b) * 160.0d) + (Math.sin((d2 * f92949b) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    /* renamed from: e */
    private static double m114457e(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(Math.abs(d)) * 0.1d) + ((((Math.sin((6.0d * d) * f92949b) * 20.0d) + (Math.sin((d * 2.0d) * f92949b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f92949b * d) * 20.0d) + (Math.sin((d / 3.0d) * f92949b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * f92949b) * 150.0d) + (Math.sin((d / 30.0d) * f92949b) * 300.0d)) * 2.0d) / 3.0d);
    }
}
