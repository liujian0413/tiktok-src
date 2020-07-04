package com.p280ss.android.ugc.aweme.video;

import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.Surface;
import bolts.C1592h;
import com.bytedance.apm.C6159b;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.google.common.cache.C17473b;
import com.google.common.cache.C17474c;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.symphony.C25155g;
import com.p280ss.android.ugc.aweme.feed.helper.C28428o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayeAbPrecreateplayerExp;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34971a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34972b;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34974d;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34969e;
import com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34982c;
import com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34989d;
import com.p280ss.android.ugc.aweme.video.experiment.EnableH265BlackListExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerEventLogExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerFramesWaitExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerManagerBackgroundCheckSetting;
import com.p280ss.android.ugc.aweme.video.experiment.PreloadProcessDataExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.TTPlayerAsyncInitExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.H265PlayAddrPolicyUnifyExperiment;
import com.p280ss.android.ugc.playerkit.C44906a;
import com.p280ss.android.ugc.playerkit.C44911b;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import com.p280ss.android.ugc.playerkit.model.C44923g;
import com.p280ss.android.ugc.playerkit.model.C44924h;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.p280ss.android.ugc.playerkit.p1750a.C44907a;
import com.p280ss.android.ugc.playerkit.p1750a.C44910d;
import com.p280ss.android.ugc.playerkit.p1751b.C44913b;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import com.p280ss.android.ugc.playerkit.session.Session;
import com.p280ss.android.ugc.playerkit.videoview.C44943c;
import com.p280ss.android.ugc.playerkit.videoview.p1754c.C44944a;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.v */
public class C43316v extends C43268o implements C43222g, C44907a {

    /* renamed from: e */
    private static C43316v f112124e;

    /* renamed from: s */
    private static final int f112125s = C10292j.m30480a().mo25012a(PlayerManagerBackgroundCheckSetting.class, "playermanager_background_check", C6384b.m19835a().mo15294c().getPlayermanagerBackgroundCheck());

