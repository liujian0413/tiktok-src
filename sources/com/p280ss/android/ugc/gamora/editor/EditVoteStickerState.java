package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditVoteStickerState */
public final class EditVoteStickerState implements C11670t {
    private final Boolean enableEdit;
    private final C44412h hideHelpBoxEvent;

    public EditVoteStickerState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditVoteStickerState copy$default(EditVoteStickerState editVoteStickerState, C44412h hVar, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = editVoteStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            bool = editVoteStickerState.enableEdit;
        }
        return editVoteStickerState.copy(hVar, bool);
    }

    public final C44412h component1() {
        return this.hideHelpBoxEvent;
    }

    public final Boolean component2() {
        return this.enableEdit;
    }

    public final EditVoteStickerState copy(C44412h hVar, Boolean bool) {
        return new EditVoteStickerState(hVar, bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.enableEdit, (java.lang.Object) r3.enableEdit) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditVoteStickerState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.gamora.editor.EditVoteStickerState r3 = (com.p280ss.android.ugc.gamora.editor.EditVoteStickerState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.hideHelpBoxEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.hideHelpBoxEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Boolean r0 = r2.enableEdit
            java.lang.Boolean r3 = r3.enableEdit
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditVoteStickerState.equals(java.lang.Object):boolean");
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final C44412h getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final int hashCode() {
        C44412h hVar = this.hideHelpBoxEvent;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        Boolean bool = this.enableEdit;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditVoteStickerState(hideHelpBoxEvent=");
        sb.append(this.hideHelpBoxEvent);
        sb.append(", enableEdit=");
        sb.append(this.enableEdit);
        sb.append(")");
        return sb.toString();
    }

    public EditVoteStickerState(C44412h hVar, Boolean bool) {
        this.hideHelpBoxEvent = hVar;
        this.enableEdit = bool;
    }

    public /* synthetic */ EditVoteStickerState(C44412h hVar, Boolean bool, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            hVar = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        this(hVar, bool);
    }
}
