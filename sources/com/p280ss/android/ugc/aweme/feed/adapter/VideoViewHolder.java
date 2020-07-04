package com.p280ss.android.ugc.aweme.feed.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.transition.C0476c;
import android.support.transition.C0508m;
import android.support.transition.C0516o;
import android.support.transition.C0520q;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bolts.C1592h;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.apm.C6159b;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6308d;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.base.C10749d;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10753b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10804a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.ImagePiplinePriority;
import com.bytedance.lighten.core.p612c.C12112j;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.facebook.imagepipeline.common.Priority;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C21098ab;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.C22558b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.audio.C23102f;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.PoiCardWebPageContainer;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout.C23440a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24030b;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24706aa;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24716aj;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24717ak;
import com.p280ss.android.ugc.aweme.commercialize.model.DouplusToastStruct;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25053a;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25212aa;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25383w;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.hotspot.feed.HotSpotFeedMaskViewHolder;
import com.p280ss.android.ugc.aweme.discover.hotspot.p1179a.C26690a;
import com.p280ss.android.ugc.aweme.discover.hotspot.p1179a.C26692b;
import com.p280ss.android.ugc.aweme.experiment.C27690d;
import com.p280ss.android.ugc.aweme.experiment.RelationLabelClickEnterExperiment;
import com.p280ss.android.ugc.aweme.experiment.ShrinkVideoWhenCommentShowExperiment;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p280ss.android.ugc.aweme.experiment.UserAntiAddictionExperiment;
import com.p280ss.android.ugc.aweme.experiment.VerificationExperiment;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21718a;
import com.p280ss.android.ugc.aweme.feed.C28066ac;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28201af;
import com.p280ss.android.ugc.aweme.feed.C28207ak;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.event.C28306ab;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.event.C28311ag;
import com.p280ss.android.ugc.aweme.feed.event.C28312ah;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28320c;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.event.C28325h;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.experiment.AllVideoShowVSExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.AwesomeSplashEventSendExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.experiment.C28346c;
import com.p280ss.android.ugc.aweme.feed.experiment.DDislikeStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.feedwidget.AbsVSViewWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.RecommendDislikeBarWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VPAInfoBarWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VPAOptedOutMaskWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoAntiAddictionWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDescWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoLiveButtonWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoLiveCommentWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoLiveLivingWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoLiveTrayWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoMusicCoverWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoMusicTitleWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoPlayCountWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoPostTimeWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoReviewStatusWidget;
import com.p280ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.helper.C28416d;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.helper.C28422j;
import com.p280ss.android.ugc.aweme.feed.helper.C28428o;
import com.p280ss.android.ugc.aweme.feed.listener.C28523h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.p280ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28242c;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28254o;
import com.p280ss.android.ugc.aweme.feed.p1231g.C28355a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28480c;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28495n;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28495n.C28497a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28498o;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28502r;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28510y;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28768aa;
import com.p280ss.android.ugc.aweme.feed.p1238ui.DebugInfoView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LongPressLayout;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LongPressLayout.C28748a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.C28916a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.VideoViewLandscapeHelper;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;
import com.p280ss.android.ugc.aweme.feed.share.C28682a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.homepage.api.p1290ui.HomePageUIFrameService;
import com.p280ss.android.ugc.aweme.legoImp.inflate.C32346e;
import com.p280ss.android.ugc.aweme.legoImp.task.PosterSRProcessorInitTask;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.main.C32891b;
import com.p280ss.android.ugc.aweme.main.CleanModeManager2;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33275q;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.p1493q.C36993a;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34970f;
import com.p280ss.android.ugc.aweme.poi.model.PoiCardStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.poi.widget.PoiRankVideoWidget;
import com.p280ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p280ss.android.ugc.aweme.profile.C35817i;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.report.C37190a;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.setting.p337ui.RestrictTextView;
import com.p280ss.android.ugc.aweme.share.C38248p;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40726a.C40727a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1608a.C40711a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40724f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p280ss.android.ugc.aweme.splash.C41738c;
import com.p280ss.android.ugc.aweme.sticker.C41849d;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41841a;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41842b;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41844c;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import com.p280ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.C43166q;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43310q;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.p1701e.C43214a;
import com.p280ss.android.ugc.aweme.video.p1701e.C43216b;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import com.p280ss.android.ugc.playerkit.videoview.C44961g;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder */
public class VideoViewHolder extends C28155b implements C28128aa, C28129ab, C28768aa, C40724f, C44960f, C44963i {

    /* renamed from: U */
    private static WeakHashMap<Context, C6308d<SurfaceView>> f74085U = new WeakHashMap<>();

    /* renamed from: V */
    private static WeakHashMap<Context, C6308d<VideoViewHolder>> f74086V = new WeakHashMap<>();

    /* renamed from: A */
    private int f74087A;

    /* renamed from: B */
    private VideoViewComponent f74088B;

    /* renamed from: C */
    private C10751a f74089C;

    /* renamed from: D */
    private C35481c f74090D;

    /* renamed from: E */
    private Runnable f74091E;

    /* renamed from: F */
    private final C28343z<C28318an> f74092F;

    /* renamed from: G */
    private boolean f74093G;

    /* renamed from: H */
    private boolean f74094H;

    /* renamed from: I */
    private boolean f74095I;

    /* renamed from: J */
    private Runnable f74096J;

    /* renamed from: K */
    private boolean f74097K;

    /* renamed from: L */
    private final C24716aj f74098L;

    /* renamed from: M */
    private final C24717ak f74099M;

    /* renamed from: N */
    private C43216b f74100N;

    /* renamed from: O */
    private boolean f74101O = false;

    /* renamed from: P */
    private C28114a f74102P;

    /* renamed from: Q */
    private int f74103Q = 4;

    /* renamed from: R */
    private AbsInteractStickerWidget f74104R;

    /* renamed from: S */
    private VideoViewLandscapeHelper f74105S;

    /* renamed from: T */
    private C21098ab f74106T = null;

    /* renamed from: W */
    private final BaseFeedPageParams f74107W;

    /* renamed from: X */
    private final int f74108X;

    /* renamed from: Y */
    private HotSpotFeedMaskViewHolder f74109Y;

    /* renamed from: Z */
    private VideoMusicTitleWidget f74110Z;

    /* renamed from: a */
    public int f74111a;

    /* renamed from: aa */
    private VideoMusicCoverWidget f74112aa;

    /* renamed from: ab */
    private AbsVSViewWidget f74113ab;

    /* renamed from: ac */
    private int f74114ac;

    /* renamed from: ad */
    private int f74115ad;
    LinearLayout adFeeDeductionLayout;

    /* renamed from: ae */
    private boolean f74116ae = C6384b.m19835a().mo15292a(ShrinkVideoWhenCommentShowExperiment.class, true, "enable_comment_video_shrink", C6384b.m19835a().mo15295d().enable_comment_video_shrink, false);

    /* renamed from: af */
    private int f74117af;

    /* renamed from: ag */
    private final VideoItemParams f74118ag;

    /* renamed from: ah */
    private boolean f74119ah = false;

    /* renamed from: ai */
    private String f74120ai = "";

    /* renamed from: aj */
    private DmtTextView f74121aj;

    /* renamed from: ak */
    private DmtTextView f74122ak;

    /* renamed from: al */
    private boolean f74123al = false;

