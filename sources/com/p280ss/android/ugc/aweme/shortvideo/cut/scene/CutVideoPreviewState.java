package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import com.p280ss.android.ugc.gamora.jedi.C44410f;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState */
public final class CutVideoPreviewState implements C11670t {
    private final C44410f<Integer, Integer> resetSurfaceSizeEvent;
    private final C44412h restartProgress;
    private final Boolean surfaceEnable;
    private final C44409e updateBottomMarginEvent;
    private final C44412h updateVEDisplayEvent;

    public CutVideoPreviewState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.f, code=com.ss.android.ugc.gamora.jedi.f<java.lang.Integer, java.lang.Integer>, for r6v0, types: [com.ss.android.ugc.gamora.jedi.f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState copy$default(com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState r3, com.p280ss.android.ugc.gamora.jedi.C44412h r4, java.lang.Boolean r5, com.p280ss.android.ugc.gamora.jedi.C44410f<java.lang.Integer, java.lang.Integer> r6, com.p280ss.android.ugc.gamora.jedi.C44409e r7, com.p280ss.android.ugc.gamora.jedi.C44412h r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            com.ss.android.ugc.gamora.jedi.h r4 = r3.restartProgress
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.lang.Boolean r5 = r3.surfaceEnable
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.jedi.f<java.lang.Integer, java.lang.Integer> r6 = r3.resetSurfaceSizeEvent
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            com.ss.android.ugc.gamora.jedi.e r7 = r3.updateBottomMarginEvent
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            com.ss.android.ugc.gamora.jedi.h r8 = r3.updateVEDisplayEvent
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState.copy$default(com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState, com.ss.android.ugc.gamora.jedi.h, java.lang.Boolean, com.ss.android.ugc.gamora.jedi.f, com.ss.android.ugc.gamora.jedi.e, com.ss.android.ugc.gamora.jedi.h, int, java.lang.Object):com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState");
    }

    public final C44412h component1() {
        return this.restartProgress;
    }

    public final Boolean component2() {
        return this.surfaceEnable;
    }

    public final C44410f<Integer, Integer> component3() {
        return this.resetSurfaceSizeEvent;
    }

    public final C44409e component4() {
        return this.updateBottomMarginEvent;
    }

    public final C44412h component5() {
        return this.updateVEDisplayEvent;
    }

    public final CutVideoPreviewState copy(C44412h hVar, Boolean bool, C44410f<Integer, Integer> fVar, C44409e eVar, C44412h hVar2) {
        CutVideoPreviewState cutVideoPreviewState = new CutVideoPreviewState(hVar, bool, fVar, eVar, hVar2);
        return cutVideoPreviewState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.updateVEDisplayEvent, (java.lang.Object) r3.updateVEDisplayEvent) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState r3 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.restartProgress
            com.ss.android.ugc.gamora.jedi.h r1 = r3.restartProgress
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Boolean r0 = r2.surfaceEnable
            java.lang.Boolean r1 = r3.surfaceEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.f<java.lang.Integer, java.lang.Integer> r0 = r2.resetSurfaceSizeEvent
            com.ss.android.ugc.gamora.jedi.f<java.lang.Integer, java.lang.Integer> r1 = r3.resetSurfaceSizeEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.e r0 = r2.updateBottomMarginEvent
            com.ss.android.ugc.gamora.jedi.e r1 = r3.updateBottomMarginEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.h r0 = r2.updateVEDisplayEvent
            com.ss.android.ugc.gamora.jedi.h r3 = r3.updateVEDisplayEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState.equals(java.lang.Object):boolean");
    }

    public final C44410f<Integer, Integer> getResetSurfaceSizeEvent() {
        return this.resetSurfaceSizeEvent;
    }

    public final C44412h getRestartProgress() {
        return this.restartProgress;
    }

    public final Boolean getSurfaceEnable() {
        return this.surfaceEnable;
    }

    public final C44409e getUpdateBottomMarginEvent() {
        return this.updateBottomMarginEvent;
    }

    public final C44412h getUpdateVEDisplayEvent() {
        return this.updateVEDisplayEvent;
    }

    public final int hashCode() {
        C44412h hVar = this.restartProgress;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        Boolean bool = this.surfaceEnable;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        C44410f<Integer, Integer> fVar = this.resetSurfaceSizeEvent;
        int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C44409e eVar = this.updateBottomMarginEvent;
        int hashCode4 = (hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C44412h hVar2 = this.updateVEDisplayEvent;
        if (hVar2 != null) {
            i = hVar2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoPreviewState(restartProgress=");
        sb.append(this.restartProgress);
        sb.append(", surfaceEnable=");
        sb.append(this.surfaceEnable);
        sb.append(", resetSurfaceSizeEvent=");
        sb.append(this.resetSurfaceSizeEvent);
        sb.append(", updateBottomMarginEvent=");
        sb.append(this.updateBottomMarginEvent);
        sb.append(", updateVEDisplayEvent=");
        sb.append(this.updateVEDisplayEvent);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoPreviewState(C44412h hVar, Boolean bool, C44410f<Integer, Integer> fVar, C44409e eVar, C44412h hVar2) {
        this.restartProgress = hVar;
        this.surfaceEnable = bool;
        this.resetSurfaceSizeEvent = fVar;
        this.updateBottomMarginEvent = eVar;
        this.updateVEDisplayEvent = hVar2;
    }

    public /* synthetic */ CutVideoPreviewState(C44412h hVar, Boolean bool, C44410f fVar, C44409e eVar, C44412h hVar2, int i, C7571f fVar2) {
        C44412h hVar3;
        Boolean bool2;
        C44410f fVar3;
        C44409e eVar2;
        C44412h hVar4;
        if ((i & 1) != 0) {
            hVar3 = null;
        } else {
            hVar3 = hVar;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i & 4) != 0) {
            fVar3 = null;
        } else {
            fVar3 = fVar;
        }
        if ((i & 8) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if ((i & 16) != 0) {
            hVar4 = null;
        } else {
            hVar4 = hVar2;
        }
        this(hVar3, bool2, fVar3, eVar2, hVar4);
    }
}
