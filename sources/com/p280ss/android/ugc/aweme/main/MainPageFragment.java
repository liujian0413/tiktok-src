package com.p280ss.android.ugc.aweme.main;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import bolts.C1592h;
import com.benchmark.p062bl.C1983a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost.C11076b;
import com.bytedance.keva.Keva;
import com.google.gson.C6600e;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.security.C22217a;
import com.p280ss.android.ugc.aweme.account.security.C22219c;
import com.p280ss.android.ugc.aweme.account.security.C22220d;
import com.p280ss.android.ugc.aweme.account.security.SafeInfoNoticeApi.C22216a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p306k.C6870b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.C23464d;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.bridgeservice.C23549b;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24562c;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25053a;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25060e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.detail.p1159c.C26054a;
import com.p280ss.android.ugc.aweme.discover.mob.C26781b;
import com.p280ss.android.ugc.aweme.experiment.EnableFollowHintGuideExperiment;
import com.p280ss.android.ugc.aweme.experiment.NotificationTabStyleExperiment;
import com.p280ss.android.ugc.aweme.familiar.C21708a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.event.C28305aa;
import com.p280ss.android.ugc.aweme.feed.event.C28306ab;
import com.p280ss.android.ugc.aweme.feed.event.C28309ae;
import com.p280ss.android.ugc.aweme.feed.event.C28321d;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.event.C28326i;
import com.p280ss.android.ugc.aweme.feed.event.C28328k;
import com.p280ss.android.ugc.aweme.feed.event.C28339v;
import com.p280ss.android.ugc.aweme.feed.event.C28340w;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.guide.C28398m;
import com.p280ss.android.ugc.aweme.feed.guide.C28398m.C28404a;
import com.p280ss.android.ugc.aweme.feed.guide.C6915f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1228d.C28292b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28780ah;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28780ah.C28781a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C29026x;
import com.p280ss.android.ugc.aweme.feed.p1238ui.DisLikeAwemeLayout;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedTimeLineFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28963b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28970i;
import com.p280ss.android.ugc.aweme.feed.panel.C28629n;
import com.p280ss.android.ugc.aweme.festival.christmas.C29135b;
import com.p280ss.android.ugc.aweme.festival.p311a.C29121a;
import com.p280ss.android.ugc.aweme.festival.p311a.C29122b;
import com.p280ss.android.ugc.aweme.festival.p311a.C29122b.C29123a;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21752c;
import com.p280ss.android.ugc.aweme.follow.p1263ui.C29546a;
import com.p280ss.android.ugc.aweme.follow.presenter.C29459f;
import com.p280ss.android.ugc.aweme.follow.presenter.C29460g;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p280ss.android.ugc.aweme.homepage.C30256c;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30335l;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainBottomTabView;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.TabMode;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService.WatchState;
import com.p280ss.android.ugc.aweme.legoImp.task.LocationStatusReportTask;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.base.C32895a;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.p280ss.android.ugc.aweme.main.experiment.C33007f;
import com.p280ss.android.ugc.aweme.main.follow.LiveBroadcastWarn;
import com.p280ss.android.ugc.aweme.main.p1378a.C32859b;
import com.p280ss.android.ugc.aweme.main.p1384f.C33009a;
import com.p280ss.android.ugc.aweme.message.MessagesFragment;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33258c;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.money.growth.C33633c.C33634a;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FriendTabFragment;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34318a;
import com.p280ss.android.ugc.aweme.p1042as.C23089a.C23090a;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42695c;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42711j;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.policy.notice.p1476a.C35502c;
import com.p280ss.android.ugc.aweme.policy.notice.p1478ui.PolicyNoticeToast;
import com.p280ss.android.ugc.aweme.port.C35517a;
import com.p280ss.android.ugc.aweme.profile.C35662a;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.C36105x;
import com.p280ss.android.ugc.aweme.profile.api.ActivityLinkManager;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35664b;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35665c;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AbsProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusMyProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MyProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1488a.C36327a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.AsyncSettingsExperiment;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p1516d.C37620c;
import com.p280ss.android.ugc.aweme.settings.SafeInfoNoticeFrequencySettings;
import com.p280ss.android.ugc.aweme.share.C38061h;
import com.p280ss.android.ugc.aweme.share.model.C38244a;
import com.p280ss.android.ugc.aweme.share.model.C38245b;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a.C38269b;
import com.p280ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39873f;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41540at;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.unlogin.UnloginSignUpFragment;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.p280ss.android.ugc.aweme.video.C43238k;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.Triple;
import kotlin.jvm.p357a.C7562b;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment */
public class MainPageFragment extends CommonPageFragment implements C11076b, C23464d, C29546a, C33064q {

    /* renamed from: A */
    FeedPanelStateViewModel f85694A;

    /* renamed from: B */
    ViewStub f85695B;

    /* renamed from: C */
    boolean f85696C;

    /* renamed from: D */
    private C32859b f85697D;

    /* renamed from: E */
    private boolean f85698E;

    /* renamed from: F */
    private View f85699F;

    /* renamed from: G */
    private String f85700G;

    /* renamed from: H */
    private Aweme f85701H;

    /* renamed from: J */
    private PolicyNoticeToast f85702J;

    /* renamed from: K */
    private boolean f85703K = true;

    /* renamed from: L */
    private C29459f f85704L;

    /* renamed from: M */
    private C33061p f85705M;

    /* renamed from: N */
    private MainPageDataViewModel f85706N;

    /* renamed from: O */
    private C32961dd f85707O;

    /* renamed from: P */
    private int f85708P;

    /* renamed from: Q */
    private MainAnimViewModel f85709Q;

    /* renamed from: R */
    private LiveBroadcastWarn f85710R;

    /* renamed from: S */
    private boolean f85711S;

    /* renamed from: T */
    private boolean f85712T;

    /* renamed from: U */
    private boolean f85713U;

    /* renamed from: V */
    private C38267a f85714V;

    /* renamed from: W */
    private Handler f85715W;

    /* renamed from: X */
    private boolean f85716X;

    /* renamed from: Y */
    private int f85717Y;

    /* renamed from: Z */
    private C30256c f85718Z = new C30256c();

    /* renamed from: aa */
    private C38269b f85719aa = new C38269b() {
        /* renamed from: b */
        public final void mo73469b() {
        }

        /* renamed from: a */
        public final void mo73468a() {
            if (MainPageFragment.this.f85741p != null) {
                MainPageFragment.this.f85741p.mo72133b();
            }
        }
    };

    /* renamed from: ab */
    private Runnable f85720ab;

    /* renamed from: ac */
    private C22220d f85721ac;

    /* renamed from: ad */
    private boolean f85722ad = true;

    /* renamed from: ae */
    private C28780ah f85723ae = null;

    /* renamed from: af */
    private boolean f85724af = false;

    /* renamed from: ag */
    private int f85725ag = 0;

    /* renamed from: ah */
    private boolean f85726ah = false;

    /* renamed from: ai */
    private int f85727ai = -1;

    /* renamed from: aj */
    private boolean f85728aj = false;

    /* renamed from: ak */
    private boolean f85729ak = false;

    /* renamed from: e */
    View f85730e;

    /* renamed from: f */
    protected MainBottomTabView f85731f;

    /* renamed from: g */
    ViewStub f85732g;

    /* renamed from: h */
    ViewStub f85733h;

    /* renamed from: i */
    public View f85734i;

    /* renamed from: j */
    DisLikeAwemeLayout f85735j;

    /* renamed from: k */
    protected TabChangeManager f85736k;

    /* renamed from: l */
    public C32857a f85737l;

    /* renamed from: m */
    public boolean f85738m;

    /* renamed from: n */
    public boolean f85739n;

    /* renamed from: o */
    public boolean f85740o;

    /* renamed from: p */
    public C28398m f85741p;

    /* renamed from: q */
    public ScrollSwitchStateManager f85742q;

    /* renamed from: r */
    public DataCenter f85743r;

    /* renamed from: s */
    public boolean f85744s;

    /* renamed from: t */
    public boolean f85745t;

    /* renamed from: u */
    public boolean f85746u;

    /* renamed from: v */
    FrameLayout f85747v;

    /* renamed from: w */
    View f85748w;

    /* renamed from: x */
    public boolean f85749x;

    /* renamed from: y */
    public UgAwemeActivitySetting f85750y;

    /* renamed from: z */
    public boolean f85751z;

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$DownloadFestivalTask */
    class DownloadFestivalTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private DownloadFestivalTask() {
        }

