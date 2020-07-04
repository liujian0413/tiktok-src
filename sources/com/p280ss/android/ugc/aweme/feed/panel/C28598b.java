package com.p280ss.android.ugc.aweme.feed.panel;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnGenericMotionListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.reflect.C9743c;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10755d;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.IAccountService.C21077a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.C23389b;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.comment.abtest.C24033a;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24031c;
import com.p280ss.android.ugc.aweme.comment.param.C24201b.C24202a;
import com.p280ss.android.ugc.aweme.commercialize.C24551b;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24562c;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24565f;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24566g;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24568i;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25053a;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25272bk;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25344d;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25547a;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25548b;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25572q;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.net.C25706a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager.C25752e;
import com.p280ss.android.ugc.aweme.detail.api.DetailApi;
import com.p280ss.android.ugc.aweme.detail.p1159c.C26054a;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26214y;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26215z;
import com.p280ss.android.ugc.aweme.experiment.CellInfoEnableExperiment;
import com.p280ss.android.ugc.aweme.experiment.EnableFollowHintGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.C28066ac;
import com.p280ss.android.ugc.aweme.feed.C28201af;
import com.p280ss.android.ugc.aweme.feed.C28208al;
import com.p280ss.android.ugc.aweme.feed.C28230c;
import com.p280ss.android.ugc.aweme.feed.adapter.C28129ab;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.C28198z;
import com.p280ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.p280ss.android.ugc.aweme.feed.event.C28306ab;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.event.C28310af;
import com.p280ss.android.ugc.aweme.feed.event.C28317am;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28322e;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.event.C28326i;
import com.p280ss.android.ugc.aweme.feed.event.C28330m;
import com.p280ss.android.ugc.aweme.feed.event.C28331n;
import com.p280ss.android.ugc.aweme.feed.event.C28336s;
import com.p280ss.android.ugc.aweme.feed.event.C28337t;
import com.p280ss.android.ugc.aweme.feed.event.C28341x;
import com.p280ss.android.ugc.aweme.feed.event.C28342y;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.event.FeedToResumePlayEvent;
import com.p280ss.android.ugc.aweme.feed.event.FeedToResumePlayEvent.EventType;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.experiment.DUserGuideDoubleTapLikeExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.DUserGuideFollowHintGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.PauseVideoWhenCommentingExperiment;
import com.p280ss.android.ugc.aweme.feed.guide.C28392h;
import com.p280ss.android.ugc.aweme.feed.guide.C28398m;
import com.p280ss.android.ugc.aweme.feed.guide.C6915f;
import com.p280ss.android.ugc.aweme.feed.guide.p1232a.C28385a;
import com.p280ss.android.ugc.aweme.feed.helper.C28417e;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.helper.C28428o;
import com.p280ss.android.ugc.aweme.feed.listener.C28517b;
import com.p280ss.android.ugc.aweme.feed.listener.C28518c;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.listener.C28520e;
import com.p280ss.android.ugc.aweme.feed.listener.C28522g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28231a;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28241b;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28251l;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28254o;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28256q;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28465q;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28468t;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28470u;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28480c;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28483f;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28487j;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28487j.C28490a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28494m;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28498o;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28502r;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28509x;
import com.p280ss.android.ugc.aweme.feed.p1238ui.BaseFeedListFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28797ao;
import com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.C28916a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.C28919c;
import com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.C28919c.C28921b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.feed.preload.C28656b;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;
import com.p280ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p280ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.C29044a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29974c;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.login.p1371a.C32647c;
import com.p280ss.android.ugc.aweme.login.p1371a.C32648d;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.main.C32891b;
import com.p280ss.android.ugc.aweme.main.C32950d;
import com.p280ss.android.ugc.aweme.main.C32960dc;
import com.p280ss.android.ugc.aweme.main.C33054j;
import com.p280ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment;
import com.p280ss.android.ugc.aweme.main.p1378a.C32858a;
import com.p280ss.android.ugc.aweme.main.p1379b.C32892a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.metrics.C33281w;
import com.p280ss.android.ugc.aweme.metrics.C33284z;
import com.p280ss.android.ugc.aweme.newfollow.util.C34196c;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42690a;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42691b;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42697d;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42698e;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42704f;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42705g;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42706h;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42711j;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.p931a.C21085a.C21090d;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.poi.C35076e;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.report.model.C37197a;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.setting.C7217x;
import com.p280ss.android.ugc.aweme.setting.p1516d.C37619b;
import com.p280ss.android.ugc.aweme.share.C38061h;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.model.C38244a;
import com.p280ss.android.ugc.aweme.share.model.C38245b;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a.C38269b;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1609b.C40717a;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42976bj;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.utils.C43166q;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43238k;
import com.p280ss.android.ugc.aweme.video.C43240l;
import com.p280ss.android.ugc.aweme.video.C43264m;
import com.p280ss.android.ugc.aweme.video.C43268o;
import com.p280ss.android.ugc.aweme.video.C43310q;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.experiment.GatherModeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.b */
public abstract class C28598b extends C28632p implements C6310a, C25676d, C28254o, C28343z<C28318an>, C28465q, C28519d, C28648x, C36040n, C7217x {

    /* renamed from: aC */
    private static boolean f75304aC = false;

    /* renamed from: p */
    protected static final String f75305p = "b";

    /* renamed from: A */
    protected C6309f f75306A;

    /* renamed from: B */
    public boolean f75307B;

    /* renamed from: C */
    public boolean f75308C;

    /* renamed from: D */
    public boolean f75309D;

    /* renamed from: E */
    View f75310E;

    /* renamed from: F */
    View f75311F;

    /* renamed from: G */
    ViewGroup f75312G;

    /* renamed from: H */
    ViewGroup f75313H;

    /* renamed from: I */
    protected C28517b f75314I;

    /* renamed from: J */
    public C28518c f75315J;

    /* renamed from: K */
    public C28520e f75316K;

    /* renamed from: L */
    ImageView f75317L;

    /* renamed from: M */
    protected C36031j f75318M;

    /* renamed from: N */
    protected C10751a f75319N;

    /* renamed from: O */
    protected C28392h f75320O;

    /* renamed from: P */
    protected boolean f75321P;

    /* renamed from: Q */
    public boolean f75322Q;

    /* renamed from: R */
    protected String f75323R;

    /* renamed from: S */
    protected C23389b f75324S;

    /* renamed from: T */
    public boolean f75325T;

    /* renamed from: U */
    protected final C28230c f75326U;

    /* renamed from: V */
    public FeedParam f75327V;

    /* renamed from: W */
    protected C28256q f75328W;

    /* renamed from: X */
    protected final C28241b f75329X;

    /* renamed from: Y */
    public boolean f75330Y;

    /* renamed from: Z */
    public int f75331Z;

    /* renamed from: a */
    private final float f75332a;

    /* renamed from: aA */
    private C28919c f75333aA;

    /* renamed from: aB */
    private boolean f75334aB;

    /* renamed from: aD */
    private boolean f75335aD;

    /* renamed from: aE */
    private int f75336aE;

    /* renamed from: aF */
    private C28587aa f75337aF;

    /* renamed from: aG */
    private C43222g f75338aG;

    /* renamed from: aH */
    private String f75339aH;

    /* renamed from: aI */
    private long f75340aI;

    /* renamed from: aJ */
    private C21077a f75341aJ;

    /* renamed from: aK */
    private Aweme f75342aK;

    /* renamed from: aL */
    private C28656b f75343aL;

    /* renamed from: aM */
    private final List<Callable> f75344aM;

    /* renamed from: aN */
    private String f75345aN;

    /* renamed from: aO */
    private C42691b f75346aO;

    /* renamed from: aa */
    protected C28385a f75347aa;

    /* renamed from: ab */
    protected boolean f75348ab;

    /* renamed from: ac */
    protected boolean f75349ac;

    /* renamed from: ad */
    protected boolean f75350ad;

    /* renamed from: ae */
    protected boolean f75351ae;

    /* renamed from: af */
    protected boolean f75352af;

    /* renamed from: ag */
    protected boolean f75353ag;

    /* renamed from: ah */
    public boolean f75354ah;

    /* renamed from: ai */
    protected C38267a f75355ai;

    /* renamed from: aj */
    protected boolean f75356aj;

    /* renamed from: ak */
    public String f75357ak;

    /* renamed from: al */
    public boolean f75358al;

    /* renamed from: am */
    public boolean f75359am;

    /* renamed from: an */
    public Object f75360an;

    /* renamed from: ao */
    int f75361ao;

    /* renamed from: ap */
    public boolean f75362ap;

    /* renamed from: aq */
    public int f75363aq;

    /* renamed from: ar */
    public boolean f75364ar;

    /* renamed from: as */
    public C25752e f75365as;

    /* renamed from: at */
    public String f75366at;

    /* renamed from: au */
    public long f75367au;

    /* renamed from: av */
    public boolean f75368av;

    /* renamed from: aw */
    protected C42698e f75369aw;

    /* renamed from: ax */
    protected C42697d f75370ax;

    /* renamed from: az */
    private C28797ao f75371az;

    /* renamed from: b */
    private C28470u f75372b;

    /* renamed from: c */
    private C25652b f75373c;

    /* renamed from: d */
    private C28228a f75374d;

    /* renamed from: e */
    private boolean f75375e;

    /* renamed from: f */
    private boolean f75376f;

    /* renamed from: g */
    private int f75377g;

    /* renamed from: h */
    private Runnable f75378h;

    /* renamed from: i */
    private Runnable f75379i;

    /* renamed from: j */
    private OnTouchListener f75380j;

    /* renamed from: k */
    private final C24551b f75381k;

    /* renamed from: l */
    private boolean f75382l;

    /* renamed from: m */
    private C28130ac f75383m;

    /* renamed from: n */
    private int f75384n;

    /* renamed from: o */
    private boolean f75385o;

    /* renamed from: q */
    public long f75386q;

    /* renamed from: r */
    protected boolean f75387r;

    /* renamed from: s */
    public LoadMoreFrameLayout f75388s;

    /* renamed from: t */
    public VerticalViewPager f75389t;

    /* renamed from: u */
    protected View f75390u;

    /* renamed from: v */
    protected View f75391v;

    /* renamed from: w */
    protected FeedSwipeRefreshLayout f75392w;

    /* renamed from: x */
    protected DiggLayout f75393x;

    /* renamed from: y */
    public FeedPagerAdapter f75394y;

    /* renamed from: z */
    public int f75395z;

    /* renamed from: bF */
    private boolean m93935bF() {
        return this.f75308C;
    }

