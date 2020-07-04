package com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverStateV3 */
public final class DiscoverStateV3 implements C11670t {
    private final ListState<DiscoveryCellStructV3, C11583n> cells;

    public DiscoverStateV3() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3, com.bytedance.jedi.arch.ext.list.n>, for r1v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel.DiscoverStateV3 copy$default(com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel.DiscoverStateV3 r0, com.bytedance.jedi.arch.ext.list.ListState<com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3, com.bytedance.jedi.arch.ext.list.C11583n> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3, com.bytedance.jedi.arch.ext.list.n> r1 = r0.cells
        L_0x0006:
            com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverStateV3 r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel.DiscoverStateV3.copy$default(com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverStateV3, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverStateV3");
    }

    public final ListState<DiscoveryCellStructV3, C11583n> component1() {
        return this.cells;
    }

    public final DiscoverStateV3 copy(ListState<DiscoveryCellStructV3, C11583n> listState) {
        C7573i.m23587b(listState, "cells");
        return new DiscoverStateV3(listState);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.cells, (java.lang.Object) ((com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel.DiscoverStateV3) r2).cells) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel.DiscoverStateV3
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverStateV3 r2 = (com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel.DiscoverStateV3) r2
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3, com.bytedance.jedi.arch.ext.list.n> r0 = r1.cells
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3, com.bytedance.jedi.arch.ext.list.n> r2 = r2.cells
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel.DiscoverStateV3.equals(java.lang.Object):boolean");
    }

    public final ListState<DiscoveryCellStructV3, C11583n> getCells() {
        return this.cells;
    }

    public final int hashCode() {
        ListState<DiscoveryCellStructV3, C11583n> listState = this.cells;
        if (listState != null) {
            return listState.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverStateV3(cells=");
        sb.append(this.cells);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverStateV3(ListState<DiscoveryCellStructV3, C11583n> listState) {
        C7573i.m23587b(listState, "cells");
        this.cells = listState;
    }

    public /* synthetic */ DiscoverStateV3(ListState listState, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            listState = new ListState(new C11583n(false, 0, 3, null), null, null, null, null, 30, null);
        }
        this(listState);
    }
}
