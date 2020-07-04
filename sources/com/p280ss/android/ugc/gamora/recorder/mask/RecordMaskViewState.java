package com.p280ss.android.ugc.gamora.recorder.mask;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.recorder.mask.RecordMaskViewState */
public final class RecordMaskViewState implements C11670t {
    private final Boolean showCorner;
    private final Boolean showMask;

    public RecordMaskViewState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RecordMaskViewState copy$default(RecordMaskViewState recordMaskViewState, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = recordMaskViewState.showMask;
        }
        if ((i & 2) != 0) {
            bool2 = recordMaskViewState.showCorner;
        }
        return recordMaskViewState.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.showMask;
    }

    public final Boolean component2() {
        return this.showCorner;
    }

    public final RecordMaskViewState copy(Boolean bool, Boolean bool2) {
        return new RecordMaskViewState(bool, bool2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.showCorner, (java.lang.Object) r3.showCorner) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.recorder.mask.RecordMaskViewState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.gamora.recorder.mask.RecordMaskViewState r3 = (com.p280ss.android.ugc.gamora.recorder.mask.RecordMaskViewState) r3
            java.lang.Boolean r0 = r2.showMask
            java.lang.Boolean r1 = r3.showMask
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Boolean r0 = r2.showCorner
            java.lang.Boolean r3 = r3.showCorner
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.mask.RecordMaskViewState.equals(java.lang.Object):boolean");
    }

    public final Boolean getShowCorner() {
        return this.showCorner;
    }

    public final Boolean getShowMask() {
        return this.showMask;
    }

    public final int hashCode() {
        Boolean bool = this.showMask;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.showCorner;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordMaskViewState(showMask=");
        sb.append(this.showMask);
        sb.append(", showCorner=");
        sb.append(this.showCorner);
        sb.append(")");
        return sb.toString();
    }

    public RecordMaskViewState(Boolean bool, Boolean bool2) {
        this.showMask = bool;
        this.showCorner = bool2;
    }

    public /* synthetic */ RecordMaskViewState(Boolean bool, Boolean bool2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        this(bool, bool2);
    }
}