        public void run(Context context) {
            MainPageFragment.this.mo84494a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$InitBubbleGuideTask */
    class InitBubbleGuideTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private InitBubbleGuideTask() {
        }

        public void run(Context context) {
            C6726a.m20844b(new C32949cz(MainPageFragment.this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$LocationTask */
    class LocationTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private LocationTask() {
        }

        public void run(Context context) {
            C32630h.m105696b(MainPageFragment.m106368g()).mo83998b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$QueryFollowingTask */
    class QueryFollowingTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private QueryFollowingTask() {
        }

        public void run(Context context) {
            MainPageFragment.this.mo84518o();
        }
    }

    /* renamed from: aI */
    private String m106333aI() {
        return C33065r.m106769a(this);
    }

    /* renamed from: aJ */
    private String m106334aJ() {
        return C33065r.m106770b(this);
    }

    /* renamed from: aK */
    private String m106335aK() {
        return C33065r.m106771c(this);
    }

    /* renamed from: ae */
    private String m106340ae() {
        return this.f85700G;
    }

    /* renamed from: af */
    private Aweme m106341af() {
        return this.f85701H;
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo61071a(String str, String str2, boolean z, boolean z2) {
        if (z) {
            this.f85731f.mo79796a(str);
        } else {
            this.f85731f.mo79798a(str, str2, z2);
        }
        if (TextUtils.isEmpty(str2) || str2.equals("HOME") || TextUtils.isEmpty(str) || !str.equals("HOME")) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onMainTabChanged(this.f85736k, str);
        }
        if (ProfileNewStyleExperiment.INSTANCE.getCOMMON_T()) {
            if ("USER".equals(str) && !this.f85742q.mo79734e("page_setting")) {
                this.f85742q.mo79740h("page_setting");
            } else if (!"USER".equals(str) && !this.f85742q.mo79734e("page_profile")) {
                this.f85742q.mo79740h("page_profile");
            }
        }
        if ("USER".equals(str)) {
            mo84514k();
        }
        C42961az.m136380a(new C42711j(str2, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84499a(Triple triple) {
        if (((Integer) triple.getFirst()).intValue() == this.f85742q.mo79724c("page_feed")) {
            if (!this.f85716X) {
                this.f85716X = true;
                C42961az.m136380a(new C28326i());
                C42961az.m136380a(new C28328k());
                C42961az.m136380a(new C35665c());
                C42961az.m136380a(new C35664b());
            }
            C42961az.m136380a(new C28339v(false));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84496a(HomePageDataViewModel homePageDataViewModel, Integer num) {
        String a = this.f85742q.mo79700a(num.intValue());
        C36102u.f94392a.preloadProfile(getActivity(), a);
        C42961az.m136380a(new C38245b(this.f85742q.mo79723b("page_feed")));
        if (num.intValue() == 1) {
            C42961az.m136380a(new C38244a());
        }
        int i = this.f85717Y;
        this.f85717Y = num.intValue();
        if (TextUtils.isEmpty(C23090a.f60963e)) {
            C23090a.f60960b = a;
        }
        if (!TextUtils.equals(a, "page_feed")) {
            C6857a.m21312e().mo16818a();
            C6857a.m21312e().mo16824b();
        }
        if (!TextUtils.equals(a, "page_feed")) {
            if (!C43316v.m137250H()) {
                C43316v.m137450K().mo104948x();
            } else {
                C44933a.m141791a().mo71672ad();
            }
            C43238k.m137170a().mo104982d();
        }
        String a2 = this.f85742q.mo79700a(i);
        C28130ac aj = m106345aj();
        char c = 65535;
        int hashCode = a.hashCode();
        if (hashCode != -1571965031) {
            if (hashCode != 185242617) {
                if (hashCode == 883457358 && a.equals("page_feed")) {
                    c = 1;
                }
            } else if (a.equals("page_profile")) {
                c = 2;
            }
        } else if (a.equals("page_discover")) {
            c = 0;
        }
        switch (c) {
            case 0:
                C42961az.m136380a(new C28326i());
                if (!C43316v.m137250H()) {
                    C43316v.m137450K().mo104948x();
                } else {
                    C44933a.m141791a().mo71672ad();
                }
                m106364c(a);
                m106339ad();
                if (aj != null) {
                    aj.mo71528b(1);
                }
                if (!TextUtils.equals(a2, "page_discover")) {
                    String str = homePageDataViewModel.f79565d ? "click_discovery_button" : "slide_right";
                    homePageDataViewModel.f79565d = false;
                    C26781b.m87966a(homePageDataViewModel.mo79692a(), str);
                    C28580o.m93830a(PAGE.DISCOVER);
                    return;
                }
                break;
            case 1:
                m106364c(a);
                mo84503d();
                if (aj != null) {
                    aj.mo71530c(1);
                    return;
                }
                break;
            case 2:
                C42961az.m136380a(new C28326i());
                m106364c(a);
                m106339ad();
                if (aj != null) {
                    aj.mo71528b(1);
                }
                Fragment a3 = this.f85736k.mo84567a();
                if ((a3 instanceof MainFragment) && (((MainFragment) a3).mo84447b() instanceof FeedRecommendFragment)) {
                    Aweme af = m106341af();
                    if (af != null) {
                        C28292b.m93052a().mo71979d(af.getAid());
                    }
                }
                if (this.f85741p != null) {
                    this.f85741p.mo72133b();
                }
                if (m106341af() != null) {
                    C6909j jVar = new C6909j();
                    jVar.mo16966a("enter_from", homePageDataViewModel.mo79692a());
                    if (!homePageDataViewModel.f79571j) {
                        C6907h.m21521a(getContext(), "slide_left", "left", m106340ae(), m106341af() == null ? "" : m106341af().getAid(), jVar.mo16967a());
                        ((C33276r) ((C33276r) new C33276r().mo85310b(homePageDataViewModel.mo79692a()).mo85048a("slide_left")).mo85315e(m106334aJ()).mo85317f(m106335aK()).mo85314d(m106333aI()).mo85312c(m106341af(), 0).mo85322o(m106340ae()).mo85323p(homePageDataViewModel.f79569h).mo85047a(getContext())).mo85252e();
                        if (TextUtils.equals(TabChangeManager.m106432a(getActivity()).f85773a, "FAMILIAR")) {
                            C42961az.m136380a(new C21708a());
                        }
                    }
                    jVar.mo16966a("group_id", m106341af() == null ? "" : m106341af().getAid());
                    jVar.mo16966a("enter_method", "slide_left");
                    jVar.mo16966a("request_id", homePageDataViewModel.f79569h);
                    jVar.mo16966a("enter_type", "normal_way");
                    if (!TextUtils.isEmpty(C33230ac.m107223e(m106341af()))) {
                        jVar.mo16966a("poi_id", C33230ac.m107223e(m106341af()));
                    }
                    if (C33230ac.m107220c(homePageDataViewModel.mo79692a())) {
                        jVar.mo16966a("city_info", C33230ac.m107204a());
                        jVar.mo16966a("distance_info", C33230ac.m107231i(m106341af()));
                        jVar.mo16966a("poi_type", C33230ac.m107229h(m106341af()));
                        jVar.mo16966a("poi_channel", C33230ac.m107214b());
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(m106341af() == null ? "" : m106341af().getAuthor().getUid()).setJsonObject(jVar.mo16967a()));
                    if (!C6399b.m19944t()) {
                        C6907h.m21524a("enter_personal_detail_backup", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("to_user_id", m106341af() == null ? "" : m106341af().getAuthor().getUid()).mo59973a("enter_method", "slide_left").mo59973a("group_id", m106341af() == null ? "" : m106341af().getAid()).f60753a);
                    }
                }
                C28580o.m93830a(PAGE.PROFILE);
                homePageDataViewModel.f79571j = false;
                break;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84497a(Integer num) {
        if (num.intValue() == 0) {
            this.f85716X = false;
        }
    }

    /* renamed from: a */
    private void m106321a(View view) {
        this.f85734i = view;
        this.f85730e = this.f85734i.findViewById(R.id.oc);
        this.f85732g = (ViewStub) this.f85734i.findViewById(R.id.s0);
        this.f85733h = (ViewStub) this.f85734i.findViewById(R.id.rz);
        this.f85747v = (FrameLayout) this.f85734i.findViewById(R.id.bwj);
        this.f85748w = this.f85734i.findViewById(R.id.efa);
        this.f85695B = (ViewStub) this.f85734i.findViewById(R.id.a3y);
        if (getContext() instanceof MainActivity) {
            this.f85735j = (DisLikeAwemeLayout) ((MainActivity) getContext()).findViewById(R.id.a9j);
        }
        if (C33007f.m106656a()) {
            this.f85731f.setMode(TabMode.MODE_MATERIAL);
            if (C6399b.m19947w() && C21085a.m71117a().f56622i) {
                this.f85731f.setBackgroundColor(C0683b.m2912c(getContext(), R.color.a6r));
            }
        } else {
            this.f85731f.setMode(TabMode.MODE_ICON);
        }
        TabAlphaController.m106429a().mo84561a((View) this.f85731f);
    }

    /* renamed from: a */
    public final void mo26587a(String str, Fragment fragment, Fragment fragment2) {
        if ((fragment2 instanceof FriendTabFragment) || (fragment2 instanceof C36327a)) {
            fragment2.setUserVisibleHint(false);
        } else if (fragment instanceof FriendTabFragment) {
            fragment.setUserVisibleHint(true);
        }
        if (((fragment instanceof MyProfileFragment) || (fragment instanceof MusMyProfileFragment)) && ((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().mo59877d()).booleanValue()) {
            m106325aA();
            ActivityLinkManager.m115422b(getContext());
        }
        if (C6861a.m21337f().isLogin()) {
            m106320a(fragment);
        }
    }

    /* renamed from: a */
    private void m106320a(Fragment fragment) {
        Keva repo = Keva.getRepo("account_security_keva_name");
        StringBuilder sb = new StringBuilder("prior_to_safe_info_");
        sb.append(C6861a.m21337f().getCurUserId());
        if (repo.getBoolean(sb.toString(), false)) {
            m106310X();
            return;
        }
        if (!(fragment instanceof MainFragment)) {
            Keva repo2 = Keva.getRepo("account_security_keva_name");
            StringBuilder sb2 = new StringBuilder("last_time_fetch_safe_info_");
            sb2.append(C6861a.m21337f().getCurUserId());
            long j = repo2.getLong(sb2.toString(), 0);
            if (j == 0 || j < System.currentTimeMillis()) {
                C22216a.m73692a().safeInfoNoticeMsg(C6861a.m21337f().isChildrenMode()).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C47557ad<C22219c>() {
                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(C7321c cVar) {
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onSuccess(C22219c cVar) {
                        Keva repo = Keva.getRepo("account_security_keva_name");
                        StringBuilder sb = new StringBuilder("last_time_fetch_safe_info_");
                        sb.append(C6861a.m21337f().getCurUserId());
                        repo.storeLong(sb.toString(), System.currentTimeMillis() + (C10292j.m30480a().mo25013a(SafeInfoNoticeFrequencySettings.class, "safe_info_notice_frequency", C6384b.m19835a().mo15294c().getSafeInfoNoticeFrequency()) * 1000));
                        C22217a aVar = cVar.f59327a;
                        StringBuilder sb2 = new StringBuilder("safe_info_");
                        sb2.append(C6861a.m21337f().getCurUserId());
                        String string = repo.getString(sb2.toString(), "");
                        if (aVar != null && !TextUtils.isEmpty(aVar.f59319b) && (!aVar.f59321d || TextUtils.isEmpty(string))) {
                            C6600e eVar = new C6600e();
                            StringBuilder sb3 = new StringBuilder("safe_info_");
                            sb3.append(C6861a.m21337f().getCurUserId());
                            repo.storeString(sb3.toString(), eVar.mo15979b((Object) aVar));
                            StringBuilder sb4 = new StringBuilder("safe_info_need_show_");
                            sb4.append(C6861a.m21337f().getCurUserId());
                            repo.storeBoolean(sb4.toString(), true);
                        }
                        MainPageFragment.this.mo84506f();
                    }
                });
            } else {
                mo84506f();
            }
        } else {
            m106310X();
        }
    }

    /* renamed from: a */
    private void m106323a(String str, String str2) {
        String str3 = TextUtils.equals("enter_discovery_page", str2) ? "click_discovery_tab" : "click_follow_tab";
        if (!TextUtils.equals(str, "HOME") || !TextUtils.equals(this.f85706N.f79576b, "homepage_hot")) {
            C1592h.m7855a((Callable<TResult>) new C32934ck<TResult>(this, str, str2, str3), (Executor) C6907h.m21516a());
        } else {
            C1592h.m7855a((Callable<TResult>) new C32933cj<TResult>(str2, str3, C33258c.m107471a(), C33258c.m107473b()), (Executor) C6907h.m21516a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo84493a(java.lang.String r4, java.lang.String r5, java.lang.String r6) throws java.lang.Exception {
        /*
            r3 = this;
            java.lang.String r0 = ""
            int r1 = r4.hashCode()
            r2 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r1 == r2) goto L_0x002a
            r2 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r1 == r2) goto L_0x0020
            r2 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r1 == r2) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r1 = "USER"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r1 = "HOME"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r1 = "NOTIFICATION"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            switch(r4) {
                case 0: goto L_0x003f;
                case 1: goto L_0x003c;
                case 2: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "personal_homepage"
            goto L_0x0043
        L_0x003c:
            java.lang.String r0 = "message"
            goto L_0x0043
        L_0x003f:
            com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel r4 = r3.f85706N
            java.lang.String r0 = r4.f79576b
        L_0x0043:
            com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "previous_page"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r1, r0)
            java.lang.String r0 = "enter_method"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r6)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r5, r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.main.MainPageFragment.mo84493a(java.lang.String, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    public static void m106324a(boolean z) {
        int i;
        HashMap hashMap = new HashMap();
        if (NotificationTabStyleExperiment.isNewStyleTabBadge()) {
            i = C32971df.m106597d();
        } else {
            i = C32971df.m106592a();
        }
        if (i > 0 || C32971df.m106594b()) {
            if (!C6399b.m19944t()) {
                hashMap.put("notice_type", "yellow_dot");
            } else if (i > 0) {
                if (z) {
                    hashMap.put("notice_type", "pop_notice");
                } else {
                    hashMap.put("notice_type", "number_dot");
                }
                hashMap.put("show_cnt", String.valueOf(i));
            }
        }
        C1592h.m7855a((Callable<TResult>) new C32935cl<TResult>(hashMap), (Executor) C6907h.m21516a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84498a(String str) {
        this.f85731f.mo79801b(str);
    }

    /* renamed from: a */
    public final void mo75555a(C29460g gVar) {
        if (gVar != null && gVar.f77710a > 0) {
            m106318a(gVar.f77710a);
        }
    }

    /* renamed from: S */
    private C0608j m106305S() {
        return getChildFragmentManager();
    }

    /* renamed from: ag */
    private void m106342ag() {
        C33009a.m106659a(getActivity());
    }

    /* renamed from: aq */
    private void m106352aq() {
        C33009a.m106661b(getActivity());
    }

    /* renamed from: g */
    public static Context m106368g() {
        return AwemeApplication.m21341a();
    }

    /* renamed from: P */
    private static boolean m106302P() {
        return C7213d.m22500a().mo18738aA();
    }

    /* renamed from: R */
    private Fragment m106304R() {
        if (this.f85736k == null) {
            return null;
        }
        return this.f85736k.mo84567a();
    }

    /* renamed from: Z */
    private void m106312Z() {
        m106336aa();
        m106337ab();
        m106338ac();
    }

    /* renamed from: aA */
    private void m106325aA() {
        if (isViewValid()) {
            this.f85731f.mo79800a(false, "USER");
        }
    }

    /* renamed from: aE */
    private String m106329aE() {
        return ((MainActivity) getActivity()).getEnterFrom();
    }

    /* access modifiers changed from: private */
    /* renamed from: aH */
    public void mo84490J() {
        if (this.f85695B != null) {
            this.f85695B.setVisibility(8);
        }
    }

    /* renamed from: as */
    private boolean m106354as() {
        return TextUtils.equals("NOTIFICATION", this.f85736k.f85773a);
    }

    /* renamed from: az */
    private void m106361az() {
        if (isViewValid()) {
            this.f85731f.mo79800a(true, "USER");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final /* synthetic */ Object mo84485D() throws Exception {
        C19282c.m63182a(m106368g(), "homepage", "show");
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final /* synthetic */ Object mo84487G() throws Exception {
        ActivityLinkManager.m115423c(getContext());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public final /* synthetic */ void mo84488H() {
        C6726a.m20844b(new C32943ct(this));
    }

    /* renamed from: k */
    public final void mo84514k() {
        if (this.f85723ae != null) {
            this.f85723ae.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final /* synthetic */ Object mo84536s() throws Exception {
        C19282c.m63182a(getActivity(), "personal_homepage", "click");
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final /* synthetic */ Object mo84537u() throws Exception {
        C19282c.m63182a(m106368g(), "discovery", "click");
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final /* synthetic */ Object mo84538v() throws Exception {
        C19282c.m63182a(m106368g(), "following", "click");
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final /* synthetic */ Object mo84540z() throws Exception {
        C19282c.m63182a(m106368g(), "homepage", "click");
        return null;
    }

    /* renamed from: Q */
    private void m106303Q() {
        this.f85707O = (C32961dd) C23336d.m76560a(getActivity().getApplicationContext(), C32961dd.class);
    }

    /* renamed from: X */
    private void m106310X() {
        if (this.f85721ac != null && this.f85721ac.isShowing()) {
            this.f85721ac.mo58599b();
        }
    }

    /* renamed from: Y */
    private void m106311Y() {
        if (C33009a.m106660a() && !"HOME".equals(this.f85736k.f85773a)) {
            C33009a.m106661b(getActivity());
        }
    }

    /* renamed from: aD */
    private void m106328aD() {
        if (isViewValid()) {
            this.f85731f.mo79797a("DISCOVER", -1);
            this.f85727ai = -1;
            this.f85696C = false;
        }
    }

    /* renamed from: ad */
    private void m106339ad() {
        Fragment a = this.f85736k.mo84567a();
        if (a != null && (a instanceof MainFragment)) {
            ((MainFragment) a).mo84462k();
        }
    }

    /* renamed from: ai */
    private void m106344ai() {
        C41540at.m132301a(this.f85731f, this.f85731f.getAlpha(), 1.0f);
        C41540at.m132301a(this.f85730e, this.f85730e.getAlpha(), 1.0f);
    }

    /* renamed from: aj */
    private C28130ac m106345aj() {
        FeedFragment feedFragment;
        Fragment R = m106304R();
        if (R instanceof MainFragment) {
            feedFragment = ((MainFragment) R).mo84447b();
        } else {
            feedFragment = null;
        }
        if (feedFragment instanceof C29026x) {
            return ((C29026x) feedFragment).mo73816o();
        }
        return null;
    }

    /* renamed from: ak */
    private boolean m106346ak() {
        Fragment R = m106304R();
        if (R instanceof MainFragment) {
            return ((MainFragment) R).mo84447b() instanceof FeedRecommendFragment;
        }
        return false;
    }

    /* renamed from: aw */
    private void m106358aw() {
        if (isViewValid()) {
            if (C34315c.m110982b(12)) {
                C34315c.m110984c(12);
            }
        }
    }

    /* renamed from: ax */
    private void m106359ax() {
        if (isViewValid()) {
            if (C34315c.m110982b(1000)) {
                C34315c.m110984c(1000);
            }
        }
    }

    /* renamed from: ay */
    private void m106360ay() {
        if (isViewValid()) {
            this.f85703K = false;
            this.f85731f.mo79800a(false, "NOTIFICATION");
        }
    }

    /* renamed from: a */
    public final void mo84494a() {
        C29122b.m95497a().mo74579a((C29123a) new C32918bw(this));
    }

    /* renamed from: i */
    public final boolean mo84511i() {
        boolean z;
        if (m106350ao() || m106347al()) {
            z = true;
        } else {
            z = false;
        }
        if (this.f85743r != null) {
            this.f85743r.mo60134a("lastTryShowGuideViewResult", (Object) Boolean.valueOf(z));
        }
        return z;
    }

    public void onPause() {
        super.onPause();
        this.f85751z = false;
        if (this.f85741p != null) {
            this.f85741p.mo72133b();
        }
        mo84514k();
    }

    /* renamed from: q */
    public final C36340al mo84534q() {
        if (this.f85736k == null) {
            return null;
        }
        C0608j S = m106305S();
        if (S == null) {
            return null;
        }
        Fragment a = S.mo2644a("USER");
        if (!(a instanceof MyProfileFragment)) {
            return null;
        }
        return ((MyProfileFragment) a).mo92151J();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final /* synthetic */ void mo84539y() {
        if (this.f85736k.mo84567a() instanceof UnloginSignUpFragment) {
            this.f85736k.mo84574a(this.f85736k.f85773a);
        }
    }

    /* renamed from: M */
    private void m106299M() {
        boolean booleanValue = ((Boolean) this.f85743r.mo60136b("start_from_logout_or_switch", Boolean.valueOf(false))).booleanValue();
        if ((!C21115b.m71197a().isLogin() || TimeLockRuler.isInTeenagerModeNewVersion()) && C25789b.m84758d() && !booleanValue && !C33003b.m106651a()) {
            m106307U();
            this.f85736k.mo84574a("DISCOVER");
        }
    }

    /* renamed from: N */
    private void m106300N() {
        if (C33634a.m108553a()) {
            this.f85750y = C33634a.m108554b().f87778a;
            if (this.f85750y != null) {
                mo84515l();
            }
        } else if (!this.f85713U) {
            this.f85713U = true;
            C33634a.m108554b().f87779b.add(new C7562b<UgAwemeActivitySetting, C7581n>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C7581n invoke(UgAwemeActivitySetting ugAwemeActivitySetting) {
                    MainPageFragment.this.f85750y = ugAwemeActivitySetting;
                    if (ugAwemeActivitySetting != null) {
                        if (MainPageFragment.this.f85751z) {
                            MainPageFragment.this.mo84515l();
                        }
                        C33634a.m108554b().f87779b.remove(this);
                    }
                    return null;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void mo84491K() {
        if (!C6870b.m21396d()) {
            if (this.f85720ab != null) {
                this.f85720ab = null;
            }
            if (C43162f.m136889d(getActivity()) != 0 && m106302P() && !this.f85707O.mo60457a()) {
                this.f85720ab = new C32907bl(this);
                this.f85707O.mo60456a(true);
                requestPermissions(new String[]{"android.permission.READ_PHONE_STATE"}, 1);
            }
        }
    }

    /* renamed from: U */
    private void m106307U() {
        Fragment a = this.f85736k.mo84567a();
        if (a != null && (a instanceof MainFragment)) {
            ((MainFragment) a).mo84455d(true);
            if (this.f85709Q != null) {
                this.f85709Q.f85657e.setValue(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: V */
    private void m106308V() {
        this.f85705M = C32895a.m106470a(getActivity());
        this.f85742q.mo79735f(getActivity(), new C32911bp(this));
        this.f85742q.mo79731d(getActivity(), new C32912bq(this, HomePageDataViewModel.m98904a(getActivity())));
        this.f85742q.mo79733e(getActivity(), new C32913br(this));
    }

    /* renamed from: W */
    private boolean m106309W() {
        Keva repo = Keva.getRepo("account_security_keva_name");
        StringBuilder sb = new StringBuilder("prior_to_safe_info_");
        sb.append(C6861a.m21337f().getCurUserId());
        if (!repo.getBoolean(sb.toString(), false) && (this.f85702J == null || this.f85702J.getVisibility() != 0)) {
            return C22220d.f59328h.mo58600a();
        }
        m106310X();
        return false;
    }

    /* renamed from: aB */
    private void m106326aB() {
        if (isViewValid() && !this.f85696C) {
            this.f85731f.mo79800a(true, "DISCOVER");
            if (!this.f85726ah && (C7213d.m22500a().mo18711D() == 0 || (this.f85728aj && !this.f85696C))) {
                m106322a("follow_notice_show", -1, "yellow_dot");
            }
            this.f85726ah = true;
        }
    }

    /* renamed from: aC */
    private void m106327aC() {
        if (isViewValid()) {
            this.f85731f.mo79800a(false, "DISCOVER");
            this.f85726ah = false;
            if (C34315c.m110982b(5)) {
                C34315c.m110984c(5);
            }
        }
    }

    /* renamed from: aF */
    private void m106330aF() {
        this.f85694A = (FeedPanelStateViewModel) C0069x.m159a(getActivity()).mo147a(FeedPanelStateViewModel.class);
        this.f85694A.f99453c.observe(this, new C0053p<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    MainPageFragment.this.mo84514k();
                }
            }
        });
        this.f85694A.f99452b.observe(this, new C0053p<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    MainPageFragment.this.mo84514k();
                }
            }
        });
        this.f85694A.f99454d.observe(this, new C0053p<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    MainPageFragment.this.mo84514k();
                }
            }
        });
    }

    /* renamed from: aa */
    private void m106336aa() {
        if (!((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().mo59877d()).booleanValue()) {
            m106325aA();
        } else if (!ActivityLinkManager.m115421a(getContext())) {
            m106361az();
        } else {
            m106325aA();
        }
    }

    /* renamed from: ab */
    private void m106337ab() {
        if (C21115b.m71197a().isLogin()) {
            if (!C32971df.m106594b() && (!C6399b.m19946v() || C32971df.m106592a() <= 0)) {
                m106357av();
            } else if (this.f85703K) {
                mo84517n();
            }
        }
    }

    /* renamed from: ac */
    private void m106338ac() {
        if (C21115b.m71197a().isLogin() && C33003b.m106651a() && C7213d.m22500a().mo18711D() == 0) {
            if (C34315c.m110982b(5)) {
                m106326aB();
                return;
            }
            m106327aC();
        }
    }

    /* renamed from: ah */
    private void m106343ah() {
        if (this.f85736k.mo84567a() instanceof MainFragment) {
            FeedFragment g = ((MainFragment) this.f85736k.mo84567a()).mo84447b();
            if (g instanceof FeedRecommendFragment) {
                ((FeedRecommendFragment) g).mo73848e();
            }
        }
        C41540at.m132301a(this.f85731f, this.f85731f.getAlpha(), 0.0f);
        C41540at.m132301a(this.f85730e, this.f85730e.getAlpha(), 0.0f);
        if (this.f85741p != null) {
            this.f85741p.mo72133b();
        }
    }

    /* renamed from: an */
    private void m106349an() {
        if (this.f85746u) {
            this.f85731f.mo79799a(true);
            C32960dc.m106536d(false);
            this.f85699F.setVisibility(8);
            mo84503d();
        }
        if (this.f85745t) {
            this.f85731f.mo79799a(true);
            C32960dc.m106545m(false);
            this.f85699F.setVisibility(8);
            mo84503d();
        }
    }

    /* renamed from: ap */
    private void m106351ap() {
        if (isViewValid() && this.f85741p == null) {
            this.f85741p = new C28398m((ViewStub) getActivity().findViewById(R.id.dcr));
            this.f85741p.f74845g = new C28404a() {
                /* renamed from: a */
                public final void mo72138a() {
                    MainPageFragment.this.f85744s = true;
                }

                /* renamed from: b */
                public final void mo72139b() {
                    if (MainPageFragment.this.f85731f == null) {
                        MainPageFragment.this.f85731f.mo79799a(true);
                    }
                    MainPageFragment.this.mo84503d();
                }
            };
            this.f85741p.mo72132a();
            this.f85731f.mo79799a(false);
        }
    }

    /* renamed from: at */
    private void m106355at() {
        if (!C43122ff.m136767b() && this.f85708P != 1 && !this.f85711S && !m106354as()) {
            if (NotificationTabStyleExperiment.isNewStyleTabBadge() && C32971df.m106597d() > 0) {
                m106357av();
                this.f85740o = true;
            }
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    FragmentActivity activity = MainPageFragment.this.getActivity();
                    if (activity != null && (!(activity instanceof MainActivity) || !((MainActivity) activity).mStatusDestroyed)) {
                        if (MainPageFragment.this.f85737l == null) {
                            if (NotificationTabStyleExperiment.isNewStyleTabBadge()) {
                                MainPageFragment.this.f85737l = new C32962de(activity);
                            } else {
                                MainPageFragment.this.f85737l = new C32972dg(activity);
                            }
                            MainPageFragment.this.f85737l.setOutsideTouchable(true);
                        }
                        if (MainPageFragment.this.f85737l.getContentView() != null) {
                            MainPageFragment.this.f85737l.getContentView().setOnClickListener(new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    MainPageFragment.m106324a(true);
                                    MainPageFragment.this.mo84516m();
                                }
                            });
                            MainPageFragment.this.f85737l.setOnDismissListener(new OnDismissListener() {
                                public final void onDismiss() {
                                    MainPageFragment.this.f85739n = false;
                                    MainPageFragment.this.f85740o = false;
                                    if (NotificationTabStyleExperiment.isNewStyleTabBadge()) {
                                        MainPageFragment.this.mo84533p();
                                        return;
                                    }
                                    if (C32971df.m106594b() || (C6399b.m19946v() && C32971df.m106592a() > 0)) {
                                        MainPageFragment.this.mo84517n();
                                    }
                                }
                            });
                        }
                        try {
                            if (MainPageFragment.this.isViewValid() && !MainPageFragment.this.f85742q.mo79723b("page_profile")) {
                                MainPageFragment.this.f85738m = MainPageFragment.this.f85737l.mo84588a(MainPageFragment.this.f85731f.mo79806f("NOTIFICATION"));
                                MainPageFragment.this.f85739n = MainPageFragment.this.f85738m;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: au */
    private void m106356au() {
        int i;
        if (NotificationTabStyleExperiment.isNewStyleTabBadge()) {
            i = C32971df.m106597d();
        } else {
            i = C32971df.m106592a();
        }
        if (i > this.f85725ag) {
            this.f85724af = false;
        }
        if (!this.f85724af) {
            if (i > 0 || C32971df.m106594b()) {
                C1592h.m7855a((Callable<TResult>) new C32939cp<TResult>(i, this.f85725ag), (Executor) C6907h.m21516a());
                this.f85724af = true;
                this.f85725ag = i;
            }
        }
    }

    /* renamed from: av */
    private void m106357av() {
        if (isViewValid()) {
            this.f85731f.mo79800a(false, "NOTIFICATION");
            if (C34315c.m110982b(0)) {
                C34315c.m110984c(0);
            }
            m106358aw();
            m106359ax();
        }
    }

    /* renamed from: d */
    public final void mo84503d() {
        Fragment a = this.f85736k.mo84567a();
        if (a != null && (a instanceof MainFragment)) {
            ((MainFragment) a).mo84451c(true);
            if (this.f85709Q != null) {
                this.f85709Q.f85657e.setValue(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: f */
    public final void mo84506f() {
        if (m106309W()) {
            if (this.f85721ac == null) {
                this.f85721ac = new C22220d(getContext(), this.f85731f);
                this.f85721ac.setTouchable(true);
            }
            if (getActivity() != null && !getActivity().isFinishing() && isViewValid()) {
                this.f85721ac.mo58597a();
            }
        }
    }

    /* renamed from: l */
    public final void mo84515l() {
        long j;
        C32937cn cnVar = new C32937cn(this);
        View view = this.f85734i;
        long j2 = 4000;
        if (C28781a.m94774a()) {
            j = 0;
        } else {
            j = 4000;
        }
        view.postDelayed(cnVar, j);
        View view2 = this.f85734i;
        C32938co coVar = new C32938co(this);
        if (!C35662a.m115265a().mo90508b()) {
            j2 = 0;
        }
        view2.postDelayed(coVar, j2);
    }

    /* renamed from: o */
    public final void mo84518o() {
        if (C7213d.m22500a().mo18711D() == 1 && C33003b.m106651a()) {
            if (this.f85704L == null) {
                this.f85704L = new C29459f();
                this.f85704L.mo66537a(this);
            }
            this.f85704L.mo56976a(new Object[0]);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f85704L != null) {
            this.f85704L.mo59134U_();
        }
        if (this.f85697D != null) {
            this.f85697D.mo84590b();
        }
        if (this.f85737l != null && this.f85737l.isShowing()) {
            this.f85737l.mo84587a();
        }
        C29122b.m95497a().mo74580b();
        this.f85707O = null;
        if (this.f85721ac != null) {
            this.f85721ac.mo58599b();
            this.f85721ac = null;
        }
    }

    /* renamed from: p */
    public final void mo84533p() {
        if (isViewValid()) {
            if (!C21115b.m71197a().isLogin()) {
                m106357av();
                return;
            }
            m106356au();
            this.f85731f.mo79797a("NOTIFICATION", C32971df.m106597d());
        }
    }

    /* renamed from: T */
    private void m106306T() {
        this.f85743r = DataCenter.m75849a(C0069x.m159a(getActivity()), (C0043i) this);
        this.f85743r.mo60132a("ENTER_DISLIKE_MODE", (C0053p<C23083a>) new C32931ch<C23083a>(this)).mo60132a("handlePageResume", (C0053p<C23083a>) new C32942cs<C23083a>(this)).mo60132a("tryShowGuideView", (C0053p<C23083a>) new C32944cu<C23083a>(this)).mo60132a("setTabBackground", (C0053p<C23083a>) new C32945cv<C23083a>(this)).mo60132a("changeTabToFollowAfterPublish", (C0053p<C23083a>) new C32946cw<C23083a>(this)).mo60133a("onNewIntent", new C32947cx(this), true).mo60133a("proformToTab", new C32948cy(this), true).mo60133a("performClickTab", new C32908bm(this), true).mo60132a("tryShowLongClickGuideView", (C0053p<C23083a>) new C32909bn<C23083a>(this)).mo60132a("exitGuideView", (C0053p<C23083a>) new C32910bo<C23083a>(this));
    }

    /* renamed from: ao */
    private boolean m106350ao() {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing()) {
            return false;
        }
        if ((C6399b.m19944t() && !C7213d.m22500a().mo18743aF()) || C28629n.m94155a() <= 0) {
            return false;
        }
        if (SharePrefCache.inst().getScrollToProfileGuideState() == null || ((Integer) SharePrefCache.inst().getScrollToProfileGuideState().mo59877d()).intValue() != 1) {
            this.f85731f.mo79799a(true);
            return false;
        }
        C42961az.m136380a(new C26054a(true));
        m106351ap();
        return true;
    }

    /* renamed from: ar */
    private void m106353ar() {
        if (C33003b.m106651a()) {
            m106307U();
            this.f85736k.mo84574a("DISCOVER");
            Fragment a = this.f85736k.mo84567a();
            if (a instanceof FriendTabFragment) {
                a.setUserVisibleHint(true);
            }
            this.f85742q.mo79716a(false);
            return;
        }
        this.f85736k.mo84574a("HOME");
        m106363b(false);
        try {
            MainFragment mainFragment = (MainFragment) this.f85736k.mo84567a();
            if (mainFragment != null) {
                mainFragment.mo84448b(0);
                if (mainFragment.mo84460i()) {
                    mo84503d();
                }
            }
        } catch (ClassCastException e) {
            C6921a.m21554a((Exception) e);
        }
        this.f85742q.mo79716a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final /* synthetic */ Object mo84486F() throws Exception {
        String str;
        String str2 = "click_trans_layer";
        C22984d a = new C22984d().mo59973a("group_id", this.f85701H.getAid());
        String str3 = "author_id";
        if (this.f85701H.getAuthor() != null) {
            str = this.f85701H.getAuthor().getUid();
        } else {
            str = "";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f85701H))).mo59973a("enter_from", this.f85706N.f79576b).f60753a);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public final /* synthetic */ void mo84489I() {
        C30335l f = this.f85731f.mo79806f("PUBLISH");
        if (f != null) {
            if (C29135b.m95584b()) {
                f.mo79866k();
                C29135b.m95586d();
            } else {
                f.mo79865j();
            }
            Fragment R = m106304R();
            if (R instanceof MainFragment) {
                ((MainFragment) R).mo84465n();
            }
            C28130ac aj = m106345aj();
            if (!(!m106346ak() || aj == null || aj.mo71566q() == null)) {
                aj.mo71566q().mo71644P();
            }
        }
    }

    /* renamed from: m */
    public final void mo84516m() {
        if (!"NOTIFICATION".equals(this.f85736k.f85773a)) {
            m106307U();
            this.f85736k.mo84574a("NOTIFICATION");
            C43316v.m137450K().mo104948x();
            C43238k.m137170a().mo104982d();
            m106352aq();
            this.f85742q.mo79716a(false);
            m106363b(true);
            C28580o.m93830a(PAGE.NOTICE);
        }
        m106360ay();
        if (this.f85737l != null && this.f85737l.isShowing()) {
            this.f85737l.dismiss();
        }
    }

    /* renamed from: n */
    public final void mo84517n() {
        if (isViewValid() && !C43122ff.m136767b()) {
            if (!C21115b.m71197a().isLogin()) {
                m106357av();
            } else if (!C6399b.m19946v() && C32971df.m106592a() > 0) {
                m106357av();
            } else if (NotificationTabStyleExperiment.isNewStyleTabBadge()) {
                m106357av();
            } else {
                m106356au();
                this.f85731f.mo79800a(true, "NOTIFICATION");
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f85751z = true;
        m106312Z();
        m106311Y();
        if (C21115b.m71197a().isLogin()) {
            if (C6399b.m19946v() && this.f85710R != null) {
                this.f85710R.mo84710a();
            }
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sb = new StringBuilder("prior_to_safe_info_");
            sb.append(C6861a.m21337f().getCurUserId());
            if (repo.getBoolean(sb.toString(), false) || (this.f85736k != null && "HOME".equals(this.f85736k.f85773a))) {
                m106310X();
            }
        }
        m106300N();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final /* synthetic */ void mo84535r() {
        if (this.f85723ae == null && this.f85749x && getActivity() != null && this.f85742q.mo79723b("page_feed")) {
            Boolean bool = (Boolean) this.f85694A.f99453c.getValue();
            Boolean bool2 = (Boolean) this.f85694A.f99454d.getValue();
            if (bool == null || !bool.booleanValue()) {
                if ((bool2 == null || !bool2.booleanValue()) && !this.f85739n && !TextUtils.equals("USER", this.f85736k.f85773a)) {
                    this.f85723ae = C28780ah.f75905i.mo74008a(this.f85750y, getActivity(), this.f85731f.mo79806f("USER"));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aG */
    public void mo84492L() {
        boolean z;
        if (!this.f85729ak) {
            this.f85729ak = true;
            if (this.f85749x && getActivity() != null && this.f85742q.mo79723b("page_feed")) {
                Boolean bool = (Boolean) this.f85694A.f99453c.getValue();
                Boolean bool2 = (Boolean) this.f85694A.f99454d.getValue();
                if (bool == null || !bool.booleanValue()) {
                    if ((bool2 == null || !bool2.booleanValue()) && !this.f85739n && !TextUtils.equals("USER", this.f85736k.f85773a)) {
                        try {
                            UgAwemeActivitySetting awemeActivitySetting = C30199h.m98861a().getAwemeActivitySetting();
                            z = C35662a.m115265a().mo90506a(awemeActivitySetting.getActivityId(), awemeActivitySetting.getProfileActivityButton().getTimeLimit().intValue());
                        } catch (NullValueException unused) {
                            z = false;
                        }
                        if (C35662a.m115265a().mo90508b() && z) {
                            C35662a.m115265a().mo90505a(true);
                            try {
                                String tabBubbleText = C30199h.m98861a().getAwemeActivitySetting().getProfileActivityButton().getTabBubbleText();
                                if (tabBubbleText != null && !TextUtils.equals(tabBubbleText, "")) {
                                    ((DmtTextView) this.f85695B.inflate().findViewById(R.id.a3z)).setText(tabBubbleText);
                                    this.f85695B.setVisibility(0);
                                    C6907h.m21524a("bubble_show", (Map) new C22984d().mo59973a("bubble_type", "coupon_fission").mo59973a("show_position", "personal_homepage").f60753a);
                                    this.f85715W = new Handler(Looper.getMainLooper());
                                    this.f85715W.postDelayed(new C32941cr(this), DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                                }
                            } catch (NullValueException unused2) {
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: al */
    private boolean m106347al() {
        if (!C32960dc.m106535c(true) || this.f85698E || !C32995dq.m106645a().mo84703b() || C6870b.m21395c()) {
            this.f85731f.mo79799a(true);
            return false;
        }
        if (C6399b.m19944t()) {
            C6907h.onEvent(MobClick.obtain().setEventName("slide_guidance_show").setLabelName("perf_monitor").setJsonObject(new C6909j().mo16967a()));
        }
        this.f85698E = true;
        this.f85746u = true;
        C32960dc.m106536d(false);
        this.f85731f.mo79799a(false);
        ViewGroup viewGroup = (ViewGroup) getActivity().findViewById(16908290);
        this.f85699F = LayoutInflater.from(getContext()).inflate(R.layout.md, null);
        viewGroup.addView(this.f85699F, new LayoutParams(-1, -1));
        AnimationImageView animationImageView = (AnimationImageView) this.f85699F.findViewById(R.id.atk);
        animationImageView.mo7082c(true);
        animationImageView.setAnimation("home_swipe_up_guide.json");
        animationImageView.mo7078b();
        this.f85699F.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (MainPageFragment.this.isViewValid()) {
                    MainPageFragment.this.f85731f.mo79799a(true);
                    MainPageFragment.this.f85746u = false;
                    C32960dc.m106536d(false);
                    MainPageFragment.this.mo84503d();
                    if (C6399b.m19944t()) {
                        C6907h.onEvent(MobClick.obtain().setEventName("slide_guidance_finish").setLabelName("perf_monitor").setJsonObject(new C6909j().mo16967a()));
                    }
                }
            }
        });
        return true;
    }

    /* renamed from: am */
    private boolean m106348am() {
        boolean z;
        boolean z2;
        if (this.f85701H == null || this.f85701H.isAd()) {
            return false;
        }
        if (C6399b.m19944t() && !C7213d.m22500a().mo18744aG()) {
            return false;
        }
        if (C32960dc.m106539g(false) || !C6915f.m21542a()) {
            z = true;
        } else {
            z = false;
        }
        if (C32960dc.m106537e(false) || C6384b.m19835a().mo15287a(EnableFollowHintGuideExperiment.class, true, "enable_follow_hint_guid", C6384b.m19835a().mo15295d().enable_follow_hint_guid, 1) != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C32960dc.m106535c(true) || !z || !z2 || this.f85744s || !C32960dc.m106544l(true) || this.f85698E) {
            this.f85731f.mo79799a(true);
            return false;
        }
        this.f85698E = true;
        this.f85745t = true;
        this.f85731f.mo79799a(false);
        ViewGroup viewGroup = (ViewGroup) this.f85734i.findViewById(R.id.bwj);
        this.f85699F = LayoutInflater.from(getContext()).inflate(R.layout.me, null);
        viewGroup.addView(this.f85699F, new LayoutParams(-1, -1));
        AnimationImageView animationImageView = (AnimationImageView) this.f85699F.findViewById(R.id.atk);
        animationImageView.mo7082c(true);
        animationImageView.setAnimation("home_longpress_guide.json");
        animationImageView.mo7078b();
        if (C6399b.m19944t()) {
            C1592h.m7855a(C32916bu.f85855a, (Executor) C6907h.m21516a());
        }
        ((TextView) this.f85699F.findViewById(R.id.bvx)).setTextColor(getResources().getColor(R.color.yk));
        this.f85699F.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainPageFragment.this.f85745t = false;
                MainPageFragment.this.f85731f.mo79799a(true);
                C32960dc.m106545m(false);
            }
        });
        this.f85699F.setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                MainPageFragment.this.f85745t = false;
                MainPageFragment.this.f85731f.mo79799a(true);
                C32960dc.m106545m(false);
                C28324g gVar = new C28324g(true, 1, 0.0f, (float) ((MainPageFragment.this.getContext().getResources().getDisplayMetrics().heightPixels / 2) + C23486n.m77122a(105.0d)), MainPageFragment.this.getActivity().hashCode());
                C42961az.m136380a(gVar);
                return false;
            }
        });
        return true;
    }

    /* renamed from: j */
    public final void mo84512j() {
        C35517a bubbleGuideShown = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().bubbleGuideShown();
        if (!C21115b.m71197a().isLogin() || !C21115b.m71197a().getCurUser().isShowImageBubble() || !((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enablePhotoMovie() || ((Boolean) bubbleGuideShown.get()).booleanValue()) {
            if (C21115b.m71197a().isLogin() && this.f85707O != null && this.f85707O.mo60472g(true) && C33003b.m106651a()) {
                new C32859b(this.f85733h).mo84589a();
                this.f85707O.mo60474h(false);
            }
            return;
        }
        this.f85697D = new C32859b(this.f85732g);
        if (this.f85711S) {
            this.f85712T = true;
        } else {
            this.f85697D.mo84589a();
        }
        bubbleGuideShown.set(Boolean.valueOf(true));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84495a(C23083a aVar) {
        m106349an();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo84500b(C23083a aVar) {
        m106348am();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo84507f(C23083a aVar) {
        m106353ar();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo84509h(C23083a aVar) {
        mo84511i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo84510i(C23083a aVar) {
        mo84503d();
    }

    @C7709l
    public void onScrolledToProfileTab(C38244a aVar) {
        mo84514k();
    }

    @C7709l
    public void onCommentDialogEvent(C28321d dVar) {
        this.f85708P = dVar.f74645a;
    }

    @C7709l
    public void onMobEnterFromEvent(C28340w wVar) {
        this.f85706N.mo79696a(wVar.f74667a);
    }

    /* renamed from: c */
    private void m106364c(String str) {
        if (this.f85709Q != null) {
            this.f85709Q.f85656d.setValue(str);
        }
    }

    /* renamed from: e */
    private void m106366e(String str) {
        this.f85731f.post(new C32936cm(this, str));
    }

    /* renamed from: f */
    private void m106367f(String str) {
        C30335l f = this.f85731f.mo79806f(str);
        if (f != null) {
            f.performClick();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo84504d(C23083a aVar) {
        m106366e((String) aVar.mo60161a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo84508g(C23083a aVar) {
        m106363b(((Boolean) aVar.mo60161a()).booleanValue());
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onSafeInfoNoticeEvent(C36105x xVar) {
        if (xVar != null) {
            if (xVar.f94394a) {
                m106310X();
                return;
            }
            mo84506f();
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        TabAlphaController.m106429a().mo84562a(z);
    }

    /* renamed from: b */
    private void m106363b(boolean z) {
        int i;
        View view = this.f85730e;
        Resources resources = getResources();
        if (!z) {
            i = R.color.z6;
        } else {
            i = R.color.a4j;
        }
        view.setBackgroundColor(resources.getColor(i));
        ((MainActivity) getActivity()).refreshSlideSwitchCanScrollRight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo84502c(C23083a aVar) {
        m106367f((String) aVar.mo60161a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo84505e(C23083a aVar) {
        m106319a((Intent) aVar.mo60161a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo84513j(C23083a aVar) {
        if (((Boolean) aVar.mo60161a()).booleanValue()) {
            m106343ah();
        } else {
            m106344ai();
        }
    }

    @C7709l
    public void onDislikeAwemeEvent(C28324g gVar) {
        if (gVar.f74651b == 1 && gVar.f74650a) {
            m106317a(gVar.f74652c, gVar.f74653d);
        }
    }

    @C7709l
    public void onFestivalDataEvent(C29121a aVar) {
        mo84494a();
        C39873f.m127610b();
        if (getContext() instanceof MainActivity) {
            ((MainActivity) getContext()).initWaterMark();
        }
    }

    @C7709l
    public void onMaintabVisibleChange(C28305aa aaVar) {
        int i = aaVar.f74611a;
        if (i != this.f85731f.getVisibility()) {
            this.f85730e.setVisibility(i);
            this.f85731f.setVisibility(i);
        }
    }

    @C7709l
    public void onRefreshEndEvent(C28309ae aeVar) {
        String str;
        if (isViewValid()) {
            MainBottomTabView mainBottomTabView = this.f85731f;
            if (!TextUtils.isEmpty(aeVar.f74620a)) {
                str = aeVar.f74620a;
            } else {
                str = "HOME";
            }
            mainBottomTabView.mo79805e(str);
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onShowPolicyNoticeToastEvent(C35502c cVar) {
        if (cVar.f93152b != null) {
            this.f85702J.setNext(cVar.f93152b);
        }
        this.f85702J.setValues(cVar.f93151a);
        m106310X();
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEvent(C21752c cVar) {
        if (cVar.f58262a == 0) {
            if (this.f85726ah) {
                m106327aC();
                m106322a("follow_notice_dis", -1, "yellow_dot");
            }
            if (this.f85696C) {
                m106322a("follow_notice_dis", (long) this.f85727ai, "number_dot");
                m106328aD();
            }
        }
    }

    @C7709l
    public void onSettingSyncDone(C37620c cVar) {
        m106336aa();
        if (C6384b.m19835a().mo15292a(AsyncSettingsExperiment.class, true, "is_async_setting", C6384b.m19835a().mo15295d().is_async_setting, true)) {
            C1592h.m7855a((Callable<TResult>) new C32914bs<TResult>(this), (Executor) C7258h.m22730c());
        } else {
            ActivityLinkManager.m115423c(getContext());
        }
    }

    @C7709l
    public void onVideoPageChangeEvent(C28306ab abVar) {
        if (abVar.f74612a != null) {
            this.f85701H = abVar.f74612a;
            if (abVar.f74612a.getAuthor() != null) {
                this.f85700G = abVar.f74612a.getAuthor().getUid();
            } else {
                this.f85700G = "";
            }
        }
    }

    @C7709l
    public void onAwesomeSplashEvent(C25053a aVar) {
        boolean z;
        if (aVar.f66130a != 4) {
            z = true;
        } else {
            z = false;
        }
        this.f85711S = z;
        if (this.f85711S) {
            if (this.f85697D != null) {
                this.f85712T = false;
                this.f85697D.mo84590b();
            }
            if (this.f85737l != null) {
                this.f85737l.dismiss();
            }
        } else if (this.f85712T) {
            this.f85712T = false;
            if (this.f85697D != null) {
                this.f85697D.mo84589a();
            }
        }
        C25060e.m82533a(aVar.f66130a, this.f85730e, this.f85731f);
    }

    @C7709l(mo20401b = true)
    public void onNotificationIndicatorEvent(C34314g gVar) {
        if (gVar != null) {
            if (gVar.f89465a == -2) {
                this.f85722ad = false;
            }
            if (gVar.f89465a == -3) {
                this.f85722ad = true;
            }
            if (this.f85722ad && !this.f85738m) {
                m106355at();
            }
            if (C32971df.m106596c()) {
                if (!TextUtils.equals("NOTIFICATION", this.f85736k.f85773a)) {
                    mo84517n();
                }
            } else if (C32971df.m106593a(gVar.f89465a)) {
                if (gVar.f89466b == -1) {
                    C34315c.m110984c(gVar.f89465a);
                    if (!C32971df.m106594b() && (!C6399b.m19946v() || C32971df.m106592a() <= 0)) {
                        m106357av();
                    } else {
                        return;
                    }
                } else if (C6399b.m19946v()) {
                    C34315c.m110976a(gVar.f89465a, gVar.f89466b);
                    if (gVar.f89466b <= 0 || TextUtils.equals("NOTIFICATION", this.f85736k.f85773a)) {
                        m106357av();
                    } else {
                        mo84517n();
                    }
                } else if (gVar.f89466b > 0 && !TextUtils.equals("NOTIFICATION", this.f85736k.f85773a)) {
                    mo84517n();
                }
            } else if (C32971df.m106595b(gVar.f89465a)) {
                if (NotificationTabStyleExperiment.isNewStyleTabBadge()) {
                    C34315c.m110976a(gVar.f89465a, gVar.f89466b);
                    if (!this.f85740o) {
                        if (m106354as()) {
                            m106362b(gVar.f89465a, gVar.f89466b);
                        } else {
                            mo84533p();
                        }
                    }
                } else {
                    m106362b(gVar.f89465a, gVar.f89466b);
                }
            } else if (isViewValid() && gVar.f89465a == 5 && C33003b.m106651a()) {
                if (!C34315c.m110982b(5) || "DISCOVER".equals(this.f85736k.f85773a)) {
                    m106327aC();
                } else {
                    m106326aB();
                }
            } else {
                return;
            }
            if (gVar.f89465a == 1000) {
                C7705c.m23799a().mo20391b(C34314g.class);
            }
        }
    }

    /* renamed from: a */
    private void m106318a(int i) {
        if (isViewValid()) {
            this.f85731f.mo79797a("DISCOVER", i);
            this.f85728aj = true;
            this.f85727ai = i;
            if (C7213d.m22500a().mo18711D() == 1) {
                m106322a("follow_notice_show", (long) this.f85727ai, "number_dot");
            }
            this.f85696C = true;
            if (this.f85726ah) {
                m106327aC();
            }
        }
    }

    /* renamed from: a */
    private void m106319a(Intent intent) {
        try {
            if (intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUBLISH", false)) {
                m106353ar();
            } else if (intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false)) {
                this.f85736k.mo84574a("HOME");
                m106363b(false);
                MainFragment mainFragment = (MainFragment) this.f85736k.mo84567a();
                if (mainFragment != null) {
                    mainFragment.mo84448b(1);
                }
                this.f85742q.mo79716a(true);
            } else {
                String stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                if (!TextUtils.isEmpty(stringExtra)) {
                    if ("USER".equals(stringExtra)) {
                        mo84501b("USER");
                        return;
                    }
                    this.f85736k.mo84574a(stringExtra);
                    if ("HOME".equals(stringExtra)) {
                        int intExtra = intent.getIntExtra("tab", 1);
                        MainFragment mainFragment2 = (MainFragment) this.f85736k.mo84567a();
                        if (mainFragment2 != null) {
                            mainFragment2.mo84448b(intExtra);
                        }
                        return;
                    }
                    if ("NOTIFICATION".equals(stringExtra)) {
                        if (!C21115b.m71197a().isLogin()) {
                            C32656f.m105746a((Fragment) this, m106329aE(), "click_message");
                            return;
                        }
                        if (intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_LINK_ACCOUNT", false)) {
                            C23549b.m77335a().pushOrNoticeShowLinkAccountDialog(m106305S(), m106329aE());
                        }
                        if (this.f85736k.mo84567a() instanceof MessagesFragment) {
                            this.f85742q.mo79716a(false);
                        }
                    }
                    m106357av();
                }
            }
        } catch (Exception e) {
            C42880h.m136156a(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo84501b(String str) {
        String str2;
        if (!this.f85714V.mo95909h()) {
            C42961az.m136380a(new C38061h(str, this.f85736k.f85773a));
            if ("NOTIFICATION".equals(str)) {
                C34315c.m110979a(true);
                C34315c.m110984c(998);
            } else {
                C34315c.m110979a(false);
            }
            if (C6399b.m19946v() || !this.f85742q.mo79723b("page_setting")) {
                C23090a.f60960b = str;
                if (!TextUtils.equals(str, "HOME")) {
                    C6857a.m21312e().mo16818a();
                    C6857a.m21312e().mo16824b();
                }
                char c = 65535;
                switch (str.hashCode()) {
                    case -1382453013:
                        if (str.equals("NOTIFICATION")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 2223327:
                        if (str.equals("HOME")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 2614219:
                        if (str.equals("USER")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 482617583:
                        if (str.equals("PUBLISH")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1055811561:
                        if (str.equals("DISCOVER")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        if (TextUtils.equals("HOME", this.f85736k.f85773a)) {
                            this.f85731f.mo79804d("HOME");
                            ((MainFragment) this.f85736k.mo84577b("HOME")).mo84446a(true, "homepage_refresh");
                            C42961az.m136380a(new C42695c(1));
                            C42961az.m136380a(new C24562c());
                        } else {
                            this.f85736k.mo84574a("HOME");
                            mo84503d();
                            Fragment a = this.f85736k.mo84567a();
                            C1592h.m7855a((Callable<TResult>) new C32917bv<TResult>(this), (Executor) C6907h.m21516a());
                            if (a instanceof MainFragment) {
                                MainFragment mainFragment = (MainFragment) a;
                                if (mainFragment.mo84461j()) {
                                    m106342ag();
                                }
                                if (mainFragment.mo84447b() instanceof FeedTimeLineFragment) {
                                    C1592h.m7855a(C32919bx.f85858a, (Executor) C6907h.m21516a());
                                } else if (mainFragment.mo84447b() instanceof FeedRecommendFragment) {
                                    C1592h.m7855a(C32920by.f85859a, (Executor) C6907h.m21516a());
                                }
                            }
                        }
                        C1592h.m7855a((Callable<TResult>) new C32921bz<TResult>(this), (Executor) C6907h.m21516a());
                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).changeStatusBarMainTab(getActivity(), "HOME");
                        break;
                    case 1:
                        String str3 = this.f85736k.f85773a;
                        if (this.f85697D != null) {
                            this.f85697D.mo84590b();
                        }
                        if (!C33003b.m106651a() || C21115b.m71197a().isLogin()) {
                            FriendTabFragment friendTabFragment = null;
                            if (!"DISCOVER".equals(this.f85736k.f85773a)) {
                                m106307U();
                                this.f85736k.mo84574a("DISCOVER");
                                Fragment a2 = this.f85736k.mo84567a();
                                if (a2 instanceof FriendTabFragment) {
                                    friendTabFragment = (FriendTabFragment) a2;
                                }
                                C43316v.m137450K().mo104948x();
                                C43238k.m137170a().mo104982d();
                                m106352aq();
                                this.f85742q.mo79716a(false);
                                m106363b(true);
                                if (friendTabFragment != null) {
                                    if (friendTabFragment.mo86869d() != null) {
                                        friendTabFragment.mo86869d();
                                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).tryToShowPromoteProgram(getActivity());
                                        if (str3 != null) {
                                            m106323a(str3, "enter_discovery_page");
                                        }
                                    } else if (friendTabFragment != null && friendTabFragment.mo86870e() != null) {
                                        if (str3 != null) {
                                            m106323a(str3, "enter_discovery_page");
                                        }
                                        C26781b.m87962a();
                                    } else if (friendTabFragment.mo86868a() != null) {
                                        friendTabFragment.mo86868a().mo73838b(System.currentTimeMillis());
                                        if (str3 != null) {
                                            m106323a(str3, "enter_homepage_follow");
                                        }
                                        a2.setUserVisibleHint(true);
                                        C1592h.m7855a(C32925cb.f85863a, (Executor) C6907h.m21516a());
                                    } else if (!C33003b.m106651a() && !C43122ff.m136767b() && str3 != null) {
                                        m106323a(str3, "enter_discovery_page");
                                    }
                                    if (this.f85726ah && friendTabFragment.mo86868a() == null) {
                                        m106327aC();
                                        m106322a("follow_notice_dis", -1, "yellow_dot");
                                    }
                                }
                            } else {
                                Fragment a3 = this.f85736k.mo84567a();
                                if (a3 instanceof FriendTabFragment) {
                                    friendTabFragment = (FriendTabFragment) a3;
                                }
                                if (friendTabFragment != null && friendTabFragment.mo86868a() != null) {
                                    this.f85731f.mo79804d("DISCOVER");
                                    if (friendTabFragment.mo86868a().isViewValid()) {
                                        friendTabFragment.mo86868a().mo73772d_(true);
                                    }
                                    C1592h.m7855a(C32926cc.f85864a, (Executor) C6907h.m21516a());
                                } else if (friendTabFragment != null && friendTabFragment.mo86869d() != null) {
                                    friendTabFragment.mo86869d().aJ_();
                                } else if (!(friendTabFragment == null || friendTabFragment.mo86870e() == null)) {
                                    friendTabFragment.mo86870e().mo69591o();
                                }
                            }
                            if (C33003b.m106651a()) {
                                C1592h.m7855a((Callable<TResult>) new C32927cd<TResult>(this), (Executor) C6907h.m21516a());
                            } else {
                                C1592h.m7855a((Callable<TResult>) new C32928ce<TResult>(this), (Executor) C6907h.m21516a());
                            }
                            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).changeStatusBarMainTab(getActivity(), "DISCOVER");
                            break;
                        } else {
                            if (this.f85701H != null) {
                                str2 = this.f85701H.getAid();
                            } else {
                                str2 = "";
                            }
                            C32656f.m105744a((Activity) getActivity(), this.f85706N.f79576b, "click_follow", C42914ab.m136242a().mo104633a("group_id", str2).mo104633a("log_pb", C33230ac.m107234j(str2)).f111445a, (C23305g) new C32924ca(this));
                            return;
                        }
                    case 2:
                        if (this.f85697D != null) {
                            this.f85697D.mo84590b();
                            break;
                        }
                        break;
                    case 3:
                        if (this.f85697D != null) {
                            this.f85697D.mo84590b();
                        }
                        if (C6399b.m19947w() && TextUtils.equals("NOTIFICATION", this.f85736k.f85773a) && C27326a.m89579a(this.f85731f.mo79806f("NOTIFICATION"), 500)) {
                            Fragment a4 = this.f85736k.mo84567a();
                            if (a4 != null && (a4 instanceof MessagesFragment)) {
                                Fragment d = ((MessagesFragment) a4).mo84991d();
                                if (d != null && (d instanceof C34318a)) {
                                    ((C34318a) d).mo87144b();
                                    C27326a.m89577a();
                                }
                            }
                        }
                        m106324a(false);
                        mo84516m();
                        C19282c.m63182a(m106368g(), "message", "click");
                        Fragment a5 = this.f85736k.mo84567a();
                        if (a5 != null && (a5 instanceof MessagesFragment)) {
                            a5.setUserVisibleHint(true);
                        }
                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).changeStatusBarMainTab(getActivity(), "NOTIFICATION");
                        C1983a.m9029b().mo7629a(3);
                        break;
                    case 4:
                        if (this.f85697D != null) {
                            this.f85697D.mo84590b();
                        }
                        if (!"USER".equals(this.f85736k.f85773a)) {
                            C1592h.m7855a(C32929cf.f85867a, (Executor) C6907h.m21516a());
                            m106307U();
                            this.f85736k.mo84574a("USER");
                            m106352aq();
                            C43316v.m137450K().mo104948x();
                            C43238k.m137170a().mo104982d();
                            m106363b(true);
                            this.f85742q.mo79716a(ProfileNewStyleExperiment.INSTANCE.getCOMMON_T());
                            Fragment a6 = this.f85736k.mo84567a();
                            if (a6 instanceof C36327a) {
                                C36327a aVar = (C36327a) a6;
                                aVar.mo92082N();
                                aVar.mo92083O();
                            }
                            if (C6399b.m19947w() && (a6 instanceof AbsProfileFragment)) {
                                ((AbsProfileFragment) a6).mo91872a();
                            }
                            if (C6399b.m19946v() && (a6 instanceof MusMyProfileFragment)) {
                                ((MusMyProfileFragment) a6).mo92081M();
                            }
                        }
                        Fragment a7 = this.f85736k.mo84567a();
                        if (a7 instanceof C36327a) {
                            ((C36327a) a7).mo92084P();
                            a7.setUserVisibleHint(true);
                        }
                        if (C34315c.m110982b(4)) {
                            C34315c.m110984c(4);
                        }
                        C1592h.m7855a((Callable<TResult>) new C32930cg<TResult>(this), (Executor) C6907h.m21516a());
                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).changeStatusBarMainTab(getActivity(), "USER");
                        C28580o.m93830a(PAGE.PROFILE);
                        if (this.f85715W != null) {
                            this.f85715W.removeCallbacks(new C32932ci(this));
                            mo84490J();
                            break;
                        }
                        break;
                }
                if (!C6319n.m19594a(str, "HOME")) {
                    C42961az.m136380a(new C28326i());
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m106313a(int i, int i2) throws Exception {
        HashMap hashMap = new HashMap();
        if (!C6399b.m19944t() || i <= 0) {
            hashMap.put("notice_type", "yellow_dot");
        } else {
            hashMap.put("notice_type", "number_dot");
            hashMap.put("show_cnt", String.valueOf(i));
            hashMap.put("previous_show_cnt", String.valueOf(i2));
        }
        C6907h.m21524a("message_notice_show", (Map) hashMap);
        return null;
    }

    /* renamed from: b */
    private void m106362b(int i, int i2) {
        if (isViewValid()) {
            if (!C21115b.m71197a().isLogin()) {
                m106357av();
                return;
            }
            if (C32971df.m106592a() > 0) {
                m106357av();
            }
            m106356au();
            C34315c.m110976a(i, i2);
            this.f85731f.mo79797a("NOTIFICATION", C32971df.m106592a());
        }
    }

    /* renamed from: a */
    private void m106317a(float f, float f2) {
        if (this.f85735j != null) {
            C32960dc.m106545m(false);
            if (this.f85736k.mo84567a() instanceof MainFragment) {
                FeedFragment g = ((MainFragment) this.f85736k.mo84567a()).mo84447b();
                if (g instanceof FeedRecommendFragment) {
                    ((FeedRecommendFragment) g).mo73848e();
                }
            }
            C1592h.m7855a((Callable<TResult>) new C32915bt<TResult>(this), (Executor) C6907h.m21516a());
            C41540at.m132301a(this.f85731f, this.f85731f.getAlpha(), 0.0f);
            C41540at.m132301a(this.f85730e, this.f85730e.getAlpha(), 0.0f);
            if (this.f85741p != null) {
                this.f85741p.mo72133b();
            }
            if (C28963b.m95198a()) {
                C28970i iVar = new C28970i(getContext(), this.f85701H, m106329aE());
                iVar.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    public final void onDismiss(DialogInterface dialogInterface) {
                        MainPageFragment.this.f85743r.mo60134a("ENTER_DISLIKE_MODE", (Object) Boolean.valueOf(false));
                        C42961az.m136380a(new C28324g(false, 1, MainPageFragment.this.getActivity().hashCode()));
                    }
                });
                iVar.show();
                return;
            }
            this.f85735j.mo73786a(f, f2, this.f85706N.f79576b, this.f85701H);
            this.f85735j.setInDislikeMode(true);
            if (this.f85735j.getAdapter() != null) {
                this.f85735j.getAdapter().notifyDataSetChanged();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f85709Q = (MainAnimViewModel) C0069x.m159a(getActivity()).mo147a(MainAnimViewModel.class);
        this.f85734i = view;
        this.f85730e = this.f85734i.findViewById(R.id.oc);
        this.f85731f = (MainBottomTabView) this.f85734i.findViewById(R.id.bwi);
        this.f85732g = (ViewStub) this.f85734i.findViewById(R.id.s0);
        this.f85702J = (PolicyNoticeToast) this.f85734i.findViewById(R.id.ci0);
        this.f85747v = (FrameLayout) this.f85734i.findViewById(R.id.bwj);
        this.f85748w = this.f85734i.findViewById(R.id.efa);
        MainPageDataViewModel.m98911a((Fragment) this).f79575a = this.f85748w;
        this.f85714V = C38267a.m122239a((Context) getActivity());
        this.f85714V.mo95899c(this.f85719aa);
        this.f85706N = MainPageDataViewModel.m98911a((Fragment) this);
        this.f85736k = TabChangeManager.m106432a(getActivity());
        this.f85742q = ScrollSwitchStateManager.m98918a(getActivity());
        m106308V();
        m106321a(view);
        this.f85718Z.mo79767a(this, view, bundle);
        this.f85742q.mo79739h(this, new C32906bk(this));
        m106306T();
        m106303Q();
        C7121a.m22248b().mo18559a(new DownloadFestivalTask()).mo18559a(new QueryFollowingTask()).mo18559a(new InitBubbleGuideTask()).mo18559a(new LocationStatusReportTask()).mo18559a(new LocationTask()).mo18560a();
        mo84491K();
        m106299M();
        if (C6399b.m19946v()) {
            View findViewById = this.f85734i.findViewById(R.id.bnq);
            if (findViewById != null) {
                this.f85710R = new LiveBroadcastWarn(this, findViewById);
                getViewLifecycleOwner().getLifecycle().mo55a(this.f85710R);
            }
        }
        this.f85734i.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                MainPageFragment.this.f85734i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MainPageFragment.this.f85749x = true;
            }
        });
        m106330aF();
    }

    /* renamed from: a */
    private static void m106322a(String str, long j, String str2) {
        C1592h.m7855a((Callable<TResult>) new C32940cq<TResult>(str2, str, j), (Executor) C6907h.m21516a());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MainLooperOptService mainLooperOptService = (MainLooperOptService) C7121a.m22243a(MainLooperOptService.class);
        mainLooperOptService.updateRootView(viewGroup);
        mainLooperOptService.updateState(WatchState.WATCH_WINDOW_FOCUS_CHANGE);
        return this.f85718Z.mo79766a(this, layoutInflater, viewGroup, bundle);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) getActivity(), i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.f85720ab != null) {
            this.f85720ab.run();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m106314a(String str, String str2, long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notice_type", str);
        } catch (JSONException unused) {
        }
        MobClick jsonObject = MobClick.obtain().setEventName(str2).setLabelName("follow_bottom_tab").setJsonObject(jSONObject);
        if (j > 0) {
            jsonObject.setValue(String.valueOf(j));
        }
        C6907h.onEvent(jsonObject);
        return null;
    }
}
