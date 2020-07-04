package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.measurement.cb */
public final class C16436cb {

    /* renamed from: b */
    private static final Method f46011b = m53565a();

    /* renamed from: c */
    private static final Method f46012c = m53566b();

    /* renamed from: d */
    private static volatile C16438cd f46013d = C16437cc.f46015a;

    /* renamed from: a */
    private final JobScheduler f46014a;

    /* renamed from: a */
    private static Method m53565a() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Method m53566b() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m53567c() {
        if (f46012c != null) {
            try {
                return ((Integer) f46012c.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return 0;
    }

    private C16436cb(JobScheduler jobScheduler) {
        this.f46014a = jobScheduler;
    }

    /* renamed from: a */
    private final int m53563a(JobInfo jobInfo, String str, int i, String str2) {
        if (f46011b != null) {
            try {
                return ((Integer) f46011b.invoke(this.f46014a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return this.f46014a.schedule(jobInfo);
    }

    /* renamed from: a */
    public static int m53564a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f46011b == null || !f46013d.mo42575a() || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new C16436cb(jobScheduler).m53563a(jobInfo, str, m53567c(), str2);
    }
}
