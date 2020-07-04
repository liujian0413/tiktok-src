package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0683b;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.p280ss.android.ugc.aweme.C21657aq;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarBorderView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.C24621e;
import com.p280ss.android.ugc.aweme.commercialize.model.C24995f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.p1052b.C23147b;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.profile.C35671aa;
import com.p280ss.android.ugc.aweme.profile.C36104w;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p280ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.HotListStruct;
import com.p280ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BindAccountView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BindAccountView.C36132a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36345an;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36436dw;
import com.p280ss.android.ugc.aweme.profile.p1487ui.NewYearWishLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileTabView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.TempBaseProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.ProfileStarRankView;
import com.p280ss.android.ugc.aweme.profile.presenter.C36041o;
import com.p280ss.android.ugc.aweme.profile.service.C36065a;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.profile.util.C36718ah;
import com.p280ss.android.ugc.aweme.profile.util.C36763u;
import com.p280ss.android.ugc.aweme.profile.util.C36768y;
import com.p280ss.android.ugc.aweme.profile.util.C36769z;
import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.p280ss.android.ugc.aweme.utils.C42919ag;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43150p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.a */
public abstract class C36481a extends FrameLayout implements C36041o {

    /* renamed from: A */
    protected AnimationImageView f95702A;

    /* renamed from: B */
    protected View f95703B;

    /* renamed from: C */
    protected TextView f95704C;

    /* renamed from: D */
    protected View f95705D;

    /* renamed from: E */
    public DmtTabLayout f95706E;

    /* renamed from: F */
    protected LinearLayout f95707F;

    /* renamed from: G */
    protected TextView f95708G;

    /* renamed from: H */
    protected TextView f95709H;

    /* renamed from: I */
    protected TextView f95710I;

    /* renamed from: J */
    protected TextView f95711J;

    /* renamed from: K */
    protected FrameLayout f95712K;

    /* renamed from: L */
    public View f95713L;

    /* renamed from: M */
    protected BindAccountView f95714M;

    /* renamed from: N */
    protected RemoteImageView f95715N;

    /* renamed from: O */
    protected C36768y f95716O;

    /* renamed from: P */
    protected C36718ah f95717P;

    /* renamed from: Q */
    protected TempBaseProfileFragment f95718Q;

    /* renamed from: R */
    protected UserHeaderData f95719R;

    /* renamed from: S */
    protected C36436dw f95720S;

    /* renamed from: T */
    protected ProfileStarRankView f95721T;

    /* renamed from: U */
    protected ViewStub f95722U;

    /* renamed from: V */
    protected String f95723V;

    /* renamed from: W */
    DmtTextView f95724W;

    /* renamed from: a */
    protected String f95725a;

    /* renamed from: aa */
    DmtTextView f95726aa;

    /* renamed from: ab */
    protected FrameLayout f95727ab;

    /* renamed from: ac */
    protected DataCenter f95728ac;

    /* renamed from: ad */
    protected WidgetManager f95729ad;

    /* renamed from: ae */
    protected View f95730ae;

    /* renamed from: af */
    protected ProfileViewModel f95731af;

    /* renamed from: ag */
    protected C36485a f95732ag;

    /* renamed from: ah */
    protected Aweme f95733ah;

    /* renamed from: ai */
    int f95734ai = -1;

    /* renamed from: aj */
    private View f95735aj;

    /* renamed from: ak */
    private View f95736ak;

    /* renamed from: al */
    private RemoteImageView f95737al;

    /* renamed from: am */
    private DmtTextView f95738am;

    /* renamed from: an */
    private ImageView f95739an;

    /* renamed from: ao */
    private ImageView f95740ao;

    /* renamed from: ap */
    private boolean f95741ap;

    /* renamed from: aq */
    private View f95742aq;

    /* renamed from: ar */
    private NewYearWishLayout f95743ar;

    /* renamed from: as */
    private int f95744as;

    /* renamed from: at */
    private C36132a f95745at = new C36132a() {
        /* renamed from: a */
        public final void mo91966a() {
            if (C36481a.this.f95765u) {
                C36481a.this.mo92662i();
                return;
            }
            if (C36481a.this.f95764t) {
                C36481a.this.mo92665j();
            }
        }

        /* renamed from: a */
        public final void mo91967a(int i) {
            String str;
            String str2;
            switch (i) {
                case 1:
                    str = "instagram";
                    break;
                case 2:
                    str = "youtube";
                    break;
                case 3:
                    str = "twitter";
                    break;
                default:
                    str = "";
                    break;
            }
            if (!TextUtils.isEmpty(str)) {
                if (C6861a.m21337f().isMe(C36481a.this.f95746b.getUid())) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                C6907h.m21524a("click_social_account", (Map) C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("platform", str).f60753a);
            }
        }
    };

    /* renamed from: b */
    protected User f95746b;

    /* renamed from: c */
    protected int f95747c;

    /* renamed from: d */
    protected int f95748d;

    /* renamed from: e */
    protected String f95749e;

    /* renamed from: f */
    protected TextView f95750f;

    /* renamed from: g */
    protected DmtTextView f95751g;

    /* renamed from: h */
    protected TextView f95752h;

    /* renamed from: i */
    protected TextView f95753i;

    /* renamed from: j */
    protected ViewGroup f95754j;

    /* renamed from: k */
    protected ViewGroup f95755k;

    /* renamed from: l */
    public ViewGroup f95756l;

    /* renamed from: m */
    protected TextView f95757m;

    /* renamed from: n */
    protected TranslationStatusView f95758n;

    /* renamed from: o */
    protected View f95759o;

    /* renamed from: p */
    protected TextView f95760p;

    /* renamed from: q */
    protected View f95761q;

    /* renamed from: r */
    protected String f95762r;

    /* renamed from: s */
    public float f95763s;

    /* renamed from: t */
    protected boolean f95764t;

    /* renamed from: u */
    public boolean f95765u;

    /* renamed from: v */
    public View f95766v;

    /* renamed from: w */
    protected TextView f95767w;

    /* renamed from: x */
    protected SmartAvatarBorderView f95768x;

    /* renamed from: y */
    protected LiveCircleView f95769y;

    /* renamed from: z */
    protected AnimationImageView f95770z;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.header.a$a */
    public interface C36485a {
        /* renamed from: a */
        void mo92183a();

        /* renamed from: b */
        void mo92184b();
    }

    /* renamed from: a */
    public void mo92528a() {
    }

    /* renamed from: b */
    public void mo92534b() {
    }

    /* renamed from: b */
    public final void mo91707b(Exception exc) {
    }

