package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems */
public final class NoticeItems {
    @C6593c(mo15949a = "has_more")
    private boolean hasMore;
    @C6593c(mo15949a = "notice_list")
    private List<? extends MusNotice> items;
    @C6593c(mo15949a = "last_read_time")
    private final long lastReadTime;
    @C6593c(mo15949a = "max_time")
    private final long maxTime;
    @C6593c(mo15949a = "min_time")
    private final long minTime;
    @C6593c(mo15949a = "total")
    private final int total;

    public NoticeItems() {
        this(null, false, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ NoticeItems copy$default(NoticeItems noticeItems, List list, boolean z, int i, long j, long j2, long j3, int i2, Object obj) {
        NoticeItems noticeItems2 = noticeItems;
        return noticeItems.copy((i2 & 1) != 0 ? noticeItems2.items : list, (i2 & 2) != 0 ? noticeItems2.hasMore : z, (i2 & 4) != 0 ? noticeItems2.total : i, (i2 & 8) != 0 ? noticeItems2.maxTime : j, (i2 & 16) != 0 ? noticeItems2.minTime : j2, (i2 & 32) != 0 ? noticeItems2.lastReadTime : j3);
    }

    public final List<MusNotice> component1() {
        return this.items;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final int component3() {
        return this.total;
    }

    public final long component4() {
        return this.maxTime;
    }

    public final long component5() {
        return this.minTime;
    }

    public final long component6() {
        return this.lastReadTime;
    }

    public final NoticeItems copy(List<? extends MusNotice> list, boolean z, int i, long j, long j2, long j3) {
        NoticeItems noticeItems = new NoticeItems(list, z, i, j, j2, j3);
        return noticeItems;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoticeItems) {
                NoticeItems noticeItems = (NoticeItems) obj;
                if (C7573i.m23585a((Object) this.items, (Object) noticeItems.items)) {
                    if (this.hasMore == noticeItems.hasMore) {
                        if (this.total == noticeItems.total) {
                            if (this.maxTime == noticeItems.maxTime) {
                                if (this.minTime == noticeItems.minTime) {
                                    if (this.lastReadTime == noticeItems.lastReadTime) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<MusNotice> getItems() {
        return this.items;
    }

    public final long getLastReadTime() {
        return this.lastReadTime;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final long getMinTime() {
        return this.minTime;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int hashCode() {
        List<? extends MusNotice> list = this.items;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i = (((hashCode + (z ? 1 : 0)) * 31) + this.total) * 31;
        long j = this.maxTime;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.minTime;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.lastReadTime;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoticeItems(items=");
        sb.append(this.items);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", maxTime=");
        sb.append(this.maxTime);
        sb.append(", minTime=");
        sb.append(this.minTime);
        sb.append(", lastReadTime=");
        sb.append(this.lastReadTime);
        sb.append(")");
        return sb.toString();
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setItems(List<? extends MusNotice> list) {
        this.items = list;
    }

    public NoticeItems(List<? extends MusNotice> list, boolean z, int i, long j, long j2, long j3) {
        this.items = list;
        this.hasMore = z;
        this.total = i;
        this.maxTime = j;
        this.minTime = j2;
        this.lastReadTime = j3;
    }

    public /* synthetic */ NoticeItems(List list, boolean z, int i, long j, long j2, long j3, int i2, C7571f fVar) {
        List list2;
        boolean z2;
        long j4;
        long j5;
        if ((i2 & 1) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        int i3 = 0;
        if ((i2 & 2) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 4) == 0) {
            i3 = i;
        }
        long j6 = 0;
        if ((i2 & 8) != 0) {
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i2 & 16) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i2 & 32) == 0) {
            j6 = j3;
        }
        this(list2, z2, i3, j4, j5, j6);
    }
}
