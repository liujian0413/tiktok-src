package com.bytedance.android.live.broadcast.stream;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceView;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p127c.C2430b;
import com.bytedance.android.live.broadcast.stream.p143b.C2966b;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p280ss.avframework.livestreamv2.LiveStreamReport;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.LiveCore;
import com.p280ss.avframework.livestreamv2.core.LiveCore.Builder;
import com.p280ss.avframework.livestreamv2.core.LiveCore.Builder.ILogMonitor;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGLContext;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.stream.c */
public final class C2967c implements C2429a {

    /* renamed from: k */
    public static final C2968a f9214k = new C2968a(null);

    /* renamed from: q */
    private static final float[] f9215q = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a */
    public ILiveStreamErrorListener f9216a;

    /* renamed from: b */
    public ILiveStreamInfoListener f9217b;

    /* renamed from: c */
    public final Map<String, String> f9218c = new ConcurrentHashMap();

    /* renamed from: d */
    public LiveCore f9219d;

    /* renamed from: e */
    public C2430b f9220e;

    /* renamed from: f */
    public int f9221f = -1;

    /* renamed from: g */
    public boolean f9222g;

    /* renamed from: h */
    public long f9223h;

    /* renamed from: i */
    public final Handler f9224i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public final C2977d f9225j;

    /* renamed from: l */
    private boolean f9226l;

    /* renamed from: m */
    private boolean f9227m;

    /* renamed from: n */
    private final Runnable f9228n = new C2969b(this);

    /* renamed from: o */
    private final ILiveStreamErrorListener f9229o = new C2971d(this);

    /* renamed from: p */
    private final ILiveStreamInfoListener f9230p = new C2973e(this);

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$a */
    public static final class C2968a {
        private C2968a() {
        }

        public /* synthetic */ C2968a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$b */
    static final class C2969b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2967c f9231a;

        C2969b(C2967c cVar) {
            this.f9231a = cVar;
        }

