package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11500c;
import com.bytedance.jedi.arch.C11674x;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p612c.C12105c;
import com.bytedance.lighten.core.p612c.C12112j;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24463b;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24473g;
import com.p280ss.android.ugc.aweme.commerce.service.models.C24487e;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24449a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24573m;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25243ap;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.experiment.C27691f;
import com.p280ss.android.ugc.aweme.experiment.CleanUpInvalidVideosExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28442a;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowRelationTabActivity;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowingFollowerActivity.C29667a;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32616a;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.experiment.EditProfileOptimizationStyle;
import com.p280ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.ShopUserMessage;
import com.p280ss.android.ugc.aweme.profile.model.ShopUserMessageModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35666d;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseDTProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.profile.p1487ui.HeaderDetailActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileCoverPreviewActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileTabView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.RecommendPointView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36658a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.SetNicknameDialog;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36006af;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.presenter.C36044r;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.profile.util.C36727al;
import com.p280ss.android.ugc.aweme.profile.util.C36728am;
import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42982bn;
import com.p280ss.android.ugc.aweme.utils.C43086eb;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43150p;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout */
public abstract class AbsMyCommonHeaderLayout extends C36481a implements C36039m, C36044r, C36046t {

    /* renamed from: aC */
    private static boolean f95663aC;

    /* renamed from: aA */
    private BaseProfileFragment f95664aA;

    /* renamed from: aB */
    private boolean f95665aB = ((Boolean) SharePrefCache.inst().getShowFansCard().mo59877d()).booleanValue();

    /* renamed from: aD */
    private C35999a f95666aD;

    /* renamed from: aE */
    private C36011ai f95667aE;

    /* renamed from: aF */
    private C36006af f95668aF;

    /* renamed from: aG */
    private int f95669aG = 0;

    /* renamed from: aH */
    private int f95670aH = 0;

    /* renamed from: aI */
    private int f95671aI = 0;

    /* renamed from: aj */
    TextView f95672aj;

    /* renamed from: ak */
    RecommendPointView f95673ak;

    /* renamed from: al */
    DmtTextView f95674al;

    /* renamed from: am */
    AnimationImageView f95675am;

    /* renamed from: an */
    View f95676an;

    /* renamed from: ao */
    View f95677ao;

    /* renamed from: ap */
    protected View f95678ap;

    /* renamed from: aq */
    TextView f95679aq;

    /* renamed from: ar */
    ImageView f95680ar;

    /* renamed from: as */
    TextView f95681as;

    /* renamed from: at */
    protected View f95682at;

    /* renamed from: au */
    View f95683au;

    /* renamed from: av */
    protected C32961dd f95684av;

    /* renamed from: aw */
    private C36658a f95685aw;

    /* renamed from: ax */
    private int f95686ax;

    /* renamed from: ay */
    private View f95687ay;

    /* renamed from: az */
    private View f95688az;

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    /* renamed from: e */
    public final void mo91720e() {
        super.mo91720e();
    }

    /* access modifiers changed from: protected */
    public String getHeaderHomePageName() {
        return "personal_homepage";
    }

