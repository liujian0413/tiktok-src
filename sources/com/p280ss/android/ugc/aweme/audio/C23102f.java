package com.p280ss.android.ugc.aweme.audio;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.audio.C23106h.C23107a;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoSoundGuideModeOldUserExperiment;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.audio.f */
public class C23102f {

    /* renamed from: a */
    public static final boolean f61002a = C7163a.m22363a();

    /* renamed from: i */
    private static volatile C23102f f61003i;

    /* renamed from: b */
    public boolean f61004b;

    /* renamed from: c */
    public boolean f61005c;

    /* renamed from: d */
    public boolean f61006d;

    /* renamed from: e */
    public int f61007e;

    /* renamed from: f */
    public C23104a f61008f;

    /* renamed from: g */
    private Handler f61009g;

    /* renamed from: h */
    private C23106h f61010h;

    /* renamed from: com.ss.android.ugc.aweme.audio.f$a */
    public interface C23104a {
        /* renamed from: a */
        void mo60181a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo60188e() {
        this.f61006d = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo60189f() {
        this.f61004b = true;
        this.f61005c = false;
    }

    /* renamed from: c */
    public final void mo60186c() {
        if (this.f61008f != null) {
            this.f61008f.mo60181a();
        }
    }

    /* renamed from: d */
    public final void mo60187d() {
        this.f61005c = false;
        this.f61008f = null;
        if (this.f61009g != null) {
            this.f61009g.removeCallbacksAndMessages(null);
        }
    }

    private C23102f() {
        if (f61003i == null) {
            this.f61010h = C23106h.m75943a();
            return;
        }
        throw new RuntimeException("Illegal access.");
    }

    /* renamed from: a */
    public static C23102f m75929a() {
        if (f61003i == null) {
            synchronized (C23102f.class) {
                if (f61003i == null) {
                    f61003i = new C23102f();
                }
            }
        }
        return f61003i;
    }

    /* renamed from: b */
    public static int m75931b() {
        return C6384b.m19835a().mo15287a(VideoSoundGuideModeOldUserExperiment.class, true, "video_sound_guide_old_user", C6384b.m19835a().mo15295d().video_sound_guide_old_user, 0);
    }

    /* renamed from: g */
    private void m75934g() {
        if (this.f61009g.hasMessages(1)) {
            this.f61009g.removeMessages(1);
        }
        this.f61005c = false;
        mo60189f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo60185a(boolean z) {
        m75934g();
        return true;
    }

    /* renamed from: a */
    public static boolean m75930a(Context context) {
        return C6887b.m21436b().mo16909b(context, "has_show_volume_guide", false);
    }

    /* renamed from: b */
    public static void m75932b(Context context) {
        C6887b.m21436b().mo16902a(context, "has_show_volume_guide", true);
    }

    /* renamed from: b */
    private void m75933b(Context context, int i) {
        final int i2;
        final int i3;
        if (this.f61009g == null) {
            HandlerThread handlerThread = new HandlerThread("volume-timer-thread");
            handlerThread.start();
            if (i <= 10) {
                i2 = 1;
            } else {
                i2 = i / 10;
            }
            if (i <= 10) {
                i3 = 0;
            } else {
                i3 = i % 10;
            }
            final Context context2 = context;
            final int i4 = i;
            C231031 r3 = new Handler(handlerThread.getLooper()) {
                /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void handleMessage(android.os.Message r6) {
                    /*
                        r5 = this;
                        int r6 = r6.what
                        r0 = 1
                        if (r6 != r0) goto L_0x006d
                        com.ss.android.ugc.aweme.audio.f r6 = com.p280ss.android.ugc.aweme.audio.C23102f.this
                        boolean r6 = r6.f61005c
                        if (r6 != 0) goto L_0x000c
                        return
                    L_0x000c:
                        r5.removeMessages(r0)
                        com.ss.android.ugc.aweme.audio.f r6 = com.p280ss.android.ugc.aweme.audio.C23102f.this
                        int r1 = r6.f61007e
                        int r1 = r1 + r0
                        r6.f61007e = r1
                        r6 = 10
                        if (r1 <= r6) goto L_0x0020
                        com.ss.android.ugc.aweme.audio.f r6 = com.p280ss.android.ugc.aweme.audio.C23102f.this
                        r6.mo60189f()
                        return
                    L_0x0020:
                        int r1 = r6
                        if (r1 > 0) goto L_0x0027
                        android.content.Context r6 = r7
                        goto L_0x0042
                    L_0x0027:
                        r1 = 0
                        r2 = 0
                    L_0x0029:
                        int r3 = r6
                        if (r2 >= r3) goto L_0x003a
                        com.ss.android.ugc.aweme.audio.f r3 = com.p280ss.android.ugc.aweme.audio.C23102f.this
                        int r3 = r3.f61007e
                        int r4 = 10 - r2
                        if (r3 != r4) goto L_0x0037
                        r1 = 1
                        goto L_0x003a
                    L_0x0037:
                        int r2 = r2 + 1
                        goto L_0x0029
                    L_0x003a:
                        android.content.Context r6 = r7
                        if (r1 == 0) goto L_0x0042
                        int r1 = r8
                        int r1 = r1 + r0
                        goto L_0x0044
                    L_0x0042:
                        int r1 = r8
                    L_0x0044:
                        r2 = 8
                        boolean r6 = com.p280ss.android.ugc.aweme.audio.AudioUtils.m75900b(r6, r1, r2)
                        android.content.Context r1 = r7
                        int r1 = com.p280ss.android.ugc.aweme.audio.AudioUtils.m75898b(r1)
                        if (r6 != 0) goto L_0x0058
                        com.ss.android.ugc.aweme.audio.f r6 = com.p280ss.android.ugc.aweme.audio.C23102f.this
                        r6.mo60189f()
                        return
                    L_0x0058:
                        int r6 = r9
                        if (r1 < r6) goto L_0x0062
                        com.ss.android.ugc.aweme.audio.f r6 = com.p280ss.android.ugc.aweme.audio.C23102f.this
                        r6.mo60189f()
                        return
                    L_0x0062:
                        com.ss.android.ugc.aweme.audio.f r6 = com.p280ss.android.ugc.aweme.audio.C23102f.this
                        boolean r6 = r6.f61005c
                        if (r6 == 0) goto L_0x006d
                        r1 = 500(0x1f4, double:2.47E-321)
                        r5.sendEmptyMessageDelayed(r0, r1)
                    L_0x006d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.audio.C23102f.C231031.handleMessage(android.os.Message):void");
                }
            };
            this.f61009g = r3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60184a(Context context, int i) {
        if (!this.f61005c) {
            this.f61005c = true;
            Context applicationContext = context.getApplicationContext();
            m75933b(applicationContext, i);
            this.f61010h.mo60191a((C23107a) new C23105g(this));
            AudioUtils.m75896a(applicationContext, false);
            AudioUtils.m75897a(applicationContext, 0, 0);
            this.f61009g.sendEmptyMessage(1);
        }
    }
}
