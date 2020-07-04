package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditAutoEnhanceState */
public final class EditAutoEnhanceState implements C11670t {
    private final Boolean enableAutoEnhance;
    private final C44412h scanImageAnimation;

    public EditAutoEnhanceState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditAutoEnhanceState copy$default(EditAutoEnhanceState editAutoEnhanceState, Boolean bool, C44412h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = editAutoEnhanceState.enableAutoEnhance;
        }
        if ((i & 2) != 0) {
            hVar = editAutoEnhanceState.scanImageAnimation;
        }
        return editAutoEnhanceState.copy(bool, hVar);
    }

    public final Boolean component1() {
        return this.enableAutoEnhance;
    }

    public final C44412h component2() {
        return this.scanImageAnimation;
    }

    public final EditAutoEnhanceState copy(Boolean bool, C44412h hVar) {
        return new EditAutoEnhanceState(bool, hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.scanImageAnimation, (java.lang.Object) r3.scanImageAnimation) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditAutoEnhanceState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.gamora.editor.EditAutoEnhanceState r3 = (com.p280ss.android.ugc.gamora.editor.EditAutoEnhanceState) r3
            java.lang.Boolean r0 = r2.enableAutoEnhance
            java.lang.Boolean r1 = r3.enableAutoEnhance
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.gamora.jedi.h r0 = r2.scanImageAnimation
            com.ss.android.ugc.gamora.jedi.h r3 = r3.scanImageAnimation
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditAutoEnhanceState.equals(java.lang.Object):boolean");
    }

    public final Boolean getEnableAutoEnhance() {
        return this.enableAutoEnhance;
    }

    public final C44412h getScanImageAnimation() {
        return this.scanImageAnimation;
    }

    public final int hashCode() {
        Boolean bool = this.enableAutoEnhance;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        C44412h hVar = this.scanImageAnimation;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditAutoEnhanceState(enableAutoEnhance=");
        sb.append(this.enableAutoEnhance);
        sb.append(", scanImageAnimation=");
        sb.append(this.scanImageAnimation);
        sb.append(")");
        return sb.toString();
    }

    public EditAutoEnhanceState(Boolean bool, C44412h hVar) {
        this.enableAutoEnhance = bool;
        this.scanImageAnimation = hVar;
    }

    public /* synthetic */ EditAutoEnhanceState(Boolean bool, C44412h hVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            hVar = null;
        }
        this(bool, hVar);
    }
}
