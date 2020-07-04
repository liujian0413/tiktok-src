package com.p280ss.android.ugc.aweme.music.adapter;

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
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder_ViewBinding */
public class MusicUnitViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicUnitViewHolder f88041a;

    /* renamed from: b */
    private View f88042b;

    /* renamed from: c */
    private View f88043c;

    /* renamed from: d */
    private View f88044d;

    /* renamed from: e */
    private View f88045e;

    public void unbind() {
        MusicUnitViewHolder musicUnitViewHolder = this.f88041a;
        if (musicUnitViewHolder != null) {
            this.f88041a = null;
            musicUnitViewHolder.mNameView = null;
            musicUnitViewHolder.mSingerView = null;
            musicUnitViewHolder.mDurationView = null;
            musicUnitViewHolder.mCoverView = null;
            musicUnitViewHolder.mOkView = null;
            musicUnitViewHolder.mRightView = null;
            musicUnitViewHolder.mPlayView = null;
            musicUnitViewHolder.mTopView = null;
            musicUnitViewHolder.mProgressBarView = null;
            musicUnitViewHolder.musicDetailContainer = null;
            musicUnitViewHolder.musicItemll = null;
            musicUnitViewHolder.ivDetail = null;
            musicUnitViewHolder.divider = null;
            musicUnitViewHolder.ivCollectFrame = null;
            musicUnitViewHolder.ivMusicCollect = null;
            musicUnitViewHolder.ivOriginMusicMark = null;
            this.f88042b.setOnClickListener(null);
            this.f88042b = null;
            this.f88043c.setOnClickListener(null);
            this.f88043c = null;
            this.f88044d.setOnClickListener(null);
            this.f88044d = null;
            this.f88045e.setOnClickListener(null);
            this.f88045e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicUnitViewHolder_ViewBinding(final MusicUnitViewHolder musicUnitViewHolder, View view) {
        this.f88041a = musicUnitViewHolder;
        musicUnitViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.dyg, "field 'mNameView'", TextView.class);
        musicUnitViewHolder.mSingerView = (TextView) Utils.findRequiredViewAsType(view, R.id.e21, "field 'mSingerView'", TextView.class);
        musicUnitViewHolder.mDurationView = (TextView) Utils.findRequiredViewAsType(view, R.id.dtp, "field 'mDurationView'", TextView.class);
        musicUnitViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.czm, "field 'mCoverView'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.cuo, "field 'mOkView' and method 'onClick'");
        musicUnitViewHolder.mOkView = (LinearLayout) Utils.castView(findRequiredView, R.id.cuo, "field 'mOkView'", LinearLayout.class);
        this.f88042b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicUnitViewHolder.onClick(view);
            }
        });
        musicUnitViewHolder.mRightView = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.cuu, "field 'mRightView'", RelativeLayout.class);
        musicUnitViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, R.id.bch, "field 'mPlayView'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bss, "field 'mTopView' and method 'onClick'");
        musicUnitViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView2, R.id.bss, "field 'mTopView'", LinearLayout.class);
        this.f88043c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicUnitViewHolder.onClick(view);
            }
        });
        musicUnitViewHolder.mProgressBarView = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.ca4, "field 'mProgressBarView'", ProgressBar.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.c1d, "field 'musicDetailContainer' and method 'onClick'");
        musicUnitViewHolder.musicDetailContainer = (LinearLayout) Utils.castView(findRequiredView3, R.id.c1d, "field 'musicDetailContainer'", LinearLayout.class);
        this.f88044d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicUnitViewHolder.onClick(view);
            }
        });
        musicUnitViewHolder.musicItemll = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.c1g, "field 'musicItemll'", LinearLayout.class);
        musicUnitViewHolder.ivDetail = (ImageView) Utils.findRequiredViewAsType(view, R.id.c1c, "field 'ivDetail'", ImageView.class);
        musicUnitViewHolder.divider = Utils.findRequiredView(view, R.id.c28, "field 'divider'");
        View findRequiredView4 = Utils.findRequiredView(view, R.id.y3, "field 'ivCollectFrame' and method 'onClick'");
        musicUnitViewHolder.ivCollectFrame = (LinearLayout) Utils.castView(findRequiredView4, R.id.y3, "field 'ivCollectFrame'", LinearLayout.class);
        this.f88045e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicUnitViewHolder.onClick(view);
            }
        });
        musicUnitViewHolder.ivMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.c19, "field 'ivMusicCollect'", CheckableImageView.class);
        musicUnitViewHolder.ivOriginMusicMark = (ImageView) Utils.findRequiredViewAsType(view, R.id.c9f, "field 'ivOriginMusicMark'", ImageView.class);
    }
}