    /* renamed from: b */
    public void mo91709b(boolean z) {
    }

    /* renamed from: d */
    public void mo91717d(User user) {
    }

    /* renamed from: e */
    public void mo91720e() {
    }

    /* renamed from: f */
    public void mo91725f(User user) {
    }

    /* renamed from: g */
    public void mo91727g(int i) {
    }

    public int getHeadStatus() {
        return this.f95744as;
    }

    /* access modifiers changed from: protected */
    public abstract String getHeaderHomePageName();

    public abstract int getLayout();

    public Aweme getSourceAweme() {
        return this.f95733ah;
    }

    public String getUserUniqueId() {
        return this.f95723V;
    }

    /* renamed from: h */
    public abstract void mo92542h();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo92546l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo92549n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo92551o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo92555p();

    public void setVisible(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92635a(User user, DialogInterface dialogInterface, int i) {
        C36065a.f94305a.mo91793a(getActivity(), user.getBioUrl());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92636a(User user, View view) {
        C6907h.m21524a("click_link", (Map) new C22984d().mo59973a("enter_from", C6861a.m21337f().isMe(user.getUid()) ? "personal_homepage" : "others_homepage").mo59973a("link_type", "starmap").mo59973a("author_id", user.getUid()).f60753a);
        C36074j.f94315a.startCrossPlatformActivity(getContext(), user.getUid());
    }

    /* renamed from: a */
    public final void mo91703a(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        if (this.f95718Q.isViewValid()) {
            if (!TextUtils.isEmpty(str)) {
                this.f95704C.setText(str);
                mo92537b(str, i, blueVBrandInfo, user);
                mo92546l();
            } else {
                this.f95704C.setText("");
            }
            this.f95762r = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo92637a(String str, String str2) {
        if (getActivity() != null) {
            C10741a c = new C10741a(getContext()).mo25663c(R.drawable.b8a);
            Context context = getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            c.mo25660b(m117741a(context, str2, sb.toString())).mo25650a((int) R.string.b8g, (OnClickListener) null).mo25656a().mo25638b();
            MobClick eventName = MobClick.obtain().setEventName("click_like_count");
            eventName.setLabelName(C43122ff.m136787r(this.f95746b) ? "personal_homepage" : "others_homepage");
            C6907h.onEvent(eventName);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92633a(HotListStruct hotListStruct, View view) {
        String schema = hotListStruct.getSchema();
        if (schema != null) {
            C6907h.m21524a("enter_hot_search_board", (Map) C22984d.m75611a().mo59973a("enter_from", C43122ff.m136787r(this.f95746b) ? "personal_homepage" : "others_homepage").mo59973a("enter_method", "official_account_entrance").f60753a);
            C24621e.m80715a().getAdsUriJumperService().mo59824a(getContext(), schema, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92634a(HotSearchSprintStruct hotSearchSprintStruct, View view) {
        String str;
        if (hotSearchSprintStruct.getSprint() >= 30) {
            if (this.f95746b == null) {
                str = C21657aq.m72493a().getRankHelperService().mo68411a("others_homepage", "", "");
            } else {
                str = C21657aq.m72493a().getRankHelperService().mo68411a("others_homepage", this.f95746b.getUid(), this.f95746b.getSecUid());
            }
            C7195s.m22438a().mo18682a(str);
        }
    }

    /* renamed from: a */
    public final void mo91702a(User user) {
        if (user != null && !C6399b.m19944t()) {
            m117749n(user);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92632a(AdCoverTitle adCoverTitle, View view) {
        C24621e.m80715a().getFeedRawAdLogService().mo64664a(getContext(), "starpage_ad", "click", "{}", "link", this.f95746b.getAdOrderId());
        C24621e.m80715a().getAdOpenUtilsService().mo64687a(view.getContext(), adCoverTitle.getWebUrl(), "");
    }

    /* renamed from: a */
    public final void mo92631a(LinkInfo linkInfo) {
        String str;
        if (linkInfo != null) {
            C36074j jVar = C36074j.f94315a;
            Context context = getContext();
            FrameLayout frameLayout = this.f95727ab;
            RemoteImageView remoteImageView = this.f95737al;
            DmtTextView dmtTextView = this.f95738am;
            ImageView imageView = this.f95739an;
            ImageView imageView2 = this.f95740ao;
            if (this.f95746b == null) {
                str = "";
            } else {
                str = this.f95746b.getUid();
            }
            jVar.displayActivityLink(context, frameLayout, remoteImageView, dmtTextView, imageView, imageView2, str, getHeaderHomePageName(), linkInfo);
            if (!C6399b.m19944t()) {
                this.f95741ap = linkInfo.disappearAfterClicked;
            }
        } else if (this.f95727ab != null) {
            this.f95727ab.setVisibility(8);
        }
    }

    /* renamed from: w */
    private boolean mo92563w() {
        return C43122ff.m136793x(this.f95746b);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42961az.m136382c(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42961az.m136383d(this);
    }

    /* renamed from: v */
    private static boolean mo92562v() {
        if (C36074j.f94315a.getCloseWeiboEntry() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo91726f() {
        if (this.f95718Q == null || !this.f95718Q.mo91726f()) {
            return false;
        }
        return true;
    }

    public int getBgAvatarMarginTop() {
        return ((MarginLayoutParams) this.f95703B.getLayoutParams()).topMargin;
    }

    /* access modifiers changed from: protected */
    public int getTabCount() {
        if (this.f95706E == null) {
            return 0;
        }
        return this.f95706E.getTabCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo92667k() {
        return C43122ff.m136769b(this.f95746b, C43122ff.m136787r(this.f95746b));
    }

    /* renamed from: q */
    public final void mo92671q() {
        if (this.f95743ar != null) {
            this.f95743ar.mo92188a();
        }
    }

    /* renamed from: u */
    private void mo92561u() {
        if (this.f95758n != null) {
            this.f95758n.mo104219c();
            this.f95758n.setTextColor(R.color.a4z);
        }
    }

    /* renamed from: x */
    private void mo92721x() {
        if (this.f95746b != null && !TextUtils.isEmpty(this.f95746b.getShopMicroApp())) {
            C36074j.f94315a.preloadMiniApp(this.f95746b.getShopMicroApp());
        }
    }

    /* renamed from: y */
    private boolean mo92722y() {
        if (mo92723z() || mo92672r()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private boolean mo92723z() {
        if (this.f95746b == null || this.f95746b.getVerificationType() != 2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        if (this.f95718Q == null) {
            Context context = getContext();
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return this.f95718Q.getActivity();
    }

    public int getCollectPosi() {
        if (this.f95718Q == null || this.f95718Q.mo91879k() == null) {
            return -1;
        }
        return this.f95718Q.mo91879k().indexOf(Integer.valueOf(4));
    }

    public int getFavoritePosi() {
        if (this.f95718Q == null || this.f95718Q.mo91879k() == null) {
            return -1;
        }
        return this.f95718Q.mo91879k().indexOf(Integer.valueOf(1));
    }

    public int getOriginMusicsionPosi() {
        if (this.f95718Q == null || this.f95718Q.mo91879k() == null) {
            return -1;
        }
        return this.f95718Q.mo91879k().indexOf(Integer.valueOf(3));
    }

    public int getPublishPosi() {
        if (this.f95718Q == null || this.f95718Q.mo91879k() == null) {
            return -1;
        }
        return this.f95718Q.mo91879k().indexOf(Integer.valueOf(0));
    }

    public int getStoryPosi() {
        if (this.f95718Q == null || this.f95718Q.mo91879k() == null) {
            return -1;
        }
        return this.f95718Q.mo91879k().indexOf(Integer.valueOf(2));
    }

    public int getToolPosi() {
        if (this.f95718Q == null || this.f95718Q.mo91879k() == null) {
            return -1;
        }
        return this.f95718Q.mo91879k().indexOf(Integer.valueOf(6));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo92672r() {
        if (this.f95746b == null || (this.f95746b.getVerificationType() != 3 && !this.f95746b.isEffectArtist())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo92538c() {
        if (this.f95741ap) {
            this.f95739an.setVisibility(0);
            LayoutParams layoutParams = (LayoutParams) this.f95738am.getLayoutParams();
            layoutParams.gravity = 16;
            this.f95737al.setImageURI(new Builder().scheme("res").path("2131100806").build());
            this.f95738am.setLayoutParams(layoutParams);
            this.f95741ap = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo92643g() {
        if (this.f95724W != null && this.f95724W.getVisibility() == 0) {
            m117743b("show_link", "email");
        }
        if (this.f95726aa != null && this.f95726aa.getVisibility() == 0) {
            m117743b("show_link", "weblink");
        }
    }

    public int getDynamicPosi() {
        int i;
        if (this.f95718Q == null) {
            return -1;
        }
        if (!C36074j.f94315a.showProfileCollectionTab() || !C43122ff.m136787r(this.f95746b)) {
            i = 5;
        } else {
            i = 8;
        }
        if (this.f95718Q.mo91879k() == null) {
            return -1;
        }
        return this.f95718Q.mo91879k().indexOf(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo92668m() {
        if (this.f95746b == null || (this.f95746b.getVerificationType() != 2 && this.f95746b.getShowArtistPlaylist() != 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public void mo92558s() {
        if (this.f95750f != null) {
            this.f95750f.setText("-");
        }
        if (this.f95752h != null) {
            this.f95752h.setText("-");
        }
        if (this.f95753i != null) {
            this.f95753i.setText("-");
        }
    }

    /* renamed from: t */
    private void mo92560t() {
        this.f95706E.setCustomTabViewResId(R.layout.a13);
        if (C6399b.m19944t()) {
            this.f95706E.setBackgroundColor(getContext().getResources().getColor(R.color.a3z));
            this.f95706E.setTabBackgroundResId(R.drawable.ug);
        }
        this.f95706E.mo26056a(C23486n.m77122a(16.0d), 0, C23486n.m77122a(16.0d), 0);
        this.f95706E.setTabMode(0);
        this.f95706E.setAutoFillWhenScrollable(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo92662i() {
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isMe(this.f95746b.getUid())) {
            C6907h.onEvent(MobClick.obtain().setEventName("rocket_click").setLabelName("personal_homepage"));
        } else {
            C6907h.onEvent(MobClick.obtain().setEventName("rocket_click").setLabelName("others_homepage"));
        }
        C36104w.m116262a(getContext(), this.f95746b.getrFansGroupInfo());
    }

    /* renamed from: d */
    public final void mo91715d() {
        if (C6399b.m19947w()) {
            this.f95709H.setVisibility(8);
            this.f95710I.setVisibility(8);
            this.f95708G.setVisibility(8);
            if (!TextUtils.isEmpty(this.f95746b.getEnterpriseVerifyReason())) {
                this.f95710I.setVisibility(0);
                this.f95710I.setText(this.f95746b.getEnterpriseVerifyReason());
            } else if (!TextUtils.isEmpty(this.f95746b.getCustomVerify())) {
                this.f95709H.setVisibility(0);
                this.f95709H.setText(this.f95746b.getCustomVerify());
            }
        } else if (this.f95746b == null || !TextUtils.isEmpty(this.f95746b.getEnterpriseVerifyReason()) || !mo92722y()) {
            this.f95709H.setVisibility(8);
        } else {
            Context context = this.f95709H.getContext();
            if (!TextUtils.isEmpty(this.f95746b.getCustomVerify())) {
                this.f95709H.setText(this.f95746b.getCustomVerify());
            } else if (mo92723z()) {
                this.f95709H.setText(R.string.auw);
            } else if (mo92672r()) {
                this.f95709H.setText(R.string.av1);
            }
            this.f95709H.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.amq), null, null, null);
            this.f95709H.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92665j() {
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isMe(this.f95746b.getUid())) {
            C6907h.onEvent(MobClick.obtain().setEventName("weibo_link").setLabelName("personal_homepage"));
        } else {
            C6907h.onEvent(MobClick.obtain().setEventName("weibo_link").setLabelName("others_homepage"));
        }
        C35671aa.m115277a(getContext(), this.f95746b.getWeiboSchema(), this.f95746b.getWeiboUrl(), this.f95746b.getWeiboNickname());
    }

    public void setClickEventListener(C36485a aVar) {
        this.f95732ag = aVar;
    }

    public void setFragment(TempBaseProfileFragment tempBaseProfileFragment) {
        this.f95718Q = tempBaseProfileFragment;
    }

    public void setHeadStatus(int i) {
        this.f95744as = i;
    }

    public void setSourceAweme(Aweme aweme) {
        this.f95733ah = aweme;
    }

    /* renamed from: f */
    public final void mo92642f(boolean z) {
        if (!z) {
            mo92643g();
        }
    }

    /* renamed from: g */
    public final void mo91728g(User user) {
        m117752q(user);
    }

    public void setUser(User user) {
        this.f95746b = user;
        mo92721x();
    }

    /* renamed from: l */
    private static int m117747l(User user) {
        if (C36337ai.m117567a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    /* renamed from: n */
    private void m117749n(User user) {
        if (this.f95743ar != null) {
            NewYearWishLayout.m117026a(getActivity(), user);
        }
    }

    /* renamed from: e */
    public final void mo91723e(boolean z) {
        int i;
        TextView textView = this.f95711J;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    public static Drawable m117740a(Context context) {
        Drawable drawable = null;
        if (context == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.a19});
        try {
            drawable = obtainStyledAttributes.getDrawable(0);
        } catch (UnsupportedOperationException e) {
            C6921a.m21559a((Throwable) e);
        }
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: m */
    private static boolean m117748m(User user) {
        if (user == null || !C24995f.m82308a(user) || (user.isLive() && C41983b.m133444a() && !user.isBlock())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo91705b(int i) {
        if (this.f95718Q.isViewValid()) {
            if (i < 0) {
                i = 0;
            }
            this.f95747c = i;
            this.f95750f.setText(C30537o.m99738a((long) i));
        }
    }

    /* renamed from: c */
    public final void mo91712c(User user) {
        if (this.f95715N != null) {
            if (m117748m(user)) {
                this.f95715N.setVisibility(0);
                C24995f.m82306a(user, this.f95715N);
                return;
            }
            this.f95715N.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo91719d(boolean z) {
        boolean z2 = false;
        if (C6399b.m19944t()) {
            z = false;
        }
        if (z && mo92563w()) {
            z2 = true;
        }
        this.f95765u = z2;
        this.f95714M.mo91960a(this.f95746b);
    }

    /* renamed from: e */
    public final void mo91722e(User user) {
        if (C6399b.m19947w()) {
            if (!mo92667k()) {
                this.f95714M.setVisibility(0);
                this.f95714M.mo91960a(user);
                return;
            }
            this.f95714M.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo92644g(View view) {
        C24621e.m80715a().getAdOpenUtilsService().mo64687a(getContext(), this.f95746b.getBioSecureUrl(), "");
        m117743b("click_link", "weblink");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo92659h(View view) {
        C24621e.m80715a().getAdOpenUtilsService().mo64687a(getContext(), this.f95746b.getBioSecureUrl(), "");
        m117743b("click_link", "weblink");
    }

    /* renamed from: i */
    public final ProfileTabView mo92661i(int i) {
        C10825f b = this.f95706E.mo26066b(i);
        if (b == null || b.f29292f == null) {
            return null;
        }
        return (ProfileTabView) b.f29292f;
    }

    /* renamed from: a */
    public final void mo91697a(int i) {
        if (this.f95718Q.isViewValid()) {
            if (i < 0) {
                i = 0;
            }
            this.f95748d = i;
            this.f95752h.setText(C30537o.m99738a((long) i));
        }
    }

    /* renamed from: d */
    public final void mo91718d(String str) {
        if (!C6399b.m19947w()) {
            if (TextUtils.isEmpty(str) || this.f95746b == null || TextUtils.isEmpty(this.f95746b.getEnterpriseVerifyReason())) {
                this.f95710I.setVisibility(8);
            } else {
                this.f95710I.setVisibility(0);
                this.f95710I.setText(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo92539e(View view) {
        int i;
        try {
            C42919ag.m136264a("user_id", getContext(), this.f95723V);
            Context context = getContext();
            if (C6399b.m19944t()) {
                i = R.string.a5n;
            } else {
                i = R.string.bfr;
            }
            C10761a.m31383a(context, i).mo25750a();
        } catch (SecurityException e) {
            C6921a.m21554a((Exception) e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo92641f(View view) {
        String str;
        if (this.f95746b == null) {
            C21657aq.m72493a().getRankHelperService().mo68413b("others_homepage", "", "");
            str = null;
        } else {
            str = C21657aq.m72493a().getRankHelperService().mo68413b("others_homepage", this.f95746b.getUid(), this.f95746b.getSecUid());
        }
        C7195s.m22438a().mo18682a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo92663i(View view) {
        C24621e.m80715a().getAdOpenUtilsService().mo64684a(getContext(), this.f95746b.getBioEmail());
        m117743b("click_link", "email");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo92666j(int i) {
        String str;
        String str2;
        boolean equals = TextUtils.equals(C6861a.m21332a().userService().getCurUserId(), this.f95746b.getUid());
        Activity activity = getActivity();
        if (equals) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        if (i == R.id.afg) {
            str2 = "click_blue_vip";
        } else {
            str2 = "click_yellow_vip";
        }
        C36763u.m118499a(activity, str, str2, this.f95746b.getUid());
    }

    public void setVisibleHeight(int i) {
        if (this.f95766v != null && this.f95703B != null) {
            int i2 = ((MarginLayoutParams) this.f95703B.getLayoutParams()).topMargin;
            if (i >= i2) {
                this.f95766v.getLayoutParams().height = i - i2;
                this.f95763s = (float) i;
            }
        }
    }

    /* renamed from: j */
    private void mo92544j(View view) {
        this.f95724W = (DmtTextView) view.findViewById(R.id.e8w);
        if (this.f95724W != null) {
            this.f95724W.setOnClickListener(new C36528b(this));
        }
        this.f95726aa = (DmtTextView) view.findViewById(R.id.e8x);
        if (this.f95726aa != null) {
            if (((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
                this.f95726aa.setTextColor(getResources().getColor(R.color.a79));
            } else {
                this.f95726aa.setTextColor(getResources().getColor(R.color.a71));
            }
            this.f95726aa.setOnClickListener(new C36535c(this));
        }
    }

    /* renamed from: o */
    private void m117750o(User user) {
        HotListStruct hotListStruct = user.getmHotListStruct();
        if (hotListStruct == null || this.f95722U == null) {
            if (this.f95730ae != null) {
                this.f95730ae.setVisibility(8);
            }
        } else if (hotListStruct.getType() == 0) {
            if (this.f95730ae != null) {
                this.f95730ae.setVisibility(8);
            }
        } else {
            if (this.f95730ae == null) {
                this.f95722U.setLayoutResource(R.layout.b1a);
                this.f95730ae = this.f95722U.inflate();
            }
            this.f95730ae.setVisibility(0);
            C23323e.m76514a((RemoteImageView) this.f95730ae.findViewById(R.id.b_6), hotListStruct.getImageUrl());
            ((TextView) this.f95730ae.findViewById(R.id.dvs)).setText(hotListStruct.getTitile());
            this.f95730ae.setOnClickListener(new C36543k(this, hotListStruct));
        }
    }

    /* renamed from: q */
    private void m117752q(User user) {
        if (user != null && !C6399b.m19944t() && this.f95767w != null && this.f95736ak != null && this.f95735aj != null) {
            this.f95767w.setVisibility(8);
            this.f95735aj.setVisibility(8);
            this.f95736ak.setVisibility(8);
            if (user.getDefaultAdCoverUrl() != null) {
                AdCoverTitle adCoverTitle = user.getAdCoverTitle();
                if (adCoverTitle != null) {
                    this.f95767w.setVisibility(0);
                    this.f95735aj.setVisibility(0);
                    this.f95736ak.setVisibility(0);
                    this.f95767w.setText(adCoverTitle.getTitle());
                    this.f95767w.setOnClickListener(new C36547o(this, adCoverTitle));
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo92639c(View view) {
        if (!C36556x.m117980a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
        } else if (!C27326a.m89578a(view) && this.f95746b != null) {
            int id = view.getId();
            if (id == R.id.c9g) {
                C36074j.f94315a.onI18nVerificationViewClick(getContext(), this.f95746b, String.valueOf(this.f95746b.getVerificationType()), this.f95725a);
            } else if (id == R.id.afg) {
                C36074j.f94315a.onI18nVerificationViewClick(getContext(), this.f95746b, C36074j.f94315a.typeVerificationEnterprise(), this.f95725a);
            } else {
                if (id == R.id.egn) {
                    C36074j.f94315a.onI18nVerificationViewClick(getContext(), this.f95746b, "1", this.f95725a);
                }
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onJsBroacastReceiver(C27994k kVar) {
        int i;
        try {
            if (TextUtils.equals(kVar.f73730b.getString("eventName"), "star_atlas_cooperation") && kVar.f73730b.has("data") && this.f95751g != null) {
                DmtTextView dmtTextView = this.f95751g;
                if (kVar.f73730b.getJSONObject("data").getBoolean("is_open")) {
                    i = 0;
                } else {
                    i = 8;
                }
                dmtTextView.setVisibility(i);
            }
            if (TextUtils.equals(kVar.f73730b.getString("eventName"), "avatarDecorationUpdated") && C43122ff.m136787r(this.f95746b)) {
                C6861a.m21337f().queryUser();
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: k */
    private void mo92705k(User user) {
        String str;
        String str2;
        if (this.f95751g != null) {
            if (user.getCommerceUserInfo() == null || user.getCommerceUserInfo().getStarAtlas() != 1 || !user.getCommerceUserInfo().isShowStarAtlasCooperation()) {
                this.f95751g.setVisibility(8);
            } else {
                if (TextUtils.equals(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), user.getUid())) {
                    this.f95751g.setVisibility(0);
                    this.f95751g.setText(R.string.e0l);
                    String str3 = "show_link";
                    C22984d dVar = new C22984d();
                    String str4 = "enter_from";
                    if (C6861a.m21337f().isMe(user.getUid())) {
                        str2 = "personal_homepage";
                    } else {
                        str2 = "others_homepage";
                    }
                    C6907h.m21524a(str3, (Map) dVar.mo59973a(str4, str2).mo59973a("link_type", "starmap").mo59973a("author_id", user.getUid()).f60753a);
                } else if (C36074j.f94315a.isStarAtlasCooperationEntryOpen()) {
                    this.f95751g.setVisibility(0);
                    this.f95751g.setText(R.string.e0m);
                    String str5 = "show_link";
                    C22984d dVar2 = new C22984d();
                    String str6 = "enter_from";
                    if (C6861a.m21337f().isMe(user.getUid())) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    C6907h.m21524a(str5, (Map) dVar2.mo59973a(str6, str).mo59973a("link_type", "starmap").mo59973a("author_id", user.getUid()).f60753a);
                } else {
                    this.f95751g.setVisibility(8);
                }
                this.f95751g.setOnClickListener(new C36541i(this, user));
            }
        }
    }

    /* renamed from: b */
    public void mo92535b(View view) {
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        View.OnClickListener onClickListener3;
        this.f95755k.setOnClickListener(new C36550r(this));
        this.f95754j.setOnClickListener(new C36551s(this));
        this.f95756l.setOnClickListener(new C36552t(this));
        TextView textView = this.f95708G;
        if (!C6399b.m19944t()) {
            onClickListener = new C36553u(this);
        } else {
            onClickListener = new C36554v(this);
        }
        textView.setOnClickListener(onClickListener);
        TextView textView2 = this.f95709H;
        if (!C6399b.m19944t()) {
            onClickListener2 = new C36555w(this);
        } else {
            onClickListener2 = new C36536d(this);
        }
        textView2.setOnClickListener(onClickListener2);
        TextView textView3 = this.f95710I;
        if (!C6399b.m19944t()) {
            onClickListener3 = new C36537e(this);
        } else {
            onClickListener3 = new C36538f(this);
        }
        textView3.setOnClickListener(onClickListener3);
        this.f95714M.setEventListener(this.f95745at);
        this.f95768x.setOnClickListener(new C36539g(this));
        this.f95760p.setOnClickListener(new C36540h(this));
    }

    /* renamed from: c */
    public final void mo91714c(boolean z) {
        boolean z2 = false;
        if (C6399b.m19944t()) {
            z = false;
        }
        if (z && !mo92562v()) {
            z2 = true;
        }
        this.f95764t = z2;
        this.f95714M.mo91960a(this.f95746b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo92664i(User user) {
        if (user != null && C6399b.m19944t()) {
            if (this.f95720S == null) {
                this.f95720S = new C36436dw(getContext(), this.f95758n, this.f95757m);
            }
            this.f95720S.mo92511a(user);
        }
    }

    /* renamed from: j */
    private void mo92704j(User user) {
        if (user != null) {
            if (this.f95724W != null) {
                if (!TextUtils.isEmpty(user.getBioEmail())) {
                    this.f95724W.setVisibility(0);
                    this.f95724W.setText(user.getBioEmail());
                    if (C6399b.m19944t()) {
                        this.f95724W.setTextColor(getContext().getResources().getColor(R.color.a4r));
                    }
                } else {
                    this.f95724W.setVisibility(8);
                }
            }
            if (this.f95726aa != null) {
                if (!TextUtils.isEmpty(user.getBioUrl())) {
                    this.f95726aa.setVisibility(0);
                    if (C6399b.m19944t()) {
                        if (VERSION.SDK_INT >= 17) {
                            this.f95726aa.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                        } else {
                            this.f95726aa.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        }
                        if (!C6861a.m21337f().isLogin() || !C43122ff.m136787r(user) || !TextUtils.isEmpty(user.getBioSecureUrl())) {
                            this.f95726aa.setText(user.getBioUrl());
                            this.f95726aa.setTextColor(getContext().getResources().getColor(R.color.a4r));
                            this.f95726aa.setOnClickListener(new C36549q(this));
                        } else {
                            if (VERSION.SDK_INT >= 17) {
                                this.f95726aa.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ve, 0, 0, 0);
                            } else {
                                this.f95726aa.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ve, 0, 0, 0);
                            }
                            this.f95726aa.setCompoundDrawablePadding((int) C9738o.m28708b(getContext(), 4.0f));
                            this.f95726aa.setText(R.string.bzo);
                            this.f95726aa.setTextColor(getContext().getResources().getColor(R.color.a14));
                            this.f95726aa.setOnClickListener(new C36546n(this, user));
                        }
                    } else {
                        this.f95726aa.setText(user.getBioUrl());
                    }
                } else {
                    this.f95726aa.setVisibility(8);
                }
            }
            if (!C43122ff.m136787r(user)) {
                mo92643g();
            }
        }
    }

    /* renamed from: p */
    private void m117751p(User user) {
        if (!C6399b.m19944t()) {
            boolean z = false;
            if (user.isStar()) {
                this.f95760p.setVisibility(8);
                if (this.f95721T != null) {
                    HotSearchSprintStruct sprintSupportUserInfo = user.getSprintSupportUserInfo();
                    if (user.getStarBillboardRank() <= 0 || sprintSupportUserInfo == null) {
                        this.f95721T.setVisibility(8);
                    } else {
                        if (((Integer) SharePrefCache.inst().getHitRankActivityStatus().mo59877d()).intValue() != 0) {
                            this.f95721T.setBackgroundImage((String) SharePrefCache.inst().getHitRankActivityProfileBackground().mo59877d());
                        }
                        this.f95721T.setVisibility(0);
                        this.f95721T.setRank(user.getStarBillboardRank());
                        this.f95721T.setHitRankPeopleNumber(sprintSupportUserInfo.getSprint());
                        this.f95721T.setHitRankUsers(sprintSupportUserInfo.getHitRankPeoples());
                        this.f95721T.getStarRankView().setOnClickListener(new C36544l(this));
                        this.f95721T.getHitRankView().setOnClickListener(new C36545m(this, sprintSupportUserInfo));
                    }
                }
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f95757m.getLayoutParams();
                marginLayoutParams.topMargin = C23486n.m77122a(12.0d);
                marginLayoutParams.bottomMargin = C23486n.m77122a(-4.0d);
                this.f95757m.setLayoutParams(marginLayoutParams);
                if (this.f95742aq instanceof C36345an) {
                    C36345an anVar = (C36345an) this.f95742aq;
                    Activity activity = getActivity();
                    if (this.f95721T == null || this.f95721T.getVisibility() == 8) {
                        z = true;
                    }
                    anVar.mo91991a(activity, user, z);
                }
                return;
            }
            this.f95760p.setVisibility(0);
            this.f95714M.setVisibility(0);
            if (this.f95721T != null) {
                this.f95721T.setVisibility(8);
            }
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f95757m.getLayoutParams();
            marginLayoutParams2.topMargin = C23486n.m77122a(8.0d);
            marginLayoutParams2.bottomMargin = C23486n.m77122a(0.0d);
            this.f95757m.setLayoutParams(marginLayoutParams2);
            if (this.f95742aq != null) {
                this.f95742aq.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo91700a(long j) {
        if (this.f95718Q.isViewValid()) {
            this.f95749e = C30537o.m99738a(j);
            this.f95753i.setText(this.f95749e);
        }
    }

    /* renamed from: b */
    public final void mo91706b(User user) {
        if (C6399b.m19944t()) {
            this.f95707F.setVisibility(8);
        } else if (!C6399b.m19944t() && user != null && user.isGovMediaVip()) {
            this.f95707F.setVisibility(8);
        } else if (C43122ff.m136783n(user)) {
            this.f95707F.setVisibility(8);
        } else if (user == null || !user.isStar()) {
            this.f95707F.setVisibility(0);
            this.f95716O.mo93099a(user);
        } else {
            this.f95707F.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo92640d(View view) {
        if (!C36556x.m117980a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            return;
        }
        final int id = view.getId();
        if (id == R.id.aus) {
            if (!C27326a.m89578a(view)) {
                if (this.f95732ag != null) {
                    this.f95732ag.mo92183a();
                }
                mo92549n();
            }
        } else if (id == R.id.ao6) {
            if (mo92667k() && !C43122ff.m136792w(this.f95746b)) {
                return;
            }
            if (C43122ff.m136794y(this.f95746b)) {
                C10761a.m31399c(getContext(), (int) R.string.d7t).mo25750a();
            } else {
                mo92555p();
            }
        } else if (id == R.id.aoa) {
            if (mo92667k() && !C43122ff.m136792w(this.f95746b)) {
                return;
            }
            if (C43122ff.m136794y(this.f95746b)) {
                C10761a.m31399c(getContext(), (int) R.string.d7s).mo25750a();
            } else {
                mo92551o();
            }
        } else if (id == R.id.abf) {
            mo92637a(this.f95749e, this.f95762r);
        } else {
            if ((id != R.id.egn && id != R.id.c9g && id != R.id.afg) || C27326a.m89578a(view)) {
                return;
            }
            if (!C6861a.m21337f().isLogin()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("block_bind_phone", true);
                C32656f.m105744a(getActivity(), "personal_homepage", "click", bundle, (C23305g) new C23305g() {
                    /* renamed from: a */
                    public final void mo58664a(Bundle bundle) {
                    }

                    /* renamed from: a */
                    public final void mo58663a() {
                        C36481a.this.mo92666j(id);
                    }
                });
                return;
            }
            mo92666j(id);
        }
    }

    /* renamed from: h */
    public void mo92660h(User user) {
        int i;
        int i2;
        String str;
        String str2;
        User user2 = this.f95746b;
        setUser(user);
        if (this.f95718Q != null && this.f95718Q.isViewValid()) {
            m117750o(user);
            m117751p(user);
            mo91705b(user.getFollowingCount());
            mo91697a(m117747l(user));
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                mo91703a(user.getRemarkName(), user.getStarBillboardRank(), user.getBrandInfo(), user);
            } else {
                mo91703a(user.getNickname(), user.getStarBillboardRank(), user.getBrandInfo(), user);
            }
            mo91700a(user.getTotalFavorited());
            mo91699a(user.getFollowStatus(), user.getSignature());
            mo92705k(user);
            mo91710b(user.isLive(), C43122ff.m136791v(user), C36074j.f94315a.hasUnreadStoryWithCheck(user2, user));
            mo91712c(user);
            mo91701a(C43150p.m136858b(user));
            mo91728g(user);
            mo91711c(user.getAwemeCount());
            mo91704a(user.isWithFusionShopEntry(), user.isWithNewGoods(), user.isWithCommerceEntry());
            mo91716d(user.getFavoritingCount());
            if (!C36074j.f94315a.showProfileCollectionTab() || !C43122ff.m136787r(this.f95746b)) {
                mo91724f(user.getDongtaiCount());
            } else {
                mo91724f(user.getCollectCount());
            }
            mo91721e(user.getStoryCount());
            if (user.getOriginalMusician() != null) {
                i = user.getOriginalMusician().getMusicCount();
            } else {
                i = 0;
            }
            mo91727g(i);
            if (user.getEffectArtistDetail() != null) {
                i2 = user.getEffectArtistDetail().getTotal();
            } else {
                i2 = 0;
            }
            mo91730h(i2);
            mo91706b(user);
            if (TextUtils.isEmpty(user.getCustomVerify())) {
                str = user.getWeiboVerify();
            } else {
                str = user.getCustomVerify();
            }
            mo91708b(str);
            mo91715d();
            mo91718d(user.getEnterpriseVerifyReason());
            if (TextUtils.isEmpty(user.getUniqueId())) {
                str2 = user.getShortId();
            } else {
                str2 = user.getUniqueId();
            }
            mo91713c(str2);
            C36065a.f94305a.mo91796a(this.f95714M);
            mo91714c(user.isBindedWeibo());
            mo91719d(C43122ff.m136793x(user));
            mo91717d(user);
            mo91725f(user);
            if (C43122ff.m136787r(user)) {
                mo91698a(3, user.getFollowerStatus());
                mo91709b(false);
            } else {
                mo91698a(user.getFollowStatus(), user.getFollowerStatus());
            }
            mo91723e(user.hasMedal());
            mo91722e(user);
            user.getCustomVerify();
            mo91720e();
            if (mo92667k()) {
                this.f95706E.setOnTabClickListener(C36542j.f95931a);
            }
            mo92704j(user);
        }
    }

    /* renamed from: a */
    public void mo92531a(View view) {
        this.f95750f = (TextView) view.findViewById(R.id.ao9);
        this.f95752h = (TextView) view.findViewById(R.id.ao4);
        this.f95756l = (ViewGroup) view.findViewById(R.id.abf);
        this.f95753i = (TextView) view.findViewById(R.id.a87);
        this.f95757m = (TextView) view.findViewById(R.id.e_2);
        if (C36074j.f94315a.isBigBriefIntroduce()) {
            this.f95757m.setTextSize(1, 15.0f);
            this.f95757m.setTextColor(C0683b.m2912c(getContext(), R.color.a5d));
        } else {
            this.f95757m.setTextSize(1, 12.0f);
            this.f95757m.setTextColor(C0683b.m2912c(getContext(), R.color.a5h));
        }
        this.f95751g = (DmtTextView) view.findViewById(R.id.d_f);
        this.f95758n = (TranslationStatusView) view.findViewById(R.id.dnl);
        this.f95755k = (ViewGroup) view.findViewById(R.id.ao6);
        this.f95754j = (ViewGroup) view.findViewById(R.id.aoa);
        this.f95759o = view.findViewById(R.id.ckd);
        this.f95760p = (TextView) view.findViewById(R.id.e9_);
        this.f95722U = (ViewStub) view.findViewById(R.id.dc_);
        mo92561u();
        this.f95717P = new C36718ah();
        this.f95768x = (SmartAvatarBorderView) view.findViewById(R.id.aus);
        this.f95769y = (LiveCircleView) view.findViewById(R.id.bnu);
        this.f95770z = (AnimationImageView) view.findViewById(R.id.j7);
        this.f95702A = (AnimationImageView) view.findViewById(R.id.j8);
        this.f95704C = (TextView) view.findViewById(R.id.c4a);
        this.f95705D = view.findViewById(R.id.ck9);
        if (C6399b.m19944t()) {
            if (this.f95705D instanceof DmtButton) {
                ((DmtButton) this.f95705D).setFontType(C10834d.f29337g);
            } else if (this.f95705D instanceof DmtTextView) {
                ((DmtTextView) this.f95705D).setFontType(C10834d.f29337g);
            }
        }
        this.f95703B = view.findViewById(R.id.le);
        this.f95707F = (LinearLayout) view.findViewById(R.id.dg3);
        this.f95708G = (TextView) view.findViewById(R.id.egn);
        this.f95709H = (TextView) view.findViewById(R.id.c9g);
        this.f95710I = (TextView) view.findViewById(R.id.afg);
        this.f95711J = (TextView) view.findViewById(R.id.ehc);
        this.f95712K = (FrameLayout) view.findViewById(R.id.ca9);
        this.f95714M = (BindAccountView) view.findViewById(R.id.mf);
        this.f95713L = view.findViewById(R.id.ckg);
        this.f95716O = new C36769z(this.f95707F);
        this.f95706E = (DmtTabLayout) view.findViewById(R.id.dfo);
        this.f95766v = view.findViewById(R.id.ahq);
        if (this.f95766v != null) {
            this.f95766v.clearFocus();
            this.f95766v.setFocusable(false);
            this.f95766v.setContentDescription(C6399b.m19921a().getString(R.string.d5v));
        }
        this.f95767w = (TextView) view.findViewById(R.id.bk);
        this.f95735aj = view.findViewById(R.id.bl);
        this.f95736ak = view.findViewById(R.id.bj);
        this.f95715N = (RemoteImageView) view.findViewById(R.id.in);
        this.f95761q = view.findViewById(R.id.a68);
        this.f95742aq = view.findViewById(R.id.afb);
        this.f95743ar = (NewYearWishLayout) view.findViewById(R.id.c42);
        this.f95721T = (ProfileStarRankView) view.findViewById(R.id.cks);
        if (!(this.f95766v == null || this.f95703B == null)) {
            this.f95763s = (float) (this.f95766v.getLayoutParams().height + ((MarginLayoutParams) this.f95703B.getLayoutParams()).topMargin);
        }
        this.f95727ab = (FrameLayout) view.findViewById(R.id.bj4);
        this.f95737al = (RemoteImageView) view.findViewById(R.id.azr);
        this.f95738am = (DmtTextView) view.findViewById(R.id.dzy);
        this.f95739an = (ImageView) view.findViewById(R.id.azq);
        this.f95740ao = (ImageView) view.findViewById(R.id.azs);
        mo92544j(view);
        mo92560t();
    }

    /* renamed from: b */
    public final void mo91708b(String str) {
        if (TextUtils.isEmpty(str) || this.f95746b == null || !TextUtils.isEmpty(this.f95746b.getEnterpriseVerifyReason()) || mo92722y()) {
            this.f95708G.setVisibility(8);
            this.f95708G.setText("");
            return;
        }
        this.f95708G.setVisibility(0);
        this.f95708G.setText(str);
    }

    /* renamed from: a */
    public void mo91701a(UrlModel urlModel) {
        if (urlModel != null && this.f95718Q.isViewValid()) {
            if (this.f95734ai == -1) {
                this.f95734ai = (int) C9738o.m28708b(getContext(), 100.0f);
            }
            C12133n.m35299a(C23400r.m76741a(urlModel)).mo29845a("AbsCommonHeaderLayout").mo29853b(C43012cg.m136513a(102)).mo29836a(this.f95734ai, this.f95734ai).mo29855c(true).mo29844a((C12128i) this.f95768x).mo29848a();
        }
    }

    /* renamed from: a */
    protected static void m117742a(View view, Drawable drawable) {
        if (view != null && VERSION.SDK_INT >= 23) {
            view.setForeground(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92638b(User user, View view) {
        new C10741a(getActivity()).mo25649a((int) R.string.bzo).mo25657b((int) R.string.bzm).mo25650a((int) R.string.bzn, (OnClickListener) new C36548p(this, user)).mo25656a().mo25637a();
        m117743b("click_link", "weblink");
    }

    /* renamed from: b */
    private void m117743b(String str, String str2) {
        String str3;
        String str4;
        String str5;
        if (C43122ff.m136787r(this.f95746b)) {
            str3 = "personal_homepage";
        } else {
            str3 = "others_homepage";
        }
        C22984d a = C22984d.m75611a().mo59973a("enter_from", str3).mo59973a("link_type", str2).mo59973a("scene_id", "1008");
        String str6 = "author_id";
        if (this.f95746b == null) {
            str4 = "0";
        } else {
            str4 = this.f95746b.getUid();
        }
        C22984d a2 = a.mo59973a(str6, str4);
        String str7 = "link";
        if (str2.equals("weblink")) {
            str5 = this.f95746b.getBioUrl();
        } else {
            str5 = this.f95746b.getBioEmail();
        }
        C6907h.m21524a(str, (Map) a2.mo59973a(str7, str5).f60753a);
    }

    /* renamed from: a */
    public void mo91699a(int i, String str) {
        if (this.f95718Q.isViewValid()) {
            if (!C6399b.m19944t()) {
                this.f95757m.setVisibility(0);
                if (!TextUtils.isEmpty(str)) {
                    this.f95757m.setText(str);
                } else if (i == 1 || i == 2) {
                    this.f95757m.setText(R.string.duo);
                } else {
                    this.f95757m.setVisibility(8);
                }
            } else if (TextUtils.isEmpty(str)) {
                this.f95757m.setText(R.string.dul);
            } else {
                while (str.contains("\n\n")) {
                    str = str.replaceAll("\n\n", "\n");
                }
                this.f95757m.setText(str);
            }
        }
    }

    /* renamed from: a */
    private static String m117741a(Context context, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (C6399b.m19944t()) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(str);
            sb.append("\" ");
            sb.append(context.getResources().getString(R.string.b8e));
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(context.getResources().getString(R.string.b8f));
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("\"");
            sb2.append(str);
            sb2.append("\"");
            sb2.append(context.getResources().getString(R.string.b8e));
            sb2.append(str2);
            sb2.append(context.getResources().getString(R.string.b8f));
            str3 = sb2.toString();
        }
        return str3;
    }

    public C36481a(Context context, TempBaseProfileFragment tempBaseProfileFragment, UserHeaderData userHeaderData, ProfileViewModel profileViewModel) {
        super(context);
        this.f95731af = profileViewModel;
        this.f95718Q = tempBaseProfileFragment;
        this.f95719R = userHeaderData;
        View a = C23147b.f61094a.mo60288a(getActivity(), getLayout(), context, (ViewGroup) this);
        addView(a);
        this.f95728ac = DataCenter.m75849a(C0069x.m157a((Fragment) tempBaseProfileFragment), (C0043i) tempBaseProfileFragment);
        this.f95729ad = WidgetManager.m75867a((Fragment) tempBaseProfileFragment, a);
        this.f95729ad.mo60153a(this.f95728ac);
        mo92531a(a);
        mo92535b(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo92537b(String str, int i, final BlueVBrandInfo blueVBrandInfo, final User user) {
        String str2;
        if (blueVBrandInfo == null || C6399b.m19944t() || blueVBrandInfo.getRank() <= 0 || blueVBrandInfo.getRank() > 30) {
            return false;
        }
        String str3 = "show_brand_list_entrance";
        C22984d a = C22984d.m75611a();
        String str4 = "enter_from";
        if (C43122ff.m136787r(user)) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59973a("author_id", user.getUid()).f60753a);
        String str5 = " T";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        ReplacementSpan rankingTagSpan = C36074j.f94315a.rankingTagSpan(blueVBrandInfo);
        int length = str.length() + 1;
        int length2 = str.length() + str5.length();
        spannableStringBuilder.setSpan(rankingTagSpan, length, length2, 33);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                String str;
                String str2 = "click_brand_list_entrance";
                C22984d a = C22984d.m75611a();
                String str3 = "enter_from";
                if (C43122ff.m136787r(user)) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("author_id", user.getUid()).f60753a);
                String uri = C33786f.m108941a((String) SharePrefCache.inst().getBrandScheme().mo59877d()).mo86195a("brand_category_id", String.valueOf(blueVBrandInfo.getCategoryId())).mo86194a().toString();
                if (!TextUtils.isEmpty(uri)) {
                    C7195s.m22438a().mo18682a(uri);
                }
            }
        }, length, length2, 33);
        this.f95704C.setMovementMethod(LinkMovementMethod.getInstance());
        int i2 = 144;
        if (getContext() != null) {
            float textSize = this.f95704C.getTextSize();
            int size = rankingTagSpan.getSize(this.f95704C.getPaint(), spannableStringBuilder, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), this.f95704C.getPaint().getFontMetricsInt());
            this.f95704C.getPaint().setTextSize(textSize);
            i2 = size;
        }
        this.f95704C.setText(C36074j.f94315a.ellipsizeText2ExceptWidth(spannableStringBuilder, this.f95704C.getPaint(), this.f95704C.getMeasuredWidth(), this.f95704C.getMaxLines(), 1, i2));
        return true;
    }
}
