package com.bytedance.scene.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.p639a.C12565c;
import com.bytedance.scene.p642b.C12589f;

class Record implements Parcelable {
    public static final Creator<Record> CREATOR = new Creator<Record>() {
        /* renamed from: a */
        private static Record[] m36734a(int i) {
            return new Record[i];
        }

        /* renamed from: a */
        private static Record m36733a(Parcel parcel) {
            return new Record(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m36733a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m36734a(i);
        }
    };

    /* renamed from: a */
    C12629j f33566a;

    /* renamed from: b */
    boolean f33567b;

    /* renamed from: c */
    ActivityStatusRecord f33568c;

    /* renamed from: d */
    C12565c f33569d;

    /* renamed from: e */
    Object f33570e;

    /* renamed from: f */
    C12589f f33571f;

    /* renamed from: g */
    String f33572g;

    public Record() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final void mo31047a() {
        this.f33568c = ActivityStatusRecord.m36727a(this.f33566a.mo31015v());
    }

    protected Record(Parcel parcel) {
        boolean z;
        this.f33568c = (ActivityStatusRecord) parcel.readParcelable(ActivityStatusRecord.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f33567b = z;
        this.f33572g = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f33568c, i);
        parcel.writeByte(this.f33567b ? (byte) 1 : 0);
        parcel.writeString(this.f33572g);
    }

    /* renamed from: a */
    public static Record m36731a(C12629j jVar, boolean z, C12565c cVar) {
        Record record = new Record();
        record.f33566a = jVar;
        record.f33572g = jVar.getClass().getName();
        record.f33567b = z;
        record.f33569d = cVar;
        return record;
    }
}
