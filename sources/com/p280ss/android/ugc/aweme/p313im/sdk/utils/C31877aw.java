package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.utils.C42937ar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.aw */
public final class C31877aw {

    /* renamed from: a */
    private static final SimpleDateFormat f83344a = new SimpleDateFormat("MM-dd", Locale.US);

    /* renamed from: b */
    private static final SimpleDateFormat f83345b = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

    /* renamed from: c */
    private static final SimpleDateFormat f83346c = new SimpleDateFormat("HH:mm", Locale.US);

    /* renamed from: a */
    private static String m103573a(Date date) {
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
    public static String m103572a(Context context, long j) {
        if (j == 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f83344a.format(instance.getTime());
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 300000) {
            return context.getResources().getString(R.string.bmo);
        }
        if (C42937ar.m136295a(j)) {
            return f83346c.format(instance.getTime());
        }
        if (C42937ar.m136298c(j)) {
            return context.getResources().getString(R.string.bsq);
        }
        if (currentTimeMillis <= 259200000) {
            return m103573a(new Date(j));
        }
        return f83344a.format(instance.getTime());
    }

    /* renamed from: b */
    public static String m103574b(Context context, long j) {
        if (j == 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f83344a.format(instance.getTime());
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 300000) {
            return context.getResources().getString(R.string.bmo);
        }
        if (C42937ar.m136295a(j)) {
            return f83346c.format(instance.getTime());
        }
        if (C42937ar.m136298c(j)) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getResources().getString(R.string.bsq));
            sb.append(" ");
            sb.append(f83346c.format(instance.getTime()));
            return sb.toString();
        } else if (currentTimeMillis > 259200000) {
            return f83345b.format(instance.getTime());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m103573a(new Date(j)));
            sb2.append(" ");
            sb2.append(f83346c.format(instance.getTime()));
            return sb2.toString();
        }
    }
}
