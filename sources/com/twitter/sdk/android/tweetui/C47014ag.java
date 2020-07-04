package com.twitter.sdk.android.tweetui;

import android.content.res.Resources;
import android.support.p022v4.util.C0905l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.twitter.sdk.android.tweetui.ag */
final class C47014ag {

    /* renamed from: a */
    static final SimpleDateFormat f120646a = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);

    /* renamed from: b */
    static final C47015a f120647b = new C47015a();

    /* renamed from: com.twitter.sdk.android.tweetui.ag$a */
    static class C47015a {

        /* renamed from: a */
        private final C0905l<SimpleDateFormat> f120648a = new C0905l<>();

        /* renamed from: b */
        private Locale f120649b;

        C47015a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized String mo118219a(Resources resources, Date date) {
            return m146993a(resources, (int) R.string.fgv).format(date);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final synchronized String mo118220b(Resources resources, Date date) {
            return m146993a(resources, (int) R.string.fgw).format(date);
        }

        /* renamed from: a */
        private synchronized DateFormat m146993a(Resources resources, int i) {
            SimpleDateFormat simpleDateFormat;
            if (this.f120649b == null || this.f120649b != resources.getConfiguration().locale) {
                this.f120649b = resources.getConfiguration().locale;
                this.f120648a.mo3438c();
            }
            simpleDateFormat = (SimpleDateFormat) this.f120648a.mo3433a(i);
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat(resources.getString(i), Locale.getDefault());
                this.f120648a.mo3437b(i, simpleDateFormat);
            }
            return simpleDateFormat;
        }
    }

    /* renamed from: b */
    static boolean m146991b(String str) {
        if (m146989a(str) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static String m146992c(String str) {
        StringBuilder sb = new StringBuilder("• ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    static long m146989a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return f120646a.parse(str).getTime();
        } catch (ParseException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    static String m146990a(Resources resources, long j, long j2) {
        long j3 = j - j2;
        if (j3 < 0) {
            return f120647b.mo118219a(resources, new Date(j2));
        }
        if (j3 < 60000) {
            int i = (int) (j3 / 1000);
            return resources.getQuantityString(R.plurals.ac, i, new Object[]{Integer.valueOf(i)});
        } else if (j3 < 3600000) {
            int i2 = (int) (j3 / 60000);
            return resources.getQuantityString(R.plurals.ab, i2, new Object[]{Integer.valueOf(i2)});
        } else if (j3 < 86400000) {
            int i3 = (int) (j3 / 3600000);
            return resources.getQuantityString(R.plurals.aa, i3, new Object[]{Integer.valueOf(i3)});
        } else {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j2);
            Date date = new Date(j2);
            if (instance.get(1) == instance2.get(1)) {
                return f120647b.mo118220b(resources, date);
            }
            return f120647b.mo118219a(resources, date);
        }
    }
}
