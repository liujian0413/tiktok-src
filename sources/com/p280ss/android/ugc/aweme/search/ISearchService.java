package com.p280ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.search.model.C37388a;

/* renamed from: com.ss.android.ugc.aweme.search.ISearchService */
public interface ISearchService {
    void addActivityRouter();

    C1293v getAladdinCard(ViewGroup viewGroup, SearchUser searchUser);

    C1293v getChallendgeAladdinCard(ViewGroup viewGroup, SearchChallenge searchChallenge);

    boolean isSearchResultActivity(Activity activity);

    void launchSearchPage(C37388a aVar);

    Intent makeSearchResultActivityIntent(Context context);
}
