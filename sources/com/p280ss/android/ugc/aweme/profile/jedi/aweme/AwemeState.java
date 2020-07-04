package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeState */
public final class AwemeState implements C11670t {
    private final Aweme aweme;

    public AwemeState() {
        this(null, 1, null);
    }

    public static /* synthetic */ AwemeState copy$default(AwemeState awemeState, Aweme aweme2, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme2 = awemeState.aweme;
        }
        return awemeState.copy(aweme2);
    }

    public final Aweme component1() {
        return this.aweme;
    }

    public final AwemeState copy(Aweme aweme2) {
        C7573i.m23587b(aweme2, "aweme");
        return new AwemeState(aweme2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.aweme, (java.lang.Object) ((com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeState) r2).aweme) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeState r2 = (com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeState) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.aweme
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.aweme
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeState.equals(java.lang.Object):boolean");
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final int hashCode() {
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            return aweme2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeState(aweme=");
        sb.append(this.aweme);
        sb.append(")");
        return sb.toString();
    }

    public AwemeState(Aweme aweme2) {
        C7573i.m23587b(aweme2, "aweme");
        this.aweme = aweme2;
    }

    public /* synthetic */ AwemeState(Aweme aweme2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            aweme2 = new Aweme();
        }
        this(aweme2);
    }
}
