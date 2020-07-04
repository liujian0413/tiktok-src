package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarState */
public final class CutVideoTitleBarState implements C11670t {
    private final C44404c animateTitleBarEvent;
    private final Boolean backEnable;
    private final Boolean backVisible;
    private final Boolean nextEnable;
    private final Boolean nextVisible;

    public CutVideoTitleBarState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CutVideoTitleBarState copy$default(CutVideoTitleBarState cutVideoTitleBarState, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C44404c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cutVideoTitleBarState.backVisible;
        }
        if ((i & 2) != 0) {
            bool2 = cutVideoTitleBarState.nextVisible;
        }
        Boolean bool5 = bool2;
        if ((i & 4) != 0) {
            bool3 = cutVideoTitleBarState.backEnable;
        }
        Boolean bool6 = bool3;
        if ((i & 8) != 0) {
            bool4 = cutVideoTitleBarState.nextEnable;
        }
        Boolean bool7 = bool4;
        if ((i & 16) != 0) {
            cVar = cutVideoTitleBarState.animateTitleBarEvent;
        }
        return cutVideoTitleBarState.copy(bool, bool5, bool6, bool7, cVar);
    }

    public final Boolean component1() {
        return this.backVisible;
    }

    public final Boolean component2() {
        return this.nextVisible;
    }

    public final Boolean component3() {
        return this.backEnable;
    }

    public final Boolean component4() {
        return this.nextEnable;
    }

    public final C44404c component5() {
        return this.animateTitleBarEvent;
    }

    public final CutVideoTitleBarState copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C44404c cVar) {
        CutVideoTitleBarState cutVideoTitleBarState = new CutVideoTitleBarState(bool, bool2, bool3, bool4, cVar);
        return cutVideoTitleBarState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.animateTitleBarEvent, (java.lang.Object) r3.animateTitleBarEvent) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarState
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarState r3 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarState) r3
            java.lang.Boolean r0 = r2.backVisible
            java.lang.Boolean r1 = r3.backVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Boolean r0 = r2.nextVisible
            java.lang.Boolean r1 = r3.nextVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Boolean r0 = r2.backEnable
            java.lang.Boolean r1 = r3.backEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Boolean r0 = r2.nextEnable
            java.lang.Boolean r1 = r3.nextEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.c r0 = r2.animateTitleBarEvent
            com.ss.android.ugc.gamora.jedi.c r3 = r3.animateTitleBarEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarState.equals(java.lang.Object):boolean");
    }

    public final C44404c getAnimateTitleBarEvent() {
        return this.animateTitleBarEvent;
    }

    public final Boolean getBackEnable() {
        return this.backEnable;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final Boolean getNextEnable() {
        return this.nextEnable;
    }

    public final Boolean getNextVisible() {
        return this.nextVisible;
    }

    public final int hashCode() {
        Boolean bool = this.backVisible;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.nextVisible;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.backEnable;
        int hashCode3 = (hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.nextEnable;
        int hashCode4 = (hashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        C44404c cVar = this.animateTitleBarEvent;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoTitleBarState(backVisible=");
        sb.append(this.backVisible);
        sb.append(", nextVisible=");
        sb.append(this.nextVisible);
        sb.append(", backEnable=");
        sb.append(this.backEnable);
        sb.append(", nextEnable=");
        sb.append(this.nextEnable);
        sb.append(", animateTitleBarEvent=");
        sb.append(this.animateTitleBarEvent);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoTitleBarState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C44404c cVar) {
        this.backVisible = bool;
        this.nextVisible = bool2;
        this.backEnable = bool3;
        this.nextEnable = bool4;
        this.animateTitleBarEvent = cVar;
    }

    public /* synthetic */ CutVideoTitleBarState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C44404c cVar, int i, C7571f fVar) {
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        C44404c cVar2;
        if ((i & 1) != 0) {
            bool5 = null;
        } else {
            bool5 = bool;
        }
        if ((i & 2) != 0) {
            bool6 = null;
        } else {
            bool6 = bool2;
        }
        if ((i & 4) != 0) {
            bool7 = null;
        } else {
            bool7 = bool3;
        }
        if ((i & 8) != 0) {
            bool8 = null;
        } else {
            bool8 = bool4;
        }
        if ((i & 16) != 0) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        this(bool5, bool6, bool7, bool8, cVar2);
    }
}
