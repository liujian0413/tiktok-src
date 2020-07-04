package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState */
public final class CutVideoEditState implements C11670t {
    private final C44404c changeStickPointSlideModeEvent;
    private final Boolean editEnable;
    private final C44412h refreshFrameMapEvent;
    private final Boolean slideHintVisible;
    private final C44412h updatePlayBoundaryEvent;

    public CutVideoEditState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CutVideoEditState copy$default(CutVideoEditState cutVideoEditState, C44412h hVar, Boolean bool, C44404c cVar, C44412h hVar2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = cutVideoEditState.updatePlayBoundaryEvent;
        }
        if ((i & 2) != 0) {
            bool = cutVideoEditState.editEnable;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            cVar = cutVideoEditState.changeStickPointSlideModeEvent;
        }
        C44404c cVar2 = cVar;
        if ((i & 8) != 0) {
            hVar2 = cutVideoEditState.refreshFrameMapEvent;
        }
        C44412h hVar3 = hVar2;
        if ((i & 16) != 0) {
            bool2 = cutVideoEditState.slideHintVisible;
        }
        return cutVideoEditState.copy(hVar, bool3, cVar2, hVar3, bool2);
    }

    public final C44412h component1() {
        return this.updatePlayBoundaryEvent;
    }

    public final Boolean component2() {
        return this.editEnable;
    }

    public final C44404c component3() {
        return this.changeStickPointSlideModeEvent;
    }

    public final C44412h component4() {
        return this.refreshFrameMapEvent;
    }

    public final Boolean component5() {
        return this.slideHintVisible;
    }

    public final CutVideoEditState copy(C44412h hVar, Boolean bool, C44404c cVar, C44412h hVar2, Boolean bool2) {
        CutVideoEditState cutVideoEditState = new CutVideoEditState(hVar, bool, cVar, hVar2, bool2);
        return cutVideoEditState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.slideHintVisible, (java.lang.Object) r3.slideHintVisible) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState r3 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.updatePlayBoundaryEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.updatePlayBoundaryEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Boolean r0 = r2.editEnable
            java.lang.Boolean r1 = r3.editEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.c r0 = r2.changeStickPointSlideModeEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.changeStickPointSlideModeEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.jedi.h r0 = r2.refreshFrameMapEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.refreshFrameMapEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Boolean r0 = r2.slideHintVisible
            java.lang.Boolean r3 = r3.slideHintVisible
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState.equals(java.lang.Object):boolean");
    }

    public final C44404c getChangeStickPointSlideModeEvent() {
        return this.changeStickPointSlideModeEvent;
    }

    public final Boolean getEditEnable() {
        return this.editEnable;
    }

    public final C44412h getRefreshFrameMapEvent() {
        return this.refreshFrameMapEvent;
    }

    public final Boolean getSlideHintVisible() {
        return this.slideHintVisible;
    }

    public final C44412h getUpdatePlayBoundaryEvent() {
        return this.updatePlayBoundaryEvent;
    }

    public final int hashCode() {
        C44412h hVar = this.updatePlayBoundaryEvent;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        Boolean bool = this.editEnable;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        C44404c cVar = this.changeStickPointSlideModeEvent;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C44412h hVar2 = this.refreshFrameMapEvent;
        int hashCode4 = (hashCode3 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        Boolean bool2 = this.slideHintVisible;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoEditState(updatePlayBoundaryEvent=");
        sb.append(this.updatePlayBoundaryEvent);
        sb.append(", editEnable=");
        sb.append(this.editEnable);
        sb.append(", changeStickPointSlideModeEvent=");
        sb.append(this.changeStickPointSlideModeEvent);
        sb.append(", refreshFrameMapEvent=");
        sb.append(this.refreshFrameMapEvent);
        sb.append(", slideHintVisible=");
        sb.append(this.slideHintVisible);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoEditState(C44412h hVar, Boolean bool, C44404c cVar, C44412h hVar2, Boolean bool2) {
        this.updatePlayBoundaryEvent = hVar;
        this.editEnable = bool;
        this.changeStickPointSlideModeEvent = cVar;
        this.refreshFrameMapEvent = hVar2;
        this.slideHintVisible = bool2;
    }

    public /* synthetic */ CutVideoEditState(C44412h hVar, Boolean bool, C44404c cVar, C44412h hVar2, Boolean bool2, int i, C7571f fVar) {
        C44412h hVar3;
        Boolean bool3;
        C44404c cVar2;
        C44412h hVar4;
        Boolean bool4;
        if ((i & 1) != 0) {
            hVar3 = null;
        } else {
            hVar3 = hVar;
        }
        if ((i & 2) != 0) {
            bool3 = null;
        } else {
            bool3 = bool;
        }
        if ((i & 4) != 0) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        if ((i & 8) != 0) {
            hVar4 = null;
        } else {
            hVar4 = hVar2;
        }
        if ((i & 16) != 0) {
            bool4 = null;
        } else {
            bool4 = bool2;
        }
        this(hVar3, bool3, cVar2, hVar4, bool4);
    }
}
