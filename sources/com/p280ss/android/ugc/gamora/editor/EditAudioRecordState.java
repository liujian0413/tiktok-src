package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditAudioRecordState */
public final class EditAudioRecordState implements C11670t {
    private final Boolean showAudioRecord;

    public EditAudioRecordState() {
        this(null, 1, null);
    }

    public static /* synthetic */ EditAudioRecordState copy$default(EditAudioRecordState editAudioRecordState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = editAudioRecordState.showAudioRecord;
        }
        return editAudioRecordState.copy(bool);
    }

    public final Boolean component1() {
        return this.showAudioRecord;
    }

    public final EditAudioRecordState copy(Boolean bool) {
        return new EditAudioRecordState(bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.showAudioRecord, (java.lang.Object) ((com.p280ss.android.ugc.gamora.editor.EditAudioRecordState) r2).showAudioRecord) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.gamora.editor.EditAudioRecordState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.editor.EditAudioRecordState r2 = (com.p280ss.android.ugc.gamora.editor.EditAudioRecordState) r2
            java.lang.Boolean r0 = r1.showAudioRecord
            java.lang.Boolean r2 = r2.showAudioRecord
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditAudioRecordState.equals(java.lang.Object):boolean");
    }

    public final Boolean getShowAudioRecord() {
        return this.showAudioRecord;
    }

    public final int hashCode() {
        Boolean bool = this.showAudioRecord;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditAudioRecordState(showAudioRecord=");
        sb.append(this.showAudioRecord);
        sb.append(")");
        return sb.toString();
    }

    public EditAudioRecordState(Boolean bool) {
        this.showAudioRecord = bool;
    }

    public /* synthetic */ EditAudioRecordState(Boolean bool, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bool = null;
        }
        this(bool);
    }
}
