package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.christmas.C29135b;
import com.p280ss.android.ugc.aweme.festival.christmas.FestivalHomePageView;
import com.p280ss.android.ugc.aweme.festival.christmas.model.C29138a;
import com.p280ss.android.ugc.aweme.festival.christmas.p1241a.C29134a;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36341a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36350as.C36351a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.C36580a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.profile.tab.MusProfileNavigator;
import com.p280ss.android.ugc.aweme.profile.tab.MusProfileNavigator.C36095a;
import com.p280ss.android.ugc.aweme.profile.tab.MusProfileTabImageView;
import com.p280ss.android.ugc.aweme.profile.tab.MusProfileTabView;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.setting.p337ui.C37897ax;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42919ag;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C43105eq;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusAbsProfileFragment */
public abstract class MusAbsProfileFragment extends BaseProfileFragment implements C29134a, C36095a {

    /* renamed from: W */
    protected TextView f94711W;

    /* renamed from: X */
    protected View f94712X;

    /* renamed from: Y */
    protected ProfileFragmentAdapter f94713Y;

    /* renamed from: Z */
    protected IUserService f94714Z;

    /* renamed from: aa */
    protected int f94715aa = -1;

    /* renamed from: ab */
    protected AnalysisStayTimeFragmentComponent f94716ab;

    /* renamed from: ac */
    protected TextView f94717ac;

    /* renamed from: ad */
    protected boolean f94718ad = false;

    /* renamed from: ae */
    protected TextView f94719ae;

    /* renamed from: af */
    protected View f94720af;

    /* renamed from: ag */
    public boolean f94721ag = false;

    /* renamed from: ah */
    protected C36341a f94722ah = new C36341a() {
        /* renamed from: a */
        public final void mo91881a(boolean z, int i) {
            if (MusAbsProfileFragment.this.mScrollableLayout != null) {
                MusAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            }
            if (i == 0 && MusAbsProfileFragment.this.f94528N == 0) {
                MusAbsProfileFragment.this.f94535U.mo93196a(true);
            }
        }

        /* renamed from: b */
        public final void mo91882b(boolean z, int i) {
            if (MusAbsProfileFragment.this.mScrollableLayout != null) {
                MusAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            }
            if (i == 0 && MusAbsProfileFragment.this.f94528N == 0) {
                MusAbsProfileFragment.this.f94535U.mo93196a(false);
            }
        }
    };

    /* renamed from: ai */
    float f94723ai = 0.0f;

    /* renamed from: aj */
    boolean f94724aj;

    /* renamed from: ak */
    protected long f94725ak = -1;

    /* renamed from: al */
    private String f94726al;

    /* renamed from: am */
    private ArrayList<Integer> f94727am = new ArrayList<>();

    /* renamed from: an */
    private View f94728an;

    /* renamed from: ao */
    private int f94729ao;

    /* renamed from: ap */
    private C29138a f94730ap;

    /* renamed from: aq */
    private boolean f94731aq = false;

    /* renamed from: ar */
    private int f94732ar = C23486n.m77122a(44.0d);

    /* renamed from: e */
    protected TextView f94733e;

    /* renamed from: f */
    protected TextView f94734f;

    /* renamed from: g */
    protected TextView f94735g;

    /* renamed from: h */
    MusAvatarWithBorderView f94736h;

    /* renamed from: i */
    ViewStub f94737i;

    /* renamed from: j */
    FestivalHomePageView f94738j;

    /* renamed from: k */
    SwipableViewPager f94739k;

    /* renamed from: l */
    public MusProfileNavigator f94740l;

    /* renamed from: m */
    TextView f94741m;

    /* renamed from: n */
    protected ImageView f94742n;

    /* renamed from: o */
    View f94743o;

    /* renamed from: p */
    View f94744p;

    /* renamed from: q */
    ImageView f94745q;

    /* renamed from: r */
    protected EnterpriseTransformLayout f94746r;

    /* renamed from: s */
    ViewGroup f94747s;

    /* renamed from: t */
    public C35481c f94748t;

    /* renamed from: u */
    protected View f94749u;

    /* renamed from: v */
    protected View f94750v;

    /* renamed from: w */
    protected View f94751w;

    /* renamed from: x */
    protected TextView f94752x;

    /* renamed from: P */
    private boolean mo92084P() {
        return this instanceof MusMyProfileFragment;
    }

    /* renamed from: n */
    public static String m116703n(int i) {
        switch (i) {
            case 1:
                return "instagram";
            case 2:
                return "youtube";
            case 3:
                return "twitter";
            default:
                return "";
        }
    }

    /* renamed from: b */
    public final void mo91708b(String str) {
    }

    /* renamed from: c */
    public final void mo91714c(boolean z) {
    }

    /* renamed from: d */
    public final void mo91718d(String str) {
    }

    /* renamed from: d */
    public final void mo91719d(boolean z) {
    }

    /* renamed from: e */
    public void mo91721e(int i) {
    }

    /* renamed from: g */
    public final void mo91728g(User user) {
    }

