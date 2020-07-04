package com.p280ss.android.ugc.aweme.video.preload;

import android.text.TextUtils;
import android.util.LruCache;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.storage.C12918a;
import com.bytedance.storage.C12920c;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.setting.C37653j;
import com.p280ss.android.ugc.aweme.video.C43186ad;
import com.p280ss.android.ugc.aweme.video.C43187ae;
import com.p280ss.android.ugc.aweme.video.C43269p;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import com.p280ss.android.ugc.aweme.video.experiment.GatherModeExperiment;
import com.p280ss.android.ugc.aweme.video.p1700d.C43206a;
import com.p280ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.p280ss.android.ugc.aweme.video.preload.experiment.H265PlayAddrPolicyUnifyExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.playerkit.C44911b;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.preload.j */
public final class C43305j implements C43271b {

    /* renamed from: a */
    private volatile boolean f112112a;

    /* renamed from: b */
    private C43271b f112113b;

    /* renamed from: c */
    private LruCache<String, Long> f112114c;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.j$a */
    static class C43308a {

        /* renamed from: a */
        static final C43305j f112117a = new C43305j();
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.j$b */
    static class C43309b implements C12918a {
        private C43309b() {
        }

        /* renamed from: a */
        public final String mo31399a() {
            return "CACHE";
        }

        /* renamed from: b */
        public final boolean mo31400b() {
            C43305j.m137386g().mo105089h().mo105030c();
            return true;
        }

        /* renamed from: c */
        public final File mo31401c() {
            return C43305j.m137386g().mo105089h().mo105037f();
        }

        /* renamed from: d */
        public final long mo31402d() {
            File c = mo31401c();
            if (c == null || !c.exists()) {
                return 0;
            }
            return C7276d.m22817d(c.getAbsolutePath());
        }
    }

    /* renamed from: g */
    public static C43305j m137386g() {
        return C43308a.f112117a;
    }

    /* renamed from: a */
    public final boolean mo105024a(VideoUrlModel videoUrlModel) {
        return mo105089h().mo105024a(videoUrlModel);
    }

    /* renamed from: a */
    public final boolean mo105023a() {
        return mo105089h().mo105023a();
    }

    /* renamed from: a */
    public final boolean mo105025a(VideoUrlModel videoUrlModel, int i) {
        if (!C43272c.m137279a()) {
            return false;
        }
        return mo105089h().mo105025a(videoUrlModel, i);
    }

    /* renamed from: j */
    public static void m137387j() {
        C6877n.m21444a("aweme_media_play_stastics_log", 0, (JSONObject) null);
    }

    /* renamed from: k */
    public static void m137388k() {
        C6877n.m21444a("aweme_media_play_stastics_log", 1, (JSONObject) null);
    }

    /* renamed from: b */
    public final void mo105028b() {
        mo105089h().mo105028b();
    }

    /* renamed from: c */
    public final void mo105030c() {
        mo105089h().mo105030c();
    }

    /* renamed from: i */
    public final C43271b mo105091i() {
        return mo105089h();
    }

    private C43305j() {
        this.f112114c = new LruCache<>(1048576);
    }

    /* renamed from: d */
    public final C43273d mo105032d() {
        return mo105089h().mo105032d();
    }

    /* renamed from: e */
    public final String mo105035e() {
        return mo105089h().mo105035e();
    }

    /* renamed from: f */
    public final File mo105037f() {
        return mo105089h().mo105037f();
    }

    /* renamed from: h */
    public final C43271b mo105089h() {
        if (!this.f112112a) {
            synchronized (this) {
                if (this.f112113b == null) {
                    if (C43220a.m137073b() == 2) {
                        this.f112113b = EnginePreloader.m137281g();
                    } else {
                        this.f112113b = C43284h.m137323g();
                    }
                    this.f112113b.mo105023a();
                    C12920c.m37606a((C12918a) new C43309b());
                    this.f112112a = true;
                }
            }
        }
        return this.f112113b;
    }

    /* renamed from: a */
    public final void mo105085a(Aweme aweme) {
        m137381a(aweme, -1);
    }

    /* renamed from: d */
    public final void mo105033d(VideoUrlModel videoUrlModel) {
        mo105089h().mo105033d(videoUrlModel);
    }

    /* renamed from: a */
    public final long mo105020a(String str) {
        return mo105089h().mo105020a(str);
    }

    /* renamed from: b */
    public final int mo105026b(VideoUrlModel videoUrlModel) {
        return mo105089h().mo105026b(videoUrlModel);
    }

    /* renamed from: c */
    public final long mo105088c(String str) {
        return mo105089h().mo105020a(str);
    }

    /* renamed from: e */
    public final C43274e mo105034e(VideoUrlModel videoUrlModel) {
        return mo105089h().mo105034e(videoUrlModel);
    }

    /* renamed from: f */
    public final C43281f mo105036f(VideoUrlModel videoUrlModel) {
        return mo105091i().mo105036f(videoUrlModel);
    }

    /* renamed from: g */
    public final List<C43281f> mo105038g(VideoUrlModel videoUrlModel) {
        return mo105091i().mo105038g(videoUrlModel);
    }

    /* renamed from: h */
    public final List<C43187ae> mo105039h(VideoUrlModel videoUrlModel) {
        return mo105091i().mo105039h(videoUrlModel);
    }

    /* renamed from: j */
    public final int mo105092j(VideoUrlModel videoUrlModel) {
        return mo105089h().mo105026b(videoUrlModel);
    }

    /* renamed from: k */
    public final C43274e mo105093k(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null) {
            return mo105089h().mo105034e(videoUrlModel);
        }
        return null;
    }

