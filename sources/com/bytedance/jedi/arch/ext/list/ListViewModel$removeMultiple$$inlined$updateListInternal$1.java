package com.bytedance.jedi.arch.ext.list;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class ListViewModel$removeMultiple$$inlined$updateListInternal$1 extends Lambda implements C7562b<S, S> {
    final /* synthetic */ int $count$inlined;
    final /* synthetic */ int $position$inlined;
    final /* synthetic */ ListViewModel this$0;

    public ListViewModel$removeMultiple$$inlined$updateListInternal$1(ListViewModel listViewModel, int i, int i2) {
        this.this$0 = listViewModel;
        this.$count$inlined = i;
        this.$position$inlined = i2;
        super(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[LOOP:0: B:14:0x003d->B:18:0x004c, LOOP_START, PHI: r2 
      PHI: (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:13:0x003b, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final S invoke(S r12) {
        /*
            r11 = this;
            java.lang.String r0 = "$this$setState"
            kotlin.jvm.internal.C7573i.m23587b(r12, r0)
            com.bytedance.jedi.arch.t r0 = r12.getSubstate()
            com.bytedance.jedi.arch.ext.list.ListState r0 = (com.bytedance.jedi.arch.ext.list.ListState) r0
            java.util.List r0 = r0.getList()
            int r1 = r11.$count$inlined
            r2 = 1
            if (r1 <= 0) goto L_0x0021
            int r1 = r0.size()
            int r3 = r11.$position$inlined
            if (r3 >= 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            if (r1 <= r3) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            boolean r3 = kotlin.C48020o.f122844a
            if (r3 == 0) goto L_0x0033
            if (r1 == 0) goto L_0x0029
            goto L_0x0033
        L_0x0029:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r0 = "Assertion failed"
            r12.<init>(r0)
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            throw r12
        L_0x0033:
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r5 = kotlin.collections.C7525m.m23509d(r0)
            int r0 = r11.$count$inlined
            if (r0 <= 0) goto L_0x004f
        L_0x003d:
            int r1 = r11.$position$inlined
            int r3 = r5.size()
            if (r1 >= r3) goto L_0x004f
            int r1 = r11.$position$inlined
            r5.remove(r1)
            if (r2 == r0) goto L_0x004f
            int r2 = r2 + 1
            goto L_0x003d
        L_0x004f:
            com.bytedance.jedi.arch.t r0 = r12.getSubstate()
            r3 = r0
            com.bytedance.jedi.arch.ext.list.ListState r3 = (com.bytedance.jedi.arch.ext.list.ListState) r3
            r4 = 0
            r6 = 0
            r7 = 0
            com.bytedance.jedi.arch.t r0 = r12.getSubstate()
            com.bytedance.jedi.arch.ext.list.ListState r0 = (com.bytedance.jedi.arch.ext.list.ListState) r0
            com.bytedance.jedi.arch.ext.list.b r8 = com.bytedance.jedi.arch.ext.list.ListViewModel.m33981a(r0, r5)
            r9 = 13
            r10 = 0
            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10)
            com.bytedance.jedi.arch.t r0 = (com.bytedance.jedi.arch.C11670t) r0
            com.bytedance.jedi.arch.NestedState r12 = r12.newSubstate(r0)
            if (r12 == 0) goto L_0x0075
            com.bytedance.jedi.arch.ext.list.IListState r12 = (com.bytedance.jedi.arch.ext.list.IListState) r12
            return r12
        L_0x0075:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type S"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListViewModel$removeMultiple$$inlined$updateListInternal$1.invoke(com.bytedance.jedi.arch.ext.list.IListState):com.bytedance.jedi.arch.ext.list.IListState");
    }
}
