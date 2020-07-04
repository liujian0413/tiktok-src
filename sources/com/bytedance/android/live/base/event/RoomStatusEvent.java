package com.bytedance.android.live.base.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class RoomStatusEvent implements Parcelable {
    public static final Creator<RoomStatusEvent> CREATOR = new Creator<RoomStatusEvent>() {
        /* renamed from: a */
        private static RoomStatusEvent[] m9951a(int i) {
            return new RoomStatusEvent[i];
        }

        /* renamed from: a */
        private static RoomStatusEvent m9950a(Parcel parcel) {
            return new RoomStatusEvent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m9950a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m9951a(i);
        }
    };

    /* renamed from: a */
    public long f7644a;

    /* renamed from: b */
    public long f7645b;

    /* renamed from: c */
    public boolean f7646c;

    /* renamed from: d */
    public int f7647d;

    public RoomStatusEvent() {
    }

    public int describeContents() {
        return 0;
    }

    protected RoomStatusEvent(Parcel parcel) {
        boolean z;
        this.f7644a = parcel.readLong();
        this.f7645b = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f7646c = z;
        this.f7647d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7644a);
        parcel.writeLong(this.f7645b);
        parcel.writeByte(this.f7646c ? (byte) 1 : 0);
        parcel.writeInt(this.f7647d);
    }
}
