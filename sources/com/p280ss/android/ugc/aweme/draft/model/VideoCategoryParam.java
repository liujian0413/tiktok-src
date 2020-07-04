package com.p280ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.draft.model.VideoCategoryParam */
public final class VideoCategoryParam implements Parcelable, Serializable {
    public static final Creator CREATOR = new C27308a();
    @C6593c(mo15949a = "categoryIndex")
    private final int categoryIndex;
    @C6593c(mo15949a = "categoryName")
    private final String categoryName;

    /* renamed from: com.ss.android.ugc.aweme.draft.model.VideoCategoryParam$a */
    public static class C27308a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "in");
            return new VideoCategoryParam(parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new VideoCategoryParam[i];
        }
    }

    public VideoCategoryParam() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ VideoCategoryParam copy$default(VideoCategoryParam videoCategoryParam, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoCategoryParam.categoryName;
        }
        if ((i2 & 2) != 0) {
            i = videoCategoryParam.categoryIndex;
        }
        return videoCategoryParam.copy(str, i);
    }

    public final String component1() {
        return this.categoryName;
    }

    public final int component2() {
        return this.categoryIndex;
    }

    public final VideoCategoryParam copy(String str, int i) {
        return new VideoCategoryParam(str, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final int getCategoryIndex() {
        return this.categoryIndex;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCategoryParam(categoryName=");
        sb.append(this.categoryName);
        sb.append(", categoryIndex=");
        sb.append(this.categoryIndex);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.categoryName);
        parcel.writeInt(this.categoryIndex);
    }

    public final int hashCode() {
        String str = this.categoryName;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        String str = this.categoryName;
        String str2 = null;
        if (!(obj instanceof VideoCategoryParam)) {
            obj = null;
        }
        VideoCategoryParam videoCategoryParam = (VideoCategoryParam) obj;
        if (videoCategoryParam != null) {
            str2 = videoCategoryParam.categoryName;
        }
        return C7573i.m23585a((Object) str, (Object) str2);
    }

    public VideoCategoryParam(String str, int i) {
        this.categoryName = str;
        this.categoryIndex = i;
    }

    public /* synthetic */ VideoCategoryParam(String str, int i, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        this(str, i);
    }
}
