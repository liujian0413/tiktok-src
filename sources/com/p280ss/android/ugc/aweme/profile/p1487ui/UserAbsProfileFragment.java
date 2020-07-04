package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.profile.AggregationTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.profile.BrandTabFragment;
import com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.p280ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.p280ss.android.ugc.aweme.profile.experiment.ProfileRecommendUserWhenEmpty;
import com.p280ss.android.ugc.aweme.profile.fansshake.C35787c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36341a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36492ag;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36527az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UserAbsProfileFragment */
public abstract class UserAbsProfileFragment extends BaseDTProfileFragment {

    /* renamed from: e */
    protected ProfileFragmentAdapter3<ProfileListFragment> f95276e;

    /* renamed from: f */
    protected IUserService f95277f;

    /* renamed from: g */
    protected int f95278g = -1;

    /* renamed from: h */
    protected C36527az f95279h;

    /* renamed from: i */
    protected C36341a f95280i = new C36341a() {
        /* renamed from: a */
        public final void mo91881a(boolean z, int i) {
            if (i == 0 && UserAbsProfileFragment.this.f94528N == UserAbsProfileFragment.this.bD_()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
            } else if (i == 5 && UserAbsProfileFragment.this.f94528N == UserAbsProfileFragment.this.mo91933t()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
            } else if (i == 1 && UserAbsProfileFragment.this.f94528N == UserAbsProfileFragment.this.mo91931q()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
            } else if (i == 13 && UserAbsProfileFragment.this.f94528N == UserAbsProfileFragment.this.mo91930p()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
            }
            if (UserAbsProfileFragment.this.mo92148G() && !ProfileRecommendUserWhenEmpty.isRecommendUserMode(UserAbsProfileFragment.this.f94531Q)) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            }
        }

