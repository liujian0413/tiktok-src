package com.bytedance.apm.p253n;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p253n.p470b.C9635a;
import com.bytedance.services.apm.api.C6478c;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.apm.n.c */
public final class C6285c implements C6478c {

    /* renamed from: a */
    public long f18516a = -1;

    /* renamed from: b */
    public String f18517b;

    /* renamed from: c */
    public OnGlobalLayoutListener f18518c;

    /* renamed from: d */
    public Runnable f18519d;

    /* renamed from: e */
    public Handler f18520e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public long f18521f;

    /* renamed from: g */
    private boolean f18522g;

    /* renamed from: a */
    public final void mo14861a(Activity activity) {
    }

    /* renamed from: b */
    public final void mo14864b(Activity activity) {
    }

    /* renamed from: a */
    public final void mo15078a() {
        this.f18521f = ApmDelegate.getInstance().getApmInitConfig().f18176c;
        this.f18522g = ApmDelegate.getInstance().getApmInitConfig().f18175b;
        ActivityLifeObserver.getInstance().register(this);
    }

    /* renamed from: c */
    public final void mo14870c(Activity activity) {
        if (VERSION.SDK_INT >= 16 && this.f18522g) {
            try {
                m19503e(activity);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public final void mo14871d(Activity activity) {
        this.f18516a = 0;
        try {
            if (this.f18518c != null) {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f18518c);
                this.f18518c = null;
            }
            if (this.f18519d != null) {
                this.f18520e.removeCallbacks(this.f18519d);
                this.f18519d = null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private void m19503e(Activity activity) {
        this.f18516a = System.currentTimeMillis();
        this.f18517b = activity.getClass().getCanonicalName();
        final Integer a = C9635a.m28501a(this.f18517b);
        if (a != null) {
            final WeakReference weakReference = new WeakReference(activity.getWindow().getDecorView());
            this.f18518c = new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    if (weakReference.get() != null) {
                        View findViewById = ((View) weakReference.get()).findViewById(a.intValue());
                        if (findViewById != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                            ViewTreeObserver viewTreeObserver = ((View) weakReference.get()).getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && C6285c.this.f18518c != null) {
                                viewTreeObserver.removeOnGlobalLayoutListener(C6285c.this.f18518c);
                            }
                            if (C6285c.this.f18519d != null) {
                                C6285c.this.f18520e.removeCallbacks(C6285c.this.f18519d);
                                C6285c.this.f18519d = null;
                            }
                            C6285c.this.f18518c = null;
                            if (C6285c.this.f18516a > 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long j = currentTimeMillis - C6285c.this.f18516a;
                                C6285c.this.f18516a = 0;
                                if (j < C6285c.this.f18521f && j > 0) {
                                    AutoPageTraceHelper.reportViewIdStats(currentTimeMillis, C6285c.this.f18517b);
                                    MonitorTool.reportTraceTime(C6285c.this.f18517b, "activityOnCreateToViewShow", j);
                                }
                            }
                        }
                    }
                }
            };
            ((View) weakReference.get()).getViewTreeObserver().addOnGlobalLayoutListener(this.f18518c);
            this.f18519d = new Runnable() {
                public final void run() {
                    if (C6285c.this.f18518c != null && weakReference.get() != null) {
                        ((View) weakReference.get()).getViewTreeObserver().removeOnGlobalLayoutListener(C6285c.this.f18518c);
                    }
                }
            };
            this.f18520e.postDelayed(this.f18519d, this.f18521f);
        }
    }
}
