package com.p280ss.android.ugc.aweme.antiaddic.p1010a;

import com.p280ss.android.ugc.aweme.antiaddic.C22562c;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.a.c */
public final class C22557c {

    /* renamed from: a */
    public int f60104a;

    /* renamed from: b */
    private String f60105b;

    /* renamed from: c */
    private int f60106c;

    /* renamed from: d */
    private int f60107d;

    /* renamed from: b */
    public final void mo59201b() {
        this.f60104a = 0;
    }

    public C22557c() {
        this("05:00");
    }

    /* renamed from: a */
    public static long m74563a() {
        return C22562c.m74570a().mo59206d();
    }

    /* renamed from: c */
    private static C22903bl<Long> m74564c() {
        return SharePrefCache.inst().getLastHintToastTime();
    }

    /* renamed from: a */
    public final void mo59200a(long j) {
        m74564c().mo59871a(Long.valueOf(System.currentTimeMillis()));
        this.f60104a++;
    }

    private C22557c(String str) {
        this.f60105b = str;
        try {
            String[] split = this.f60105b.split(":");
            this.f60106c = Integer.parseInt(split[0]);
            this.f60107d = Integer.parseInt(split[1]);
        } catch (Exception unused) {
            this.f60106c = 5;
            this.f60107d = 0;
        }
        this.f60104a = 0;
    }

    /* renamed from: b */
    public final boolean mo59202b(long j) {
        long a = m74563a();
        if (a < 0) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(11, this.f60106c);
        instance.set(12, this.f60107d);
        instance.set(13, 0);
        long timeInMillis = instance.getTimeInMillis();
        long longValue = ((Long) m74564c().mo59877d()).longValue();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(longValue);
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(instance2.getTime());
        if (longValue >= timeInMillis || j < timeInMillis) {
            timeInMillis = longValue;
        } else {
            m74564c().mo59871a(Long.valueOf(timeInMillis));
            this.f60104a = 0;
        }
        if (j - timeInMillis > a) {
            return true;
        }
        return false;
    }
}
