package com.tencent.wcdb;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BulkCursorDescriptor implements Parcelable {
    public static final Creator<BulkCursorDescriptor> CREATOR = new Creator<BulkCursorDescriptor>() {
        /* renamed from: a */
        private static BulkCursorDescriptor[] m145723a(int i) {
            return new BulkCursorDescriptor[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m145722a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m145723a(i);
        }

        /* renamed from: a */
        private static BulkCursorDescriptor m145722a(Parcel parcel) {
            BulkCursorDescriptor bulkCursorDescriptor = new BulkCursorDescriptor();
            bulkCursorDescriptor.mo115338a(parcel);
            return bulkCursorDescriptor;
        }
    };

    /* renamed from: a */
    public C46436j f119433a;

    /* renamed from: b */
    public String[] f119434b;

    /* renamed from: c */
    public boolean f119435c;

    /* renamed from: d */
    public int f119436d;

    /* renamed from: e */
    public CursorWindow f119437e;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: b */
    private static String[] m145720b(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = parcel.readString();
        }
        return strArr;
    }

    /* renamed from: a */
    public final void mo115338a(Parcel parcel) {
        boolean z;
        this.f119433a = C46400c.m145752a(parcel.readStrongBinder());
        this.f119434b = m145720b(parcel);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f119435c = z;
        this.f119436d = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.f119437e = (CursorWindow) CursorWindow.CREATOR.createFromParcel(parcel);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f119433a.asBinder());
        parcel.writeStringArray(this.f119434b);
        parcel.writeInt(this.f119435c ? 1 : 0);
        parcel.writeInt(this.f119436d);
        if (this.f119437e != null) {
            parcel.writeInt(1);
            this.f119437e.writeToParcel(parcel, i);
            return;
        }
        parcel.writeInt(0);
    }
}
