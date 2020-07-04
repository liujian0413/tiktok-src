package com.p280ss.android.ugc.aweme.feed.p1227c;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0688e;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.C6319n;
import com.bytedance.gcsuppression.GcSuppression;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.facebook.network.connectionclass.C14143b;
import com.google.gson.C6607f;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.C22769ae;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.app.services.C6883f;
import com.p280ss.android.ugc.aweme.audio.AudioUtils;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24132c;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24716aj;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.log.C24927a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24974r;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.commercialize.symphony.C25155g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25272bk;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25290br;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.detail.C26057e;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26214y;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26682g;
import com.p280ss.android.ugc.aweme.discover.mob.C26801u;
import com.p280ss.android.ugc.aweme.experiment.CellInfoEnableExperiment;
import com.p280ss.android.ugc.aweme.feed.C28062aa;
import com.p280ss.android.ugc.aweme.feed.C28202ag;
import com.p280ss.android.ugc.aweme.feed.C28209am;
import com.p280ss.android.ugc.aweme.feed.C28227b;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.adapter.C28128aa;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.C28167bl;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.feed.event.C28304a;
import com.p280ss.android.ugc.aweme.feed.event.C28323f;
import com.p280ss.android.ugc.aweme.feed.event.C28339v;
import com.p280ss.android.ugc.aweme.feed.experiment.ForceVideoUrlUseHttpsExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoBufferingThresholdExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoSwitchHttpsThresholdExperiment;
import com.p280ss.android.ugc.aweme.feed.guide.C6915f;
import com.p280ss.android.ugc.aweme.feed.helper.C28416d;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.helper.C28421i;
import com.p280ss.android.ugc.aweme.feed.helper.C28426n;
import com.p280ss.android.ugc.aweme.feed.helper.C28428o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BitRate;
import com.p280ss.android.ugc.aweme.feed.model.BitRate.ExcludeStrategy;
import com.p280ss.android.ugc.aweme.feed.model.Preload;
import com.p280ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a.C28540a;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.feed.p1228d.C28292b;
import com.p280ss.android.ugc.aweme.feed.p1230f.C28348a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28481d;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28506u;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29004c;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29005d;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29013e;
import com.p280ss.android.ugc.aweme.feed.p310h.C28411a;
import com.p280ss.android.ugc.aweme.feed.p310h.C6917c;
import com.p280ss.android.ugc.aweme.feed.p310h.C6918d;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29974c;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.language.C32330k;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.task.PosterSRProcessorInitTask;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.main.C32950d;
import com.p280ss.android.ugc.aweme.main.C32960dc;
import com.p280ss.android.ugc.aweme.main.C32995dq;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.metrics.C33252aw;
import com.p280ss.android.ugc.aweme.metrics.C33253ax;
import com.p280ss.android.ugc.aweme.metrics.C33254ay;
import com.p280ss.android.ugc.aweme.metrics.C33255az;
import com.p280ss.android.ugc.aweme.metrics.C33269k;
import com.p280ss.android.ugc.aweme.metrics.C33270l;
import com.p280ss.android.ugc.aweme.metrics.p1393a.C33221a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C28012q;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p332ml.C33573d;
import com.p280ss.android.ugc.aweme.p332ml.C33583m;
import com.p280ss.android.ugc.aweme.p332ml.C33586o;
import com.p280ss.android.ugc.aweme.p332ml.C7174p;
import com.p280ss.android.ugc.aweme.p932aa.C21097b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c.C34944a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c.C34946c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34950e.C34953a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34955f.C34956a;
import com.p280ss.android.ugc.aweme.player.p1457b.C34960a;
import com.p280ss.android.ugc.aweme.player.p334ab.C7190b;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.PlayerAbBlockReportExp;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.poi.event.C35078a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.requesttask.idle.AVCameraInitTask;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.setting.C37653j;
import com.p280ss.android.ugc.aweme.shortvideo.CurPlayVideoRecord;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39849h;
import com.p280ss.android.ugc.aweme.store.C41961c;
import com.p280ss.android.ugc.aweme.store.C41964e;
import com.p280ss.android.ugc.aweme.store.LocalStore;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43166q;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43045c;
import com.p280ss.android.ugc.aweme.video.C43184ac;
import com.p280ss.android.ugc.aweme.video.C43192ai;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43238k;
import com.p280ss.android.ugc.aweme.video.C43240l;
import com.p280ss.android.ugc.aweme.video.C43268o;
import com.p280ss.android.ugc.aweme.video.C43310q;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import com.p280ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayerUnifiedAbConfigExperiment;
import com.p280ss.android.ugc.aweme.video.p1700d.C43208c;
import com.p280ss.android.ugc.aweme.video.p1701e.C43216b;
import com.p280ss.android.ugc.aweme.video.preload.C43270a;
import com.p280ss.android.ugc.aweme.video.preload.C43274e;
import com.p280ss.android.ugc.aweme.video.preload.C43281f;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.networkspeed.C44903d;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.p280ss.android.ugc.playerkit.p1751b.C44913b;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import com.p280ss.android.ugc.playerkit.session.Session;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import com.p280ss.android.ugc.playerkit.videoview.p1754c.C44944a;
import com.p280ss.ugc.aweme.p1817a.p1823b.C46183b;
import com.p280ss.ugc.aweme.p1817a.p1823b.C46183b.C46184a;
import com.toutiao.proxyserver.C46534r;
import com.toutiao.proxyserver.p1842d.C46474a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.C7705c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.observers.C47866b;
import p346io.reactivex.p1865a.p1867b.C47549a;

/* renamed from: com.ss.android.ugc.aweme.feed.c.q */
public final class C28256q extends C28231a implements C34976f {

    /* renamed from: A */
    private long f74418A = -1;

    /* renamed from: B */
    private long f74419B = -1;

    /* renamed from: C */
    private int f74420C;

    /* renamed from: D */
    private int f74421D;

    /* renamed from: E */
    private long f74422E = -1;

    /* renamed from: F */
    private long f74423F;

    /* renamed from: G */
    private boolean f74424G;

    /* renamed from: H */
    private boolean f74425H;

    /* renamed from: I */
    private long f74426I;

    /* renamed from: J */
    private long f74427J;

    /* renamed from: K */
    private long f74428K = -1;

    /* renamed from: L */
    private int f74429L;

    /* renamed from: M */
    private int f74430M;

    /* renamed from: N */
    private int f74431N;

    /* renamed from: O */
    private String f74432O;

    /* renamed from: P */
    private String f74433P;

    /* renamed from: Q */
    private volatile boolean f74434Q;

    /* renamed from: R */
    private Aweme f74435R;

    /* renamed from: S */
    private long f74436S;

    /* renamed from: T */
    private BroadcastReceiver f74437T;

    /* renamed from: U */
    private C47866b f74438U;

    /* renamed from: V */
    private final int f74439V = PreloadTask.BYTE_UNIT_NUMBER;

    /* renamed from: W */
    private final double f74440W = -0.5d;

    /* renamed from: X */
    private boolean f74441X = true;

    /* renamed from: Y */
    private double f74442Y;

    /* renamed from: Z */
    private boolean f74443Z;

    /* renamed from: a */
    public long f74444a = -1;

    /* renamed from: aa */
    private boolean f74445aa;

    /* renamed from: ab */
    private String f74446ab;

    /* renamed from: ac */
    private boolean f74447ac = true;

    /* renamed from: ad */
    private int f74448ad;

    /* renamed from: ae */
    private boolean f74449ae;

    /* renamed from: af */
    private int f74450af;

    /* renamed from: ag */
    private String f74451ag;

    /* renamed from: ah */
    private boolean f74452ah;

    /* renamed from: ai */
    private Set<String> f74453ai;

    /* renamed from: aj */
    private boolean f74454aj = true;

    /* renamed from: i */
    public C28228a f74455i;

    /* renamed from: j */
    public boolean f74456j;

    /* renamed from: k */
    public Aweme f74457k;

    /* renamed from: l */
    public boolean f74458l;

    /* renamed from: m */
    public String f74459m;

    /* renamed from: n */
    public String f74460n = "";

    /* renamed from: o */
    double f74461o = -0.5d;

    /* renamed from: p */
    public C43222g f74462p;

    /* renamed from: q */
    private boolean f74463q;

    /* renamed from: r */
    private final WeakReference<C28648x> f74464r;

    /* renamed from: s */
    private KeyguardManager f74465s;

    /* renamed from: t */
    private boolean f74466t;

    /* renamed from: u */
    private boolean f74467u;

    /* renamed from: v */
    private long f74468v = -1;

    /* renamed from: w */
    private long f74469w = -1;

    /* renamed from: x */
    private long f74470x = -1;

    /* renamed from: y */
    private long f74471y;

    /* renamed from: z */
    private long f74472z;