    /* renamed from: A */
    public String mo67595A() {
        return this.f75323R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public ViewGroup mo67596B() {
        return null;
    }

    /* renamed from: F */
    public String mo69887F() {
        return C28251l.m92835b(this);
    }

    /* renamed from: G */
    public String mo69888G() {
        return C28251l.m92836c(this);
    }

    /* renamed from: H */
    public String mo69889H() {
        return C28251l.m92834a(this);
    }

    /* renamed from: W */
    public final C28198z mo71886W() {
        return this.f75394y;
    }

    /* renamed from: X */
    public final FeedParam mo71887X() {
        return this.f75327V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67606a(C24202a aVar, Aweme aweme) {
    }

    /* renamed from: at */
    public final VerticalViewPager mo73370at() {
        return this.f75389t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bg */
    public void mo73386bg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: bh */
    public void mo73387bh() {
    }

    /* renamed from: bl */
    public void mo73391bl() {
    }

    /* renamed from: bq */
    public final boolean mo73394bq() {
        return this.f75325T;
    }

    /* renamed from: br */
    public final boolean mo73395br() {
        return this.f75309D;
    }

    /* renamed from: e */
    public void mo67624e(Exception exc) {
    }

    /* renamed from: h */
    public final boolean mo73300h() {
        return true;
    }

    /* renamed from: i */
    public void mo67629i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo67630j() {
    }

    /* renamed from: k */
    public void mo67631k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo67635o() {
    }

    public void onChanged() {
        f75304aC = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo67646p() {
    }

    /* renamed from: v */
    public abstract boolean mo67652v();

    /* renamed from: a */
    public final C28598b mo73322a(FeedParam feedParam) {
        this.f75327V = feedParam;
        this.f75329X.mo71856a(feedParam.getFrom());
        this.f75328W.f74459m = feedParam.getReactSessionId();
        this.f75329X.mo71858b(feedParam.getEventType());
        this.f75329X.mo71853a(feedParam.getPageType());
        feedParam.getObjectId();
        feedParam.getCardType();
        this.f75326U.mo71831a(feedParam.getCreationId());
        return this;
    }

    /* renamed from: a */
    public void mo67609a(C28517b bVar) {
        this.f75314I = bVar;
    }

    /* renamed from: a */
    public final void mo73326a(C0935e eVar) {
        if (this.f75389t != null) {
            this.f75389t.mo66629a(eVar);
        }
    }

    /* renamed from: a */
    public final void mo73334a(C43222g gVar) {
        this.f75338aG = gVar;
        this.f75328W.f74462p = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73338a(boolean z, boolean z2) {
        if (!z2 || C28502r.m93676a(aw_())) {
            C28130ac aL = mo73350aL();
            if (aL != null) {
                aL.mo71535e(z);
            }
            SharePrefCache.inst().getHasLongPressDislike().mo59871a(Boolean.valueOf(true));
            boolean z3 = !z;
            this.f75392w.setCanTouch(z3);
            this.f75389t.setCanTouch(z3);
        }
    }

    /* renamed from: a */
    public final void mo73325a(Activity activity, Fragment fragment) {
        super.mo73325a(activity, fragment);
        this.f75329X.mo71854a(activity, fragment);
        try {
            for (Callable call : this.f75344aM) {
                call.call();
            }
            this.f75344aM.clear();
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73336a(String str, boolean z) {
        this.f75328W.mo71925a(str, true, (C28130ac) null);
    }

    /* renamed from: a */
    public FeedPagerAdapter mo67600a(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        FeedPagerAdapter feedPagerAdapter = new FeedPagerAdapter(this.f113033ay, LayoutInflater.from(this.f113033ay), 10, this, ay_(), this.f75380j, baseFeedPageParams);
        return feedPagerAdapter;
    }

    /* renamed from: a */
    public void mo67605a(View view, Bundle bundle) {
        super.mo67605a(view, bundle);
        if (EarPhoneUnplugExperiment.shouldPausePlayVideo()) {
            m93912a();
        }
        mo67604a(view);
        this.f75387r = true;
        C42961az.m136382c(this);
        mo67653w();
        this.f75392w.setViewPager(this.f75389t);
        this.f75306A = new C6309f(this);
        this.f75380j = C28487j.m93631a(this.f113033ay, this.f75306A, this.f75327V.isShowVideoRank(), new C28490a() {
            /* renamed from: a */
            public final void mo72221a(boolean z) {
                C35076e.m113205a(C28598b.this.mo105655bv(), C28598b.this.mo71904aj(), 3, C28598b.this.f75327V, C28598b.this.mo73366ap());
            }

            /* renamed from: a */
            public final void mo72220a(View view, MotionEvent motionEvent) {
                C28598b.this.mo73327a(motionEvent);
            }
        });
        this.f75394y = mo67600a(this.f113033ay, LayoutInflater.from(this.f113033ay), 10, this, ay_(), this.f75380j, m93941c());
        this.f75394y.f73987c = this;
        this.f75394y.f73988d = m93924b();
        this.f75389t.setAdapter(this.f75394y);
        m93944d();
        C42961az.m136382c(this);
        Activity activity = this.f113033ay;
        if (activity != null && (activity instanceof C33054j)) {
            this.f75322Q = ((C33054j) activity).hasRegistedResumeAction();
        }
        this.f75389t.mo66629a((C0935e) new C0935e() {

            /* renamed from: a */
            int f75403a = -1;

            /* renamed from: b */
            int f75404b = -1;

            /* renamed from: c */
            boolean f75405c;

            /* renamed from: d */
            float f75406d;

            /* renamed from: e */
            boolean f75407e;

            public final void onPageScrollStateChanged(int i) {
                if (i == 1) {
                    C28598b.this.mo73383bd();
                    C28130ac aH = C28598b.this.mo73346aH();
                    if (aH != null) {
                        aH.mo71544D();
                    }
                    return;
                }
                if (i == 0 && !this.f75407e) {
                    C28130ac aH2 = C28598b.this.mo73346aH();
                    if (aH2 != null) {
                        aH2.mo71545E();
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:124:0x02d6  */
            /* JADX WARNING: Removed duplicated region for block: B:125:0x02e8  */
            /* JADX WARNING: Removed duplicated region for block: B:156:0x0399  */
            /* JADX WARNING: Removed duplicated region for block: B:164:0x03ed  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r14) {
                /*
                    r13 = this;
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    int r0 = r0.mo71888Y()
                    if (r0 != 0) goto L_0x0019
                    int r0 = r13.f75404b
                    if (r14 <= r0) goto L_0x0019
                    com.ss.android.ugc.aweme.ba r0 = com.p280ss.android.ugc.aweme.C6903bc.m21505x()
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    android.content.Context r1 = r1.mo105655bv()
                    r0.mo57934a(r1)
                L_0x0019:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r0 = r0.f75330Y
                    if (r0 == 0) goto L_0x0023
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r0.f75331Z = r14
                L_0x0023:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r0 = r0.f75330Y
                    if (r0 != 0) goto L_0x0040
                    boolean r0 = com.p280ss.android.ugc.aweme.app.p1035h.C22993c.m75630a()
                    if (r0 == 0) goto L_0x0040
                    com.ss.android.ugc.aweme.app.h.c r0 = com.p280ss.android.ugc.aweme.app.p1035h.C22993c.m75631b()
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    java.lang.Class r1 = r1.getClass()
                    java.lang.String r1 = r1.getName()
                    r0.mo59985a(r1)
                L_0x0040:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r0 = r0.f75330Y
                    if (r0 != 0) goto L_0x0064
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.ug.guide.e r0 = r0.f75369aw
                    if (r0 == 0) goto L_0x0064
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.ug.guide.e r0 = r0.f75369aw
                    boolean r0 = r0.mo104312b()
                    if (r0 == 0) goto L_0x0064
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.ug.guide.e r0 = r0.f75369aw
                    r0.dismiss()
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager$e r0 = r0.f75365as
                    r0.mo66812a()
                L_0x0064:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r0.f75389t
                    r1 = 0
                    if (r0 == 0) goto L_0x0079
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r0.f75389t
                    int r0 = r0.getChildCount()
                    if (r0 <= 0) goto L_0x0079
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r0.f75330Y = r1
                L_0x0079:
                    com.ss.android.ugc.aweme.ba r0 = com.p280ss.android.ugc.aweme.C6903bc.m21505x()
                    r0.mo57930a()
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r0 = r0.f75394y
                    if (r0 == 0) goto L_0x008f
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r0 = r0.f75394y
                    boolean r2 = r13.f75405c
                    r0.mo71585a(r14, r2)
                L_0x008f:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.ug.guide.d r0 = r0.f75370ax
                    if (r0 == 0) goto L_0x009c
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.ug.guide.d r0 = r0.f75370ax
                    r0.mo104304a()
                L_0x009c:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    int r2 = r0.f75395z
                    r3 = 1
                    if (r14 < r2) goto L_0x00a5
                    r2 = 1
                    goto L_0x00a6
                L_0x00a5:
                    r2 = 0
                L_0x00a6:
                    r0.f75308C = r2
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r0 = r0.f75356aj
                    if (r0 != 0) goto L_0x00cb
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r2 = r2.f75308C
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r4 = r4.f75394y
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    int r5 = r5.f75395z
                    com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.mo67568b(r5)
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r5 = r5.f75394y
                    com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.mo67568b(r14)
                    r0.mo73337a(r2, r4, r5)
                L_0x00cb:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r0 = r0.f75307B
                    r2 = 6
                    if (r0 == 0) goto L_0x00e0
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    int r0 = r0.f75395z
                    if (r14 == r0) goto L_0x00e0
                    java.lang.String r14 = "BaseListFragmentPanel"
                    java.lang.String r0 = "onPageSelected-> mSetItem && position != mCurIndex return!"
                    com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r14, r0)
                    return
                L_0x00e0:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    int r0 = r0.f75395z
                    if (r14 != r0) goto L_0x00ea
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r0.f75307B = r1
                L_0x00ea:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r0.mo73399d(r14)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.ac r0 = r0.mo73346aH()
                    boolean r4 = r13.f75405c
                    if (r4 == 0) goto L_0x0116
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    java.lang.String r5 = "slide"
                    r4.mo73405f(r5)
                    if (r0 == 0) goto L_0x0116
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    java.lang.String r4 = r4.mo73390bk()
                    r0.mo71558f(r4)
                    int r4 = r0.mo65709f()
                    r5 = 101(0x65, float:1.42E-43)
                    if (r4 == r5) goto L_0x0116
                    r0.mo71555c()
                L_0x0116:
                    r13.f75403a = r14
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    android.content.Context r4 = r4.mo105655bv()
                    int r5 = r13.f75403a
                    com.p280ss.android.ugc.aweme.feed.panel.C28629n.m94156a(r4, r5)
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r4 = r4.f75394y
                    com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.mo67568b(r14)
                    com.ss.android.ugc.aweme.feed.ui.seekbar.a r5 = new com.ss.android.ugc.aweme.feed.ui.seekbar.a
                    com.ss.android.ugc.aweme.feed.panel.b r6 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.param.FeedParam r6 = r6.f75327V
                    java.lang.String r6 = r6.getEventType()
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.param.FeedParam r7 = r7.f75327V
                    int r7 = r7.getPageType()
                    com.ss.android.ugc.aweme.feed.panel.b r8 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r5.<init>(r4, r6, r7, r8)
                    com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r5)
                    r13.f75404b = r14
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r5 = r5.f75321P
                    if (r5 == 0) goto L_0x0155
                    java.lang.String r14 = "BaseListFragmentPanel"
                    java.lang.String r0 = "onPageSelected-> mWillPageChangeByPreLoad return!"
                    com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r14, r0)
                    return
                L_0x0155:
                    boolean r5 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.m93936bn()
                    if (r5 == 0) goto L_0x017b
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    android.app.Activity r5 = r5.f113033ay
                    boolean r5 = r5 instanceof com.p280ss.android.ugc.aweme.feed.panel.C28589ac
                    if (r5 == 0) goto L_0x016e
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    android.app.Activity r5 = r5.f113033ay
                    com.ss.android.ugc.aweme.feed.panel.ac r5 = (com.p280ss.android.ugc.aweme.feed.panel.C28589ac) r5
                    boolean r5 = r5.isPaused()
                    goto L_0x017c
                L_0x016e:
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    android.app.Activity r5 = r5.f113033ay
                    int r5 = com.p280ss.android.ugc.aweme.C21781u.m72809a(r5)
                    r6 = 2
                    if (r5 != r6) goto L_0x017b
                    r5 = 1
                    goto L_0x017c
                L_0x017b:
                    r5 = 0
                L_0x017c:
                    com.ss.android.ugc.aweme.main.m r6 = com.p280ss.android.ugc.aweme.C6903bc.m21482a()
                    boolean r6 = r6.mo84634d()
                    if (r6 == 0) goto L_0x0190
                    com.ss.android.ugc.aweme.feed.panel.b r6 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r6 = r6.mo73488bw()
                    if (r6 != 0) goto L_0x0190
                    r6 = 1
                    goto L_0x0191
                L_0x0190:
                    r6 = 0
                L_0x0191:
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.panel.b r8 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r8 = r8.f75308C
                    com.ss.android.ugc.aweme.feed.adapter.ac r7 = r7.mo73412i(r8)
                    r8 = 4
                    if (r5 != 0) goto L_0x027c
                    if (r6 != 0) goto L_0x027c
                    boolean r9 = com.p280ss.android.ugc.aweme.video.C43268o.f112004a
                    if (r9 == 0) goto L_0x01b6
                    boolean r9 = com.p280ss.android.ugc.aweme.video.C43268o.m137250H()
                    if (r9 != 0) goto L_0x01b1
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r7.mo73354aP()
                    goto L_0x0297
                L_0x01b1:
                    com.p280ss.android.ugc.aweme.feed.panel.C28598b.m93915a(r7)
                    goto L_0x0297
                L_0x01b6:
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r9 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.im.service.IIMService> r10 = com.p280ss.android.ugc.aweme.p313im.service.IIMService.class
                    java.lang.Object r9 = r9.getService(r10)
                    com.ss.android.ugc.aweme.im.service.IIMService r9 = (com.p280ss.android.ugc.aweme.p313im.service.IIMService) r9
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    android.app.Activity r10 = r10.f113033ay
                    boolean r10 = com.p280ss.android.ugc.aweme.feed.helper.C28428o.m93438a(r10)
                    if (r10 == 0) goto L_0x0211
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r10 = r10.f75330Y
                    if (r10 != 0) goto L_0x01f0
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r10 = r10.f75362ap
                    if (r10 == 0) goto L_0x01f0
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.param.FeedParam r10 = r10.f75327V
                    java.lang.String r10 = r10.getFrom()
                    java.lang.String r11 = "from_chat"
                    boolean r10 = android.text.TextUtils.equals(r10, r11)
                    if (r10 == 0) goto L_0x0211
                    if (r9 == 0) goto L_0x0211
                    boolean r9 = r9.isNeedToContinuePlayInAct()
                    if (r9 == 0) goto L_0x0211
                L_0x01f0:
                    java.lang.String r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.f75305p
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    java.lang.String r10 = "do not call stopPlay in onPageSelected for first video, position is "
                    r9.<init>(r10)
                    r9.append(r14)
                    java.lang.String r10 = ", isFirst is "
                    r9.append(r10)
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r10 = r10.f75330Y
                    r9.append(r10)
                    java.lang.String r9 = r9.toString()
                    com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21557a(r7, r9)
                    goto L_0x0297
                L_0x0211:
                    boolean r9 = com.p280ss.android.ugc.aweme.video.C43268o.m137250H()
                    if (r9 != 0) goto L_0x026c
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.video.g r7 = r7.mo73367aq()
                    r7.mo104947w()
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r7 = r7.f75322Q
                    if (r7 == 0) goto L_0x0297
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.c.q r7 = r7.f75328W
                    long r9 = r7.mo71912a()
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    int r7 = r7.f75363aq
                    if (r14 <= r7) goto L_0x0267
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    long r11 = r7.f75367au
                    int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r7 <= 0) goto L_0x0267
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.video.g r7 = r7.mo73367aq()
                    long r9 = r7.mo104915n()
                    r11 = 1000(0x3e8, double:4.94E-321)
                    int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r7 <= 0) goto L_0x024f
                    r11 = 300(0x12c, double:1.48E-321)
                    long r9 = r9 - r11
                L_0x024f:
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    java.lang.String r7 = r7.f75366at
                    boolean r7 = android.text.TextUtils.isEmpty(r7)
                    if (r7 != 0) goto L_0x0267
                    com.ss.android.ugc.aweme.feed.event.FeedToResumePlayEvent r7 = new com.ss.android.ugc.aweme.feed.event.FeedToResumePlayEvent
                    com.ss.android.ugc.aweme.feed.event.FeedToResumePlayEvent$EventType r11 = com.p280ss.android.ugc.aweme.feed.event.FeedToResumePlayEvent.EventType.PUT_VIDEO_POSITION
                    com.ss.android.ugc.aweme.feed.panel.b r12 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    java.lang.String r12 = r12.f75366at
                    r7.<init>(r11, r12, r9)
                    com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r7)
                L_0x0267:
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r7.f75363aq = r14
                    goto L_0x0297
                L_0x026c:
                    if (r7 == 0) goto L_0x0297
                    com.ss.android.ugc.playerkit.videoview.f r9 = r7.mo71553b()
                    if (r9 == 0) goto L_0x0297
                    com.ss.android.ugc.playerkit.videoview.f r7 = r7.mo71553b()
                    r7.mo71673ae()
                    goto L_0x0297
                L_0x027c:
                    java.lang.String r7 = "BaseListFragmentPanel"
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    java.lang.String r10 = "onPageSelected-> not pause lastHolder cause activityBackground:"
                    r9.<init>(r10)
                    r9.append(r5)
                    java.lang.String r10 = ",fragmentInvisible:"
                    r9.append(r10)
                    r9.append(r6)
                    java.lang.String r9 = r9.toString()
                    com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r8, r7, r9)
                L_0x0297:
                    com.ss.android.ugc.aweme.video.k r7 = com.p280ss.android.ugc.aweme.video.C43238k.m137170a()
                    r7.mo104982d()
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.c.q r7 = r7.f75328W
                    r7.mo71922a(r0)
                    if (r4 == 0) goto L_0x02c8
                    boolean r7 = r4.isLive()
                    if (r7 != 0) goto L_0x02c8
                    boolean r7 = r4.isCanPlay()
                    if (r7 != 0) goto L_0x02c8
                    java.lang.String r0 = "BaseListFragmentPanel"
                    java.lang.String r1 = "onPageSelected-> aweme can't play!"
                    com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r0, r1)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r1 = r1.f75394y
                    com.ss.android.ugc.aweme.feed.model.Aweme r14 = r1.mo67568b(r14)
                    r0.mo73413i(r14)
                    return
                L_0x02c8:
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r2 = r2.f75394y
                    com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.mo67568b(r14)
                    boolean r2 = com.p280ss.android.ugc.aweme.utils.C43168s.m136909a(r2)
                    if (r2 == 0) goto L_0x02e8
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    android.content.Context r0 = r0.mo105655bv()
                    r1 = 2131829536(0x7f112320, float:1.9292044E38)
                    com.bytedance.ies.dmt.ui.c.a r0 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r0, r1)
                    r0.mo25750a()
                    goto L_0x0391
                L_0x02e8:
                    if (r5 != 0) goto L_0x0376
                    if (r6 != 0) goto L_0x0376
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r2.mo73332a(r4, r1, r0)
                    boolean r2 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.m93937bo()
                    if (r2 == 0) goto L_0x0308
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.ac r2 = r2.mo73346aH()
                    if (r2 == 0) goto L_0x0308
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.ac r2 = r2.mo73346aH()
                    r2.mo71573x()
                L_0x0308:
                    r2 = 1065353216(0x3f800000, float:1.0)
                    float r5 = r13.f75406d
                    float r2 = r2 - r5
                    r5 = 786163455(0x2edbe6ff, float:1.0E-10)
                    int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                    if (r2 < 0) goto L_0x031a
                    float r2 = r13.f75406d
                    int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                    if (r2 >= 0) goto L_0x0391
                L_0x031a:
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r1 = r2.mo73379b(r4, r1)
                    if (r1 == 0) goto L_0x0391
                    boolean r0 = com.p280ss.android.ugc.aweme.feed.p1234j.C28478a.m93590e(r0)
                    if (r0 == 0) goto L_0x0391
                    boolean r0 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93612e(r4)
                    if (r0 != 0) goto L_0x0391
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r0 = r0.f75368av
                    if (r0 == 0) goto L_0x0391
                    boolean r0 = com.p280ss.android.ugc.aweme.video.C43268o.m137250H()
                    if (r0 == 0) goto L_0x034d
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.playerkit.videoview.f r0 = r0.mo73349aK()
                    if (r0 == 0) goto L_0x0391
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.c.q r1 = r1.f75328W
                    r0.mo71663a(r1)
                    r0.mo71670ab()
                    goto L_0x0391
                L_0x034d:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r0 = r0.f75394y
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mo67568b(r14)
                    boolean r0 = r0.isLive()
                    if (r0 == 0) goto L_0x0363
                    com.ss.android.ugc.aweme.video.k r0 = com.p280ss.android.ugc.aweme.video.C43238k.m137170a()
                    r0.mo104980c()
                    goto L_0x0391
                L_0x0363:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.video.g r0 = r0.mo73367aq()
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.c.q r1 = r1.f75328W
                    r0.mo104939a(r1)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r0.mo73342aD()
                    goto L_0x0391
                L_0x0376:
                    java.lang.String r0 = "BaseListFragmentPanel"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "onPageSelected-> not pause activityBackground:"
                    r1.<init>(r2)
                    r1.append(r5)
                    java.lang.String r2 = ",fragmentInvisible:"
                    r1.append(r2)
                    r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r8, r0, r1)
                L_0x0391:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r0 = r0.mo73488bw()
                    if (r0 == 0) goto L_0x03aa
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    android.app.Activity r0 = r0.f113033ay
                    android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r1 = r1.f75394y
                    com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.mo67568b(r14)
                    com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack.m106765a(r0, r1)
                L_0x03aa:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r1 = r1.f75394y
                    com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.mo67568b(r14)
                    r0.mo73413i(r1)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r0.mo71882S()
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r0.mo67654x()
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    int r1 = r14 + 1
                    r0.mo73401e(r1)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r0.mo73401e(r14)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    int r1 = r14 + -1
                    r0.mo73401e(r1)
                    boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25329c.m83231n(r4)
                    if (r0 != 0) goto L_0x03e0
                    boolean r0 = com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c.m82575a(r4)
                    if (r0 == 0) goto L_0x03e5
                L_0x03e0:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    r0.mo73373ax()
                L_0x03e5:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    boolean r0 = r0.mo73365ao()
                    if (r0 == 0) goto L_0x0404
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    java.lang.String r0 = r0.f75357ak
                    com.ss.android.ugc.aweme.newfollow.util.c r0 = com.p280ss.android.ugc.aweme.newfollow.util.C34196c.m110395a(r0)
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r1 = r1.f75394y
                    com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.mo67568b(r14)
                    java.lang.String r1 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93613f(r1)
                    r0.mo86926b(r1)
                L_0x0404:
                    if (r14 <= 0) goto L_0x0417
                    java.lang.String r14 = "from_tutorial_detail"
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p280ss.android.ugc.aweme.feed.panel.C28598b.this
                    java.lang.String r0 = r0.mo73389bj()
                    boolean r14 = r14.equals(r0)
                    if (r14 == 0) goto L_0x0417
                    com.p280ss.android.ugc.aweme.detail.C26055d.m85581d(r3)
                L_0x0417:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.panel.C28598b.C2860414.onPageSelected(int):void");
            }

            public final void onPageScrolled(int i, float f, int i2) {
                boolean z;
                boolean z2;
                if (i != C28598b.this.f75395z) {
                    z = true;
                } else {
                    z = false;
                }
                this.f75407e = z;
                boolean z3 = C28598b.this.f75330Y;
                if (C28598b.this.f75330Y && f == 0.0f && i2 == 0) {
                    onPageSelected(i);
                    C28598b.this.f75330Y = false;
                }
                if (((float) i2) != 0.0f) {
                    this.f75405c = true;
                }
                if (C28598b.this.f75321P) {
                    C28598b.this.f75321P = false;
                    return;
                }
                this.f75406d = f;
                if (i == this.f75403a && f < 1.0E-10f) {
                    C28598b.this.f75395z = i;
                    this.f75403a = -1;
                    C28598b.this.mo67635o();
                    C28598b.this.mo67646p();
                    View l = C28598b.this.mo73417l(false);
                    if (l != null) {
                        l.setAlpha(0.0f);
                    }
                    if (!z3) {
                        C28598b.this.f75309D = true;
                    }
                    Aweme b = C28598b.this.f75394y.mo67568b(i);
                    if (b == null || b.isLive() || b.isCanPlay()) {
                        if (!C6903bc.m21482a().mo84634d() || C28598b.this.mo73488bw()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (C28598b.this.mo73379b(b, false) && C28598b.this.mo73352aN() && !C28482e.m93612e(C28598b.this.f75394y.mo67568b(C28598b.this.f75395z)) && C28598b.this.f75368av && !z2) {
                            if (C43168s.m136909a(C28598b.this.f75394y.mo67568b(C28598b.this.f75395z))) {
                                C10761a.m31399c(C28598b.this.mo105655bv(), (int) R.string.fsr).mo25750a();
                            } else if (C43268o.m137250H()) {
                                C28130ac aH = C28598b.this.mo73346aH();
                                if (aH != null) {
                                    if (C28598b.this.f75394y.mo67568b(C28598b.this.f75395z).isLive()) {
                                        C43238k.m137170a().mo104980c();
                                    } else if (aH.mo71553b() != null) {
                                        aH.mo71553b().mo71663a((C34976f) C28598b.this.f75328W);
                                        aH.mo71553b().mo71670ab();
                                    }
                                }
                            } else if (C28598b.this.f75394y.mo67568b(C28598b.this.f75395z).isLive()) {
                                C43238k.m137170a().mo104980c();
                                if (C28598b.m93937bo() && C28598b.this.mo73346aH() != null) {
                                    C28598b.this.mo73346aH().au_();
                                }
                            } else {
                                C28598b.this.mo73367aq().mo104939a((C34976f) C28598b.this.f75328W);
                                if (C28598b.m93937bo() && C28598b.this.mo73346aH() != null) {
                                    C28598b.this.mo73346aH().mo71574y();
                                    C28598b.this.mo73367aq().mo104945u();
                                }
                                C28598b.this.mo73342aD();
                            }
                        }
                        C28598b.this.mo73361aW();
                        C28598b.this.mo73360aV();
                    } else {
                        return;
                    }
                }
                if (i == C28598b.this.f75395z) {
                    float f2 = (float) (-i2);
                    C28598b.this.mo73417l(true).setTranslationY(f2);
                    C28598b.this.f75393x.setTranslationY(f2);
                    if (C28598b.this.f75319N != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().mo59877d()).booleanValue()) {
                        C28598b.this.mo73364aZ();
                    }
                    if (C28598b.this.f75320O != null) {
                        C28598b.this.f75320O.mo72112a(f2);
                    }
                } else {
                    int measuredHeight = C28598b.this.f75388s.getMeasuredHeight();
                    if (measuredHeight == 0) {
                        measuredHeight = C9738o.m28709b(C28598b.this.mo105655bv());
                    }
                    if (C21085a.m71117a().f56622i) {
                        measuredHeight = C21085a.m71117a().f56619f;
                    }
                    float f3 = (float) (measuredHeight - i2);
                    C28598b.this.mo73417l(true).setTranslationY(f3);
                    C28598b.this.f75393x.setTranslationY(f3);
                    if (C28598b.this.f75319N != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().mo59877d()).booleanValue()) {
                        C28598b.this.mo73364aZ();
                    }
                    if (C28598b.this.f75320O != null) {
                        C28598b.this.f75320O.mo72112a(f3);
                    }
                }
                C28598b.this.f75362ap = true;
                if (C28598b.this.mo73347aI() != null) {
                    C28598b.this.mo73347aI().mo71543C();
                }
            }
        });
        this.f75389t.setOnUserSwipeUpListener(this.f75365as);
        this.f75372b = new C28470u();
        this.f75372b.mo66536a(new C28468t());
        this.f75372b.mo66537a(this);
        this.f75373c = new C25652b();
        this.f75373c.mo66536a(new C37197a());
        this.f75318M = new C36031j();
        this.f75318M.mo66537a(this);
        this.f75326U.mo71830a();
        this.f75388s.setOnScrolledListener(new C29044a() {
            /* renamed from: a */
            public final void mo73462a(int i) {
                View l = C28598b.this.mo73417l(true);
                if (l != null) {
                    l.setTranslationY((float) i);
                }
                if (C28598b.this.f75393x != null) {
                    C28598b.this.f75393x.setTranslationY((float) i);
                }
                C28598b.this.mo73364aZ();
                if (C28598b.this.f75320O != null) {
                    C28598b.this.f75320O.mo72112a((float) i);
                }
            }
        });
        this.f75308C = true;
        this.f75374d = new C28228a();
        this.f75328W.f74455i = this.f75374d;
        m93945d(view);
        m93947e(view);
        mo69893b(view);
        this.f75324S = this.f75392w;
        this.f75389t.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i != i5 || i2 != i6 || i4 != i8 || i3 != i7) {
                    C28598b.this.mo73373ax();
                }
            }
        });
        if (VERSION.SDK_INT >= 28) {
            this.f75389t.postDelayed(new Runnable() {
                public final void run() {
                    if (C28598b.this.f75389t != null) {
                        WindowInsets rootWindowInsets = C28598b.this.f75389t.getRootWindowInsets();
                        if (rootWindowInsets != null) {
                            boolean z = true;
                            Object a = C9743c.m28722a(WindowInsets.class, "getDisplayCutout", rootWindowInsets);
                            C21085a a2 = C21085a.m71117a();
                            if (a == null) {
                                z = false;
                            }
                            a2.f56623j = z;
                        }
                    }
                }
            }, 200);
        }
        if (C28916a.m95103a()) {
            this.f75333aA = new C28919c(this.f113033ay, new C28921b() {
                /* renamed from: a */
                public final C28130ac mo73465a() {
                    return C28598b.this.mo73346aH();
                }

                /* renamed from: b */
                public final Aweme mo73466b() {
                    return C28598b.this.mo71904aj();
                }

                /* renamed from: c */
                public final String mo73467c() {
                    return C28598b.this.aw_();
                }
            });
        }
        this.f75355ai = C38267a.m122239a((Context) this.f113033ay);
        this.f75355ai.mo95899c((C38269b) new C38269b() {
            /* renamed from: b */
            public final void mo73469b() {
            }

            /* renamed from: a */
            public final void mo73468a() {
                if (C28598b.this.f75320O != null && C28598b.this.f75320O.mo72115d()) {
                    C28598b.this.f75320O.mo72111a();
                    SharePrefCache.inst().getClickGuideShown().mo59871a(Boolean.valueOf(false));
                }
            }
        });
        if (C6399b.m19945u()) {
            this.f75355ai.mo95893a((C38269b) new C38269b() {
                /* renamed from: a */
                public final void mo73468a() {
                }

                /* renamed from: b */
                public final void mo73469b() {
                    C28598b.this.f75364ar = true;
                    C28598b.this.mo69891J();
                }
            });
            this.f75355ai.mo95896b((C38269b) new C38269b() {
                /* renamed from: a */
                public final void mo73468a() {
                }

                /* renamed from: b */
                public final void mo73469b() {
                    if (C28598b.this.f75370ax != null) {
                        C28598b.this.f75370ax.mo104310f();
                    }
                }
            });
        }
        this.f75370ax = C28677a.m94349c().mo73483a((Handler) this.f75306A, (C28648x) this, this.f75355ai);
    }

    /* renamed from: a */
    public static boolean m93921a(Context context, Aweme aweme) {
        return m93922a(context, aweme, (String) null);
    }

    /* renamed from: a */
    private static boolean m93922a(Context context, Aweme aweme, String str) {
        return aweme != null && !C24671f.m80859i().mo65649a(context, aweme, str) && !C25300bx.m83128b(aweme);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo73323a(int i, Aweme aweme) {
        this.f75394y.mo71599e(i);
    }

    /* renamed from: a */
    public final void mo73327a(MotionEvent motionEvent) {
        C28130ac aL = mo73350aL();
        if (aL != null) {
            Aweme h = aL.mo65711h();
            mo67610a(h);
            if (h == null || !C32698a.m105818a(h)) {
                int i = 0;
                if ((C25329c.m83220c(h) && m93952k(h)) || (!C25329c.m83220c(h) && m93951j(h))) {
                    int c = C28344a.m93112c();
                    r5 = c == 0 ? !C6861a.m21337f().isLogin() : c > 0 && !C6861a.m21337f().isLogin() && C28208al.m92714a() >= c;
                    if (r5) {
                        if (c != 0) {
                            C32656f.m105743a(this.f113033ay, aw_(), "click_double_like", C42914ab.m136242a().mo104633a("login_title", this.f113033ay.getString(TextUtils.equals(aw_(), "homepage_hot") ? R.string.c6v : R.string.bz5)).mo104633a("group_id", h.getAid()).mo104633a("log_pb", C33230ac.m107234j(h.getAid())).f111445a);
                        }
                        mo73361aW();
                        C33284z b = new C33284z().mo85388a(aw_()).mo85387a(mo71888Y()).mo85390b(h.getAid()).mo85071g(h).mo85392c("click_double_like").mo85389b(C28208al.m92718c() ^ true ? 1 : 0);
                        if (c != 0) {
                            i = 1;
                        }
                        b.mo85391c(i).mo85252e();
                        if (!C28208al.m92718c()) {
                            C28208al.m92717b();
                        }
                    } else if (C6900g.m21454b().mo16943d()) {
                        aL.mo71531c(h);
                    }
                } else if (!(C28344a.m93112c() == 0 || h == null || h.getUserDigg() == 0 || C6861a.m21337f().isLogin())) {
                    new C33284z().mo85388a(aw_()).mo85387a(mo71888Y()).mo85390b(h.getAid()).mo85071g(h).mo85392c("click_double_like").mo85389b(C28208al.m92718c() ^ true ? 1 : 0).mo85391c(0).mo85252e();
                }
                if (!C6903bc.m21484c().mo59240a()) {
                    if ((C25329c.m83220c(h) && h.isCanPlay()) || !(C25329c.m83220c(h) || h == null || !h.isCanPlay() || h.getStatus() == null || h.getStatus().getPrivateStatus() == 1)) {
                        this.f75393x.mo66634a(motionEvent.getX(), motionEvent.getY());
                        C28130ac aH = mo73346aH();
                        if (!(aH == null || aH.mo71564o() == null)) {
                            aH.mo71564o().mo64588j();
                        }
                    }
                }
            } else {
                C10761a.m31403c(mo105655bv(), C32698a.m105817a(h, R.string.fp_)).mo25750a();
            }
        }
    }

    /* renamed from: a */
    private boolean mo67610a(Aweme aweme) {
        if (aweme == null || aweme.getUserDigg() != 0) {
            return false;
        }
        if (C28482e.m93606a(aweme) && C43168s.m136912d(aweme)) {
            C9738o.m28693a(mo105655bv(), (int) R.string.d56);
            return true;
        } else if (C28482e.m93606a(aweme) || !C43168s.m136911c(aweme) || C43168s.m136913e(aweme)) {
            return false;
        } else {
            C9738o.m28693a(mo105655bv(), (int) R.string.b_r);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73337a(boolean z, Aweme aweme, Aweme aweme2) {
        if (aweme != null && aweme2 != null) {
            C28483f.m93629a(aweme, aweme2, this.f75327V, !z, m93930bA(), mo67655y());
        }
    }

    /* renamed from: a */
    private boolean m93920a(int i, C28130ac acVar) {
        return acVar != null && this.f75394y.mo71595c(i) == acVar.mo71542A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73332a(Aweme aweme, boolean z, C28130ac acVar) {
        if (this.f75322Q && aweme != null) {
            this.f75366at = aweme.getAid();
            C42961az.m136380a(new FeedToResumePlayEvent(EventType.TRY_SHOW_TOAST, mo105655bv(), aweme));
        }
        this.f75328W.mo71921a(aweme, z, acVar);
    }

    /* renamed from: b */
    public final boolean mo73379b(Aweme aweme, boolean z) {
        if (C6399b.m19944t()) {
            return true;
        }
        return m93949e(aweme, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67608a(C28318an anVar) {
        int i;
        switch (anVar.f74631a) {
            case 0:
                Aweme aweme = (Aweme) anVar.f74632b;
                if (aweme != null && !C43168s.m136909a(aweme)) {
                    this.f75328W.mo71928b(aweme, (int) this.f75327V.getVideoCurrentPosition());
                    return;
                }
                return;
            case 1:
                if (!C6900g.m21454b().mo16943d()) {
                    C10761a.m31399c((Context) this.f113033ay, (int) R.string.cjs).mo25750a();
                    return;
                }
                Aweme aweme2 = (Aweme) anVar.f74632b;
                if (aweme2 != null) {
                    C37950a.m121238a().showReportDialog(aweme2, this.f75326U.mo71843n(), this.f113033ay, "");
                    return;
                }
                return;
            case 2:
                if (!C6900g.m21454b().mo16943d()) {
                    C10761a.m31399c((Context) this.f113033ay, (int) R.string.cjs).mo25750a();
                    return;
                }
                Aweme aweme3 = (Aweme) anVar.f74632b;
                if (aweme3 != null && !TextUtils.isEmpty(aweme3.getAid())) {
                    this.f75372b.mo56976a(aweme3.getAid());
                    return;
                }
                return;
            case 3:
                this.f75353ag = false;
                mo67621c(true);
                mo73361aW();
                Aweme aweme4 = (Aweme) anVar.f74632b;
                if (aweme4 != null && mo73385bf()) {
                    mo73406f(aweme4);
                    return;
                }
            case 4:
                return;
            case 5:
                m93932bC();
                return;
            case 7:
                mo73361aW();
                Aweme aweme5 = (Aweme) anVar.f74632b;
                if (aweme5 != null) {
                    this.f75348ab = true;
                    mo73407g(aweme5);
                    return;
                }
                return;
            case 12:
                mo67599E();
                mo73361aW();
                Aweme aweme6 = (Aweme) anVar.f74632b;
                if (aweme6 != null && aweme6.getAuthor() != null) {
                    String uid = aweme6.getAuthor().getUid();
                    String secUid = aweme6.getAuthor().getSecUid();
                    int followerStatus = aweme6.getAuthor().getFollowerStatus();
                    if (!C6861a.m21337f().isLogin()) {
                        m93927b(aweme6, uid, false);
                        Bundle bundle = C42914ab.m136242a().mo104633a("login_title", this.f113033ay.getString(R.string.b7t)).mo104633a("group_id", aweme6.getAid()).mo104633a("log_pb", C33230ac.m107234j(aweme6.getAid())).f111445a;
                        C28621f fVar = new C28621f(this, aweme6, uid, secUid, anVar, followerStatus);
                        C32656f.m105744a(this.f113033ay, aw_(), "click_follow", bundle, (C23305g) fVar);
                        return;
                    }
                    m93927b(aweme6, uid, true);
                    C36031j jVar = this.f75318M;
                    C36034a e = new C36034a().mo91684a(uid).mo91686b(secUid).mo91682a(1).mo91688c(aw_()).mo91690d(C28482e.m93613f(mo71904aj())).mo91683a(aweme6).mo91691e(anVar.f74634d);
                    if (TextUtils.equals(aw_(), "homepage_hot")) {
                        i = -1;
                    } else {
                        i = C42976bj.m136441a(this.f75327V.getEventType());
                    }
                    jVar.mo91679a(e.mo91687c(i).mo91685b(C42976bj.m136442a(this.f75327V.getEventType(), aweme6.getRelationLabel())).mo91689d(followerStatus).mo91681a());
                    m93918a(aweme6.getAuthor());
                    return;
                }
                return;
            case 16:
                mo71897ac();
                mo73353aO();
                return;
            case 18:
            case 19:
                mo67648r();
                C28483f.m93628a(anVar, this.f75327V, mo67655y());
                return;
            case 24:
                this.f75381k.mo64357a(anVar, "click_shopping_cart", "shopping_cart", aw_());
                return;
            case 25:
                Aweme aweme7 = (Aweme) anVar.f74632b;
                if (aweme7 != null) {
                    this.f75373c.mo56976a(aweme7.getAid(), Integer.valueOf(1));
                    C10761a.m31410e(mo105655bv(), C1642a.m8034a(mo105655bv().getString(R.string.a3y), new Object[]{mo105655bv().getString(R.string.i3)})).mo25750a();
                    VerticalViewPager verticalViewPager = this.f75389t;
                    int i2 = this.f75395z + 1;
                    this.f75395z = i2;
                    verticalViewPager.setCurrentItem(i2);
                    C6907h.onEvent(MobClick.obtain().setEventName("click_review_pass").setLabelName("homepage_hot").setValue(aweme7.getAid()).setJsonObject(new C6869c().mo16887a("is_user_review", "1").mo16888b()));
                    return;
                }
                return;
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                Aweme aweme8 = (Aweme) anVar.f74632b;
                if (aweme8 != null) {
                    this.f75373c.mo56976a(aweme8.getAid(), Integer.valueOf(2));
                    C10761a.m31410e(mo105655bv(), C1642a.m8034a(mo105655bv().getString(R.string.a3y), new Object[]{mo105655bv().getString(R.string.apt)})).mo25750a();
                    VerticalViewPager verticalViewPager2 = this.f75389t;
                    int i3 = this.f75395z + 1;
                    this.f75395z = i3;
                    verticalViewPager2.setCurrentItem(i3);
                    C6907h.onEvent(MobClick.obtain().setEventName("click_review_notpass").setLabelName("homepage_hot").setValue(aweme8.getAid()).setJsonObject(new C6869c().mo16887a("is_user_review", "0").mo16888b()));
                    return;
                }
                return;
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                return;
            case 28:
                mo67621c(false);
                C28130ac aH = mo73346aH();
                Aweme aweme9 = (Aweme) anVar.f74632b;
                if (!(aH == null || aweme9 == null)) {
                    if (C43166q.m136903a(aweme9) && C24671f.m80852b().isShowCommerceAfterInteraction() && aH.mo71564o() != null) {
                        aH.mo71564o().mo64552a(C24671f.m80852b().getDelayTimeAfterInteraction() * 1000, "passive_show");
                        return;
                    } else if (C25329c.m83236s(aweme9) && aH.mo71564o() != null) {
                        aH.mo71564o().mo64552a(C25329c.m83237t(aweme9) * 1000, "passive_show");
                        return;
                    }
                }
                break;
            case 30:
                this.f75381k.mo64357a(anVar, "click_video_tag", "video_cart_tag", aw_());
                return;
            case 33:
            case BaseNotice.CHALLENGE /*34*/:
            case 35:
                mo67648r();
                return;
            case 37:
                this.f75353ag = true;
                mo67621c(true);
                mo73361aW();
                Aweme aweme10 = (Aweme) anVar.f74632b;
                if (aweme10 != null && mo73385bf()) {
                    mo73406f(aweme10);
                    return;
                }
            case 38:
                mo73378b((Aweme) anVar.f74632b, "head_icon");
                return;
            case 40:
                Aweme aweme11 = (Aweme) anVar.f74632b;
                if (aweme11 != null) {
                    this.f75339aH = aweme11.getAid();
                    mo73353aO();
                    break;
                }
                break;
            case BaseNotice.LIKE /*41*/:
                this.f75381k.mo64356a(anVar, mo64928a(true));
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73330a(Aweme aweme, String str, String str2, C28318an anVar, int i) {
        if (this.f75318M != null && this.f75318M.ap_()) {
            m93927b(aweme, str, true);
            this.f75318M.mo91679a(new C36034a().mo91684a(str).mo91686b(str2).mo91682a(1).mo91688c(aw_()).mo91690d(C28482e.m93613f(mo71904aj())).mo91683a(aweme).mo91691e(anVar.f74634d).mo91687c(C42976bj.m136441a(this.f75327V.getEventType())).mo91685b(C42976bj.m136442a(this.f75327V.getEventType(), aweme.getRelationLabel())).mo91689d(i).mo91681a());
        }
    }

    /* renamed from: b */
    public final void mo73378b(Aweme aweme, String str) {
        if (!C6900g.m21454b().mo16943d()) {
            C10761a.m31399c((Context) this.f113033ay, (int) R.string.cjs).mo25750a();
        } else if (aweme != null && aweme.getAuthor() != null) {
            String uid = aweme.getAuthor().getUid();
            String secUid = aweme.getAuthor().getSecUid();
            this.f75318M.mo91679a(new C36034a().mo91684a(uid).mo91686b(secUid).mo91682a(0).mo91688c(aw_()).mo91690d(C28482e.m93613f(mo71904aj())).mo91683a(aweme).mo91691e(str).mo91689d(aweme.getAuthor().getFollowerStatus()).mo91681a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69892a(Aweme aweme, String str) {
        String str2;
        C33280v e = new C33280v().mo85341b(mo64928a(true)).mo85345e(TextUtils.isEmpty(mo71875L()) ? aw_() : mo71875L());
        if (TextUtils.isEmpty(mo71875L())) {
            str2 = "follow_button";
        } else {
            str2 = mo73388bi();
        }
        e.mo85347f(str2).mo85343c("follow_button").mo85348g(str).mo85342c(aweme, mo71888Y()).mo85252e();
    }

    /* renamed from: a */
    public final void mo73331a(Aweme aweme, String str, boolean z) {
        if (aweme == null) {
            C24033a.m78868b("AWEME == NULL");
            return;
        }
        if (this.f75326U.mo71837d() == null) {
            C24033a.m78868b("ACTIVITY == NULL");
        } else if (this.f75326U.mo71837d().isFinishing()) {
            return;
        }
        C28130ac ai = mo71903ai();
        C28201af afVar = null;
        if (ai != null) {
            afVar = ai.mo71518F();
        }
        C24202a d = new C24202a(aweme).mo62901a(str).mo62903a(true).mo62907b(z).mo62900a(afVar).mo62910d(mo71875L());
        mo67606a(d, aweme);
        this.f75326U.mo62620a(d.mo62904a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73329a(Aweme aweme, Comment comment, boolean z, String str) {
        if (comment == null) {
            C24033a.m78868b("Comment == NULL");
            return;
        }
        if (this.f75326U.mo71837d() == null) {
            C24033a.m78868b("ACTIVITY == NULL");
        } else if (this.f75326U.mo71837d().isFinishing()) {
            return;
        }
        C28130ac ai = mo71903ai();
        C28201af afVar = null;
        if (ai != null) {
            afVar = ai.mo71518F();
        }
        this.f75326U.mo62620a(new C24202a(aweme).mo62901a(comment.getCid()).mo62900a(afVar).mo62905b(mo71885V()).mo62912e(this.f75327V.getObjectId()).mo62914f(this.f75327V.getCardType()).mo62909c(this.f75382l).mo62910d(mo71875L()).mo62911d(z).mo62908c(str).mo62904a());
        this.f75382l = false;
    }

    /* renamed from: a */
    private void m93919a(C39330h hVar) {
        if (!TextUtils.isEmpty(this.f75339aH)) {
            String str = this.f75339aH;
            this.f75339aH = "";
            C28130ac ai = mo71903ai();
            if (ai != null && ai.mo65711h() != null && TextUtils.equals(ai.mo65711h().getAid(), str)) {
                mo71895aa();
                mo73375az();
                ai.mo71547a(mo73367aq().mo104915n());
            }
        }
    }

    /* renamed from: a */
    public final void mo71909a(Aweme aweme, boolean z) {
        if (C43168s.m136909a(aweme)) {
            C10761a.m31399c(mo105655bv(), (int) R.string.fsr).mo25750a();
        } else if (!this.f75368av || !mo73385bf()) {
            StringBuilder sb = new StringBuilder("try to handlePlay,but can't meet the conditions,pageResume:");
            sb.append(this.f75368av);
            sb.append(",isViewValid:");
            sb.append(mo73385bf());
            C6921a.m21552a(4, "BaseListFragmentPanel", sb.toString());
            StringBuilder sb2 = new StringBuilder("the stacktrace:");
            sb2.append(Log.getStackTraceString(new Throwable()));
            C6921a.m21552a(4, "BaseListFragmentPanel", sb2.toString());
        } else {
            this.f75328W.mo71923a(aweme, z);
        }
    }

    /* renamed from: a */
    public void mo61742a(List list, int i) {
        if (list != null && list.size() >= i) {
            if (C25329c.m83231n((Aweme) list.get(i)) || C25072c.m82575a((Aweme) list.get(i)) || this.f75376f) {
                if (this.f75394y.getCount() == 0) {
                    this.f75394y.mo71589a(list);
                } else if (this.f75376f) {
                    this.f75394y.mo71591a(list, i, this.f75377g);
                } else {
                    this.f75394y.mo71590a(list, i);
                }
                this.f75376f = false;
                this.f75377g = 1;
            }
        }
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return C28417e.m93407a(mo71888Y(), aw_(), z);
    }

    /* renamed from: a */
    public final boolean mo71894a(Runnable runnable, long j) {
        if (this.f75389t != null) {
            return this.f75389t.postDelayed(runnable, j);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64942a(String str, long j, long j2) {
        if (this.f75343aL == null) {
            this.f75343aL = new C28656b();
        }
        this.f75343aL.mo73720a(str, j, j2, this.f75394y, mo71905ak(), this.f75308C);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73333a(ScrollSwitchStateManager scrollSwitchStateManager) throws Exception {
        if (this.f75394y != null) {
            scrollSwitchStateManager.mo79716a(!C6307b.m19566a((Collection<T>) this.f75394y.mo71593b()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73335a(C7326g<ScrollSwitchStateManager> gVar) {
        Activity activity = this.f113033ay;
        if (activity == null) {
            this.f75344aM.add(new C28625j(this, gVar));
            return;
        }
        if (activity instanceof FragmentActivity) {
            try {
                gVar.accept(m93910a((FragmentActivity) activity));
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo73324a(int i, boolean z) {
        this.f75389t.mo66753a(i, false);
    }

    /* renamed from: a */
    public final void mo73328a(Aweme aweme, int i) {
        if (this.f75316K == null || !this.f75316K.mo72227a(aweme, i)) {
            this.f75394y.mo71587a(aweme, i);
            this.f75394y.notifyDataSetChanged();
        }
    }

    /* renamed from: bo */
    protected static boolean m93937bo() {
        return C43310q.m137426d();
    }

    /* renamed from: r */
    private void mo67648r() {
        this.f75328W.mo71936o();
    }

    /* renamed from: C */
    public String mo67597C() {
        return this.f75327V.getTracker();
    }

    /* renamed from: K */
    public final String mo71874K() {
        return this.f75327V.getEnterFromRequestId();
    }

    /* renamed from: L */
    public final String mo71875L() {
        return this.f75327V.getPreviousPage();
    }

    /* renamed from: M */
    public final String mo71876M() {
        return this.f75327V.getMixFromOrder();
    }

    /* renamed from: N */
    public final String mo71877N() {
        return this.f75327V.getShareUserId();
    }

    /* renamed from: O */
    public final String mo71878O() {
        return this.f75327V.getSearchKeyword();
    }

    /* renamed from: P */
    public final String mo71879P() {
        return this.f75327V.getContentSource();
    }

    /* renamed from: Q */
    public final String mo71880Q() {
        return this.f75327V.getLikeEnterMethod();
    }

    /* renamed from: V */
    public final String mo71885V() {
        return this.f75327V.getPoiId();
    }

    /* renamed from: Y */
    public final int mo71888Y() {
        return this.f75327V.getPageType();
    }

    /* renamed from: aC */
    public final long mo73341aC() {
        return this.f75328W.mo71935k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aP */
    public final void mo73354aP() {
        mo73367aq().mo104948x();
    }

    /* renamed from: ai */
    public final C28130ac mo71903ai() {
        return mo73346aH();
    }

    /* renamed from: an */
    public final View mo71911an() {
        return mo73417l(true);
    }

    /* renamed from: ar */
    public final boolean mo73368ar() {
        return super.mo73368ar();
    }

    public final String aw_() {
        return this.f75327V.getEventType();
    }

    /* renamed from: bf */
    public final boolean mo73385bf() {
        return super.mo73385bf();
    }

    /* renamed from: bi */
    public final String mo73388bi() {
        return this.f75327V.getPreviousPagePosition();
    }

    /* renamed from: bj */
    public final String mo73389bj() {
        return this.f75327V.getFrom();
    }

    /* renamed from: bk */
    public final String mo73390bk() {
        return this.f75327V.getEnterMethodValue();
    }

    /* renamed from: bA */
    private boolean m93930bA() {
        return C28066ac.m91705a(aw_());
    }

    /* renamed from: bn */
    public static boolean m93936bn() {
        try {
            return C30199h.m98861a().getEnableOnPageSelectPauseCheck().booleanValue();
        } catch (NullValueException unused) {
            return true;
        }
    }

    /* renamed from: q */
    private void mo67647q() {
        mo73367aq().mo104943c(this.f75328W);
    }

    /* renamed from: J */
    public void mo69891J() {
        if (this.f75370ax != null) {
            this.f75370ax.mo104306b();
        }
    }

    /* renamed from: R */
    public final String mo71881R() throws JSONException {
        return mo71883T().optString("request_id");
    }

    /* renamed from: Z */
    public final void mo71893Z() {
        C28130ac aH = mo73346aH();
        if (aH != null) {
            aH.mo71559g(false);
        }
    }

    /* renamed from: aA */
    public final void mo73339aA() {
        super.mo73339aA();
        this.f75329X.mo71852a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aE */
    public final void mo73343aE() {
        if (this.f75383m != null) {
            this.f75383m.mo65715l();
            this.f75383m = null;
        }
    }

    /* renamed from: aG */
    public final boolean mo73345aG() {
        return TextUtils.equals(aw_(), "homepage_hot");
    }

    /* access modifiers changed from: protected */
    /* renamed from: aJ */
    public final C28129ab mo73348aJ() {
        C28130ac aH = mo73346aH();
        if (aH == null) {
            return null;
        }
        return aH.mo71566q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aK */
    public final C44960f mo73349aK() {
        C28130ac aH = mo73346aH();
        if (aH == null) {
            return null;
        }
        return aH.mo71553b();
    }

    /* renamed from: aL */
    public final C28130ac mo73350aL() {
        C28130ac aH = mo73346aH();
        if (aH != null && !m93929b(aH)) {
            return aH;
        }
        return null;
    }

    /* renamed from: aQ */
    public final boolean mo73355aQ() {
        if (this.f75326U == null || !this.f75326U.mo71989j()) {
            return false;
        }
        return true;
    }

    /* renamed from: aR */
    public final void mo73356aR() {
        if (mo73355aQ()) {
            this.f75326U.mo71990k();
        }
    }

    /* renamed from: aX */
    public void mo73362aX() {
        mo71895aa();
        this.f75368av = true;
        mo73392bm();
    }

    /* renamed from: ab */
    public final void mo71896ab() {
        C28130ac aH = mo73346aH();
        if (aH != null) {
            aH.mo71559g(true);
        }
    }

    /* renamed from: ad */
    public final boolean mo71898ad() {
        View l = mo73417l(false);
        if (l == null || l.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: ag */
    public final void mo71901ag() {
        if (C6399b.m19943s()) {
            mo73387bh();
        } else {
            mo73386bg();
        }
    }

    /* renamed from: aj */
    public final Aweme mo71904aj() {
        return C28478a.m93586b(mo73346aH());
    }

    /* renamed from: ak */
    public final int mo71905ak() {
        if (this.f75389t == null) {
            return this.f75395z;
        }
        return this.f75389t.getCurrentItem();
    }

    /* renamed from: al */
    public final int mo71906al() {
        if (this.f75394y == null) {
            return 0;
        }
        return this.f75394y.getCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ao */
    public final boolean mo73365ao() {
        if (!TextUtils.isEmpty(this.f75357ak)) {
            return true;
        }
        return false;
    }

    /* renamed from: aq */
    public final C43222g mo73367aq() {
        if (this.f75338aG != null) {
            return this.f75338aG;
        }
        return C43316v.m137450K();
    }

    /* renamed from: as */
    public final boolean mo73369as() {
        if (this.f75331Z == this.f75395z) {
            return true;
        }
        return false;
    }

    /* renamed from: av */
    public final void mo73372av() {
        super.mo73372av();
        C6861a.m21332a().addLoginOrLogoutListener(this.f75341aJ);
    }

    /* renamed from: aw */
    public final void mo73305aw() {
        super.mo73305aw();
        C6861a.m21332a().removeLoginOrLogoutListener(this.f75341aJ);
    }

    /* renamed from: az */
    public final void mo73375az() {
        if (this.f75320O != null) {
            this.f75320O.mo72114c();
        }
        mo73364aZ();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bb */
    public final boolean mo73381bb() {
        if (mo69890I() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: bd */
    public final void mo73383bd() {
        C28129ab aJ = mo73348aJ();
        if (aJ != null) {
            aJ.mo71642N();
        }
    }

    /* renamed from: bm */
    public final void mo73392bm() {
        if (!C6399b.m19945u()) {
            mo73335a((C7326g<ScrollSwitchStateManager>) new C28624i<ScrollSwitchStateManager>(this));
        }
    }

    /* renamed from: u */
    public void mo67651u() {
        mo73402e(this.f75394y.mo67568b(this.f75389t.getCurrentItem()));
    }

    /* renamed from: D */
    private void mo67598D() {
        C28129ab aJ = mo73348aJ();
        if (aJ != null) {
            aJ.mo71645Q();
        }
        mo73410h(this.f75394y.mo67568b(this.f75389t.getCurrentItem()));
    }

    /* renamed from: E */
    private void mo67599E() {
        if (this.f75319N != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().mo59877d()).booleanValue()) {
            mo73364aZ();
        }
    }

    /* renamed from: I */
    private int mo69890I() {
        Activity activity = this.f113033ay;
        if (activity != null) {
            if (activity instanceof C33054j) {
                return 1;
            }
            if (activity instanceof C26214y) {
                return 2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private long m93924b() {
        if (this.f75340aI == 0) {
            this.f75340aI = System.currentTimeMillis();
        }
        return this.f75340aI;
    }

    /* renamed from: bB */
    private void m93931bB() {
        C28130ac aH = mo73346aH();
        if (aH != null) {
            C28129ab q = aH.mo71566q();
            if (q != null) {
                Aweme h = aH.mo65711h();
                if (h != null) {
                    C1592h.m7853a((Callable<TResult>) new C28626k<TResult>(h, q));
                }
            }
        }
    }

    /* renamed from: bD */
    private void m93933bD() {
        if (this.f75371az != null && this.f75371az.isShowing()) {
            this.f75371az.mo74027a();
        }
    }

    /* renamed from: bE */
    private void m93934bE() {
        if (this.f75346aO == null) {
            this.f75346aO = new C42691b(this.f75389t, this.f75388s);
        }
        this.f75346aO.mo104298a();
    }

    /* renamed from: by */
    private static boolean m93939by() {
        if (!C32960dc.m106535c(true) || C32960dc.m106531a(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: bz */
    private boolean m93940bz() {
        C28130ac aH = mo73346aH();
        if (aH == null || aH.mo65711h() == null || !aH.mo65711h().isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m93944d() {
        if (mo62993e()) {
            this.f75389t.setOnGenericMotionListener(new OnGenericMotionListener() {
                public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
                    if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || C28598b.this.f75389t == null || C28598b.this.f75389t.getScrollState() != 0 || C28598b.this.f75349ac) {
                        return false;
                    }
                    C6921a.m21552a(3, C28598b.f75305p, "onGenericMotionEvent action scroll");
                    if (motionEvent.getAxisValue(9) < 0.0f) {
                        if (C28598b.this.f75389t.canScrollVertically(1)) {
                            C28598b.this.f75389t.setCurrentItem(C28598b.this.f75389t.getCurrentItem() + 1);
                            return true;
                        }
                    } else if (C28598b.this.f75389t.canScrollVertically(-1)) {
                        C28598b.this.f75389t.setCurrentItem(C28598b.this.f75389t.getCurrentItem() - 1);
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: e */
    private static boolean mo62993e() {
        try {
            return C30199h.m98861a().getFeedHandleGenericMotion().booleanValue();
        } catch (NullValueException unused) {
            return true;
        }
    }

    /* renamed from: w */
    private void mo67653w() {
        try {
            C0608j bx = mo73489bx();
            Fragment a = bx.mo2644a("comment");
            if (a != null) {
                C0633q a2 = bx.mo2645a();
                a2.mo2587a(a);
                a2.mo2604c();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    private String mo67655y() {
        return C33230ac.m107206a(this.f75394y.mo67568b(this.f75389t.getCurrentItem()), mo71888Y());
    }

    /* renamed from: S */
    public final void mo71882S() {
        JSONObject T = mo71883T();
        if (T != null) {
            try {
                C42961az.m136380a(new C28341x(T.getString("request_id")));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: T */
    public final JSONObject mo71883T() {
        return C28480c.m93600a(this.f75394y.mo67568b(this.f75389t.getCurrentItem()), mo71888Y(), mo73390bk(), aw_());
    }

    /* access modifiers changed from: protected */
    /* renamed from: aB */
    public final void mo73340aB() {
        if (!C43268o.m137250H()) {
            mo73367aq().mo104947w();
            return;
        }
        C44960f aK = mo73349aK();
        if (aK != null) {
            aK.mo71673ae();
        }
    }

    /* renamed from: aD */
    public final void mo73342aD() {
        if (!C28428o.m93438a(this.f113033ay) || this.f75362ap) {
            mo73367aq().mo104945u();
        }
    }

    /* renamed from: aM */
    public void mo73351aM() {
        m93946d(this.f75394y.mo67568b(this.f75389t.getCurrentItem()), true);
    }

    /* renamed from: aN */
    public final boolean mo73352aN() {
        C28130ac aH = mo73346aH();
        if (C28478a.m93590e(aH) || C28478a.m93591f(aH)) {
            return true;
        }
        return false;
    }

    /* renamed from: aO */
    public final void mo73353aO() {
        if (!C43268o.m137250H()) {
            mo67647q();
        } else {
            m93915a(mo73346aH());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aV */
    public final void mo73360aV() {
        if (this.f75319N != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().mo59877d()).booleanValue()) {
            mo73364aZ();
        }
    }

    /* renamed from: aY */
    public final void mo73363aY() {
        if (this.f75319N != null) {
            mo73364aZ();
            if (this.f75389t != null) {
                this.f75389t.removeCallbacks(this.f75378h);
            }
        }
    }

    /* renamed from: aZ */
    public final void mo73364aZ() {
        if (this.f75319N != null) {
            this.f75319N.mo25727f();
            this.f75354ah = false;
            this.f75355ai.mo95897b(this.f75354ah);
        }
    }

    /* renamed from: am */
    public final String mo71910am() {
        return C28482e.m93613f(this.f75394y.mo67568b(this.f75389t.getCurrentItem()));
    }

    /* renamed from: ap */
    public final int mo73366ap() {
        Aweme aj = mo71904aj();
        if (aj == null || aj.getSimplePoiInfoStruct() == null) {
            return -1;
        }
        return aj.getSimplePoiInfoStruct().getIndex();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public void mo73374ay() {
        if (this.f75361ao != 4) {
            this.f75390u.setVisibility(8);
            this.f75391v.setVisibility(8);
            return;
        }
        this.f75390u.setVisibility(0);
        this.f75391v.setVisibility(0);
    }

    /* renamed from: ba */
    public final void mo73380ba() {
        if (this.f75320O != null) {
            this.f75320O.mo72111a();
            if (this.f75306A != null) {
                this.f75306A.removeCallbacks(this.f75379i);
            }
        }
    }

    /* renamed from: be */
    public final int mo73384be() {
        if (this.f75394y != null) {
            return this.f75394y.getCount() - (this.f75395z + 1);
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bp */
    public boolean mo73393bp() {
        if ((this.f75320O == null || !this.f75320O.mo72115d()) && (this.f75319N == null || !this.f75319N.isShowing())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo67649s() {
        if (!C6399b.m19944t()) {
            C28130ac aH = mo73346aH();
            if (aH != null) {
                aH.mo71533d(!aH.mo71567r());
                return aH.mo71567r();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo67650t() {
        if (!C6399b.m19944t()) {
            C28130ac aH = mo73346aH();
            if (aH != null && aH.mo65709f() == 2) {
                aH.mo71533d(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo67654x() {
        if (this.f75391v != null && this.f75391v.getVisibility() == 8) {
            mo73373ax();
        }
    }

    /* renamed from: a */
    private void m93912a() {
        Activity g = C6405d.m19984g();
        if (g instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) g;
            HomePageDataViewModel.m98904a(fragmentActivity).f79568g.observe(fragmentActivity, new C28618c(this));
        }
    }

    /* renamed from: bC */
    private void m93932bC() {
        if (C28344a.m93112c() != 0 && !C6861a.m21337f().isLogin() && !C28208al.m92719d() && !mo73393bp()) {
            if (this.f75371az == null) {
                this.f75371az = new C28797ao(mo105655bv());
            }
            this.f75393x.postDelayed(new C28627l(this), 800);
        }
    }

    /* renamed from: g */
    private C28130ac mo67628g() {
        if (this.f75389t == null) {
            return null;
        }
        int childCount = this.f75389t.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C28130ac acVar = (C28130ac) this.f75389t.getChildAt(i).getTag(R.id.aje);
            if (acVar != null && this.f75394y.mo67568b(this.f75389t.getCurrentItem()) == acVar.mo65711h() && acVar.mo65710g() == 3) {
                return acVar;
            }
        }
        return null;
    }

    /* renamed from: U */
    public final void mo71884U() {
        if (mo73488bw()) {
            C28130ac aH = mo73346aH();
            if (C28478a.m93590e(aH)) {
                Aweme h = aH.mo65711h();
                if (h != null && h != this.f75342aK) {
                    this.f75342aK = h;
                    C28483f.m93627a(mo105655bv(), h, mo71883T(), this.f75327V, mo64928a(true));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aF */
    public final void mo73344aF() {
        if (this.f75394y != null) {
            int i = this.f75384n;
            if (i >= 0) {
                int i2 = i - 1;
                if (C25329c.m83221d(this.f75394y.mo67568b(i2)) && !C25329c.m83205G(this.f75394y.mo67568b(i2))) {
                    mo67616b(i2);
                }
                if (i == 0 && this.f75394y.mo67568b(1) != null) {
                    mo67616b(i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aI */
    public final C28130ac mo73347aI() {
        if (this.f75389t == null) {
            return null;
        }
        for (int childCount = this.f75389t.getChildCount() - 1; childCount >= 0; childCount--) {
            C28130ac acVar = (C28130ac) this.f75389t.getChildAt(childCount).getTag(R.id.aje);
            if (m93920a(this.f75389t.getCurrentItem() + 1, acVar)) {
                return acVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aS */
    public final void mo73357aS() {
        if (this.f75394y.getCount() == 0) {
            DmtStatusView n = mo73419n(true);
            if (n != null) {
                n.setVisibility(0);
                n.mo25943g();
            }
            mo73353aO();
            if (mo73381bb()) {
                C42961az.m136380a(new C28306ab(null));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aW */
    public final void mo73361aW() {
        if (C6399b.m19944t()) {
            if (this.f75320O != null && ((Boolean) SharePrefCache.inst().getClickGuideShown().mo59877d()).booleanValue()) {
                this.f75320O.dismiss();
            }
        } else if (this.f75320O != null && C32960dc.m106539g(false)) {
            this.f75320O.dismiss();
        }
    }

    /* renamed from: aa */
    public final void mo71895aa() {
        final View l = mo73417l(false);
        if (l != null) {
            l.setVisibility(0);
            l.animate().alpha(0.0f).setDuration(100).withEndAction(new Runnable() {
                public final void run() {
                    if (l != null) {
                        l.setVisibility(8);
                    }
                }
            }).start();
        }
    }

    /* renamed from: ac */
    public final void mo71897ac() {
        View l = mo73417l(true);
        if (l != null) {
            l.setVisibility(0);
            l.setScaleX(2.5f);
            l.setScaleY(2.5f);
            l.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            l.setSelected(false);
        }
    }

    /* renamed from: au */
    public final void mo73371au() {
        super.mo73371au();
        if (this.f75306A != null) {
            this.f75306A.removeCallbacksAndMessages(null);
        }
        this.f75328W = null;
        if (this.f75333aA != null) {
            this.f75333aA.mo74212b();
        }
        C42961az.m136383d(this);
        if (this.f75337aF != null) {
            this.f75337aF.mo73310d();
        }
        if (this.f75355ai != null && this.f75355ai.mo95909h()) {
            this.f75355ai.mo95906f(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ax */
    public final void mo73373ax() {
        C28130ac aH = mo73346aH();
        if (aH != null && !C25329c.m83231n(C28478a.m93586b(mo73412i(true))) && !C25072c.m82575a(C28478a.m93586b(mo73412i(true)))) {
            aH.mo71561i(false);
        }
        mo73374ay();
        C21085a.m71124a((ViewGroup) this.f75389t, this.f75390u, this.f75391v, this.f113033ay, (C21090d) new C28619d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final boolean mo73382bc() {
        if (C6903bc.m21496o().mo88907a().mo88879b()) {
            return "from_poi_categorized".equals(mo73389bj());
        }
        if ("from_nearby".equals(mo73389bj()) || "from_poi_categorized".equals(mo73389bj())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bs */
    public final /* synthetic */ void mo73396bs() {
        if (this.f113033ay != null && !this.f113033ay.isFinishing() && mo73385bf()) {
            try {
                this.f75371az.showAtLocation(this.f75393x, 17, 0, 0);
                C28208al.m92716a(true);
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
    }

    /* renamed from: c */
    private BaseFeedPageParams m93941c() {
        return BaseFeedPageParams.newBuilder().setAwemeFromPage(mo69890I()).setEventType(aw_()).setParam(this.f75327V).setMyProfile(TextUtils.equals("from_profile_self", mo73389bj())).setFromPostList(this.f75327V.isFromPostList()).setPageType(mo71888Y()).setShowVote(this.f75327V.isShowVote()).setCid(this.f75327V.getCid());
    }

    /* access modifiers changed from: protected */
    /* renamed from: aH */
    public final C28130ac mo73346aH() {
        if (this.f75389t == null) {
            return null;
        }
        if (m93920a(this.f75389t.getCurrentItem(), this.f75383m)) {
            return this.f75383m;
        }
        for (int childCount = this.f75389t.getChildCount() - 1; childCount >= 0; childCount--) {
            C28130ac acVar = (C28130ac) this.f75389t.getChildAt(childCount).getTag(R.id.aje);
            if (m93920a(this.f75389t.getCurrentItem(), acVar)) {
                return acVar;
            }
        }
        return null;
    }

    /* renamed from: aT */
    public final void mo73358aT() {
        if (mo73385bf() && !C6903bc.m21484c().mo59240a() && this.f75335aD && !this.f75355ai.mo95903d()) {
            if (mo71904aj() != null && mo71904aj().isLive()) {
                return;
            }
            if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(EnableFollowHintGuideExperiment.class, true, "enable_follow_hint_guid", C6384b.m19835a().mo15295d().enable_follow_hint_guid, 1) == 1) {
                BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
                if (this.f75319N != null && !((Boolean) SharePrefCache.inst().getFollowGuideShown().mo59877d()).booleanValue()) {
                    mo67656z();
                }
            }
        }
    }

    /* renamed from: aU */
    public final void mo73359aU() {
        if (!this.f75355ai.mo95909h() && !m93940bz()) {
            C28130ac aH = mo73346aH();
            if (aH == null || !m93929b(aH)) {
                BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
                if (!C28398m.f74839a && this.f75320O != null && !((Boolean) SharePrefCache.inst().getClickGuideShown().mo59877d()).booleanValue()) {
                    C1592h.m7855a(C28622g.f75433a, (Executor) C6907h.m21516a());
                    this.f75375e = true;
                    this.f75320O.mo72113b();
                }
            }
        }
    }

    /* renamed from: ah */
    public final void mo71902ah() {
        boolean z;
        if (this.f75389t != null && this.f75389t.getChildCount() != 0) {
            if (this.f75369aw == null && mo67596B() != null) {
                ViewGroup B = mo67596B();
                VerticalViewPager verticalViewPager = this.f75389t;
                String str = this.f75345aN;
                if ("from_tutorial_detail".equals(mo73389bj()) || !C42706h.f110992b.mo104318c()) {
                    z = false;
                } else {
                    z = true;
                }
                this.f75369aw = new C42698e(B, verticalViewPager, str, z);
            }
            mo73361aW();
            if (this.f75369aw != null) {
                this.f75369aw.mo104311a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bu */
    public final /* synthetic */ void mo73397bu() {
        if (this.f75361ao != 4) {
            if (C21085a.m71131d() > 0) {
                m93914a(this.f75310E, C21085a.m71131d());
                m93914a((View) this.f75312G, -2);
            } else {
                m93914a((View) this.f75312G, 0);
            }
            if (C21085a.m71133e() > 0) {
                m93914a(this.f75311F, C21085a.m71133e());
                m93914a((View) this.f75313H, -2);
            } else {
                m93914a((View) this.f75313H, 0);
            }
        } else {
            m93914a((View) this.f75312G, 0);
            m93914a((View) this.f75313H, 0);
        }
        mo67630j();
    }

    /* renamed from: ae */
    public final void mo71899ae() {
        if (!this.f75375e && !C32960dc.m106539g(false) && f75304aC && C6915f.m21542a() && !C6903bc.m21484c().mo59240a() && !this.f75355ai.mo95895a() && !this.f75355ai.mo95898b() && !this.f75355ai.mo95901c() && !this.f75355ai.mo95909h() && !this.f75349ac && !this.f75350ad && !this.f75350ad && !this.f75334aB && !this.f75354ah && !TextUtils.equals("hot_search_video_board", aw_()) && !TextUtils.equals("discovery_hot_search_video", aw_())) {
            if ((!C6399b.m19945u() || C6384b.m19835a().mo15287a(DUserGuideDoubleTapLikeExperiment.class, false, "D_enable_double_tap_to_like", C6384b.m19835a().mo15295d().D_enable_double_tap_to_like, 1) != 0) && !C28398m.f74839a && this.f75320O != null && m93939by() && !C32960dc.m106539g(false)) {
                this.f75306A.removeCallbacks(this.f75379i);
                this.f75306A.postDelayed(this.f75379i, 6000);
            }
        }
    }

    /* renamed from: l */
    public void mo67632l() {
        super.mo67632l();
        C43238k.m137171a(m93924b());
        this.f75328W.mo71932h();
        if (C6384b.m19835a().mo15287a(GatherModeExperiment.class, true, "gather_mode", C6384b.m19835a().mo15295d().gather_mode, 0) != 0) {
            C43264m.m137242a(mo105655bv()).mo105014a();
        }
        if (C6384b.m19835a().mo15292a(CellInfoEnableExperiment.class, true, "enable_cellinfo_report", C6384b.m19835a().mo15295d().enable_cellinfo_report, false)) {
            C43240l.m137186a(mo105655bv()).mo104983a();
        }
        View l = mo73417l(false);
        if (l != null) {
            l.setAlpha(0.0f);
        }
        C28130ac aH = mo73346aH();
        if (aH != null) {
            aH.mo65714k();
            aH.mo71530c(2);
        }
        if (this.f75333aA != null) {
            this.f75333aA.mo74210a();
        }
        if (this.f75370ax != null) {
            int i = this.f75336aE;
            this.f75336aE = i + 1;
            if (!(i == 0 || !this.f75335aD || this.f75389t.getChildCount() == 0)) {
                this.f75370ax.mo104306b();
            }
        }
        this.f75359am = false;
    }

    /* renamed from: n */
    public void mo67634n() {
        this.f75328W.mo71934j();
        if (C6399b.m19944t()) {
            C28130ac aH = mo73346aH();
            if (aH != null) {
                aH.mo71521a();
            }
        } else if (this.f75389t != null) {
            int childCount = this.f75389t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C28130ac acVar = (C28130ac) this.f75389t.getChildAt(i).getTag(R.id.aje);
                if (acVar != null) {
                    acVar.mo71521a();
                }
            }
        }
        if (this.f75389t != null) {
            this.f75389t.mo66768e();
        }
        super.mo67634n();
        if (this.f75372b != null) {
            this.f75372b.mo59134U_();
        }
        if (this.f75318M != null) {
            this.f75318M.mo59134U_();
        }
        if (mo73367aq().mo104942b((C34976f) this.f75328W)) {
            mo73367aq().mo104939a((C34976f) null);
        }
        if (C43238k.m137170a().mo104981c(this.f75328W)) {
            C43238k.m137170a().mo104975a((C34976f) null);
        }
        if (this.f75371az != null) {
            this.f75371az.mo74027a();
            this.f75371az = null;
        }
        C25272bk.m83055a().mo65888b();
    }

    /* renamed from: z */
    private void mo67656z() {
        int[] iArr;
        C28130ac aH = mo73346aH();
        if ((aH == null || !C25072c.m82577c(aH.mo65711h())) && aH != null && !C28482e.m93606a(aH.mo65711h())) {
            C28129ab aJ = mo73348aJ();
            if (aJ == null) {
                iArr = null;
            } else {
                iArr = aJ.mo71641M();
            }
            if (iArr != null) {
                if (!C6399b.m19944t()) {
                    this.f75319N.mo25718a(this.f75393x, 3, (iArr[0] - this.f75319N.mo25724d()) - ((int) C9738o.m28708b(mo105655bv(), 15.0f)), (iArr[1] - (this.f75319N.mo25723c() / 2)) - ((int) C9738o.m28708b(mo105655bv(), 12.0f)), (float) ((this.f75319N.mo25723c() / 2) + ((int) C9738o.m28708b(mo105655bv(), 4.0f))));
                } else if (C43127fh.m136806a(mo105655bv())) {
                    this.f75319N.mo25718a(this.f75393x, 5, iArr[0] + ((int) C9738o.m28708b(mo105655bv(), 40.0f)), iArr[1] - ((int) C9738o.m28708b(mo105655bv(), 45.0f)), (float) ((this.f75319N.mo25723c() / 2) + ((int) C9738o.m28708b(mo105655bv(), 4.0f))));
                } else {
                    this.f75319N.mo25718a(this.f75393x, 3, (iArr[0] - this.f75319N.mo25724d()) - ((int) C9738o.m28708b(mo105655bv(), 10.0f)), (iArr[1] - (this.f75319N.mo25723c() / 2)) - ((int) C9738o.m28708b(mo105655bv(), 12.0f)), (float) ((this.f75319N.mo25723c() / 2) + ((int) C9738o.m28708b(mo105655bv(), 4.0f))));
                }
                this.f75319N.setOnDismissListener(new OnDismissListener() {
                    public final void onDismiss() {
                        C28598b.this.f75354ah = false;
                        C28598b.this.f75355ai.mo95897b(C28598b.this.f75354ah);
                    }
                });
                this.f75354ah = true;
                this.f75355ai.mo95897b(this.f75354ah);
                C6907h.m21524a("follow_hint_guide_show ", (Map) C22984d.m75611a().f60753a);
                C6907h.m21524a("new_user_guide_show", (Map) C22984d.m75611a().mo59973a("guide_type", "follow").f60753a);
            }
        }
    }

    /* renamed from: af */
    public final void mo71900af() {
        boolean z;
        boolean z2;
        if (!C32960dc.m106537e(false) && !this.f75351ae && !this.f75349ac && !this.f75354ah && !m93940bz()) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null) {
                User currentUser = iUserService.getCurrentUser();
                if (currentUser != null && currentUser.getFollowingCount() > 0) {
                    return;
                }
            }
            if (!this.f75355ai.mo95895a() && !this.f75355ai.mo95909h()) {
                boolean z3 = true;
                if ((!C6399b.m19944t() || C6384b.m19835a().mo15287a(EnableFollowHintGuideExperiment.class, true, "enable_follow_hint_guid", C6384b.m19835a().mo15295d().enable_follow_hint_guid, 1) == 1) && !C43122ff.m136767b() && !C28398m.f74839a && this.f75319N != null) {
                    if (C32960dc.m106539g(false) || !C6915f.m21542a()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!C32960dc.m106535c(true) || C32960dc.m106531a(false)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (C6384b.m19835a().mo15287a(DUserGuideFollowHintGuideExperiment.class, false, "D_enable_follow_hint_guide", C6384b.m19835a().mo15295d().D_enable_follow_hint_guide, 1) != 0 || !C6399b.m19945u()) {
                        if (!(C6384b.m19835a().mo15287a(DUserGuideFollowHintGuideExperiment.class, false, "D_enable_follow_hint_guide", C6384b.m19835a().mo15295d().D_enable_follow_hint_guide, 1) == 1 && C6399b.m19945u() && C6384b.m19835a().mo15287a(DUserGuideDoubleTapLikeExperiment.class, false, "D_enable_double_tap_to_like", C6384b.m19835a().mo15295d().D_enable_double_tap_to_like, 1) == 0)) {
                            z3 = false;
                        }
                        if (z3 && !C32960dc.m106537e(false)) {
                            m93933bD();
                            this.f75389t.removeCallbacks(this.f75378h);
                            this.f75389t.post(this.f75378h);
                        } else if (z2 && z && !C32960dc.m106537e(false)) {
                            m93933bD();
                            this.f75389t.removeCallbacks(this.f75378h);
                            this.f75389t.post(this.f75378h);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public void mo67633m() {
        super.mo67633m();
        this.f75359am = true;
        this.f75328W.mo71933i();
        if (C6384b.m19835a().mo15287a(GatherModeExperiment.class, true, "gather_mode", C6384b.m19835a().mo15295d().gather_mode, 0) != 0) {
            C43264m.m137242a(mo105655bv()).mo105016b();
        }
        if (C6384b.m19835a().mo15292a(CellInfoEnableExperiment.class, true, "enable_cellinfo_report", C6384b.m19835a().mo15295d().enable_cellinfo_report, false)) {
            C43240l.m137186a(mo105655bv()).mo104985b();
        }
        if (this.f75394y == null || !C28494m.m93640a(aw_())) {
            C43238k.m137170a().mo104979b(this.f75328W);
        }
        C28130ac aH = mo73346aH();
        if (aH == null) {
            String str = f75305p;
            StringBuilder sb = new StringBuilder("onPause called->viewHolder is null,itemCount:");
            sb.append(mo71906al());
            sb.append(".maybe cause bug:");
            sb.append(this);
            C6921a.m21552a(6, str, sb.toString());
        }
        if (C28478a.m93590e(aH)) {
            if (!C43268o.m137250H()) {
                mo67647q();
            } else {
                m93915a(aH);
            }
            if (mo73488bw()) {
                aH.mo65716m().mo71560h(true);
            }
        }
        if (aH != null) {
            aH.mo65712i();
            m93916a(aH, 2);
        }
        if (mo73488bw()) {
            C43305j.m137386g().mo105028b();
        }
        if (this.f75320O != null && this.f75320O.mo72115d()) {
            this.f75320O.dismiss();
        }
        mo73400d((String) null);
        mo73361aW();
        mo67599E();
        if (C6399b.m19944t() && this.f75386q != 0) {
            C6907h.onEvent(MobClick.obtain().setEventName("video_request_leave").setLabelName("perf_monitor").setJsonObject(new C6909j().mo16966a("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f75386q)).mo16967a()));
        }
        if (mo73365ao()) {
            C34196c.m110395a(this.f75357ak).mo86930e();
        }
        if (this.f75333aA != null) {
            this.f75333aA.mo74212b();
        }
        if (this.f75370ax == null) {
            return;
        }
        if (!C6399b.m19945u() || !C6903bc.m21505x().mo57948f()) {
            this.f75370ax.mo104304a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo64929a(C28318an anVar) {
        mo67608a(anVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo73398c(View view) {
        mo67598D();
    }

    @C7709l
    public void onBottomTabClicked(C38061h hVar) {
        mo73380ba();
    }

    @C7709l
    public void onDismissEnterMusicGuideEvent(C28326i iVar) {
        mo73383bd();
    }

    @C7709l
    public void onEvent(FollowStatus followStatus) {
        m93917a(followStatus);
    }

    @C7709l
    public void onEvnet(C28330m mVar) {
        mo73361aW();
    }

    @C7709l
    public void onFakeSwipeEvent(C42690a aVar) {
        m93934bE();
    }

    public C28598b(String str) {
        this(str, 0);
    }

    /* renamed from: a */
    private static ScrollSwitchStateManager m93910a(FragmentActivity fragmentActivity) {
        return ScrollSwitchStateManager.m98918a(fragmentActivity);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo73376b(C7326g gVar) throws Exception {
        mo73335a(gVar);
        return null;
    }

    /* renamed from: c */
    public final Aweme mo71908c(int i) {
        return this.f75394y.mo67568b(i);
    }

    /* renamed from: e */
    public void mo73402e(Aweme aweme) {
        m93953l(aweme);
        mo71884U();
    }

    /* renamed from: f */
    public final C28598b mo73405f(String str) {
        this.f75327V.setEnterMethodValue(str);
        return this;
    }

    /* renamed from: h */
    public final void mo73410h(Aweme aweme) {
        mo71909a(aweme, true);
    }

    /* renamed from: o */
    public final void mo73420o(boolean z) {
        this.f75368av = true;
    }

    @C7709l
    public void onDismissEnterMusicGuideEvent(C32858a aVar) {
        mo73383bd();
    }

    @C7709l
    public void onLoginPageCloseEvent(C32647c cVar) {
        mo67619b(false);
    }

    @C7709l
    public void onReceiveDislikeAwemeEvent(C28324g gVar) {
        this.f75334aB = gVar.f74650a;
    }

    /* renamed from: a */
    public static void m93915a(C28130ac acVar) {
        if (acVar != null && acVar.mo71553b() != null) {
            acVar.mo71553b().mo71672ad();
        }
    }

    /* renamed from: b */
    private static boolean m93929b(C28130ac acVar) {
        if (acVar.mo65709f() == 101) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m93947e(View view) {
        this.f75320O = C28677a.m94351e().mo72127a(view);
    }

    /* renamed from: d */
    public final C6869c mo71892d(Aweme aweme) {
        return C28483f.m93622a(aweme, this.f75327V);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C28130ac mo73404f(int i) {
        return (C28130ac) this.f75389t.getChildAt(i).getTag(R.id.aje);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo73411h(boolean z) {
        if (z) {
            mo67599E();
            return;
        }
        if (this.f75370ax != null) {
            this.f75370ax.mo104307c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo73413i(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            this.f75325T = false;
        }
        this.f75382l = false;
    }

    /* renamed from: k */
    public void mo73416k(boolean z) {
        m93942c(this.f75394y.mo67568b(this.f75389t.getCurrentItem()), z);
    }

    @C7709l
    public void onDeleteAwemeEventOnBase(C28322e eVar) {
        this.f75389t.post(new C28620e(this));
    }

    @C7709l
    public void onEveningEvent(C28331n nVar) {
        C28129ab aJ = mo73348aJ();
        if (aJ != null) {
            aJ.az_();
        }
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        C28130ac aH = mo73346aH();
        if (aH != null) {
            aH.mo71549a(shareCompleteEvent);
        }
    }

    @C7709l
    public void onFakeLabelEvent(C24031c cVar) {
        C28130ac aH = mo73346aH();
        if (aH != null) {
            aH.mo71550a(cVar.f63544a, cVar.f63545b);
        }
    }

    @C7709l
    public void onLoginPageShowEvent(C32648d dVar) {
        mo67619b(dVar.f85103a);
        mo73391bl();
    }

    @C7709l
    public void onPopUpShowEvent(C42705g gVar) {
        C6903bc.m21505x().mo57934a(mo105655bv());
    }

    @C7709l
    public void onPrivateModelEvent(C28308ad adVar) {
        C28130ac aH = mo73346aH();
        if (aH != null) {
            aH.mo71525a(adVar);
        }
    }

    @C7709l
    public void onPushNotificationDialogShowed(C42704f fVar) {
        if (!fVar.f110990a && this.f75370ax != null) {
            this.f75370ax.mo104305a(0);
        }
    }

    @C7709l
    public void onRestrictEvent(C37619b bVar) {
        C28129ab aJ = mo73348aJ();
        if (aJ != null) {
            aJ.mo71640L();
        }
    }

    @C7709l
    public void onScrolledToProfileTab(C38244a aVar) {
        this.f75335aD = false;
        mo67599E();
        C32960dc.m106541i(true);
    }

    @C7709l
    public void tryResumePlayEvent(C28317am amVar) {
        if (amVar.f74630a == null) {
            mo67651u();
        } else {
            mo73402e(amVar.f74630a);
        }
    }

    /* renamed from: k */
    private static boolean m93952k(Aweme aweme) {
        if (aweme == null || aweme.getUserDigg() != 0 || !aweme.isCanPlay()) {
            return false;
        }
        return true;
    }

    /* renamed from: b_ */
    public void mo67620b_(String str) {
        C42961az.m136380a(new C28318an(2, str));
        if (mo71898ad()) {
            mo71895aa();
        }
    }

    /* renamed from: c */
    public final C6869c mo71891c(Aweme aweme) {
        int i;
        if (this.f75389t == null) {
            i = 0;
        } else {
            i = this.f75389t.getCurrentItem();
        }
        return C28483f.m93623a(aweme, this.f75327V, mo67652v(), i);
    }

    /* renamed from: c_ */
    public final void mo61747c_(int i) {
        mo73343aE();
        this.f75394y.mo71599e(i);
        mo73357aS();
        mo73399d(this.f75389t.getCurrentItem());
    }

    /* renamed from: f */
    public final void mo73406f(final Aweme aweme) {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                if (C28598b.this.f113033ay != null && !C28598b.this.f113033ay.isFinishing()) {
                    C28598b.this.f75326U.mo71983a(C28598b.this.f113033ay, aweme);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo73409g(boolean z) {
        this.f75349ac = z;
        this.f75355ai.mo95900c(z);
        C28130ac aH = mo73346aH();
        if (aH != null && aH.mo71564o() != null) {
            aH.mo71564o().mo64582e(z);
        }
    }

    /* renamed from: m */
    public void mo73418m(boolean z) {
        int i;
        this.f75368av = false;
        C28130ac aH = mo73346aH();
        if (aH != null) {
            if (z) {
                i = 4;
            } else {
                i = 5;
            }
            aH.mo71528b(i);
        }
    }

    @C7709l
    public void onAdFeedRefreshEvent(C24562c cVar) {
        C28130ac aH = mo73346aH();
        if (C28478a.m93590e(aH)) {
            Aweme h = aH.mo65711h();
            if (h != null && h.isAd()) {
                this.f75325T = true;
            }
        }
    }

    @C7709l
    public void onCleanModeChangedEvent(C32892a aVar) {
        boolean z = C32891b.m106468a().f85831a;
        for (int i = 0; i < this.f75389t.getChildCount(); i++) {
            C28130ac f = mo73404f(i);
            if (f != null) {
                f.mo71533d(z);
            }
        }
    }

    @C7709l
    public void onEvent(C24568i iVar) {
        if (iVar != null) {
            C28130ac aH = mo73346aH();
            if (!(aH == null || aH.mo71564o() == null)) {
                aH.mo71564o().mo64560a(iVar);
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        Aweme aj = mo71904aj();
        if (aj != null) {
            User author = aj.getAuthor();
            if (author != null) {
                author.setFollowStatus(followStatus.followStatus);
                C42961az.m136380a(new C23661d(followStatus.followStatus, author));
            }
        }
    }

    @C7709l
    public void onJump2PoiDetailEvent(C28337t tVar) {
        if (!this.f75359am) {
            C35076e.m113205a(mo105655bv(), mo71904aj(), tVar.f74665a, this.f75327V, mo73366ap());
        }
    }

    @C7709l
    public void onTabSwitched(C38245b bVar) {
        this.f75335aD = bVar.f99399a;
        if (!this.f75335aD && this.f75370ax != null) {
            this.f75370ax.mo104304a();
        }
        if (this.f75335aD && this.f75370ax != null) {
            this.f75370ax.mo104306b();
        }
    }

    @C7709l
    public void onVideoPlayerEvent(C39330h hVar) {
        int i = hVar.f102160c;
        if (i != 2) {
            if (i == 4) {
                m93919a(hVar);
            } else if (i == 7) {
                return;
            } else {
                return;
            }
            return;
        }
        this.f75347aa.mo69890I();
    }

    /* renamed from: b */
    private void mo67619b(boolean z) {
        this.f75351ae = z;
        this.f75355ai.mo95904e(z);
        if (z) {
            mo67599E();
            return;
        }
        if (this.f75370ax != null) {
            this.f75370ax.mo104307c();
        }
    }

    /* renamed from: c */
    private void mo67621c(boolean z) {
        this.f75350ad = z;
        this.f75355ai.mo95902d(z);
        if (!z && this.f75370ax != null) {
            this.f75370ax.mo104307c();
        }
        C28130ac aH = mo73346aH();
        if (aH != null && aH.mo71564o() != null) {
            aH.mo71564o().mo64584f(z);
        }
    }

    /* renamed from: j */
    private static boolean m93951j(Aweme aweme) {
        if (aweme == null || aweme.getUserDigg() != 0 || !aweme.isCanPlay() || aweme.getStatus() == null || aweme.getStatus().isDelete() || aweme.getStatus().getPrivateStatus() == 1 || C43168s.m136909a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m93953l(Aweme aweme) {
        if (!C43168s.m136909a(aweme) && mo105655bv() != null) {
            C28130ac g = mo67628g();
            if (g != null) {
                g.mo65714k();
            }
            C28130ac aH = mo73346aH();
            if (m93937bo() && aH != null) {
                aH.mo71530c(1);
            }
            this.f75328W.mo71927b(aweme);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo73400d(String str) {
        this.f75328W.mo71931f((String) null);
    }

    /* renamed from: f */
    public void mo67627f(boolean z) {
        super.mo67627f(z);
        if (z) {
            mo73392bm();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C28130ac mo73412i(boolean z) {
        int i;
        if (this.f75389t == null) {
            return null;
        }
        int childCount = this.f75389t.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C28130ac f = mo73404f(i2);
            if (z) {
                i = this.f75389t.getCurrentItem() - 1;
            } else {
                i = this.f75389t.getCurrentItem() + 1;
            }
            if (i < 0) {
                return null;
            }
            if (m93920a(i, f)) {
                return f;
            }
        }
        return null;
    }

    @C7709l
    public void initTopPageEvent(CardStruct cardStruct) {
        C28130ac aH = mo73346aH();
        if (aH != null && aH.mo71564o() != null && aH.mo71564o().mo64589k() != null) {
            aH.mo71564o().mo64589k().mo66321b();
        }
    }

    @C7709l
    public void onAwesomeSplashEvent(C25053a aVar) {
        this.f75361ao = aVar.f66130a;
        if (this.f75361ao == 2) {
            m93931bB();
        }
        if (this.f75361ao < 4) {
            DmtStatusView n = mo73419n(false);
            if (n != null && n.mo25945i()) {
                n.mo25939d();
            }
        }
        C24671f.m80854d().mo65568a(aVar.f66130a, this.f75312G, this.f75313H);
    }

    public void onFollowFail(final Exception exc) {
        if (mo73385bf()) {
            if (C6903bc.m21483b().mo61553a(exc)) {
                C6903bc.m21483b().mo61552a(mo73489bx(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: a */
                    public final void mo57592a() {
                        C28598b.this.f75318M.mo56975R_();
                    }

                    /* renamed from: b */
                    public final void mo57593b() {
                        C22814a.m75245a(C28598b.this.mo105655bv(), exc, R.string.b82);
                    }
                });
            } else {
                C22814a.m75245a(mo105655bv(), exc, R.string.b82);
            }
        }
    }

    @C7709l
    public void onNetStateChangeEvent(C25706a aVar) {
        if (C6900g.m21454b().mo16943d()) {
            C6921a.m21563c(3, f75305p, "onNetStateChangeEvent, Network available");
            if (this.f75374d == null || this.f75374d.f74354a != 3) {
                C6921a.m21563c(3, f75305p, "tryResumePlay from onNetStateChangeEvent");
                mo67651u();
            } else {
                C6921a.m21563c(3, f75305p, "do not resumePlay when paused");
            }
        }
    }

    @C7709l
    public void onReplayEvent(C25572q qVar) {
        Aweme aj = mo71904aj();
        if (qVar.f67350a && TextUtils.equals(qVar.f67351b, aj.getAid())) {
            C28130ac aH = mo73346aH();
            if (aH != null && aH.mo71564o() != null) {
                aH.mo71564o().mo64554a(mo105655bv(), aj);
            }
        }
    }

    @C7709l
    public void onResumePlayByUserEvent(C28310af afVar) {
        try {
            if (this.f75366at.equals(afVar.f74621a.getAid()) && VERSION.SDK_INT >= 24) {
                this.f75328W.mo71920a(afVar.f74621a, Math.toIntExact(afVar.f74622b));
            }
        } catch (ArithmeticException unused) {
        }
    }

    @C7709l
    public void onScrollToProfileGuideEvent(C26054a aVar) {
        if (this.f75320O != null && this.f75320O.mo72115d()) {
            this.f75320O.mo72111a();
            SharePrefCache.inst().getClickGuideShown().mo59871a(Boolean.valueOf(false));
        }
        boolean z = aVar.f68865a;
        C28398m.f74839a = z;
        if (z) {
            mo73364aZ();
        }
    }

    @C7709l
    public void onTabChangeEvent(C42711j jVar) {
        if (jVar.f111001b.equals("HOME")) {
            if (!(this.f75389t == null || this.f75389t.getChildCount() == 0)) {
                this.f75370ax.mo104306b();
            }
        } else if (this.f75370ax != null) {
            this.f75370ax.mo104304a();
        }
    }

    /* renamed from: a */
    private void mo67604a(View view) {
        this.f75388s = (LoadMoreFrameLayout) view.findViewById(R.id.bua);
        this.f75389t = (VerticalViewPager) view.findViewById(R.id.edp);
        this.f75390u = view.findViewById(R.id.dmr);
        this.f75391v = view.findViewById(R.id.ob);
        this.f75392w = (FeedSwipeRefreshLayout) view.findViewById(R.id.cr7);
        this.f75393x = (DiggLayout) view.findViewById(R.id.a8y);
        this.f75310E = view.findViewById(R.id.dm3);
        this.f75311F = view.findViewById(R.id.nu);
        this.f75312G = (ViewGroup) view.findViewById(R.id.dm4);
        this.f75313H = (ViewGroup) view.findViewById(R.id.nv);
    }

    /* renamed from: d */
    private void m93945d(View view) {
        if (!((Boolean) SharePrefCache.inst().getFollowGuideShown().mo59877d()).booleanValue()) {
            this.f75319N = new C10752a(this.f113033ay).mo25738b((int) R.string.b8_).mo25739b(false).mo25736a(false).mo25731a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo25734a((C10755d) new C10755d() {
                /* renamed from: a */
                public final void mo25744a() {
                    SharePrefCache.inst().getFollowGuideShown().mo59871a(Boolean.valueOf(true));
                    C32960dc.m106538f(true);
                }
            }).mo25737a();
        }
    }

    /* renamed from: b */
    public final void mo73377b(long j) {
        this.f75386q = j;
    }

    /* renamed from: e */
    public final void mo73401e(int i) {
        Aweme b = this.f75394y.mo67568b(i);
        if (!m93922a(mo105655bv(), b, C25329c.m83212a(b, this.f75394y.mo71593b(), i))) {
            mo73323a(i, b);
            C24671f.m80862l().mo65868c(b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo73408g(String str) {
        if ("on_ear_phone_unplug".equals(str)) {
            if (!C43316v.m137250H()) {
                if (C43316v.m137450K().mo104916o()) {
                    mo71897ac();
                    mo73353aO();
                    C32950d.m106524a("play", aw_(), mo71904aj());
                    return;
                }
                C32950d.m106524a("pause", aw_(), mo71904aj());
            } else if (C44933a.m141791a().mo107442b()) {
                mo71897ac();
                mo73353aO();
                C32950d.m106524a("play", aw_(), mo71904aj());
            } else {
                C32950d.m106524a("pause", aw_(), mo71904aj());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo73415j(boolean z) {
        boolean z2;
        if (C6384b.m19835a().mo15292a(PauseVideoWhenCommentingExperiment.class, true, "dmt_pause_video_when_commenting", C6384b.m19835a().mo15295d().dmt_pause_video_when_commenting, false) && this.f75348ab) {
            if (z) {
                if (this.f75328W.f74455i.f74354a == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f75385o = z2;
                mo73353aO();
            } else if (!this.f75385o) {
                C6921a.m21563c(4, f75305p, "resume play by comment dialog dismiss");
                mo67651u();
            }
        }
        if (!z) {
            this.f75348ab = false;
        }
    }

    /* renamed from: l */
    public final View mo73417l(boolean z) {
        if (this.f75317L == null && z && this.f75387r) {
            this.f75317L = new ImageView(mo105655bv());
            this.f75317L.setImageResource(R.drawable.aek);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f75388s.addView(this.f75317L, layoutParams);
            this.f75317L.setScaleX(2.5f);
            this.f75317L.setScaleY(2.5f);
            this.f75317L.setVisibility(8);
            this.f75317L.setAlpha(0.0f);
            this.f75317L.setOnClickListener(new C28623h(this));
        }
        return this.f75317L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final DmtStatusView mo73419n(boolean z) {
        if (ay_() != null) {
            Fragment ay_ = ay_();
            if (ay_ instanceof BaseFeedListFragment) {
                return ((BaseFeedListFragment) ay_).mo73771b(z);
            }
            if (ay_ instanceof C26215z) {
                return ((C26215z) ay_).mo67750l();
            }
            if (C7163a.m22363a()) {
                StringBuilder sb = new StringBuilder("wrong fragment type host BaseListFragmentPanel : ");
                sb.append(ay_.getClass().getSimpleName());
                throw new RuntimeException(sb.toString());
            }
        }
        return null;
    }

    @C7709l
    public void onEvent(C25547a aVar) {
        if (aVar != null) {
            C28130ac aH = mo73346aH();
            if (!(aH == null || aH.mo71564o() == null || aH.mo71564o().mo64589k() == null)) {
                switch (aVar.f67298c) {
                    case 1:
                        aH.mo71564o().mo64589k().mo66318a(aVar.f67297b, aVar.f67296a);
                        return;
                    case 2:
                        aH.mo71564o().mo64589k().mo66322b(aVar.f67297b, aVar.f67296a);
                        break;
                }
            }
        }
    }

    @C7709l
    public void onFeedAdClickCouponEvent(C24565f fVar) {
        Aweme aweme = fVar.f64803a;
        int i = fVar.f64804b;
        if (C25329c.m83204F(aweme) != null) {
            if (Arrays.asList(new Integer[]{Integer.valueOf(2), Integer.valueOf(6), Integer.valueOf(3), Integer.valueOf(17), Integer.valueOf(25), Integer.valueOf(8)}).contains(Integer.valueOf(i))) {
                C28130ac aH = mo73346aH();
                if (!(aH == null || aH.mo71564o() == null || aH.mo71564o().mo64589k() == null)) {
                    aH.mo71564o().mo64589k().mo66317a(i);
                }
            }
        }
    }

    @C7709l
    public void onFeedAdClickFormEvent(C24566g gVar) {
        Aweme aweme = gVar.f64805a;
        int i = gVar.f64806b;
        CardStruct w = C25329c.m83240w(aweme);
        if (w == null || w.getCardType() != 1) {
            C24671f.m80853c().mo64685a(this.f113033ay, aweme, mo73489bx(), i);
        } else if (i == 2) {
            C28130ac aH = mo73346aH();
            if (!(aH == null || aH.mo71564o() == null || aH.mo71564o().mo64589k() == null)) {
                aH.mo71564o().mo64589k().mo66325d();
            }
        }
    }

    /* renamed from: b */
    private void mo67616b(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f75394y != null) {
            Aweme b = this.f75394y.mo67568b(i);
            if (C25329c.m83221d(b) && b.getAwemeRawAd().getContextTrack() != null && !C6307b.m19566a((Collection<T>) b.getAwemeRawAd().getContextTrack().getUrlList())) {
                b.getAwemeRawAd().setContextTrackSent(true);
                Aweme b2 = this.f75394y.mo67568b(i - 1);
                Aweme b3 = this.f75394y.mo67568b(i + 1);
                if (b2 == null) {
                    str = "";
                } else {
                    str = b2.getShareUrl();
                }
                if (b3 == null) {
                    str2 = "";
                } else {
                    str2 = b3.getShareUrl();
                }
                if (TextUtils.isEmpty(str)) {
                    str3 = "";
                } else {
                    str3 = URLEncoder.encode(str);
                }
                if (TextUtils.isEmpty(str2)) {
                    str4 = "";
                } else {
                    str4 = URLEncoder.encode(str2);
                }
                LinkedList linkedList = new LinkedList();
                for (String str5 : b.getAwemeRawAd().getContextTrack().getUrlList()) {
                    if (!TextUtils.isEmpty(str5)) {
                        String replace = str5.replace("__PCONTENT__", str3).replace("__NCONTENT__", str4);
                        String str6 = "";
                        try {
                            str6 = mo71881R();
                        } catch (JSONException unused) {
                        }
                        linkedList.add(Uri.parse(replace).buildUpon().appendQueryParameter("platform", "android").appendQueryParameter("req_id", str6).toString());
                    }
                }
                C24671f.m80851a().mo64666a((C24939aj) null, (Collection<String>) linkedList, false);
            }
        }
    }

    /* renamed from: c */
    public final C28130ac mo71907c(String str) {
        if (this.f75389t == null) {
            return null;
        }
        int childCount = this.f75389t.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C28130ac acVar = (C28130ac) this.f75389t.getChildAt(i).getTag(R.id.aje);
            if (acVar != null && acVar.mo71542A() != null && C6319n.m19594a(acVar.mo71542A().getAid(), str)) {
                return acVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo73399d(int i) {
        C28130ac acVar = null;
        if (this.f75389t != null) {
            int childCount = this.f75389t.getChildCount();
            C28130ac acVar2 = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                C28130ac acVar3 = (C28130ac) this.f75389t.getChildAt(i2).getTag(R.id.aje);
                if (m93920a(i, acVar3)) {
                    acVar2 = acVar3;
                }
            }
            acVar = acVar2;
        }
        if (acVar != null) {
            C25344d.m83278a(acVar.mo65711h());
        }
        if (acVar != this.f75383m) {
            if (this.f75383m != null) {
                this.f75383m.mo67769c(m93935bF());
            }
            mo73343aE();
            if (acVar != null) {
                acVar.mo65707a(i);
            }
            this.f75383m = acVar;
            if (this.f75394y != null) {
                C25329c.m83213a(this.f75394y.mo67568b(i), false);
            }
        }
        this.f75384n = i;
        mo73344aF();
    }

    /* renamed from: e */
    public final void mo73403e(final String str) {
        if (this.f75306A != null) {
            Message obtain = Message.obtain(this.f75306A, new Runnable() {
                public final void run() {
                    if (C28598b.this.f75306A != null) {
                        C28598b.this.f75306A.removeMessages(10);
                    }
                    C28130ac ai = C28598b.this.mo71903ai();
                    if (ai != null && ai.mo65711h() != null && TextUtils.equals(ai.mo65711h().getAid(), str) && ai.mo65711h().isLive() && C28598b.this.mo73385bf()) {
                        Aweme h = ai.mo65711h();
                        C41989d.m133473a(C28598b.this.mo105655bv(), C28598b.this.mo71883T().optString("request_id"), h.getAuthor().getUid(), h.getAuthor().roomId, false);
                    }
                }
            });
            obtain.what = 10;
            this.f75306A.sendMessageDelayed(obtain, 60000);
        }
    }

    /* renamed from: g */
    public final void mo73407g(Aweme aweme) {
        if (aweme == null) {
            C24033a.m78868b("AWEME == NULL");
            return;
        }
        if (this.f75326U.mo71837d() == null) {
            C24033a.m78868b("ACTIVITY == NULL");
        } else if (this.f75326U.mo71837d().isFinishing()) {
            return;
        }
        List arrayList = new ArrayList();
        if (RelationLabelHelper.hasDuoShanLabel(aweme) || !RelationLabelHelper.hasCommentId(aweme)) {
            arrayList = aweme.getOriginCommentIds();
        } else {
            arrayList.add(aweme.getFeedRelationLabel().getExtra().getCid());
        }
        C28130ac ai = mo71903ai();
        C28201af afVar = null;
        if (ai != null) {
            afVar = ai.mo71518F();
        }
        C24202a d = new C24202a(C28482e.m93610c(aweme)).mo62902a(arrayList).mo62900a(afVar).mo62905b(mo71885V()).mo62912e(this.f75327V.getObjectId()).mo62914f(this.f75327V.getCardType()).mo62916g(this.f75327V.getCreationId()).mo62909c(this.f75382l).mo62910d(mo71875L());
        mo67606a(d, aweme);
        this.f75326U.mo62620a(d.mo62904a());
        this.f75382l = false;
    }

    public void handleMsg(Message message) {
        if (message.what == 0) {
            C6921a.m21552a(3, "BaseListFragmentPanel", "try resume play or try pause play for tap");
            if (this.f75394y == null || this.f75389t == null) {
                C6921a.m21554a((Exception) new IllegalStateException("adapter or viewpager is null,maybe is bug,please contact liuyiming.777"));
            } else {
                Aweme b = this.f75394y.mo67568b(this.f75389t.getCurrentItem());
                if (C28482e.m93611d(b)) {
                    C6921a.m21552a(3, "BaseListFragmentPanel", "tap for image aweme!");
                    mo67649s();
                } else if (C25072c.m82577c(b)) {
                    C6921a.m21552a(3, "BaseListFragmentPanel", "tap for live aweme!");
                    C28130ac ai = mo71903ai();
                    if (ai instanceof VideoViewHolder) {
                        DataCenter dataCenter = ((VideoViewHolder) ai).f74252h;
                        if (dataCenter != null) {
                            dataCenter.mo60134a("live_video_click", (Object) Boolean.valueOf(true));
                        }
                    } else {
                        C28509x.m93714a(b);
                        C6921a.m21552a(6, "BaseListFragmentPanel", "not rsp because isn't vvh,maybe it's bug!");
                    }
                    C28498o.m93659a(mo105655bv(), b);
                } else {
                    C6921a.m21552a(3, "BaseListFragmentPanel", "tap for video aweme!");
                    if (b == null || TextUtils.isEmpty(b.getAid())) {
                        C28509x.m93714a(b);
                        C6921a.m21554a((Exception) new IllegalStateException("aid is empty,maybe is bug,please contact liuyiming.777"));
                    } else {
                        C6907h.m21518a(mo105655bv(), "click", "video", b.getAid(), 0);
                        mo73410h(b);
                    }
                }
                C28129ab aJ = mo73348aJ();
                if (aJ != null) {
                    aJ.mo71645Q();
                }
            }
        }
    }

    @C7709l
    public void onEvent(C25548b bVar) {
        int i;
        if (bVar != null) {
            Context bv = mo105655bv();
            if (bv != null && bVar.f67303e == bv.hashCode()) {
                C43222g gVar = this.f75338aG;
                if (gVar != null) {
                    Aweme aj = mo71904aj();
                    if (C25329c.m83202D(aj)) {
                        i = C25329c.m83240w(aj).getShowSeconds();
                    } else if (C25329c.m83201C(aj)) {
                        i = aj.getAwemeRawAd().getShowButtonSeconds();
                    } else {
                        i = 0;
                    }
                    if (C28418f.m93413a().f74938h && bVar.f67299a == 1 && (gVar.mo104910i() * ((long) C28418f.m93413a().f74936f)) + gVar.mo104915n() >= ((long) (i * 1000))) {
                        C28130ac aH = mo73346aH();
                        if (!(aH == null || aH.mo71564o() == null)) {
                            aH.mo71564o().mo64552a(0, "active_show");
                        }
                    }
                }
            }
        }
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
        boolean z;
        if (mo73385bf() && anVar != null) {
            if (anVar.f74631a == 36) {
                mo67648r();
            } else if (anVar.f74631a == 14 || anVar.f74631a == 13 || anVar.f74631a == 2) {
                String str = (String) anVar.f74632b;
                if (anVar.f74631a == 2 && this.f75315J != null) {
                    this.f75315J.mo67740a(str);
                }
                int childCount = this.f75389t.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C28130ac acVar = (C28130ac) this.f75389t.getChildAt(i).getTag(R.id.aje);
                    if (acVar != null && !m93929b(acVar) && acVar.mo65711h() != null && C6319n.m19594a(acVar.mo65711h().getAid(), str) && anVar.f74631a == 13) {
                        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
                        if (awemeById != null) {
                            if (awemeById.getUserDigg() != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (awemeById.isAd() && awemeById.getActivityPendant() == null) {
                                Aweme aweme = new Aweme();
                                aweme.update(awemeById);
                                aweme.setAd(false);
                                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                            }
                            C42961az.m136380a(new C28342y(z, awemeById.getAid()));
                            if (acVar.mo71564o() != null) {
                                acVar.mo71564o().mo64579d(z);
                            }
                        }
                    }
                }
            }
        }
    }

    @C7709l
    public void onVoteEvent(C40717a aVar) {
        if (this.f75394y != null && !C6307b.m19566a((Collection<T>) this.f75394y.mo71593b())) {
            C28130ac aH = mo73346aH();
            if (!(aH == null || aH.mo65711h() == null || !TextUtils.equals(aH.mo65711h().getAid(), aVar.f105853a) || aH.mo65711h().getInteractStickerStructs() == null)) {
                for (InteractStickerStruct voteStruct : aH.mo65711h().getInteractStickerStructs()) {
                    VoteStruct voteStruct2 = voteStruct.getVoteStruct();
                    if (!(voteStruct2 == null || voteStruct2.getOptions() == null)) {
                        for (OptionsBean optionId : voteStruct2.getOptions()) {
                            if (optionId.getOptionId() == aVar.f105854b) {
                                voteStruct2.setSelectOptionId(aVar.f105854b);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m93917a(FollowStatus followStatus) {
        if (mo73385bf()) {
            this.f75394y.mo71588a(followStatus);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo69893b(View view) {
        if (m93930bA()) {
        }
    }

    /* renamed from: a */
    private void m93918a(User user) {
        if (TextUtils.equals(aw_(), "homepage_hot")) {
            C6903bc.m21468I().mo84735a(user);
            C42961az.m136380a(new C28336s(aw_()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo67617b(Aweme aweme) {
        m93946d(aweme, true);
    }

    /* renamed from: d */
    private void m93946d(Aweme aweme, boolean z) {
        mo73332a(aweme, true, (C28130ac) null);
    }

    /* renamed from: c */
    private void m93942c(Aweme aweme, boolean z) {
        if (z) {
            mo71884U();
        }
        m93953l(aweme);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m93911a(Aweme aweme, C28129ab abVar) throws Exception {
        try {
            Aweme a = DetailApi.m85567a(aweme.getAid(), "");
            if (a == null) {
                return null;
            }
            abVar.mo71694e(a);
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private boolean m93949e(Aweme aweme, boolean z) {
        boolean z2;
        String str = "";
        if (this.f75326U != null) {
            str = this.f75326U.mo71843n();
        }
        C29974c w = C6903bc.m21504w();
        if (C25329c.m83231n(aweme) || C25072c.m82575a(aweme)) {
            z2 = true;
        } else {
            z2 = false;
        }
        w.mo76169a(z2, str);
        return true;
    }

    public C28598b(String str, int i) {
        this.f75332a = 1.0E-10f;
        this.f75377g = 1;
        this.f75323R = "";
        this.f75378h = new Runnable() {
            public final void run() {
                C28598b.this.mo73358aT();
            }
        };
        this.f75379i = new Runnable() {
            public final void run() {
                C28598b.this.mo73359aU();
            }
        };
        this.f75325T = false;
        this.f75327V = new FeedParam();
        this.f75330Y = true;
        this.f75347aa = C28385a.f74832a;
        this.f75348ab = false;
        this.f75349ac = false;
        this.f75350ad = false;
        this.f75351ae = false;
        this.f75352af = false;
        this.f75353ag = false;
        this.f75354ah = false;
        this.f75356aj = false;
        this.f75357ak = null;
        this.f75383m = null;
        this.f75384n = -1;
        this.f75385o = false;
        this.f75334aB = false;
        this.f75335aD = true;
        this.f75336aE = 0;
        this.f75358al = false;
        this.f75359am = false;
        this.f75361ao = 4;
        this.f75362ap = false;
        this.f75339aH = "";
        this.f75340aI = 0;
        this.f75341aJ = new C28522g();
        this.f75363aq = 0;
        this.f75364ar = false;
        this.f75365as = new C25752e() {
            /* renamed from: a */
            public final void mo66812a() {
                C32960dc.m106529a();
                C32960dc.m106536d(false);
            }
        };
        this.f75367au = 29000;
        this.f75368av = true;
        this.f75343aL = null;
        this.f75344aM = new ArrayList();
        this.f75345aN = "home_swipe_up_lottie_android.json";
        this.f75369aw = null;
        this.f75327V.setEventType(str);
        this.f75327V.setPageType(i);
        this.f75326U = C28677a.m94349c().mo73479a(str, i, this, this);
        this.f75381k = new C24551b(str, i);
        this.f75328W = new C28256q(str, i, this);
        this.f75329X = new C28241b();
        this.f75329X.mo71855a((C28231a) this.f75326U);
        this.f75329X.mo71855a((C28231a) this.f75381k);
        this.f75329X.mo71855a((C28231a) this.f75328W);
        C43238k.m137171a(m93924b());
        C6903bc.m21494m().mo18735a((C7217x) this);
        this.f75375e = C32960dc.m106539g(false);
        try {
            int intValue = C30199h.m98861a().getBackgroundPausePlayerSetting().intValue();
            if (intValue != 0) {
                this.f75337aF = C28677a.m94349c().mo73481a(this, intValue);
            }
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
    }

    /* renamed from: a */
    private static void m93914a(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height != i) {
                layoutParams.height = i;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    private void m93916a(C28130ac acVar, int i) {
        if (mo73488bw()) {
            acVar.mo71528b(2);
        }
    }

    /* renamed from: b */
    private void m93927b(Aweme aweme, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("author_id", aweme.getAuthorUid());
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("enter_from", aw_());
            jSONObject.put("impr_type", C33230ac.m107245t(aweme));
            jSONObject.put("compilation_id", aweme.getMixId());
            jSONObject.put("request_id", mo71883T().optString("request_id"));
            jSONObject.put("enter_type", "normal_way");
            if (!"homepage_hot".equals(aw_())) {
                jSONObject.put("previous_page", mo73390bk());
            }
            jSONObject.put("request_id", C33230ac.m107206a(aweme, mo71888Y()));
            if (!TextUtils.isEmpty(C33230ac.m107223e(aweme))) {
                jSONObject.put("poi_id", C33230ac.m107223e(aweme));
            }
            if (C33230ac.m107220c(aw_())) {
                jSONObject.put("poi_type", C33230ac.m107229h(aweme));
                jSONObject.put("poi_channel", C33230ac.m107214b());
                jSONObject.put("city_info", C33230ac.m107204a());
                jSONObject.put("distance_info", C33230ac.m107231i(aweme));
            }
            jSONObject.put("is_photo", C33230ac.m107239n(aweme));
        } catch (JSONException unused) {
        }
        C6907h.m21521a(mo105655bv(), "follow", aw_(), str, C33230ac.m107238m(aweme), jSONObject);
        if (C6399b.m19944t()) {
            if (z) {
                mo69892a(aweme, str);
            } else {
                C33281w a = new C33281w().mo85360a(mo64928a(true));
                if (TextUtils.isEmpty(mo71875L())) {
                    str6 = aw_();
                } else {
                    str6 = mo71875L();
                }
                C33281w c = a.mo85363c(str6);
                if (TextUtils.isEmpty(mo71875L())) {
                    str7 = "follow_button";
                } else {
                    str7 = mo73388bi();
                }
                c.mo85364d(str7).mo85361b("follow_button").mo85365e(str).mo85362c(aweme, mo71888Y()).mo85252e();
            }
        } else if (z) {
            C33280v b = new C33280v().mo85341b(aw_());
            if (TextUtils.isEmpty(mo71875L())) {
                str4 = aw_();
            } else {
                str4 = mo71875L();
            }
            C33280v e = b.mo85345e(str4);
            if (TextUtils.isEmpty(mo71875L())) {
                str5 = "follow_button";
            } else {
                str5 = mo73388bi();
            }
            e.mo85347f(str5).mo85343c("follow_button").mo85342c(aweme, mo71888Y()).mo85252e();
        } else {
            C33281w a2 = new C33281w().mo85360a(aw_());
            if (TextUtils.isEmpty(mo71875L())) {
                str2 = aw_();
            } else {
                str2 = mo71875L();
            }
            C33281w c2 = a2.mo85363c(str2);
            if (TextUtils.isEmpty(mo71875L())) {
                str3 = "follow_button";
            } else {
                str3 = mo73388bi();
            }
            c2.mo85364d(str3).mo85361b("follow_button").mo85362c(aweme, mo71888Y()).mo85252e();
        }
        if (z && TextUtils.equals(aw_(), "search_result")) {
            C6903bc.m21463D().mo68584a("search_follow", str, "search_video", true, "");
        }
    }
}
