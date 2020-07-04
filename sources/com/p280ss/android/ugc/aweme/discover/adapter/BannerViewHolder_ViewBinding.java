package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.BannerViewHolder_ViewBinding */
public class BannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BannerViewHolder f69420a;

    /* renamed from: b */
    private View f69421b;

    public void unbind() {
        BannerViewHolder bannerViewHolder = this.f69420a;
        if (bannerViewHolder != null) {
            this.f69420a = null;
            bannerViewHolder.mSdCover = null;
            this.f69421b.setOnClickListener(null);
            this.f69421b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BannerViewHolder_ViewBinding(final BannerViewHolder bannerViewHolder, View view) {
        this.f69420a = bannerViewHolder;
        View findRequiredView = Utils.findRequiredView(view, R.id.czm, "field 'mSdCover' and method 'clickCover'");
        bannerViewHolder.mSdCover = (SmartImageView) Utils.castView(findRequiredView, R.id.czm, "field 'mSdCover'", SmartImageView.class);
        this.f69421b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                bannerViewHolder.clickCover();
            }
        });
    }
}
