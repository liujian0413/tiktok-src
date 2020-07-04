package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState */
public final class CutVideoMultiModeState implements C11670t {
    private final C44404c dismissAnimateEvent;
    private final C44404c showAnimateEvent;
    private final Integer value;

    public CutVideoMultiModeState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CutVideoMultiModeState copy$default(CutVideoMultiModeState cutVideoMultiModeState, Integer num, C44404c cVar, C44404c cVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = cutVideoMultiModeState.value;
        }
        if ((i & 2) != 0) {
            cVar = cutVideoMultiModeState.showAnimateEvent;
        }
        if ((i & 4) != 0) {
            cVar2 = cutVideoMultiModeState.dismissAnimateEvent;
        }
        return cutVideoMultiModeState.copy(num, cVar, cVar2);
    }

    public final Integer component1() {
        return this.value;
    }

    public final C44404c component2() {
        return this.showAnimateEvent;
    }

    public final C44404c component3() {
        return this.dismissAnimateEvent;
    }

    public final CutVideoMultiModeState copy(Integer num, C44404c cVar, C44404c cVar2) {
        return new CutVideoMultiModeState(num, cVar, cVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.dismissAnimateEvent, (java.lang.Object) r3.dismissAnimateEvent) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState r3 = (com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState) r3
            java.lang.Integer r0 = r2.value
            java.lang.Integer r1 = r3.value
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.c r0 = r2.showAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r1 = r3.showAnimateEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.c r0 = r2.dismissAnimateEvent
            com.ss.android.ugc.gamora.jedi.c r3 = r3.dismissAnimateEvent
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeState.equals(java.lang.Object):boolean");
    }

    public final C44404c getDismissAnimateEvent() {
        return this.dismissAnimateEvent;
    }

    public final C44404c getShowAnimateEvent() {
        return this.showAnimateEvent;
    }

    public final Integer getValue() {
        return this.value;
    }

    public final int hashCode() {
        Integer num = this.value;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        C44404c cVar = this.showAnimateEvent;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C44404c cVar2 = this.dismissAnimateEvent;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoMultiModeState(value=");
        sb.append(this.value);
        sb.append(", showAnimateEvent=");
        sb.append(this.showAnimateEvent);
        sb.append(", dismissAnimateEvent=");
        sb.append(this.dismissAnimateEvent);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoMultiModeState(Integer num, C44404c cVar, C44404c cVar2) {
        this.value = num;
        this.showAnimateEvent = cVar;
        this.dismissAnimateEvent = cVar2;
    }

    public /* synthetic */ CutVideoMultiModeState(Integer num, C44404c cVar, C44404c cVar2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            cVar = null;
        }
        if ((i & 4) != 0) {
            cVar2 = null;
        }
        this(num, cVar, cVar2);
    }
}
