package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.utils.ev */
public final class C43110ev {

    /* renamed from: a */
    private static Locale f111727a;

    /* renamed from: b */
    private static final SimpleDateFormat f111728b = new SimpleDateFormat("yyyy-MM-dd", f111727a);

    /* renamed from: c */
    private static final SimpleDateFormat f111729c = new SimpleDateFormat("yyyy年MM月dd日", f111727a);

    /* renamed from: d */
    private static final SimpleDateFormat f111730d = new SimpleDateFormat("MM-dd", f111727a);

    /* renamed from: e */
    private static final SimpleDateFormat f111731e = new SimpleDateFormat("MM月dd日", f111727a);

    /* renamed from: f */
    private static final SimpleDateFormat f111732f = new SimpleDateFormat("HH:mm", f111727a);

    /* renamed from: g */
    private static final SimpleDateFormat f111733g = new SimpleDateFormat("h:mm aa", f111727a);

    /* renamed from: h */
    private static final SimpleDateFormat f111734h;

    /* renamed from: i */
    private static final SimpleDateFormat f111735i;

    static {
        Locale locale;
        String str;
        String str2;
        if (C6399b.m19944t()) {
            locale = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale();
        } else {
            locale = Locale.getDefault();
        }
        f111727a = locale;
        if (C30538p.m99745a()) {
            str = "MM-dd";
        } else {
            str = "MM月dd日";
        }
        f111734h = new SimpleDateFormat(str, Locale.getDefault());
        if (C30538p.m99745a()) {
            str2 = "yyyy-MM-dd";
        } else {
            str2 = "yyyy年MM月dd日";
        }
        f111735i = new SimpleDateFormat(str2, Locale.getDefault());
    }

    /* renamed from: a */
    public static long m136731a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return simpleDateFormat.parse(str).getTime() / 1000;
        } catch (ParseException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m136732a(Context context, long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f111734h.format(instance.getTime());
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 60000) {
            return context.getString(R.string.bx3);
        }
        if (currentTimeMillis <= 3600000) {
            return context.getString(R.string.c_7, new Object[]{Long.valueOf(currentTimeMillis / 60000)});
        } else if (currentTimeMillis <= 86400000) {
            return context.getString(R.string.bf3, new Object[]{Long.valueOf(currentTimeMillis / 3600000)});
        } else if (currentTimeMillis > 259200000) {
            return f111735i.format(instance.getTime());
        } else {
            return context.getString(R.string.anb, new Object[]{Long.valueOf(currentTimeMillis / 86400000)});
        }
    }

    /* renamed from: b */
    public static String m136733b(Context context, long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f111728b.format(instance.getTime());
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 60000) {
            return context.getString(R.string.bx3);
        }
        if (currentTimeMillis <= 3600000) {
            return context.getString(R.string.c_7, new Object[]{Long.valueOf(currentTimeMillis / 60000)});
        } else if (currentTimeMillis <= 86400000) {
            return context.getString(R.string.bf3, new Object[]{Long.valueOf(currentTimeMillis / 3600000)});
        } else if (currentTimeMillis > 259200000) {
            return f111730d.format(instance.getTime());
        } else {
            return context.getString(R.string.anb, new Object[]{Long.valueOf(currentTimeMillis / 86400000)});
        }
    }

    /* renamed from: d */
    public static String m136735d(Context context, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 == 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.e7t, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.e7s, new Object[]{Long.valueOf(timeInMillis / 60000)});
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.e7q, new Object[]{Long.valueOf(timeInMillis / 3600000)});
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.e7o, new Object[]{Long.valueOf(timeInMillis / 86400000)});
        } else {
            long j3 = timeInMillis - 604800000;
            if (j3 <= 0 || j3 > 86400000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j >= instance2.getTimeInMillis() + 86400000) {
                    if (C6399b.m19944t()) {
                        return f111730d.format(instance.getTime());
                    }
                    return f111731e.format(instance.getTime());
                } else if (C6399b.m19944t()) {
                    return f111728b.format(instance.getTime());
                } else {
                    return f111729c.format(instance.getTime());
                }
            } else {
                return context.getString(R.string.e7v, new Object[]{Integer.valueOf(1)});
            }
        }
    }

    /* renamed from: c */
    public static String m136734c(Context context, long j) {
        Context context2 = context;
        long j2 = j;
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (C6399b.m19944t()) {
            if (timeInMillis < 60000) {
                long j3 = timeInMillis / 1000;
                Object[] objArr = new Object[1];
                if (j3 <= 0) {
                    j3 = 1;
                }
                objArr[0] = Long.valueOf(j3);
                return context2.getString(R.string.dgd, objArr);
            } else if (timeInMillis < 3600000) {
                return context2.getString(R.string.e7r, new Object[]{Long.valueOf(timeInMillis / 60000)});
            } else if (timeInMillis < 86400000) {
                return context2.getString(R.string.e7p, new Object[]{Long.valueOf(timeInMillis / 3600000)});
            } else if (timeInMillis < 604800000) {
                return context2.getString(R.string.e7n, new Object[]{Long.valueOf(timeInMillis / 86400000)});
            } else {
                long j4 = timeInMillis - 604800000;
                if (j4 <= 0 || j4 > 86400000) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(j2);
                    Calendar instance2 = Calendar.getInstance();
                    instance2.set(6, 0);
                    instance2.set(11, 0);
                    instance2.set(12, 0);
                    instance2.set(13, 0);
                    if (j2 >= instance2.getTimeInMillis() + 86400000) {
                        return f111730d.format(instance.getTime());
                    }
                    return f111728b.format(instance.getTime());
                }
                return context2.getString(R.string.e7u, new Object[]{Integer.valueOf(1)});
            }
        } else if (timeInMillis < 60000) {
            return context2.getString(R.string.bx3);
        } else {
            if (timeInMillis < 3600000) {
                return context2.getString(R.string.c_7, new Object[]{Long.valueOf(timeInMillis / 60000)});
            }
            Calendar instance3 = Calendar.getInstance();
            instance3.set(11, 0);
            instance3.set(12, 0);
            instance3.set(13, 0);
            long timeInMillis2 = instance3.getTimeInMillis();
            if (j2 >= timeInMillis2) {
                return context2.getString(R.string.bf3, new Object[]{Long.valueOf(timeInMillis / 3600000)});
            }
            instance3.add(6, -1);
            long timeInMillis3 = instance3.getTimeInMillis();
            Calendar instance4 = Calendar.getInstance();
            instance4.setTimeInMillis(j2);
            if (j2 >= timeInMillis3) {
                StringBuilder sb = new StringBuilder();
                sb.append(context2.getString(R.string.ftb));
                sb.append(f111732f.format(instance4.getTime()));
                return sb.toString();
            }
            instance3.add(6, -2);
            if (j2 >= instance3.getTimeInMillis()) {
                return context2.getString(R.string.anb, new Object[]{Long.valueOf(((timeInMillis2 - j2) / 86400000) + 1)});
            }
            Calendar instance5 = Calendar.getInstance();
            instance5.set(6, 0);
            instance5.set(11, 0);
            instance5.set(12, 0);
            instance5.set(13, 0);
            if (j2 >= instance5.getTimeInMillis()) {
                return f111730d.format(instance4.getTime());
            }
            return f111728b.format(instance4.getTime());
        }
    }
}