        public final void run() {
            this.f9231a.f9221f = 2;
            this.f9231a.mo8917a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$c */
    static final class C2970c implements ILogMonitor {

        /* renamed from: a */
        final /* synthetic */ C2967c f9232a;

        C2970c(C2967c cVar) {
            this.f9232a = cVar;
        }

        public final void onLogMonitor(String str, JSONObject jSONObject) {
            for (String str2 : this.f9232a.f9218c.keySet()) {
                if (jSONObject != null) {
                    try {
                        jSONObject.put(str2, this.f9232a.f9218c.get(str2));
                    } catch (JSONException unused) {
                    }
                }
            }
            this.f9232a.f9225j.f9272r.mo9463a(str, jSONObject);
            if (this.f9232a.f9220e != null && this.f9232a.f9219d != null) {
                LiveStreamReport liveStreamReport = new LiveStreamReport();
                LiveCore liveCore = this.f9232a.f9219d;
                if (liveCore == null) {
                    C7573i.m23580a();
                }
                if (liveCore.getLiveStreamInfo(liveStreamReport)) {
                    C2430b bVar = this.f9232a.f9220e;
                    if (bVar != null) {
                        bVar.mo8765a(((float) liveStreamReport.getVideoTransportRealBps()) / 1000.0f);
                    }
                }
                liveStreamReport.release();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$d */
    static final class C2971d implements ILiveStreamErrorListener {

        /* renamed from: a */
        final /* synthetic */ C2967c f9233a;

        C2971d(C2967c cVar) {
            this.f9233a = cVar;
        }

        public final void onError(int i, int i2, Exception exc) {
            this.f9233a.f9224i.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C2971d f9234a;

                {
                    this.f9234a = r1;
                }

                public final void run() {
                    if (this.f9234a.f9233a.f9221f == -1) {
                        this.f9234a.f9233a.f9221f = 3;
                    }
                    if (this.f9234a.f9233a.f9220e != null) {
                        this.f9234a.f9233a.mo9739a(this.f9234a.f9233a.f9221f);
                    }
                    this.f9234a.f9233a.f9221f = -1;
                }
            });
            C2966b bVar = this.f9233a.f9225j.f9274t;
            StringBuilder sb = new StringBuilder("code1:");
            sb.append(i);
            sb.append(",code2:");
            sb.append(i2);
            bVar.mo9464a(sb.toString(), exc);
            ILiveStreamErrorListener iLiveStreamErrorListener = this.f9233a.f9216a;
            if (iLiveStreamErrorListener != null) {
                iLiveStreamErrorListener.onError(i, i2, exc);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.c$e */
    static final class C2973e implements ILiveStreamInfoListener {

        /* renamed from: a */
        final /* synthetic */ C2967c f9235a;

        C2973e(C2967c cVar) {
            this.f9235a = cVar;
        }

        public final void onInfo(final int i, int i2, int i3) {
            this.f9235a.f9224i.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C2973e f9236a;

                {
                    this.f9236a = r1;
                }

                public final void run() {
                    int i = i;
                    if (i == 11) {
                        if (this.f9236a.f9235a.f9222g) {
                            this.f9236a.f9235a.f9222g = false;
                            C2430b bVar = this.f9236a.f9235a.f9220e;
                            if (bVar != null) {
                                bVar.mo8780d();
                            }
                        }
                        if (System.currentTimeMillis() - this.f9236a.f9235a.f9223h > DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
                            this.f9236a.f9235a.f9223h = System.currentTimeMillis();
                        }
                    } else if (i != 13) {
                        if (i != 15) {
                            switch (i) {
                                case 2:
                                    C2430b bVar2 = this.f9236a.f9235a.f9220e;
                                    if (bVar2 != null) {
                                        bVar2.mo8775b();
                                        break;
                                    } else {
                                        return;
                                    }
                                case 3:
                                    if (this.f9236a.f9235a.f9221f != -1) {
                                        this.f9236a.f9235a.mo9739a(this.f9236a.f9235a.f9221f);
                                        this.f9236a.f9235a.f9221f = -1;
                                        return;
                                    }
                                    return;
                            }
                        } else {
                            this.f9236a.f9235a.f9222g = true;
                            C2430b bVar3 = this.f9236a.f9235a.f9220e;
                            if (bVar3 != null) {
                                bVar3.mo8779c();
                            }
                        }
                    } else if (System.currentTimeMillis() - this.f9236a.f9235a.f9223h > DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
                        this.f9236a.f9235a.f9223h = System.currentTimeMillis();
                    }
                }
            });
            C2967c.m11511a(i, i2, i3);
            ILiveStreamInfoListener iLiveStreamInfoListener = this.f9235a.f9217b;
            if (iLiveStreamInfoListener != null) {
                iLiveStreamInfoListener.onInfo(i, i2, i3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if ((r2.length() == 0) != false) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8923a(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0010
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0014
        L_0x0010:
            com.bytedance.android.live.broadcast.stream.d r2 = r1.f9225j
            java.lang.String r2 = r2.f9256b
        L_0x0014:
            r1.m11513j()
            com.ss.avframework.livestreamv2.core.LiveCore r0 = r1.f9219d
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = m11512b(r2)
            r0.start(r2)
            return
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.stream.C2967c.mo8923a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo8924a(List<String> list) {
        if (list == null || list.size() <= 0) {
            mo8923a(this.f9225j.f9256b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String b : list) {
            String b2 = m11512b(b);
            if (b2 == null) {
                C7573i.m23580a();
            }
            arrayList.add(b2);
        }
        m11513j();
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.start((List<String>) arrayList);
        }
    }

    /* renamed from: a */
    public final void mo8925a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.pushVideoFrame(i, false, i3, i4, NormalGiftView.ALPHA_180, f9215q, j * 1000);
        }
    }

    /* renamed from: a */
    public final void mo8926a(boolean z) {
        this.f9226l = z;
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.setAudioMute(z);
        }
    }

    /* renamed from: j */
    private final void m11513j() {
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.startAudioCapture();
        }
    }

    /* renamed from: e */
    public final void mo8930e() {
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.startVideoCapture();
        }
    }

    /* renamed from: f */
    public final void mo8931f() {
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.stopVideoCapture();
        }
    }

    /* renamed from: g */
    public final IFilterManager mo8932g() {
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            return liveCore.getVideoFilterMgr();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo8917a() {
        if (this.f9221f != 2) {
            this.f9221f = 0;
        }
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.stop();
        }
        LiveCore liveCore2 = this.f9219d;
        if (liveCore2 != null) {
            liveCore2.stopAudioCapture();
        }
    }

    /* renamed from: b */
    public final void mo8927b() {
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.resume();
        }
        LiveCore liveCore2 = this.f9219d;
        if (liveCore2 != null) {
            liveCore2.setAudioMute(this.f9226l);
        }
        this.f9224i.removeCallbacks(this.f9228n);
    }

    /* renamed from: c */
    public final void mo8928c() {
        this.f9224i.postDelayed(this.f9228n, this.f9225j.f9269o);
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.setAudioMute(true);
        }
        LiveCore liveCore2 = this.f9219d;
        if (liveCore2 != null) {
            liveCore2.pause();
        }
    }

