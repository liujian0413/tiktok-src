package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeDraftState */
public final class AwemeDraftState implements C11670t {
    private final C27311c awemeDraft;

    public AwemeDraftState() {
        this(null, 1, null);
    }

    public static /* synthetic */ AwemeDraftState copy$default(AwemeDraftState awemeDraftState, C27311c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = awemeDraftState.awemeDraft;
        }
        return awemeDraftState.copy(cVar);
    }

    public final C27311c component1() {
        return this.awemeDraft;
    }

    public final AwemeDraftState copy(C27311c cVar) {
        C7573i.m23587b(cVar, "awemeDraft");
        return new AwemeDraftState(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.awemeDraft, (java.lang.Object) ((com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeDraftState) r2).awemeDraft) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeDraftState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeDraftState r2 = (com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeDraftState) r2
            com.ss.android.ugc.aweme.draft.model.c r0 = r1.awemeDraft
            com.ss.android.ugc.aweme.draft.model.c r2 = r2.awemeDraft
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeDraftState.equals(java.lang.Object):boolean");
    }

    public final C27311c getAwemeDraft() {
        return this.awemeDraft;
    }

    public final int hashCode() {
        C27311c cVar = this.awemeDraft;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeDraftState(awemeDraft=");
        sb.append(this.awemeDraft);
        sb.append(")");
        return sb.toString();
    }

    public AwemeDraftState(C27311c cVar) {
        C7573i.m23587b(cVar, "awemeDraft");
        this.awemeDraft = cVar;
    }

    public /* synthetic */ AwemeDraftState(C27311c cVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            cVar = new C27311c();
        }
        this(cVar);
    }
}
