package com.p280ss.android.ugc.aweme.search;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.ISearchHandler */
public interface ISearchHandler {
    void addEnterParamForIntent(Intent intent, SearchEnterParam searchEnterParam);

    List<C0042h> getLifecycleObserverForSearchResultActivity(FragmentActivity fragmentActivity);

    Fragment getSearchResultFragmentInstance(SearchResultParam searchResultParam, SearchEnterParam searchEnterParam);

    String getSearchResultFragmentKeyEnterFrom();

    String getSearchResultFragmentKeySearchEnterParam();

    String getSearchResultFragmentKeySearchFrom();

    String getSearchResultFragmentKeySearchParam();

    boolean handleBackPressed(Fragment fragment);

    boolean isSearchResultFragment(Fragment fragment);

    void proxySearchIntermediatePageShowEventTrackerStart();

    void requestGuessSearchAdvanced(String str);

    void setupStatusBar(Activity activity);

    void startRankingListActivity(Context context, int i);
}
