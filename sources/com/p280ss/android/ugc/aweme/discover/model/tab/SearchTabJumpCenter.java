package com.p280ss.android.ugc.aweme.discover.model.tab;

/* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter */
public final class SearchTabJumpCenter {
    public static final SearchTabJumpCenter INSTANCE = new SearchTabJumpCenter();
    private static SearchTabViewModel searchTabViewModel;

    private SearchTabJumpCenter() {
    }

    public final SearchTabViewModel getSearchTabViewModel() {
        return searchTabViewModel;
    }

    public final void setSearchTabViewModel(SearchTabViewModel searchTabViewModel2) {
        searchTabViewModel = searchTabViewModel2;
    }
}
