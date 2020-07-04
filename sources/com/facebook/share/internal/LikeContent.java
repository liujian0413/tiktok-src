package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareModel;

public class LikeContent implements ShareModel {
    public static final Creator<LikeContent> CREATOR = new Creator<LikeContent>() {
        /* renamed from: a */
        private static LikeContent[] m41823a(int i) {
            return new LikeContent[i];
        }

        /* renamed from: a */
        private static LikeContent m41822a(Parcel parcel) {
            return new LikeContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41822a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m41823a(i);
        }
    };

    /* renamed from: a */
    public final String f37454a;

    /* renamed from: b */
    public final String f37455b;

    public int describeContents() {
        return 0;
    }

    LikeContent(Parcel parcel) {
        this.f37454a = parcel.readString();
        this.f37455b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37454a);
        parcel.writeString(this.f37455b);
    }
}
