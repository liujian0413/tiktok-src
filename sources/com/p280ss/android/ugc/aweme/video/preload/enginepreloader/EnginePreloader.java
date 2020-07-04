package com.p280ss.android.ugc.aweme.video.preload.enginepreloader;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.video.C43187ae;
import com.p280ss.android.ugc.aweme.video.C43193b;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.experiment.UsePrivateCachePathExperiment;
import com.p280ss.android.ugc.aweme.video.preload.C43270a;
import com.p280ss.android.ugc.aweme.video.preload.C43271b;
import com.p280ss.android.ugc.aweme.video.preload.C43273d;
import com.p280ss.android.ugc.aweme.video.preload.C43274e;
import com.p280ss.android.ugc.aweme.video.preload.C43281f;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoNetworkSpeedAlgorithmExperiment;
import com.p280ss.android.ugc.networkspeed.C44903d;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import com.p280ss.android.ugc.playerkit.videoview.p1752a.C44936a;
import com.p280ss.android.ugc.playerkit.videoview.p1754c.C44944a;
import com.p280ss.ttvideoengine.C46059d;
import com.p280ss.ttvideoengine.C46059d.C46061a;
import com.p280ss.ttvideoengine.C46087f;
import com.p280ss.ttvideoengine.TTVideoEngine;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader */
public final class EnginePreloader implements C43271b {

    /* renamed from: a */
    public static final boolean f112011a = C7163a.m22363a();

    /* renamed from: b */
    public WeakReference<C43270a> f112012b;

