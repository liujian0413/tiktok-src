package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24463b;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24473g;
import com.p280ss.android.ugc.aweme.commerce.service.models.C24487e;
import com.p280ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.p280ss.android.ugc.aweme.commerce.service.p1107ab.ProfileEcommerceEntranceAB;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24449a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24573m;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25250au;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.experiment.CleanUpInvalidVideosExperiment;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21718a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28826b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowRelationTabActivity;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowingFollowerActivity.C29667a;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.api.C30030b;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.live.feedpage.C32517b;
import com.p280ss.android.ugc.aweme.live.feedpage.C32518c;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C7092b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.profile.C35992k;
import com.p280ss.android.ugc.aweme.profile.api.BlockApi;
import com.p280ss.android.ugc.aweme.profile.experiment.ProfileRecommendUserWhenEmpty;
import com.p280ss.android.ugc.aweme.profile.expriment.RecUserExpansionAB;
import com.p280ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p280ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p280ss.android.ugc.aweme.profile.model.ShopUserMessage;
import com.p280ss.android.ugc.aweme.profile.model.ShopUserMessageModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseDTProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al;
import com.p280ss.android.ugc.aweme.profile.p1487ui.HeaderDetailActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileCoverPreviewActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileTabView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.RecommendUserActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.ConnectedRelationView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView.C36620a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36630b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolder;
import com.p280ss.android.ugc.aweme.profile.presenter.C36004ad;
import com.p280ss.android.ugc.aweme.profile.presenter.C36006af;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.profile.presenter.C36042p;
import com.p280ss.android.ugc.aweme.profile.presenter.C36044r;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa;
import com.p280ss.android.ugc.aweme.profile.util.C36712af;
import com.p280ss.android.ugc.aweme.profile.util.C36717ag;
import com.p280ss.android.ugc.aweme.profile.util.C36744o;
import com.p280ss.android.ugc.aweme.profile.util.C36767x;
import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.shortvideo.StatusStoreViewModel;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.story.live.C41994h;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42976bj;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.ag */
public abstract class C36492ag extends C36481a implements C36040n, C36042p, C36044r, C36526ay, C36529ba {

    /* renamed from: aj */
    static final int f95784aj = ((int) C9738o.m28708b(C6399b.m19921a(), 106.0f));

    /* renamed from: ak */
    static final int f95785ak = ((int) C9738o.m28708b(C6399b.m19921a(), 98.0f));

    /* renamed from: al */
    static final int f95786al = ((int) C9738o.m28708b(C6399b.m19921a(), 58.0f));

    /* renamed from: am */
    static final int f95787am = ((int) C9738o.m28708b(C6399b.m19921a(), 59.5f));

    /* renamed from: an */
    static final int f95788an = ((int) C9738o.m28708b(C6399b.m19921a(), 22.0f));

    /* renamed from: ao */
    static final int f95789ao = ((int) C9738o.m28708b(C6399b.m19921a(), 18.0f));

    /* renamed from: ap */
    static final int f95790ap = ((int) C9738o.m28708b(C6399b.m19921a(), 4.0f));

    /* renamed from: aq */
    static final int f95791aq = ((int) C9738o.m28708b(C6399b.m19921a(), 3.0f));

    /* renamed from: ar */
    static final int f95792ar = ((int) C9738o.m28708b(C6399b.m19921a(), 2.0f));

    /* renamed from: as */
    static final int f95793as = ((int) C9738o.m28708b(C6399b.m19921a(), 0.2f));

    /* renamed from: aA */
    View f95794aA;

    /* renamed from: aB */
    View f95795aB;

    /* renamed from: aC */
    TextView f95796aC;

    /* renamed from: aD */
    RecommendCommonUserView f95797aD;

    /* renamed from: aE */
    View f95798aE;

    /* renamed from: aF */
    View f95799aF;

    /* renamed from: aG */
    TextView f95800aG;

    /* renamed from: aH */
    TextView f95801aH;

    /* renamed from: aI */
    ConnectedRelationView f95802aI;

    /* renamed from: aJ */
    ImageView f95803aJ;

    /* renamed from: aK */
    public C36031j f95804aK;

    /* renamed from: aL */
    protected RemoteImageView f95805aL;

    /* renamed from: aM */
    protected FrameLayout f95806aM;

    /* renamed from: aN */
    public C36004ad f95807aN;

    /* renamed from: aO */
    public C6309f f95808aO;

    /* renamed from: aP */
    public String f95809aP;

    /* renamed from: aQ */
    public String f95810aQ;

    /* renamed from: aR */
    public String f95811aR;

    /* renamed from: aS */
    public String f95812aS;

    /* renamed from: aT */
    public String f95813aT;

    /* renamed from: aU */
    public boolean f95814aU = false;

    /* renamed from: aV */
    public C28826b f95815aV;

    /* renamed from: aW */
    public boolean f95816aW = false;

    /* renamed from: aX */
    List<String> f95817aX;

