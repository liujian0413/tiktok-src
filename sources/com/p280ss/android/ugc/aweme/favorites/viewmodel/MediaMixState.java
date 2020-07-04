package com.p280ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.base.arch.C23273a;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState */
public final class MediaMixState implements C11670t {
    private final String enterFrom;
    private final String enterMethod;
    private final ListState<MixStruct, C23273a> listState;
    private final String searchKeyword;

    public MediaMixState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.MixStruct, com.ss.android.ugc.aweme.base.arch.a>, for r4v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState copy$default(com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, com.bytedance.jedi.arch.ext.list.ListState<com.p280ss.android.ugc.aweme.feed.model.MixStruct, com.p280ss.android.ugc.aweme.base.arch.C23273a> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.enterFrom
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.enterMethod
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.lang.String r3 = r0.searchKeyword
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.MixStruct, com.ss.android.ugc.aweme.base.arch.a> r4 = r0.listState
        L_0x0018:
            com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState.copy$default(com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState, java.lang.String, java.lang.String, java.lang.String, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState");
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.enterMethod;
    }

    public final String component3() {
        return this.searchKeyword;
    }

    public final ListState<MixStruct, C23273a> component4() {
        return this.listState;
    }

    public final MediaMixState copy(String str, String str2, String str3, ListState<MixStruct, C23273a> listState2) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "enterMethod");
        C7573i.m23587b(str3, "searchKeyword");
        C7573i.m23587b(listState2, "listState");
        return new MediaMixState(str, str2, str3, listState2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.listState, (java.lang.Object) r3.listState) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r3 = (com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState) r3
            java.lang.String r0 = r2.enterFrom
            java.lang.String r1 = r3.enterFrom
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.enterMethod
            java.lang.String r1 = r3.enterMethod
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.searchKeyword
            java.lang.String r1 = r3.searchKeyword
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.MixStruct, com.ss.android.ugc.aweme.base.arch.a> r0 = r2.listState
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.MixStruct, com.ss.android.ugc.aweme.base.arch.a> r3 = r3.listState
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState.equals(java.lang.Object):boolean");
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final ListState<MixStruct, C23273a> getListState() {
        return this.listState;
    }

    public final String getSearchKeyword() {
        return this.searchKeyword;
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.enterMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.searchKeyword;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ListState<MixStruct, C23273a> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaMixState(enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", enterMethod=");
        sb.append(this.enterMethod);
        sb.append(", searchKeyword=");
        sb.append(this.searchKeyword);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public MediaMixState(String str, String str2, String str3, ListState<MixStruct, C23273a> listState2) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "enterMethod");
        C7573i.m23587b(str3, "searchKeyword");
        C7573i.m23587b(listState2, "listState");
        this.enterFrom = str;
        this.enterMethod = str2;
        this.searchKeyword = str3;
        this.listState = listState2;
    }

    public /* synthetic */ MediaMixState(String str, String str2, String str3, ListState listState2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            C23273a aVar = new C23273a(false, 0, 3, null);
            listState2 = new ListState(aVar, null, null, null, null, 30, null);
        }
        this(str, str2, str3, listState2);
    }
}
