package android.support.p022v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.FragmentManagerState */
final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new Creator<FragmentManagerState>() {
        /* renamed from: a */
        private static FragmentManagerState[] m2293a(int i) {
            return new FragmentManagerState[i];
        }

        /* renamed from: a */
        private static FragmentManagerState m2292a(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m2292a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m2293a(i);
        }
    };

    /* renamed from: a */
    FragmentState[] f2162a;

    /* renamed from: b */
    int[] f2163b;

    /* renamed from: c */
    BackStackState[] f2164c;

    /* renamed from: d */
    int f2165d = -1;

    /* renamed from: e */
    int f2166e;

    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2162a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f2163b = parcel.createIntArray();
        this.f2164c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f2165d = parcel.readInt();
        this.f2166e = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f2162a, i);
        parcel.writeIntArray(this.f2163b);
        parcel.writeTypedArray(this.f2164c, i);
        parcel.writeInt(this.f2165d);
        parcel.writeInt(this.f2166e);
    }
}
