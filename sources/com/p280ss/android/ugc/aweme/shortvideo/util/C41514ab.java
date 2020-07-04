package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ab */
public final class C41514ab implements Callback {

    /* renamed from: f */
    private static C41514ab f107962f = new C41514ab();

    /* renamed from: a */
    public TextView f107963a;

    /* renamed from: b */
    public volatile long f107964b;

    /* renamed from: c */
    public volatile long f107965c;

    /* renamed from: d */
    public volatile long f107966d;

    /* renamed from: e */
    public volatile long f107967e;

    /* renamed from: g */
    private Context f107968g;

    /* renamed from: h */
    private Handler f107969h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private Handler f107970i;

    /* renamed from: j */
    private ViewGroup f107971j;

    /* renamed from: k */
    private volatile long f107972k = 2500;

    /* renamed from: l */
    private int f107973l = 0;

    /* renamed from: m */
    private volatile boolean f107974m = false;

    /* renamed from: a */
    public static C41514ab m132244a() {
        return f107962f;
    }

    /* renamed from: e */
    private static long m132247e() {
        try {
            return Runtime.getRuntime().maxMemory();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo102174b() {
        this.f107968g = null;
        this.f107963a = null;
        this.f107970i.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo102175c() {
        if (this.f107963a != null && this.f107971j != null && this.f107974m) {
            this.f107971j.removeView(this.f107963a);
            this.f107963a = null;
            this.f107971j = null;
        }
    }

    private C41514ab() {
        if (!C7163a.m22363a() || !C35563c.f93230L.mo93342a(Property.SHOW_MEMORY_INFO)) {
            this.f107972k = 2500;
            this.f107974m = false;
        } else {
            this.f107972k = 800;
            this.f107974m = true;
        }
        this.f107970i = new Handler(C41552f.m132326a(), this);
    }

    /* renamed from: d */
    private void m132246d() {
        C38510bb a = C38510bb.m123095a();
        a.mo96480a("dalvikPss", Long.valueOf(this.f107964b));
        a.mo96480a("nativePss", Long.valueOf(this.f107965c));
        a.mo96480a("otherPss", Long.valueOf(this.f107967e));
        a.mo96480a("totalPss", Long.valueOf(this.f107966d));
        C6893q.m21447a("av_video_memory", a.mo96482b());
    }

    /* renamed from: a */
    public final void mo102173a(Context context) {
        if (context != null) {
            this.f107968g = context;
            this.f107970i.sendEmptyMessage(0);
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            try {
                if (Thread.currentThread().isInterrupted()) {
                    if (this.f107973l > 3) {
                        m132246d();
                    }
                    this.f107973l = 0;
                    return false;
                }
                m132245b(this.f107968g);
                this.f107973l++;
                this.f107970i.sendEmptyMessageDelayed(0, this.f107972k);
            } catch (Exception unused) {
                if (this.f107973l > 3) {
                    m132246d();
                }
                this.f107973l = 0;
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m132245b(Context context) {
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    final MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
                    this.f107964b = (long) processMemoryInfo[0].dalvikPss;
                    this.f107965c = (long) processMemoryInfo[0].nativePss;
                    this.f107967e = (long) processMemoryInfo[0].otherPss;
                    this.f107966d = (long) processMemoryInfo[0].getTotalPss();
                    StringBuilder sb = new StringBuilder("dalvikPss=");
                    sb.append(processMemoryInfo[0].dalvikPss / 1000);
                    sb.append(" nativePss=");
                    sb.append(processMemoryInfo[0].nativePss / 1000);
                    sb.append(" otherPss=");
                    sb.append(processMemoryInfo[0].otherPss / 1000);
                    sb.append(" totalPss=");
                    sb.append(processMemoryInfo[0].getTotalPss() / 1000);
                    sb.append(" MaxMemory=");
                    sb.append(m132247e() / 1000000);
                    C41530am.m132285d(sb.toString());
                    if (this.f107974m) {
                        this.f107969h.post(new Runnable() {
                            public final void run() {
                                if (C41514ab.this.f107963a != null) {
                                    TextView textView = C41514ab.this.f107963a;
                                    StringBuilder sb = new StringBuilder("dalvikPss:");
                                    sb.append(processMemoryInfo[0].dalvikPss / 1000);
                                    sb.append("\nnativePss:");
                                    sb.append(processMemoryInfo[0].nativePss / 1000);
                                    sb.append("\notherPss:");
                                    sb.append(processMemoryInfo[0].otherPss / 1000);
                                    sb.append("\ntotalPss:");
                                    sb.append(processMemoryInfo[0].getTotalPss() / 1000);
                                    textView.setText(sb.toString());
                                }
                            }
                        });
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo102172a(Activity activity, ViewGroup viewGroup) {
        if (activity != null && !activity.isFinishing() && viewGroup != null && this.f107974m) {
            this.f107971j = viewGroup;
            this.f107963a = new TextView(activity);
            this.f107963a.setLayoutParams(new LayoutParams(-2, -2));
            this.f107963a.setClickable(false);
            this.f107963a.setTextSize(15.0f);
            if (C6399b.m19946v() || ((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
                this.f107963a.setTextColor(Color.parseColor("#ff000000"));
            } else {
                this.f107963a.setTextColor(Color.parseColor("#ffffffff"));
            }
            viewGroup.addView(this.f107963a);
        }
    }
}
