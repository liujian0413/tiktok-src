package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice */
public final class DuetNotice {
    @C6593c(mo15949a = "aweme")
    private final Aweme aweme;
    @C6593c(mo15949a = "from_user_info")
    private final User fromUser;
    @C6593c(mo15949a = "to_user_info")
    private final User toUser;

    public static /* synthetic */ DuetNotice copy$default(DuetNotice duetNotice, User user, User user2, Aweme aweme2, int i, Object obj) {
        if ((i & 1) != 0) {
            user = duetNotice.fromUser;
        }
        if ((i & 2) != 0) {
            user2 = duetNotice.toUser;
        }
        if ((i & 4) != 0) {
            aweme2 = duetNotice.aweme;
        }
        return duetNotice.copy(user, user2, aweme2);
    }

    public final User component1() {
        return this.fromUser;
    }

    public final User component2() {
        return this.toUser;
    }

    public final Aweme component3() {
        return this.aweme;
    }

    public final DuetNotice copy(User user, User user2, Aweme aweme2) {
        return new DuetNotice(user, user2, aweme2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.aweme, (java.lang.Object) r3.aweme) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice) r3
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.fromUser
            com.ss.android.ugc.aweme.profile.model.User r1 = r3.fromUser
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.toUser
            com.ss.android.ugc.aweme.profile.model.User r1 = r3.toUser
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.aweme
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.aweme
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice.equals(java.lang.Object):boolean");
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final User getFromUser() {
        return this.fromUser;
    }

    public final User getToUser() {
        return this.toUser;
    }

    public final int hashCode() {
        User user = this.fromUser;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        User user2 = this.toUser;
        int hashCode2 = (hashCode + (user2 != null ? user2.hashCode() : 0)) * 31;
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            i = aweme2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuetNotice(fromUser=");
        sb.append(this.fromUser);
        sb.append(", toUser=");
        sb.append(this.toUser);
        sb.append(", aweme=");
        sb.append(this.aweme);
        sb.append(")");
        return sb.toString();
    }

    public DuetNotice(User user, User user2, Aweme aweme2) {
        this.fromUser = user;
        this.toUser = user2;
        this.aweme = aweme2;
    }
}
