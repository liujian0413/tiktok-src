package com.bytedance.ttnet.hostmonitor;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.C6600e;

public class HostStatus implements Parcelable {
    public static final Creator<HostStatus> CREATOR = new Creator<HostStatus>() {
        /* renamed from: a */
        private static HostStatus[] m37866a(int i) {
            return new HostStatus[i];
        }

        /* renamed from: a */
        private static HostStatus m37865a(Parcel parcel) {
            return new HostStatus(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m37865a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m37866a(i);
        }
    };

    /* renamed from: a */
    public String f34380a;

    /* renamed from: b */
    public int f34381b;

    /* renamed from: c */
    public boolean f34382c;

    /* renamed from: d */
    public boolean f34383d;

    /* renamed from: e */
    public ConnectionType f34384e;

    /* renamed from: f */
    public ConnectionType f34385f;

    public HostStatus() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return new C6600e().mo15979b((Object) this);
    }

    /* renamed from: a */
    public final boolean mo31511a() {
        if (this.f34384e != this.f34385f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final HostStatus mo31507a(int i) {
        this.f34381b = i;
        return this;
    }

    /* renamed from: b */
    public final HostStatus mo31512b(ConnectionType connectionType) {
        this.f34384e = connectionType;
        return this;
    }

    /* renamed from: a */
    public final HostStatus mo31508a(ConnectionType connectionType) {
        this.f34385f = connectionType;
        return this;
    }

    /* renamed from: b */
    public final HostStatus mo31513b(boolean z) {
        this.f34383d = z;
        return this;
    }

    /* renamed from: a */
    public final HostStatus mo31509a(String str) {
        this.f34380a = str;
        return this;
    }

    /* renamed from: a */
    public final HostStatus mo31510a(boolean z) {
        this.f34382c = z;
        return this;
    }

    private HostStatus(Parcel parcel) {
        boolean z;
        this.f34380a = parcel.readString();
        this.f34381b = parcel.readInt();
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f34382c = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        }
        this.f34383d = z2;
        this.f34385f = ConnectionType.values()[parcel.readInt()];
        this.f34384e = ConnectionType.values()[parcel.readInt()];
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34380a);
        parcel.writeInt(this.f34381b);
        parcel.writeInt(this.f34382c ? 1 : 0);
        parcel.writeInt(this.f34383d ? 1 : 0);
        parcel.writeInt(this.f34385f.ordinal());
        parcel.writeInt(this.f34384e.ordinal());
    }
}
