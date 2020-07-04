package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public static final Creator<ShareMediaContent> CREATOR = new Creator<ShareMediaContent>() {
        /* renamed from: a */
        private static ShareMediaContent[] m42120a(int i) {
            return new ShareMediaContent[i];
        }

        /* renamed from: a */
        private static ShareMediaContent m42119a(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42119a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42120a(i);
        }
    };

    /* renamed from: a */
    public final List<ShareMedia> f37618a;

    public final int describeContents() {
        return 0;
    }

    ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.f37618a = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.f37618a.toArray(), i);
    }
}
