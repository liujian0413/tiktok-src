package com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.following.repository.C29607i;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState */
public final class FollowerRelationState implements C11670t {
    private final ListState<Object, C29607i> listState;
    private final List<Object> recommendList;
    private final String secUserId;
    private final String userId;

    public FollowerRelationState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.repository.i>, for r4v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState copy$default(com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState r0, java.lang.String r1, java.lang.String r2, java.util.List<java.lang.Object> r3, com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.p280ss.android.ugc.aweme.following.repository.C29607i> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.userId
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.secUserId
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.util.List<java.lang.Object> r3 = r0.recommendList
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.repository.i> r4 = r0.listState
        L_0x0018:
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState.copy$default(com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState, java.lang.String, java.lang.String, java.util.List, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState");
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final List<Object> component3() {
        return this.recommendList;
    }

    public final ListState<Object, C29607i> component4() {
        return this.listState;
    }

    public final FollowerRelationState copy(String str, String str2, List<? extends Object> list, ListState<Object, C29607i> listState2) {
        C7573i.m23587b(str, "userId");
        C7573i.m23587b(str2, "secUserId");
        C7573i.m23587b(list, "recommendList");
        C7573i.m23587b(listState2, "listState");
        return new FollowerRelationState(str, str2, list, listState2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.listState, (java.lang.Object) r3.listState) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState r3 = (com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState) r3
            java.lang.String r0 = r2.userId
            java.lang.String r1 = r3.userId
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.secUserId
            java.lang.String r1 = r3.secUserId
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<java.lang.Object> r0 = r2.recommendList
            java.util.List<java.lang.Object> r1 = r3.recommendList
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.repository.i> r0 = r2.listState
            com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.repository.i> r3 = r3.listState
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState.equals(java.lang.Object):boolean");
    }

    public final ListState<Object, C29607i> getListState() {
        return this.listState;
    }

    public final List<Object> getRecommendList() {
        return this.recommendList;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Object> list = this.recommendList;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ListState<Object, C29607i> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowerRelationState(userId=");
        sb.append(this.userId);
        sb.append(", secUserId=");
        sb.append(this.secUserId);
        sb.append(", recommendList=");
        sb.append(this.recommendList);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public FollowerRelationState(String str, String str2, List<? extends Object> list, ListState<Object, C29607i> listState2) {
        C7573i.m23587b(str, "userId");
        C7573i.m23587b(str2, "secUserId");
        C7573i.m23587b(list, "recommendList");
        C7573i.m23587b(listState2, "listState");
        this.userId = str;
        this.secUserId = str2;
        this.recommendList = list;
        this.listState = listState2;
    }

    public /* synthetic */ FollowerRelationState(String str, String str2, List list, ListState listState2, int i, C7571f fVar) {
        String str3;
        String str4;
        List list2;
        ListState listState3;
        if ((i & 1) != 0) {
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            list2 = C7525m.m23461a();
        } else {
            list2 = list;
        }
        if ((i & 8) != 0) {
            C29607i iVar = new C29607i(false, 0, 0, false, 0, 0, 63, null);
            listState3 = new ListState(iVar, null, null, null, null, 30, null);
        } else {
            listState3 = listState2;
        }
        this(str3, str4, list2, listState3);
    }
}
