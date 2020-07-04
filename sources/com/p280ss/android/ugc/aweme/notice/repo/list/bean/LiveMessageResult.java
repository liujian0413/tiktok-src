package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult */
public final class LiveMessageResult {
    @C6593c(mo15949a = "lives")
    private final List<LiveNotice> lives;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult copy$default(com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r0, java.util.List<com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice> r1 = r0.lives
        L_0x0006:
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult.copy$default(com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult");
    }

    public final List<LiveNotice> component1() {
        return this.lives;
    }

    public final LiveMessageResult copy(List<LiveNotice> list) {
        return new LiveMessageResult(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.lives, (java.lang.Object) ((com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult) r2).lives) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r2 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult) r2
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice> r0 = r1.lives
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice> r2 = r2.lives
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult.equals(java.lang.Object):boolean");
    }

    public final List<LiveNotice> getLives() {
        return this.lives;
    }

    public final int hashCode() {
        List<LiveNotice> list = this.lives;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveMessageResult(lives=");
        sb.append(this.lives);
        sb.append(")");
        return sb.toString();
    }

    public LiveMessageResult(List<LiveNotice> list) {
        this.lives = list;
    }
}
