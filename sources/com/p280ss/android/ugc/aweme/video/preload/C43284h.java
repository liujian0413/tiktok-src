package com.p280ss.android.ugc.aweme.video.preload;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.storage.C12920c;
import com.bytedance.storage.StorageStrategy;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.feed.api.C28220h;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p932aa.C21097b;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbUserHttp2Exp;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayerAbUseLastIf403Exp;
import com.p280ss.android.ugc.aweme.setting.model.MLModel;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.C43187ae;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import com.p280ss.android.ugc.aweme.video.experiment.GatherModeExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayUse2UrlExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.UsePrivateCachePathExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.UseTTNetExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.UseVideoCacheHttpDnsExperiment;
import com.p280ss.android.ugc.aweme.video.p1700d.C43208c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.CheckVideoCacheRequestHeaderExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.PlayerPreloadLazyGetUrlsExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.PreloadLocalCachePathVideoPlayExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheAutoAdjustPreloadMaxExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheWriteAsynchronousExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoDownloadSpeedCostTimeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoNetworkSpeedAlgorithmExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoSpeedQueueSizeExperiment;
import com.p280ss.android.ugc.networkspeed.C44903d;
import com.p280ss.android.ugc.playerkit.C44906a;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import com.p280ss.android.ugc.playerkit.p1751b.C44913b;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import com.p280ss.android.ugc.playerkit.videoview.p1752a.C44936a;
import com.p280ss.android.ugc.playerkit.videoview.p1754c.C44944a;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.toutiao.proxyserver.C46456aa;
import com.toutiao.proxyserver.C46482g;
import com.toutiao.proxyserver.C46503k;
import com.toutiao.proxyserver.C46504l;
import com.toutiao.proxyserver.C46505m;
import com.toutiao.proxyserver.C46506n;
import com.toutiao.proxyserver.C46520o;
import com.toutiao.proxyserver.C46521p;
import com.toutiao.proxyserver.C46522q;
import com.toutiao.proxyserver.C46534r;
import com.toutiao.proxyserver.C46536s;
import com.toutiao.proxyserver.p1839a.C46453a;
import com.toutiao.proxyserver.p1839a.C46454b;
import com.toutiao.proxyserver.p1839a.C46455c;
import com.toutiao.proxyserver.p1841c.C46468a;
import com.toutiao.proxyserver.p1841c.C46469b;
import com.toutiao.proxyserver.p1841c.C46470c;
import com.toutiao.proxyserver.speed.C46546b;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.BackpressureStrategy;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7499z;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p1873k.C47852a;
import p346io.reactivex.p351i.C7333a;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.ss.android.ugc.aweme.video.preload.h */
public class C43284h implements C43271b {

    /* renamed from: a */
    public static final boolean f112053a = C7163a.m22363a();

    /* renamed from: b */
    public static final String f112054b = C43284h.class.getSimpleName();

    /* renamed from: m */
    private static File f112055m;

    /* renamed from: q */
    private static File f112056q;

    /* renamed from: c */
    public C7486b<Integer> f112057c;

    /* renamed from: d */
    public boolean f112058d;

    /* renamed from: e */
    public Map<String, C43281f> f112059e;

    /* renamed from: f */
    public Map<String, List<C43281f>> f112060f;

    /* renamed from: g */
    public HashMap<String, List<C46454b>> f112061g;

    /* renamed from: h */
    public HashMap<String, C46453a> f112062h;

    /* renamed from: i */
    public WeakReference<Object> f112063i;

    /* renamed from: j */
    public WeakReference<C43270a> f112064j;

    /* renamed from: k */
    public int f112065k;

    /* renamed from: l */
    public C43187ae f112066l;

    /* renamed from: n */
    private HashMap<String, List<C43187ae>> f112067n;

    /* renamed from: o */
    private C43299a f112068o;

    /* renamed from: p */
    private long f112069p;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.h$a */
    class C43299a extends Thread {

        /* renamed from: a */
        public Queue<C43302a> f112090a = new LinkedBlockingQueue();

        /* renamed from: b */
        public Queue<C43302a> f112091b = new LinkedBlockingQueue();

        /* renamed from: d */
        private boolean f112093d = true;

        /* renamed from: e */
        private final Queue<C43302a> f112094e = new ArrayBlockingQueue(10);

        /* renamed from: f */
        private C7486b<C43302a> f112095f;

        /* renamed from: g */
        private C7499z f112096g;

        /* renamed from: h */
        private HandlerThread f112097h = new HandlerThread("preload-schedule-thread");

        /* renamed from: com.ss.android.ugc.aweme.video.preload.h$a$a */
        class C43302a {

            /* renamed from: a */
            public int f112103a;

            /* renamed from: b */
            public String f112104b;

