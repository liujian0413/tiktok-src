package android.support.p022v4.app;

import android.arch.lifecycle.C0070y;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.FragmentState */
final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new Creator<FragmentState>() {
        /* renamed from: a */
        private static FragmentState[] m2299a(int i) {
            return new FragmentState[i];
        }

        /* renamed from: a */
        private static FragmentState m2298a(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m2298a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m2299a(i);
        }
    };

    /* renamed from: a */
    final String f2170a;

    /* renamed from: b */
    final int f2171b;

    /* renamed from: c */
    final boolean f2172c;

    /* renamed from: d */
    final int f2173d;

    /* renamed from: e */
    final int f2174e;

    /* renamed from: f */
    final String f2175f;

    /* renamed from: g */
    final boolean f2176g;

    /* renamed from: h */
    final boolean f2177h;

    /* renamed from: i */
    final Bundle f2178i;

    /* renamed from: j */
    final boolean f2179j;

    /* renamed from: k */
    Bundle f2180k;

    /* renamed from: l */
    Fragment f2181l;

    public final int describeContents() {
        return 0;
    }

    FragmentState(Fragment fragment) {
        this.f2170a = fragment.getClass().getName();
        this.f2171b = fragment.mIndex;
        this.f2172c = fragment.mFromLayout;
        this.f2173d = fragment.mFragmentId;
        this.f2174e = fragment.mContainerId;
        this.f2175f = fragment.mTag;
        this.f2176g = fragment.mRetainInstance;
        this.f2177h = fragment.mDetached;
        this.f2178i = fragment.mArguments;
        this.f2179j = fragment.mHidden;
    }

    FragmentState(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f2170a = parcel.readString();
        this.f2171b = parcel.readInt();
        boolean z4 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2172c = z;
        this.f2173d = parcel.readInt();
        this.f2174e = parcel.readInt();
        this.f2175f = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f2176g = z2;
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f2177h = z3;
        this.f2178i = parcel.readBundle();
        if (parcel.readInt() != 0) {
            z4 = true;
        }
        this.f2179j = z4;
        this.f2180k = parcel.readBundle();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2170a);
        parcel.writeInt(this.f2171b);
        parcel.writeInt(this.f2172c ? 1 : 0);
        parcel.writeInt(this.f2173d);
        parcel.writeInt(this.f2174e);
        parcel.writeString(this.f2175f);
        parcel.writeInt(this.f2176g ? 1 : 0);
        parcel.writeInt(this.f2177h ? 1 : 0);
        parcel.writeBundle(this.f2178i);
        parcel.writeInt(this.f2179j ? 1 : 0);
        parcel.writeBundle(this.f2180k);
    }

    /* renamed from: a */
    public final Fragment mo2433a(FragmentHostCallback fragmentHostCallback, C0606h hVar, Fragment fragment, C0632p pVar, C0070y yVar) {
        if (this.f2181l == null) {
            Context context = fragmentHostCallback.f2159c;
            if (this.f2178i != null) {
                this.f2178i.setClassLoader(context.getClassLoader());
            }
            if (hVar != null) {
                this.f2181l = hVar.mo2350a(context, this.f2170a, this.f2178i);
            } else {
                this.f2181l = Fragment.instantiate(context, this.f2170a, this.f2178i);
            }
            if (this.f2180k != null) {
                this.f2180k.setClassLoader(context.getClassLoader());
                this.f2181l.mSavedFragmentState = this.f2180k;
            }
            this.f2181l.setIndex(this.f2171b, fragment);
            this.f2181l.mFromLayout = this.f2172c;
            this.f2181l.mRestored = true;
            this.f2181l.mFragmentId = this.f2173d;
            this.f2181l.mContainerId = this.f2174e;
            this.f2181l.mTag = this.f2175f;
            this.f2181l.mRetainInstance = this.f2176g;
            this.f2181l.mDetached = this.f2177h;
            this.f2181l.mHidden = this.f2179j;
            this.f2181l.mFragmentManager = fragmentHostCallback.f2161e;
        }
        this.f2181l.mChildNonConfig = pVar;
        this.f2181l.mViewModelStore = yVar;
        return this.f2181l;
    }
}
