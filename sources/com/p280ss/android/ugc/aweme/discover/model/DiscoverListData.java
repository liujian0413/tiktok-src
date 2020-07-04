package com.p280ss.android.ugc.aweme.discover.model;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverListData */
public final class DiscoverListData implements Serializable {
    private int cursor;
    private boolean hasMore;
    private boolean isCache;
    private List<DiscoverItemData> itemList;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverItemData>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.model.DiscoverListData copy$default(com.p280ss.android.ugc.aweme.discover.model.DiscoverListData r0, java.util.List<com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData> r1, int r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverItemData> r1 = r0.itemList
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            int r2 = r0.cursor
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            boolean r3 = r0.hasMore
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            boolean r4 = r0.isCache
        L_0x0018:
            com.ss.android.ugc.aweme.discover.model.DiscoverListData r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.DiscoverListData.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoverListData, java.util.List, int, boolean, boolean, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoverListData");
    }

    public final List<DiscoverItemData> component1() {
        return this.itemList;
    }

    public final int component2() {
        return this.cursor;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final boolean component4() {
        return this.isCache;
    }

    public final DiscoverListData copy(List<DiscoverItemData> list, int i, boolean z, boolean z2) {
        C7573i.m23587b(list, "itemList");
        return new DiscoverListData(list, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverListData) {
                DiscoverListData discoverListData = (DiscoverListData) obj;
                if (C7573i.m23585a((Object) this.itemList, (Object) discoverListData.itemList)) {
                    if (this.cursor == discoverListData.cursor) {
                        if (this.hasMore == discoverListData.hasMore) {
                            if (this.isCache == discoverListData.isCache) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<DiscoverItemData> getItemList() {
        return this.itemList;
    }

    public final int hashCode() {
        List<DiscoverItemData> list = this.itemList;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + Integer.hashCode(this.cursor)) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.isCache;
        if (z2) {
            z2 = true;
        }
        return i + (z2 ? 1 : 0);
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverListData(itemList=");
        sb.append(this.itemList);
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", isCache=");
        sb.append(this.isCache);
        sb.append(")");
        return sb.toString();
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setItemList(List<DiscoverItemData> list) {
        C7573i.m23587b(list, "<set-?>");
        this.itemList = list;
    }

    public DiscoverListData(List<DiscoverItemData> list, int i, boolean z, boolean z2) {
        C7573i.m23587b(list, "itemList");
        this.itemList = list;
        this.cursor = i;
        this.hasMore = z;
        this.isCache = z2;
    }

    public /* synthetic */ DiscoverListData(List list, int i, boolean z, boolean z2, int i2, C7571f fVar) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        this(list, i, z, z2);
    }
}
