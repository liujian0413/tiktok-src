package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder_ViewBinding */
public class MusicItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicItemViewHolder f63397a;

    /* renamed from: b */
    private View f63398b;

    /* renamed from: c */
    private View f63399c;

    /* renamed from: d */
    private View f63400d;

    /* renamed from: e */
    private View f63401e;

    public void unbind() {
        MusicItemViewHolder musicItemViewHolder = this.f63397a;
        if (musicItemViewHolder != null) {
            this.f63397a = null;
            musicItemViewHolder.mIvMusicCover = null;
            musicItemViewHolder.mOriginalTag = null;
            musicItemViewHolder.mIvMusicMark = null;
            musicItemViewHolder.mIvPlayView = null;
            musicItemViewHolder.mTvMusicName = null;
            musicItemViewHolder.mTvMusicSinger = null;
            musicItemViewHolder.mIvMusicCollect = null;
            musicItemViewHolder.mIvMusicDetail = null;
            musicItemViewHolder.mLlUseToShoot = null;
            musicItemViewHolder.mIvUseToShoot = null;
            musicItemViewHolder.mTvUseToShoot = null;
            musicItemViewHolder.mRlUseContainer = null;
            musicItemViewHolder.mLlItemContainer = null;
            musicItemViewHolder.mRLCoverContainer = null;
            musicItemViewHolder.mLlTitltContainer = null;
            musicItemViewHolder.mSpaceView = null;
            musicItemViewHolder.mTvMusicDuration = null;
            musicItemViewHolder.mMusicTagsContainer = null;
            this.f63398b.setOnClickListener(null);
            this.f63398b = null;
            this.f63399c.setOnClickListener(null);
            this.f63399c = null;
            this.f63400d.setOnClickListener(null);
            this.f63400d = null;
            this.f63401e.setOnClickListener(null);
            this.f63401e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicItemViewHolder_ViewBinding(final MusicItemViewHolder musicItemViewHolder, View view) {
        this.f63397a = musicItemViewHolder;
        musicItemViewHolder.mIvMusicCover = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.b7x, "field 'mIvMusicCover'", SmartImageView.class);
        musicItemViewHolder.mOriginalTag = (ImageView) Utils.findRequiredViewAsType(view, R.id.bas, "field 'mOriginalTag'", ImageView.class);
        musicItemViewHolder.mIvMusicMark = (ImageView) Utils.findRequiredViewAsType(view, R.id.bah, "field 'mIvMusicMark'", ImageView.class);
        musicItemViewHolder.mIvPlayView = (ImageView) Utils.findRequiredViewAsType(view, R.id.bch, "field 'mIvPlayView'", ImageView.class);
        musicItemViewHolder.mTvMusicName = (TextView) Utils.findRequiredViewAsType(view, R.id.dyg, "field 'mTvMusicName'", TextView.class);
        musicItemViewHolder.mTvMusicSinger = (TextView) Utils.findRequiredViewAsType(view, R.id.e21, "field 'mTvMusicSinger'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.bae, "field 'mIvMusicCollect' and method 'onClick'");
        musicItemViewHolder.mIvMusicCollect = (CheckableImageView) Utils.castView(findRequiredView, R.id.bae, "field 'mIvMusicCollect'", CheckableImageView.class);
        this.f63398b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicItemViewHolder.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bag, "field 'mIvMusicDetail' and method 'onClick'");
        musicItemViewHolder.mIvMusicDetail = (ImageView) Utils.castView(findRequiredView2, R.id.bag, "field 'mIvMusicDetail'", ImageView.class);
        this.f63399c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicItemViewHolder.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bsu, "field 'mLlUseToShoot' and method 'onClick'");
        musicItemViewHolder.mLlUseToShoot = (ViewGroup) Utils.castView(findRequiredView3, R.id.bsu, "field 'mLlUseToShoot'", ViewGroup.class);
        this.f63400d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicItemViewHolder.onClick(view);
            }
        });
        musicItemViewHolder.mIvUseToShoot = (ImageView) Utils.findRequiredViewAsType(view, R.id.bde, "field 'mIvUseToShoot'", ImageView.class);
        musicItemViewHolder.mTvUseToShoot = (TextView) Utils.findRequiredViewAsType(view, R.id.e4d, "field 'mTvUseToShoot'", TextView.class);
        musicItemViewHolder.mRlUseContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cv_, "field 'mRlUseContainer'", ViewGroup.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.bs2, "field 'mLlItemContainer' and method 'onClick'");
        musicItemViewHolder.mLlItemContainer = (ViewGroup) Utils.castView(findRequiredView4, R.id.bs2, "field 'mLlItemContainer'", ViewGroup.class);
        this.f63401e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicItemViewHolder.onClick(view);
            }
        });
        musicItemViewHolder.mRLCoverContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cua, "field 'mRLCoverContainer'", ViewGroup.class);
        musicItemViewHolder.mLlTitltContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.bsq, "field 'mLlTitltContainer'", ViewGroup.class);
        musicItemViewHolder.mSpaceView = Utils.findRequiredView(view, R.id.efb, "field 'mSpaceView'");
        musicItemViewHolder.mTvMusicDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.dy_, "field 'mTvMusicDuration'", TextView.class);
        musicItemViewHolder.mMusicTagsContainer = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.c23, "field 'mMusicTagsContainer'", RecyclerView.class);
    }
}
