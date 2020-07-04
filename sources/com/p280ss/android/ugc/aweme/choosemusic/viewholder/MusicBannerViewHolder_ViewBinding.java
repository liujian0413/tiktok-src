package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder_ViewBinding */
public class MusicBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicBannerViewHolder f63342a;

    /* renamed from: b */
    private View f63343b;

    public void unbind() {
        MusicBannerViewHolder musicBannerViewHolder = this.f63342a;
        if (musicBannerViewHolder != null) {
            this.f63342a = null;
            musicBannerViewHolder.mSdCover = null;
            this.f63343b.setOnClickListener(null);
            this.f63343b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicBannerViewHolder_ViewBinding(final MusicBannerViewHolder musicBannerViewHolder, View view) {
        this.f63342a = musicBannerViewHolder;
        View findRequiredView = Utils.findRequiredView(view, R.id.czm, "field 'mSdCover' and method 'clickCover'");
        musicBannerViewHolder.mSdCover = (SmartImageView) Utils.castView(findRequiredView, R.id.czm, "field 'mSdCover'", SmartImageView.class);
        this.f63343b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicBannerViewHolder.clickCover();
            }
        });
    }
}
