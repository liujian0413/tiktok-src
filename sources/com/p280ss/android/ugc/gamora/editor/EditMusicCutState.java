package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.Triple;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditMusicCutState */
public final class EditMusicCutState implements C11670t {
    private final Triple<AVMusicWaveBean, Integer, Integer> musicWaveData;
    private final Integer videoLength;

    public EditMusicCutState() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.Triple, code=kotlin.Triple<com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean, java.lang.Integer, java.lang.Integer>, for r1v0, types: [kotlin.Triple] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.gamora.editor.EditMusicCutState copy$default(com.p280ss.android.ugc.gamora.editor.EditMusicCutState r0, kotlin.Triple<com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean, java.lang.Integer, java.lang.Integer> r1, java.lang.Integer r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            kotlin.Triple<com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean, java.lang.Integer, java.lang.Integer> r1 = r0.musicWaveData
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.lang.Integer r2 = r0.videoLength
        L_0x000c:
            com.ss.android.ugc.gamora.editor.EditMusicCutState r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditMusicCutState.copy$default(com.ss.android.ugc.gamora.editor.EditMusicCutState, kotlin.Triple, java.lang.Integer, int, java.lang.Object):com.ss.android.ugc.gamora.editor.EditMusicCutState");
    }

    public final Triple<AVMusicWaveBean, Integer, Integer> component1() {
        return this.musicWaveData;
    }

    public final Integer component2() {
        return this.videoLength;
    }

    public final EditMusicCutState copy(Triple<AVMusicWaveBean, Integer, Integer> triple, Integer num) {
        return new EditMusicCutState(triple, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.videoLength, (java.lang.Object) r3.videoLength) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditMusicCutState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.gamora.editor.EditMusicCutState r3 = (com.p280ss.android.ugc.gamora.editor.EditMusicCutState) r3
            kotlin.Triple<com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean, java.lang.Integer, java.lang.Integer> r0 = r2.musicWaveData
            kotlin.Triple<com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean, java.lang.Integer, java.lang.Integer> r1 = r3.musicWaveData
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r0 = r2.videoLength
            java.lang.Integer r3 = r3.videoLength
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditMusicCutState.equals(java.lang.Object):boolean");
    }

    public final Triple<AVMusicWaveBean, Integer, Integer> getMusicWaveData() {
        return this.musicWaveData;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public final int hashCode() {
        Triple<AVMusicWaveBean, Integer, Integer> triple = this.musicWaveData;
        int i = 0;
        int hashCode = (triple != null ? triple.hashCode() : 0) * 31;
        Integer num = this.videoLength;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditMusicCutState(musicWaveData=");
        sb.append(this.musicWaveData);
        sb.append(", videoLength=");
        sb.append(this.videoLength);
        sb.append(")");
        return sb.toString();
    }

    public EditMusicCutState(Triple<AVMusicWaveBean, Integer, Integer> triple, Integer num) {
        this.musicWaveData = triple;
        this.videoLength = num;
    }

    public /* synthetic */ EditMusicCutState(Triple triple, Integer num, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            triple = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        this(triple, num);
    }
}
