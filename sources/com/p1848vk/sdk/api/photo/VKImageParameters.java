package com.p1848vk.sdk.api.photo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.C47217c;

/* renamed from: com.vk.sdk.api.photo.VKImageParameters */
public class VKImageParameters extends C47217c implements Parcelable {
    public static final Creator<VKImageParameters> CREATOR = new Creator<VKImageParameters>() {
        /* renamed from: a */
        private static VKImageParameters[] m147661a(int i) {
            return new VKImageParameters[i];
        }

        /* renamed from: a */
        private static VKImageParameters m147660a(Parcel parcel) {
            return new VKImageParameters(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147660a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147661a(i);
        }
    };

    /* renamed from: a */
    public C47212a f121342a;

    /* renamed from: b */
    public float f121343b;

    /* renamed from: com.vk.sdk.api.photo.VKImageParameters$a */
    enum C47212a {
        Jpg,
        Png
    }

    public int describeContents() {
        return 0;
    }

    public VKImageParameters() {
        this.f121342a = C47212a.Png;
    }

    /* renamed from: c */
    public final String mo118673c() {
        switch (this.f121342a) {
            case Jpg:
                return "jpg";
            case Png:
                return "png";
            default:
                return "file";
        }
    }

    private VKImageParameters(Parcel parcel) {
        C47212a aVar;
        this.f121342a = C47212a.Png;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            aVar = null;
        } else {
            aVar = C47212a.values()[readInt];
        }
        this.f121342a = aVar;
        this.f121343b = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        if (this.f121342a == null) {
            i2 = -1;
        } else {
            i2 = this.f121342a.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeFloat(this.f121343b);
    }
}
