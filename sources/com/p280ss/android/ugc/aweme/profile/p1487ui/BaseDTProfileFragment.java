package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.support.p022v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.model.C24995f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.p1143d.C25671a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.profile.cover.C35740a;
import com.p280ss.android.ugc.aweme.profile.cover.ProfileVideoCoverExperiment;
import com.p280ss.android.ugc.aweme.profile.cover.ProfileVideoCoverSwitchExperiment;
import com.p280ss.android.ugc.aweme.profile.fansshake.C35787c;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35664b;
import com.p280ss.android.ugc.aweme.profile.util.C36718ah;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.BaseDTProfileFragment */
public abstract class BaseDTProfileFragment extends BaseProfileFragment {

    /* renamed from: e */
    private int f94500e;

    /* renamed from: f */
    private float f94501f;
    public View mBackBtnBg;
    public View mCoverMask;
    public C35787c mFansShakeView;
    public RemoteImageView mFastChatBtn;
    public DmtTextView mFastFollowBtn;
    public View mMoreBtnBg;
    public ImageView mPauseIv;
    public FrameLayout mProfileCoverLayout;
    public View mTitleColorCtrl;
    public SmartImageView mUserCover;

    /* renamed from: o */
    protected ViewPager f94502o;

    /* renamed from: p */
    protected C36575v f94503p;

    /* renamed from: q */
    protected C35481c f94504q;

    /* renamed from: r */
    protected C36718ah f94505r;

    /* renamed from: s */
    protected C36347ap f94506s;

    /* renamed from: t */
    float f94507t;

    /* renamed from: u */
    public int f94508u;

    /* renamed from: v */
    protected boolean f94509v;

    /* renamed from: w */
    protected C35740a f94510w;

    /* renamed from: x */
    protected int f94511x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo91921a(float f);

    /* renamed from: a */
    public void mo91701a(UrlModel urlModel) {
    }

    /* renamed from: b */
    public final void mo91708b(String str) {
    }

    /* renamed from: c */
    public final void mo91712c(User user) {
    }

    /* renamed from: d */
    public final void mo91715d() {
    }

    /* renamed from: e */
    public final void mo91723e(boolean z) {
    }

