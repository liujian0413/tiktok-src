package com.bytedance.android.livesdk.feed.feed;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;

public class FeedDataKey implements Parcelable {
    public static final Creator<FeedDataKey> CREATOR = new Creator<FeedDataKey>() {
        /* renamed from: a */
        private static FeedDataKey[] m18727a(int i) {
            return new FeedDataKey[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m18726a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m18727a(i);
        }

        /* renamed from: a */
        private static FeedDataKey m18726a(Parcel parcel) {
            FeedDataKey feedDataKey = new FeedDataKey(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
            return feedDataKey;
        }
    };

    /* renamed from: d */
    private static final Integer f17729d = Integer.valueOf(1);

    /* renamed from: e */
    private static final Integer f17730e = Integer.valueOf(0);

    /* renamed from: f */
    private static final Integer f17731f = Integer.valueOf(31);

    /* renamed from: a */
    public String f17732a;

    /* renamed from: b */
    public String f17733b;

    /* renamed from: c */
    public long f17734c;

    /* renamed from: g */
    private int f17735g;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int intValue = f17731f.intValue();
        int i2 = 0;
        if (this.f17733b != null) {
            i = this.f17733b.hashCode();
        } else {
            i = 0;
        }
        int intValue2 = f17731f.intValue() * (intValue + i);
        if (this.f17732a != null) {
            i2 = this.f17732a.hashCode();
        }
        return (f17731f.intValue() * (intValue2 + i2)) + Long.valueOf(this.f17734c).hashCode();
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("label: ");
        if (this.f17733b == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str = this.f17733b;
        }
        sb.append(str);
        sb.append("; url: ");
        if (this.f17732a == null) {
            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str2 = this.f17732a;
        }
        sb.append(str2);
        sb.append("; id: ");
        sb.append(this.f17734c);
        sb.append("; repeatCheck: ");
        sb.append(this.f17735g);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FeedDataKey)) {
            return false;
        }
        FeedDataKey feedDataKey = (FeedDataKey) obj;
        if (!TextUtils.equals(this.f17733b, feedDataKey.f17733b) || !TextUtils.equals(this.f17732a, feedDataKey.f17732a) || this.f17734c != feedDataKey.f17734c) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17733b);
        parcel.writeString(this.f17732a);
        parcel.writeLong(this.f17734c);
        parcel.writeInt(this.f17735g);
    }

    /* renamed from: a */
    public static FeedDataKey m18724a(String str, String str2, long j) {
        return m18725a(str, str2, j, f17729d.intValue());
    }

    private FeedDataKey(String str, String str2, long j, int i) {
        this.f17732a = "";
        this.f17733b = "";
        this.f17734c = Long.MIN_VALUE;
        this.f17735g = f17729d.intValue();
        this.f17733b = str;
        this.f17732a = str2;
        this.f17734c = j;
        this.f17735g = i;
    }

    /* renamed from: a */
    private static FeedDataKey m18725a(String str, String str2, long j, int i) {
        if (!TextUtils.isEmpty(str)) {
            FeedDataKey feedDataKey = new FeedDataKey(str, str2, j, i);
            return feedDataKey;
        }
        throw new IllegalArgumentException("label must not be null or empty");
    }
}
