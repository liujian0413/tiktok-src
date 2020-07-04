package com.p280ss.android.ugc.aweme.discover.adapter;

import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ClusterButtonData */
public final class ClusterButtonData extends SearchMusic {
    private final List<Music> clusterList;
    private boolean isMobShowSent;

    public ClusterButtonData() {
        this(false, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.music.model.Music>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.adapter.ClusterButtonData copy$default(com.p280ss.android.ugc.aweme.discover.adapter.ClusterButtonData r0, boolean r1, java.util.List<com.p280ss.android.ugc.aweme.music.model.Music> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            boolean r1 = r0.isMobShowSent
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r2 = r0.clusterList
        L_0x000c:
            com.ss.android.ugc.aweme.discover.adapter.ClusterButtonData r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.ClusterButtonData.copy$default(com.ss.android.ugc.aweme.discover.adapter.ClusterButtonData, boolean, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.discover.adapter.ClusterButtonData");
    }

    public final boolean component1() {
        return this.isMobShowSent;
    }

    public final List<Music> component2() {
        return this.clusterList;
    }

    public final ClusterButtonData copy(boolean z, List<Music> list) {
        C7573i.m23587b(list, "clusterList");
        return new ClusterButtonData(z, list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClusterButtonData) {
                ClusterButtonData clusterButtonData = (ClusterButtonData) obj;
                if (!(this.isMobShowSent == clusterButtonData.isMobShowSent) || !C7573i.m23585a((Object) this.clusterList, (Object) clusterButtonData.clusterList)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List<Music> getClusterList() {
        return this.clusterList;
    }

    public final int hashCode() {
        boolean z = this.isMobShowSent;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<Music> list = this.clusterList;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final boolean isMobShowSent() {
        return this.isMobShowSent;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClusterButtonData(isMobShowSent=");
        sb.append(this.isMobShowSent);
        sb.append(", clusterList=");
        sb.append(this.clusterList);
        sb.append(")");
        return sb.toString();
    }

    public final void setMobShowSent(boolean z) {
        this.isMobShowSent = z;
    }

    public ClusterButtonData(boolean z, List<Music> list) {
        C7573i.m23587b(list, "clusterList");
        this.isMobShowSent = z;
        this.clusterList = list;
    }

    public /* synthetic */ ClusterButtonData(boolean z, List list, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            list = new ArrayList();
        }
        this(z, list);
    }
}
