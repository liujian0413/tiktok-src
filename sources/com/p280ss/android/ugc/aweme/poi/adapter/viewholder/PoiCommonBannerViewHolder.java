package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.discover.helper.C26666n;
import com.p280ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p280ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.InfiniteLoopPoiBannerAdapter;
import com.p280ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter;
import com.p280ss.android.ugc.aweme.poi.bean.PoiBannerItem;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommonBannerViewHolder */
public class PoiCommonBannerViewHolder extends C1293v {

    /* renamed from: a */
    public List<PoiClassRankBannerStruct> f91497a;

    /* renamed from: b */
    private C26666n f91498b;

    /* renamed from: c */
    private PoiRankBannerPagerAdapter f91499c;

    /* renamed from: d */
    private Context f91500d;

    /* renamed from: e */
    private View f91501e;

    /* renamed from: f */
    private PoiSimpleBundle f91502f;
    protected View mDividerBottom;
    protected IndicatorView mIndicator;
    protected BannerViewPager mViewPager;

    public PoiCommonBannerViewHolder(View view) {
        super(view);
        this.f91500d = view.getContext();
        this.f91501e = view;
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo88795a(PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
        C35454m.m114523a(this.f91502f, "banner_show", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("previous_page", this.f91502f.getPreviousPage()).mo59973a("banner_id", poiClassRankBannerStruct.getBid()).mo59970a("client_order", i).mo59973a("city_info", C33230ac.m107204a()).mo59973a("from_poi_id", this.f91502f.getPoiId()));
    }

    /* renamed from: a */
    public final void mo88794a(PoiBannerItem poiBannerItem, PoiSimpleBundle poiSimpleBundle) {
        if (poiBannerItem == null || poiBannerItem.size() == 0) {
            this.f91501e.setVisibility(8);
        } else if (this.f91497a == null) {
            this.f91502f = poiSimpleBundle;
            this.f91501e.setVisibility(0);
            this.f91497a = poiBannerItem.getBanners();
            this.f91498b = new C26666n(this.mViewPager);
            C0991u.m4209d((View) this.mIndicator, 0);
            if (this.f91499c == null) {
                this.f91499c = new PoiRankBannerPagerAdapter(this.f91500d, LayoutInflater.from(this.f91500d));
                this.f91499c.f91427d = this.f91502f;
                this.mViewPager.setAdapter(new InfiniteLoopPoiBannerAdapter(this.f91499c, this.f91497a.size(), true));
            }
            this.f91498b.f70304a = this.f91497a.size();
            this.f91499c.mo88770a(this.f91497a, 0, "", 53);
            this.mIndicator.mo70044a(this.mViewPager);
            if (this.f91497a.size() > 1) {
                this.mIndicator.setVisibility(0);
                this.f91498b.mo68376b();
            } else {
                this.mIndicator.setVisibility(8);
                this.f91498b.mo68377c();
                this.mViewPager.setOnTouchListener(null);
            }
            mo88795a((PoiClassRankBannerStruct) this.f91497a.get(0), 0);
            this.mViewPager.addOnPageChangeListener(new C0935e() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageSelected(int i) {
                    int size = i % PoiCommonBannerViewHolder.this.f91497a.size();
                    PoiCommonBannerViewHolder.this.mo88795a((PoiClassRankBannerStruct) PoiCommonBannerViewHolder.this.f91497a.get(size), size);
                }
            });
        }
    }
}
