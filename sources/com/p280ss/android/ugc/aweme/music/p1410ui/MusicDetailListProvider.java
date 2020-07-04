package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.C23743b;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.DetailAwemeListProvider;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.music.presenter.C33809j;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailListProvider */
public class MusicDetailListProvider implements DetailAwemeListProvider {
    public boolean sendCustomRequest(C25674b bVar, int i) {
        return false;
    }

    public C23743b getJumpToVideoParam(C23743b bVar, Aweme aweme) {
        bVar.f62612a = "from_music";
        bVar.f62613b = "music_id";
        return bVar;
    }

    public C25674b getPresenter(int i, FragmentActivity fragmentActivity) {
        C25674b bVar = new C25674b();
        bVar.mo66536a(new C33809j());
        return bVar;
    }

    public DetailAwemeViewHolder onCreateDetailAwemeViewHolder(View view, String str, C23685d dVar) {
        return new MusicDetailAwemeViewHolder(view, str, dVar);
    }
}
