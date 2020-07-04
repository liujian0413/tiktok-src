package com.p280ss.android.ugc.aweme.search.filter;

/* renamed from: com.ss.android.ugc.aweme.search.filter.a */
public final class C37384a {

    /* renamed from: a */
    public static final C37384a f97616a = new C37384a();

    private C37384a() {
    }

    /* renamed from: a */
    public static final int m119983a(FilterOption filterOption) {
        if (filterOption == null) {
            return 0;
        }
        if (filterOption.getSortType() == SearchSortType.SORT_GENERAL.getValue() && filterOption.getPublishTime() == SearchPublishTime.LIMIT_NO.getValue()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    public static final FilterOption m119984b(FilterOption filterOption) {
        if (filterOption == null) {
            return new FilterOption(SearchSortType.SORT_GENERAL.getValue(), SearchPublishTime.LIMIT_NO.getValue());
        }
        return filterOption;
    }
}
