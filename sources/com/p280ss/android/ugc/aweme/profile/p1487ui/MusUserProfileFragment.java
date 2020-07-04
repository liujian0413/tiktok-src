package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.base.p1058c.C23284c;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24510b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25384x;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p280ss.android.ugc.aweme.feed.event.C28341x;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28786aj;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowRelationTabActivity;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.api.C30030b;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33234ag;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.C35992k;
import com.p280ss.android.ugc.aweme.profile.api.BlockApi;
import com.p280ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p280ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.model.WatchStatus;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35663a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36342b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36343c;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1488a.C36328b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.C36580a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserViewMus;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapterMus.C36631a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolderMus;
import com.p280ss.android.ugc.aweme.profile.presenter.C36004ad;
import com.p280ss.android.ugc.aweme.profile.presenter.C36012aj;
import com.p280ss.android.ugc.aweme.profile.presenter.C36015al;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.profile.presenter.C36041o;
import com.p280ss.android.ugc.aweme.profile.presenter.C36042p;
import com.p280ss.android.ugc.aweme.profile.presenter.C36047u;
import com.p280ss.android.ugc.aweme.profile.tab.MusProfileTabImageView;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa;
import com.p280ss.android.ugc.aweme.profile.util.C36712af;
import com.p280ss.android.ugc.aweme.profile.util.C36717ag;
import com.p280ss.android.ugc.aweme.profile.util.C36767x;
import com.p280ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.story.live.C41994h;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43020co;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43105eq;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43150p;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43520q;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusUserProfileFragment */
public class MusUserProfileFragment extends MusAbsProfileFragment implements C0053p<Boolean>, C6310a, C28343z, C36040n, C36041o, C36042p, C36047u, C36328b, C36342b {

    /* renamed from: aA */
    public String f94816aA;

    /* renamed from: aB */
    List<String> f94817aB;

