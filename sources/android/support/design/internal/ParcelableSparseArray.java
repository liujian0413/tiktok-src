package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Creator<ParcelableSparseArray> CREATOR = new ClassLoaderCreator<ParcelableSparseArray>() {
        /* renamed from: a */
        private static ParcelableSparseArray[] m1161a(int i) {
            return new ParcelableSparseArray[i];
        }

        /* renamed from: a */
        private static ParcelableSparseArray m1159a(Parcel parcel) {
            return new ParcelableSparseArray(parcel, null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1159a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m1161a(i);
        }

        /* renamed from: a */
        private static ParcelableSparseArray m1160a(Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m1160a(parcel, classLoader);
        }
    };

    public ParcelableSparseArray() {
    }

    public int describeContents() {
        return 0;
    }

    public ParcelableSparseArray(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
