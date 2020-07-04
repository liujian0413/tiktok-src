package com.bytedance.opensdk.core.grant.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C7573i;

public final class GrantInfo implements Parcelable {
    public static final Creator CREATOR = new C12325a();

    /* renamed from: a */
    public final String f32714a;

    /* renamed from: b */
    public final String f32715b;

    /* renamed from: c */
    public final int f32716c;

    /* renamed from: d */
    public final int f32717d;

    /* renamed from: com.bytedance.opensdk.core.grant.model.GrantInfo$a */
    public static class C12325a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "in");
            return new GrantInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new GrantInfo[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.f32714a);
        parcel.writeString(this.f32715b);
        parcel.writeInt(this.f32716c);
        parcel.writeInt(this.f32717d);
    }

    public GrantInfo(String str, String str2, int i, int i2) {
        C7573i.m23587b(str, "grantName");
        C7573i.m23587b(str2, "grantIcon");
        this.f32714a = str;
        this.f32715b = str2;
        this.f32716c = i;
        this.f32717d = i2;
    }
}
