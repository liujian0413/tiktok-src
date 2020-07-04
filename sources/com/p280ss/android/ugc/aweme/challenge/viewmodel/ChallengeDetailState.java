package com.p280ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11496ae;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState */
public final class ChallengeDetailState implements C11670t {
    private final C11491a<ChallengeDetail> challengeDetail;

    public ChallengeDetailState() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.a, code=com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.challenge.model.ChallengeDetail>, for r1v0, types: [com.bytedance.jedi.arch.a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState copy$default(com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState r0, com.bytedance.jedi.arch.C11491a<com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.challenge.model.ChallengeDetail> r1 = r0.challengeDetail
        L_0x0006:
            com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState.copy$default(com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState, com.bytedance.jedi.arch.a, int, java.lang.Object):com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState");
    }

    public final C11491a<ChallengeDetail> component1() {
        return this.challengeDetail;
    }

    public final ChallengeDetailState copy(C11491a<? extends ChallengeDetail> aVar) {
        C7573i.m23587b(aVar, "challengeDetail");
        return new ChallengeDetailState(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.challengeDetail, (java.lang.Object) ((com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState) r2).challengeDetail) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState r2 = (com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState) r2
            com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.challenge.model.ChallengeDetail> r0 = r1.challengeDetail
            com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.challenge.model.ChallengeDetail> r2 = r2.challengeDetail
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState.equals(java.lang.Object):boolean");
    }

    public final C11491a<ChallengeDetail> getChallengeDetail() {
        return this.challengeDetail;
    }

    public final int hashCode() {
        C11491a<ChallengeDetail> aVar = this.challengeDetail;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeDetailState(challengeDetail=");
        sb.append(this.challengeDetail);
        sb.append(")");
        return sb.toString();
    }

    public ChallengeDetailState(C11491a<? extends ChallengeDetail> aVar) {
        C7573i.m23587b(aVar, "challengeDetail");
        this.challengeDetail = aVar;
    }

    public /* synthetic */ ChallengeDetailState(C11491a aVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            aVar = C11496ae.f31094a;
        }
        this(aVar);
    }
}
