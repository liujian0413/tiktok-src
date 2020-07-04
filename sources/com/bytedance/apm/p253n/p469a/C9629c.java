package com.bytedance.apm.p253n.p469a;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p240d.C6183a;
import com.bytedance.apm.p241f.p242a.C6191a;
import com.bytedance.apm.p241f.p243b.C9600e;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.util.C6292i;
import com.bytedance.frameworks.apm.trace.C10063e;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.n.a.c */
public final class C9629c {

    /* renamed from: e */
    public static final Long f26332e = Long.valueOf(200);

    /* renamed from: f */
    public static final Long f26333f = Long.valueOf(1000);

    /* renamed from: a */
    public final String f26334a;

    /* renamed from: b */
    public volatile boolean f26335b;

    /* renamed from: c */
    public C9634b f26336c;

    /* renamed from: d */
    public C9633a f26337d;

    /* renamed from: g */
    public long f26338g;

    /* renamed from: h */
    public long f26339h;

    /* renamed from: i */
    public int f26340i;

    /* renamed from: j */
    private FrameCallback f26341j;

    /* renamed from: k */
    private LinkedList<Integer> f26342k;

    /* renamed from: l */
    private WindowManager f26343l;

    /* renamed from: m */
    private final C6183a f26344m;

    /* renamed from: n */
    private final boolean f26345n;

    /* renamed from: com.bytedance.apm.n.a.c$a */
    class C9633a extends View {

        /* renamed from: a */
        public long f26350a = -1;

        /* renamed from: b */
        public int f26351b;

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            if (this.f26350a == -1) {
                this.f26350a = SystemClock.elapsedRealtime();
                this.f26351b = 0;
            } else {
                this.f26351b++;
            }
            if (C9629c.this.f26336c != null) {
                SystemClock.elapsedRealtime();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f26350a;
            if (elapsedRealtime > C9629c.f26332e.longValue()) {
                double d = (double) this.f26351b;
                double d2 = (double) elapsedRealtime;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                double longValue = (double) C9629c.f26333f.longValue();
                Double.isNaN(longValue);
                C9625b.m28483a().mo23976a(C9629c.this.f26334a, (float) (d3 * longValue));
                C9629c.this.mo23984c();
            }
        }

        public C9633a(Context context) {
            super(context);
        }
    }

    /* renamed from: com.bytedance.apm.n.a.c$b */
    public interface C9634b {
    }

    /* renamed from: e */
    private void m28491e() {
        synchronized (this) {
            this.f26342k.clear();
        }
        m28494h();
    }

