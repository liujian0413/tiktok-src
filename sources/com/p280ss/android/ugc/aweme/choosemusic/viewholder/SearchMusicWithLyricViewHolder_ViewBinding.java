package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.SearchMusicWithLyricViewHolder_ViewBinding */
public class SearchMusicWithLyricViewHolder_ViewBinding extends MusicItemViewHolder_ViewBinding {

    /* renamed from: a */
    private SearchMusicWithLyricViewHolder f63448a;

    public void unbind() {
        SearchMusicWithLyricViewHolder searchMusicWithLyricViewHolder = this.f63448a;
        if (searchMusicWithLyricViewHolder != null) {
            this.f63448a = null;
            searchMusicWithLyricViewHolder.mTvLyric = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchMusicWithLyricViewHolder_ViewBinding(SearchMusicWithLyricViewHolder searchMusicWithLyricViewHolder, View view) {
        super(searchMusicWithLyricViewHolder, view);
        this.f63448a = searchMusicWithLyricViewHolder;
        searchMusicWithLyricViewHolder.mTvLyric = (TextView) Utils.findRequiredViewAsType(view, R.id.dxg, "field 'mTvLyric'", TextView.class);
    }
}
