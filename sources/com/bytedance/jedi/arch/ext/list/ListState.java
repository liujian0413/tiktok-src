package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11496ae;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11583n;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class ListState<T, P extends C11583n> implements C11670t {
    private final C11556b isEmpty;
    private final List<T> list;
    private final C11491a<List<T>> loadMore;
    private final P payload;
    private final C11491a<List<T>> refresh;

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.a, code=com.bytedance.jedi.arch.a<java.util.List<T>>, for r6v0, types: [com.bytedance.jedi.arch.a] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.a, code=com.bytedance.jedi.arch.a<java.util.List<T>>, for r7v0, types: [com.bytedance.jedi.arch.a] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.n, code=P, for r4v0, types: [com.bytedance.jedi.arch.ext.list.n] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<T>, for r5v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bytedance.jedi.arch.ext.list.ListState copy$default(com.bytedance.jedi.arch.ext.list.ListState r3, P r4, java.util.List<T> r5, com.bytedance.jedi.arch.C11491a<java.util.List<T>> r6, com.bytedance.jedi.arch.C11491a<java.util.List<T>> r7, com.bytedance.jedi.arch.ext.list.C11556b r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            P r4 = r3.payload
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.util.List<T> r5 = r3.list
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            com.bytedance.jedi.arch.a<java.util.List<T>> r6 = r3.refresh
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            com.bytedance.jedi.arch.a<java.util.List<T>> r7 = r3.loadMore
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            com.bytedance.jedi.arch.ext.list.b r8 = r3.isEmpty
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.bytedance.jedi.arch.ext.list.ListState r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListState.copy$default(com.bytedance.jedi.arch.ext.list.ListState, com.bytedance.jedi.arch.ext.list.n, java.util.List, com.bytedance.jedi.arch.a, com.bytedance.jedi.arch.a, com.bytedance.jedi.arch.ext.list.b, int, java.lang.Object):com.bytedance.jedi.arch.ext.list.ListState");
    }

    public final P component1() {
        return this.payload;
    }

    public final List<T> component2() {
        return this.list;
    }

    public final C11491a<List<T>> component3() {
        return this.refresh;
    }

    public final C11491a<List<T>> component4() {
        return this.loadMore;
    }

    public final C11556b component5() {
        return this.isEmpty;
    }

    public final ListState<T, P> copy(P p, List<? extends T> list2, C11491a<? extends List<? extends T>> aVar, C11491a<? extends List<? extends T>> aVar2, C11556b bVar) {
        C7573i.m23587b(p, "payload");
        C7573i.m23587b(list2, "list");
        C7573i.m23587b(aVar, "refresh");
        C7573i.m23587b(aVar2, "loadMore");
        C7573i.m23587b(bVar, "isEmpty");
        ListState listState = new ListState(p, list2, aVar, aVar2, bVar);
        return listState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.isEmpty, (java.lang.Object) r3.isEmpty) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.ext.list.ListState
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.ext.list.ListState r3 = (com.bytedance.jedi.arch.ext.list.ListState) r3
            P r0 = r2.payload
            P r1 = r3.payload
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<T> r0 = r2.list
            java.util.List<T> r1 = r3.list
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.a<java.util.List<T>> r0 = r2.refresh
            com.bytedance.jedi.arch.a<java.util.List<T>> r1 = r3.refresh
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.a<java.util.List<T>> r0 = r2.loadMore
            com.bytedance.jedi.arch.a<java.util.List<T>> r1 = r3.loadMore
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.ext.list.b r0 = r2.isEmpty
            com.bytedance.jedi.arch.ext.list.b r3 = r3.isEmpty
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListState.equals(java.lang.Object):boolean");
    }

    public final List<T> getList() {
        return this.list;
    }

    public final C11491a<List<T>> getLoadMore() {
        return this.loadMore;
    }

    public final P getPayload() {
        return this.payload;
    }

    public final C11491a<List<T>> getRefresh() {
        return this.refresh;
    }

    public final int hashCode() {
        P p = this.payload;
        int i = 0;
        int hashCode = (p != null ? p.hashCode() : 0) * 31;
        List<T> list2 = this.list;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        C11491a<List<T>> aVar = this.refresh;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C11491a<List<T>> aVar2 = this.loadMore;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C11556b bVar = this.isEmpty;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final C11556b isEmpty() {
        return this.isEmpty;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListState(payload=");
        sb.append(this.payload);
        sb.append(", list=");
        sb.append(this.list);
        sb.append(", refresh=");
        sb.append(this.refresh);
        sb.append(", loadMore=");
        sb.append(this.loadMore);
        sb.append(", isEmpty=");
        sb.append(this.isEmpty);
        sb.append(")");
        return sb.toString();
    }

    public final C11556b getHasMore() {
        return this.payload.f31254a;
    }

    public ListState(P p, List<? extends T> list2, C11491a<? extends List<? extends T>> aVar, C11491a<? extends List<? extends T>> aVar2, C11556b bVar) {
        C7573i.m23587b(p, "payload");
        C7573i.m23587b(list2, "list");
        C7573i.m23587b(aVar, "refresh");
        C7573i.m23587b(aVar2, "loadMore");
        C7573i.m23587b(bVar, "isEmpty");
        this.payload = p;
        this.list = list2;
        this.refresh = aVar;
        this.loadMore = aVar2;
        this.isEmpty = bVar;
    }

    public /* synthetic */ ListState(C11583n nVar, List list2, C11491a aVar, C11491a aVar2, C11556b bVar, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            list2 = C7525m.m23461a();
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            aVar = C11496ae.f31094a;
        }
        C11491a aVar3 = aVar;
        if ((i & 8) != 0) {
            aVar2 = C11496ae.f31094a;
        }
        C11491a aVar4 = aVar2;
        if ((i & 16) != 0) {
            bVar = new C11556b(false);
        }
        this(nVar, list3, aVar3, aVar4, bVar);
    }
}