    /* renamed from: f */
    public void mo91725f(User user) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo91927l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo91928n() {
        if (this.f94531Q == null || this.f94531Q.getShowArtistPlaylist() != 1) {
            return false;
        }
        return true;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f94504q != null) {
            this.f94504q.mo90269d();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f94503p != null) {
            this.f94503p.dismiss();
        }
    }

    /* renamed from: H */
    private int mo92149H() {
        if (this.f94500e == 0) {
            this.f94500e = (C9738o.m28691a(C6399b.m19921a()) * 9) / 16;
        }
        return this.f94500e;
    }

    public final int bD_() {
        if (this.f94516A == null) {
            return -1;
        }
        return this.f94516A.indexOf(Integer.valueOf(0));
    }

    /* renamed from: p */
    public final int mo91930p() {
        if (this.f94516A == null) {
            return -1;
        }
        return this.f94516A.indexOf(Integer.valueOf(13));
    }

    /* renamed from: q */
    public final int mo91931q() {
        if (this.f94516A == null) {
            return -1;
        }
        return this.f94516A.indexOf(Integer.valueOf(1));
    }

    /* renamed from: s */
    public final int mo91932s() {
        if (this.f94516A == null) {
            return -1;
        }
        return this.f94516A.indexOf(Integer.valueOf(3));
    }

    /* renamed from: u */
    public final int mo91934u() {
        if (this.f94516A == null) {
            return -1;
        }
        return this.f94516A.indexOf(Integer.valueOf(6));
    }

    /* renamed from: I */
    private void mo92150I() {
        if (C6399b.m19944t() || C43122ff.m136783n(this.f94531Q)) {
            ((C13438a) this.mUserCover.getHierarchy()).mo32896a(C13423b.f35593a);
        } else {
            ((C13438a) this.mUserCover.getHierarchy()).mo32896a(C13423b.f35599g);
        }
        this.f94507t = (float) mo92149H();
        mo91876i(mo92149H());
    }

    /* renamed from: a */
    private void mo91872a() {
        this.f94504q = new C35481c(getActivity());
        this.f94504q.mo90267c((int) R.string.bza);
        this.f94504q.mo90263b(2, 14);
        this.f94504q.mo90253a(Typeface.defaultFromStyle(1));
        this.f94504q.f93102j = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
    }

    /* renamed from: m */
    public static int m116450m() {
        int i;
        if (C9738o.m28691a(C6399b.m19921a()) * 2 <= C9738o.m28709b(C6399b.m19921a())) {
            i = C21085a.m71116a(C6399b.m19921a());
        } else {
            i = 0;
        }
        return (C9738o.m28691a(C6399b.m19921a()) / 3) + (i / 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo91875g() {
        super.mo91875g();
        this.mTitle.setAlpha(0.0f);
        if (this.mFastChatBtn != null) {
            this.mFastChatBtn.setAlpha(0.0f);
            this.mFastChatBtn.setEnabled(false);
        }
        if (this.mFastFollowBtn != null) {
            this.mFastFollowBtn.setAlpha(0.0f);
            this.mFastFollowBtn.setEnabled(false);
        }
        mo91724f(0);
        mo91715d();
        mo91723e(false);
        if (this.mFansShakeView != null) {
            this.mFansShakeView.mo90666a(this.f94531Q);
        }
    }

    /* renamed from: t */
    public final int mo91933t() {
        int i;
        C7213d.m22500a();
        if (!C7213d.m22502aq() || !C43122ff.m136787r(this.f94531Q)) {
            i = 5;
        } else {
            i = 8;
        }
        if (this.f94516A == null) {
            return -1;
        }
        return this.f94516A.indexOf(Integer.valueOf(i));
    }

    /* renamed from: G */
    private void mo92148G() {
        int H = mo92149H();
        this.mUserCover.getLayoutParams().height = H;
        if (this.mCoverMask != null && !C6399b.m19946v()) {
            this.mCoverMask.getLayoutParams().height = this.f94526L.getBgAvatarMarginTop() + H;
        }
        int m = m116450m();
        this.f94526L.setVisibleHeight(m);
        this.f94501f = ((float) (m - H)) / 2.0f;
        this.mUserCover.setTranslationY(this.f94501f);
        this.f94507t = (float) H;
        this.mUserCover.setPivotX(((float) C9738o.m28691a(C6399b.m19921a())) / 2.0f);
        this.mUserCover.setPivotY(0.0f);
        mo91924c(0, this.mScrollableLayout.getMaxY());
    }

    /* renamed from: j */
    private void mo91878j() {
        if (!C6399b.m19944t() && getContext() != null && C6384b.m19835a().mo15287a(ProfileVideoCoverSwitchExperiment.class, true, "aweme_user_cover_video", C6384b.m19835a().mo15295d().aweme_user_cover_video, 0) != 0) {
            this.f94510w = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createVideoCoverManager(getContext(), this.mProfileCoverLayout, this.mPauseIv);
        }
    }

    /* renamed from: i */
    private void mo91876i(int i) {
        LayoutParams layoutParams = this.mUserCover.getLayoutParams();
        layoutParams.height = i;
        this.mUserCover.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final void mo91705b(int i) {
        if (isViewValid() && this.f94526L != null) {
            this.f94526L.mo91705b(i);
        }
    }

    /* renamed from: i */
    protected static boolean m116448i(User user) {
        if (user == null || !C24995f.m82308a(user) || (user.isLive() && C41983b.m133444a() && !user.isBlock())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo91702a(User user) {
        super.mo91702a(user);
        mo91927l();
        if (this.mFansShakeView != null) {
            this.mFansShakeView.mo90666a(this.f94531Q);
        }
    }

    /* renamed from: j */
    public final boolean mo91926j(User user) {
        if (this.f94510w == null || C43122ff.m136783n(user)) {
            return false;
        }
        return this.f94510w.mo90597a(user);
    }

    @C7709l
    public void onDismissLike2DynamicGuideEvent(C35664b bVar) {
        if (this.f94504q != null && this.f94504q.isShowing()) {
            this.f94504q.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo91925h(User user) {
        int indexOf = this.f94516A.indexOf(Integer.valueOf(mo91951m(C43122ff.m136776g(user))));
        if (indexOf < 0) {
            indexOf = 0;
        }
        int min = Math.min(this.f94502o.getAdapter().getCount() - 1, indexOf);
        if (this.f94502o.getCurrentItem() != min) {
            this.f94502o.setCurrentItem(min, false);
        }
        this.f94511x = min;
        onPageSelected(min);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91873a(final View view) {
        int i;
        super.mo91873a(view);
        this.f94505r = new C36718ah();
        if (VERSION.SDK_INT >= 19) {
            i = C10994a.m32204a((Context) getActivity());
            this.mStatusView.getLayoutParams().height = i;
            this.mStatusView.setAlpha(0.0f);
        } else {
            i = 0;
        }
        this.f94508u = i;
        mo91872a();
        mo92148G();
        mo91878j();
        view.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                BaseDTProfileFragment.this.mScrollableLayout.setTabsMarginTop(BaseDTProfileFragment.this.f94508u + BaseDTProfileFragment.this.mTitleColorCtrl.getMeasuredHeight() + BaseDTProfileFragment.this.f94526L.f95706E.getMeasuredHeight());
            }
        });
        ScrollSwitchStateManager a = ScrollSwitchStateManager.m98918a(getActivity());
        a.mo79731d(this, new C36565o(this, a));
    }

    /* renamed from: g */
    public final void mo91728g(User user) {
        if (isViewValid()) {
            mo92150I();
            int a = C9738o.m28691a(C6399b.m19921a());
            int H = mo92149H();
            this.mUserCover.setVisibility(0);
            if (!C6399b.m19944t() && TextUtils.equals(user.getUid(), C6861a.m21337f().getCurUserId()) && this.mProfileCoverLayout != null) {
                this.mProfileCoverLayout.setVisibility(8);
            }
            if (this.f94510w == null || !C43122ff.m136785p(user) || C6384b.m19835a().mo15287a(ProfileVideoCoverExperiment.class, true, "profile_video_cover_strategy", C6384b.m19835a().mo15295d().profile_video_cover_strategy, 0) == 0) {
                if (!C43122ff.m136783n(user)) {
                    ((C13438a) this.mUserCover.getHierarchy()).mo32898b((int) R.color.a5o);
                    int b = (int) C9738o.m28708b(C6399b.m19921a(), 100.0f);
                    if (user.getDefaultAdCoverUrl() != null) {
                        C12133n.m35299a(C23400r.m76741a(user.getDefaultAdCoverUrl())).mo29853b(C43012cg.m136513a(700)).mo29836a(a, H).mo29845a("BaseDTProfileFragment").mo29844a((C12128i) this.mUserCover).mo29848a();
                        return;
                    } else if (C6307b.m19566a((Collection<T>) user.getCoverUrls()) || C25671a.m84400a((UrlModel) user.getCoverUrls().get(0))) {
                        C12133n.m35299a(C23400r.m76741a(C25671a.m84399a())).mo29853b(C43012cg.m136513a(700)).mo29836a(a / 2, b).mo29845a("BaseDTProfileFragment").mo29844a((C12128i) this.mUserCover).mo29848a();
                    } else {
                        C12133n.m35299a(C23400r.m76741a((UrlModel) user.getCoverUrls().get(0))).mo29853b(C43012cg.m136513a(700)).mo29836a(a, H).mo29845a("BaseDTProfileFragment").mo29844a((C12128i) this.mUserCover).mo29848a();
                        return;
                    }
                } else if (C25352e.m83366d(user)) {
                    mo91876i(m116450m());
                    this.f94501f = 0.0f;
                    this.f94507t = (float) m116450m();
                    mo91924c(0, this.mScrollableLayout.getMaxY());
                    if (user.getCommerceInfo() != null) {
                        UrlModel headImageUrl = user.getCommerceInfo().getHeadImageUrl();
                        if (headImageUrl == null || C6307b.m19566a((Collection<T>) headImageUrl.getUrlList())) {
                            this.mUserCover.setImageURI(new Builder().scheme("res").path("2131231165").build());
                            return;
                        }
                        C12133n.m35299a(C23400r.m76741a(headImageUrl)).mo29853b(C43012cg.m136513a(700)).mo29836a(a, H).mo29845a("BaseDTProfileFragment").mo29844a((C12128i) this.mUserCover).mo29848a();
                    }
                } else {
                    this.mUserCover.setImageURI("");
                    ((C13438a) this.mUserCover.getHierarchy()).mo32898b((int) R.drawable.lb);
                    return;
                }
                return;
            }
            this.mUserCover.setVisibility(8);
            if (this.mProfileCoverLayout != null) {
                this.mProfileCoverLayout.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91922a(ScrollSwitchStateManager scrollSwitchStateManager, Integer num) {
        TextUtils.equals(scrollSwitchStateManager.mo79700a(num.intValue()), "page_profile");
    }

    /* renamed from: b */
    public void mo61702b(int i, int i2) {
        if (this.f94504q != null && this.f94504q.isShowing()) {
            this.f94504q.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo91924c(int i, int i2) {
        float f;
        if (i >= 0) {
            this.mUserCover.setTranslationY(this.f94501f - ((float) (i / 2)));
        } else {
            float f2 = (float) (i / 2);
            if (((this.f94501f + f2) + this.f94507t) - this.f94526L.f95763s >= 0.0f) {
                this.mUserCover.setTranslationY(this.f94501f - f2);
            } else {
                this.mUserCover.setTranslationY(0.0f);
                f = (((float) (-i)) + this.f94526L.f95763s) / this.f94507t;
                this.mUserCover.setScaleX(f);
                this.mUserCover.setScaleY(f);
            }
        }
        f = 1.0f;
        this.mUserCover.setScaleX(f);
        this.mUserCover.setScaleY(f);
    }

    /* renamed from: a */
    public void mo91703a(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        if (isViewValid() && !TextUtils.isEmpty(str)) {
            this.mTitle.setText(str);
        }
    }
}
