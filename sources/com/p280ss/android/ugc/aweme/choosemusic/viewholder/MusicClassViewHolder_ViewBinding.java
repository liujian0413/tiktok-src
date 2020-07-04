package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder_ViewBinding */
public class MusicClassViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicClassViewHolder f63372a;

    public void unbind() {
        MusicClassViewHolder musicClassViewHolder = this.f63372a;
        if (musicClassViewHolder != null) {
            this.f63372a = null;
            musicClassViewHolder.mTvTitleRight = null;
            musicClassViewHolder.mTvTitleLeft = null;
            musicClassViewHolder.mRvClassContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicClassViewHolder_ViewBinding(MusicClassViewHolder musicClassViewHolder, View view) {
        this.f63372a = musicClassViewHolder;
        musicClassViewHolder.mTvTitleRight = (TextView) Utils.findRequiredViewAsType(view, R.id.e3m, "field 'mTvTitleRight'", TextView.class);
        musicClassViewHolder.mTvTitleLeft = (TextView) Utils.findRequiredViewAsType(view, R.id.e3k, "field 'mTvTitleLeft'", TextView.class);
        musicClassViewHolder.mRvClassContainer = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cx6, "field 'mRvClassContainer'", RecyclerView.class);
    }
}