    /* renamed from: aC */
    C25663d<RecommendUserCardViewHolderMus> f94818aC = new C25663d<RecommendUserCardViewHolderMus>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo61737a(RecommendUserCardViewHolderMus recommendUserCardViewHolderMus) {
            if (recommendUserCardViewHolderMus != null && MusUserProfileFragment.this.f94843am != null) {
                User b = recommendUserCardViewHolderMus.mo92959b();
                if (b != null) {
                    C36767x.m118509a(b.getRequestId(), MusUserProfileFragment.this.mo92138p(b), b.getUid(), MusUserProfileFragment.this.f94844an);
                    if (MusUserProfileFragment.this.f94817aB == null) {
                        MusUserProfileFragment.this.f94817aB = new ArrayList();
                    }
                    if (!MusUserProfileFragment.this.f94817aB.contains(b.getUid())) {
                        C34202f.m110435a().mo86948a(1, b.getUid());
                        MusUserProfileFragment.this.f94817aB.add(b.getUid());
                    }
                }
            }
        }
    };

    /* renamed from: aD */
    private C36012aj f94819aD;

    /* renamed from: aE */
    private C36015al f94820aE;

    /* renamed from: aF */
    private ImageView f94821aF;

    /* renamed from: aG */
    private String f94822aG;

    /* renamed from: aH */
    private String f94823aH;

    /* renamed from: aI */
    private String f94824aI;

    /* renamed from: aJ */
    private boolean f94825aJ;

    /* renamed from: aK */
    private MTAwemeListFragment f94826aK;

    /* renamed from: aL */
    private OriginMusicListFragment f94827aL;

    /* renamed from: aM */
    private ImageView f94828aM;

    /* renamed from: aN */
    private boolean f94829aN;

    /* renamed from: aO */
    private boolean f94830aO;

    /* renamed from: aP */
    private Aweme f94831aP;

    /* renamed from: aQ */
    private String f94832aQ;

    /* renamed from: aR */
    private String f94833aR;

    /* renamed from: aS */
    private MainAnimViewModel f94834aS;

    /* renamed from: aT */
    private C24723e f94835aT = new C24723e();

    /* renamed from: aU */
    private View f94836aU;

    /* renamed from: aV */
    private boolean f94837aV = false;

    /* renamed from: aW */
    private boolean f94838aW = false;

    /* renamed from: aX */
    private String f94839aX;

    /* renamed from: aY */
    private String f94840aY;

    /* renamed from: aZ */
    private String f94841aZ;
    TextView adBottomMoreBtn;

    /* renamed from: al */
    public C36031j f94842al;

    /* renamed from: am */
    public C36004ad f94843am;

    /* renamed from: an */
    public String f94844an;

    /* renamed from: ao */
    public int f94845ao;

    /* renamed from: ap */
    public String f94846ap;

    /* renamed from: aq */
    public MTAwemeListFragment f94847aq;

    /* renamed from: ar */
    public String f94848ar;

    /* renamed from: as */
    protected String f94849as = "follow_button";

    /* renamed from: at */
    public C6309f f94850at;

    /* renamed from: au */
    public String f94851au = "";

    /* renamed from: av */
    public String f94852av;

    /* renamed from: aw */
    public String f94853aw;

    /* renamed from: ax */
    public String f94854ax;

    /* renamed from: ay */
    public String f94855ay;

    /* renamed from: az */
    public String f94856az;

    /* renamed from: ba */
    private String f94857ba;

    /* renamed from: bb */
    private boolean f94858bb = true;

    /* renamed from: bc */
    private String f94859bc;

    /* renamed from: bd */
    private String f94860bd;

    /* renamed from: be */
    private boolean f94861be;

    /* renamed from: bf */
    private float f94862bf;

    /* renamed from: bg */
    private String f94863bg;

    /* renamed from: bh */
    private String f94864bh;

    /* renamed from: bi */
    private String f94865bi;

    /* renamed from: bj */
    private String f94866bj;

    /* renamed from: bk */
    private boolean f94867bk = false;

    /* renamed from: bl */
    private FollowViewModel f94868bl;

    /* renamed from: bm */
    private boolean f94869bm;

    /* renamed from: bn */
    private long f94870bn = 0;

    /* renamed from: bo */
    private List<String> f94871bo = new ArrayList();

    /* renamed from: bp */
    private C28786aj f94872bp;
    TextView followBn;
    View followIv;
    View mFastFollowBtn;
    View mFastLeftFollow;
    View mFastLeftMsg;
    View mFastSendMsgBtn;
    FrameLayout mFlHead;
    View mIvMutual;
    AnimationImageView mLiveStatusView;
    RecommendCommonUserViewMus mRecommendCommonUserView;
    protected RelativeLayout mTitleBar;
    TextView mTvFollow;
    ImageView recommededUsersIv;
    TextView requestedBtn;
    Button sendMsgBtn;
    TextView txtAdBottomDes;
    View viewUserInfo;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo64929a(Object obj) {
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
    }

    /* renamed from: a */
    public final void mo91704a(boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: b */
    public final void mo72042b(RecommendList recommendList) {
    }

    /* renamed from: b */
    public final void mo91706b(User user) {
    }

    /* renamed from: d */
    public final void mo91715d() {
    }

    /* renamed from: e */
    public final void mo91721e(int i) {
    }

    /* renamed from: e */
    public final void mo91723e(boolean z) {
    }

    /* renamed from: f */
    public final void mo91724f(int i) {
    }

    /* renamed from: f */
    public final void mo91725f(User user) {
    }

    /* renamed from: f */
    public final void mo92117f(String str) {
    }

    /* renamed from: g */
    public final void mo91727g(int i) {
    }

    public String getUserId() {
        return this.f94844an;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo91958z() {
        return R.layout.fragment_user_mus;
    }

    /* renamed from: a */
    public final void mo92111a(boolean z) {
        this.f94830aO = z;
        setUserVisibleHint(z);
        if (getActivity() != null) {
            C23487o.m77149b((Activity) getActivity());
            if (z) {
                C23487o.m77155c((Activity) getActivity());
                if (this.f94531Q != null && !TextUtils.isEmpty(this.f94531Q.getBioEmail())) {
                    C36580a.m118031a("others_homepage", "email", this.f94531Q);
                }
                if (this.f94531Q != null && !TextUtils.isEmpty(this.f94531Q.getBioUrl())) {
                    C36580a.m118031a("others_homepage", "weblink", this.f94531Q);
                }
            } else {
                C43020co.m136532a((Activity) getActivity());
            }
        }
        if (this.f94834aS != null) {
            this.f94834aS.f85655c.setValue(Boolean.valueOf(z));
        }
        if (z) {
            mo92044I();
            this.f94837aV = false;
            m116856m(true);
            if (this.f94531Q != null && this.f94531Q.isLive()) {
                C41989d.m133483a(this.f94531Q.getUid(), this.f94531Q.roomId, "others_homepage", "others_photo", this.f94531Q.getRequestId(), -1, true, "");
            }
            mo91701a(C43150p.m136858b(this.f94531Q));
        } else {
            mo92045J();
        }
        if (this.f94716ab != null) {
            this.f94716ab.mo60574b(z);
        }
    }

    /* renamed from: a */
    public final void mo92107a(Aweme aweme) {
        if (isViewValid()) {
            this.f94831aP = aweme;
            if (this.f94831aP == null) {
                this.f94835aT.mo64720o();
                return;
            }
            this.f94848ar = this.f94831aP.getAid();
            this.f94835aT.mo64699a(getContext(), this.f94831aP);
            if (C25384x.m83530a(aweme, false)) {
                C43081e.m136670a(this.adBottomMoreBtn);
                this.adBottomMoreBtn.setBackground(new C24510b((float) C23486n.m77122a(2.0d), Color.parseColor(C25352e.m83242y(aweme))));
                this.adBottomMoreBtn.setText(C25384x.m83526a(getContext(), aweme, false));
            } else {
                m116861s(0);
            }
            if (aweme.getAwemeRawAd() != null && !TextUtils.isEmpty(C25352e.m83323a(aweme.getAwemeRawAd()))) {
                this.txtAdBottomDes.setText(C25352e.m83323a(aweme.getAwemeRawAd()));
            }
        }
    }

    /* renamed from: a */
    public final void mo92109a(String str, String str2) {
        this.f94844an = str;
        this.f94822aG = str2;
        if (this.f94827aL != null) {
            this.f94827aL.mo65501a(str, str2);
            this.f94827aL.f87871j = TextUtils.isEmpty(this.f94531Q.getUniqueId()) ? this.f94531Q.getShortId() : this.f94531Q.getUniqueId();
        }
        if (this.f94826aK != null) {
            this.f94826aK.mo65501a(str, str2);
        }
        if (this.f94847aq != null) {
            this.f94847aq.mo65501a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo91702a(User user) {
        if (isViewValid()) {
            super.mo91702a(user);
            this.f94867bk = true;
            this.f94531Q = user;
            mo92109a(user.getUid(), user.getSecUid());
            if (this.f94826aK != null) {
                this.f94826aK.mo90816a(this.f94531Q);
            }
            m116836Z();
            m116852k(C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q)));
            m116854l(this.f94531Q != null && this.f94531Q.isBlock());
            mo92079K();
            m116842ab();
            if (!TextUtils.equals(user.getUid(), this.f94844an)) {
                this.f94819aD.mo56976a(this.f94844an, this.f94822aG);
                return;
            }
            mo91925h(this.f94531Q);
            if (mo92056l()) {
                this.f94740l.setScrollable(false);
                this.f94739k.setScrollable(false);
            }
            m116841aa();
            mo92123h(!user.isShowFavoriteList());
        }
    }

    /* renamed from: a */
    public final void mo92108a(C28786aj ajVar) {
        this.f94872bp = ajVar;
    }

    /* renamed from: a */
    public final void mo91701a(UrlModel urlModel) {
        super.mo91701a(urlModel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92106a(BaseResponse baseResponse) throws Exception {
        this.f94531Q.setFollowerStatus(0);
        if (this.f94531Q.getFollowStatus() == 2) {
            this.f94531Q.setFollowStatus(1);
        }
        mo91698a(this.f94531Q.getFollowStatus(), this.f94531Q.getFollowerStatus());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92110a(Throwable th) throws Exception {
        Throwable a = C22814a.m75241a(th);
        if (a instanceof ApiServerException) {
            C22814a.m75242a(getContext(), (ApiServerException) a);
        } else {
            C6921a.m21559a(a);
        }
    }

    /* renamed from: a */
    public final void mo91736a(WatchStatus watchStatus) {
        if (watchStatus.watchStatus == 0) {
            C9738o.m28693a((Context) getActivity(), (int) R.string.cg4);
        } else {
            C9738o.m28693a((Context) getActivity(), (int) R.string.cg7);
        }
    }

    /* renamed from: a */
    public final void mo72038a(Exception exc) {
        C22814a.m75244a((Context) getActivity(), (Throwable) exc);
        m116859q(0);
    }

    /* renamed from: a */
    public final void mo72036a(final RecommendList recommendList) {
        if (this.f94818aC != null && this.mRecommendCommonUserView != null) {
            this.mRecommendCommonUserView.setOnViewAttachedToWindowListener(this.f94818aC);
            this.mRecommendCommonUserView.mo92929a(recommendList.getUserList(), recommendList.getRid());
            this.mRecommendCommonUserView.setOnItemOperationListener(new C36631a() {
                /* renamed from: b */
                public final void mo92145b(User user, int i) {
                    MusUserProfileFragment.this.mo92118f(false);
                }

                /* renamed from: d */
                public final void mo92147d(User user, int i) {
                    C36767x.m118511a(user.getRequestId(), user.getUid(), MusUserProfileFragment.this.f94844an);
                }

                /* renamed from: a */
                public final void mo92144a(User user, int i) {
                    C30030b.m98492a().dislikeRecommend(user.getUid());
                    C36767x.m118514b(user.getUid(), MusUserProfileFragment.this.mo92138p(user), user.getRequestId(), MusUserProfileFragment.this.f94844an);
                    MusUserProfileFragment.this.f94843am.mo91633a(user);
                }

                /* renamed from: c */
                public final void mo92146c(User user, int i) {
                    if (C6399b.m19946v()) {
                        if (user.getFollowStatus() == 0) {
                            C36767x.m118512a(recommendList.getRid(), user.getUid(), MusUserProfileFragment.this.f94851au, MusUserProfileFragment.this.f94844an);
                            C36767x.m118513a(recommendList.getLogPb().getImprId(), recommendList.getRid(), user.getUid(), MusUserProfileFragment.this.f94851au, MusUserProfileFragment.this.f94844an);
                            return;
                        }
                        C36767x.m118515b(recommendList.getRid(), user.getUid(), MusUserProfileFragment.this.f94851au, MusUserProfileFragment.this.f94844an);
                        C36767x.m118516b(recommendList.getLogPb().getImprId(), recommendList.getRid(), user.getUid(), MusUserProfileFragment.this.f94851au, MusUserProfileFragment.this.f94844an);
                    }
                }
            });
            if (recommendList != null && !C6307b.m19566a((Collection<T>) recommendList.getUserList())) {
                mo92118f(true);
            } else if (!this.f94869bm) {
                this.f94861be = true;
                this.mRecommendCommonUserView.mo92930a(true);
                if (C6399b.m19944t()) {
                    C36767x.m118508a(this.f94844an);
                }
                C36712af.m118371a(true, (View) this.mRecommendCommonUserView, this.viewUserInfo, this.f94862bf);
                m116859q(2);
            } else {
                m116859q(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo91872a() {
        m116846b(this.f94844an, this.f94822aG);
    }

    /* renamed from: r */
    public final boolean mo62081r() {
        m116847b(true, true);
        this.f94838aW = false;
        return false;
    }

    /* renamed from: S */
    private void m116829S() {
        if (this.f94716ab != null) {
            this.f94716ab.f61328b = new C36381bv(this);
        }
    }

    /* renamed from: ae */
    private FollowViewModel m116845ae() {
        if (this.f94868bl == null) {
            this.f94868bl = new FollowViewModel(this);
        }
        return this.f94868bl;
    }

    /* renamed from: K */
    public final void mo92079K() {
        if (getActivity() != null && isAdded()) {
            m116830T();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public final /* synthetic */ void mo92084P() {
        if (this.viewUserInfo != null) {
            this.f94862bf = (float) this.viewUserInfo.getHeight();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public final /* synthetic */ void mo92103Q() {
        if (this.viewUserInfo != null) {
            this.f94862bf = (float) this.viewUserInfo.getHeight();
        }
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("others_homepage");
    }

    public void onStop() {
        super.onStop();
        C34202f.m110435a().mo86951d();
    }

    /* renamed from: W */
    private String m116833W() {
        String str = "";
        if (!TextUtils.isEmpty(this.f94833aR)) {
            return this.f94833aR;
        }
        if (this.f94831aP != null) {
            return this.f94831aP.getRequestId();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo91939E() {
        return ((int) C9738o.m28708b(getContext(), 49.0f)) + this.mStatusView.getHeight();
    }

    public final void bC_() {
        if (this.f94739k != null && this.f94739k.getCurrentItem() != 0) {
            this.f94739k.setCurrentItem(0, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo91875g() {
        super.mo91875g();
        C34626j.m111876a(this.followIv);
        C34626j.m111876a(this.sendMsgBtn);
        C34626j.m111876a(this.requestedBtn);
    }

    public void onPause() {
        super.onPause();
        if (this.f94830aO) {
            mo92045J();
        }
        if (this.f94834aS != null) {
            this.f94834aS.f85655c.setValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: U */
    private OriginMusicListFragment m116831U() {
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(f94515y);
        sb.append(0);
        Fragment a = childFragmentManager.mo2644a(sb.toString());
        if (a instanceof OriginMusicListFragment) {
            return (OriginMusicListFragment) a;
        }
        return OriginMusicListFragment.m108624a(this.f94844an, false);
    }

    /* renamed from: X */
    private int m116834X() {
        int i = this.f94845ao;
        if (i == 4) {
            return 0;
        }
        switch (i) {
            case 0:
                if (this.f94531Q.isSecret()) {
                    return 4;
                }
                if (this.f94531Q.getFollowerStatus() == 1) {
                    return 2;
                }
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: Z */
    private void m116836Z() {
        mo91952m(this.f94531Q);
        this.f94740l.mo91836a(this.f94739k, this.f94516A.contains(Integer.valueOf(3)), false, this);
        mo92043G();
        this.f94713Y.notifyDataSetChanged();
    }

    /* renamed from: ab */
    private void m116842ab() {
        if (C43122ff.m136787r(this.f94531Q)) {
            this.f94828aM.setVisibility(8);
            this.recommededUsersIv.setVisibility(8);
        } else {
            this.f94828aM.setVisibility(0);
            this.f94750v.setVisibility(8);
        }
        if (!C43122ff.m136787r(this.f94531Q) && C35992k.m115951a()) {
            this.recommededUsersIv.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo91936A() {
        if (isViewValid()) {
            C6907h.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("others_homepage"));
            C6907h.m21524a("click_follow_count", (Map) new C22984d().mo59973a("enter_from", "others_homepage").f60753a);
            FollowRelationTabActivity.m97191a(getActivity(), this.f94531Q, "following_relation");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo91937B() {
        if (isViewValid()) {
            C6907h.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName("others_homepage"));
            C6907h.m21524a("click_fans_count", (Map) new C22984d().mo59973a("enter_from", "others_homepage").f60753a);
            if (this.f94531Q != null) {
                FollowRelationTabActivity.m97191a(getActivity(), this.f94531Q, "follower_relation");
            }
        }
    }

    /* renamed from: O */
    public final void mo92083O() {
        if (this.f94531Q != null) {
            C6907h.m21524a("click_block", (Map) C22984d.m75611a().mo59973a("others_homepage", "others_homepage").mo59973a("to_user_id", this.f94531Q.getUid()).f60753a);
            m116851j(this.f94531Q.isBlock());
        }
    }

    /* renamed from: e */
    public final void mo91720e() {
        super.mo91720e();
        mo91948k(this.f94531Q);
        if (C35992k.m115951a() && this.viewUserInfo != null) {
            this.viewUserInfo.post(new C36376bq(this));
            LayoutParams layoutParams = (LayoutParams) this.viewUserInfo.getLayoutParams();
            layoutParams.height = -2;
            this.viewUserInfo.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo91878j() {
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = TextUtils.equals(arguments.getString("profile_from", ""), "feed_detail");
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void mo92060o() {
        super.mo92060o();
        this.f94843am = null;
        mo92118f(false);
        m116859q(0);
        this.f94867bk = false;
        if (this.f94826aK != null) {
            this.f94826aK.mo90853y();
        }
        if (this.f94847aq != null) {
            this.f94847aq.mo90853y();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f94819aD != null) {
            this.f94819aD.mo59134U_();
            this.f94819aD = null;
        }
        if (this.f94842al != null) {
            this.f94842al.mo59134U_();
            this.f94842al = null;
        }
        if (this.f94820aE != null) {
            this.f94820aE.mo59134U_();
            this.f94820aE = null;
        }
        if (this.f94843am != null) {
            this.f94843am.mo86692c();
        }
    }

    /* renamed from: y */
    public final boolean mo91957y() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if ((activity instanceof MainActivity) || (activity instanceof DetailActivity)) {
                if (!ScrollSwitchStateManager.m98918a(activity).mo79723b("page_feed")) {
                    return true;
                }
                return false;
            } else if (activity instanceof UserProfileActivity) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: aa */
    private void m116841aa() {
        if (this.f94531Q != null && this.f94531Q.getGeneralPermission() != null && !TextUtils.isEmpty(this.f94531Q.getGeneralPermission().getProfileToast())) {
            C10761a.m31403c(getContext(), this.f94531Q.getGeneralPermission().getProfileToast()).mo25750a();
            C6907h.m21524a("show_punish_toast", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("show_type", C36694aa.m118348b(this.f94531Q)).f60753a);
        }
    }

    /* renamed from: ad */
    private void m116844ad() {
        if (this.f94819aD != null) {
            this.f94819aD.mo56976a(this.f94844an, this.f94822aG);
        }
        boolean b = C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q));
        if (b) {
            m116852k(b);
            if (this.f94847aq != null) {
                this.f94847aq.mo90837k();
            }
            if (this.f94826aK != null) {
                this.f94826aK.mo90837k();
            }
        } else {
            if (this.f94847aq != null) {
                this.f94847aq.mo90811A();
            }
            if (this.f94826aK != null) {
                this.f94826aK.mo90811A();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo91938D() {
        if (isViewValid() && this.f94531Q != null) {
            if (!this.f94531Q.isLive() || C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q))) {
                C6907h.m21524a("click_profile_icon", (Map) C22984d.m75611a().mo59973a("author_id", this.f94531Q.getUid()).mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "click_head").f60753a);
                HeaderDetailActivity.m116638a(getActivity(), this.f94736h, this.f94531Q, false, mo92058n());
                return;
            }
            C41994h.m133525a(getContext(), this.f94531Q, false, new C36040n() {
                public final void onFollowFail(Exception exc) {
                    MusUserProfileFragment.this.onFollowFail(exc);
                }

                public final void onFollowSuccess(FollowStatus followStatus) {
                    MusUserProfileFragment.this.onFollowSuccess(followStatus);
                    MusUserProfileFragment.this.f94531Q.setFollowStatus(followStatus.followStatus);
                    C41994h.m133525a(MusUserProfileFragment.this.getContext(), MusUserProfileFragment.this.f94531Q, false, null);
                }
            });
        }
    }

    /* renamed from: L */
    public final void mo92080L() {
        if (!C21115b.m71197a().isLogin()) {
            C32656f.m105746a((Fragment) this, this.f94860bd, "report");
            return;
        }
        if (!(this.f94531Q == null || this.f94820aE == null)) {
            C6907h.m21524a("click_post_notification", (Map) C22984d.m75611a().mo59973a("others_homepage", "others_homepage").mo59973a("to_user_id", this.f94531Q.getUid()).f60753a);
            this.f94820aE.mo56976a(this.f94531Q.getUid(), Integer.valueOf(this.f94531Q.getWatchwStatus()));
        }
    }

    /* renamed from: M */
    public final void mo92081M() {
        if (this.f94531Q != null) {
            C6907h.m21524a("report_user", (Map) C22984d.m75611a().mo59973a("others_homepage", "others_homepage").mo59973a("to_user_id", this.f94531Q.getUid()).f60753a);
            ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(getActivity(), "user", this.f94531Q.getUid(), this.f94531Q.getUid(), null);
        }
    }

    /* renamed from: N */
    public final void mo92082N() {
        User user = this.f94531Q;
        if (user == null) {
            user = new User();
            user.setUid(this.f94844an);
        }
        if (C25352e.m83221d(this.f94831aP)) {
            C30553b.m99810g().startChatWithAdLog(getContext(), C30553b.m99780a(this.f94531Q), new IMAdLog(this.f94831aP.getAwemeRawAd().getLogExtra(), String.valueOf(this.f94831aP.getAwemeRawAd().getCreativeId())));
        } else {
            C30553b.m99810g().startChat(getContext(), C30553b.m99780a(user));
        }
        C30560g.m99816a(this.f94844an);
        C30560g.m99819a(this.f94844an, this.f94848ar, this.f94832aQ, this.f94833aR, "click_stranger_chat_button");
    }

    public void onResume() {
        super.onResume();
        if (!(this.f94819aD == null || this.f94531Q == null || !this.f94531Q.isLive())) {
            mo91872a();
        }
        if (this.f94834aS != null && this.f94834aS.mo84438a() && TextUtils.equals((CharSequence) this.f94834aS.f85656d.getValue(), "page_profile")) {
            this.f94834aS.f85655c.setValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: p */
    public final void mo92065p() {
        super.mo92065p();
        this.f94862bf = C9738o.m28708b(getContext(), 20.0f);
        this.viewUserInfo.post(new C36382bw(this));
        LayoutParams layoutParams = (LayoutParams) this.viewUserInfo.getLayoutParams();
        layoutParams.height = -2;
        this.viewUserInfo.setLayoutParams(layoutParams);
        this.f94843am = null;
        mo92118f(false);
        m116859q(0);
        this.f94867bk = false;
        if (this.f94826aK != null) {
            this.f94826aK.mo90853y();
        }
        if (this.f94847aq != null) {
            this.f94847aq.mo90853y();
        }
    }

    /* renamed from: T */
    private void m116830T() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f94528N == this.f94713Y.mo92303f(1) && this.f94826aK != null && this.f94826aK.aO_()) {
            this.f94826aK.mo86064c_(C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q)));
            MTAwemeListFragment mTAwemeListFragment = this.f94826aK;
            if (this.f94531Q == null || !this.f94531Q.isBlocked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            mTAwemeListFragment.mo86904c(z2);
            this.f94826aK.aQ_();
        }
        if (this.f94528N == this.f94713Y.mo92303f(0) && this.f94847aq != null && this.f94847aq.aO_()) {
            this.f94847aq.mo86064c_(C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q)));
            MTAwemeListFragment mTAwemeListFragment2 = this.f94847aq;
            if (this.f94531Q == null || !this.f94531Q.isBlocked()) {
                z = false;
            } else {
                z = true;
            }
            mTAwemeListFragment2.mo86904c(z);
            this.f94847aq.aQ_();
        }
        if (this.f94528N == this.f94713Y.mo92303f(3) && this.f94827aL != null && this.f94827aL.aO_()) {
            GeneralPermission generalPermission = this.f94531Q.getGeneralPermission();
            if (generalPermission == null || generalPermission.getOriginalList() != 1) {
                this.f94827aL.mo86064c_(C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q)));
                OriginMusicListFragment originMusicListFragment = this.f94827aL;
                if (this.f94531Q == null || !this.f94531Q.isBlocked()) {
                    z3 = false;
                }
                originMusicListFragment.mo86904c(z3);
                this.f94827aL.aQ_();
            } else {
                this.f94827aL.ae_();
            }
        }
    }

    /* renamed from: Y */
    private String[] m116835Y() {
        Resources resources;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(this.f94853aw)) {
            this.f94853aw = getResources().getString(R.string.des);
        }
        if (TextUtils.isEmpty(this.f94856az)) {
            this.f94856az = getResources().getString(R.string.dm2);
        }
        arrayList.add(this.f94853aw);
        this.f94871bo.add("report_user");
        if (this.f94531Q != null && C21115b.m71197a().isLogin()) {
            if (this.f94531Q.isBlock()) {
                resources = getResources();
                i = R.string.fip;
            } else {
                resources = getResources();
                i = R.string.tj;
            }
            this.f94854ax = resources.getString(i);
            arrayList.add(this.f94854ax);
            if (this.f94531Q.isBlock()) {
                this.f94871bo.add("unblock");
            } else {
                this.f94871bo.add("block");
            }
            if (((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().mo59877d()).booleanValue() && this.f94531Q != null && this.f94531Q.getFollowerStatus() == 1) {
                this.f94871bo.add("remove_follower");
                this.f94855ay = getString(R.string.def);
                arrayList.add(this.f94855ay);
            }
            Resources resources2 = getResources();
            if (this.f94531Q.getWatchwStatus() == 0) {
                i2 = R.string.cg5;
            } else {
                i2 = R.string.cg2;
            }
            this.f94852av = resources2.getString(i2);
            if (C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q))) {
                if (C43122ff.m136761a(this.f94531Q.getFollowStatus())) {
                    arrayList.add(0, this.f94852av);
                    if (this.f94531Q.getWatchwStatus() == 0) {
                        this.f94871bo.add("turnon_post_notification");
                    } else {
                        this.f94871bo.add("turnoff_post_notification");
                    }
                }
            } else if (!this.f94531Q.isBlock()) {
                arrayList.add(0, this.f94852av);
                if (this.f94531Q.getWatchwStatus() == 0) {
                    this.f94871bo.add("turnon_post_notification");
                } else {
                    this.f94871bo.add("turnoff_post_notification");
                }
            }
            if (!this.f94531Q.isBlock() && C30553b.m99785a() && !C43122ff.m136767b()) {
                arrayList.add(this.f94856az);
                this.f94871bo.add("message");
            }
        }
        if (TextUtils.isEmpty(this.f94816aA)) {
            this.f94816aA = getResources().getString(R.string.dt9);
        }
        if (this.f94531Q != null && (C6861a.m21337f().isMe(this.f94531Q.getUid()) || !this.f94531Q.isSecret())) {
            arrayList.add(0, this.f94816aA);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.commercialize.utils.n.b(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.commercialize.utils.n.c(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82114aa(getContext(), r5.f94831aP);
        com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82116ac(getContext(), r5.f94831aP);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        if (r5.f94835aT.mo64708c() == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0141, code lost:
        com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83468b(getContext(), r5.f94831aP);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014b, code lost:
        com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83474c(getContext(), r5.f94831aP);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0154, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0155, code lost:
        return;
     */
    /* renamed from: ac */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m116843ac() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f94831aP
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f94831aP
            boolean r0 = r0.isAd()
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f94831aP
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f94831aP
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            java.lang.String r0 = r0.getType()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0028
            return
        L_0x0028:
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case 96801: goto L_0x0063;
                case 117588: goto L_0x0059;
                case 3083120: goto L_0x004f;
                case 3148996: goto L_0x0045;
                case 957829685: goto L_0x003b;
                case 1893962841: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x006c
        L_0x0031:
            java.lang.String r2 = "redpacket"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r1 = 5
            goto L_0x006c
        L_0x003b:
            java.lang.String r2 = "counsel"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r1 = 0
            goto L_0x006c
        L_0x0045:
            java.lang.String r2 = "form"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r1 = 4
            goto L_0x006c
        L_0x004f:
            java.lang.String r2 = "dial"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r1 = 3
            goto L_0x006c
        L_0x0059:
            java.lang.String r2 = "web"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r1 = 1
            goto L_0x006c
        L_0x0063:
            java.lang.String r2 = "app"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r1 = 2
        L_0x006c:
            r0 = 8
            r2 = 0
            switch(r1) {
                case 0: goto L_0x010c;
                case 1: goto L_0x0127;
                case 2: goto L_0x00cf;
                case 3: goto L_0x00b3;
                case 4: goto L_0x0093;
                case 5: goto L_0x0074;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0155
        L_0x0074:
            android.content.Context r1 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82116ac(r1, r3)
            android.content.Context r1 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82123aj(r1, r3)
            android.support.v4.app.FragmentActivity r1 = r5.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f94831aP
            com.ss.android.ugc.aweme.commercialize.d.b r4 = com.p280ss.android.ugc.aweme.profile.p1487ui.C36378bs.f95525a
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83449a(r1, r3, r2, r0, r4)
            goto L_0x0155
        L_0x0093:
            android.content.Context r1 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82120ag(r1, r2)
            android.content.Context r1 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82116ac(r1, r2)
            android.support.v4.app.FragmentActivity r1 = r5.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f94831aP
            android.support.v4.app.j r3 = r5.getChildFragmentManager()
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83442a(r1, r2, r3, r0)
            return
        L_0x00b3:
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82119af(r0, r1)
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82116ac(r0, r1)
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83479d(r0, r1)
            return
        L_0x00cf:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r5.f94835aT
            boolean r0 = r0.mo64712g()
            if (r0 == 0) goto L_0x00f9
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83446a(r0, r1)
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82116ac(r0, r1)
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82118ae(r0, r1)
            return
        L_0x00f9:
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r5.f94835aT
            boolean r0 = r0.mo64708c()
            if (r0 == 0) goto L_0x010b
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83468b(r0, r1)
            return
        L_0x010b:
            return
        L_0x010c:
            android.content.Context r1 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82114aa(r1, r3)
            android.content.Context r1 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82116ac(r1, r3)
            android.support.v4.app.FragmentActivity r1 = r5.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83449a(r1, r3, r2, r0, r2)
        L_0x0127:
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82114aa(r0, r1)
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82116ac(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.e r0 = r5.f94835aT
            boolean r0 = r0.mo64708c()
            if (r0 == 0) goto L_0x014b
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83468b(r0, r1)
            return
        L_0x014b:
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f94831aP
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83474c(r0, r1)
            return
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.MusUserProfileFragment.m116843ac():void");
    }

    /* renamed from: V */
    private void m116832V() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean a = C43122ff.m136761a(this.f94845ao);
        int X = m116834X();
        if (X == 4) {
            m116837a((Activity) getActivity());
        }
        int i = 0;
        if (this.f94845ao != 4 && !a) {
            i = 1;
        }
        C42961az.m136380a(new C23661d(X, this.f94531Q));
        if (C21115b.m71197a().isLogin()) {
            if (!TextUtils.isEmpty(this.f94846ap)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("enter_from", this.f94832aQ);
                    jSONObject.put("request_id", this.f94833aR);
                    if (!TextUtils.isEmpty(this.f94859bc)) {
                        jSONObject.put("poi_id", this.f94859bc);
                    }
                } catch (JSONException unused) {
                }
                if (C6319n.m19593a(this.f94840aY) || a) {
                    if (!a && this.f94835aT.mo64705a()) {
                        C24976t.m82003I(getContext(), this.f94831aP);
                    }
                    MobClick obtain = MobClick.obtain();
                    if (a) {
                        str3 = "follow_cancel";
                    } else {
                        str3 = "follow";
                    }
                    C6907h.onEvent(obtain.setEventName(str3).setLabelName("others_homepage").setValue(this.f94844an).setExtValueString(this.f94848ar).setJsonObject(jSONObject));
                    if (a) {
                        C6907h.m21524a("follow_cancel", (Map) C22984d.m75611a().mo59973a("to_user_id", this.f94844an).mo59973a("enter_from", "others_homepage").mo59973a("previous_page", this.f94851au).mo59973a("scene_id", "1007").f60753a);
                    }
                    if (TextUtils.equals(this.f94851au, "search_result") || TextUtils.equals(this.f94851au, "search_for_you_list")) {
                        C26807z zVar = C26807z.f70733a;
                        if (a) {
                            str4 = "search_follow_cancel";
                        } else {
                            str4 = "search_follow";
                        }
                        zVar.mo68584a(str4, this.f94844an, "others_homepage", true, "");
                    }
                } else {
                    C41989d.m133485a("others_homepage", "live", this.f94841aZ, this.f94840aY, Boolean.valueOf(C21115b.m71197a().getCurUserId().equals(this.f94841aZ)), this.f94844an, this.f94839aX);
                    C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("others_homepage").setValue(this.f94841aZ).setExtValueString(this.f94840aY).setJsonObject(new C6909j().mo16966a("enter_from", "live_aud").mo16966a("request_id", this.f94839aX).mo16966a("user_id", this.f94844an).mo16966a("user_type", this.f94857ba).mo16967a()));
                }
                if (!a && C6319n.m19593a(this.f94840aY)) {
                    C33280v e = new C33280v().mo85341b("others_homepage").mo85347f(this.f94866bj).mo85345e(this.f94851au);
                    if (this.f94531Q != null) {
                        str = this.f94531Q.getRequestId();
                    } else {
                        str = "";
                    }
                    C33280v g = e.mo85352o(str).mo85343c(this.f94849as).mo85348g(this.f94844an);
                    if (this.f94831aP == null) {
                        str2 = "";
                    } else {
                        str2 = this.f94831aP.getAid();
                    }
                    g.mo85351k(str2).mo85352o(m116833W()).mo85252e();
                }
            }
            mo91947k(X);
            if (this.f94842al != null) {
                int i2 = -1;
                if (this.f94531Q != null) {
                    i2 = this.f94531Q.getFollowerStatus();
                }
                this.f94842al.mo91679a(new C36034a().mo91684a(this.f94844an).mo91686b(this.f94822aG).mo91682a(i).mo91688c("others_homepage").mo91689d(i2).mo91681a());
            }
        } else {
            C6907h.m21518a((Context) getActivity(), "follow", "personal_homepage", this.f94844an, 0);
            C32656f.m105748a((Fragment) this, this.f94832aQ, "click_follow", C42914ab.m136242a().mo104633a("group_id", this.f94848ar).mo104633a("log_pb", C33230ac.m107234j(this.f94848ar)).f111445a, (C23305g) new C36374bo(this, X, i));
        }
    }

    /* renamed from: h */
    public final void mo92122h(String str) {
        this.f94851au = str;
    }

    /* renamed from: g */
    public final void mo92120g(String str) {
        this.f94832aQ = str;
    }

    /* renamed from: i */
    public final void mo92124i(String str) {
        this.f94866bj = str;
    }

    @C7709l
    public void onMobRequestIdEvent(C28341x xVar) {
        this.f94833aR = xVar.f74668a;
    }

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        m116830T();
    }

    /* renamed from: q */
    private void m116859q(int i) {
        if (C35992k.m115951a()) {
            mo92139p(i);
        }
    }

    /* renamed from: d */
    public void mo91717d(User user) {
        super.mo91717d(user);
        this.f94746r.mo92000a(this.f94531Q, (Aweme) null);
    }

    /* renamed from: g */
    public final void mo92121g(boolean z) {
        m116847b(z, false);
    }

    /* renamed from: k */
    private void m116852k(boolean z) {
        if (this.f94826aK != null) {
            this.f94826aK.mo86064c_(z);
        }
        if (this.f94847aq != null) {
            this.f94847aq.mo86064c_(z);
        }
        if (this.f94827aL != null) {
            this.f94827aL.mo86064c_(z);
        }
    }

    /* renamed from: l */
    private void m116854l(boolean z) {
        if (this.f94826aK != null) {
            this.f94826aK.mo86903b(z);
        }
        if (this.f94847aq != null) {
            this.f94847aq.mo86903b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C33248at mo92112b(C33248at atVar) {
        return atVar.mo85140c(this.f94851au).mo85147j(this.f94844an).mo85146i(this.f94848ar);
    }

    /* renamed from: j */
    public final void mo92126j(String str) {
        if (this.f94826aK != null) {
            this.f94826aK.mo90836g(str);
        }
        if (this.f94847aq != null) {
            this.f94847aq.mo90836g(str);
        }
    }

    public void onAdBottomClick(View view) {
        int id = view.getId();
        if (id == R.id.bc) {
            this.f94837aV = true;
            m116861s(C34943c.f91128x);
            return;
        }
        if (id == R.id.be) {
            m116843ac();
        }
    }

    public void onBack(View view) {
        if (!TextUtils.equals(this.f94846ap, "feed_detail")) {
            getActivity().finish();
        } else if (this.f94872bp != null) {
            this.f94872bp.mo74012a();
        }
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (TextUtils.equals("user", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(getActivity(), this.f94821aF, shareCompleteEvent);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("uid", this.f94844an);
            bundle.putString("sec_user_id", this.f94822aG);
        }
        super.onSaveInstanceState(bundle);
    }

    @C7709l
    public void onUpdateUserEvent(C23284c cVar) {
        if (TextUtils.equals(cVar.f61319a.getUid(), this.f94844an) && this.f94819aD != null) {
            this.f94819aD.mo91623a(cVar.f61319a);
        }
    }

    /* renamed from: p */
    public final int mo92138p(User user) {
        if (user == null || this.f94843am == null) {
            return 0;
        }
        return this.f94843am.mo91625a(user.getUid());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Boolean bool) {
        if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            if (this.f94847aq != null) {
                this.f94847aq.mo90829d(bool.booleanValue());
            }
            if (this.f94826aK != null) {
                this.f94826aK.mo90829d(bool.booleanValue());
            }
            mo92121g(bool.booleanValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void mo92123h(boolean z) {
        int i;
        if (this.f94740l.getTabCount() >= 2 && (this.f94740l.mo91833a(this.f94516A.indexOf(Integer.valueOf(1))) instanceof MusProfileTabImageView)) {
            MusProfileTabImageView musProfileTabImageView = (MusProfileTabImageView) this.f94740l.mo91833a(this.f94516A.indexOf(Integer.valueOf(1)));
            if (z) {
                i = m116685H();
            } else {
                i = R.drawable.ajn;
            }
            musProfileTabImageView.setImageResource(i);
        }
    }

    /* renamed from: r */
    private void m116860r(int i) {
        if (C43122ff.m136769b(this.f94531Q, false) || !C35992k.m115951a() || TextUtils.isEmpty(this.f94822aG)) {
            return;
        }
        if (!C35992k.m115951a() || i == 0) {
            if (C35992k.m115951a() && i == 0) {
                mo92118f(false);
            }
            return;
        }
        this.f94869bm = true;
        mo92118f(true);
    }

    /* renamed from: s */
    private void m116861s(int i) {
        if (isViewValid()) {
            int i2 = ((RelativeLayout.LayoutParams) this.f94836aU.getLayoutParams()).bottomMargin;
            if (i2 >= 0) {
                C43081e.m136668a(this.f94836aU, i2, (this.f94836aU.getMeasuredHeight() + 1) * -1, i).start();
            }
        }
    }

    /* renamed from: follow */
    public void mo92090i(View view) {
        if (view == this.followBn) {
            this.f94849as = "follow_button";
        } else if (view == this.mFastFollowBtn) {
            this.f94849as = "top_bar_follow_button";
        }
        if (!m116857m(view) && m116853k(view) && !m116855l(view)) {
            m116858n(view);
        }
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/user/?") || str.contains("/aweme/v1/aweme/post/?") || str.contains("/aweme/v1/aweme/favorite/?")) {
            C42961az.m136385f(aVar);
            m116844ad();
        }
    }

    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.f94844an = bundle.getString("uid");
            this.f94822aG = bundle.getString("sec_user_id");
        }
        super.onCreate(bundle);
        this.f94834aS = (MainAnimViewModel) C0069x.m159a(getActivity()).mo147a(MainAnimViewModel.class);
        this.f94834aS.f85655c.observe(this, this);
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid()) {
            if (C23645b.m77551a(exc)) {
                C23645b.m77550a(getChildFragmentManager(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: a */
                    public final void mo57592a() {
                        MusUserProfileFragment.this.f94842al.mo56975R_();
                    }

                    /* renamed from: b */
                    public final void mo57593b() {
                        C22814a.m75245a(MusUserProfileFragment.this.getActivity(), exc, R.string.b82);
                    }
                });
            } else {
                C22814a.m75245a(getActivity(), exc, R.string.b82);
            }
        }
    }

    @C7709l
    public void onWatchStatusEvent(WatchStatus watchStatus) {
        if (TextUtils.equals(watchStatus.userId, this.f94844an) && this.f94531Q != null && watchStatus.watchStatus != this.f94531Q.getWatchwStatus()) {
            if (watchStatus.watchStatus == 0) {
                if (this.f94531Q != null) {
                    this.f94531Q.setWatchStatus(watchStatus.watchStatus);
                }
            } else if (this.f94531Q != null) {
                this.f94531Q.setWatchStatus(watchStatus.watchStatus);
            }
        }
    }

    public void recommendUsersClick(View view) {
        if (C35992k.m115951a() && !TextUtils.isEmpty(this.f94822aG) && System.currentTimeMillis() - this.f94870bn >= 500) {
            this.f94870bn = System.currentTimeMillis();
            if (C35992k.m115951a()) {
                if (!this.f94861be) {
                    this.f94869bm = false;
                }
                mo92118f(!this.f94861be);
            }
        }
    }

    /* renamed from: a */
    private static void m116837a(Activity activity) {
        C22903bl privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = ((Integer) privacyAccountFollowCount.mo59877d()).intValue();
        if (intValue == 0) {
            new C10741a(activity).mo25657b((int) R.string.d50).mo25650a((int) R.string.bfm, (OnClickListener) null).mo25656a().mo25637a();
        } else if (intValue > 0 && intValue < 4) {
            C10761a.m31409e((Context) activity, (int) R.string.d51).mo25750a();
        }
        privacyAccountFollowCount.mo59871a(Integer.valueOf(intValue + 1));
    }

    /* renamed from: j */
    private void m116851j(boolean z) {
        if (z) {
            BlockApi.m115434a((Handler) this.f94850at, this.f94531Q.getUid(), 0);
            C30560g.m99817a("others_homepage", this.f94531Q.getUid());
            return;
        }
        C361894 r3 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == -2 || i != -1) {
                    C30560g.m99818a("cancel", MusUserProfileFragment.this.f94531Q.getUid(), "others_homepage");
                    dialogInterface.dismiss();
                } else {
                    dialogInterface.dismiss();
                    BlockApi.m115434a((Handler) MusUserProfileFragment.this.f94850at, MusUserProfileFragment.this.f94531Q.getUid(), 1);
                    C30560g.m99818a("success", MusUserProfileFragment.this.f94531Q.getUid(), "others_homepage");
                    if (TextUtils.equals(MusUserProfileFragment.this.f94846ap, "chat")) {
                        C30560g.m99821b(MusUserProfileFragment.this.f94531Q.getUid());
                    }
                    if (MusUserProfileFragment.this.f94845ao != 0) {
                        MusUserProfileFragment.this.f94845ao = 0;
                        MusUserProfileFragment.this.mo91947k(MusUserProfileFragment.this.f94845ao);
                    }
                }
            }
        };
        new C10741a(getContext()).mo25657b((int) R.string.tv).mo25658b((int) R.string.w_, (OnClickListener) r3).mo25650a((int) R.string.afn, (OnClickListener) r3).mo25656a().mo25637a();
        C30560g.m99818a("others_homepage", this.f94531Q.getUid(), "");
    }

    /* renamed from: l */
    private boolean m116855l(View view) {
        if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE() && this.f94845ao == 2) {
            Context context = getContext();
            if (context != null) {
                Dialog b = new C10741a(context).mo25649a((int) R.string.fiu).mo25658b((int) R.string.pp, (OnClickListener) null).mo25650a((int) R.string.fll, (OnClickListener) new C36388cb(this, view)).mo25656a().mo25638b();
                if (b.findViewById(R.id.e0u) instanceof TextView) {
                    ((TextView) b.findViewById(R.id.e0u)).setTextColor(getResources().getColor(R.color.lk));
                }
                if (b.findViewById(R.id.dsf) != null) {
                    b.findViewById(R.id.dsf).setVisibility(8);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    private void m116856m(boolean z) {
        if (!isViewValid() || this.f94837aV) {
            return;
        }
        if ((this.f94835aT.mo64707b() || this.f94835aT.mo64712g()) && this.f94835aT.mo64710e()) {
            int i = ((RelativeLayout.LayoutParams) this.f94836aU.getLayoutParams()).bottomMargin;
            if (i < 0) {
                C43081e.m136668a(this.f94836aU, i, 0, (int) C34943c.f91128x).start();
            }
            if (z) {
                C24976t.m82020Z(getContext(), this.f94831aP);
            }
        }
    }

    /* renamed from: t */
    private void m116862t(int i) {
        if (C30553b.m99785a() || !(i == 1 || i == 2)) {
            this.followBn.setBackgroundResource(R.drawable.bb0);
            this.followBn.setText(R.string.cck);
            this.followBn.setTextColor(getResources().getColor(R.color.a6c));
            return;
        }
        this.sendMsgBtn.setVisibility(8);
        this.followBn.setVisibility(0);
        m116840a(true, false);
        this.followIv.setVisibility(8);
        this.followBn.setBackgroundResource(R.drawable.afq);
        this.followBn.setTextColor(getResources().getColor(R.color.a5d));
        this.followBn.setText(R.string.b9_);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo91944c(View view) {
        super.mo91944c(view);
        this.f94828aM = (ImageView) view.findViewById(R.id.ck_);
        if (C7213d.m22500a().mo18745aH() && C6399b.m19944t()) {
            if (C6399b.m19946v()) {
                this.f94828aM.setImageResource(R.drawable.alb);
            } else {
                this.f94828aM.setImageResource(R.drawable.alc);
            }
        }
        this.f94736h.setBorderColor(R.color.ye);
        if (TextUtils.equals(this.f94844an, C21115b.m71197a().getCurUserId())) {
            this.f94743o.setVisibility(0);
        }
    }

    /* renamed from: o */
    public final void mo92127o(User user) {
        if (isViewValid()) {
            if (user != null) {
                this.f94535U.mo93194a(user);
                if (this.f94819aD == null) {
                    this.f94819aD = new C36012aj();
                    this.f94819aD.mo66537a(this);
                    this.f94819aD.f94218e = this.f94832aQ;
                }
                this.f94819aD.mo91624a(user, false);
            }
            if (this.f94526L != null) {
                this.f94526L.mo92558s();
            }
            mo91940F();
        }
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (TextUtils.equals(followStatus.userId, this.f94844an)) {
            mo91947k(followStatus.followStatus);
            if (this.f94531Q != null && followStatus.followStatus != this.f94531Q.getFollowStatus()) {
                if (followStatus.followStatus == 0) {
                    if (this.f94531Q != null && !C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q))) {
                        int followerCount = this.f94531Q.getFollowerCount() - 1;
                        this.f94531Q.setFollowerCount(followerCount);
                        mo91697a(followerCount);
                        this.f94531Q.setFollowStatus(followStatus.followStatus);
                    }
                } else if (followStatus.followStatus == 1 && this.f94531Q != null && !C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q))) {
                    int followerCount2 = this.f94531Q.getFollowerCount() + 1;
                    this.f94531Q.setFollowerCount(followerCount2);
                    mo91697a(followerCount2);
                    this.f94531Q.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        User user = this.f94531Q;
        if (user == null) {
            user = new User();
            user.setUid(this.f94844an);
            user.setFollowStatus(followStatus.followStatus);
        }
        C30553b.m99810g().updateIMUser(C30553b.m99780a(user));
        mo91947k(followStatus.followStatus);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("follow_status", followStatus.followStatus);
        } catch (JSONException unused) {
        }
        if ((followStatus.followStatus == 1 || followStatus.followStatus == 4) && user.isBlock()) {
            user.setBlock(false);
            m116844ad();
        }
        m116860r(followStatus.followStatus);
        C42961az.m136380a(new C43520q("userFollowStatusChange", jSONObject));
    }

    /* renamed from: k */
    private boolean m116853k(View view) {
        int i;
        int i2;
        if (this.f94531Q == null) {
            return false;
        }
        if (!C21115b.m71197a().isLogin()) {
            C32656f.m105748a((Fragment) this, this.f94832aQ, "click_follow", C42914ab.m136242a().mo104633a("group_id", this.f94848ar).mo104633a("log_pb", C33230ac.m107234j(this.f94848ar)).f111445a, (C23305g) new C36384by(this, view));
            return false;
        } else if (this.f94845ao != 0) {
            return true;
        } else {
            if (this.f94531Q.getGeneralPermission() != null) {
                i = this.f94531Q.getGeneralPermission().getFollowToastType();
            } else {
                i = 0;
            }
            if (i == 1) {
                new C10741a(view.getContext()).mo25649a((int) R.string.h2).mo25657b((int) R.string.h3).mo25650a((int) R.string.ap5, C36385bz.f95533a).mo25656a().mo25638b();
                C6907h.m21524a("show_punish_pop", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("show_type", C36694aa.m118348b(this.f94531Q)).f60753a);
                return false;
            } else if (i == 2 || i == 3 || i == 4) {
                C10741a aVar = new C10741a(view.getContext());
                if (i == 4) {
                    i2 = R.string.hk;
                } else {
                    i2 = R.string.hh;
                }
                aVar.mo25657b(i2).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C6907h.m21524a("choose_punish_pop", (Map) new C22984d().mo59970a("is_follow", 0).f60753a);
                    }
                }).mo25650a((int) R.string.b7r, (OnClickListener) new C36387ca(this, view)).mo25656a().mo25638b();
                C6907h.m21524a("show_punish_pop", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("show_type", C36694aa.m118348b(this.f94531Q)).f60753a);
                return false;
            } else if (i == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: m */
    private boolean m116857m(View view) {
        if (this.f94531Q != null && this.f94531Q.isBlock && !C43122ff.m136761a(this.f94845ao)) {
            Context context = getContext();
            if (context != null) {
                new C10741a(context).mo25649a((int) R.string.fjb).mo25657b((int) R.string.fja).mo25650a((int) R.string.b7r, (OnClickListener) new C36389cc(this, view)).mo25658b((int) R.string.w_, (OnClickListener) null).mo25656a().mo25637a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private void m116858n(View view) {
        if (isViewValid() && isAdded() && this.f94531Q != null && !C27326a.m89579a(view, 300)) {
            if (C43122ff.m136767b()) {
                C10761a.m31409e(C6399b.m19921a(), (int) R.string.a3c).mo25750a();
            } else if (!C36390cd.m117628a(getActivity())) {
                C9738o.m28693a((Context) getActivity(), (int) R.string.cjs);
            } else {
                if (!TextUtils.isEmpty(this.f94864bh)) {
                    mo92120g(this.f94864bh);
                }
                if (this.f94845ao == 4) {
                    C25712a aVar = new C25712a(getActivity());
                    aVar.mo66614a((CharSequence[]) new String[]{getActivity().getResources().getString(R.string.wj), getActivity().getResources().getString(R.string.w_)}, (OnClickListener) new C36373bn(this));
                    aVar.mo66615b();
                    return;
                }
                m116832V();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo92118f(boolean z) {
        if (this.f94861be != z) {
            if (z) {
                if (this.f94817aB == null) {
                    this.f94817aB = new ArrayList();
                } else {
                    this.f94817aB.clear();
                }
                m116859q(1);
                if (this.f94843am == null) {
                    this.f94843am = new C36004ad(new RecommendCommonUserModel(), this);
                } else {
                    this.f94843am.mo91626a();
                    RecommendList d = this.f94843am.mo91636d();
                    if (d != null && !C6307b.m19566a((Collection<T>) d.getUserList())) {
                        if (!C6399b.m19946v() || !this.f94869bm || d.getUserList().size() >= 3) {
                            if (C6399b.m19944t()) {
                                C36767x.m118508a(this.f94844an);
                            }
                            this.mRecommendCommonUserView.setPageType(0);
                            this.mRecommendCommonUserView.mo92929a(d.getUserList(), d.getRid());
                            C36712af.m118371a(true, (View) this.mRecommendCommonUserView, this.viewUserInfo, this.f94862bf);
                            this.f94861be = true;
                            m116859q(2);
                            return;
                        }
                        m116859q(0);
                        return;
                    }
                }
                this.f94843am.mo91631a(30, this.f94822aG, 1, C43161e.m136882a(), (String) null, C43161e.m136884b());
                return;
            }
            if (this.f94843am != null) {
                this.f94843am.mo91634a(this.mRecommendCommonUserView.getData());
            }
            C36712af.m118371a(false, (View) this.mRecommendCommonUserView, this.viewUserInfo, this.f94862bf);
            this.f94861be = false;
            m116859q(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo92125j(View view) {
        IIMService a = C30553b.m99808a(false);
        if (!C30553b.m99785a() || a == null) {
            mo92090i(this.followIv);
            return;
        }
        if (C25352e.m83221d(this.f94831aP)) {
            C30553b.m99810g().startChatWithAdLog(getContext(), C30553b.m99780a(this.f94531Q), new IMAdLog(this.f94831aP.getAwemeRawAd().getLogExtra(), String.valueOf(this.f94831aP.getAwemeRawAd().getCreativeId())));
        } else {
            a.startChat(getContext(), C30553b.m99780a(this.f94531Q));
        }
        C30560g.m99816a(this.f94531Q.getUid());
        C30560g.m99819a(this.f94844an, this.f94848ar, this.f94832aQ, this.f94833aR, "top_bar_follow_button");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo91949l(int i) {
        String str;
        if (i == 3) {
            if (this.f94827aL == null) {
                this.f94827aL = m116831U();
                this.f94827aL.mo92306h(C43105eq.m136725a(3));
            }
            this.f94827aL.f87866e = this;
            OriginMusicListFragment originMusicListFragment = this.f94827aL;
            if (TextUtils.isEmpty(this.f94531Q.getUniqueId())) {
                str = this.f94531Q.getShortId();
            } else {
                str = this.f94531Q.getUniqueId();
            }
            originMusicListFragment.f87871j = str;
            this.f94827aL.mo65501a(this.f94844an, this.f94822aG);
            mo91942a((ProfileListFragment) this.f94827aL, Integer.valueOf(3));
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (i == 0) {
            if (this.f94847aq == null) {
                this.f94847aq = m116849d(0, 1);
                this.f94847aq.mo90817a(this.f94722ah);
                MTAwemeListFragment mTAwemeListFragment = this.f94847aq;
                if (this.f94528N != mo92068t()) {
                    z2 = false;
                }
                mTAwemeListFragment.mo90832e(z2);
                this.f94847aq.mo92306h(C43105eq.m136725a(0));
                this.f94847aq.mo90831e(this.f94851au);
            }
            this.f94847aq.mo65501a(this.f94844an, this.f94822aG);
            mo91942a((ProfileListFragment) this.f94847aq, Integer.valueOf(0));
            return;
        }
        int i2 = 2;
        if (i == 2) {
            if (this.f94826aK == null) {
                this.f94826aK = m116849d(1, 2);
                this.f94826aK.mo90817a(this.f94722ah);
                MTAwemeListFragment mTAwemeListFragment2 = this.f94826aK;
                int i3 = this.f94528N;
                if (!mo92068t()) {
                    i2 = 1;
                }
                if (i3 == i2) {
                    z = true;
                }
                mTAwemeListFragment2.mo90832e(z);
                this.f94826aK.mo92306h(C43105eq.m136725a(1));
                this.f94826aK.mo90831e(this.f94851au);
            }
            this.f94826aK.mo65501a(this.f94844an, this.f94822aG);
            this.f94826aK.mo90818a((C36343c) new C36383bx(this));
            mo91942a((ProfileListFragment) this.f94826aK, Integer.valueOf(1));
        }
    }

    public void onImClick(View view) {
        if (this.f94531Q != null) {
            if (view.equals(this.sendMsgBtn)) {
                IIMService a = C30553b.m99808a(false);
                if (!C30553b.m99785a() || a == null) {
                    mo92090i(this.followIv);
                    return;
                }
                if (C25352e.m83221d(this.f94831aP)) {
                    C30553b.m99810g().startChatWithAdLog(getContext(), C30553b.m99780a(this.f94531Q), new IMAdLog(this.f94831aP.getAwemeRawAd().getLogExtra(), String.valueOf(this.f94831aP.getAwemeRawAd().getCreativeId())));
                } else {
                    a.startChat(getContext(), C30553b.m99780a(this.f94531Q));
                }
                C30560g.m99816a(this.f94531Q.getUid());
                C30560g.m99819a(this.f94844an, this.f94848ar, this.f94832aQ, this.f94833aR, "click_message");
            } else if (view.equals(this.followIv) || view.equals(this.requestedBtn)) {
                mo92090i(view);
            }
        }
    }

    public void onReport(View view) {
        if (this.f94531Q != null && !C27326a.m89578a(view)) {
            C6907h.m21524a("click_more_action", (Map) C22984d.m75611a().mo59973a("others_homepage", "others_homepage").f60753a);
            if (C7213d.m22500a().mo18777ao() != 1) {
                new C33234ag().mo85082b("more_action_list").mo85081a("personal_detail").mo85252e();
                C25712a aVar = new C25712a(getActivity());
                final String[] Y = m116835Y();
                aVar.mo66614a((CharSequence[]) Y, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (TextUtils.equals(Y[i], MusUserProfileFragment.this.f94852av)) {
                            MusUserProfileFragment.this.mo92080L();
                        } else if (TextUtils.equals(Y[i], MusUserProfileFragment.this.f94853aw)) {
                            MusUserProfileFragment.this.mo92081M();
                        } else if (TextUtils.equals(Y[i], MusUserProfileFragment.this.f94854ax)) {
                            MusUserProfileFragment.this.mo92083O();
                        } else if (TextUtils.equals(Y[i], MusUserProfileFragment.this.f94855ay)) {
                            MusUserProfileFragment.this.f94850at.sendEmptyMessage(56);
                        } else if (TextUtils.equals(Y[i], MusUserProfileFragment.this.f94856az)) {
                            MusUserProfileFragment.this.mo92082N();
                        } else if (TextUtils.equals(Y[i], MusUserProfileFragment.this.f94816aA)) {
                            C36717ag.m118376a(MusUserProfileFragment.this.getActivity(), MusUserProfileFragment.this.f94531Q, MusUserProfileFragment.this.f94847aq.mo90852x());
                        }
                        dialogInterface.dismiss();
                    }
                });
                aVar.mo66612a(C36375bp.f95522a);
                try {
                    aVar.mo66615b();
                } catch (NotFoundException unused) {
                }
            } else if (this.f94531Q != null) {
                this.f94871bo.clear();
                m116835Y();
                String[] strArr = new String[this.f94871bo.size()];
                this.f94871bo.toArray(strArr);
                C36717ag.m118380a((Handler) this.f94850at, (Activity) getActivity(), this.f94531Q, (List<Aweme>) this.f94847aq.mo90852x(), strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo92139p(int i) {
        if (this.recommededUsersIv != null) {
            switch (i) {
                case 0:
                    this.recommededUsersIv.setContentDescription(getResources().getString(R.string.d6g));
                    this.recommededUsersIv.clearAnimation();
                    this.recommededUsersIv.setImageResource(R.drawable.ayz);
                    this.recommededUsersIv.setRotation(-180.0f);
                    this.recommededUsersIv.animate().rotation(0.0f).start();
                    return;
                case 1:
                    this.recommededUsersIv.clearAnimation();
                    this.recommededUsersIv.setImageResource(R.drawable.abo);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setRepeatCount(-1);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setDuration(600);
                    this.recommededUsersIv.startAnimation(rotateAnimation);
                    return;
                case 2:
                    this.recommededUsersIv.setContentDescription(getResources().getString(R.string.d6g));
                    this.recommededUsersIv.clearAnimation();
                    this.recommededUsersIv.setImageResource(R.drawable.ayy);
                    this.recommededUsersIv.setRotation(-180.0f);
                    this.recommededUsersIv.animate().rotation(0.0f).start();
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo91707b(Exception exc) {
        super.mo91707b(exc);
        this.f94829aN = true;
    }

    public void handleMsg(Message message) {
        boolean z;
        int i;
        if (isViewValid()) {
            int i2 = message.what;
            Object obj = message.obj;
            if (i2 == 30) {
                if (obj instanceof ExecutionException) {
                    obj = ((ExecutionException) obj).getCause();
                }
                if (obj instanceof ApiServerException) {
                    ApiServerException apiServerException = (ApiServerException) obj;
                    int errorCode = apiServerException.getErrorCode();
                    if (!(errorCode == 3070 || errorCode == 3071 || errorCode == 3072)) {
                        C9738o.m28697a(C6399b.m19921a(), apiServerException.getErrorMsg());
                    }
                } else if (obj instanceof Exception) {
                    C9738o.m28693a(C6399b.m19921a(), (int) R.string.cjm);
                } else if (obj instanceof BlockStruct) {
                    int i3 = ((BlockStruct) obj).blockStatus;
                    User user = this.f94531Q;
                    if (i3 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    user.setBlock(z);
                    Context a = C6399b.m19921a();
                    Resources resources = getResources();
                    if (i3 == 1) {
                        i = R.string.ic;
                    } else {
                        i = R.string.fip;
                    }
                    C9738o.m28697a(a, resources.getString(i));
                    if (i3 == 1) {
                        this.f94531Q.setFollowStatus(0);
                        mo92065p();
                        m116854l(true);
                        if (this.f94847aq != null) {
                            this.f94847aq.ae_();
                        }
                        if (this.f94826aK != null) {
                            this.f94826aK.ae_();
                        }
                        if (this.f94827aL != null) {
                            this.f94827aL.ae_();
                        }
                        C42961az.m136380a(new C35663a());
                    } else {
                        m116844ad();
                    }
                    C30553b.m99810g().updateIMUser(C30553b.m99780a(this.f94531Q));
                }
            } else if (i2 == 50) {
                mo92081M();
            } else if (i2 == 51 || i2 == 52) {
                mo92080L();
            } else if (i2 == 53) {
                mo92082N();
            } else if (i2 == 54 || i2 == 55) {
                mo92083O();
            } else if (i2 == 56) {
                C6907h.m21524a("click_remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").f60753a);
                Dialog b = new C10741a(getContext()).mo25649a((int) R.string.def).mo25660b(C1642a.m8034a(getResources().getString(R.string.dee), new Object[]{C43122ff.m136777h(this.f94531Q)})).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.ded, (OnClickListener) new C36377br(this)).mo25656a().mo25638b();
                if (b.findViewById(R.id.e0u) instanceof TextView) {
                    ((TextView) b.findViewById(R.id.e0u)).setTextColor(getResources().getColor(R.color.lk));
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo91947k(int i) {
        if (isViewValid()) {
            this.f94845ao = i;
            if (TextUtils.equals(this.f94844an, C21115b.m71197a().getCurUserId())) {
                this.followBn.setVisibility(8);
                m116840a(false, false);
                this.requestedBtn.setVisibility(8);
                this.sendMsgBtn.setVisibility(8);
                this.followIv.setVisibility(8);
                this.f94751w.setVisibility(0);
                return;
            }
            this.f94751w.setVisibility(8);
            this.followBn.setVisibility(0);
            m116840a(true, false);
            if (i == 0) {
                this.requestedBtn.setVisibility(8);
                this.sendMsgBtn.setVisibility(8);
                this.followIv.setVisibility(8);
                this.followBn.setVisibility(0);
                m116840a(true, false);
            } else if (i == 1 || i == 2) {
                this.requestedBtn.setVisibility(8);
                this.followBn.setVisibility(8);
                m116840a(false, true);
                this.sendMsgBtn.setVisibility(0);
                if (!ProfileNewStyleExperiment.INSTANCE.getCOMMOM_M() || !(this.followIv instanceof ImageView)) {
                    if (!(this.mTvFollow == null || this.mIvMutual == null)) {
                        if (i == 1) {
                            this.mTvFollow.setText(R.string.fll);
                            this.mIvMutual.setVisibility(8);
                        } else {
                            this.mTvFollow.setText(R.string.aua);
                            this.mIvMutual.setVisibility(0);
                        }
                    }
                } else if (i == 1) {
                    ((ImageView) this.followIv).setImageResource(R.drawable.amj);
                } else {
                    ((ImageView) this.followIv).setImageResource(R.drawable.ami);
                }
                this.followIv.setVisibility(0);
            } else if (i == 4) {
                this.requestedBtn.setVisibility(0);
                this.followBn.setVisibility(8);
                m116840a(false, false);
                this.sendMsgBtn.setVisibility(8);
                this.followIv.setVisibility(8);
            }
            m116862t(i);
        }
    }

    /* renamed from: b */
    public final void mo91709b(boolean z) {
        int i;
        ImageView imageView = this.f94828aM;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91873a(View view) {
        super.mo91873a(view);
        this.f94821aF = (ImageView) view.findViewById(R.id.jo);
        C34626j.m111876a(view.findViewById(R.id.ck_));
        C34626j.m111876a(this.f94821aF);
        if (C35992k.m115951a()) {
            this.recommededUsersIv.setVisibility(0);
        } else {
            this.recommededUsersIv.setVisibility(8);
        }
        if (this.mFastFollowBtn != null) {
            this.mFastFollowBtn.setOnClickListener(new C36371bl(this));
        }
        if (this.mFastSendMsgBtn != null) {
            this.mFastSendMsgBtn.setOnClickListener(new C36372bm(this));
        }
        this.f94821aF.setVisibility(0);
        this.f94836aU = view.findViewById(R.id.be);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("uid", "");
            this.f94823aH = arguments.getString("unique_id", "");
            String string2 = arguments.getString("sec_user_id", "");
            this.f94846ap = arguments.getString("profile_from", "");
            this.f94860bd = arguments.getString("enter_from");
            this.f94859bc = arguments.getString("poi_id");
            this.f94824aI = arguments.getString("video_id", "");
            this.f94825aJ = TextUtils.equals(this.f94846ap, "feed_detail");
            this.f94863bg = arguments.getString("type", "");
            this.f94864bh = arguments.getString("enter_from", "");
            this.f94865bi = arguments.getString("from_discover", "");
            this.f94839aX = arguments.getString("request_id", "");
            this.f94840aY = arguments.getString("room_id", "");
            this.f94841aZ = arguments.getString("room_owner_id", "");
            this.f94857ba = arguments.getString("user_type", "");
            this.f94860bd = arguments.getString("enter_from");
            this.f94859bc = arguments.getString("poi_id");
            this.f94858bb = arguments.getBoolean("isFromFeed", true);
            if (!C6319n.m19593a(this.f94865bi)) {
                mo92122h(this.f94865bi);
            }
            if (!TextUtils.isEmpty(this.f94860bd)) {
                mo92120g(this.f94860bd);
            }
            this.f94866bj = arguments.getString("extra_previous_page_position", "other_places");
            m116846b(string, string2);
            m116829S();
        }
        this.f94850at = new C6309f(this);
    }

    /* renamed from: a */
    public final void mo91698a(int i, int i2) {
        mo91947k(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92113b(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            m116832V();
        }
        dialogInterface.dismiss();
    }

    /* renamed from: d */
    private MTAwemeListFragment m116849d(int i, int i2) {
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(f94515y);
        sb.append(i2);
        MTAwemeListFragment mTAwemeListFragment = (MTAwemeListFragment) childFragmentManager.mo2644a(sb.toString());
        if (mTAwemeListFragment == null) {
            return MTAwemeListFragment.m116663a(-1, i, this.f94844an, false, new Bundle());
        }
        return mTAwemeListFragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo92115c(int i, int i2) {
        if (this.f94842al != null && this.f94842al.ap_()) {
            int i3 = -1;
            if (this.f94531Q != null) {
                i3 = this.f94531Q.getFollowerStatus();
            }
            mo91947k(i);
            this.f94842al.mo91679a(new C36034a().mo91684a(this.f94844an).mo91686b(this.f94822aG).mo91682a(i2).mo91689d(i3).mo91681a());
        }
    }

    /* renamed from: b */
    private void m116847b(boolean z, boolean z2) {
        C36340al alVar;
        if (this.f94540z != null && this.f94528N < this.f94540z.size()) {
            if (this.f94540z.get(this.f94528N) instanceof C36340al) {
                alVar = (C36340al) this.f94540z.get(this.f94528N);
            } else {
                alVar = null;
            }
            if (alVar != null) {
                if (z) {
                    if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
                        alVar.mo90848s();
                    }
                    alVar.mo90821a(false, z2);
                    return;
                }
                if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
                    alVar.mo90849u();
                }
                alVar.mo90850v();
            }
        }
    }

    /* renamed from: a */
    private void m116840a(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW()) {
            int i4 = 8;
            if (!(this.mFastFollowBtn == null || this.mFastLeftFollow == null)) {
                View view = this.mFastFollowBtn;
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
                View view2 = this.mFastLeftFollow;
                if (z) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                view2.setVisibility(i3);
            }
            if (this.mFastSendMsgBtn != null && this.mFastLeftMsg != null) {
                View view3 = this.mFastSendMsgBtn;
                if (z2) {
                    i = 0;
                } else {
                    i = 8;
                }
                view3.setVisibility(i);
                View view4 = this.mFastLeftMsg;
                if (z2) {
                    i4 = 0;
                }
                view4.setVisibility(i4);
            }
        }
    }

    /* renamed from: b */
    private void m116846b(String str, String str2) {
        if (this.f94867bk) {
            m116841aa();
            return;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f94823aH)) {
            this.f94844an = str;
            this.f94822aG = str2;
            if (!C36390cd.m117628a(AwemeApplication.m21341a())) {
                if (!this.f94829aN) {
                    C9738o.m28693a((Context) AwemeApplication.m21341a(), (int) R.string.cjs);
                }
                this.f94829aN = true;
                return;
            }
            if (this.f94819aD == null) {
                this.f94819aD = new C36012aj();
                this.f94819aD.mo66537a(this);
                this.f94819aD.f94218e = this.f94832aQ;
            }
            if (this.f94842al == null) {
                this.f94842al = new C36031j();
                this.f94842al.mo66537a(this);
            }
            if (this.f94820aE == null) {
                this.f94820aE = new C36015al();
                this.f94820aE.mo66537a(this);
            }
            this.f94819aD.mo56976a(this.f94844an, this.f94822aG, this.f94823aH);
            this.f94829aN = false;
            this.f94715aa = -1;
        }
        this.f94837aV = false;
    }

    /* renamed from: a */
    public final void mo61694a(float f, float f2) {
        super.mo61694a(f, f2);
        if (f2 > 5.0f) {
            if (!this.f94838aW) {
                m116861s(C34943c.f91128x);
            }
            this.f94838aW = true;
            return;
        }
        if (f2 < -5.0f) {
            if (!this.f94838aW) {
                m116856m(false);
            }
            this.f94838aW = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92104a(DialogInterface dialogInterface, int i) {
        C6907h.m21524a("remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").f60753a);
        m116845ae().mo93105a(this.f94531Q.getUid(), new C36379bt(this), new C36380bu(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92114b(View view, DialogInterface dialogInterface, int i) {
        m116858n(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92105a(View view, DialogInterface dialogInterface, int i) {
        m116858n(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo92116c(View view, DialogInterface dialogInterface, int i) {
        C6907h.m21524a("choose_punish_pop", (Map) new C22984d().mo59970a("is_follow", 1).f60753a);
        m116858n(view);
    }

    /* renamed from: b */
    public final void mo91710b(boolean z, boolean z2, boolean z3) {
        if (this.mLiveStatusView != null) {
            if (!z || !C41983b.m133444a() || C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q))) {
                this.f94736h.setBorderColor(R.color.dy);
                this.mLiveStatusView.mo7085f();
                this.mLiveStatusView.setVisibility(8);
                return;
            }
            if (this.f94830aO && this.f94531Q != null) {
                C41989d.m133476a(getContext(), false, 0, this.f94531Q.getRequestId(), this.f94844an, this.f94531Q.roomId);
            }
            if (!this.f94858bb && this.f94531Q != null) {
                C41989d.m133483a(this.f94531Q.getUid(), this.f94531Q.roomId, "others_homepage", "others_photo", this.f94531Q.getRequestId(), -1, true, "");
            }
            this.f94736h.setBorderColor(R.color.a79);
            this.f94736h.setBorderWidth(2);
            this.mLiveStatusView.setVisibility(0);
            this.mLiveStatusView.setAnimation("tag_profile_live.json");
            this.mLiveStatusView.mo7078b();
        }
    }
}
