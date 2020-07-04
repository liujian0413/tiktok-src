package com.p280ss.android.ugc.aweme.search.filter;

/* renamed from: com.ss.android.ugc.aweme.search.filter.SearchPublishTime */
public enum SearchPublishTime {
    LIMIT_NO(0),
    LIMIT_ONE(1),
    LIMIT_SEVEN(7),
    LIMIT_HALF_YEAR(183);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    private SearchPublishTime(int i) {
        this.value = i;
    }
}
