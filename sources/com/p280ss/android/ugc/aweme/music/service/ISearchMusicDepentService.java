package com.p280ss.android.ugc.aweme.music.service;

import android.support.p029v7.widget.RecyclerView;
import android.view.View.OnClickListener;
import com.p280ss.android.ugc.aweme.music.model.MusicTag;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.service.ISearchMusicDepentService */
public interface ISearchMusicDepentService {
    void mobClickMusicCardEvent(String str, MusicModel musicModel, int i, String str2);

    void mobShowMusicCardEvent(String str, MusicModel musicModel, int i);

    void showSearchMusicTags(RecyclerView recyclerView, List<MusicTag> list, OnClickListener onClickListener);
}