    /* renamed from: b */
    public final long mo105027b(String str) {
        return mo105089h().mo105027b(str);
    }

    /* renamed from: c */
    public final boolean mo105031c(VideoUrlModel videoUrlModel) {
        if (!C43272c.m137279a()) {
            return false;
        }
        return mo105089h().mo105031c(videoUrlModel);
    }

    /* renamed from: i */
    public final long mo105090i(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null) {
            return mo105089h().mo105027b(videoUrlModel.getBitRatedRatioUri());
        }
        return -1;
    }

    /* renamed from: c */
    private static VideoUrlModel m137385c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return null;
        }
        VideoUrlModel properPlayAddr = video.getProperPlayAddr();
        if (properPlayAddr == null) {
            return null;
        }
        properPlayAddr.setRatio(video.getRatio());
        if (!C44911b.m141671a((UrlModel) properPlayAddr)) {
            return null;
        }
        return properPlayAddr;
    }

    /* renamed from: b */
    public final void mo105087b(Aweme aweme) {
        VideoUrlModel c = m137385c(aweme);
        if (c != null) {
            mo105089h().mo105033d(c);
        }
    }

    /* renamed from: l */
    public final void mo105094l(VideoUrlModel videoUrlModel) {
        if (this.f112114c.get(videoUrlModel.getUri()) != null) {
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    C43305j.m137387j();
                    return null;
                }
            }, (Executor) C6907h.m21516a());
        } else {
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    C43305j.m137388k();
                    return null;
                }
            }, (Executor) C6907h.m21516a());
        }
    }

    /* renamed from: b */
    public final void mo105029b(C43270a aVar) {
        if (this.f112113b != null) {
            mo105089h().mo105029b(aVar);
        }
    }

    /* renamed from: a */
    public final void mo105022a(C43270a aVar) {
        if (this.f112113b != null) {
            mo105089h().mo105022a(aVar);
        }
    }

    /* renamed from: a */
    public static void m137382a(List<Aweme> list, int i) {
        if (list != null && list.size() != 0 && list.size() > 0) {
            m137386g().mo105085a((Aweme) list.get(0));
        }
    }

    /* renamed from: a */
    private void m137383a(Aweme[] awemeArr, int i) {
        if (awemeArr != null && awemeArr.length > 0) {
            for (Aweme a : awemeArr) {
                m137381a(a, i);
            }
        }
    }

    /* renamed from: a */
    private void m137381a(Aweme aweme, int i) {
        VideoUrlModel videoUrlModel;
        boolean z;
        if (aweme != null && !aweme.isLive() && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C43272c.m137279a()) {
            if (C6384b.m19835a().mo15292a(H265PlayAddrPolicyUnifyExperiment.class, true, "h265_play_addr_policy_unify", C6384b.m19835a().mo15295d().h265_play_addr_policy_unify, true)) {
                videoUrlModel = C43269p.m137255a(aweme.getVideo(), C44917a.m141692r().mo105098a());
            } else {
                videoUrlModel = aweme.getVideo().getProperPlayAddr();
            }
            if (videoUrlModel != null && C43206a.m136998b()) {
                videoUrlModel.setSourceId(aweme.getAid());
                videoUrlModel.setRatio(aweme.getVideo().getRatio());
                if (!TextUtils.isEmpty(aweme.getVideo().getVideoModelStr())) {
                    videoUrlModel.setDashVideoModelStr(aweme.getVideo().getVideoModelStr());
                    C7163a.m22363a();
                }
                if (C44911b.m141671a((UrlModel) videoUrlModel)) {
                    if (i < 0) {
                        z = mo105089h().mo105031c(videoUrlModel);
                    } else {
                        z = mo105089h().mo105025a(videoUrlModel, i);
                    }
                    if (z) {
                        this.f112114c.put(videoUrlModel.getUri(), Long.valueOf(0));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final Object mo105021a(VideoUrlModel videoUrlModel, String str, String[] strArr) {
        return mo105089h().mo105021a(videoUrlModel, str, strArr);
    }

    /* renamed from: a */
    public final void mo105086a(boolean z, int i, List<Aweme> list, List<PreloadTask> list2) {
        if ((C6384b.m19835a().mo15287a(GatherModeExperiment.class, true, "gather_mode", C6384b.m19835a().mo15295d().gather_mode, 0) != 2 || !C43186ad.m136940a()) && C43272c.m137279a()) {
            for (PreloadTask preloadTask : list2) {
                if (preloadTask.count > 0 && preloadTask.offset >= 0) {
                    if (C37653j.f98123a.mo94945b() == 2) {
                        preloadTask.count = 1;
                    }
                    m137383a(m137384a(z, list, preloadTask.count, i, preloadTask.offset), preloadTask.getVideoPreloadSize());
                }
            }
        }
    }

    /* renamed from: a */
    private static Aweme[] m137384a(boolean z, List<Aweme> list, int i, int i2, int i3) {
        Aweme[] awemeArr = new Aweme[i];
        int i4 = 0;
        if (z) {
            while (i4 < awemeArr.length) {
                int i5 = i2 + 1 + i4 + i3;
                if (i5 < list.size()) {
                    awemeArr[i4] = (Aweme) list.get(i5);
                }
                i4++;
            }
        } else {
            while (i4 < awemeArr.length) {
                int i6 = ((i2 - 1) - i4) - i3;
                if (i6 >= 0 && i6 < list.size()) {
                    awemeArr[i4] = (Aweme) list.get(i6);
                }
                i4++;
            }
        }
        return awemeArr;
    }
}
