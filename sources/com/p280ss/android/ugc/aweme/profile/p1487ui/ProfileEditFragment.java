package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import bolts.C1591g;
import bolts.C1592h;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1058c.C23285d;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.event.C35079b;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.profile.C36107z;
import com.p280ss.android.ugc.aweme.profile.edit.C35748a;
import com.p280ss.android.ugc.aweme.profile.edit.C35753b;
import com.p280ss.android.ugc.aweme.profile.edit.C35754c;
import com.p280ss.android.ugc.aweme.profile.edit.C35756d;
import com.p280ss.android.ugc.aweme.profile.edit.C35759g;
import com.p280ss.android.ugc.aweme.profile.edit.C35763k;
import com.p280ss.android.ugc.aweme.profile.edit.C35769o;
import com.p280ss.android.ugc.aweme.profile.edit.InstagramPresenter;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35666d;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditActivity.C36221a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditBioUrlFragment.C36230b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditUsernameFragment.C36263b;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.profile.presenter.C36048v;
import com.p280ss.android.ugc.aweme.profile.util.C36766w;
import com.p280ss.android.ugc.aweme.setting.verification.C37939a;
import com.p280ss.android.ugc.aweme.setting.verification.C37940b;
import com.p280ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43004cb;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.p280ss.android.ugc.trill.p1763e.C44991a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment */
public class ProfileEditFragment extends AbsFragment implements C35748a, C35753b, C35756d, C36039m, C36046t, C36048v, C36221a {

    /* renamed from: e */
    private static final boolean f95068e = C7163a.m22363a();
    protected CommonItemView authInstagramName;
    protected CommonItemView authTwitterName;
    protected CommonItemView authYoutubeName;

    /* renamed from: f */
    protected ButtonTitleBar f95069f;

    /* renamed from: g */
    View f95070g;

    /* renamed from: h */
    protected C36011ai f95071h;

    /* renamed from: i */
    protected C35999a f95072i;

    /* renamed from: j */
    protected boolean f95073j;

    /* renamed from: k */
    protected boolean f95074k;

    /* renamed from: l */
    protected User f95075l;

    /* renamed from: m */
    protected C36107z f95076m;
    protected CommonItemView mBioLayout;
    protected DmtStatusView mDmtStatusView;
    protected AnimatedImageView mHeaderImage;
    protected LinearLayout mHintArea;
    protected CommonItemView mMailLayout;
    protected CommonItemView mNickNameLayout;
    protected CommonItemView mUsernameLayout;
    protected CommonItemView mWebsiteLayout;

    /* renamed from: n */
    protected boolean f95077n;

    /* renamed from: o */
    protected InstagramPresenter f95078o;

    /* renamed from: p */
    protected C35763k f95079p;
    protected DmtTextView personalLink;
    protected LinearLayout personalLinkArea;

    /* renamed from: q */
    User f95080q;

    /* renamed from: r */
    private C35754c f95081r;

    /* renamed from: s */
    private C37940b f95082s;

    /* renamed from: t */
    private int f95083t;

    /* renamed from: u */
    private String f95084u = "";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo80262a() {
        return R.layout.rq;
    }

