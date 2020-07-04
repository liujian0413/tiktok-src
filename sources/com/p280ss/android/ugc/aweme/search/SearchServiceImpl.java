package com.p280ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27019at;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.p280ss.android.ugc.aweme.search.model.C37388a;

/* renamed from: com.ss.android.ugc.aweme.search.SearchServiceImpl */
public class SearchServiceImpl implements ISearchService {
    private static final String URL_SEARCH = "aweme://search";

    public void addActivityRouter() {
        C7195s.m22443a(URL_SEARCH, SearchResultActivity.class);
    }

    public boolean isSearchResultActivity(Activity activity) {
        return activity instanceof SearchResultActivity;
    }

    public Intent makeSearchResultActivityIntent(Context context) {
        return new Intent(context, SearchResultActivity.class);
    }

    public void launchSearchPage(C37388a aVar) {
        C37383f.f97614a.mo94070a(aVar.f97625a, aVar.f97626b, aVar.f97627c, aVar.f97628d, aVar.f97629e, aVar.f97630f);
    }

    public C1293v getAladdinCard(ViewGroup viewGroup, SearchUser searchUser) {
        return C27019at.m88773a(viewGroup, searchUser);
    }

    public C1293v getChallendgeAladdinCard(ViewGroup viewGroup, SearchChallenge searchChallenge) {
        return C27019at.m88772a(viewGroup, searchChallenge);
    }
}
