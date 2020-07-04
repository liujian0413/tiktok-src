package com.etsy.android.grid;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class ClassLoaderSavedState implements Parcelable {
    public static final Creator<ClassLoaderSavedState> CREATOR = new Creator<ClassLoaderSavedState>() {
        /* renamed from: a */
        private static ClassLoaderSavedState[] m38079a(int i) {
            return new ClassLoaderSavedState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m38078a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m38079a(i);
        }

        /* renamed from: a */
        private static ClassLoaderSavedState m38078a(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return ClassLoaderSavedState.f34504a;
            }
            throw new IllegalStateException("superState must be null");
        }
    };

    /* renamed from: a */
    public static final ClassLoaderSavedState f34504a = new ClassLoaderSavedState() {
    };

    /* renamed from: b */
    public Parcelable f34505b;

    /* renamed from: c */
    private ClassLoader f34506c;

    public int describeContents() {
        return 0;
    }

    private ClassLoaderSavedState() {
        this.f34505b = f34504a;
        this.f34505b = null;
    }

    protected ClassLoaderSavedState(Parcel parcel) {
        this.f34505b = f34504a;
        Parcelable readParcelable = parcel.readParcelable(this.f34506c);
        if (readParcelable == null) {
            readParcelable = f34504a;
        }
        this.f34505b = readParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f34505b, i);
    }

    protected ClassLoaderSavedState(Parcelable parcelable, ClassLoader classLoader) {
        this.f34505b = f34504a;
        this.f34506c = classLoader;
        if (parcelable != null) {
            if (parcelable == f34504a) {
                parcelable = null;
            }
            this.f34505b = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
}
