package com.p280ss.android.ugc.gamora.recorder.progress;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordMode */
public final class RecordMode implements C11670t {
    public static final C44697a Companion = new C44697a(null);
    private final Pair<List<TimeSpeedModelExtension>, Long> progressClipAnchors;
    private final int retakeState;
    private final RetakeVideoContext retakeVideoContext;

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordMode$a */
    public static final class C44697a {
        private C44697a() {
        }

        public /* synthetic */ C44697a(C7571f fVar) {
            this();
        }
    }

    public RecordMode() {
        this(0, null, null, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.Pair, code=kotlin.Pair<java.util.List<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension>, java.lang.Long>, for r3v0, types: [kotlin.Pair] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.gamora.recorder.progress.RecordMode copy$default(com.p280ss.android.ugc.gamora.recorder.progress.RecordMode r0, int r1, com.p280ss.android.ugc.aweme.shortvideo.RetakeVideoContext r2, kotlin.Pair<java.util.List<com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension>, java.lang.Long> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            int r1 = r0.retakeState
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext r2 = r0.retakeVideoContext
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            kotlin.Pair<java.util.List<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension>, java.lang.Long> r3 = r0.progressClipAnchors
        L_0x0012:
            com.ss.android.ugc.gamora.recorder.progress.RecordMode r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.progress.RecordMode.copy$default(com.ss.android.ugc.gamora.recorder.progress.RecordMode, int, com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext, kotlin.Pair, int, java.lang.Object):com.ss.android.ugc.gamora.recorder.progress.RecordMode");
    }

    public final int component1() {
        return this.retakeState;
    }

    public final RetakeVideoContext component2() {
        return this.retakeVideoContext;
    }

    public final Pair<List<TimeSpeedModelExtension>, Long> component3() {
        return this.progressClipAnchors;
    }

    public final RecordMode copy(int i, RetakeVideoContext retakeVideoContext2, Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        return new RecordMode(i, retakeVideoContext2, pair);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecordMode) {
                RecordMode recordMode = (RecordMode) obj;
                if (!(this.retakeState == recordMode.retakeState) || !C7573i.m23585a((Object) this.retakeVideoContext, (Object) recordMode.retakeVideoContext) || !C7573i.m23585a((Object) this.progressClipAnchors, (Object) recordMode.progressClipAnchors)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Pair<List<TimeSpeedModelExtension>, Long> getProgressClipAnchors() {
        return this.progressClipAnchors;
    }

    public final int getRetakeState() {
        return this.retakeState;
    }

    public final RetakeVideoContext getRetakeVideoContext() {
        return this.retakeVideoContext;
    }

    public final int hashCode() {
        int i = this.retakeState * 31;
        RetakeVideoContext retakeVideoContext2 = this.retakeVideoContext;
        int i2 = 0;
        int hashCode = (i + (retakeVideoContext2 != null ? retakeVideoContext2.hashCode() : 0)) * 31;
        Pair<List<TimeSpeedModelExtension>, Long> pair = this.progressClipAnchors;
        if (pair != null) {
            i2 = pair.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordMode(retakeState=");
        sb.append(this.retakeState);
        sb.append(", retakeVideoContext=");
        sb.append(this.retakeVideoContext);
        sb.append(", progressClipAnchors=");
        sb.append(this.progressClipAnchors);
        sb.append(")");
        return sb.toString();
    }

    public RecordMode(int i, RetakeVideoContext retakeVideoContext2, Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        this.retakeState = i;
        this.retakeVideoContext = retakeVideoContext2;
        this.progressClipAnchors = pair;
    }

    public /* synthetic */ RecordMode(int i, RetakeVideoContext retakeVideoContext2, Pair pair, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            retakeVideoContext2 = null;
        }
        if ((i2 & 4) != 0) {
            pair = null;
        }
        this(i, retakeVideoContext2, pair);
    }
}
