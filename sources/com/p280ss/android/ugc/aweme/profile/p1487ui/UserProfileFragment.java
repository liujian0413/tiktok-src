package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.animation.Animator;
import android.app.Dialog;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c.C10791a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10819b;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10820c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10826g;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.google.gson.C6711m;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22942a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22943b;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22944c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p280ss.android.ugc.aweme.base.livedata.C23352a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.log.C24945an;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.C24995f;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24510b;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24564e;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24566g;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24573m;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b;
import com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a;
import com.p280ss.android.ugc.aweme.commercialize.profile.AggregationTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.profile.BrandTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25384x;
import com.p280ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager;
import com.p280ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager.C25157a;
import com.p280ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager.C25159c;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p280ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25549c;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25549c.C25557a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1143d.C25671a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p280ss.android.ugc.aweme.feed.event.C28341x;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28786aj;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.metrics.C33250au;
import com.p280ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.p280ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.profile.C35817i;
import com.p280ss.android.ugc.aweme.profile.C35992k;
import com.p280ss.android.ugc.aweme.profile.api.ActivityLinkManager;
import com.p280ss.android.ugc.aweme.profile.experiment.EnableUserProfileMoreSheetStyle;
import com.p280ss.android.ugc.aweme.profile.experiment.ProfileRecommendUserWhenEmpty;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p280ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p280ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p280ss.android.ugc.aweme.profile.model.RoomResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35663a;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35665c;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35669g;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36342b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36343c;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EffectListFragment.C36143a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36492ag;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36530bb;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36533be;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36534bf;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.UserHeaderData;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1488a.C36328b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserFragment;
import com.p280ss.android.ugc.aweme.profile.presenter.C36012aj;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.profile.presenter.C36041o;
import com.p280ss.android.ugc.aweme.profile.presenter.C36042p;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa;
import com.p280ss.android.ugc.aweme.profile.viewmodel.C36805a;
import com.p280ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.utils.C43086eb;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43105eq;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.viewmodel.Resource;
import com.p280ss.android.ugc.aweme.viewmodel.Resource.Status;
import com.p280ss.android.ugc.aweme.views.C43376l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment */
public class UserProfileFragment extends UserAbsProfileFragment implements C0053p<Boolean>, C6310a, C10819b, C10820c, C28343z, C36040n, C36041o, C36042p, C36328b, C36342b {

    /* renamed from: W */
    View f95305W;

    /* renamed from: X */
    public boolean f95306X;

    /* renamed from: Y */
    protected Aweme f95307Y;

    /* renamed from: Z */
    public String f95308Z;

    /* renamed from: aA */
    private boolean f95309aA;

    /* renamed from: aB */
    private Animator f95310aB;

    /* renamed from: aC */
    private boolean f95311aC;

    /* renamed from: aD */
    private String f95312aD;

    /* renamed from: aE */
    private String f95313aE;

    /* renamed from: aF */
    private boolean f95314aF;

    /* renamed from: aG */
    private C24723e f95315aG = new C24723e();

    /* renamed from: aH */
    private C28786aj f95316aH;

    /* renamed from: aI */
    private boolean f95317aI = false;

    /* renamed from: aJ */
    private String f95318aJ;

    /* renamed from: aK */
    private String f95319aK;

    /* renamed from: aL */
    private C19388d f95320aL;

    /* renamed from: aM */
    private String f95321aM;

    /* renamed from: aN */
    private OriginMusicListFragment f95322aN;

    /* renamed from: aO */
    private UserStateFragment f95323aO;

    /* renamed from: aP */
    private C36340al f95324aP;

    /* renamed from: aQ */
    private RecommendUserFragment f95325aQ;

    /* renamed from: aR */
    private EnterpriseTabFragment f95326aR;

    /* renamed from: aS */
    private BrandTabFragment f95327aS;

    /* renamed from: aT */
    private AggregationTabFragment f95328aT;

    /* renamed from: aU */
    private EffectListFragment f95329aU;

    /* renamed from: aV */
    private C6309f f95330aV;

    /* renamed from: aW */
    private MainAnimViewModel f95331aW;

    /* renamed from: aX */
    private AnalysisStayTimeFragmentComponent f95332aX;

    /* renamed from: aY */
    private FollowViewModel f95333aY;

    /* renamed from: aZ */
    private String f95334aZ;

    /* renamed from: aa */
    public boolean f95335aa;

    /* renamed from: ab */
    protected long f95336ab = -1;

    /* renamed from: ac */
    protected long f95337ac = -1;

    /* renamed from: ad */
    UserHeaderData f95338ad = new UserHeaderData();
    AvatarImageView adBottomAvatar;
    View adBottomCloseBtn;
    View adBottomDescLL;
    View adBottomLayout;
    TextView adBottomMoreBtn;
    TextView adBottomTitle;
    AdHalfWebPageContainer adHalfLandpageContainer;

    /* renamed from: ae */
    public C36340al f95339ae;

    /* renamed from: af */
    public Aweme f95340af;

    /* renamed from: ag */
    protected boolean f95341ag = false;

    /* renamed from: ah */
    C24613b f95342ah = new C24613b() {
        /* renamed from: a */
        public final void mo58895a() {
            C19386b a;
            if (UserProfileFragment.this.f95307Y != null && UserProfileFragment.this.f95307Y.isAppAd()) {
                if (C25329c.m83217a(UserProfileFragment.this.f95308Z)) {
                    a = C22943b.m75511a("homepage_ad", UserProfileFragment.this.f95307Y.getAwemeRawAd(), "button");
                } else {
                    a = C22943b.m75510a("homepage_ad", UserProfileFragment.this.f95307Y.getAwemeRawAd());
                }
                DownloaderManagerHolder.m75524a().mo51670a(C25352e.m83241x(UserProfileFragment.this.f95307Y), UserProfileFragment.this.f95307Y.getAwemeRawAd().getAdId().longValue(), 2, a, C22942a.m75508a(UserProfileFragment.this.f95307Y.getAwemeRawAd()));
            }
        }
    };

    /* renamed from: ai */
    boolean f95343ai;

    /* renamed from: aj */
    private boolean f95344aj;

    /* renamed from: ak */
    private boolean f95345ak;

    /* renamed from: al */
    private C36805a f95346al;

    /* renamed from: am */
    private C7321c f95347am;

    /* renamed from: an */
    private C36012aj f95348an;

    /* renamed from: ao */
    private String f95349ao;

    /* renamed from: ap */
    private String f95350ap;

    /* renamed from: aq */
    private String f95351aq;

    /* renamed from: ar */
    private String f95352ar;

    /* renamed from: as */
    private String f95353as;

    /* renamed from: at */
    private boolean f95354at;

    /* renamed from: au */
    private boolean f95355au;

    /* renamed from: av */
    private String f95356av;

    /* renamed from: aw */
    private String f95357aw = "other_places";

    /* renamed from: ax */
    private String f95358ax;

    /* renamed from: ay */
    private String f95359ay;

    /* renamed from: az */
    private boolean f95360az;

    /* renamed from: ba */
    private PoiStruct f95361ba;

    /* renamed from: bb */
    private FrameLayout f95362bb;

    /* renamed from: bc */
    private RelativeLayout f95363bc;

    /* renamed from: bd */
    private ProfileBrandCoverManager f95364bd;

    /* renamed from: be */
    private C0052o<Resource<ActivityLinkResponse>> f95365be = new C0052o<>();

    /* renamed from: bf */
    private C25549c f95366bf;

    /* renamed from: bg */
    private boolean f95367bg;

    /* renamed from: bh */
    private String f95368bh = "";

    /* renamed from: bi */
    private boolean f95369bi = false;
    AdHalfWebPageMaskLayer blackMaskLayer;

    /* renamed from: l */
    ProfileHitRankHelper f95370l;

    /* renamed from: m */
    ProfileQuickShopContainer f95371m;
    ImageView mBackBtn;
    FrameLayout mHitRankTagContainer;
    ImageView mRightMoreBtn;

    /* renamed from: n */
    DmtTextView f95372n;
    TextView txtHomePageBottomTextual;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment$a */
    class C36317a implements C19388d {
        /* renamed from: a */
        public final void mo51374a(C19387c cVar, C19384a aVar) {
        }

        /* renamed from: a */
        public final void mo51373a() {
            UserProfileFragment.this.adBottomMoreBtn.setText(R.string.bt0);
        }

        private C36317a() {
        }

        /* renamed from: b */
        public final void mo51377b(C19400e eVar) {
            UserProfileFragment.this.adBottomMoreBtn.setText(R.string.bt2);
        }

        /* renamed from: c */
        public final void mo51379c(C19400e eVar) {
            UserProfileFragment.this.adBottomMoreBtn.setText(R.string.a5i);
        }

        /* renamed from: a */
        public final void mo51375a(C19400e eVar) {
            UserProfileFragment.this.adBottomMoreBtn.setText(R.string.db6);
        }

        /* renamed from: b */
        public final void mo51378b(C19400e eVar, int i) {
            UserProfileFragment.this.adBottomMoreBtn.setText(R.string.css);
        }

