package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NewStickerItemList */
public final class NewStickerItemList extends BaseResponse {
    @C6593c(mo15949a = "cursor")
    public long cursor;
    @C6593c(mo15949a = "has_more")
    public int hasMore;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    @C6593c(mo15949a = "effect")
    public List<NewFaceSticker> stickers;

    public NewStickerItemList() {
        this(0, 0, null, null, 15, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.NewFaceSticker>, for r10v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.feed.model.NewStickerItemList copy$default(com.p280ss.android.ugc.aweme.feed.model.NewStickerItemList r6, long r7, int r9, java.util.List<com.p280ss.android.ugc.aweme.feed.model.NewFaceSticker> r10, com.p280ss.android.ugc.aweme.feed.model.LogPbBean r11, int r12, java.lang.Object r13) {
        /*
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0006
            long r7 = r6.cursor
        L_0x0006:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto L_0x000d
            int r9 = r6.hasMore
        L_0x000d:
            r3 = r9
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0014
            java.util.List<com.ss.android.ugc.aweme.feed.model.NewFaceSticker> r10 = r6.stickers
        L_0x0014:
            r4 = r10
            r7 = r12 & 8
            if (r7 == 0) goto L_0x001b
            com.ss.android.ugc.aweme.feed.model.LogPbBean r11 = r6.logPb
        L_0x001b:
            r5 = r11
            r0 = r6
            com.ss.android.ugc.aweme.feed.model.NewStickerItemList r6 = r0.copy(r1, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.model.NewStickerItemList.copy$default(com.ss.android.ugc.aweme.feed.model.NewStickerItemList, long, int, java.util.List, com.ss.android.ugc.aweme.feed.model.LogPbBean, int, java.lang.Object):com.ss.android.ugc.aweme.feed.model.NewStickerItemList");
    }

    public final NewStickerItemList copy(long j, int i, List<NewFaceSticker> list, LogPbBean logPbBean) {
        NewStickerItemList newStickerItemList = new NewStickerItemList(j, i, list, logPbBean);
        return newStickerItemList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NewStickerItemList) {
                NewStickerItemList newStickerItemList = (NewStickerItemList) obj;
                if (this.cursor == newStickerItemList.cursor) {
                    if (!(this.hasMore == newStickerItemList.hasMore) || !C7573i.m23585a((Object) this.stickers, (Object) newStickerItemList.stickers) || !C7573i.m23585a((Object) this.logPb, (Object) newStickerItemList.logPb)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.cursor;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.hasMore) * 31;
        List<NewFaceSticker> list = this.stickers;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewStickerItemList(cursor=");
        sb.append(this.cursor);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(")");
        return sb.toString();
    }

    public NewStickerItemList(long j, int i, List<NewFaceSticker> list, LogPbBean logPbBean) {
        this.cursor = j;
        this.hasMore = i;
        this.stickers = list;
        this.logPb = logPbBean;
    }

    public /* synthetic */ NewStickerItemList(long j, int i, List list, LogPbBean logPbBean, int i2, C7571f fVar) {
        int i3;
        List list2;
        LogPbBean logPbBean2;
        if ((i2 & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i2 & 8) != 0) {
            logPbBean2 = null;
        } else {
            logPbBean2 = logPbBean;
        }
        this(j2, i3, list2, logPbBean2);
    }
}
