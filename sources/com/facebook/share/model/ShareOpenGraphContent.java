package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphAction.C14574a;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Creator<ShareOpenGraphContent> CREATOR = new Creator<ShareOpenGraphContent>() {
        /* renamed from: a */
        private static ShareOpenGraphContent[] m42140a(int i) {
            return new ShareOpenGraphContent[i];
        }

        /* renamed from: a */
        private static ShareOpenGraphContent m42139a(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42139a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42140a(i);
        }
    };

    /* renamed from: a */
    public final ShareOpenGraphAction f37639a;

    /* renamed from: b */
    public final String f37640b;

    public final int describeContents() {
        return 0;
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f37639a = new C14574a().mo36782a(parcel).mo36783a();
        this.f37640b = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f37639a, 0);
        parcel.writeString(this.f37640b);
    }
}