        /* renamed from: a */
        public final void mo51376a(C19400e eVar, int i) {
            UserProfileFragment.this.adBottomMoreBtn.setText(R.string.ij);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo91936A() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo91937B() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo91939E() {
        return 0;
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo72036a(RecommendList recommendList) {
    }

    /* renamed from: a */
    public final void mo72038a(Exception exc) {
    }

    /* renamed from: a */
    public final void mo64929a(Object obj) {
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

    /* renamed from: b */
    public final void mo91709b(boolean z) {
    }

    /* renamed from: b */
    public final void mo91710b(boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: e */
    public final void mo91721e(int i) {
    }

    /* renamed from: f */
    public final void mo91725f(User user) {
    }

    public String getUserId() {
        return this.f95349ao;
    }

    public void onClick(View view) {
    }

    public void onFollowFail(Exception exc) {
    }

    public void onFollowSuccess(FollowStatus followStatus) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final int mo91958z() {
        return R.layout.fragment_user;
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        this.f95318aJ = str;
        this.f95338ad.setmMethodFrom(str);
    }

    /* renamed from: a */
    public final void mo92111a(boolean z) {
        setUserVisibleHint(z);
        if (!z && C6399b.m19947w()) {
            m117429a(this.f95368bh.equals("like"), false);
        }
        if (z && m116448i(this.f94531Q)) {
            C24995f.m82307a(this.f94531Q, "others_homepage");
        }
        if (C25352e.m83309T(this.f95307Y) && isViewValid()) {
            if (z && this.f95366bf == null) {
                m117435af();
            } else if (this.f95366bf != null) {
                this.f95366bf.mo66324c();
                this.f95366bf = null;
            }
        }
        if (m117442b(this.f95307Y) && z && this.f95341ag) {
            C24976t.m82255m(getContext(), this.f95307Y, m117452q(this.f94528N));
        }
        this.f95306X = z;
        Fragment j = mo92362j(this.f94528N);
        if (j instanceof UserStateFragment) {
            j.setUserVisibleHint(this.f95306X);
        }
        if (this.f95331aW != null) {
            this.f95331aW.f85655c.setValue(Boolean.valueOf(z));
        }
        if (this.f94526L != null) {
            this.f94526L.setVisible(z);
        }
        if (z) {
            onPageSelected(this.f94528N);
            this.f95360az = false;
            if (this.f95335aa) {
                mo92379f(true);
            }
            this.f95336ab = System.currentTimeMillis();
            m117437ah();
        } else {
            m117438ai();
        }
        if (!z) {
            C24945an.m81853a().mo65224b(this.f95349ao);
        }
        if (this.f95344aj) {
            this.f95371m.mo66199c(z);
        } else if (this.f95372n != null) {
            this.f95372n.setVisibility(8);
        }
        if (this.f95332aX != null) {
            this.f95332aX.mo60574b(z);
        }
        if (this.mFansShakeView != null) {
            this.mFansShakeView.mo90668a(z, this.f94531Q);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91873a(View view) {
        super.mo91873a(view);
        this.mBackBtn.setVisibility(0);
        if (C6399b.m19947w()) {
            this.mBackBtn.setImageResource(R.drawable.aky);
        }
        this.mRightMoreBtn.setVisibility(0);
        if (!C35992k.m115951a()) {
            this.mRightMoreBtn.setAlpha(0.0f);
        }
        if (C7213d.m22500a().mo18745aH()) {
            if (C6399b.m19946v()) {
                this.mRightMoreBtn.setImageResource(R.drawable.alb);
            } else if (C6399b.m19947w()) {
                this.mRightMoreBtn.setImageResource(R.drawable.alc);
            }
        }
        C10791a.m31505a().mo25805a(this.mBackBtn, this.mRightMoreBtn);
        this.mRightMoreBtn.setOnClickListener(new C36461ep(this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("uid", "");
            String string2 = arguments.getString("sec_user_id", "");
            this.f95352ar = arguments.getString("profile_from", "");
            this.f95353as = arguments.getString("previous_page", "");
            this.f95359ay = arguments.getString("enter_from");
            this.f95354at = TextUtils.equals(this.f95352ar, "feed_detail");
            this.f95318aJ = arguments.getString("enter_method");
            this.f95319aK = arguments.getString("enter_method");
            this.f95311aC = arguments.getInt("need_track_compare_recommend_reason", 0) == 1;
            this.f95312aD = arguments.getString("previous_recommend_reason", "");
            this.f95313aE = arguments.getString("recommend_from_type", "");
            if (!C6319n.m19593a(arguments.getString("from_discover", ""))) {
                mo92120g(arguments.getString("from_discover", ""));
            }
            if (!TextUtils.isEmpty(this.f95359ay)) {
                mo92120g(this.f95359ay);
            }
            this.f95321aM = arguments.getString("enter_from_request_id");
            this.f95357aw = arguments.getString("extra_previous_page_position", "other_places");
            m117441b(string, string2);
            this.f95338ad.setmProfileFrom(this.f95352ar);
            this.f95338ad.setmPoiId(arguments.getString("poi_id"));
            this.f95338ad.setmEnterFrom(this.f95359ay);
            this.f95338ad.setmType(arguments.getString("type", ""));
            this.f95338ad.setmFromSearch(arguments.getString("enter_from", ""));
            this.f95338ad.setmMethodFrom(this.f95318aJ);
            this.f95338ad.setEnterMethod(this.f95319aK);
            this.f95338ad.setLivePreviousPage(this.f95353as);
            this.f95338ad.setFromRecommendCard(arguments.getInt("from_recommend_card", 0));
            this.f95338ad.setmLiveRequestId(arguments.getString("request_id", ""));
            this.f95338ad.setmLiveRoomId(arguments.getString("room_id", ""));
            this.f95338ad.setmLiveRoomOwnerId(arguments.getString("room_owner_id", ""));
            this.f95338ad.setmLiveType(arguments.getString("user_type", ""));
            this.f95338ad.setFromFeed(arguments.getBoolean("isFromFeed", true));
            this.f95338ad.setmEnterFromRequestId(this.f95321aM);
            this.f95338ad.setmPreviousPagePosition(this.f95357aw);
            this.f95338ad.setSceneId(arguments.getString("scene_id", ""));
        } else {
            C6907h.m21524a("profile_exception_monitor", (Map) C22984d.m75611a().mo59973a("type", "bundle == null").f60753a);
        }
        this.mTitleColorCtrl.setOnClickListener(this);
        m117450o(this.f95338ad.getmFollowStatus());
        m117445e(view);
        this.f95362bb = (FrameLayout) view.findViewById(R.id.ckb);
        this.f95363bc = (RelativeLayout) view.findViewById(R.id.cku);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo92375a(java.lang.String r7, java.util.Map r8) throws java.lang.Exception {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.f94531Q
            if (r0 != 0) goto L_0x0007
            goto L_0x0076
        L_0x0007:
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.f94531Q
            long r0 = r0.roomId
            r2 = 0
            long r4 = java.lang.Long.parseLong(r7)     // Catch:{ Throwable -> 0x0022 }
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ Throwable -> 0x0022 }
            if (r7 == 0) goto L_0x0022
            java.lang.Object r7 = r8.get(r7)     // Catch:{ Throwable -> 0x0022 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ Throwable -> 0x0022 }
            long r7 = r7.longValue()     // Catch:{ Throwable -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r7 = r2
        L_0x0023:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002c
            com.ss.android.ugc.aweme.profile.model.User r4 = r6.f94531Q
            r4.roomId = r2
            goto L_0x0030
        L_0x002c:
            com.ss.android.ugc.aweme.profile.model.User r2 = r6.f94531Q
            r2.roomId = r7
        L_0x0030:
            com.ss.android.ugc.aweme.profile.ui.header.a r2 = r6.f94526L
            if (r2 == 0) goto L_0x0051
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.profile.ui.header.a r7 = r6.f94526L
            com.ss.android.ugc.aweme.profile.model.User r8 = r6.f94531Q
            r7.setUser(r8)
            com.ss.android.ugc.aweme.profile.ui.header.a r7 = r6.f94526L
            com.ss.android.ugc.aweme.profile.model.User r8 = r6.f94531Q
            boolean r8 = r8.isLive()
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.f94531Q
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136791v(r0)
            r1 = 0
            r7.mo91710b(r8, r0, r1)
        L_0x0051:
            com.bytedance.android.live.base.event.RoomStatusEvent r7 = new com.bytedance.android.live.base.event.RoomStatusEvent
            r7.<init>()
            com.ss.android.ugc.aweme.profile.model.User r8 = r6.f94531Q
            java.lang.String r8 = r8.getUid()
            long r0 = java.lang.Long.parseLong(r8)
            r7.f7645b = r0
            com.ss.android.ugc.aweme.profile.model.User r8 = r6.f94531Q
            long r0 = r8.roomId
            r7.f7644a = r0
            com.ss.android.ugc.aweme.profile.model.User r8 = r6.f94531Q
            boolean r8 = r8.isLive()
            r8 = r8 ^ 1
            r7.f7646c = r8
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r7)
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileFragment.mo92375a(java.lang.String, java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo92109a(String str, String str2) {
        if (!TextUtils.equals(str, this.f95349ao)) {
            m117424Z();
            m117430aa();
        }
        this.f95349ao = str;
        this.f95351aq = str2;
        if (!TextUtils.isEmpty(this.f95349ao) && TextUtils.isEmpty(this.f95351aq)) {
            this.f95351aq = C43077dz.m136657a().mo104733b(this.f95349ao);
        }
        this.f95338ad.setmUserId(this.f95349ao);
        this.f95338ad.setSecUserId(this.f95351aq);
        boolean z = false;
        m117446i(false);
        ProfileListFragment profileListFragment = (ProfileListFragment) mo92361b(6);
        if (profileListFragment instanceof EffectListFragment) {
            profileListFragment.mo65501a(str, str2);
        }
        C36340al a = m117425a((ProfileListFragment) mo92361b(1));
        if (a != null) {
            a.mo65501a(str, str2);
            a.mo86904c(this.f94531Q != null ? this.f94531Q.isBlocked() : false);
        }
        C36340al a2 = m117425a((ProfileListFragment) mo92361b(0));
        if (a2 != null) {
            a2.mo65501a(str, str2);
            a2.mo86904c(this.f94531Q != null ? this.f94531Q.isBlocked() : false);
        }
        C7213d.m22500a();
        ProfileListFragment profileListFragment2 = (ProfileListFragment) mo92361b((!C7213d.m22502aq() || !C43122ff.m136787r(this.f94531Q)) ? 5 : 8);
        if (profileListFragment2 instanceof UserStateFragment) {
            profileListFragment2.mo65501a(str, str2);
            if (this.f94531Q != null) {
                z = this.f94531Q.isBlocked();
            }
            profileListFragment2.mo86904c(z);
        }
        EnterpriseTabFragment enterpriseTabFragment = (EnterpriseTabFragment) mo92361b(7);
        if (enterpriseTabFragment != null) {
            enterpriseTabFragment.mo65501a(str, str2);
        }
        BrandTabFragment brandTabFragment = (BrandTabFragment) mo92361b(10);
        if (brandTabFragment != null) {
            brandTabFragment.mo65501a(str, str2);
        }
        AggregationTabFragment aggregationTabFragment = (AggregationTabFragment) mo92361b(12);
        if (aggregationTabFragment != null) {
            aggregationTabFragment.mo65501a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo92107a(Aweme aweme) {
        if (aweme != null) {
            this.f95361ba = aweme.getPoiStruct();
        }
        if (isViewValid()) {
            this.f95307Y = aweme;
            this.f95338ad.setmAweme(this.f95307Y);
            if (this.f95307Y == null) {
                this.f95315aG.mo64720o();
                return;
            }
            this.f95356av = this.f95307Y.getAid();
            this.f95338ad.setmAwemeId(this.f95356av);
            if (this.f95339ae != null) {
                this.f95339ae.mo90819a(this.f95356av);
            }
            if (this.f95326aR != null) {
                this.f95326aR.mo65514a(this.f95307Y);
            }
            this.f95315aG.mo64699a(getContext(), this.f95307Y);
            this.f95335aa = C25384x.m83530a(aweme, false);
            if (this.f95335aa) {
                C43081e.m136670a(this.adBottomMoreBtn);
                this.adBottomMoreBtn.setBackground(new C24510b((float) C23486n.m77122a(2.0d), Color.parseColor(C25352e.m83242y(aweme))));
                this.adBottomMoreBtn.setText(C25384x.m83526a(getContext(), aweme, false));
                this.adBottomTitle.setText(C25384x.m83525a(getContext(), aweme));
                m117414O();
            } else {
                mo92381n(0);
            }
            if (aweme.getAwemeRawAd() != null && !TextUtils.isEmpty(C25352e.m83323a(aweme.getAwemeRawAd()))) {
                this.txtHomePageBottomTextual.setText(C25352e.m83323a(aweme.getAwemeRawAd()));
            }
            if (this.f95366bf != null) {
                this.f95366bf.mo66324c();
                this.f95366bf = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92374a(Resource resource) {
        LinkInfo linkInfo;
        C32961dd ddVar = (C32961dd) C23336d.m76560a(getContext(), C32961dd.class);
        if (resource == null || resource.f112149a != Status.SUCCESS || resource.f112150b == null) {
            linkInfo = null;
        } else {
            linkInfo = ((ActivityLinkResponse) resource.f112150b).linkInfo;
            if (ddVar != null) {
                if (TextUtils.equals("", ddVar.mo60462c(""))) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(System.currentTimeMillis());
                    instance.set(11, 0);
                    instance.set(12, 0);
                    instance.set(13, 0);
                    instance.set(14, 0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(instance.getTimeInMillis());
                    ddVar.mo60465d(sb.toString());
                }
            }
        }
        if (C6399b.m19944t()) {
            if (linkInfo != null) {
                Uri parse = Uri.parse(linkInfo.url);
                if (TextUtils.isEmpty(parse.getQueryParameter("target_uid"))) {
                    linkInfo.url = parse.buildUpon().appendQueryParameter("target_uid", this.f95349ao).build().toString();
                }
            }
            this.f94526L.mo92631a(linkInfo);
            return;
        }
        if (ddVar != null && !ddVar.mo60476i(false)) {
            this.f94526L.mo92631a(linkInfo);
        }
    }

    /* renamed from: a */
    public final void mo91702a(User user) {
        if (isViewValid()) {
            super.mo91702a(user);
            mo92109a(user.getUid(), user.getSecUid());
            m117449l(this.f95351aq);
            if (TextUtils.equals(this.f95349ao, user.getUid())) {
                boolean z = this.f94526L.f95706E.getVisibility() == 0;
                if (ProfileRecommendUserWhenEmpty.isRecommendUserMode(user) && z) {
                    this.mScrollableLayout.setTabsMarginTop(this.mScrollableLayout.getTabsMarginTop() - C23486n.m77122a(40.0d));
                } else if (!ProfileRecommendUserWhenEmpty.isRecommendUserMode(user) && !z) {
                    this.mScrollableLayout.setTabsMarginTop(this.mScrollableLayout.getTabsMarginTop() + C23486n.m77122a(40.0d));
                }
                this.f94531Q = user;
                if (this.f95324aP != null) {
                    this.f95324aP.mo90816a(this.f94531Q);
                }
                if (!TextUtils.equals(user.getUid(), this.f95349ao)) {
                    this.f95348an.mo56976a(this.f95349ao, this.f95351aq);
                    return;
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    if (!(this.f95371m == null || this.f95372n == null || this.f95305W == null)) {
                        this.f95344aj = this.f95371m.mo66195a(user, (View) this.mUserCover, this.f95305W, this.f95372n, this.f95345ak);
                        if (this.f95344aj) {
                            mo91956x();
                        } else {
                            mo91950l(user);
                        }
                    }
                    if (C43122ff.m136783n(this.f94531Q)) {
                        if (this.f94526L == null || (this.f94526L instanceof C36534bf)) {
                            if (this.f94526L != null) {
                                this.mScrollableLayout.removeView(this.f94526L);
                            }
                            C36533be beVar = new C36533be(activity, this, this.f95338ad, this.f95330aV, this.f95279h, this.f94535U);
                            this.f94526L = beVar;
                            if (this.f95344aj) {
                                ((C36533be) this.f94526L).mo92752g(true);
                            }
                            this.f94526L.setFragment(this);
                            this.f94526L.setSourceAweme(this.f95340af);
                            m117441b(this.f95349ao, this.f95351aq);
                            if (C35992k.m115951a() && (TextUtils.isEmpty(this.f95349ao) || TextUtils.equals(this.f95349ao, C21115b.m71197a().getCurUserId()))) {
                                this.mRightMoreBtn.setVisibility(8);
                            }
                            this.mScrollableLayout.addView(this.f94526L, 0);
                            m117411L();
                        }
                    } else if (this.f94526L == null || (this.f94526L instanceof C36533be)) {
                        if (this.f94526L != null) {
                            this.mScrollableLayout.removeView(this.f94526L);
                        }
                        C36534bf bfVar = new C36534bf(activity, this, this.f95338ad, this.f95330aV, this.f95279h, this.f94535U);
                        this.f94526L = bfVar;
                        this.f94526L.setFragment(this);
                        m117441b(this.f95349ao, this.f95351aq);
                        if (C35992k.m115951a() && (TextUtils.isEmpty(this.f95349ao) || TextUtils.equals(this.f95349ao, C21115b.m71197a().getCurUserId()))) {
                            this.mRightMoreBtn.setVisibility(8);
                        }
                        this.mScrollableLayout.addView(this.f94526L, 0);
                        m117411L();
                    }
                    this.f94526L.setSourceAweme(this.f95340af);
                    if (!this.f95344aj) {
                        m117420V();
                    }
                    m117447j(mo92148G());
                    if (this.f95276e != null) {
                        this.f95276e.f95160b = user;
                    }
                    m117431ab();
                    C35817i.m115642a(user);
                    C35817i.m115641a(user.getFavoritingCount());
                    this.f95341ag = true;
                    mo91925h(this.f94531Q);
                    if (m117421W()) {
                        if (this.f95347am != null) {
                            this.f95347am.dispose();
                        }
                        this.f95347am = m117439aj().mo93202a(this.f94531Q.roomId).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C36464es<Object>(this), C36465et.f95651a);
                    } else {
                        m117427a((RoomStruct) null);
                    }
                    this.f94526L.f95706E.mo26054a();
                    this.f94526L.f95706E.setOnTabClickListener(this);
                    this.f94526L.f95706E.mo26058a((C10820c) this);
                    if (this.f94526L instanceof C36492ag) {
                        ((C36492ag) this.f94526L).setSimpleUser(false);
                    }
                    if (this.f94540z.size() != 1 || !(this.f94540z.get(0) instanceof RecommendUserFragment)) {
                        ((C36492ag) this.f94526L).setRecommendUserMode(false);
                        this.f94526L.f95706E.setupWithViewPager(this.f94502o);
                        if (mo92148G() && (this.f94502o instanceof C43376l)) {
                            ((C43376l) this.f94502o).setScrollable(false);
                        }
                    } else {
                        ((C36492ag) this.f94526L).setRecommendUserMode(true);
                    }
                    this.f94526L.mo92660h(user);
                    this.f94526L.mo91702a(user);
                    if (this.f94526L instanceof C36492ag) {
                        ((C36492ag) this.f94526L).mo92694a((TextView) null, this.mRightMoreBtn);
                        ((C36492ag) this.f94526L).mo92704j(user);
                    }
                    if (this.f95370l != null) {
                        this.f95370l.mo68398a(user);
                    }
                    mo92149H();
                    m117416Q();
                    if (getActivity() != null && isAdded()) {
                        m117443c(this.f94531Q.getUid(), this.f94531Q.getSecUid());
                    }
                    m117432ac();
                    m117422X();
                    if (this.f95311aC) {
                        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f95359ay).mo59973a("rec_uid", this.f95349ao).mo59973a("rec_from_type", this.f95313aE).mo59973a("rec_reason_previous", this.f95312aD).mo59973a("rec_reason_in_profile", user.getRecommendReasonRelation());
                        if (getArguments() != null && getArguments().getInt("is_cold_launch", 0) == 1) {
                            a.mo59970a("is_cold_launch", getArguments().getInt("is_cold_launch", 0));
                        }
                        C6907h.m21524a("rec_reason_comparison", (Map) a.f60753a);
                    } else if (TextUtils.equals(this.f95308Z, "homepage_hot") && this.f95307Y != null && this.f95307Y.getRelationLabel() != null && this.f95307Y.getRelationLabel().isValid()) {
                        C6907h.m21524a("rec_reason_comparison", (Map) C22984d.m75611a().mo59973a("enter_from", this.f95308Z).mo59973a("rec_uid", this.f95349ao).mo59973a("rec_from_type", "video").mo59973a("rec_reason_previous", this.f95307Y.getRelationLabel().getLabelInfo()).mo59973a("rec_reason_in_profile", user.getRecommendReasonRelation()).f60753a);
                    }
                    m117419U();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92373a(RoomResponse roomResponse) throws Exception {
        m117427a(roomResponse.data);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92371a(View view, C22903bl blVar) {
        if (getActivity() != null && !getActivity().isFinishing() && !this.f94504q.isShowing()) {
            this.f94504q.mo90257a(view, 48, true, 0.0f);
            blVar.mo59871a(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public final void mo92108a(C28786aj ajVar) {
        this.f95316aH = ajVar;
    }

    /* renamed from: a */
    public final void mo91701a(UrlModel urlModel) {
        if (urlModel != null && isViewValid() && this.f95335aa) {
            C23323e.m76524b(this.adBottomAvatar, urlModel);
        }
    }

    /* renamed from: a */
    public final void mo91703a(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        super.mo91703a(str, i, blueVBrandInfo, user);
        if (this.mTitle != null) {
            this.mTitle.post(new Runnable() {
                public final void run() {
                    if (UserProfileFragment.this.mTitle != null) {
                        int measuredWidth = UserProfileFragment.this.mTitle.getMeasuredWidth();
                        int a = C9738o.m28691a(C6399b.m19921a());
                        if (measuredWidth > 0) {
                            int max = Math.max((a - measuredWidth) / 2, (int) C9738o.m28708b(C6399b.m19921a(), 128.0f));
                            LayoutParams layoutParams = (LayoutParams) UserProfileFragment.this.mTitle.getLayoutParams();
                            layoutParams.rightMargin = max;
                            if (VERSION.SDK_INT >= 17) {
                                layoutParams.setMarginEnd(max);
                            }
                        }
                        UserProfileFragment.this.mTitle.requestLayout();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92370a(DialogInterface dialogInterface, int i) {
        C6907h.m21524a("remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").f60753a);
        m117440ak().mo93105a(this.f94531Q.getUid(), new C36459en(this), new C36460eo(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92372a(BaseResponse baseResponse) throws Exception {
        this.f94531Q.setFollowerStatus(0);
        if (this.f94531Q.getFollowStatus() == 2) {
            this.f94531Q.setFollowStatus(1);
        }
        this.f94526L.mo91698a(this.f94531Q.getFollowStatus(), this.f94531Q.getFollowerStatus());
        mo91698a(this.f94531Q.getFollowStatus(), this.f94531Q.getFollowerStatus());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92376a(Throwable th) throws Exception {
        if (th instanceof ApiServerException) {
            C22814a.m75242a(getContext(), (ApiServerException) th);
        } else {
            C6921a.m21559a(th);
        }
    }

    /* renamed from: a */
    public final void mo26115a(C10825f fVar) {
        int i = fVar.f29291e;
        this.f95343ai = true;
        String q = m117452q(i);
        if (!TextUtils.isEmpty(q)) {
            C6907h.m21524a("change_profile_tab", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "click").mo59973a("tab_name", q).mo59973a("to_user_id", this.f95349ao).f60753a);
            if (m117442b(this.f95307Y)) {
                C24976t.m82255m(getContext(), this.f95307Y, q);
            }
            this.f95343ai = true;
            fVar.mo26137a();
        }
    }

    /* renamed from: ah */
    private void m117437ah() {
        this.f95337ac = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo91872a() {
        m117441b(this.f95349ao, this.f95351aq);
    }

    /* renamed from: M */
    private void m117412M() {
        C43081e.m136670a(this.adBottomDescLL);
        C43081e.m136670a(this.adBottomCloseBtn);
        C43081e.m136670a(this.adBottomAvatar);
    }

    /* renamed from: ae */
    private C19388d m117434ae() {
        if (this.f95320aL == null) {
            this.f95320aL = new C36317a();
        }
        return this.f95320aL;
    }

    /* renamed from: aj */
    private C36805a m117439aj() {
        if (this.f95346al == null) {
            this.f95346al = new C36805a();
        }
        return this.f95346al;
    }

    /* renamed from: ak */
    private FollowViewModel m117440ak() {
        if (this.f95333aY == null) {
            this.f95333aY = new FollowViewModel(this);
        }
        return this.f95333aY;
    }

    /* renamed from: e */
    public final void mo91720e() {
        super.mo91720e();
        mo91948k(this.f94531Q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo91875g() {
        super.mo91875g();
        this.f94526L.mo92542h();
        m117412M();
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("others_homepage");
    }

    /* renamed from: i */
    public final void mo91877i() {
        mo91946e(this.f95349ao);
        m117433ad();
    }

    /* renamed from: J */
    private boolean m117410J() {
        if (!C6399b.m19947w() || this.f95338ad == null || !TextUtils.equals(this.f95338ad.getmProfileFrom(), "feed_detail")) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private void m117418T() {
        if (this.f95310aB != null && this.f95310aB.isRunning()) {
            this.f95310aB.removeAllListeners();
            this.f95310aB.cancel();
            this.f95310aB = null;
        }
    }

    /* renamed from: ab */
    private void m117431ab() {
        mo91952m(this.f94531Q);
        if (this.f95326aR != null) {
            this.f95326aR.f66062e = this.f94531Q;
            this.f95326aR.mo65515g();
        }
        this.f95276e.notifyDataSetChanged();
    }

    /* renamed from: ag */
    private void m117436ag() {
        ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(mo91933t());
        if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
            ((UserStateFragment) profileListFragment).mo86905g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo91938D() {
        C6907h.m21524a("click_profile_photo", (Map) C22984d.m75611a().mo59973a("to_user_id", this.f95349ao).f60753a);
    }

    /* renamed from: K */
    public final void mo92079K() {
        if (getActivity() != null && isAdded() && this.f95354at) {
            m117413N();
        }
    }

    public final void bC_() {
        if (this.f94502o != null && this.f94502o.getCurrentItem() != bD_()) {
            this.f94502o.setCurrentItem(bD_(), false);
        }
    }

    /* renamed from: r */
    public final boolean mo62081r() {
        this.f95309aA = false;
        if (this.f94506s != null && this.f94509v) {
            return this.f94506s.mo92456a();
        }
        if (this.f95344aj) {
            this.f95371m.mo66196b();
        }
        return false;
    }

    /* renamed from: I */
    private void m117409I() {
        String str;
        if (this.f95338ad != null) {
            str = this.f95338ad.getmPreviousPage();
        } else {
            str = "";
        }
        if (!TextUtils.equals(str, "poi_page") && !TextUtils.equals(str, "poi_map")) {
            this.f95332aX = new AnalysisStayTimeFragmentComponent(this, m117410J());
            this.f95332aX.f61328b = new C36457el(this, str);
        }
    }

    /* renamed from: L */
    private void m117411L() {
        if (this.mFastChatBtn != null && this.mFastChatBtn.getVisibility() == 0) {
            if (C6399b.m19944t()) {
                C23323e.m76503a(this.mFastChatBtn, (int) R.drawable.ahs);
            } else {
                C30553b.m99810g().wrapperSendMessageSyncXIcon(this.mFastChatBtn, 2);
                C36530bb.m117953a(this.mFastChatBtn);
            }
        }
    }

    /* renamed from: O */
    private void m117414O() {
        if (this.f95307Y != null && this.f95307Y.isAppAd() && !C25329c.m83210L(this.f95307Y)) {
            DownloaderManagerHolder.m75524a().mo51666a(getContext(), this.adBottomMoreBtn.hashCode(), m117434ae(), C22944c.m75515a(getContext(), this.f95307Y.getAwemeRawAd()));
        }
    }

    /* renamed from: P */
    private void m117415P() {
        if (this.f95307Y != null && this.f95307Y.isAppAd() && !C25329c.m83210L(this.f95307Y)) {
            DownloaderManagerHolder.m75524a().mo51669a(this.f95307Y.getAwemeRawAd().getDownloadUrl(), this.adBottomMoreBtn.hashCode());
        }
    }

    /* renamed from: aa */
    private void m117430aa() {
        if (this.f94540z != null && this.f94516A != null) {
            this.f94540z.remove(this.f95322aN);
            if (this.f94516A.contains(Integer.valueOf(3))) {
                this.f94516A.remove(Integer.valueOf(3));
                this.f95276e.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: ad */
    private void m117433ad() {
        this.f95276e = new ProfileFragmentAdapter3(getChildFragmentManager(), this.f94540z, this.f94516A, getUserId());
        this.f95276e.f95160b = this.f94531Q;
        this.f94502o.setAdapter(this.f95276e);
        this.f94526L.f95706E.mo26054a();
        this.f94526L.f95706E.setOnTabClickListener(null);
        this.f94526L.f95706E.setupWithViewPager(this.f94502o);
        this.f94502o.addOnPageChangeListener(this);
    }

    /* renamed from: ai */
    private void m117438ai() {
        if (this.f95337ac > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f95337ac;
            if (currentTimeMillis > 0) {
                String q = m117452q(this.f94528N);
                if (!TextUtils.isEmpty(q)) {
                    C1592h.m7855a((Callable<TResult>) new C36458em<TResult>(currentTimeMillis, q), (Executor) C6907h.m21516a());
                }
            }
            this.f95337ac = -1;
        }
    }

    public void onDestroyView() {
        m117418T();
        if (this.f95366bf != null) {
            this.f95366bf.mo66324c();
            this.f95366bf = null;
        }
        super.onDestroyView();
        if (this.f95348an != null) {
            this.f95348an.mo59134U_();
            this.f95348an = null;
        }
        this.f94526L.mo92534b();
        if (this.f94531Q != null) {
            C24945an.m81853a().mo65224b(this.f94531Q.getUid());
        }
        if (this.f95347am != null) {
            this.f95347am.dispose();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f94526L instanceof C36492ag) {
            ((C36492ag) this.f94526L).mo92686A();
        }
        m117415P();
        m117438ai();
        if (this.f95331aW != null) {
            this.f95331aW.f85655c.setValue(Boolean.valueOf(false));
            this.f95331aW.f85655c.setValue(Boolean.valueOf(false));
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

    /* renamed from: N */
    private void m117413N() {
        Fragment j = mo92362j(this.f94528N);
        if (j == null && this.f95276e != null) {
            this.f95276e.f95159a = this.f94528N;
        }
        if (this.f94531Q != null) {
            GeneralPermission generalPermission = this.f94531Q.getGeneralPermission();
            if (generalPermission != null && (((j instanceof OriginMusicListFragment) || (j instanceof EffectListFragment)) && generalPermission.getOriginalList() == 1)) {
                ((C25675c) j).ae_();
                return;
            }
        }
        if (j instanceof ProfileListFragment) {
            if (this.f94531Q != null) {
                ProfileListFragment profileListFragment = (ProfileListFragment) j;
                profileListFragment.mo86903b(this.f94531Q.isBlock);
                profileListFragment.mo86904c(this.f94531Q.isBlocked());
            }
            ProfileListFragment profileListFragment2 = (ProfileListFragment) j;
            if (profileListFragment2.aO_()) {
                profileListFragment2.mo86064c_(mo92148G());
                if (this.f94531Q != null) {
                    profileListFragment2.mo90830d_(this.f94531Q.getFollowStatus());
                }
                profileListFragment2.mo65501a(this.f95349ao, this.f95351aq);
                profileListFragment2.aQ_();
            }
        }
    }

    /* renamed from: U */
    private void m117419U() {
        if (this.f94531Q != null && this.f94531Q.getGeneralPermission() != null && !TextUtils.isEmpty(this.f94531Q.getGeneralPermission().getProfileToast())) {
            C10761a.m31403c(getContext(), this.f94531Q.getGeneralPermission().getProfileToast()).mo25750a();
            C6907h.m21524a("show_punish_toast", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("show_type", C36694aa.m118348b(this.f94531Q)).f60753a);
        }
    }

    /* renamed from: V */
    private void m117420V() {
        C25157a aVar;
        if (this.f95364bd == null) {
            aVar = new C25157a();
        } else {
            aVar = this.f95364bd.mo65731f();
        }
        this.f95364bd = aVar.mo65733a(getContext()).mo65737a(this.mScrollableLayout).mo65735a(this.f95362bb).mo65738a(this.f94526L).mo65734a((ViewGroup) this.f95363bc).mo65736a((C25159c) new C25159c() {

            /* renamed from: b */
            private boolean f95379b;

            /* renamed from: a */
            public final void mo65739a() {
                this.f95379b = UserProfileFragment.this.f95335aa;
                UserProfileFragment.this.f95335aa = false;
                UserProfileFragment.this.mo92381n((int) C34943c.f91128x);
            }

            /* renamed from: b */
            public final void mo65740b() {
                UserProfileFragment.this.f95335aa = this.f95379b;
                if (UserProfileFragment.this.f95335aa) {
                    UserProfileFragment.this.mo92379f(false);
                }
            }
        }).f66405a;
        this.f95364bd.mo65725a((BaseDTProfileFragment) this, this.f94531Q, this.f95308Z, 0);
    }

    /* renamed from: W */
    private boolean m117421W() {
        boolean z;
        if (this.f94531Q == null || TextUtils.isEmpty(this.f95349ao) || !TextUtils.equals(this.f95349ao, this.f94531Q.getUid())) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.f94531Q.isBlock() || this.f94531Q.isBlocked() || !this.f94531Q.isLive() || TextUtils.equals(this.f95359ay, "live") || !mo91943b(this.f94531Q, 0) || (C7213d.m22500a().mo18806f() != 1 && C7213d.m22500a().mo18806f() != 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    private void m117424Z() {
        if (this.f94540z != null && this.f94516A != null) {
            boolean z = false;
            this.f94540z.remove(this.f95326aR);
            this.f94540z.remove(this.f95327aS);
            this.f94540z.remove(this.f95328aT);
            if (this.f94516A.contains(Integer.valueOf(7))) {
                this.f94516A.remove(Integer.valueOf(7));
                z = true;
            }
            if (this.f94516A.contains(Integer.valueOf(10))) {
                this.f94516A.remove(Integer.valueOf(10));
                z = true;
            }
            if (this.f94516A.contains(Integer.valueOf(12))) {
                this.f94516A.remove(Integer.valueOf(12));
                z = true;
            }
            if (z || C7213d.m22500a().mo18762aZ()) {
                this.f95276e.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: ac */
    private void m117432ac() {
        C22903bl isLike2DynamicBubbleHasShowed = SharePrefCache.inst().getIsLike2DynamicBubbleHasShowed();
        if (!((Boolean) isLike2DynamicBubbleHasShowed.mo59877d()).booleanValue() && C7213d.m22500a().mo18778ap()) {
            int t = mo91933t();
            ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(t);
            if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                C10825f b = this.f94526L.f95706E.mo26066b(t);
                if (!(b == null || b.f29294h == null)) {
                    C10826g gVar = b.f29294h;
                    gVar.post(new C36466eu(this, gVar, isLike2DynamicBubbleHasShowed));
                }
            }
        }
    }

    /* renamed from: af */
    private void m117435af() {
        if (C25352e.m83309T(this.f95307Y)) {
            this.f95366bf = new C25557a().mo66338a(getContext()).mo66344a(this.f95307Y).mo66341a(this.adHalfLandpageContainer).mo66342a(this.blackMaskLayer).mo66339a(getChildFragmentManager()).mo66337a(1).mo66340a(this.f94534T).f67338a;
            this.f95366bf.mo66316a();
        }
    }

    /* renamed from: j */
    public final void mo91878j() {
        long j;
        if (isViewValid()) {
            super.mo91878j();
            this.f95317aI = false;
            if (this.f94526L instanceof C36492ag) {
                ((C36492ag) this.f94526L).mo92561u();
            }
            C36340al a = m117425a((ProfileListFragment) mo92361b(1));
            if (a != null) {
                a.mo90853y();
            }
            C7213d.m22500a();
            if (!C7213d.m22502aq() || !C43122ff.m136787r(this.f94531Q)) {
                j = 5;
            } else {
                j = 8;
            }
            ProfileListFragment profileListFragment = (ProfileListFragment) mo92361b(j);
            if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                ((UserStateFragment) profileListFragment).mo86906i();
            }
            C36340al a2 = m117425a((ProfileListFragment) mo92361b(0));
            if (a2 != null) {
                a2.mo90853y();
            }
        }
    }

    /* renamed from: Q */
    private void m117416Q() {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.f95314aF) {
            int bD_ = bD_();
            this.f95339ae = m117425a((ProfileListFragment) mo92362j(bD_));
            boolean z4 = false;
            if (this.f95339ae != null) {
                this.f95339ae.mo90817a(this.f95280i);
                C36340al alVar = this.f95339ae;
                if (this.f94528N == bD_) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                alVar.mo90832e(z2);
                C36340al alVar2 = this.f95339ae;
                if (this.f94528N == bD_) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                alVar2.mo90834f(z3);
                this.f95339ae.mo65501a(this.f95349ao, this.f95351aq);
                this.f95339ae.mo90825b(this.f95318aJ);
                this.f95339ae.mo90854z();
                this.f95339ae.mo90826b(this.f95321aM, this.f95308Z);
                this.f95339ae.mo90836g(this.f95356av);
            }
            ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(mo91933t());
            if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                ((UserStateFragment) profileListFragment).f89106g = this.f95280i;
                profileListFragment.mo65501a(this.f95349ao, this.f95351aq);
            }
            int q = mo91931q();
            this.f95324aP = m117425a((ProfileListFragment) mo92362j(q));
            if (this.f95324aP != null) {
                this.f95324aP.mo90817a(this.f95280i);
                C36340al alVar3 = this.f95324aP;
                if (this.f94528N == q) {
                    z = true;
                } else {
                    z = false;
                }
                alVar3.mo90832e(z);
                C36340al alVar4 = this.f95324aP;
                if (this.f94528N == q) {
                    z4 = true;
                }
                alVar4.mo90834f(z4);
                this.f95324aP.mo65501a(this.f95349ao, this.f95351aq);
                this.f95324aP.mo90825b(this.f95318aJ);
                this.f95324aP.mo90826b(this.f95321aM, this.f95308Z);
                this.f95324aP.mo90833f(this.f95357aw);
                this.f95324aP.mo90836g(this.f95356av);
            }
            this.f95314aF = true;
        }
    }

    /* renamed from: X */
    private void m117422X() {
        if (this.f94531Q != null && !C24945an.m81853a().mo65225c(this.f94531Q.getUid())) {
            C24945an.m81853a().mo65222a(this.f94531Q.getUid());
            if (this.f94531Q.getDefaultAdCoverUrl() != null) {
                C24958f.m81905a().mo65266a("starpage_ad").mo65276b("show").mo65283e("top_bar").mo65286h("{}").mo65280c(this.f94531Q.getAdOrderId()).mo65270a(getContext());
                if (this.f94531Q.getDefaultAdCoverUrl() != null) {
                    C24958f.m81905a().mo65266a("starpage_ad").mo65276b("show").mo65283e("link").mo65286h("{}").mo65280c(this.f94531Q.getAdOrderId()).mo65270a(getContext());
                }
            }
        }
    }

    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m117423Y() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.f94531Q
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.f94531Q
            int r0 = r0.getTabType()
            r1 = 8
            r2 = 0
            if (r0 == r1) goto L_0x0039
            switch(r0) {
                case 0: goto L_0x0034;
                case 1: goto L_0x002f;
                case 2: goto L_0x001f;
                case 3: goto L_0x001a;
                case 4: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = 0
            goto L_0x003d
        L_0x0015:
            int r0 = r3.mo91934u()
            goto L_0x003d
        L_0x001a:
            int r0 = r3.mo91932s()
            goto L_0x003d
        L_0x001f:
            com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            boolean r0 = r0.mo18778ap()
            if (r0 == 0) goto L_0x002a
            goto L_0x0013
        L_0x002a:
            int r0 = r3.mo91931q()
            goto L_0x003d
        L_0x002f:
            int r0 = r3.mo91933t()
            goto L_0x003d
        L_0x0034:
            int r0 = r3.bD_()
            goto L_0x003d
        L_0x0039:
            int r0 = r3.mo91930p()
        L_0x003d:
            if (r0 >= 0) goto L_0x0040
            r0 = 0
        L_0x0040:
            com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter3 r1 = r3.f95276e
            int r1 = r1.getCount()
            int r1 = r1 + -1
            int r0 = java.lang.Math.min(r1, r0)
            android.support.v4.view.ViewPager r1 = r3.f94502o
            int r1 = r1.getCurrentItem()
            if (r1 == r0) goto L_0x0059
            android.support.v4.view.ViewPager r1 = r3.f94502o
            r1.setCurrentItem(r0, r2)
        L_0x0059:
            r3.onPageSelected(r0)
            com.ss.android.ugc.aweme.profile.ui.header.a r1 = r3.f94526L
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r1 = r1.f95706E
            r1.mo26054a()
            com.ss.android.ugc.aweme.profile.ui.header.a r1 = r3.f94526L
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r1 = r1.f95706E
            android.support.v4.view.ViewPager r2 = r3.f94502o
            r1.setupWithViewPager(r2)
            com.ss.android.ugc.aweme.profile.ui.header.a r1 = r3.f94526L
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r1 = r1.f95706E
            r1.setOnTabClickListener(r3)
            com.ss.android.ugc.aweme.profile.ui.header.a r1 = r3.f94526L
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r1 = r1.f95706E
            r1.mo26058a(r3)
            android.support.v4.view.ViewPager r1 = r3.f94502o
            r1.setCurrentItem(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileFragment.m117423Y():void");
    }

    public void onResume() {
        super.onResume();
        if (this.f95338ad.isFromLive()) {
            this.f95338ad.setFromLive(false);
            if (this.f95348an == null) {
                this.f95348an = new C36012aj();
                this.f95348an.mo66537a(this);
            }
            this.f95348an.mo56976a(this.f95349ao, this.f95351aq, this.f95350ap);
            mo91877i();
        }
        m117414O();
        if (this.f95306X) {
            this.f95336ab = System.currentTimeMillis();
            m117437ah();
        }
        if (!C6399b.m19946v() && !TextUtils.isEmpty(this.f95349ao)) {
            C30553b.m99810g().cleanFeedUpdateCount(this.f95349ao);
        }
        if (this.f95331aW != null && this.f95331aW.mo84438a() && TextUtils.equals((CharSequence) this.f95331aW.f85656d.getValue(), "page_profile")) {
            this.f95331aW.f85655c.setValue(Boolean.valueOf(true));
        }
        if (this.f95331aW != null) {
            this.f95331aW.f85655c.setValue(Boolean.valueOf(true));
        }
        this.f94526L.mo92528a();
        if (this.f95370l != null) {
            this.f95370l.mo68398a(this.f94531Q);
        }
    }

    /* renamed from: S */
    private void m117417S() {
        if (this.f95307Y != null && this.f95307Y.isAd()) {
            AwemeRawAd awemeRawAd = this.f95307Y.getAwemeRawAd();
            String openUrl = this.f95307Y.getAwemeRawAd().getOpenUrl();
            String type = awemeRawAd.getType();
            if (!TextUtils.isEmpty(type)) {
                char c = 65535;
                switch (type.hashCode()) {
                    case -1354573786:
                        if (type.equals("coupon")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 96801:
                        if (type.equals("app")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 117588:
                        if (type.equals("web")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3083120:
                        if (type.equals("dial")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3148996:
                        if (type.equals("form")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 957829685:
                        if (type.equals("counsel")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1893962841:
                        if (type.equals("redpacket")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                        if (!C24758a.m81251b(openUrl)) {
                            if (!C25329c.m83217a(this.f95308Z)) {
                                C24976t.m82116ac(getContext(), this.f95307Y);
                                C24976t.m82114aa(getContext(), this.f95307Y);
                                break;
                            } else {
                                C24976t.m82267p(getContext(), this.f95307Y, "button");
                                break;
                            }
                        } else {
                            C24976t.m82015U(getContext(), this.f95307Y);
                            break;
                        }
                    case 2:
                        C24976t.m82116ac(getContext(), this.f95307Y);
                        C24976t.m82115ab(getContext(), this.f95307Y);
                        break;
                    case 4:
                        C24976t.m82119af(getContext(), this.f95307Y);
                        C24976t.m82116ac(getContext(), this.f95307Y);
                        break;
                    case 5:
                        C24976t.m82120ag(getContext(), this.f95307Y);
                        C24976t.m82116ac(getContext(), this.f95307Y);
                        break;
                    case 6:
                        C24976t.m82116ac(getContext(), this.f95307Y);
                        C24976t.m82123aj(getContext(), this.f95307Y);
                        break;
                }
                C25371n.m83449a(getContext(), this.f95307Y, this.f95315aG, 8, this.f95342ah);
            }
        }
    }

    /* renamed from: o */
    public final void mo92363o() {
        long j;
        this.f95317aI = false;
        if (isViewValid()) {
            super.mo92363o();
            if (this.f94526L instanceof C36492ag) {
                ((C36492ag) this.f94526L).mo92560t();
            }
            if (this.f95344aj) {
                int a = C9738o.m28691a(C6399b.m19921a());
                int a2 = (int) C43086eb.m136676a(C6399b.m19921a(), 1, 100.0f);
                int b = (int) C9738o.m28708b(C6399b.m19921a(), 100.0f);
                C12133n.m35299a(C23400r.m76741a(C25671a.m84399a())).mo29851b(C43086eb.m136677a(C6399b.m19921a()) / 2, a2).mo29836a(a / 2, b).mo29845a("UserAbsProfileFragment").mo29844a((C12128i) this.mUserCover).mo29848a();
            }
            C36340al a3 = m117425a((ProfileListFragment) mo92361b(1));
            if (a3 != null) {
                a3.mo90853y();
            }
            C36340al a4 = m117425a((ProfileListFragment) mo92361b(0));
            if (a4 != null) {
                a4.mo90853y();
            }
            C7213d.m22500a();
            if (!C7213d.m22502aq() || !C43122ff.m136787r(this.f94531Q)) {
                j = 5;
            } else {
                j = 8;
            }
            ProfileListFragment profileListFragment = (ProfileListFragment) mo92361b(j);
            if (profileListFragment instanceof UserStateFragment) {
                ((UserStateFragment) profileListFragment).mo86906i();
            }
            ProfileListFragment profileListFragment2 = (ProfileListFragment) mo92361b(13);
            if (profileListFragment2 instanceof RecommendUserFragment) {
                ((RecommendUserFragment) profileListFragment2).mo92962g();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo91945d(View view) {
        super.mo91945d(view);
    }

    /* renamed from: i */
    public final void mo92124i(String str) {
        this.f95357aw = str;
    }

    /* renamed from: k */
    public final void mo91947k(int i) {
        m117450o(i);
    }

    /* renamed from: f */
    public final void mo92117f(String str) {
        this.f95334aZ = str;
    }

    /* renamed from: h */
    public final void mo92122h(String str) {
        this.f95338ad.setmPreviousPage(str);
    }

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        m117413N();
    }

    /* renamed from: a */
    private static C36340al m117425a(ProfileListFragment profileListFragment) {
        if (profileListFragment instanceof C36340al) {
            return (C36340al) profileListFragment;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m117442b(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void RefreshProfileAfterBlockEvent(C35669g gVar) {
        if (TextUtils.equals(this.f95349ao, gVar.f93504a)) {
            m117453r(gVar.f93505b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo92380h(boolean z) {
        m117429a(this.f95368bh.equals("like"), z);
    }

    @C7709l
    public void onEvent(C35665c cVar) {
        if (this.f94526L instanceof C36492ag) {
            ((C36492ag) this.f94526L).mo92686A();
        }
    }

    @C7709l
    public void onMobRequestIdEvent(C28341x xVar) {
        this.f95358ax = xVar.f74668a;
        this.f95338ad.setmRequestId(this.f95358ax);
    }

    public void onPageScrollStateChanged(int i) {
        super.onPageScrollStateChanged(i);
        if (i == 2) {
            this.f95369bi = true;
        }
    }

    /* renamed from: e */
    private void m117445e(View view) {
        this.f95371m = (ProfileQuickShopContainer) view.findViewById(R.id.ckl);
        this.f95372n = (DmtTextView) view.findViewById(R.id.ckm);
        this.f95305W = view.findViewById(R.id.ckv);
    }

    /* renamed from: k */
    private void m117448k(String str) {
        if (this.f94531Q != null) {
            BusinessComponentServiceUtils.getLiveStateManager().mo83745a(UserProfileFragment.class, this.f94531Q, new C36462eq(this, str));
        }
    }

    /* renamed from: l */
    private void m117449l(String str) {
        if (C29132a.m95563b()) {
            this.f95365be.observe(this, new C36463er(this));
            ActivityLinkManager.m115419a(str, this.f95365be);
            return;
        }
        this.f94526L.mo92631a((LinkInfo) null);
    }

    /* renamed from: p */
    private ProfileTabView m117451p(int i) {
        C10825f b = this.f94526L.f95706E.mo26066b(i);
        if (b == null || b.f29292f == null) {
            return null;
        }
        return (ProfileTabView) b.f29292f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91921a(float f) {
        boolean z;
        if (!C35992k.m115951a()) {
            this.mRightMoreBtn.setAlpha(f);
            ImageView imageView = this.mRightMoreBtn;
            if (f == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            imageView.setClickable(z);
        }
    }

    /* renamed from: c */
    public final void mo92378c(Aweme aweme) {
        if (this.f95338ad != null && this.f95338ad.getmAweme() == null) {
            this.f95338ad.setmAweme(aweme);
            this.f95356av = aweme.getAid();
            this.f95338ad.setmAwemeId(this.f95356av);
        }
    }

    /* renamed from: g */
    public final void mo92120g(String str) {
        this.f95308Z = str;
        this.f95338ad.setmEventType(this.f95308Z);
        this.f95338ad.setmPreviousPage(this.f95308Z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo91925h(User user) {
        super.mo91925h(user);
        if (m117442b(this.f95307Y)) {
            C24976t.m82255m(getContext(), this.f95307Y, m117452q(this.f94511x));
        }
    }

    /* renamed from: j */
    public final void mo92126j(String str) {
        if (this.f95324aP != null) {
            this.f95324aP.mo90836g(this.f95356av);
        }
        if (this.f95339ae != null) {
            this.f95339ae.mo90836g(this.f95356av);
        }
    }

    public void onBack(View view) {
        if (!TextUtils.equals(this.f95352ar, "feed_detail")) {
            getActivity().finish();
        } else if (this.f95316aH != null) {
            this.f95316aH.mo74012a();
        }
    }

    @C7709l
    public void onCloseWebViewLoadingJsEvent(C24564e eVar) {
        if (af_() && this.f95344aj) {
            this.f95371m.mo66198c();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f94533S != configuration.screenWidthDp) {
            m117423Y();
            this.f94533S = configuration.screenWidthDp;
            if (this.f94526L instanceof C36492ag) {
                ((C36492ag) this.f94526L).mo92706k(this.f94533S);
            }
        }
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (TextUtils.equals("user", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(getActivity(), this.mBackBtn, shareCompleteEvent);
        }
    }

    @C7709l
    public void onFakeCoverAction(C24573m mVar) {
        if (af_() && mVar != null && this.f95344aj) {
            this.f95371m.mo66193a(mVar, this.mScrollableLayout);
        }
    }

    @C7709l
    public void onFeedAdClickFormEvent(C24566g gVar) {
        Aweme aweme = gVar.f64805a;
        int i = gVar.f64806b;
        CardStruct w = C25352e.m83240w(aweme);
        if (w != null && w.getCardType() == 1 && i == 8 && this.f95366bf != null) {
            this.f95366bf.mo66325d();
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f95332aX != null) {
            this.f95332aX.mo60573a(z);
        }
        this.f94526L.mo92642f(z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("userId", this.f95349ao);
            bundle.putString("sec_user_id", this.f95351aq);
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: j */
    private void m117447j(boolean z) {
        C36340al a = m117425a((ProfileListFragment) mo92362j(bD_()));
        if (a != null) {
            a.mo86064c_(z);
        }
        C36340al a2 = m117425a((ProfileListFragment) mo92362j(mo91931q()));
        if (a2 != null) {
            a2.mo86064c_(z);
        }
        ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(mo91933t());
        if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
            profileListFragment.mo86064c_(z);
        }
    }

    /* renamed from: q */
    private String m117452q(int i) {
        String str = "";
        if (this.f95276e == null || this.f95276e.getCount() == 0 || i >= this.f95276e.getCount() || i < 0) {
            return str;
        }
        return C43105eq.m136725a((int) this.f95276e.mo2424b(i));
    }

    /* renamed from: b */
    public final void mo91707b(Exception exc) {
        super.mo91707b(exc);
        this.f95355au = true;
    }

    /* renamed from: n */
    public final void mo92381n(int i) {
        if (isViewValid()) {
            m117418T();
            int i2 = ((FrameLayout.LayoutParams) this.adBottomLayout.getLayoutParams()).bottomMargin;
            if (i2 >= 0) {
                this.f95310aB = C43081e.m136668a(this.adBottomLayout, i2, (this.adBottomLayout.getMeasuredHeight() + 1) * -1, i);
                this.f95310aB.start();
            }
        }
    }

    /* renamed from: a */
    private void m117427a(RoomStruct roomStruct) {
        if (!(roomStruct == null || roomStruct.owner == null)) {
            roomStruct.f75166id = this.f94531Q.roomId;
            roomStruct.owner.setUid(this.f95349ao);
            roomStruct.owner.setBroadcasterRoomId(this.f94531Q.roomId);
        }
        ProfileListFragment a = mo91941a(Integer.valueOf(0));
        if (a instanceof C36340al) {
            ((C36340al) a).mo90815a(roomStruct);
        }
    }

    /* renamed from: i */
    private void m117446i(boolean z) {
        this.f95339ae = m117425a((ProfileListFragment) mo92362j(bD_()));
        this.f95324aP = m117425a((ProfileListFragment) mo92362j(mo91931q()));
        ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(mo91933t());
        if (this.f95324aP != null) {
            this.f95324aP.mo86903b(z);
        }
        if (this.f95339ae != null) {
            this.f95339ae.mo86903b(z);
        }
        if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
            profileListFragment.mo86903b(z);
        }
    }

    /* renamed from: f */
    public final void mo92379f(boolean z) {
        if (isViewValid() && !this.f95360az && ((this.f95315aG.mo64707b() || this.f95315aG.mo64712g()) && this.f95315aG.mo64710e())) {
            m117418T();
            int i = ((FrameLayout.LayoutParams) this.adBottomLayout.getLayoutParams()).bottomMargin;
            if (i < 0) {
                this.f95310aB = C43081e.m136668a(this.adBottomLayout, i, 0, (int) C34943c.f91128x);
                this.f95310aB.start();
            }
            if (z) {
                if (C25329c.m83217a(this.f95308Z)) {
                    C24976t.m82270q(getContext(), this.f95307Y, "button");
                    return;
                }
                C24976t.m82020Z(getContext(), this.f95307Y);
            }
        }
    }

    /* renamed from: g */
    public final void mo92121g(boolean z) {
        ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(this.f94528N);
        if (profileListFragment instanceof C36340al) {
            C36340al alVar = (C36340al) profileListFragment;
            if (z) {
                if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
                    alVar.mo90848s();
                }
                alVar.mo90821a(false, false);
                return;
            }
            if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
                alVar.mo90849u();
            }
            alVar.mo90850v();
        }
    }

    public void onAdBottomClick(View view) {
        int id = view.getId();
        if (id == R.id.bc) {
            this.f95360az = true;
            mo92381n((int) C34943c.f91128x);
        } else if (id != R.id.be && id != R.id.bd && id != R.id.bb) {
            if (id == R.id.bf) {
                m117417S();
            }
        } else if (C6399b.m19944t()) {
            m117417S();
        } else {
            String str = "";
            if (this.f95307Y != null && this.f95307Y.isAd()) {
                str = this.f95307Y.getAwemeRawAd().getOpenUrl();
            }
            if (C24758a.m81251b(str)) {
                C24976t.m82015U(getContext(), this.f95307Y);
            } else {
                C24976t.m82116ac(getContext(), this.f95307Y);
                C24976t.m82117ad(getContext(), this.f95307Y);
            }
            C25371n.m83449a(getContext(), this.f95307Y, this.f95315aG, 7, this.f95342ah);
        }
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && (str.contains("/aweme/v1/user/?") || str.contains("/aweme/v1/aweme/post/?") || str.contains("/aweme/v1/aweme/favorite/?"))) {
            C42961az.m136385f(aVar);
            if (this.f95348an != null) {
                this.f95348an.mo56976a(this.f95349ao, this.f95351aq);
            }
            C36340al a = m117425a((ProfileListFragment) mo92362j(bD_()));
            C36340al a2 = m117425a((ProfileListFragment) mo92362j(mo91931q()));
            if (mo92148G()) {
                m117447j(true);
                if (a != null) {
                    a.mo90837k();
                }
                if (a2 != null) {
                    a2.mo90837k();
                }
            } else {
                if (a != null) {
                    a.mo90811A();
                }
                if (a2 != null) {
                    a2.mo90811A();
                }
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onLiveStatusEvent(RoomStatusEvent roomStatusEvent) {
        long j;
        if (this.f95307Y != null && this.f94531Q != null) {
            try {
                j = Long.parseLong(this.f94531Q.getUid());
            } catch (Throwable unused) {
                j = 0;
            }
            if (j == roomStatusEvent.f7645b && roomStatusEvent.f7646c && this.f94531Q.roomId != 0) {
                this.f94531Q.roomId = 0;
                if (this.f94526L != null) {
                    this.f94526L.setUser(this.f94531Q);
                    this.f94526L.mo91710b(this.f94531Q.isLive(), C43122ff.m136791v(this.f94531Q), false);
                }
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onMsgFromRnAndH5(C27994k kVar) {
        String str;
        if (kVar.f73730b != null && TextUtils.equals(kVar.f73730b.optString("eventName"), "mp_refresh_profile_page")) {
            JSONObject optJSONObject = kVar.f73730b.optJSONObject("data");
            if (optJSONObject != null) {
                str = optJSONObject.optString("userId");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = C21115b.m71197a().getCurUserId();
            }
            if (TextUtils.equals(str, getUserId()) && this.f95348an != null) {
                this.f95348an.mo56976a(this.f95349ao, this.f95351aq);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Boolean bool) {
        if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            if (this.f95339ae != null) {
                this.f95339ae.mo90829d(bool.booleanValue());
            }
            if (this.f95324aP != null) {
                this.f95324aP.mo90829d(bool.booleanValue());
            }
            mo92121g(bool.booleanValue());
        }
    }

    /* renamed from: o */
    private void m117450o(int i) {
        if (this.mFastChatBtn != null && this.mFastFollowBtn != null) {
            if (i == 0) {
                this.mFastFollowBtn.setVisibility(0);
                this.mFastChatBtn.setVisibility(8);
                this.mFastFollowBtn.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (UserProfileFragment.this.f94526L != null && (UserProfileFragment.this.f94526L instanceof C36492ag)) {
                            ((C36492ag) UserProfileFragment.this.f94526L).setFollowFromTitleBar(true);
                            ((C36492ag) UserProfileFragment.this.f94526L).mo92707k((View) null);
                        }
                    }
                });
            } else if (i == 1 || i == 2) {
                this.mFastFollowBtn.setVisibility(8);
                this.mFastChatBtn.setVisibility(0);
                this.mFastChatBtn.setEnabled(true);
                this.mFastChatBtn.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (!(UserProfileFragment.this.f94526L == null || !(UserProfileFragment.this.f94526L instanceof C36492ag) || UserProfileFragment.this.f94531Q == null)) {
                            if (TimeLockRuler.isTeenModeON()) {
                                C10761a.m31409e(UserProfileFragment.this.getContext(), (int) R.string.e67).mo25750a();
                                return;
                            }
                            IIMService a = C30553b.m99808a(false);
                            if (C30553b.m99785a() && a != null) {
                                Aweme aweme = UserProfileFragment.this.f95338ad.getmAweme();
                                if (UserProfileFragment.m117442b(aweme)) {
                                    C6711m mVar = new C6711m();
                                    mVar.mo16147a("log_extra", aweme.getAwemeRawAd().getLogExtra());
                                    mVar.mo16147a("creative_id", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
                                    a.wrapperChatWithSyncXAlert(UserProfileFragment.this.getActivity(), C30553b.m99780a(UserProfileFragment.this.f94531Q), 2, new IMAdLog(aweme.getAwemeRawAd().getLogExtra(), String.valueOf(aweme.getAwemeRawAd().getCreativeId())));
                                } else {
                                    a.wrapperChatWithSyncXAlert(UserProfileFragment.this.getActivity(), C30553b.m99780a(UserProfileFragment.this.f94531Q), 2);
                                }
                                C30560g.m99816a(UserProfileFragment.this.f94531Q.getUid());
                                C30560g.m99819a(UserProfileFragment.this.f95338ad.getmUserId(), UserProfileFragment.this.f95338ad.getmAwemeId(), UserProfileFragment.this.f95338ad.getmEventType(), UserProfileFragment.this.f95338ad.getmRequestId(), "top_bar_follow_button");
                                if (UserProfileFragment.m117442b(aweme)) {
                                    C24976t.m82006L(UserProfileFragment.this.getContext(), aweme);
                                }
                            }
                        }
                    }
                });
                m117411L();
            } else if (i == 4) {
                this.mFastFollowBtn.setVisibility(0);
                this.mFastChatBtn.setVisibility(8);
                this.mFastFollowBtn.setText(R.string.b8v);
                this.mFastFollowBtn.setBackground(getResources().getDrawable(R.drawable.k8));
                this.mFastFollowBtn.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (UserProfileFragment.this.f94526L != null && (UserProfileFragment.this.f94526L instanceof C36492ag)) {
                            ((C36492ag) UserProfileFragment.this.f94526L).mo92711o((View) null);
                        }
                    }
                });
            }
            if ((this.f94526L instanceof C36534bf) && C36530bb.m117956c()) {
                this.mFastChatBtn.setVisibility(8);
            }
        }
    }

    /* renamed from: r */
    private void m117453r(int i) {
        C36340al a = m117425a((ProfileListFragment) mo92362j(bD_()));
        C36340al a2 = m117425a((ProfileListFragment) mo92362j(mo91931q()));
        ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(mo91933t());
        if (i == 1) {
            mo91878j();
            m117446i(true);
            this.f94531Q.setFollowStatus(0);
            this.f94531Q.setBlock(true);
            if (a2 != null) {
                a2.ae_();
            }
            if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                ((UserStateFragment) profileListFragment).mo86907k();
            }
            if (this.f94526L != null) {
                this.f94526L.mo91711c(0);
                this.f94526L.mo91716d(0);
                this.f94526L.mo91724f(0);
            }
            C42961az.m136380a(new C35663a());
            if (ProfileRecommendUserWhenEmpty.isEnabled()) {
                this.f94531Q.setBlock(true);
                if (this.f94526L instanceof C36492ag) {
                    ((C36492ag) this.f94526L).mo92698a(false);
                }
                mo91702a(this.f94531Q);
            }
        } else {
            if (this.f95348an != null) {
                this.f95348an.mo56976a(this.f95349ao, this.f95351aq);
            }
            m117446i(false);
            this.f94531Q.setBlock(false);
            if (mo92148G()) {
                m117447j(true);
                if (a != null) {
                    a.mo90837k();
                }
                if (a2 != null) {
                    a2.mo90837k();
                }
            } else {
                if (a != null) {
                    a.mo90811A();
                }
                if (a2 != null) {
                    a2.mo90811A();
                }
            }
            if (ProfileRecommendUserWhenEmpty.isEnabled()) {
                this.f94531Q.setBlock(false);
                mo91702a(this.f94531Q);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92377b(View view) {
        if (!C27326a.m89578a(this.mRightMoreBtn) && isViewValid() && getActivity() != null) {
            if (C6399b.m19944t()) {
                if (this.f94526L instanceof C36492ag) {
                    ((C36492ag) this.f94526L).mo92562v();
                }
            } else if (this.f94531Q != null && (this.f95339ae != null || ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f94531Q))) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("user", this.f94531Q);
                bundle.putString("enter_from", this.f95359ay);
                bundle.putString("aweme_id", this.f95356av);
                bundle.putString("request_id", this.f95358ax);
                bundle.putString("from", this.f94527M);
                bundle.putString("profile_from", this.f95352ar);
                bundle.putInt("follow_status", this.f95338ad.getmFollowStatus());
                if (this.f95339ae != null) {
                    bundle.putSerializable("aweme_list", this.f95339ae.mo90852x());
                }
                if (!C6384b.m19835a().mo15292a(EnableUserProfileMoreSheetStyle.class, true, "enable_others_profile_setting_sheet_style", C6384b.m19835a().mo15295d().enable_others_profile_setting_sheet_style, true) || !C6399b.m19945u()) {
                    Intent intent = new Intent(getActivity(), ProfileMoreActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else {
                    ProfileMoreFragmentV2 profileMoreFragmentV2 = new ProfileMoreFragmentV2();
                    profileMoreFragmentV2.setArguments(bundle);
                    try {
                        profileMoreFragmentV2.show(getActivity().getSupportFragmentManager(), ProfileMoreFragmentV2.class.getSimpleName());
                    } catch (IllegalStateException unused) {
                    }
                }
                C6907h.m21524a("profile_more_show", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f95349ao).f60753a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo92059n(User user) {
        if (this.f95348an != null && this.f94526L != null && this.f94531Q != null && user != null && TextUtils.equals(this.f94531Q.getUid(), user.getUid())) {
            this.f94531Q.setBlock(user.isBlock());
            this.f94531Q.setStoryBlockInfo(user.getStoryBlockInfo());
            if (!TextUtils.equals(this.f94531Q.getRemarkName(), user.getRemarkName())) {
                this.f94531Q.setRemarkName(user.getRemarkName());
                this.f95348an.mo91623a(this.f94531Q);
                this.f94526L.mo92660h(this.f94531Q);
                if (mo92148G() && (this.f94502o instanceof C43376l)) {
                    ((C43376l) this.f94502o).setScrollable(false);
                }
            }
            if (this.f94531Q.isBlock()) {
                m117427a((RoomStruct) null);
            }
            if (this.f94531Q.getFollowStatus() != user.getFollowStatus() || this.f94531Q.getFollowerStatus() != user.getFollowerStatus()) {
                this.f94531Q.setFollowStatus(user.getFollowStatus());
                this.f94531Q.setFollowerStatus(user.getFollowerStatus());
                this.f94526L.mo91698a(this.f94531Q.getFollowStatus(), this.f94531Q.getFollowerStatus());
                mo91698a(this.f94531Q.getFollowStatus(), this.f94531Q.getFollowerStatus());
            }
        }
    }

    public void onCreate(Bundle bundle) {
        FragmentInstrumentation.onCreate("com.ss.android.ugc.aweme.profile.ui.UserProfileFragment");
        if (bundle != null) {
            this.f95349ao = bundle.getString("userId");
            this.f95351aq = bundle.getString("sec_user_id");
        }
        if (getArguments() != null) {
            if (TextUtils.isEmpty(this.f95351aq)) {
                this.f95351aq = getArguments().getString("sec_user_id", "");
            }
            if (TextUtils.isEmpty(this.f95349ao)) {
                this.f95349ao = getArguments().getString("uid", "");
            }
        }
        if (getArguments() != null) {
            this.f95350ap = getArguments().getString("unique_id", "");
        }
        super.onCreate(bundle);
        if (getActivity() instanceof UserProfileActivity) {
            this.f95306X = true;
            this.f95345ak = true;
        }
        getChildFragmentManager().mo2649a((C0609a) new C0609a() {
            public final void onFragmentCreated(C0608j jVar, Fragment fragment, Bundle bundle) {
                UserProfileFragment.this.mo91876i(UserProfileFragment.this.f94528N);
            }
        }, false);
        this.f95330aV = new C6309f(this);
    }

    public void handleMsg(Message message) {
        String str;
        boolean z;
        int i;
        if (isViewValid()) {
            int i2 = message.what;
            Object obj = message.obj;
            if (i2 == 30) {
                if (obj instanceof ApiServerException) {
                    ApiServerException apiServerException = (ApiServerException) obj;
                    int errorCode = apiServerException.getErrorCode();
                    if (!(errorCode == 3070 || errorCode == 3071 || errorCode == 3072)) {
                        C10761a.m31403c(C6399b.m19921a(), apiServerException.getErrorMsg()).mo25750a();
                    }
                } else if (obj instanceof Exception) {
                    C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjm).mo25750a();
                } else if (obj instanceof BlockStruct) {
                    int i3 = ((BlockStruct) obj).blockStatus;
                    User user = this.f94531Q;
                    if (i3 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    user.setBlock(z);
                    FragmentActivity activity = getActivity();
                    Resources resources = getResources();
                    if (i3 == 1) {
                        i = R.string.ic;
                    } else {
                        i = R.string.fip;
                    }
                    C10761a.m31403c((Context) activity, resources.getString(i)).mo25750a();
                    if (i3 == 1) {
                        FollowStatus followStatus = new FollowStatus();
                        followStatus.userId = this.f95349ao;
                        followStatus.followStatus = 0;
                        C42961az.m136380a(followStatus);
                    }
                    if (C6399b.m19944t()) {
                        m117453r(i3);
                    }
                    C30553b.m99810g().updateIMUser(C30553b.m99780a(this.f94531Q));
                }
            } else if (i2 == 50) {
                ((C36492ag) this.f94526L).mo92563w();
            } else if (i2 == 53) {
                ((C36492ag) this.f94526L).mo92722y();
            } else if (i2 == 54 || i2 == 55) {
                ((C36492ag) this.f94526L).mo92721x();
            } else if (i2 == 56) {
                C6907h.m21524a("click_remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").f60753a);
                C10741a a = new C10741a(getContext()).mo25649a((int) R.string.def);
                if (C6399b.m19944t()) {
                    str = C1642a.m8034a(getResources().getString(R.string.dee), new Object[]{C43122ff.m136777h(this.f94531Q)});
                } else {
                    str = getResources().getString(R.string.dee);
                }
                Dialog b = a.mo25660b(str).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.ded, (DialogInterface.OnClickListener) new C36468ew(this)).mo25656a().mo25638b();
                if (b.findViewById(R.id.e0u) instanceof TextView) {
                    ((TextView) b.findViewById(R.id.e0u)).setTextColor(getResources().getColor(R.color.lk));
                }
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        int i;
        int i2;
        if (isViewValid()) {
            if ((!C43122ff.m136769b(this.f94531Q, false) || followStatus.followStatus != 1) && TextUtils.equals(followStatus.userId, this.f95349ao)) {
                boolean isRecommendUserMode = ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f94531Q);
                if (this.f94531Q != null && this.f94531Q.isBlock() && followStatus.followStatus == 1) {
                    this.f94531Q.setBlock(false);
                    if (!isRecommendUserMode || ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f94531Q)) {
                        this.f94531Q.setBlock(true);
                    } else {
                        m117450o(followStatus.followStatus);
                        mo91702a(this.f94531Q);
                        return;
                    }
                }
                mo91947k(followStatus.followStatus);
                if (this.f94526L instanceof C36492ag) {
                    ((C36492ag) this.f94526L).mo92695a(followStatus);
                }
                if (this.f94531Q != null && (followStatus.followStatus != this.f94531Q.getFollowStatus() || (this.f94531Q.isBlock() && this.f94531Q.getFollowStatus() != 0))) {
                    if (followStatus.followStatus == 0) {
                        if (this.f94531Q != null && !mo92148G()) {
                            this.f94531Q.setFollowerCount(this.f94531Q.getFollowerCount() - 1);
                            this.f94531Q.setFansCount(this.f94531Q.getFansCount() - 1);
                            if (C36337ai.m117567a(this.f94531Q)) {
                                i2 = this.f94531Q.getFansCount();
                            } else {
                                i2 = this.f94531Q.getFollowerCount();
                            }
                            mo91697a(i2);
                            FollowerDetail b = C36337ai.m117569b(this.f94531Q.getFollowerDetailList());
                            if (b != null) {
                                b.setFansCount(b.getFansCount() - 1);
                            }
                            this.f94531Q.setFollowStatus(followStatus.followStatus);
                        }
                    } else if (this.f94531Q != null && !mo92148G()) {
                        this.f94531Q.setFollowerCount(this.f94531Q.getFollowerCount() + 1);
                        this.f94531Q.setFansCount(this.f94531Q.getFansCount() + 1);
                        if (C36337ai.m117567a(this.f94531Q)) {
                            i = this.f94531Q.getFansCount();
                        } else {
                            i = this.f94531Q.getFollowerCount();
                        }
                        mo91697a(i);
                        FollowerDetail b2 = C36337ai.m117569b(this.f94531Q.getFollowerDetailList());
                        if (b2 != null) {
                            b2.setFansCount(b2.getFansCount() + 1);
                        }
                        this.f94531Q.setFollowStatus(followStatus.followStatus);
                        if (this.f94531Q.isBlock()) {
                            this.f94531Q.setBlock(false);
                            if (this.f95348an != null) {
                                this.f95348an.mo56976a(this.f95349ao, this.f95351aq);
                            }
                            C36340al a = m117425a((ProfileListFragment) mo92362j(bD_()));
                            C36340al a2 = m117425a((ProfileListFragment) mo92362j(mo91931q()));
                            if (a != null) {
                                a.mo90811A();
                            }
                            if (a2 != null) {
                                a2.mo90811A();
                            }
                            ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(mo91933t());
                            if (profileListFragment != null && (profileListFragment instanceof UserStateFragment)) {
                                ((UserStateFragment) profileListFragment).mo86905g();
                            }
                        }
                    }
                    m117450o(followStatus.followStatus);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo26116b(C10825f fVar) {
        String q = m117452q(fVar.f29291e);
        this.f95368bh = q;
        if ("trends".equals(q)) {
            m117436ag();
        }
        if (C6399b.m19947w()) {
            m117429a("like".equals(q), this.f95367bg);
        }
        if (this.f95343ai) {
            this.f95343ai = false;
        } else if (!TextUtils.isEmpty(q) && this.f95306X) {
            C6907h.m21524a("change_profile_tab", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "slide").mo59973a("tab_name", q).mo59973a("to_user_id", this.f95349ao).f60753a);
            if (this.f95369bi) {
                this.f95369bi = false;
                if (m117442b(this.f95307Y)) {
                    C24976t.m82255m(getContext(), this.f95307Y, q);
                }
            }
        }
        if (this.f95306X) {
            m117438ai();
            m117437ah();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo91949l(int i) {
        String str;
        if (i == 5) {
            this.f95326aR = (EnterpriseTabFragment) mo92361b(7);
            if (this.f95326aR == null) {
                this.f95326aR = new EnterpriseTabFragment();
                this.f95326aR.f66063f = false;
                this.f95326aR.f66062e = this.f94531Q;
                this.f95326aR.mo65514a(this.f95307Y);
            }
            mo91942a((ProfileListFragment) this.f95326aR, Integer.valueOf(7));
        } else if (i == 7) {
            this.f95327aS = (BrandTabFragment) mo92361b(10);
            if (this.f95327aS == null) {
                this.f95327aS = new BrandTabFragment();
                if (!(this.f94531Q == null || this.f94531Q.getTabSetting() == null || this.f94531Q.getTabSetting().getBrandTab() == null)) {
                    this.f95327aS.f66049e = this.f94531Q.getTabSetting().getBrandTab();
                }
                this.f95327aS.f66050f = false;
            }
            mo91942a((ProfileListFragment) this.f95327aS, Integer.valueOf(10));
        } else if (i == 9) {
            this.f95328aT = (AggregationTabFragment) mo92361b(12);
            if (this.f95328aT == null) {
                this.f95328aT = new AggregationTabFragment();
                if (!(this.f94531Q == null || this.f94531Q.getTabSetting() == null || this.f94531Q.getTabSetting().getAggregationTab() == null)) {
                    this.f95328aT.f66038e = this.f94531Q.getTabSetting().getAggregationTab();
                }
                this.f95328aT.f66039f = false;
            }
            mo91942a((ProfileListFragment) this.f95328aT, Integer.valueOf(12));
        } else if (i == 4) {
            this.f95329aU = (EffectListFragment) mo92361b(6);
            if (this.f95329aU == null) {
                this.f95329aU = C36143a.m116588a(mo91939E(), "", "", false);
                this.f95329aU.mo92306h(C43105eq.m136725a(6));
            }
            mo91942a((ProfileListFragment) this.f95329aU, Integer.valueOf(6));
        } else if (i == 3) {
            this.f95322aN = (OriginMusicListFragment) mo92361b(3);
            if (this.f95322aN == null) {
                this.f95322aN = OriginMusicListFragment.m108624a("", false);
                this.f95322aN.mo90831e(this.f95308Z);
                this.f95322aN.mo92306h(C43105eq.m136725a(3));
                OriginMusicListFragment originMusicListFragment = this.f95322aN;
                if (TextUtils.isEmpty(this.f94531Q.getUniqueId())) {
                    str = this.f94531Q.getShortId();
                } else {
                    str = this.f94531Q.getUniqueId();
                }
                originMusicListFragment.f87871j = str;
                this.f95322aN.f87866e = this;
            }
            mo91942a((ProfileListFragment) this.f95322aN, Integer.valueOf(3));
        } else if (i == 0) {
            this.f95339ae = (C36340al) mo92361b(0);
            if (this.f95339ae == null) {
                this.f95339ae = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createAwemeListFragment(-1, 0, this.f95349ao, this.f95351aq, false, false);
                this.f95339ae.mo92454h(C43105eq.m136725a(0));
                if (C7213d.m22500a().mo18803bo().useRecyclerPartialUpdate) {
                    this.f95339ae.mo90824b(12);
                }
            }
            mo91942a((ProfileListFragment) this.f95339ae, Integer.valueOf(0));
        } else if (i == 1) {
            this.f95323aO = (UserStateFragment) mo92361b(5);
            if (this.f95323aO == null) {
                this.f95323aO = UserStateFragment.m110246a("others_homepage", this.f95349ao, this.f95351aq);
                this.f95323aO.mo92306h(C43105eq.m136725a(5));
            }
            mo91942a((ProfileListFragment) this.f95323aO, Integer.valueOf(5));
        } else if (i == 2) {
            this.f95324aP = (C36340al) mo92361b(1);
            if (this.f95324aP == null) {
                this.f95324aP = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createAwemeListFragment(-1, 1, this.f95349ao, this.f95351aq, false, false);
                this.f95324aP.mo92454h(C43105eq.m136725a(1));
            }
            if (C6399b.m19947w()) {
                this.f95324aP.mo90818a((C36343c) new C36467ev(this));
            }
            mo91942a((ProfileListFragment) this.f95324aP, Integer.valueOf(1));
        } else {
            if (i == 8) {
                this.f95325aQ = (RecommendUserFragment) mo92361b(13);
                if (this.f95325aQ == null) {
                    this.f95325aQ = RecommendUserFragment.m118242b(this.f95338ad);
                    this.f95325aQ.f96216f = this.f95280i;
                    this.f95325aQ.mo92306h(C43105eq.m136725a(13));
                } else {
                    this.f95325aQ.mo92961a(this.f95338ad);
                }
                mo91942a((ProfileListFragment) this.f95325aQ, Integer.valueOf(13));
            }
        }
    }

    /* renamed from: o */
    public final void mo92127o(User user) {
        if (isViewValid()) {
            if (user != null) {
                this.f94535U.mo93194a(user);
                if (this.f95348an == null) {
                    this.f95348an = new C36012aj();
                    this.f95348an.mo66537a(this);
                    this.f95348an.f94218e = this.f95359ay;
                    this.f95348an.f94219f = getArguments().getInt("general_search_card_type", 0);
                }
                if (!TextUtils.isEmpty(user.getUid())) {
                    this.f95349ao = user.getUid();
                }
                this.f95348an.mo91624a(user, false);
                if (mo92148G() && (this.f94502o instanceof C43376l)) {
                    ((C43376l) this.f94502o).setScrollable(false);
                }
                if (this.f94526L instanceof C36492ag) {
                    ((C36492ag) this.f94526L).setSimpleUser(true);
                    ((C36492ag) this.f94526L).setSimpleUserData(user);
                    ((C36492ag) this.f94526L).mo92694a((TextView) null, this.mRightMoreBtn);
                    ((C36492ag) this.f94526L).mo92704j(user);
                } else {
                    this.f94526L.mo92660h(user);
                }
                this.f94526L.mo92671q();
                this.f94526L.mo92558s();
                if (TextUtils.equals(user.getUid(), C21115b.m71197a().getCurUserId())) {
                    if (this.mRightMoreBtn != null) {
                        this.mRightMoreBtn.setVisibility(8);
                    }
                } else if (C35992k.m115951a() && this.mRightMoreBtn != null) {
                    this.mRightMoreBtn.setVisibility(0);
                }
            }
            if (this.f95370l != null) {
                this.f95370l.mo68399b(user);
            }
            mo91940F();
            if (this.f95364bd != null) {
                this.f95364bd.mo65724a((BaseDTProfileFragment) this, user);
                this.f95364bd = null;
            }
            if (this.mFansShakeView != null) {
                this.mFansShakeView.mo90670c();
            }
        }
    }

    /* renamed from: c */
    private void m117443c(String str, String str2) {
        m117444d(str, str2);
    }

    /* renamed from: a */
    public final void mo91698a(int i, int i2) {
        mo91947k(i);
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        super.mo61702b(i, i2);
        if (this.f95344aj) {
            this.f95371m.mo66192a(i);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m117426a(long j, String str) throws Exception {
        C33250au auVar = (C33250au) new C33250au().mo85151b("others_homepage").mo85150a(String.valueOf(j)).mo85283l(str);
        if ("trends".equals(str)) {
            auVar.mo85152c("list");
        }
        auVar.mo85252e();
        return null;
    }

    /* renamed from: d */
    private void m117444d(String str, String str2) {
        boolean z = true;
        if (!(this.f94531Q.getGeneralPermission() == null || this.f94531Q.getGeneralPermission().getOriginalList() == 0)) {
            z = false;
        }
        if (z) {
            ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(0);
            if (profileListFragment instanceof OriginMusicListFragment) {
                OriginMusicListFragment originMusicListFragment = (OriginMusicListFragment) profileListFragment;
                originMusicListFragment.mo65501a(str, str2);
                if (mo91928n()) {
                    originMusicListFragment.mo86063a(str);
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mScrollableLayout.addView(this.f94526L, 0);
        this.f95331aW = (MainAnimViewModel) C0069x.m159a(getActivity()).mo147a(MainAnimViewModel.class);
        this.f95331aW.f85655c.observe(this, this);
        C23352a.m76612a().mo60651a("aweme.main.profile.more_page_user_info_change", User.class).observe(this, new C36456ek(this));
        if (!C6399b.m19944t()) {
            this.f95370l = new ProfileHitRankHelper();
            this.f95370l.mo68397a(getActivity(), this, this.mHitRankTagContainer);
        }
        m117409I();
    }

    /* renamed from: a */
    private void m117429a(boolean z, boolean z2) {
        Drawable drawable;
        if (mo91931q() >= 0 && !TimeLockRuler.isTeenModeON()) {
            this.f95367bg = z2;
            ProfileTabView p = m117451p(mo91931q());
            if (!(p == null || getContext() == null)) {
                if (!z2) {
                    drawable = null;
                } else if (z) {
                    drawable = getContext().getResources().getDrawable(R.drawable.b_r);
                } else {
                    drawable = getContext().getResources().getDrawable(R.drawable.b_s);
                }
                p.setDrawableLeft(drawable);
                if (z2) {
                    p.setText(getContext().getString(R.string.bz_));
                }
            }
        }
    }

    /* renamed from: b */
    private void m117441b(String str, String str2) {
        if (this.f94526L instanceof C36492ag) {
            ((C36492ag) this.f94526L).mo92697a(this.f95349ao, (C0608j) this.mFragmentManager);
        }
        if (this.f95317aI) {
            m117448k(str);
            if (!m117421W()) {
                m117427a((RoomStruct) null);
            }
            C6907h.m21524a("profile_exception_monitor", (Map) C22984d.m75611a().mo59973a("type", "user info is loaded").mo59973a(C22704b.f60415d, "user info is loaded, so don't request net again").mo59973a("uid", str).f60753a);
            m117419U();
            return;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f95350ap) || !TextUtils.isEmpty(str2)) {
            this.f95349ao = str;
            this.f95351aq = str2;
            this.f95338ad.setmUserId(this.f95349ao);
            this.f95338ad.setSecUserId(this.f95351aq);
            if (!C36469ex.m117670a(AwemeApplication.m21341a())) {
                if (!this.f95355au) {
                    C10761a.m31399c((Context) AwemeApplication.m21341a(), (int) R.string.cjs).mo25750a();
                }
                this.f95355au = true;
                return;
            }
            if (this.f95348an == null) {
                this.f95348an = new C36012aj();
                this.f95348an.mo66537a(this);
                this.f95348an.f94218e = this.f95359ay;
                this.f95348an.f94219f = getArguments().getInt("general_search_card_type", 0);
            }
            this.f95341ag = false;
            this.f95348an.mo56976a(this.f95349ao, this.f95351aq, this.f95350ap);
            this.f95317aI = true;
            this.f95355au = false;
        } else {
            C6907h.m21524a("profile_exception_monitor", (Map) C22984d.m75611a().mo59973a("type", "uid == null").mo59973a(C22704b.f60415d, "don't request user, because uid is null").mo59973a("uid", str).mo59973a(C22689a.f60407a, str2).mo59973a("unique_id", this.f95350ap).f60753a);
        }
        this.f95360az = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C33248at mo92369a(String str, C33248at atVar) {
        atVar.mo85140c(str).mo85071g(this.f95307Y).mo85147j(this.f95349ao).mo85146i(this.f95356av).mo85145g(this.f95334aZ).mo85137a(this.f95361ba);
        return atVar;
    }

    /* renamed from: a */
    public final void mo61694a(float f, float f2) {
        super.mo61694a(f, f2);
        if (f2 > 5.0f) {
            if (!this.f95309aA) {
                mo92381n((int) C34943c.f91128x);
            }
            this.f95309aA = true;
            return;
        }
        if (f2 < -5.0f) {
            if (!this.f95309aA && this.f95335aa) {
                mo92379f(false);
            }
            this.f95309aA = true;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context activity = getActivity();
        if (!TextUtils.isEmpty(this.f95349ao)) {
            this.f95338ad.setmUserId(this.f95349ao);
        }
        if (!TextUtils.isEmpty(this.f95351aq)) {
            this.f95338ad.setSecUserId(this.f95351aq);
        }
        if (activity == null) {
            activity = viewGroup.getContext();
        }
        C36534bf bfVar = new C36534bf(activity, this, this.f95338ad, this.f95330aV, this.f95279h, this.f94535U);
        this.f94526L = bfVar;
        this.f94526L.setFragment(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
