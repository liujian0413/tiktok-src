package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.nq */
public final class C15904nq {
    /* renamed from: a */
    public static aux m51392a(bor bor) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        bor bor2 = bor;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = bor2.f43050c;
        String str = (String) map.get("Date");
        long a = str != null ? m51391a(str) : 0;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            j2 = 0;
            int i2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j2 = 0;
            j = 0;
            z = false;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? m51391a(str3) : 0;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? m51391a(str4) : 0;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                j3 = (j * 1000) + j4;
                aux aux = new aux();
                aux.f41066a = bor2.f43049b;
                aux.f41067b = str5;
                aux.f41071f = j4;
                aux.f41070e = j3;
                aux.f41068c = a;
                aux.f41069d = a3;
                aux.f41072g = map;
                aux.f41073h = bor2.f43051d;
                return aux;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
            aux aux2 = new aux();
            aux2.f41066a = bor2.f43049b;
            aux2.f41067b = str5;
            aux2.f41071f = j4;
            aux2.f41070e = j3;
            aux2.f41068c = a;
            aux2.f41069d = a3;
            aux2.f41072g = map;
            aux2.f41073h = bor2.f43051d;
            return aux2;
        }
        j3 = j4;
        aux aux22 = new aux();
        aux22.f41066a = bor2.f43049b;
        aux22.f41067b = str5;
        aux22.f41071f = j4;
        aux22.f41070e = j3;
        aux22.f41068c = a;
        aux22.f41069d = a3;
        aux22.f41072g = map;
        aux22.f41073h = bor2.f43051d;
        return aux22;
    }

    /* renamed from: a */
    private static long m51391a(String str) {
        try {
            return m51394a().parse(str).getTime();
        } catch (ParseException unused) {
            new Object[1][0] = str;
            return 0;
        }
    }

    /* renamed from: a */
    static String m51393a(long j) {
        return m51394a().format(new Date(j));
    }

    /* renamed from: a */
    private static SimpleDateFormat m51394a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
