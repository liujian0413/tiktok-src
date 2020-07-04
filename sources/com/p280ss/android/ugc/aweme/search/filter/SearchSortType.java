package com.p280ss.android.ugc.aweme.search.filter;

/* renamed from: com.ss.android.ugc.aweme.search.filter.SearchSortType */
public enum SearchSortType {
    SORT_GENERAL(0),
    SORT_DIGG(1),
    SORT_PUBLISH_TIME(2);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    private SearchSortType(int i) {
        this.value = i;
    }
}
