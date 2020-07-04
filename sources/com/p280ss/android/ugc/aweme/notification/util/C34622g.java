package com.p280ss.android.ugc.aweme.notification.util;

import android.content.Context;
import android.text.format.DateFormat;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.utils.C42937ar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.notification.util.g */
public final class C34622g {

    /* renamed from: a */
    private static final SimpleDateFormat f90373a = new SimpleDateFormat("MM-dd", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale());

    /* renamed from: b */
    private static final SimpleDateFormat f90374b = new SimpleDateFormat("yyyy-MM-dd HH:mm", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale());

    /* renamed from: c */
    private static final SimpleDateFormat f90375c = new SimpleDateFormat("yyyy-MM-dd h:mm aa", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale());

    /* renamed from: d */
    private static final SimpleDateFormat f90376d = new SimpleDateFormat("HH:mm", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale());

    /* renamed from: e */
    private static final SimpleDateFormat f90377e = new SimpleDateFormat("h:mm aa", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale());

    /* renamed from: a */
    private static String m111874a(Date date) {
        String[] stringArray = C6399b.m19921a().getResources().getStringArray(R.array.x);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(7) - 1;
        if (i < 0) {
            i = 0;
        }
        return stringArray[i];
    }

    /* renamed from: a */
    public static String m111873a(Context context, long j) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2;
        if (j == 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (C6399b.m19947w()) {
            boolean is24HourFormat = DateFormat.is24HourFormat(context);
            if (is24HourFormat) {
                simpleDateFormat = f90376d;
            } else {
                simpleDateFormat = f90377e;
            }
            if (is24HourFormat) {
                simpleDateFormat2 = f90374b;
            } else {
                simpleDateFormat2 = f90375c;
            }
            if (instance.get(1) < Calendar.getInstance().get(1)) {
                return simpleDateFormat2.format(instance.getTime());
            }
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (currentTimeMillis <= 300000) {
                return context.getResources().getString(R.string.bx3);
            }
            if (C42937ar.m136295a(j)) {
                return simpleDateFormat.format(instance.getTime());
            }
            if (C42937ar.m136298c(j)) {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getResources().getString(R.string.ftb));
                sb.append(" ");
                sb.append(simpleDateFormat.format(instance.getTime()));
                return sb.toString();
            } else if (currentTimeMillis > 259200000) {
                return simpleDateFormat2.format(instance.getTime());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m111874a(new Date(j)));
                sb2.append(" ");
                sb2.append(simpleDateFormat.format(instance.getTime()));
                return sb2.toString();
            }
        } else if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f90373a.format(instance.getTime());
        } else {
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            if (currentTimeMillis2 <= 300000) {
                return context.getResources().getString(R.string.bx3);
            }
            if (C42937ar.m136295a(j)) {
                return f90376d.format(instance.getTime());
            }
            if (C42937ar.m136298c(j)) {
                return context.getResources().getString(R.string.ftb);
            }
            if (currentTimeMillis2 <= 259200000) {
                return m111874a(new Date(j));
            }
            return f90373a.format(instance.getTime());
        }
    }
}
