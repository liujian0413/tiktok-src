package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.vast.model.Icon;
import com.bytedance.vast.model.VideoClick;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22942a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22943b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commerce.p1104a.C24411a;
import com.p280ss.android.ugc.aweme.commercialize.abtest.DouPlusShowV3Debug;
import com.p280ss.android.ugc.aweme.commercialize.adapter.C24512a;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24641b;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24655d;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24664i;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b;
import com.p280ss.android.ugc.aweme.commercialize.feed.p1126a.C24705a;
import com.p280ss.android.ugc.aweme.commercialize.link.C24792i;
import com.p280ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.p1129a.C24767a.C24768a;
import com.p280ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.video.C24804a;
import com.p280ss.android.ugc.aweme.commercialize.link.video.C24815l;
import com.p280ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.log.C24935ah;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24952c;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.commercialize.log.C24975s;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.C24989b;
import com.p280ss.android.ugc.aweme.commercialize.model.C24990c;
import com.p280ss.android.ugc.aweme.commercialize.model.C24990c.C24991a;
import com.p280ss.android.ugc.aweme.commercialize.model.C25005n;
import com.p280ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.model.NativeCardInfo;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdRatingView;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdTagGroup;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24510b;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.DescTextView;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24568i;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24572l;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b;
import com.p280ss.android.ugc.aweme.commercialize.symphony.C25154f;
import com.p280ss.android.ugc.aweme.commercialize.symphony.C25155g;
import com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25222ad;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25251av;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25294bv;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25301by;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25364j;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25384x;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1139d.C25345a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1139d.C25347c.C25348a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1139d.C25349d;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p280ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.p280ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.p280ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p280ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25549c;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25549c.C25557a;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25570o;
import com.p280ss.android.ugc.aweme.commercialize.views.form.C25584a;
import com.p280ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget;
import com.p280ss.android.ugc.aweme.commercialize.widget.AdPlayFunWidget;
import com.p280ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p280ss.android.ugc.aweme.commercialize.widget.C25638a;
import com.p280ss.android.ugc.aweme.commercialize.widget.C25638a.C25639a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28066ac;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.C28133af;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.feed.model.CommentEggDataManager;
import com.p280ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p280ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.p280ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b;
import com.p280ss.android.ugc.aweme.main.C32891b;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.miniapp.card.C33374a;
import com.p280ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;
import com.p280ss.android.ugc.aweme.miniapp.utils.C33419c;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.p1500r.p1501a.C37124b;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41540at;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41544aw;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43464a.C43466b;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.C7581n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate */
public class CommerceVideoDelegate extends C24512a implements C0053p<C23083a>, C24716aj {

    /* renamed from: a */
    public static final String f65047a = "CommerceVideoDelegate";

    /* renamed from: q */
    private static final int f65048q = 2131296350;

    /* renamed from: A */
    private String f65049A;

    /* renamed from: B */
    private String f65050B;

    /* renamed from: C */
    private String f65051C;

    /* renamed from: D */
    private AdPlayFunWidget f65052D;

    /* renamed from: E */
    private boolean f65053E = false;

    /* renamed from: F */
    private C24638b f65054F;

    /* renamed from: G */
    private ArrayList<String> f65055G = new ArrayList<>();

    /* renamed from: H */
    private C25549c f65056H;
    DmtTextView adAppUseNumber;
    CircleWaveLayout adCircleWaveLayout;
    LinearLayout adFeeDeductionLayout;
    DescTextView adGuideDesc;
    RemoteImageView adGuideIcon;
    RemoteImageView adGuideImage;
    DmtTextView adGuideLabel;
    DmtTextView adGuideName;
    DmtTextView adGuidePrice;
    DmtTextView adGuideService;
    DmtTextView adGuideTitle;
    RemoteImageView adGuideWebImage;
    AdHalfWebPageContainer adHalfWebPageContainer;
    View adLikeDivide;
    LinearLayout adLikeLayout;
    LinearLayout adPriceLayout;
    AdRatingView adRatingView;
    RemoteImageView adRedPacketIv;
    AdTagGroup adTagGroup;

    /* renamed from: b */
    public int f65057b;
    AdHalfWebPageMaskLayer blackMaskLayer;

    /* renamed from: c */
    public Aweme f65058c;

    /* renamed from: d */
    public final C28130ac f65059d;
    CommerceLikeLayout diggLayout;

    /* renamed from: e */
    public String f65060e;
    CommerceEggLayout eggLayout;

    /* renamed from: f */
    public Context f65061f;
    TextView feeDeductionHint;
    TextView feedAdDownloadBtn;
    LinearLayout feedAdLayout;
    View feedAdReplay;
    LinearLayout feedStarAtlasCheckLL;
    FrameLayout flAdGuideRoot;

    /* renamed from: g */
    public C24723e f65062g = new C24723e();

    /* renamed from: h */
    public boolean f65063h = false;

    /* renamed from: i */
    public C24613b f65064i = new C24613b() {
        /* renamed from: a */
        public final void mo58895a() {
            String str;
            if (!(CommerceVideoDelegate.this.f65058c == null || CommerceVideoDelegate.this.f65058c.getAwemeRawAd() == null)) {
                if (!C25352e.m83217a(CommerceVideoDelegate.this.f65060e) || CommerceVideoDelegate.this.feedAdLayout.getVisibility() != 0) {
                    if (CommerceVideoDelegate.this.feedAdLayout.getVisibility() == 0) {
                        str = "background_ad";
                    } else {
                        str = "draw_ad";
                    }
                    DownloaderManagerHolder.m75524a().mo51670a(C25352e.m83241x(CommerceVideoDelegate.this.f65058c), CommerceVideoDelegate.this.f65058c.getAwemeRawAd().getAdId().longValue(), 2, C22943b.m75511a(str, CommerceVideoDelegate.this.f65058c.getAwemeRawAd(), "button"), C22942a.m75508a(CommerceVideoDelegate.this.f65058c.getAwemeRawAd()));
                } else {
                    DownloaderManagerHolder.m75524a().mo51670a(C25352e.m83241x(CommerceVideoDelegate.this.f65058c), CommerceVideoDelegate.this.f65058c.getAwemeRawAd().getAdId().longValue(), 2, C22943b.m75514b("draw_ad", CommerceVideoDelegate.this.f65058c.getAwemeRawAd(), "bg_download_button"), C22942a.m75508a(CommerceVideoDelegate.this.f65058c.getAwemeRawAd()));
                }
            }
        }
    };
    LinearLayout introContainer;

    /* renamed from: j */
    private int f65065j;

    /* renamed from: k */
    private boolean f65066k;

    /* renamed from: l */
    private boolean f65067l;

    /* renamed from: m */
    private TextView f65068m;
    View mAdBackgroundLayout;
    FrameLayout mBottomView;
    DouPlusTagLayout mDouPlusLinkTag;
    AnimationImageView mIvRelieveTag;
    CommerceTagLayout mLinkTag;
    CommerceMicroTagLayout mMicroTag;
    NationalTaskTagLayout mNationalTaskTagLayout;
    StarAtlasTagLayout mStarAtlasTagLayout;

    /* renamed from: n */
    private RelativeLayout f65069n;
    ButtonAdBottomLabelView newAdBottomLabelView;

    /* renamed from: o */
    private TagLayout f65070o;
    StripAdBottomLabelView oldAdBottomLabelView;

    /* renamed from: p */
    private MicroAppVideoCardView f65071p;

    /* renamed from: r */
    private DataCenter f65072r;

    /* renamed from: s */
    private WidgetManager f65073s;
    DmtTextView starAtlasCheckHintTv;

    /* renamed from: t */
    private C25349d f65074t = new C25349d();

    /* renamed from: u */
    private C28343z<C28318an> f65075u;

    /* renamed from: v */
    private JSONObject f65076v;
    ViewGroup vastAdTag;
    RemoteImageView vastAdTagAdChoice;
    DmtTextView vastAdTagText;

    /* renamed from: w */
    private Fragment f65077w;

    /* renamed from: x */
    private final C24682a f65078x = new C24682a();

    /* renamed from: y */
    private C24683b f65079y = null;

    /* renamed from: z */
    private C24705a f65080z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$a */
    class C24682a implements C25154f {

        /* renamed from: b */
        private boolean f65096b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo64615a() {
            this.f65096b = true;
        }

        /* renamed from: d */
        private boolean m80997d() {
            return C28478a.m93583a(CommerceVideoDelegate.this.f65058c);
        }

        /* renamed from: b */
        public final void mo64616b() {
            if (!this.f65096b) {
                this.f65096b = true;
                m80998e();
            }
        }

        /* renamed from: c */
        public final void mo64617c() {
            if (this.f65096b) {
                this.f65096b = false;
                m80999f();
            }
        }

        /* renamed from: e */
        private void m80998e() {
            if (!CommerceVideoDelegate.this.f65063h && m80997d()) {
                C24411a.m80259a().mo63391e(CommerceVideoDelegate.this.f65058c, CommerceVideoDelegate.this.f65061f, CommerceVideoDelegate.this.f65059d.mo65716m().mo71570u(), CommerceVideoDelegate.this.f65057b);
            }
        }

        /* renamed from: f */
        private void m80999f() {
            if (!CommerceVideoDelegate.this.f65063h && m80997d()) {
                C24411a.m80259a().mo63393f(CommerceVideoDelegate.this.f65058c, CommerceVideoDelegate.this.f65061f, CommerceVideoDelegate.this.f65059d.mo65716m().mo71570u(), CommerceVideoDelegate.this.f65057b);
            }
        }

        private C24682a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b */
    static class C24683b implements Runnable {

        /* renamed from: a */
        private final Handler f65097a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        private final WeakReference<CommerceVideoDelegate> f65098b;

        /* renamed from: b */
        public final void mo64619b() {
            this.f65097a.removeCallbacks(this);
        }

        /* renamed from: a */
        public final void mo64618a() {
            this.f65097a.removeCallbacks(this);
            this.f65097a.postDelayed(this, 200);
        }

