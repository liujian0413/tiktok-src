package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedState */
public final class CutVideoSpeedState implements C11670t {
    private final Boolean enable;
    private final Boolean visible;

    public CutVideoSpeedState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CutVideoSpeedState copy$default(CutVideoSpeedState cutVideoSpeedState, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cutVideoSpeedState.enable;
        }
        if ((i & 2) != 0) {
            bool2 = cutVideoSpeedState.visible;
        }
        return cutVideoSpeedState.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final Boolean component2() {
        return this.visible;
    }

    public final CutVideoSpeedState copy(Boolean bool, Boolean bool2) {
        return new CutVideoSpeedState(bool, bool2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.visible, (java.lang.Object) r3.visible) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedState r3 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedState) r3
            java.lang.Boolean r0 = r2.enable
            java.lang.Boolean r1 = r3.enable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Boolean r0 = r2.visible
            java.lang.Boolean r3 = r3.visible
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedState.equals(java.lang.Object):boolean");
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.visible;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoSpeedState(enable=");
        sb.append(this.enable);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoSpeedState(Boolean bool, Boolean bool2) {
        this.enable = bool;
        this.visible = bool2;
    }

    public /* synthetic */ CutVideoSpeedState(Boolean bool, Boolean bool2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        this(bool, bool2);
    }
}