    /* renamed from: aY */
    C25663d<RecommendUserCardViewHolder> f95818aY = new C25663d<RecommendUserCardViewHolder>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo61737a(RecommendUserCardViewHolder recommendUserCardViewHolder) {
            if (recommendUserCardViewHolder != null && C36492ag.this.f95807aN != null) {
                User user = recommendUserCardViewHolder.f96181a;
                if (user != null) {
                    if (C36492ag.this.f95817aX == null) {
                        C36492ag.this.f95817aX = new ArrayList();
                    }
                    if (!C36492ag.this.f95817aX.contains(user.getUid())) {
                        C34202f.m110435a().mo86948a(1, user.getUid());
                        if (C6399b.m19944t()) {
                            C36767x.m118509a(user.getRequestId(), C36492ag.this.mo92705k(user), user.getUid(), C36492ag.this.getUserId());
                        } else {
                            C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("others_homepage").setJsonObject(C36492ag.this.mo92688a(user.getUid(), "impression", C36492ag.this.mo92705k(user), user.getRecommendReason(), user)));
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("rec_uid", user.getUid());
                            jSONObject.put("enter_from", "others_homepage");
                            jSONObject.put("event_type", "impression");
                            jSONObject.put("impr_order", C36492ag.this.mo92705k(user));
                            jSONObject.put("req_id", user.getRequestId());
                            jSONObject.put("page_status", "empty");
                            jSONObject.put("rec_reason", user.getRecommendReason());
                            jSONObject.put("page_status", "nonempty");
                            jSONObject.put("rec_user_type", C21718a.m72637a(user));
                        } catch (JSONException unused) {
                        }
                        C6907h.m21528b("follow_card", jSONObject);
                    }
                    C36492ag.this.f95817aX.add(user.getUid());
                }
            }
        }
    };

    /* renamed from: aZ */
    protected float f95819aZ = 0.0f;

    /* renamed from: at */
    RemoteImageView f95820at;

    /* renamed from: au */
    DmtTextView f95821au;

    /* renamed from: av */
    View f95822av;

    /* renamed from: aw */
    View f95823aw;

    /* renamed from: ax */
    TextView f95824ax;

    /* renamed from: ay */
    AnimationImageView f95825ay;

    /* renamed from: az */
    FrameLayout f95826az;

    /* renamed from: ba */
    protected float f95827ba = 0.0f;

    /* renamed from: bb */
    private TextView f95828bb;

    /* renamed from: bc */
    private ImageView f95829bc;

    /* renamed from: bd */
    private View f95830bd;

    /* renamed from: be */
    private C10751a f95831be;

    /* renamed from: bf */
    private C36744o f95832bf;

    /* renamed from: bg */
    private ImageView f95833bg;

    /* renamed from: bh */
    private C0608j f95834bh;

    /* renamed from: bi */
    private C36006af f95835bi;

    /* renamed from: bj */
    private boolean f95836bj = true;

    /* renamed from: bk */
    private boolean f95837bk;

    /* renamed from: bl */
    private boolean f95838bl;

    /* renamed from: bm */
    private ImageView f95839bm;

    /* renamed from: bn */
    private List<String> f95840bn = new ArrayList();

    /* renamed from: bo */
    private int f95841bo = -1;

    /* renamed from: bp */
    private C36527az f95842bp;

    /* renamed from: bq */
    private ArrayList<C36508a> f95843bq;

    /* renamed from: br */
    private boolean f95844br = false;

    /* renamed from: bs */
    private C7326g<C32517b> f95845bs;

    /* renamed from: bt */
    private boolean f95846bt;

    /* renamed from: bu */
    private long f95847bu = 0;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.header.ag$a */
    class C36508a extends C7092b {

        /* renamed from: a */
        boolean f95870a;

        /* renamed from: a */
        public final void mo18352a(DialogInterface dialogInterface) {
            this.f95870a = true;
        }

        C36508a() {
        }
    }

    /* renamed from: b */
    public final void mo72042b(RecommendList recommendList) {
    }

    /* access modifiers changed from: protected */
    public String getHeaderHomePageName() {
        return "others_homepage";
    }

    /* renamed from: a */
    public void mo92531a(View view) {
        super.mo92531a(view);
        if (C30538p.m99745a()) {
            this.f95707F.setVisibility(8);
        }
        m117829C();
        this.f95820at = (RemoteImageView) view.findViewById(R.id.anq);
        if (!C6399b.m19944t() && !bF_()) {
            m117742a((View) this.f95820at, m117740a(getContext()));
        }
        this.f95821au = (DmtTextView) view.findViewById(R.id.anp);
        this.f95822av = view.findViewById(R.id.d3_);
        if (!C6399b.m19944t() && !bF_()) {
            m117742a(this.f95822av, m117740a(getContext()));
        }
        this.f95823aw = view.findViewById(R.id.d38);
        this.f95824ax = (TextView) view.findViewById(R.id.ck9);
        this.f95825ay = (AnimationImageView) view.findViewById(R.id.ew);
        this.f95826az = (FrameLayout) view.findViewById(R.id.amb);
        this.f95794aA = view.findViewById(R.id.c2y);
        this.f95795aB = view.findViewById(R.id.c3x);
        this.f95796aC = (TextView) view.findViewById(R.id.ckq);
        this.f95797aD = (RecommendCommonUserView) view.findViewById(R.id.cp1);
        this.f95798aE = view.findViewById(R.id.a9o);
        this.f95799aF = view.findViewById(R.id.a9p);
        this.f95800aG = (TextView) view.findViewById(R.id.cs8);
        this.f95801aH = (TextView) view.findViewById(R.id.e0c);
        this.f95830bd = view.findViewById(R.id.ckf);
        this.f95802aI = (ConnectedRelationView) view.findViewById(R.id.a15);
        this.f95830bd.setAlpha(1.0f);
        this.f95803aJ = (ImageView) view.findViewById(R.id.ckp);
        this.f95833bg = (ImageView) view.findViewById(R.id.ck_);
        this.f95839bm = (ImageView) view.findViewById(R.id.aff);
        if (C6399b.m19944t() && this.f95839bm != null) {
            this.f95839bm.setVisibility(8);
            this.f95839bm = null;
        }
        if (this.f95839bm != null) {
            this.f95839bm.setOnClickListener(new C36509ah(this));
        }
        this.f95805aL = (RemoteImageView) view.findViewById(R.id.d39);
        C43122ff.m136759a((View) this.f95805aL, getContext().getResources().getString(R.string.bhn));
        this.f95761q = view.findViewById(R.id.a68);
        if (!bE_() || !C30553b.m99786b()) {
            this.f95805aL.setVisibility(0);
            this.f95805aL.setImageResource(R.drawable.ahs);
        } else {
            C30553b.m99810g().wrapperSendMessageSyncXIcon(this.f95805aL, 2);
            this.f95805aL.setVisibility(0);
        }
        C36530bb.m117952a(this.f95822av);
        this.f95806aM = (FrameLayout) view.findViewById(R.id.cka);
        if (bF_() && !C6399b.m19944t()) {
            this.f95806aM.setVisibility(8);
        }
        if (C35992k.m115951a()) {
            String str = this.f95719R.getmUserId();
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, C21115b.m71197a().getCurUserId())) {
                this.f95806aM.setVisibility(8);
            } else {
                setOpenRecommendCardButtonState(0);
            }
        } else {
            this.f95833bg.setImageResource(R.drawable.ayu);
            if (C7213d.m22500a().mo18745aH()) {
                if (C6399b.m19946v()) {
                    this.f95833bg.setImageResource(R.drawable.alb);
                } else {
                    this.f95833bg.setImageResource(R.drawable.afr);
                }
            }
            this.f95833bg.setBackgroundResource(R.drawable.bg_followed);
        }
        if (this.f95766v != null) {
            this.f95766v.setOnClickListener(new C36510ai(this));
            this.f95766v.setOnTouchListener(new C36517ap(this));
        }
        this.f95797aD.setOnClickListener(new C36518aq(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo92700a(View view, MotionEvent motionEvent) {
        if (!C25352e.m83366d(this.f95746b)) {
            return false;
        }
        C24573m mVar = new C24573m(motionEvent.getAction(), motionEvent.getDownTime(), motionEvent.getEventTime());
        C42961az.m136380a(mVar);
        return false;
    }

    /* renamed from: a */
    public final void mo92694a(TextView textView, ImageView imageView) {
        TextView textView2 = null;
        this.f95828bb = null;
        this.f95829bc = imageView;
        Context context = getContext();
        TextView textView3 = (TextView) this.f95705D;
        if (ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b, this.f95816aW) || !C35992k.m115951a()) {
            textView2 = this.f95828bb;
        }
        C36744o oVar = new C36744o(context, textView3, textView2, this.f95822av, this.f95820at, this.f95821au, this.f95800aG, this.f95839bm, bE_(), bF_(), this.f95806aM, ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b, this.f95816aW));
        this.f95832bf = oVar;
    }

    /* renamed from: a */
    public final void mo92697a(String str, C0608j jVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f95834bh = jVar;
            if (this.f95804aK == null) {
                this.f95804aK = new C36031j();
                this.f95804aK.mo66537a(this);
            }
        }
    }

    /* renamed from: a */
    public void mo92528a() {
        super.mo92528a();
        if (!ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b) && C35992k.m115951a() && !C43122ff.m136783n(this.f95746b)) {
            int i = (!C21115b.m71197a().isLogin() || !C7213d.m22500a().mo18808h() || TextUtils.equals(C21115b.m71197a().getCurUserId(), this.f95719R.getmUserId())) ? 8 : 0;
            if (this.f95806aM.getVisibility() != i) {
                this.f95806aM.setVisibility(i);
                m117859l(this.f95746b);
            }
        }
    }

    /* renamed from: a */
    public final void mo91704a(boolean z, boolean z2, boolean z3) {
        Context context;
        int i;
        Context context2;
        int i2;
        if (this.f95718Q.isViewValid()) {
            if (C25352e.m83360c(this.f95746b)) {
                this.f95794aA.setVisibility(0);
                this.f95796aC.setText(this.f95746b.getQuickShopInfo().getQuickShopName());
                this.f95803aJ.setBackgroundResource(R.drawable.b0k);
                if (this.f95795aB != null) {
                    this.f95795aB.setVisibility(8);
                }
                if (m117863o((int) R.id.c2y) == null && m117836J()) {
                    m117838a((int) R.id.c2y, (Object) Integer.valueOf(1));
                    C24976t.m82083a("weblink", this.f95746b.getUid());
                }
                return;
            }
            boolean r = C43122ff.m136787r(this.f95746b);
            boolean a = C25250au.m82997a(z3, z, this.f95746b);
            if (!C43122ff.m136787r(this.f95746b) && a && C25250au.m83000d(this.f95746b)) {
                a = C6384b.m19835a().mo15287a(ProfileEcommerceEntranceAB.class, true, "preferred_show_goods_tab", C6384b.m19835a().mo15295d().preferred_show_goods_tab, 1) == 0;
            }
            this.f95794aA.setVisibility(a ? 0 : 8);
            if (z2) {
                if (this.f95795aB != null) {
                    this.f95795aB.setVisibility(0);
                }
            } else if (z3 && ((Boolean) C23060u.m75742a().mo60042L().mo59877d()).booleanValue() && r) {
                getShopUserMessagePresenter().mo91639a();
            } else if (this.f95795aB != null) {
                this.f95795aB.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.f95746b.getShopMicroApp())) {
                TextView textView = this.f95796aC;
                if (C43122ff.m136787r(this.f95746b)) {
                    context2 = getContext();
                    i2 = R.string.bc3;
                } else {
                    context2 = getContext();
                    i2 = R.string.d6r;
                }
                textView.setText(context2.getString(i2));
                if (a && this.f95794aA.getTag(R.id.c2y) == null && m117836J()) {
                    new C24473g().mo63580b(this.f95719R.getmUserId()).mo63579a(C43122ff.m136787r(this.f95746b) ? "personal_homepage" : "others_homepage").mo63581c("normal").mo63537a();
                    this.f95794aA.setTag(R.id.c2y, Integer.valueOf(1));
                }
            } else {
                TextView textView2 = this.f95796aC;
                if (C43122ff.m136787r(this.f95746b)) {
                    context = getContext();
                    i = R.string.ciz;
                } else {
                    context = getContext();
                    i = R.string.be6;
                }
                textView2.setText(context.getString(i));
                if (a && this.f95794aA.getTag(R.id.c2y) == null && m117836J()) {
                    new C24473g().mo63580b(this.f95719R.getmUserId()).mo63579a(C43122ff.m136787r(this.f95746b) ? "personal_homepage" : "others_homepage").mo63581c("mini_program").mo63537a();
                    this.f95794aA.setTag(R.id.c2y, Integer.valueOf(1));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo91710b(boolean z, boolean z2, boolean z3) {
        boolean z4 = z2;
        boolean z5 = z3;
        if (this.f95718Q.isViewValid() && !mo92667k() && this.f95746b != null && !TimeLockRuler.isTeenModeON()) {
            if (!(C43122ff.m136787r(this.f95746b) ? false : z) || !C41983b.m133444a() || !this.f95836bj) {
                this.f95844br = false;
                mo92699a(z4, z5);
                return;
            }
            this.f95844br = true;
            if (this.f95825ay != null) {
                C41989d.m133476a(getContext(), false, 0, this.f95746b.getRequestId(), this.f95719R.getmUserId(), this.f95746b.roomId);
                if ((this.f95718Q instanceof UserProfileFragment) && ((UserProfileFragment) this.f95718Q).f95306X && this.f95746b != null) {
                    C41989d.m133480a(this.f95746b.getUid(), this.f95746b.roomId, "others_homepage", this.f95746b.getRequestId(), -1, -1, C6399b.m19946v(), "", "others_photo", this.f95719R.getmPreviousPage());
                }
                if (C7213d.m22500a().mo18806f() == 2) {
                    m117831E();
                    this.f95825ay.setVisibility(8);
                } else if (C7213d.m22500a().mo18806f() == 1) {
                    this.f95825ay.getLayoutParams().width = f95786al;
                    this.f95825ay.getLayoutParams().height = f95788an;
                    if (this.f95825ay.getLayoutParams() instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f95825ay.getLayoutParams();
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, -f95792ar, -f95791aq);
                        if (VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginEnd(-f95792ar);
                        }
                    }
                    this.f95825ay.setImageResource(R.drawable.aba);
                    mo92752g(false);
                    m117830D();
                    m117848b(z4, z5);
                } else {
                    this.f95825ay.getLayoutParams().width = f95787am;
                    this.f95825ay.getLayoutParams().height = f95789ao;
                    if (this.f95825ay.getLayoutParams() instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f95825ay.getLayoutParams();
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, 0, -f95791aq);
                        if (VERSION.SDK_INT >= 17) {
                            marginLayoutParams2.setMarginEnd(0);
                        }
                    }
                    mo92752g(true);
                    m117830D();
                    m117848b(z4, z5);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo92699a(boolean z, boolean z2) {
        int i = !z ? 0 : z2 ? 2 : 3;
        setHeadStatus(i);
        this.f95825ay.setVisibility(8);
        this.f95825ay.mo7085f();
        if (this.f95769y != null) {
            this.f95769y.setVisibility(8);
        }
        this.f95768x.setBorderWidthPx(0);
        m117832F();
    }

    /* renamed from: a */
    public final void mo91698a(int i, int i2) {
        boolean z = this.f95841bo != i;
        this.f95841bo = i;
        if (this.f95718Q.isViewValid() && !m117850c(i, i2)) {
            this.f95832bf.f96440g = ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b);
            this.f95832bf.mo93070b(i, i2);
            m117856h(z);
            C36530bb.m117952a(this.f95822av);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92693a(View view, boolean z, DialogInterface dialogInterface, int i) {
        C6907h.m21524a("choose_punish_pop", (Map) new C22984d().mo59970a("is_follow", 1).f60753a);
        m117854e(view, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92689a(int i, int i2, int i3) {
        if (this.f95804aK != null && this.f95804aK.ap_()) {
            m117845b(i, i2);
            this.f95804aK.mo91679a(new C36034a().mo91684a(this.f95719R.getmUserId()).mo91686b("").mo91682a(i3).mo91685b(19).mo91687c(C42976bj.m136440a(this.f95719R)).mo91689d(this.f95719R.getmFollowerStatus()).mo91681a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92690a(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            mo92544j((View) this.f95800aG);
        }
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    public final void mo92698a(boolean z) {
        m117849c(z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92696a(FollowStatus followStatus, boolean z, DialogInterface dialogInterface) {
        if (!ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b)) {
            m117839a(followStatus.followStatus, z, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92637a(String str, String str2) {
        super.mo92637a(str, str2);
    }

    /* renamed from: a */
    public final void mo92695a(FollowStatus followStatus) {
        mo91698a(followStatus.followStatus, this.f95746b.getFollowerStatus());
        this.f95797aD.mo92910a(followStatus);
    }

    /* renamed from: a */
    public final void mo91701a(UrlModel urlModel) {
        super.mo91701a(urlModel);
        C43122ff.m136758a(getContext(), this.f95768x, this.f95746b);
    }

    /* renamed from: a */
    public final void mo72038a(Exception exc) {
        C22814a.m75244a((Context) getActivity(), (Throwable) exc);
        setOpenRecommendCardButtonState(0);
    }

    /* renamed from: a */
    public final void mo72036a(final RecommendList recommendList) {
        if (this.f95718Q.isViewValid()) {
            if (recommendList == null || recommendList.getUserList() == null) {
                setOpenRecommendCardButtonState(0);
                if (!this.f95846bt) {
                    C10761a.m31399c(getContext(), (int) R.string.d75).mo25750a();
                }
                return;
            }
            if (recommendList.getUserList().size() < 10) {
                this.f95797aD.setShowLookMore(false);
            } else {
                this.f95797aD.setShowLookMore(true);
            }
            this.f95797aD.setOnViewAttachedToWindowListener(this.f95818aY);
            this.f95797aD.mo92911a(recommendList.getUserList(), recommendList.getRid());
            this.f95797aD.setOnItemOperationListener(new C36630b() {
                /* renamed from: b */
                public final void mo72051b(User user, int i) {
                    C36492ag.this.mo92698a(false);
                }

                /* renamed from: a */
                public final void mo72050a(User user, int i) {
                    C30030b.m98492a().dislikeRecommend(user.getUid());
                    if (C6399b.m19944t()) {
                        C36767x.m118514b(user.getUid(), C36492ag.this.mo92705k(user), C36492ag.this.getRid(), C36492ag.this.getUserId());
                    } else {
                        User user2 = user;
                        C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("others_homepage").setJsonObject(C36492ag.this.mo92688a(user.getUid(), "delete", C36492ag.this.mo92705k(user), user.getRecommendReason(), user2)));
                        C36767x.m118510a(user.getUid(), "delete", C36492ag.this.mo92705k(user), C36492ag.this.getRid(), "empty", user2);
                    }
                    C36492ag.this.f95807aN.mo91633a(user);
                }

                /* renamed from: d */
                public final void mo72053d(User user, int i) {
                    String str = C36492ag.this.f95719R.getmAwemeId();
                    String str2 = C36492ag.this.f95719R.getmUserId();
                    C36492ag.this.f95719R.getmEventType();
                    if (C6399b.m19944t()) {
                        C36767x.m118511a(C36492ag.this.f95719R.getmRequestId(), user.getUid(), C36492ag.this.getUserId());
                        return;
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("others_homepage").setJsonObject(C36492ag.this.mo92688a(user.getUid(), "enter_profile", C36492ag.this.mo92705k(user), user.getRecommendReason(), user)));
                    C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("others_homepage").setValue(C36492ag.this.f95719R.getmUserId()).setJsonObject(C6869c.m21381a().mo16887a("enter_from", C36492ag.this.f95719R.getmEventType()).mo16887a("enter_type", "card").mo16888b()));
                    new C33276r().mo85313c(str).mo85310b("others_homepage").mo85322o(str2).mo85324q(C21718a.m72637a(user)).mo85252e();
                }

                /* renamed from: c */
                public final void mo72052c(User user, int i) {
                    String str;
                    String str2;
                    if (!C6399b.m19944t()) {
                        C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("others_homepage").setJsonObject(C36492ag.this.mo92688a(user.getUid(), "follow", C36492ag.this.mo92705k(user), user.getRecommendReason(), user)));
                        C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("others_homepage").setValue(C36492ag.this.f95719R.getmUserId()).setJsonObject(C6869c.m21381a().mo16887a("previous_page", C36492ag.this.f95719R.getmEventType()).mo16887a("request_id", recommendList.getRid()).mo16887a("enter_type", "card").mo16888b()));
                        if (user.getFollowStatus() == 0) {
                            str = "follow";
                        } else {
                            str = "follow_cancel";
                        }
                        new C33280v(str).mo85343c("follow_card_button").mo85341b("others_homepage").mo85347f(C36492ag.this.f95719R.getmPreviousPagePosition()).mo85345e(C36492ag.this.f95719R.getmPreviousPage()).mo85352o(recommendList.getRid()).mo85354q("card").mo85344d("nonempty").mo85348g(C36492ag.this.f95719R.getmUserId()).mo85350j(C21718a.m72637a(user)).mo85252e();
                        String str3 = "follow_card";
                        C22984d a = C22984d.m75611a();
                        String str4 = "event_type";
                        if (user.getFollowStatus() == 0) {
                            str2 = "follow";
                        } else {
                            str2 = "follow_cancel";
                        }
                        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59973a("enter_method", "follow_card_button").mo59973a("enter_from", "others_homepage").mo59973a("previous_page_position", C36492ag.this.f95719R.getmPreviousPagePosition()).mo59973a("previous_page", C36492ag.this.f95719R.getmPreviousPage()).mo59973a("request_id", recommendList.getRid()).mo59973a("to_user_id", C36492ag.this.f95719R.getmUserId()).mo59973a("rec_uid", user.getUid()).mo59970a("impr_order", C36492ag.this.mo92705k(user)).mo59973a("rec_reason", user.getRecommendReason()).mo59973a("req_id", C36492ag.this.getRid()).mo59973a("rec_user_type", C21718a.m72637a(user)).f60753a);
                    } else if (user.getFollowStatus() == 0) {
                        C36767x.m118512a(recommendList.getRid(), user.getUid(), C36492ag.this.f95719R.getmPreviousPage(), C36492ag.this.getUserId());
                        C36767x.m118513a(recommendList.getLogPb().getImprId(), recommendList.getRid(), user.getUid(), C36492ag.this.f95719R.getmPreviousPage(), C36492ag.this.getUserId());
                    } else {
                        C36767x.m118515b(recommendList.getRid(), user.getUid(), C36492ag.this.f95719R.getmPreviousPage(), C36492ag.this.f95719R.getmUserId());
                        C36767x.m118516b(recommendList.getLogPb().getImprId(), recommendList.getRid(), user.getUid(), C36492ag.this.f95719R.getmPreviousPage(), C36492ag.this.getUserId());
                    }
                }
            });
            this.f95797aD.setOnLookMoreUserListener(new C36620a() {
                /* renamed from: a */
                public final void mo72054a(String str, boolean z) {
                    String str2;
                    if (C43122ff.m136787r(C36492ag.this.f95746b) || !RecUserExpansionAB.INSTANCE.enableRecUserMove()) {
                        RecommendUserActivity.m117278a(C36492ag.this.getContext(), C36492ag.this.f95719R.getmUserId(), 1, "others_homepage_more", "others_homepage", str, C36492ag.this.f95719R.getSecUserId());
                    } else {
                        FollowRelationTabActivity.m97191a(C36492ag.this.getContext(), C36492ag.this.f95746b, "recommend_user");
                        String str3 = "enter_find_friends_list";
                        C22984d a = C22984d.m75611a().mo59973a("enter_from", "others_homepage_more");
                        String str4 = "enter_method";
                        if (z) {
                            str2 = "click";
                        } else {
                            str2 = "click_more";
                        }
                        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59973a("scene_id", "1003").f60753a);
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("click_add_friends").setLabelName("personal_homepage").setJsonObject(C6869c.m21381a().mo16887a("event_type", "card").mo16888b()));
                }
            });
            if (C6307b.m19566a((Collection<T>) recommendList.getUserList())) {
                setOpenRecommendCardButtonState(0);
                if (!this.f95846bt) {
                    C10761a.m31399c(getContext(), (int) R.string.d75).mo25750a();
                }
            } else {
                m117849c(true, this.f95807aN != null && this.f95807aN.f94194d);
            }
            if (recommendList == null || C6307b.m19566a((Collection<T>) recommendList.getUserList())) {
                if (!C6399b.m19944t()) {
                    mo72038a(new Exception());
                } else if (!this.f95846bt) {
                    this.f95838bl = true;
                    this.f95797aD.mo92912a(true);
                    C36767x.m118508a(getUserId());
                    C36712af.m118373b(true, this.f95797aD, this.f95704C, this.f95712K, this.f95826az, this.f95761q, this.f95798aE, this.f95715N);
                    setOpenRecommendCardButtonState(2);
                } else {
                    setOpenRecommendCardButtonState(0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91733a(ShopUserMessage shopUserMessage) {
        if (this.f95795aB != null) {
            this.f95795aB.setVisibility((shopUserMessage == null || !shopUserMessage.getHasUnread()) ? 8 : 0);
        }
    }

    /* renamed from: K */
    private void m117837K() {
        View findViewById = findViewById(R.id.bhf);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo91720e() {
        super.mo91720e();
        mo92664i(this.f95746b);
    }

    public String getUserId() {
        if (this.f95719R == null) {
            return "";
        }
        return this.f95719R.getmUserId();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f95831be != null) {
            this.f95831be.mo25722b();
        }
    }

    /* renamed from: t */
    public void mo92560t() {
        mo92698a(false);
        this.f95807aN = null;
        setOpenRecommendCardButtonState(0);
        m117837K();
    }

    /* renamed from: u */
    public final void mo92561u() {
        mo92698a(false);
        this.f95807aN = null;
        setOpenRecommendCardButtonState(0);
    }

    /* renamed from: J */
    private boolean m117836J() {
        ViewParent parent = getParent();
        if (!(parent instanceof View) || !C23487o.m77156c((View) parent)) {
            return false;
        }
        return true;
    }

    private C36006af getShopUserMessagePresenter() {
        if (this.f95835bi == null) {
            this.f95835bi = new C36006af(new ShopUserMessageModel(), this);
        }
        return this.f95835bi;
    }

    /* renamed from: A */
    public final void mo92686A() {
        if (this.f95831be != null && this.f95831be.isShowing()) {
            this.f95831be.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo92538c() {
        super.mo92538c();
        if (this.f95795aB != null) {
            this.f95795aB.setVisibility(8);
        }
        C34202f.m110435a().mo86951d();
    }

    public String getRid() {
        if (this.f95807aN == null || this.f95807aN.mo91636d() == null) {
            return "";
        }
        return this.f95807aN.mo91636d().getRid();
    }

    /* renamed from: z */
    public final void mo92723z() {
        List list;
        if (this.f95718Q instanceof UserProfileFragment) {
            C36340al alVar = ((UserProfileFragment) this.f95718Q).f95339ae;
            if (alVar != null) {
                list = alVar.mo90852x();
                C36717ag.m118374a(getActivity(), this.f95746b, (String) null, list);
            }
        }
        list = null;
        C36717ag.m118374a(getActivity(), this.f95746b, (String) null, list);
    }

    /* renamed from: C */
    private void m117829C() {
        if (C6887b.m21436b().mo16909b(getContext(), "follow_in_profile", true) && C7285c.m22838a(getContext(), "applog_stats", 0).getString("app_track", "").contains("need_follow")) {
            mo92707k(this.f95705D);
            C6887b.m21436b().mo16902a(getContext(), "follow_in_profile", false);
        }
    }

    /* renamed from: D */
    private void m117830D() {
        if (C6399b.m19944t()) {
            this.f95768x.setBorderColor(R.color.a79);
            this.f95768x.setBorderWidth(2);
        } else {
            if (this.f95769y != null) {
                this.f95769y.setStrokeWidth(4);
                this.f95769y.setVisibility(0);
            }
            this.f95768x.setBorderWidthPx(0);
        }
        m117832F();
    }

    /* renamed from: F */
    private void m117832F() {
        if (this.f95815aV != null) {
            this.f95815aV.mo74068a(8);
            this.f95815aV.mo74075d();
            this.f95769y.getLayoutParams().width = f95785ak;
            this.f95769y.getLayoutParams().height = f95785ak;
            LiveCircleView liveCircleView = this.f95769y;
            int i = f95793as;
            int i2 = f95793as;
            liveCircleView.setPadding(i, i, i2, i2);
        }
    }

    private String getRequestId() {
        String str = "";
        if (!TextUtils.isEmpty(this.f95719R.getmEnterFromRequestId())) {
            return this.f95719R.getmEnterFromRequestId();
        }
        if (this.f95746b != null) {
            str = this.f95746b.getRequestId();
        }
        Aweme aweme = this.f95719R.getmAweme();
        if (TextUtils.isEmpty(str) && TextUtils.equals("homepage_hot", this.f95719R.getmEventType()) && aweme != null) {
            str = aweme.getRequestId();
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final /* synthetic */ void mo92687B() {
        if (this.f95746b != null && !TextUtils.isEmpty(this.f95746b.getRemarkName())) {
            mo91703a(this.f95746b.getRemarkName(), this.f95746b.getStarBillboardRank(), this.f95746b.getBrandInfo(), this.f95746b);
        }
    }

    /* renamed from: x */
    public final void mo92721x() {
        if (this.f95746b != null) {
            C6907h.m21524a("click_block", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f95746b.getUid()).f60753a);
            m117857i(this.f95746b.isBlock());
        }
    }

    /* renamed from: E */
    private void m117831E() {
        m117830D();
        this.f95769y.getLayoutParams().width = f95784aj;
        this.f95769y.getLayoutParams().height = f95784aj;
        LiveCircleView liveCircleView = this.f95769y;
        int i = f95790ap;
        int i2 = f95790ap;
        liveCircleView.setPadding(i, i, i2, i2);
        if (this.f95815aV == null) {
            this.f95815aV = new C28826b(true, this.f95768x, this.f95768x, this.f95769y);
        }
        if (this.f95845bs == null) {
            this.f95845bs = new C7326g<C32517b>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C32517b bVar) throws Exception {
                    if (TextUtils.equals(C36492ag.this.f95746b.getUid(), String.valueOf(bVar.f84785a))) {
                        C36492ag.this.f95746b.roomId = bVar.f84786b;
                        if (!C36492ag.this.f95746b.isLive()) {
                            C36492ag.this.f95815aV.mo74073b();
                        }
                    }
                }
            };
        }
        this.f95815aV.mo74071a(this.f95746b, getClass(), this.f95845bs);
    }

    /* renamed from: H */
    private void m117834H() {
        String str;
        C33280v k = new C33280v().mo85341b("others_homepage").mo85347f(this.f95719R.getmPreviousPagePosition()).mo85345e(this.f95719R.getmPreviousPage()).mo85343c("follow_button").mo85348g(this.f95719R.getmUserId()).mo85351k(this.f95719R.getmAwemeId());
        if (!TextUtils.isEmpty(this.f95719R.getmEnterFromRequestId())) {
            str = this.f95719R.getmEnterFromRequestId();
        } else if (this.f95746b != null) {
            str = this.f95746b.getRequestId();
        } else {
            str = "";
        }
        k.mo85352o(str).mo85252e();
    }

    /* renamed from: I */
    private void m117835I() {
        if (this.f95837bk && this.f95806aM.getVisibility() == 0 && C35992k.m115951a()) {
            if (this.f95746b == null || this.f95746b.getCommerceUserLevel() <= 0) {
                C6907h.m21524a("others_homepage_triangle_button", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("author_id", this.f95719R.getmUserId()).f60753a);
                this.f95837bk = false;
            }
        }
    }

    /* renamed from: b */
    public final void mo92534b() {
        super.mo92534b();
        if (this.f95804aK != null) {
            this.f95804aK.mo59134U_();
        }
        if (this.f95807aN != null) {
            this.f95807aN.mo86692c();
        }
        if (this.f95835bi != null) {
            this.f95835bi.mo86692c();
        }
    }

    /* renamed from: h */
    public final void mo92542h() {
        if (TextUtils.equals(this.f95719R.getmType(), "need_follow")) {
            this.f95705D.performClick();
        }
        this.f95705D.setEnabled(true);
        this.f95820at.setEnabled(true);
        this.f95822av.setEnabled(true);
        this.f95800aG.setEnabled(true);
        C34626j.m111876a(this.f95820at);
        C34626j.m111876a(this.f95822av);
        C34626j.m111876a(this.f95800aG);
        if (this.f95719R != null && !TextUtils.equals(this.f95719R.getmProfileFrom(), "feed_detail")) {
            this.f95837bk = true;
        }
    }

    /* renamed from: s */
    public final void mo92558s() {
        super.mo92558s();
        if (this.f95718Q.isViewValid()) {
            int publishPosi = getPublishPosi();
            if (publishPosi > 0) {
                ProfileTabView i = mo92661i(publishPosi);
                String string = getContext().getString(R.string.fsv);
                if (mo92667k()) {
                    string = getContext().getString(R.string.d8c);
                }
                m117842a(i, "", string);
            }
            int favoritePosi = getFavoritePosi();
            if (favoritePosi > 0) {
                ProfileTabView i2 = mo92661i(favoritePosi);
                String string2 = getContext().getString(R.string.bz_);
                if (mo92667k()) {
                    string2 = getContext().getString(R.string.d70);
                }
                m117842a(i2, "", string2);
            }
            int dynamicPosi = getDynamicPosi();
            if (dynamicPosi > 0) {
                m117842a(mo92661i(dynamicPosi), "", getContext().getString(R.string.b6g));
            }
        }
    }

    /* renamed from: v */
    public final void mo92562v() {
        if (this.f95746b != null) {
            C6907h.m21524a("click_more_action", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").f60753a);
            if (C7213d.m22500a().mo18777ao() == 1) {
                ArrayList arrayList = null;
                if (this.f95718Q instanceof UserProfileFragment) {
                    C36340al alVar = ((UserProfileFragment) this.f95718Q).f95339ae;
                    if (alVar != null) {
                        arrayList = alVar.mo90852x();
                    }
                }
                this.f95840bn.clear();
                getItemList();
                String[] strArr = new String[this.f95840bn.size()];
                this.f95840bn.toArray(strArr);
                C36717ag.m118380a((Handler) this.f95808aO, getActivity(), this.f95746b, (List<Aweme>) arrayList, strArr);
                return;
            }
            C25712a aVar = new C25712a(getActivity());
            final String[] itemList = getItemList();
            aVar.mo66614a((CharSequence[]) itemList, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (TextUtils.equals(itemList[i], C36492ag.this.f95810aQ)) {
                        C36492ag.this.mo92563w();
                    } else if (TextUtils.equals(itemList[i], C36492ag.this.f95811aR)) {
                        C36492ag.this.mo92721x();
                    } else if (TextUtils.equals(itemList[i], C36492ag.this.f95812aS)) {
                        C36492ag.this.mo92722y();
                    } else if (TextUtils.equals(itemList[i], C36492ag.this.f95813aT) || TextUtils.equals(itemList[i], C36492ag.this.f95809aP)) {
                        C36492ag.this.mo92723z();
                    }
                    dialogInterface.dismiss();
                }
            });
            try {
                aVar.mo66615b();
            } catch (NotFoundException unused) {
            }
        }
    }

    /* renamed from: w */
    public final void mo92563w() {
        if (!C21115b.m71197a().isLogin()) {
            C32656f.m105742a(getActivity(), this.f95719R.getmEventType(), "report");
            return;
        }
        if (this.f95746b != null) {
            C6907h.m21524a("report_user", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f95746b.getUid()).f60753a);
            ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(getActivity(), "user", this.f95746b.getUid(), this.f95746b.getUid(), null);
        }
    }

    /* renamed from: y */
    public final void mo92722y() {
        User user = this.f95746b;
        if (user == null) {
            user = new User();
            user.setUid(this.f95719R.getmUserId());
        }
        Aweme aweme = this.f95719R.getmAweme();
        if (m117843a(aweme)) {
            C30553b.m99810g().startChatWithAdLog(getContext(), C30553b.m99780a(user), new IMAdLog(aweme.getAwemeRawAd().getLogExtra(), String.valueOf(aweme.getAwemeRawAd().getCreativeId())));
        } else {
            C30553b.m99810g().startChat(getContext(), C30553b.m99780a(user), 5);
        }
        C30560g.m99816a(this.f95719R.getmUserId());
        C30560g.m99819a(this.f95719R.getmUserId(), this.f95719R.getmAwemeId(), this.f95719R.getmEventType(), this.f95719R.getmRequestId(), "click_stranger_chat_button");
    }

    /* renamed from: G */
    private void m117833G() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (TextUtils.isEmpty(this.f95746b.getShopMicroApp())) {
            Activity activity = getActivity();
            int verifyStatus = C21115b.m71197a().getVerifyStatus();
            CommerceUser a = C24449a.m80374a(this.f95746b);
            if (C43122ff.m136787r(this.f95746b)) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            C24487e eVar = new C24487e(activity, verifyStatus, a, str3, C43122ff.m136787r(this.f95746b), this.f95719R.getmAwemeId());
            ICommerceService a2 = C24436a.m80356a();
            String str6 = "my_store";
            if (C43122ff.m136787r(this.f95746b)) {
                str4 = "personal_homepage";
            } else {
                str4 = "others_homepage";
            }
            String str7 = str4;
            if (C43122ff.m136787r(this.f95746b)) {
                str5 = "click_personal_store";
            } else {
                str5 = "click_others_store";
            }
            String str8 = str5;
            a2.gotoGoodShop(eVar, str6, str7, str8, "");
            return;
        }
        C24463b bVar = new C24463b();
        if (C43122ff.m136787r(this.f95746b)) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        bVar.mo63542a(str).mo63544c("mini_program").mo63543b(this.f95719R.getmUserId()).mo63537a();
        C33472a c = new C33472a().mo85792c("027002");
        if (C43122ff.m136787r(this.f95746b)) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        C7167b.m22380b().mo18647a().openMiniApp((Context) getActivity(), this.f95746b.getShopMicroApp(), c.mo85791b(str2).mo85789a("store_entrance").mo85790a());
        if (!(this.f95719R == null || this.f95719R.getmAweme() == null)) {
            Aweme aweme = this.f95719R.getmAweme();
            if (C25352e.m83224g(aweme)) {
                C24976t.m82279t(getContext(), aweme, "homepage_ad");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo92551o() {
        C6907h.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("others_homepage"));
        C6907h.m21524a("click_follow_count", (Map) new C22984d().mo59973a("enter_from", "others_homepage").f60753a);
        if (C6399b.m19947w() || (!C6399b.m19944t() && C7213d.m22500a().mo18746aI() == 1)) {
            FollowRelationTabActivity.m97191a(getActivity(), this.f95746b, "following_relation");
            C6907h.m21524a("enter_relation_tab", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "click_follow_count").f60753a);
            return;
        }
        C29667a aVar = new C29667a(getActivity(), this.f95718Q, this.f95719R.getmUserId(), false, PageType.following, this.f95747c);
        aVar.mo75664a(this.f95746b).mo75665a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo92555p() {
        C6907h.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName("others_homepage"));
        C6907h.m21524a("click_fans_count", (Map) new C22984d().mo59973a("enter_from", "others_homepage").f60753a);
        if (C6399b.m19947w() || (!C6399b.m19944t() && C7213d.m22500a().mo18746aI() == 1)) {
            FollowRelationTabActivity.m97191a(getActivity(), this.f95746b, "follower_relation");
            C6907h.m21524a("enter_relation_tab", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "click_fans_count").f60753a);
            return;
        }
        C29667a aVar = new C29667a(getActivity(), this.f95718Q, this.f95719R.getmUserId(), false, PageType.follower, this.f95748d);
        aVar.mo75664a(this.f95746b).mo75665a();
    }

    private String[] getItemList() {
        Resources resources;
        int i;
        ArrayList arrayList = new ArrayList();
        if (!C30538p.m99745a()) {
            if (TextUtils.isEmpty(this.f95809aP)) {
                this.f95809aP = getResources().getString(R.string.dsq);
            }
            arrayList.add(this.f95809aP);
        }
        if (TextUtils.isEmpty(this.f95810aQ)) {
            this.f95810aQ = getResources().getString(R.string.des);
        }
        if (TextUtils.isEmpty(this.f95812aS)) {
            this.f95812aS = getResources().getString(R.string.dm2);
        }
        arrayList.add(this.f95810aQ);
        this.f95840bn.add("report_user");
        if (this.f95746b != null && C21115b.m71197a().isLogin()) {
            if (this.f95746b.isBlock()) {
                resources = getResources();
                i = R.string.fip;
            } else {
                resources = getResources();
                i = R.string.tj;
            }
            this.f95811aR = resources.getString(i);
            arrayList.add(this.f95811aR);
            if (this.f95746b.isBlock()) {
                this.f95840bn.add("unblock");
            } else {
                this.f95840bn.add("block");
            }
            if (C6399b.m19944t()) {
                if (!this.f95746b.isBlock && C30553b.m99785a()) {
                    arrayList.add(this.f95812aS);
                    this.f95840bn.add("message");
                }
            } else if (C30553b.m99785a()) {
                arrayList.add(this.f95812aS);
                this.f95840bn.add("message");
            }
        }
        if (C6399b.m19944t()) {
            if (TextUtils.isEmpty(this.f95813aT)) {
                this.f95813aT = getResources().getString(R.string.dt9);
            }
            if (this.f95746b != null) {
                if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isMe(this.f95746b.getUid()) || !this.f95746b.isSecret()) {
                    arrayList.add(0, this.f95813aT);
                }
                if (((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().mo59877d()).booleanValue() && this.f95746b.getFollowerStatus() == 1) {
                    this.f95840bn.add("remove_follower");
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo92549n() {
        HashMap hashMap;
        C6907h.m21524a("click_profile_photo", (Map) C22984d.m75611a().mo59973a("to_user_id", this.f95719R.getmUserId()).f60753a);
        if (this.f95746b != null) {
            if (TimeLockRuler.isTeenModeON()) {
                C6907h.m21524a("click_profile_icon", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "click_head").mo59973a("author_id", this.f95746b.getUid()).f60753a);
                HeaderDetailActivity.m116635a(getActivity(), C42914ab.m136242a().mo104635a("uri", C43122ff.m136764a(C43122ff.m136778i(this.f95746b))).mo104631a("extra_zoom_info", (Parcelable) ZoomAnimationUtils.m136228a(this.f95768x)).mo104632a("share_info", (Serializable) this.f95746b).f111445a);
            } else if (!this.f95746b.isLive() || mo92667k()) {
                C6907h.m21524a("click_profile_icon", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "click_head").f60753a);
                HeaderDetailActivity.m116635a(getActivity(), C42914ab.m136242a().mo104635a("uri", C43122ff.m136764a(C43122ff.m136778i(this.f95746b))).mo104631a("extra_zoom_info", (Parcelable) ZoomAnimationUtils.m136228a(this.f95768x)).mo104632a("share_info", (Serializable) this.f95746b).f111445a);
            } else {
                this.f95719R.setFromLive(true);
                Aweme aweme = this.f95719R.getmAweme();
                if (aweme == null && this.f95733ah != null && TextUtils.equals(this.f95733ah.getAuthorUid(), C43122ff.m136788s(this.f95746b))) {
                    aweme = this.f95733ah;
                }
                if (C25329c.m83209K(aweme)) {
                    C25371n.m83468b(getContext(), aweme);
                    C24976t.m82111aX(getContext(), aweme);
                    return;
                }
                String str = null;
                if (C25352e.m83224g(aweme)) {
                    C24976t.m82063a(getContext(), "homepage_ad", aweme);
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    hashMap = new HashMap();
                    hashMap.put("value", String.valueOf(awemeRawAd.getCreativeId()));
                    hashMap.put("log_extra", awemeRawAd.getLogExtra());
                } else {
                    hashMap = null;
                }
                Context context = getContext();
                User user = this.f95746b;
                if (this.f95719R != null) {
                    if (TextUtils.isEmpty(this.f95719R.getLivePreviousPage())) {
                        str = this.f95719R.getmFromSearch();
                    } else {
                        str = this.f95719R.getLivePreviousPage();
                    }
                }
                C41994h.m133524a(context, user, str, true, hashMap);
            }
        }
    }

    /* renamed from: n */
    public final void mo92710n(View view) {
        mo92544j(view);
    }

    public void setFollowFromTitleBar(boolean z) {
        this.f95814aU = z;
    }

    public void setSimpleUser(boolean z) {
        this.f95816aW = z;
    }

    /* renamed from: h */
    public final void mo92660h(User user) {
        super.mo92660h(user);
        m117859l(user);
        m117861m(user);
    }

    /* renamed from: j */
    public final void mo92704j(User user) {
        if (this.f95832bf != null) {
            this.f95832bf.mo93068b();
            this.f95832bf.mo93064a();
        }
    }

    /* renamed from: k */
    public final void mo92707k(View view) {
        mo92692a(view, !C6399b.m19946v());
    }

    public void setRecommendUserMode(boolean z) {
        int i;
        if (this.f95706E != null) {
            DmtTabLayout dmtTabLayout = this.f95706E;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            dmtTabLayout.setVisibility(i);
        }
    }

    /* renamed from: g */
    private void mo92752g(boolean z) {
        this.f95825ay.setVisibility(0);
        if (z) {
            this.f95825ay.setAnimation("tag_profile_live.json");
            this.f95825ay.mo7078b();
        }
        setHeadStatus(1);
        m117832F();
    }

    /* renamed from: l */
    private void m117858l(int i) {
        if (!C36530bb.m117954a(i)) {
            this.f95806aM.setVisibility(8);
            if (this.f95832bf != null) {
                this.f95832bf.mo93064a();
            }
            mo92698a(false);
        }
        m117835I();
    }

    /* renamed from: o */
    private Object m117863o(int i) {
        ViewParent parent = getParent();
        if (parent instanceof View) {
            return ((View) parent).getTag(R.id.c2y);
        }
        return null;
    }

    /* renamed from: k */
    public final int mo92705k(User user) {
        if (user == null || this.f95807aN == null) {
            return 0;
        }
        return this.f95807aN.mo91625a(user.getUid());
    }

    public void onFollowFail(final Exception exc) {
        if (C23645b.m77551a(exc)) {
            C23645b.m77550a(this.f95834bh, (ApiServerException) exc, new C23637b() {
                /* renamed from: a */
                public final void mo57592a() {
                    C36492ag.this.f95804aK.mo56975R_();
                }

                /* renamed from: b */
                public final void mo57593b() {
                    C22814a.m75245a(C36492ag.this.getActivity(), exc, R.string.b82);
                }
            });
        } else {
            C22814a.m75245a(getActivity(), exc, R.string.b82);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final /* synthetic */ void mo92713q(View view) {
        if (this.f95843bq.size() > 0) {
            boolean z = false;
            C36508a aVar = (C36508a) this.f95843bq.remove(0);
            if (!C6399b.m19946v() && !aVar.f95870a) {
                z = true;
            }
            mo92692a(view, z);
        }
    }

    public void setOpenRecommendCardButtonState(int i) {
        if (!ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b) && C35992k.m115951a()) {
            setDouYinBtnReport(i);
        }
    }

    /* renamed from: h */
    private void m117856h(boolean z) {
        if (bE_() && this.f95822av.getVisibility() == 0 && z) {
            C30553b.m99810g().wrapperSendMessageSyncXIcon(this.f95805aL, 2);
            if (this.f95836bj && C36530bb.m117955b()) {
                C30560g.m99815a(getContext());
            }
        }
    }

    /* renamed from: l */
    private void m117859l(User user) {
        if (user != null) {
            m117858l(user.getFollowStatus());
            return;
        }
        if (this.f95719R != null) {
            m117858l(this.f95719R.getmFollowStatus());
        }
    }

    /* renamed from: n */
    private void m117862n(int i) {
        if (TextUtils.equals(this.f95719R.getmPreviousPage(), "homepage_hot") && i == 1) {
            C21718a.m72640a(this.f95719R.getmAweme(), this.f95719R.getmUserId(), this.f95719R.getmEnterFromRequestId());
        }
    }

    /* renamed from: c */
    public final void mo91713c(String str) {
        int i;
        if (this.f95718Q.isViewValid()) {
            this.f95723V = str;
            StringBuilder sb = new StringBuilder();
            Resources resources = getResources();
            if (C6399b.m19947w()) {
                i = R.string.dut;
            } else {
                i = R.string.bfu;
            }
            sb.append(resources.getString(i));
            sb.append(str);
            this.f95760p.setText(sb.toString());
        }
    }

    /* renamed from: e */
    public final void mo91721e(int i) {
        if (this.f95718Q.isViewValid() && getStoryPosi() >= 0) {
            ProfileTabView i2 = mo92661i(getStoryPosi());
            String valueOf = String.valueOf(i);
            Locale locale = Locale.getDefault();
            String string = getContext().getString(R.string.e2h);
            Object[] objArr = new Object[1];
            if (i < 0) {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            m117842a(i2, valueOf, C1642a.m8035a(locale, string, objArr));
        }
    }

    /* renamed from: k */
    public final void mo92706k(int i) {
        if (this.f95832bf != null) {
            this.f95832bf.mo93065a(i);
            this.f95832bf.mo93069b(this.f95841bo);
        }
    }

    /* renamed from: m */
    public final void mo92709m(View view) {
        if (this.f95746b != null) {
            if (TimeLockRuler.isTeenModeON()) {
                C10761a.m31409e(getContext(), (int) R.string.e67).mo25750a();
                return;
            }
            IIMService a = C30553b.m99808a(false);
            if (view.equals(this.f95822av) || view.equals(this.f95839bm)) {
                m117841a(a);
            }
        }
    }

    /* renamed from: p */
    public final void mo92712p(View view) {
        if (System.currentTimeMillis() - this.f95847bu >= 500) {
            this.f95847bu = System.currentTimeMillis();
            if (!C35992k.m115951a()) {
                mo92562v();
                return;
            }
            if (!this.f95838bl) {
                this.f95846bt = false;
            }
            boolean z = !this.f95838bl;
            m117849c(z, true);
            if (z && !C6399b.m19944t()) {
                C6907h.m21524a("spread_follow_card", (Map) C22984d.m75611a().f60753a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final /* synthetic */ void mo92714r(View view) {
        int i;
        GeneralPermission generalPermission = this.f95746b.getGeneralPermission();
        if (generalPermission != null) {
            i = generalPermission.getShopToast();
        } else {
            i = 0;
        }
        if (i == 1) {
            C10761a.m31409e(getContext(), (int) R.string.qe).mo25750a();
        } else {
            m117864t(view);
        }
    }

    /* renamed from: a */
    private static void m117840a(Activity activity) {
        C22903bl privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = ((Integer) privacyAccountFollowCount.mo59877d()).intValue();
        if (intValue == 0) {
            new C10741a(activity).mo25657b((int) R.string.d50).mo25650a((int) R.string.bfm, (OnClickListener) null).mo25656a().mo25637a();
        } else if (intValue > 0 && intValue < 4) {
            C10761a.m31409e((Context) activity, (int) R.string.d51).mo25750a();
        }
        privacyAccountFollowCount.mo59871a(Integer.valueOf(intValue + 1));
    }

    /* renamed from: i */
    private void m117857i(boolean z) {
        if (z) {
            BlockApi.m115434a((Handler) this.f95808aO, this.f95746b.getUid(), 0);
            C30560g.m99817a("others_homepage", this.f95746b.getUid());
            return;
        }
        C365024 r3 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == -2 || i != -1) {
                    C30560g.m99818a("cancel", C36492ag.this.f95746b.getUid(), "others_homepage");
                    dialogInterface.dismiss();
                } else {
                    dialogInterface.dismiss();
                    BlockApi.m115434a((Handler) C36492ag.this.f95808aO, C36492ag.this.f95746b.getUid(), 1);
                    C30560g.m99818a("success", C36492ag.this.f95746b.getUid(), "others_homepage");
                    if (TextUtils.equals(C36492ag.this.f95719R.getmProfileFrom(), "chat")) {
                        C30560g.m99821b(C36492ag.this.f95746b.getUid());
                    }
                    if (C36492ag.this.f95719R.getmFollowStatus() != 0) {
                        C36492ag.this.mo91698a(0, C36492ag.this.f95746b.getFollowerStatus());
                    }
                }
            }
        };
        new C10741a(getContext()).mo25657b((int) R.string.pb).mo25658b((int) R.string.w_, (OnClickListener) r3).mo25650a((int) R.string.afn, (OnClickListener) r3).mo25656a().mo25637a();
        C30560g.m99818a("others_homepage", this.f95746b.getUid(), "");
    }

    /* renamed from: m */
    private void m117860m(int i) {
        if (!C6399b.m19944t() && i != 0) {
            if (this.f95719R.getFromRecommendCard() == 1 || TextUtils.equals(this.f95719R.getmPreviousPage(), "follow_card_push")) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("to_user_id", this.f95719R.getmUserId());
                    jSONObject.put("enter_from", "others_homepage");
                    jSONObject.put("previous_page", this.f95719R.getmPreviousPage());
                    jSONObject.put("impr_id", this.f95719R.getmEnterFromRequestId());
                    jSONObject.put("rec_user_type", C21718a.m72637a(this.f95746b));
                    C6907h.m21525a("follow_from_card", jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: t */
    private void m117864t(View view) {
        if (!(getActivity() == null || this.f95746b == null)) {
            Aweme aweme = this.f95719R.getmAweme();
            if (m117843a(aweme)) {
                C24976t.m82089aB(getContext(), aweme);
            }
            if (C25352e.m83360c(this.f95746b)) {
                String uri = Uri.parse(this.f95746b.getQuickShopInfo().getQuickShopUrl()).buildUpon().appendQueryParameter("enter_from", "user_profile").appendQueryParameter("author_id", this.f95746b.getUid()).build().toString();
                if (!C25371n.m83463a(getContext(), uri, true)) {
                    C25371n.m83459a(getContext(), uri, "");
                }
                return;
            }
            m117833G();
        }
    }

    /* renamed from: f */
    public final void mo91724f(int i) {
        int i2;
        if (this.f95718Q.isViewValid() && SharePrefCache.inst().isOpenForward()) {
            int dynamicPosi = getDynamicPosi();
            if (dynamicPosi >= 0) {
                ProfileTabView i3 = mo92661i(dynamicPosi);
                if (this.f95746b != null && (this.f95746b.isBlock || this.f95746b.isBlocked())) {
                    i = 0;
                }
                Locale locale = Locale.getDefault();
                String string = getContext().getString(R.string.b6f);
                Object[] objArr = new Object[1];
                if (i < 0) {
                    i2 = 0;
                } else {
                    i2 = i;
                }
                objArr[0] = Integer.valueOf(i2);
                String a = C1642a.m8035a(locale, string, objArr);
                if (mo92667k()) {
                    a = getContext().getString(R.string.b6g);
                }
                m117842a(i3, String.valueOf(i), a);
            }
        }
    }

    /* renamed from: g */
    public final void mo91727g(int i) {
        int i2;
        if (this.f95718Q.isViewValid()) {
            super.mo91727g(i);
            if (mo92668m() && !C6399b.m19944t() && getOriginMusicsionPosi() >= 0) {
                ProfileTabView i3 = mo92661i(getOriginMusicsionPosi());
                if (i3 != null && (!C6399b.m19944t() || C6384b.m19835a().mo15287a(CleanUpInvalidVideosExperiment.class, true, "clean_up_invalid_videos", C6384b.m19835a().mo15295d().clean_up_invalid_videos, 0) != 1)) {
                    String valueOf = String.valueOf(i);
                    Locale locale = Locale.getDefault();
                    String string = getContext().getString(R.string.d71);
                    Object[] objArr = new Object[1];
                    if (i < 0) {
                        i2 = 0;
                    } else {
                        i2 = i;
                    }
                    objArr[0] = Integer.valueOf(i2);
                    m117842a(i3, valueOf, C1642a.m8035a(locale, string, objArr));
                    i3.setDescription(String.valueOf(i));
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo92544j(View view) {
        boolean z;
        if (this.f95843bq == null) {
            this.f95843bq = new ArrayList<>(1);
        }
        this.f95843bq.add(new C36508a());
        IIMService g = C30553b.m99810g();
        Activity activity = getActivity();
        if (this.f95719R.getmFollowStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        g.wrapperSyncXAlert(activity, 2, z, new C36520as(this, view), (C7092b) this.f95843bq.get(this.f95843bq.size() - 1));
    }

    /* renamed from: l */
    public final boolean mo92708l(View view) {
        if (this.f95746b != null && this.f95746b.isBlock && this.f95719R.getmFollowStatus() == 0) {
            Context context = getContext();
            if (context != null) {
                new C10741a(context).mo25649a((int) R.string.fjb).mo25657b((int) R.string.fja).mo25650a((int) R.string.b7r, (OnClickListener) new C36513al(this, view)).mo25658b((int) R.string.w_, (OnClickListener) null).mo25656a().mo25637a();
                return true;
            }
        }
        return false;
    }

    public void setSimpleUserData(User user) {
        if (user != null) {
            mo92660h(user);
            int i = 8;
            if (C43122ff.m136787r(user)) {
                if (this.f95806aM != null) {
                    this.f95806aM.setVisibility(8);
                }
            } else if (!ProfileRecommendUserWhenEmpty.isRecommendUserMode(user) && C35992k.m115951a() && this.f95806aM != null) {
                if (C7213d.m22500a().mo18808h() && C21115b.m71197a().isLogin()) {
                    i = 0;
                }
                if (this.f95806aM.getVisibility() != i) {
                    this.f95806aM.setVisibility(i);
                }
            }
        }
    }

    /* renamed from: a */
    private void m117841a(IIMService iIMService) {
        if (!C30553b.m99785a() || iIMService == null) {
            mo92544j((View) this.f95821au);
            return;
        }
        C30560g.m99816a(this.f95746b.getUid());
        C30560g.m99819a(this.f95719R.getmUserId(), this.f95719R.getmAwemeId(), this.f95719R.getmEventType(), this.f95719R.getmRequestId(), "click_message");
        Aweme aweme = this.f95719R.getmAweme();
        if (m117843a(aweme)) {
            C6711m mVar = new C6711m();
            mVar.mo16147a("log_extra", aweme.getAwemeRawAd().getLogExtra());
            mVar.mo16147a("creative_id", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
            iIMService.wrapperChatWithSyncXAlert(getActivity(), C30553b.m99780a(this.f95746b), 2, new IMAdLog(aweme.getAwemeRawAd().getLogExtra(), String.valueOf(aweme.getAwemeRawAd().getCreativeId())));
        } else {
            iIMService.wrapperChatWithSyncXAlert(getActivity(), C30553b.m99780a(this.f95746b), 2);
        }
        if (m117843a(aweme)) {
            C24976t.m82006L(getContext(), aweme);
        }
    }

    /* renamed from: m */
    private void m117861m(User user) {
        View findViewById = findViewById(R.id.bhf);
        if (findViewById != null) {
            if (ProfileRecommendUserWhenEmpty.isRecommendUserMode(user, this.f95816aW)) {
                findViewById.setVisibility(0);
                ImageView imageView = (ImageView) findViewById(R.id.axk);
                TextView textView = (TextView) findViewById(R.id.dkc);
                TextView textView2 = (TextView) findViewById(R.id.a7n);
                if (user.isBlock()) {
                    imageView.setImageResource(R.drawable.azc);
                    textView.setText(R.string.btr);
                    textView2.setText(R.string.tk);
                } else if (user.isBlocked()) {
                    imageView.setImageResource(R.drawable.azc);
                    textView.setText(R.string.btr);
                    textView2.setText(R.string.ty);
                } else if (mo92667k()) {
                    imageView.setImageResource(R.drawable.azd);
                    textView.setText(R.string.e7c);
                    textView2.setText(R.string.d4z);
                } else {
                    if (user.getAwemeCount() == 0) {
                        imageView.setImageResource(R.drawable.azc);
                        textView.setText(R.string.btr);
                        textView2.setText(R.string.flx);
                    }
                }
            } else {
                m117837K();
            }
        }
    }

    private void setDouYinBtnReport(int i) {
        if (this.f95718Q != null && this.f95833bg != null) {
            switch (i) {
                case 0:
                    C43122ff.m136760a((View) this.f95833bg, false);
                    this.f95833bg.clearAnimation();
                    this.f95806aM.setBackgroundResource(R.drawable.bg_followed);
                    if (!C6399b.m19944t()) {
                        this.f95833bg.setImageResource(R.drawable.alz);
                    } else {
                        this.f95833bg.setImageResource(R.drawable.am0);
                    }
                    this.f95833bg.setRotation(-180.0f);
                    this.f95833bg.animate().rotation(0.0f).start();
                    return;
                case 1:
                    this.f95833bg.clearAnimation();
                    this.f95806aM.setBackgroundResource(R.drawable.bg_followed);
                    this.f95833bg.setImageResource(R.drawable.abk);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setRepeatCount(-1);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setDuration(600);
                    this.f95833bg.startAnimation(rotateAnimation);
                    return;
                case 2:
                    C43122ff.m136760a((View) this.f95833bg, true);
                    this.f95833bg.clearAnimation();
                    if (!C6399b.m19944t()) {
                        this.f95806aM.setBackgroundResource(R.drawable.lv);
                    }
                    this.f95833bg.setImageResource(R.drawable.am1);
                    this.f95833bg.setRotation(-180.0f);
                    this.f95833bg.animate().rotation(0.0f).start();
                    break;
            }
        }
    }

    /* renamed from: f */
    public final void mo91725f(User user) {
        boolean z;
        if (this.f95718Q.isViewValid() && !mo92667k()) {
            super.mo91725f(user);
            if (this.f95802aI != null) {
                this.f95802aI.setVisibility(8);
            }
            if (this.f95708G.getVisibility() == 0 || this.f95710I.getVisibility() == 0 || this.f95709H.getVisibility() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (TextUtils.isEmpty(user.getRecommendReasonRelation()) || (!z && !C7213d.m22500a().mo18747aJ())) {
                C23487o.m77140a(this.f95799aF, 8);
                this.f95801aH.setVisibility(8);
                this.f95798aE.setVisibility(0);
                return;
            }
            if (z) {
                C23487o.m77140a(this.f95799aF, 8);
            } else {
                C23487o.m77140a(this.f95799aF, 0);
            }
            if (C7213d.m22500a().mo18746aI() == 1) {
                this.f95801aH.setVisibility(8);
                if (this.f95802aI != null) {
                    this.f95802aI.mo92819a(user);
                }
                this.f95798aE.setVisibility(8);
                return;
            }
            this.f95801aH.setText(Html.fromHtml(user.getRecommendReasonRelation()));
            this.f95801aH.setVisibility(0);
        }
    }

    /* renamed from: h */
    public final void mo91730h(int i) {
        if (mo92672r() && getToolPosi() >= 0) {
            ProfileTabView i2 = mo92661i(getToolPosi());
            String valueOf = String.valueOf(i);
            Locale locale = Locale.getDefault();
            String string = getContext().getString(R.string.d7v);
            Object[] objArr = new Object[1];
            if (i < 0) {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            m117842a(i2, valueOf, C1642a.m8035a(locale, string, objArr));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final /* synthetic */ void mo92715s(View view) {
        if (this.f95746b == null || C25352e.m83366d(this.f95746b)) {
            return;
        }
        if (this.f95746b.getDefaultAdCoverUrl() != null) {
            AdCoverTitle adCoverTitle = this.f95746b.getAdCoverTitle();
            if (adCoverTitle != null) {
                C24958f.m81905a().mo65266a("starpage_ad").mo65276b("click").mo65283e("top_bar").mo65286h("{}").mo65280c(this.f95746b.getAdOrderId()).mo65270a(getContext());
                C25371n.m83459a(view.getContext(), adCoverTitle.getWebUrl(), "");
            }
        } else if (!(this.f95718Q instanceof BaseDTProfileFragment) || !((BaseDTProfileFragment) this.f95718Q).mo91926j(this.f95746b)) {
            if (!C6307b.m19566a((Collection<T>) this.f95746b.getCoverUrls())) {
                C6907h.m21524a("click_profile_icon", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "click_cover").mo59973a("author_id", this.f95746b.getUid()).f60753a);
                ProfileCoverPreviewActivity.m117074a(getContext(), (UrlModel) this.f95746b.getCoverUrls().get(0), false);
            }
        } else {
            C6907h.m21524a("click_profile_icon", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "click_cover").mo59973a("author_id", this.f95746b.getUid()).f60753a);
        }
    }

    public void setVisible(boolean z) {
        String str;
        super.setVisible(z);
        this.f95836bj = z;
        this.f95837bk = this.f95836bj;
        boolean z2 = true;
        if (this.f95794aA != null && this.f95794aA.getVisibility() == 0 && z) {
            if (C25352e.m83360c(this.f95746b)) {
                C24976t.m82083a("weblink", this.f95746b.getUid());
                m117838a((int) R.id.c2y, (Object) Integer.valueOf(1));
            } else {
                C24473g b = new C24473g().mo63580b(this.f95719R.getmUserId());
                if (C43122ff.m136787r(this.f95746b)) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                b.mo63579a(str).mo63581c("normal").mo63537a();
                this.f95794aA.setTag(R.id.c2y, Integer.valueOf(1));
            }
        }
        if (z && bE_() && C36530bb.m117955b() && this.f95822av.getVisibility() == 0) {
            C30560g.m99815a(getContext());
        }
        if (this.f95746b != null) {
            if (!this.f95746b.isLive() || !z) {
                z2 = false;
            }
            mo91710b(z2, C43122ff.m136791v(this.f95746b), false);
            m117859l(this.f95746b);
        }
        if (z) {
            mo92643g();
        }
    }

    /* renamed from: a */
    private static boolean m117843a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    /* renamed from: b */
    public final void mo92535b(View view) {
        super.mo92535b(view);
        this.f95794aA.setOnClickListener(new C36519ar(this));
        this.f95824ax.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C36492ag.this.mo92708l(view)) {
                    C36492ag.this.mo92707k(view);
                }
            }
        });
        this.f95822av.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C36492ag.this.mo92709m(view);
            }
        });
        this.f95821au.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C36492ag.this.mo92710n(view);
            }
        });
        this.f95800aG.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C36492ag.this.mo92711o(view);
            }
        });
        this.f95833bg.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C36492ag.this.mo92712p(view);
            }
        });
    }

    /* renamed from: d */
    public final void mo91716d(int i) {
        String str;
        int i2;
        int i3;
        if (this.f95718Q.isViewValid() && getFavoritePosi() >= 0) {
            if (this.f95746b != null && (this.f95746b.isBlock || this.f95746b.isBlocked())) {
                i = 0;
            }
            ProfileTabView i4 = mo92661i(getFavoritePosi());
            if (mo92667k()) {
                str = getContext().getString(R.string.bz_);
            } else {
                if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(CleanUpInvalidVideosExperiment.class, true, "clean_up_invalid_videos", C6384b.m19835a().mo15295d().clean_up_invalid_videos, 0) != 1) {
                    if (C6399b.m19944t()) {
                        Locale locale = Locale.getDefault();
                        String string = getContext().getString(R.string.ack);
                        Object[] objArr = new Object[1];
                        if (i < 0) {
                            i3 = 0;
                        } else {
                            i3 = i;
                        }
                        objArr[0] = Integer.valueOf(i3);
                        str = C1642a.m8035a(locale, string, objArr);
                    } else {
                        Locale locale2 = Locale.getDefault();
                        String string2 = getContext().getString(R.string.bz6);
                        Object[] objArr2 = new Object[1];
                        if (i < 0) {
                            i2 = 0;
                        } else {
                            i2 = i;
                        }
                        objArr2[0] = Integer.valueOf(i2);
                        str = C1642a.m8035a(locale2, string2, objArr2);
                    }
                }
            }
            m117842a(i4, String.valueOf(i), str);
        }
    }

    /* renamed from: o */
    public final void mo92711o(View view) {
        C25712a aVar;
        if (TextUtils.isEmpty(this.f95719R.getmRequestedText())) {
            aVar = new C25712a(getActivity());
            aVar.mo66614a((CharSequence[]) new String[]{getResources().getString(R.string.wj), getResources().getString(R.string.w_)}, (OnClickListener) new C36514am(this));
        } else {
            aVar = new C25712a(getActivity());
            ArrayList arrayList = new ArrayList();
            this.f95719R.setmRequestedText(getContext().getString(R.string.fjh));
            arrayList.add(this.f95719R.getmRequestedText());
            arrayList.add(getContext().getString(R.string.w_));
            final String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            aVar.mo66614a((CharSequence[]) strArr, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (TextUtils.equals(strArr[i], C36492ag.this.f95719R.getmRequestedText())) {
                        C36492ag.this.mo92544j((View) C36492ag.this.f95800aG);
                    }
                    dialogInterface.dismiss();
                }
            });
        }
        try {
            aVar.mo66615b();
        } catch (NotFoundException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFollowSuccess(com.p280ss.android.ugc.aweme.profile.model.FollowStatus r13) {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.f95746b
            r1 = 0
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136769b(r0, r1)
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r13.followStatus
            if (r0 != r2) goto L_0x000f
            return
        L_0x000f:
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.f95746b
            if (r0 != 0) goto L_0x0026
            com.ss.android.ugc.aweme.profile.model.User r0 = new com.ss.android.ugc.aweme.profile.model.User
            r0.<init>()
            com.ss.android.ugc.aweme.profile.ui.header.UserHeaderData r3 = r12.f95719R
            java.lang.String r3 = r3.getmUserId()
            r0.setUid(r3)
            int r3 = r13.followStatus
            r0.setFollowStatus(r3)
        L_0x0026:
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r3 != 0) goto L_0x010e
            java.lang.String r3 = r0.getEnterpriseVerifyReason()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x010e
            int r3 = r13.followStatus
            if (r3 != 0) goto L_0x004d
            com.bytedance.ies.dmt.ui.bubbleview.a r3 = r12.f95831be
            if (r3 == 0) goto L_0x010e
            com.bytedance.ies.dmt.ui.bubbleview.a r3 = r12.f95831be
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L_0x010e
            com.bytedance.ies.dmt.ui.bubbleview.a r3 = r12.f95831be
            r3.dismiss()
            goto L_0x010e
        L_0x004d:
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bl r3 = r3.getHasShowRemarkNamePopup()
            java.lang.Object r3 = r3.mo59877d()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x00ca
            com.bytedance.ies.dmt.ui.bubbleview.a r3 = r12.f95831be
            if (r3 != 0) goto L_0x0089
            com.bytedance.ies.dmt.ui.bubbleview.a$a r3 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
            android.app.Activity r4 = r12.getActivity()
            r3.<init>(r4)
            r4 = 2131824673(0x7f111021, float:1.928218E38)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r3 = r3.mo25738b(r4)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r3 = r3.mo25739b(r1)
            r4 = 5000(0x1388, double:2.4703E-320)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r3 = r3.mo25731a(r4)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r3 = r3.mo25736a(r1)
            com.bytedance.ies.dmt.ui.bubbleview.a r3 = r3.mo25737a()
            r12.f95831be = r3
        L_0x0089:
            com.bytedance.ies.dmt.ui.bubbleview.a r3 = r12.f95831be
            boolean r3 = r3.isShowing()
            if (r3 != 0) goto L_0x010e
            com.bytedance.ies.dmt.ui.bubbleview.a r3 = r12.f95831be
            r3.mo25716a()
            com.bytedance.ies.dmt.ui.bubbleview.a r4 = r12.f95831be
            android.widget.TextView r5 = r12.f95824ax
            r6 = 80
            android.content.Context r3 = r12.getContext()
            int r3 = com.p280ss.android.ugc.aweme.base.utils.C23482j.m77098b(r3)
            com.bytedance.ies.dmt.ui.bubbleview.a r7 = r12.f95831be
            int r7 = r7.mo25724d()
            int r7 = r3 - r7
            r8 = 4634626229029306368(0x4051800000000000, double:70.0)
            int r8 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r8)
            r9 = 1137049600(0x43c60000, float:396.0)
            r4.mo25718a(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bl r3 = r3.getHasShowRemarkNamePopup()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r3.mo59871a(r4)
            goto L_0x010e
        L_0x00ca:
            android.content.Context r3 = r12.getContext()
            com.ss.android.ugc.aweme.profile.model.User r4 = r12.f95746b
            boolean r3 = com.p280ss.android.ugc.aweme.profile.util.C36748p.m118458a(r3, r4, r13)
            if (r3 == 0) goto L_0x00fd
            boolean r3 = r12.f95814aU
            com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog r4 = new com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog
            android.content.Context r5 = r12.getContext()
            r4.<init>(r5)
            r4.f96236f = r0
            java.lang.String r5 = r13.contactName
            r4.f96237g = r5
            r4.f96238h = r2
            com.ss.android.ugc.aweme.profile.ui.header.an r5 = new com.ss.android.ugc.aweme.profile.ui.header.an
            r5.<init>(r12)
            r4.f96235e = r5
            com.ss.android.ugc.aweme.profile.ui.header.ao r5 = new com.ss.android.ugc.aweme.profile.ui.header.ao
            r5.<init>(r12, r13, r3)
            r4.setOnDismissListener(r5)
            r4.show()
            r3 = 1
            goto L_0x010f
        L_0x00fd:
            com.ss.android.ugc.aweme.profile.u r6 = com.p280ss.android.ugc.aweme.profile.C36102u.f94392a
            android.content.Context r7 = r12.getContext()
            java.lang.String r8 = "others_homepage"
            java.lang.String r9 = "follow"
            com.ss.android.ugc.aweme.profile.model.User r10 = r12.f95746b
            int r11 = r13.followStatus
            r6.showRemindUserCompleteProfileDialogAfterFollow(r7, r8, r9, r10, r11)
        L_0x010e:
            r3 = 0
        L_0x010f:
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = com.p280ss.android.ugc.aweme.p313im.C30553b.m99780a(r0)
            int r5 = r13.followStatus
            r4.setFollowStatus(r5)
            com.ss.android.ugc.aweme.im.service.IIMService r5 = com.p280ss.android.ugc.aweme.p313im.C30553b.m99810g()
            r5.updateIMUser(r4)
            int r4 = r13.followStatus
            if (r4 == 0) goto L_0x0129
            com.ss.android.ugc.aweme.discover.hitrank.g r4 = com.p280ss.android.ugc.aweme.discover.hitrank.C26682g.f70355a
            r5 = 5
            r4.mo68415a(r0, r5)
        L_0x0129:
            int r4 = r13.followStatus
            int r0 = r0.getFollowerStatus()
            r12.mo91698a(r4, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r4 = "code"
            r0.put(r4, r2)     // Catch:{ JSONException -> 0x014e }
            java.lang.String r2 = "user_id"
            com.ss.android.ugc.aweme.profile.ui.header.UserHeaderData r4 = r12.f95719R     // Catch:{ JSONException -> 0x014e }
            java.lang.String r4 = r4.getmUserId()     // Catch:{ JSONException -> 0x014e }
            r0.put(r2, r4)     // Catch:{ JSONException -> 0x014e }
            java.lang.String r2 = "follow_status"
            int r4 = r13.followStatus     // Catch:{ JSONException -> 0x014e }
            r0.put(r2, r4)     // Catch:{ JSONException -> 0x014e }
        L_0x014e:
            com.ss.android.ugc.aweme.web.jsbridge.q r2 = new com.ss.android.ugc.aweme.web.jsbridge.q
            java.lang.String r4 = "userFollowStatusChange"
            r2.<init>(r4, r0)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.f95746b
            boolean r0 = com.p280ss.android.ugc.aweme.profile.experiment.ProfileRecommendUserWhenEmpty.isRecommendUserMode(r0)
            if (r0 != 0) goto L_0x0167
            int r0 = r13.followStatus
            boolean r2 = r12.f95814aU
            r12.m117839a(r0, r2, r3)
        L_0x0167:
            r12.f95814aU = r1
            int r13 = r13.followStatus
            if (r13 != 0) goto L_0x0197
            com.ss.android.ugc.aweme.profile.model.User r13 = r12.f95746b
            java.lang.String r13 = r13.getRemarkName()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x0197
            com.ss.android.ugc.aweme.profile.model.User r13 = r12.f95746b
            java.lang.String r0 = ""
            r13.setRemarkName(r0)
            com.ss.android.ugc.aweme.profile.model.User r13 = r12.f95746b
            java.lang.String r13 = r13.getNickname()
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.f95746b
            int r0 = r0.getStarBillboardRank()
            com.ss.android.ugc.aweme.profile.model.User r1 = r12.f95746b
            com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo r1 = r1.getBrandInfo()
            com.ss.android.ugc.aweme.profile.model.User r2 = r12.f95746b
            r12.mo91703a(r13, r0, r1, r2)
        L_0x0197:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36492ag.onFollowSuccess(com.ss.android.ugc.aweme.profile.model.FollowStatus):void");
    }

    /* renamed from: c */
    public final void mo91711c(int i) {
        String str;
        int i2;
        int i3;
        if (this.f95718Q.isViewValid() && getPublishPosi() >= 0) {
            if (this.f95746b != null && (this.f95746b.isBlock || this.f95746b.isBlocked())) {
                i = 0;
            }
            ProfileTabView i4 = mo92661i(getPublishPosi());
            if (mo92667k()) {
                str = getContext().getString(R.string.fsv);
            } else {
                if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(CleanUpInvalidVideosExperiment.class, true, "clean_up_invalid_videos", C6384b.m19835a().mo15295d().clean_up_invalid_videos, 0) != 1) {
                    if (C6399b.m19944t()) {
                        Locale locale = Locale.getDefault();
                        String string = getContext().getString(R.string.cgi);
                        Object[] objArr = new Object[1];
                        if (i < 0) {
                            i3 = 0;
                        } else {
                            i3 = i;
                        }
                        objArr[0] = Integer.valueOf(i3);
                        str = C1642a.m8035a(locale, string, objArr);
                    } else {
                        Locale locale2 = Locale.getDefault();
                        String string2 = getContext().getString(R.string.fsu);
                        Object[] objArr2 = new Object[1];
                        if (i < 0) {
                            i2 = 0;
                        } else {
                            i2 = i;
                        }
                        objArr2[0] = Integer.valueOf(i2);
                        str = C1642a.m8035a(locale2, string2, objArr2);
                    }
                }
            }
            m117842a(i4, String.valueOf(i), str);
        }
    }

    /* renamed from: b */
    public final void mo91709b(boolean z) {
        int i;
        if (this.f95718Q.isViewValid()) {
            ImageView imageView = this.f95833bg;
            if (!z || ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b)) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: b */
    private void m117845b(int i, int i2) {
        if (!m117850c(i, i2)) {
            this.f95832bf.mo93066a(i, i2);
            m117835I();
        }
    }

    /* renamed from: a */
    private void m117838a(int i, Object obj) {
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).setTag(R.id.c2y, obj);
        }
    }

    /* renamed from: b */
    private void m117848b(final boolean z, final boolean z2) {
        final User user = this.f95746b;
        C32518c.m105318a().mo83745a(getClass(), user, new C7326g<Map<Long, Long>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Map<Long, Long> map) throws Exception {
                long j;
                if (C36492ag.this.f95746b != null) {
                    Long l = (Long) map.get(Long.valueOf(user.getUid()));
                    User user = user;
                    if (l == null) {
                        j = 0;
                    } else {
                        j = l.longValue();
                    }
                    user.roomId = j;
                    if (TextUtils.equals(user.getUid(), C36492ag.this.f95746b.getUid())) {
                        C36492ag.this.f95746b.roomId = user.roomId;
                        if (!user.isLive()) {
                            C36492ag.this.mo92699a(z, z2);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: d */
    private void m117852d(boolean z, boolean z2) {
        String str;
        String str2;
        String str3 = "others_homepage_triangle_button";
        C22984d a = C22984d.m75611a().mo59973a("action_type", "switch");
        String str4 = "to_status";
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C22984d a2 = a.mo59973a(str4, str);
        String str5 = "switch_method";
        if (z2) {
            str2 = "manual";
        } else {
            str2 = "auto";
        }
        C6907h.m21524a(str3, (Map) a2.mo59973a(str5, str2).mo59973a("author_id", this.f95719R.getmUserId()).f60753a);
    }

    /* renamed from: c */
    private boolean m117850c(int i, int i2) {
        TextView textView;
        if (this.f95832bf == null) {
            Context context = getContext();
            TextView textView2 = (TextView) this.f95705D;
            if (ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b) || !C35992k.m115951a()) {
                textView = this.f95828bb;
            } else {
                textView = null;
            }
            C36744o oVar = new C36744o(context, textView2, textView, this.f95822av, this.f95820at, this.f95821au, this.f95800aG, this.f95839bm, bE_(), bF_(), this.f95806aM, ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b));
            this.f95832bf = oVar;
        }
        this.f95719R.setmFollowStatus(i);
        this.f95719R.setmFollowerStatus(i2);
        if (!TextUtils.equals(this.f95719R.getmUserId(), C21115b.m71197a().getCurUserId())) {
            return false;
        }
        C23487o.m77140a(this.f95705D, 8);
        C23487o.m77140a((View) this.f95828bb, 8);
        C23487o.m77140a(this.f95822av, 8);
        C23487o.m77140a((View) this.f95820at, 8);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo92692a(View view, boolean z) {
        boolean z2;
        String str;
        if (this.f95746b != null && this.f95719R != null && getActivity() != null) {
            if (!C36525ax.m117949a(getActivity())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            } else if (!C21115b.m71197a().isLogin()) {
                String string = getContext().getString(R.string.b7t);
                if (getSourceAweme() != null) {
                    str = getSourceAweme().getAid();
                } else {
                    str = "";
                }
                C32656f.m105744a(getActivity(), this.f95719R.getmEventType(), "click_follow", C42914ab.m136242a().mo104633a("login_title", string).mo104633a("group_id", str).mo104633a("log_pb", C33230ac.m107234j(str)).f111445a, (C23305g) new C36521at(this, view, z));
            } else {
                if (C6399b.m19944t()) {
                    z2 = m117853d(view, z);
                } else {
                    z2 = m117851c(view, z);
                }
                if (z2) {
                    m117854e(view, z);
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m117851c(View view, boolean z) {
        int i;
        if (this.f95719R.getmFollowStatus() != 0) {
            return true;
        }
        if (this.f95746b.getGeneralPermission() != null) {
            i = this.f95746b.getGeneralPermission().getFollowToast();
        } else {
            i = 0;
        }
        if (i == 1) {
            C10761a.m31409e((Context) getActivity(), (int) R.string.ct6).mo25750a();
            return false;
        } else if (i != 2) {
            return true;
        } else {
            new C10741a(getActivity()).mo25649a((int) R.string.csz).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.afn, (OnClickListener) new C36522au(this, view, z)).mo25656a().mo25638b();
            return false;
        }
    }

    /* renamed from: d */
    private boolean m117853d(View view, boolean z) {
        int i;
        int i2;
        if (this.f95719R.getmFollowStatus() != 0) {
            return true;
        }
        if (this.f95746b.getGeneralPermission() != null) {
            i = this.f95746b.getGeneralPermission().getFollowToastType();
        } else {
            i = 0;
        }
        if (i == 1) {
            new C10741a(view.getContext()).mo25649a((int) R.string.h2).mo25657b((int) R.string.h3).mo25650a((int) R.string.ap5, C36523av.f95898a).mo25656a().mo25638b();
            C6907h.m21524a("show_punish_pop", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("show_type", C36694aa.m118348b(this.f95746b)).f60753a);
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
            }).mo25650a((int) R.string.b7r, (OnClickListener) new C36524aw(this, view, z)).mo25656a().mo25638b();
            return false;
        } else if (i == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    private void m117849c(boolean z, boolean z2) {
        float f;
        boolean z3 = z;
        boolean z4 = z2;
        if (!ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f95746b) && !C43122ff.m136783n(this.f95746b) && this.f95838bl != z3) {
            if (z3) {
                if (this.f95817aX == null) {
                    this.f95817aX = new ArrayList();
                } else {
                    this.f95817aX.clear();
                }
                setOpenRecommendCardButtonState(1);
                if (this.f95807aN == null) {
                    this.f95807aN = new C36004ad(new RecommendCommonUserModel(), this);
                } else {
                    this.f95807aN.mo91626a();
                    RecommendList d = this.f95807aN.mo91636d();
                    if (d != null && !C6307b.m19566a((Collection<T>) d.getUserList())) {
                        if (!C6399b.m19947w() || !this.f95846bt || d.getUserList().size() >= 3) {
                            if (C6399b.m19944t()) {
                                C36767x.m118508a(getUserId());
                            }
                            if (z3) {
                                f = 0.0f;
                            } else {
                                f = 1.0f;
                            }
                            this.f95708G.setAlpha(f);
                            this.f95797aD.setPageType(0);
                            this.f95797aD.mo92911a(d.getUserList(), d.getRid());
                            this.f95798aE.setVisibility(0);
                            if (C6399b.m19944t()) {
                                C36712af.m118373b(true, this.f95797aD, this.f95704C, this.f95712K, this.f95826az, this.f95761q, this.f95798aE, this.f95715N);
                            } else {
                                C36712af.m118372a(true, this.f95797aD, (View) this.f95704C, this.f95712K, this.f95826az, this.f95761q, this.f95798aE, (View) this.f95715N);
                            }
                            m117852d(true, z4);
                            this.f95825ay.setVisibility(8);
                            this.f95819aZ = 0.0f;
                            this.f95827ba = 0.0f;
                            this.f95838bl = true;
                            setOpenRecommendCardButtonState(2);
                            if (this.f95842bp != null) {
                                this.f95842bp.mo92364a(z3);
                            }
                            return;
                        }
                        setOpenRecommendCardButtonState(0);
                        return;
                    }
                }
                this.f95807aN.f94194d = z4;
                this.f95807aN.mo91632a(30, this.f95719R.getmUserId(), 1, C43161e.m136882a(), (String) null, C43161e.m136884b(), this.f95719R.getSecUserId());
            } else {
                if (this.f95807aN != null) {
                    this.f95807aN.mo91634a(this.f95797aD.getData());
                }
                if (this.f95802aI == null || this.f95802aI.getVisibility() != 0) {
                    this.f95798aE.setVisibility(0);
                } else {
                    this.f95798aE.setVisibility(8);
                }
                if (C6399b.m19944t()) {
                    C36712af.m118373b(false, this.f95797aD, this.f95704C, this.f95712K, this.f95826az, this.f95761q, this.f95798aE, this.f95715N);
                } else {
                    C36712af.m118372a(false, this.f95797aD, (View) this.f95704C, this.f95712K, this.f95826az, this.f95761q, this.f95798aE, (View) this.f95715N);
                }
                m117852d(false, z4);
                if (this.f95844br && C41983b.m133444a()) {
                    this.f95825ay.setVisibility(0);
                }
                this.f95819aZ = 0.0f;
                this.f95827ba = 0.0f;
                this.f95838bl = false;
                setOpenRecommendCardButtonState(0);
            }
            if (this.f95842bp != null) {
                this.f95842bp.mo92364a(z3);
            }
        }
    }

    /* renamed from: a */
    private boolean m117844a(boolean z, View view) {
        String str;
        if (!z) {
            Activity e = C23487o.m77158e(view);
            if (e instanceof FragmentActivity) {
                StatusStoreViewModel statusStoreViewModel = (StatusStoreViewModel) C0069x.m159a((FragmentActivity) e).mo147a(StatusStoreViewModel.class);
                String str2 = (String) statusStoreViewModel.mo96200a("extra_from_event_type", "");
                String str3 = (String) statusStoreViewModel.mo96200a("extra_from_event_enter_from", "");
                String str4 = (String) statusStoreViewModel.mo96200a("extra_from_pre_page", "");
                String str5 = (String) statusStoreViewModel.mo96200a("extra_from_pre_relation_from", "");
                if (TextUtils.equals("face_to_face", str4)) {
                    String str6 = "follow";
                    C22984d a = C22984d.m75611a().mo59973a("event_type", str2).mo59973a("enter_from", str3).mo59973a("previous_page", str4).mo59973a("relation_from", str5);
                    String str7 = "to_user_id";
                    if (this.f95746b != null) {
                        str = this.f95746b.getUid();
                    } else {
                        str = "";
                    }
                    C6907h.m21524a(str6, (Map) a.mo59973a(str7, str).f60753a);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m117854e(View view, boolean z) {
        boolean z2;
        int i;
        String str;
        String str2;
        String str3;
        boolean z3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (getActivity() != null) {
            if (!C36525ax.m117949a(getActivity())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            } else if (!z || this.f95719R.getmFollowStatus() != 2 || getContext() == null) {
                String str8 = this.f95719R.getmFromSearch();
                if (!TextUtils.isEmpty(str8)) {
                    this.f95719R.setmEventType(str8);
                    this.f95719R.setmPreviousPage(str8);
                }
                if (this.f95719R.getmFollowStatus() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = !z2;
                int i2 = this.f95719R.getmFollowerStatus();
                if (z2) {
                    i = 0;
                } else if (mo92667k()) {
                    i = 4;
                    m117840a(getActivity());
                } else {
                    i = 1;
                }
                String str9 = this.f95719R.getmUserId();
                C42961az.m136380a(new C23661d(i, this.f95746b, 1));
                if (C21115b.m71197a().isLogin()) {
                    if (!TextUtils.isEmpty(this.f95719R.getmProfileFrom())) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("previous_page", this.f95719R.getmEventType());
                            jSONObject.put("request_id", this.f95719R.getmRequestId());
                            if (!TextUtils.isEmpty(this.f95719R.getmPoiId())) {
                                jSONObject.put("poi_id", this.f95719R.getmPoiId());
                            }
                            if (!TextUtils.isEmpty(this.f95719R.getmMethodFrom())) {
                                jSONObject.put("previous_page", this.f95719R.getmMethodFrom());
                            }
                            jSONObject.put("enter_type", "normal_way");
                            jSONObject.put("impr_type", C33230ac.m107245t(this.f95719R.getmAweme()));
                            if (!z2 && !TextUtils.isEmpty(this.f95719R.getmEnterFromRequestId())) {
                                jSONObject.put("enter_from_request", this.f95719R.getmEnterFromRequestId());
                            }
                            jSONObject.put("group_id", this.f95719R.getmAwemeId());
                            jSONObject.put("scene_id", this.f95719R.getSceneId());
                        } catch (JSONException unused) {
                        }
                        if (TextUtils.isEmpty(this.f95719R.getmLiveRoomId()) || z2) {
                            Aweme aweme = this.f95719R.getmAweme();
                            if (aweme == null && this.f95733ah != null && TextUtils.equals(this.f95733ah.getAuthorUid(), C43122ff.m136788s(this.f95746b))) {
                                aweme = this.f95733ah;
                            }
                            if (m117843a(aweme)) {
                                if (z2) {
                                    C24976t.m82004J(getContext(), aweme);
                                } else if (!C25352e.m83225h(aweme)) {
                                    C24976t.m82003I(getContext(), aweme);
                                }
                            }
                            if (!z2 && C25352e.m83227j(aweme)) {
                                C24976t.m82116ac(getContext(), aweme);
                            }
                            MobClick obtain = MobClick.obtain();
                            if (z2) {
                                str2 = "follow_cancel";
                            } else {
                                str2 = "follow";
                            }
                            C6907h.onEvent(obtain.setEventName(str2).setLabelName("others_homepage").setValue(str9).setExtValueString(this.f95719R.getmAwemeId()).setJsonObject(jSONObject));
                            if (!m117844a(z2, view)) {
                                if (!TextUtils.equals("search_for_you_list", this.f95719R.getmPreviousPage())) {
                                    if (z2) {
                                        str5 = "follow_cancel";
                                    } else {
                                        str5 = "follow";
                                    }
                                    C33280v e = new C33280v(str5).mo85359v(C33230ac.m107245t(this.f95719R.getmAweme())).mo85346f(this.f95719R.getmAweme()).mo85341b("others_homepage").mo85347f(this.f95719R.getmPreviousPagePosition()).mo85345e(this.f95719R.getmPreviousPage());
                                    if (this.f95814aU) {
                                        str6 = "top_bar_follow_button";
                                    } else {
                                        str6 = "follow_button";
                                    }
                                    C33280v a = e.mo85343c(str6).mo85348g(str9).mo85351k(this.f95719R.getmAwemeId()).mo85354q("normal_way").mo85352o(getRequestId()).mo85353p(this.f95719R.getmEnterFromRequestId()).mo85340a(this.f95719R.getSceneId());
                                    if (aweme != null && aweme.isFamiliar() && !C43122ff.m136762a(aweme)) {
                                        a.mo85349i("item");
                                    }
                                    if (this.f95719R.getFromRecommendCard() == 1) {
                                        a.mo85350j(C21718a.m72637a(this.f95746b));
                                    }
                                    a.mo85252e();
                                } else if (!z2) {
                                    new C33280v("follow").mo85359v(C33230ac.m107245t(this.f95719R.getmAweme())).mo85346f(this.f95719R.getmAweme()).mo85340a("1034").mo85341b("others_homepage").mo85345e("search_for_you_list").mo85348g(str9).mo85252e();
                                } else {
                                    new C33280v("follow_cancel").mo85359v(C33230ac.m107245t(this.f95719R.getmAweme())).mo85346f(this.f95719R.getmAweme()).mo85340a("1002").mo85341b("others_homepage").mo85345e("search_for_you_list").mo85348g(str9).mo85252e();
                                }
                            }
                            if (TextUtils.equals(this.f95719R.getmPreviousPage(), "search_result") || TextUtils.equals(this.f95719R.getmPreviousPage(), "general_search") || TextUtils.equals(this.f95719R.getmPreviousPage(), "search_for_you_list")) {
                                C26807z zVar = C26807z.f70733a;
                                if (z2) {
                                    str3 = "search_follow_cancel";
                                } else {
                                    str3 = "search_follow";
                                }
                                String str10 = str3;
                                String str11 = "others_homepage";
                                if (TextUtils.equals(this.f95719R.getmPreviousPage(), "search_result") || TextUtils.equals(this.f95719R.getmPreviousPage(), "search_for_you_list")) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (this.f95814aU) {
                                    str4 = "top_bar_follow_button";
                                } else {
                                    str4 = "follow_button";
                                }
                                zVar.mo68584a(str10, str9, str11, z3, str4);
                            }
                        } else {
                            C41989d.m133486a(this.f95719R.getmLiveRoomOwnerId(), this.f95719R.getmLiveRoomId(), this.f95719R.getmLiveRequestId(), str9, this.f95719R.getmLiveType(), this.f95719R.getmEnterFrom());
                            C41989d.m133485a("others_homepage", "live", this.f95719R.getmLiveRoomOwnerId(), this.f95719R.getmLiveRoomId(), Boolean.valueOf(TextUtils.equals(C21115b.m71197a().getCurUserId(), this.f95719R.getmLiveRoomOwnerId())), str9, this.f95719R.getmRequestId());
                            if (C6399b.m19946v()) {
                                C33280v g = new C33280v().mo85341b("others_homepage").mo85348g(this.f95719R.getmLiveRoomOwnerId());
                                if (!TextUtils.isEmpty(this.f95719R.getmEnterFromRequestId())) {
                                    str7 = this.f95719R.getmEnterFromRequestId();
                                } else if (this.f95746b != null) {
                                    str7 = this.f95746b.getRequestId();
                                } else {
                                    str7 = "";
                                }
                                g.mo85352o(str7).mo85347f(this.f95719R.getmPreviousPagePosition()).mo85345e(this.f95719R.getmPreviousPage()).mo85343c("follow_button").mo85353p(this.f95719R.getmEnterFromRequestId()).mo85345e("live_aud").mo85252e();
                            }
                        }
                    }
                    m117845b(i, i2);
                    m117860m((int) z4);
                    m117862n((int) z4);
                    if (this.f95804aK != null) {
                        Aweme aweme2 = this.f95719R.getmAweme();
                        if (aweme2 == null && this.f95733ah != null && TextUtils.equals(this.f95733ah.getAuthorUid(), C43122ff.m136788s(this.f95746b))) {
                            aweme2 = this.f95733ah;
                        }
                        this.f95804aK.mo91679a(new C36034a().mo91684a(this.f95719R.getmUserId()).mo91686b("").mo91682a((int) z4).mo91688c("others_homepage").mo91683a(aweme2).mo91691e("homepage").mo91685b(19).mo91687c(C42976bj.m136440a(this.f95719R)).mo91689d(this.f95719R.getmFollowerStatus()).mo91681a());
                    }
                } else {
                    C6907h.m21518a((Context) getActivity(), "follow", "personal_homepage", str9, 0);
                    m117860m(z4 ? 1 : 0);
                    m117834H();
                    String string = getContext().getString(R.string.b7t);
                    if (getSourceAweme() != null) {
                        str = getSourceAweme().getAid();
                    } else {
                        str = "";
                    }
                    C32656f.m105744a(getActivity(), this.f95719R.getmEventType(), "click_follow", C42914ab.m136242a().mo104633a("login_title", string).mo104633a("group_id", str).mo104633a("log_pb", C33230ac.m107234j(str)).f111445a, (C23305g) new C36512ak(this, i, i2, z4));
                }
            } else {
                Dialog b = new C10741a(getContext()).mo25649a((int) R.string.fiu).mo25658b((int) R.string.pp, (OnClickListener) null).mo25650a((int) R.string.fll, (OnClickListener) new C36511aj(this, view)).mo25656a().mo25638b();
                if (b.findViewById(R.id.e0u) instanceof TextView) {
                    ((TextView) b.findViewById(R.id.e0u)).setTextColor(getResources().getColor(R.color.lk));
                }
                if (b.findViewById(R.id.dsf) != null) {
                    b.findViewById(R.id.dsf).setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92691a(View view, DialogInterface dialogInterface, int i) {
        mo92707k(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92701b(View view, DialogInterface dialogInterface, int i) {
        m117854e(view, false);
    }

    /* renamed from: a */
    private void m117842a(ProfileTabView profileTabView, String str, String str2) {
        if (profileTabView != null && getTabCount() < 4) {
            profileTabView.setText(str2);
        }
    }

    /* renamed from: a */
    private void m117839a(int i, boolean z, boolean z2) {
        if (C35992k.m115951a() && i != 0 && !z && !z2) {
            if (!C6399b.m19947w() || !C43122ff.m136769b(this.f95746b, false)) {
                this.f95846bt = true;
                mo92698a(true);
            } else {
                return;
            }
        }
        if (C35992k.m115951a() && i == 0 && C6399b.m19947w() && !C43122ff.m136769b(this.f95746b, false)) {
            mo92698a(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92702b(View view, boolean z, DialogInterface dialogInterface, int i) {
        m117854e(view, z);
    }

    /* renamed from: a */
    public final JSONObject mo92688a(String str, String str2, int i, String str3, User user) {
        return C6869c.m21381a().mo16887a("rec_uid", str).mo16887a("profile_uid", this.f95719R.getmUserId()).mo16887a("event_type", str2).mo16887a("enter_from", "others_homepage").mo16885a("impr_order", Integer.valueOf(i)).mo16887a("req_id", getRid()).mo16885a("is_direct", Integer.valueOf(this.f95846bt ? 1 : 0)).mo16887a("rec_reason", str3).mo16887a("rec_user_type", C21718a.m72637a(user)).mo16888b();
    }

    public C36492ag(Context context, BaseProfileFragment baseProfileFragment, UserHeaderData userHeaderData, C6309f fVar, C36527az azVar, ProfileViewModel profileViewModel) {
        super(context, baseProfileFragment, userHeaderData, profileViewModel);
        this.f95808aO = fVar;
        this.f95814aU = false;
        this.f95842bp = azVar;
    }
}
