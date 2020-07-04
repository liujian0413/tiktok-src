package com.rocket.android.opensdkext;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VideoPlayUrlInfo implements Parcelable {
    public static final Creator<VideoPlayUrlInfo> CREATOR = new Creator<VideoPlayUrlInfo>() {
        /* renamed from: a */
        private static VideoPlayUrlInfo[] m61105a(int i) {
            return new VideoPlayUrlInfo[i];
        }

        /* renamed from: a */
        private static VideoPlayUrlInfo m61104a(Parcel parcel) {
            return new VideoPlayUrlInfo(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m61104a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m61105a(i);
        }
    };

    /* renamed from: a */
    public String f50333a;

    /* renamed from: b */
    public long f50334b;

    public int describeContents() {
        return 0;
    }

    public VideoPlayUrlInfo(Parcel parcel) {
        this.f50333a = parcel.readString();
        this.f50334b = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50333a);
        parcel.writeLong(this.f50334b);
    }
}
