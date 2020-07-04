package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemNoLyricViewHolder_ViewBinding */
public class MusicItemNoLyricViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicItemNoLyricViewHolder f63378a;

    public void unbind() {
        MusicItemNoLyricViewHolder musicItemNoLyricViewHolder = this.f63378a;
        if (musicItemNoLyricViewHolder != null) {
            this.f63378a = null;
            musicItemNoLyricViewHolder.mIvMusicCover = null;
            musicItemNoLyricViewHolder.mOriginalTag = null;
            musicItemNoLyricViewHolder.mIvMusicMark = null;
            musicItemNoLyricViewHolder.mTvMusicName = null;
            musicItemNoLyricViewHolder.mTvMusicSinger = null;
            musicItemNoLyricViewHolder.mTvMusicDuration = null;
            musicItemNoLyricViewHolder.mIvMusicMask2 = null;
            musicItemNoLyricViewHolder.mTvNotSupportLyric = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicItemNoLyricViewHolder_ViewBinding(MusicItemNoLyricViewHolder musicItemNoLyricViewHolder, View view) {
        this.f63378a = musicItemNoLyricViewHolder;
        musicItemNoLyricViewHolder.mIvMusicCover = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.b7x, "field 'mIvMusicCover'", SmartImageView.class);
        musicItemNoLyricViewHolder.mOriginalTag = (ImageView) Utils.findRequiredViewAsType(view, R.id.bas, "field 'mOriginalTag'", ImageView.class);
        musicItemNoLyricViewHolder.mIvMusicMark = (ImageView) Utils.findRequiredViewAsType(view, R.id.bah, "field 'mIvMusicMark'", ImageView.class);
        musicItemNoLyricViewHolder.mTvMusicName = (TextView) Utils.findRequiredViewAsType(view, R.id.dyg, "field 'mTvMusicName'", TextView.class);
        musicItemNoLyricViewHolder.mTvMusicSinger = (TextView) Utils.findRequiredViewAsType(view, R.id.e21, "field 'mTvMusicSinger'", TextView.class);
        musicItemNoLyricViewHolder.mTvMusicDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.dy_, "field 'mTvMusicDuration'", TextView.class);
        musicItemNoLyricViewHolder.mIvMusicMask2 = (ImageView) Utils.findRequiredViewAsType(view, R.id.bai, "field 'mIvMusicMask2'", ImageView.class);
        musicItemNoLyricViewHolder.mTvNotSupportLyric = (TextView) Utils.findRequiredViewAsType(view, R.id.dyn, "field 'mTvNotSupportLyric'", TextView.class);
    }
}
