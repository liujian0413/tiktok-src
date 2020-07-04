package android.support.p022v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.view.AbsSavedState */
public abstract class AbsSavedState implements Parcelable {
    public static final Creator<AbsSavedState> CREATOR = new ClassLoaderCreator<AbsSavedState>() {
        /* renamed from: a */
        private static AbsSavedState[] m3878a(int i) {
            return new AbsSavedState[i];
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return m3877a(parcel, null);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m3878a(i);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m3877a(parcel, classLoader);
        }

        /* renamed from: a */
        private static AbsSavedState m3877a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f3170d;
            }
            throw new IllegalStateException("superState must be null");
        }
    };

    /* renamed from: d */
    public static final AbsSavedState f3170d = new AbsSavedState() {
    };

    /* renamed from: e */
    public final Parcelable f3171e;

    private AbsSavedState() {
    }

    public int describeContents() {
        return 0;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f3170d) {
                parcelable = null;
            }
            this.f3171e = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3171e, i);
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f3170d;
        }
        this.f3171e = readParcelable;
    }
}