    /* renamed from: d */
    private boolean m28490d() {
        if (ApmDelegate.getInstance().getServiceNameSwitch("fps") || ApmDelegate.getInstance().getMetricsTypeSwitch(this.f26334a)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo23983b() {
        if (VERSION.SDK_INT >= 16) {
            m28492f();
        }
    }

    /* renamed from: c */
    public final void mo23984c() {
        if (this.f26335b) {
            try {
                this.f26343l.removeView(this.f26337d);
                this.f26337d.f26350a = -1;
                this.f26337d.f26351b = 0;
            } catch (Exception unused) {
            }
            this.f26335b = false;
        }
    }

    /* renamed from: f */
    private void m28492f() {
        if (this.f26335b) {
            m28495i();
            if (this.f26341j != null) {
                Choreographer.getInstance().removeFrameCallback(this.f26341j);
            }
            C10063e.m29893a(false);
            C10063e.m29898d();
            m28496j();
            this.f26335b = false;
        }
    }

    /* renamed from: g */
    private void m28493g() {
        this.f26337d.f26350a = -1;
        LayoutParams layoutParams = new LayoutParams(-2, -2, 2005, 0, -3);
        layoutParams.gravity = 51;
        layoutParams.flags = 24;
        layoutParams.height = 1;
        layoutParams.width = 1;
        try {
            this.f26343l.removeView(this.f26337d);
        } catch (Exception unused) {
        }
        this.f26343l.addView(this.f26337d, layoutParams);
        this.f26337d.postDelayed(new Runnable() {
            public final void run() {
                if (C9629c.this.f26335b) {
                    C9629c.this.f26337d.invalidate();
                    C9629c.this.f26337d.postDelayed(this, 10);
                }
            }
        }, 10);
    }

    /* renamed from: h */
    private void m28494h() {
        this.f26338g = -1;
        this.f26339h = -1;
        this.f26340i = 0;
        this.f26341j = new FrameCallback() {
            public final void doFrame(long j) {
                if (C9629c.this.f26338g == -1) {
                    C9629c.this.f26338g = j;
                }
                C9629c.this.f26340i++;
                if (C9629c.this.f26335b) {
                    Choreographer.getInstance().postFrameCallback(this);
                }
                C9629c.this.mo23982a(C9629c.this.f26339h, j);
                C9629c.this.f26339h = j;
            }
        };
        C10063e.m29893a(true);
        try {
            Choreographer.getInstance().postFrameCallback(this.f26341j);
        } catch (Exception unused) {
            this.f26335b = false;
            this.f26338g = -1;
            this.f26339h = -1;
            this.f26340i = 0;
            this.f26341j = null;
            C10063e.m29893a(false);
        }
    }

    /* renamed from: i */
    private void m28495i() {
        long j = this.f26339h - this.f26338g;
        if (j > 0 && this.f26340i > 1) {
            C9625b.m28483a().mo23976a(this.f26334a, (float) ((((((long) (this.f26340i - 1)) * 1000) * 1000) * 1000) / j));
        }
    }

    /* renamed from: j */
    private void m28496j() {
        synchronized (this) {
            if (!this.f26342k.isEmpty()) {
                final LinkedList<Integer> linkedList = this.f26342k;
                this.f26342k = new LinkedList<>();
                C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                    public final void run() {
                        try {
                            if (!C6292i.m19525a(linkedList)) {
                                int[] iArr = new int[60];
                                int i = 0;
                                for (Integer num : linkedList) {
                                    int max = Math.max(Math.min(C9629c.m28489a(num.intValue()), 59), 0);
                                    iArr[max] = iArr[max] + 1;
                                    i += num.intValue() / 100;
                                }
                                JSONObject jSONObject = new JSONObject();
                                for (int i2 = 0; i2 <= 59; i2++) {
                                    if (iArr[i2] > 0) {
                                        jSONObject.put(String.valueOf(i2), iArr[i2]);
                                    }
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("scene", C9629c.this.f26334a);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("total_scroll_time", i);
                                C6191a b = C6191a.m19218b();
                                C9600e eVar = new C9600e("fps_drop", C9629c.this.f26334a, jSONObject, jSONObject2, jSONObject3);
                                b.mo14915a(eVar);
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo23981a() {
        if (!this.f26335b) {
            if (this.f26345n || m28490d()) {
                if (VERSION.SDK_INT < 16) {
                    m28493g();
                } else {
                    m28491e();
                }
                this.f26335b = true;
            }
        }
    }

    public C9629c(String str) {
        this(str, true);
    }

    /* renamed from: a */
    public static int m28489a(int i) {
        return ((i + 1665) / 1666) - 1;
    }

    private C9629c(String str, boolean z) {
        this.f26338g = -1;
        this.f26339h = -1;
        this.f26334a = str;
        this.f26345n = true;
        this.f26344m = ApmDelegate.getInstance().getApmInitConfig();
        this.f26342k = new LinkedList<>();
        if (VERSION.SDK_INT < 16) {
            this.f26343l = (WindowManager) C6174c.m19129a().getSystemService("window");
            this.f26337d = new C9633a(C6174c.m19129a());
        }
    }

    /* renamed from: a */
    public final void mo23982a(long j, long j2) {
        if (this.f26339h <= 0) {
            C9623a.m28481a(false, null, 0);
            return;
        }
        long j3 = j2 - j;
        long j4 = j3 / 1000000;
        if (j4 > 0) {
            if (j4 > this.f26344m.f18179f) {
                C9623a.m28481a(true, this.f26334a, j4);
            } else {
                C9623a.m28481a(false, null, 0);
            }
            synchronized (this) {
                if (this.f26342k.size() > 20000) {
                    this.f26342k.poll();
                }
                this.f26342k.add(Integer.valueOf(((int) j3) / VideoCacheTTnetProxyTimeoutExperiment.DEFAULT));
            }
        }
    }
}
