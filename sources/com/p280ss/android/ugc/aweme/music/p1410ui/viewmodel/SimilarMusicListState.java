package com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListState;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListState */
public final class SimilarMusicListState implements C11670t {
    private final ListState<C34015d, C34012a> listState;
    private final String musicId;

    public SimilarMusicListState() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.music.ui.viewmodel.d, com.ss.android.ugc.aweme.music.ui.viewmodel.a>, for r2v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.SimilarMusicListState copy$default(com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.SimilarMusicListState r0, java.lang.String r1, com.bytedance.jedi.arch.ext.list.ListState<com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34015d, com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34012a> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.lang.String r1 = r0.musicId
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.music.ui.viewmodel.d, com.ss.android.ugc.aweme.music.ui.viewmodel.a> r2 = r0.listState
        L_0x000c:
            com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListState r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.SimilarMusicListState.copy$default(com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListState, java.lang.String, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListState");
    }

    public final String component1() {
        return this.musicId;
    }

    public final ListState<C34015d, C34012a> component2() {
        return this.listState;
    }

    public final SimilarMusicListState copy(String str, ListState<C34015d, C34012a> listState2) {
        C7573i.m23587b(listState2, "listState");
        return new SimilarMusicListState(str, listState2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.listState, (java.lang.Object) r3.listState) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.SimilarMusicListState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListState r3 = (com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.SimilarMusicListState) r3
            java.lang.String r0 = r2.musicId
            java.lang.String r1 = r3.musicId
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.music.ui.viewmodel.d, com.ss.android.ugc.aweme.music.ui.viewmodel.a> r0 = r2.listState
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.music.ui.viewmodel.d, com.ss.android.ugc.aweme.music.ui.viewmodel.a> r3 = r3.listState
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.SimilarMusicListState.equals(java.lang.Object):boolean");
    }

    public final ListState<C34015d, C34012a> getListState() {
        return this.listState;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int hashCode() {
        String str = this.musicId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ListState<C34015d, C34012a> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarMusicListState(musicId=");
        sb.append(this.musicId);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public SimilarMusicListState(String str, ListState<C34015d, C34012a> listState2) {
        C7573i.m23587b(listState2, "listState");
        this.musicId = str;
        this.listState = listState2;
    }

    public /* synthetic */ SimilarMusicListState(String str, ListState listState2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            C34012a aVar = new C34012a(false, 0, 0, 0, 15, null);
            listState2 = new ListState(aVar, null, null, null, null, 30, null);
        }
        this(str, listState2);
    }
}