    /* renamed from: com.ss.android.ugc.aweme.feed.c.q$7 */
    static /* synthetic */ class C282637 {

        /* renamed from: a */
        static final /* synthetic */ int[] f74485a = new int[Type.values().length];

        static {
            try {
                f74485a[Type.Ijk.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: h */
    public final void mo71932h() {
        this.f74463q = true;
    }

    /* renamed from: n */
    public final String mo71843n() {
        return this.f74357d;
    }

    /* renamed from: a */
    private static boolean m92884a(C28128aa aaVar) {
        return aaVar.mo71563n() == 2;
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        C28130ac acVar;
        String str;
        String str2;
        String str3;
        C44920d dVar2 = dVar;
        this.f74445aa = false;
        C24671f.m80861k().mo65572c(mo71838e(), m92866E());
        C6857a.m21312e().mo16827b("feed_ui_to_video", true);
        C6857a.m21312e().mo16822a("feed_video_duration", true);
        if (C6399b.m19944t()) {
            ((IMainService) ServiceManager.get().getService(IMainService.class)).trackAppsFlyerEvent("video_view", dVar2.f115529a);
        }
        C28648x s = m92929s();
        C28130ac h = m92912h(dVar2.f115529a);
        if (m92931u()) {
            C42961az.m136380a(new C28339v(!C28478a.m93587c(h)));
        }
        C42961az.m136380a(new C28304a(C28478a.m93587c(h)));
        if (h == null || h.mo65716m() == null) {
            C28348a.m93130a("1", "view holder is null", dVar2.f115529a, m92934x());
        } else if (!mo71841l() || !m92906e(h.mo65711h())) {
            C28130ac acVar2 = h;
            if (!C43268o.m137250H()) {
                mo71937p().mo104948x();
            } else {
                C44960f b = acVar2.mo71553b();
                if (b != null) {
                    b.mo71672ad();
                }
            }
            C43238k.m137170a().mo104982d();
            C28348a.m93130a("2", "view invalid or activity onpause", dVar2.f115529a, m92934x());
        } else {
            Aweme h2 = h.mo65711h();
            if (h2 != null && !TextUtils.isEmpty(this.f74459m)) {
                C28012q qVar = new C28012q(this.f74459m, 0, mo71937p().mo104915n(), h2.getAid());
                C42961az.m136380a(qVar);
            }
            this.f74466t = true;
            this.f74467u = true;
            if (!mo71841l()) {
                C28348a.m93130a("3", "view invalid", dVar2.f115529a, m92934x());
                return;
            }
            h.mo65716m().mo63044a(dVar2);
            if (m92884a(h.mo65716m())) {
                this.f74432O = h.mo65711h().getAid();
                m92933w();
            }
            if (!C28478a.m93590e(h)) {
                C28348a.m93130a("4", "not video viewholder", dVar2.f115529a, m92934x());
                return;
            }
            if (h.mo65711h() != null && h.mo65711h().isVr() && C43192ai.m136950a()) {
                C43192ai.m136949a(false);
                C10761a.m31410e((Context) mo71837d(), C23481i.m77091b(R.string.cab)).mo25750a();
            }
            if (C28478a.m93582a(h)) {
                C24671f.m80856f().mo63389d(h.mo65711h(), mo71838e(), h.mo65716m().mo71570u(), this.f74429L);
            }
            this.f74444a = System.currentTimeMillis();
            this.f74442Y = AudioUtils.m75891a();
            C24723e i = m92915i(h);
            if (i != null) {
                i.mo64696a(1, this.f74429L + 1);
            }
            if (this.f74469w == -1) {
                this.f74468v = System.currentTimeMillis();
            } else {
                this.f74469w = -1;
                this.f74468v = System.currentTimeMillis();
            }
            this.f74470x = -1;
            m92873a(h, 0);
            if (h2 != null && h2.isAd()) {
                this.f74431N = h2.getAwemeRawAd().getShowMaskTimes();
            }
            this.f74430M = 0;
            C28418f.m93413a().f74937g = false;
            C28418f.m93413a().f74936f = 0;
            m92905e(h);
            C28418f.m93413a().f74938h = false;
            int awemeType = h.mo65711h() != null ? h.mo65711h().getAwemeType() : 0;
            if (awemeType == 0) {
                C28434i.m93460a(dVar2.f115529a);
            }
            m92881a(dVar2.f115529a, awemeType);
            if (C28478a.m93587c(h)) {
                C6907h.onEvent(MobClick.obtain().setEventName("ad_play").setExtValueString(h.mo65711h().getAid()).setJsonObject(new C6869c().mo16887a("request_id", m92934x().optString("request_id")).mo16888b()));
            }
            int i2 = this.f74358e;
            String str4 = this.f74357d;
            C28233ab abVar = r0;
            C28233ab abVar2 = new C28233ab(this, i2, h, dVar, s, str4, h2);
            C1592h.m7855a((Callable<TResult>) abVar, (Executor) C6907h.m21516a());
            this.f74433P = m92871a(h, dVar2.f115529a);
            Aweme h3 = h.mo65711h();
            String str5 = this.f74460n;
            Context e = mo71838e();
            if (C6399b.m19944t()) {
                if (!this.f74434Q) {
                    if (e instanceof Activity) {
                        Intent intent = ((Activity) e).getIntent();
                        if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                            str3 = intent.getStringExtra("rule_id");
                            C28234ac acVar3 = new C28234ac(this, h3, str4, i2, s, h2, str3);
                            C1592h.m7855a((Callable<TResult>) acVar3, (Executor) C6907h.m21516a());
                        }
                    }
                    str3 = null;
                    C28234ac acVar32 = new C28234ac(this, h3, str4, i2, s, h2, str3);
                    C1592h.m7855a((Callable<TResult>) acVar32, (Executor) C6907h.m21516a());
                }
                acVar = h;
            } else {
                C33253ax axVar = (C33253ax) new C33253ax().mo85164a(str4).mo85282a(Boolean.valueOf(C28482e.m93609b(h2)));
                if (s != null) {
                    if (!TextUtils.isEmpty(s.mo71880Q())) {
                        axVar.mo85184q(s.mo71880Q());
                    }
                    m92882a(s.mo67597C(), (C33270l) axVar);
                }
                if (s != null && ("homepage_fresh".equalsIgnoreCase(str4) || "poi_page".equalsIgnoreCase(str4) || "poi_map".equalsIgnoreCase(str4))) {
                    axVar.mo85184q((!s.mo73369as() || this.f74443Z) ? "slide" : "click");
                    this.f74443Z = true;
                }
                if (s != null && TextUtils.equals("homepage_channel", str4)) {
                    axVar.mo85184q(s.mo71887X().getEnterMethodValue());
                }
                if (e instanceof Activity) {
                    Intent intent2 = ((Activity) e).getIntent();
                    if (intent2 != null && intent2.getBooleanExtra("from_notification", false)) {
                        str = intent2.getStringExtra("rule_id");
                        C28235ad adVar = r0;
                        String str6 = str;
                        str2 = str4;
                        Aweme aweme = h2;
                        acVar = h;
                        C28235ad adVar2 = new C28235ad(this, axVar, h3, i2, dVar, str5, s, str6, str4, h2, h);
                        C1592h.m7855a((Callable<TResult>) adVar, (Executor) C6907h.m21516a());
                        if (this.f74447ac && TextUtils.equals("compilation_detail", str2)) {
                            C28506u.m93699a(aweme, str2, s.mo71875L(), s.mo71876M());
                            this.f74447ac = false;
                        }
                    }
                }
                str = null;
                C28235ad adVar3 = adVar2;
                String str62 = str;
                str2 = str4;
                Aweme aweme2 = h2;
                acVar = h;
                C28235ad adVar22 = new C28235ad(this, axVar, h3, i2, dVar, str5, s, str62, str4, h2, h);
                C1592h.m7855a((Callable<TResult>) adVar3, (Executor) C6907h.m21516a());
                C28506u.m93699a(aweme2, str2, s.mo71875L(), s.mo71876M());
                this.f74447ac = false;
            }
            if (s != null) {
                s.mo71893Z();
            }
            if (!acVar.mo65711h().isLive() && s != null && s.mo73368ar()) {
                acVar.mo65716m().mo71572w();
            }
            Video video = acVar.mo65711h().getVideo();
            if (video != null) {
                C1592h.m7855a((Callable<TResult>) new C28236ae<TResult>(video, acVar, dVar2), (Executor) C6907h.m21516a());
                if (dVar2.f115530b) {
                    m92876a(video, true);
                }
            }
            this.f74455i.f74354a = 2;
            if (s != null) {
                s.mo71899ae();
            }
            m92879a(new C39330h(0, dVar2.f115531c));
            if (this.f74456j) {
                C25290br.m83094a(dVar2.f115529a);
            }
            if (s != null) {
                s.av_();
                s.mo69891J();
            }
            C6857a.m21312e().mo16827b("feed_video_duration", true);
            C6857a.m21312e().mo16822a("feed_video_to_total", true);
            C28418f.m93413a().f74934d = false;
            C32950d.m106523a("video_play");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo71914a(int i, C28130ac acVar, C44920d dVar, C28648x xVar, String str, Aweme aweme) throws Exception {
        int i2 = i;
        C44920d dVar2 = dVar;
        C28648x xVar2 = xVar;
        if (i2 == 0) {
            JSONObject f = m92907f(acVar);
            try {
                f.put("feed_count", C22769ae.m75151a().mo59822b());
            } catch (Exception unused) {
            }
            C6907h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("homepage_hot").setValue(dVar2.f115529a).setJsonObject(f));
        } else {
            if (Math.abs(i2 - 1000) < 100) {
                C6907h.m21519a(mo71838e(), "video_play", "personal_homepage", dVar2.f115529a, 0, m92934x());
            } else if (Math.abs(i2 - 8000) < 100) {
                C6907h.m21519a(mo71838e(), "video_play", "toplist_friend", dVar2.f115529a, 0, m92934x());
                C6907h.m21519a(mo71838e(), "show", "toplist_friend", dVar2.f115529a, 0, m92934x());
            } else if (Math.abs(i2 - 2000) >= 100) {
                if (TextUtils.equals(str, "opus")) {
                    C28348a.m93130a("6", "page type not match", dVar2.f115529a, m92934x());
                } else if (!C6399b.m19946v()) {
                    MobClick value = MobClick.obtain().setEventName("video_play").setLabelName(mo71843n()).setValue(C33230ac.m107238m(aweme));
                    if (xVar2 != null) {
                        value.setJsonObject(xVar2.mo71891c(aweme).mo16888b());
                    }
                    C6907h.onEvent(value);
                } else {
                    C28348a.m93130a("5", "not musically", dVar2.f115529a, m92934x());
                }
            } else if (TextUtils.equals("update_tips", mo71843n())) {
                C6907h.m21519a(mo71838e(), "video_play", "update_tips", dVar2.f115529a, 0, m92934x());
            } else {
                C6869c a = C6869c.m21382a(m92934x());
                if (xVar2 != null) {
                    a.mo16887a("enter_from_request", xVar.mo71874K());
                }
                C6907h.m21519a(mo71838e(), "video_play", "others_homepage", dVar2.f115529a, 0, a.mo16888b());
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo71917a(Aweme aweme, String str, int i, C28648x xVar, Aweme aweme2, String str2) throws Exception {
        if (aweme != null) {
            C33253ax o = ((C33253ax) new C33253ax().mo85164a(str).mo85171c(aweme, i).mo85174d(xVar.mo71887X().getChallengeId()).mo85173c(String.valueOf(xVar.mo71905ak())).mo85169b(xVar.mo71887X().getProcessId()).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme)))).mo85182o(C43268o.m137252J().name());
            boolean z = true;
            if (xVar != null) {
                ((C33253ax) ((C33253ax) o.mo85179i(xVar.mo71875L()).mo85283l(xVar.mo67595A())).mo85284m(C33230ac.m107216b(aweme2, this.f74358e))).mo85172c(xVar.mo71887X()).mo85185r(xVar.mo71879P());
                if (!TextUtils.isEmpty(xVar.mo71880Q())) {
                    o.mo85184q(xVar.mo71880Q());
                }
                if ("poi_page".equalsIgnoreCase(str) || "poi_map".equalsIgnoreCase(str)) {
                    o.mo85184q((!xVar.mo73369as() || this.f74443Z) ? "slide" : "click");
                    this.f74443Z = true;
                }
                o.mo85186s(xVar.mo69889H());
                o.mo85187t(xVar.mo69887F());
                o.mo85188u(xVar.mo69888G());
            }
            o.mo85252e();
            if (!TextUtils.isEmpty(str2)) {
                C33253ax axVar = (C33253ax) new C33253ax("video_play_from_push").mo85164a(str).mo85189v(str2).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme2)));
                if (xVar != null && !TextUtils.isEmpty(xVar.mo71880Q())) {
                    o.mo85184q(xVar.mo71880Q());
                }
                axVar.mo85252e();
            }
            String str3 = "";
            if (xVar != null) {
                str3 = xVar.mo71875L();
            }
            if (TextUtils.equals(str3, "search_result") || TextUtils.equals(str3, "general_search") || TextUtils.equals(str3, "search_for_you_list")) {
                C26801u D = C6903bc.m21463D();
                String str4 = "search_video_play";
                if (!TextUtils.equals(str3, "search_result") && !TextUtils.equals(str3, "search_for_you_list")) {
                    z = false;
                }
                D.mo68582a(str4, aweme2, str, z);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo71919a(C33253ax axVar, Aweme aweme, int i, C44920d dVar, String str, C28648x xVar, String str2, String str3, Aweme aweme2, C28130ac acVar) throws Exception {
        axVar.mo85171c(aweme, i).mo85182o(mo71937p().mo104901a().toString()).mo85170b(dVar.f115530b).mo85161a(m92868G() ? 1 : 0).mo85183p(str);
        if (xVar != null) {
            ((C33253ax) axVar.mo85178g(xVar.mo71877N()).mo85179i(xVar.mo71875L()).mo85181k(xVar.mo71874K()).mo85180j(xVar.mo71878O()).mo85283l(xVar.mo67595A())).mo85185r(xVar.mo71879P());
        }
        if (!(xVar == null || xVar.mo71887X() == null)) {
            axVar.mo85163a(xVar.mo71887X(), xVar.mo73366ap());
            axVar.mo85162a(xVar.mo71887X());
            axVar.mo85172c(xVar.mo71887X());
            axVar.mo85168b(xVar.mo71887X());
            axVar.mo85190w(xVar.mo71887X().getCarrierType());
            axVar.mo85191x(xVar.mo71887X().getReferSeedId());
            axVar.mo85175e(xVar.mo71887X().getReferCommodityId());
            axVar.mo85192y(xVar.mo71887X().getReferSeedName());
            axVar.mo85193z(xVar.mo71887X().getFromGroupId());
            axVar.mo85160A(xVar.mo71887X().getDataType());
        }
        axVar.mo85246a(C6903bc.m21467H().mo67868a(mo71838e()));
        axVar.mo85252e();
        if (!TextUtils.isEmpty(str2)) {
            C33253ax axVar2 = (C33253ax) new C33253ax("video_play_from_push").mo85164a(str3).mo85189v(str2).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme2)));
            if (xVar != null && !TextUtils.isEmpty(xVar.mo71880Q())) {
                axVar.mo85184q(xVar.mo71880Q());
            }
            axVar2.mo85252e();
        }
        if (xVar != null && (TextUtils.equals(xVar.mo71875L(), "search_result") || TextUtils.equals(xVar.mo71875L(), "general_search"))) {
            C6903bc.m21463D().mo68582a("search_video_play", aweme, str3, TextUtils.equals(xVar.mo71875L(), "search_result"));
        }
        if (C25329c.m83224g(acVar.mo65711h())) {
            C24671f.m80851a().mo64667a(acVar.mo65711h());
        }
        return null;
    }

    /* renamed from: a */
    private static void m92882a(String str, C33270l lVar) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("supplier_id")) {
                    lVar.mo85245a("supplier_id", jSONObject.getString("supplier_id"));
                }
                if (jSONObject.has("product_id")) {
                    lVar.mo85245a("product_id", jSONObject.getString("product_id"));
                }
                if (jSONObject.has("previous_page")) {
                    lVar.mo85245a("previous_page", jSONObject.getString("previous_page"));
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        String str2 = str;
        if (mo71841l()) {
            Aweme aweme = null;
            this.f74446ab = null;
            C28648x s = m92929s();
            if (this.f74445aa) {
                this.f74469w = -1;
                this.f74470x = -1;
                this.f74468v = System.currentTimeMillis();
            }
            this.f74445aa = false;
            this.f74467u = true;
            C6903bc.m21505x().mo57932a(3, false);
            C7705c a = C7705c.m23799a();
            C29013e eVar = new C29013e(m92866E(), this.f74357d, this.f74358e, 2, s);
            a.mo20394d(eVar);
            m92863B();
            this.f74442Y = AudioUtils.m75891a();
            final C28130ac h = m92912h(str);
            if (this.f74449ae || mo71837d() == null || !C28428o.m93438a(mo71837d()) || !TextUtils.equals(str2, C28418f.m93413a().f74932b)) {
                this.f74444a = System.currentTimeMillis();
            } else {
                long j = 0;
                if (this.f74444a == -1) {
                    this.f74444a = System.currentTimeMillis();
                    j = Long.MAX_VALUE;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.f74444a > 0 && this.f74444a <= currentTimeMillis) {
                        j = currentTimeMillis - this.f74444a;
                    }
                }
                if (m92913h(h)) {
                    if (TextUtils.equals(mo71843n(), "general_search")) {
                        this.f74435R = m92917j(h);
                        m92873a(h, j);
                    }
                    m92905e(h);
                    C29004c cVar = new C29004c(h.mo65711h(), mo71843n(), this.f74358e, null, s);
                    C42961az.m136380a(cVar);
                }
            }
            if (!(this.f74435R == null || !this.f74435R.isAd() || this.f74435R.getAwemeRawAd() == null)) {
                this.f74431N = this.f74435R.getAwemeRawAd().getShowMaskTimes();
                this.f74430M = C28418f.m93413a().f74936f;
            }
            if (h != null) {
                aweme = h.mo65711h();
            }
            if (aweme != null && !TextUtils.isEmpty(this.f74459m)) {
                C28012q qVar = new C28012q(this.f74459m, 0, mo71937p().mo104915n(), aweme.getAid());
                C42961az.m136380a(qVar);
            }
            this.f74449ae = true;
            this.f74432O = str2;
            if (m92913h(h)) {
                h.mo65716m().mo63046a(str2);
                if (!this.f74424G && s != null) {
                    s.mo71893Z();
                }
                if (h.mo65711h().isLive()) {
                    m92933w();
                } else if (s != null) {
                    s.mo71894a(new Runnable() {
                        public final void run() {
                            if (C28256q.this.mo71841l()) {
                                h.mo65716m().mo71571v();
                            }
                        }
                    }, 400);
                }
                if (s != null) {
                    s.mo71895aa();
                }
            }
            this.f74455i.f74354a = 2;
            m92879a(new C39330h(3));
            new C33269k().mo85252e();
            C28580o.m93830a(PAGE.FEED);
            if (this.f74424G) {
                this.f74426I = SystemClock.elapsedRealtime();
            }
            if (this.f74425H) {
                this.f74427J = SystemClock.elapsedRealtime();
            }
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        Session c = C44925a.m141730a().mo107409c(cVar.f115522a);
        if (c != null) {
            C44944a.m141816a().mo107450c(c.key);
        }
        C28130ac h = m92912h(cVar.f115522a);
        if (C6399b.m19944t()) {
            m92890b(cVar, h);
        } else {
            m92880a(cVar, h);
        }
        if (!(h == null || h.mo65716m() == null)) {
            if (!C43268o.m137250H()) {
                mo71937p().mo104924D();
            } else {
                C44960f b = h.mo71553b();
                if (b != null) {
                    b.mo71675ag();
                }
            }
        }
        if (this.f74456j) {
            C25290br.m83095a(cVar.f115522a, cVar.f115525d, cVar.f115526e, cVar.f115527f);
        }
    }

