package com.p280ss.android.ugc.aweme.friends.model;

import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecommendContact */
public final class RecommendContact extends User {
    private final Integer type;

    public RecommendContact() {
        this(null, 1, null);
    }

    public static /* synthetic */ RecommendContact copy$default(RecommendContact recommendContact, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = recommendContact.type;
        }
        return recommendContact.copy(num);
    }

    public final Integer component1() {
        return this.type;
    }

    public final RecommendContact copy(Integer num) {
        return new RecommendContact(num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.type, (java.lang.Object) ((com.p280ss.android.ugc.aweme.friends.model.RecommendContact) r2).type) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.friends.model.RecommendContact
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.friends.model.RecommendContact r2 = (com.p280ss.android.ugc.aweme.friends.model.RecommendContact) r2
            java.lang.Integer r0 = r1.type
            java.lang.Integer r2 = r2.type
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.friends.model.RecommendContact.equals(java.lang.Object):boolean");
    }

    public final Integer getType() {
        return this.type;
    }

    public final int hashCode() {
        Integer num = this.type;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendContact(type=");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }

    public RecommendContact(Integer num) {
        this.type = num;
    }

    public /* synthetic */ RecommendContact(Integer num, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            num = Integer.valueOf(0);
        }
        this(num);
    }
}
