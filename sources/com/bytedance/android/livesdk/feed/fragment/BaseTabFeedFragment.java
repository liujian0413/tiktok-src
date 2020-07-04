package com.bytedance.android.livesdk.feed.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C5912a;
import com.bytedance.android.livesdk.feed.C6019g;
import com.bytedance.android.livesdk.feed.C6084p;
import com.bytedance.android.livesdk.feed.adapter.C5933c.C5936a;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdk.feed.p232g.C6020a;
import com.bytedance.android.livesdk.feed.p367ui.FeedItemDecoration2;
import com.bytedance.android.livesdk.feed.services.C6121d;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdk.feed.tab.p364b.C7771n;
import com.bytedance.android.livesdk.feed.tab.p366d.C7777a;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FeedTabViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.SyncContentViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;
import com.bytedance.android.livesdk.log.C8443c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.p348d.C7326g;

public abstract class BaseTabFeedFragment extends BaseFeedFragment {

    /* renamed from: e */
    protected BannerSwipeRefreshLayout f17771e;

    /* renamed from: f */
    protected TabFeedViewModel f17772f;

    /* renamed from: g */
    public DislikeTipViewModel f17773g;

    /* renamed from: h */
    public C7777a f17774h;

    /* renamed from: i */
    public C0067b f17775i;

    /* renamed from: j */
    protected FeedTabViewModel f17776j;

    /* renamed from: k */
    protected View f17777k;

    /* renamed from: l */
    protected ImageView f17778l;

    /* renamed from: m */
    public boolean f17779m;

    /* renamed from: q */
    private TimeOutRefreshViewModel f17780q;

    /* renamed from: r */
    private SyncContentViewModel f17781r;

    /* renamed from: s */
    private int f17782s = -1;

    /* renamed from: t */
    private long f17783t;

    /* renamed from: o */
    private static Class<? extends TabFeedViewModel> m18749o() {
        return TabFeedViewModel.class;
    }

    /* renamed from: c */
    public final long mo14655c() {
        return mo14670m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo14671n() {
        this.f17772f.mo20484a("feed_refresh");
    }

    public void onStop() {
        super.onStop();
        mo14668j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo14669k() {
        if (this.f17780q != null) {
            this.f17780q.mo20509c();
        }
    }

    /* renamed from: m */
    public long mo14670m() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("id");
        }
        return -1;
    }

    public void onResume() {
        super.onResume();
        mo14669k();
        mo14681p();
    }

    /* renamed from: q */
    private static C7777a m18751q() {
        return new C7777a(C7771n.m23888d(), new C6084p(), C6121d.m19068b());
    }