    /* renamed from: t */
    private static LruCache<String, C43179a> f112126t = new LruCache<String, C43179a>(100) {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
            return 1;
        }
    };

    /* renamed from: b */
    public volatile boolean f112127b;

    /* renamed from: c */
    public Session f112128c;

    /* renamed from: d */
    private boolean f112129d;

    /* renamed from: f */
    private C34974d f112130f;

    /* renamed from: g */
    private VideoUrlModel f112131g;

    /* renamed from: h */
    private volatile boolean f112132h;

    /* renamed from: i */
    private final C25155g f112133i;

    /* renamed from: j */
    private Type f112134j;

    /* renamed from: k */
    private int f112135k;

    /* renamed from: l */
    private boolean f112136l;

    /* renamed from: m */
    private boolean f112137m;

    /* renamed from: n */
    private C34971a f112138n;

    /* renamed from: o */
    private C34972b f112139o;

    /* renamed from: p */
    private boolean f112140p;

    /* renamed from: q */
    private C17473b<VideoUrlModel, C44924h> f112141q;

    /* renamed from: r */
    private boolean f112142r;

    /* renamed from: E */
    public final boolean mo104925E() {
        return this.f112129d;
    }

    /* renamed from: p */
    public final boolean mo104917p() {
        return this.f112132h;
    }

    /* renamed from: r */
    public final VideoUrlModel mo104919r() {
        return this.f112131g;
    }

    /* renamed from: s */
    public final boolean mo104920s() {
        return this.f112127b;
    }

    /* renamed from: a */
    public final void mo104939a(C34976f fVar) {
        this.f112130f.mo88624a(fVar);
    }

    /* renamed from: a */
    public final void mo104934a(Video video, boolean z) {
        mo104935a(video, z, 0);
    }

    /* renamed from: a */
    public final void mo104935a(Video video, boolean z, int i) {
        m137456a(video, z, i, true);
    }

    /* renamed from: a */
    public final void mo104936a(Video video, boolean z, int i, boolean z2, boolean z3) {
        if (TextUtils.isEmpty(video.getVideoModelStr()) || !z3) {
            m137458a(m137463b(video), z, false, PrepareConfig.Normal, i, z2, video.isNeedSetCookie(), false);
            return;
        }
        m137457a(video, z, false, PrepareConfig.Normal, i, z2);
    }

    /* renamed from: a */
    public final void mo104938a(VideoUrlModel videoUrlModel, boolean z, boolean z2, boolean z3) {
        m137459a(videoUrlModel, true, true, PrepareConfig.Normal, z3);
    }

    /* renamed from: a */
    public final void mo104937a(VideoUrlModel videoUrlModel, boolean z) {
        this.f112129d = false;
        this.f112131g = videoUrlModel;
        C44925a.m141730a().mo107410d(videoUrlModel.getUri()).urlModel = videoUrlModel;
        C44925a.m141730a().mo107406a(videoUrlModel.getUri(), videoUrlModel.getFileCheckSum());
        m137461a(m137464b(videoUrlModel, false), m137471e(videoUrlModel), videoUrlModel, false, PrepareConfig.Normal, videoUrlModel.isVr(), videoUrlModel.isH265(), m137469d(videoUrlModel), true, false, z);
    }

    /* renamed from: a */
    public final void mo104931a(Video video) {
        boolean z = false;
        this.f112129d = false;
        this.f112131g = video.getPlayAddr();
        C46083h a = C43193b.m136954a(video.getVideoModelStr());
        if (a != null && a.f117858d != null) {
            String str = a.f117858d.f117888f;
            C43193b.m136955a(str, a);
            this.f112131g.setDashVideoId(str);
            this.f112131g.setDashVideoModelStr(video.getVideoModelStr());
            Session d = C44925a.m141730a().mo107410d(str);
            String sourceId = video.getPlayAddr().getSourceId();
            d.urlModel = this.f112131g;
            C44923g gVar = new C44923g(null, null, C6399b.m19921a(), sourceId, false, PrepareConfig.Normal, false, false, this.f112135k, null, str, false, false, C6384b.m19835a().mo15292a(TTPlayerAsyncInitExperiment.class, true, "is_ttplayer_async_init", C6384b.m19835a().mo15295d().is_ttplayer_async_init, true), C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
            gVar.f115545l = C6384b.m19835a().mo15287a(PlayerFramesWaitExperiment.class, true, "player_framews_wait", C6384b.m19835a().mo15295d().player_framews_wait, 1);
            gVar.f115544k = 0;
            if (C44917a.m141692r().mo105114q() && this.f112137m) {
                z = true;
            }
            gVar.f115555v = z;
            gVar.f115556w = a;
            this.f112130f.mo88626a(gVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C44924h mo105119a(boolean z, VideoUrlModel videoUrlModel) {
        if (!z && C6384b.m19835a().mo15292a(PreloadProcessDataExperiment.class, true, "is_preload_process_data", C6384b.m19835a().mo15295d().is_preload_process_data, false)) {
            C44924h hVar = null;
            if (this.f112141q != null) {
                hVar = (C44924h) this.f112141q.mo44963a(videoUrlModel);
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return m137467c(videoUrlModel, z);
    }

    /* renamed from: a */
    public final void mo104932a(Video video, C34976f fVar) {
        mo104933a(video, fVar, 0);
    }

    /* renamed from: a */
    public final void mo104933a(Video video, C34976f fVar, int i) {
        if (!m137470d("tryResumePlay")) {
            this.f112133i.mo64616b();
            if (fVar != null && this.f112130f.mo88633b(fVar) && video != null) {
                VideoUrlModel playAddrH265 = video.getPlayAddrH265();
                VideoUrlModel playAddrH264 = video.getPlayAddrH264();
                if (playAddrH265 != null || playAddrH264 != null) {
                    if (i > 0) {
                        mo104935a(video, true, i);
                        return;
                    }
                    if (m137473f(playAddrH265) || m137473f(playAddrH264)) {
                        this.f112130f.mo88627a(playAddrH265 != null ? playAddrH265.getSourceId() : playAddrH264.getSourceId());
                        this.f112132h = false;
                        return;
                    }
                    if (this.f112140p) {
                        this.f112140p = false;
                        C43179a c = m137466c(playAddrH265 != null ? playAddrH265.getSourceId() : playAddrH264.getSourceId());
                        if (c != null) {
                            m137456a(video, true, (int) c.f111810a, false);
                        } else {
                            mo104934a(video, true);
                        }
                    } else {
                        mo104934a(video, true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo104930a(Surface surface) {
        this.f112130f.mo88620a(surface);
    }

    /* renamed from: a */
    public final Type mo104901a() {
        Type type = this.f112128c != null ? this.f112128c.playerType : null;
        return type == null ? Type.TT : type;
    }

    /* renamed from: a */
    public final void mo104929a(int i) {
        if (this.f112130f != null) {
            this.f112130f.mo88630b(i);
        }
    }

    /* renamed from: a */
    public final void mo104940a(List<Aweme> list) {
        C1592h.m7855a((Callable<TResult>) new C43183ab<TResult>(this, list), (Executor) C1592h.f5957a);
    }

    /* renamed from: a */
    public final void mo104902a(String str) {
        this.f112130f.mo88632b(str);
    }

    /* renamed from: L */
    public static C43221f m137451L() {
        return m137450K();
    }

    /* renamed from: N */
    private void m137453N() {
        this.f112130f.mo88637f();
    }

    /* renamed from: O */
    private int m137454O() {
        return this.f112130f.mo88644m();
    }

    /* renamed from: A */
    public final void mo104921A() {
        this.f112130f.mo88618a(1.0f, 1.0f);
    }

    /* renamed from: G */
    public final C34969e mo104927G() {
        return this.f112130f.mo88652u();
    }

    /* renamed from: g */
    public final float mo104908g() {
        return this.f112130f.mo88615a(2);
    }

    /* renamed from: i */
    public final long mo104910i() {
        return this.f112130f.mo88640i();
    }

    /* renamed from: j */
    public final boolean mo104911j() {
        return this.f112130f.mo88650s();
    }

    /* renamed from: n */
    public final long mo104915n() {
        return this.f112130f.mo88639h();
    }

    /* renamed from: o */
    public final boolean mo104916o() {
        return this.f112130f.mo88641j();
    }

    /* renamed from: u */
    public final void mo104945u() {
        this.f112130f.mo88629b();
    }

    /* renamed from: x */
    public final void mo104948x() {
        m137462a(false);
    }

    /* renamed from: z */
    public final void mo104950z() {
        this.f112130f.mo88618a(0.0f, 0.0f);
    }

    /* renamed from: B */
    public final void mo104922B() {
        this.f112131g = null;
        this.f112129d = true;
        this.f112130f.mo88645n();
    }

    /* renamed from: C */
    public final void mo104923C() {
        if (this.f112130f != null) {
            this.f112130f.mo88646o();
        }
    }

    /* renamed from: D */
    public final void mo104924D() {
        if (this.f112130f != null) {
            this.f112130f.mo88647p();
        }
    }

    /* renamed from: F */
    public final long mo104926F() {
        C34969e u = this.f112130f.mo88652u();
        if (u != null) {
            return u.f91262e;
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo104905d() {
        C34969e u = this.f112130f.mo88652u();
        if (u != null) {
            return u.f91259b;
        }
        return -1;
    }

    /* renamed from: e */
    public final String mo104906e() {
        return this.f112130f.mo88643l();
    }

    /* renamed from: f */
    public final float mo104907f() {
        return this.f112130f.mo88615a(10);
    }

    /* renamed from: h */
    public final float mo104909h() {
        return this.f112130f.mo88615a(8);
    }

    /* renamed from: k */
    public final int mo104912k() {
        return (int) this.f112130f.mo88615a(9);
    }

    /* renamed from: l */
    public final int mo104913l() {
        C34969e u = this.f112130f.mo88652u();
        if (u != null) {
            return u.f91260c;
        }
        return 0;
    }

    /* renamed from: m */
    public final int mo104914m() {
        C34969e u = this.f112130f.mo88652u();
        if (u != null) {
            return u.f91261d;
        }
        return 0;
    }

    /* renamed from: y */
    public final void mo104949y() {
        m137453N();
        this.f112132h = false;
        this.f112131g = null;
        this.f112142r = false;
    }

    /* renamed from: b */
    public final String mo104903b() {
        return this.f112130f.mo88653v();
    }

    /* renamed from: q */
    public final boolean mo104918q() {
        if (this.f112130f != null) {
            return this.f112130f.mo88642k();
        }
        if (this.f112134j == Type.IjkHardware || this.f112134j == Type.TT_HARDWARE) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static C43222g m137450K() {
        if (!C6399b.m19944t()) {
            C43222g a = C28428o.m93437a();
            if (a != null) {
                return a;
            }
        }
        if (f112004a) {
            return C43184ac.m136934a().mo104818b();
        }
        if (f112124e == null) {
            synchronized (C43316v.class) {
                if (f112124e == null) {
                    C43316v vVar = new C43316v();
                    f112124e = vVar;
                    vVar.f112137m = true;
                }
            }
        }
        return f112124e;
    }

    /* renamed from: t */
    public final void mo104944t() {
        if (C6384b.m19835a().mo15287a(PlayeAbPrecreateplayerExp.class, true, "player_precreateplayer", C6384b.m19835a().mo15295d().player_precreateplayer, 0) == 1) {
            if (!this.f112142r && this.f112131g == null && !this.f112132h) {
                this.f112130f.mo88616a();
            }
            this.f112142r = true;
        }
    }

    /* renamed from: v */
    public final void mo104946v() {
        if (!m137470d("resumePlay")) {
            this.f112133i.mo64616b();
            if (this.f112131g != null && !this.f112130f.mo88633b((C34976f) null)) {
                this.f112130f.mo88627a(this.f112131g.getSourceId());
                this.f112132h = false;
            }
        }
    }

    public C43316v() {
        this.f112127b = true;
        this.f112129d = true;
        this.f112133i = C25155g.f66365a;
        this.f112138n = C43318w.f112143a;
        this.f112139o = new C43266n();
        this.f112135k = C44917a.m141692r().mo105099b();
        this.f112134j = C44917a.m141692r().mo105098a();
        this.f112130f = new C34982c(new C34989d(this.f112134j));
        this.f112130f.mo88625a((C44907a) this);
        this.f112130f.mo88622a(this.f112138n);
        this.f112130f.mo88623a(this.f112139o);
        this.f112141q = C17474c.m58050a().mo44970a(20).mo44994o();
    }

    /* renamed from: M */
    private void m137452M() {
        long n = mo104915n();
        if (!this.f112136l && this.f112131g != null && !TextUtils.isEmpty(this.f112131g.getSourceId()) && n >= 0) {
            C43179a aVar = (C43179a) f112126t.get(this.f112131g.getSourceId());
            if (aVar == null) {
                aVar = new C43179a();
            }
            aVar.f111810a = n;
            aVar.f111811b = m137454O();
            f112126t.put(this.f112131g.getSourceId(), aVar);
        }
    }

    /* renamed from: c */
    public final int mo104904c() {
        C34969e u = this.f112130f.mo88652u();
        if (u != null) {
            return u.f91258a;
        }
        return 0;
    }

    /* renamed from: w */
    public final void mo104947w() {
        if (this.f112127b && C44911b.m141672a(this.f112130f.mo88649r()) && C6384b.m19835a().mo15292a(EnableH265BlackListExperiment.class, true, "enable_h265_black_list", C6384b.m19835a().mo15295d().enable_h265_black_list, false)) {
            this.f112127b = this.f112130f.mo88638g();
            C44943c.f115608a = this.f112127b;
        }
        this.f112130f.mo88635d();
        this.f112132h = false;
        m137452M();
    }

    /* renamed from: d */
    private static C44910d<Integer> m137469d(VideoUrlModel videoUrlModel) {
        return new C43320y(videoUrlModel);
    }

    /* renamed from: e */
    private static C44910d<Boolean> m137471e(VideoUrlModel videoUrlModel) {
        return new C43182aa(videoUrlModel);
    }

    /* renamed from: a */
    public final void mo104928a(float f) {
        this.f112130f.mo88617a(f);
    }

    /* renamed from: a */
    public static long m137455a(VideoUrlModel videoUrlModel) {
        if (!(videoUrlModel == null || videoUrlModel.getSourceId() == null)) {
            C43179a aVar = (C43179a) f112126t.get(videoUrlModel.getSourceId());
            if (aVar != null) {
                return aVar.f111810a;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static C43179a m137466c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C43179a();
        }
        C43179a aVar = (C43179a) f112126t.get(str);
        if (aVar == null) {
            aVar = new C43179a();
        }
        return aVar;
    }

    /* renamed from: e */
    private static void m137472e(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", str);
            C6159b.m19112a("play_video_in_app_background", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r4v0, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo105120b(java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> r4) throws java.lang.Exception {
        /*
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L_0x0004:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r3.m137463b(r0)
            if (r0 == 0) goto L_0x0004
            r1 = 0
            com.ss.android.ugc.playerkit.model.h r1 = r3.m137467c(r0, r1)
            if (r1 == 0) goto L_0x0004
            com.google.common.cache.b<com.ss.android.ugc.aweme.feed.model.VideoUrlModel, com.ss.android.ugc.playerkit.model.h> r2 = r3.f112141q
            r2.mo44966a(r0, r1)
            goto L_0x0004
        L_0x0027:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.video.C43316v.mo105120b(java.util.List):java.lang.Object");
    }

    public void onEvent(JSONArray jSONArray) {
        if (jSONArray != null) {
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    if (!C7163a.m22363a() || C6384b.m19835a().mo15292a(PlayerEventLogExperiment.class, true, "player_event_log_open", C6384b.m19835a().mo15295d().player_event_log_open, false)) {
                        AppLog.recordMiscLog(C6399b.m19921a(), "video_playq", jSONArray.getJSONObject(i));
                        i++;
                    } else {
                        i++;
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private VideoUrlModel m137463b(Video video) {
        if (C6384b.m19835a().mo15292a(H265PlayAddrPolicyUnifyExperiment.class, true, "h265_play_addr_policy_unify", C6384b.m19835a().mo15295d().h265_play_addr_policy_unify, true)) {
            VideoUrlModel a = C43269p.m137255a(video, this.f112130f.mo88649r());
            if (a != null) {
                return a;
            }
        } else if (video != null) {
            if (!C44911b.m141671a((UrlModel) video.getPlayAddrH265()) || !C44911b.m141672a(this.f112130f.mo88649r()) || !this.f112127b) {
                return video.getPlayAddrH264();
            }
            return video.getPlayAddrH265();
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m137470d(String str) {
        if (f112125s == 1 && TextUtils.equals("resumePlay", str)) {
            C6921a.m21552a(4, "PlayerManager", Log.getStackTraceString(new Throwable("resumePlay")));
        }
        if (f112125s != 1 || !C6405d.m19987h()) {
            return false;
        }
        String stackTraceString = Log.getStackTraceString(new Throwable("PlayVideoInAppBackground"));
        m137472e(stackTraceString);
        StringBuilder sb = new StringBuilder("Try play video when app is in background, trace is ");
        sb.append(stackTraceString);
        String sb2 = sb.toString();
        C6921a.m21552a(4, "PlayerManager", sb2);
        if (C7163a.m22363a()) {
            C10761a.m31403c(C6399b.m19921a(), sb2).mo25750a();
        }
        return true;
    }

    /* renamed from: f */
    private boolean m137473f(VideoUrlModel videoUrlModel) {
        String str;
        if (videoUrlModel != null && this.f112131g != null && TextUtils.equals(videoUrlModel.getUri(), this.f112131g.getUri()) && TextUtils.equals(videoUrlModel.getRatio(), this.f112131g.getRatio())) {
            if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
                str = videoUrlModel.getDashVideoId();
            } else {
                str = videoUrlModel.getBitRatedRatioUri();
            }
            if (!TextUtils.isEmpty(videoUrlModel.getSourceId()) && this.f112130f.mo88628a(videoUrlModel.getSourceId(), str)) {
                return true;
            }
        }
        return false;
    }

    public C43316v(boolean z) {
        this.f112127b = true;
        this.f112129d = true;
        this.f112133i = C25155g.f66365a;
        this.f112138n = C43319x.f112144a;
        this.f112139o = new C43266n();
        this.f112136l = true;
        this.f112135k = C44917a.m141692r().mo105099b();
        this.f112134j = C44917a.m141692r().mo105098a();
        this.f112130f = new C34982c(new C34989d(this.f112134j));
        this.f112130f.mo88625a((C44907a) this);
        this.f112130f.mo88622a(this.f112138n);
        this.f112130f.mo88623a(this.f112139o);
        this.f112141q = C17474c.m58050a().mo44970a(20).mo44994o();
    }

    /* renamed from: b */
    public final String mo104951b(String str) {
        return C43191ah.m136947a(this.f112130f, str);
    }

    /* renamed from: c */
    public final void mo104943c(C34976f fVar) {
        this.f112133i.mo64617c();
        if (fVar != null && this.f112130f.mo88633b(fVar)) {
            this.f112130f.mo88636e();
            this.f112132h = false;
            m137452M();
        }
    }

    /* renamed from: b */
    public final void mo104941b(Surface surface) {
        this.f112130f.mo88631b((Surface) null);
    }

    /* renamed from: b */
    public final boolean mo104942b(C34976f fVar) {
        return this.f112130f.mo88633b(fVar);
    }

    /* renamed from: a */
    private void m137462a(boolean z) {
        this.f112133i.mo64617c();
        this.f112130f.mo88636e();
        this.f112132h = false;
        m137452M();
        this.f112140p = false;
    }

    /* renamed from: b */
    private C44910d<C44924h> m137464b(VideoUrlModel videoUrlModel, boolean z) {
        return new C43321z(this, z, videoUrlModel);
    }

    /* renamed from: c */
    private C44924h m137467c(VideoUrlModel videoUrlModel, boolean z) {
        return C44944a.m141816a().mo107453f(videoUrlModel.getBitRatedRatioUri()).mo107468a(videoUrlModel, mo104901a(), z);
    }

    /* renamed from: a */
    private void m137456a(Video video, boolean z, int i, boolean z2) {
        mo104936a(video, z, i, z2, true);
    }

    /* renamed from: a */
    private void m137459a(VideoUrlModel videoUrlModel, boolean z, boolean z2, PrepareConfig prepareConfig, boolean z3) {
        m137458a(videoUrlModel, z, z2, prepareConfig, 0, true, z3, false);
    }

    /* renamed from: a */
    private void m137457a(Video video, boolean z, boolean z2, PrepareConfig prepareConfig, int i, boolean z3) {
        if (!m137470d("tryPlayDashWithInitialStart")) {
            C46083h a = C43193b.m136954a(video.getVideoModelStr());
            if (a != null && a.f117858d != null) {
                String str = a.f117858d.f117888f;
                if (!this.f112136l && !TextUtils.isEmpty(str)) {
                    f112126t.put(str, new C43179a());
                }
                C43193b.m136955a(str, a);
                String sourceId = video.getPlayAddr().getSourceId();
                video.getPlayAddr().setDashVideoId(str);
                video.getPlayAddr().setDashVideoModelStr(video.getVideoModelStr());
                this.f112128c = C44925a.m141730a().mo107410d(str);
                this.f112128c.sourceId = sourceId;
                this.f112131g = video.getPlayAddr();
                this.f112128c.urlModel = video.getPlayAddr();
                this.f112128c.playerType = this.f112134j;
                C44913b.f115491b = str;
                C44913b.m141676a(str);
                C44906a.m141666a().mo107383a(str, "player_try_play");
                boolean z4 = z;
                PrepareConfig prepareConfig2 = prepareConfig;
                boolean z5 = z3;
                C44923g gVar = new C44923g(null, null, C6399b.m19921a(), sourceId, z4, prepareConfig2, false, false, this.f112135k, null, str, this.f112129d, z5, C6384b.m19835a().mo15292a(TTPlayerAsyncInitExperiment.class, true, "is_ttplayer_async_init", C6384b.m19835a().mo15295d().is_ttplayer_async_init, true), C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
                gVar.f115545l = C6384b.m19835a().mo15287a(PlayerFramesWaitExperiment.class, true, "player_framews_wait", C6384b.m19835a().mo15295d().player_framews_wait, 1);
                gVar.f115554u = i;
                boolean z6 = false;
                gVar.f115544k = 0;
                if (C44917a.m141692r().mo105114q() && this.f112137m) {
                    z6 = true;
                }
                gVar.f115555v = z6;
                gVar.f115556w = a;
                this.f112130f.mo88626a(gVar);
                this.f112132h = true;
                this.f112129d = true;
            }
        }
    }

    /* renamed from: a */
    private void m137458a(VideoUrlModel videoUrlModel, boolean z, boolean z2, PrepareConfig prepareConfig, int i, boolean z3, boolean z4, boolean z5) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        boolean z6 = z2;
        if (!m137470d("tryPlayWithInitialStart") && C44911b.m141671a((UrlModel) videoUrlModel)) {
            if (!this.f112136l && !TextUtils.isEmpty(videoUrlModel.getSourceId())) {
                f112126t.put(videoUrlModel.getSourceId(), new C43179a());
            }
            String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
            String uri = videoUrlModel.getUri();
            this.f112128c = C44925a.m141730a().mo107410d(uri);
            this.f112128c.sourceId = videoUrlModel.getSourceId();
            this.f112131g = videoUrlModel2;
            this.f112128c.urlModel = videoUrlModel2;
            this.f112128c.playerType = this.f112134j;
            C44913b.f115491b = bitRatedRatioUri;
            C44913b.m141676a(bitRatedRatioUri);
            C44906a.m141666a().mo107383a(uri, "player_try_play");
            if (this.f112129d) {
                m137460a(m137464b(videoUrlModel2, z6), m137471e(videoUrlModel), videoUrlModel, z, prepareConfig, videoUrlModel.isVr(), videoUrlModel.isH265(), m137469d(videoUrlModel), true, z3, i, z4, false);
            } else {
                m137460a(m137464b(videoUrlModel2, z6), m137471e(videoUrlModel), videoUrlModel, z, prepareConfig, videoUrlModel.isVr(), videoUrlModel.isH265(), m137469d(videoUrlModel), false, z3, i, z4, false);
            }
            this.f112129d = true;
        }
    }

    /* renamed from: a */
    private void m137461a(C44910d<C44924h> dVar, C44910d<Boolean> dVar2, VideoUrlModel videoUrlModel, boolean z, PrepareConfig prepareConfig, boolean z2, boolean z3, C44910d<Integer> dVar3, boolean z4, boolean z5, boolean z6) {
        m137460a(dVar, dVar2, videoUrlModel, false, prepareConfig, z2, z3, dVar3, true, false, 0, z6, false);
    }

    /* renamed from: a */
    private void m137460a(C44910d<C44924h> dVar, C44910d<Boolean> dVar2, VideoUrlModel videoUrlModel, boolean z, PrepareConfig prepareConfig, boolean z2, boolean z3, C44910d<Integer> dVar3, boolean z4, boolean z5, int i, boolean z6, boolean z7) {
        boolean a = C6384b.m19835a().mo15292a(TTPlayerAsyncInitExperiment.class, true, "is_ttplayer_async_init", C6384b.m19835a().mo15295d().is_ttplayer_async_init, true);
        C44910d<C44924h> dVar4 = dVar;
        C44910d<Boolean> dVar5 = dVar2;
        C44923g gVar = new C44923g(dVar4, dVar5, C6399b.m19921a(), videoUrlModel.getSourceId(), z, prepareConfig, z2, z3, this.f112135k, dVar3, videoUrlModel.getUri(), z4, z5, a, C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
        gVar.f115545l = C6384b.m19835a().mo15287a(PlayerFramesWaitExperiment.class, true, "player_framews_wait", C6384b.m19835a().mo15295d().player_framews_wait, 1);
        gVar.f115554u = i;
        gVar.f115558y = z7;
        gVar.f115548o = videoUrlModel.getBitRatedRatioUri();
        C44925a.m141730a().mo107406a(gVar.f115548o, videoUrlModel.getFileCheckSum());
        boolean z8 = false;
        gVar.f115544k = 0;
        if (C44917a.m141692r().mo105114q() && this.f112137m) {
            z8 = true;
        }
        gVar.f115555v = z8;
        if (z6) {
            if (C43269p.m137257a(videoUrlModel)) {
                gVar.f115557x = true;
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("aid", videoUrlModel.getSourceId());
                } catch (JSONException unused) {
                }
                C6893q.m21447a("need_set_token_exception", jSONObject);
            }
        }
        this.f112130f.mo88626a(gVar);
        this.f112132h = true;
    }
}
