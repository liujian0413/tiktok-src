package com.p280ss.android.ugc.aweme.discover;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26610b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchResultFragment;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchResultFragment.C26966a;
import com.p280ss.android.ugc.aweme.discover.presenter.C26819e;
import com.p280ss.android.ugc.aweme.discover.viewmodel.C27254a;
import com.p280ss.android.ugc.aweme.search.ISearchHandler;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C43097ei;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.SearchHandlerImpl */
public final class SearchHandlerImpl implements ISearchHandler {
    public final String getSearchResultFragmentKeyEnterFrom() {
        return "enter_from";
    }

    public final String getSearchResultFragmentKeySearchEnterParam() {
        return "search_enter_param";
    }

    public final String getSearchResultFragmentKeySearchFrom() {
        return "search_from";
    }

    public final String getSearchResultFragmentKeySearchParam() {
        return "searchParam";
    }

    public final void startRankingListActivity(Context context, int i) {
        C7573i.m23587b(context, "context");
    }

    public final void proxySearchIntermediatePageShowEventTrackerStart() {
        C26610b.f70175a.mo68293a();
    }

    public final boolean isSearchResultFragment(Fragment fragment) {
        C7573i.m23587b(fragment, "fragment");
        return fragment instanceof SearchResultFragment;
    }

    public final void requestGuessSearchAdvanced(String str) {
        C26819e.f70769b.mo69479a(str);
    }

    public final List<C0042h> getLifecycleObserverForSearchResultActivity(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        return C7525m.m23457a(new SearchMusicPlayerLifecycleObserver(fragmentActivity));
    }

    public final boolean handleBackPressed(Fragment fragment) {
        C7573i.m23587b(fragment, "fragment");
        return ((SearchResultFragment) fragment).mo69591o();
    }

    public final void setupStatusBar(Activity activity) {
        C7573i.m23587b(activity, "activity");
        if (!C7212bb.m22495a(activity, R.color.a3z)) {
            C10994a.m32208b(activity);
            if (C6399b.m19946v()) {
                C43097ei.f111719a.mo104758a(activity, activity.getWindow(), true);
            }
        }
    }

    public final void addEnterParamForIntent(Intent intent, SearchEnterParam searchEnterParam) {
        C7573i.m23587b(intent, "intent");
        C27254a.m89271a(intent, searchEnterParam);
    }

    public final Fragment getSearchResultFragmentInstance(SearchResultParam searchResultParam, SearchEnterParam searchEnterParam) {
        C7573i.m23587b(searchResultParam, "param");
        return C26966a.m88699a(searchResultParam, searchEnterParam);
    }
}