    /* renamed from: d */
    public int mo14656d() {
        int intValue = ((Integer) LiveFeedSettings.FEED_PRELOAD.mo10240a()).intValue();
        if (intValue <= 1) {
            return super.mo14656d();
        }
        return intValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo14668j() {
        this.f17783t = 0;
        if (this.f17773g != null) {
            this.f17773g.mo20496a();
        }
        if (this.f17780q != null) {
            this.f17780q.mo20508b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public FragmentFeedViewModel mo14657e() {
        this.f17772f = (TabFeedViewModel) C0069x.m158a((Fragment) this, (C0067b) this.f17767b.mo14622a(mo14670m()).mo14623a((C6019g) this)).mo147a(m18749o());
        this.f17772f.f9871c.observe(this, new C6008g(this));
        this.f17771e.setOnRefreshListener(new C6009h(this));
        return this.f17772f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C1272h mo14661i() {
        this.f17768c.setPadding(this.f17768c.getPaddingLeft(), this.f17768c.getPaddingTop(), this.f17768c.getPaddingRight(), this.f17768c.getPaddingBottom());
        return new FeedItemDecoration2();
    }

    /* renamed from: p */
    private void mo14681p() {
        if (this.f17782s != ((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo10240a()).intValue()) {
            this.f17782s = ((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo10240a()).intValue();
            if (((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo10240a()).intValue() != 0) {
                this.f17778l.setVisibility(0);
                LayoutParams layoutParams = (LayoutParams) this.f17778l.getLayoutParams();
                int intValue = ((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo10240a()).intValue();
                if (intValue == 1) {
                    layoutParams.gravity = 8388691;
                } else if (intValue != 3) {
                    layoutParams.gravity = 81;
                } else {
                    layoutParams.gravity = 8388693;
                }
            } else {
                this.f17778l.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14665a(Integer num) {
        num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C5936a mo14649a(C5936a aVar) {
        return aVar.mo14546a((C5912a) new C5912a() {
            /* renamed from: a */
            public final void mo14447a(RecyclerView recyclerView) {
                BaseTabFeedFragment.this.f17771e.f17489o = recyclerView;
            }

            /* renamed from: a */
            public final void mo14446a(ViewPager viewPager, View view) {
                BaseTabFeedFragment.this.f17771e.mo14445a(viewPager, view);
            }
        });
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            mo14668j();
        } else {
            mo14669k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14662a(int i) {
        if (((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo10240a()).intValue() != 0) {
            m18748b(i);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("user_visible")) {
            setUserVisibleHint(arguments.getBoolean("user_visible"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14663a(View view) {
        this.f17771e = (BannerSwipeRefreshLayout) view.findViewById(R.id.def);
        this.f17778l = (ImageView) view.findViewById(R.id.do7);
        this.f17778l.setOnClickListener(new C6004c(this));
        this.f17768c.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    BaseTabFeedFragment.this.f17773g.mo20497a(recyclerView);
                } else {
                    BaseTabFeedFragment.this.f17773g.mo20498b(recyclerView);
                }
                C6020a.m18814a().mo14685a(i);
                C3222b.m12218a().mo10138a(Tag.LiveFeedScroll.name(), (C0043i) BaseTabFeedFragment.this, BaseTabFeedFragment.this.getContext(), i);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (i2 > 20) {
                    BaseTabFeedFragment.this.mo14662a(0);
                    return;
                }
                if (i2 < -20) {
                    BaseTabFeedFragment.this.mo14662a(1);
                }
            }
        });
    }

    /* renamed from: b */
    private void m18748b(int i) {
        boolean z;
        if (!this.f17779m) {
            if (this.f17778l.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            float a = (float) C3358ac.m12510a(100.0f);
            switch (i) {
                case 0:
                    if (z) {
                        this.f17779m = true;
                        this.f17778l.animate().setDuration(300).translationY(a).setListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                BaseTabFeedFragment.this.f17778l.setVisibility(8);
                                BaseTabFeedFragment.this.f17779m = false;
                            }
                        }).start();
                        return;
                    }
                    return;
                case 1:
                    if (!z) {
                        this.f17779m = true;
                        this.f17778l.setVisibility(0);
                        this.f17778l.setTranslationY(a);
                        this.f17778l.animate().setDuration(300).translationY(0.0f).setListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                BaseTabFeedFragment.this.f17779m = false;
                            }
                        }).start();
                        break;
                    } else {
                        return;
                    }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14651a(FeedItem feedItem) {
        super.mo14654b(feedItem);
        if (this.f17780q != null) {
            this.f17780q.mo20507a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14664a(NetworkStat networkStat) {
        boolean z;
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = this.f17771e;
        if (networkStat == null || !networkStat.mo10025a()) {
            z = false;
        } else {
            z = true;
        }
        bannerSwipeRefreshLayout.setRefreshing(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14667b(View view) {
        String str;
        if (System.currentTimeMillis() - this.f17783t > 3000) {
            this.f17783t = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "live_tab");
            String str2 = "is_login";
            if (C5951b.m18637b().mo14571k().isLogin()) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            C8443c.m25663a().mo21606a("livesdk_live_tab_take_button_click", hashMap, new Object[0]);
            C5951b.m18637b().mo14563c().enterRecorderActivity(getActivity());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14666a(Object obj) throws Exception {
        if (this.f17772f != null) {
            this.f17772f.mo20484a("enter_auto");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17773g = (DislikeTipViewModel) C0069x.m158a((Fragment) this, (C0067b) this.f17767b.mo14622a(mo14670m())).mo147a(DislikeTipViewModel.class);
        this.f17774h = m18751q();
        this.f17776j = (FeedTabViewModel) C0069x.m160a(getActivity(), (C0067b) this.f17774h).mo147a(FeedTabViewModel.class);
        this.f17780q = (TimeOutRefreshViewModel) C0069x.m158a((Fragment) this, (C0067b) this.f17767b).mo147a(TimeOutRefreshViewModel.class);
        this.f17780q.f21098a.mo19280a((C7326g<? super T>) new C6005d<Object>(this), C6006e.f17820a);
        this.f17781r = (SyncContentViewModel) C0069x.m158a((Fragment) this, this.f17775i).mo147a(SyncContentViewModel.class);
        this.f17766a.f21063l.observe(this, new C6007f(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17777k = super.onCreateView(layoutInflater, viewGroup, bundle);
        mo14663a(this.f17777k);
        return this.f17777k;
    }
}
