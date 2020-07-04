package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.os.Handler;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bk */
public class C25272bk {

    /* renamed from: f */
    private static volatile C25272bk f66622f;

    /* renamed from: a */
    public Handler f66623a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public Aweme f66624b;

    /* renamed from: c */
    public int f66625c;

    /* renamed from: d */
    public int f66626d;

    /* renamed from: e */
    public Runnable f66627e;

    /* renamed from: g */
    private int f66628g;

    /* renamed from: h */
    private Runnable f66629h;

    private C25272bk() {
    }

    /* renamed from: b */
    public final void mo65888b() {
        this.f66627e = null;
        this.f66624b = null;
        this.f66623a.removeCallbacks(this.f66629h);
    }

    /* renamed from: a */
    public static C25272bk m83055a() {
        if (f66622f == null) {
            synchronized (C25272bk.class) {
                if (f66622f == null) {
                    f66622f = new C25272bk();
                }
            }
        }
        return f66622f;
    }

    /* renamed from: c */
    private void m83057c() {
        if (this.f66625c == this.f66628g) {
            this.f66629h = new Runnable() {

                /* renamed from: a */
                final Aweme f66630a = C25272bk.this.f66624b;

                /* renamed from: b */
                long f66631b;

                public final void run() {
                    long j;
                    if (this.f66630a == C25272bk.this.f66624b) {
                        if (C43316v.m137250H()) {
                            j = C44933a.m141791a().mo107444d();
                        } else {
                            j = C43316v.m137450K().mo104915n();
                        }
                        if (j < 0) {
                            j = 0;
                        }
                        if (j >= ((long) C25272bk.this.f66626d) || (j < this.f66631b && C25272bk.this.f66625c > 0)) {
                            C25272bk.m83056a(C25272bk.this.f66627e);
                            C25272bk.this.f66627e = null;
                            return;
                        }
                        this.f66631b = j;
                        C25272bk.this.f66623a.postDelayed(this, 1000);
                    }
                }
            };
            this.f66623a.post(this.f66629h);
        }
    }

    /* renamed from: a */
    public static void m83056a(Runnable runnable) {
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo65886a(int i) {
        this.f66625c = i;
        m83057c();
    }

    /* renamed from: a */
    private static long m83054a(Aweme aweme) {
        long j;
        if (C43316v.m137250H()) {
            j = C44933a.m141791a().mo71674af();
        } else {
            j = C43316v.m137450K().mo104910i();
        }
        if (j > 0) {
            return j;
        }
        if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getDuration() <= 0) {
            return 1;
        }
        return (long) aweme.getVideo().getDuration();
    }

    /* renamed from: a */
    public final void mo65887a(int i, Runnable runnable) {
        if (this.f66624b != null) {
            long a = m83054a(this.f66624b);
            long j = (long) i;
            this.f66628g = (int) (j / a);
            this.f66626d = (int) (j % a);
            this.f66627e = runnable;
            mo65886a(0);
        }
    }
}
