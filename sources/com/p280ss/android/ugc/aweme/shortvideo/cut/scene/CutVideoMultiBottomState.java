package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomState */
public final class CutVideoMultiBottomState implements C11670t {
    private final Boolean visible;

    public CutVideoMultiBottomState() {
        this(null, 1, null);
    }

    public static /* synthetic */ CutVideoMultiBottomState copy$default(CutVideoMultiBottomState cutVideoMultiBottomState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cutVideoMultiBottomState.visible;
        }
        return cutVideoMultiBottomState.copy(bool);
    }

    public final Boolean component1() {
        return this.visible;
    }

    public final CutVideoMultiBottomState copy(Boolean bool) {
        return new CutVideoMultiBottomState(bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.visible, (java.lang.Object) ((com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomState) r2).visible) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomState r2 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomState) r2
            java.lang.Boolean r0 = r1.visible
            java.lang.Boolean r2 = r2.visible
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomState.equals(java.lang.Object):boolean");
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final int hashCode() {
        Boolean bool = this.visible;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoMultiBottomState(visible=");
        sb.append(this.visible);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoMultiBottomState(Boolean bool) {
        this.visible = bool;
    }

    public /* synthetic */ CutVideoMultiBottomState(Boolean bool, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        this(bool);
    }
}
