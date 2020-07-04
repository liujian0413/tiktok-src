package com.p280ss.sys.ces;

import android.content.Context;
import com.p280ss.p811a.p813b.C18881a;
import com.p280ss.sys.ces.p1802a.C45929a;
import java.security.MessageDigest;
import java.util.Calendar;

/* renamed from: com.ss.sys.ces.f */
public final class C45957f {
    /* renamed from: a */
    public static String m144122a() {
        try {
            Context applicationContext = C45939c.m144077a().f117425d != null ? C45939c.m144077a().f117425d : C45929a.m144044b().getApplicationContext();
            return C18881a.m61632a(MessageDigest.getInstance("SHA1").digest(applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 64).signatures[0].toByteArray())).toUpperCase();
        } catch (Throwable unused) {
            return "0000000000000000000000000000000000000000";
        }
    }

    /* renamed from: a */
    public static String m144123a(String str) {
        String str2 = "";
        int timeInMillis = (int) (Calendar.getInstance().getTimeInMillis() / 1000);
        String c = C45939c.m144084c();
        String d = C45939c.m144085d();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(c);
            sb.append("_");
            sb.append(d);
            sb.append("_");
            sb.append(timeInMillis);
            return C18881a.m61632a((byte[]) C45928a.meta(601, null, sb.toString().getBytes()));
        } catch (Throwable unused) {
            return str2;
        }
    }
}
