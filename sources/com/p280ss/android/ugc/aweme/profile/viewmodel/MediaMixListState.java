package com.p280ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.base.arch.C23273a;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.profile.model.MediaMixList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListState */
public final class MediaMixListState implements C11670t {
    private final String enterFrom;
    private final ListState<MixStruct, C23273a> listState;
    private final MediaMixList mediaMixOfFirstPage;
    private final String suid;
    private final String uid;

    public MediaMixListState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.MixStruct, com.ss.android.ugc.aweme.base.arch.a>, for r8v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState copy$default(com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, com.p280ss.android.ugc.aweme.profile.model.MediaMixList r7, com.bytedance.jedi.arch.ext.list.ListState<com.p280ss.android.ugc.aweme.feed.model.MixStruct, com.p280ss.android.ugc.aweme.base.arch.C23273a> r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = r3.uid
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.lang.String r5 = r3.suid
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            java.lang.String r6 = r3.enterFrom
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.profile.model.MediaMixList r7 = r3.mediaMixOfFirstPage
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.MixStruct, com.ss.android.ugc.aweme.base.arch.a> r8 = r3.listState
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListState r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState.copy$default(com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListState, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.profile.model.MediaMixList, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListState");
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.suid;
    }

    public final String component3() {
        return this.enterFrom;
    }

    public final MediaMixList component4() {
        return this.mediaMixOfFirstPage;
    }

    public final ListState<MixStruct, C23273a> component5() {
        return this.listState;
    }

    public final MediaMixListState copy(String str, String str2, String str3, MediaMixList mediaMixList, ListState<MixStruct, C23273a> listState2) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(str2, "suid");
        C7573i.m23587b(str3, "enterFrom");
        C7573i.m23587b(mediaMixList, "mediaMixOfFirstPage");
        C7573i.m23587b(listState2, "listState");
        MediaMixListState mediaMixListState = new MediaMixListState(str, str2, str3, mediaMixList, listState2);
        return mediaMixListState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.listState, (java.lang.Object) r3.listState) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListState r3 = (com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.suid
            java.lang.String r1 = r3.suid
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.enterFrom
            java.lang.String r1 = r3.enterFrom
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.profile.model.MediaMixList r0 = r2.mediaMixOfFirstPage
            com.ss.android.ugc.aweme.profile.model.MediaMixList r1 = r3.mediaMixOfFirstPage
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.MixStruct, com.ss.android.ugc.aweme.base.arch.a> r0 = r2.listState
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.MixStruct, com.ss.android.ugc.aweme.base.arch.a> r3 = r3.listState
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState.equals(java.lang.Object):boolean");
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final ListState<MixStruct, C23273a> getListState() {
        return this.listState;
    }

    public final MediaMixList getMediaMixOfFirstPage() {
        return this.mediaMixOfFirstPage;
    }

    public final String getSuid() {
        return this.suid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.suid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.enterFrom;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        MediaMixList mediaMixList = this.mediaMixOfFirstPage;
        int hashCode4 = (hashCode3 + (mediaMixList != null ? mediaMixList.hashCode() : 0)) * 31;
        ListState<MixStruct, C23273a> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaMixListState(uid=");
        sb.append(this.uid);
        sb.append(", suid=");
        sb.append(this.suid);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", mediaMixOfFirstPage=");
        sb.append(this.mediaMixOfFirstPage);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public MediaMixListState(String str, String str2, String str3, MediaMixList mediaMixList, ListState<MixStruct, C23273a> listState2) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(str2, "suid");
        C7573i.m23587b(str3, "enterFrom");
        C7573i.m23587b(mediaMixList, "mediaMixOfFirstPage");
        C7573i.m23587b(listState2, "listState");
        this.uid = str;
        this.suid = str2;
        this.enterFrom = str3;
        this.mediaMixOfFirstPage = mediaMixList;
        this.listState = listState2;
    }

    public /* synthetic */ MediaMixListState(String str, String str2, String str3, MediaMixList mediaMixList, ListState listState2, int i, C7571f fVar) {
        String str4;
        String str5;
        String str6;
        MediaMixList mediaMixList2;
        ListState listState3;
        if ((i & 1) != 0) {
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            mediaMixList2 = new MediaMixList(null, 0, 0);
        } else {
            mediaMixList2 = mediaMixList;
        }
        if ((i & 16) != 0) {
            C23273a aVar = new C23273a(false, 0, 3, null);
            listState3 = new ListState(aVar, null, null, null, null, 30, null);
        } else {
            listState3 = listState2;
        }
        this(str4, str5, str6, mediaMixList2, listState3);
    }
}
