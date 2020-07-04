package com.p280ss.android.ugc.aweme.discover.hitrank;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.HitNotice */
public final class HitNotice extends BaseResponse {
    @C6593c(mo15949a = "user_list")
    private ArrayList<SimpleUser> userList;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.ArrayList, code=java.util.ArrayList<com.ss.android.ugc.aweme.message.model.SimpleUser>, for r1v0, types: [java.util.ArrayList] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.hitrank.HitNotice copy$default(com.p280ss.android.ugc.aweme.discover.hitrank.HitNotice r0, java.util.ArrayList<com.p280ss.android.ugc.aweme.message.model.SimpleUser> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.ArrayList<com.ss.android.ugc.aweme.message.model.SimpleUser> r1 = r0.userList
        L_0x0006:
            com.ss.android.ugc.aweme.discover.hitrank.HitNotice r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.hitrank.HitNotice.copy$default(com.ss.android.ugc.aweme.discover.hitrank.HitNotice, java.util.ArrayList, int, java.lang.Object):com.ss.android.ugc.aweme.discover.hitrank.HitNotice");
    }

    public final ArrayList<SimpleUser> component1() {
        return this.userList;
    }

    public final HitNotice copy(ArrayList<SimpleUser> arrayList) {
        C7573i.m23587b(arrayList, "userList");
        return new HitNotice(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.userList, (java.lang.Object) ((com.p280ss.android.ugc.aweme.discover.hitrank.HitNotice) r2).userList) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.discover.hitrank.HitNotice
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.hitrank.HitNotice r2 = (com.p280ss.android.ugc.aweme.discover.hitrank.HitNotice) r2
            java.util.ArrayList<com.ss.android.ugc.aweme.message.model.SimpleUser> r0 = r1.userList
            java.util.ArrayList<com.ss.android.ugc.aweme.message.model.SimpleUser> r2 = r2.userList
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.hitrank.HitNotice.equals(java.lang.Object):boolean");
    }

    public final ArrayList<SimpleUser> getUserList() {
        return this.userList;
    }

    public final int hashCode() {
        ArrayList<SimpleUser> arrayList = this.userList;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HitNotice(userList=");
        sb.append(this.userList);
        sb.append(")");
        return sb.toString();
    }

    public final void setUserList(ArrayList<SimpleUser> arrayList) {
        C7573i.m23587b(arrayList, "<set-?>");
        this.userList = arrayList;
    }

    public HitNotice(ArrayList<SimpleUser> arrayList) {
        C7573i.m23587b(arrayList, "userList");
        this.userList = arrayList;
    }
}
