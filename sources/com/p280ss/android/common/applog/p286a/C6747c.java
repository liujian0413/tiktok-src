package com.p280ss.android.common.applog.p286a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.p280ss.android.common.applog.TeaThread;
import com.p280ss.android.common.applog.TeaUtils;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.common.applog.a.c */
public class C6747c {

    /* renamed from: k */
    private static volatile C6747c f19230k;

    /* renamed from: n */
    private static volatile C19269a f19231n;

    /* renamed from: a */
    public boolean f19232a;

    /* renamed from: b */
    public boolean f19233b;

    /* renamed from: c */
    public boolean f19234c = true;

    /* renamed from: d */
    public long f19235d = TeaUtils.now();

    /* renamed from: e */
    public C19272d f19236e;

    /* renamed from: f */
    public C19270b f19237f;

    /* renamed from: g */
    public final List<C19272d> f19238g = new ArrayList();

    /* renamed from: h */
    public boolean f19239h = false;

    /* renamed from: i */
    public final Runnable f19240i = new Runnable() {
        public final void run() {
            boolean z;
            StringBuilder sb = new StringBuilder("closeCurrentSession currentSession is null : ");
            if (C6747c.this.f19236e == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            if (C6747c.this.f19236e != null) {
                if (C6747c.this.f19239h) {
                    C6747c.this.f19237f.mo51147a(C6747c.this.f19236e);
                } else {
                    C6747c.this.f19238g.add(C6747c.this.f19236e);
                }
                C6747c.this.f19236e = null;
                C6747c.this.f19237f.mo51148b();
            }
        }
    };

    /* renamed from: j */
    public final Runnable f19241j = new Runnable() {
        public final void run() {
            C6747c.this.f19239h = true;
            for (C19272d a : new ArrayList(C6747c.this.f19238g)) {
                C6747c.this.f19237f.mo51147a(a);
            }
            C6747c.this.f19238g.clear();
        }
    };

    /* renamed from: l */
    private Handler f19242l;

    /* renamed from: m */
    private Context f19243m;

    /* renamed from: f */
    private Handler m20892f() {
        return new Handler(TeaThread.getInst().getLooper()) {
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                boolean z = true;
                if (message.what == 1) {
                    if (C6747c.this.f19236e != null) {
                        Object obj = message.obj;
                        if (obj instanceof String) {
                            String str = (String) obj;
                            boolean equals = TeaUtils.equals(str, C6747c.this.f19236e.f52162b);
                            if (!C6747c.this.f19234c || !C6747c.this.f19233b) {
                                z = false;
                            }
                            if (equals && z) {
                                C6747c.this.f19236e.f52167g = System.currentTimeMillis();
                                C6747c.this.f19237f.mo51149b(C6747c.this.f19236e);
                                C6747c.this.mo16509a(str);
                                C6747c.this.mo16507a();
                                return;
                            }
                        }
                    }
                    C6747c.this.f19237f.mo51148b();
                    C6747c.this.mo16507a();
                }
            }
        };
    }

    /* renamed from: c */
    public final void mo16512c() {
        this.f19232a = false;
        this.f19238g.clear();
        this.f19239h = false;
    }

    /* renamed from: d */
    public final void mo16513d() {
        m20893g().removeMessages(1);
    }

    /* renamed from: g */
    private Handler m20893g() {
        if (this.f19242l == null) {
            synchronized (this) {
                if (this.f19242l == null) {
                    this.f19242l = m20892f();
                }
            }
        }
        return this.f19242l;
    }

