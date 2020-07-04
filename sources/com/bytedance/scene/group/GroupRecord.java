package com.bytedance.scene.group;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.utlity.C12700j;

class GroupRecord implements Parcelable {
    public static final Creator<GroupRecord> CREATOR = new Creator<GroupRecord>() {
        /* renamed from: a */
        private static GroupRecord[] m36523a(int i) {
            return new GroupRecord[i];
        }

        /* renamed from: a */
        private static GroupRecord m36522a(Parcel parcel) {
            return new GroupRecord(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m36522a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m36523a(i);
        }
    };

    /* renamed from: a */
    int f33436a = -1;

    /* renamed from: b */
    C12629j f33437b;

    /* renamed from: c */
    String f33438c;

    /* renamed from: d */
    public boolean f33439d;

    /* renamed from: e */
    boolean f33440e;

    /* renamed from: f */
    String f33441f;

    /* renamed from: g */
    Bundle f33442g;

    public int describeContents() {
        return 0;
    }

    public GroupRecord() {
    }

    protected GroupRecord(Parcel parcel) {
        boolean z;
        this.f33436a = parcel.readInt();
        this.f33438c = (String) C12700j.m36907a(parcel.readString(), "tag not found in Parcel");
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f33439d = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f33440e = z2;
        this.f33441f = (String) C12700j.m36907a(parcel.readString(), "class name not found in Parcel");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33436a);
        parcel.writeString(this.f33438c);
        parcel.writeByte(this.f33439d ? (byte) 1 : 0);
        parcel.writeByte(this.f33440e ? (byte) 1 : 0);
        parcel.writeString(this.f33441f);
    }

    /* renamed from: a */
    static GroupRecord m36521a(int i, C12629j jVar, String str) {
        GroupRecord groupRecord = new GroupRecord();
        groupRecord.f33436a = i;
        groupRecord.f33437b = (C12629j) C12700j.m36907a(jVar, "scene can't be null");
        groupRecord.f33438c = (String) C12700j.m36907a(str, "tag can't be null");
        groupRecord.f33441f = (String) C12700j.m36907a(jVar.getClass().getName(), "Scene class name is null");
        return groupRecord;
    }
}
