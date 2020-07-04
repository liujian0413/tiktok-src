package com.p280ss.avframework.livestreamv2.filter;

import com.p280ss.avframework.livestreamv2.filter.IFilterManager.ErrorListener;

/* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$$Lambda$0 */
final /* synthetic */ class FilterManager$$Lambda$0 implements ErrorListener {
    static final ErrorListener $instance = new FilterManager$$Lambda$0();

    private FilterManager$$Lambda$0() {
    }

    public final void onError(int i, String str) {
        FilterManager.lambda$new$0$FilterManager(i, str);
    }
}
