package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import com.C1642a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.b */
public final class C35442b {
    /* renamed from: b */
    private static double m114471b(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: a */
    private static double m114464a(double d) {
        double sin = Math.sin(d / 2.0d);
        return sin * sin;
    }

    /* renamed from: a */
    public static double m114466a(double[] dArr, double[] dArr2) {
        return m114465a(dArr[0], dArr[1], dArr2[0], dArr2[1]);
    }

    /* renamed from: a */
    public static String m114468a(Context context, PoiStruct poiStruct) {
        double d;
        double d2;
        LocationResult a = C32640a.m105721a().mo84021a();
        if (a == null) {
            return "";
        }
        double doubleValue = Double.valueOf(poiStruct.poiLatitude).doubleValue();
        double doubleValue2 = Double.valueOf(poiStruct.poiLongitude).doubleValue();
        double latitude = a.getLatitude();
        double longitude = a.getLongitude();
        if (!a.isGaode()) {
            double[] b = C35440a.m114454b(longitude, latitude);
            double d3 = b[0];
            d2 = b[1];
            d = d3;
        } else {
            d = longitude;
            d2 = latitude;
        }
        return m114467a(context, doubleValue, doubleValue2, d2, d);
    }

    /* renamed from: a */
    public static double[] m114469a(double d, double d2) {
        double[] dArr = {0.0d, 0.0d};
        try {
            double[] b = C35440a.m114454b(d2, d);
            dArr[0] = b[1];
            dArr[1] = b[0];
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
        return dArr;
    }

    /* renamed from: a */
    public static double[] m114470a(String str, String str2) {
        try {
            return m114469a(Double.parseDouble(str), Double.parseDouble(str2));
        } catch (Exception e) {
            C6921a.m21554a(e);
            return new double[]{0.0d, 0.0d};
        }
    }

    /* renamed from: a */
    public static double m114465a(double d, double d2, double d3, double d4) {
        double b = m114471b(d);
        double b2 = m114471b(d2);
        double b3 = m114471b(d3);
        return Math.asin(Math.sqrt(m114464a(Math.abs(b - b3)) + (Math.cos(b) * Math.cos(b3) * m114464a(Math.abs(b2 - m114471b(d4)))))) * 12742.0d;
    }

    /* renamed from: d */
    private static String m114474d(Context context, double d, double d2, double d3, double d4) {
        return m114473c(context, d, d2, d3, d4);
    }

    /* renamed from: b */
    public static String m114472b(Context context, double d, double d2, double d3, double d4) {
        double a = m114465a(d, d2, d3, d4);
        return C1642a.m8034a(context.getResources().getString(R.string.cy9), new Object[]{Double.valueOf(a)});
    }

    /* renamed from: a */
    public static String m114467a(Context context, double d, double d2, double d3, double d4) {
        double[] a = m114469a(d, d2);
        return m114474d(context, a[0], a[1], d3, d4);
    }

    /* renamed from: c */
    public static String m114473c(Context context, double d, double d2, double d3, double d4) {
        double a = m114465a(d, d2, d3, d4);
        if (a > 1.0d) {
            return C1642a.m8034a(context.getResources().getString(R.string.cyb), new Object[]{Integer.valueOf((int) a)});
        } else if (a > 0.1d) {
            return C1642a.m8034a(context.getResources().getString(R.string.cyc), new Object[]{Integer.valueOf((int) (a * 1000.0d))});
        } else {
            return C1642a.m8034a(context.getResources().getString(R.string.cya), new Object[]{"<"});
        }
    }
}