        /* renamed from: b */
        public final void mo91882b(boolean z, int i) {
            if (i == 0 && UserAbsProfileFragment.this.f94528N == UserAbsProfileFragment.this.bD_()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            } else if (i == 5 && UserAbsProfileFragment.this.f94528N == UserAbsProfileFragment.this.mo91933t()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            } else if (i == 1 && UserAbsProfileFragment.this.f94528N == UserAbsProfileFragment.this.mo91931q()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            } else {
                if (i == 13 && UserAbsProfileFragment.this.f94528N == UserAbsProfileFragment.this.mo91930p()) {
                    UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
                }
            }
        }
    };

    /* renamed from: j */
    protected float f95281j = 0.0f;

    /* renamed from: k */
    protected float f95282k = 0.0f;

    /* renamed from: c */
    public final void mo91711c(int i) {
    }

    /* renamed from: c */
    public final void mo91713c(String str) {
    }

    /* renamed from: c */
    public final void mo91714c(boolean z) {
    }

    /* renamed from: d */
    public final void mo91716d(int i) {
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

    /* renamed from: e */
    public final void mo91722e(User user) {
    }

    /* renamed from: f */
    public final void mo91724f(int i) {
    }

    /* renamed from: g */
    public final void mo91727g(int i) {
    }

    /* renamed from: h */
    public final void mo91730h(int i) {
    }

    /* renamed from: i */
    public void mo91877i() {
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: H */
    public final void mo92149H() {
        this.f95281j = 0.0f;
        this.f95282k = 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final boolean mo92148G() {
        return C43122ff.m136769b(this.f94531Q, C43122ff.m136787r(this.f94531Q));
    }

    /* renamed from: j */
    public void mo91878j() {
        mo91711c(0);
        mo91716d(0);
        mo91724f(0);
        mo91703a(null, 0, null, null);
        mo91699a(0, "");
        mo91706b((User) null);
        mo91708b((String) null);
        mo91713c("");
        mo91717d((User) null);
        this.mScrollableLayout.mo66843a();
        this.f94502o.setCurrentItem(0, false);
    }

    /* renamed from: o */
    public void mo92363o() {
        mo91700a(0);
        mo91697a(0);
        mo91705b(0);
        mo91711c(0);
        mo91716d(0);
        mo91724f(0);
        mo91703a(null, 0, null, null);
        mo91699a(0, "");
        mo91706b((User) null);
        mo91708b((String) null);
        mo91713c("");
        mo91717d((User) null);
        this.mScrollableLayout.mo66843a();
        this.f94502o.setCurrentItem(0, false);
    }

    /* renamed from: I */
    private float m117354I() {
        if (this.f95278g == -1) {
            DmtTextView dmtTextView = new DmtTextView(getContext());
            dmtTextView.setTextSize(21.0f);
            Rect rect = new Rect();
            TextPaint paint = dmtTextView.getPaint();
            paint.getTextBounds(getContext().getString(R.string.e7c), 0, getContext().getString(R.string.e7c).length(), rect);
            int height = rect.height();
            dmtTextView.setTextSize(13.0f);
            paint.getTextBounds(getContext().getString(R.string.d4z), 0, getContext().getString(R.string.d4z).length(), rect);
            int height2 = rect.height();
            this.f95278g = ((int) (((C9738o.m28708b(getContext(), 100.0f) * 2.0f) + ((float) height)) + ((float) height2))) - (((C9738o.m28709b(getContext()) - this.f94502o.getTop()) - this.f94526L.f95706E.getHeight()) - this.mStatusView.getHeight());
        }
        if (this.f95278g < 0) {
            return 0.0f;
        }
        return (float) this.f95278g;
    }

    /* renamed from: a */
    private void mo91872a() {
        View view;
        Fragment j = mo92362j(this.f94528N);
        if (j instanceof C25766a) {
            view = ((C25766a) j).mo61750j();
        } else {
            view = null;
        }
        if (!(view == null || !(view instanceof RecyclerView) || this.f95276e == null)) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getChildCount() != 0 || mo92148G() || ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f94531Q)) {
                View g = recyclerView.getLayoutManager().mo5788g(recyclerView.getChildCount() - 1);
                if (g != null) {
                    int bottom = (g.getBottom() + this.f94502o.getTop()) - this.mScrollableLayout.getCurScrollY();
                    int b = C9738o.m28709b(getContext());
                    if (bottom + mo91939E() + C9738o.m28717e(getContext()) <= b) {
                        this.mScrollableLayout.mo66843a();
                        ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j((this.f94528N + 1) % this.f95276e.getCount());
                        if (profileListFragment != null) {
                            profileListFragment.aS_();
                        }
                    }
                    this.mScrollableLayout.setMaxScrollHeight(((g.getBottom() + this.f94502o.getTop()) + mo91939E()) - b);
                }
            } else {
                this.mScrollableLayout.mo66843a();
                ProfileListFragment profileListFragment2 = (ProfileListFragment) mo92362j((this.f94528N + 1) % this.f95276e.getCount());
                if (profileListFragment2 != null) {
                    profileListFragment2.aS_();
                }
            }
        }
    }

    /* renamed from: b */
    public final Fragment mo92361b(long j) {
        if (!isViewValid()) {
            return null;
        }
        return getChildFragmentManager().mo2644a(m117355a((int) R.id.czl, j));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f95277f = (IUserService) ServiceManager.get().getService(IUserService.class);
        this.f95279h = new C36527az() {
            /* renamed from: a */
            public final void mo92364a(boolean z) {
                UserAbsProfileFragment.this.f95282k = 0.0f;
                UserAbsProfileFragment.this.f95281j = 0.0f;
            }
        };
    }

    /* renamed from: a */
    private void m117357a(Fragment fragment) {
        boolean z = true;
        if (this.f94531Q == null || this.f94531Q.getTabType() != 1) {
            z = false;
        }
        if (((fragment instanceof UserStateFragment) || z) && this.f94504q.isShowing()) {
            this.f94504q.dismiss();
        }
    }

    /* renamed from: o */
    private void m117359o(int i) {
        if (this.f95276e != null && this.f94502o != null) {
            int count = this.f95276e.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                ProfileListFragment profileListFragment = (ProfileListFragment) this.f95276e.mo2423a(i2);
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

    /* renamed from: j */
    public final Fragment mo92362j(int i) {
        int i2;
        if (this.f95276e == null || !isAdded()) {
            return null;
        }
        if (this.f94540z == null) {
            i2 = 0;
        } else {
            i2 = this.f94540z.size();
        }
        if (i >= i2 || i < 0) {
            return null;
        }
        return mo92361b(this.f95276e.mo2424b(i));
    }

    public void onPageSelected(int i) {
        this.f94528N = i;
        Fragment j = mo92362j(i);
        if (j instanceof C25766a) {
            this.mScrollableLayout.getHelper().f68075b = (C25766a) j;
        }
        mo92381n(i);
        m117359o(i);
        mo91872a();
        m117357a(j);
    }

    /* renamed from: n */
    private void mo92381n(int i) {
        if (mo91928n() && i == mo91932s()) {
            C6907h.onEvent(MobClick.obtain().setEventName("enter_my_music").setLabelName("personal_homepage"));
        }
        if (i == 0) {
            if (mo91957y()) {
                C6907h.m21517a((Context) getActivity(), "slide_left", "personal_homepage", 0, 0);
            }
        } else if (i < 4 && mo91957y()) {
            C6907h.m21517a((Context) getActivity(), "slide_right", "personal_homepage", 0, 0);
        }
    }

    /* renamed from: i */
    public final void mo91876i(int i) {
        Fragment j = mo92362j(i);
        if (j instanceof OriginMusicListFragment) {
            this.mScrollableLayout.getHelper().f68075b = (OriginMusicListFragment) j;
        } else if (j instanceof C36340al) {
            C36340al alVar = (C36340al) j;
            this.mScrollableLayout.getHelper().f68075b = alVar;
            this.mScrollableLayout.setCanScrollUp(!alVar.mo90847r());
        } else if (j instanceof UserStateFragment) {
            this.mScrollableLayout.getHelper().f68075b = (UserStateFragment) j;
        } else if (j instanceof EnterpriseTabFragment) {
            this.mScrollableLayout.getHelper().f68075b = (EnterpriseTabFragment) j;
        } else if (j instanceof BrandTabFragment) {
            this.mScrollableLayout.getHelper().f68075b = (BrandTabFragment) j;
        } else {
            if (j instanceof AggregationTabFragment) {
                this.mScrollableLayout.getHelper().f68075b = (AggregationTabFragment) j;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91873a(View view) {
        this.f94502o = (ViewPager) view.findViewById(R.id.czl);
        this.f94502o.setOffscreenPageLimit(3);
        super.mo91873a(view);
    }

    /* renamed from: a */
    private static String m117355a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.czl);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo61694a(float f, float f2) {
        if (isViewValid()) {
            ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(this.f94528N);
            if (profileListFragment != null) {
                RecyclerView recyclerView = (RecyclerView) profileListFragment.mo61750j();
                if (recyclerView != null) {
                    if (recyclerView.getChildCount() != 0 || mo92148G() || ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f94531Q)) {
                        View g = recyclerView.getLayoutManager().mo5788g(recyclerView.getChildCount() - 1);
                        if (g != null) {
                            this.mScrollableLayout.setMaxScrollHeight(((g.getBottom() + this.f94502o.getTop()) + mo91939E()) - C9738o.m28709b(getContext()));
                        } else if (mo92148G()) {
                            this.mScrollableLayout.setMaxScrollHeight((int) m117354I());
                        }
                    } else {
                        this.mScrollableLayout.setCanScrollUp(false);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo61702b(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        super.mo61702b(i, i2);
        if (this.f95281j == 0.0f) {
            int[] iArr = new int[2];
            this.f94526L.f95756l.getLocationOnScreen(iArr);
            this.f95281j = ((float) (iArr[1] - this.mTitleColorCtrl.getHeight())) - C9738o.m28708b(getContext(), 32.0f);
        }
        if (this.f95282k == 0.0f) {
            this.f94526L.f95706E.getLocationOnScreen(new int[2]);
            this.f95282k = Math.max((float) this.mScrollableLayout.getMaxY(), this.f95281j + 1.0f);
        }
        float f = (float) i;
        float f2 = (f - this.f95281j) / (this.f95282k - this.f95281j);
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        if (f2 >= 1.0f) {
            f2 = 1.0f;
        }
        this.mStatusView.setAlpha(f2);
        this.mTitle.setAlpha(f2);
        this.mFastChatBtn.setAlpha(f2);
        RemoteImageView remoteImageView = this.mFastChatBtn;
        if (f2 == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        remoteImageView.setEnabled(z);
        this.mFastFollowBtn.setAlpha(f2);
        DmtTextView dmtTextView = this.mFastFollowBtn;
        if (f2 == 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        dmtTextView.setEnabled(z2);
        float f3 = 1.0f - f2;
        this.f94526L.f95713L.setAlpha(f3);
        if (this.f94526L instanceof C36492ag) {
            View findViewById = ((C36492ag) this.f94526L).findViewById(R.id.bhf);
            if (findViewById != null) {
                findViewById.setAlpha(f3);
            }
        }
        if (this.mMoreBtnBg != null) {
            this.mMoreBtnBg.setAlpha(f3);
        }
        if (this.mFansShakeView != null) {
            float b = f / C9738o.m28708b(getContext(), 56.0f);
            if (b >= 1.0f) {
                b = 1.0f;
            }
            if (b <= 0.0f) {
                b = 0.0f;
            }
            this.mFansShakeView.setAlpha(1.0f - b);
            C35787c cVar = this.mFansShakeView;
            if (b != 1.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            cVar.setClickable(z3);
        }
        mo91921a(f2);
        mo91924c(i, i2);
        if (this.f95276e != null && this.f95276e.getCount() != 0) {
            ProfileListFragment profileListFragment = (ProfileListFragment) mo92362j(this.f94528N);
            if (profileListFragment != null) {
                RecyclerView recyclerView = (RecyclerView) profileListFragment.mo61750j();
                if (recyclerView != null) {
                    if (recyclerView.getChildCount() != 0 || mo92148G() || ProfileRecommendUserWhenEmpty.isRecommendUserMode(this.f94531Q)) {
                        View g = recyclerView.getLayoutManager().mo5788g(recyclerView.getChildCount() - 1);
                        if (g != null) {
                            if (((g.getBottom() + this.f94502o.getTop()) - i) + mo91939E() <= C9738o.m28709b(getContext())) {
                                this.mScrollableLayout.setMaxScrollHeight(i);
                            }
                        } else if (mo92148G()) {
                            this.mScrollableLayout.setMaxScrollHeight((int) m117354I());
                        }
                    } else {
                        this.mScrollableLayout.setCanScrollUp(false);
                    }
                }
            }
        }
    }
}
