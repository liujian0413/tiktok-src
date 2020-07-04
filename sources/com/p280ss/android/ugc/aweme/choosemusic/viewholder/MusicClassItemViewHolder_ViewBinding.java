package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassItemViewHolder_ViewBinding */
public class MusicClassItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicClassItemViewHolder f63363a;

    public void unbind() {
        MusicClassItemViewHolder musicClassItemViewHolder = this.f63363a;
        if (musicClassItemViewHolder != null) {
            this.f63363a = null;
            musicClassItemViewHolder.mTvClassName = null;
            musicClassItemViewHolder.mIvClassCover = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicClassItemViewHolder_ViewBinding(MusicClassItemViewHolder musicClassItemViewHolder, View view) {
        this.f63363a = musicClassItemViewHolder;
        musicClassItemViewHolder.mTvClassName = (TextView) Utils.findRequiredViewAsType(view, R.id.dru, "field 'mTvClassName'", TextView.class);
        musicClassItemViewHolder.mIvClassCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b7b, "field 'mIvClassCover'", RemoteImageView.class);
    }
}
