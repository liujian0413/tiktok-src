package com.p280ss.android.ugc.aweme.p1355k.p1357b;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.k.b.d */
public final class C32269d {

    /* renamed from: a */
    private static Locale f84326a;

    /* renamed from: b */
    private static final SimpleDateFormat f84327b = new SimpleDateFormat("yyyy-MM-dd", f84326a);

    /* renamed from: c */
    private static final SimpleDateFormat f84328c = new SimpleDateFormat("yyyy年MM月dd日", f84326a);

    /* renamed from: d */
    private static final SimpleDateFormat f84329d = new SimpleDateFormat("MM-dd", f84326a);

    /* renamed from: e */
    private static final SimpleDateFormat f84330e = new SimpleDateFormat("MM月dd日", f84326a);

    /* renamed from: f */
    private static final SimpleDateFormat f84331f = new SimpleDateFormat("HH:mm", f84326a);

    /* renamed from: g */
    private static final SimpleDateFormat f84332g = new SimpleDateFormat("h:mm aa", f84326a);

    /* renamed from: h */
    private static final SimpleDateFormat f84333h = new SimpleDateFormat("MMM dd", f84326a);

    /* renamed from: i */
    private static final SimpleDateFormat f84334i = new SimpleDateFormat("MMM dd, yyyy", f84326a);

    static {
        Locale locale;
        if (C6399b.m19944t()) {
            locale = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale();
        } else {
            locale = Locale.getDefault();
        }
        f84326a = locale;
    }

    /* renamed from: a */
    public static int m104787a(long j) {
        long b = m104789b(j);
        if (b <= 0) {
            return 1;
        }
        if (b <= 1) {
            return 2;
        }
        if (b <= 6) {
            return 3;
        }
        if (b <= 29) {
            return 4;
        }
        return 5;
    }

    /* renamed from: b */
    private static long m104789b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 8);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j);
        instance2.set(11, 8);
        instance2.set(12, 0);
        instance2.set(13, 0);
        instance.set(14, 0);
        return (instance.getTimeInMillis() - instance2.getTimeInMillis()) / 86400000;
    }

    /* renamed from: a */
    public static String m104788a(Context context, long j) {
        Context context2 = context;
        long j2 = j;
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (C6399b.m19944t()) {
            if (timeInMillis < 60000) {
                return context2.getString(R.string.bx3);
            }
            if (timeInMillis < 3600000) {
                return context2.getString(R.string.e7r, new Object[]{Long.valueOf(timeInMillis / 60000)});
            } else if (timeInMillis < 86400000) {
                return context2.getString(R.string.e7p, new Object[]{Long.valueOf(timeInMillis / 3600000)});
            } else if (timeInMillis < 604800000) {
                return context2.getString(R.string.e7n, new Object[]{Long.valueOf(timeInMillis / 86400000)});
            } else {
                return context2.getString(R.string.e7u, new Object[]{Long.valueOf(timeInMillis / 604800000)});
            }
        } else if (timeInMillis < 60000) {
            return context2.getString(R.string.bx3);
        } else {
            if (timeInMillis < 3600000) {
                return context2.getString(R.string.c_7, new Object[]{Long.valueOf(timeInMillis / 60000)});
            }
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            long timeInMillis2 = instance.getTimeInMillis();
            if (j2 >= timeInMillis2) {
                return context2.getString(R.string.bf3, new Object[]{Long.valueOf(timeInMillis / 3600000)});
            }
            instance.add(6, -1);
            long timeInMillis3 = instance.getTimeInMillis();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j2);
            if (j2 >= timeInMillis3) {
                StringBuilder sb = new StringBuilder();
                sb.append(context2.getString(R.string.ftb));
                sb.append(f84331f.format(instance2.getTime()));
                return sb.toString();
            }
            instance.add(6, -2);
            if (j2 >= instance.getTimeInMillis()) {
                return context2.getString(R.string.anb, new Object[]{Long.valueOf(((timeInMillis2 - j2) / 86400000) + 1)});
            }
            Calendar instance3 = Calendar.getInstance();
            instance3.set(6, 0);
            instance3.set(11, 0);
            instance3.set(12, 0);
            instance3.set(13, 0);
            if (j2 >= instance3.getTimeInMillis()) {
                return f84329d.format(instance2.getTime());
            }
            return f84327b.format(instance2.getTime());
        }
    }
}
