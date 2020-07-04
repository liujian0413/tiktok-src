package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditPoiStickerState */
public final class EditPoiStickerState implements C11670t {
    private final C44412h hideHelpBoxEvent;

    public EditPoiStickerState() {
        this(null, 1, null);
    }

    public static /* synthetic */ EditPoiStickerState copy$default(EditPoiStickerState editPoiStickerState, C44412h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = editPoiStickerState.hideHelpBoxEvent;
        }
        return editPoiStickerState.copy(hVar);
    }

    public final C44412h component1() {
        return this.hideHelpBoxEvent;
    }

    public final EditPoiStickerState copy(C44412h hVar) {
        return new EditPoiStickerState(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.hideHelpBoxEvent, (java.lang.Object) ((com.p280ss.android.ugc.gamora.editor.EditPoiStickerState) r2).hideHelpBoxEvent) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.gamora.editor.EditPoiStickerState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.editor.EditPoiStickerState r2 = (com.p280ss.android.ugc.gamora.editor.EditPoiStickerState) r2
            com.ss.android.ugc.gamora.jedi.h r0 = r1.hideHelpBoxEvent
            com.ss.android.ugc.gamora.jedi.h r2 = r2.hideHelpBoxEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditPoiStickerState.equals(java.lang.Object):boolean");
    }

    public final C44412h getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final int hashCode() {
        C44412h hVar = this.hideHelpBoxEvent;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditPoiStickerState(hideHelpBoxEvent=");
        sb.append(this.hideHelpBoxEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditPoiStickerState(C44412h hVar) {
        this.hideHelpBoxEvent = hVar;
    }

    public /* synthetic */ EditPoiStickerState(C44412h hVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            hVar = null;
        }
        this(hVar);
    }
}
