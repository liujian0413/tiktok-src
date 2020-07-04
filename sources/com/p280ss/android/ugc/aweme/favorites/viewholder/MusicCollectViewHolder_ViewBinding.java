package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder_ViewBinding */
public class MusicCollectViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicCollectViewHolder f73358a;

    /* renamed from: b */
    private View f73359b;

    /* renamed from: c */
    private View f73360c;

    /* renamed from: d */
    private View f73361d;

    public void unbind() {
        MusicCollectViewHolder musicCollectViewHolder = this.f73358a;
        if (musicCollectViewHolder != null) {
            this.f73358a = null;
            musicCollectViewHolder.mNameView = null;
            musicCollectViewHolder.mOriginalTag = null;
            musicCollectViewHolder.mSingerView = null;
            musicCollectViewHolder.mCoverView = null;
            musicCollectViewHolder.mRightView = null;
            musicCollectViewHolder.mPlayView = null;
            musicCollectViewHolder.mTopView = null;
            musicCollectViewHolder.mProgressBarView = null;
            musicCollectViewHolder.musicItemll = null;
            musicCollectViewHolder.mMusicDuration = null;
            musicCollectViewHolder.mOkView = null;
            this.f73359b.setOnClickListener(null);
            this.f73359b = null;
            this.f73360c.setOnClickListener(null);
            this.f73360c = null;
            this.f73361d.setOnClickListener(null);
            this.f73361d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicCollectViewHolder_ViewBinding(final MusicCollectViewHolder musicCollectViewHolder, View view) {
        this.f73358a = musicCollectViewHolder;
        musicCollectViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.dyg, "field 'mNameView'", TextView.class);
        musicCollectViewHolder.mOriginalTag = (ImageView) Utils.findRequiredViewAsType(view, R.id.bas, "field 'mOriginalTag'", ImageView.class);
        musicCollectViewHolder.mSingerView = (TextView) Utils.findRequiredViewAsType(view, R.id.e21, "field 'mSingerView'", TextView.class);
        musicCollectViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.czm, "field 'mCoverView'", RemoteImageView.class);
        musicCollectViewHolder.mRightView = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.cuu, "field 'mRightView'", RelativeLayout.class);
        musicCollectViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, R.id.bch, "field 'mPlayView'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.bss, "field 'mTopView' and method 'onClick'");
        musicCollectViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView, R.id.bss, "field 'mTopView'", LinearLayout.class);
        this.f73359b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicCollectViewHolder.onClick(view);
            }
        });
        musicCollectViewHolder.mProgressBarView = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.ca4, "field 'mProgressBarView'", ProgressBar.class);
        musicCollectViewHolder.musicItemll = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.c1g, "field 'musicItemll'", LinearLayout.class);
        musicCollectViewHolder.mMusicDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.y7, "field 'mMusicDuration'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cuo, "field 'mOkView' and method 'onClick'");
        musicCollectViewHolder.mOkView = (RelativeLayout) Utils.castView(findRequiredView2, R.id.cuo, "field 'mOkView'", RelativeLayout.class);
        this.f73360c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicCollectViewHolder.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.c1c, "method 'onClick'");
        this.f73361d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicCollectViewHolder.onClick(view);
            }
        });
    }
}