        public final void run() {
            CommerceVideoDelegate commerceVideoDelegate = (CommerceVideoDelegate) this.f65098b.get();
            if (commerceVideoDelegate != null) {
                C25294bv.m83110b(commerceVideoDelegate.f65058c, C43316v.m137450K().mo104915n());
                mo64618a();
            }
        }

        C24683b(CommerceVideoDelegate commerceVideoDelegate) {
            this.f65098b = new WeakReference<>(commerceVideoDelegate);
        }
    }

    /* renamed from: c */
    public final C24723e mo64577c() {
        return this.f65062g;
    }

    /* renamed from: f */
    public final C24613b mo64583f() {
        return this.f65064i;
    }

    /* renamed from: k */
    public final C25570o mo64589k() {
        return this.f65056H;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64557a(View view) {
        Icon c = C25300bx.m83130c(this.f65058c);
        if (c != null && !C6307b.m19566a((Collection<T>) c.clickList)) {
            C25301by.m83137a(c);
            for (VideoClick videoClick : c.clickList) {
                if (!TextUtils.isEmpty(videoClick.clickThrough)) {
                    C25371n.m83450a(this.f65061f, this.f65058c, videoClick.clickThrough, (String) null);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64563a(Aweme aweme) {
        if (aweme != null) {
            aweme.setActivityId(this.f65049A);
            aweme.setNewSourceType(this.f65050B);
            aweme.setNewSourceId(this.f65051C);
            this.f65058c = aweme;
            this.f65062g.mo64700a(this.f65061f, aweme, this.f65060e);
            m80899Y();
            m80895U();
            m80896V();
            m80911c(aweme);
            if (!(this.f65059d == null || this.f65059d.mo65716m() == null || this.f65059d.mo65716m().mo71570u() == null)) {
                C24411a.m80259a().mo63380a(this.f65058c, this.f65061f);
            }
        }
    }

    /* renamed from: a */
    public final void mo64568a(boolean z) {
        m80907b(z, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64569a(boolean z, boolean z2) {
        this.feedAdLayout.setVisibility(8);
        if (z) {
            if (!C43316v.m137250H()) {
                C43316v.m137450K().mo104946v();
            } else {
                C44960f c = m80909c(this.f65059d);
                if (c != null) {
                    c.mo71671ac();
                }
            }
            if (this.f65062g != null && z2) {
                this.f65062g.mo64696a(2, this.f65057b + 1);
            }
            this.f65063h = false;
            C42961az.m136380a(new C24572l(false, this.f65058c.getAid()));
        }
    }

    /* renamed from: a */
    public final void mo64558a(DataCenter dataCenter) {
        this.f65072r = dataCenter;
        if (this.f65072r != null) {
            this.f65072r.mo60132a("on_ad_light_web_page_show", (C0053p<C23083a>) this);
            this.f65072r.mo60132a("on_ad_light_web_page_hide", (C0053p<C23083a>) this);
            this.f65072r.mo60132a("AD_ACTION_MOVE_IN_DESC", (C0053p<C23083a>) this);
            this.f65072r.mo60132a("AD_ACTION_MOVE_OUT_DESC", (C0053p<C23083a>) this);
            this.f65072r.mo60132a("on_ad_pop_up_web_page_show", (C0053p<C23083a>) this);
            this.f65072r.mo60132a("on_ad_pop_up_web_page_hide", (C0053p<C23083a>) this);
        }
    }

    /* renamed from: a */
    public final boolean mo64570a(C0608j jVar, C28130ac acVar) {
        if (!C25352e.m83221d(this.f65058c) || !m80887M()) {
            return false;
        }
        if (C25352e.m83203E(this.f65058c)) {
            if (C23487o.m77156c((View) this.adHalfWebPageContainer)) {
                return false;
            }
            CardStruct U = C25352e.m83310U(this.f65058c);
            if (U == null || TextUtils.isEmpty(U.getCardUrl())) {
                return mo64571a(acVar);
            }
            return m80908b(jVar, acVar);
        } else if (!C24750z.m81233a(this.f65061f)) {
            return mo64571a(acVar);
        } else {
            if (TextUtils.isEmpty(C25352e.m83302M(this.f65058c))) {
                return mo64571a(acVar);
            }
            if (!C19929d.m65759a(C25352e.m83302M(this.f65058c))) {
                return mo64571a(acVar);
            }
            if (C25384x.m83529a(this.f65058c)) {
                return m80908b(jVar, acVar);
            }
            return mo64571a(acVar);
        }
    }

    /* renamed from: a */
    public final boolean mo64571a(C28130ac acVar) {
        if (mo64602w() || mo64600u()) {
            return false;
        }
        if (this.f65062g.mo64712g() && DownloaderManagerHolder.m75524a().mo51673b(C25352e.m83241x(this.f65058c))) {
            return false;
        }
        this.f65063h = true;
        if (!C25352e.m83217a(this.f65060e)) {
            if (!(this.f65058c == null || this.f65058c.getAwemeRawAd() == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("background_type", String.valueOf(this.f65058c.getAwemeRawAd().getNativeCardType()));
                C24976t.m82056a(this.f65061f, this.f65058c, (Map<String, String>) hashMap);
            }
            C24976t.m82287w(this.f65061f, this.f65058c);
        } else if (!(this.f65058c == null || this.f65058c.getAwemeRawAd() == null)) {
            if (this.f65058c.isAppAd()) {
                C24976t.m82233h(this.f65061f, this.f65058c.getAwemeRawAd().getCreativeIdStr(), "bg_download_button", this.f65058c.getAwemeRawAd().getLogExtra());
            } else {
                C24976t.m82233h(this.f65061f, this.f65058c.getAwemeRawAd().getCreativeIdStr(), "bg_more_button", this.f65058c.getAwemeRawAd().getLogExtra());
            }
        }
        if (m80892R()) {
            this.f65052D.mo66459a(true);
        }
        this.feedAdLayout.setAlpha(0.0f);
        this.f65069n.setAlpha(1.0f);
        this.f65069n.animate().alpha(0.0f).setDuration(150).withEndAction(new C24744t(this, acVar)).start();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64566a(String str, String str2, long j) {
        C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65273b(this.f65058c).mo65278b();
    }

    /* renamed from: a */
    public final void mo64554a(Context context, Aweme aweme) {
        if (!mo64580d() && aweme != null && this.f65062g != null) {
            if (this.f65062g.mo64705a()) {
                C24411a.m80259a();
                C24411a.m80261a(context, aweme);
            }
            m80907b(true, false);
        }
    }

    /* renamed from: b */
    public final void mo64575b(boolean z) {
        if (!C28066ac.m91706b(this.f65060e)) {
            m80900a((View) this.mBottomView, z);
        }
        this.adHalfWebPageContainer.setInCleanMode(z);
        this.f65071p.mo85553a(z, this.f65058c);
        if (m80892R()) {
            this.f65052D.mo66459a(z);
        }
    }

    /* renamed from: a */
    public final void mo64555a(C0608j jVar) {
        if (C25352e.m83203E(this.f65058c) && this.f65056H == null) {
            this.f65056H = new C25557a().mo66338a(this.f65061f).mo66344a(this.f65058c).mo66341a(this.adHalfWebPageContainer).mo66342a(this.blackMaskLayer).mo66339a(jVar).mo66340a(this.f65072r).mo66343a(this.f65059d).f67338a;
            this.f65056H.mo66316a();
            C24952c.m81880a(this.f65058c);
        }
    }

    /* renamed from: a */
    public final void mo64552a(int i, String str) {
        this.f65072r.mo60134a("ACTION_HALF_WEB_PAGE_SHOW", (Object) new C24989b(i, str, this.oldAdBottomLabelView));
    }

    /* renamed from: a */
    public final void mo64553a(long j) {
        this.oldAdBottomLabelView.mo66093a(j);
        this.newAdBottomLabelView.mo66093a(j);
    }

    /* renamed from: a */
    public final void mo64556a(C0608j jVar, boolean z, C28130ac acVar) {
        if (this.f65063h) {
            this.f65063h = false;
            C25222ad.m82929a(jVar, this.flAdGuideRoot, f65048q, z);
            if (C43316v.m137250H()) {
                C44960f c = m80909c(acVar);
                if (c != null && z) {
                    c.mo71671ac();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64561a(C25005n nVar) {
        C24976t.m82167b(this.f65058c, nVar.f65936a, (C24939aj) new C24734p(this, nVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64562a(C25005n nVar, String str, String str2, long j) {
        if (C6399b.m19944t()) {
            C24961b a = C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad");
            StringBuilder sb = new StringBuilder("cpv_");
            sb.append(nVar.f65936a);
            sb.append("s");
            a.mo65285g(sb.toString()).mo65273b(this.f65058c).mo65281c();
        }
    }

    /* renamed from: a */
    public final void mo64565a(String str) {
        this.f65074t.mo65916c();
    }

    /* renamed from: a */
    public final void mo64567a(JSONObject jSONObject) {
        this.f65076v = jSONObject;
    }

    /* renamed from: a */
    public final void mo64564a(FeedParam feedParam) {
        this.f65049A = feedParam.getActivityId();
        this.f65050B = feedParam.getNewSourceType();
        this.f65051C = feedParam.getNewSourceId();
    }

    /* renamed from: a */
    public final void mo64560a(C24568i iVar) {
        this.f65072r.mo60134a("ad_on_receive_js_bridge_event", (Object) iVar);
    }

    /* renamed from: C */
    private void m80877C() {
        this.f65071p.setVisibility(8);
    }

    /* renamed from: M */
    private boolean m80887M() {
        return this.f65055G.isEmpty();
    }

    /* renamed from: N */
    private void m80888N() {
        this.adCircleWaveLayout.mo66129b();
    }

    /* renamed from: O */
    private void m80889O() {
        this.f65080z.mo64650a();
    }

    /* renamed from: P */
    private void m80890P() {
        this.f65080z.mo64651b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final /* synthetic */ void mo64546A() {
        C24976t.m82094aG(this.f65061f, this.f65058c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final /* synthetic */ void mo64547B() {
        this.feedAdLayout.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo64581e() {
        this.f65062g.mo64714i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final /* synthetic */ void mo64605z() {
        C24976t.m82095aH(this.f65061f, this.f65058c);
    }

    /* renamed from: Q */
    private void m80891Q() {
        this.oldAdBottomLabelView.mo66126o();
        this.newAdBottomLabelView.mo66126o();
    }

    /* renamed from: R */
    private boolean m80892R() {
        if (!C25352e.m83307R(this.f65058c) || this.f65052D == null) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    private void m80899Y() {
        if (this.f65058c != null) {
            m80897W();
            m80898X();
        }
    }

    /* renamed from: b */
    public final boolean mo64576b() {
        if (this.feedAdLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo64591m() {
        this.oldAdBottomLabelView.mo66117k();
        this.newAdBottomLabelView.mo66117k();
    }

    /* renamed from: p */
    public final void mo64595p() {
        this.oldAdBottomLabelView.mo66117k();
        this.newAdBottomLabelView.mo66117k();
    }

    /* renamed from: s */
    public final void mo64598s() {
        this.f65072r.mo60134a("ad_video_on_pause_play", (Object) null);
    }

    /* renamed from: t */
    public final void mo64599t() {
        this.oldAdBottomLabelView.mo66106f();
        this.newAdBottomLabelView.mo66106f();
    }

    /* renamed from: v */
    public final void mo64601v() {
        this.f65072r.mo60134a("ad_video_on_render_ready", (Object) null);
        m80894T();
    }

    /* renamed from: x */
    public final void mo64603x() {
        this.f65072r.mo60134a("video_stop_dou_plus_guide_animation", (Object) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final /* synthetic */ void mo64604y() {
        this.f65053E = true;
        this.f65052D.mo66460d();
    }

    /* renamed from: S */
    private void m80893S() {
        if (this.f65068m != null) {
            this.introContainer.setTranslationX(0.0f);
            this.introContainer.setTranslationY(0.0f);
            this.introContainer.setAlpha(1.0f);
        }
    }

    /* renamed from: i */
    public final void mo64587i() {
        if (this.f65069n != null) {
            C25364j.m83400a(this.f65061f, this.f65058c, this.adHalfWebPageContainer, this.oldAdBottomLabelView);
            m80889O();
        }
    }

    /* renamed from: j */
    public final void mo64588j() {
        if (this.f65058c != null) {
            if (C24655d.f65016d) {
                this.eggLayout.mo64483a(C24655d.f65013a, this.f65054F);
                return;
            }
            this.diggLayout.mo66138a(this.f65060e, this.f65058c.getAid());
        }
    }

    /* renamed from: l */
    public final void mo64590l() {
        if (this.f65056H != null) {
            this.f65056H.mo66324c();
        }
        this.f65056H = null;
        this.adHalfWebPageContainer.mo65983e();
    }

    /* renamed from: n */
    public final void mo64592n() {
        if (this.f65058c != null && this.f65058c.isAppAd()) {
            this.oldAdBottomLabelView.mo66105e();
            this.newAdBottomLabelView.mo66105e();
        }
        if (this.f65056H != null) {
            this.f65056H.mo66327f();
        }
    }

    /* renamed from: u */
    public final boolean mo64600u() {
        Fragment fragment = this.f65077w;
        if (fragment == null || !(fragment instanceof C28133af)) {
            return false;
        }
        return ((C28133af) fragment).mo67749k();
    }

    /* renamed from: w */
    public final boolean mo64602w() {
        if (!(this.f65061f instanceof FragmentActivity) || !C25384x.m83528a(((FragmentActivity) this.f65061f).getSupportFragmentManager())) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    private void m80886L() {
        if (this.f65073s != null) {
            this.f65073s.mo60152a((View) null, (Widget) new AdLightWebPageWidget());
            this.f65073s.mo60152a((View) null, (Widget) new AdPopUpWebPageWidget());
            this.f65052D = new AdPlayFunWidget();
            this.f65073s.mo60157b(R.id.cx, this.f65052D);
        }
    }

    /* renamed from: T */
    private void m80894T() {
        if (this.f65058c != null && this.f65058c.isAd()) {
            long a = C25345a.m83283a(this.f65058c, m80909c(this.f65059d));
            if (C6399b.m19944t()) {
                m80905b(a);
            } else {
                m80910c(a);
            }
            this.f65074t.mo65914b();
        }
    }

    /* renamed from: X */
    private void m80898X() {
        if (!(this.f65058c == null || this.mDouPlusLinkTag == null)) {
            if (C24792i.m81353f(this.f65058c)) {
                final DouPlusLinkData W = C25352e.m83312W(this.f65058c);
                this.mDouPlusLinkTag.mo64854a(W, new C24804a() {
                    /* renamed from: a */
                    public final void mo64610a() {
                    }

                    /* renamed from: c */
                    public final void mo64612c() {
                    }

                    /* renamed from: b */
                    public final void mo64611b() {
                        C25371n.m83449a(CommerceVideoDelegate.this.f65061f, CommerceVideoDelegate.this.f65058c, CommerceVideoDelegate.this.f65062g, 18, CommerceVideoDelegate.this.f65064i);
                        C24976t.m82062a(CommerceVideoDelegate.this.f65061f, "click", W, CommerceVideoDelegate.this.f65058c);
                        C43466b.m137929a(CommerceVideoDelegate.this.f65058c);
                    }
                });
                this.mDouPlusLinkTag.setVisibility(0);
                return;
            }
            this.mDouPlusLinkTag.mo64853a();
            this.mDouPlusLinkTag.setVisibility(8);
        }
    }

    /* renamed from: q */
    public final void mo64596q() {
        this.f65072r.mo60134a("ad_on_fragment_resume", (Object) null);
        if (this.f65058c != null && this.f65058c.isAppAd()) {
            this.oldAdBottomLabelView.mo66105e();
            this.newAdBottomLabelView.mo66105e();
        }
        if (m80892R()) {
            this.f65052D.mo66461e();
        }
    }

    /* renamed from: E */
    private void m80879E() {
        if (this.f65058c != null) {
            C43081e.m136671a((View) this.feedAdDownloadBtn, 0.75f);
            C43081e.m136670a(this.feedAdReplay);
            C43081e.m136670a(this.mBottomView);
            C43081e.m136671a((View) this.adGuideDesc, 0.75f);
            C43081e.m136671a((View) this.adGuideIcon, 0.75f);
            C43081e.m136671a((View) this.adLikeLayout, 0.75f);
            C43081e.m136671a((View) this.adGuideName, 0.75f);
            C43081e.m136671a((View) this.adTagGroup, 0.75f);
            if (this.f65062g.mo64705a() && this.f65072r != null) {
                this.f65072r.mo60134a("update_ad_user_follow_ui", (Object) Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: K */
    private void m80885K() {
        this.adGuideTitle.setVisibility(8);
        this.adGuideLabel.setVisibility(8);
        this.adPriceLayout.setVisibility(8);
        this.adGuideIcon.setVisibility(8);
        this.adGuideName.setVisibility(8);
        this.adLikeLayout.setVisibility(8);
        this.adGuideDesc.setVisibility(8);
        this.adGuideImage.setVisibility(8);
        if (this.f65058c.getAwemeRawAd() != null && this.f65058c.getAwemeRawAd().getNativeCardInfo() != null) {
            NativeCardInfo nativeCardInfo = this.f65058c.getAwemeRawAd().getNativeCardInfo();
            this.adGuideWebImage.setVisibility(0);
            C23323e.m76524b(this.adGuideWebImage, nativeCardInfo.image);
        }
    }

    /* renamed from: U */
    private void m80895U() {
        if (this.f65058c != null && this.mStarAtlasTagLayout != null) {
            if (C25352e.m83364d()) {
                this.mStarAtlasTagLayout.mo64843a();
                this.mStarAtlasTagLayout.setVisibility(8);
            } else if (m80903a(this.mStarAtlasTagLayout, this.f65058c)) {
                final StarAtlasLink starAtlasLink = this.f65058c.getStarAtlasInfo().getStarAtlasLink();
                this.mStarAtlasTagLayout.mo64844a(starAtlasLink, new C24804a() {
                    /* renamed from: c */
                    public final void mo64612c() {
                    }

                    /* renamed from: a */
                    public final void mo64610a() {
                        C24975s.m81993a(starAtlasLink, CommerceVideoDelegate.this.f65058c, "show", false, CommerceVideoDelegate.this.f65060e);
                    }

                    /* renamed from: b */
                    public final void mo64611b() {
                        C24975s.m81993a(starAtlasLink, CommerceVideoDelegate.this.f65058c, "click", false, CommerceVideoDelegate.this.f65060e);
                        C25371n.m83438a(CommerceVideoDelegate.this.f65061f, starAtlasLink, CommerceVideoDelegate.this.f65058c, false);
                        if (C25352e.m83226i(CommerceVideoDelegate.this.f65058c)) {
                            C24976t.m82214f(CommerceVideoDelegate.this.f65061f, CommerceVideoDelegate.this.f65058c, "common_link");
                        }
                    }
                });
                this.mStarAtlasTagLayout.setVisibility(0);
            } else {
                this.mStarAtlasTagLayout.mo64843a();
                this.mStarAtlasTagLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: V */
    private void m80896V() {
        if (this.f65058c != null && this.mNationalTaskTagLayout != null) {
            if (C25352e.m83364d()) {
                this.mNationalTaskTagLayout.mo64838b();
                this.mNationalTaskTagLayout.setVisibility(8);
            } else if (m80902a(this.mNationalTaskTagLayout, this.f65058c)) {
                final NationalTaskLink nationalTaskLink = this.f65058c.getAwemeNationalTask().getNationalTaskLink();
                this.mNationalTaskTagLayout.mo64837a(nationalTaskLink, new C24804a() {
                    /* renamed from: c */
                    public final void mo64612c() {
                    }

                    /* renamed from: a */
                    public final void mo64610a() {
                        C24975s.m81992a(nationalTaskLink, CommerceVideoDelegate.this.f65058c, "show", false, CommerceVideoDelegate.this.f65060e);
                    }

                    /* renamed from: b */
                    public final void mo64611b() {
                        C24975s.m81992a(nationalTaskLink, CommerceVideoDelegate.this.f65058c, "click", false, CommerceVideoDelegate.this.f65060e);
                        C25371n.m83437a(CommerceVideoDelegate.this.f65061f, nationalTaskLink, CommerceVideoDelegate.this.f65058c, false);
                    }
                });
                this.mNationalTaskTagLayout.setVisibility(0);
            } else {
                this.mNationalTaskTagLayout.mo64838b();
                this.mNationalTaskTagLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: W */
    private void m80897W() {
        if (!(this.f65058c == null || this.mLinkTag == null)) {
            if (m80904a(this.mLinkTag, this.f65058c)) {
                final LinkData a = C25268bg.m83039a(this.f65058c);
                if (a != null) {
                    C7167b.m22380b().mo18647a().preloadMiniApp(a.mpUrl);
                }
                this.mLinkTag.mo64847a(a, new C24815l() {

                    /* renamed from: c */
                    private long f65091c;

                    /* renamed from: d */
                    private Runnable f65092d = new C24749y(this);

                    /* access modifiers changed from: 0000 */
                    /* renamed from: e */
                    public final /* synthetic */ void mo64614e() {
                        if (this.f65091c > 0) {
                            m80986f();
                        }
                    }

                    /* renamed from: f */
                    private void m80986f() {
                        C24976t.m82038a(CommerceVideoDelegate.this.f65061f, m80987g().mo64783a("display_1s").mo64779a(m80988h()).mo64785a());
                    }

                    /* renamed from: g */
                    private C24768a m80987g() {
                        return new C24768a().mo64781a(a).mo64782a(CommerceVideoDelegate.this.f65058c).mo64784a(false);
                    }

                    /* renamed from: h */
                    private int m80988h() {
                        boolean z;
                        if (CommerceVideoDelegate.this.mo64602w() || CommerceVideoDelegate.this.mo64600u() || !C23487o.m77156c((View) CommerceVideoDelegate.this.mLinkTag)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            return 100;
                        }
                        return 0;
                    }

                    /* renamed from: d */
                    public final void mo64613d() {
                        if (this.f65091c != 0) {
                            C24976t.m82038a(CommerceVideoDelegate.this.f65061f, m80987g().mo64783a("show_over").mo64779a(0).mo64780a(System.currentTimeMillis() - this.f65091c).mo64785a());
                            this.f65091c = 0;
                            if (CommerceVideoDelegate.this.mLinkTag != null) {
                                CommerceVideoDelegate.this.mLinkTag.removeCallbacks(this.f65092d);
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void mo64610a() {
                        C24976t.m82038a(CommerceVideoDelegate.this.f65061f, m80987g().mo64783a("show").mo64779a(100).mo64785a());
                        C24975s.m81991a(a, CommerceVideoDelegate.this.f65058c, "show", false, CommerceVideoDelegate.this.f65060e);
                        this.f65091c = System.currentTimeMillis();
                        if (CommerceVideoDelegate.this.mLinkTag != null) {
                            CommerceVideoDelegate.this.mLinkTag.postDelayed(this.f65092d, 1000);
                        }
                        C24952c.f65801b.mo65238a(CommerceVideoDelegate.this.f65058c, a);
                    }

                    /* renamed from: b */
                    public final void mo64611b() {
                        C24976t.m82038a(CommerceVideoDelegate.this.f65061f, m80987g().mo64783a("click").mo64779a(100).mo64785a());
                        C24975s.m81991a(a, CommerceVideoDelegate.this.f65058c, "click", false, CommerceVideoDelegate.this.f65060e);
                        C25371n.m83431a(CommerceVideoDelegate.this.f65061f, a, CommerceVideoDelegate.this.f65058c, false);
                        if (C25352e.m83224g(CommerceVideoDelegate.this.f65058c)) {
                            C24976t.m82039a(CommerceVideoDelegate.this.f65061f, a, CommerceVideoDelegate.this.f65058c, false);
                        }
                        if (C25352e.m83226i(CommerceVideoDelegate.this.f65058c)) {
                            C24976t.m82214f(CommerceVideoDelegate.this.f65061f, CommerceVideoDelegate.this.f65058c, "common_link");
                        }
                    }

                    /* renamed from: c */
                    public final void mo64612c() {
                        C24976t.m82038a(CommerceVideoDelegate.this.f65061f, m80987g().mo64783a("close").mo64779a(0).mo64785a());
                        C24975s.m81991a(a, CommerceVideoDelegate.this.f65058c, "close", false, CommerceVideoDelegate.this.f65060e);
                        if (C25352e.m83224g(CommerceVideoDelegate.this.f65058c)) {
                            C24976t.m82039a(CommerceVideoDelegate.this.f65061f, a, CommerceVideoDelegate.this.f65058c, false);
                        }
                        mo64613d();
                    }
                });
                this.mLinkTag.setVisibility(0);
                return;
            }
            this.mLinkTag.mo64846a();
            this.mLinkTag.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final boolean mo64580d() {
        boolean z;
        boolean a = C25352e.m83215a(this.f65058c);
        if (C25352e.m83221d(this.f65058c) || !a) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C10761a.m31399c(this.f65061f, (int) R.string.e3).mo25750a();
        }
        return z;
    }

    /* renamed from: o */
    public final void mo64593o() {
        Object obj;
        if (!(this.f65058c == null || !this.f65058c.isAppAd() || this.f65058c.getAwemeRawAd() == null)) {
            C19535g a = DownloaderManagerHolder.m75524a();
            String downloadUrl = this.f65058c.getAwemeRawAd().getDownloadUrl();
            if (C25352e.m83315Z(this.f65058c)) {
                obj = this.newAdBottomLabelView;
            } else {
                obj = this.oldAdBottomLabelView;
            }
            a.mo51669a(downloadUrl, obj.hashCode());
        }
        if (this.f65056H != null) {
            this.f65056H.mo66328g();
        }
    }

    /* renamed from: r */
    public final void mo64597r() {
        this.f65072r.mo60134a("ad_video_on_resume_play", (Object) null);
        if (this.f65056H != null) {
            this.f65056H.mo66326e();
        }
        mo64556a(this.f65077w.getChildFragmentManager(), false, this.f65059d);
        this.feedAdLayout.setAlpha(1.0f);
        this.feedAdLayout.animate().alpha(0.0f).setDuration(150).withEndAction(new C24746v(this)).start();
    }

    /* renamed from: D */
    private void m80878D() {
        if (!C6399b.m19944t()) {
            this.feedStarAtlasCheckLL.setVisibility(8);
            if (C33230ac.m107241p(this.f65058c)) {
                AwemeStarAtlas starAtlasInfo = this.f65058c.getStarAtlasInfo();
                if (starAtlasInfo != null) {
                    String str = "";
                    int reviewStatus = starAtlasInfo.getReviewStatus();
                    switch (reviewStatus) {
                        case 1:
                            str = this.f65061f.getString(R.string.e0g);
                            break;
                        case 2:
                            str = this.f65061f.getString(R.string.e0p);
                            break;
                        case 3:
                            str = this.f65061f.getString(R.string.e0n);
                            break;
                        case 4:
                            str = this.f65061f.getString(R.string.e0_);
                            break;
                        case 6:
                            str = this.f65061f.getString(R.string.e08);
                            break;
                        case 7:
                            str = this.f65061f.getString(R.string.e0b);
                            break;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.starAtlasCheckHintTv.setText(str);
                        this.feedStarAtlasCheckLL.setVisibility(0);
                        C6907h.m21524a("starmap_bar_review_show", (Map) C22984d.m75611a().mo59973a("group_id", this.f65058c.getAid()).mo59973a("tag_label", C25352e.m83321a(reviewStatus)).f60753a);
                        this.feedStarAtlasCheckLL.setOnClickListener(new C24742r(this, reviewStatus));
                    }
                }
            }
        }
    }

    /* renamed from: F */
    private void m80880F() {
        int i;
        if (SymphonyAdManager.m82664a().mo65651b(this.f65061f, this.f65058c) || SymphonyAdManager.m82664a().mo65654c(this.f65061f, this.f65058c)) {
            this.feedAdLayout.setVisibility(8);
            int i2 = 0;
            if (!C25352e.m83231n(this.f65058c)) {
                this.f65069n.animate().cancel();
                this.f65069n.setAlpha(1.0f);
                if (this.f65061f instanceof MainActivity) {
                    RelativeLayout relativeLayout = this.f65069n;
                    if (C32891b.m106468a().f85831a) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    relativeLayout.setVisibility(i);
                } else {
                    this.f65069n.setVisibility(0);
                }
            }
            if (this.f65058c.getAwemeRawAd() != null) {
                i2 = this.f65058c.getAwemeRawAd().getNativeCardType();
            }
            switch (i2) {
                case 0:
                    m80883I();
                    return;
                case 1:
                    m80881G();
                    return;
                case 2:
                    m80882H();
                    return;
                case 3:
                    m80884J();
                    return;
                case 4:
                    m80885K();
                    return;
                default:
                    m80881G();
                    break;
            }
        }
    }

    /* renamed from: H */
    private void m80882H() {
        String str;
        String str2;
        this.adGuideImage.setVisibility(8);
        this.adGuideTitle.setVisibility(8);
        this.adGuideLabel.setVisibility(8);
        this.adPriceLayout.setVisibility(8);
        this.adLikeLayout.setVisibility(8);
        this.adTagGroup.setVisibility(8);
        if (!TextUtils.isEmpty(this.f65058c.getDesc())) {
            this.adGuideDesc.setText(this.f65058c.getDesc());
            if (this.f65058c.getAwemeRawAd() != null && !TextUtils.isEmpty(this.f65058c.getAwemeRawAd().getAdMoreTextual())) {
                this.adGuideDesc.setMoreString(this.f65058c.getAwemeRawAd().getAdMoreTextual());
            }
        } else {
            this.adGuideDesc.setVisibility(8);
        }
        if (this.f65058c.getAuthor() == null || this.f65058c.getAuthor().getAvatarMedium() == null) {
            C23323e.m76504a(this.adGuideIcon, AppImageUri.m76615a((int) R.drawable.a_j));
        } else {
            C23323e.m76524b(this.adGuideIcon, this.f65058c.getAuthor().getAvatarMedium());
        }
        if (this.f65058c.getAwemeRawAd() != null) {
            if (C25300bx.m83125a(this.f65058c, 3)) {
                DmtTextView dmtTextView = this.adGuideName;
                if (this.f65058c.getAwemeRawAd().getOmVast().vast.adTitle == null) {
                    str2 = "";
                } else {
                    str2 = this.f65058c.getAwemeRawAd().getOmVast().vast.adTitle;
                }
                dmtTextView.setText(str2);
                return;
            }
            DmtTextView dmtTextView2 = this.adGuideName;
            if (this.f65058c.getAuthor() == null) {
                str = "";
            } else {
                str = this.f65058c.getAuthor().getNickname();
            }
            dmtTextView2.setText(str);
        }
    }

    /* renamed from: I */
    private void m80883I() {
        String[] appCategory;
        this.adGuideImage.setVisibility(8);
        this.adGuideTitle.setVisibility(8);
        this.adGuideLabel.setVisibility(8);
        this.adPriceLayout.setVisibility(8);
        this.adGuideIcon.setVisibility(8);
        this.adGuideName.setVisibility(8);
        this.adLikeLayout.setVisibility(8);
        this.adGuideDesc.setVisibility(8);
        if (this.f65058c.getAwemeRawAd() == null || this.f65058c.getAwemeRawAd().getAppCategory() == null || this.f65058c.getAwemeRawAd().getAppCategory().length == 0) {
            this.adTagGroup.setVisibility(8);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f65058c.getAwemeRawAd().getAppCategory()) {
            if (str.length() < 6) {
                arrayList.add(str);
            }
        }
        this.adTagGroup.setTagList((String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: h */
    public final void mo64586h() {
        this.f65072r.mo60134a("ad_feed_on_page_unselected", (Object) null);
        C25251av.m83002a(hashCode());
        if (this.f65058c != null) {
            this.f65058c.setAdDescMaxLines(4);
            this.f65058c.setAdDescHandle(true);
        }
        if (C25155g.m82753a() == this.f65078x) {
            C25155g.m82754a(null);
        }
        mo64590l();
        m80890P();
        mo64556a(this.f65077w.getChildFragmentManager(), false, this.f65059d);
        if (!C7213d.m22500a().mo18801bm() || this.f65058c.isAd()) {
            mo64568a(false);
        }
        if (C24655d.f65016d) {
            C24655d.f65016d = false;
            this.eggLayout.mo64482a();
            C24655d.f65013a = null;
            this.f65054F = null;
        } else {
            this.diggLayout.mo66137a();
        }
        if (C24655d.f65017e) {
            C24655d.f65017e = false;
            this.eggLayout.mo64482a();
            C24655d.f65014b = null;
            C24655d.f65015c = null;
        } else {
            CommentEggDataManager.deleteCommentEggGroup(this.f65058c.getAid());
        }
        if (this.f65079y != null) {
            this.f65079y.mo64619b();
        }
        if (m80904a(this.mLinkTag, this.f65058c)) {
            this.mLinkTag.mo64849c();
        }
        this.f65074t.mo65910a();
        C24935ah.m81794e();
    }

    /* renamed from: G */
    private void m80881G() {
        String[] appCategory;
        String str;
        String str2;
        this.adGuideImage.setVisibility(8);
        this.adGuideTitle.setVisibility(8);
        this.adGuideLabel.setVisibility(8);
        this.adPriceLayout.setVisibility(8);
        if (!TextUtils.isEmpty(this.f65058c.getDesc())) {
            this.adGuideDesc.setText(this.f65058c.getDesc());
            if (this.f65058c.getAwemeRawAd() != null && !TextUtils.isEmpty(this.f65058c.getAwemeRawAd().getAdMoreTextual())) {
                this.adGuideDesc.setMoreString(this.f65058c.getAwemeRawAd().getAdMoreTextual());
            }
        } else {
            this.adGuideDesc.setVisibility(8);
        }
        if (this.f65058c.getAuthor() == null || this.f65058c.getAuthor().getAvatarMedium() == null) {
            C23323e.m76504a(this.adGuideIcon, AppImageUri.m76615a((int) R.drawable.a_j));
        } else {
            C23323e.m76524b(this.adGuideIcon, this.f65058c.getAuthor().getAvatarMedium());
        }
        if (this.f65058c.getAwemeRawAd() != null) {
            if (C25300bx.m83125a(this.f65058c, 3)) {
                DmtTextView dmtTextView = this.adGuideName;
                if (this.f65058c.getAwemeRawAd().getOmVast().vast.adTitle == null) {
                    str2 = "";
                } else {
                    str2 = this.f65058c.getAwemeRawAd().getOmVast().vast.adTitle;
                }
                dmtTextView.setText(str2);
            } else {
                DmtTextView dmtTextView2 = this.adGuideName;
                if (this.f65058c.getAuthor() == null) {
                    str = "";
                } else {
                    str = this.f65058c.getAuthor().getNickname();
                }
                dmtTextView2.setText(str);
            }
            if (TextUtils.isEmpty(this.f65058c.getAwemeRawAd().getAppInstall()) && this.f65058c.getAwemeRawAd().getAppLike() < 4.0f) {
                this.adLikeLayout.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.f65058c.getAwemeRawAd().getAppInstall())) {
                this.adAppUseNumber.setVisibility(8);
                this.adLikeDivide.setVisibility(8);
            } else {
                this.adAppUseNumber.setText(this.f65058c.getAwemeRawAd().getAppInstall());
            }
            this.adRatingView.setRatingProgress(this.f65058c.getAwemeRawAd().getAppLike());
            if (this.f65058c.getAwemeRawAd().getAppLike() < 4.0f) {
                this.adRatingView.setVisibility(8);
                this.adLikeDivide.setVisibility(8);
            }
            if (this.f65058c.getAwemeRawAd().getAppCategory() == null || this.f65058c.getAwemeRawAd().getAppCategory().length == 0) {
                this.adTagGroup.setVisibility(8);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str3 : this.f65058c.getAwemeRawAd().getAppCategory()) {
                if (str3.length() < 6) {
                    arrayList.add(str3);
                }
            }
            this.adTagGroup.setTagList((String[]) arrayList.toArray(new String[0]));
        }
    }

    /* renamed from: J */
    private void m80884J() {
        this.adGuideIcon.setVisibility(8);
        this.adGuideName.setVisibility(8);
        this.adGuideDesc.setVisibility(8);
        this.adTagGroup.setVisibility(8);
        if (this.f65058c.getAwemeRawAd() != null && this.f65058c.getAwemeRawAd().getNativeCardInfo() != null) {
            NativeCardInfo nativeCardInfo = this.f65058c.getAwemeRawAd().getNativeCardInfo();
            if (TextUtils.isEmpty(nativeCardInfo.imageUrl)) {
                ((C13438a) this.adGuideImage.getHierarchy()).mo32896a(C13423b.f35597e);
                C23323e.m76504a(this.adGuideImage, AppImageUri.m76615a((int) R.drawable.aij));
            } else {
                ((C13438a) this.adGuideImage.getHierarchy()).mo32896a(C13423b.f35593a);
                C23323e.m76514a(this.adGuideImage, nativeCardInfo.imageUrl);
            }
            if (TextUtils.isEmpty(nativeCardInfo.title)) {
                this.adGuideTitle.setVisibility(8);
            } else {
                this.adGuideTitle.setText(nativeCardInfo.title);
            }
            if (TextUtils.isEmpty(nativeCardInfo.featureLabel)) {
                this.adGuideLabel.setVisibility(8);
            } else {
                this.adGuideLabel.setText(nativeCardInfo.featureLabel);
            }
            if (nativeCardInfo.feedbackRate < 80) {
                this.adLikeLayout.setVisibility(8);
            } else if (nativeCardInfo.feedbackRate < 90) {
                this.adRatingView.setRatingProgress(4.0f);
                DmtTextView dmtTextView = this.adAppUseNumber;
                StringBuilder sb = new StringBuilder();
                sb.append(nativeCardInfo.feedbackRate);
                sb.append(this.f65061f.getString(R.string.bbz));
                dmtTextView.setText(sb.toString());
            } else if (nativeCardInfo.feedbackRate <= 100) {
                this.adRatingView.setRatingProgress(5.0f);
                DmtTextView dmtTextView2 = this.adAppUseNumber;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(nativeCardInfo.feedbackRate);
                sb2.append(this.f65061f.getString(R.string.bbz));
                dmtTextView2.setText(sb2.toString());
            } else {
                this.adRatingView.setRatingProgress(5.0f);
                DmtTextView dmtTextView3 = this.adAppUseNumber;
                StringBuilder sb3 = new StringBuilder("100");
                sb3.append(this.f65061f.getString(R.string.bbz));
                dmtTextView3.setText(sb3.toString());
            }
            this.adGuidePrice.setText(nativeCardInfo.originPrice);
            this.adGuideService.setText(nativeCardInfo.service);
        }
    }

    /* renamed from: a */
    public final void mo64549a() {
        m80879E();
        if (C25352e.m83221d(this.f65058c)) {
            this.feedAdDownloadBtn.setText(C25384x.m83526a(this.f65061f, this.f65058c, true));
            Drawable bVar = new C24510b((float) C23486n.m77122a(2.0d), this.f65061f.getResources().getColor(R.color.w0));
            if (C25352e.m83199A(this.f65058c)) {
                bVar = C43081e.m136669a(bVar.mutate(), C0683b.m2912c(this.f65061f, R.color.a5q));
            }
            this.feedAdDownloadBtn.setBackground(bVar);
        }
        this.oldAdBottomLabelView.mo66258a(this.f65058c, this.f65062g, this.mAdBackgroundLayout);
        this.newAdBottomLabelView.mo66095a(this.f65058c, this.f65062g);
        this.adHalfWebPageContainer.mo65983e();
        this.blackMaskLayer.setVisibility(8);
        m80912g(false);
        m80913h(false);
        m80878D();
        if (C25300bx.m83125a(this.f65058c, 3)) {
            C25301by.m83159h(this.f65058c);
        }
        m80877C();
        this.f65072r.mo60134a("ad_feed_video_params", (Object) new C25639a().mo65870a(new C24731m(this)).f66613a);
    }

    /* renamed from: g */
    public final void mo64585g() {
        this.f65072r.mo60134a("ad_feed_on_page_selected", (Object) null);
        if (this.f65058c != null && this.f65058c.isAd()) {
            C25251av.m83003a(hashCode(), (C24990c) new C24991a().mo65418a(this.f65058c).f66613a);
        }
        this.f65078x.mo64615a();
        this.f65063h = false;
        this.f65053E = false;
        C25155g.m82754a(this.f65078x);
        boolean a = C24664i.m80832a();
        C24655d.f65016d = a;
        if (a) {
            C24641b a2 = C24655d.m80817a(this.f65058c, true);
            C24655d.f65013a = a2;
            if (a2 != null) {
                this.f65054F = C24655d.m80816a(this.f65058c, this.f65060e);
            }
        } else {
            this.diggLayout.setCommerceDigg(this.f65058c);
        }
        boolean b = C24664i.m80833b();
        C24655d.f65017e = b;
        if (b) {
            C24655d.m80823b(this.f65058c, true);
            C24655d.m80819a(this.f65058c);
        } else {
            CommentEggDataManager.putCommentEggGroup(this.f65058c.getAid(), this.f65058c.getCommentEggGroup());
        }
        if (C7213d.m22500a().mo18801bm()) {
            m80897W();
        } else {
            m80899Y();
        }
        m80895U();
        m80896V();
        if (!(this.f65059d == null || this.f65059d.mo65716m() == null || this.f65059d.mo65716m().mo71570u() == null)) {
            C24411a.m80259a().mo63381a(this.f65058c, this.f65061f, this.f65059d.mo65716m().mo71570u());
        }
        if (C7213d.m22500a().mo18801bm()) {
            if (this.mLinkTag != null && this.mLinkTag.getVisibility() == 0) {
                this.mLinkTag.mo64848b();
            }
            if (this.mMicroTag != null && this.mMicroTag.getVisibility() == 0) {
                this.mMicroTag.mo64829a();
            }
        } else {
            if (m80904a(this.mLinkTag, this.f65058c)) {
                this.mLinkTag.mo64848b();
            }
            if (this.mMicroTag != null && C24792i.m81344c(this.f65058c)) {
                this.mMicroTag.mo64829a();
            }
        }
        if (this.mStarAtlasTagLayout != null && this.mStarAtlasTagLayout.getVisibility() == 0) {
            this.mStarAtlasTagLayout.mo64845b();
        }
        if (this.mNationalTaskTagLayout != null && this.mNationalTaskTagLayout.getVisibility() == 0) {
            this.mNationalTaskTagLayout.mo64836a();
        }
        m80891Q();
        m80893S();
        mo64590l();
        m80890P();
        if (this.f65058c != null && this.f65058c.isAd()) {
            C6907h.onEvent(MobClick.obtain().setEventName("ad_show").setJsonObject(C6869c.m21381a().mo16887a("request_id", ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(this.f65058c, this.f65065j)).mo16888b()).setExtValueString(this.f65058c.getAid()));
            if (C32720b.m105919a(this.f65058c)) {
                C24976t.m82105aR(this.f65061f, this.f65058c);
            }
        }
        m80913h(true);
        if (!C7213d.m22500a().mo18801bm() || this.f65058c.isAd()) {
            m80880F();
        }
        m80888N();
        if (this.f65058c != null && this.f65058c.isAppAd()) {
            this.oldAdBottomLabelView.mo66105e();
            this.newAdBottomLabelView.mo66105e();
            if (this.f65058c.getAwemeRawAd() != null) {
                this.f65058c.getAwemeRawAd().setCardOnceClick(false);
            }
        }
        m80912g(true);
        if (C25294bv.m83113e(this.f65058c)) {
            if (this.f65079y == null) {
                this.f65079y = new C24683b(this);
            }
            this.f65079y.mo64618a();
        }
        this.f65074t.mo65910a();
        if (C25352e.m83342an(this.f65058c)) {
            C7167b.m22380b().mo18647a().preloadMiniApp(C33419c.m108077a(this.f65058c), C33419c.m108079b(this.f65058c));
        }
        if (C25300bx.m83125a(this.f65058c, 2)) {
            C25301by.m83159h(this.f65058c);
        }
    }

    /* renamed from: a */
    public final void mo64550a(int i) {
        this.f65057b = i;
    }

    /* renamed from: a */
    public final void mo64559a(WidgetManager widgetManager) {
        this.f65073s = widgetManager;
        m80886L();
    }

    /* renamed from: c */
    private static C44960f m80909c(C28130ac acVar) {
        if (acVar == null) {
            return null;
        }
        return acVar.mo71553b();
    }

    /* renamed from: e */
    public final void mo64582e(boolean z) {
        this.f65072r.mo60134a("ad_comment_dialog_visible", (Object) Boolean.valueOf(z));
        if (z) {
            this.f65055G.add("comment_block");
        } else {
            this.f65055G.remove("comment_block");
        }
    }

    /* renamed from: f */
    public final void mo64584f(boolean z) {
        this.f65072r.mo60134a("ad_share_dialog_visible", (Object) Boolean.valueOf(z));
        if (z) {
            this.f65055G.add("share_block");
        } else {
            this.f65055G.remove("share_block");
        }
    }

    /* renamed from: b */
    private void m80906b(View view) {
        this.f65069n = (RelativeLayout) view.findViewById(R.id.eh4);
        this.f65068m = (TextView) view.findViewById(R.id.title);
        this.mIvRelieveTag = (AnimationImageView) view.findViewById(R.id.ebg);
        this.f65070o = (TagLayout) view.findViewById(R.id.ebo);
        this.f65071p = (MicroAppVideoCardView) view.findViewById(R.id.byn);
    }

    /* renamed from: c */
    public final void mo64578c(boolean z) {
        if (z) {
            C41540at.m132301a(this.mBottomView, this.mBottomView.getAlpha(), 0.0f);
        } else {
            C41540at.m132301a(this.mBottomView, this.mBottomView.getAlpha(), 1.0f);
        }
        this.adHalfWebPageContainer.setInCleanMode(z);
        this.f65071p.mo85553a(z, this.f65058c);
        if (m80892R()) {
            this.f65052D.mo66459a(z);
        }
    }

    /* renamed from: d */
    public final void mo64579d(boolean z) {
        if (z && this.f65058c != null) {
            if (C24655d.f65016d) {
                this.eggLayout.mo64483a(C24655d.f65013a, this.f65054F);
            } else {
                this.diggLayout.mo66138a(this.f65060e, this.f65058c.getAid());
            }
        }
        this.f65062g.mo64704a(z);
    }

    /* renamed from: c */
    private void m80910c(long j) {
        if (m80892R() && !this.f65053E) {
            float showTime = this.f65058c.getAwemeRawAd().getPlayFunModel().getShowTime();
            if (showTime < 0.0f) {
                showTime = 0.0f;
            }
            int i = (int) (showTime * 1000.0f);
            this.f65074t.mo65915b(350);
            this.f65074t.mo65913a(new C25348a().mo65906a(j).mo65905a(i).mo65907a((Runnable) new C24733o(this)).mo65908a(false).mo65909a());
        }
    }

    /* renamed from: i */
    private void m80914i(boolean z) {
        if (this.introContainer != null) {
            if (this.introContainer.getVisibility() != 0 || this.introContainer.getAlpha() != 1.0f) {
                if (z) {
                    this.introContainer.setTranslationY((float) C23486n.m77122a(17.0d));
                    this.introContainer.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(280).start();
                    return;
                }
                C41540at.m132301a(this.introContainer, this.introContainer.getAlpha(), 1.0f);
                C41544aw.m132306a(this.introContainer, this.introContainer.getTranslationX(), 0.0f, 200);
            }
        }
    }

    /* renamed from: j */
    private void m80915j(boolean z) {
        float f;
        if (this.introContainer != null) {
            if (z) {
                C41540at.m132302a(this.introContainer, this.introContainer.getAlpha(), 0.0f, 200);
                return;
            }
            if (C43127fh.m136806a(this.f65061f)) {
                f = (float) (-C41544aw.m132305a(this.f65061f, this.introContainer));
            } else {
                f = (float) C41544aw.m132305a(this.f65061f, this.introContainer);
            }
            C41540at.m132302a(this.introContainer, this.introContainer.getAlpha(), 0.0f, 200);
            C41544aw.m132306a(this.introContainer, this.introContainer.getTranslationX(), f, 200);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            boolean z = false;
            switch (str.hashCode()) {
                case -1023452510:
                    if (str.equals("on_ad_light_web_page_hide")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1023125411:
                    if (str.equals("on_ad_light_web_page_show")) {
                        c = 0;
                        break;
                    }
                    break;
                case -481195123:
                    if (str.equals("on_ad_pop_up_web_page_hide")) {
                        c = 5;
                        break;
                    }
                    break;
                case -480868024:
                    if (str.equals("on_ad_pop_up_web_page_show")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1676264963:
                    if (str.equals("AD_ACTION_MOVE_OUT_DESC")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1881011274:
                    if (str.equals("AD_ACTION_MOVE_IN_DESC")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mo64568a(true);
                    this.f65055G.add("lightpage_block");
                    return;
                case 1:
                    this.f65055G.remove("lightpage_block");
                    return;
                case 2:
                    if (aVar.mo60161a() != null) {
                        z = ((Boolean) aVar.mo60161a()).booleanValue();
                    }
                    m80914i(z);
                    return;
                case 3:
                    if (aVar.mo60161a() != null) {
                        z = ((Boolean) aVar.mo60161a()).booleanValue();
                    }
                    m80915j(z);
                    return;
                case 4:
                    this.f65055G.add("popup_page_block");
                    mo64568a(false);
                    return;
                case 5:
                    this.f65055G.remove("popup_page_block");
                    break;
            }
        }
    }

    /* renamed from: b */
    private void m80905b(long j) {
        if (j >= 6000) {
            this.f65074t.mo65913a(new C25348a().mo65906a(j).mo65905a(6000).mo65907a((Runnable) new C24747w(this)).mo65908a(true).mo65909a());
        }
        if (j >= C40413c.f105051b) {
            this.f65074t.mo65913a(new C25348a().mo65906a(j).mo65905a((int) IAVService.MUSIC_LENGTH_FOR_COPYRIGHT).mo65907a((Runnable) new C24748x(this)).mo65908a(true).mo65909a());
        }
        if (C25352e.m83343ao(this.f65058c)) {
            for (C25005n nVar : this.f65058c.getAwemeRawAd().getPlaybackSecondsTrackList()) {
                this.f65074t.mo65913a(new C25348a().mo65906a(j).mo65905a((int) Math.min((long) (nVar.f65936a * 1000), j)).mo65907a((Runnable) new C24732n(this, nVar)).mo65908a(true).mo65909a());
            }
        }
    }

    /* renamed from: c */
    private void m80911c(Aweme aweme) {
        String str;
        if (aweme != null) {
            if (!this.f65066k) {
                this.f65066k = true;
                this.f65067l = C6384b.m19835a().mo15292a(DouPlusShowV3Debug.class, true, "douplus_show_v3_enable", C6384b.m19835a().mo15295d().douplus_show_v3_enable, false);
            }
            if (this.f65067l) {
                String str2 = "show_dou_plus_video";
                C22984d a = C22984d.m75611a().mo59973a("group_id", aweme.getAid());
                String str3 = "author_id";
                if (aweme.getAwemeRawAd() != null) {
                    str = String.valueOf(aweme.getAwemeRawAd().getCreativeId());
                } else {
                    str = aweme.getAuthorUid();
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
            }
        }
    }

    /* renamed from: g */
    private void m80912g(boolean z) {
        AwemeTextLabelModel awemeTextLabelModel;
        if (C25300bx.m83124a(this.f65058c)) {
            boolean z2 = false;
            C23487o.m77140a((View) this.vastAdTag, 0);
            Icon c = C25300bx.m83130c(this.f65058c);
            if (c != null && !C6307b.m19566a((Collection<T>) c.staticResource)) {
                Iterator it = c.staticResource.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        C23487o.m77140a((View) this.vastAdTagAdChoice, 0);
                        C23323e.m76514a(this.vastAdTagAdChoice, str);
                        if (this.vastAdTag != null) {
                            this.vastAdTag.setClickable(true);
                        }
                        z2 = true;
                    }
                }
            } else {
                C23487o.m77140a((View) this.vastAdTagAdChoice, 8);
                if (this.vastAdTag != null) {
                    this.vastAdTag.setClickable(false);
                }
            }
            if (z && z2 && !C6307b.m19566a((Collection<T>) c.viewTracking) && C25301by.m83156e(this.f65058c)) {
                C25301by.m83151b(c);
                C24958f.m81905a().mo65266a("draw_ad").mo65276b("ad_choice_view").mo65283e("video").mo65273b(this.f65058c).mo65270a(this.f65061f);
            }
            if (this.vastAdTagText != null) {
                if (this.f65058c.getAwemeRawAd() != null) {
                    awemeTextLabelModel = this.f65058c.getAwemeRawAd().getLabel();
                } else {
                    awemeTextLabelModel = null;
                }
                if (awemeTextLabelModel == null || TextUtils.isEmpty(this.f65058c.getAwemeRawAd().getLabel().getLabelName())) {
                    this.vastAdTagText.setText(R.string.ee);
                } else {
                    this.vastAdTagText.setText(this.f65058c.getAwemeRawAd().getLabel().getLabelName());
                }
            }
            C23487o.m77140a((View) this.f65070o, 8);
            return;
        }
        C23487o.m77140a((View) this.vastAdTag, 8);
    }

    /* renamed from: h */
    private void m80913h(boolean z) {
        String str;
        String str2;
        String str3;
        if (this.f65058c != null) {
            if (C24706aa.m81052a(this.f65058c)) {
                C24706aa.m81051a(z, this.adRedPacketIv, this.f65058c);
                return;
            }
            if (!m80892R()) {
                if (C25352e.m83306Q(this.f65058c)) {
                    this.adRedPacketIv.setVisibility(0);
                    AwemeRawAd awemeRawAd = this.f65058c.getAwemeRawAd();
                    UrlModel urlModel = null;
                    if (awemeRawAd != null) {
                        urlModel = awemeRawAd.getRedImageUrl();
                    }
                    C25354g.m83373a(this.adRedPacketIv, urlModel);
                    if (z) {
                        C24976t.m82053a(this.f65061f, this.f65058c, "othershow", "redpacket");
                    }
                    return;
                } else if (C25352e.m83219b(this.f65058c)) {
                    this.adRedPacketIv.setVisibility(0);
                    C25354g.m83373a(this.adRedPacketIv, this.f65058c.getActivityPendant().getImage());
                    User author = this.f65058c.getAuthor();
                    if (z) {
                        String str4 = "show_brand_sticker";
                        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f65060e).mo59973a("group_id", this.f65058c.getAid());
                        String str5 = "author_id";
                        if (author != null) {
                            str3 = author.getUid();
                        } else {
                            str3 = "";
                        }
                        C6907h.m21524a(str4, (Map) a.mo59973a(str5, str3).f60753a);
                        C24962g.m81961b(new C24741q(this), this.f65058c.getActivityPendant().getTrackUrlList(), true);
                    }
                    return;
                } else if (C25352e.m83308S(this.f65058c)) {
                    this.adRedPacketIv.setVisibility(0);
                    SpecialSticker specialSticker = this.f65058c.getSpecialSticker();
                    if (specialSticker != null) {
                        C25354g.m83373a(this.adRedPacketIv, specialSticker.getIconUrl());
                    }
                    User author2 = this.f65058c.getAuthor();
                    if (z) {
                        String str6 = "show_brand_sticker";
                        C22984d a2 = C22984d.m75611a().mo59973a("enter_from", this.f65060e).mo59973a("group_id", this.f65058c.getAid());
                        String str7 = "author_id";
                        if (author2 != null) {
                            str2 = author2.getUid();
                        } else {
                            str2 = "";
                        }
                        C6907h.m21524a(str6, (Map) a2.mo59973a(str7, str2).mo59973a("sticker_id", this.f65058c.getSpecialSticker().getStickerId()).f60753a);
                    }
                    return;
                } else if (C37124b.m119341b(this.f65058c)) {
                    this.adRedPacketIv.setVisibility(0);
                    C25354g.m83373a(this.adRedPacketIv, C37124b.m119343c(this.f65058c));
                    User author3 = this.f65058c.getAuthor();
                    if (z) {
                        String str8 = "show_mission_icon";
                        C22984d a3 = C22984d.m75611a().mo59973a("enter_from", this.f65060e).mo59973a("group_id", this.f65058c.getAid());
                        String str9 = "author_id";
                        if (author3 != null) {
                            str = author3.getUid();
                        } else {
                            str = "";
                        }
                        C6907h.m21524a(str8, (Map) a3.mo59973a(str9, str).mo59973a("entrance_location", "redpacket").f60753a);
                    }
                    return;
                }
            }
            this.adRedPacketIv.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo64548a(C25638a aVar) {
        aVar.f67530a = this.f65058c;
        aVar.f67531b = this.f65077w;
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo64572b(C28130ac acVar) {
        this.f65069n.setVisibility(4);
        if (!C43316v.m137250H()) {
            C43316v.m137450K().mo104948x();
        } else {
            C44960f c = m80909c(acVar);
            if (c != null) {
                c.mo71672ad();
            }
        }
        this.feedAdLayout.setVisibility(0);
        C43081e.m136670a(this.feedAdDownloadBtn);
        C24510b bVar = new C24510b((float) C23486n.m77122a(2.0d), this.f65061f.getResources().getColor(R.color.w0));
        if (C25352e.m83199A(this.f65058c) || C25352e.m83315Z(this.f65058c)) {
            C43081e.m136673a(this.feedAdDownloadBtn, bVar, C0683b.m2912c(this.f65061f, R.color.a5q), Color.parseColor(C25352e.m83242y(this.f65058c)), 300);
        } else {
            this.feedAdDownloadBtn.setBackground(bVar);
        }
        this.feedAdLayout.animate().alpha(1.0f).setDuration(150).start();
        C42961az.m136380a(new C24572l(true, this.f65058c.getAid()));
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        int id = view.getId();
        if (id == R.id.c8c) {
            if (!mo64580d()) {
                C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 2, this.f65064i);
            }
        } else if (id == R.id.c3r) {
            if (!mo64580d()) {
                C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 2, this.f65064i);
            }
        } else if (id == R.id.aj4) {
            if (!mo64580d()) {
                if (C25352e.m83217a(this.f65060e)) {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 26, this.f65064i);
                } else {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 3, this.f65064i);
                }
                mo64568a(C25352e.m83314Y(this.f65058c));
            }
        } else if (id == R.id.c3) {
            if (!mo64580d()) {
                if (C25352e.m83217a(this.f65060e)) {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 27, this.f65064i);
                } else {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 11, this.f65064i);
                }
            }
        } else if (id == R.id.cj) {
            if (!mo64580d()) {
                if (C25352e.m83217a(this.f65060e)) {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 30, this.f65064i);
                } else {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 14, this.f65064i);
                }
            }
        } else if (id == R.id.bm) {
            if (!mo64580d()) {
                if (C25352e.m83217a(this.f65060e)) {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 28, this.f65064i);
                } else {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 12, this.f65064i);
                }
            }
        } else if (id == R.id.cf) {
            if (!mo64580d()) {
                if (C25352e.m83217a(this.f65060e)) {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 29, this.f65064i);
                } else {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 13, this.f65064i);
                }
            }
        } else if (id == R.id.dm) {
            if (!mo64580d()) {
                if (C25352e.m83217a(this.f65060e)) {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 31, this.f65064i);
                } else {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 15, this.f65064i);
                }
            }
        } else if (id == R.id.c7 || id == R.id.du) {
            if (!mo64580d()) {
                C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 19, this.f65064i);
            }
        } else if (id == R.id.f124296do) {
            if (!mo64580d()) {
                if (C25352e.m83217a(this.f65060e)) {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 32, this.f65064i);
                } else {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 20, this.f65064i);
                }
            }
        } else if (id == R.id.d2) {
            if (!mo64580d()) {
                C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 21, this.f65064i);
            }
        } else if (id != R.id.aj7 && id != R.id.aj8) {
            if (id == R.id.d6) {
                User author = this.f65058c.getAuthor();
                if (C25352e.m83306Q(this.f65058c)) {
                    C25371n.m83449a(this.f65061f, this.f65058c, this.f65062g, 9, this.f65064i);
                } else if (C25352e.m83219b(this.f65058c)) {
                    C25371n.m83490g(this.f65061f, this.f65058c);
                    String str4 = "click_brand_sticker";
                    C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f65060e).mo59973a("group_id", this.f65058c.getAid());
                    String str5 = "author_id";
                    if (author != null) {
                        str3 = author.getUid();
                    } else {
                        str3 = "";
                    }
                    C6907h.m21524a(str4, (Map) a.mo59973a(str5, str3).f60753a);
                    C24962g.m81961b(new C24745u(this), this.f65058c.getActivityPendant().getClickTrackUrlList(), true);
                } else if (C25352e.m83308S(this.f65058c)) {
                    if (C25371n.m83487f(this.f65061f, this.f65058c)) {
                        String str6 = "click_brand_sticker";
                        C22984d a2 = C22984d.m75611a().mo59973a("enter_from", this.f65060e).mo59973a("group_id", this.f65058c.getAid());
                        String str7 = "author_id";
                        if (author != null) {
                            str2 = author.getUid();
                        } else {
                            str2 = "";
                        }
                        C6907h.m21524a(str6, (Map) a2.mo59973a(str7, str2).mo59973a("sticker_id", this.f65058c.getSpecialSticker().getStickerId()).f60753a);
                    }
                } else if (C37124b.m119341b(this.f65058c)) {
                    C37124b.m119336a(this.f65061f, this.f65058c);
                    String str8 = "click_mission_icon";
                    C22984d a3 = C22984d.m75611a().mo59973a("enter_from", this.f65060e).mo59973a("group_id", this.f65058c.getAid());
                    String str9 = "author_id";
                    if (author != null) {
                        str = author.getUid();
                    } else {
                        str = "";
                    }
                    C6907h.m21524a(str8, (Map) a3.mo59973a(str9, str).mo59973a("entrance_location", "redpacket").f60753a);
                }
            }
        } else if (!mo64580d()) {
            if (this.f65062g.mo64705a()) {
                if (!C25352e.m83217a(this.f65060e)) {
                    C24976t.m82289x(this.f65061f, this.f65058c);
                } else if (!(this.f65058c == null || this.f65058c.getAwemeRawAd() == null)) {
                    C24976t.m82239i(this.f65061f, this.f65058c.getAwemeRawAd().getCreativeIdStr(), "background", this.f65058c.getAwemeRawAd().getLogExtra());
                }
                C24411a.m80259a();
                C24411a.m80261a(this.f65061f, this.f65058c);
            }
            m80907b(true, false);
        }
    }

    /* renamed from: b */
    public final void mo64573b(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdHintData() == null) {
            this.adFeeDeductionLayout.setVisibility(8);
            return;
        }
        this.adFeeDeductionLayout.setVisibility(0);
        this.feeDeductionHint.setText(aweme.getAwemeRawAd().getAdHintData().getHintText());
    }

    /* renamed from: a */
    private static void m80900a(View view, boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (!z) {
            view.setAlpha(1.0f);
        }
    }

    /* renamed from: a */
    private static boolean m80902a(NationalTaskTagLayout nationalTaskTagLayout, Aweme aweme) {
        if (nationalTaskTagLayout == null || !C24792i.m81339b(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m80903a(StarAtlasTagLayout starAtlasTagLayout, Aweme aweme) {
        if (starAtlasTagLayout == null || !C24792i.m81332a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m80904a(CommerceTagLayout commerceTagLayout, Aweme aweme) {
        if (commerceTagLayout == null || C25352e.m83232o(aweme)) {
            return false;
        }
        if ((!C24792i.m81341b(aweme, false, 0) || C25352e.m83364d()) && !C24792i.m81335a(aweme, false, 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m80907b(boolean z, boolean z2) {
        int i = 8;
        if (this.feedAdLayout.getVisibility() != 8) {
            if (m80892R()) {
                this.f65052D.mo66459a(false);
            }
            this.feedAdLayout.setAlpha(1.0f);
            this.feedAdLayout.animate().alpha(0.0f).setDuration(150).withEndAction(new C24743s(this, z, z2)).start();
            if (!(this.f65061f instanceof MainActivity) || !C32891b.m106468a().f85831a) {
                this.f65069n.setAlpha(0.0f);
                RelativeLayout relativeLayout = this.f65069n;
                if (!TimeLockRuler.isTeenModeON()) {
                    i = 0;
                }
                relativeLayout.setVisibility(i);
                this.f65069n.animate().alpha(1.0f).setDuration(150).start();
            } else {
                this.f65069n.setVisibility(4);
            }
            C28418f.m93413a().f74935e = false;
        }
    }

    /* renamed from: b */
    private boolean m80908b(final C0608j jVar, final C28130ac acVar) {
        if (mo64602w() || mo64600u()) {
            return false;
        }
        this.f65063h = true;
        this.flAdGuideRoot.setAlpha(0.0f);
        CardStruct U = C25352e.m83310U(this.f65058c);
        if (U != null) {
            C43466b.m137930a(U);
            C43466b.m137929a(this.f65058c);
            C43466b.m137928a(2);
        }
        C25222ad.m82930a(this.f65058c, (C25584a) new C25584a() {
            /* renamed from: c */
            public final void mo64609c() {
                CommerceVideoDelegate.this.mo64556a(jVar, true, acVar);
                CommerceVideoDelegate.this.f65059d.mo71533d(false);
            }

            /* renamed from: a */
            public final void mo64606a() {
                CommerceVideoDelegate.this.flAdGuideRoot.animate().alpha(1.0f).setDuration(200).start();
                CommerceVideoDelegate.this.f65059d.mo71533d(true);
                HashMap hashMap = new HashMap();
                hashMap.put("background_type", "-1");
                C24976t.m82056a(CommerceVideoDelegate.this.f65061f, CommerceVideoDelegate.this.f65058c, (Map<String, String>) hashMap);
            }

            /* renamed from: b */
            public final void mo64608b() {
                CommerceVideoDelegate.this.mo64556a(jVar, false, acVar);
                CommerceVideoDelegate.this.mo64571a(acVar);
                C24976t.m82127an(CommerceVideoDelegate.this.f65061f, CommerceVideoDelegate.this.f65058c);
                CommerceVideoDelegate.this.flAdGuideRoot.setAlpha(1.0f);
            }

            /* renamed from: a */
            public final void mo64607a(boolean z) {
                if (!z) {
                    C24976t.m82126am(CommerceVideoDelegate.this.f65061f, CommerceVideoDelegate.this.f65058c);
                }
            }
        }, jVar, (ViewGroup) this.flAdGuideRoot, f65048q);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64551a(int i, View view) {
        String a = C6887b.m21436b().mo16896a(this.f65061f, "star_atlas_url_redirect");
        if (!TextUtils.isEmpty(a)) {
            C6907h.m21524a("starmap_bar_review_click", (Map) C22984d.m75611a().mo59973a("group_id", this.f65058c.getAid()).mo59973a("enter_from", "click_bar").mo59973a("tag_label", C25352e.m83321a(i)).f60753a);
            Builder buildUpon = Uri.parse(a).buildUpon();
            buildUpon.appendQueryParameter("scene", "video_status");
            buildUpon.appendQueryParameter("item_id", this.f65058c.getAid());
            buildUpon.appendQueryParameter("order_id", String.valueOf(this.f65058c.getStarAtlasOrderId()));
            C25371n.m83459a(this.f65061f, buildUpon.toString(), "");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo64574b(String str, String str2, long j) {
        C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65273b(this.f65058c).mo65278b();
    }

    public CommerceVideoDelegate(C28130ac acVar, View view, int i, String str, C28343z<C28318an> zVar, Fragment fragment) {
        this.f65059d = acVar;
        this.f65065j = i;
        this.f65060e = str;
        this.f65061f = view.getContext();
        this.f65075u = zVar;
        this.f65077w = fragment;
        this.f65080z = new C33374a(view, str);
        ButterKnife.bind((Object) this, view);
        m80906b(view);
        if (!C6399b.m19944t()) {
            this.adGuideDesc.setViewLineHeight((int) C9738o.m28708b(this.f65061f, 20.0f));
            this.adGuideDesc.setImageSpanXAxisAdjust((int) C9738o.m28708b(this.f65061f, 4.0f));
        }
        if (this.vastAdTag != null) {
            this.vastAdTag.setOnClickListener(new C24730l(this));
        }
    }
}
