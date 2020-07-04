package com.p280ss.android.ugc.aweme.music.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder_ViewBinding */
public class MusicCollectionViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicCollectionViewHolder f87977a;

    public void unbind() {
        MusicCollectionViewHolder musicCollectionViewHolder = this.f87977a;
        if (musicCollectionViewHolder != null) {
            this.f87977a = null;
            musicCollectionViewHolder.mNameView = null;
            musicCollectionViewHolder.mCoverView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicCollectionViewHolder_ViewBinding(MusicCollectionViewHolder musicCollectionViewHolder, View view) {
        this.f87977a = musicCollectionViewHolder;
        musicCollectionViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.c33, "field 'mNameView'", TextView.class);
        musicCollectionViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.c1_, "field 'mCoverView'", RemoteImageView.class);
    }
}
