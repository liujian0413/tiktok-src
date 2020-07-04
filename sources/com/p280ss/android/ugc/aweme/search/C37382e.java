package com.p280ss.android.ugc.aweme.search;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.search.e */
public final class C37382e implements ISearchHandler {

    /* renamed from: a */
    public static final C37382e f97612a = new C37382e();

    /* renamed from: b */
    private static final ISearchHandler f97613b;

    private C37382e() {
    }

    public final void proxySearchIntermediatePageShowEventTrackerStart() {
        f97613b.proxySearchIntermediatePageShowEventTrackerStart();
    }

    public final String getSearchResultFragmentKeyEnterFrom() {
        String searchResultFragmentKeyEnterFrom = f97613b.getSearchResultFragmentKeyEnterFrom();
        C7573i.m23582a((Object) searchResultFragmentKeyEnterFrom, "INSTANCE_.searchResultFragmentKeyEnterFrom");
        return searchResultFragmentKeyEnterFrom;
    }

    public final String getSearchResultFragmentKeySearchEnterParam() {
        String searchResultFragmentKeySearchEnterParam = f97613b.getSearchResultFragmentKeySearchEnterParam();
        C7573i.m23582a((Object) searchResultFragmentKeySearchEnterParam, "INSTANCE_.searchResultFragmentKeySearchEnterParam");
        return searchResultFragmentKeySearchEnterParam;
    }

    public final String getSearchResultFragmentKeySearchFrom() {
        String searchResultFragmentKeySearchFrom = f97613b.getSearchResultFragmentKeySearchFrom();
        C7573i.m23582a((Object) searchResultFragmentKeySearchFrom, "INSTANCE_.searchResultFragmentKeySearchFrom");
        return searchResultFragmentKeySearchFrom;
    }

    public final String getSearchResultFragmentKeySearchParam() {
        String searchResultFragmentKeySearchParam = f97613b.getSearchResultFragmentKeySearchParam();
        C7573i.m23582a((Object) searchResultFragmentKeySearchParam, "INSTANCE_.searchResultFragmentKeySearchParam");
        return searchResultFragmentKeySearchParam;
    }

    static {
        Object service = ServiceManager.get().getService(ISearchHandler.class);
        C7573i.m23582a(service, "ServiceManager.get().get…earchHandler::class.java)");
        f97613b = (ISearchHandler) service;
    }

    public final boolean handleBackPressed(Fragment fragment) {
        return f97613b.handleBackPressed(fragment);
    }

    public final boolean isSearchResultFragment(Fragment fragment) {
        return f97613b.isSearchResultFragment(fragment);
    }

    public final void requestGuessSearchAdvanced(String str) {
        f97613b.requestGuessSearchAdvanced(str);
    }

    public final void setupStatusBar(Activity activity) {
        f97613b.setupStatusBar(activity);
    }

    public final List<C0042h> getLifecycleObserverForSearchResultActivity(FragmentActivity fragmentActivity) {
        List<C0042h> lifecycleObserverForSearchResultActivity = f97613b.getLifecycleObserverForSearchResultActivity(fragmentActivity);
        C7573i.m23582a((Object) lifecycleObserverForSearchResultActivity, "INSTANCE_.getLifecycleOb…hResultActivity(activity)");
        return lifecycleObserverForSearchResultActivity;
    }

    public final void addEnterParamForIntent(Intent intent, SearchEnterParam searchEnterParam) {
        f97613b.addEnterParamForIntent(intent, searchEnterParam);
    }

    public final void startRankingListActivity(Context context, int i) {
        f97613b.startRankingListActivity(context, i);
    }

    public final Fragment getSearchResultFragmentInstance(SearchResultParam searchResultParam, SearchEnterParam searchEnterParam) {
        Fragment searchResultFragmentInstance = f97613b.getSearchResultFragmentInstance(searchResultParam, searchEnterParam);
        C7573i.m23582a((Object) searchResultFragmentInstance, "INSTANCE_.getSearchResul…stance(param, enterParam)");
        return searchResultFragmentInstance;
    }
}
