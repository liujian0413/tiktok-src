package com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.following.repository.C29607i;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState */
public final class FollowingRelationState implements C11670t {
    private final boolean isSelf;
    private final ListState<Object, C29607i> listState;
    private final List<Object> recommendList;
    private final String secUserId;
    private final String userId;

    public FollowingRelationState() {
        this(null, null, false, null, null, 31, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.repository.i>, for r8v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r7v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationState copy$default(com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationState r3, java.lang.String r4, java.lang.String r5, boolean r6, java.util.List<java.lang.Object> r7, com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.p280ss.android.ugc.aweme.following.repository.C29607i> r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = r3.userId
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.lang.String r5 = r3.secUserId
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            boolean r6 = r3.isSelf
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.util.List<java.lang.Object> r7 = r3.recommendList
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.repository.i> r8 = r3.listState
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationState.copy$default(com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState, java.lang.String, java.lang.String, boolean, java.util.List, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState");
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final boolean component3() {
        return this.isSelf;
    }

    public final List<Object> component4() {
        return this.recommendList;
    }

    public final ListState<Object, C29607i> component5() {
        return this.listState;
    }

    public final FollowingRelationState copy(String str, String str2, boolean z, List<? extends Object> list, ListState<Object, C29607i> listState2) {
        C7573i.m23587b(str, "userId");
        C7573i.m23587b(str2, "secUserId");
        C7573i.m23587b(list, "recommendList");
        C7573i.m23587b(listState2, "listState");
        FollowingRelationState followingRelationState = new FollowingRelationState(str, str2, z, list, listState2);
        return followingRelationState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FollowingRelationState) {
                FollowingRelationState followingRelationState = (FollowingRelationState) obj;
                if (C7573i.m23585a((Object) this.userId, (Object) followingRelationState.userId) && C7573i.m23585a((Object) this.secUserId, (Object) followingRelationState.secUserId)) {
                    if (!(this.isSelf == followingRelationState.isSelf) || !C7573i.m23585a((Object) this.recommendList, (Object) followingRelationState.recommendList) || !C7573i.m23585a((Object) this.listState, (Object) followingRelationState.listState)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
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
        boolean z = this.isSelf;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        List<Object> list = this.recommendList;
        int hashCode3 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        ListState<Object, C29607i> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode3 + i;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowingRelationState(userId=");
        sb.append(this.userId);
        sb.append(", secUserId=");
        sb.append(this.secUserId);
        sb.append(", isSelf=");
        sb.append(this.isSelf);
        sb.append(", recommendList=");
        sb.append(this.recommendList);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public FollowingRelationState(String str, String str2, boolean z, List<? extends Object> list, ListState<Object, C29607i> listState2) {
        C7573i.m23587b(str, "userId");
        C7573i.m23587b(str2, "secUserId");
        C7573i.m23587b(list, "recommendList");
        C7573i.m23587b(listState2, "listState");
        this.userId = str;
        this.secUserId = str2;
        this.isSelf = z;
        this.recommendList = list;
        this.listState = listState2;
    }

    public /* synthetic */ FollowingRelationState(String str, String str2, boolean z, List list, ListState listState2, int i, C7571f fVar) {
        String str3;
        String str4;
        boolean z2;
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
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            list2 = C7525m.m23461a();
        } else {
            list2 = list;
        }
        if ((i & 16) != 0) {
            C29607i iVar = new C29607i(false, 0, 0, false, 0, 0, 63, null);
            listState3 = new ListState(iVar, null, null, null, null, 30, null);
        } else {
            listState3 = listState2;
        }
        this(str3, str4, z2, list2, listState3);
    }
}
