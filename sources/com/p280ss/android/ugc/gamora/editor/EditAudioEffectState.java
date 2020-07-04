package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditAudioEffectState */
public final class EditAudioEffectState implements C11670t {
    private final Boolean audioEffectVisible;
    private final Object cancelSelectedStatus;

    public EditAudioEffectState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditAudioEffectState copy$default(EditAudioEffectState editAudioEffectState, Boolean bool, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            bool = editAudioEffectState.audioEffectVisible;
        }
        if ((i & 2) != 0) {
            obj = editAudioEffectState.cancelSelectedStatus;
        }
        return editAudioEffectState.copy(bool, obj);
    }

    public final Boolean component1() {
        return this.audioEffectVisible;
    }

    public final Object component2() {
        return this.cancelSelectedStatus;
    }

    public final EditAudioEffectState copy(Boolean bool, Object obj) {
        return new EditAudioEffectState(bool, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a(r2.cancelSelectedStatus, r3.cancelSelectedStatus) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditAudioEffectState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.gamora.editor.EditAudioEffectState r3 = (com.p280ss.android.ugc.gamora.editor.EditAudioEffectState) r3
            java.lang.Boolean r0 = r2.audioEffectVisible
            java.lang.Boolean r1 = r3.audioEffectVisible
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r2.cancelSelectedStatus
            java.lang.Object r3 = r3.cancelSelectedStatus
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditAudioEffectState.equals(java.lang.Object):boolean");
    }

    public final Boolean getAudioEffectVisible() {
        return this.audioEffectVisible;
    }

    public final Object getCancelSelectedStatus() {
        return this.cancelSelectedStatus;
    }

    public final int hashCode() {
        Boolean bool = this.audioEffectVisible;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Object obj = this.cancelSelectedStatus;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditAudioEffectState(audioEffectVisible=");
        sb.append(this.audioEffectVisible);
        sb.append(", cancelSelectedStatus=");
        sb.append(this.cancelSelectedStatus);
        sb.append(")");
        return sb.toString();
    }

    public EditAudioEffectState(Boolean bool, Object obj) {
        this.audioEffectVisible = bool;
        this.cancelSelectedStatus = obj;
    }

    public /* synthetic */ EditAudioEffectState(Boolean bool, Object obj, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        this(bool, obj);
    }
}
