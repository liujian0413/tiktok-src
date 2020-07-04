package com.p280ss.android.ugc.aweme.favorites.model;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.favorites.adapter.C27733b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListState */
public final class PoiCollectListState implements C11670t {
    private final ListState<C27733b, C11583n> listState;

    public PoiCollectListState() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.adapter.b, com.bytedance.jedi.arch.ext.list.n>, for r1v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.favorites.model.PoiCollectListState copy$default(com.p280ss.android.ugc.aweme.favorites.model.PoiCollectListState r0, com.bytedance.jedi.arch.ext.list.ListState<com.p280ss.android.ugc.aweme.favorites.adapter.C27733b, com.bytedance.jedi.arch.ext.list.C11583n> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.adapter.b, com.bytedance.jedi.arch.ext.list.n> r1 = r0.listState
        L_0x0006:
            com.ss.android.ugc.aweme.favorites.model.PoiCollectListState r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.model.PoiCollectListState.copy$default(com.ss.android.ugc.aweme.favorites.model.PoiCollectListState, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.favorites.model.PoiCollectListState");
    }

    public final ListState<C27733b, C11583n> component1() {
        return this.listState;
    }

    public final PoiCollectListState copy(ListState<C27733b, C11583n> listState2) {
        C7573i.m23587b(listState2, "listState");
        return new PoiCollectListState(listState2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.listState, (java.lang.Object) ((com.p280ss.android.ugc.aweme.favorites.model.PoiCollectListState) r2).listState) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.favorites.model.PoiCollectListState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.favorites.model.PoiCollectListState r2 = (com.p280ss.android.ugc.aweme.favorites.model.PoiCollectListState) r2
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.adapter.b, com.bytedance.jedi.arch.ext.list.n> r0 = r1.listState
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.adapter.b, com.bytedance.jedi.arch.ext.list.n> r2 = r2.listState
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.model.PoiCollectListState.equals(java.lang.Object):boolean");
    }

    public final ListState<C27733b, C11583n> getListState() {
        return this.listState;
    }

    public final int hashCode() {
        ListState<C27733b, C11583n> listState2 = this.listState;
        if (listState2 != null) {
            return listState2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiCollectListState(listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public PoiCollectListState(ListState<C27733b, C11583n> listState2) {
        C7573i.m23587b(listState2, "listState");
        this.listState = listState2;
    }

    public /* synthetic */ PoiCollectListState(ListState listState2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            listState2 = new ListState(new C11583n(false, 0, 3, null), null, null, null, null, 30, null);
        }
        this(listState2);
    }
}
