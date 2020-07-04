package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.C11491a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.arch.ext.list.l */
public final class C11579l {
    /* renamed from: a */
    public static final <T, P extends C11583n> List<T> m34041a(IListState<T, P> iListState) {
        C7573i.m23587b(iListState, "$this$list");
        return ((ListState) iListState.getSubstate()).getList();
    }

    /* renamed from: b */
    public static final <T, P extends C11583n> C11491a<List<T>> m34042b(IListState<T, P> iListState) {
        C7573i.m23587b(iListState, "$this$refresh");
        return ((ListState) iListState.getSubstate()).getRefresh();
    }

    /* renamed from: c */
    public static final <T, P extends C11583n> C11491a<List<T>> m34043c(IListState<T, P> iListState) {
        C7573i.m23587b(iListState, "$this$loadMore");
        return ((ListState) iListState.getSubstate()).getLoadMore();
    }

    /* renamed from: d */
    public static final <T, P extends C11583n> C11556b m34044d(IListState<T, P> iListState) {
        C7573i.m23587b(iListState, "$this$hasMore");
        return ((ListState) iListState.getSubstate()).getHasMore();
    }
}