    /* renamed from: a */
    public void mo61680a(Exception exc) {
        mo92271i();
        if (isViewValid() && this.f95072i != null) {
            if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
                C19282c.m63182a(getActivity(), "profile_image_setting", "review_failure");
            }
            C22814a.m75245a(getActivity(), exc, R.string.d0);
            C44991a.m141961a(exc.getMessage(), "avatar");
        }
    }

    /* renamed from: a */
    public void mo61681a(String str) {
        this.f95074k = true;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        C13380c.m39172c().mo33181b(parse);
        C23323e.m76525b(this.mHeaderImage, parse.toString(), (int) C9738o.m28708b(getContext(), 84.0f), (int) C9738o.m28708b(getContext(), 84.0f));
    }

    /* renamed from: a */
    public final void mo66087a(final Exception exc, final int i) {
        if (isViewValid() && this.f95071h != null && this.f95072i != null) {
            if (C23645b.m77551a(exc)) {
                C23645b.m77550a(getChildFragmentManager(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: b */
                    public final void mo57593b() {
                        ProfileEditFragment.this.mo92254b(exc, i);
                    }

                    /* renamed from: a */
                    public final void mo57592a() {
                        if (ProfileEditFragment.this.f95076m != null && ProfileEditFragment.this.f95071h != null) {
                            ProfileEditFragment.this.mDmtStatusView.mo25942f();
                        }
                    }
                });
            } else {
                mo92254b(exc, i);
                C44991a.m141961a(exc.getMessage(), "user");
            }
            this.mDmtStatusView.setVisibility(8);
            this.f95072i.mo91617g();
        }
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
        if (z) {
            C10761a.m31384a((Context) AwemeApplication.m21341a(), (int) R.string.cz, 1).mo25750a();
            C42961az.m136380a(new C23285d());
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        if (isViewValid()) {
            this.mDmtStatusView.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                C10761a.m31403c((Context) AwemeApplication.m21341a(), str).mo25750a();
                if (z && getActivity() != null) {
                    getActivity().finish();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo92251a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getActivity().getCurrentFocus();
            if (m117129a(currentFocus, motionEvent) && m117128a((Context) getActivity(), currentFocus)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m117133j() {
        this.mDmtStatusView.setVisibility(8);
    }

    /* renamed from: h */
    public final void mo92268h() {
        mo92253b((View) null);
    }

    /* renamed from: k */
    private void m117134k() {
        this.f95082s.mo95388c(this.f95075l, new C37939a() {
            /* renamed from: a */
            public final void mo92278a(VerificationResponse verificationResponse) {
                String str;
                String str2;
                if (verificationResponse.isEmpty()) {
                    ProfileEditFragment.this.mo92266g();
                } else if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
                    C10761a.m31396b((Context) AwemeApplication.m21341a(), ProfileEditFragment.this.getString(R.string.dg5), 1).mo25750a();
                } else {
                    if (verificationResponse.isCerted()) {
                        if (C37940b.m121203c()) {
                            str = ProfileEditFragment.this.getString(R.string.dfy);
                            str2 = ProfileEditFragment.this.getString(R.string.dfx);
                        } else {
                            str = null;
                            str2 = null;
                        }
                        if (str == null || str2 == null) {
                            ProfileEditFragment.this.mo92266g();
                            return;
                        }
                        new C10741a(ProfileEditFragment.this.getActivity()).mo25660b(str2).mo25653a(str).mo25650a((int) R.string.dg3, (OnClickListener) new C36426dm(this)).mo25658b((int) R.string.w_, (OnClickListener) null).mo25656a().mo25637a();
                    } else if (verificationResponse.isUpdating()) {
                        C10761a.m31396b((Context) AwemeApplication.m21341a(), ProfileEditFragment.this.getString(R.string.dg6), 1).mo25750a();
                    }
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo92277a(DialogInterface dialogInterface, int i) {
                ProfileEditFragment.this.mo92266g();
            }
        });
    }

    /* renamed from: l */
    private void m117136l() {
        this.f95082s.mo95388c(this.f95075l, new C37939a() {
            /* renamed from: a */
            public final void mo92278a(VerificationResponse verificationResponse) {
                String str;
                String str2;
                if (verificationResponse.isEmpty()) {
                    ProfileEditFragment.this.mo92264f();
                } else if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
                    C10761a.m31396b((Context) AwemeApplication.m21341a(), ProfileEditFragment.this.getString(R.string.dg5), 1).mo25750a();
                } else {
                    if (verificationResponse.isCerted()) {
                        if (C37940b.m121204d()) {
                            str = ProfileEditFragment.this.getString(R.string.dg0);
                            str2 = ProfileEditFragment.this.getString(R.string.dfz);
                        } else {
                            str = null;
                            str2 = null;
                        }
                        if (str == null || str2 == null) {
                            ProfileEditFragment.this.mo92264f();
                            return;
                        }
                        new C10741a(ProfileEditFragment.this.getActivity()).mo25660b(str2).mo25653a(str).mo25650a((int) R.string.dg3, (OnClickListener) new C36427dn(this)).mo25658b((int) R.string.w_, (OnClickListener) null).mo25656a().mo25637a();
                    } else if (verificationResponse.isUpdating()) {
                        C10761a.m31396b((Context) AwemeApplication.m21341a(), ProfileEditFragment.this.getString(R.string.dg6), 1).mo25750a();
                    }
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo92279a(DialogInterface dialogInterface, int i) {
                ProfileEditFragment.this.mo92264f();
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
        if (this.f95082s != null) {
            this.f95082s.mo95385a();
        }
    }

    public void onResume() {
        super.onResume();
        C42961az.m136380a(new C35666d(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo92271i() {
        if (this.mDmtStatusView != null) {
            this.mDmtStatusView.setVisibility(8);
        }
        if (this.f95072i != null) {
            this.f95072i.mo91617g();
        }
    }

    /* renamed from: e */
    private static boolean mo80186e() {
        String str;
        int intValue = C30199h.m98861a().getEnableYoutubeAppAuth().intValue();
        if (f95068e) {
            StringBuilder sb = new StringBuilder("Will bind YouTube acc with ");
            if (intValue == 1) {
                str = "AppAuth";
            } else {
                str = "Google Sign-In";
            }
            sb.append(str);
        }
        StringBuilder sb2 = new StringBuilder("ProfileEditFragment enable_youtube_app_auth = ");
        sb2.append(intValue);
        C6921a.m21562b("youtube-debug", sb2.toString());
        if (intValue == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo90621b() {
        if (getContext() != null) {
            this.mDmtStatusView.setVisibility(8);
            C10761a.m31403c(getContext(), getString(R.string.fjp)).mo25750a();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f95072i != null) {
            this.f95072i.mo91617g();
        }
        if (this.f95072i != null) {
            this.f95072i.f94183c = null;
        }
        if (this.f95071h != null) {
            this.f95071h.f94200a = null;
        }
        this.mDmtStatusView.setVisibility(8);
    }

    /* renamed from: f */
    public final void mo92264f() {
        if (this.mNickNameLayout != null && this.mNickNameLayout.getTextRight() != null) {
            C36766w.m118505a("enter_profile_name", "click_name");
            ProfileEditContentFragment a = ProfileEditContentFragment.m117116a(getString(R.string.ayf), this.mNickNameLayout.getTextRight().toString(), true, "", 20, false);
            a.setUserVisibleHint(true);
            a.mo92237a(new C36417dd(this));
            a.show(getActivity().getSupportFragmentManager(), "EditWebsiteDialog");
        }
    }

    /* renamed from: g */
    public final void mo92266g() {
        boolean z;
        String string;
        int abs = Math.abs((int) ((new Date().getTime() - new Date(this.f95075l.getHandleModified() * 1000).getTime()) / 86400000));
        if (this.f95083t == 0) {
            C36766w.m118505a("enter_profile_username", "click_username");
        }
        if (abs > 30) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            string = getString(R.string.az0);
        } else {
            string = getString(R.string.fmw);
        }
        String str = string;
        if (this.mUsernameLayout != null) {
            String str2 = "";
            if (!m117143r(this.f95084u)) {
                str2 = this.f95084u;
            }
            String str3 = str2;
            String str4 = "edit_profile_page";
            if (this.f95083t == 1) {
                str4 = "personal_homepage";
            } else if (this.f95083t == 2) {
                str4 = "modify_username_notify";
            }
            ProfileEditUsernameFragment a = ProfileEditUsernameFragment.m117194a(getString(R.string.ayq), str3, z, str, 24, false, str4);
            a.setUserVisibleHint(true);
            a.mo92286a((C36263b) new C36418de(this));
            a.show(getActivity().getSupportFragmentManager(), "EditUserNameDialog");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo80264d() {
        this.f95076m = new C36107z();
        this.f95080q = new User();
        this.f95075l = C21115b.m71197a().getCurUser();
        if (this.f95075l != null) {
            this.mNickNameLayout.setRightText(this.f95075l.getNickname());
            m117141p(C43122ff.m136777h(this.f95075l));
            m117137l(this.f95075l.getSignature());
            m117135k(this.f95075l.getBioUrl());
            mo80183b(this.f95075l.getBioEmail());
            if (Math.abs((int) ((new Date().getTime() - new Date(this.f95075l.getHandleModified() * 1000).getTime()) / 86400000)) >= 30 && this.f95083t != 0) {
                C1592h.m7848a(500).mo6876a((C1591g<TResult, TContinuationResult>) new C36416dc<TResult,TContinuationResult>(this), C1592h.f5958b);
            }
            this.f95080q.setSignature(this.f95075l.getSignature());
            this.f95076m.f94400f = this.f95075l.isBindedWeibo();
            C23323e.m76524b(this.mHeaderImage, this.f95075l.getAvatarMedium());
            this.f95073j = false;
            if (!TextUtils.isEmpty(this.f95075l.getInsId())) {
                this.authInstagramName.setRightText(this.f95075l.getInsId());
                this.authInstagramName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.yi));
            }
            if (!TextUtils.isEmpty(this.f95075l.getYoutubeChannelTitle())) {
                this.authYoutubeName.setRightText(this.f95075l.getYoutubeChannelTitle());
                this.authYoutubeName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.yi));
            } else if (!TextUtils.isEmpty(this.f95075l.getGoogleAccount())) {
                this.authYoutubeName.setRightText(this.f95075l.getGoogleAccount());
                this.authYoutubeName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.yi));
            }
            if (!TextUtils.isEmpty(this.f95075l.getTwitterName())) {
                this.authTwitterName.setRightText(this.f95075l.getTwitterName());
                this.authTwitterName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.yi));
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo80264d();
    }

    /* renamed from: q */
    private static String m117142q(String str) {
        StringBuilder sb = new StringBuilder("tiktok.com/@");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: s */
    private static boolean m117144s(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public boolean mo92269h(String str) {
        this.f95077n = true;
        this.f95080q.setBioUrl(str);
        m117135k(str);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo92249a(C1592h hVar) throws Exception {
        if (this.mNickNameLayout != null) {
            editUserName(this.mNickNameLayout);
        }
        return null;
    }

    /* renamed from: e */
    public final void mo90627e(final String str) {
        C43173w.m136924a((Runnable) new Runnable() {
            public final void run() {
                if (ProfileEditFragment.this.getContext() != null) {
                    if (TextUtils.isEmpty(str)) {
                        ProfileEditFragment.this.authYoutubeName.setRightText(ProfileEditFragment.this.getContext().getString(R.string.ayt));
                        ProfileEditFragment.this.authYoutubeName.getTvwRight().setTextColor(ProfileEditFragment.this.getContext().getResources().getColor(R.color.a54));
                    } else {
                        ProfileEditFragment.this.authYoutubeName.setRightText(str);
                        ProfileEditFragment.this.authYoutubeName.getTvwRight().setTextColor(ProfileEditFragment.this.getContext().getResources().getColor(R.color.yi));
                    }
                    ProfileEditFragment.this.mDmtStatusView.setVisibility(8);
                }
            }
        });
    }

    /* renamed from: b */
    private void mo80183b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mMailLayout.setRightText(str);
        } else {
            this.mMailLayout.setRightText(getString(R.string.ay8));
        }
    }

    /* renamed from: k */
    private void m117135k(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mWebsiteLayout.setRightText(str);
        } else {
            this.mWebsiteLayout.setRightText(getString(R.string.ayr));
        }
    }

    /* renamed from: l */
    private void m117137l(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mBioLayout.setRightText(str);
        } else {
            this.mBioLayout.setRightText(getString(R.string.ay4));
        }
    }

    /* renamed from: m */
    private static String m117138m(String str) {
        while (str.contains("\n\n")) {
            str = str.replaceAll("\n\n", "\n");
        }
        return str;
    }

    /* renamed from: r */
    private boolean m117143r(String str) {
        if (!str.matches("[0-9A-Za-z_.]*") || m117144s(str)) {
            return true;
        }
        return false;
    }

    public void editNickName(View view) {
        if (!C27326a.m89578a(view) && isViewValid()) {
            m117136l();
        }
    }

    public void editUserName(View view) {
        if (!C27326a.m89578a(view) && isViewValid()) {
            m117134k();
        }
    }

    /* renamed from: p */
    private void m117141p(String str) {
        this.f95084u = str;
        CommonItemView commonItemView = this.mUsernameLayout;
        StringBuilder sb = new StringBuilder("@");
        sb.append(this.f95084u);
        commonItemView.setRightText(sb.toString());
        this.personalLink.setText(m117142q(this.f95084u));
        m117131d(m117143r(this.f95084u));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo92256c(boolean z) {
        int i;
        if (isViewValid()) {
            this.mDmtStatusView.setVisibility(8);
            Context context = getContext();
            if (z) {
                i = R.string.bzl;
            } else {
                i = R.string.fjp;
            }
            C10761a.m31403c(context, getString(i)).mo25750a();
        }
    }

    public void edit(View view) {
        Context context = getContext();
        if (context != null) {
            String q = m117142q(this.f95084u);
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            ClipData newPlainText = ClipData.newPlainText(q, q);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
                C10761a.m31410e(context, getResources().getString(R.string.ayh)).mo25750a();
                C36766w.m118503a();
            }
        }
    }

    public void editHeaderImage(View view) {
        if (isViewValid()) {
            C36766w.m118505a("replace_profile_photo", "click_head");
            this.f95072i.mo91612a(0, getActivity(), this.mHeaderImage, C21115b.m71197a().getCurUser());
        }
    }

    @C7709l
    public void onEvent(C35079b bVar) {
        switch (bVar.f91738a) {
            case 1:
            case 2:
                PoiStruct poiStruct = bVar.f91739b;
                if (poiStruct != null) {
                    String poiId = poiStruct.getPoiId();
                    if (TextUtils.equals(poiId, "-1")) {
                        this.f95076m.f94403i = 2;
                    } else {
                        this.f95076m.f94403i = 1;
                    }
                    this.f95076m.f94402h = poiId;
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private void m117131d(boolean z) {
        if (z) {
            this.mHintArea.setVisibility(0);
            this.personalLinkArea.setVisibility(8);
            this.mUsernameLayout.getTvwRight().setTextSize(0.0f);
            this.mUsernameLayout.getTvwRight().setCompoundDrawablesWithIntrinsicBounds(R.drawable.aml, 0, 0, 0);
            return;
        }
        this.mHintArea.setVisibility(8);
        this.personalLinkArea.setVisibility(0);
        this.mUsernameLayout.getTvwRight().setTextSize(1, 15.0f);
        this.mUsernameLayout.getTvwRight().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean mo92272j(String str) {
        if (TextUtils.isEmpty(str)) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.clp).mo25750a();
            this.mDmtStatusView.setVisibility(8);
            return false;
        } else if (TextUtils.isEmpty(str.trim())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.clr).mo25750a();
            this.mDmtStatusView.setVisibility(8);
            return false;
        } else if (!TextUtils.equals(str, C21115b.m71197a().getCurUser().getNickname())) {
            this.f95080q.setNickname(str);
            this.f95071h.mo91646b(str);
            this.mDmtStatusView.mo25942f();
            return true;
        } else {
            this.f95076m.f94395a = "";
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public int mo92270i(String str) {
        String str2;
        User curUser = C21115b.m71197a().getCurUser();
        if (TextUtils.isEmpty(curUser.getUniqueId())) {
            str2 = curUser.getShortId();
        } else {
            str2 = curUser.getUniqueId();
        }
        if (str.equals(str2)) {
            this.f95076m.f94397c = "";
            return 0;
        } else if (C43004cb.m136502a(str, getContext())) {
            this.f95071h.mo91641a(str);
            this.mDmtStatusView.mo25942f();
            this.f95080q.setUniqueId(str);
            return 1;
        } else {
            m117133j();
            this.f95076m.f94397c = "";
            return 2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public boolean mo92265f(String str) {
        if (!TextUtils.equals(str, C21115b.m71197a().getCurUser().getSignature())) {
            String m = m117138m(str);
            int length = m.length() - 1;
            if (length >= 0 && m.charAt(length) == 10) {
                m = m.substring(0, length);
            }
            this.f95080q.setSignature(m);
            this.f95076m.f94396b = m;
            this.mDmtStatusView.mo25942f();
            this.f95071h.mo91647c(m);
            this.f95077n = true;
            return true;
        }
        this.f95076m.f94396b = null;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public boolean mo92267g(String str) {
        if (!TextUtils.equals(str, C21115b.m71197a().getCurUser().getBioEmail())) {
            String m = m117138m(str);
            int length = m.length() - 1;
            if (length >= 0 && m.charAt(length) == 10) {
                m = m.substring(0, length);
            }
            this.f95077n = true;
            this.f95076m.f94409o = m;
            this.mDmtStatusView.mo25942f();
            this.f95080q.setEmail(m);
            this.f95071h.mo91643a(this.f95076m.mo91866a());
            return true;
        }
        this.f95076m.f94409o = null;
        return true;
    }

    /* renamed from: b */
    public final void mo92253b(View view) {
        if (isViewValid()) {
            getActivity().finish();
        }
    }

    /* renamed from: c */
    public final void mo90609c(String str) {
        if (getContext() != null) {
            if (TextUtils.isEmpty(str)) {
                this.authInstagramName.setRightText(getContext().getString(R.string.ay7));
                this.authInstagramName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.a54));
            } else {
                this.authInstagramName.setRightText(str);
                this.authInstagramName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.yi));
            }
            this.mDmtStatusView.setVisibility(8);
        }
    }

    public void editBio(View view) {
        if (!C27326a.m89578a(view) && isViewValid()) {
            String charSequence = this.mBioLayout.getTextRight().toString();
            if (charSequence.equals(getString(R.string.ay4))) {
                charSequence = "";
            }
            C36766w.m118505a("enter_profile_bio", "click_bio");
            ProfileEditBioFragment a = ProfileEditBioFragment.m117087a(getString(R.string.ay5), charSequence);
            a.setUserVisibleHint(true);
            a.mo92211a(new C36419df(this));
            a.show(getActivity().getSupportFragmentManager(), "EditNicknameDialog");
        }
    }

    public void editMail(View view) {
        if (!C27326a.m89578a(view) && isViewValid()) {
            String charSequence = this.mMailLayout.getTextRight().toString();
            if (charSequence.equals(getString(R.string.ay8))) {
                charSequence = "";
            }
            String str = charSequence;
            C36766w.m118505a("enter_profile_mail", "click_mail");
            ProfileEditContentFragment a = ProfileEditContentFragment.m117116a(getString(R.string.ay9), str, true, "", 0, true);
            a.setUserVisibleHint(true);
            a.mo92237a(new C36421dh(this));
            a.mo92208a(this);
            a.show(getActivity().getSupportFragmentManager(), "EditMailDialog");
        }
    }

    public void editWebsite(View view) {
        if (!C27326a.m89578a(view) && isViewValid()) {
            String charSequence = this.mWebsiteLayout.getTextRight().toString();
            if (charSequence.equals(getString(R.string.ayr))) {
                charSequence = "";
            }
            C36766w.m118505a("enter_profile_website", "click_website");
            ProfileEditBioUrlFragment a = ProfileEditBioUrlFragment.m117099a(charSequence, true, "", 0, true);
            a.setUserVisibleHint(true);
            a.mo92208a(this);
            a.mo92224a((C36230b) new C36420dg(this));
            a.show(getActivity().getSupportFragmentManager(), "EditWebsiteDialog");
        }
    }

    public void onBindInstagram(View view) {
        int i;
        if (getContext().getString(R.string.ay7).equals(this.authInstagramName.getTextRight())) {
            i = 0;
            this.f95078o.mo90604a();
            this.mDmtStatusView.mo25942f();
        } else {
            i = 1;
            m117127a(getResources().getString(R.string.fiy), getResources().getString(R.string.fiz), new C36423dj(this));
        }
        C6907h.m21524a("click_social_account_bind", (Map) C22984d.m75611a().mo59970a("status", i).mo59973a("platform", "instagram").f60753a);
    }

    public void onBindTwitter(View view) {
        int i;
        if (getContext().getString(R.string.aym).equals(this.authTwitterName.getTextRight())) {
            i = 0;
            this.f95079p.mo90634a();
            this.mDmtStatusView.mo25942f();
        } else {
            i = 1;
            m117127a(getResources().getString(R.string.fj5), getResources().getString(R.string.fj6), new C36422di(this));
        }
        C6907h.m21524a("click_social_account_bind", (Map) C22984d.m75611a().mo59970a("status", i).mo59973a("platform", "twitter").f60753a);
    }

    public void onBindYouTube(View view) {
        int i;
        if (getContext().getString(R.string.ayt).equals(this.authYoutubeName.getTextRight())) {
            i = 0;
            this.f95081r.mo90623a();
            this.mDmtStatusView.mo25942f();
        } else {
            i = 1;
            m117127a(getResources().getString(R.string.fj8), getResources().getString(R.string.fj9), new C36424dk(this));
        }
        C6907h.m21524a("click_social_account_bind", (Map) C22984d.m75611a().mo59970a("status", i).mo59973a("platform", "youtube").f60753a);
    }

    /* renamed from: d */
    public final void mo90622d(String str) {
        if (getContext() != null) {
            if (TextUtils.isEmpty(str)) {
                this.authTwitterName.setRightText(getContext().getString(R.string.aym));
                this.authTwitterName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.a54));
            } else {
                this.authTwitterName.setRightText(str);
                this.authTwitterName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.yi));
            }
            this.mDmtStatusView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80263a(View view) {
        C35754c cVar;
        if (VERSION.SDK_INT >= 19) {
            this.f95070g.getLayoutParams().height = C10994a.m32204a((Context) getActivity());
        }
        this.mDmtStatusView.setBuilder(C10803a.m31631a(getContext()));
        this.f95069f = (ButtonTitleBar) view.findViewById(R.id.djz);
        this.f95069f.setTitle(getText(R.string.ayl));
        this.f95069f.getEndBtn().setVisibility(8);
        this.f95069f.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                ProfileEditFragment.this.mo92253b(view);
            }
        });
        this.f95072i = new C35999a();
        this.f95072i.f94183c = this;
        this.f95072i.mo80250b(getActivity(), this);
        this.f95071h = new C36011ai();
        this.f95071h.f94200a = this;
        this.f95078o = new InstagramPresenter(getActivity(), this);
        if (mo80186e()) {
            cVar = new C35769o(getActivity(), this);
        } else {
            cVar = new C35759g(getActivity(), this);
        }
        this.f95081r = cVar;
        this.f95079p = new C35763k(getActivity(), this);
        this.f95082s = new C37940b();
        if (C25352e.m83352b()) {
            this.mWebsiteLayout.setVisibility(0);
        } else {
            this.mWebsiteLayout.setVisibility(8);
        }
        if (C25352e.m83359c()) {
            this.mMailLayout.setVisibility(0);
        } else {
            this.mMailLayout.setVisibility(8);
        }
        if (C6399b.m19947w()) {
            this.authTwitterName.setVisibility(0);
        } else {
            this.authTwitterName.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo90626b(boolean z) {
        C43173w.m136924a((Runnable) new C36425dl(this, z));
    }

    /* renamed from: a */
    public void mo61679a(AvatarUri avatarUri) {
        this.f95072i.mo91617g();
        if (this.f95071h == null || avatarUri == null) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.d0).mo25750a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92252b(DialogInterface dialogInterface, int i) {
        this.f95078o.mo90606b();
        dialogInterface.dismiss();
        this.mDmtStatusView.mo25942f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo92255c(DialogInterface dialogInterface, int i) {
        this.f95079p.mo90637b();
        dialogInterface.dismiss();
        this.mDmtStatusView.mo25942f();
    }

    /* renamed from: a */
    private static boolean m117128a(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || !inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m117129a(View view, MotionEvent motionEvent) {
        if (view == null || !(view instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int height = view.getHeight() + i2;
        int width = view.getWidth() + i;
        if (motionEvent.getX() <= ((float) i) || motionEvent.getX() >= ((float) width) || motionEvent.getY() <= ((float) i2) || motionEvent.getY() >= ((float) height)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92250a(DialogInterface dialogInterface, int i) {
        this.f95081r.mo90625b();
        dialogInterface.dismiss();
        this.mDmtStatusView.mo25942f();
    }

    /* renamed from: b */
    public final void mo92254b(Exception exc, int i) {
        if (4 == i) {
            this.mDmtStatusView.setVisibility(8);
            this.f95072i.mo91617g();
            if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
                C19282c.m63182a(getActivity(), "profile_image_setting", "review_failure");
            }
        }
        if (i == 116) {
            String str = null;
            if ((exc instanceof ExecutionException) && (exc.getCause() instanceof ApiServerException)) {
                exc = (Exception) exc.getCause();
            }
            if (exc instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) exc;
                String valueOf = String.valueOf(apiServerException.getErrorCode());
                C43004cb.m136503a(valueOf, apiServerException.getErrorMsg(), this.f95084u, getContext());
                m117133j();
                str = valueOf;
            }
            C36766w.f96492a.mo93097a(0, this.f95083t, str);
        }
        if (i != 116) {
            C22814a.m75245a(getActivity(), exc, R.string.d80);
        }
    }

    /* renamed from: a */
    public void mo66086a(User user, int i) {
        this.f95074k = true;
        if (i == 0) {
            this.mNickNameLayout.setRightText(this.f95080q.getNickname());
        } else if (i == 2) {
            m117137l(this.f95080q.getSignature());
        } else if (i == 4) {
            C23323e.m76524b(this.mHeaderImage, user.getAvatarMedium());
        } else if (i == 112) {
            m117135k(user.getBioUrl());
            mo80183b(user.getBioEmail());
        } else if (i == 116) {
            C36766w.f96492a.mo93097a(1, this.f95083t, (String) null);
            m117141p(this.f95080q.getUniqueId());
        }
        this.mDmtStatusView.mo25939d();
    }

    /* renamed from: a */
    private void m117127a(String str, String str2, OnClickListener onClickListener) {
        if (af_()) {
            new C10741a(getActivity()).mo25653a(str).mo25660b(str2).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo25650a((int) R.string.vj, onClickListener).mo25656a().mo25637a();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001) {
            this.f95081r.mo90624a(intent);
            return;
        }
        if (i == 10002 && intent != null) {
            UrlModel urlModel = (UrlModel) intent.getSerializableExtra("path");
            if (urlModel != null) {
                C23323e.m76524b(this.mHeaderImage, urlModel);
            }
        }
        if (!this.f95072i.mo80249a(i, i2, intent)) {
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo80262a(), viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        if (getArguments() != null) {
            this.f95083t = getArguments().getInt("need_focus_id_input", 0);
        }
        this.f95070g = inflate.findViewById(R.id.dal);
        mo80263a(inflate);
        C42961az.m136382c(this);
        return inflate;
    }
}
