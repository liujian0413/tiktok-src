package com.p280ss.android.ugc.gamora.recorder.progress;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordProgressState */
public final class RecordProgressState implements C11670t {
    private final Pair<List<TimeSpeedModelExtension>, Long> progressClipAnchors;
    private final long progressMaxDuration;
    private final boolean progressSegmentVisible;

    public RecordProgressState() {
        this(0, false, null, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.Pair, code=kotlin.Pair<java.util.List<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension>, java.lang.Long>, for r4v0, types: [kotlin.Pair] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressState copy$default(com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressState r0, long r1, boolean r3, kotlin.Pair<java.util.List<com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension>, java.lang.Long> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            long r1 = r0.progressMaxDuration
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            boolean r3 = r0.progressSegmentVisible
        L_0x000c:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0012
            kotlin.Pair<java.util.List<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension>, java.lang.Long> r4 = r0.progressClipAnchors
        L_0x0012:
            com.ss.android.ugc.gamora.recorder.progress.RecordProgressState r0 = r0.copy(r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressState.copy$default(com.ss.android.ugc.gamora.recorder.progress.RecordProgressState, long, boolean, kotlin.Pair, int, java.lang.Object):com.ss.android.ugc.gamora.recorder.progress.RecordProgressState");
    }

    public final long component1() {
        return this.progressMaxDuration;
    }

    public final boolean component2() {
        return this.progressSegmentVisible;
    }

    public final Pair<List<TimeSpeedModelExtension>, Long> component3() {
        return this.progressClipAnchors;
    }

    public final RecordProgressState copy(long j, boolean z, Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        return new RecordProgressState(j, z, pair);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecordProgressState) {
                RecordProgressState recordProgressState = (RecordProgressState) obj;
                if (this.progressMaxDuration == recordProgressState.progressMaxDuration) {
                    if (!(this.progressSegmentVisible == recordProgressState.progressSegmentVisible) || !C7573i.m23585a((Object) this.progressClipAnchors, (Object) recordProgressState.progressClipAnchors)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Pair<List<TimeSpeedModelExtension>, Long> getProgressClipAnchors() {
        return this.progressClipAnchors;
    }

    public final long getProgressMaxDuration() {
        return this.progressMaxDuration;
    }

    public final boolean getProgressSegmentVisible() {
        return this.progressSegmentVisible;
    }

    public final int hashCode() {
        long j = this.progressMaxDuration;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.progressSegmentVisible;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        Pair<List<TimeSpeedModelExtension>, Long> pair = this.progressClipAnchors;
        return i2 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordProgressState(progressMaxDuration=");
        sb.append(this.progressMaxDuration);
        sb.append(", progressSegmentVisible=");
        sb.append(this.progressSegmentVisible);
        sb.append(", progressClipAnchors=");
        sb.append(this.progressClipAnchors);
        sb.append(")");
        return sb.toString();
    }

    public RecordProgressState(long j, boolean z, Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        this.progressMaxDuration = j;
        this.progressSegmentVisible = z;
        this.progressClipAnchors = pair;
    }

    public /* synthetic */ RecordProgressState(long j, boolean z, Pair pair, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            pair = null;
        }
        this(j, z, pair);
    }
}
