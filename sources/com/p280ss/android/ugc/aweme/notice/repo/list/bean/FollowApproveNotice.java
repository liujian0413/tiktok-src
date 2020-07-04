package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice */
public final class FollowApproveNotice {
    @C6593c(mo15949a = "from_user")
    private final User user;

    public FollowApproveNotice() {
        this(null, 1, null);
    }

    public static /* synthetic */ FollowApproveNotice copy$default(FollowApproveNotice followApproveNotice, User user2, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = followApproveNotice.user;
        }
        return followApproveNotice.copy(user2);
    }

    public final User component1() {
        return this.user;
    }

    public final FollowApproveNotice copy(User user2) {
        return new FollowApproveNotice(user2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.user, (java.lang.Object) ((com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice) r2).user) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r2 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice) r2
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.user
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.user
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice.equals(java.lang.Object):boolean");
    }

    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        User user2 = this.user;
        if (user2 != null) {
            return user2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowApproveNotice(user=");
        sb.append(this.user);
        sb.append(")");
        return sb.toString();
    }

    public FollowApproveNotice(User user2) {
        this.user = user2;
    }

    public /* synthetic */ FollowApproveNotice(User user2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            user2 = null;
        }
        this(user2);
    }
}