            /* renamed from: c */
            public String[] f112105c;

            /* renamed from: d */
            public int f112106d = -1;

            /* renamed from: e */
            public boolean f112107e;

            /* renamed from: f */
            public C46520o f112108f;

            /* renamed from: g */
            public VideoUrlModel f112109g;

            C43302a() {
            }
        }

        /* renamed from: a */
        private static void m137369a() {
            if (C6399b.m19928c() && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                throw new IllegalStateException("cannot run on the main thread!");
            }
        }

        /* renamed from: b */
        private void m137371b() {
            m137369a();
            while (true) {
                C43302a aVar = (C43302a) this.f112091b.poll();
                if (aVar == null) {
                    return;
                }
                if (C43284h.this.f112058d) {
                    final VideoUrlModel videoUrlModel = aVar.f112109g;
                    aVar.f112108f = new C46520o() {

                        /* renamed from: a */
                        C44936a f112100a;

                        /* renamed from: b */
                        public final String mo105084b() {
                            if (this.f112100a == null) {
                                mo105083a();
                            }
                            if (this.f112100a != null) {
                                return this.f112100a.f115602c;
                            }
                            return null;
                        }

                        /* renamed from: a */
                        public final String[] mo105083a() {
                            if (this.f112100a == null) {
                                this.f112100a = C44944a.m141816a().mo107453f(videoUrlModel.getBitRatedRatioUri()).mo107469b(videoUrlModel, C44917a.m141692r().mo105098a(), false);
                            }
                            if (this.f112100a != null) {
                                return this.f112100a.f115600a;
                            }
                            return null;
                        }
                    };
                    m137373c(aVar);
                } else {
                    C44936a b = C44944a.m141816a().mo107453f(aVar.f112109g.getBitRatedRatioUri()).mo107469b(aVar.f112109g, C44917a.m141692r().mo105098a(), false);
                    aVar.f112105c = b.f115600a;
                    aVar.f112104b = b.f115602c;
                    aVar.f112109g = null;
                    m137373c(aVar);
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|(1:8)|59|(4:11|(4:13|14|45|58)(1:57)|56|9)|46|47|48|49) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00fc */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
            L_0x0000:
                boolean r0 = r7.f112093d
                if (r0 == 0) goto L_0x0102
                monitor-enter(r7)
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.h$a$a> r0 = r7.f112091b     // Catch:{ all -> 0x00ff }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ff }
                if (r0 != 0) goto L_0x0016
                boolean r0 = com.p280ss.android.ugc.aweme.video.preload.C43272c.m137279a()     // Catch:{ all -> 0x00ff }
                if (r0 == 0) goto L_0x0016
                r7.m137371b()     // Catch:{ all -> 0x00ff }
            L_0x0016:
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.h$a$a> r0 = r7.f112090a     // Catch:{ all -> 0x00ff }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ff }
                if (r0 != 0) goto L_0x00f9
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.h$a$a> r0 = r7.f112090a     // Catch:{ all -> 0x00ff }
                java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00ff }
                com.ss.android.ugc.aweme.video.preload.h$a$a r0 = (com.p280ss.android.ugc.aweme.video.preload.C43284h.C43299a.C43302a) r0     // Catch:{ all -> 0x00ff }
                if (r0 == 0) goto L_0x0016
                int r1 = r0.f112103a     // Catch:{ all -> 0x00ff }
                r2 = 0
                switch(r1) {
                    case 0: goto L_0x0072;
                    case 1: goto L_0x0067;
                    case 2: goto L_0x005e;
                    case 3: goto L_0x003b;
                    case 4: goto L_0x0030;
                    default: goto L_0x002e;
                }     // Catch:{ all -> 0x00ff }
            L_0x002e:
                goto L_0x00f4
            L_0x0030:
                com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.C46522q.m146227a()     // Catch:{ all -> 0x00ff }
                r1.mo115685b()     // Catch:{ all -> 0x00ff }
                r7.f112093d = r2     // Catch:{ all -> 0x00ff }
                goto L_0x00f4
            L_0x003b:
                com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.C46522q.m146227a()     // Catch:{ all -> 0x00ff }
                r1.mo115685b()     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.f r1 = com.toutiao.proxyserver.C46534r.m146274f()     // Catch:{ all -> 0x00ff }
                if (r1 == 0) goto L_0x004f
                com.toutiao.proxyserver.f r1 = com.toutiao.proxyserver.C46534r.m146274f()     // Catch:{ all -> 0x00ff }
                r1.mo115608a()     // Catch:{ all -> 0x00ff }
            L_0x004f:
                com.toutiao.proxyserver.g r1 = com.toutiao.proxyserver.C46534r.m146273e()     // Catch:{ all -> 0x00ff }
                if (r1 == 0) goto L_0x00f4
                com.toutiao.proxyserver.g r1 = com.toutiao.proxyserver.C46534r.m146273e()     // Catch:{ all -> 0x00ff }
                r1.mo115614b()     // Catch:{ all -> 0x00ff }
                goto L_0x00f4
            L_0x005e:
                com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.C46522q.m146227a()     // Catch:{ all -> 0x00ff }
                r1.mo115685b()     // Catch:{ all -> 0x00ff }
                goto L_0x00f4
            L_0x0067:
                com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.C46522q.m146227a()     // Catch:{ all -> 0x00ff }
                java.lang.String r2 = r0.f112104b     // Catch:{ all -> 0x00ff }
                r1.mo115687c(r2)     // Catch:{ all -> 0x00ff }
                goto L_0x00f4
            L_0x0072:
                com.toutiao.proxyserver.o r1 = r0.f112108f     // Catch:{ all -> 0x00ff }
                if (r1 != 0) goto L_0x00cd
                java.lang.String[] r1 = r0.f112105c     // Catch:{ all -> 0x00ff }
                if (r1 == 0) goto L_0x00f4
                java.lang.String[] r1 = r0.f112105c     // Catch:{ all -> 0x00ff }
                int r1 = r1.length     // Catch:{ all -> 0x00ff }
                if (r1 <= 0) goto L_0x00f4
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ff }
                r1.<init>()     // Catch:{ all -> 0x00ff }
                java.lang.String[] r3 = r0.f112105c     // Catch:{ all -> 0x00ff }
                int r4 = r3.length     // Catch:{ all -> 0x00ff }
            L_0x0087:
                if (r2 >= r4) goto L_0x0097
                r5 = r3[r2]     // Catch:{ all -> 0x00ff }
                boolean r6 = com.toutiao.proxyserver.p1842d.C46476c.m146127a(r5)     // Catch:{ all -> 0x00ff }
                if (r6 == 0) goto L_0x0094
                r1.add(r5)     // Catch:{ all -> 0x00ff }
            L_0x0094:
                int r2 = r2 + 1
                goto L_0x0087
            L_0x0097:
                int r2 = r1.size()     // Catch:{ all -> 0x00ff }
                java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x00ff }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x00ff }
                java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x00ff }
                int r2 = r0.f112106d     // Catch:{ all -> 0x00ff }
                if (r2 >= 0) goto L_0x00b1
                com.toutiao.proxyserver.q r2 = com.toutiao.proxyserver.C46522q.m146227a()     // Catch:{ all -> 0x00ff }
                java.lang.String r3 = r0.f112104b     // Catch:{ all -> 0x00ff }
                r2.mo115680a(r3, r1)     // Catch:{ all -> 0x00ff }
                goto L_0x00f4
            L_0x00b1:
                com.toutiao.proxyserver.q r2 = com.toutiao.proxyserver.C46522q.m146227a()     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.q$a r2 = r2.mo115690g()     // Catch:{ all -> 0x00ff }
                java.lang.String r3 = r0.f112104b     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.q$a r2 = r2.mo115701a(r3)     // Catch:{ all -> 0x00ff }
                int r3 = r0.f112106d     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.q$a r2 = r2.mo115699a(r3)     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.q$a r1 = r2.mo115702a(r1)     // Catch:{ all -> 0x00ff }
                r1.mo115703a()     // Catch:{ all -> 0x00ff }
                goto L_0x00f4
            L_0x00cd:
                int r1 = r0.f112106d     // Catch:{ all -> 0x00ff }
                if (r1 >= 0) goto L_0x00dd
                com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.C46522q.m146227a()     // Catch:{ all -> 0x00ff }
                java.lang.String r2 = r0.f112104b     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.o r3 = r0.f112108f     // Catch:{ all -> 0x00ff }
                r1.mo115679a(r2, r3)     // Catch:{ all -> 0x00ff }
                goto L_0x00f4
            L_0x00dd:
                com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.C46522q.m146227a()     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.q$a r1 = r1.mo115690g()     // Catch:{ all -> 0x00ff }
                int r2 = r0.f112106d     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.q$a r1 = r1.mo115699a(r2)     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.o r2 = r0.f112108f     // Catch:{ all -> 0x00ff }
                com.toutiao.proxyserver.q$a r1 = r1.mo115700a(r2)     // Catch:{ all -> 0x00ff }
                r1.mo115703a()     // Catch:{ all -> 0x00ff }
            L_0x00f4:
                r7.m137370a(r0)     // Catch:{ all -> 0x00ff }
                goto L_0x0016
            L_0x00f9:
                r7.wait()     // Catch:{ InterruptedException -> 0x00fc }
            L_0x00fc:
                monitor-exit(r7)     // Catch:{ all -> 0x00ff }
                goto L_0x0000
            L_0x00ff:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x00ff }
                throw r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.video.preload.C43284h.C43299a.run():void");
        }

        /* renamed from: b */
        private void m137372b(C43302a aVar) {
            this.f112095f.onNext(aVar);
        }

        /* renamed from: c */
        private void m137373c(C43302a aVar) {
            m137369a();
            if (aVar != null) {
                this.f112090a.offer(aVar);
                notify();
            }
        }

        /* renamed from: a */
        public final void mo105079a(int i) {
            C43302a a = m137368a((String) null, i, (String[]) null);
            a.f112107e = true;
            this.f112095f.onNext(a);
        }

        C43299a() {
            this.f112097h.start();
            this.f112096g = C47549a.m148328a(this.f112097h.getLooper());
            this.f112095f = C7486b.m23223a();
            this.f112095f.mo19283a(BackpressureStrategy.LATEST).mo19152a(this.f112096g).mo19154a((C47597i<? super T>) new C47852a<C43302a>(C43284h.this) {
                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                    C2077a.m9160a(th);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(C43302a aVar) {
                    synchronized (C43299a.this) {
                        if (!aVar.f112107e) {
                            C43299a.this.f112091b.add(aVar);
                        } else {
                            C43299a.this.f112091b.clear();
                            C43299a.this.f112090a.clear();
                            C43299a.this.f112090a.offer(aVar);
                        }
                        C43299a.this.notify();
                    }
                }
            });
        }

        /* renamed from: a */
        private void m137370a(C43302a aVar) {
            m137369a();
            aVar.f112105c = null;
            aVar.f112104b = null;
            aVar.f112103a = -1;
            aVar.f112109g = null;
            aVar.f112106d = -1;
            aVar.f112107e = false;
            this.f112094e.offer(aVar);
        }

        /* renamed from: a */
        public final void mo105080a(VideoUrlModel videoUrlModel) {
            m137372b(m137366a(1, videoUrlModel));
        }

        /* renamed from: a */
        private C43302a m137366a(int i, VideoUrlModel videoUrlModel) {
            return m137367a(1, videoUrlModel, -1);
        }

        /* renamed from: a */
        public final void mo105081a(VideoUrlModel videoUrlModel, int i) {
            m137372b(m137367a(0, videoUrlModel, i));
        }

        /* renamed from: a */
        private C43302a m137367a(int i, VideoUrlModel videoUrlModel, int i2) {
            C43302a aVar = (C43302a) this.f112094e.poll();
            if (aVar == null) {
                aVar = new C43302a();
            }
            aVar.f112103a = i;
            aVar.f112109g = videoUrlModel;
            aVar.f112106d = i2;
            return aVar;
        }

        /* renamed from: a */
        private C43302a m137368a(String str, int i, String[] strArr) {
            C43302a aVar = (C43302a) this.f112094e.poll();
            if (aVar == null) {
                aVar = new C43302a();
            }
            aVar.f112104b = null;
            aVar.f112103a = i;
            aVar.f112105c = null;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.h$b */
    static class C43303b {

        /* renamed from: a */
        public static final C43284h f112111a = new C43284h();
    }

    /* renamed from: g */
    public static C43284h m137323g() {
        return C43303b.f112111a;
    }

    /* renamed from: f */
    public final File mo105037f() {
        return f112055m;
    }

    /* renamed from: c */
    public final void mo105030c() {
        if (mo105023a()) {
            this.f112068o.mo105079a(3);
        }
    }

    /* renamed from: e */
    public final String mo105035e() {
        if (C46534r.f119902i) {
            return "ttnet";
        }
        return "okhttp";
    }

    private C43284h() {
        this.f112059e = new LinkedHashMap<String, C43281f>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f112060f = new LinkedHashMap<String, List<C43281f>>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f112061g = new LinkedHashMap<String, List<C46454b>>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f112067n = new LinkedHashMap<String, List<C43187ae>>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f112062h = new LinkedHashMap<String, C46453a>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f112065k = 0;
        this.f112069p = 0;
        this.f112066l = null;
    }

    /* renamed from: i */
    private static void m137324i() {
        int i;
        if (C46534r.f119902i) {
            i = C6384b.m19835a().mo15287a(VideoCacheTTnetPreloadTimeoutExperiment.class, true, "videocache_ttnet_preload_timeout", C6384b.m19835a().mo15295d().videocache_ttnet_preload_timeout, (int) VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
        } else {
            i = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        }
        C46522q.m146227a().mo115678a((long) i, 30000, 30000);
    }

    /* renamed from: j */
    private static void m137325j() {
        int i;
        if (C46534r.f119902i) {
            i = C6384b.m19835a().mo15287a(VideoCacheTTnetProxyTimeoutExperiment.class, true, "videocache_ttnet_proxy_timeout", C6384b.m19835a().mo15295d().videocache_ttnet_proxy_timeout, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        } else {
            i = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
        }
        C46536s.m146278a().mo115707a((long) i, 10000, 10000);
    }

    /* renamed from: d */
    public final C43273d mo105032d() {
        C43273d dVar = new C43273d();
        for (String str : this.f112062h.keySet()) {
            C46453a aVar = (C46453a) this.f112062h.get(str);
            if (aVar != null) {
                dVar.f112006a += aVar.f119700d;
                dVar.f112007b += aVar.f119699c;
            }
        }
        return dVar;
    }

    /* renamed from: h */
    public final void mo105056h() {
        this.f112057c = C7486b.m23223a();
        this.f112057c.mo19283a(BackpressureStrategy.LATEST).mo19146a((long) this.f112065k, TimeUnit.MILLISECONDS, C7333a.m23047e(), true).mo19154a((C47597i<? super T>) new C47852a<Integer>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                C2077a.m9160a(th);
            }

            /* renamed from: a */
            private static void m137361a(Integer num) {
                C44903d.m141655a().mo107378c();
            }

            public final /* synthetic */ void onNext(Object obj) {
                m137361a((Integer) obj);
            }
        });
    }

    /* renamed from: k */
    private static C46482g m137326k() {
        long j;
        C46482g gVar;
        Context a = C6399b.m19921a();
        if (a == null) {
            return null;
        }
        File a2 = m137320a(a);
        if (a2 == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 23) {
            j = 104857600;
        } else {
            j = (C42973bg.m136421a() * 1048576) / 8;
        }
        if (C12920c.m37608a() && f112056q != null) {
            j = f112056q.getFreeSpace() / 8;
        }
        if (j > 104857600) {
            j = 104857600;
        } else if (j < 10485760) {
            j = 10485760;
        }
        f112055m = a2;
        try {
            gVar = new C46482g(a2);
            try {
                gVar.mo115612a(j);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            gVar = null;
        }
        return gVar;
    }

    /* renamed from: b */
    public final void mo105028b() {
        if (mo105023a()) {
            this.f112068o.mo105079a(2);
        }
    }

    /* renamed from: a */
    public final boolean mo105023a() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f112068o != null) {
            return true;
        }
        C46482g k = m137326k();
        if (k == null) {
            return false;
        }
        if (C6384b.m19835a().mo15292a(PlayerPreloadLazyGetUrlsExperiment.class, true, "player_preload_lazy_get_urls", C6384b.m19835a().mo15295d().player_preload_lazy_get_urls, true) || C7163a.m22363a()) {
            z = true;
        } else {
            z = false;
        }
        this.f112058d = z;
        int a = C6384b.m19835a().mo15287a(VideoSpeedQueueSizeExperiment.class, true, "video_speed_queue_size", C6384b.m19835a().mo15295d().video_speed_queue_size, 10);
        if (C44903d.f115471c != a && a > 0) {
            C44903d.f115471c = a;
            C44903d.m141655a().mo107376a(a);
        }
        C46521p.f119856a = 1;
        C46522q.f119859g.f119858c = new LinkedBlockingQueue();
        C46534r.f119917x = C7163a.m22363a();
        C46534r.f119905l = 10;
        C46534r.f119916w = C6384b.m19835a().mo15292a(VideoCacheWriteAsynchronousExperiment.class, true, "video_cache_write_asynchronous", C6384b.m19835a().mo15295d().video_cache_write_asynchronous, false);
        C46534r.m146258a(1);
        C46534r.f119915v = C6384b.m19835a().mo15292a(UseVideoCacheHttpDnsExperiment.class, true, "use_video_cache_http_dns", C6384b.m19835a().mo15295d().use_video_cache_http_dns, false);
        C46534r.m146268a(C43208c.m137003a());
        C46534r.m146270b(C43208c.m137004b());
        C46534r.f119906m = C6384b.m19835a().mo15292a(CheckVideoCacheRequestHeaderExperiment.class, true, "check_video_cache_request_header", C6384b.m19835a().mo15295d().check_video_cache_request_header, true);
        C46534r.f119907n = C6384b.m19835a().mo15292a(PreloadLocalCachePathVideoPlayExperiment.class, true, "is_preload_local_cache_path_video_play_enable", C6384b.m19835a().mo15295d().is_preload_local_cache_path_video_play_enable, false);
        C46534r.f119910q = C6384b.m19835a().mo15292a(VideoCacheAutoAdjustPreloadMaxExperiment.class, true, "is_video_cache_auto_adust_preload_max", C6384b.m19835a().mo15295d().is_video_cache_auto_adust_preload_max, true);
        C46534r.f119904k = C6384b.m19835a().mo15287a(VideoCacheReadBuffersizeExperiment.class, true, "video_cache_read_buffersize", C6384b.m19835a().mo15295d().video_cache_read_buffersize, (int) VideoCacheReadBuffersizeExperiment.DEFAULT);
        C46534r.f119908o = C6384b.m19835a().mo15292a(PlayerAbUseLastIf403Exp.class, true, "player_use_last_url_if_403", C6384b.m19835a().mo15295d().player_use_last_url_if_403, true);
        if (C6384b.m19835a().mo15287a(PlayUse2UrlExperiment.class, true, "player_play_use_2_cdn_url", C6384b.m19835a().mo15295d().player_play_use_2_cdn_url, 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C46534r.f119909p = z2;
        if (C6384b.m19835a().mo15287a(PlayeAbUserHttp2Exp.class, true, "player_use_http2", C6384b.m19835a().mo15295d().player_use_http2, 0) == 1 || C7163a.m22363a()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C46534r.f119911r = z3;
        C46546b.m146299a(300);
        if (C6384b.m19835a().mo15287a(GatherModeExperiment.class, true, "gather_mode", C6384b.m19835a().mo15295d().gather_mode, 0) != 0 || C6384b.m19835a().mo15287a(UseTTNetExperiment.class, true, "use_ttnet", C6384b.m19835a().mo15295d().use_ttnet, 0) == 1) {
            C46534r.f119902i = true;
        } else {
            C46534r.f119902i = false;
        }
        C46534r.m146261a((C46468a) new C46468a() {
            /* renamed from: a */
            public final void mo105075a(String str, String str2, String str3) {
                JSONObject a = C43284h.m137321a(str, str2, str3);
                if (a != null) {
                    C21097b.m71144a("VideoCache", a);
                }
            }

            /* renamed from: b */
            public final void mo105076b(String str, String str2, String str3) {
                JSONObject a = C43284h.m137321a(str, str2, str3);
                if (a != null) {
                    C21097b.m71147b("VideoCache", a);
                }
            }

            /* renamed from: c */
            public final void mo105077c(String str, String str2, String str3) {
                JSONObject a = C43284h.m137321a(str, str2, str3);
                if (a != null) {
                    C21097b.m71149c("VideoCache", a);
                }
            }

            /* renamed from: d */
            public final void mo105078d(String str, String str2, String str3) {
                JSONObject a = C43284h.m137321a(str, str2, str3);
                if (a != null) {
                    C21097b.m71151d("VideoCache", a);
                }
            }
        });
        C46534r.m146262a((C46469b) new C46469b() {
            /* renamed from: a */
            public final void mo105058a(String str, long j, String str2) {
                C44906a.m141666a().mo107384a(C44925a.m141730a().mo107407b().uri, str, j);
            }
        });
        C46470c.f119739a = true;
        C46534r.m146265a((C46504l) new C46504l() {
            /* renamed from: a */
            public final void mo105059a(int i, String str, String str2) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("video_cache_error_code", i);
                    String str3 = "video_cache_msg";
                    if (str.length() > 1500) {
                        str = str.substring(0, 1500);
                    }
                    jSONObject.put(str3, str);
                    jSONObject.put("video_cache_use_ttnet", C46534r.f119902i);
                    C44913b.m141677a(str2, i, jSONObject.toString());
                    C6877n.m21447a("video_cache_error_report", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        C46534r.m146264a((C46503k) new C46503k() {
            /* renamed from: a */
            public final void mo105060a(int i, String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", i);
                    jSONObject.put("url", str);
                    C6877n.m21407a("aweme_media_play_video_data_download", "aweme_media_play_video_data_download", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
        C46534r.m146266a((C46505m) new C46505m() {
            /* renamed from: a */
            public final void mo105061a(C46453a aVar) {
                if (aVar.f119697a != null && aVar.f119700d >= 0 && aVar.f119699c > 0) {
                    C43284h.this.f112062h.put(aVar.f119697a, aVar);
                }
            }
        });
        C46534r.m146267a((C46506n) new C46506n() {
            /* renamed from: a */
            public final void mo105065a(final JSONObject jSONObject) {
                C6726a.m20842a(new Runnable() {
                    public final void run() {
                        try {
                            C6877n.m21447a("aweme_play_416", C43208c.m137002a(jSONObject));
                        } catch (JSONException unused) {
                        }
                    }
                });
            }

            /* renamed from: a */
            public final void mo105062a(C46454b bVar) {
                if (bVar != null && bVar.f119701a != null && bVar.f119704d >= 0 && bVar.f119703c > 0) {
                    if (C43284h.this.f112066l == null || !TextUtils.equals(C43284h.this.f112066l.f111822a, bVar.f119701a)) {
                        C43284h.this.f112066l = C43284h.this.mo105055c(bVar.f119701a);
                    }
                    C43284h.this.f112066l.mo104822a(bVar);
                    List list = (List) C43284h.this.f112061g.get(bVar.f119701a);
                    if (list == null) {
                        list = new ArrayList();
                        C43284h.this.f112061g.put(bVar.f119701a, list);
                    }
                    list.add(bVar);
                }
            }

            /* renamed from: a */
            public final void mo105063a(C46455c cVar) {
                if (cVar != null && !TextUtils.isEmpty(cVar.f119705a)) {
                    C43281f fVar = new C43281f(cVar);
                    C43284h.this.f112059e.put(cVar.f119705a, fVar);
                    List list = (List) C43284h.this.f112060f.get(cVar.f119705a);
                    if (list == null && !TextUtils.isEmpty(fVar.f112035a)) {
                        list = new ArrayList();
                        C43284h.this.f112060f.put(fVar.f112035a, list);
                    }
                    if (list != null && list.size() < 10) {
                        list.add(fVar);
                    }
                    C43284h.this.mo105054a(cVar);
                }
            }

            /* renamed from: a */
            public final void mo105064a(String str, String str2) {
                if (C43284h.this.f112063i != null) {
                    C43284h.this.f112063i.get();
                }
            }

            /* renamed from: a */
            public final void mo105066a(boolean z, String str, int i, int i2) {
                if (C43284h.this.f112064j != null) {
                    C43270a aVar = (C43270a) C43284h.this.f112064j.get();
                    if (aVar != null) {
                        aVar.mo64942a(str, (long) i, (long) i2);
                    }
                }
            }

            /* renamed from: a */
            public final void mo105068a(boolean z, String str, int i, long j, long j2) {
                long j3;
                int i2;
                int i3 = i;
                if (i3 > 0) {
                    if (j <= 0 || C6384b.m19835a().mo15287a(VideoNetworkSpeedAlgorithmExperiment.class, true, "video_network_speed_algorithm", C6384b.m19835a().mo15295d().video_network_speed_algorithm, 0) != 2) {
                        if (C6384b.m19835a().mo15287a(VideoDownloadSpeedCostTimeExperiment.class, true, "video_download_speed_cost_time", C6384b.m19835a().mo15295d().video_download_speed_cost_time, 0) == 1) {
                            j3 = j;
                        } else {
                            j3 = j2;
                        }
                        if (j3 > 0) {
                            double d = (double) i3;
                            Double.isNaN(d);
                            double d2 = 8.0d * d;
                            double d3 = (double) j3;
                            Double.isNaN(d3);
                            C44903d.m141655a().mo107375a(d2 / (d3 / 1000.0d), d, j3);
                            MLModel a = C6903bc.m21490i().mo85908a();
                            if (a != null) {
                                if (C43284h.this.f112057c == null) {
                                    C43284h hVar = C43284h.this;
                                    if (a == null || a.params == null || a.params.length <= 0) {
                                        i2 = VETransitionFilterParam.TransitionDuration_DEFAULT;
                                    } else {
                                        i2 = a.params[0];
                                    }
                                    hVar.f112065k = i2;
                                    C43284h.this.mo105056h();
                                }
                                C43284h.this.f112057c.onNext(Integer.valueOf(i));
                            }
                        }
                    } else {
                        C44903d.m141655a().mo107380e();
                    }
                }
            }

            /* renamed from: a */
            public final void mo105067a(boolean z, String str, int i, int i2, String str2, String str3) {
                final boolean z2 = z;
                final String str4 = str;
                final int i3 = i;
                final int i4 = i2;
                final String str5 = str3;
                C432922 r0 = new Runnable() {
                    public final void run() {
                        C6869c cVar = new C6869c();
                        cVar.mo16882a("disableAutoDiskCacheManagement", Boolean.valueOf(z2));
                        cVar.mo16887a("key", str4);
                        cVar.mo16885a("oldContentLength", Integer.valueOf(i3));
                        cVar.mo16885a("newContentLength", Integer.valueOf(i4));
                        cVar.mo16887a("previousInfo", str5);
                        C43208c.m137001a(cVar);
                        C6877n.m21447a("aweme_play_content_length_not_match", cVar.mo16888b());
                    }
                };
                C6726a.m20842a(r0);
            }
        });
        C46536s.m146278a().mo115709b();
        try {
            this.f112068o = new C43299a();
            this.f112068o.start();
            C46534r.m146263a(k, C6399b.m19921a());
            m137324i();
            m137325j();
            return true;
        } catch (Exception e) {
            C6921a.m21554a(e);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo105031c(VideoUrlModel videoUrlModel) {
        return mo105025a(videoUrlModel, -1);
    }

    /* renamed from: a */
    public final long mo105020a(String str) {
        return C46522q.m146227a().mo115684b(str);
    }

    /* renamed from: b */
    public final long mo105027b(String str) {
        return C46522q.m146227a().mo115676a(str);
    }

    /* renamed from: d */
    public final void mo105033d(VideoUrlModel videoUrlModel) {
        if (mo105023a()) {
            this.f112068o.mo105080a(videoUrlModel);
        }
    }

    /* renamed from: f */
    public final C43281f mo105036f(VideoUrlModel videoUrlModel) {
        try {
            return (C43281f) this.f112059e.get(videoUrlModel.getBitRatedRatioUri());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final List<C43281f> mo105038g(VideoUrlModel videoUrlModel) {
        return (List) this.f112060f.get(videoUrlModel.getBitRatedRatioUri());
    }

    /* renamed from: h */
    public final List<C43187ae> mo105039h(VideoUrlModel videoUrlModel) {
        return (List) this.f112067n.get(videoUrlModel.getBitRatedRatioUri());
    }

    /* renamed from: b */
    public final int mo105026b(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null) {
            return (int) C46456aa.m146053a().mo115581b(videoUrlModel.getBitRatedRatioUri());
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo105022a(C43270a aVar) {
        this.f112064j = new WeakReference<>(aVar);
    }

    /* renamed from: c */
    public final C43187ae mo105055c(String str) {
        C43187ae aeVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List list = (List) this.f112067n.get(str);
        if (list != null && list.size() > 0) {
            aeVar = (C43187ae) list.get(list.size() - 1);
        }
        return aeVar;
    }

    /* renamed from: a */
    public static File m137320a(Context context) {
        File file;
        if (f112056q != null) {
            return f112056q;
        }
        boolean z = true;
        try {
            if (C6384b.m19835a().mo15287a(UsePrivateCachePathExperiment.class, true, "player_cache_use_private_path", C6384b.m19835a().mo15295d().player_cache_use_private_path, 1) != 1) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (!C7276d.m22826g() || z) {
            file = context.getCacheDir();
            if (C12920c.m37608a()) {
                file = C12920c.m37611b(context, StorageStrategy.PREFER_PRIVATE);
            }
        } else {
            file = C7276d.m22809b(context);
            if (C12920c.m37608a()) {
                file = C12920c.m37611b(context, StorageStrategy.PREFER_EXTERNAL);
            }
        }
        if (C7163a.m22363a()) {
            file = C7276d.m22809b(context);
        }
        if (file == null) {
            return null;
        }
        File file2 = new File(file, "cache");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        f112056q = file2;
        return file2;
    }

    /* renamed from: e */
    public final C43274e mo105034e(VideoUrlModel videoUrlModel) {
        try {
            List<C46454b> list = (List) this.f112061g.get(videoUrlModel.getBitRatedRatioUri());
            if (list != null && list.size() > 0) {
                C43274e eVar = new C43274e();
                eVar.f112010c = list.size();
                for (C46454b bVar : list) {
                    if (bVar != null) {
                        eVar.f112008a += bVar.f119704d;
                        eVar.f112009b += bVar.f119703c;
                    }
                }
                return eVar;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo105054a(C46455c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f119705a)) {
            List list = (List) this.f112067n.get(cVar.f119705a);
            if (list == null) {
                list = new ArrayList();
                this.f112067n.put(cVar.f119705a, list);
            }
            C43187ae aeVar = new C43187ae();
            aeVar.mo104823a(cVar.f119705a);
            aeVar.f111823b = (long) (list.size() + 1);
            list.add(aeVar);
            this.f112066l = aeVar;
        }
    }

    /* renamed from: b */
    public final void mo105029b(C43270a aVar) {
        if (this.f112064j != null && this.f112064j.get() == aVar) {
            this.f112064j = null;
        }
    }

    /* renamed from: a */
    public final boolean mo105024a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null) {
            return C46456aa.m146053a().mo115580a(videoUrlModel.getBitRatedRatioUri());
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo105025a(VideoUrlModel videoUrlModel, int i) {
        if (!mo105023a()) {
            return false;
        }
        this.f112068o.mo105081a(videoUrlModel, i);
        return true;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo105021a(VideoUrlModel videoUrlModel, String str, String[] strArr) {
        return m137322b(videoUrlModel, str, strArr);
    }

    /* renamed from: a */
    public static JSONObject m137321a(String str, String str2, String str3) {
        if (!C43220a.m137072a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tag", str);
            jSONObject.put("msg", str2);
            jSONObject.put("vid", str3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static String m137322b(VideoUrlModel videoUrlModel, String str, String[] strArr) {
        if (C28220h.m92763a().mo71959j()) {
            String b = C28220h.m92763a().mo71954b(videoUrlModel.getSourceId());
            if (C28220h.m92763a().mo71952a(b)) {
                return b;
            }
        }
        return C46536s.m146278a().mo115706a(str, strArr);
    }
}
