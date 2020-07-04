package com.p280ss.android.ugc.aweme.movie.view;

import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.C23743b;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.DetailAwemeListProvider;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.movie.p1402a.C33642a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailAwemeListProvider */
public final class MovieDetailAwemeListProvider implements DetailAwemeListProvider {
    private WeakReference<FragmentActivity> activity;

    public final WeakReference<FragmentActivity> getActivity() {
        return this.activity;
    }

    public final boolean sendCustomRequest(C25674b<? extends C25673a<?, ?>> bVar, int i) {
        return false;
    }

    public final void setActivity(WeakReference<FragmentActivity> weakReference) {
        this.activity = weakReference;
    }

    public final C25674b<? extends C25673a<?, ?>> getPresenter(int i, FragmentActivity fragmentActivity) {
        C25674b<? extends C25673a<?, ?>> bVar = new C25674b<>();
        bVar.mo66536a(new C33642a());
        return bVar;
    }

    public final C23743b getJumpToVideoParam(C23743b bVar, Aweme aweme) {
        C7573i.m23587b(bVar, "param");
        C7573i.m23587b(aweme, "aweme");
        bVar.f62612a = "from_detail_activity";
        bVar.f62613b = "movie_id";
        bVar.f62614c = "mv_page";
        return bVar;
    }

    public final DetailAwemeViewHolder onCreateDetailAwemeViewHolder(View view, String str, C23685d dVar) {
        return new MovieDetailAwemeViewHolder(view, str, dVar);
    }
}