    /* renamed from: b */
    public final void mo16510b() {
        final long now = TeaUtils.now();
        TeaThread.getInst().ensureTeaThread(new Runnable() {
            public final void run() {
                if (C6747c.this.f19233b) {
                    C6747c.this.f19233b = false;
                    if (C6747c.this.f19234c && C6747c.this.f19236e != null) {
                        C6747c.this.f19236e.f52167g = now;
                        TeaThread.getInst().repost(C6747c.this.f19240i, C40413c.f105051b);
                        C6747c.this.f19237f.mo51149b(C6747c.this.f19236e);
                        C6747c.this.mo16513d();
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo16514e() {
        final long now = TeaUtils.now();
        TeaThread.getInst().ensureTeaThread(new Runnable() {
            public final void run() {
                if (!C6747c.this.f19233b) {
                    C6747c.this.f19233b = true;
                    if (C6747c.this.f19234c) {
                        C6747c.this.f19232a = true;
                        if (C6747c.this.f19236e == null) {
                            C6747c.this.f19236e = new C19272d(now);
                            C6747c.this.f19237f.mo51148b();
                            C6747c.this.mo16509a(C6747c.this.f19236e.f52162b);
                            return;
                        }
                        long j = now - C6747c.this.f19236e.f52167g;
                        if (j <= C40413c.f105051b) {
                            StringBuilder sb = new StringBuilder("task time diff ");
                            sb.append(j);
                            sb.append(" , is less than 15000");
                            sb.append(" so , merge in previous session");
                            TeaThread.getInst().removeCallbacks(C6747c.this.f19240i);
                            C6747c.this.f19236e.mo51151a(j);
                            C6747c.this.f19236e.f52167g = now;
                            C6747c.this.f19237f.mo51149b(C6747c.this.f19236e);
                            C6747c.this.mo16509a(C6747c.this.f19236e.f52162b);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder("task time diff ");
                        sb2.append(j);
                        sb2.append(" , is bigger than 15000");
                        sb2.append(" so close current session and create new session");
                        TeaThread.getInst().removeCallbacks(C6747c.this.f19240i);
                        C6747c.this.f19240i.run();
                        C6747c.this.f19236e = new C19272d(now);
                        C6747c.this.f19237f.mo51148b();
                        C6747c.this.mo16509a(C6747c.this.f19236e.f52162b);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo16507a() {
        boolean a = f19231n.mo51145a();
        if (this.f19233b != a) {
            new StringBuilder("tryCorrectTaskState newIsTaskRunning : ").append(a);
            if (a) {
                mo16514e();
                return;
            }
            mo16510b();
        }
    }

    /* renamed from: a */
    public static void m20891a(C19269a aVar) {
        f19231n = aVar;
    }

    /* renamed from: a */
    public static C6747c m20890a(Context context) {
        if (f19230k == null) {
            synchronized (C6747c.class) {
                if (f19230k == null) {
                    f19230k = new C6747c(context.getApplicationContext());
                }
            }
        }
        return f19230k;
    }

    private C6747c(Context context) {
        this.f19243m = context.getApplicationContext();
        this.f19237f = new C19270b(context);
    }

    /* renamed from: a */
    public final void mo16509a(String str) {
        Handler g = m20893g();
        g.removeMessages(1);
        g.sendMessageDelayed(Message.obtain(g, 1, str), DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* renamed from: a */
    public final void mo16508a(final long j, final String str) {
        TeaThread.getInst().ensureTeaThread(new Runnable() {
            public final void run() {
                if (C6747c.this.f19234c) {
                    C6747c.this.f19234c = false;
                    TeaThread.getInst().removeCallbacks(C6747c.this.f19241j);
                    TeaThread.getInst().removeCallbacks(C6747c.this.f19240i);
                    C6747c.this.mo16513d();
                    C6747c.this.f19237f.mo51148b();
                    if (C6747c.this.f19232a) {
                        if (j - C6747c.this.f19235d <= 30000) {
                            C6747c.this.f19238g.clear();
                            C6747c.this.f19236e = null;
                        } else {
                            if (C6747c.this.f19236e != null) {
                                if (C6747c.this.f19233b) {
                                    C6747c.this.f19236e.mo51156c(str);
                                    C6747c.this.f19236e.f52167g = j;
                                }
                                C6747c.this.f19237f.mo51147a(C6747c.this.f19236e);
                                C6747c.this.f19236e = null;
                            }
                            C6747c.this.f19241j.run();
                        }
                    }
                    C6747c.this.mo16512c();
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo16511b(final long j, final String str) {
        TeaThread.getInst().ensureTeaThread(new Runnable() {
            public final void run() {
                if (!C6747c.this.f19234c) {
                    C6747c.this.mo16512c();
                    TeaThread.getInst().repost(C6747c.this.f19241j, 30010);
                    C6747c.this.f19235d = j;
                    C6747c.this.f19234c = true;
                    if (C6747c.this.f19233b) {
                        C6747c.this.f19232a = true;
                        C6747c.this.f19236e = new C19272d(j);
                        C6747c.this.f19236e.mo51153b(str);
                        C6747c.this.mo16509a(C6747c.this.f19236e.f52162b);
                    }
                }
            }
        });
    }
}
