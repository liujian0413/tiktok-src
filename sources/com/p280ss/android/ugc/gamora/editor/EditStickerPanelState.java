package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditStickerPanelState */
public final class EditStickerPanelState implements C11670t {
    private final C44404c stickerViewVisibleEvent;

    public EditStickerPanelState() {
        this(null, 1, null);
    }

    public static /* synthetic */ EditStickerPanelState copy$default(EditStickerPanelState editStickerPanelState, C44404c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = editStickerPanelState.stickerViewVisibleEvent;
        }
        return editStickerPanelState.copy(cVar);
    }

    public final C44404c component1() {
        return this.stickerViewVisibleEvent;
    }

    public final EditStickerPanelState copy(C44404c cVar) {
        return new EditStickerPanelState(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.stickerViewVisibleEvent, (java.lang.Object) ((com.p280ss.android.ugc.gamora.editor.EditStickerPanelState) r2).stickerViewVisibleEvent) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.gamora.editor.EditStickerPanelState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.editor.EditStickerPanelState r2 = (com.p280ss.android.ugc.gamora.editor.EditStickerPanelState) r2
            com.ss.android.ugc.gamora.jedi.c r0 = r1.stickerViewVisibleEvent
            com.ss.android.ugc.gamora.jedi.c r2 = r2.stickerViewVisibleEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditStickerPanelState.equals(java.lang.Object):boolean");
    }

    public final C44404c getStickerViewVisibleEvent() {
        return this.stickerViewVisibleEvent;
    }

    public final int hashCode() {
        C44404c cVar = this.stickerViewVisibleEvent;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditStickerPanelState(stickerViewVisibleEvent=");
        sb.append(this.stickerViewVisibleEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditStickerPanelState(C44404c cVar) {
        this.stickerViewVisibleEvent = cVar;
    }

    public /* synthetic */ EditStickerPanelState(C44404c cVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        this(cVar);
    }
}
