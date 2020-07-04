package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState */
public final class SearchState implements C11670t {
    private final ListState<C26754d, C26733e> listState;
    private final C26734f searchParam;

    public SearchState() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.mixfeed.d, com.ss.android.ugc.aweme.discover.jedi.viewmodel.e>, for r1v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState copy$default(com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState r0, com.bytedance.jedi.arch.ext.list.ListState<com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d, com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26733e> r1, com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26734f r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.mixfeed.d, com.ss.android.ugc.aweme.discover.jedi.viewmodel.e> r1 = r0.listState
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.f r2 = r0.searchParam
        L_0x000c:
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState.copy$default(com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState, com.bytedance.jedi.arch.ext.list.ListState, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f, int, java.lang.Object):com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState");
    }

    public final ListState<C26754d, C26733e> component1() {
        return this.listState;
    }

    public final C26734f component2() {
        return this.searchParam;
    }

    public final SearchState copy(ListState<C26754d, C26733e> listState2, C26734f fVar) {
        C7573i.m23587b(listState2, "listState");
        C7573i.m23587b(fVar, "searchParam");
        return new SearchState(listState2, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.searchParam, (java.lang.Object) r3.searchParam) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState r3 = (com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState) r3
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.mixfeed.d, com.ss.android.ugc.aweme.discover.jedi.viewmodel.e> r0 = r2.listState
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.mixfeed.d, com.ss.android.ugc.aweme.discover.jedi.viewmodel.e> r1 = r3.listState
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.f r0 = r2.searchParam
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.f r3 = r3.searchParam
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState.equals(java.lang.Object):boolean");
    }

    public final ListState<C26754d, C26733e> getListState() {
        return this.listState;
    }

    public final C26734f getSearchParam() {
        return this.searchParam;
    }

    public final int hashCode() {
        ListState<C26754d, C26733e> listState2 = this.listState;
        int i = 0;
        int hashCode = (listState2 != null ? listState2.hashCode() : 0) * 31;
        C26734f fVar = this.searchParam;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchState(listState=");
        sb.append(this.listState);
        sb.append(", searchParam=");
        sb.append(this.searchParam);
        sb.append(")");
        return sb.toString();
    }

    public SearchState(ListState<C26754d, C26733e> listState2, C26734f fVar) {
        C7573i.m23587b(listState2, "listState");
        C7573i.m23587b(fVar, "searchParam");
        this.listState = listState2;
        this.searchParam = fVar;
    }

    public /* synthetic */ SearchState(ListState listState2, C26734f fVar, int i, C7571f fVar2) {
        if ((i & 1) != 0) {
            C26733e eVar = new C26733e(null, false, 0, null, 15, null);
            listState2 = new ListState(eVar, null, null, null, null, 30, null);
        }
        if ((i & 2) != 0) {
            fVar = new C26734f("", 0, null, 0, 0, null, 62, null);
        }
        this(listState2, fVar);
    }
}
