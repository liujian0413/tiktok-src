package com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState */
public final class RecommendFollowViewHolderState implements C11670t {
    private final List<Aweme> awemeList;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState copy$default(com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState r0, java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.awemeList
        L_0x0006:
            com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState.copy$default(com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState");
    }

    public final List<Aweme> component1() {
        return this.awemeList;
    }

    public final RecommendFollowViewHolderState copy(List<? extends Aweme> list) {
        C7573i.m23587b(list, "awemeList");
        return new RecommendFollowViewHolderState(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.awemeList, (java.lang.Object) ((com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState) r2).awemeList) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState r2 = (com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r1.awemeList
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.awemeList
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState.equals(java.lang.Object):boolean");
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final int hashCode() {
        List<Aweme> list = this.awemeList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendFollowViewHolderState(awemeList=");
        sb.append(this.awemeList);
        sb.append(")");
        return sb.toString();
    }

    public RecommendFollowViewHolderState(List<? extends Aweme> list) {
        C7573i.m23587b(list, "awemeList");
        this.awemeList = list;
    }
}