    /* renamed from: am */
    private C0053p<FollowStatus> f74124am = new C0053p<FollowStatus>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(FollowStatus followStatus) {
            if (!(C6399b.m19944t() || VideoViewHolder.this.tagLayout == null || VideoViewHolder.this.f74130g == null || VideoViewHolder.this.f74130g.getAuthor() == null || followStatus == null || !TextUtils.equals(VideoViewHolder.this.f74130g.getAuthor().getUid(), followStatus.userId) || followStatus.followStatus != 0 || VideoViewHolder.this.f74130g.getRelationLabel() == null || VideoViewHolder.this.f74130g.getRelationLabel().getType() != 0)) {
                VideoViewHolder.this.mo71637I();
            }
        }
    };

    /* renamed from: b */
    public int f74125b;

    /* renamed from: c */
    public int f74126c;
    FrameLayout commerceGoodHalfCardContainer;
    FrameLayout commerceTagFrameLayout;

    /* renamed from: d */
    protected C44961g f74127d;

    /* renamed from: e */
    protected long f74128e;

    /* renamed from: f */
    public final Context f74129f;
    LinearLayout feedReportVotell;
    LinearLayout feedReportWarnll;
    FrameLayout flInteractLayout;

    /* renamed from: g */
    protected Aweme f74130g;

    /* renamed from: k */
    public JSONObject f74131k;

    /* renamed from: l */
    protected final Fragment f74132l;
    ViewGroup llAwemeIntro;
    LinearLayout llRightMenu;

    /* renamed from: m */
    protected int f74133m;
    DmtTextView mAllowDisplayBtn;
    View mAvatarLayout;
    ViewGroup mAwemeInCheckIsPreviewLayout;
    ViewGroup mAwemeInCheckLayout;
    FrameLayout mBottomView;
    ImageView mCornerBL;
    ImageView mCornerBR;
    ImageView mCornerTL;
    ImageView mCornerTR;
    SmartImageView mCoverView;
    DebugInfoView mDebugInfoView;
    DmtTextView mDisallowDisplayBtn;
    TextView mDislikeSomeoneTv;
    ViewStub mFullFeedStub;
    View mGradualBottomView;
    FrameLayout mHudView;
    AnimationImageView mIvRelieveTag;
    LongPressLayout mLongPressLayout;
    DmtTextView mPoiDistance;
    View mPoiDistanceLayout;
    PoiRankVideoWidget mPoiRankWidget;
    ViewGroup mPoiRatingContainer;
    DmtTextView mRateText;
    RatingBar mRatingBar;
    RestrictTextView mRestrictTextView;
    FrameLayout mRootView;
    ImageView mShareTipImageView;
    TextView mTitleView;
    DmtTextView mTxtProhibited;
    ViewGroup mVideoTagContainer;
    DmtTextView mVoteStatusTextView;
    RelativeLayout mWidgetContainer;
    RemoteImageView mXiguaTaskEveningIv;
    TextView mlandscapeTipTv;

    /* renamed from: n */
    public final C28242c f74134n;

    /* renamed from: o */
    public C28412a f74135o = new C28412a();

    /* renamed from: p */
    public SparseArray<Integer> f74136p;
    PoiCardWebPageContainer poiCardWebPageContainer;

    /* renamed from: q */
    public boolean f74137q;

    /* renamed from: r */
    protected boolean f74138r;

    /* renamed from: s */
    public AnimatorSet f74139s;
    View shareTipsRl;
    DmtTextView shareTipsTv;

    /* renamed from: t */
    protected boolean f74140t = true;
    TagLayout tagLayout;
    DmtTextView txtTTFeedback;

    /* renamed from: u */
    public C28254o f74141u;

    /* renamed from: v */
    protected WidgetManager f74142v;

    /* renamed from: w */
    public boolean f74143w = false;

    /* renamed from: x */
    C28140al f74144x;

    /* renamed from: y */
    boolean f74145y = false;

    /* renamed from: z */
    public View f74146z;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$a */
    class C28114a implements Runnable {

        /* renamed from: a */
        public boolean f74163a;

        /* renamed from: c */
        private final Aweme f74165c;

        /* renamed from: a */
        public final void mo71718a() {
            this.f74163a = true;
        }

        public final void run() {
            if (C25072c.m82575a(this.f74165c)) {
                C25072c.m82580f(this.f74165c);
            } else {
                C25329c.m83238u(this.f74165c);
            }
            if (!this.f74163a && TextUtils.equals(this.f74165c.getAid(), VideoViewHolder.this.f74130g.getAid()) && VideoViewHolder.this.f74137q) {
                VideoViewHolder.this.mo71697g(3);
                VideoViewHolder.this.mo71533d(false);
                VideoViewHolder.this.mWidgetContainer.setAlpha(0.0f);
                VideoViewHolder.this.f74139s.start();
            }
        }

        C28114a(Aweme aweme) {
            this.f74165c = aweme;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$b */
    class C28115b implements Callable {

        /* renamed from: a */
        WeakReference<View> f74166a;

        /* renamed from: b */
        WeakReference<View> f74167b;

        public final Object call() throws Exception {
            int i = 0;
            if (C21085a.m71129c()) {
                if (C21085a.m71117a().f56624k) {
                    i = 0 + VideoViewHolder.this.f74126c;
                }
                if (C21085a.m71117a().f56616c != 0 && C21085a.m71125a((Activity) VideoViewHolder.this.f74132l.getActivity())) {
                    i += C21085a.m71117a().f56616c;
                }
            } else if (C21085a.m71117a().f56616c != 0 && C21085a.m71125a((Activity) VideoViewHolder.this.f74132l.getActivity())) {
                i = 0 + C21085a.m71117a().f56616c;
            }
            if (VideoViewHolder.this.f74135o.f74868c < VideoViewHolder.this.f74125b - i || VideoViewHolder.this.f74135o.f74869d < VideoViewHolder.this.f74111a) {
                ((View) this.f74166a.get()).setBackgroundColor(VideoViewHolder.this.f74129f.getResources().getColor(R.color.l3));
            } else {
                ((View) this.f74166a.get()).setBackground(null);
                ((View) this.f74167b.get()).setBackground(null);
            }
            return null;
        }

        C28115b(View view, View view2) {
            this.f74166a = new WeakReference<>(view);
            this.f74167b = new WeakReference<>(view2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$c */
    class C28116c implements C41841a {
        /* renamed from: a */
        public final void mo71721a(int i, MotionEvent motionEvent) {
        }

        /* renamed from: a */
        public final void mo71723a(int i, boolean z) {
        }

        private C28116c() {
        }

        /* renamed from: a */
        public final void mo71722a(int i, View view, float f, float f2, InteractStickerStruct interactStickerStruct, boolean z) {
            if ((!z || VideoViewHolder.m92016S()) && VideoViewHolder.this.f74141u != null) {
                VideoViewHolder.this.f74141u.mo71909a(VideoViewHolder.this.f74130g, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$d */
    class C28117d implements C41844c {

        /* renamed from: b */
        private boolean f74171b;

        /* renamed from: a */
        public final void mo71725a(boolean z) {
        }

        /* renamed from: a */
        public final void mo71724a() {
            if (!VideoViewHolder.m92016S() && VideoViewHolder.this.f74141u != null) {
                VideoViewHolder.this.f74141u.mo71909a(VideoViewHolder.this.f74130g, true);
            }
        }

        /* renamed from: b */
        public final void mo71726b() {
            this.f74171b = false;
            if (VideoViewHolder.m92016S() && VideoViewHolder.this.f74141u != null) {
                this.f74171b = true;
                VideoViewHolder.this.f74141u.mo71909a(VideoViewHolder.this.f74130g, false);
            }
        }

        /* renamed from: c */
        public final void mo71727c() {
            if (this.f74171b && VideoViewHolder.this.f74141u != null) {
                VideoViewHolder.this.f74141u.mo71909a(VideoViewHolder.this.f74130g, false);
            }
        }

        private C28117d() {
        }
    }

    /* renamed from: B */
    public final boolean mo71517B() {
        return this.f74093G;
    }

    /* renamed from: T */
    public final Context mo71647T() {
        return this.f74129f;
    }

    /* access modifiers changed from: protected */
    public boolean aB_() {
        return false;
    }

    /* renamed from: b */
    public final C44960f mo71553b() {
        return this;
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
    }

    /* renamed from: b */
    public final void mo63039b(int i, int i2) {
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo71693d(Aweme aweme) {
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
    }

    /* renamed from: g */
    public final int mo65710g() {
        return 0;
    }

    /* renamed from: h */
    public final Aweme mo65711h() {
        return this.f74130g;
    }

    /* renamed from: m */
    public final C28128aa mo65716m() {
        return this;
    }

    /* renamed from: n */
    public final int mo71563n() {
        return 1;
    }

    /* renamed from: o */
    public final C24716aj mo71564o() {
        return this.f74098L;
    }

    /* renamed from: q */
    public final C28129ab mo71566q() {
        return this;
    }

    /* renamed from: w */
    public final void mo71572w() {
        m92067bc();
    }

    /* renamed from: z */
    public final C43216b mo71575z() {
        return this.f74100N;
    }

    /* renamed from: a */
    public final void mo71668a(String str, String str2, String str3, String str4) {
        this.f74252h.mo60134a("playlist_id", (Object) str3);
        this.f74252h.mo60134a("playlist_type", (Object) str);
        this.f74252h.mo60134a("playlist_id_key", (Object) str2);
        this.f74252h.mo60134a("tab_name", (Object) str4);
    }

    /* renamed from: a */
    public final void mo71657a(OnTouchListener onTouchListener) {
        if (this.mTitleView != null) {
            this.mTitleView.setOnTouchListener(onTouchListener);
        }
    }

    /* renamed from: a */
    public final void mo71654a(float f, float f2) {
        float f3 = ((float) this.f74117af) + f;
        float f4 = f2 + ((float) this.f74117af);
        if (f > 120.0f && !C32891b.m106468a().f85831a) {
            ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(false);
            C32891b.m106468a().mo84616a(true);
        } else if (f <= 120.0f && C32891b.m106468a().f85831a) {
            ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(true);
            C32891b.m106468a().mo84616a(false);
        }
        float f5 = 0.0f;
        if (f3 >= 0.0f) {
            f5 = f3;
        }
        if (this.mCoverView != null && this.mCoverView.getVisibility() == 0) {
            C28510y.m93717a(this.mRootView.getContext(), this.mRootView, this.mCoverView, f5, f4, this.f74114ac, this.f74115ad);
        }
        C28510y.m93717a(this.mRootView.getContext(), this.mRootView, this.f74127d.mo107454a(), f5, f4, this.f74114ac, this.f74115ad);
    }

    /* renamed from: a */
    public void mo65708a(Aweme aweme) {
        if (aweme != null) {
            if (this.f74100N != null) {
                this.f74100N.mo104878b();
            }
            boolean z = true;
            if (this.f74116ae) {
                C28510y.m93718a(this.f74127d.mo107454a());
                C28510y.m93718a((View) this.mCoverView);
                if (C32891b.m106468a().f85831a) {
                    ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(true);
                    C32891b.m106468a().mo84616a(false);
                }
            }
            if (this.f74105S != null) {
                this.f74105S.mo74178a(aweme);
            }
            StringBuilder sb = new StringBuilder("VideoViewHolder.bind() called with: aweme id = ");
            sb.append(aweme.getAid());
            sb.append(", position = ");
            sb.append(this.f74133m);
            sb.append(", is ad = ");
            sb.append(aweme.isAd());
            sb.append(", adId = ");
            sb.append(C28478a.m93585b(aweme));
            C6921a.m21563c(3, "VideoViewHolder", sb.toString());
            if (!m92058ax()) {
                this.f74127d.mo107455a((C44963i) this);
            }
            m92103i(aweme);
            this.f74098L.mo64563a(aweme);
            this.f74134n.mo71862a(aweme);
            if (this.f74109Y != null) {
                this.f74109Y.mo68422a(aweme);
            }
            m92038aJ();
            m92035aG();
            m92086bv();
            mo71638J();
            this.f74098L.mo64549a();
            if ((!C25329c.m83231n(aweme) || C25329c.m83233p(aweme)) && ((!C25072c.m82575a(aweme) || C25072c.m82579e(aweme)) && ((!C28066ac.m91705a(mo71648U()) || !C32891b.m106468a().f85831a) && (!C28066ac.m91706b(mo71648U()) || !C32891b.m106468a().f85832b)))) {
                z = false;
            }
            mo71533d(z);
            m92084bt();
            m92096g(aweme);
            m92080bp();
            m92100h(aweme);
            ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104556b().observe(this.f74132l, this.f74124am);
            this.f74135o.mo72148c();
            if (C6399b.m19945u()) {
                FrameLayout frameLayout = (FrameLayout) this.mRootView.findViewById(R.id.amr);
                if (this.f74106T == null && frameLayout != null) {
                    this.f74106T = C21780t.m72808a(false).mo57895b(this.f74129f);
                    if (this.f74106T != null) {
                        frameLayout.removeAllViews();
                        frameLayout.addView(this.f74106T.mo56936a());
                    }
                }
                if (this.f74130g != null) {
                    TextUtils.isEmpty(this.f74130g.getUploadMiscInfoStruct().diamondGameId);
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                } else if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            }
            m92064bA();
        }
    }

    /* renamed from: a */
    public final void mo71525a(C28308ad adVar) {
        if (this.f74130g.getAid().equals(adVar.f74617b.getAid())) {
            UrlModel urlModel = adVar.f74616a.labelPrivate;
            this.f74130g.setLabelPrivate(urlModel);
            m92061b(urlModel);
            if (!((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo59877d()).booleanValue() || urlModel == null || C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
                this.tagLayout.mo61049b();
            } else {
                this.tagLayout.mo61050b(this.f74130g, this.f74130g.getVideoLabels(), new C23440a(7, 20));
            }
        }
    }

    /* renamed from: a */
    public final void mo71550a(String str, String str2) {
        if (this.f74130g != null && TextUtils.equals(this.f74130g.getAid(), str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if ((C28066ac.m91705a(mo71648U()) || TextUtils.equals(mo71648U(), "personal_homepage") || TextUtils.equals(mo71648U(), "others_homepage") || TextUtils.equals(mo71648U(), "challenge")) && this.tagLayout != null) {
                this.f74130g.setFeedRelationLabel(RelationLabelHelper.mockStarCommentLabel(this.f74130g.getAuthor()));
            }
        }
    }

    /* renamed from: a */
    public final void mo71549a(final ShareCompleteEvent shareCompleteEvent) {
        if (this.f74130g != null && TextUtils.equals(shareCompleteEvent.aid, this.f74130g.getAid()) && !C24217a.m79549a().isCommentListShowing(mo71647T())) {
            if (m92043aO()) {
                C10761a.m31385a(C6399b.m19921a(), (int) R.string.bpe, 1, 1).mo25750a();
            } else {
                C6726a.m20843a(new Runnable() {
                    public final void run() {
                        int childCount = VideoViewHolder.this.mBottomView.getChildCount();
                        VideoViewHolder.this.f74136p = new SparseArray<>();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = VideoViewHolder.this.mBottomView.getChildAt(i);
                            VideoViewHolder.this.f74136p.put(childAt.getId(), Integer.valueOf(childAt.getVisibility()));
                            childAt.setVisibility(8);
                        }
                        C28682a.m94360a(shareCompleteEvent, VideoViewHolder.this.shareTipsRl, VideoViewHolder.this.shareTipsTv, VideoViewHolder.this.mBottomView, VideoViewHolder.this.f74136p);
                        C6726a.m20843a(new Runnable() {
                            public final void run() {
                                C28682a.m94358a(VideoViewHolder.this.shareTipsRl, VideoViewHolder.this.mBottomView, VideoViewHolder.this.f74136p);
                            }
                        }, 5000);
                    }
                }, VETransitionFilterParam.TransitionDuration_DEFAULT);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71664a(User user) {
        if (!C28166bk.m92456a(mo71647T())) {
            C10761a.m31399c(mo71647T(), (int) R.string.cjs).mo25750a();
            return;
        }
        C6903bc.m21467H().mo67869a(user.getUid());
        C42961az.m136380a(new C28325h(user));
        C10761a.m31399c(mo71647T(), (int) R.string.fh_).mo25750a();
    }

    /* renamed from: a */
    private void m92025a(boolean z, boolean z2) {
        C23487o.m77151b(z, this.mCornerTL, this.mCornerTR);
        C23487o.m77151b(z2, this.mCornerBL, this.mCornerBR);
    }

    /* renamed from: a */
    private static boolean m92027a(UrlModel urlModel) {
        return (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) ? false : true;
    }

    /* renamed from: a */
    private boolean m92028a(String str, int i, long j) {
        if (!m92066bb()) {
            this.f74095I = false;
            return false;
        }
        m92062b(str, i, j);
        C28410h.m93367g();
        C28410h.m93366f();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71656a(long j, int i, String str) {
        if (this.f74094H) {
            this.f74095I = false;
            return;
        }
        this.f74095I = true;
        long j2 = j;
        int i2 = i;
        C28152ax axVar = new C28152ax(this.f74130g.getAid(), m92056av(), this.f74130g.getAuthorUid(), j2, i2);
        C1592h.m7855a((Callable<TResult>) axVar, (Executor) C6907h.m21516a());
        C28153ay ayVar = new C28153ay(this, str, j2, i2, this.mRootView.findViewById(R.id.d51));
        this.f74091E = ayVar;
        C6726a.m20844b(this.f74091E);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71667a(String str, long j, int i, View view) {
        this.f74091E = null;
        if (this.f74089C == null) {
            this.f74089C = new C10752a((Activity) this.f74129f).mo25735a(str).mo25731a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo25736a(false).mo25739b(false).mo25742d((int) C9738o.m28708b(this.f74129f, 2.0f)).mo25733a((C10753b) new C28154az(this, j, i)).mo25737a();
            this.f74089C.mo25720a((C10749d<Point>) new C28156ba<Point>(view));
        }
        this.f74089C.mo25719a(view, 3, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71655a(long j, int i) {
        m92102i(37);
        C6907h.m21524a("click_dou_bubble", (Map) C22984d.m75611a().mo59973a("group_id", this.f74130g.getAid()).mo59973a("enter_from", m92056av() ? "personal_homepage" : "others_homepage").mo59973a("author_id", this.f74130g.getAuthorUid()).mo59973a("is_self", m92056av() ? "1" : "0").mo59971a("content_id", j).mo59970a("toast_type", i).f60753a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71666a(Object obj) {
        if (this.f74131k != null) {
            String str = "";
            try {
                str = this.f74131k.getString("request_id");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                this.f74130g.setRequestId(str);
            }
        }
        if (this.f74092F != null && this.f74130g != null) {
            this.f74092F.mo64929a(new C28318an(43, obj));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71658a(View view, boolean z) {
        if (!this.f74107W.param.isHotSpot() || !CleanModeManager2.m106209a(mo71647T())) {
            view.setVisibility((C6903bc.m21484c().mo59240a() || z) ? 4 : 0);
            if (!z) {
                view.setAlpha(1.0f);
            }
            return;
        }
        C26692b.m87676a(view, z);
    }

    /* renamed from: a */
    public final void mo65707a(int i) {
        this.f74137q = true;
        if (C25072c.m82577c(this.f74130g)) {
            C28495n.m93649a(this.f74130g, (C28497a) new C28497a() {
                /* renamed from: a */
                public final void mo71715a() {
                }

                /* renamed from: a */
                public final void mo71716a(Room room) {
                }

                /* renamed from: b */
                public final void mo71717b() {
                }
            }, false);
            C28498o.m93670b(this.f74130g);
            if (C25072c.m82575a(this.f74130g) && !C25072c.m82579e(this.f74130g)) {
                C28498o.m93662a(this.f74130g, "livesdk_topview_show");
            }
            C28498o.m93666a("ttlive_cny_topview_info", (Object) this.f74130g != null ? this.f74130g.getLiveAwesomeSplashInfo() : null);
        }
        if ((!C25329c.m83231n(this.f74130g) || C25329c.m83233p(this.f74130g)) && (!C25072c.m82575a(this.f74130g) || C25072c.m82579e(this.f74130g))) {
            if (C28066ac.m91704a(this.f74108X) || CleanModeManager2.m106209a(mo71647T())) {
                mo71658a((View) this.mWidgetContainer, m92087bw());
            }
            if (!C6384b.m19835a().mo15292a(AwesomeSplashEventSendExperiment.class, true, "awesome_splash_event_send", C6384b.m19835a().mo15295d().awesome_splash_event_send, false)) {
                mo71697g(4);
            }
        } else {
            mo71533d(true);
            mo71697g(1);
        }
        m92048aT();
        if (!C6399b.m19944t()) {
            C6903bc.m21498q().mo93601a(this.f74130g, this.mXiguaTaskEveningIv, mo71648U(), this.f74129f);
        }
        if (this.f74252h != null) {
            this.f74252h.mo60134a("on_page_selected", (Object) Boolean.valueOf(true));
        }
        if (this.tagLayout != null) {
            this.tagLayout.mo61047a();
        }
        if (C28478a.m93583a(this.f74130g)) {
            C24671f.m80856f().mo63378a(mo71647T(), this.f74130g, mo71570u(), true);
        }
        if (this.f74109Y != null) {
            this.f74109Y.mo68421a();
        }
        if (C28066ac.m91705a(mo71648U())) {
            if (this.f74097K) {
                this.f74127d.mo107460d();
            }
            this.f74097K = false;
        }
        m92073bi();
        m92084bt();
        m92074bj();
        if (C28066ac.m91704a(this.f74108X)) {
            C42961az.m136380a(new C28306ab(this.f74130g));
        }
        if (this.f74130g != null && this.f74130g.isAd()) {
            C6907h.onEvent(MobClick.obtain().setEventName("ad_show").setJsonObject(C6869c.m21381a().mo16887a("request_id", ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(this.f74130g, this.f74107W.pageType)).mo16888b()).setExtValueString(this.f74130g.getAid()));
        }
        m92045aQ();
        m92046aR();
        if (!aB_()) {
            this.f74098L.mo64585g();
        }
        if (!C25300bx.m83124a(this.f74130g)) {
            C25212aa.m82906a((ViewGroup) this.mWidgetContainer, (ViewGroup) this.tagLayout);
        }
        if (C25329c.m83231n(this.f74130g) || C25072c.m82575a(this.f74130g)) {
            m92088bx();
        }
        if (TextUtils.isEmpty(this.f74130g.getExtra())) {
            this.mDebugInfoView.setVisibility(8);
        } else {
            this.mDebugInfoView.setVisibility(0);
            this.mDebugInfoView.setContent(this.f74130g.getExtra());
        }
        if (C28066ac.m91705a(mo71648U())) {
            C24671f.m80861k().mo65569a(mo71647T(), this.f74130g);
            C24671f.m80861k().mo65571b(mo71647T(), this.f74130g);
        }
        if (!C6903bc.m21472M().mo59820a(mo71647T(), mo71648U())) {
            C42961az.m136380a(new C28311ag(mo71648U(), C28066ac.m91704a(this.f74108X)));
        }
        C21718a.f58162a.mo57995a(this.f74130g, "impression");
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        if (C23487o.m77147a((View) this.mIvRelieveTag)) {
            C22558b.m74569a(this.f74130g);
        }
        this.f74252h.mo60134a("on_render_ready", (Object) null);
        this.f74098L.mo64601v();
        C23102f.m75929a().mo60186c();
        m92036aH();
        m92037aI();
        if (C25329c.m83231n(this.f74130g) || C25072c.m82575a(this.f74130g)) {
            C42961az.m136380a(new C36993a(true));
        } else {
            C42961az.m136380a(new C36993a(false));
        }
        m92101h(dVar.f115529a);
        if (!C25329c.m83221d(this.f74130g)) {
            C21780t.m72808a(false).mo57896b();
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        m92099h(3);
        m92104i(cVar.f115522a);
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        this.f74098L.mo64597r();
        if (!C6903bc.m21482a().mo84634d() || !TextUtils.equals(mo71648U(), "homepage_follow")) {
            m92047aS();
        }
        if (this.f74252h != null) {
            this.f74252h.mo60134a("in_video_view_holder", (Object) Boolean.valueOf(true));
        }
        if (C25329c.m83231n(this.f74130g) || C25072c.m82575a(this.f74130g)) {
            C42961az.m136380a(new C36993a(true));
        } else {
            C42961az.m136380a(new C36993a(false));
        }
        this.mRootView.setBackgroundColor(this.f74129f.getResources().getColor(R.color.l3));
        m92101h(str);
        if (!C25329c.m83221d(this.f74130g)) {
            C21780t.m72808a(false).mo57896b();
        }
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        this.f74098L.mo64565a(str);
        m92106j(str);
        if (!C25329c.m83221d(this.f74130g)) {
            C21780t.m72808a(false).mo57896b();
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        m92081bq();
        this.f74128e = System.currentTimeMillis();
        BusinessComponentServiceUtils.getLabService().mo91801a(this.f74130g.getAid());
        m92047aS();
        m92050aV();
        m92068bd();
        m92051aW();
        mo71693d(this.f74130g);
        mo71775k(true);
        if (this.f74252h != null) {
            this.f74252h.mo60134a("in_video_view_holder", (Object) Boolean.valueOf(true));
        }
        if (this.f74132l.getActivity() != null && this.f74133m == 0 && C6903bc.m21482a().mo84630a() && TextUtils.equals(mo71648U(), "homepage_follow")) {
            FollowPageFirstFrameViewModel.m136066a(this.f74132l.getActivity()).mo104573c();
        }
        m92077bm();
        if (this.f74105S != null) {
            this.f74105S.mo74181b();
        }
        mo71561i(true);
        if (C28355a.m93175b() && TextUtils.equals("homepage_hot", mo71648U()) && this.f74130g != null && !this.f74130g.isAd()) {
            C28355a.m93174b(this.f74130g.getAid());
        }
    }

    /* renamed from: a */
    public final void mo71662a(C28748a aVar) {
        if (this.mLongPressLayout != null) {
            this.mLongPressLayout.setListener(aVar);
        }
    }

    /* renamed from: a */
    public final void mo63037a(int i, int i2) {
        this.f74101O = true;
        if (!(mo71647T() instanceof C41738c) || !((C41738c) mo71647T()).isSplashShowing()) {
            m92102i(0);
            if (m92078bn()) {
                m92037aI();
            }
        }
    }

    /* renamed from: a */
    public final void mo71661a(Video video, boolean z, int i) {
        if (this.f74088B != null) {
            this.f74088B.mo71661a(video, z, i);
        }
    }

    /* renamed from: a */
    public final void mo71660a(Video video) {
        if (this.f74088B != null) {
            this.f74088B.mo71660a(video);
        }
    }

    /* renamed from: a */
    public final void mo71663a(C34976f fVar) {
        if (this.f74088B != null) {
            this.f74088B.mo71663a(fVar);
        }
    }

    /* renamed from: b */
    public final void mo71692b(C34976f fVar) {
        if (this.f74088B != null) {
            this.f74088B.mo71692b(fVar);
        }
    }

    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int i = 3;
            switch (str.hashCode()) {
                case -1945890740:
                    if (str.equals("show_poi_distance")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1925455577:
                    if (str.equals("dismiss_dou_pop")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1618328215:
                    if (str.equals("video_digg")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1616128562:
                    if (str.equals("to_vs_fragment")) {
                        c = 9;
                        break;
                    }
                    break;
                case -777668341:
                    if (str.equals("update_diig_view")) {
                        c = 2;
                        break;
                    }
                    break;
                case -492284990:
                    if (str.equals("video_comment_list")) {
                        c = 4;
                        break;
                    }
                    break;
                case -162745511:
                    if (str.equals("feed_internal_event")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1181771620:
                    if (str.equals("video_share_click")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1949192341:
                    if (str.equals("is_show_music_guide")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1964086245:
                    if (str.equals("to_profile")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (this.f74092F != null) {
                        this.f74092F.mo64929a(aVar.mo60161a());
                        return;
                    }
                    break;
                case 1:
                    this.f74094H = ((Boolean) aVar.mo60161a()).booleanValue();
                    return;
                case 2:
                    if (((Boolean) aVar.mo60161a()).booleanValue()) {
                        this.f74098L.mo64599t();
                        if (C43166q.m136903a(this.f74130g) && C24671f.m80852b().isShowCommerceAfterInteraction()) {
                            this.f74098L.mo64552a(C24671f.m80852b().getDelayTimeAfterInteraction() * 1000, "passive_show");
                            return;
                        } else if (C25329c.m83236s(this.f74130g)) {
                            this.f74098L.mo64552a(C25329c.m83237t(this.f74130g) * 1000, "passive_show");
                            return;
                        }
                    }
                    break;
                case 3:
                    m92102i(((Integer) aVar.mo60161a()).intValue());
                    return;
                case 4:
                    m92102i(((Integer) aVar.mo60161a()).intValue());
                    if (this.mRootView != null) {
                        this.mRootView.setBackgroundColor(this.f74129f.getResources().getColor(R.color.l3));
                        return;
                    }
                    break;
                case 5:
                    m92052aX();
                    return;
                case 6:
                    m92098g((String) aVar.mo60161a());
                    return;
                case 7:
                    m92052aX();
                    if (!C43168s.m136909a(this.f74130g) || this.f74130g.isCollected()) {
                        if (this.f74095I) {
                            i = 37;
                        }
                        m92102i(i);
                        return;
                    }
                    C10761a.m31399c(mo71647T(), (int) R.string.fsr).mo25750a();
                    return;
                case 8:
                    m92111m(((Boolean) aVar.mo60161a()).booleanValue());
                    return;
                case 9:
                    mo71645Q();
                    m92102i(40);
                    break;
            }
        }
    }

    /* renamed from: a */
    private static boolean m92026a(Context context, String str, PoiStruct poiStruct) {
        if (!TextUtils.equals("homepage_hot", str) || poiStruct.getPoiCard().getIsShow() != 1 || !((IPoiService) ServiceManager.get().getService(IPoiService.class)).isSameCity(context, poiStruct)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo71551a(Map<String, AwemeStatisticsBackup> map, int i) {
        if (this.f74130g == null || map == null || map.size() == 0) {
            C6921a.m21559a((Throwable) new IllegalArgumentException("list is empty,should never happen!"));
            return;
        }
        for (int i2 = 0; i2 < map.size(); i2++) {
            String aid = this.f74130g.getAid();
            if (!(((AwemeStatisticsBackup) map.get(aid)) == null || this.f74252h == null)) {
                StringBuilder sb = new StringBuilder("aid:");
                sb.append(aid);
                sb.append(".start to update statistics!");
                C6921a.m21552a(4, "FeedBackupHelper", sb.toString());
                this.f74252h.mo60134a("awesome_update_backup_data", (Object) this.f74118ag);
            }
        }
    }

    /* renamed from: a */
    public final void mo71521a() {
        super.mo71521a();
        C6903bc.m21495n().mo62441a(this.f74130g.getAid());
        if (C28478a.m93583a(this.f74130g)) {
            C24671f.m80856f().mo63379a(this.f74130g);
        }
        m92076bl();
        m92054aZ();
        this.f74098L.mo64591m();
        if (this.f74104R != null) {
            this.f74104R.mo101071f();
        }
    }

    /* renamed from: a */
    public final void mo71547a(long j) {
        BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
        mo71648U();
    }

    /* renamed from: aP */
    private void m92044aP() {
        this.mShareTipImageView.setVisibility(8);
    }

    /* renamed from: av */
    private boolean m92056av() {
        return this.f74107W.isMyProfile;
    }

    /* renamed from: aw */
    private boolean m92057aw() {
        return this.f74107W.isFromPostList;
    }

    /* renamed from: bh */
    private String m92072bh() {
        return this.f74107W.getPoiTabType();
    }

    /* renamed from: C */
    public final void mo71543C() {
        m92109k(mo65711h());
    }

    /* renamed from: O */
    public final void mo71643O() {
        this.f74134n.mo71859a();
    }

    /* renamed from: Z */
    public final boolean mo71653Z() {
        return this.f74132l.mUserVisibleHint;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ak */
    public final /* synthetic */ void mo71679ak() {
        this.poiCardWebPageContainer.mo60989b(400);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: at */
    public final /* synthetic */ long mo71688at() {
        return System.currentTimeMillis() - this.f74128e;
    }

    public final void au_() {
        mo71573x();
        mo71574y();
    }

    /* renamed from: k */
    public final void mo65714k() {
        this.f74098L.mo64596q();
    }

    /* renamed from: s */
    public final boolean mo71568s() {
        return this.f74127d.mo107459c();
    }

    /* renamed from: t */
    public final Surface mo71569t() {
        return this.f74127d.mo107457b();
    }

    /* renamed from: u */
    public final View mo71570u() {
        return this.f74127d.mo107454a();
    }

    /* renamed from: aC */
    private void m92031aC() {
        this.f74253i.mo60156a((Callable) new C28159bd(this), this.f74138r);
    }

    /* renamed from: aK */
    private void m92039aK() {
        if (this.llAwemeIntro != null) {
            this.llAwemeIntro.setClipChildren(C25072c.m82577c(this.f74130g));
        }
    }

    /* renamed from: aO */
    private boolean m92043aO() {
        if (this.f74130g == null || !this.f74130g.isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: aQ */
    private void m92045aQ() {
        if (C28482e.m93616i(this.f74130g)) {
            C9738o.m28708b(this.f74129f, -83.0f);
        }
    }

    /* renamed from: aS */
    private void m92047aS() {
        if (this.mCoverView != null) {
            this.mCoverView.setVisibility(8);
        }
    }

    /* renamed from: aT */
    private void m92048aT() {
        if (this.mCoverView != null) {
            this.mCoverView.setVisibility(0);
        }
    }

    /* renamed from: aY */
    private void m92053aY() {
        if (this.f74090D != null) {
            this.f74090D.dismiss();
            this.f74090D = null;
        }
    }

    /* renamed from: ax */
    private boolean m92058ax() {
        if (this.f74127d.mo107463g() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: bi */
    private void m92073bi() {
        this.f74252h.mo60134a("hide_poi_info", (Object) null);
    }

    /* renamed from: bo */
    private long m92079bo() {
        if (this.f74088B != null) {
            return this.f74088B.mo107437c();
        }
        return 0;
    }

    /* renamed from: bz */
    private static boolean m92090bz() {
        return C6903bc.m21506y().mo57899a();
    }

    /* renamed from: E */
    public final void mo71545E() {
        if (C43316v.m137450K().mo104916o()) {
            m92067bc();
        }
    }

    /* renamed from: F */
    public final C28201af mo71518F() {
        if (this.f74116ae) {
            return new C28163bh(this);
        }
        return null;
    }

    /* renamed from: G */
    public final C28416d mo71546G() {
        if (this.f74144x == null) {
            return null;
        }
        return this.f74144x.mo71743a();
    }

    /* renamed from: K */
    public final void mo71639K() {
        this.f74252h.mo60134a("video_show_share_guide_animation", (Object) null);
    }

    /* renamed from: L */
    public final void mo71640L() {
        if (this.f74130g != null) {
            this.mRestrictTextView.mo95237a(this.f74130g.getAid());
        }
    }

    /* renamed from: N */
    public final void mo71642N() {
        m92075bk();
        m92052aX();
        m92053aY();
    }

    /* renamed from: P */
    public final void mo71644P() {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("show_festival_activity_icon", (Object) null);
        }
    }

    /* renamed from: Q */
    public final void mo71645Q() {
        if (this.f74104R != null) {
            this.f74104R.mo101070e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final String mo71648U() {
        if (this.f74107W.eventType == null) {
            return "";
        }
        return this.f74107W.eventType;
    }

    /* renamed from: aa */
    public final void mo71669aa() {
        if (this.mLongPressLayout != null) {
            this.mLongPressLayout.setInterceptListener(new C28149au(this));
        }
    }

    /* renamed from: ab */
    public final void mo71670ab() {
        if (this.f74088B != null) {
            this.f74088B.mo71670ab();
        }
    }

    /* renamed from: ac */
    public final void mo71671ac() {
        if (this.f74088B != null) {
            this.f74088B.mo71671ac();
        }
    }

    /* renamed from: ad */
    public final void mo71672ad() {
        if (this.f74088B != null) {
            this.f74088B.mo71672ad();
        }
    }

    /* renamed from: ae */
    public final void mo71673ae() {
        if (this.f74088B != null) {
            this.f74088B.mo71673ae();
        }
    }

    /* renamed from: af */
    public final long mo71674af() {
        if (this.f74088B != null) {
            return this.f74088B.mo71674af();
        }
        return 0;
    }

    /* renamed from: ag */
    public final void mo71675ag() {
        if (this.f74088B != null) {
            this.f74088B.mo71675ag();
        }
    }

    /* renamed from: ah */
    public final C34970f mo71676ah() {
        if (this.f74088B != null) {
            return this.f74088B.mo71676ah();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aj */
    public final /* synthetic */ Object mo71678aj() throws Exception {
        this.f74253i.mo60152a((View) this.mBottomView, (Widget) new VideoReviewStatusWidget());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: an */
    public final /* synthetic */ Object mo71682an() throws Exception {
        this.f74253i.mo60157b(R.id.ec2, this.f74112aa);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ap */
    public final /* synthetic */ Object mo71684ap() throws Exception {
        this.f74253i.mo60157b(R.id.eb7, new VideoPlayCountWidget());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aq */
    public final /* synthetic */ Object mo71685aq() throws Exception {
        this.f74253i.mo60157b(R.id.ebb, new VideoPostTimeWidget());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ar */
    public final /* synthetic */ Object mo71686ar() throws Exception {
        BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
        return null;
    }

    /* renamed from: c */
    public final void mo71555c() {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("on_viewpager_page_selected", (Object) null);
        }
    }

    /* renamed from: f */
    public final int mo65709f() {
        if (this.f74130g != null) {
            return this.f74130g.getAwemeType();
        }
        return 0;
    }

    /* renamed from: v */
    public final void mo71571v() {
        m92067bc();
        this.f74098L.mo64597r();
    }

    /* renamed from: S */
    public static boolean m92016S() {
        if (!C43316v.m137250H()) {
            return C43316v.m137450K().mo104916o();
        }
        return C44933a.m141791a().mo107442b();
    }

    /* renamed from: aD */
    private void m92032aD() {
        if (C6399b.m19944t() && C27690d.m90843a() == 2) {
            this.f74253i.mo60156a((Callable) new C28160be(this), this.f74138r);
        }
    }

    /* renamed from: aF */
    private void m92034aF() {
        new C40727a().mo100940a(this.f74104R.mo101065d()).mo100948a().mo100936d();
    }

    /* renamed from: aG */
    private void m92035aG() {
        new C40727a().mo100939a(this.f74130g).mo100940a(this.f74104R.mo101065d()).mo100948a().mo100934b();
    }

    /* renamed from: aM */
    private void m92041aM() {
        this.f74131k = m92020a(this.f74130g, this.f74107W, this.f74254j);
        this.f74098L.mo64567a(this.f74131k);
        this.f74118ag.setRequestId(this.f74131k);
    }

    /* renamed from: aN */
    private void m92042aN() {
        if (m92058ax()) {
            View u = mo71570u();
            if (u.getVisibility() != 8) {
                C23487o.m77140a(u, 8);
            }
        }
    }

    /* renamed from: aX */
    private boolean m92052aX() {
        mo71645Q();
        if (this.f74091E != null) {
            C6726a.m20845c(this.f74091E);
            this.f74091E = null;
            return true;
        } else if (this.f74089C == null) {
            return false;
        } else {
            this.f74089C.dismiss();
            this.f74089C = null;
            return true;
        }
    }

    /* renamed from: aZ */
    private void m92054aZ() {
        if (this.f74091E != null) {
            C6726a.m20845c(this.f74091E);
            this.f74091E = null;
        }
        if (this.f74089C != null) {
            this.f74089C.mo25722b();
            this.f74089C = null;
        }
    }

    /* renamed from: bA */
    private void m92064bA() {
        if (this.f74130g != null && this.f74130g.shouldShowReviewStatus()) {
            this.f74253i.mo60156a((Callable) new C28151aw(this), this.f74138r);
        }
    }

    /* renamed from: ba */
    private boolean m92065ba() {
        if (C6861a.m21337f().isLogin() && m92057aw()) {
            return true;
        }
        return false;
    }

    /* renamed from: be */
    private void m92069be() {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("pause_share_guide_animation", (Object) Boolean.valueOf(true));
        }
    }

    /* renamed from: bf */
    private void m92070bf() {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("recover_share_guide_animation", (Object) Boolean.valueOf(true));
        }
    }

    /* renamed from: bg */
    private void m92071bg() {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("stopPlayAnimation", (Object) Boolean.valueOf(true));
        }
        this.f74098L.mo64595p();
    }

    /* renamed from: bk */
    private void m92075bk() {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("tryDismissEnterMusicGuide", (Object) Boolean.valueOf(true));
        }
    }

    /* renamed from: bl */
    private void m92076bl() {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("tryDestroyEnterMusicGuide", (Object) Boolean.valueOf(true));
        }
    }

    /* renamed from: bn */
    private boolean m92078bn() {
        if (this.f74107W == null) {
            return false;
        }
        FeedParam feedParam = this.f74107W.param;
        if (feedParam == null) {
            return false;
        }
        return TextUtils.equals("from_user_state_tab", feedParam.getFrom());
    }

    /* renamed from: br */
    private void m92082br() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.poiCardWebPageContainer.getLayoutParams();
        if (marginLayoutParams.bottomMargin != C25383w.m83524a(this.f74129f)) {
            marginLayoutParams.bottomMargin = C25383w.m83524a(this.f74129f);
            this.poiCardWebPageContainer.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: bt */
    private void m92084bt() {
        if (!aB_() && this.poiCardWebPageContainer.getChildCount() > 0) {
            this.poiCardWebPageContainer.mo60984a(0);
        }
    }

    /* renamed from: bv */
    private void m92086bv() {
        if (this.f74107W.param.isHotSpot() && C26690a.m87672a()) {
            C26692b.m87675a(this.mWidgetContainer);
        }
    }

    /* renamed from: by */
    private static boolean m92089by() {
        if (C6384b.m19835a().mo15287a(UserAntiAddictionExperiment.class, false, "addicted_popup_style", C6384b.m19835a().mo15295d().addicted_popup_style, 0) == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo71646R() {
        this.f74104R = C6903bc.m21500s().mo102610a();
        this.f74104R.mo101064a((C40724f) this);
        this.f74142v.mo60151a((int) R.id.b2b, (Widget) this.f74104R);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final String mo71649V() {
        if (this.f74107W.getPreviousPage() == null) {
            return "";
        }
        return this.f74107W.getPreviousPage();
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final String mo71650W() {
        if (this.f74107W.param.getObjectId() == null) {
            return "";
        }
        return this.f74107W.param.getObjectId();
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final String mo71651X() {
        if (this.f74107W.param.getCardType() == null) {
            return "";
        }
        return this.f74107W.param.getCardType();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final String mo71652Y() {
        if (this.f74107W.param.getCreationId() == null) {
            return "";
        }
        return this.f74107W.param.getCreationId();
    }

    /* renamed from: ai */
    public final long mo71677ai() {
        if (!C43316v.m137250H()) {
            return C43316v.m137450K().mo104915n();
        }
        return m92079bo();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ao */
    public final /* synthetic */ Object mo71683ao() throws Exception {
        this.f74110Z = new VideoMusicTitleWidget();
        this.f74253i.mo60157b(R.id.ec3, this.f74110Z);
        return null;
    }

    public final void az_() {
        C6903bc.m21498q().mo93601a(this.f74130g, this.mXiguaTaskEveningIv, mo71648U(), this.f74129f);
    }

    /* renamed from: p */
    public final void mo71565p() {
        if (m92058ax()) {
            this.f74127d.mo107454a().setVisibility(8);
        }
    }

    /* renamed from: x */
    public final void mo71573x() {
        if (m92058ax()) {
            View u = mo71570u();
            if (u.getVisibility() != 0) {
                C23487o.m77140a(u, 0);
            }
        }
    }

    /* renamed from: aA */
    private void m92029aA() {
        this.f74253i.mo60157b(R.id.bq5, new VideoLiveTrayWidget());
        this.f74253i.mo60157b(R.id.bot, new VideoLiveCommentWidget());
        this.f74253i.mo60157b(R.id.bpz, new VideoLiveButtonWidget());
        this.f74253i.mo60157b(R.id.bou, new VideoLiveLivingWidget());
    }

    /* renamed from: aB */
    private void m92030aB() {
        if (!C6399b.m19944t()) {
            this.f74113ab = C28677a.m94348b().mo71733a(this.f74108X);
            this.f74253i.mo60156a((Callable) new C28157bb(this), this.f74138r);
            this.f74252h.mo60132a("to_vs_fragment", (C0053p<C23083a>) this);
        }
    }

    /* renamed from: aE */
    private void m92033aE() {
        if (this.f74110Z == null) {
            this.f74253i.mo60156a((Callable) new C28161bf(this), this.f74138r);
        }
        if (this.f74112aa == null) {
            this.f74112aa = new VideoMusicCoverWidget();
            this.f74253i.mo60156a((Callable) new C28162bg(this), this.f74138r);
        }
    }

    /* renamed from: aH */
    private void m92036aH() {
        new C40727a().mo100939a(this.f74130g).mo100940a(this.f74104R.mo101065d()).mo100948a().mo100932a(mo71647T());
    }

    /* renamed from: aI */
    private void m92037aI() {
        C43222g gVar;
        VideoViewHolder videoViewHolder = null;
        if (!C43316v.m137250H()) {
            gVar = C43316v.m137450K();
        } else {
            gVar = null;
            videoViewHolder = this;
        }
        new C40727a().mo100939a(this.f74130g).mo100945a(gVar).mo100946a((C44960f) videoViewHolder).mo100940a(this.f74104R.mo101065d()).mo100948a().mo100935c();
    }

    /* access modifiers changed from: private */
    /* renamed from: au */
    public boolean mo71680al() {
        if (C6399b.m19944t()) {
            return true;
        }
        if (this.f74130g == null || this.f74130g.isAwemeFromXiGua() || this.f74130g.isAwemeFromDongCheDi() || this.f74130g.isDelete() || TextUtils.equals(mo71648U(), "poi_video_leaderboard")) {
            return false;
        }
        return true;
    }

    /* renamed from: ay */
    private void m92059ay() {
        if (TextUtils.equals("tiktok_inhouse", C6399b.m19941q())) {
            this.txtTTFeedback.setVisibility(0);
            this.txtTTFeedback.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    SmartRouter.buildRoute(VideoViewHolder.this.f74129f, "//feedback_record").open();
                }
            });
            return;
        }
        this.txtTTFeedback.setVisibility(8);
        this.txtTTFeedback.setOnClickListener(null);
    }

    /* renamed from: az */
    private void m92060az() {
        if (this.f74107W.param.isHotSpot()) {
            View inflate = this.mFullFeedStub.inflate();
            if (inflate.findViewById(R.id.d9k) != null) {
                this.f74109Y = new HotSpotFeedMaskViewHolder(inflate, this.f74132l.getActivity());
            }
        }
    }

    /* renamed from: bd */
    private void m92068bd() {
        if (this.f74133m == 4 || !C6399b.m19944t()) {
            if (this.f74129f instanceof Activity) {
                BusinessComponentServiceUtils.getBusinessBridgeService().mo61471c();
            }
            if (this.f74252h != null) {
                this.f74252h.mo60134a("tryShowEnterMusicGuide", (Object) Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: bj */
    private void m92074bj() {
        if (!aB_() && this.f74130g.getAwemeRawAd() != null && this.f74130g.getAwemeRawAd().isAdPoiControl() && this.mWidgetContainer != null) {
            this.mWidgetContainer.postDelayed(new C28148at(this), (long) this.f74130g.getAwemeRawAd().getShowPoiMillisecond());
        }
    }

    /* renamed from: bp */
    private void m92080bp() {
        if (aB_() && !C6399b.m19944t() && this.mPoiRankWidget != null && mo65711h() != null) {
            mo71533d(true);
            this.mWidgetContainer.setVisibility(8);
            this.mPoiRankWidget.setVisibility(0);
            this.mPoiRankWidget.setupContent(mo65711h());
        }
    }

    /* renamed from: bs */
    private void m92083bs() {
        if (m92085bu()) {
            this.poiCardWebPageContainer.mo60987a(true, this.llAwemeIntro, this.mBottomView);
            this.poiCardWebPageContainer.post(new C28150av(this));
        }
    }

    /* renamed from: bw */
    private boolean m92087bw() {
        if (C32891b.m106468a().f85831a || ((C28066ac.m91706b(mo71648U()) && C32891b.m106468a().f85832b) || (this.f74107W.param.isHotSpot() && CleanModeManager2.m106210b(mo71647T())))) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final void mo71544D() {
        if (this.mRootView != null) {
            this.mRootView.setBackgroundColor(this.f74129f.getResources().getColor(R.color.l3));
        }
        if (C43316v.m137450K().mo104916o()) {
            m92071bg();
        }
    }

    /* renamed from: M */
    public final int[] mo71641M() {
        if (this.f74130g == null || this.f74130g.getAuthor() == null || this.f74130g.getAuthor().getFollowStatus() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        View findViewById = this.mAvatarLayout.findViewById(R.id.anj);
        if (findViewById == null) {
            return null;
        }
        findViewById.getLocationOnScreen(iArr);
        return iArr;
    }

    public final void aA_() {
        if (this.f74101O) {
            this.f74101O = false;
            if (m92058ax() && this.f74145y && !C43316v.m137250H()) {
                C43316v.m137450K().mo104941b((Surface) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: am */
    public final /* synthetic */ void mo71681am() {
        try {
            C0520q qVar = new C0520q();
            qVar.mo2151a((C0508m) new C0476c());
            C0516o.m2171a(this.mWidgetContainer, qVar);
            this.f74252h.mo60134a("show_poi_info_with_expend", (Object) Integer.valueOf(-1));
        } catch (NullPointerException e) {
            C6877n.m21407a("log_transition_empty", null, C6869c.m21381a().mo16887a("errMsg", e.getMessage()).mo16888b());
        }
    }

    /* renamed from: i */
    public final void mo65712i() {
        mo71645Q();
        this.f74252h.mo60134a("video_on_pause", (Object) null);
    }

    /* renamed from: j */
    public final void mo65713j() {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("stopPlayAnimation", (Object) Boolean.valueOf(true));
        }
        mo71560h(false);
        m92034aF();
        ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104556b().removeObserver(this.f74124am);
    }

    /* renamed from: aL */
    private void m92040aL() {
        User author = this.f74130g.getAuthor();
        if (author != null) {
            if (author.getGender() == 2) {
                this.mDislikeSomeoneTv.setText(R.string.dh);
            } else {
                this.mDislikeSomeoneTv.setText(R.string.di);
            }
            if (C6399b.m19944t() || !TextUtils.isEmpty(this.f74130g.getRepostFromGroupId()) || !TextUtils.equals(mo71648U(), "homepage_familiar") || (!(author.getFollowStatus() == 0 || author.getFollowStatus() == 4) || C43122ff.m136763a(author.getUid()))) {
                this.mDislikeSomeoneTv.setVisibility(8);
            } else {
                this.mDislikeSomeoneTv.setVisibility(0);
            }
            this.mDislikeSomeoneTv.setOnClickListener(new C28165bj(this, author));
        }
    }

    /* renamed from: aR */
    private void m92046aR() {
        if (C28482e.m93616i(this.f74130g)) {
            if (this.f74096J == null) {
                this.f74096J = new Runnable() {
                    public final void run() {
                    }
                };
            }
            this.feedReportVotell.postDelayed(this.f74096J, 100);
            C6907h.onEvent(MobClick.obtain().setEventName("show_review_ban").setLabelName("homepage_hot").setValue(this.f74130g.getAid()).setJsonObject(new C6869c().mo16887a("is_user_review", "1").mo16888b()));
        }
    }

    /* renamed from: aU */
    private void m92049aU() {
        int i;
        if (!C28482e.m93616i(this.f74130g) || this.f74130g.isHotSearchAweme() || C28478a.m93588c(this.f74130g)) {
            this.feedReportVotell.setVisibility(8);
            return;
        }
        this.feedReportVotell.setVisibility(0);
        int voteStatus = this.f74130g.getAwemeRiskModel().getVoteStatus();
        if (voteStatus == 1) {
            i = R.string.fq_;
            this.mAllowDisplayBtn.setSelected(true);
            this.mDisallowDisplayBtn.setSelected(false);
        } else if (voteStatus == 0) {
            i = R.string.fqb;
            this.mDisallowDisplayBtn.setSelected(true);
            this.mAllowDisplayBtn.setSelected(false);
        } else {
            i = R.string.fqa;
            this.mAllowDisplayBtn.setSelected(false);
            this.mDisallowDisplayBtn.setSelected(false);
        }
        this.mVoteStatusTextView.setText(i);
    }

    /* renamed from: aV */
    private void m92050aV() {
        if (C38248p.m122190a(mo65711h()) && C28410h.m93363c()) {
            if ((!"message".equals(mo71648U()) && !"chat".equals(mo71648U()) && !"push".equals(mo71648U())) || this.f74107W.cid == null) {
                View findViewById = this.mRootView.findViewById(R.id.d51);
                if (findViewById != null) {
                    C28410h.m93364d();
                    if (this.f74090D == null) {
                        this.f74090D = new C35481c((Activity) this.f74129f);
                    }
                    this.f74090D.f93101i = true;
                    this.f74090D.mo90258a(false);
                    this.f74090D.f93102j = 4500;
                    this.f74090D.mo90267c((int) R.string.a32);
                    this.f74090D.mo90257a(findViewById, 3, true, 0.0f);
                }
            }
        }
    }

    /* renamed from: bb */
    private boolean m92066bb() {
        if (!m92057aw() || !m92056av() || this.f74130g.getAuthor() == null || !TextUtils.equals(this.f74130g.getAuthor().getUid(), C6861a.m21337f().getCurUserId()) || !C25329c.m83235r(this.f74130g) || !C28410h.m93368h() || C6903bc.m21484c().mo59242b()) {
            return false;
        }
        return true;
    }

    /* renamed from: bu */
    private boolean m92085bu() {
        if (aB_() || this.f74130g == null || this.f74130g.getPoiStruct() == null || this.f74130g.getPoiStruct().getPoiCard() == null || "poi_page".equalsIgnoreCase(mo71648U()) || !C24671f.m80860j().mo64773a(this.f74130g, 0)) {
            return false;
        }
        PoiStruct poiStruct = this.f74130g.getPoiStruct();
        PoiCardStruct poiCard = poiStruct.getPoiCard();
        if (m92026a(mo71647T(), mo71648U(), poiStruct) && !TextUtils.isEmpty(poiCard.getUrl())) {
            return true;
        }
        return false;
    }

    /* renamed from: bx */
    private void m92088bx() {
        int i;
        if (!this.f74143w) {
            if (!C21085a.m71117a().f56622i || (((C25329c.m83231n(this.f74130g) && !C25329c.m83233p(this.f74130g)) || (C25072c.m82575a(this.f74130g) && !C25072c.m82579e(this.f74130g))) && !C24671f.m80857g().mo65559f())) {
                i = 0;
            } else {
                i = -C21085a.m71117a().mo56926b();
            }
            this.f74117af = i;
            if (C21085a.m71129c()) {
                i += C21085a.f56610a;
            }
            C42961az.m136380a(new C28320c(!C21085a.m71117a().f56622i));
            LayoutParams layoutParams = (LayoutParams) this.mWidgetContainer.getLayoutParams();
            layoutParams.bottomMargin = i;
            this.mWidgetContainer.setLayoutParams(layoutParams);
            m92025a(C21085a.m71117a().f56624k, C21085a.m71117a().f56625l);
            m92082br();
        }
    }

    /* renamed from: d */
    public final void mo56928d() {
        if ((!this.f74116ae || !C32891b.m106468a().f85831a) && this.mWidgetContainer != null) {
            m92088bx();
            if (this.f74105S == null || !this.f74105S.mo74182c()) {
                this.f74135o.mo72147a(this.f74129f, this.f74130g.getVideo(), mo71570u(), (View) this.mCoverView);
            }
            if (this.f74130g.getVideo() != null) {
                this.f74135o.mo72146a(this.f74129f, this.f74130g.getVideo(), (View) this.flInteractLayout);
            }
            this.f74098L.mo64587i();
        }
    }

    /* renamed from: y */
    public final void mo71574y() {
        if (m92058ax()) {
            View u = mo71570u();
            C6308d dVar = (C6308d) f74085U.get(this.f74129f);
            if (dVar != null) {
                Iterator it = dVar.iterator();
                while (it.hasNext()) {
                    SurfaceView surfaceView = (SurfaceView) it.next();
                    if (surfaceView != u) {
                        C23487o.m77140a((View) surfaceView, 8);
                    }
                }
            }
            C6308d dVar2 = (C6308d) f74086V.get(this.f74129f);
            if (dVar2 != null) {
                Iterator it2 = dVar2.iterator();
                while (it2.hasNext()) {
                    VideoViewHolder videoViewHolder = (VideoViewHolder) it2.next();
                    if (videoViewHolder != this && ((videoViewHolder.f74133m == this.f74133m - 1 || videoViewHolder.f74133m == this.f74133m + 1) && videoViewHolder.f74130g != null)) {
                        videoViewHolder.m92093d(videoViewHolder.f74130g.getVideo());
                    }
                }
            }
        }
    }

    /* renamed from: aJ */
    private void m92038aJ() {
        VideoViewHolder videoViewHolder;
        C43222g gVar;
        boolean z;
        C41849d dVar = new C41849d();
        dVar.mo102613b(this.f74130g.getAuthorUid()).mo102612a(mo71648U()).mo102614c(this.f74130g.getAid()).mo102615d(C28199ae.m92689a().mo71791a(this.f74130g.getRequestId()));
        if (!C43316v.m137250H()) {
            gVar = C43316v.m137450K();
            videoViewHolder = null;
        } else {
            videoViewHolder = this;
            gVar = null;
        }
        C40727a a = new C40727a().mo100939a(this.f74130g).mo100941a((C41841a) new C28116c()).mo100942a((C41842b) new C40711a(this.f74129f, this.f74130g.getVideo(), this.f74135o)).mo100944a(dVar).mo100945a(gVar).mo100946a((C44960f) videoViewHolder).mo100943a((C41844c) new C28117d());
        if (!this.f74107W.showVote || !TextUtils.equals(this.f74130g.getAid(), this.f74141u.mo71910am())) {
            z = false;
        } else {
            z = true;
        }
        a.mo100949b(z).mo100940a(this.f74104R.mo101065d()).mo100948a().mo100931a();
        if (this.f74104R != null) {
            this.f74104R.mo101063a(this.f74130g);
        }
    }

    /* renamed from: aW */
    private void m92051aW() {
        if (C6399b.m19944t() || !m92065ba()) {
            this.f74095I = false;
        } else if (!m92056av()) {
            User user = C35817i.f93869a;
            if (user != null && user.isStar() && C28410h.m93370j()) {
                m92062b(this.f74129f.getString(R.string.du8), 0, -1);
                C28410h.m93371k();
                C28410h.m93372l();
            }
        } else {
            DouplusToastStruct d = CommerceSettingsApi.m80554d();
            if (d != null) {
                switch (d.type) {
                    case 1:
                        long i = C28410h.m93369i();
                        long j = d.f65868id;
                        String str = d.content;
                        if (j != i && !TextUtils.isEmpty(str)) {
                            C28410h.m93357a(j);
                            m92062b(str, d.type, d.contentId);
                            break;
                        }
                    case 2:
                        if (m92028a(d.content, d.type, d.contentId)) {
                            C28410h.m93373m();
                            return;
                        }
                        break;
                    case 3:
                        m92028a(d.content, d.type, d.contentId);
                        return;
                }
            }
        }
    }

    /* renamed from: bc */
    private void m92067bc() {
        long j;
        if (this.f74252h != null) {
            this.f74252h.mo60134a("startPlayAnimation", (Object) Boolean.valueOf(true));
        }
        if ((C25329c.m83231n(this.f74130g) && !C25329c.m83233p(this.f74130g)) || (C25072c.m82575a(this.f74130g) && !C25072c.m82579e(this.f74130g))) {
            mo71697g(2);
            if (this.f74139s == null || !this.f74139s.isRunning()) {
                this.f74139s = new AnimatorSet();
                this.f74139s.play(ObjectAnimator.ofFloat(this.mGradualBottomView, "alpha", new float[]{0.0f, 1.0f})).with(ObjectAnimator.ofFloat(this.mWidgetContainer, "alpha", new float[]{0.0f, 1.0f}));
                this.f74139s.setStartDelay(260);
                this.f74139s.setDuration(430);
                this.f74139s.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (VideoViewHolder.this.f74137q) {
                            VideoViewHolder.this.mo71697g(4);
                        }
                    }
                });
            }
            if (this.f74102P == null || this.f74102P.f74163a) {
                this.f74102P = new C28114a(this.f74130g);
                if (C25072c.m82575a(this.f74130g)) {
                    LiveAwesomeSplashInfo h = C25072c.m82582h(this.f74130g);
                    if (h != null) {
                        j = (long) (h.getFeedShowTime() * 1000);
                    } else {
                        j = 0;
                    }
                } else {
                    j = (long) C25329c.m83239v(this.f74130g);
                }
                this.mRootView.postDelayed(this.f74102P, j);
            }
        } else if (C28066ac.m91704a(this.f74108X) && !this.f74093G) {
            mo71658a((View) this.mWidgetContainer, m92087bw());
        }
    }

    /* renamed from: bm */
    private void m92077bm() {
        int i;
        if (!C43316v.m137250H() && this.f74130g != null && this.f74130g.getVideo() != null) {
            int l = C43316v.m137450K().mo104913l();
            int m = C43316v.m137450K().mo104914m();
            if (l <= 0 || m <= 0) {
                StringBuilder sb = new StringBuilder("video Player size is wrong, aid is ");
                sb.append(C28482e.m93613f(this.f74130g));
                C6921a.m21552a(5, "VideoViewHolder", sb.toString());
                return;
            }
            int width = this.f74130g.getVideo().getWidth();
            int height = this.f74130g.getVideo().getHeight();
            int a = C28171bp.m92473a(width, height, l, m);
            if (a != 0) {
                m92021a(a, width, height, l, m);
                if (C28066ac.m91705a(mo71648U())) {
                    i = C10292j.m30480a().mo25012a(FeedVideoViewResizeStrategySetting.class, "feed_video_view_resize_strategy", C6384b.m19835a().mo15294c().getFeedVideoViewResizeStrategy());
                } else {
                    i = C10292j.m30480a().mo25012a(NonFeedVideoViewResizeStrategySetting.class, "non_feed_video_view_resize_strategy", C6384b.m19835a().mo15294c().getNonFeedVideoViewResizeStrategy());
                }
                if (i < a) {
                    C6921a.m21552a(5, "VideoViewHolder", "video_view_size_mismatch, but current strategy does not handle it");
                } else {
                    m92091c(l, m);
                }
            }
        }
    }

    /* renamed from: bq */
    private void m92081bq() {
        if (m92085bu()) {
            PoiStruct poiStruct = this.f74130g.getPoiStruct();
            PoiCardStruct poiCard = poiStruct.getPoiCard();
            StringBuilder sb = new StringBuilder();
            if (!poiCard.getUrl().endsWith("?")) {
                sb.append("?");
            }
            StringBuilder sb2 = new StringBuilder("poiId=");
            sb2.append(Uri.encode(this.f74130g.getPoiStruct().poiId));
            sb.append(sb2.toString());
            sb.append("&theme=1");
            StringBuilder sb3 = new StringBuilder("&distance=");
            sb3.append(Uri.encode(((IPoiService) ServiceManager.get().getService(IPoiService.class)).getDistance(mo71647T(), poiStruct)));
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(poiCard.getUrl());
            sb4.append(sb.toString());
            this.poiCardWebPageContainer.mo60985a(sb4.toString(), this.f74130g, this.f74132l.mFragmentManager);
            m92082br();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo71514H() {
        this.f74252h = DataCenter.m75849a(C23087c.m75887a(this.f74132l, this), (C0043i) this.f74132l);
        this.f74252h.mo60132a("feed_internal_event", (C0053p<C23083a>) this).mo60132a("to_profile", (C0053p<C23083a>) this).mo60132a("dismiss_dou_pop", (C0053p<C23083a>) this).mo60132a("is_show_music_guide", (C0053p<C23083a>) this).mo60132a("update_diig_view", (C0053p<C23083a>) this).mo60132a("video_comment_list", (C0053p<C23083a>) this).mo60132a("video_share_click", (C0053p<C23083a>) this).mo60132a("video_digg", (C0053p<C23083a>) this).mo60132a("show_poi_distance", (C0053p<C23083a>) this);
        this.f74253i = WidgetManager.m75867a(this.f74132l, (View) this.mRootView);
        this.f74253i.mo60153a(this.f74252h);
        this.f74253i.mo60156a((Callable) new C28145aq(this), this.f74138r);
        this.f74098L.mo64558a(this.f74252h);
        this.f74098L.mo64559a(this.f74253i);
        m92033aE();
        this.f74142v = WidgetManager.m75867a(this.f74132l, (View) this.mRootView);
        mo71646R();
        m92031aC();
        m92032aD();
        m92030aB();
        m92029aA();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: as */
    public final /* synthetic */ Object mo71687as() throws Exception {
        WidgetManager b = this.f74253i.mo60157b(R.id.ec0, new VideoDescWidget(this)).mo60157b(R.id.ajl, C28677a.m94348b().mo71731a());
        VideoDiggWidget videoDiggWidget = new VideoDiggWidget(mo71648U(), mo71649V(), mo71650W(), mo71651X(), mo71652Y(), new C28158bc(this));
        b.mo60157b(R.id.a8y, videoDiggWidget).mo60152a((View) this.mBottomView, (Widget) new VideoProgressBarWidget()).mo60157b(R.id.ze, new VideoCommentWidget()).mo60157b(R.id.d5b, new VideoShareWidget()).mo60157b(R.id.j3, new FeedAvatarWidget()).mo60152a((View) this.mBottomView, (Widget) new VideoAntiAddictionWidget()).mo60152a((View) this.mBottomView, C28677a.m94348b().mo71735b()).mo60152a((View) this.mBottomView, C28677a.m94348b().mo71736c()).mo60152a((View) this.mBottomView, (Widget) new RecommendDislikeBarWidget());
        if (C6399b.m19944t()) {
            this.f74253i.mo60152a((View) this.mBottomView, (Widget) new VPAInfoBarWidget()).mo60152a((View) this.mRootView, (Widget) new VPAOptedOutMaskWidget());
        }
        return null;
    }

    /* renamed from: l */
    public void mo65715l() {
        this.f74137q = false;
        C24671f.m80857g().mo65556b(true);
        if (C25072c.m82577c(this.f74130g)) {
            C28495n.m93646a();
        }
        if (!aB_()) {
            this.f74098L.mo64586h();
            this.f74134n.mo71864b();
        }
        if (C28478a.m93583a(this.f74130g)) {
            C24671f.m80856f().mo63378a(mo71647T(), this.f74130g, mo71570u(), false);
        }
        this.f74252h.mo60134a("on_page_unselected", (Object) Boolean.valueOf(true));
        if (this.f74130g != null && this.f74130g.isAppAd()) {
            C6903bc.m21491j().mo59909a().mo51669a(this.f74130g.getAwemeRawAd().getDownloadUrl(), hashCode());
        }
        m92084bt();
        C42961az.m136380a(new C24030b(this.f74130g.getAid()));
        mo71775k(false);
        if (C25329c.m83231n(this.f74130g) || C25072c.m82575a(this.f74130g)) {
            mo71697g(4);
        }
        if (this.f74102P != null) {
            this.f74102P.mo71718a();
            this.f74102P = null;
        }
        if (this.f74139s != null) {
            this.f74139s.cancel();
            this.f74139s = null;
        }
        C25212aa.m82905a(this.tagLayout);
        mo71675ag();
        C24671f.m80861k().mo65570a(false);
        mo71698l(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo71637I() {
        boolean z;
        this.tagLayout.setEventType(mo71648U());
        List videoLabels = this.f74130g.getVideoLabels();
        m92024a(videoLabels);
        if (this.f74130g.isAd() && !this.f74130g.getAwemeRawAd().isRightStyle()) {
            AwemeTextLabelModel label = this.f74130g.getAwemeRawAd().getLabel();
            if (label != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(label);
                this.f74130g.setTextVideoLabels(arrayList);
            }
        }
        if ((!m92043aO() || !C25329c.m83234q(this.f74130g)) && !C24706aa.m81052a(this.f74130g)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.tagLayout.setVisibility(8);
        } else if (!RelationLabelHelper.hasDuoShanLabel(this.f74130g)) {
            if ((!C6319n.m19594a(mo71648U(), "homepage_hot") || m92043aO()) && !TextUtils.equals(mo71648U(), "homepage_familiar") && !C25329c.m83224g(this.f74130g) && !TextUtils.equals(mo71648U(), "challenge")) {
                if (this.f74130g.getRelationLabel() == null || this.f74130g.getRelationLabel().getType() != 5 || !C6384b.m19835a().mo15292a(RelationLabelClickEnterExperiment.class, true, "relation_label_click_enter", C6384b.m19835a().mo15295d().relation_label_click_enter, false) || this.f74108X != 2 || m92043aO()) {
                    this.tagLayout.mo61050b(this.f74130g, videoLabels, new C23440a(7, 20));
                } else {
                    new C23440a(7, 20);
                }
            } else if (RelationLabelHelper.hasNewRelationLabel(this.f74130g)) {
                new C28146ar(this);
            } else {
                if (this.f74130g.getRelationLabel() != null && this.f74130g.getRelationLabel().getType() == 0 && TextUtils.equals(mo71648U(), "homepage_familiar")) {
                    this.f74130g.setRelationLabel(null);
                }
                this.tagLayout.mo61051c(this.f74130g, videoLabels, new C23440a(7, 20));
            }
        }
        C25212aa.m82905a(this.tagLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo71638J() {
        boolean z;
        int i;
        String str;
        Object[] objArr;
        Context context;
        TextView textView;
        m92039aK();
        boolean t = C6399b.m19944t();
        Video video = this.f74130g.getVideo();
        m92044aP();
        User author = this.f74130g.getAuthor();
        if (this.f74130g == null || ((this.f74130g.isCanPlay() && !this.f74130g.isDelete()) || C32698a.m105818a(this.f74130g))) {
            z = false;
        } else {
            z = true;
        }
        if (t && C25300bx.m83127a(this.f74130g, true) && C25300bx.m83125a(this.f74130g, 3) && this.f74130g.getAwemeRawAd().getOmVast().vast != null && !TextUtils.isEmpty(this.f74130g.getAwemeRawAd().getOmVast().vast.adTitle)) {
            this.mTitleView.setText(this.f74129f.getString(R.string.b5s, new Object[]{this.f74130g.getAwemeRawAd().getOmVast().vast.adTitle}));
        } else if (author != null) {
            User curUser = C6861a.m21337f().getCurUser();
            if (C6319n.m19594a(author.getUid(), curUser.getUid())) {
                author.roomId = curUser.roomId;
            }
            if (t) {
                if (!z) {
                    if (C6399b.m19946v()) {
                        if (m92063b(author)) {
                            textView = this.mTitleView;
                            context = this.f74129f;
                            objArr = new Object[1];
                        } else {
                            textView = this.mTitleView;
                            context = this.f74129f;
                            objArr = new Object[1];
                            str = C43122ff.m136777h(author);
                            objArr[0] = str;
                            textView.setText(context.getString(R.string.b5s, objArr));
                        }
                    } else if (this.f74130g.isAd() || !C6903bc.m21473N().mo71142b()) {
                        textView = this.mTitleView;
                        context = this.f74129f;
                        objArr = new Object[1];
                    } else {
                        textView = this.mTitleView;
                        context = this.f74129f;
                        objArr = new Object[1];
                        str = C43122ff.m136777h(author);
                        objArr[0] = str;
                        textView.setText(context.getString(R.string.b5s, objArr));
                    }
                }
                this.mTitleView.getPaint().setFakeBoldText(true);
            } else {
                textView = this.mTitleView;
                context = this.f74129f;
                objArr = new Object[1];
                if (!TextUtils.isEmpty(author.getRemarkName())) {
                    str = author.getRemarkName();
                    objArr[0] = str;
                    textView.setText(context.getString(R.string.b5s, objArr));
                    this.mTitleView.getPaint().setFakeBoldText(true);
                }
            }
            str = author.getNickname();
            objArr[0] = str;
            textView.setText(context.getString(R.string.b5s, objArr));
            this.mTitleView.getPaint().setFakeBoldText(true);
        } else {
            this.mTitleView.setText("");
        }
        if (author != null && C6399b.m19944t()) {
            if (!C28066ac.m91705a(mo71648U()) || !C6384b.m19835a().mo15292a(VerificationExperiment.class, true, "for_you_feed_hide_verification_badge", C6384b.m19835a().mo15295d().for_you_feed_hide_verification_badge, false)) {
                C43126fg.m136801a(this.f74129f, author.getCustomVerify(), author.getEnterpriseVerifyReason(), this.mTitleView);
            } else {
                C43126fg.m136801a(this.f74129f, "", "", this.mTitleView);
            }
        }
        if (z) {
            this.mTitleView.setVisibility(4);
        } else {
            this.mTitleView.setVisibility(0);
        }
        m92040aL();
        m92088bx();
        mo71637I();
        int i2 = 8;
        if (this.f74130g.isRelieve()) {
            this.mIvRelieveTag.setAnimation("anti_addiction_tag.json");
            this.mIvRelieveTag.mo7078b();
            this.mIvRelieveTag.mo7082c(true);
            this.mIvRelieveTag.setVisibility(0);
        } else if (this.mIvRelieveTag != null) {
            try {
                this.mIvRelieveTag.mo7085f();
            } catch (NullPointerException e) {
                C6921a.m21559a((Throwable) e);
            }
            this.mIvRelieveTag.setVisibility(8);
        }
        if (((Boolean) SharePrefCache.inst().isOb().mo59877d()).booleanValue()) {
            this.mRestrictTextView.setVisibility(0);
            this.mRestrictTextView.mo95237a(this.f74130g.getAid());
        } else {
            this.mRestrictTextView.setVisibility(8);
        }
        if (m92043aO()) {
            this.feedReportVotell.setVisibility(8);
            this.feedReportWarnll.setVisibility(8);
            this.f74098L.mo64573b(this.f74130g);
        } else {
            this.adFeeDeductionLayout.setVisibility(8);
            m92049aU();
            LinearLayout linearLayout = this.feedReportWarnll;
            if (!C28482e.m93617j(this.f74130g) || C28482e.m93616i(this.f74130g) || C28478a.m93588c(this.f74130g)) {
                i = 8;
            } else {
                i = 0;
            }
            linearLayout.setVisibility(i);
            C37190a.m119551a(this.f74130g, this.feedReportWarnll);
        }
        AwemeStatus status = this.f74130g.getStatus();
        if (status == null) {
            this.mAwemeInCheckLayout.setVisibility(8);
        } else if (t || !status.isInReviewing()) {
            this.mAwemeInCheckLayout.setVisibility(8);
        } else {
            this.mAwemeInCheckLayout.setVisibility(0);
            this.mAwemeInCheckLayout.setOnTouchListener(new C10804a(0.5f, 1.0f));
        }
        if (t || status == null || status.isProhibited() || !this.f74130g.isPreview() || !status.isSelfSee() || !status.isReviewed()) {
            this.mAwemeInCheckIsPreviewLayout.setVisibility(8);
        } else {
            this.mAwemeInCheckIsPreviewLayout.setVisibility(0);
            this.mAwemeInCheckIsPreviewLayout.setOnTouchListener(new C10804a(0.5f, 1.0f));
        }
        if (t) {
            DmtTextView dmtTextView = this.mTxtProhibited;
            if (C33230ac.m107241p(this.f74130g) && this.f74130g.isProhibited()) {
                i2 = 0;
            }
            dmtTextView.setVisibility(i2);
        }
        if (this.mRootView != null) {
            this.mRootView.setBackgroundColor(this.f74129f.getResources().getColor(R.color.l3));
        }
        m92093d(video);
        if (this.f74116ae) {
            mo71691b(video);
        }
        if (this.f74252h != null) {
            this.f74252h.mo60134a("video_params", (Object) this.f74118ag);
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        m92048aT();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Aweme mo71695f(int i) {
        return this.f74130g;
    }

    /* renamed from: h */
    private void m92099h(int i) {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("pausePlayAnimation", (Object) Integer.valueOf(i));
        }
    }

    /* renamed from: i */
    private void m92103i(Aweme aweme) {
        this.f74130g = aweme;
        this.f74118ag.setAweme(aweme);
        m92041aM();
    }

    /* renamed from: j */
    private void m92106j(String str) {
        this.f74120ai = str;
        if (this.f74119ah) {
            C21780t.m72808a(false).mo57890a();
        }
    }

    /* renamed from: d */
    public final void mo71556d(int i) {
        m92105j(i);
        m92108k(i);
        if (i == 1) {
            m92083bs();
        }
    }

    /* renamed from: g */
    public final void mo71559g(boolean z) {
        this.f74252h.mo60134a("load_progress_bar", (Object) Boolean.valueOf(z));
    }

    /* renamed from: a */
    static final /* synthetic */ Point m92017a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    /* renamed from: i */
    private void m92104i(String str) {
        this.f74120ai = str;
        C21780t.m72808a(false).mo57890a();
        this.f74119ah = false;
    }

    /* renamed from: j */
    private static boolean m92107j(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        PoiStruct poiStruct = aweme.getPoiStruct();
        if (poiStruct == null || C6319n.m19593a(poiStruct.getPoiId()) || !poiStruct.isExpandable()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void mo71775k(boolean z) {
        if (this.f74100N != null) {
            if (z) {
                this.mHudView.setVisibility(0);
            } else {
                this.mHudView.setVisibility(8);
            }
            this.f74100N.mo104877a(z);
        }
    }

    /* renamed from: c */
    public final void mo71531c(Aweme aweme) {
        if (!(this.f74129f == null || aweme == null || this.f74252h == null)) {
            this.f74252h.mo60134a("handle_double_click", (Object) aweme);
        }
    }

    /* renamed from: f */
    public final void mo71558f(String str) {
        super.mo71558f(str);
        this.f74118ag.setEnterMethodValue(str);
        m92041aM();
    }

    /* renamed from: h */
    public final void mo71560h(boolean z) {
        this.f74097K = z;
        if (this.f74097K) {
            this.f74127d.mo107461e();
        } else {
            this.f74127d.mo107462f();
        }
    }

    /* renamed from: b */
    private void m92061b(UrlModel urlModel) {
        AwemeLabelModel awemeLabelModel;
        if (urlModel != null) {
            awemeLabelModel = new AwemeLabelModel();
            awemeLabelModel.setLabelType(1);
            awemeLabelModel.setUrlModels(urlModel);
        } else {
            awemeLabelModel = null;
        }
        if (!(this.f74130g == null || this.f74130g.videoLabels == null)) {
            if (this.f74130g.videoLabels.size() == 0) {
                this.f74130g.videoLabels.add(0, awemeLabelModel);
                return;
            }
            this.f74130g.videoLabels.set(0, awemeLabelModel);
        }
    }

    /* renamed from: e */
    private void m92094e(Video video) {
        if (((float) video.getHeight()) < C9738o.m28708b(mo71647T(), 300.0f)) {
            C28170bo.m92472a(this.mCoverView, R.drawable.amw);
        } else {
            C28170bo.m92472a(this.mCoverView, R.drawable.amx);
        }
    }

    /* renamed from: k */
    private void m92108k(int i) {
        if (!this.f74094H && i == 2 && C28066ac.m91704a(this.f74108X) && C28066ac.m91705a(mo71648U())) {
            m92075bk();
            FragmentActivity activity = this.f74132l.getActivity();
            if (activity != null) {
                DataCenter.m75849a(C0069x.m159a(activity), (C0043i) this.f74132l).mo60134a("tryShowLongClickGuideView", (Object) null);
            }
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        m92099h(2);
        this.f74098L.mo64598s();
        m92104i(str);
        if (!C25329c.m83231n(this.f74130g) && !C25072c.m82575a(this.f74130g)) {
            C42961az.m136380a(new C36993a(false));
        }
        if (!C25329c.m83221d(this.f74130g)) {
            C21780t.m72808a(false).mo57896b();
        }
    }

    /* renamed from: f */
    public final void mo71536f(boolean z) {
        this.f74098L.mo64578c(z);
        this.poiCardWebPageContainer.mo60986a(z);
        if (z) {
            this.mWidgetContainer.animate().alpha(0.0f).setDuration(200).start();
            this.f74093G = true;
            return;
        }
        this.mWidgetContainer.animate().alpha(1.0f).setDuration(200).start();
        if (this.f74093G) {
            this.f74093G = false;
        }
    }

    /* renamed from: g */
    public final void mo71697g(int i) {
        if (this.f74103Q == 4 || this.f74103Q <= i) {
            C25053a.m82489a(i, this.f74130g);
            C24671f.m80854d().mo65568a(i, this.mGradualBottomView, this.flInteractLayout);
        }
    }

    /* renamed from: b */
    private boolean m92063b(User user) {
        if (user == null || !user.isAdFake() || mo71648U() == null || this.f74130g == null || this.f74130g.isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m92095f(Video video) {
        if (video == null || !m92027a(video.getOriginCover())) {
            if (C6399b.m19946v()) {
                C28170bo.m92472a(this.mCoverView, R.drawable.amw);
            }
            SmartImageView smartImageView = this.mCoverView;
            StringBuilder sb = new StringBuilder("res://");
            sb.append(this.f74129f.getPackageName());
            sb.append("/2131100871");
            smartImageView.setImageURI(Uri.parse(sb.toString()));
            return;
        }
        C12133n.m35299a(C23400r.m76741a(video.getOriginCover())).mo29843a(ImagePiplinePriority.HIGH).mo29845a("VideoViewHolder").mo29844a((C12128i) this.mCoverView).mo29849a((C12112j) new C28523h(this));
    }

    /* renamed from: g */
    private void m92098g(String str) {
        C6921a.m21552a(4, "FeedAvatarView", "VideoViewHolder rev liveData!");
        if (this.f74252h != null) {
            this.f74252h.mo60134a("tryDismissEnterMusicGuide", (Object) Boolean.valueOf(true));
        }
        if (this.f74252h != null) {
            this.f74252h.mo60134a("dismiss_dou_pop", (Object) Boolean.valueOf(true));
        }
        C28312ah ahVar = new C28312ah(this.f74129f.hashCode(), this.f74108X);
        if (!TextUtils.isEmpty(str)) {
            ahVar.f74627c = str;
        }
        C28141am.m92411a(new C28311ag(mo71648U(), C28066ac.m91704a(this.f74108X)), ahVar, mo71648U());
    }

    /* renamed from: h */
    private void m92101h(String str) {
        this.f74120ai = str;
        if ((C28066ac.m91706b(mo71648U()) || C28066ac.m91705a(mo71648U())) && !C28207ak.m92713a(mo65711h())) {
            String str2 = "";
            if (this.f74130g != null) {
                str2 = this.f74130g.getAid();
            }
            if (!C28066ac.m91706b(mo71648U()) || !C28207ak.f74308a) {
                C21780t.m72808a(false).mo57890a().mo57897a(str, str2);
                this.f74119ah = true;
            }
        }
    }

    /* renamed from: i */
    private void m92102i(int i) {
        if (this.f74131k != null) {
            String str = "";
            try {
                str = this.f74131k.getString("request_id");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                this.f74130g.setRequestId(str);
            }
        }
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
        if (iIMService != null && iIMService.isNeedToContinuePlayInAct()) {
            iIMService.setNeedToContinuePlayInAct(false);
        }
        if (this.f74092F != null && this.f74130g != null) {
            this.f74092F.mo64929a(new C28318an(i, mo71695f(i)));
        }
    }

    /* renamed from: j */
    private void m92105j(int i) {
        if (this.f74130g.getAwemeRawAd() != null && this.f74130g.getAwemeRawAd().isAdPoiControl()) {
            return;
        }
        if ("homepage_fresh".equalsIgnoreCase(mo71648U()) || m92107j(this.f74130g)) {
            try {
                C0520q qVar = new C0520q();
                qVar.mo2151a((C0508m) new C0476c());
                C0516o.m2171a(this.mWidgetContainer, qVar);
                this.f74252h.mo60134a("show_poi_info", (Object) Integer.valueOf(i));
            } catch (NullPointerException e) {
                C6877n.m21407a("log_transition_empty", null, C6869c.m21381a().mo16887a("errMsg", e.getMessage()).mo16888b());
            }
        }
    }

    /* renamed from: m */
    private void m92111m(boolean z) {
        if (!C6399b.m19944t() && (("homepage_fresh".equalsIgnoreCase(mo71648U()) || "homepage_fresh_feed".equalsIgnoreCase(mo71648U())) && this.mRootView != null && this.mPoiDistance != null && this.mPoiDistanceLayout != null)) {
            if (z || TextUtils.isEmpty(this.f74130g.getDistance())) {
                this.mPoiDistanceLayout.setVisibility(8);
                return;
            }
            this.mPoiDistanceLayout.setVisibility(0);
            this.mPoiDistance.setText(this.f74130g.getDistance());
        }
    }

    /* renamed from: e */
    public final void mo71534e(int i) {
        this.f74143w = true;
        LayoutParams layoutParams = (LayoutParams) this.mWidgetContainer.getLayoutParams();
        layoutParams.bottomMargin = 0;
        this.mWidgetContainer.setLayoutParams(layoutParams);
        ((MarginLayoutParams) this.mBottomView.getLayoutParams()).bottomMargin = i;
        this.mBottomView.requestLayout();
    }

    /* renamed from: l */
    public final void mo71698l(boolean z) {
        if (this.f74123al) {
            C28167bl.f74267a = false;
            this.f74123al = false;
            C28167bl.f74268b = "";
            if (this.f74146z != null) {
                if (this.f74141u != null) {
                    this.f74141u.mo71909a(this.f74130g, false);
                }
                if (z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            VideoViewHolder.this.f74146z.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    ofFloat.setDuration(200);
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            VideoViewHolder.this.f74146z.setVisibility(8);
                        }
                    });
                    ofFloat.start();
                    return;
                }
                this.f74146z.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo71691b(Video video) {
        View a = this.f74127d.mo107454a();
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            this.f74114ac = layoutParams.width;
            this.f74115ad = layoutParams.height;
        } else if (video != null && video.getWidth() > 0 && video.getHeight() > 0) {
            this.f74114ac = video.getWidth();
            this.f74115ad = video.getHeight();
        } else if (a.getMeasuredWidth() <= 0 || a.getMeasuredHeight() <= 0) {
            a.post(new C28164bi(this, video));
        } else {
            this.f74114ac = a.getMeasuredWidth();
            this.f74115ad = a.getMeasuredHeight();
        }
    }

    /* renamed from: d */
    private void m92093d(Video video) {
        Aweme aweme = this.f74130g;
        this.f74135o.mo72145a(this.f74129f, aweme, mo71570u(), (View) this.mCoverView);
        this.f74135o.mo72146a(this.f74129f, aweme.getVideo(), (View) this.flInteractLayout);
        m92048aT();
        if (C25300bx.m83125a(this.f74130g, 3)) {
            m92095f(video);
        } else if (video == null || video.getPlayAddr() == null || C6307b.m19566a((Collection<T>) video.getPlayAddr().getUrlList()) || !m92027a(video.getOriginCover())) {
            C28170bo.m92471a(this.mCoverView, this.f74129f, R.drawable.blk);
        } else {
            if (!C6399b.m19946v()) {
                m92094e(video);
            }
            if (C28478a.m93589d(this)) {
                C12133n.m35299a(C23400r.m76741a(video.getOriginCover())).mo29845a("VideoViewHolder").mo29844a((C12128i) this.mCoverView).mo29849a((C12112j) new C28523h(this));
            } else {
                m92022a(aweme, video);
            }
        }
    }

    /* renamed from: g */
    private void m92096g(Aweme aweme) {
        if (C6399b.m19944t() || this.f74113ab == null) {
            return;
        }
        if ((!TextUtils.equals(C6399b.m19941q(), "local_test") && !C7163a.m22363a()) || C6384b.m19835a().mo15287a(AllVideoShowVSExperiment.class, true, "all_video_show_vs", C6384b.m19835a().mo15295d().all_video_show_vs, 0) != 2) {
            String U = mo71648U();
            C28344a.m93110a(aweme);
            String str = "";
            boolean z = true;
            if (C6384b.m19835a().mo15287a(AllVideoShowVSExperiment.class, true, "all_video_show_vs", C6384b.m19835a().mo15295d().all_video_show_vs, 0) != 1) {
                if (!(this.f74107W == null || this.f74107W.param == null)) {
                    str = this.f74107W.param.getFrom();
                }
                if (!TextUtils.equals("homepage_hot", U) && !TextUtils.equals("from_visual_search_result", str)) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            if (C7163a.m22363a()) {
                C6384b.m19835a().mo15287a(AllVideoShowVSExperiment.class, true, "all_video_show_vs", C6384b.m19835a().mo15295d().all_video_show_vs, 0);
            }
        }
    }

    /* renamed from: h */
    private void m92100h(Aweme aweme) {
        boolean z;
        if (TextUtils.equals(mo71648U(), "poi_rate_list") || TextUtils.equals(mo71648U(), "homestay_reservation_detail") || (TextUtils.equals(mo71648U(), "poi_page") && TextUtils.equals(m92072bh(), "rate"))) {
            z = true;
        } else {
            z = false;
        }
        if (!z || TextUtils.isEmpty(aweme.getRateScore())) {
            this.mPoiRatingContainer.setVisibility(8);
            return;
        }
        this.mPoiRatingContainer.setVisibility(0);
        this.mRatingBar.setStar(Float.valueOf(aweme.getRateScore()).floatValue());
        this.mRateText.setText(C1642a.m8034a(mo71647T().getResources().getString(R.string.d00), new Object[]{aweme.getRateScore()}));
    }

    /* renamed from: k */
    private void m92109k(Aweme aweme) {
        if (!C28167bl.f74267a && m92089by() && !m92043aO()) {
            C28167bl.f74267a = m92090bz();
            this.f74123al = C28167bl.f74267a;
            if (C28167bl.f74267a) {
                C28167bl.f74268b = aweme.getAid();
                int f = C6903bc.m21506y().mo57904f();
                int b = C6903bc.m21506y().mo57900b();
                int c = C6903bc.m21506y().mo57901c();
                if (f > 0 && b > 0 && c > 0) {
                    this.f74146z = this.mRootView.findViewById(f);
                    this.f74122ak = (DmtTextView) this.mRootView.findViewById(c);
                    try {
                        this.f74122ak.setText(C30199h.m98861a().getAddictionSettings().getPopupText());
                    } catch (NullValueException unused) {
                    }
                    this.f74146z.setVisibility(0);
                    this.f74146z.setAlpha(1.0f);
                    this.f74146z.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                        }
                    });
                    this.f74146z.setOnLongClickListener(new OnLongClickListener() {
                        public final boolean onLongClick(View view) {
                            return true;
                        }
                    });
                    final GestureDetector gestureDetector = new GestureDetector(this.f74146z.getContext(), new SimpleOnGestureListener() {
                        public final boolean onDoubleTap(MotionEvent motionEvent) {
                            return true;
                        }

                        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                            return true;
                        }

                        public final boolean onDown(MotionEvent motionEvent) {
                            return false;
                        }

                        public final void onLongPress(MotionEvent motionEvent) {
                            super.onLongPress(motionEvent);
                        }
                    });
                    this.f74146z.setOnTouchListener(new OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            gestureDetector.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                    C6903bc.m21506y().mo57903e();
                    this.f74121aj = (DmtTextView) this.mRootView.findViewById(b);
                    if (this.f74121aj != null) {
                        this.f74121aj.setOnClickListener(new OnClickListener() {
                            public final void onClick(View view) {
                                ClickInstrumentation.onClick(view);
                                VideoViewHolder.this.mo71698l(true);
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo71528b(int i) {
        mo71698l(false);
        this.f74145y = true;
        m92042aN();
        if (i == 1) {
            if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
                m92069be();
            }
            if (C6399b.m19944t()) {
                return;
            }
        }
        if (i != 6) {
            if (i == 5) {
                m92071bg();
            } else {
                m92099h(1);
            }
            if (!(i == 4 || i == 5)) {
                this.f74098L.mo64593o();
            }
            if (this.f74252h != null) {
                this.f74252h.mo60134a("holder_on_pause", (Object) Boolean.valueOf(true));
                this.f74252h.mo60134a("in_video_view_holder", (Object) Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: e */
    public final void mo71694e(Aweme aweme) {
        if (this.f74130g != null && aweme != null && TextUtils.equals(this.f74130g.getAid(), aweme.getAid()) && this.f74252h != null) {
            this.f74130g.setStatistics(aweme.getStatistics());
            C28498o.m93661a(this.f74130g, aweme);
            this.f74252h.mo60134a("awesome_update_data", (Object) this.f74118ag);
        }
    }

    /* renamed from: i */
    public final void mo71561i(boolean z) {
        if (z) {
            C1592h.m7855a((Callable<TResult>) new C28115b<TResult>(this.mRootView, this.mCoverView), C1592h.f5958b);
            C1592h.m7848a(200);
            return;
        }
        try {
            new C28115b(this.mRootView, this.mCoverView).call();
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public final void mo71562j(boolean z) {
        if (!C6399b.m19944t()) {
            if (TextUtils.equals("homepage_hot", mo71648U())) {
                C28344a.m93110a(mo65711h());
            }
        }
    }

    /* renamed from: g */
    private void m92097g(Video video) {
        boolean z = true;
        if (this.f74132l.getActivity() == null || !C28428o.m93438a(this.f74132l.getActivity()) || mo71542A() == null || !TextUtils.equals(mo71542A().getAid(), C28418f.m93413a().f74932b) || FeedSharePlayerViewModel.getViewModel(this.f74132l.getActivity()).hasBindCover) {
            UrlModel originCover = video.getOriginCover();
            if (!mo65711h().isAd() && PosterSRProcessorInitTask.NEED_POSTER_PROCESS) {
                z = false;
            }
            if (z) {
                if (C7163a.m22363a() && this.f74252h != null) {
                    StringBuilder sb = new StringBuilder("不进行超分，广告:");
                    sb.append(mo65711h().isAd());
                    sb.append(",超分初始化成功:");
                    sb.append(PosterSRProcessorInitTask.NEED_POSTER_PROCESS);
                    sb.append("AB:");
                    sb.append(C28346c.m93127a());
                    this.f74252h.mo60134a("poster_processor", (Object) sb.toString());
                }
                C12133n.m35299a(C23400r.m76741a(video.getOriginCover())).mo29845a("VideoViewHolder").mo29844a((C12128i) this.mCoverView).mo29849a((C12112j) new C28138aj(new WeakReference(this.mCoverView)));
                this.f74144x = null;
                return;
            }
            if (C7163a.m22363a() && this.f74252h != null) {
                this.f74252h.mo60134a("poster_processor", (Object) "开始进行超分");
            }
            this.f74144x = new C28140al(new WeakReference(this.mCoverView), this.f74252h);
            C28422j.m93422a(this.mCoverView, originCover, Priority.MEDIUM, this.f74144x, this.f74252h);
            return;
        }
        StringBuilder sb2 = new StringBuilder("show transparent cover for continue play aweme, original aweme id = ");
        sb2.append(mo71542A().getAid());
        C6921a.m21557a("VideoViewHolder.bind", sb2.toString());
        C28170bo.m92471a(this.mCoverView, this.f74129f, R.drawable.blk);
        FeedSharePlayerViewModel.getViewModel(this.f74132l.getActivity()).hasBindCover = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo71690b(View view) {
        if (this.f74252h != null) {
            C24217a.m79549a().setShouldSetTopWhenOpen(true);
            this.f74252h.mo60134a("video_open_comment_dialog", (Object) Boolean.valueOf(true));
        }
    }

    /* renamed from: c */
    public final void mo71530c(int i) {
        this.f74145y = false;
        mo71573x();
        if (this.f74252h != null) {
            this.f74252h.mo60134a("holder_on_resume", (Object) Integer.valueOf(i));
        }
        if (i == 2) {
            this.f74098L.mo64592n();
            return;
        }
        if (!C6399b.m19944t() && this.f74130g != null && this.f74130g.isAppAd()) {
            this.f74098L.mo64592n();
        }
        if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            m92070bf();
        }
    }

    /* renamed from: d */
    public void mo71533d(boolean z) {
        if ((this.f74107W.param.isHotSpot() && CleanModeManager2.m106210b(mo71647T())) || aB_()) {
            z = true;
        }
        super.mo71533d(z);
        mo71658a((View) this.mWidgetContainer, z);
        this.f74098L.mo64575b(z);
        this.poiCardWebPageContainer.mo60986a(z);
        if (z) {
            if (this.f74252h != null) {
                this.f74252h.mo60134a("dismiss_dou_pop", (Object) Boolean.valueOf(true));
            }
            if (this.f74252h != null) {
                this.f74252h.mo60134a("tryDismissEnterMusicGuide", (Object) Boolean.valueOf(true));
            }
        }
        if (C28066ac.m91706b(mo71648U())) {
            StringBuilder sb = new StringBuilder("openCleanMode in position ");
            sb.append(this.f74133m);
            sb.append(", clean is");
            sb.append(z);
            C6921a.m21552a(3, "VideoViewHolder", sb.toString());
        }
    }

    /* renamed from: e */
    public void mo71535e(boolean z) {
        boolean z2;
        this.f74098L.mo64578c(z);
        this.poiCardWebPageContainer.mo60986a(z);
        if (z) {
            this.mGradualBottomView.animate().alpha(0.0f).setDuration(200).start();
            this.mWidgetContainer.animate().alpha(0.0f).setDuration(200).start();
            this.f74093G = true;
        } else {
            this.mGradualBottomView.animate().alpha(1.0f).setDuration(200).start();
            this.mWidgetContainer.animate().alpha(1.0f).setDuration(200).start();
            if (this.f74093G) {
                this.f74093G = false;
            }
        }
        if (C28066ac.m91704a(this.f74108X) && !C28207ak.m92713a(this.f74130g)) {
            if (z) {
                C21780t.m72808a(false).mo57890a();
                m92104i(this.f74120ai);
                return;
            }
            C21780t.m72808a(false).mo57890a();
            if (!C43316v.m137250H()) {
                z2 = C43316v.m137450K().mo104916o();
            } else {
                z2 = C44933a.m141791a().mo107442b();
            }
            if (z2) {
                m92101h(this.f74120ai);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo71696f(Aweme aweme) {
        if (aweme != null) {
            if (this.f74100N != null) {
                this.f74100N.mo104878b();
            }
            boolean z = false;
            if (this.f74116ae) {
                C28510y.m93718a(this.f74127d.mo107454a());
                C28510y.m93718a((View) this.mCoverView);
                if (C32891b.m106468a().f85831a) {
                    ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(true);
                    C32891b.m106468a().mo84616a(false);
                }
            }
            if (this.f74105S != null) {
                this.f74105S.mo74178a(aweme);
            }
            StringBuilder sb = new StringBuilder("VideoViewHolder.bind() called with: aweme id = ");
            sb.append(aweme.getAid());
            sb.append(", position = ");
            sb.append(this.f74133m);
            sb.append(", is ad = ");
            sb.append(aweme.isAd());
            sb.append(", adId = ");
            sb.append(C28478a.m93585b(aweme));
            C6921a.m21561b(sb.toString());
            if (!m92058ax()) {
                this.f74127d.mo107455a((C44963i) this);
            }
            m92103i(aweme);
            this.f74098L.mo64563a(aweme);
            if (this.f74109Y != null) {
                this.f74109Y.mo68422a(aweme);
            }
            m92086bv();
            mo71638J();
            if ((C25329c.m83231n(aweme) && !C25329c.m83233p(aweme)) || ((C25072c.m82575a(aweme) && !C25072c.m82579e(aweme)) || ((C28066ac.m91705a(mo71648U()) && C32891b.m106468a().f85831a) || (C28066ac.m91706b(mo71648U()) && C32891b.m106468a().f85832b)))) {
                z = true;
            }
            mo71533d(z);
            ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104556b().observe(this.f74132l, this.f74124am);
            this.f74135o.mo72148c();
            this.mTitleView.setVisibility(8);
            this.tagLayout.setVisibility(8);
            this.mDislikeSomeoneTv.setVisibility(8);
            this.commerceTagFrameLayout.setVisibility(8);
            this.commerceGoodHalfCardContainer.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo71554b(Aweme aweme) {
        if (this.f74252h != null) {
            this.f74252h.mo60134a("video_resume_play", (Object) aweme);
        }
        if (this.mRootView != null) {
            this.mRootView.setBackgroundColor(this.f74129f.getResources().getColor(R.color.l3));
        }
        if (this.mCoverView != null && !C6399b.m19946v()) {
            C28170bo.m92472a(this.mCoverView, R.drawable.amw);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        if (this.f74130g != null) {
            int id = view.getId();
            if (id == R.id.title) {
                if (!this.f74098L.mo64580d() && !C43122ff.m136767b() && !C32698a.m105818a(this.f74130g)) {
                    if (this.f74130g != null && (!this.f74130g.isCanPlay() || this.f74130g.isDelete())) {
                        C10761a.m31399c(this.f74129f, (int) R.string.fp_).mo25750a();
                    } else if (this.f74130g.getAuthor() != null || C25300bx.m83125a(this.f74130g, 3)) {
                        m92102i(18);
                        this.f74098L.mo64581e();
                        ((C33276r) ((C33276r) ((C33276r) new C33276r().mo85312c(this.f74130g, this.f74107W.pageType).mo85310b(mo71648U()).mo85319i(FeedParamProvider.m94273a(this.f74129f).getPreviousPage()).mo85048a("click_name")).mo85282a(Boolean.valueOf(C28482e.m93609b(this.f74130g)))).mo85047a(mo71647T())).mo85252e();
                        new C33275q().mo85309f(this.f74130g).mo85307c(mo71648U()).mo85306b(this.f74130g.getAuthorUid()).mo85252e();
                        C28580o.m93830a(PAGE.PROFILE);
                        m92098g("");
                    }
                }
            } else if (id == R.id.fh) {
                this.f74130g.getAwemeRiskModel().setVoteStatus(1);
                this.mAllowDisplayBtn.setSelected(true);
                this.mDisallowDisplayBtn.setSelected(false);
                this.mVoteStatusTextView.setText(R.string.fq_);
                m92102i(25);
            } else if (id == R.id.a9_) {
                this.f74130g.getAwemeRiskModel().setVoteStatus(0);
                this.mDisallowDisplayBtn.setSelected(true);
                this.mAllowDisplayBtn.setSelected(false);
                this.mVoteStatusTextView.setText(R.string.fqb);
                m92102i(26);
            } else if (id == R.id.jg) {
                if (!TextUtils.isEmpty(this.f74130g.getAid())) {
                    SmartRouter.buildRoute(mo71647T(), "//webview").withParam("url", C1642a.m8034a("https://aweme.snssdk.com/falcon/douyin_falcon/reviewing/?itemId=%s", new Object[]{this.f74130g.getAid()})).withParam("hide_nav_bar", true).open();
                }
            } else if (id == R.id.eht) {
                C6903bc.m21498q().mo93600a(this.f74129f, this.f74130g);
                User author = this.f74130g.getAuthor();
                String str3 = "click_mission_icon";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", mo71648U()).mo59973a("group_id", this.f74130g.getAid());
                String str4 = "author_id";
                if (author != null) {
                    str2 = author.getUid();
                } else {
                    str2 = "";
                }
                C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59973a("entrance_location", C6903bc.m21498q().mo93599a()).f60753a);
            } else if (id == R.id.jf) {
                String str5 = null;
                try {
                    str5 = C30199h.m98861a().getFeConfigCollection().getItemReviewReason().getSchema();
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(str5)) {
                    StringBuilder sb = new StringBuilder("https://aweme.snssdk.com/falcon/douyin/review/reason/?id=");
                    sb.append(this.f74130g.getAid());
                    sb.append("&hide_nav_bar=1");
                    str = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str5);
                    sb2.append("/?id=");
                    sb2.append(this.f74130g.getAid());
                    sb2.append("&hide_nav_bar=1");
                    str = sb2.toString();
                }
                SmartRouter.buildRoute(mo71647T(), "//webview").withParam("url", str).open();
            }
        }
    }

    /* renamed from: a */
    private void m92024a(List<AwemeLabelModel> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (int i = 0; i < list.size(); i++) {
                AwemeLabelModel awemeLabelModel = (AwemeLabelModel) list.get(i);
                if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 1 && !C28482e.m93606a(this.f74130g) && this.f74130g.getStatus() != null && this.f74130g.isPrivate()) {
                    list.remove(awemeLabelModel);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71665a(User user, View view) {
        mo71664a(user);
    }

    /* renamed from: a */
    public final void mo71548a(Aweme aweme, int i) {
        this.f74133m = i;
        mo65708a(aweme);
    }

    /* renamed from: a */
    public static C28748a m92018a(Context context, BaseFeedPageParams baseFeedPageParams) {
        if (baseFeedPageParams == null) {
            return null;
        }
        return new C28144ap(baseFeedPageParams, context);
    }

    /* renamed from: c */
    private void m92091c(int i, int i2) {
        if (this.f74130g != null && this.f74130g.getVideo() != null) {
            this.f74130g.getVideo().setWidth(i);
            this.f74130g.getVideo().setHeight(i2);
            UrlModel originCover = this.f74130g.getVideo().getOriginCover();
            if (originCover != null) {
                originCover.setWidth(i);
                originCover.setHeight(i2);
            }
            try {
                this.f74135o.mo72147a(this.f74129f, this.f74130g.getVideo(), mo71570u(), (View) this.mCoverView);
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
    }

    /* renamed from: a */
    private void m92022a(Aweme aweme, Video video) {
        if (C28482e.m93614g(aweme)) {
            C28170bo.m92471a(this.mCoverView, this.f74129f, R.drawable.blk);
        } else if (C6399b.m19944t()) {
            C12133n.m35299a(C23400r.m76741a(video.getOriginCover())).mo29843a(ImagePiplinePriority.HIGH).mo29845a("VideoViewHolder").mo29844a((C12128i) this.mCoverView).mo29849a((C12112j) new C28523h(this));
        } else {
            m92097g(video);
        }
    }

    /* renamed from: b */
    private void m92062b(String str, int i, long j) {
        FrameLayout frameLayout = this.mRootView;
        C28147as asVar = new C28147as(this, j, i, str);
        frameLayout.post(asVar);
    }

    /* renamed from: a */
    private static JSONObject m92020a(Aweme aweme, BaseFeedPageParams baseFeedPageParams, String str) {
        return C28480c.m93600a(aweme, baseFeedPageParams.pageType, str, baseFeedPageParams.eventType);
    }

    /* renamed from: a */
    static final /* synthetic */ void m92023a(BaseFeedPageParams baseFeedPageParams, Context context, float f, float f2) {
        String str;
        if (!C43122ff.m136767b() && !C6903bc.m21484c().mo59240a()) {
            if (baseFeedPageParams.eventType == null) {
                str = "";
            } else {
                str = baseFeedPageParams.eventType;
            }
            if (C28502r.m93676a(str)) {
                C28324g gVar = new C28324g(true, baseFeedPageParams.awemeFromPage, f, f2, context.hashCode());
                C42961az.m136380a(gVar);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m92019a(String str, boolean z, String str2, long j, int i) throws Exception {
        String str3;
        String str4;
        String str5 = "show_dou_bubble";
        C22984d a = C22984d.m75611a().mo59973a("group_id", str);
        String str6 = "enter_from";
        if (z) {
            str3 = "personal_homepage";
        } else {
            str3 = "others_homepage";
        }
        C22984d a2 = a.mo59973a(str6, str3).mo59973a("author_id", str2);
        String str7 = "is_self";
        if (z) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        C6907h.m21524a(str5, (Map) a2.mo59973a(str7, str4).mo59971a("content_id", j).mo59970a("toast_type", i).f60753a);
        return null;
    }

    /* renamed from: a */
    private void m92021a(int i, int i2, int i3, int i4, int i5) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aweme_id", C28482e.m93613f(this.f74130g));
            jSONObject.put("aweme_position", this.f74133m);
            jSONObject.put("video_server_width", i2);
            jSONObject.put("video_server_height", i3);
            jSONObject.put("video_player_width", i4);
            jSONObject.put("video_player_height", i5);
            jSONObject.put("event_type", mo71648U());
            String str2 = "request_id";
            if (this.f74131k == null) {
                str = "";
            } else {
                str = this.f74131k.optString("request_id");
            }
            jSONObject.put(str2, str);
            StringBuilder sb = new StringBuilder("video_view_size_mismatch ");
            sb.append(jSONObject);
            C6921a.m21552a(4, "VideoViewHolder", sb.toString());
            C6159b.m19102a("video_view_size_mismatch", i, jSONObject);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    public VideoViewHolder(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams, C28254o oVar, C28412a aVar) {
        View view2 = view;
        Fragment fragment2 = fragment;
        BaseFeedPageParams baseFeedPageParams2 = baseFeedPageParams;
        this.f74129f = view.getContext();
        this.f74107W = baseFeedPageParams2;
        this.f74108X = this.f74107W.awemeFromPage;
        this.f74141u = oVar;
        this.f74138r = C6384b.m19835a().mo15292a(DisableAsyncBindAB.class, true, "disable_async_widgetbind", C6384b.m19835a().mo15295d().disable_async_widgetbind, true);
        if (aVar == null) {
            this.f74135o = new C28412a();
            if (VERSION.SDK_INT >= 17) {
                C28412a.m93382a(this.f74129f);
            }
        }
        try {
            ButterKnife.bind((Object) this, view);
        } catch (IllegalStateException unused) {
            C32346e.m104913a(getClass().getName(), view2, this.f74129f, 0);
        }
        this.f74098L = C28677a.m94348b().mo71732a(this, view, this.f74107W.pageType, mo71648U(), zVar, fragment);
        ICommerceService a = C24436a.m80356a();
        FrameLayout frameLayout = this.commerceTagFrameLayout;
        FrameLayout frameLayout2 = this.commerceGoodHalfCardContainer;
        int i = this.f74107W.pageType;
        int i2 = i;
        BaseFeedPageParams baseFeedPageParams3 = baseFeedPageParams2;
        FeedParam feedParam = this.f74107W.param;
        Fragment fragment3 = fragment2;
        View view3 = view2;
        this.f74099M = a.getECVideoViewHolder(view, frameLayout, frameLayout2, i2, feedParam, mo71648U(), zVar);
        view3.findViewById(R.id.ajk);
        this.f74098L.mo64564a(this.f74107W.param);
        if (C43316v.m137250H()) {
            this.f74088B = new VideoViewComponent();
            this.f74088B.mo107432a((ViewGroup) this.mRootView);
            this.f74127d = this.f74088B.f115582b;
        } else {
            this.f74127d = C44962h.m141884a((ViewGroup) this.mRootView);
            if (C43310q.m137426d() && (this.f74127d.mo107454a() instanceof SurfaceView)) {
                C6308d dVar = (C6308d) f74085U.get(this.f74129f);
                if (dVar == null) {
                    dVar = new C6308d();
                    f74085U.put(this.f74129f, dVar);
                }
                this.f74127d.mo107454a().setVisibility(8);
                this.f74127d.mo107455a((C44963i) this);
                dVar.mo15143a((SurfaceView) this.f74127d.mo107454a());
            }
        }
        this.mGradualBottomView.getLayoutParams().height = (C9738o.m28709b(this.f74129f) * 3) / 4;
        this.f74132l = fragment3;
        if (((Boolean) SharePrefCache.inst().getShowPlayerInfoUI().mo59877d()).booleanValue()) {
            this.f74100N = new C43214a(mo71647T(), this.mHudView);
        }
        this.f74092F = zVar;
        if (C6399b.m19946v()) {
            this.mCoverView.setBackground(null);
            this.mRootView.setBackgroundColor(this.f74129f.getResources().getColor(R.color.l3));
        }
        if (TextUtils.equals("upload", mo71648U())) {
            this.f74107W.setEventType(null);
        }
        this.mLongPressLayout.setTapListener(onTouchListener);
        mo71514H();
        if (f74086V.get(this.f74129f) == null) {
            f74086V.put(this.f74129f, new C6308d());
        }
        ((C6308d) f74086V.get(this.f74129f)).mo15143a(this);
        this.f74134n = new C28242c(view3);
        m92059ay();
        m92060az();
        this.f74118ag = VideoItemParams.newBuilder(baseFeedPageParams3, this.f74098L, fragment3, this.f74254j);
        if (C28916a.m95103a()) {
            VideoViewLandscapeHelper videoViewLandscapeHelper = new VideoViewLandscapeHelper(fragment, this.mRootView, mo71570u(), this.mCoverView, this.mlandscapeTipTv, this.f74141u.mo71911an(), this.f74252h, this.f74104R.mo101065d(), mo71648U(), this.f74107W.pageType);
            this.f74105S = videoViewLandscapeHelper;
        }
        this.f74111a = C23482j.m77098b(C6399b.m19921a());
        this.f74125b = C23482j.m77105f(C6399b.m19921a());
        this.f74126c = C28412a.m93381a();
        this.f74087A = C28412a.m93390b();
        if (this.mLongPressLayout != null) {
            if (DDislikeStyleExperiment.enableOptimizeLongPressTimeInterval()) {
                this.mLongPressLayout.setTimeInterval(C34943c.f91128x);
                return;
            }
            this.mLongPressLayout.setTimeInterval(VETransitionFilterParam.TransitionDuration_DEFAULT);
        }
    }
}