    /* renamed from: h */
    public final void mo92542h() {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo92560t() {
        return false;
    }

    /* renamed from: a */
    public void mo92531a(View view) {
        super.mo92531a(view);
        ButterKnife.bind((Object) this, view);
        this.f95672aj = (TextView) view.findViewById(R.id.c9g);
        this.f95673ak = (RecommendPointView) view.findViewById(R.id.cp4);
        this.f95674al = (DmtTextView) view.findViewById(R.id.cp5);
        this.f95675am = (AnimationImageView) view.findViewById(R.id.ew);
        this.f95676an = view.findViewById(R.id.c2y);
        this.f95677ao = view.findViewById(R.id.c3x);
        this.f95678ap = view.findViewById(R.id.d8x);
        this.f95679aq = (TextView) view.findViewById(R.id.ckq);
        this.f95680ar = (ImageView) view.findViewById(R.id.ckp);
        this.f95683au = view.findViewById(R.id.ckf);
        this.f95688az = view.findViewById(R.id.c58);
        this.f95687ay = view.findViewById(R.id.e7);
        this.f95683au.setAlpha(1.0f);
        this.f95681as = (TextView) view.findViewById(R.id.ck9);
        this.f95682at = view.findViewById(R.id.ckk);
        m117742a((View) this.f95681as, m117740a(getContext()));
        if (C6399b.m19944t()) {
            m117742a(this.f95687ay, m117740a(getContext()));
            m117742a(view.findViewById(R.id.c2r), m117740a(getContext()));
        }
        if (TimeLockRuler.isTeenModeON()) {
            this.f95687ay.setVisibility(8);
            this.f95755k.setVisibility(8);
            this.f95754j.setVisibility(8);
        } else if (!C6399b.m19944t()) {
            boolean t = mo92560t();
            f95663aC = t;
            if (t) {
                this.f95687ay.findViewById(R.id.e_).setVisibility(0);
                ((TextView) this.f95687ay.findViewById(R.id.dqd)).setText(C42982bn.m136452a(R.string.d6q, R.string.dm));
            } else {
                ImageView imageView = (ImageView) this.f95687ay.findViewById(R.id.e9);
                imageView.setImageResource(C7213d.m22500a().mo18756aS() ? R.drawable.ae1 : R.drawable.ae0);
                imageView.setVisibility(0);
            }
        }
        C36557y yVar = new C36557y(this);
        this.f95716O.mo93098a((OnClickListener) yVar);
        this.f95716O.mo93100b(yVar);
        this.f95716O.mo93101c(yVar);
        this.f95716O.mo93102d(yVar);
        if (this.f95766v != null) {
            this.f95766v.setOnClickListener(new C36558z(this));
        }
        this.f95714M.setIsMyProfile(true);
    }

    /* renamed from: a */
    public final void mo91704a(boolean z, boolean z2, boolean z3) {
        String str;
        if (!TimeLockRuler.isTeenModeON()) {
            int i = 0;
            if (C25352e.m83360c(this.f95746b)) {
                this.f95676an.setVisibility(0);
                this.f95679aq.setText(this.f95746b.getQuickShopInfo().getQuickShopName());
                this.f95680ar.setBackgroundResource(R.drawable.b0k);
                if (this.f95677ao != null) {
                    this.f95677ao.setVisibility(8);
                }
                if (this.f95676an.getTag(R.id.c2y) == null) {
                    C24976t.m82083a("weblink", this.f95746b.getUid());
                    this.f95676an.setTag(R.id.c2y, Integer.valueOf(1));
                }
                return;
            }
            boolean z4 = z3 && ((Boolean) C23060u.m75742a().mo60042L().mo59877d()).booleanValue();
            View view = this.f95676an;
            if (!z4) {
                i = 8;
            }
            view.setVisibility(i);
            if (z4) {
                getShopUserMessagePresenter().mo91639a();
            } else if (this.f95677ao != null) {
                this.f95677ao.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.f95746b.getShopMicroApp())) {
                this.f95679aq.setText(R.string.d6r);
                if (z4 && this.f95676an.getTag(R.id.c2y) == null && C25243ap.m82981a(getActivity(), this.f95676an)) {
                    new C24473g().mo63580b(C21115b.m71197a().getCurUserId()).mo63579a("personal_homepage").mo63581c("normal").mo63537a();
                    this.f95676an.setTag(R.id.c2y, Integer.valueOf(1));
                }
            } else {
                TextView textView = this.f95679aq;
                if (C43122ff.m136787r(this.f95746b)) {
                    str = getContext().getString(R.string.ciz);
                } else {
                    str = getContext().getString(R.string.be6);
                }
                textView.setText(str);
                if (z4 && this.f95676an.getTag(R.id.c2y) == null && C25243ap.m82981a(getActivity(), this.f95676an)) {
                    new C24473g().mo63580b(C21115b.m71197a().getCurUserId()).mo63579a("personal_homepage").mo63581c("mini_program").mo63537a();
                    this.f95676an.setTag(R.id.c2y, Integer.valueOf(1));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91699a(int i, String str) {
        super.mo91699a(i, str);
        this.f95757m.setVisibility(0);
        if (!TextUtils.isEmpty(str)) {
            this.f95757m.setText(str);
        } else if (C7213d.m22500a().mo18824x()) {
            this.f95757m.setText(R.string.ct8);
        } else {
            this.f95757m.setText(R.string.dul);
        }
    }

    /* renamed from: a */
    public final void mo91701a(final UrlModel urlModel) {
        super.mo91701a(urlModel);
        if (urlModel != null && this.f95718Q.af_()) {
            C12133n.m35299a(C23400r.m76741a(urlModel)).mo29845a("AbsCommonHeaderLayout").mo29853b(C43086eb.m136680a((View) this.f95768x)).mo29844a((C12128i) this.f95768x).mo29855c(true).mo29849a((C12112j) new C12105c() {
                /* renamed from: a */
                public final void mo29812a(Uri uri, View view, Throwable th) {
                    AbsMyCommonHeaderLayout.this.f95731af.mo93193a((C11491a<? extends Pair<? extends UrlModel, ? extends C12131l>>) new C11500c<Object>(th));
                }

                /* renamed from: a */
                public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
                    AbsMyCommonHeaderLayout.this.f95731af.mo93193a((C11491a<? extends Pair<? extends UrlModel, ? extends C12131l>>) new C11674x<Object>(new Pair(urlModel, lVar)));
                }
            });
            if (this.f95688az != null && this.f95746b.avatarUpdateReminder()) {
                this.f95688az.setVisibility(0);
            } else if (this.f95688az != null) {
                this.f95688az.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo92533a(String str, int i) {
        SpannableStringBuilder spannableStringBuilder;
        if (this.f95760p != null && mo91726f()) {
            C36728am amVar = new C36728am(getContext(), i, 1);
            if (str.endsWith(" T")) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" T");
                spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            }
            spannableStringBuilder.setSpan(amVar, (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
            this.f95760p.setText(spannableStringBuilder);
        }
    }

    /* renamed from: a */
    public final void mo92532a(C35666d dVar) {
        if (this.f95685aw != null) {
            switch (dVar.f93503a) {
                case 0:
                    this.f95685aw.mo93005a(false);
                    return;
                case 1:
                    if (!this.f95685aw.f96269b) {
                        this.f95685aw.mo93005a(false);
                        break;
                    }
                    break;
                case 2:
                    if (this.f95685aw.f96269b) {
                        this.f95685aw.mo93005a(false);
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo92530a(Bundle bundle) {
        C6907h.m21524a("edit_profile", (Map) C22984d.m75611a().mo59973a("enter_method", "click_navigation").mo59973a("scene_id", "1001").f60753a);
        ProfileEditActivity.m117085a(getActivity(), bundle);
        getActivity().overridePendingTransition(R.anim.c4, R.anim.cc);
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        if (this.f95666aD != null) {
            this.f95666aD.mo91617g();
        }
        if (avatarUri == null) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.d0).mo25750a();
        } else {
            getUserPresenter().mo91648d(avatarUri.uri);
        }
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        if (this.f95666aD != null) {
            this.f95666aD.mo91617g();
        }
        C22814a.m75245a(getActivity(), exc, R.string.d0);
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        if (this.f95666aD != null) {
            this.f95666aD.mo91615e();
        }
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        if (i == 4) {
            if (this.f95666aD != null) {
                this.f95666aD.mo91617g();
            }
            mo91701a(C43150p.m136858b(this.f95746b));
        }
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (i == 4) {
            if (this.f95666aD != null) {
                this.f95666aD.mo91617g();
            }
            C22814a.m75245a(getActivity(), exc, R.string.d80);
        }
    }

    /* renamed from: a */
    public final void mo91733a(ShopUserMessage shopUserMessage) {
        if (this.f95677ao != null) {
            this.f95677ao.setVisibility((shopUserMessage == null || !shopUserMessage.getHasUnread()) ? 8 : 0);
        }
    }

    public String getUserId() {
        return C33230ac.m107217b(this.f95746b);
    }

    /* renamed from: b */
    public void mo92534b() {
        super.mo92534b();
        if (this.f95668aF != null) {
            this.f95668aF.mo86692c();
        }
    }

    /* renamed from: c */
    public final void mo92538c() {
        super.mo92538c();
        if (this.f95677ao != null) {
            this.f95677ao.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final boolean mo91726f() {
        if (this.f95664aA == null || !this.f95664aA.mo91726f()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final /* synthetic */ void mo92563w() {
        this.f95681as.setText(R.string.ay3);
    }

    private C36006af getShopUserMessagePresenter() {
        if (this.f95668aF == null) {
            this.f95668aF = new C36006af(new ShopUserMessageModel(), this);
        }
        return this.f95668aF;
    }

    private C36011ai getUserPresenter() {
        if (this.f95667aE == null) {
            this.f95667aE = new C36011ai();
            this.f95667aE.f94200a = this;
        }
        return this.f95667aE;
    }

    /* renamed from: x */
    private void mo92721x() {
        C7195s.m22438a().mo18679a(getActivity(), "aweme://profile_edit");
        SharePrefCache.inst().getIsProfileBubbleShown().mo59871a(Boolean.valueOf(false));
    }

    /* renamed from: v */
    public final void mo92562v() {
        if (this.f95727ab != null && this.f95727ab.getVisibility() == 0) {
            C22984d a = C22984d.m75611a();
            a.mo59973a("enter_from", "personal_homepage");
            C6907h.m21524a("h5_show_detail", (Map) a.f60753a);
        }
    }

    /* renamed from: u */
    public final void mo92561u() {
        if (getContext() != null && !C6399b.m19944t()) {
            try {
                if (!C43162f.m136886a()) {
                    mo92543h(false);
                } else if (!this.f95684av.mo60461b()) {
                    if (C32616a.m105657e()) {
                        mo92543h(true);
                    } else if (!C6399b.m19944t()) {
                        m117674a(this.f95684av);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo92546l() {
        super.mo92546l();
        if (this.f95669aG != this.f95670aH) {
            this.f95669aG = this.f95670aH;
            switch (this.f95669aG) {
                case 0:
                    this.f95704C.setTextColor(getResources().getColor(R.color.a5d));
                    this.f95704C.setTypeface(null, 1);
                    return;
                case 1:
                    this.f95704C.setTextColor(getResources().getColor(R.color.a5z));
                    this.f95704C.setTypeface(null, 0);
                    break;
            }
        }
    }

    /* renamed from: s */
    public final void mo92558s() {
        super.mo92558s();
        if (this.f95706E != null) {
            if (getPublishPosi() > 0) {
                m117676a(mo92661i(getPublishPosi()), "", getContext().getString(R.string.fsv));
            }
            if (getFavoritePosi() > 0) {
                m117676a(mo92661i(getFavoritePosi()), "", getContext().getString(R.string.bz_));
            }
            if (getDynamicPosi() > 0) {
                m117676a(mo92661i(getDynamicPosi()), "", getContext().getString(R.string.b6g));
            }
        }
    }

    /* renamed from: y */
    private void m117680y() {
        if (TextUtils.isEmpty(this.f95746b.getShopMicroApp())) {
            C24487e eVar = new C24487e(getActivity(), C21115b.m71197a().getVerifyStatus(), C24449a.m80374a(this.f95746b), "personal_homepage", true, null);
            C24436a.m80356a().gotoGoodShop(eVar, "my_store", "personal_homepage", "click_personal_store", "");
            return;
        }
        new C24463b().mo63542a("personal_homepage").mo63544c("mini_program").mo63543b(C21115b.m71197a().getCurUserId()).mo63537a();
        C7167b.m22380b().mo18647a().openMiniApp((Context) getActivity(), this.f95746b.getShopMicroApp(), new C33472a().mo85792c("027002").mo85791b("personal_homepage").mo85789a("store_entrance").mo85790a());
        if (!(this.f95719R == null || this.f95719R.getmAweme() == null)) {
            Aweme aweme = this.f95719R.getmAweme();
            if (C25352e.m83224g(aweme)) {
                C24976t.m82279t(getContext(), aweme, "homepage_ad");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo92549n() {
        if (this.f95718Q.isViewValid() && this.f95746b != null && !this.f95746b.isLive()) {
            if (this.f95688az == null || this.f95688az.getVisibility() != 0) {
                C6907h.m21524a("click_profile_icon", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "click_head").f60753a);
                HeaderDetailActivity.m116635a(getActivity(), C42914ab.m136242a().mo104635a("uri", C43122ff.m136764a(C43122ff.m136778i(this.f95746b))).mo104631a("extra_zoom_info", (Parcelable) ZoomAnimationUtils.m136228a(this.f95768x)).mo104632a("share_info", (Serializable) this.f95746b).f111445a);
            } else {
                if (this.f95666aD == null) {
                    this.f95666aD = new C35999a();
                    this.f95666aD.f94183c = this;
                    this.f95666aD.mo80250b(getActivity(), this.f95718Q);
                }
                this.f95666aD.mo91612a(0, getActivity(), this.f95768x, this.f95746b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo92551o() {
        if (this.f95718Q.isViewValid()) {
            C6907h.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("personal_homepage"));
            C6907h.m21524a("click_follow_count", (Map) new C22984d().mo59973a("enter_from", "personal_homepage").f60753a);
            if (C6399b.m19947w() || (!C6399b.m19944t() && C7213d.m22500a().mo18746aI() == 1)) {
                FollowRelationTabActivity.m97191a(getActivity(), this.f95746b, "following_relation");
                C6907h.m21524a("enter_relation_tab", (Map) new C22984d().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "click_follow_count").f60753a);
                return;
            }
            C29667a aVar = new C29667a(getActivity(), this.f95718Q, C21115b.m71197a().getCurUserId(), true, PageType.following, this.f95747c);
            aVar.mo75664a(this.f95746b).mo75665a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo92555p() {
        String str;
        if (this.f95718Q.isViewValid()) {
            User curUser = C21115b.m71197a().getCurUser();
            MobClick labelName = MobClick.obtain().setEventName("click_fans_count").setLabelName("personal_homepage");
            C6869c cVar = new C6869c();
            String str2 = "to_status";
            if (!C36337ai.m117567a(curUser)) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else if (this.f95665aB) {
                str = "show";
            } else {
                str = "hide";
            }
            C6907h.onEvent(labelName.setJsonObject(cVar.mo16887a(str2, str).mo16888b()));
            C6907h.m21524a("click_fans_count", (Map) new C22984d().mo59973a("enter_from", "personal_homepage").f60753a);
            if (C6399b.m19947w() || (!C6399b.m19944t() && C7213d.m22500a().mo18746aI() == 1)) {
                FollowRelationTabActivity.m97191a(getActivity(), this.f95746b, "follower_relation");
                C6907h.m21524a("enter_relation_tab", (Map) new C22984d().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "click_fans_count").f60753a);
                return;
            }
            C29667a aVar = new C29667a(getContext(), this.f95718Q, C21115b.m71197a().getCurUserId(), true, PageType.follower, this.f95748d);
            aVar.mo75664a(curUser).mo75665a();
        }
    }

    /* renamed from: z */
    private void m117681z() {
        if (this.f95746b != null && C6399b.m19945u() && !C43122ff.m136783n(this.f95746b) && C6384b.m19835a().mo15287a(EditProfileOptimizationStyle.class, true, "edit_profile_optimization_style", C6384b.m19835a().mo15295d().edit_profile_optimization_style, 0) == 1 && this.f95682at != null) {
            int a = (int) (C36727al.m118400a(C36727al.m118402a(this.f95746b)) * 100.0f);
            if (this.f95671aI != a) {
                if (this.f95671aI == 0 && a == 100) {
                    this.f95682at.setVisibility(8);
                } else if (a == 100) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(1500);
                    animatorSet.play(ObjectAnimator.ofFloat(this.f95682at, "scaleX", new float[]{0.0f, 1.0f}).setDuration(300)).with(ObjectAnimator.ofFloat(this.f95682at, "scaleY", new float[]{0.0f, 1.0f}).setDuration(300)).with(m117671a(this.f95681as, 15.0f, 0.0f).setDuration(300)).before(duration);
                    animatorSet.play(ObjectAnimator.ofFloat(this.f95682at, "scaleX", new float[]{1.0f, 0.0f}).setDuration(300)).with(ObjectAnimator.ofFloat(this.f95682at, "scaleY", new float[]{1.0f, 0.0f}).setDuration(300)).with(m117671a(this.f95681as, 0.0f, 15.0f).setDuration(300)).after(duration);
                    animatorSet.start();
                    this.f95682at.setVisibility(0);
                    this.f95682at.postDelayed(new C36490ae(this), 300);
                } else {
                    StringBuilder sb = new StringBuilder(" ");
                    sb.append(a);
                    sb.append("%");
                    String sb2 = sb.toString();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getContext().getString(R.string.ay3));
                    spannableStringBuilder.append(sb2);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.m1)), spannableStringBuilder.length() - sb2.length(), spannableStringBuilder.length(), 17);
                    this.f95681as.setText(spannableStringBuilder);
                }
                this.f95671aI = a;
            }
        }
    }

    /* renamed from: a */
    public final void mo92528a() {
        super.mo92528a();
        setRecommendCount(this.f95686ax);
        mo92643g();
        m117681z();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo92552o(View view) {
        if (!C27326a.m89578a(view)) {
            mo92545k(view);
        }
    }

    public void onQrCodeClick(View view) {
        if (!C27326a.m89578a(view)) {
            m117678r(view);
        }
    }

    /* renamed from: h */
    public final void mo92543h(boolean z) {
        if (z) {
            C32630h.m105696b(getContext()).mo83998b();
        }
        SharePrefCache.inst().getIsGrantedLocationPermission().mo59871a(Boolean.valueOf(z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo92550n(View view) {
        C6907h.m21524a("enter_profile_username", (Map) C22984d.m75611a().mo59973a("enter_method", "click_edit_username").f60753a);
        new SetNicknameDialog(getContext()).show();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final /* synthetic */ void mo92557q(View view) {
        if (!C27326a.m89578a(view)) {
            C6907h.m21524a("edit_profile", (Map) C22984d.m75611a().mo59973a("enter_method", "click_add_pro").f60753a);
            mo92721x();
        }
    }

    /* renamed from: e */
    public final void mo91721e(int i) {
        if (getStoryPosi() >= 0) {
            m117676a(mo92661i(getStoryPosi()), String.valueOf(i), m117672a(i, (int) R.string.e2h, (int) R.string.e3f));
        }
    }

    /* renamed from: g */
    public final void mo91727g(int i) {
        super.mo91727g(i);
        if (mo92668m() && !TimeLockRuler.isTeenModeON() && !C6399b.m19944t() && getOriginMusicsionPosi() >= 0) {
            mo92661i(getOriginMusicsionPosi()).setDescription(String.valueOf(i));
        }
    }

    /* renamed from: h */
    public final void mo91730h(int i) {
        if (mo92672r() && getToolPosi() >= 0) {
            m117676a(mo92661i(getToolPosi()), String.valueOf(i), m117672a(i, (int) R.string.d7v, (int) R.string.e_w));
        }
    }

    /* renamed from: l */
    public final void mo92547l(View view) {
        if (C25352e.m83360c(this.f95746b)) {
            String quickShopUrl = this.f95746b.getQuickShopInfo().getQuickShopUrl();
            if (!C25371n.m83463a(getContext(), quickShopUrl, true)) {
                C25371n.m83459a(getContext(), quickShopUrl, "");
            }
            return;
        }
        m117680y();
    }

    /* renamed from: b */
    public final void mo92535b(View view) {
        super.mo92535b(view);
        view.findViewById(R.id.e7).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view)) {
                    AbsMyCommonHeaderLayout.this.mo92545k(view);
                }
            }
        });
        view.findViewById(R.id.cp4).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view)) {
                    AbsMyCommonHeaderLayout.this.mo92545k(view);
                }
            }
        });
        if (C7213d.m22500a().mo18810j() == 1) {
            this.f95674al.setOnClickListener(new C36486aa(this));
        }
        this.f95676an.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view)) {
                    AbsMyCommonHeaderLayout.this.mo92547l(view);
                }
            }
        });
        this.f95681as.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C6399b.m19947w()) {
                    AbsMyCommonHeaderLayout.this.mo92530a((Bundle) null);
                    C6907h.m21524a("enter_profile_edit", (Map) C22984d.m75611a().mo59973a("enter_method", "click_edit_profile").f60753a);
                    return;
                }
                AbsMyCommonHeaderLayout.this.mo92548m(view);
            }
        });
        this.f95757m.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                AbsMyCommonHeaderLayout.this.mo92544j(view);
            }
        });
    }

