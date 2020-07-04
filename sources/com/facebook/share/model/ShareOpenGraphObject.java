package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Object> {
    public static final Creator<ShareOpenGraphObject> CREATOR = new Creator<ShareOpenGraphObject>() {
        /* renamed from: a */
        private static ShareOpenGraphObject[] m42142a(int i) {
            return new ShareOpenGraphObject[i];
        }

        /* renamed from: a */
        private static ShareOpenGraphObject m42141a(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42141a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42142a(i);
        }
    };

    ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
