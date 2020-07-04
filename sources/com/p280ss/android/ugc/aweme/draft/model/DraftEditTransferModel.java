package com.p280ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel */
public final class DraftEditTransferModel implements Parcelable, Serializable {
    public static final Creator CREATOR = new C27306a();
    private final String primaryKey;
    private final List<EditVideoSegment> videoSegmentsCopy;

    /* renamed from: com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel$a */
    public static class C27306a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C7573i.m23587b(parcel, "in");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((EditVideoSegment) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader()));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new DraftEditTransferModel(readString, arrayList);
        }

        public final Object[] newArray(int i) {
            return new DraftEditTransferModel[i];
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel copy$default(com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel r0, java.lang.String r1, java.util.List<com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.lang.String r1 = r0.primaryKey
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r2 = r0.videoSegmentsCopy
        L_0x000c:
            com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel.copy$default(com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel, java.lang.String, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel");
    }

    public final String component1() {
        return this.primaryKey;
    }

    public final List<EditVideoSegment> component2() {
        return this.videoSegmentsCopy;
    }

    public final DraftEditTransferModel copy(String str, List<? extends EditVideoSegment> list) {
        return new DraftEditTransferModel(str, list);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.videoSegmentsCopy, (java.lang.Object) r3.videoSegmentsCopy) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel r3 = (com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel) r3
            java.lang.String r0 = r2.primaryKey
            java.lang.String r1 = r3.primaryKey
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r0 = r2.videoSegmentsCopy
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r3 = r3.videoSegmentsCopy
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel.equals(java.lang.Object):boolean");
    }

    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final List<EditVideoSegment> getVideoSegmentsCopy() {
        return this.videoSegmentsCopy;
    }

    public final int hashCode() {
        String str = this.primaryKey;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<EditVideoSegment> list = this.videoSegmentsCopy;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftEditTransferModel(primaryKey=");
        sb.append(this.primaryKey);
        sb.append(", videoSegmentsCopy=");
        sb.append(this.videoSegmentsCopy);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.primaryKey);
        List<EditVideoSegment> list = this.videoSegmentsCopy;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (EditVideoSegment writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public DraftEditTransferModel(String str, List<? extends EditVideoSegment> list) {
        this.primaryKey = str;
        this.videoSegmentsCopy = list;
    }

    public /* synthetic */ DraftEditTransferModel(String str, List list, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            list = null;
        }
        this(str, list);
    }
}
