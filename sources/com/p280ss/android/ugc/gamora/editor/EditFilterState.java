package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditFilterState */
public final class EditFilterState implements C11670t {
    private final C44412h showFilterPanelEvent;

    public EditFilterState() {
        this(null, 1, null);
    }

    public static /* synthetic */ EditFilterState copy$default(EditFilterState editFilterState, C44412h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = editFilterState.showFilterPanelEvent;
        }
        return editFilterState.copy(hVar);
    }

    public final C44412h component1() {
        return this.showFilterPanelEvent;
    }

    public final EditFilterState copy(C44412h hVar) {
        return new EditFilterState(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.showFilterPanelEvent, (java.lang.Object) ((com.p280ss.android.ugc.gamora.editor.EditFilterState) r2).showFilterPanelEvent) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.gamora.editor.EditFilterState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.editor.EditFilterState r2 = (com.p280ss.android.ugc.gamora.editor.EditFilterState) r2
            com.ss.android.ugc.gamora.jedi.h r0 = r1.showFilterPanelEvent
            com.ss.android.ugc.gamora.jedi.h r2 = r2.showFilterPanelEvent
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditFilterState.equals(java.lang.Object):boolean");
    }

    public final C44412h getShowFilterPanelEvent() {
        return this.showFilterPanelEvent;
    }

    public final int hashCode() {
        C44412h hVar = this.showFilterPanelEvent;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditFilterState(showFilterPanelEvent=");
        sb.append(this.showFilterPanelEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditFilterState(C44412h hVar) {
        this.showFilterPanelEvent = hVar;
    }

    public /* synthetic */ EditFilterState(C44412h hVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            hVar = null;
        }
        this(hVar);
    }
}