    /* renamed from: h */
    public final void mo91730h(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo91878j() {
        return true;
    }

    /* renamed from: k */
    public final List<Integer> mo91879k() {
        return this.f94516A;
    }

    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91873a(View view) {
        super.mo91873a(view);
        this.f94739k = (SwipableViewPager) view.findViewById(R.id.czl);
        this.f94739k.setOffscreenPageLimit(2);
        this.f94746r = (EnterpriseTransformLayout) view.findViewById(R.id.ckx);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusView.getLayoutParams().height = C10994a.m32204a((Context) getActivity());
        }
        this.f94750v = view.findViewById(R.id.bzz);
        this.f94749u = view.findViewById(R.id.c09);
        this.f94745q = (ImageView) view.findViewById(R.id.b99);
        this.f94747s = (ViewGroup) view.findViewById(R.id.a19);
        this.f94716ab = new AnalysisStayTimeFragmentComponent(this, mo91878j());
        this.f94716ab.f61328b = new C36357ay(this);
        mo92090i(view);
        this.f94729ao = getContext().getResources().getDimensionPixelOffset(R.dimen.mz);
    }

    /* renamed from: a */
    public void mo91700a(long j) {
        if (isViewValid()) {
            long b = m116698b(j);
            if (b < 0) {
                b = 0;
            }
            if (b > 1) {
                this.f94735g.setText(R.string.cdf);
            } else {
                this.f94735g.setText(R.string.cde);
            }
            this.f94530P = C30537o.m99738a(b);
            this.f94521F.setText(this.f94530P);
        }
    }