    /* renamed from: a */
    private void m92880a(C44919c cVar, C28130ac acVar) {
        String str;
        long j;
        if (mo71841l() && C28478a.m93590e(acVar)) {
            if (acVar.mo65711h() != null) {
                if (cVar.f115524c && acVar.mo65711h().getVideo().getVideoModelStr() != null) {
                    acVar.mo65711h().getVideo().setRationAndSourceId(m92920k(acVar));
                    if (!C43316v.m137250H()) {
                        this.f74466t = false;
                        mo71937p().mo104930a(acVar.mo65716m().mo71569t());
                        mo71937p().mo104936a(acVar.mo65711h().getVideo(), true, 0, true, false);
                        m92899c(cVar, acVar);
                    }
                    return;
                } else if (cVar.f115523b) {
                    acVar.mo65711h().getVideo().setRationAndSourceId(m92920k(acVar));
                    m92876a(acVar.mo65711h().getVideo(), false);
                    if (!C43268o.m137250H()) {
                        this.f74466t = false;
                        mo71937p().mo104930a(acVar.mo65716m().mo71569t());
                        mo71937p().mo104938a(acVar.mo65711h().getVideo().getPlayAddrH264(), true, true, acVar.mo65711h().getVideo().isNeedSetCookie());
                        m92899c(cVar, acVar);
                        m92876a(acVar.mo65711h().getVideo(), false);
                    }
                    return;
                } else {
                    if (cVar.f115527f instanceof String) {
                        str = (String) cVar.f115527f;
                    } else {
                        str = C23481i.m77091b(R.string.cuk);
                    }
                    C10761a.m31403c((Context) mo71837d(), str).mo25750a();
                    acVar.mo65716m().mo63043a(cVar);
                    C28648x s = m92929s();
                    if (s != null) {
                        s.mo71893Z();
                    }
                    m92899c(cVar, acVar);
                    Video video = acVar.mo65711h().getVideo();
                    if (video != null && video.getPlayAddr() != null) {
                        if (this.f74436S != 0) {
                            j = SystemClock.elapsedRealtime() - this.f74436S;
                            this.f74436S = 0;
                        } else {
                            j = 0;
                        }
                        new C34956a().mo88544a(String.valueOf(j)).mo88541a(mo71839f()).mo88543a(video).mo88542a(acVar).mo88540a(0).mo88545b(m92935y()).f91212a.mo88539a();
                        C6726a.m20842a(new C28237af(this, cVar, video, acVar));
                        if (s != null) {
                            s.mo73377b(0);
                        }
                        this.f74436S = 0;
                    } else {
                        return;
                    }
                }
            }
            m92879a(new C39330h(1));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ExcHandler: JSONException (unused org.json.JSONException), SYNTHETIC, Splitter:B:32:0x0116] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo71929b(com.p280ss.android.ugc.playerkit.model.C44919c r7, com.p280ss.android.ugc.aweme.feed.model.Video r8, com.p280ss.android.ugc.aweme.feed.adapter.C28130ac r9) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 1
            java.lang.String r2 = "sourceId"
            java.lang.String r3 = r7.f115522a     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            java.lang.String r2 = "errorCode"
            int r3 = r7.f115525d     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            java.lang.String r2 = "errorExtra"
            int r3 = r7.f115526e     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            java.lang.String r2 = "h265"
            boolean r3 = r7.f115523b     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            java.lang.String r2 = "playerVersion"
            com.ss.android.ugc.aweme.video.g r3 = r6.mo71937p()     // Catch:{  }
            java.lang.String r3 = r3.mo104903b()     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            java.lang.String r2 = "netWorkQuality"
            com.facebook.network.connectionclass.b r3 = com.facebook.network.connectionclass.C14143b.m41756a()     // Catch:{  }
            com.facebook.network.connectionclass.ConnectionQuality r3 = r3.mo33901b()     // Catch:{  }
            java.lang.String r3 = r3.toString()     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            java.lang.String r2 = "netWorkSpeed"
            com.facebook.network.connectionclass.b r3 = com.facebook.network.connectionclass.C14143b.m41756a()     // Catch:{  }
            double r3 = r3.mo33902c()     // Catch:{  }
            int r3 = (int) r3     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            java.lang.String r2 = "playUrl"
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r8.getProperPlayAddr()     // Catch:{  }
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            java.lang.String r2 = "playUrlIsLowBr"
            boolean r3 = r8.isLowBr()     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            java.lang.String r2 = "video_duration"
            int r3 = r8.getDuration()     // Catch:{  }
            r0.put(r2, r3)     // Catch:{  }
            com.p280ss.android.ugc.aweme.video.p1700d.C43208c.m137002a(r0)     // Catch:{  }
            java.lang.Object r2 = r7.f115527f     // Catch:{  }
            if (r2 == 0) goto L_0x007f
            java.lang.String r2 = "extraInfo"
            java.lang.Object r7 = r7.f115527f     // Catch:{  }
            java.lang.String r7 = r7.toString()     // Catch:{  }
            r0.put(r2, r7)     // Catch:{  }
        L_0x007f:
            java.io.File r7 = com.p280ss.android.ugc.aweme.video.C7276d.m22808b()     // Catch:{  }
            java.lang.String r2 = "cache"
            java.io.File r7 = com.p280ss.android.ugc.aweme.video.C7276d.m22801a(r7, r2)     // Catch:{  }
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r8 = r8.getProperPlayAddr()     // Catch:{  }
            if (r8 == 0) goto L_0x0095
            java.lang.String r2 = r8.getBitRatedRatioUri()     // Catch:{  }
        L_0x0095:
            boolean r8 = android.text.TextUtils.isEmpty(r2)     // Catch:{  }
            if (r8 == 0) goto L_0x009e
            java.lang.String r8 = ""
            goto L_0x00a2
        L_0x009e:
            java.lang.String r8 = com.toutiao.proxyserver.p1842d.C46474a.m146102a(r2)     // Catch:{  }
        L_0x00a2:
            java.lang.String r2 = "file"
            if (r7 != 0) goto L_0x00a9
            java.lang.String r7 = ""
            goto L_0x00cc
        L_0x00a9:
            com.ss.android.ugc.aweme.shortvideo.f.h r3 = new com.ss.android.ugc.aweme.shortvideo.f.h     // Catch:{  }
            java.lang.String r4 = "file"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{  }
            r5.<init>()     // Catch:{  }
            java.lang.String r7 = r7.getPath()     // Catch:{  }
            r5.append(r7)     // Catch:{  }
            java.lang.String r7 = "/"
            r5.append(r7)     // Catch:{  }
            r5.append(r8)     // Catch:{  }
            java.lang.String r7 = r5.toString()     // Catch:{  }
            r3.<init>(r4, r7)     // Catch:{  }
            java.lang.String r7 = r3.toString()     // Catch:{  }
        L_0x00cc:
            r0.put(r2, r7)     // Catch:{  }
            java.lang.String r7 = "play_sdcard_writable"
            boolean r8 = com.p280ss.android.ugc.aweme.video.C7276d.m22826g()     // Catch:{  }
            r0.put(r7, r8)     // Catch:{  }
            java.lang.String r7 = "play_network_available"
            com.ss.android.ugc.aweme.base.utils.g r8 = com.p280ss.android.ugc.aweme.base.utils.C6900g.m21454b()     // Catch:{  }
            boolean r8 = r8.mo16943d()     // Catch:{  }
            r0.put(r7, r8)     // Catch:{  }
            java.lang.String r7 = "play_free_space"
            long r2 = com.p280ss.android.ugc.aweme.utils.C42973bg.m136421a()     // Catch:{ Exception -> 0x00f7 }
            r0.put(r7, r2)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r7 = "play_all_space"
            long r2 = com.p280ss.android.ugc.aweme.utils.C42973bg.m136429b()     // Catch:{ Exception -> 0x00f7 }
            r0.put(r7, r2)     // Catch:{ Exception -> 0x00f7 }
        L_0x00f7:
            java.lang.String r7 = "play_diskcache"
            com.toutiao.proxyserver.f r8 = com.toutiao.proxyserver.C46534r.m146274f()     // Catch:{  }
            r2 = 0
            if (r8 == 0) goto L_0x0102
            r8 = 1
            goto L_0x0103
        L_0x0102:
            r8 = 0
        L_0x0103:
            r0.put(r7, r8)     // Catch:{  }
            java.lang.String r7 = "play_diskLruCache"
            com.toutiao.proxyserver.g r8 = com.toutiao.proxyserver.C46534r.m146273e()     // Catch:{  }
            if (r8 == 0) goto L_0x010f
            r2 = 1
        L_0x010f:
            r0.put(r7, r2)     // Catch:{  }
            java.lang.Class<com.toutiao.proxyserver.s> r7 = com.toutiao.proxyserver.C46536s.class
            java.lang.String r8 = "e"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
            if (r7 == 0) goto L_0x014a
            r7.setAccessible(r1)     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
            com.toutiao.proxyserver.s r7 = (com.toutiao.proxyserver.C46536s) r7     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
            if (r7 == 0) goto L_0x014a
            java.lang.Class<com.toutiao.proxyserver.s> r8 = com.toutiao.proxyserver.C46536s.class
            java.lang.String r2 = "c"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r2)     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
            if (r8 == 0) goto L_0x014a
            r8.setAccessible(r1)     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
            java.lang.String r8 = "proxyserver_state"
            if (r7 != 0) goto L_0x0141
            r7 = -1
            goto L_0x0145
        L_0x0141:
            int r7 = r7.intValue()     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
        L_0x0145:
            r0.put(r8, r7)     // Catch:{ JSONException -> 0x0149, JSONException -> 0x0149 }
            goto L_0x014a
        L_0x0149:
        L_0x014a:
            boolean r7 = com.p280ss.android.ugc.aweme.feed.p1234j.C28478a.m93587c(r9)
            if (r7 == 0) goto L_0x0196
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0178 }
            java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x0178 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r8 = "aweme_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.mo65711h()     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = r2.getAid()     // Catch:{ Exception -> 0x0178 }
            r7.put(r8, r2)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r8 = "creative_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.mo65711h()     // Catch:{ Exception -> 0x0178 }
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()     // Catch:{ Exception -> 0x0178 }
            java.lang.Long r2 = r2.getCreativeId()     // Catch:{ Exception -> 0x0178 }
            r7.put(r8, r2)     // Catch:{ Exception -> 0x0178 }
            goto L_0x017d
        L_0x0178:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
        L_0x017d:
            java.lang.String r8 = "aweme_ad_media_play_error_rate"
            com.p280ss.android.ugc.aweme.commercialize.log.C24974r.m21444a(r8, r1, r7)
            java.lang.String r8 = "aweme_ad_media_play_error"
            com.p280ss.android.ugc.aweme.commercialize.log.C24974r.m21444a(r8, r1, r7)
            com.ss.android.ugc.aweme.commercialize.feed.al r7 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80851a()
            android.content.Context r8 = r6.mo71838e()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.mo65711h()
            r7.mo64681l(r8, r2)
        L_0x0196:
            com.ss.android.ugc.aweme.base.utils.g r7 = com.p280ss.android.ugc.aweme.base.utils.C6900g.m21454b()
            boolean r7 = r7.mo16943d()
            if (r7 == 0) goto L_0x01f0
            java.lang.String r7 = "aweme_media_error_rate"
            com.ss.android.ugc.aweme.app.g.c r8 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21382a(r0)
            org.json.JSONObject r8 = r8.mo16888b()
            com.p280ss.android.ugc.aweme.app.C6877n.m21444a(r7, r1, r8)
            boolean r7 = com.p280ss.android.ugc.aweme.feed.p1234j.C28478a.m93589d(r9)
            if (r7 == 0) goto L_0x01f0
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r9.mo65711h()
            com.p280ss.android.ugc.aweme.commercialize.log.C24927a.m81775a(r7, r1, r1)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r8 = "alarm_reason"
            java.lang.String r1 = "fail_to_play"
            r7.put(r8, r1)     // Catch:{ Exception -> 0x01d9 }
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r9.mo65711h()     // Catch:{ Exception -> 0x01d9 }
            if (r8 == 0) goto L_0x01d9
            java.lang.String r8 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r9.mo65711h()     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r9 = r9.getAid()     // Catch:{ Exception -> 0x01d9 }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x01d9 }
        L_0x01d9:
            com.ss.android.ugc.aweme.common.MobClick r8 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r9 = "ad_alarm"
            com.ss.android.ugc.aweme.common.MobClick r8 = r8.setEventName(r9)
            java.lang.String r9 = "homepage_hot"
            com.ss.android.ugc.aweme.common.MobClick r8 = r8.setLabelName(r9)
            com.ss.android.ugc.aweme.common.MobClick r7 = r8.setJsonObject(r7)
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r7)
        L_0x01f0:
            java.lang.String r7 = "aweme_media_play_error_log"
            java.lang.String r8 = "play_error"
            com.ss.android.ugc.aweme.app.g.c r9 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21382a(r0)
            org.json.JSONObject r9 = r9.mo16888b()
            com.p280ss.android.ugc.aweme.app.C6877n.m21407a(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1227c.C28256q.mo71929b(com.ss.android.ugc.playerkit.model.c, com.ss.android.ugc.aweme.feed.model.Video, com.ss.android.ugc.aweme.feed.adapter.ac):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71924a(C44919c cVar, Video video, C28130ac acVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sourceId", cVar.f115522a);
            jSONObject3.put("errorCode", cVar.f115525d);
            jSONObject3.put("errorExtra", cVar.f115526e);
            jSONObject3.put("netWorkQuality", C14143b.m41756a().mo33901b().toString());
            jSONObject3.put("netWorkSpeed", (int) C14143b.m41756a().mo33902c());
            jSONObject3.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
            jSONObject3.put("playUrlIsLowBr", video.isLowBr());
            jSONObject3.put("video_duration", video.getDuration());
            C43208c.m137002a(jSONObject3);
            if (cVar.f115527f != null) {
                jSONObject3.put("extraInfo", cVar.f115527f.toString());
            }
            File a = C7276d.m22801a(C7276d.m22808b(), "cache");
            video.getProperPlayAddr();
            String str2 = "file";
            if (a == null) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(a.getPath());
                sb.append("/");
                sb.append(C46474a.m146102a(video.getPlayAddr().getBitRatedRatioUri()));
                str = new C39849h("file", sb.toString()).toString();
            }
            jSONObject3.put(str2, str);
            jSONObject = new JSONObject(jSONObject3.toString());
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (C6399b.m19944t()) {
            C6907h.onEvent(MobClick.obtain().setEventName("play_error").setLabelName("perf_monitor").setJsonObject(jSONObject));
        }
        if (C28478a.m93587c(acVar)) {
            try {
                jSONObject2 = new JSONObject(jSONObject3.toString());
                jSONObject2.put("aweme_id", acVar.mo65711h().getAid());
                jSONObject2.put("creative_id", acVar.mo65711h().getAwemeRawAd().getCreativeId());
            } catch (Exception unused2) {
                jSONObject2 = new JSONObject();
            }
            C24974r.m21444a("aweme_ad_media_play_error_rate", 1, jSONObject2);
            C24974r.m21444a("aweme_ad_media_play_error", 1, jSONObject2);
            C24671f.m80851a().mo64681l(mo71838e(), acVar.mo65711h());
        }
        if (C28240ai.m92788a(mo71838e())) {
            C6877n.m21444a("aweme_media_error_rate", 1, jSONObject3);
            if (C28478a.m93589d(acVar)) {
                C24927a.m81775a(acVar.mo65711h(), 1, 1);
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("alarm_reason", "fail_to_play");
                    if (acVar.mo65711h() != null) {
                        jSONObject4.put("group_id", acVar.mo65711h().getAid());
                    }
                } catch (Exception unused3) {
                }
                C6907h.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject4));
            }
            C6877n.m21444a(VideoBitRateABManager.m22786c().mo19004e() ? "aweme_media_bitrated_error_rate" : "aweme_media_original_error_rate", 1, jSONObject3);
        }
        C6877n.m21407a("aweme_media_play_error_log", "play_error", jSONObject3);
    }

    /* renamed from: a */
    private void m92879a(C39330h hVar) {
        C28648x s = m92929s();
        hVar.f102162e = (s == null || !s.mo67652v()) ? 1 : 2;
        C42961az.m136380a(hVar);
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        if (mo71841l()) {
            C28648x s = m92929s();
            C28540a.m93747b().mo73253b();
            C46184a.m145050a();
            C46183b.m145049b("first_refresh");
            C6903bc.m21505x().mo57932a(7, false);
            Session b = C44925a.m141730a().mo107407b();
            if (b != null) {
                C44944a.m141816a().mo107449b(b.key);
            }
            C28130ac z = m92936z();
            long k = m92919k(m92917j(z));
            this.f74469w = -1;
            this.f74429L++;
            this.f74430M++;
            C28418f.m93413a().f74936f = this.f74430M;
            try {
                if (C28478a.m93590e(z)) {
                    C24723e c = z.mo71564o().mo64577c();
                    if (c != null) {
                        c.mo64697a(k, this.f74429L);
                    }
                    if (!(z.mo65711h() == null || z.mo65711h().getVideoControl() == null || z.mo65711h().getVideoControl().showProgressBar != 0)) {
                        if (!C43268o.m137250H()) {
                            mo71937p().mo104924D();
                        } else if (z.mo71553b() != null) {
                            z.mo71553b().mo71675ag();
                        }
                    }
                    if (C28478a.m93582a(z)) {
                        C24671f.m80856f().mo63382a(z.mo65711h(), mo71838e(), z.mo65716m().mo71570u(), this.f74429L);
                    }
                    z.mo71564o().mo64550a(this.f74429L);
                    if (z.mo65711h() != null && this.f74429L > 0) {
                        Aweme h = z.mo65711h();
                        if (C25329c.m83203E(h)) {
                            C25272bk.m83055a().mo65886a(this.f74429L);
                        }
                        if (h.isAd() && this.f74430M >= this.f74431N && !C28418f.m93413a().f74934d && c != null && c.mo64707b()) {
                            if (z.mo71564o().mo64570a(mo71842m(), z)) {
                                if (C43268o.m137250H() && z.mo71553b() != null) {
                                    z.mo71553b().mo71672ad();
                                }
                                this.f74445aa = true;
                                C28418f.m93413a().f74934d = true;
                                C28418f.m93413a().f74935e = true;
                                if (!(z == null || z.mo65716m() == null)) {
                                    z.mo65716m().mo63047b(str);
                                }
                                return;
                            }
                            this.f74431N++;
                        }
                    }
                    this.f74468v = System.currentTimeMillis();
                    if (!(c == null || s == null || s.mo73394bq())) {
                        c.mo64696a(2, this.f74429L + 1);
                    }
                    if (s != null) {
                        s.mo71900af();
                        s.mo67629i();
                    }
                    C39330h hVar = new C39330h(7);
                    hVar.f102163f = str;
                    m92879a(hVar);
                    if (TextUtils.equals(this.f74451ag, str)) {
                        this.f74450af++;
                    } else {
                        this.f74450af = 1;
                        this.f74451ag = str;
                    }
                    z.mo65716m().mo71556d(this.f74450af);
                    if (z.mo65716m().mo71575z() != null) {
                        z.mo65716m().mo71575z().mo104880b(this.f74450af);
                    }
                    if (s != null) {
                        s.mo67613a(str);
                    }
                    C6903bc.m21505x().mo57930a();
                    if (!(z == null || z.mo65716m() == null)) {
                        z.mo65716m().mo63047b(str);
                    }
                    AVCameraInitTask.init(this.f74450af, false);
                    C24132c.m79286a(this.f74450af, mo71912a());
                }
            } finally {
                if (!(z == null || z.mo65716m() == null)) {
                    z.mo65716m().mo63047b(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final long mo71912a() {
        return m92919k((Aweme) null);
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        C7190b bVar;
        String str2 = str;
        if (C7174p.m22398a().mo18649b()) {
            C1592h.m7855a((Callable<TResult>) new C28239ah<TResult>(str2), (Executor) C28411a.m93380a());
        }
        C28648x s = m92929s();
        if (s != null) {
            s.mo71882S();
        }
        C28130ac h = m92912h(str);
        if (!(h == null || h.mo65711h() == null || h.mo65716m() == null)) {
            h.mo65716m().mo64949c(str2);
            long g = C28434i.m93478g();
            C28580o.m93836f();
            boolean d = C28275c.m92999d(h.mo65711h().getAid());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C28265s sVar = r0;
            long j = elapsedRealtime;
            C28265s sVar2 = new C28265s(this, g, elapsedRealtime, d, h, C28580o.m93835e(), C28580o.m93834d());
            C1592h.m7855a((Callable<TResult>) sVar, (Executor) C6907h.m21516a());
            if (s != null) {
                s.mo73377b(j);
            }
            if (this.f74436S != 0) {
                new C34956a().mo88544a(String.valueOf(j - this.f74436S)).mo88541a(mo71839f()).mo88543a(h.mo65711h().getVideo()).mo88542a(h).mo88540a(2).mo88545b(m92935y()).f91212a.mo88539a();
            }
            if (h.mo65711h().getVideo() != null) {
                this.f74448ad = C43305j.m137386g().mo105092j(h.mo65711h().getVideo().getPlayAddr());
            }
            this.f74436S = j;
            C43305j.m137386g().mo105022a((C43270a) s);
            C43216b g2 = m92909g(h);
            if (g2 != null) {
                g2.mo104878b();
            }
        }
        this.f74455i.f74354a = 1;
        if (s != null) {
            s.mo71896ab();
        }
        m92879a(new C39330h(2));
        this.f74434Q = false;
        if (m92868G() && !this.f74452ah) {
            this.f74452ah = true;
            mo71926b();
        }
        try {
            bVar = (C7190b) C6384b.m19835a().mo15290a(PlayerUnifiedAbConfigExperiment.class, true, "player_unified_ab_config", (Object) C6384b.m19835a().mo15295d().player_unified_ab_config, C7190b.class);
        } catch (Throwable unused) {
            bVar = null;
        }
        if (bVar != null && bVar.f20120a == 1) {
            this.f74466t = false;
            this.f74419B = -1;
        }
        this.f74428K = 0;
        this.f74424G = false;
        this.f74425H = false;
        this.f74426I = 0;
        this.f74427J = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo71915a(long j, long j2, boolean z, C28130ac acVar, String str, String str2) throws Exception {
        C6909j a = new C6909j().mo16966a("request_id", m92934x().optString("request_id"));
        String str3 = "duration";
        long j3 = 0;
        if (j > 0) {
            j3 = j2 - j;
        }
        C6909j a2 = a.mo16966a(str3, Long.toString(j3));
        String str4 = "is_first";
        int i = z ? -1 : C33221a.m107193a() ? 1 : 0;
        JSONObject a3 = a2.mo16966a(str4, String.valueOf(i)).mo16966a("group_id", acVar.mo65711h().getAid()).mo16966a("is_from_feed_cache", String.valueOf(z ? 1 : 0)).mo16966a("top_activity", str).mo16966a("feed_tab", str2).mo16967a();
        try {
            a3.put("preloader_type", C43220a.m137073b());
        } catch (Exception e) {
            C2077a.m9160a((Throwable) e);
        }
        C6907h.onEvent(MobClick.obtain().setEventName("video_request").setLabelName("perf_monitor").setValue(acVar.mo65711h().getAid()).setJsonObject(a3));
        C6907h.m21525a("video_request", a3);
        C33221a.m107190a("video_request", a3);
        C21097b.m71144a("video_request", a3);
        return null;
    }

    /* renamed from: a */
    private boolean m92886a(User user) {
        if (this.f74453ai == null) {
            this.f74453ai = new HashSet();
        }
        if (this.f74453ai.contains(user.getUid())) {
            return true;
        }
        this.f74453ai.add(user.getUid());
        return false;
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
        m92883a(z, false);
    }

    /* renamed from: a */
    private void m92883a(boolean z, boolean z2) {
        if (this.f74466t) {
            C28130ac z3 = m92936z();
            if (C28478a.m93590e(z3)) {
                this.f74425H = z;
                if (z) {
                    this.f74421D++;
                    if (this.f74422E == -1) {
                        this.f74422E = SystemClock.elapsedRealtime();
                    }
                } else if (this.f74422E != -1) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.f74422E;
                    this.f74423F += elapsedRealtime;
                    this.f74422E = -1;
                    if (!z2 && elapsedRealtime >= ((long) C6384b.m19835a().mo15287a(VideoBufferingThresholdExperiment.class, true, "video_buffering_threshold", C6384b.m19835a().mo15295d().video_buffering_threshold, 0))) {
                        m92888b(z3, elapsedRealtime, "resume", false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo71916a(C28130ac acVar, long j, String str, boolean z) throws Exception {
        JSONObject c = m92895c(acVar, j, str, z);
        if (c != null) {
            C21097b.m71144a(z ? "video_block" : "video_decoder_block", c);
            if (z) {
                m92874a(acVar, c);
            }
            C6877n.m21447a(z ? "aweme_block_bitrate_netspeed_log" : "aweme_block_decoder_log", c);
            if (C37653j.m120481c() && z) {
                c.put("traffic_economy_mode", C37653j.f98123a.mo94946d());
            }
            C6907h.m21525a(z ? "video_block" : "video_decoder_block", c);
            C28255p.m92860a("block");
        }
        return null;
    }

    /* renamed from: a */
    private static void m92878a(C34960a aVar, JSONObject jSONObject) {
        if (jSONObject != null && aVar != null) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("cell_id", aVar.f91246a);
                jSONObject2.put("snr", aVar.f91248c);
                jSONObject2.put("rsrp", aVar.f91247b);
                jSONObject2.put("lac", aVar.f91249d);
                jSONArray.put(jSONObject2);
                jSONObject.put("cell_infos", jSONArray);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        C24132c.m79286a(0, 0);
        this.f74428K = SystemClock.elapsedRealtime();
        C6903bc.m21507z();
        C6857a.m21312e().mo16827b("feed_video_to_total", true);
        C6857a.m21312e().mo16827b("feed_total", true);
        C6857a.m21312e().mo16831d();
        C28062aa.m91698a().mo71510b();
        this.f74445aa = false;
        C28648x s = m92929s();
        C29004c cVar = new C29004c(m92866E(), this.f74357d, this.f74358e, eVar, s);
        C42961az.m136380a(cVar);
        C6903bc.m21505x().mo57932a(9, false);
        String str = eVar.f115532a;
        Session b = C44925a.m141730a().mo107407b();
        if (b != null) {
            C44944a.m141816a().mo107447a(b.key);
        }
        CurPlayVideoRecord.INSTANCE.setVideoId(str);
        m92863B();
        C28130ac h = m92912h(str);
        if (!(h == null || h.mo65711h() == null || h.mo65716m() == null)) {
            h.mo65716m().mo63045a(eVar);
            if (C28478a.m93590e(h)) {
                if (C6903bc.m21505x().mo57941b()) {
                    if (!C43268o.m137250H()) {
                        mo71937p().mo104948x();
                    } else {
                        C44960f b2 = h.mo71553b();
                        if (b2 != null) {
                            b2.mo71672ad();
                        }
                    }
                }
                C39330h hVar = new C39330h(5);
                long n = mo71937p().mo104915n();
                if (C26057e.m85589a(mo71840g()) && n > 0) {
                    hVar.f102159b = n;
                }
                m92879a(hVar);
                C6883f.m21415a();
                m92925p(h.mo65711h());
                Video video = h.mo65711h().getVideo();
                if (video != null) {
                    VideoUrlModel playAddr = video.getPlayAddr();
                    if (playAddr != null) {
                        C43305j.m137386g().mo105094l(playAddr);
                        if (this.f74436S != 0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f74436S;
                            this.f74436S = 0;
                            String valueOf = String.valueOf(elapsedRealtime);
                            C1592h.m7855a(C28267u.f74499a, (Executor) C7258h.m22732e());
                            new C34956a().mo88544a(valueOf).mo88541a(mo71839f()).mo88543a(video).mo88542a(h).mo88540a(1).mo88545b(m92935y()).f91212a.mo88539a();
                            C34953a aVar = new C34953a();
                            if (PosterSRProcessorInitTask.NEED_POSTER_PROCESS) {
                                C28130ac h2 = m92912h(str);
                                if (h2 != null) {
                                    C28416d G = h2.mo71546G();
                                    if (G != null) {
                                        aVar.mo88531a(G);
                                    }
                                }
                            }
                            aVar.mo88529a(h).mo88532a(playAddr).mo88535a(eVar).mo88528a(mo71838e()).mo88533a(s).mo88530a((C28250k) s).mo88534a(m92909g(h)).mo88537b(this.f74358e).mo88536a(valueOf).mo88526a(this.f74448ad).mo88527a(this.f74355b).f91203a.mo88522a();
                            m92877a(playAddr);
                        }
                    }
                }
            } else {
                return;
            }
        }
        GcSuppression.m30429a().mo24996d();
        C7121a.m22259g();
        C28275c.f74526b.mo71957c(str);
    }

    /* renamed from: b */
    public final void mo64946b(final C44919c cVar) {
        if (mo71841l()) {
            C28130ac h = m92912h(cVar.f115522a);
            if (h != null && h.mo65716m() != null) {
                h.mo65716m().mo64946b(cVar);
                if (C282637.f74485a[mo71937p().mo104901a().ordinal()] == 1 && ((cVar.f115527f == null || (cVar.f115527f instanceof Integer)) && h.mo65711h() != null)) {
                    final Video video = h.mo65711h().getVideo();
                    if (video != null) {
                        C6726a.m20842a(new Runnable() {
                            public final void run() {
                                String str;
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    if (cVar.f115527f == null) {
                                        cVar.f115527f = Integer.valueOf(1);
                                    }
                                    jSONObject.put("type", cVar.f115527f.toString());
                                    jSONObject.put("sourceId", cVar.f115522a);
                                    jSONObject.put("errorCode", cVar.f115525d);
                                    jSONObject.put("errorExtra", cVar.f115526e);
                                    jSONObject.put("netWorkQuality", C14143b.m41756a().mo33901b().toString());
                                    jSONObject.put("netWorkSpeed", (int) C14143b.m41756a().mo33902c());
                                    jSONObject.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
                                    jSONObject.put("playUrlIsLowBr", video.isLowBr());
                                    jSONObject.put("playerType", C28256q.this.mo71937p().mo104901a().toString());
                                    if (cVar.f115527f != null) {
                                        jSONObject.put("extraInfo", cVar.f115527f.toString());
                                    }
                                    File a = C7276d.m22801a(C7276d.m22808b(), "cache");
                                    String str2 = "file";
                                    if (a == null) {
                                        str = "";
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(a.getPath());
                                        sb.append("/");
                                        sb.append(C46474a.m146102a(video.getProperPlayAddr().getUri()));
                                        str = new C39849h("file", sb.toString()).toString();
                                    }
                                    jSONObject.put(str2, str);
                                } catch (JSONException unused) {
                                }
                                C6877n.m21447a("aweme_media_play_retry_on_freezing", jSONObject);
                                C6907h.m21525a("aweme_media_play_retry_on_freezing", jSONObject);
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo71927b(Aweme aweme) {
        mo71920a(aweme, 0);
    }

    /* renamed from: a */
    public final String mo71920a(Aweme aweme, int i) {
        String str;
        this.f74457k = aweme;
        if (this.f74465s == null) {
            try {
                this.f74465s = (KeyguardManager) mo71838e().getSystemService("keyguard");
            } catch (Exception unused) {
            }
        }
        if (this.f74465s == null || !this.f74465s.inKeyguardRestrictedInputMode()) {
            this.f74458l = false;
            this.f74457k = null;
            C28648x s = m92929s();
            if (s != null) {
                s.mo73420o(true);
            }
            boolean z = !m92911g(aweme);
            boolean z2 = !m92906e(aweme);
            boolean f = m92908f(aweme);
            boolean a = C32698a.m105818a(aweme);
            if (z || z2 || f || a) {
                if (a) {
                    C10761a.m31410e(mo71838e(), C32698a.m105817a(aweme, R.string.cuk)).mo25750a();
                } else if (f) {
                    C10761a.m31409e(mo71838e(), (int) R.string.fo2).mo25750a();
                }
                if (z) {
                    return "32";
                }
                if (z2) {
                    return "42";
                }
                return f ? "43" : "44";
            }
            C25155g.f66365a.mo64616b();
            C28130ac z3 = m92936z();
            if (C28478a.m93590e(z3)) {
                C24716aj o = z3.mo71564o();
                C24723e i2 = m92915i(z3);
                z3.mo65716m().mo71554b(aweme);
                if (i2 != null) {
                    i2.mo64699a(mo71838e(), aweme);
                }
                if (o.mo64576b()) {
                    o.mo64568a(false);
                }
            }
            if (!m92885a(z3, aweme) || (!z3.mo65716m().mo71568s() && !m92864C())) {
                str = "41";
            } else if (m92884a(z3.mo65716m())) {
                StreamUrlModel streamUrlModel = aweme.getStreamUrlModel();
                if (!(streamUrlModel != null || aweme == null || aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().room == null)) {
                    StreamUrlStruct streamUrlStruct = aweme.getRoomFeedCellStruct().room.stream_url;
                    if (streamUrlStruct != null) {
                        streamUrlModel = new StreamUrlModel();
                        streamUrlModel.f75165id = String.valueOf(streamUrlStruct.sid);
                        streamUrlModel.rtmpPullUrl = streamUrlStruct.rtmp_pull_url;
                    }
                }
                if (streamUrlModel == null) {
                    return "34";
                }
                if (!C43268o.m137250H()) {
                    mo71937p().mo104948x();
                } else {
                    C44960f b = z3.mo71553b();
                    if (b != null) {
                        b.mo71672ad();
                    }
                }
                if (C6399b.m19944t()) {
                    C43238k.m137170a().mo104974a(z3.mo65716m().mo71569t());
                    C43238k.m137170a().mo104976a(aweme.getAid(), streamUrlModel, (C34976f) this);
                } else {
                    C43238k.m137170a();
                }
                str = "35";
            } else if (C28478a.m93590e(z3)) {
                Video video = z3.mo65711h().getVideo();
                if (video == null) {
                    return "36";
                }
                if (z3.mo65711h().getVideo().getProperPlayAddr() == null) {
                    return "37";
                }
                video.setRationAndSourceId(m92920k(z3));
                if (!C43268o.m137250H()) {
                    mo71937p().mo104930a(z3.mo65716m().mo71569t());
                    mo71937p().mo104939a((C34976f) this);
                    mo71937p().mo104933a(video, (C34976f) this, i);
                    str = "38";
                } else {
                    C44960f b2 = z3.mo71553b();
                    b2.mo71663a((C34976f) this);
                    b2.mo71660a(video);
                    str = "39";
                }
                if (this.f74424G) {
                    m92891b(true, false);
                }
                if (s != null) {
                    s.mo71895aa();
                }
            } else {
                str = "40";
            }
            if (this.f74418A != -1) {
                this.f74472z += SystemClock.elapsedRealtime() - this.f74418A;
                this.f74418A = -1;
            }
            m92865D();
            return str;
        }
        if (C6776h.m20942a() || C6776h.m20950c() || C43045c.m136575e() || VERSION.SDK_INT >= 28) {
            this.f74458l = true;
        }
        return "31";
    }

    /* renamed from: a */
    private static boolean m92885a(C28130ac acVar, Aweme aweme) {
        return m92913h(acVar) && acVar.mo65711h() == aweme;
    }

    /* renamed from: a */
    public final String mo71921a(Aweme aweme, boolean z, C28130ac acVar) {
        String str;
        C28648x s = m92929s();
        if (s != null) {
            s.mo71884U();
        }
        if (acVar == null) {
            acVar = m92936z();
        }
        if (acVar == null || acVar.mo65716m() == null) {
            return "12";
        }
        if (!(acVar == null || acVar.mo65716m() == null || m92864C())) {
            C23487o.m77140a(acVar.mo65716m().mo71570u(), 0);
        }
        if (!m92885a(acVar, aweme) || (!acVar.mo65716m().mo71568s() && !m92864C())) {
            str = "22";
        } else {
            C1592h.m7855a(C28268v.f74500a, (Executor) C7258h.m22732e());
            Video video = acVar.mo65711h().getVideo();
            if (m92884a(acVar.mo65716m()) && m92906e(aweme)) {
                m92889b(acVar, aweme);
                this.f74466t = false;
                str = "14";
            } else if (C32698a.m105818a(aweme)) {
                C10761a.m31410e(mo71838e(), C32698a.m105817a(aweme, R.string.fp_)).mo25750a();
                return "15";
            } else if (m92908f(aweme)) {
                C10761a.m31409e(mo71838e(), (int) R.string.fo2).mo25750a();
                return "16";
            } else if (video == null) {
                return "17";
            } else {
                VideoUrlModel properPlayAddr = video.getProperPlayAddr();
                if (properPlayAddr == null) {
                    return "18";
                }
                if (!aweme.isLive() && !aweme.isCanPlay()) {
                    return "19";
                }
                C43222g p = mo71937p();
                C43222g p2 = !C43268o.f112004a ? mo71937p() : C43184ac.m136934a().mo104816a(properPlayAddr.getUri());
                p2.mo104930a(acVar.mo65716m().mo71569t());
                video.setRationAndSourceId(m92920k(acVar));
                if (!m92911g(aweme) || !m92906e(aweme)) {
                    str = "21";
                } else {
                    String str2 = "20";
                    p2.mo104939a((C34976f) this);
                    p2.mo104934a(video, z);
                    if (C43268o.f112004a) {
                        C43184ac.m136934a().mo104817a(p);
                    }
                    if (C6399b.m19944t()) {
                        if (m92921l(aweme)) {
                            p2.mo104950z();
                            C10761a.m31399c(mo71838e(), (int) R.string.chd).mo25750a();
                        } else {
                            p2.mo104921A();
                        }
                    }
                    this.f74466t = false;
                    str = str2;
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public final void mo71925a(String str, boolean z, C28130ac acVar) {
        long currentTimeMillis;
        m92865D();
        if (this.f74469w == -1) {
            currentTimeMillis = System.currentTimeMillis() - this.f74468v;
        } else {
            currentTimeMillis = (System.currentTimeMillis() - this.f74468v) - this.f74469w;
        }
        long j = currentTimeMillis;
        if (acVar == null) {
            acVar = m92936z();
        }
        if (C28478a.m93590e(acVar)) {
            C24723e i = m92915i(acVar);
            if (i != null && !this.f74445aa) {
                if (!z || this.f74435R == null) {
                    i.mo64701a(this.f74435R, str, j, this.f74429L + 1);
                } else {
                    i.mo64701a(this.f74435R, this.f74435R.getAid(), j, this.f74429L + 1);
                }
            }
            this.f74435R = m92917j(acVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo71918a(Aweme aweme, String str, String str2, String str3, C28648x xVar, C28130ac acVar, long j, String str4, String str5, double d, String str6, C43222g gVar, String str7, String str8, String str9) throws Exception {
        Aweme aweme2 = aweme;
        String str10 = str2;
        String str11 = str3;
        JSONObject x = m92934x();
        try {
            x.put("author_id", C33230ac.m107205a(aweme));
            if (!TextUtils.isEmpty(str)) {
                String str12 = str;
                x.put("poi_id", str);
            }
            if (C33230ac.m107220c(this.f74357d)) {
                x.put("poi_type", C33230ac.m107229h(aweme));
                x.put("poi_channel", C33230ac.m107214b());
                x.put("city_info", C33230ac.m107204a());
                x.put("distance_info", C33230ac.m107231i(aweme));
            }
            x.put(C22704b.f60415d, m92868G() ? 1 : 0);
            x.put("content_source", str2);
            if (!TextUtils.isEmpty(str3)) {
                x.put("enter_method", str3);
            }
            if (!TextUtils.isEmpty(xVar.mo71887X().getCarrierType())) {
                x.put("carrier_type", xVar.mo71887X().getCarrierType());
            }
            if (!TextUtils.isEmpty(xVar.mo71887X().getFromGroupId())) {
                x.put("from_group_id", xVar.mo71887X().getFromGroupId());
            }
            if (!TextUtils.isEmpty(xVar.mo71887X().getReferCommodityId())) {
                x.put("refer_commodity_id", xVar.mo71887X().getReferCommodityId());
            }
            if (!TextUtils.isEmpty(xVar.mo71887X().getDataType())) {
                x.put("data_type", xVar.mo71887X().getDataType());
            }
        } catch (JSONException unused) {
        }
        if (C28478a.m93587c(acVar)) {
            C6907h.onEvent(MobClick.obtain().setEventName("ad_play_time").setValue(String.valueOf(j)).setExtValueString(C33230ac.m107238m(aweme)).setJsonObject(new C6869c().mo16887a("request_id", m92934x().optString("request_id")).mo16887a("is_photo", C33230ac.m107239n(aweme)).mo16888b()));
        }
        C6907h.m21519a(mo71838e(), "play_time", this.f74357d, str4, j, x);
        C33255az g = ((C33255az) ((C33255az) ((C33255az) new C33255az().mo85221a(this.f74357d).mo85224b(str5).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme)))).mo85071g(aweme).mo85218a(j).mo85215a(d).mo85283l(str6)).mo85240u(xVar.mo71878O()).mo85226d(gVar.mo104901a().toString()).mo85227e(C33230ac.m107206a(aweme, this.f74358e)).mo85216a(gVar.mo104908g()).mo85232j(str7).mo85233k(str8).mo85231i(str9).mo85284m(C33230ac.m107216b(aweme, this.f74358e))).mo85230g(str2);
        if (xVar != null) {
            m92882a(xVar.mo67597C(), (C33270l) g);
        }
        if (aweme2 != null) {
            C28202ag.f74305b.mo71796a(aweme.getAid(), aweme.getAwemeType(), this.f74358e, j);
        }
        if (!(xVar == null || xVar.mo71887X() == null)) {
            g.mo85220a(xVar.mo71887X(), xVar.mo73366ap());
            g.mo85219a(xVar.mo71887X());
            g.mo85223b(xVar.mo71887X());
            g.mo85234o(xVar.mo71887X().getCarrierType());
            g.mo85235p(xVar.mo71887X().getReferSeedId());
            g.mo85236q(xVar.mo71887X().getReferSeedName());
            g.mo85237r(xVar.mo71887X().getFromGroupId());
            g.mo85238s(xVar.mo71887X().getReferCommodityId());
            g.mo85239t(xVar.mo71887X().getDataType());
            g.mo85241v(xVar.mo71887X().getCreationId());
        }
        if (!TextUtils.isEmpty(str3)) {
            g.mo85229f(str3);
        }
        g.mo85252e();
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo71913a(int i, long j, long j2, Video video) throws Exception {
        C6877n.m21407a("aweme_media_block_log1", "video_block", C43208c.m137001a(C6869c.m21381a().mo16884a("count_rate", Float.valueOf((((float) i) * 1000.0f) / ((float) j))).mo16886a("duration_rate", Long.valueOf(j2 / j)).mo16885a("block_count", Integer.valueOf(i)).mo16886a("block_duration", Long.valueOf(j2))).mo16886a("duration", Long.valueOf(j)).mo16885a("video_duration", Integer.valueOf(video != null ? video.getDuration() : 0)).mo16887a("netType", NetworkUtils.getNetworkAccessType(mo71838e())).mo16888b());
        return null;
    }

    /* renamed from: b */
    public final void mo71928b(Aweme aweme, int i) {
        String str;
        String str2;
        C6857a.m21312e().mo16827b("feed_ui_to_texture_available", false);
        String str3 = "0";
        try {
            if (!m92869H() || (C6399b.m19944t() && !m92906e(aweme))) {
                str2 = "3";
            } else {
                C28130ac z = m92936z();
                if (z == null || z.mo65716m() == null) {
                    str2 = "4";
                } else if (m92864C()) {
                    mo71937p().mo104930a(z.mo65716m().mo71569t());
                    C28209am.m92725a("7");
                    C28209am.m92726a(false);
                    return;
                } else if (z.mo65711h() != aweme) {
                    m92922m(aweme);
                    str2 = "5";
                } else if (aweme.isLive()) {
                    m92889b(z, aweme);
                    str2 = "6";
                } else if (!mo71937p().mo104942b((C34976f) this)) {
                    mo71937p().mo104939a((C34976f) this);
                    if (mo71937p().mo104917p()) {
                        mo71937p().mo104930a(z.mo65716m().mo71569t());
                        mo71937p().mo104945u();
                        str2 = "8";
                    } else {
                        str2 = C28478a.m93590e(z) ? m92923n(aweme) : "9";
                    }
                } else {
                    String c = m92894c(aweme, i);
                    try {
                        m92927q(aweme);
                        str = c;
                        if (C6399b.m19944t() && m92901c(false) && !mo71937p().mo104942b((C34976f) this)) {
                            mo71937p().mo104939a((C34976f) this);
                        }
                        C28209am.m92725a(str);
                        C28209am.m92726a(false);
                    } catch (Throwable th) {
                        th = th;
                        str3 = c;
                        C28209am.m92725a(str3);
                        C28209am.m92726a(false);
                        throw th;
                    }
                }
            }
            str = str2;
            mo71937p().mo104939a((C34976f) this);
            C28209am.m92725a(str);
            C28209am.m92726a(false);
        } catch (Throwable th2) {
            th = th2;
            C28209am.m92725a(str3);
            C28209am.m92726a(false);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo71923a(Aweme aweme, boolean z) {
        C28648x s = m92929s();
        C28130ac z2 = m92936z();
        if (C32698a.m105818a(aweme)) {
            C10761a.m31410e(mo71838e(), C32698a.m105817a(aweme, R.string.fp_)).mo25750a();
        } else if (z2 != null && z2.mo65716m() != null && z2.mo65711h() == aweme && !m92908f(aweme)) {
            C6903bc.m21505x().mo57930a();
            if (aweme != null && (aweme.getVideo() != null || aweme.isLive())) {
                int i = this.f74455i.f74354a;
                StringBuilder sb = new StringBuilder("current play status:");
                sb.append(i);
                C6921a.m21552a(3, "PlayerController", sb.toString());
                if (i == 2) {
                    if (!aweme.isLive()) {
                        C6907h.m21518a(mo71838e(), "click", "video_pause", aweme.getAid(), 0);
                        new C33252aw().mo85159c(aweme, this.f74358e).mo85158a(this.f74357d).mo85252e();
                        if (!C43268o.m137250H()) {
                            mo71937p().mo104948x();
                        } else {
                            C44960f b = z2.mo71553b();
                            if (b != null) {
                                b.mo71672ad();
                            }
                        }
                        if (z) {
                            if (s != null) {
                                s.mo71897ac();
                            } else {
                                C6921a.m21554a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                            }
                        }
                        C43238k.m137170a().mo104979b(this);
                        C29013e eVar = new C29013e(m92866E(), this.f74357d, this.f74358e, 1, s);
                        C42961az.m136380a(eVar);
                        return;
                    }
                    C6921a.m21552a(6, "PlayerController", "aweme is live aweme,maybe is bug?");
                } else if (i == 3) {
                    C6907h.m21518a(mo71838e(), "click", "video_play", aweme.getAid(), 0);
                    if (aweme.isLive()) {
                        if (C6399b.m19944t()) {
                            C43238k.m137170a().mo104974a(z2.mo65716m().mo71569t());
                            C43238k.m137170a().mo104976a(aweme.getAid(), aweme.getStreamUrlModel(), (C34976f) this);
                        } else {
                            C43238k.m137170a();
                        }
                        if (!C43268o.m137250H()) {
                            mo71937p().mo104948x();
                        } else {
                            C44960f b2 = z2.mo71553b();
                            if (b2 != null) {
                                b2.mo71672ad();
                            }
                        }
                    } else if (aweme.getVideo().getProperPlayAddr() == null) {
                        C6921a.m21554a((Exception) new IllegalStateException("try resume play,but model is null"));
                        return;
                    } else {
                        mo71927b(aweme);
                    }
                    if (s != null) {
                        s.mo71895aa();
                    } else {
                        C6921a.m21554a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                    }
                } else if (i != 0 || s == null || !s.mo71898ad()) {
                    StringBuilder sb2 = new StringBuilder("status:");
                    sb2.append(i);
                    sb2.append(",don't know how to do in this situation");
                    C6921a.m21552a(6, "PlayerController", sb2.toString());
                } else {
                    m92902d(s.mo71904aj(), true);
                    s.mo71895aa();
                }
            }
        } else if (mo71838e() == null || !m92908f(aweme)) {
            StringBuilder sb3 = new StringBuilder("try to handlePlay,but can't meet the conditions.holder:");
            boolean z3 = false;
            sb3.append(z2 == null);
            sb3.append(",player:");
            if (z2 == null || z2.mo65716m() == null) {
                z3 = true;
            }
            sb3.append(z3);
            C6921a.m21554a((Exception) new IllegalStateException(sb3.toString()));
        } else {
            C10761a.m31409e(mo71838e(), (int) R.string.fo2).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo71922a(C28130ac acVar) {
        if (acVar == null) {
            acVar = m92936z();
        }
        this.f74451ag = "";
        if (this.f74467u) {
            mo71925a(this.f74435R == null ? "" : this.f74435R.getAid(), false, acVar);
        }
        this.f74429L = 0;
        if (C28478a.m93590e(acVar)) {
            acVar.mo71564o().mo64550a(this.f74429L);
        }
        this.f74467u = false;
    }

    /* renamed from: c */
    public final void mo71836c() {
        if (C43268o.m137250H()) {
            C28130ac z = m92936z();
            if (C28478a.m93590e(z) && z.mo71553b() != null) {
                z.mo71553b().mo71692b(this);
            }
        }
        super.mo71836c();
        C0688e.m2941a(mo71838e()).mo2837a(this.f74437T);
        m92862A();
    }

    /* renamed from: a */
    public final void mo71834a(Activity activity, Fragment fragment) {
        super.mo71834a(activity, fragment);
        this.f74437T = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && C28256q.this.f74457k != null && C28256q.this.f74458l) {
                    C28256q.this.mo71927b(C28256q.this.f74457k);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0688e.m2941a((Context) activity).mo2838a(this.f74437T, intentFilter);
    }

    /* renamed from: C */
    private static boolean m92864C() {
        return C43310q.m137426d();
    }

    /* renamed from: A */
    private void m92862A() {
        if (this.f74438U != null) {
            this.f74438U.dispose();
            this.f74438U = null;
        }
    }

    /* renamed from: E */
    private Aweme m92866E() {
        return m92917j(m92936z());
    }

    /* renamed from: F */
    private boolean m92867F() {
        return TextUtils.equals(mo71843n(), "homepage_hot");
    }

    /* renamed from: G */
    private boolean m92868G() {
        C28648x s = m92929s();
        if (s == null) {
            return false;
        }
        return s.mo67652v();
    }

    /* renamed from: s */
    private C28648x m92929s() {
        return (C28648x) this.f74464r.get();
    }

    /* renamed from: w */
    private void m92933w() {
        C28648x s = m92929s();
        if (s != null) {
            s.mo73403e(this.f74432O);
        }
    }

    /* renamed from: x */
    private JSONObject m92934x() {
        C28648x s = m92929s();
        if (s != null) {
            return s.mo71883T();
        }
        return null;
    }

    /* renamed from: y */
    private String m92935y() {
        JSONObject x = m92934x();
        if (x != null) {
            return x.optString("request_id");
        }
        return "";
    }

    /* renamed from: z */
    private C28130ac m92936z() {
        C28648x s = m92929s();
        if (s == null) {
            return null;
        }
        return s.mo71903ai();
    }

    /* renamed from: i */
    public final void mo71933i() {
        this.f74463q = false;
        this.f74418A = SystemClock.elapsedRealtime();
        this.f74470x = System.currentTimeMillis();
    }

    /* renamed from: p */
    public final C43222g mo71937p() {
        if (this.f74462p != null) {
            return this.f74462p;
        }
        return C43316v.m137450K();
    }

    /* renamed from: t */
    private boolean m92930t() {
        Activity d = mo71837d();
        if (d == null || ScrollSwitchStateManager.m98918a((FragmentActivity) d).mo79723b("page_feed")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m92932v() {
        return (!C6915f.m21543b() && (mo71837d() instanceof C26214y)) ? false : false;
    }

    /* renamed from: k */
    public final long mo71935k() {
        if (this.f74469w == -1) {
            return System.currentTimeMillis() - this.f74468v;
        }
        return (System.currentTimeMillis() - this.f74468v) - this.f74469w;
    }

    /* renamed from: B */
    private void m92863B() {
        try {
            int intValue = C30199h.m98861a().getVideoPlayProgressCount().intValue();
            if (intValue >= 100 && intValue <= 1000 && mo71912a() > 29000) {
                long a = mo71912a() / ((long) intValue);
                if (a > 50) {
                    mo71937p().mo104929a((int) a);
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        mo71937p().mo104923C();
    }

    /* renamed from: D */
    private void m92865D() {
        if (this.f74470x != -1) {
            if (this.f74469w == -1) {
                this.f74469w = System.currentTimeMillis() - this.f74470x;
            } else {
                this.f74469w += System.currentTimeMillis() - this.f74470x;
            }
            this.f74470x = -1;
        }
    }

    /* renamed from: H */
    private boolean m92869H() {
        C28648x s = m92929s();
        if (s == null || !s.mo73516bw()) {
            return false;
        }
        if (VERSION.SDK_INT < 21 || VERSION.SDK_INT > 22) {
            return true;
        }
        if (s.ay_() == null || !s.ay_().isResumed()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private static boolean m92931u() {
        if (C30199h.m98861a().getLiveSquareGuideShowCount() != null && C32960dc.m106528a(0) < C30199h.m98861a().getLiveSquareGuideShowCount().intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final Context mo71838e() {
        C28648x s = m92929s();
        if (s == null || s.mo73515bv() == null) {
            return super.mo71838e();
        }
        return s.mo73515bv();
    }

    /* renamed from: o */
    public final void mo71936o() {
        if (!"poi_page".equalsIgnoreCase(this.f74357d)) {
            long currentTimeMillis = System.currentTimeMillis() - this.f74444a;
            C6907h.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName(this.f74357d).setExtValueLong(currentTimeMillis));
            new C33248at().mo85138a(String.valueOf(currentTimeMillis)).mo85139b(this.f74357d).mo85252e();
        }
    }

    /* renamed from: j */
    public final void mo71934j() {
        long j;
        if (this.f74454aj) {
            this.f74454aj = false;
            C28130ac z = m92936z();
            if (C28478a.m93590e(z) && !TextUtils.equals(mo71843n(), "general_search")) {
                Aweme h = z.mo65711h();
                C24723e i = m92915i(z);
                if (!(h == null || i == null || this.f74445aa)) {
                    m92865D();
                    if (this.f74469w == -1) {
                        j = System.currentTimeMillis() - this.f74468v;
                    } else {
                        j = (System.currentTimeMillis() - this.f74468v) - this.f74469w;
                    }
                    i.mo64703a(h.getAid(), j, this.f74429L + 1);
                }
                C42961az.m136380a(new C28323f());
            }
        }
    }

    /* renamed from: b */
    public final void mo71926b() {
        if (!C6399b.m19944t() && TextUtils.equals(this.f74357d, "toplist_friend")) {
            C28130ac z = m92936z();
            if (z != null) {
                Aweme h = z.mo65711h();
                if (h != null) {
                    User author = h.getAuthor();
                    if (author != null && !m92886a(author)) {
                        C6903bc.m21466G();
                        author.getUid();
                    }
                }
            }
        }
    }

    /* renamed from: n */
    private String m92923n(Aweme aweme) {
        return m92902d(aweme, true);
    }

    /* renamed from: g */
    private static boolean m92911g(Aweme aweme) {
        if (aweme == null || !aweme.isCanPlay()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private C28130ac m92912h(String str) {
        C28648x s = m92929s();
        if (s == null) {
            return null;
        }
        return s.mo71907c(str);
    }

    /* renamed from: j */
    private static Aweme m92917j(C28130ac acVar) {
        if (acVar != null) {
            return acVar.mo65711h();
        }
        return null;
    }

    /* renamed from: k */
    private static String m92920k(C28130ac acVar) {
        return acVar.mo71542A().getAid();
    }

    /* renamed from: e */
    private boolean m92906e(Aweme aweme) {
        if (C6399b.m19944t()) {
            return m92901c(true);
        }
        return m92914h(aweme);
    }

    /* renamed from: f */
    private JSONObject m92907f(C28130ac acVar) {
        JSONObject x = m92934x();
        if (!(x == null || acVar == null || acVar.mo65711h() == null || !C28482e.m93616i(acVar.mo65711h()))) {
            try {
                x.put("is_user_review", "1");
            } catch (JSONException unused) {
            }
        }
        return x;
    }

    /* renamed from: g */
    private static C43216b m92909g(C28130ac acVar) {
        if (acVar.mo65716m() == null) {
            return null;
        }
        return acVar.mo65716m().mo71575z();
    }

    /* renamed from: h */
    private static boolean m92913h(C28130ac acVar) {
        if (acVar == null || acVar.mo65711h() == null || acVar.mo65716m() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static C24723e m92915i(C28130ac acVar) {
        if (acVar.mo71564o() == null) {
            return null;
        }
        return acVar.mo71564o().mo64577c();
    }

    /* renamed from: o */
    private static void m92924o(Aweme aweme) {
        if (C7174p.m22398a().mo18649b()) {
            C1592h.m7848a(0).mo6876a((C1591g<TResult, TContinuationResult>) new C28271y<TResult,TContinuationResult>(aweme), (Executor) C28411a.m93380a());
        }
    }

    /* renamed from: c */
    public static void m92898c(Aweme aweme) {
        if (aweme.getPreload().profilePreload >= 0) {
            C41961c.m133432a().mo102975a(new C41964e(aweme, aweme.getPreload().profilePreload, "", LocalStore.Type.PROFILE));
            C41961c.m133432a().mo102975a(new C41964e(aweme, aweme.getPreload().profilePreload, "", LocalStore.Type.POST));
        }
    }

    /* renamed from: d */
    private static boolean m92904d(C28130ac acVar) {
        if (acVar.mo65716m() == null || acVar.mo65716m().mo71563n() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m92908f(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null) {
            return false;
        }
        return aweme.getStatus().isDelete();
    }

    /* renamed from: h */
    private boolean m92914h(Aweme aweme) {
        if (this.f74356c.mUserVisibleHint) {
            m92932v();
            if (m92893b(aweme, true) && this.f74463q && !m92930t() && m92916i(aweme) && !((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().needRestore()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m92916i(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        String aid = aweme.getAid();
        if (!C28167bl.f74267a || !TextUtils.equals(aid, C28167bl.f74268b)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m92918j(Aweme aweme) {
        if (C28426n.m93432a() && !TextUtils.isEmpty(this.f74357d) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            C28421i iVar = new C28421i(aweme.getAid(), 0, System.currentTimeMillis(), this.f74357d);
            C28426n.m93431a(iVar);
        }
    }

    /* renamed from: l */
    private static boolean m92921l(Aweme aweme) {
        if (aweme == null || aweme.getMusic() == null || aweme.getMusic().getMusicStatus() != 0 || C24671f.m80862l().mo65866a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private void m92927q(Aweme aweme) {
        if (C6399b.m19944t()) {
            if (m92921l(aweme)) {
                mo71937p().mo104950z();
                C10761a.m31399c(mo71838e(), (int) R.string.chd).mo25750a();
                return;
            }
            mo71937p().mo104921A();
        }
    }

    /* renamed from: k */
    private long m92919k(Aweme aweme) {
        if (aweme == null) {
            aweme = m92866E();
        }
        if (aweme != null) {
            Video video = aweme.getVideo();
            if (video != null) {
                int duration = video.getDuration();
                if (duration > 0) {
                    return (long) duration;
                }
            }
        }
        long i = mo71937p().mo104910i();
        if (i > 0) {
            return i;
        }
        if (this.f74468v <= 0) {
            return -1;
        }
        if (this.f74469w != -1) {
            return (System.currentTimeMillis() - this.f74468v) - this.f74469w;
        }
        return System.currentTimeMillis() - this.f74468v;
    }

    /* renamed from: p */
    private void m92925p(final Aweme aweme) {
        new StringBuilder("preloadApi ").append(aweme.getAid());
        if (aweme.getPreload() == null && (C33573d.m108449a().mo85905b() || C33583m.m108463a().mo85912b())) {
            aweme.setPreload(new Preload());
            C1592h.m7853a((Callable<TResult>) new C28272z<TResult>(this, aweme));
        } else if (aweme.getPreload() != null) {
            C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
                public final Object call() {
                    C28256q.m92875a(aweme, C28256q.this.f74357d);
                    C28256q.m92898c(aweme);
                    return null;
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ Object mo71930d(Aweme aweme) throws Exception {
        Map a = C28292b.m93052a().mo71975a(aweme);
        C33573d.m108449a().mo85904a(aweme, a);
        C33583m.m108463a().mo85911a(aweme, a);
        m92875a(aweme, this.f74357d);
        m92898c(aweme);
        return null;
    }

    /* renamed from: e */
    private void m92905e(C28130ac acVar) {
        if (!C28418f.m93413a().f74937g) {
            Aweme h = acVar.mo65711h();
            C25272bk.m83055a().f66624b = h;
            if (h != null && C25329c.m83203E(h)) {
                if (C43166q.m136903a(h)) {
                    C24436a.m80356a().getECPlayerControllerService().mo63534a(acVar, h, mo71842m());
                } else {
                    acVar.mo71564o().mo64555a(mo71842m());
                    int i = 0;
                    if (C25329c.m83202D(h)) {
                        i = C25329c.m83240w(h).getShowSeconds();
                    } else if (C25329c.m83201C(h)) {
                        i = h.getAwemeRawAd().getShowButtonSeconds();
                    }
                    C25272bk.m83055a().mo65887a(i * 1000, new C28264r(acVar));
                }
            }
            if (!(h == null || h.getFloatingCardInfo() == null || acVar.mo71566q() == null)) {
                C25272bk.m83055a().mo65887a(5000, new C28232aa(acVar));
            }
        }
    }

    /* renamed from: m */
    private void m92922m(Aweme aweme) {
        if (C43268o.f112004a) {
            Video video = aweme.getVideo();
            if (video != null) {
                VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
                if (properPlayAddr != null) {
                    video.setRationAndSourceId(aweme.getAid());
                    C28130ac h = m92912h(aweme.getAid());
                    if (!C43268o.m137250H()) {
                        C43222g c = C43184ac.m136934a().mo104819c();
                        if (h != null) {
                            c.mo104930a(h.mo65716m().mo71569t());
                        }
                        c.mo104939a((C34976f) this);
                        if (TextUtils.isEmpty(aweme.getVideo().getVideoModelStr())) {
                            c.mo104937a(properPlayAddr, aweme.getVideo().isNeedSetCookie());
                        } else {
                            c.mo104931a(aweme.getVideo());
                        }
                    } else if (C28478a.m93590e(h)) {
                        C44960f b = h.mo71553b();
                        b.mo71661a(video, false, C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
                        b.mo71663a((C34976f) this);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        Aweme aweme;
        C28540a.m93747b().mo73253b();
        C46184a.m145050a();
        C46183b.m145049b("first_refresh");
        if (mo71838e() != null) {
            C6903bc.m21505x().mo57932a(4, false);
            mo71931f(str);
            this.f74455i.f74354a = 3;
            C28130ac z = m92936z();
            if (!(z == null || z.mo65716m() == null)) {
                z.mo65716m().mo64951d(str);
                if (!C43268o.m137250H()) {
                    mo71937p().mo104924D();
                } else {
                    C44960f b = z.mo71553b();
                    if (b != null) {
                        b.mo71675ag();
                    }
                }
            }
            if (z != null) {
                aweme = z.mo65711h();
            } else {
                aweme = null;
            }
            if (aweme != null && !TextUtils.isEmpty(this.f74459m)) {
                C28012q qVar = new C28012q(this.f74459m, 1, mo71937p().mo104915n(), aweme.getAid());
                C42961az.m136380a(qVar);
            }
            C39330h hVar = new C39330h(4);
            hVar.f102163f = str;
            m92879a(hVar);
            this.f74470x = System.currentTimeMillis();
            this.f74441X = false;
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        String str;
        C28130ac z2 = m92936z();
        if (!(z2 == null || z2.mo65716m() == null)) {
            z2.mo65716m().mo64954e_(z);
        }
        this.f74424G = z;
        m92891b(z, false);
        if (z2 != null && z2.mo65716m() != null && this.f74466t && C28478a.m93582a(z2)) {
            if (z) {
                C24671f.m80856f().mo63385b(z2.mo65711h(), mo71838e(), z2.mo65716m().mo71570u(), this.f74429L);
            } else {
                C24671f.m80856f().mo63387c(z2.mo65711h(), mo71838e(), z2.mo65716m().mo71570u(), this.f74429L);
            }
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                String str2 = "buffer %s at %s";
                Object[] objArr = new Object[2];
                if (z) {
                    str = "start";
                } else {
                    str = "end";
                }
                objArr[0] = str;
                objArr[1] = z2.mo65711h().getDesc();
                C1642a.m8035a(locale, str2, objArr);
            }
        }
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        Aweme aweme;
        if (mo71841l()) {
            C28648x s = m92929s();
            C28130ac h = m92912h(str);
            if (!(h == null || h.mo65716m() == null)) {
                h.mo65716m().mo64953e(str);
            }
            m92879a(new C39330h(6));
            if (h != null) {
                aweme = h.mo65711h();
            } else {
                aweme = null;
            }
            if (aweme != null && !TextUtils.isEmpty(this.f74459m)) {
                C28012q qVar = new C28012q(this.f74459m, 3, mo71937p().mo104915n(), aweme.getAid());
                C42961az.m136380a(qVar);
            }
            C26682g.f70355a.mo68414a(aweme, 1);
            if (C6399b.m19944t()) {
                if (s != null) {
                    try {
                        s.mo71901ag();
                    } catch (JSONException unused) {
                    }
                }
                JSONObject x = m92934x();
                if (s != null) {
                    x.put("enter_from", s.mo71889a(false));
                    x.put("content_source", s.mo71879P());
                    if (!TextUtils.isEmpty(s.mo71880Q())) {
                        x.put("enter_method", s.mo71880Q());
                    }
                }
                C6907h.m21521a(mo71838e(), "video_play", "finish", str, "0", x);
                if (!this.f74434Q) {
                    if (aweme != null) {
                        C28202ag.f74305b.mo71795a(aweme.getAid(), aweme.getAwemeType(), this.f74358e);
                    }
                    C33254ay ayVar = (C33254ay) new C33254ay().mo85197a(this.f74357d).mo85071g(aweme).mo85214p(s.mo71887X().getChallengeId()).mo85213o(String.valueOf(s.mo71905ak())).mo85212k(s.mo71887X().getProcessId()).mo85201b(str, this.f74433P).mo85205d(C33230ac.m107206a(aweme, this.f74358e)).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme)));
                    m92918j(aweme);
                    if (s != null) {
                        ((C33254ay) ((C33254ay) ((C33254ay) ayVar.mo85200b(s.mo71875L()).mo85283l(s.mo67595A())).mo85210i(s.mo69887F()).mo85211j(s.mo69888G()).mo85209g(s.mo69889H()).mo85283l(s.mo67595A())).mo85284m(C33230ac.m107216b(aweme, this.f74358e))).mo85203c(s.mo71887X()).mo85208f(s.mo71879P());
                        if (!TextUtils.isEmpty(s.mo71880Q())) {
                            ayVar.mo85206e(s.mo71880Q());
                        }
                    }
                    ayVar.mo85252e();
                    this.f74434Q = true;
                }
            } else {
                if (s != null) {
                    s.mo71901ag();
                }
                if (aweme != null) {
                    C28202ag.f74305b.mo71795a(aweme.getAid(), aweme.getAwemeType(), this.f74358e);
                }
                MobClick value = MobClick.obtain().setEventName("video_play").setLabelName("finish").setValue(C33230ac.m107238m(aweme));
                if (s != null) {
                    value.setJsonObject(s.mo71892d(aweme).mo16888b());
                }
                C6907h.onEvent(value);
                C33254ay ayVar2 = (C33254ay) new C33254ay().mo85202c(aweme, this.f74358e).mo85197a(this.f74357d).mo85282a(Boolean.valueOf(C28482e.m93609b(aweme)));
                m92918j(aweme);
                if (s != null) {
                    ((C33254ay) ayVar2.mo85200b(s.mo71875L()).mo85283l(s.mo67595A())).mo85208f(s.mo71879P());
                    if (!TextUtils.isEmpty(s.mo71880Q())) {
                        ayVar2.mo85206e(s.mo71880Q());
                    }
                    m92882a(s.mo67597C(), (C33270l) ayVar2);
                }
                if (!(s == null || s.mo71887X() == null)) {
                    ayVar2.mo85196a(s.mo71887X(), s.mo73366ap());
                    ayVar2.mo85195a(s.mo71887X());
                    ayVar2.mo85199b(s.mo71887X());
                    ayVar2.mo85203c(s.mo71887X());
                }
                ayVar2.mo85252e();
            }
            C6903bc.m21505x().mo57936a(m92867F());
            Aweme E = m92866E();
            if (E != null) {
                C42961az.m136380a(new C35078a(C33230ac.m107223e(E)));
            }
        }
    }

    /* renamed from: a */
    private void m92877a(VideoUrlModel videoUrlModel) {
        float h = mo71937p().mo104909h();
        Integer a = C28481d.m93602a(videoUrlModel);
        if (a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("play_bitrate", (double) h);
                jSONObject.put("bitrate", a);
                jSONObject.put("bitrate_delta", (double) (((float) a.intValue()) - h));
            } catch (JSONException unused) {
            }
            C6877n.m21407a("http_hijack_info_v2", "http_hijack_info_v2", jSONObject);
        }
        if (C6384b.m19835a().mo15292a(ForceVideoUrlUseHttpsExperiment.class, true, "force_video_url_use_https", C6384b.m19835a().mo15295d().force_video_url_use_https, false) && a != null && a.intValue() > 0 && ((float) a.intValue()) - h > ((float) C6384b.m19835a().mo15287a(VideoSwitchHttpsThresholdExperiment.class, true, "video_switch_https_threshold", C6384b.m19835a().mo15295d().video_switch_https_threshold, 0))) {
            C43310q.m137423a();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("play_bitrate", (double) h);
                jSONObject2.put("hit_bitrate", a);
                jSONObject2.put("is_hijack", 1);
            } catch (JSONException unused2) {
            }
            C6877n.m21447a("http_hijack_info", jSONObject2);
        }
    }

    /* renamed from: c */
    private boolean m92901c(boolean z) {
        boolean z2;
        if (!z || !m92930t()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f74356c.mUserVisibleHint) {
            m92932v();
            if ((m92893b((Aweme) null, true) || !C32995dq.m106645a().mo84703b()) && this.f74463q && z2 && !((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().needRestore()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
        int i;
        Aweme E = m92866E();
        C28648x s = m92929s();
        if (E != null) {
            if (E.getVideoControl() != null && E.getVideoControl().showProgressBar == 1) {
                C7705c a = C7705c.m23799a();
                C29005d dVar = new C29005d(E, this.f74357d, this.f74358e, f, s);
                a.mo20394d(dVar);
            }
            Video video = E.getVideo();
            if (video != null) {
                i = video.getDuration();
                if (i <= 0) {
                    return;
                }
            } else {
                i = 0;
            }
            double d = (double) ((((float) i) * (f / 100.0f)) / 1000.0f);
            if (this.f74461o < Math.floor(d) && s != null) {
                E.getAid();
                Math.floor(d);
            }
            this.f74461o = d;
        }
    }

    /* renamed from: f */
    public final void mo71931f(String str) {
        String str2;
        C28130ac acVar;
        Aweme aweme;
        Video video;
        boolean z;
        C28256q qVar;
        String str3;
        long j;
        int i;
        boolean z2 = this.f74424G;
        if (this.f74424G) {
            m92891b(false, true);
            m92883a(false, true);
        }
        C28130ac z3 = m92936z();
        if (z3 != null) {
            Aweme h = z3.mo65711h();
            if (h != null) {
                String aid = h.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    if (!TextUtils.isEmpty(str) || m92904d(z3)) {
                        str2 = str;
                    } else {
                        str2 = aid;
                    }
                    C28130ac h2 = m92912h(str2);
                    if (h2 != null) {
                        Aweme h3 = h2.mo65711h();
                        if (h3 != null) {
                            Video video2 = h3.getVideo();
                            if (this.f74436S != 0 && aid.equals(str2)) {
                                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f74436S;
                                this.f74436S = 0;
                                C34956a a = new C34956a().mo88544a(String.valueOf(elapsedRealtime)).mo88541a(mo71839f()).mo88543a(video2).mo88542a(h2);
                                if (!C6405d.m19987h()) {
                                    i = 2;
                                } else {
                                    i = 3;
                                }
                                a.mo88540a(i).mo88545b(m92935y()).f91212a.mo88539a();
                            }
                            C43222g p = mo71937p();
                            float i2 = (float) p.mo104910i();
                            ArrayList arrayList = new ArrayList();
                            C28648x s = m92929s();
                            if (s != null) {
                                int ak = s.mo71905ak() + 1;
                                while (ak > 0 && ak < s.mo71906al() && arrayList.size() <= C34946c.m112619f()) {
                                    Aweme c = s.mo71908c(ak);
                                    if (c == null || c.getVideo() == null || c.getVideo().getPlayAddr() == null) {
                                        break;
                                    }
                                    arrayList.add(c);
                                    ak++;
                                }
                            }
                            if (!TextUtils.equals(this.f74446ab, str2)) {
                                if (video2 != null) {
                                    this.f74446ab = str2;
                                    VideoUrlModel playAddr = video2.getPlayAddr();
                                    if (playAddr != null) {
                                        if (i2 <= 0.0f) {
                                            i2 = (float) playAddr.getDuration();
                                        }
                                        List g = C43305j.m137386g().mo105038g(playAddr);
                                        List h4 = C43305j.m137386g().mo105039h(playAddr);
                                        if (g != null) {
                                            new C34944a().mo88507a(h3).mo88505a(this.f74358e).mo88512a(playAddr.isH265()).mo88516b(z2).mo88504a(i2).mo88506a(C43316v.m137455a(playAddr)).mo88517c(C43316v.m137450K().mo104926F()).mo88508a(C43316v.m137450K().mo104927G()).mo88514b((long) C43305j.m137386g().mo105026b(playAddr)).mo88510a(arrayList).mo88509a(C43305j.m137386g().mo105035e()).mo88511a(g).mo88515b(h4).f91145a.mo88503b();
                                        } else {
                                            new C34944a().mo88507a(h3).mo88505a(this.f74358e).mo88516b(z2).mo88504a(i2).mo88506a(C43316v.m137455a(playAddr)).mo88517c(C43316v.m137450K().mo104926F()).mo88508a(C43316v.m137450K().mo104927G()).mo88514b((long) C43305j.m137386g().mo105026b(playAddr)).mo88510a(arrayList).mo88509a(C43305j.m137386g().mo105035e()).mo88513b(C34946c.m112614a()).f91145a.mo88503b();
                                        }
                                    } else {
                                        new C34944a().mo88507a(h3).mo88505a(this.f74358e).mo88516b(z2).mo88504a(i2).mo88506a(C43316v.m137455a(playAddr)).mo88517c(C43316v.m137450K().mo104926F()).mo88508a(C43316v.m137450K().mo104927G()).mo88514b((long) C43305j.m137386g().mo105026b(playAddr)).mo88510a(arrayList).mo88509a(C43305j.m137386g().mo105035e()).mo88513b(C34946c.m112615b()).f91145a.mo88503b();
                                    }
                                } else {
                                    new C34944a().mo88507a(h3).mo88505a(this.f74358e).mo88516b(z2).mo88504a(i2).mo88517c(C43316v.m137450K().mo104926F()).mo88508a(C43316v.m137450K().mo104927G()).mo88510a(arrayList).mo88509a(C43305j.m137386g().mo105035e()).mo88513b(C34946c.m112616c()).f91145a.mo88503b();
                                }
                            }
                            if ((!C28428o.m93438a(mo71837d()) || mo71837d() == null || !mo71837d().isFinishing()) && this.f74444a != -1) {
                                long currentTimeMillis = System.currentTimeMillis() - this.f74444a;
                                double a2 = AudioUtils.m75891a() - this.f74442Y;
                                if (currentTimeMillis > 0) {
                                    String str4 = "";
                                    String str5 = "";
                                    String str6 = "";
                                    String str7 = "";
                                    String str8 = "";
                                    String str9 = "";
                                    String str10 = "";
                                    String str11 = "";
                                    if (s != null) {
                                        str4 = s.mo71885V();
                                        str5 = s.mo71879P();
                                        str6 = s.mo71880Q();
                                        str7 = s.mo71875L();
                                        str8 = s.mo67595A();
                                        str9 = s.mo69887F();
                                        str10 = s.mo69888G();
                                        str11 = s.mo69889H();
                                    }
                                    String str12 = str9;
                                    String str13 = str10;
                                    String str14 = str11;
                                    String str15 = str8;
                                    String str16 = str5;
                                    C28269w wVar = r0;
                                    Aweme aweme2 = h3;
                                    long j2 = currentTimeMillis;
                                    video = video2;
                                    aweme = h3;
                                    acVar = h2;
                                    String str17 = str2;
                                    z = true;
                                    C28269w wVar2 = new C28269w(this, aweme2, str4, str16, str6, s, h2, j2, str2, str7, a2, str15, p, str12, str13, str14);
                                    C1592h.m7855a((Callable<TResult>) wVar, (Executor) C6907h.m21516a());
                                    if (C28478a.m93590e(acVar)) {
                                        str3 = str17;
                                        Session c2 = C44925a.m141730a().mo107409c(str3);
                                        if (c2 != null) {
                                            qVar = this;
                                            c2.blockTime = (int) qVar.f74471y;
                                            c2.blockCnt = qVar.f74420C;
                                            j = j2;
                                            c2.playTime = (int) j;
                                        } else {
                                            j = j2;
                                        }
                                    } else {
                                        j = j2;
                                        str3 = str17;
                                    }
                                    qVar = this;
                                } else {
                                    j = currentTimeMillis;
                                    video = video2;
                                    aweme = h3;
                                    acVar = h2;
                                    str3 = str2;
                                    qVar = this;
                                    z = true;
                                }
                                if (C7174p.m22398a().mo18649b()) {
                                    C6918d.f19600a.mo16976a(C33230ac.m107238m(aweme), j);
                                    m92924o(aweme);
                                }
                                long currentTimeMillis2 = (System.currentTimeMillis() - qVar.f74444a) - qVar.f74472z;
                                if (currentTimeMillis2 > 0) {
                                    C28270x xVar = new C28270x(this, qVar.f74420C, currentTimeMillis2, qVar.f74471y, video);
                                    C1592h.m7855a((Callable<TResult>) xVar, (Executor) C6907h.m21516a());
                                }
                                if (C6384b.m19835a().mo15287a(PlayerAbBlockReportExp.class, true, "player_ab_block_type", C6384b.m19835a().mo15295d().player_ab_block_type, 0) != PlayerAbBlockReportExp.INSTANCE.getT1()) {
                                    z = false;
                                }
                                if (qVar.f74420C > 0 && qVar.f74471y > 0) {
                                    if (z) {
                                        m92888b(acVar, qVar.f74471y, "leave", true);
                                    }
                                    Session c3 = C44925a.m141730a().mo107409c(str3);
                                    if (c3 != null) {
                                        C44944a.m141816a().mo107448a(c3.key, qVar.f74420C, (int) qVar.f74471y);
                                    }
                                }
                                if (qVar.f74421D > 0 && qVar.f74423F > 0) {
                                    if (z) {
                                        m92888b(acVar, qVar.f74423F, "leave", false);
                                    }
                                    Session c4 = C44925a.m141730a().mo107409c(str3);
                                    if (c4 != null) {
                                        C44944a.m141816a().mo107448a(c4.key, qVar.f74421D, (int) qVar.f74423F);
                                    }
                                }
                                if (!z) {
                                    if (qVar.f74424G && qVar.f74426I > 0) {
                                        m92888b(acVar, SystemClock.elapsedRealtime() - qVar.f74426I, "leave", true);
                                    }
                                    if (qVar.f74425H && qVar.f74427J > 0) {
                                        m92888b(acVar, SystemClock.elapsedRealtime() - qVar.f74427J, "leave", false);
                                    }
                                }
                                qVar.f74444a = -1;
                                qVar.f74442Y = AudioUtils.m75891a();
                                qVar.f74418A = -1;
                                qVar.f74419B = -1;
                                qVar.f74471y = 0;
                                qVar.f74472z = 0;
                                qVar.f74420C = 0;
                                qVar.f74423F = 0;
                                qVar.f74421D = 0;
                                qVar.f74422E = -1;
                                qVar.f74426I = 0;
                                qVar.f74427J = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m92881a(String str, int i) {
        C28227b.m92771a(this.f74358e, str, i);
    }

    /* renamed from: d */
    private String m92902d(Aweme aweme, boolean z) {
        return mo71921a(aweme, true, (C28130ac) null);
    }

    /* renamed from: a */
    private static void m92876a(final Video video, final boolean z) {
        if (video != null) {
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    String str;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playUrl", JSON.toJSONString(video.getPlayAddrH265()));
                        C43208c.m137002a(jSONObject);
                        File a = C7276d.m22801a(C7276d.m22808b(), "cache");
                        String str2 = "file";
                        if (a == null) {
                            str = "";
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(a.getPath());
                            sb.append("/");
                            sb.append(C46474a.m146102a(video.getProperPlayAddr().getUri()));
                            str = new C39849h("file", sb.toString()).toString();
                        }
                        jSONObject.put(str2, str);
                    } catch (Exception unused) {
                    }
                    C6877n.m21444a("aweme_media_h265_error_rate", z ^ true ? 1 : 0, jSONObject);
                }
            });
        }
    }

    /* renamed from: b */
    private void m92889b(C28130ac acVar, Aweme aweme) {
        if (C6399b.m19944t()) {
            m92897c(acVar, aweme);
        } else {
            m92903d(acVar, aweme);
        }
    }

    /* renamed from: c */
    private String m92894c(Aweme aweme, int i) {
        String a = mo71920a(aweme, i);
        C28648x s = m92929s();
        if (s != null) {
            s.mo71884U();
        }
        return a;
    }

    /* renamed from: a */
    private static String m92871a(C28130ac acVar, String str) {
        String str2 = "";
        if (acVar == null || !TextUtils.equals(C33230ac.m107238m(acVar.mo65711h()), str)) {
            return str2;
        }
        return C33230ac.m107205a(acVar.mo65711h());
    }

    /* renamed from: d */
    private void m92903d(C28130ac acVar, Aweme aweme) {
        if (acVar != null && aweme != null) {
            if (!C43268o.m137250H()) {
                mo71937p().mo104948x();
            } else {
                C44960f b = acVar.mo71553b();
                if (b != null) {
                    b.mo71672ad();
                }
            }
            C43238k.m137170a();
        }
    }

    /* renamed from: a */
    private static void m92873a(C28130ac acVar, long j) {
        C24723e i = m92915i(acVar);
        if (i != null && i.mo64707b()) {
            acVar.mo71564o().mo64553a(j);
        }
    }

    /* renamed from: b */
    private static boolean m92892b(C28130ac acVar, String str) {
        if (!m92913h(acVar) || !C6319n.m19594a(acVar.mo65711h().getAid(), str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m92874a(C28130ac acVar, JSONObject jSONObject) {
        if (acVar != null && acVar.mo65711h() != null && acVar.mo65711h().getVideo() != null) {
            VideoUrlModel playAddr = acVar.mo65711h().getVideo().getPlayAddr();
            if (playAddr != null) {
                C43274e k = C43305j.m137386g().mo105093k(playAddr);
                if (k != null) {
                    try {
                        jSONObject.put("video_cache_read_time", (double) ((((float) k.f112008a) * 1.0f) / ((float) k.f112010c)));
                        jSONObject.put("video_cache_read_size", (double) ((((float) k.f112009b) * 1.0f) / ((float) k.f112010c)));
                        jSONObject.put("video_cache_read_cnt", k.f112010c);
                        jSONObject.put("video_cache_use_ttnet", C46534r.f119902i);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m92893b(Aweme aweme, boolean z) {
        if (C6399b.m19944t()) {
            return true;
        }
        return m92900c(aweme, true);
    }

    /* renamed from: c */
    private void m92897c(C28130ac acVar, Aweme aweme) {
        if (!(acVar == null || aweme == null || acVar.mo65716m() == null || !acVar.mo65716m().mo71568s())) {
            StreamUrlModel streamUrlModel = aweme.getStreamUrlModel();
            if (streamUrlModel != null) {
                if (!C43268o.m137250H()) {
                    mo71937p().mo104948x();
                } else {
                    C44960f b = acVar.mo71553b();
                    if (b != null) {
                        b.mo71672ad();
                    }
                }
                C43238k.m137170a().mo104975a((C34976f) this);
                C43238k.m137170a().mo104974a(acVar.mo65716m().mo71569t());
                C43238k.m137170a().mo104977a(aweme.getAid(), streamUrlModel, true);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Void m92872a(Aweme aweme, C1592h hVar) throws Exception {
        int a = C33586o.f87685b.mo85915a();
        C6917c a2 = C6918d.m21544a(aweme.getAid(), a);
        if (a2 != null) {
            HashMap hashMap = new HashMap();
            int size = a2.f19599e.size() - 1;
            for (int i = a - 1; i >= 0; i--) {
                if (size >= 0) {
                    StringBuilder sb = new StringBuilder("play_time_");
                    sb.append(i);
                    hashMap.put(sb.toString(), a2.f19599e.get(size));
                } else {
                    StringBuilder sb2 = new StringBuilder("play_time_");
                    sb2.append(i);
                    hashMap.put(sb2.toString(), Integer.valueOf(0));
                }
                size--;
            }
            hashMap.put("finish_cnt", Integer.valueOf(a2.f19597c));
            hashMap.put("head_cnt", Integer.valueOf(a2.f19598d));
            hashMap.put("comment_cnt", Integer.valueOf(a2.f19596b));
            hashMap.put("like_cnt", Integer.valueOf(a2.f19595a));
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            hashMap.put("hour", Integer.valueOf(instance.get(11)));
            hashMap.put("country", C32330k.m104885g());
            C7174p.m22398a().mo18648a(aweme, hashMap);
        }
        return null;
    }

    /* renamed from: b */
    private void m92891b(boolean z, boolean z2) {
        boolean z3 = z;
        if (this.f74466t) {
            final C28648x s = m92929s();
            C28130ac z4 = m92936z();
            if (C28478a.m93590e(z4)) {
                int a = C6384b.m19835a().mo15287a(VideoBufferingThresholdExperiment.class, true, "video_buffering_threshold", C6384b.m19835a().mo15295d().video_buffering_threshold, 0);
                if (z3) {
                    this.f74426I = SystemClock.elapsedRealtime();
                    this.f74420C++;
                    if (this.f74419B == -1) {
                        this.f74419B = SystemClock.elapsedRealtime();
                    }
                    m92862A();
                    this.f74438U = (C47866b) C7492s.m23295b((long) a, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19312c(new C47866b<Long>() {
                        public final void onError(Throwable th) {
                        }

                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                        }

                        public final void onComplete() {
                            if (s != null) {
                                s.mo71896ab();
                            }
                        }
                    });
                    if (z4.mo65716m().mo71575z() != null) {
                        z4.mo65716m().mo71575z().mo104873a(this.f74420C);
                    }
                } else {
                    if (!z2) {
                        this.f74426I = 0;
                    }
                    if (this.f74419B != -1) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f74419B;
                        this.f74471y += elapsedRealtime;
                        this.f74419B = -1;
                        if (!z2 && elapsedRealtime >= ((long) a)) {
                            m92888b(z4, elapsedRealtime, "resume", true);
                        }
                        if (z4.mo65716m().mo71575z() != null) {
                            z4.mo65716m().mo71575z().mo104874a(this.f74471y);
                        }
                    }
                    m92862A();
                    if (s != null) {
                        s.mo71893Z();
                    }
                }
                m92879a(new C39330h(8, z3, 0));
            }
        }
    }

    /* renamed from: c */
    private boolean m92900c(Aweme aweme, boolean z) {
        boolean z2;
        if (aweme == null) {
            aweme = m92866E();
        }
        C29974c w = C6903bc.m21504w();
        if (C25329c.m83231n(aweme) || C25072c.m82575a(aweme)) {
            z2 = true;
        } else {
            z2 = false;
        }
        w.mo76169a(z2, mo71843n());
        return true;
    }

    /* renamed from: b */
    private void m92890b(C44919c cVar, C28130ac acVar) {
        String str;
        long j;
        if (mo71841l()) {
            if (m92892b(acVar, cVar.f115522a)) {
                C28128aa m = acVar.mo65716m();
                if (m92884a(m)) {
                    m.mo63043a(cVar);
                } else if (C28478a.m93590e(acVar)) {
                    C24671f.m80862l().mo65864a(acVar.mo65711h(), cVar);
                    if (cVar.f115524c && acVar.mo65711h().getVideo().getVideoModelStr() != null) {
                        acVar.mo65711h().getVideo().setRationAndSourceId(m92920k(acVar));
                        if (!C43316v.m137250H()) {
                            this.f74466t = false;
                            mo71937p().mo104930a(m.mo71569t());
                            mo71937p().mo104936a(acVar.mo65711h().getVideo(), true, 0, true, false);
                            m92899c(cVar, acVar);
                        }
                        return;
                    } else if (cVar.f115523b) {
                        acVar.mo65711h().getVideo().setRationAndSourceId(m92920k(acVar));
                        m92876a(acVar.mo65711h().getVideo(), false);
                        if (!C43268o.m137250H()) {
                            this.f74466t = false;
                            mo71937p().mo104930a(m.mo71569t());
                            mo71937p().mo104938a(acVar.mo65711h().getVideo().getPlayAddrH264(), true, true, acVar.mo65711h().getVideo().isNeedSetCookie());
                            m92899c(cVar, acVar);
                        }
                        return;
                    } else {
                        if (cVar.f115527f instanceof String) {
                            str = (String) cVar.f115527f;
                        } else {
                            str = C23481i.m77091b(R.string.cuk);
                        }
                        C10761a.m31403c((Context) mo71837d(), str).mo25750a();
                        m.mo63043a(cVar);
                        C28648x s = m92929s();
                        if (s != null) {
                            s.mo71893Z();
                        }
                        m92899c(cVar, acVar);
                        Video video = acVar.mo65711h().getVideo();
                        if (video != null && video.getPlayAddr() != null) {
                            if (C6399b.m19944t()) {
                                if (this.f74436S != 0) {
                                    j = SystemClock.elapsedRealtime() - this.f74436S;
                                    this.f74436S = 0;
                                } else {
                                    j = 0;
                                }
                                new C34956a().mo88544a(String.valueOf(j)).mo88541a(mo71839f()).mo88543a(video).mo88542a(acVar).mo88540a(0).mo88545b(m92935y()).f91212a.mo88539a();
                            }
                            C6726a.m20842a(new C28238ag(this, cVar, video, acVar));
                            if (s != null) {
                                s.mo73377b(0);
                            }
                            this.f74436S = 0;
                        } else {
                            return;
                        }
                    }
                }
            }
            m92879a(new C39330h(1));
        }
    }

    /* renamed from: c */
    private void m92899c(C44919c cVar, C28130ac acVar) {
        String str;
        if (cVar != null && acVar != null && acVar.mo65711h() != null && acVar.mo65711h().getVideo() != null) {
            Video video = acVar.mo65711h().getVideo();
            HashMap hashMap = new HashMap();
            boolean d = C28275c.m92999d(acVar.mo65711h().getAid());
            hashMap.put("error_code", String.valueOf(cVar.f115525d));
            hashMap.put("error_internal_code", String.valueOf(cVar.f115526e));
            hashMap.put("error_info", String.valueOf(cVar.f115527f));
            hashMap.put("group_id", acVar.mo65711h().getAid());
            hashMap.put("video_id", C44913b.f115491b);
            hashMap.put("is_h265", String.valueOf(cVar.f115523b ? 1 : 0));
            hashMap.put("is_ad", String.valueOf(C28478a.m93587c(acVar) ? 1 : 0));
            hashMap.put("internet_speed", String.valueOf(C44903d.m141656f()));
            hashMap.put("cache_size", String.valueOf(C43305j.m137386g().mo105092j(video.getPlayAddr())));
            hashMap.put("video_size", String.valueOf(C43305j.m137386g().mo105090i(video.getPlayAddr())));
            String str2 = "play_url";
            if (video.getPlayAddr() == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str = video.getPlayAddr().toString();
            }
            hashMap.put(str2, str);
            hashMap.put("player_type", mo71937p().mo104901a().toString());
            hashMap.put("is_from_feed_cache", String.valueOf(d ? 1 : 0));
            C21097b.m71143a("video_play_failed", (Map<String, String>) hashMap);
            if (C37653j.m120481c()) {
                hashMap.put("traffic_economy_mode", String.valueOf(C37653j.f98123a.mo94946d()));
            }
            C6907h.m21524a("video_play_failed", (Map) hashMap);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_code", String.valueOf(cVar.f115525d));
                jSONObject.put("error_internal_code", String.valueOf(cVar.f115526e));
                jSONObject.put("internet_speed", String.valueOf(C44903d.m141656f()));
                C28255p.m92861a("error", jSONObject.toString());
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m92875a(Aweme aweme, String str) {
        if (aweme.getPreload().commentPreload >= 0) {
            C41961c.m133432a().mo102975a(new C41964e(aweme, aweme.getPreload().commentPreload * 1000, str, LocalStore.Type.COMMENT));
        }
    }

    public C28256q(String str, int i, C28648x xVar) {
        super(str, i);
        this.f74464r = new WeakReference<>(xVar);
        this.f74444a = -1;
        this.f74468v = -1;
        this.f74469w = -1;
        this.f74470x = -1;
        this.f74442Y = 0.0d;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m92870a(Video video, C28130ac acVar, C44920d dVar) throws Exception {
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("netWorkQuality", C14143b.m41756a().mo33901b().toString());
            jSONObject2.put("netWorkSpeed", (int) C14143b.m41756a().mo33902c());
            jSONObject2.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
            jSONObject2.put("video_duration", video.getDuration());
            C43208c.m137002a(jSONObject2);
            File a = C7276d.m22801a(C7276d.m22808b(), "cache");
            String str4 = "file";
            if (a == null) {
                str2 = "";
            } else {
                String str5 = "file";
                StringBuilder sb = new StringBuilder();
                sb.append(a.getPath());
                sb.append("/");
                if (C6399b.m19944t()) {
                    str3 = video.getPlayAddr().getBitRatedRatioUri();
                } else {
                    str3 = video.getProperPlayAddr().getUri();
                }
                sb.append(C46474a.m146102a(str3));
                str2 = new C39849h(str5, sb.toString()).toString();
            }
            jSONObject2.put(str4, str2);
        } catch (Exception unused) {
        }
        C6877n.m21407a("type_log_play_succuss", "play_success", jSONObject2);
        C6877n.m21444a("aweme_media_error_rate", 0, jSONObject2);
        if (C6399b.m19944t()) {
            if (VideoBitRateABManager.m22786c().mo19004e()) {
                str = "aweme_media_bitrated_error_rate";
            } else {
                str = "aweme_media_original_error_rate";
            }
            C6877n.m21444a(str, 0, jSONObject2);
        }
        if (C28478a.m93587c(acVar)) {
            try {
                jSONObject = new JSONObject(jSONObject2.toString());
                jSONObject.put("aweme_id", acVar.mo65711h().getAid());
                jSONObject.put("creative_id", acVar.mo65711h().getAwemeRawAd().getCreativeId());
            } catch (Exception unused2) {
                jSONObject = new JSONObject();
            }
            C24974r.m21444a("aweme_ad_media_play_error_rate", 0, jSONObject);
            if (C28478a.m93589d(acVar)) {
                C24927a.m81775a(acVar.mo65711h(), 1, 0);
            }
        }
        if (C28478a.m93589d(acVar) && dVar != null) {
            if (dVar.f115531c / 1000 > 60 || dVar.f115531c / 1000 < 7) {
                C24927a.m81775a(acVar.mo65711h(), 4, 1);
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("alarm_reason", "duration_alarm");
                    if (acVar.mo65711h() != null) {
                        jSONObject3.put("group_id", acVar.mo65711h().getAid());
                    }
                } catch (Exception unused3) {
                }
                C6907h.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject3));
            } else {
                C24927a.m81775a(acVar.mo65711h(), 4, 0);
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m92888b(C28130ac acVar, long j, String str, boolean z) {
        C28266t tVar = new C28266t(this, acVar, j, str, z);
        C1592h.m7855a((Callable<TResult>) tVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: c */
    private JSONObject m92895c(C28130ac acVar, long j, String str, boolean z) {
        long j2 = j;
        if (acVar == null || acVar.mo65711h() == null) {
            return null;
        }
        Video video = acVar.mo65711h().getVideo();
        if (video == null) {
            return null;
        }
        VideoUrlModel playAddr = video.getPlayAddr();
        if (playAddr == null) {
            return null;
        }
        C28648x s = m92929s();
        try {
            JSONObject requestIdAndOrderJsonObject = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(acVar.mo65711h(), this.f74358e);
            if (s != null) {
                requestIdAndOrderJsonObject.put("enter_from", s.mo71889a(true));
            }
            requestIdAndOrderJsonObject.put("duration", j2);
            requestIdAndOrderJsonObject.put("position", mo71937p().mo104915n());
            requestIdAndOrderJsonObject.put("end_type", str);
            requestIdAndOrderJsonObject.put("player_type", mo71937p().mo104901a().toString());
            requestIdAndOrderJsonObject.put("is_ad", C28478a.m93587c(acVar) ? 1 : 0);
            requestIdAndOrderJsonObject.put("is_cache", C43305j.m137386g().mo105024a(playAddr) ? 1 : 0);
            requestIdAndOrderJsonObject.put("is_first", this.f74441X ? 1 : 0);
            requestIdAndOrderJsonObject.put("video_duration", playAddr.getDuration());
            StringBuilder sb = new StringBuilder("s:");
            sb.append(this.f74419B);
            sb.append(",e:");
            sb.append(this.f74419B + j2);
            sb.append(",f:");
            sb.append(this.f74428K);
            requestIdAndOrderJsonObject.put("timestamps", sb.toString());
            int i = -1;
            if (C43305j.m137386g().mo105024a(playAddr)) {
                requestIdAndOrderJsonObject.put("cache_size", C43305j.m137386g().mo105092j(playAddr) / PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                requestIdAndOrderJsonObject.put("cache_size", -1);
            }
            if (VideoBitRateABManager.m22786c().mo19004e()) {
                Integer a = C28481d.m93602a(playAddr);
                int b = C28481d.m93603b(playAddr);
                if (a == null) {
                    List bitRate = video.getBitRate();
                    if (bitRate != null) {
                        Iterator it = bitRate.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            BitRate bitRate2 = (BitRate) it.next();
                            if (bitRate2 != null && bitRate2.getPlayAddr() != null && !TextUtils.isEmpty(bitRate2.getPlayAddr().getUri()) && playAddr.getUri() != null && playAddr.getUri().startsWith(bitRate2.getPlayAddr().getUri())) {
                                a = Integer.valueOf(bitRate2.getBitRate());
                                b = bitRate2.getQualityType();
                                break;
                            }
                        }
                    }
                }
                String str2 = "video_bitrate";
                if (a != null) {
                    i = a.intValue();
                }
                requestIdAndOrderJsonObject.put(str2, i);
                requestIdAndOrderJsonObject.put("video_quality", b);
                List bitRate3 = playAddr.getBitRate();
                if (bitRate3 != null && !bitRate3.isEmpty()) {
                    requestIdAndOrderJsonObject.put("bitrate_set", new JSONArray(new C6607f().mo15987a(new ExcludeStrategy()).mo15992f().mo15979b((Object) bitRate3)));
                }
            }
            Session b2 = C44925a.m141730a().mo107407b();
            if (b2 != null) {
                requestIdAndOrderJsonObject.put("is_h265", b2.h265 ? 1 : 0);
            }
            requestIdAndOrderJsonObject.put("internet_speed", C44903d.m141656f());
            requestIdAndOrderJsonObject.put("group_id", C33230ac.m107238m(acVar.mo65711h()));
            if (!z) {
                requestIdAndOrderJsonObject.put("drop_cnt", mo71937p().mo104912k());
            } else {
                C43281f f = C43305j.m137386g().mo105036f(playAddr);
                if (f != null) {
                    requestIdAndOrderJsonObject.put("request_info", f.toString());
                }
            }
            requestIdAndOrderJsonObject.put("video_size", String.valueOf(C43305j.m137386g().mo105090i(playAddr)));
            boolean a2 = C6384b.m19835a().mo15292a(CellInfoEnableExperiment.class, true, "enable_cellinfo_report", C6384b.m19835a().mo15295d().enable_cellinfo_report, false);
            if (VERSION.SDK_INT >= 18 && a2) {
                m92878a(C43240l.m137186a(mo71838e()).f111942c, requestIdAndOrderJsonObject);
            }
            return requestIdAndOrderJsonObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
