package android.support.p022v4.p027os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.os.d */
public final class C0882d {

    /* renamed from: android.support.v4.os.d$a */
    static class C0883a<T> implements ClassLoaderCreator<T> {

        /* renamed from: a */
        private final C0884e<T> f3105a;

        C0883a(C0884e<T> eVar) {
            this.f3105a = eVar;
        }

        public final T createFromParcel(Parcel parcel) {
            return this.f3105a.mo3286a(parcel, null);
        }

        public final T[] newArray(int i) {
            return this.f3105a.mo3287a(i);
        }

        public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f3105a.mo3286a(parcel, classLoader);
        }
    }

    /* renamed from: a */
    public static <T> Creator<T> m3749a(C0884e<T> eVar) {
        return new C0883a(eVar);
    }
}
