package com.p280ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendContactState */
public final class RecommendContactState implements C11670t {
    private final RecommendContact contact;

    public RecommendContactState() {
        this(null, 1, null);
    }

    public static /* synthetic */ RecommendContactState copy$default(RecommendContactState recommendContactState, RecommendContact recommendContact, int i, Object obj) {
        if ((i & 1) != 0) {
            recommendContact = recommendContactState.contact;
        }
        return recommendContactState.copy(recommendContact);
    }

    public final RecommendContact component1() {
        return this.contact;
    }

    public final RecommendContactState copy(RecommendContact recommendContact) {
        return new RecommendContactState(recommendContact);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.contact, (java.lang.Object) ((com.p280ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendContactState) r2).contact) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendContactState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendContactState r2 = (com.p280ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendContactState) r2
            com.ss.android.ugc.aweme.friends.model.RecommendContact r0 = r1.contact
            com.ss.android.ugc.aweme.friends.model.RecommendContact r2 = r2.contact
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendContactState.equals(java.lang.Object):boolean");
    }

    public final RecommendContact getContact() {
        return this.contact;
    }

    public final int hashCode() {
        RecommendContact recommendContact = this.contact;
        if (recommendContact != null) {
            return recommendContact.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendContactState(contact=");
        sb.append(this.contact);
        sb.append(")");
        return sb.toString();
    }

    public RecommendContactState(RecommendContact recommendContact) {
        this.contact = recommendContact;
    }

    public /* synthetic */ RecommendContactState(RecommendContact recommendContact, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            recommendContact = null;
        }
        this(recommendContact);
    }
}
