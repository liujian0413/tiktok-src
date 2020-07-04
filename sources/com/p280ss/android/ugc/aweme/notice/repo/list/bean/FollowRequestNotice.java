package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice */
public final class FollowRequestNotice {
    @C6593c(mo15949a = "count")
    private final int requestCount;

    public FollowRequestNotice() {
        this(0, 1, null);
    }

    public static /* synthetic */ FollowRequestNotice copy$default(FollowRequestNotice followRequestNotice, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followRequestNotice.requestCount;
        }
        return followRequestNotice.copy(i);
    }

    public final int component1() {
        return this.requestCount;
    }

    public final FollowRequestNotice copy(int i) {
        return new FollowRequestNotice(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FollowRequestNotice) {
                if (this.requestCount == ((FollowRequestNotice) obj).requestCount) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int getRequestCount() {
        return this.requestCount;
    }

    public final int hashCode() {
        return this.requestCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRequestNotice(requestCount=");
        sb.append(this.requestCount);
        sb.append(")");
        return sb.toString();
    }

    public FollowRequestNotice(int i) {
        this.requestCount = i;
    }

    public /* synthetic */ FollowRequestNotice(int i, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        this(i);
    }
}
