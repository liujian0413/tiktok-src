package com.p280ss.android.ugc.aweme.mix;

import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11496ae;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDetailState */
public final class MixDetailState implements C11670t {
    private final Long enterEpisodeNum;
    private final ListState<Aweme, C33567t> listState;
    private final String mixId;
    private final C11491a<MixInfo> mixInfo;
    private final int pullType;

    public MixDetailState() {
        this(null, null, null, null, 0, 31, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.a, code=com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.mix.MixInfo>, for r5v0, types: [com.bytedance.jedi.arch.a] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.mix.t>, for r6v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.mix.MixDetailState copy$default(com.p280ss.android.ugc.aweme.mix.MixDetailState r3, java.lang.String r4, com.bytedance.jedi.arch.C11491a<com.p280ss.android.ugc.aweme.mix.MixInfo> r5, com.bytedance.jedi.arch.ext.list.ListState<com.p280ss.android.ugc.aweme.feed.model.Aweme, com.p280ss.android.ugc.aweme.mix.C33567t> r6, java.lang.Long r7, int r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = r3.mixId
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.mix.MixInfo> r5 = r3.mixInfo
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.mix.t> r6 = r3.listState
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.lang.Long r7 = r3.enterEpisodeNum
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            int r8 = r3.pullType
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.ss.android.ugc.aweme.mix.MixDetailState r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailState.copy$default(com.ss.android.ugc.aweme.mix.MixDetailState, java.lang.String, com.bytedance.jedi.arch.a, com.bytedance.jedi.arch.ext.list.ListState, java.lang.Long, int, int, java.lang.Object):com.ss.android.ugc.aweme.mix.MixDetailState");
    }

    public final String component1() {
        return this.mixId;
    }

    public final C11491a<MixInfo> component2() {
        return this.mixInfo;
    }

    public final ListState<Aweme, C33567t> component3() {
        return this.listState;
    }

    public final Long component4() {
        return this.enterEpisodeNum;
    }

    public final int component5() {
        return this.pullType;
    }

    public final MixDetailState copy(String str, C11491a<? extends MixInfo> aVar, ListState<Aweme, C33567t> listState2, Long l, int i) {
        C7573i.m23587b(aVar, "mixInfo");
        C7573i.m23587b(listState2, "listState");
        MixDetailState mixDetailState = new MixDetailState(str, aVar, listState2, l, i);
        return mixDetailState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MixDetailState) {
                MixDetailState mixDetailState = (MixDetailState) obj;
                if (C7573i.m23585a((Object) this.mixId, (Object) mixDetailState.mixId) && C7573i.m23585a((Object) this.mixInfo, (Object) mixDetailState.mixInfo) && C7573i.m23585a((Object) this.listState, (Object) mixDetailState.listState) && C7573i.m23585a((Object) this.enterEpisodeNum, (Object) mixDetailState.enterEpisodeNum)) {
                    if (this.pullType == mixDetailState.pullType) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Long getEnterEpisodeNum() {
        return this.enterEpisodeNum;
    }

    public final ListState<Aweme, C33567t> getListState() {
        return this.listState;
    }

    public final String getMixId() {
        return this.mixId;
    }

    public final C11491a<MixInfo> getMixInfo() {
        return this.mixInfo;
    }

    public final int getPullType() {
        return this.pullType;
    }

    public final int hashCode() {
        String str = this.mixId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C11491a<MixInfo> aVar = this.mixInfo;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ListState<Aweme, C33567t> listState2 = this.listState;
        int hashCode3 = (hashCode2 + (listState2 != null ? listState2.hashCode() : 0)) * 31;
        Long l = this.enterEpisodeNum;
        if (l != null) {
            i = l.hashCode();
        }
        return ((hashCode3 + i) * 31) + Integer.hashCode(this.pullType);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixDetailState(mixId=");
        sb.append(this.mixId);
        sb.append(", mixInfo=");
        sb.append(this.mixInfo);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(", enterEpisodeNum=");
        sb.append(this.enterEpisodeNum);
        sb.append(", pullType=");
        sb.append(this.pullType);
        sb.append(")");
        return sb.toString();
    }

    public MixDetailState(String str, C11491a<? extends MixInfo> aVar, ListState<Aweme, C33567t> listState2, Long l, int i) {
        C7573i.m23587b(aVar, "mixInfo");
        C7573i.m23587b(listState2, "listState");
        this.mixId = str;
        this.mixInfo = aVar;
        this.listState = listState2;
        this.enterEpisodeNum = l;
        this.pullType = i;
    }

    public /* synthetic */ MixDetailState(String str, C11491a aVar, ListState listState2, Long l, int i, int i2, C7571f fVar) {
        String str2;
        C11491a aVar2;
        ListState listState3;
        int i3;
        Long l2 = null;
        if ((i2 & 1) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 2) != 0) {
            aVar2 = C11496ae.f31094a;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 4) != 0) {
            C33567t tVar = new C33567t(false, 0, 0, false, 15, null);
            listState3 = new ListState(tVar, null, null, null, null, 30, null);
        } else {
            listState3 = listState2;
        }
        if ((i2 & 8) == 0) {
            l2 = l;
        }
        if ((i2 & 16) != 0) {
            i3 = 2;
        } else {
            i3 = i;
        }
        this(str2, aVar2, listState3, l2, i3);
    }
}
