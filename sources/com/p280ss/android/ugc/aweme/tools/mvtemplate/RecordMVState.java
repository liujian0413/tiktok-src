package com.p280ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVState */
public final class RecordMVState implements C11670t {
    private final Boolean relayout;
    private final Boolean topMargin;

    public RecordMVState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RecordMVState copy$default(RecordMVState recordMVState, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = recordMVState.relayout;
        }
        if ((i & 2) != 0) {
            bool2 = recordMVState.topMargin;
        }
        return recordMVState.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.relayout;
    }

    public final Boolean component2() {
        return this.topMargin;
    }

    public final RecordMVState copy(Boolean bool, Boolean bool2) {
        return new RecordMVState(bool, bool2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.topMargin, (java.lang.Object) r3.topMargin) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.tools.mvtemplate.RecordMVState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVState r3 = (com.p280ss.android.ugc.aweme.tools.mvtemplate.RecordMVState) r3
            java.lang.Boolean r0 = r2.relayout
            java.lang.Boolean r1 = r3.relayout
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Boolean r0 = r2.topMargin
            java.lang.Boolean r3 = r3.topMargin
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.mvtemplate.RecordMVState.equals(java.lang.Object):boolean");
    }

    public final Boolean getRelayout() {
        return this.relayout;
    }

    public final Boolean getTopMargin() {
        return this.topMargin;
    }

    public final int hashCode() {
        Boolean bool = this.relayout;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.topMargin;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordMVState(relayout=");
        sb.append(this.relayout);
        sb.append(", topMargin=");
        sb.append(this.topMargin);
        sb.append(")");
        return sb.toString();
    }

    public RecordMVState(Boolean bool, Boolean bool2) {
        this.relayout = bool;
        this.topMargin = bool2;
    }

    public /* synthetic */ RecordMVState(Boolean bool, Boolean bool2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        this(bool, bool2);
    }
}