    /* renamed from: a */
    public void mo91699a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            this.f94522G.setVisibility(8);
            return;
        }
        this.f94522G.setVisibility(0);
        if (!C43122ff.m136787r(this.f94531Q) || !C43122ff.m136767b()) {
            super.mo91699a(i, str);
        } else {
            this.f94522G.setText(R.string.dum);
        }
    }

    /* renamed from: a */
    public void mo91703a(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        if (isViewValid()) {
            this.mTitle.setText(str);
            this.f94726al = str;
        }
    }

    /* renamed from: a */
    public void mo91702a(User user) {
        super.mo91702a(user);
        this.f94531Q = user;
        if (C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q))) {
            this.f94739k.mo92341a();
            this.f94740l.mo91833a(0).setSelected(false);
        }
        mo92127o(this.f94531Q);
        mo92055i(this.f94531Q);
    }

    /* renamed from: a */
    public void mo91701a(UrlModel urlModel) {
        if (C7188c.m22428a()) {
            m116700c(urlModel);
        } else {
            m116699b(urlModel);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92049a(User user, View view) {
        new C10741a(getActivity()).mo25649a((int) R.string.bzo).mo25657b((int) R.string.bzm).mo25650a((int) R.string.bzn, (OnClickListener) new C36366bg(this, user)).mo25656a().mo25637a();
        C36580a.m118030a("weblink", this.f94531Q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92048a(User user, DialogInterface dialogInterface, int i) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).switchToBioUrl(getActivity(), user.getBioUrl());
    }

    /* renamed from: a */
    public final void mo92047a(Bundle bundle) {
        if (C43122ff.m136767b()) {
            C10761a.m31410e(getContext(), getString(R.string.a3c)).mo25750a();
            return;
        }
        ProfileEditActivity.m117085a(getActivity(), bundle);
        SharePrefCache.inst().getIsProfileBubbleShown().mo59871a(Boolean.valueOf(false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo92044I() {
        this.f94725ak = System.currentTimeMillis();
    }

    public void onResume() {
        super.onResume();
        mo92044I();
    }

    /* renamed from: H */
    protected static int m116685H() {
        if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
            return R.drawable.ajm;
        }
        return R.drawable.bks;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo91875g() {
        super.mo91875g();
        this.f94736h.setOnClickListener(this);
        mo92043G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo92056l() {
        return C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q));
    }

    /* renamed from: n */
    public final int mo92058n() {
        if (this.f94730ap == null) {
            return 0;
        }
        return this.f94730ap.f76894e;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f94748t != null) {
            this.f94748t.mo90269d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo92068t() {
        if (this.f94531Q == null || this.f94531Q.getShowArtistPlaylist() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private void mo92081M() {
        if (C43122ff.m136767b()) {
            C23487o.m77146a(false, this.f94743o, this.f94744p);
        }
    }

    /* renamed from: N */
    private void mo92082N() {
        if (af_() && this.f94721ag) {
            this.f94736h.setImageURI("");
            this.f94721ag = false;
        }
    }

    /* renamed from: o */
    public void mo92060o() {
        if (isViewValid()) {
            mo92082N();
            this.mScrollableLayout.mo66843a();
            this.f94739k.setCurrentItem(0, false);
        }
    }

    /* renamed from: K */
    private void mo92079K() {
        String bioEmail = this.f94531Q.getBioEmail();
        if (!TextUtils.isEmpty(bioEmail)) {
            StringBuilder sb = new StringBuilder("mailto:");
            sb.append(bioEmail);
            try {
                getActivity().startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(sb.toString())));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: L */
    private void mo92080L() {
        if (C43122ff.m136767b()) {
            C23487o.m77146a(false, this.f94522G, this.f94751w, this.f94728an, this.f94720af);
            if (this.f94524J != null) {
                this.f94524J.setPadding(0, 0, 0, 0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void mo92083O() {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openWallet(getActivity());
        C6907h.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
    }

    /* renamed from: a */
    private void mo91872a() {
        String bioSecureUrl = this.f94531Q.getBioSecureUrl();
        if (!TextUtils.isEmpty(bioSecureUrl)) {
            Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
            intent.setData(Uri.parse(bioSecureUrl));
            getActivity().startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo92045J() {
        String str;
        if (this.f94725ak > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f94725ak;
            if (currentTimeMillis > 0) {
                if (mo92084P()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C1592h.m7855a((Callable<TResult>) new C36365bf<TResult>(str, currentTimeMillis, this.f94528N), (Executor) C6907h.m21516a());
            }
            this.f94725ak = -1;
        }
    }

    /* renamed from: p */
    public void mo92065p() {
        if (isViewValid()) {
            mo91711c(0);
            mo91716d(0);
            mo91699a(0, "");
            mo91706b((User) null);
            mo91708b((String) null);
            if (this.f94523H != null) {
                this.f94523H.setVisibility(8);
            }
            this.f94742n.setVisibility(8);
            this.mScrollableLayout.mo66843a();
            this.f94739k.setCurrentItem(0, false);
        }
    }

    /* renamed from: q */
    public final void mo92066q() {
        if (this.f94736h != null && this.f94736h.getController() != null) {
            Animatable j = this.f94736h.getController().mo32721j();
            if (j != null) {
                if (this.mUserVisibleHint && !j.isRunning()) {
                    j.start();
                } else if (!this.mUserVisibleHint && j.isRunning()) {
                    j.stop();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo92043G() {
        int i;
        if (this.f94740l.getTabCount() >= 2 && (this.f94740l.mo91833a(this.f94516A.indexOf(Integer.valueOf(1))) instanceof MusProfileTabImageView)) {
            MusProfileTabImageView musProfileTabImageView = (MusProfileTabImageView) this.f94740l.mo91833a(this.f94516A.indexOf(Integer.valueOf(1)));
            if (((Integer) C23060u.m75742a().mo60075e().mo59877d()).intValue() == 0 || !C43122ff.m136787r(this.f94531Q)) {
                i = R.drawable.ajn;
            } else {
                i = m116685H();
            }
            musProfileTabImageView.setImageResource(i);
        }
    }

    /* renamed from: i */
    public void mo91877i() {
        if (this.f94531Q == null) {
            mo91946e(getUserId());
        } else {
            mo91952m(this.f94531Q);
        }
        this.f94713Y = new ProfileFragmentAdapter(getChildFragmentManager(), this.f94540z, mo91879k());
        this.f94739k.setAdapter(this.f94713Y);
        this.f94740l.mo91836a(this.f94739k, mo92068t(), this instanceof MusMyProfileFragment, this);
        onPageSelected(this.f94528N);
        this.f94739k.setCurrentItem(this.f94528N);
        this.f94739k.addOnPageChangeListener(this);
    }

    /* renamed from: m */
    public final void mo92057m() {
        if (this.f94531Q != null && getContext() != null && isViewValid()) {
            if (C43122ff.m136783n(this.f94531Q)) {
                C36074j.f94315a.onI18nVerificationViewClick(getContext(), this.f94531Q, C36074j.f94315a.typeVerificationEnterprise(), this.f94527M);
            } else {
                C36074j.f94315a.onI18nVerificationViewClick(getContext(), this.f94531Q, String.valueOf(this.f94531Q.getVerificationType()), this.f94527M);
            }
        }
    }

    /* renamed from: s */
    public void mo92067s() {
        ArrayList arrayList;
        C6907h.m21524a("enter_setting_page", (Map) C22984d.m75611a().mo59973a("previous_page", "personal_homepage").mo59973a("enter_method", "click_button").f60753a);
        C19282c.m63182a(getActivity(), "set", "personal_homepage");
        if (this.f94540z != null && this.f94540z.size() > 0) {
            if (this.f94713Y.mo92304g(0) instanceof C36340al) {
                arrayList = ((C36340al) this.f94713Y.mo92304g(0)).mo90852x();
            } else {
                arrayList = null;
            }
            C28479b.m93595a((List<Aweme>) arrayList);
        }
        if (C43122ff.m136767b()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).enterChildrenModeSetting(getActivity());
        } else {
            C7195s.m22438a().mo18679a((Activity) getActivity(), C7203u.m22460a("aweme://setting").mo18695a());
        }
    }

    /* renamed from: u */
    public final void mo92069u() {
        String str;
        int size = this.f94727am.size();
        if (size == 1) {
            int intValue = ((Integer) this.f94727am.get(0)).intValue();
            mo92061o(intValue);
            String str2 = "click_social_account";
            C22984d a = C22984d.m75611a();
            String str3 = "enter_from";
            if (C6861a.m21337f().isMe(this.f94531Q.getUid())) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("platform", m116703n(intValue)).f60753a);
        } else if (size > 1 && getContext() != null && this.f94531Q != null) {
            C1081a aVar = new C1081a(getContext());
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!TextUtils.isEmpty(this.f94531Q.getInsId())) {
                arrayList.add(Integer.valueOf(1));
                arrayList2.add(getContext().getString(R.string.cf8, new Object[]{this.f94531Q.getInsId()}));
            }
            if (!TextUtils.isEmpty(this.f94531Q.getYoutubeChannelId())) {
                arrayList.add(Integer.valueOf(2));
                arrayList2.add(getContext().getString(R.string.cf9, new Object[]{this.f94531Q.getYoutubeChannelTitle()}));
            }
            if (C6399b.m19947w() && !TextUtils.isEmpty(this.f94531Q.getTwitterId())) {
                arrayList.add(Integer.valueOf(3));
                arrayList2.add(C1642a.m8034a("Twitter: %s", new Object[]{this.f94531Q.getTwitterName()}));
            }
            aVar.mo4236a((CharSequence[]) arrayList2.toArray(new String[0]), (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    String str;
                    if (i < arrayList.size()) {
                        int intValue = ((Integer) arrayList.get(i)).intValue();
                        MusAbsProfileFragment.this.mo92061o(intValue);
                        String str2 = "click_social_account";
                        C22984d a = C22984d.m75611a();
                        String str3 = "enter_from";
                        if (C6861a.m21337f().isMe(MusAbsProfileFragment.this.f94531Q.getUid())) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("platform", MusAbsProfileFragment.m116703n(intValue)).f60753a);
                    }
                }
            });
            C42951au.m136342a(aVar.mo4242b());
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        mo92066q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C33248at mo92046a(C33248at atVar) {
        return atVar.mo85071g(AwemeChangeCallBack.m106763a(getActivity()));
    }

    /* renamed from: b */
    public void mo91705b(int i) {
        if (i < 0) {
            i = 0;
        }
        super.mo91705b((int) m116698b((long) i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo92051e(View view) {
        mo91872a();
        C36580a.m118030a("weblink", this.f94531Q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo92054h(View view) {
        mo91872a();
        C36580a.m118030a("weblink", this.f94531Q);
    }

    /* renamed from: b */
    private long m116698b(long j) {
        if (!C43122ff.m136787r(this.f94531Q) || !C43122ff.m136767b()) {
            return j;
        }
        return 0;
    }

    /* renamed from: c */
    public void mo91713c(String str) {
        if (isViewValid() && this.f94525K != null) {
            StringBuilder sb = new StringBuilder("@");
            sb.append(str);
            this.f94525K.setText(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo92053g(View view) {
        mo92079K();
        C36580a.m118030a("email", this.f94531Q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo91948k(User user) {
        super.mo91948k(user);
        this.f94523H.setLoadingDrawable(R.drawable.aly);
        this.f94523H.setTextColor(R.color.a4z);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f94714Z = (IUserService) ServiceManager.get().getService(IUserService.class);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f94716ab != null) {
            this.f94716ab.mo60573a(z);
        }
        if (z) {
            mo92045J();
            return;
        }
        mo92044I();
        if (this.f94746r != null) {
            this.f94746r.mo92004b();
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(C37897ax axVar) {
        if (TextUtils.equals(this.f94531Q.getUid(), C21115b.m71197a().getCurUserId())) {
            mo92043G();
        }
    }

    /* renamed from: b */
    private void m116699b(UrlModel urlModel) {
        if (!(!af_() || urlModel == null || this.f94531Q == null)) {
            UrlModel avatarVideoUri = this.f94531Q.getAvatarVideoUri();
            if (avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0 || !C6399b.m19946v()) {
                C23323e.m76524b(this.f94736h, urlModel);
            } else {
                C23323e.m76510a((RemoteImageView) this.f94736h, avatarVideoUri, (C13401d<C13648f>) new C13400c<C13648f>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                        MusAbsProfileFragment.this.mo92066q();
                    }
                }, false);
            }
        }
    }

    /* renamed from: i */
    private void mo92090i(View view) {
        if (C29132a.m95560a() && !this.f94731aq) {
            this.f94737i = (ViewStub) view.findViewById(R.id.ef4);
            if (this.f94737i != null && this.f94738j == null) {
                this.f94738j = (FestivalHomePageView) this.f94737i.inflate();
                this.f94738j.setVisibility(8);
                this.f94738j.setOnClickListener(new C36362bc(this));
                this.f94737i = null;
            }
        }
    }

    /* renamed from: o */
    private void mo92127o(User user) {
        TextView textView;
        boolean z;
        if (isViewValid()) {
            int i = 8;
            if (!C43122ff.m136787r(this.f94531Q) || this.f94718ad) {
                textView = this.f94752x;
            } else {
                String customVerify = user.getCustomVerify();
                if (TextUtils.isEmpty(customVerify) || TextUtils.equals("verified", customVerify)) {
                    z = false;
                } else {
                    z = true;
                }
                textView = this.f94752x;
                if (!z) {
                    i = 0;
                }
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: d */
    public final void mo91716d(int i) {
        if (isViewValid() && this.f94740l.getTabCount() >= 2) {
            MusProfileTabView musProfileTabView = (MusProfileTabView) this.f94740l.mo91833a(this.f94516A.indexOf(Integer.valueOf(1)));
            if (C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q))) {
                musProfileTabView.setClickable(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo91925h(User user) {
        int indexOf = this.f94516A.indexOf(Integer.valueOf(mo91951m(C43122ff.m136776g(user))));
        if (indexOf < 0) {
            indexOf = 0;
        }
        int min = Math.min(this.f94713Y.getCount() - 1, indexOf);
        if (this.f94739k.getCurrentItem() != min) {
            this.f94739k.setCurrentItem(min, false);
        }
        onPageSelected(min);
    }

    /* renamed from: j */
    public final void mo91847j(int i) {
        String str;
        String a = C43105eq.m136725a(i);
        if (mo92084P()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C6907h.m21524a("change_profile_tab", (Map) new C22984d().mo59973a("enter_from", str).mo59973a("enter_method", "click").mo59973a("tab_name", a).f60753a);
        this.f94724aj = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo92059n(User user) {
        if (user != null && this.f94742n != null) {
            if (!TextUtils.isEmpty(user.getTwitterId())) {
                this.f94742n.setImageResource(R.drawable.az1);
            }
            if (!TextUtils.isEmpty(user.getYoutubeChannelId())) {
                this.f94742n.setImageResource(R.drawable.az3);
            }
            if (!TextUtils.isEmpty(user.getInsId())) {
                this.f94742n.setImageResource(R.drawable.ayr);
            }
        }
    }

    /* renamed from: c */
    private void m116700c(UrlModel urlModel) {
        if (af_() && urlModel != null && this.f94531Q != null && !this.f94721ag && this.mUserVisibleHint) {
            UrlModel avatarVideoUri = this.f94531Q.getAvatarVideoUri();
            if (avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0 || !C6399b.m19946v()) {
                C23323e.m76509a((RemoteImageView) this.f94736h, urlModel, (C13401d<C13648f>) new C13400c<C13648f>() {
                    public final void onFailure(String str, Throwable th) {
                        super.onFailure(str, th);
                        MusAbsProfileFragment.this.f94721ag = false;
                    }
                });
            } else {
                C23323e.m76510a((RemoteImageView) this.f94736h, avatarVideoUri, (C13401d<C13648f>) new C13400c<C13648f>() {
                    public final void onFailure(String str, Throwable th) {
                        super.onFailure(str, th);
                        MusAbsProfileFragment.this.f94721ag = false;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                        MusAbsProfileFragment.this.mo92066q();
                    }
                }, false);
            }
            this.f94721ag = true;
        }
    }

    /* renamed from: j */
    private void mo92125j(View view) {
        this.f94743o = view.findViewById(R.id.c2m);
        this.f94744p = view.findViewById(R.id.aiz);
        View findViewById = view.findViewById(R.id.aiy);
        if (getContext() != null && VERSION.SDK_INT >= 23) {
            try {
                findViewById.setForeground(getContext().getResources().getDrawable(R.drawable.ug));
            } catch (NullPointerException unused) {
            }
        }
        this.f94743o.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).enterMyFavorites(MusAbsProfileFragment.this.getActivity(), C42914ab.m136242a().mo104633a("enter_from", "personal_homepage").mo104633a("enter_method", "click_button").f111445a);
                SharePrefCache.inst().getShouldShowFavouriteTip().mo59871a(Boolean.valueOf(false));
                MusAbsProfileFragment.this.f94744p.setVisibility(8);
            }
        });
        mo92081M();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo92052f(View view) {
        Uri uri;
        C30221c g = C29132a.m95572g();
        if (g != null && !TextUtils.isEmpty(g.f79513c)) {
            C36580a.m118028a(this.f94531Q);
            String str = null;
            if ((this instanceof MusUserProfileFragment) && this.f94531Q != null && !C6861a.m21337f().isMe(this.f94531Q.getUid())) {
                str = this.f94531Q.getUid();
            }
            if (!TextUtils.isEmpty(str)) {
                uri = Uri.parse(g.f79513c).buildUpon().appendQueryParameter("uid", str).build();
            } else {
                uri = Uri.parse(g.f79513c);
            }
            C29135b.m95580a(getContext(), uri.toString());
        }
    }

    /* renamed from: o */
    public final void mo92061o(int i) {
        if (this.f94531Q != null) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).startThirdSocialActivity(getContext(), this.f94531Q, i);
        }
    }

    public void onMore(View view) {
        final boolean z = !C41990e.m133508b();
        C25712a aVar = new C25712a(getActivity());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C36351a(getResources().getString(R.string.ay3), !C6887b.m21436b().mo16909b((Context) getActivity(), "is_show_profile_yellow_point", false)));
        if (z) {
            arrayList.add(new C36351a(getResources().getString(R.string.cee), false));
        }
        arrayList.add(new C36351a(getResources().getString(R.string.dn5), false));
        aVar.mo66613a((ListAdapter) new C36350as(getActivity(), arrayList), (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (!C21115b.m71197a().isLogin()) {
                    C32656f.m105746a((Fragment) MusAbsProfileFragment.this, "personal_homepage", "click_more_setting");
                    return;
                }
                if (i == 0) {
                    if (!C6887b.m21436b().mo16909b((Context) MusAbsProfileFragment.this.getActivity(), "is_show_profile_yellow_point", false)) {
                        MusAbsProfileFragment.this.f94749u.setVisibility(8);
                        C6887b.m21436b().mo16902a((Context) MusAbsProfileFragment.this.getActivity(), "is_show_profile_yellow_point", true);
                    }
                    MusAbsProfileFragment.this.mo92047a((Bundle) null);
                } else if (z) {
                    if (i == 1) {
                        MusAbsProfileFragment.this.mo92083O();
                    } else if (i == 2) {
                        MusAbsProfileFragment.this.mo92067s();
                    }
                } else if (i == 1) {
                    MusAbsProfileFragment.this.mo92067s();
                }
                dialogInterface.dismiss();
            }
        });
        try {
            aVar.mo66615b();
        } catch (NotFoundException e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo92050b(View view) {
        int i;
        try {
            C42919ag.m136264a("user_id", view.getContext(), this.f94525K.getText().toString());
            Context context = view.getContext();
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

    /* renamed from: c */
    public void mo91711c(int i) {
        int i2;
        if (isViewValid() && this.f94740l.getTabCount() > 0) {
            MusProfileTabView musProfileTabView = (MusProfileTabView) this.f94740l.mo91833a(this.f94516A.indexOf(Integer.valueOf(0)));
            if (C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q))) {
                musProfileTabView.setClickable(false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" ");
            if (i > 1) {
                i2 = R.string.cgf;
            } else {
                i2 = R.string.cge;
            }
            sb.append(getString(i2));
            this.f94752x.setText(sb.toString());
        }
    }

    /* renamed from: d */
    public void mo91717d(User user) {
        if (user != null) {
            this.f94718ad = true;
            this.f94741m.setVisibility(8);
            this.f94719ae.setVisibility(8);
            this.f94717ac.setVisibility(8);
            this.f94752x.setVisibility(8);
            if (user.getVerificationType() == 2) {
                this.f94718ad = true;
                this.f94719ae.setVisibility(0);
            } else if (!TextUtils.isEmpty(user.getEnterpriseVerifyReason())) {
                this.f94717ac.setVisibility(0);
            } else if (!TextUtils.isEmpty(user.getCustomVerify())) {
                this.f94741m.setVisibility(0);
            } else {
                this.f94718ad = false;
            }
            if (!TextUtils.isEmpty(user.getEnterpriseVerifyReason())) {
                this.f94719ae.setText(user.getEnterpriseVerifyReason());
                this.f94717ac.setText(user.getEnterpriseVerifyReason());
                this.f94741m.setText(user.getEnterpriseVerifyReason());
            } else if (!TextUtils.isEmpty(user.getCustomVerify())) {
                this.f94719ae.setText(user.getCustomVerify());
                this.f94717ac.setText(user.getCustomVerify());
                this.f94741m.setText(user.getCustomVerify());
            }
            mo92127o(user);
            mo91926j(user);
        }
    }

    /* renamed from: e */
    public void mo91722e(User user) {
        if (isViewValid() && user != null) {
            if (C43122ff.m136772c(user, C43122ff.m136787r(this.f94531Q))) {
                this.f94742n.setVisibility(8);
                return;
            }
            this.f94727am.clear();
            if (C6399b.m19947w() && !TextUtils.isEmpty(user.getTwitterId())) {
                this.f94727am.add(Integer.valueOf(3));
                this.f94742n.setVisibility(0);
                this.f94742n.setImageResource(R.drawable.az1);
            }
            if (!TextUtils.isEmpty(user.getYoutubeChannelId())) {
                this.f94727am.add(Integer.valueOf(2));
                this.f94742n.setVisibility(0);
                this.f94742n.setImageResource(R.drawable.az3);
            }
            if (!TextUtils.isEmpty(user.getInsId())) {
                this.f94727am.add(Integer.valueOf(1));
                this.f94742n.setVisibility(0);
                this.f94742n.setImageResource(R.drawable.ayq);
            }
            if (this.f94727am.size() == 0) {
                this.f94742n.setVisibility(8);
                return;
            }
            this.f94742n.setVisibility(0);
            this.f94742n.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    MusAbsProfileFragment.this.mo92069u();
                }
            });
        }
    }

    /* renamed from: i */
    public final void mo91846i(int i) {
        String str;
        String a = C43105eq.m136725a(i);
        if (this.f94724aj) {
            this.f94724aj = false;
            return;
        }
        if (mo92084P()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C6907h.m21524a("change_profile_tab", (Map) new C22984d().mo59973a("enter_from", str).mo59973a("enter_method", "slide").mo59973a("tab_name", a).f60753a);
    }

    public void onClick(View view) {
        if (!C36367bh.m117618a(getActivity())) {
            C9738o.m28693a((Context) getActivity(), (int) R.string.cjs);
            return;
        }
        int id = view.getId();
        if (id == R.id.aus) {
            if (!C27326a.m89578a(view)) {
                mo91938D();
            }
        } else if (id == R.id.ao6) {
            if (!C27326a.m89578a(view)) {
                if (!C21115b.m71197a().isLogin()) {
                    C32656f.m105746a((Fragment) this, "personal_homepage", "follower_list");
                } else if (C43122ff.m136792w(this.f94531Q) || !C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q)) || this.f94518C <= 0) {
                    mo91937B();
                }
            }
        } else if (id != R.id.aoa) {
            if (id == R.id.abf) {
                mo92109a(this.f94530P, this.f94726al);
            }
        } else if (!C27326a.m89578a(view)) {
            if (!C21115b.m71197a().isLogin()) {
                C32656f.m105746a((Fragment) this, "personal_homepage", "following_list");
            } else if (C43122ff.m136792w(this.f94531Q) || !C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q)) || this.f94517B <= 0) {
                mo91936A();
            }
        }
    }

    public void onPageSelected(int i) {
        if (this.f94540z != null && i >= 0 && i < this.f94540z.size() && this.mScrollableLayout != null) {
            if (i != this.f94528N && this.f94528N >= 0 && this.f94528N < this.f94540z.size() && this.f94540z.get(this.f94528N) != null) {
                ((ProfileListFragment) this.f94540z.get(this.f94528N)).setUserVisibleHint(false);
            }
            mo92045J();
            this.f94528N = i;
            this.f94535U.mo93192a(((Integer) this.f94516A.get(this.f94528N)).intValue());
            mo92044I();
            this.mScrollableLayout.getHelper().f68075b = (C25766a) this.f94540z.get(i);
            this.mScrollableLayout.setCanScrollUp(true);
            if (i == 0) {
                if (mo91957y()) {
                    C6907h.m21517a((Context) getActivity(), "slide_left", "personal_homepage", 0, 0);
                }
            } else if (i == 1) {
                if (mo91957y()) {
                    C6907h.m21517a((Context) getActivity(), "slide_right", "personal_homepage", 0, 0);
                }
            } else if (i == 2 && mo91957y()) {
                C6907h.m21517a((Context) getActivity(), "slide_right", "personal_homepage", 0, 0);
            }
            if (!(this.f94713Y == null || this.f94739k == null)) {
                int count = this.f94713Y.getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    ProfileListFragment profileListFragment = (ProfileListFragment) this.f94713Y.mo2423a(i2);
                    if (!(profileListFragment == null || profileListFragment.mFragmentManager == null)) {
                        if (i2 == i) {
                            profileListFragment.setUserVisibleHint(true);
                        } else {
                            profileListFragment.setUserVisibleHint(false);
                        }
                        profileListFragment.aT_();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m116697a(View... viewArr) {
        for (int i = 0; i < 3; i++) {
            viewArr[i].setOnTouchListener(new C27009an() {
                /* renamed from: b */
                public final void mo67959b(View view, MotionEvent motionEvent) {
                    MusAbsProfileFragment.this.mo92057m();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo91944c(View view) {
        super.mo91944c(view);
        if (C6399b.m19946v()) {
            view.setBackgroundColor(getContext().getResources().getColor(R.color.aye));
        }
        this.f94733e = (TextView) view.findViewById(R.id.ao_);
        this.f94734f = (TextView) view.findViewById(R.id.ao5);
        this.f94735g = (TextView) view.findViewById(R.id.a88);
        this.f94736h = (MusAvatarWithBorderView) view.findViewById(R.id.aus);
        this.f94736h.setBorderColor(R.color.a5o);
        this.f94736h.mo60914a(true, false);
        this.f94740l = (MusProfileNavigator) view.findViewById(R.id.ckj);
        this.f94751w = view.findViewById(R.id.c2o);
        this.f94525K.setOnClickListener(new C36358az(this));
        this.f94741m = (TextView) view.findViewById(R.id.k8);
        this.f94742n = (ImageView) view.findViewById(R.id.me);
        this.f94752x = (TextView) view.findViewById(R.id.c2_);
        this.f94717ac = (TextView) view.findViewById(R.id.afg);
        this.f94719ae = (TextView) view.findViewById(R.id.c2a);
        this.f94728an = view.findViewById(R.id.e_7);
        this.f94720af = view.findViewById(R.id.cre);
        m116697a(this.f94741m, this.f94717ac, this.f94719ae);
        this.f94751w.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C6907h.m21524a("enter_profile_edit", (Map) C22984d.m75611a().mo59973a("enter_method", "click_edit_profile").f60753a);
                MusAbsProfileFragment.this.mo92047a((Bundle) null);
            }
        });
        mo92080L();
        mo92125j(view);
        this.f94711W = (TextView) view.findViewById(R.id.e_9);
        this.f94711W.setOnClickListener(new C36360ba(this));
        this.f94712X = view.findViewById(R.id.e92);
        this.f94712X.setOnClickListener(new C36361bb(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo92055i(User user) {
        if (C29132a.m95560a() && this.f94745q != null) {
            if (user.isActivityUser()) {
                Drawable j = C29125d.m95531j();
                if (j != null) {
                    this.f94745q.setVisibility(0);
                    this.f94745q.setImageDrawable(j);
                } else {
                    this.f94745q.setVisibility(8);
                }
            } else {
                this.f94745q.setVisibility(8);
            }
        }
    }

    /* renamed from: j */
    public void mo91926j(User user) {
        if (user != null && isViewValid()) {
            if (TextUtils.isEmpty(user.getBioEmail())) {
                this.f94712X.setVisibility(8);
            } else {
                this.f94712X.setVisibility(0);
                m116694a(this.f94712X, user);
            }
            if (TextUtils.isEmpty(user.getBioUrl())) {
                this.f94711W.setVisibility(8);
            } else {
                this.f94711W.setVisibility(0);
                if (VERSION.SDK_INT >= 17) {
                    this.f94711W.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    this.f94711W.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                if (!C6861a.m21337f().isLogin() || !C43122ff.m136787r(user) || !TextUtils.isEmpty(user.getBioSecureUrl())) {
                    this.f94711W.setText(user.getBioUrl());
                    this.f94711W.setTextColor(getContext().getResources().getColor(R.color.a4r));
                    this.f94711W.setOnClickListener(new C36364be(this));
                } else {
                    if (VERSION.SDK_INT >= 17) {
                        this.f94711W.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ve, 0, 0, 0);
                    } else {
                        this.f94711W.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ve, 0, 0, 0);
                    }
                    this.f94711W.setCompoundDrawablePadding((int) C9738o.m28708b(getContext(), 4.0f));
                    this.f94711W.setText(R.string.bzo);
                    this.f94711W.setTextColor(getContext().getResources().getColor(R.color.a14));
                    this.f94711W.setOnClickListener(new C36363bd(this, user));
                }
            }
            if (!C43122ff.m136787r(user)) {
                if (this.f94712X != null && this.f94712X.getVisibility() == 0) {
                    C36580a.m118031a("others_homepage", "email", user);
                }
                if (this.f94711W != null && this.f94711W.getVisibility() == 0) {
                    C36580a.m118031a("others_homepage", "weblink", user);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo91697a(int i) {
        if (i < 0) {
            i = 0;
        }
        super.mo91697a((int) m116698b((long) i));
    }

    /* renamed from: a */
    private void m116694a(View view, User user) {
        if (view instanceof TextView) {
            ((TextView) this.f94712X).setText(user.getBioEmail());
            ((TextView) this.f94712X).setTextColor(getContext().getResources().getColor(R.color.a4r));
        }
    }

    /* renamed from: b */
    public void mo61702b(int i, int i2) {
        if (this.f94723ai == 0.0f) {
            this.f94723ai = (float) (this.f94524J.getBottom() - this.mScrollableLayout.getTabsMarginTop());
        }
        if (this.f94540z != null && !this.f94540z.isEmpty() && this.mScrollableLayout != null) {
            this.mScrollableLayout.setCanScrollUp(true);
        }
    }

    /* renamed from: a */
    private void mo92109a(String str, String str2) {
        String str3;
        if (C6399b.m19944t()) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(str2);
            sb.append("\" ");
            sb.append(getContext().getResources().getString(R.string.b8e));
            sb.append(" ");
            sb.append(str);
            sb.append(" ");
            sb.append(getContext().getResources().getString(R.string.b8f));
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("\"");
            sb2.append(str2);
            sb2.append("\"");
            sb2.append(getContext().getResources().getString(R.string.b8e));
            sb2.append(str);
            sb2.append(getContext().getResources().getString(R.string.b8f));
            str3 = sb2.toString();
        }
        new C10741a(getActivity()).mo25660b(str3).mo25649a((int) R.string.fs6).mo25650a((int) R.string.cdc, (OnClickListener) null).mo25664d(-3476230).mo25663c(R.drawable.b86).mo25662b(true).mo25656a().mo25638b();
        MobClick eventName = MobClick.obtain().setEventName("click_like_count");
        eventName.setLabelName("others_homepage");
        C6907h.onEvent(eventName);
    }

    /* renamed from: a */
    public void mo61694a(float f, float f2) {
        if (isViewValid() && this.f94540z != null && !this.f94540z.isEmpty() && this.mScrollableLayout != null) {
            this.mScrollableLayout.setCanScrollUp(true);
        }
    }
}
