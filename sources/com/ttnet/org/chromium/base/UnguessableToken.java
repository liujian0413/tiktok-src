package com.ttnet.org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class UnguessableToken implements Parcelable {
    public static final Creator<UnguessableToken> CREATOR = new Creator<UnguessableToken>() {
        public UnguessableToken[] newArray(int i) {
            return new UnguessableToken[i];
        }

        public UnguessableToken createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            UnguessableToken unguessableToken = new UnguessableToken(readLong, readLong2);
            return unguessableToken;
        }
    };
    private final long mHigh;
    private final long mLow;

    public int describeContents() {
        return 0;
    }

    public long getHighForSerialization() {
        return this.mHigh;
    }

    public long getLowForSerialization() {
        return this.mLow;
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken unguessableToken = (UnguessableToken) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return unguessableToken;
    }

    private UnguessableToken(long j, long j2) {
        this.mHigh = j;
        this.mLow = j2;
    }

    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mHigh);
        parcel.writeLong(this.mLow);
    }
}
