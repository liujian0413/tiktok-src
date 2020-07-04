package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10819b;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10820c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.p280ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.p280ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.C35662a;
import com.p280ss.android.ugc.aweme.profile.adapter.MyProfileFragmentAdapter;
import com.p280ss.android.ugc.aweme.profile.fansshake.C35787c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36341a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36024g;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C43099ek;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.SpecifiedNumberAnimatedImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.AbsProfileFragment */
public abstract class AbsProfileFragment extends BaseDTProfileFragment implements C10819b, C10820c {

    /* renamed from: W */
    private int f94418W = -1;

    /* renamed from: X */
    private boolean f94419X = C7212bb.m22493a();

    /* renamed from: e */
    public View f94420e;

    /* renamed from: f */
    public AnimationImageView f94421f;

    /* renamed from: g */
    protected MyProfileFragmentAdapter f94422g;

    /* renamed from: h */
    protected C36024g f94423h;

    /* renamed from: i */
    public SpecifiedNumberAnimatedImageView f94424i;

    /* renamed from: j */
    protected Boolean f94425j = Boolean.valueOf(false);

    /* renamed from: k */
    protected String f94426k = "";

    /* renamed from: l */
    protected C36341a f94427l = new C36341a() {
        /* renamed from: a */
        public final void mo91881a(boolean z, int i) {
            if (AbsProfileFragment.this.isViewValid()) {
                if (i == 0 && AbsProfileFragment.this.f94528N == AbsProfileFragment.this.bD_()) {
                    AbsProfileFragment.this.f94535U.mo93196a(true);
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
                } else if (i == 5 && AbsProfileFragment.this.f94528N == AbsProfileFragment.this.mo91933t()) {
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
                } else {
                    if (i == 1 && AbsProfileFragment.this.f94528N == AbsProfileFragment.this.mo91931q()) {
                        AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo91882b(boolean z, int i) {
            if (AbsProfileFragment.this.isViewValid()) {
                if (i == 0 && AbsProfileFragment.this.f94528N == AbsProfileFragment.this.bD_()) {
                    AbsProfileFragment.this.f94535U.mo93196a(false);
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
                } else if (i == 5 && AbsProfileFragment.this.f94528N == AbsProfileFragment.this.mo91933t()) {
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
                } else {
                    if (i == 1 && AbsProfileFragment.this.f94528N == AbsProfileFragment.this.mo91931q()) {
                        AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
                    }
                }
            }
        }
    };

    /* renamed from: m */
    float f94428m = 0.0f;

    /* renamed from: n */
    float f94429n = 0.0f;

    /* renamed from: a */
    public void mo26115a(C10825f fVar) {
    }

    /* renamed from: b */
    public void mo26116b(C10825f fVar) {
    }

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
    public final void mo91721e(int i) {
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

    /* renamed from: k */
    public final List<Integer> mo91879k() {
        return this.f94516A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo91878j() {
        this.f94428m = 0.0f;
        this.f94429n = 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo91875g() {
        super.mo91875g();
        mo91718d((String) null);
        mo91717d((User) null);
    }

    /* renamed from: r */
    public boolean mo62081r() {
        if (this.f94506s == null || !this.f94509v) {
            return false;
        }
        return this.f94506s.mo92456a();
    }

    /* renamed from: i */
    public void mo91877i() {
        if (this.f94531Q == null) {
            mo91946e(getUserId());
        } else {
            mo91952m(this.f94531Q);
        }
        this.f94422g = new MyProfileFragmentAdapter(getChildFragmentManager(), this.f94540z, mo91879k());
        this.f94422g.f93645a = this.f94531Q;
        this.f94502o.setAdapter(this.f94422g);
        this.f94526L.f95706E.mo26054a();
        this.f94526L.f95706E.setupWithViewPager(this.f94502o);
        this.f94526L.f95706E.setOnTabClickListener(this);
        this.f94526L.f95706E.mo26058a((C10820c) this);
        this.f94502o.setCurrentItem(this.f94528N);
        onPageSelected(this.f94528N);
        this.f94502o.addOnPageChangeListener(this);
    }

    /* renamed from: G */
    private void mo92148G() {
        RecyclerView recyclerView;
        Fragment fragment = (Fragment) this.f94540z.get(this.f94528N);
        if (fragment instanceof OriginMusicListFragment) {
            recyclerView = (RecyclerView) ((OriginMusicListFragment) fragment).mo61750j();
        } else if (fragment instanceof C36340al) {
            recyclerView = (RecyclerView) ((C36340al) fragment).mo61750j();
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            if (recyclerView.getChildCount() == 0) {
                this.mScrollableLayout.mo66843a();
                ((ProfileListFragment) this.f94540z.get((this.f94528N + 1) % this.f94540z.size())).aS_();
                return;
            }
            View g = recyclerView.getLayoutManager().mo5788g(recyclerView.getChildCount() - 1);
            if (g != null) {
                int bottom = (g.getBottom() + this.f94502o.getTop()) - this.mScrollableLayout.getCurScrollY();
                int b = C9738o.m28709b(getContext());
                if (bottom + mo91939E() + C9738o.m28717e(getContext()) <= b) {
                    this.mScrollableLayout.mo66843a();
                    ((ProfileListFragment) this.f94540z.get((this.f94528N + 1) % this.f94540z.size())).aS_();
                }
                this.mScrollableLayout.setMaxScrollHeight(((g.getBottom() + this.f94502o.getTop()) + mo91939E()) - b);
            }
        }
    }

    /* renamed from: H */
    private float mo92149H() {
        if (this.f94418W == -1) {
            DmtTextView dmtTextView = new DmtTextView(getContext());
            dmtTextView.setTextSize(21.0f);
            Rect rect = new Rect();
            TextPaint paint = dmtTextView.getPaint();
            paint.getTextBounds(getContext().getString(R.string.e7c), 0, getContext().getString(R.string.e7c).length(), rect);
            int height = rect.height();
            dmtTextView.setTextSize(13.0f);
            paint.getTextBounds(getContext().getString(R.string.d4z), 0, getContext().getString(R.string.d4z).length(), rect);
            int height2 = rect.height();
            this.f94418W = ((int) (((C9738o.m28708b(getContext(), 100.0f) * 2.0f) + ((float) height)) + ((float) height2))) - (((C9738o.m28709b(getContext()) - this.f94502o.getTop()) - this.f94526L.f95706E.getHeight()) - this.mStatusView.getHeight());
        }
        if (this.f94418W < 0) {
            return 0.0f;
        }
        return (float) this.f94418W;
    }

    /* renamed from: a */
    public final void mo91872a() {
        if (this.f94424i != null) {
            try {
                UgAwemeActivitySetting awemeActivitySetting = C30199h.m98861a().getAwemeActivitySetting();
                UgProfileActivityButton profileActivityButton = awemeActivitySetting.getProfileActivityButton();
                UrlModel resourceUrl = profileActivityButton.getResourceUrl();
                this.f94425j = Boolean.valueOf(C35662a.m115265a().mo90506a(awemeActivitySetting.getActivityId(), profileActivityButton.getTimeLimit().intValue()));
                if (this.f94425j.booleanValue()) {
                    this.f94424i.setVisibility(0);
                    C6907h.m21524a("gift_entrance_show", (Map) new C22984d().mo59973a("bubble_type", "coupon_fission").mo59973a("enter_from", "personal_homepage").f60753a);
                    if (resourceUrl.getUrlList() != null && !resourceUrl.getUrlList().isEmpty()) {
                        this.f94426k = (String) resourceUrl.getUrlList().get(0);
                    }
                    final String h5Link = profileActivityButton.getH5Link();
                    this.f94424i.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            Intent intent = new Intent(AbsProfileFragment.this.getContext(), CrossPlatformActivity.class);
                            intent.setFlags(268435456);
                            C6907h.m21524a("gift_entrance_click", (Map) new C22984d().mo59973a("bubble_type", "coupon_fission").mo59973a("enter_from", "personal_homepage").f60753a);
                            intent.setData(Uri.parse(h5Link));
                            C6399b.m19921a().startActivity(intent);
                        }
                    });
                } else {
                    this.f94424i.setVisibility(8);
                }
                if (this.f94425j.booleanValue() && !TextUtils.isEmpty(this.f94426k)) {
                    this.f94424i.mo105214a(this.f94426k, 1);
                }
            } catch (NullValueException unused) {
            }
        }
    }

    /* renamed from: b */
    private Fragment m116295b(long j) {
        return getChildFragmentManager().mo2644a(m116293a((int) R.id.czl, j));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f94423h != null) {
            this.f94423h.mo91673a(bundle);
        }
    }

    /* renamed from: b */
    private void m116296b(Fragment fragment) {
        this.mScrollableLayout.setCanScrollUp(!((C36340al) fragment).mo90847r());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f94423h = new C36024g(null, this, false);
        this.f94423h.mo91675b(bundle);
    }

    /* renamed from: a */
    private void m116294a(Fragment fragment) {
        boolean z = true;
        if (this.f94531Q == null || this.f94531Q.getTabType() != 1) {
            z = false;
        }
        if (((fragment instanceof UserStateFragment) || z) && this.f94504q.isShowing()) {
            this.f94504q.dismiss();
        }
    }

    /* renamed from: n */
    private void m116298n(int i) {
        if (this.f94422g != null && this.f94502o != null) {
            int count = this.f94422g.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                ProfileListFragment profileListFragment = (ProfileListFragment) this.f94422g.mo2423a(i2);
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

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo91874b(View view) {
        if (!C27326a.m89578a(this.f94420e) && this.f94531Q != null && !C6307b.m19566a((Collection<T>) this.f94531Q.getCoverUrls()) && this.f94423h != null) {
            this.f94423h.mo91670a();
        }
    }

    /* renamed from: i */
    public final Fragment mo91876i(int i) {
        int i2;
        if (this.f94422g == null || !isAdded()) {
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
        return m116295b(this.f94422g.mo2424b(i));
    }

    /* renamed from: j */
    private void m116297j(int i) {
        if (!mo91928n() || i != mo91932s()) {
            if (i == bD_()) {
                if (mo91957y()) {
                    C6907h.m21517a((Context) getActivity(), "slide_left", "personal_homepage", 0, 0);
                    return;
                }
            } else if (mo91957y()) {
                C6907h.m21517a((Context) getActivity(), "slide_right", "personal_homepage", 0, 0);
            }
            return;
        }
        C6907h.onEvent(MobClick.obtain().setEventName("enter_my_music").setLabelName("personal_homepage"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91873a(View view) {
        this.f94502o = (ViewPager) view.findViewById(R.id.czl);
        this.f94502o.setOffscreenPageLimit(4);
        this.f94420e = view.findViewById(R.id.bsc);
        this.f94421f = (AnimationImageView) view.findViewById(R.id.d3p);
        super.mo91873a(view);
        if (this.f94421f != null) {
            this.f94421f.mo7082c(true);
            this.f94421f.setAnimation("icon_cover_tip.json");
            this.f94421f.mo7078b();
        }
        this.f94420e.setOnTouchListener(C43099ek.m136716a(0.5f, 1.0f));
        this.f94420e.setOnClickListener(new C36326a(this));
    }

    public void onPageSelected(int i) {
        if (this.f94540z != null && i >= 0 && i < this.f94540z.size()) {
            this.f94528N = i;
            this.f94535U.mo93192a(((Integer) this.f94516A.get(this.f94528N)).intValue());
            Fragment fragment = (Fragment) this.f94540z.get(i);
            if (fragment instanceof C25766a) {
                this.mScrollableLayout.getHelper().f68075b = (C25766a) fragment;
            }
            if (fragment instanceof C36340al) {
                m116296b(fragment);
            }
            m116297j(i);
            m116298n(i);
            mo92148G();
            m116294a(fragment);
        }
    }

    /* renamed from: a */
    public void mo91702a(User user) {
        super.mo91702a(user);
        if (C43122ff.m136783n(user)) {
            this.f94420e.setVisibility(8);
        }
    }

    /* renamed from: a */
    private static String m116293a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.czl);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo61694a(float f, float f2) {
        if (isViewValid() && this.f94540z != null && !this.f94540z.isEmpty() && this.f94540z.size() > this.f94528N) {
            RecyclerView recyclerView = (RecyclerView) ((ProfileListFragment) this.f94540z.get(this.f94528N)).mo61750j();
            if (recyclerView != null) {
                if (recyclerView.getChildCount() != 0 || TimeLockRuler.isTeenModeON()) {
                    View g = recyclerView.getLayoutManager().mo5788g(recyclerView.getChildCount() - 1);
                    if (g != null) {
                        this.mScrollableLayout.setMaxScrollHeight(((g.getBottom() + this.f94502o.getTop()) + mo91939E()) - C9738o.m28709b(getContext()));
                    } else if (TimeLockRuler.isTeenModeON()) {
                        this.mScrollableLayout.setMaxScrollHeight((int) mo92149H());
                    }
                } else if (this.f94526L != null) {
                    this.mScrollableLayout.setMaxScrollHeight(((this.f94526L.getBottom() + mo91939E()) - C9738o.m28709b(getContext())) + ((int) C9738o.m28708b(getContext(), 120.0f)));
                } else {
                    this.mScrollableLayout.setCanScrollUp(false);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo61702b(int i, int i2) {
        boolean z;
        super.mo61702b(i, i2);
        if (this.f94428m == 0.0f) {
            int[] iArr = new int[2];
            this.f94526L.f95756l.getLocationOnScreen(iArr);
            this.f94428m = ((float) (iArr[1] - this.mTitleColorCtrl.getHeight())) - C9738o.m28708b(getContext(), 32.0f);
        }
        if (this.f94429n == 0.0f) {
            this.f94526L.f95706E.getLocationOnScreen(new int[2]);
            this.f94429n = Math.max((float) (this.f94502o.getTop() - this.mScrollableLayout.getTabsMarginTop()), this.f94428m + 1.0f);
        }
        float f = (float) i;
        float f2 = (f - this.f94428m) / (this.f94429n - this.f94428m);
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        if (f2 >= 1.0f) {
            f2 = 1.0f;
        }
        this.mStatusView.setAlpha(f2);
        this.mTitle.setAlpha(f2);
        float f3 = 1.0f - f2;
        this.f94526L.f95713L.setAlpha(f3);
        this.f94420e.setAlpha(1.0f - Math.min(Math.max(0.0f, f / 64.0f), 1.0f));
        if (this.mMoreBtnBg != null && !this.f94419X) {
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
                z = true;
            } else {
                z = false;
            }
            cVar.setClickable(z);
        }
        mo91921a(f2);
        mo91924c(i, i2);
        if (this.f94540z != null && !this.f94540z.isEmpty() && this.f94528N < this.f94540z.size()) {
            RecyclerView recyclerView = (RecyclerView) ((ProfileListFragment) this.f94540z.get(this.f94528N)).mo61750j();
            if (recyclerView != null) {
                if (recyclerView.getChildCount() != 0 || TimeLockRuler.isTeenModeON()) {
                    View g = recyclerView.getLayoutManager().mo5788g(recyclerView.getChildCount() - 1);
                    if (g != null) {
                        if (((g.getBottom() + this.f94502o.getTop()) - i) + mo91939E() <= C9738o.m28709b(getContext())) {
                            this.mScrollableLayout.setMaxScrollHeight(i);
                        } else if (TimeLockRuler.isTeenModeON()) {
                            this.mScrollableLayout.setMaxScrollHeight((int) mo92149H());
                        }
                    }
                } else if (this.f94526L != null) {
                    this.mScrollableLayout.setMaxScrollHeight((this.f94526L.getBottom() + mo91939E()) - C9738o.m28709b(getContext()));
                } else {
                    this.mScrollableLayout.setCanScrollUp(false);
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f94423h != null) {
            this.f94423h.mo91672a(i, i2, intent);
        }
    }
}