    /* renamed from: c */
    public final void mo91711c(int i) {
        int i2;
        if (getPublishPosi() >= 0) {
            ProfileTabView i3 = mo92661i(getPublishPosi());
            if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(CleanUpInvalidVideosExperiment.class, true, "clean_up_invalid_videos", C6384b.m19835a().mo15295d().clean_up_invalid_videos, 0) != 1) {
                String valueOf = String.valueOf(i);
                if (C6399b.m19944t()) {
                    i2 = R.string.cgi;
                } else {
                    i2 = R.string.fsu;
                }
                m117676a(i3, valueOf, m117672a(i, i2, (int) R.string.fsv));
            }
        }
    }

    /* renamed from: d */
    public final void mo91716d(int i) {
        int i2;
        C21115b.m71197a().getCurUser().setFavoritingCount(i);
        if (getFavoritePosi() >= 0) {
            ProfileTabView i3 = mo92661i(getFavoritePosi());
            if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(CleanUpInvalidVideosExperiment.class, true, "clean_up_invalid_videos", C6384b.m19835a().mo15295d().clean_up_invalid_videos, 0) != 1) {
                String valueOf = String.valueOf(i);
                if (C6399b.m19944t()) {
                    i2 = R.string.ack;
                } else {
                    i2 = R.string.bz6;
                }
                m117676a(i3, valueOf, m117672a(i, i2, (int) R.string.bz_));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo92539e(View view) {
        if (!this.f95746b.nicknameUpdateReminder() || !C6399b.m19944t()) {
            super.mo92539e(view);
            return;
        }
        C6907h.m21524a("enter_profile_username", (Map) C22984d.m75611a().mo59973a("enter_method", "click_edit_username").f60753a);
        mo92530a(C42914ab.m136242a().mo104630a("need_focus_id_input", 1).f111445a);
    }

    /* renamed from: f */
    public final void mo91724f(int i) {
        if (SharePrefCache.inst().isOpenForward() && getDynamicPosi() >= 0) {
            ProfileTabView i2 = mo92661i(getDynamicPosi());
            C7213d.m22500a();
            if (!C7213d.m22502aq() || C6399b.m19944t()) {
                m117676a(i2, String.valueOf(i), m117672a(i, (int) R.string.b6f, (int) R.string.b6g));
            } else {
                m117676a(i2, String.valueOf(i), m117672a(i, (int) R.string.d5w, (int) R.string.d5y));
            }
        }
    }

    /* renamed from: g */
    public final void mo92540g(boolean z) {
        Drawable drawable;
        if (getFavoritePosi() >= 0 && !TimeLockRuler.isTeenModeON()) {
            ProfileTabView i = mo92661i(getFavoritePosi());
            if (((Integer) C23060u.m75742a().mo60075e().mo59877d()).intValue() == 0) {
                drawable = null;
            } else if (z) {
                drawable = getContext().getResources().getDrawable(R.drawable.b_r);
            } else {
                drawable = getContext().getResources().getDrawable(R.drawable.b_s);
            }
            i.setDrawableLeft(drawable);
        }
    }

    /* renamed from: j */
    public final void mo92544j(View view) {
        if (TextUtils.isEmpty(this.f95746b.getSignature()) && C7213d.m22500a().mo18824x() && !C27326a.m89578a(view)) {
            C6907h.m21524a("add_profile_introduction", (Map) C22984d.m75611a().mo59973a("enter_method", "").f60753a);
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).switchToSignature(getActivity());
            getActivity().overridePendingTransition(R.anim.c4, R.anim.cc);
        }
    }

    /* renamed from: k */
    public final void mo92545k(View view) {
        getActivity().startActivity(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(getActivity(), this.f95686ax, 1, "", "personal_homepage"));
        if (this.f95686ax > 0) {
            C6907h.m21524a("add_friends_notice", (Map) C22984d.m75611a().mo59973a("action_type", "click").f60753a);
        }
        setRecommendCount(0);
        if (view.getId() == R.id.e7) {
            C6907h.onEvent(MobClick.obtain().setEventName("click_add_friends").setLabelName("personal_homepage").setJsonObject(C6869c.m21381a().mo16887a("event_type", "normal_way").mo16888b()));
            C33228ab.m107200a("click_add_friends").mo85057b("enter_from", "personal_homepage").mo85252e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo92548m(View view) {
        if (!C27326a.m89578a(view)) {
            ProfileEditActivity.m117085a(getActivity(), C42914ab.m136242a().mo104633a("enter_from", "personal_homepage").mo104633a("enter_method", "click_button").f111445a);
            getActivity().overridePendingTransition(R.anim.c4, R.anim.cc);
            C6907h.m21524a("edit_profile", (Map) C22984d.m75611a().mo59973a("enter_method", "click_button").mo59973a("enter_from", "personal_homepage").f60753a);
        }
    }

    public void setRecommendCount(int i) {
        this.f95686ax = i;
        if (this.f95673ak != null && this.f95674al != null) {
            if (i <= 0 || TimeLockRuler.isTeenModeON()) {
                this.f95673ak.mo92331a();
                this.f95674al.setVisibility(8);
            } else if (C7213d.m22500a().mo18810j() == 1) {
                this.f95673ak.mo92331a();
                this.f95674al.setVisibility(0);
                this.f95674al.setText(String.valueOf(i));
            } else if (C6399b.m19944t()) {
                this.f95673ak.mo92331a();
            } else {
                this.f95673ak.mo92332b();
            }
        }
    }

    /* renamed from: a */
    private void m117674a(C32961dd ddVar) {
        new C10741a(getContext()).mo25663c(R.drawable.b8c).mo25649a((int) R.string.c55).mo25657b((int) R.string.c53).mo25650a((int) R.string.c50, (DialogInterface.OnClickListener) new C36488ac(this, ddVar)).mo25658b((int) R.string.c4z, (DialogInterface.OnClickListener) new C36489ad(ddVar)).mo25656a().mo25638b();
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDouLabService();
    }

    /* renamed from: k */
    private void m117677k(int i) {
        int i2;
        if (!C6399b.m19944t()) {
            if (f95663aC) {
                i2 = 69;
            } else {
                i2 = 40;
            }
            this.f95705D.getLayoutParams().width = (int) (((((((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), 94.0f)) - (C9738o.m28708b(getContext(), 16.0f) * 2.0f)) - C9738o.m28708b(getContext(), (float) i2)) - C9738o.m28708b(getContext(), 4.0f)) - C9738o.m28708b(getContext(), 20.0f));
            this.f95705D.setBackground(getResources().getDrawable(R.drawable.bg_followed));
        } else if (C6399b.m19947w()) {
            this.f95705D.getLayoutParams().width = (int) (((((((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), 94.0f)) - (C9738o.m28708b(getContext(), 16.0f) * 2.0f)) - (C9738o.m28708b(getContext(), 40.0f) * 2.0f)) - C9738o.m28708b(getContext(), 4.0f)) - C9738o.m28708b(getContext(), 20.0f));
            this.f95705D.setBackground(getResources().getDrawable(R.drawable.me));
            if (this.f95705D instanceof TextView) {
                ((TextView) this.f95705D).setTextColor(getResources().getColor(R.color.az3));
            }
        } else {
            return;
        }
        this.f95705D.setVisibility(0);
        this.f95705D.requestLayout();
    }

    /* renamed from: r */
    private void m117678r(View view) {
        User curUser = C21115b.m71197a().getCurUser();
        QRCodeActivityV2.m119235a(getContext(), new C36995a().mo93428a(4, C43122ff.m136788s(curUser), "personal_homepage").mo93433a(C43122ff.m136789t(curUser), C43122ff.m136790u(curUser), C43122ff.m136783n(curUser)).f96920a);
        if (curUser != null && C6399b.m19944t()) {
            C25652b bVar = new C25652b();
            bVar.mo66536a(new C28442a());
            bVar.mo56976a(curUser.getUid(), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(4), "qr_code");
        }
    }

    /* renamed from: c */
    public final void mo91713c(String str) {
        String str2;
        if (this.f95718Q.isViewValid()) {
            this.f95723V = str;
            if (C6399b.m19947w()) {
                StringBuilder sb = new StringBuilder();
                sb.append(getResources().getString(R.string.d82));
                sb.append(str);
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getResources().getString(R.string.bfu));
                sb2.append(str);
                str2 = sb2.toString();
            }
            this.f95760p.setText(str2);
            if (!this.f95746b.nicknameUpdateReminder() || !C6399b.m19944t()) {
                this.f95760p.setTextColor(getResources().getColor(R.color.a5d));
            } else {
                mo92533a(str2, (int) R.drawable.a6w);
                this.f95760p.setTextColor(getResources().getColor(R.color.a5d));
                if (C6903bc.m21473N().mo71141a()) {
                    C42961az.m136380a(new C27691f());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo92556p(View view) {
        if (!C27326a.m89578a(this.f95766v)) {
            if (C25352e.m83366d(this.f95746b)) {
                C24573m mVar = new C24573m(1, 0, 0);
                C42961az.m136380a(mVar);
                return;
            }
            if (this.f95732ag != null) {
                this.f95732ag.mo92184b();
            }
            if (this.f95746b.getDefaultAdCoverUrl() != null) {
                AdCoverTitle adCoverTitle = this.f95746b.getAdCoverTitle();
                if (adCoverTitle != null) {
                    C24958f.m81905a().mo65266a("starpage_ad").mo65276b("click").mo65283e("top_bar").mo65286h("{}").mo65280c(this.f95746b.getAdOrderId()).mo65270a(getContext());
                    C25371n.m83459a(view.getContext(), adCoverTitle.getWebUrl(), "");
                }
            } else if (!(this.f95664aA instanceof BaseDTProfileFragment) || !((BaseDTProfileFragment) this.f95664aA).mo91926j(this.f95746b)) {
                if (!C6307b.m19566a((Collection<T>) this.f95746b.getCoverUrls())) {
                    C6907h.m21524a("click_profile_icon", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "click_cover").mo59973a("author_id", this.f95746b.getUid()).f60753a);
                    ProfileCoverPreviewActivity.m117074a(getContext(), (UrlModel) this.f95746b.getCoverUrls().get(0), true);
                }
            } else {
                C6907h.m21524a("click_profile_icon", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "click_cover").mo59973a("author_id", this.f95746b.getUid()).f60753a);
            }
        }
    }

    /* renamed from: a */
    public final void mo91698a(int i, int i2) {
        m117677k(i);
    }

    /* renamed from: a */
    private static ValueAnimator m117671a(TextView textView, float f, float f2) {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{f, f2}).setDuration(300);
        duration.addUpdateListener(new C36491af(textView));
        return duration;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92536b(final C32961dd ddVar, DialogInterface dialogInterface, int i) {
        C32616a.m105654a(getActivity(), (C43154a) new C43154a() {
            /* renamed from: a */
            public final void mo71375a() {
                AbsMyCommonHeaderLayout.this.mo92543h(true);
            }

            /* renamed from: b */
            public final void mo71376b() {
                if (AbsMyCommonHeaderLayout.this.f95746b != null) {
                    AbsMyCommonHeaderLayout.this.f95746b.setCity("");
                }
                AbsMyCommonHeaderLayout.this.f95716O.mo93099a(AbsMyCommonHeaderLayout.this.f95746b);
                ddVar.mo60460b(true);
            }
        });
        C6907h.m21518a(C6399b.m19921a(), "position", "allow_on", (String) null, 0);
    }

    public AbsMyCommonHeaderLayout(Context context, BaseProfileFragment baseProfileFragment, ProfileViewModel profileViewModel) {
        super(context, baseProfileFragment, null, profileViewModel);
        this.f95664aA = baseProfileFragment;
        this.f95684av = (C32961dd) C23336d.m76560a(getContext(), C32961dd.class);
    }

    /* renamed from: a */
    static final /* synthetic */ void m117675a(C32961dd ddVar, DialogInterface dialogInterface, int i) {
        ddVar.mo60460b(true);
        C6907h.m21518a(C6399b.m19921a(), "position", "allow_off", (String) null, 0);
    }

    /* renamed from: a */
    private String m117672a(int i, int i2, int i3) {
        if (TimeLockRuler.isTeenModeON()) {
            return getContext().getResources().getString(i3);
        }
        if (C6399b.m19944t()) {
            Locale locale = Locale.getDefault();
            String string = getContext().getString(i2);
            Object[] objArr = new Object[1];
            if (i < 0) {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            return C1642a.m8035a(locale, string, objArr);
        }
        Context context = getContext();
        Object[] objArr2 = new Object[1];
        if (i < 0) {
            i = 0;
        }
        objArr2[0] = Integer.valueOf(i);
        return context.getString(i2, objArr2);
    }

    /* renamed from: b */
    public final void mo91710b(boolean z, boolean z2, boolean z3) {
        int i;
        if (!TimeLockRuler.isTeenModeON()) {
            if (TextUtils.equals(this.f95746b.getUid(), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
                z = false;
            }
            if (!z || !C41983b.m133444a()) {
                if (getHeadStatus() != 4) {
                    if (!z2) {
                        i = 0;
                    } else if (z3) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                    setHeadStatus(i);
                    this.f95675am.mo7085f();
                    this.f95675am.setVisibility(8);
                    this.f95768x.setBorderWidthPx(0);
                }
            } else if (this.f95675am != null) {
                C41989d.m133476a(getContext(), true, 0, this.f95746b.getRequestId(), this.f95746b.getUid(), this.f95746b.roomId);
                this.f95675am.setVisibility(0);
                this.f95675am.setAnimation("tag_profile_live.json");
                this.f95675am.mo7078b();
                setHeadStatus(1);
                this.f95768x.setBorderColor(R.color.a79);
                this.f95768x.setBorderWidth(2);
            }
        }
    }

    /* renamed from: a */
    private void m117676a(ProfileTabView profileTabView, String str, String str2) {
        if (profileTabView != null && getTabCount() < 4) {
            profileTabView.setText(str2);
        }
    }

    /* renamed from: a */
    public void mo92529a(int i, int i2, Intent intent) {
        if (i == 20001) {
            if (i2 == -1) {
                int intExtra = intent.getIntExtra("recommend_count", -1);
                if (intExtra == -1) {
                    intExtra = this.f95686ax;
                }
                this.f95686ax = intExtra;
                setRecommendCount(this.f95686ax);
            }
        } else if (this.f95666aD != null) {
            this.f95666aD.mo80249a(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo92537b(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        boolean b = super.mo92537b(str, i, blueVBrandInfo, user);
        if (b || !this.f95746b.nicknameUpdateReminder() || C6399b.m19944t()) {
            this.f95670aH = 0;
            return b;
        }
        String str2 = " T";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        C36728am amVar = new C36728am(getContext(), R.drawable.a6w, 1);
        amVar.f96392a = -4;
        spannableStringBuilder.setSpan(amVar, (spannableStringBuilder.length() - str2.length()) + 1, spannableStringBuilder.length(), 17);
        this.f95704C.setText(spannableStringBuilder);
        this.f95704C.setOnClickListener(new C36487ab(this));
        this.f95670aH = 1;
        return true;
    }
}
