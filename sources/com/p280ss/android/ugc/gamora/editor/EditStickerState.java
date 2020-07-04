package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.C44410f;
import com.p280ss.android.ugc.gamora.jedi.C44411g;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditStickerState */
public final class EditStickerState implements C11670t {
    private final C44410f<Float, Long> voteTextAnimEvent;
    private final C44411g<Float, Float, Float> voteTextLayoutEvent;
    private final Integer votingTopMargin;

    public EditStickerState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.f, code=com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long>, for r2v0, types: [com.ss.android.ugc.gamora.jedi.f] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.g, code=com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float>, for r3v0, types: [com.ss.android.ugc.gamora.jedi.g] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.gamora.editor.EditStickerState copy$default(com.p280ss.android.ugc.gamora.editor.EditStickerState r0, java.lang.Integer r1, com.p280ss.android.ugc.gamora.jedi.C44410f<java.lang.Float, java.lang.Long> r2, com.p280ss.android.ugc.gamora.jedi.C44411g<java.lang.Float, java.lang.Float, java.lang.Float> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.Integer r1 = r0.votingTopMargin
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r2 = r0.voteTextAnimEvent
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r3 = r0.voteTextLayoutEvent
        L_0x0012:
            com.ss.android.ugc.gamora.editor.EditStickerState r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditStickerState.copy$default(com.ss.android.ugc.gamora.editor.EditStickerState, java.lang.Integer, com.ss.android.ugc.gamora.jedi.f, com.ss.android.ugc.gamora.jedi.g, int, java.lang.Object):com.ss.android.ugc.gamora.editor.EditStickerState");
    }

    public final Integer component1() {
        return this.votingTopMargin;
    }

    public final C44410f<Float, Long> component2() {
        return this.voteTextAnimEvent;
    }

    public final C44411g<Float, Float, Float> component3() {
        return this.voteTextLayoutEvent;
    }

    public final EditStickerState copy(Integer num, C44410f<Float, Long> fVar, C44411g<Float, Float, Float> gVar) {
        return new EditStickerState(num, fVar, gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.voteTextLayoutEvent, (java.lang.Object) r3.voteTextLayoutEvent) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditStickerState
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.editor.EditStickerState r3 = (com.p280ss.android.ugc.gamora.editor.EditStickerState) r3
            java.lang.Integer r0 = r2.votingTopMargin
            java.lang.Integer r1 = r3.votingTopMargin
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r0 = r2.voteTextAnimEvent
            com.ss.android.ugc.gamora.jedi.f<java.lang.Float, java.lang.Long> r1 = r3.voteTextAnimEvent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r0 = r2.voteTextLayoutEvent
            com.ss.android.ugc.gamora.jedi.g<java.lang.Float, java.lang.Float, java.lang.Float> r3 = r3.voteTextLayoutEvent
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditStickerState.equals(java.lang.Object):boolean");
    }

    public final C44410f<Float, Long> getVoteTextAnimEvent() {
        return this.voteTextAnimEvent;
    }

    public final C44411g<Float, Float, Float> getVoteTextLayoutEvent() {
        return this.voteTextLayoutEvent;
    }

    public final Integer getVotingTopMargin() {
        return this.votingTopMargin;
    }

    public final int hashCode() {
        Integer num = this.votingTopMargin;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        C44410f<Float, Long> fVar = this.voteTextAnimEvent;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C44411g<Float, Float, Float> gVar = this.voteTextLayoutEvent;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditStickerState(votingTopMargin=");
        sb.append(this.votingTopMargin);
        sb.append(", voteTextAnimEvent=");
        sb.append(this.voteTextAnimEvent);
        sb.append(", voteTextLayoutEvent=");
        sb.append(this.voteTextLayoutEvent);
        sb.append(")");
        return sb.toString();
    }

    public EditStickerState(Integer num, C44410f<Float, Long> fVar, C44411g<Float, Float, Float> gVar) {
        this.votingTopMargin = num;
        this.voteTextAnimEvent = fVar;
        this.voteTextLayoutEvent = gVar;
    }

    public /* synthetic */ EditStickerState(Integer num, C44410f fVar, C44411g gVar, int i, C7571f fVar2) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            fVar = null;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        this(num, fVar, gVar);
    }
}
