package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p022v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder_ViewBinding */
public class MusicBoardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicBoardViewHolder f63359a;

    public void unbind() {
        MusicBoardViewHolder musicBoardViewHolder = this.f63359a;
        if (musicBoardViewHolder != null) {
            this.f63359a = null;
            musicBoardViewHolder.mTvTitleRight = null;
            musicBoardViewHolder.mTvTitleLeft = null;
            musicBoardViewHolder.mVpMusicContainer = null;
            musicBoardViewHolder.mVwLine = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicBoardViewHolder_ViewBinding(MusicBoardViewHolder musicBoardViewHolder, View view) {
        this.f63359a = musicBoardViewHolder;
        musicBoardViewHolder.mTvTitleRight = (TextView) Utils.findRequiredViewAsType(view, R.id.e3m, "field 'mTvTitleRight'", TextView.class);
        musicBoardViewHolder.mTvTitleLeft = (TextView) Utils.findRequiredViewAsType(view, R.id.e3k, "field 'mTvTitleLeft'", TextView.class);
        musicBoardViewHolder.mVpMusicContainer = (ViewPager) Utils.findRequiredViewAsType(view, R.id.eei, "field 'mVpMusicContainer'", ViewPager.class);
        musicBoardViewHolder.mVwLine = Utils.findRequiredView(view, R.id.a9o, "field 'mVwLine'");
    }
}
