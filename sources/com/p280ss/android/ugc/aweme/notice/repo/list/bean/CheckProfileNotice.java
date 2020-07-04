package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice */
public final class CheckProfileNotice {
    @C6593c(mo15949a = "count")
    private final int countOfUser;
    @C6593c(mo15949a = "create_time")
    private final long createTime;
    @C6593c(mo15949a = "users")
    private final List<User> users;

    public CheckProfileNotice() {
        this(0, null, 0, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.profile.model.User>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice copy$default(com.p280ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r0, int r1, java.util.List<com.p280ss.android.ugc.aweme.profile.model.User> r2, long r3, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            int r1 = r0.countOfUser
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r2 = r0.users
        L_0x000c:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0012
            long r3 = r0.createTime
        L_0x0012:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice.copy$default(com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice, int, java.util.List, long, int, java.lang.Object):com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice");
    }

    public final int component1() {
        return this.countOfUser;
    }

    public final List<User> component2() {
        return this.users;
    }

    public final long component3() {
        return this.createTime;
    }

    public final CheckProfileNotice copy(int i, List<? extends User> list, long j) {
        return new CheckProfileNotice(i, list, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckProfileNotice) {
                CheckProfileNotice checkProfileNotice = (CheckProfileNotice) obj;
                if ((this.countOfUser == checkProfileNotice.countOfUser) && C7573i.m23585a((Object) this.users, (Object) checkProfileNotice.users)) {
                    if (this.createTime == checkProfileNotice.createTime) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCountOfUser() {
        return this.countOfUser;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public final int hashCode() {
        int i = this.countOfUser * 31;
        List<User> list = this.users;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        long j = this.createTime;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckProfileNotice(countOfUser=");
        sb.append(this.countOfUser);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(")");
        return sb.toString();
    }

    public CheckProfileNotice(int i, List<? extends User> list, long j) {
        this.countOfUser = i;
        this.users = list;
        this.createTime = j;
    }

    public /* synthetic */ CheckProfileNotice(int i, List list, long j, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            list = null;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        this(i, list, j);
    }
}
