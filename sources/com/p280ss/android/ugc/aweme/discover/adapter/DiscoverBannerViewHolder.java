package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bolts.C1592h;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.helper.C26666n;
import com.p280ss.android.ugc.aweme.discover.mob.DiscoveryMetricsParam;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.p280ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.InfiniteLoopPagerAdapter;
import com.p280ss.android.ugc.aweme.utils.C42917ae;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder */
public class DiscoverBannerViewHolder extends C1293v {

    /* renamed from: a */
    public static final List<Banner> f69462a = Arrays.asList(new Banner[]{new Banner()});

    /* renamed from: b */
    private BannerAdapter f69463b;

    /* renamed from: c */
    private final C26666n f69464c;

    /* renamed from: d */
    private List<Banner> f69465d;

    /* renamed from: e */
    private Context f69466e;

    /* renamed from: f */
    private boolean f69467f = true;

    /* renamed from: g */
    private boolean f69468g = true;
    RelativeLayout mBannerLayout;
    IndicatorView mIndicator;
    View mStatusBar;
    TextView mTitle;
    ViewPager mViewPager;

    /* renamed from: a */
    public final void mo67950a(boolean z) {
        if (!z || !this.f69467f) {
            this.f69464c.mo68377c();
            this.mViewPager.setOnTouchListener(null);
            return;
        }
        this.f69464c.mo68376b();
    }

    /* renamed from: b */
    public final void mo67951b(boolean z) {
        if (z && this.mViewPager != null && this.mViewPager.getChildCount() > 0) {
            mo67948a(this.mViewPager.getCurrentItem());
        }
        mo67952c(z);
    }

    /* renamed from: c */
    public final void mo67952c(boolean z) {
        if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            this.f69467f = z;
        }
    }

    public DiscoverBannerViewHolder(View view) {
        super(view);
        this.f69466e = view.getContext();
        ButterKnife.bind((Object) this, view);
        m86789a(this.f69466e);
        this.f69464c = new C26666n(this.mViewPager);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBar.getLayoutParams().height = C9738o.m28717e(view.getContext());
        }
        this.mViewPager.addOnPageChangeListener(new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                DiscoverBannerViewHolder.this.mo67948a(i);
            }
        });
        C0991u.m4209d((View) this.mIndicator, 0);
    }

    /* renamed from: a */
    private void m86789a(Context context) {
        int i;
        int i2;
        if (!C6399b.m19944t()) {
            i = C9738o.m28691a(context) - ((int) (C9738o.m28708b(context, 16.0f) * 2.0f));
        } else {
            i = C9738o.m28691a(context);
        }
        if (C26654b.m87573a()) {
            this.mTitle.setVisibility(8);
            i2 = (int) (((float) i) * 0.34985423f);
        } else if (C26654b.m87574b()) {
            this.mTitle.setVisibility(0);
            i2 = (int) (((float) i) * 0.34985423f);
        } else {
            this.mTitle.setVisibility(8);
            i2 = (int) (((float) i) * 0.48104957f);
        }
        LayoutParams layoutParams = (LayoutParams) this.mBannerLayout.getLayoutParams();
        if (!C6399b.m19944t()) {
            layoutParams.setMargins((int) C9738o.m28708b(context, 16.0f), 0, (int) C9738o.m28708b(context, 16.0f), 0);
        }
        layoutParams.height = i2;
        this.mBannerLayout.setLayoutParams(layoutParams);
        if (!C6399b.m19944t() && VERSION.SDK_INT >= 21) {
            this.mBannerLayout.setOutlineProvider(new C43070ds((int) C9738o.m28708b(this.itemView.getContext(), 2.0f)));
            this.mBannerLayout.setClipToOutline(true);
        }
    }

    /* renamed from: a */
    public final void mo67948a(int i) {
        if (this.f69465d != null && this.f69465d.size() != 0) {
            List<Banner> list = this.f69465d;
            Banner banner = (Banner) list.get(i % list.size());
            int size = (i % this.f69465d.size()) + 1;
            List<Banner> list2 = this.f69465d;
            C1592h.m7855a((Callable<TResult>) new C26485e<TResult>(size, banner, C42917ae.m136252a(((Banner) list2.get(i % list2.size())).getSchema())), (Executor) C6907h.m21516a());
            if (banner.isAd()) {
                C24976t.m82144b(this.f69466e, banner, (i % this.f69465d.size()) + 1);
            }
        }
    }

    /* renamed from: a */
    public final void mo67949a(List<Banner> list, boolean z) {
        Context context = this.itemView.getContext();
        if (!f69462a.equals(list)) {
            if (this.f69463b == null) {
                this.f69463b = new BannerAdapter(context, LayoutInflater.from(context));
                this.mViewPager.setAdapter(new InfiniteLoopPagerAdapter(this.f69463b));
            }
            boolean a = C43127fh.m136806a(context);
            if (a) {
                Collections.reverse(list);
            }
            this.f69464c.f70304a = list.size();
            this.f69463b.mo67907a(list);
            this.mIndicator.mo70044a(this.mViewPager);
            this.f69465d = list;
            if (a) {
                this.mViewPager.setCurrentItem(list.size() - 1);
            }
            if (this.f69468g) {
                if (this.f69465d.size() != 0) {
                    mo67948a(this.mViewPager.getCurrentItem());
                }
                this.f69468g = false;
            }
            mo67950a(true);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m86788a(int i, Banner banner, String str) throws Exception {
        C6907h.onEvent(MobClick.obtain().setEventName("banner_show").setLabelName("discovery").setExtValueLong((long) i).setValue(Long.toString(banner.getCreativeId())));
        C6907h.m21524a("banner_show", (Map) new DiscoveryMetricsParam().setBannerId(banner.getBid()).setTagId(str).setClientOrder(i).buildParams());
        return null;
    }
}
