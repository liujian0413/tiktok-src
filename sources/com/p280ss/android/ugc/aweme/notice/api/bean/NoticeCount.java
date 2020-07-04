package com.p280ss.android.ugc.aweme.notice.api.bean;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.NoticeCount */
public final class NoticeCount {
    @C6593c(mo15949a = "count")
    private int count;
    @C6593c(mo15949a = "extra")
    private C34311d extra;
    @C6593c(mo15949a = "group")
    private int group;

    public static /* synthetic */ NoticeCount copy$default(NoticeCount noticeCount, int i, int i2, C34311d dVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = noticeCount.count;
        }
        if ((i3 & 2) != 0) {
            i2 = noticeCount.group;
        }
        if ((i3 & 4) != 0) {
            dVar = noticeCount.extra;
        }
        return noticeCount.copy(i, i2, dVar);
    }

    public final int component1() {
        return this.count;
    }

    public final int component2() {
        return this.group;
    }

    public final C34311d component3() {
        return this.extra;
    }

    public final NoticeCount copy(int i, int i2, C34311d dVar) {
        return new NoticeCount(i, i2, dVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoticeCount) {
                NoticeCount noticeCount = (NoticeCount) obj;
                if (this.count == noticeCount.count) {
                    if (!(this.group == noticeCount.group) || !C7573i.m23585a((Object) this.extra, (Object) noticeCount.extra)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCount() {
        return this.count;
    }

    public final C34311d getExtra() {
        return this.extra;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int hashCode() {
        int i = ((this.count * 31) + this.group) * 31;
        C34311d dVar = this.extra;
        return i + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoticeCount(count=");
        sb.append(this.count);
        sb.append(", group=");
        sb.append(this.group);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(")");
        return sb.toString();
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setExtra(C34311d dVar) {
        this.extra = dVar;
    }

    public final void setGroup(int i) {
        this.group = i;
    }

    public NoticeCount(int i, int i2, C34311d dVar) {
        this.count = i;
        this.group = i2;
        this.extra = dVar;
    }
}
