package android.support.design.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p022v4.util.C0904k;
import android.support.p022v4.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState {
    public static final Creator<ExtendableSavedState> CREATOR = new ClassLoaderCreator<ExtendableSavedState>() {
        /* renamed from: a */
        private static ExtendableSavedState[] m1202a(int i) {
            return new ExtendableSavedState[i];
        }

        /* renamed from: a */
        private static ExtendableSavedState m1200a(Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1200a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m1202a(i);
        }

        /* renamed from: a */
        private static ExtendableSavedState m1201a(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m1201a(parcel, classLoader);
        }
    };

    /* renamed from: a */
    public final C0904k<String, Bundle> f1233a;

    public String toString() {
        StringBuilder sb = new StringBuilder("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.f1233a);
        sb.append("}");
        return sb.toString();
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f1233a = new C0904k<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f1233a = new C0904k<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f1233a.put(strArr[i], bundleArr[i]);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f1233a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.f1233a.mo3417b(i2);
            bundleArr[i2] = (Bundle) this.f1233a.mo3418c(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
