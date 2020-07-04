package com.p280ss.android.ugc.gamora.recorder.speed;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.recorder.speed.RecordSpeedGroupViewState */
public final class RecordSpeedGroupViewState implements C11670t {
    private final RecordingSpeed speed;

    public RecordSpeedGroupViewState() {
        this(null, 1, null);
    }

    public static /* synthetic */ RecordSpeedGroupViewState copy$default(RecordSpeedGroupViewState recordSpeedGroupViewState, RecordingSpeed recordingSpeed, int i, Object obj) {
        if ((i & 1) != 0) {
            recordingSpeed = recordSpeedGroupViewState.speed;
        }
        return recordSpeedGroupViewState.copy(recordingSpeed);
    }

    public final RecordingSpeed component1() {
        return this.speed;
    }

    public final RecordSpeedGroupViewState copy(RecordingSpeed recordingSpeed) {
        return new RecordSpeedGroupViewState(recordingSpeed);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.speed, (java.lang.Object) ((com.p280ss.android.ugc.gamora.recorder.speed.RecordSpeedGroupViewState) r2).speed) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.gamora.recorder.speed.RecordSpeedGroupViewState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.recorder.speed.RecordSpeedGroupViewState r2 = (com.p280ss.android.ugc.gamora.recorder.speed.RecordSpeedGroupViewState) r2
            com.ss.android.ugc.aweme.tools.RecordingSpeed r0 = r1.speed
            com.ss.android.ugc.aweme.tools.RecordingSpeed r2 = r2.speed
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.speed.RecordSpeedGroupViewState.equals(java.lang.Object):boolean");
    }

    public final RecordingSpeed getSpeed() {
        return this.speed;
    }

    public final int hashCode() {
        RecordingSpeed recordingSpeed = this.speed;
        if (recordingSpeed != null) {
            return recordingSpeed.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordSpeedGroupViewState(speed=");
        sb.append(this.speed);
        sb.append(")");
        return sb.toString();
    }

    public RecordSpeedGroupViewState(RecordingSpeed recordingSpeed) {
        this.speed = recordingSpeed;
    }

    public /* synthetic */ RecordSpeedGroupViewState(RecordingSpeed recordingSpeed, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            recordingSpeed = null;
        }
        this(recordingSpeed);
    }
}