    /* renamed from: h */
    public final void mo8933h() {
        this.f9227m = !this.f9227m;
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.enableMirror(this.f9227m, true);
        }
    }

    /* renamed from: i */
    public final void mo8934i() {
        LiveCore liveCore = this.f9219d;
        int i = 1;
        if (liveCore != null) {
            Builder builder = liveCore.getBuilder();
            if (builder != null && builder.getVideoCaptureDevice() == 1) {
                i = 2;
            }
        }
        LiveCore liveCore2 = this.f9219d;
        if (liveCore2 != null) {
            liveCore2.switchVideoCapture(i);
        }
    }

    /* renamed from: k */
    private final void m11514k() {
        this.f9219d = m11515l().create();
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.setErrorListener(this.f9229o);
        }
        LiveCore liveCore2 = this.f9219d;
        if (liveCore2 != null) {
            liveCore2.setInfoListener(this.f9230p);
        }
        LiveCore liveCore3 = this.f9219d;
        if (liveCore3 != null) {
            liveCore3.enableMixer(true, true);
        }
        LiveCore liveCore4 = this.f9219d;
        if (liveCore4 != null) {
            liveCore4.enableMixer(false, true);
        }
    }

    /* renamed from: d */
    public final void mo8929d() {
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.enableMixer(true, false);
        }
        LiveCore liveCore2 = this.f9219d;
        if (liveCore2 != null) {
            liveCore2.enableMixer(false, false);
        }
        LiveCore liveCore3 = this.f9219d;
        if (liveCore3 != null) {
            liveCore3.stop();
        }
        LiveCore liveCore4 = this.f9219d;
        if (liveCore4 != null) {
            liveCore4.release();
        }
        this.f9219d = null;
        this.f9224i.removeCallbacksAndMessages(this);
        this.f9220e = null;
    }

    /* renamed from: l */
    private final Builder m11515l() {
        int i;
        String str;
        Builder builder = new Builder();
        builder.setUsingEffectCamera(false);
        builder.setEnableVideoEncodeAccelera(this.f9225j.f9266l);
        builder.setVideoProfile(this.f9225j.f9267m);
        builder.setLogMonitor(new C2970c(this));
        builder.setContext(this.f9225j.f9255a);
        builder.setProjectKey(this.f9225j.f9248F);
        builder.setUploadLogInterval(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        builder.setVideoFps(this.f9225j.f9261g);
        builder.setVideoBitrate(this.f9225j.f9258d * 1000);
        builder.setVideoMaxBitrate(this.f9225j.f9260f * 1000);
        builder.setVideoMinBitrate(this.f9225j.f9259e * 1000);
        builder.setVideoWidth(this.f9225j.f9264j);
        builder.setVideoHeight(this.f9225j.f9265k);
        builder.setVideoCaptureDevice(this.f9225j.f9276v);
        C3338l<Boolean> lVar = LiveConfigSettingKeys.LIVE_ENABLE_VE_CAMERA2;
        C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LIVE_ENABLE_VE_CAMERA2");
        Object a = lVar.mo10240a();
        C7573i.m23582a(a, "LiveConfigSettingKeys.LIVE_ENABLE_VE_CAMERA2.value");
        builder.setUsingVECamera2API(((Boolean) a).booleanValue());
        builder.setAudioChannel(2);
        builder.setAudioProfile(this.f9225j.f9271q);
        if (this.f9225j.f9271q == 1) {
            i = 128000;
        } else {
            i = 64000;
        }
        builder.setAudioBitrate(i);
        builder.setAudioCaptureChannel(2);
        builder.setAudioSampleHZ(this.f9225j.f9270p);
        builder.setAudioCaptureDevice(this.f9225j.f9277w);
        builder.setUsingLiveStreamAudioCapture(this.f9225j.f9247E);
        builder.setRtmpReconnectCounts(this.f9225j.f9268n);
        builder.setRtmpReconnectIntervalSeconds(5);
        builder.setVideoEncoder(this.f9225j.f9243A);
        builder.setEnableVideoBFrame(this.f9225j.f9280z);
        builder.setVideoGopSec(this.f9225j.f9279y);
        builder.setBitrateAdaptStrategy(this.f9225j.f9278x);
        builder.setRoiOn(this.f9225j.f9244B ? 1 : 0, true);
        builder.setRoiOn(this.f9225j.f9245C ? 1 : 0, false);
        if (this.f9225j.f9246D == null) {
            str = "";
        } else {
            str = this.f9225j.f9246D;
        }
        builder.setRoiAssetDir(str);
        builder.setBgMode(this.f9225j.f9254L);
        builder.setupSdkParams(this.f9225j.f9249G);
        builder.setAssetManager(this.f9225j.f9250H);
        builder.setEffectModePath(this.f9225j.f9252J);
        builder.setEffectResourceFinder(this.f9225j.f9251I);
        builder.setVideoCaptureWidth(this.f9225j.f9262h);
        builder.setVideoCaptureHeight(this.f9225j.f9263i);
        builder.setEffectAlgorithmAB(this.f9225j.f9253K);
        if (this.f9225j.f9275u != null) {
            builder.setScreenCaptureIntent(this.f9225j.f9275u);
        }
        return builder;
    }

    /* renamed from: a */
    public final void mo8920a(C2430b bVar) {
        this.f9220e = bVar;
    }

    /* renamed from: a */
    public final void mo8921a(ILiveStreamErrorListener iLiveStreamErrorListener) {
        C7573i.m23587b(iLiveStreamErrorListener, "listener");
        this.f9216a = iLiveStreamErrorListener;
    }

    public C2967c(C2977d dVar) {
        C7573i.m23587b(dVar, "config");
        this.f9225j = dVar;
        m11514k();
        this.f9218c.put("rtmp_type", String.valueOf(this.f9225j.f9257c));
    }

    /* renamed from: a */
    public final void mo9739a(int i) {
        this.f9224i.removeCallbacksAndMessages(this);
        C2430b bVar = this.f9220e;
        if (bVar != null) {
            bVar.mo8766a(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11512b(java.lang.String r5) {
        /*
            if (r5 == 0) goto L_0x009d
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r0 = "/"
            kotlin.text.Regex r1 = new kotlin.text.Regex
            r1.<init>(r0)
            r0 = 0
            java.util.List r5 = r1.split(r5, r0)
            boolean r1 = r5.isEmpty()
            r2 = 1
            if (r1 != 0) goto L_0x0044
            int r1 = r5.size()
            java.util.ListIterator r1 = r5.listIterator(r1)
        L_0x001f:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r1.previous()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0035
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            if (r3 != 0) goto L_0x001f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            int r1 = r1.nextIndex()
            int r1 = r1 + r2
            java.util.List r5 = kotlin.collections.C7525m.m23505c(r5, r1)
            goto L_0x0048
        L_0x0044:
            java.util.List r5 = kotlin.collections.C7525m.m23461a()
        L_0x0048:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x0095
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.Object[] r5 = r5.toArray(r1)
            if (r5 == 0) goto L_0x008d
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            int r3 = r5.length
            r4 = 2
            if (r3 < r4) goto L_0x006f
            int r3 = r5.length     // Catch:{ UnsupportedEncodingException -> 0x006f }
            int r3 = r3 - r2
            r3 = r5[r3]     // Catch:{ UnsupportedEncodingException -> 0x006f }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x006f }
            java.lang.String r4 = "URLEncoder.encode(urlPar…Parts.size - 1], \"UTF-8\")"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x006f }
            r1 = r3
        L_0x006f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r5.length
            int r4 = r4 - r2
        L_0x0076:
            if (r0 >= r4) goto L_0x0085
            r2 = r5[r0]
            r3.append(r2)
            java.lang.String r2 = "/"
            r3.append(r2)
            int r0 = r0 + 1
            goto L_0x0076
        L_0x0085:
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            goto L_0x009e
        L_0x008d:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r5.<init>(r0)
            throw r5
        L_0x0095:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.util.Collection<T>"
            r5.<init>(r0)
            throw r5
        L_0x009d:
            r5 = 0
        L_0x009e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.stream.C2967c.m11512b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void mo8919a(SurfaceView surfaceView) {
        C7573i.m23587b(surfaceView, "surfaceView");
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.setDisplay(surfaceView);
        }
    }

    /* renamed from: a */
    public final void mo8922a(ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        C7573i.m23587b(iTextureFrameAvailableListener, "listener");
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.setTextureFrameAvailableListener(iTextureFrameAvailableListener);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Client mo8916a(InteractConfig interactConfig, Boolean bool) {
        return mo9738a(interactConfig, bool.booleanValue());
    }

    /* renamed from: a */
    public final Client mo9738a(InteractConfig interactConfig, boolean z) {
        C7573i.m23587b(interactConfig, "config");
        C2324b a = C3596c.m13172a(IHostContext.class);
        C7573i.m23582a((Object) a, "ServiceManager.getServic…IHostContext::class.java)");
        interactConfig.setAppChannel(((IHostContext) a).getChannel());
        C2324b a2 = C3596c.m13172a(IHostContext.class);
        C7573i.m23582a((Object) a2, "ServiceManager.getServic…IHostContext::class.java)");
        interactConfig.setDeviceId(((IHostContext) a2).getServerDeviceId());
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            return liveCore.create(interactConfig, z);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo8918a(Bundle bundle, CatchVideoCallback catchVideoCallback) {
        C7573i.m23587b(bundle, "bundle");
        C7573i.m23587b(catchVideoCallback, "callback");
        LiveCore liveCore = this.f9219d;
        if (liveCore != null) {
            liveCore.catchVideo(bundle, catchVideoCallback);
        }
    }

    /* renamed from: a */
    public static String m11511a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("INFO (");
        sb.append(i);
        sb.append(',');
        sb.append(i2);
        sb.append(',');
        sb.append(i3);
        sb.append(") ");
        String sb2 = sb.toString();
        switch (i) {
            case 1:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("starting_publish");
                return sb3.toString();
            case 2:
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append("started_publish");
                return sb4.toString();
            case 3:
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb2);
                sb5.append("stoped_publish");
                return sb5.toString();
            case 4:
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb2);
                sb6.append("video_starting_capture");
                return sb6.toString();
            case 5:
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb2);
                sb7.append("video_started_capture");
                return sb7.toString();
            case 6:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(sb2);
                sb8.append("video_stoped_capture");
                return sb8.toString();
            case 7:
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb2);
                sb9.append("audio_starting_capture");
                return sb9.toString();
            case 8:
                StringBuilder sb10 = new StringBuilder();
                sb10.append(sb2);
                sb10.append("audio_started_capture");
                return sb10.toString();
            case 9:
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb2);
                sb11.append("audio_stoped_capture");
                return sb11.toString();
            case 10:
                StringBuilder sb12 = new StringBuilder();
                sb12.append(sb2);
                sb12.append("rtmp_connecting");
                return sb12.toString();
            case 11:
                StringBuilder sb13 = new StringBuilder();
                sb13.append(sb2);
                sb13.append("rtmp_connected");
                return sb13.toString();
            case 12:
                StringBuilder sb14 = new StringBuilder();
                sb14.append(sb2);
                sb14.append("rtmp_connect_fail");
                return sb14.toString();
            case 13:
                StringBuilder sb15 = new StringBuilder();
                sb15.append(sb2);
                sb15.append("network too weak");
                return sb15.toString();
            case 14:
                StringBuilder sb16 = new StringBuilder();
                sb16.append(sb2);
                sb16.append("rtmp_disconnected");
                return sb16.toString();
            case 15:
                StringBuilder sb17 = new StringBuilder();
                sb17.append(sb2);
                sb17.append("rtmp_reconnecting");
                return sb17.toString();
            case 16:
                StringBuilder sb18 = new StringBuilder();
                sb18.append(sb2);
                sb18.append("video_encoder_format_changed");
                return sb18.toString();
            default:
                StringBuilder sb19 = new StringBuilder();
                sb19.append(sb2);
                sb19.append("UNKONW???");
                return sb19.toString();
        }
    }
}
