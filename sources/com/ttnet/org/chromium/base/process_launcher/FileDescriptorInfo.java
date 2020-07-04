package com.ttnet.org.chromium.base.process_launcher;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class FileDescriptorInfo implements Parcelable {
    public static final Creator<FileDescriptorInfo> CREATOR = new Creator<FileDescriptorInfo>() {
        public FileDescriptorInfo[] newArray(int i) {
            return new FileDescriptorInfo[i];
        }

        public FileDescriptorInfo createFromParcel(Parcel parcel) {
            return new FileDescriptorInfo(parcel);
        }
    };

    /* renamed from: fd */
    public final ParcelFileDescriptor f120073fd;

    /* renamed from: id */
    public final int f120074id;
    public final long offset;
    public final long size;

    public final int describeContents() {
        return 1;
    }

    FileDescriptorInfo(Parcel parcel) {
        this.f120074id = parcel.readInt();
        this.f120073fd = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
        this.offset = parcel.readLong();
        this.size = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f120074id);
        parcel.writeParcelable(this.f120073fd, 1);
        parcel.writeLong(this.offset);
        parcel.writeLong(this.size);
    }

    public FileDescriptorInfo(int i, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) {
        this.f120074id = i;
        this.f120073fd = parcelFileDescriptor;
        this.offset = j;
        this.size = j2;
    }
}
