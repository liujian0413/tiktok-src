package com.p280ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge */
public final class SuggestChallenge {
    @C6593c(mo15949a = "challenge_info")
    public Challenge challenge;

    public SuggestChallenge() {
        this(null, 1, null);
    }

    public static /* synthetic */ SuggestChallenge copy$default(SuggestChallenge suggestChallenge, Challenge challenge2, int i, Object obj) {
        if ((i & 1) != 0) {
            challenge2 = suggestChallenge.challenge;
        }
        return suggestChallenge.copy(challenge2);
    }

    public final SuggestChallenge copy(Challenge challenge2) {
        return new SuggestChallenge(challenge2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.challenge, (java.lang.Object) ((com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge) r2).challenge) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge r2 = (com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge) r2
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r1.challenge
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r2.challenge
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            return challenge2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestChallenge(challenge=");
        sb.append(this.challenge);
        sb.append(")");
        return sb.toString();
    }

    public SuggestChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public /* synthetic */ SuggestChallenge(Challenge challenge2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            challenge2 = null;
        }
        this(challenge2);
    }
}