    /* renamed from: c */
    public Map<String, List<C43281f>> f112013c = new LinkedHashMap<String, List<C43281f>>() {
        /* access modifiers changed from: protected */
        public final boolean removeEldestEntry(Entry entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: d */
    private volatile boolean f112014d;

    /* renamed from: e */
    private int f112015e;

    /* renamed from: f */
    private boolean f112016f;

    /* renamed from: g */
    private C43273d f112017g;

    /* renamed from: h */
    private File f112018h;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader$CDNLog */
    public static class CDNLog {
        @C6593c(mo15949a = "contentLength")
        public long contentLength;
        @C6593c(mo15949a = "f_key")
        public String fileKey;
        @C6593c(mo15949a = "url")
        public String finalUrl;
        @C6593c(mo15949a = "host")
        public String host;
        @C6593c(mo15949a = "req_end_t")
        public long reqEndT;
        @C6593c(mo15949a = "req_start_t")
        public long reqStartT;
        @C6593c(mo15949a = "server_ip")
        public String serverIp;
        @C6593c(mo15949a = "status_code")
        public int statusCode;
        @C6593c(mo15949a = "ttfb")
        public long ttfb;
        @C6593c(mo15949a = "x_cache")
        public String xCache;
        @C6593c(mo15949a = "x_m_cache")
        public String xMCache;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader$a */
    static class C43280a {

        /* renamed from: a */
        public static final EnginePreloader f112030a = new EnginePreloader();
    }

    /* renamed from: g */
    public static EnginePreloader m137281g() {
        return C43280a.f112030a;
    }

    /* renamed from: a */
    public final Object mo105021a(VideoUrlModel videoUrlModel, String str, String[] strArr) {
        return null;
    }

    /* renamed from: d */
    public final C43273d mo105032d() {
        return this.f112017g;
    }

    /* renamed from: e */
    public final C43274e mo105034e(VideoUrlModel videoUrlModel) {
        return null;
    }

    /* renamed from: e */
    public final String mo105035e() {
        return "engine";
    }

    /* renamed from: f */
    public final File mo105037f() {
        return this.f112018h;
    }

    /* renamed from: h */
    public final List<C43187ae> mo105039h(VideoUrlModel videoUrlModel) {
        return null;
    }

    /* renamed from: b */
    public final void mo105028b() {
        C46059d.m144301a().mo112187f();
    }

    /* renamed from: c */
    public final void mo105030c() {
        C46059d.m144301a().mo112189g();
    }

    /* renamed from: h */
    private String m137282h() {
        File file;
        Context a = C6399b.m19921a();
        if (a == null) {
            return null;
        }
        boolean z = true;
        try {
            if (C6384b.m19835a().mo15287a(UsePrivateCachePathExperiment.class, true, "player_cache_use_private_path", C6384b.m19835a().mo15295d().player_cache_use_private_path, 1) != 1) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (!C7276d.m22826g() || z) {
            file = a.getCacheDir();
        } else {
            file = C7276d.m22809b(a);
        }
        if (C7163a.m22363a()) {
            file = C7276d.m22809b(a);
        }
        if (file == null) {
            return null;
        }
        File file2 = new File(file, "cachev2");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.f112018h = file2;
        return file2.getAbsolutePath();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0238 A[SYNTHETIC, Splitter:B:26:0x0238] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo105023a() {
        /*
            r10 = this;
            java.lang.String r0 = r10.m137282h()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x026c
            boolean r1 = com.p280ss.android.ugc.aweme.video.preload.C43283g.m137315a()     // Catch:{ Exception -> 0x0266 }
            if (r1 == 0) goto L_0x002e
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.VideoCacheLoaderTypeExperiment> r3 = com.p280ss.android.ugc.aweme.video.experiment.VideoCacheLoaderTypeExperiment.class
            r4 = 1
            java.lang.String r5 = "videocache_loader_type"
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r1 = r1.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r6 = r1.videocache_loader_type     // Catch:{ Exception -> 0x0266 }
            r7 = 0
            int r1 = r2.mo15287a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 <= 0) goto L_0x002e
            r2 = 5
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r2, r1)     // Catch:{ Exception -> 0x0266 }
        L_0x002e:
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.experiment.PlayerPreloadLazyGetUrlsExperiment> r2 = com.p280ss.android.ugc.aweme.video.preload.experiment.PlayerPreloadLazyGetUrlsExperiment.class
            r3 = 1
            java.lang.String r4 = "player_preload_lazy_get_urls"
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r5 = r5.mo15295d()     // Catch:{ Exception -> 0x0266 }
            boolean r5 = r5.player_preload_lazy_get_urls     // Catch:{ Exception -> 0x0266 }
            r6 = 1
            boolean r1 = r1.mo15292a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0266 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0053
            boolean r1 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ Exception -> 0x0266 }
            if (r1 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r1 = 0
            goto L_0x0054
        L_0x0053:
            r1 = 1
        L_0x0054:
            r10.f112016f = r1     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.experiment.VideoSpeedQueueSizeExperiment> r5 = com.p280ss.android.ugc.aweme.video.preload.experiment.VideoSpeedQueueSizeExperiment.class
            r6 = 1
            java.lang.String r7 = "video_speed_queue_size"
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r1 = r1.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r1.video_speed_queue_size     // Catch:{ Exception -> 0x0266 }
            r9 = 10
            int r1 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            int r4 = com.p280ss.android.ugc.networkspeed.C44903d.f115471c     // Catch:{ Exception -> 0x0266 }
            if (r4 == r1) goto L_0x007e
            if (r1 <= 0) goto L_0x007e
            com.p280ss.android.ugc.networkspeed.C44903d.f115471c = r1     // Catch:{ Exception -> 0x0266 }
            com.ss.android.ugc.networkspeed.d r4 = com.p280ss.android.ugc.networkspeed.C44903d.m141655a()     // Catch:{ Exception -> 0x0266 }
            r4.mo107376a(r1)     // Catch:{ Exception -> 0x0266 }
        L_0x007e:
            r1 = 30
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.PlayerDataEncryptExperiment> r5 = com.p280ss.android.ugc.aweme.video.experiment.PlayerDataEncryptExperiment.class
            r6 = 1
            java.lang.String r7 = "player_data_encrpt"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.player_data_encrpt     // Catch:{ Exception -> 0x0266 }
            r9 = 1
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 16
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.VideoCacheP2pLevelExperiment> r5 = com.p280ss.android.ugc.aweme.video.experiment.VideoCacheP2pLevelExperiment.class
            r6 = 1
            java.lang.String r7 = "videocache_p2p_level"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.videocache_p2p_level     // Catch:{ Exception -> 0x0266 }
            r9 = 0
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 15
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r3)     // Catch:{ Exception -> 0x0266 }
            r1 = 93
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.medialoader.PlayerAbMedialoaderEnableBenchmarkExp> r5 = com.p280ss.android.ugc.aweme.player.p334ab.abs.medialoader.PlayerAbMedialoaderEnableBenchmarkExp.class
            r6 = 1
            java.lang.String r7 = "player_medialoader_enable_benchmark_io"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.player_medialoader_enable_benchmark_io     // Catch:{ Exception -> 0x0266 }
            r9 = 0
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 94
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.medialoader.PlayerAbMedialoaderEnableSpeedCoefficientExp> r5 = com.p280ss.android.ugc.aweme.player.p334ab.abs.medialoader.PlayerAbMedialoaderEnableSpeedCoefficientExp.class
            r6 = 1
            java.lang.String r7 = "player_medialoader_enable_speed_coefficient"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.player_medialoader_enable_speed_coefficient     // Catch:{ Exception -> 0x0266 }
            r9 = 0
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 3
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderOpenTimeoutExperiment> r5 = com.p280ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderOpenTimeoutExperiment.class
            r6 = 1
            java.lang.String r7 = "engine_preloader_open_timeout"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.engine_preloader_open_timeout     // Catch:{ Exception -> 0x0266 }
            r9 = 10
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 2
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderRWTimeoutExperiment> r5 = com.p280ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderRWTimeoutExperiment.class
            r6 = 1
            java.lang.String r7 = "engine_preloader_rw_timeout"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.engine_preloader_rw_timeout     // Catch:{ Exception -> 0x0266 }
            r9 = 10
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 11
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderConcurrentNumExperiment> r5 = com.p280ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderConcurrentNumExperiment.class
            r6 = 1
            java.lang.String r7 = "engine_preloader_concurrent_num"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.engine_preloader_concurrent_num     // Catch:{ Exception -> 0x0266 }
            r9 = 1
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 80
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderStackOrQueueExperiment> r5 = com.p280ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderStackOrQueueExperiment.class
            r6 = 1
            java.lang.String r7 = "engine_preloader_queue_or_stack"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.engine_preloader_queue_or_stack     // Catch:{ Exception -> 0x0266 }
            r9 = 1
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 12
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderPreloadStrategyExperiment> r5 = com.p280ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderPreloadStrategyExperiment.class
            r6 = 1
            java.lang.String r7 = "engine_preloader_preload_strategy"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.engine_preloader_preload_strategy     // Catch:{ Exception -> 0x0266 }
            r9 = 1
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 13
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.PlayerAbChecksumLevelExp> r5 = com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayerAbChecksumLevelExp.class
            r6 = 1
            java.lang.String r7 = "checksum_level"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.checksum_level     // Catch:{ Exception -> 0x0266 }
            r9 = 0
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 14
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.PlayerAbTestSpeedVersionExp> r5 = com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayerAbTestSpeedVersionExp.class
            r6 = 1
            java.lang.String r7 = "player_test_speed_version"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.player_test_speed_version     // Catch:{ Exception -> 0x0266 }
            r9 = 2
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 90
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.dnstype.PlayerAbMainDnsTypeExp> r5 = com.p280ss.android.ugc.aweme.player.p334ab.abs.dnstype.PlayerAbMainDnsTypeExp.class
            r6 = 1
            java.lang.String r7 = "player_ab_main_dns_type"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.player_ab_main_dns_type     // Catch:{ Exception -> 0x0266 }
            r9 = 0
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 91
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.dnstype.PlayerAbBackupDnsTypeExp> r5 = com.p280ss.android.ugc.aweme.player.p334ab.abs.dnstype.PlayerAbBackupDnsTypeExp.class
            r6 = 1
            java.lang.String r7 = "player_ab_backup_dns_type"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.player_ab_backup_dns_type     // Catch:{ Exception -> 0x0266 }
            r9 = 3
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 92
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.dnstype.PlayerAbMainDnsDelayTimeExp> r5 = com.p280ss.android.ugc.aweme.player.p334ab.abs.dnstype.PlayerAbMainDnsDelayTimeExp.class
            r6 = 1
            java.lang.String r7 = "player_ab_main_dns_timeout"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Exception -> 0x0266 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Exception -> 0x0266 }
            int r8 = r8.player_ab_main_dns_timeout     // Catch:{ Exception -> 0x0266 }
            r9 = 0
            int r4 = r4.mo15287a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r1, r4)     // Catch:{ Exception -> 0x0266 }
            r1 = 0
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Throwable -> 0x0236 }
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderConfigExperiment> r5 = com.p280ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderConfigExperiment.class
            r6 = 1
            java.lang.String r7 = "engine_preload_config"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ Throwable -> 0x0236 }
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()     // Catch:{ Throwable -> 0x0236 }
            com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloaderConfig r8 = r8.engine_preload_config     // Catch:{ Throwable -> 0x0236 }
            java.lang.Class<com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloaderConfig> r9 = com.p280ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloaderConfig.class
            java.lang.Object r4 = r4.mo15290a(r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0236 }
            com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloaderConfig r4 = (com.p280ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloaderConfig) r4     // Catch:{ Throwable -> 0x0236 }
            r1 = r4
        L_0x0236:
            if (r1 != 0) goto L_0x023d
            com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloaderConfig r1 = new com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloaderConfig     // Catch:{ Exception -> 0x0266 }
            r1.<init>()     // Catch:{ Exception -> 0x0266 }
        L_0x023d:
            r4 = 7
            int r5 = r1.enableExternDns     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r4, r5)     // Catch:{ Exception -> 0x0266 }
            r4 = 8
            int r5 = r1.enableSocketReuse     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r4, r5)     // Catch:{ Exception -> 0x0266 }
            r4 = 9
            int r1 = r1.enableSocketIdleTimeout     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setIntValue(r4, r1)     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setStringValue(r3, r0)     // Catch:{ Exception -> 0x0266 }
            com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader$2 r0 = new com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader$2     // Catch:{ Exception -> 0x0266 }
            r0.<init>()     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.setDataLoaderListener(r0)     // Catch:{ Exception -> 0x0266 }
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Exception -> 0x0266 }
            com.p280ss.ttvideoengine.TTVideoEngine.startDataLoader(r0)     // Catch:{ Exception -> 0x0266 }
            r10.f112014d = r2     // Catch:{ Exception -> 0x0266 }
            goto L_0x026c
        L_0x0266:
            r0 = move-exception
            java.lang.String r1 = "checkInit fail."
            com.bytedance.p066a.p067a.p070b.p072b.C2077a.m9161a(r0, r1)
        L_0x026c:
            boolean r0 = r10.f112014d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.mo105023a():boolean");
    }

    /* renamed from: a */
    public final void mo105022a(C43270a aVar) {
        this.f112012b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final long mo105020a(String str) {
        C46061a m = C46059d.m144301a().mo112195m(str);
        if (m != null) {
            return m.f117716c;
        }
        return 0;
    }

    /* renamed from: b */
    public final long mo105027b(String str) {
        C46061a m = C46059d.m144301a().mo112195m(str);
        if (m != null) {
            return m.f117715b;
        }
        return 0;
    }

    /* renamed from: c */
    public final boolean mo105031c(VideoUrlModel videoUrlModel) {
        return mo105025a(videoUrlModel, 0);
    }

    /* renamed from: d */
    public final void mo105033d(VideoUrlModel videoUrlModel) {
        String str;
        if (videoUrlModel != null) {
            if (TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
                str = videoUrlModel.getBitRatedRatioUri();
            } else {
                str = videoUrlModel.getDashVideoId();
            }
            C46059d.m144301a().mo112191i(str);
        }
    }

    /* renamed from: g */
    public final List<C43281f> mo105038g(VideoUrlModel videoUrlModel) {
        String str;
        if (TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            str = videoUrlModel.getBitRatedRatioUri();
        } else {
            str = videoUrlModel.getDashVideoId();
        }
        return (List) this.f112013c.get(str);
    }

    /* renamed from: a */
    public final boolean mo105024a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return false;
        }
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            C46083h b = C43193b.m136956b(videoUrlModel.getDashVideoId());
            if (b == null || C43193b.m136952a(b) <= 0) {
                return false;
            }
            return true;
        } else if (C46059d.m144301a().mo112195m(bitRatedRatioUri) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final int mo105026b(VideoUrlModel videoUrlModel) {
        long j;
        if (videoUrlModel == null) {
            return 0;
        }
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            C46083h b = C43193b.m136956b(videoUrlModel.getDashVideoId());
            if (b != null) {
                return (int) C43193b.m136952a(b);
            }
            return 0;
        }
        C46061a m = C46059d.m144301a().mo112195m(bitRatedRatioUri);
        if (m != null) {
            j = m.f117716c;
        } else {
            j = 0;
        }
        return (int) j;
    }

    /* renamed from: f */
    public final C43281f mo105036f(VideoUrlModel videoUrlModel) {
        String str;
        if (TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            str = videoUrlModel.getBitRatedRatioUri();
        } else {
            str = videoUrlModel.getDashVideoId();
        }
        if (TextUtils.isEmpty(str) || !this.f112013c.containsKey(str)) {
            return null;
        }
        List list = (List) this.f112013c.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (C43281f) list.get(list.size() - 1);
    }

    /* renamed from: b */
    public final void mo105029b(C43270a aVar) {
        if (this.f112012b != null && this.f112012b.get() == aVar) {
            this.f112012b = null;
        }
    }

    /* renamed from: b */
    public final void mo105040b(long j, long j2) {
        if (j > 0 && j2 > 0) {
            if (this.f112017g == null) {
                this.f112017g = new C43273d();
            }
            this.f112017g.f112007b = j;
            this.f112017g.f112006a = j2;
        }
    }

    /* renamed from: a */
    public static void m137280a(long j, long j2) {
        if (j > 0) {
            if (j2 > 0 && C6384b.m19835a().mo15287a(VideoNetworkSpeedAlgorithmExperiment.class, true, "video_network_speed_algorithm", C6384b.m19835a().mo15295d().video_network_speed_algorithm, 0) == 2) {
                C44903d.m141655a().mo107380e();
            } else if (j2 > 0) {
                double d = (double) j;
                Double.isNaN(d);
                double d2 = 8.0d * d;
                double d3 = (double) j2;
                Double.isNaN(d3);
                C44903d.m141655a().mo107375a(d2 / (d3 / 1000.0d), d, j2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo105025a(final VideoUrlModel videoUrlModel, int i) {
        int i2;
        StringBuilder sb = new StringBuilder("preload id:");
        sb.append(videoUrlModel.getSourceId());
        sb.append(", size:");
        sb.append(i);
        sb.append(", key:");
        sb.append(videoUrlModel.getBitRatedRatioUri());
        if (!this.f112014d || videoUrlModel == null) {
            return false;
        }
        if ((i == -1 || i == 0) && this.f112015e > 0) {
            i2 = this.f112015e;
        } else {
            i2 = i;
        }
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoModelStr())) {
            try {
                C46083h a = C43193b.m136954a(videoUrlModel.getDashVideoModelStr());
                if (a == null || a.f117858d == null) {
                    return false;
                }
                videoUrlModel.setDashVideoId(a.f117858d.f117888f);
                C43193b.m136955a(a.f117858d.f117888f, a);
                TTVideoEngine.addTask(a, TTVideoEngine.findBestResolution(a, C43193b.m136953a(), 1), (long) i);
                return false;
            } catch (Throwable unused) {
                return false;
            }
        } else if (!this.f112016f) {
            C44936a b = C44944a.m141816a().mo107453f(videoUrlModel.getBitRatedRatioUri()).mo107469b(videoUrlModel, C44917a.m141692r().mo105098a(), false);
            if (b.f115600a == null || b.f115600a.length <= 0) {
                return false;
            }
            new StringBuilder("preload uri:").append(b.f115602c);
            C44925a.m141730a().mo107406a(b.f115602c, b.f115604e);
            TTVideoEngine.addTask(b.f115602c, b.f115602c, b.f115600a, (long) i2);
            return true;
        } else {
            String uri = videoUrlModel.getUri();
            TTVideoEngine.addTask(uri, uri, (long) i2, (C46087f) new C46087f() {

                /* renamed from: a */
                C44936a f112027a;

                /* renamed from: b */
                public final String mo105052b() {
                    if (this.f112027a == null) {
                        mo105051a();
                    }
                    if (this.f112027a != null) {
                        return this.f112027a.f115602c;
                    }
                    return null;
                }

                /* renamed from: a */
                public final String[] mo105051a() {
                    if (this.f112027a == null) {
                        this.f112027a = C44944a.m141816a().mo107453f(videoUrlModel.getBitRatedRatioUri()).mo107469b(videoUrlModel, C44917a.m141692r().mo105098a(), false);
                    }
                    if (this.f112027a != null) {
                        return this.f112027a.f115600a;
                    }
                    return null;
                }
            });
            return false;
        }
    }
}
