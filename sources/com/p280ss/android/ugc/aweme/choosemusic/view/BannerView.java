package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicBannerAdapter;
import com.p280ss.android.ugc.aweme.discover.helper.C26666n;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.p280ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.InfiniteLoopPagerAdapter;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.BannerView */
public class BannerView {

    /* renamed from: a */
    public static final List<Banner> f63252a = Arrays.asList(new Banner[]{new Banner()});

    /* renamed from: b */
    private MusicBannerAdapter f63253b;

    /* renamed from: c */
    private final C26666n f63254c = new C26666n(this.mViewPager, 3000);

    /* renamed from: d */
    private Context f63255d;

    /* renamed from: e */
    private int f63256e;
    RelativeLayout mBannerLayout;
    IndicatorView mIndicator;
    ViewGroup mLlBannerContainer;
    View mStatusBar;
    ViewPager mViewPager;

    /* renamed from: a */
    private void m78577a(boolean z) {
        if (z) {
            this.f63254c.mo68376b();
            return;
        }
        this.f63254c.mo68377c();
        this.mViewPager.setOnTouchListener(null);
    }

    /* renamed from: a */
    private void m78576a(Context context) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mLlBannerContainer.getLayoutParams();
        marginLayoutParams.leftMargin = (int) C9738o.m28708b(this.mLlBannerContainer.getContext(), 16.0f);
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        int a = (int) (((float) (C9738o.m28691a(context) - ((int) (C9738o.m28708b(context, 16.0f) * 2.0f)))) * 0.26239067f);
        LayoutParams layoutParams = this.mBannerLayout.getLayoutParams();
        layoutParams.height = a;
        this.mBannerLayout.setLayoutParams(layoutParams);
        if (VERSION.SDK_INT >= 21) {
            this.mBannerLayout.setOutlineProvider(new C43070ds((int) C9738o.m28708b(this.f63255d, 2.0f)));
            this.mBannerLayout.setClipToOutline(true);
        }
    }

    public BannerView(View view, int i) {
        this.f63255d = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f63256e = i;
        m78576a(this.f63255d);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBar.getLayoutParams().height = C9738o.m28717e(view.getContext());
        }
        C0991u.m4209d((View) this.mIndicator, 0);
    }

    /* renamed from: a */
    public final void mo62110a(List<Banner> list, boolean z) {
        Context context = this.f63255d;
        if (!f63252a.equals(list)) {
            if (this.f63253b == null) {
                this.f63253b = new MusicBannerAdapter(context, LayoutInflater.from(context), this.f63256e);
                this.mViewPager.setAdapter(new InfiniteLoopPagerAdapter(this.f63253b));
            }
            boolean a = C43127fh.m136806a(context);
            if (a) {
                Collections.reverse(list);
            }
            this.f63254c.f70304a = list.size();
            this.f63253b.mo61896a(list);
            this.mIndicator.mo70044a(this.mViewPager);
            if (a) {
                this.mViewPager.setCurrentItem(list.size() - 1);
            }
            m78577a(true);
        }
    }
}
