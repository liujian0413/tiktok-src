package com.p280ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.search.model.C37388a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.search.g */
public final class C37385g implements ISearchService {

    /* renamed from: a */
    public static final C37385g f97617a = new C37385g();

    /* renamed from: b */
    private static final ISearchService f97618b;

    private C37385g() {
    }

    public final void addActivityRouter() {
        f97618b.addActivityRouter();
    }

    static {
        Object service = ServiceManager.get().getService(ISearchService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…earchService::class.java)");
        f97618b = (ISearchService) service;
    }

    public final boolean isSearchResultActivity(Activity activity) {
        return f97618b.isSearchResultActivity(activity);
    }

    public final void launchSearchPage(C37388a aVar) {
        f97618b.launchSearchPage(aVar);
    }

    public final Intent makeSearchResultActivityIntent(Context context) {
        Intent makeSearchResultActivityIntent = f97618b.makeSearchResultActivityIntent(context);
        C7573i.m23582a((Object) makeSearchResultActivityIntent, "INSTANCE_.makeSearchResultActivityIntent(context)");
        return makeSearchResultActivityIntent;
    }

    public final C1293v getAladdinCard(ViewGroup viewGroup, SearchUser searchUser) {
        return f97618b.getAladdinCard(viewGroup, searchUser);
    }

    public final C1293v getChallendgeAladdinCard(ViewGroup viewGroup, SearchChallenge searchChallenge) {
        C1293v challendgeAladdinCard = f97618b.getChallendgeAladdinCard(viewGroup, searchChallenge);
        C7573i.m23582a((Object) challendgeAladdinCard, "INSTANCE_.getChallendgeA…ntainer, searchChallenge)");
        return challendgeAladdinCard;
    }
}
