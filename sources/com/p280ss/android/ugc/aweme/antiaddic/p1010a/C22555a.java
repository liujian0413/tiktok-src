package com.p280ss.android.ugc.aweme.antiaddic.p1010a;

import com.p280ss.android.ugc.aweme.app.C22903bl;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.a.a */
public abstract class C22555a {

    /* renamed from: b */
    protected static int f60100b = 12;

    /* renamed from: a */
    protected int f60101a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C22903bl<Long> mo59195a();

    public C22555a() {
        this(5);
    }

    public C22555a(int i) {
        this.f60101a = i;
    }

    /* renamed from: a */
    public final void mo59196a(long j) {
        mo59195a().mo59871a(Long.valueOf(j));
    }

    /* renamed from: b */
    public final boolean mo59197b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        if (i >= 0 && i < this.f60101a) {
            instance.add(5, -1);
        }
        instance.set(11, this.f60101a);
        instance.set(12, 0);
        instance.set(13, 0);
        long timeInMillis = instance.getTimeInMillis();
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(instance.getTime());
        if (((Long) mo59195a().mo59877d()).longValue() < timeInMillis) {
            return true;
        }
        return false;
    }
}
