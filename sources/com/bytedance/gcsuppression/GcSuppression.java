package com.bytedance.gcsuppression;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Trace;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class GcSuppression {

    /* renamed from: b */
    private static volatile GcSuppression f27903b;

    /* renamed from: a */
    public long f27904a = 60;

    /* renamed from: c */
    private Context f27905c;

    /* renamed from: d */
    private AtomicInteger f27906d = new AtomicInteger(0);

    /* renamed from: e */
    private AtomicBoolean f27907e = new AtomicBoolean(false);

    /* renamed from: f */
    private boolean f27908f = true;

    /* renamed from: g */
    private long f27909g = 0;

    /* renamed from: h */
    private long f27910h = 0;

    /* renamed from: i */
    private ScheduledExecutorService f27911i;

    /* renamed from: j */
    private ExecutorService f27912j;

    /* renamed from: k */
    private ScheduledFuture f27913k;

    /* renamed from: l */
    private C10277a f27914l;

    /* renamed from: m */
    private Runnable f27915m = new Runnable() {
        public final void run() {
            GcSuppression.this.mo24995c();
        }
    };

    /* renamed from: com.bytedance.gcsuppression.GcSuppression$a */
    public interface C10277a {
        /* renamed from: a */
        void mo24999a(int i, boolean z, boolean z2);
    }

    /* renamed from: a */
    private static boolean m30430a(int i) {
        return i > 0;
    }

    private native int startGcSuppression();

    private native int stopGcSuppression();

    /* renamed from: a */
    public static GcSuppression m30429a() {
        if (f27903b == null) {
            synchronized (GcSuppression.class) {
                if (f27903b == null) {
                    f27903b = new GcSuppression();
                }
            }
        }
        return f27903b;
    }

    /* renamed from: d */
    public final void mo24996d() {
        if (this.f27906d.get() == 2) {
            this.f27912j.execute(new Runnable() {
                public final void run() {
                    GcSuppression.this.mo24995c();
                }
            });
        }
    }

    private GcSuppression() {
    }

    /* renamed from: f */
    private void m30433f() {
        Editor edit = C7285c.m22838a(this.f27905c, "gcsuppress", 0).edit();
        edit.putInt("vc", 1028);
        edit.putInt("state", this.f27906d.get());
        edit.commit();
    }

    /* renamed from: e */
    private void m30432e() {
        SharedPreferences a = C7285c.m22838a(this.f27905c, "gcsuppress", 0);
        if (1028 > a.getInt("vc", 0)) {
            this.f27906d.compareAndSet(0, 1);
            Editor edit = a.edit();
            edit.putInt("vc", 1028);
            edit.putInt("state", this.f27906d.get());
            edit.putBoolean("hfs", false);
            edit.commit();
            return;
        }
        this.f27906d.compareAndSet(0, a.getInt("state", 3));
        this.f27907e.compareAndSet(false, a.getBoolean("hfs", false));
    }

    /* renamed from: b */
    public final int mo24994b() {
        if (this.f27908f) {
            this.f27909g = System.currentTimeMillis();
            if (VERSION.SDK_INT >= 18) {
                Trace.beginSection("GcSuppressionStart");
            }
        }
        int i = -1;
        if (this.f27906d.get() == 1) {
            this.f27906d.compareAndSet(1, 2);
            i = startGcSuppression();
            if (m30430a(i)) {
                this.f27906d.compareAndSet(2, 3);
                m30433f();
            } else {
                this.f27913k = this.f27911i.schedule(this.f27915m, this.f27904a, TimeUnit.SECONDS);
            }
            if (this.f27914l != null) {
                this.f27914l.mo24999a(i, false, m30430a(i));
            }
        }
        if (this.f27908f && VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
        return i;
    }

    /* renamed from: c */
    public final int mo24995c() {
        if (this.f27908f) {
            this.f27910h = System.currentTimeMillis();
            if (VERSION.SDK_INT >= 18) {
                Trace.beginSection("GcSuppressionStop");
            }
        }
        int i = -1;
        if (this.f27906d.get() == 2) {
            if (this.f27913k != null) {
                this.f27913k.cancel(false);
                this.f27913k = null;
            }
            i = stopGcSuppression();
            if (m30430a(i)) {
                this.f27906d.compareAndSet(2, 3);
                m30433f();
            } else {
                this.f27906d.compareAndSet(2, 1);
            }
            if (this.f27914l != null) {
                this.f27914l.mo24999a(i, m30431b(i), m30430a(i));
            }
        }
        if (this.f27908f && VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
        return i;
    }

    /* renamed from: b */
    private boolean m30431b(int i) {
        if (i == -1 || this.f27907e.get()) {
            return false;
        }
        this.f27907e.set(true);
        Editor edit = C7285c.m22838a(this.f27905c, "gcsuppress", 0).edit();
        edit.putBoolean("hfs", true);
        edit.commit();
        return true;
    }

    /* renamed from: a */
    public final void mo24993a(Context context, boolean z, long j, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, C10277a aVar) {
        if (VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19 && context != null && this.f27906d.get() == 0) {
            try {
                C10278a.m30440a("gcsuppression");
                this.f27905c = context;
                this.f27908f = false;
                this.f27904a = 90;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = C10278a.m30439a();
                }
                this.f27911i = scheduledExecutorService;
                if (executorService == null) {
                    executorService = C10278a.m30441b();
                }
                this.f27912j = executorService;
                this.f27914l = aVar;
                m30432e();
            } catch (UnsatisfiedLinkError unused) {
            }
        }
    }
}
