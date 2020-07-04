package com.p280ss.android.ugc.aweme.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.NewUserCount */
public class NewUserCount extends BaseResponse implements Parcelable {
    public static final Creator<NewUserCount> CREATOR = new Creator<NewUserCount>() {
        public final NewUserCount[] newArray(int i) {
            return new NewUserCount[i];
        }

        public final NewUserCount createFromParcel(Parcel parcel) {
            return new NewUserCount(parcel);
        }
    };
    public int count;

    public NewUserCount() {
    }

    public int describeContents() {
        return 0;
    }

    protected NewUserCount(Parcel parcel) {
        this.count = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
    }
}
