package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new Creator<ParcelImpl>() {
        /* renamed from: a */
        private static ParcelImpl[] m7248a(int i) {
            return new ParcelImpl[i];
        }

        /* renamed from: a */
        private static ParcelImpl m7247a(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7247a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m7248a(i);
        }
    };

    /* renamed from: a */
    public final C1447b f5612a;

    public int describeContents() {
        return 0;
    }

    protected ParcelImpl(Parcel parcel) {
        this.f5612a = new C1446a(parcel).mo6663g();
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1446a(parcel).mo6645a(this.f5612a);
    }
}
