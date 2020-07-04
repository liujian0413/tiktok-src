package com.p280ss.android.ugc.gamora.recorder.musiccut;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState */
public final class RecordMusicCutViewState implements C11670t {
    private final C44403b<C44691a> musicCutResult;

    public RecordMusicCutViewState() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.b, code=com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.gamora.recorder.musiccut.a>, for r1v0, types: [com.ss.android.ugc.gamora.jedi.b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState copy$default(com.p280ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState r0, com.p280ss.android.ugc.gamora.jedi.C44403b<com.p280ss.android.ugc.gamora.recorder.musiccut.C44691a> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.gamora.recorder.musiccut.a> r1 = r0.musicCutResult
        L_0x0006:
            com.ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState.copy$default(com.ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState, com.ss.android.ugc.gamora.jedi.b, int, java.lang.Object):com.ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState");
    }

    public final C44403b<C44691a> component1() {
        return this.musicCutResult;
    }

    public final RecordMusicCutViewState copy(C44403b<C44691a> bVar) {
        return new RecordMusicCutViewState(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.musicCutResult, (java.lang.Object) ((com.p280ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState) r2).musicCutResult) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState r2 = (com.p280ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState) r2
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.gamora.recorder.musiccut.a> r0 = r1.musicCutResult
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.gamora.recorder.musiccut.a> r2 = r2.musicCutResult
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState.equals(java.lang.Object):boolean");
    }

    public final C44403b<C44691a> getMusicCutResult() {
        return this.musicCutResult;
    }

    public final int hashCode() {
        C44403b<C44691a> bVar = this.musicCutResult;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordMusicCutViewState(musicCutResult=");
        sb.append(this.musicCutResult);
        sb.append(")");
        return sb.toString();
    }

    public RecordMusicCutViewState(C44403b<C44691a> bVar) {
        this.musicCutResult = bVar;
    }

    public /* synthetic */ RecordMusicCutViewState(C44403b bVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        this(bVar);
    }
}
