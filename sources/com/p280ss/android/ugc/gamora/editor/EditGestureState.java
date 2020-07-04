package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44410f;
import com.p280ss.android.ugc.gamora.jedi.C44411g;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditGestureState */
public final class EditGestureState implements C11670t {
    private final C44410f<Float, Long> gestureAnimEvent;
    private final Boolean gestureEnable;
    private final C44411g<Float, Float, Float> gestureLayoutEvent;

    public EditGestureState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.f, code=com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long>, for r2v0, types: [com.ss.android.ugc.gamora.jedi.f] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.g, code=com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float>, for r3v0, types: [com.ss.android.ugc.gamora.jedi.g] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.gamora.editor.EditGestureState copy$default(com.p280ss.android.ugc.gamora.editor.EditGestureState r0, java.lang.Boolean r1, com.p280ss.android.ugc.gamora.jedi.C44410f<java.lang.Float, java.lang.Long> r2, com.p280ss.android.ugc.gamora.jedi.C44411g<java.lang.Float, java.lang.Float, java.lang.Float> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.Boolean r1 = r0.gestureEnable
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r2 = r0.gestureAnimEvent
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r3 = r0.gestureLayoutEvent
        L_0x0012:
            com.ss.android.ugc.gamora.editor.EditGestureState r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditGestureState.copy$default(com.ss.android.ugc.gamora.editor.EditGestureState, java.lang.Boolean, com.ss.android.ugc.gamora.jedi.f, com.ss.android.ugc.gamora.jedi.g, int, java.lang.Object):com.ss.android.ugc.gamora.editor.EditGestureState");
    }

    public final Boolean component1() {
        return this.gestureEnable;
    }

    public final C44410f<Float, Long> component2() {
        return this.gestureAnimEvent;
    }

    public final C44411g<Float, Float, Float> component3() {
        return this.gestureLayoutEvent;
    }

    public final EditGestureState copy(Boolean bool, C44410f<Float, Long> fVar, C44411g<Float, Float, Float> gVar) {
        return new EditGestureState(bool, fVar, gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.gestureLayoutEvent, (java.lang.Object) r3.gestureLayoutEvent) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditGestureState
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.editor.EditGestureState r3 = (com.p280ss.android.ugc.gamora.editor.EditGestureState) r3
            java.lang.Boolean r0 = r2.gestureEnable
            java.lang.Boolean r1 = r3.gestureEnable
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r0 = r2.gestureAnimEvent
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r1 = r3.gestureAnimEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r0 = r2.gestureLayoutEvent
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r3 = r3.gestureLayoutEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditGestureState.equals(java.lang.Object):boolean");
    }

    public final C44410f<Float, Long> getGestureAnimEvent() {
        return this.gestureAnimEvent;
    }

    public final Boolean getGestureEnable() {
        return this.gestureEnable;
    }

    public final C44411g<Float, Float, Float> getGestureLayoutEvent() {
        return this.gestureLayoutEvent;
    }

    public final int hashCode() {
        Boolean bool = this.gestureEnable;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        C44410f<Float, Long> fVar = this.gestureAnimEvent;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C44411g<Float, Float, Float> gVar = this.gestureLayoutEvent;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditGestureState(gestureEnable=");
        sb.append(this.gestureEnable);
        sb.append(", gestureAnimEvent=");
        sb.append(this.gestureAnimEvent);
        sb.append(", gestureLayoutEvent=");
        sb.append(this.gestureLayoutEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditGestureState(Boolean bool, C44410f<Float, Long> fVar, C44411g<Float, Float, Float> gVar) {
        this.gestureEnable = bool;
        this.gestureAnimEvent = fVar;
        this.gestureLayoutEvent = gVar;
    }

    public /* synthetic */ EditGestureState(Boolean bool, C44410f fVar, C44411g gVar, int i, C7571f fVar2) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            fVar = null;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        this(bool, fVar, gVar);
    }
}
