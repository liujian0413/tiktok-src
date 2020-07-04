package android.support.p022v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackState */
final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new Creator<BackStackState>() {
        /* renamed from: a */
        private static BackStackState[] m2253a(int i) {
            return new BackStackState[i];
        }

        /* renamed from: a */
        private static BackStackState m2252a(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m2252a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m2253a(i);
        }
    };

    /* renamed from: a */
    final int[] f2117a;

    /* renamed from: b */
    final int f2118b;

    /* renamed from: c */
    final int f2119c;

    /* renamed from: d */
    final String f2120d;

    /* renamed from: e */
    final int f2121e;

    /* renamed from: f */
    final int f2122f;

    /* renamed from: g */
    final CharSequence f2123g;

    /* renamed from: h */
    final int f2124h;

    /* renamed from: i */
    final CharSequence f2125i;

    /* renamed from: j */
    final ArrayList<String> f2126j;

    /* renamed from: k */
    final ArrayList<String> f2127k;

    /* renamed from: l */
    final boolean f2128l;

    public final int describeContents() {
        return 0;
    }

    public BackStackState(Parcel parcel) {
        boolean z;
        this.f2117a = parcel.createIntArray();
        this.f2118b = parcel.readInt();
        this.f2119c = parcel.readInt();
        this.f2120d = parcel.readString();
        this.f2121e = parcel.readInt();
        this.f2122f = parcel.readInt();
        this.f2123g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2124h = parcel.readInt();
        this.f2125i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2126j = parcel.createStringArrayList();
        this.f2127k = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2128l = z;
    }

    public BackStackState(C0601e eVar) {
        int i;
        int size = eVar.f2360b.size();
        this.f2117a = new int[(size * 6)];
        if (eVar.f2367i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                C0602a aVar = (C0602a) eVar.f2360b.get(i2);
                int i4 = i3 + 1;
                this.f2117a[i3] = aVar.f2380a;
                int[] iArr = this.f2117a;
                int i5 = i4 + 1;
                if (aVar.f2381b != null) {
                    i = aVar.f2381b.mIndex;
                } else {
                    i = -1;
                }
                iArr[i4] = i;
                int i6 = i5 + 1;
                this.f2117a[i5] = aVar.f2382c;
                int i7 = i6 + 1;
                this.f2117a[i6] = aVar.f2383d;
                int i8 = i7 + 1;
                this.f2117a[i7] = aVar.f2384e;
                int i9 = i8 + 1;
                this.f2117a[i8] = aVar.f2385f;
                i2++;
                i3 = i9;
            }
            this.f2118b = eVar.f2365g;
            this.f2119c = eVar.f2366h;
            this.f2120d = eVar.f2369k;
            this.f2121e = eVar.f2371m;
            this.f2122f = eVar.f2372n;
            this.f2123g = eVar.f2373o;
            this.f2124h = eVar.f2374p;
            this.f2125i = eVar.f2375q;
            this.f2126j = eVar.f2376r;
            this.f2127k = eVar.f2377s;
            this.f2128l = eVar.f2378t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public final C0601e mo2186a(C0612l lVar) {
        C0601e eVar = new C0601e(lVar);
        int i = 0;
        while (i < this.f2117a.length) {
            C0602a aVar = new C0602a();
            int i2 = i + 1;
            aVar.f2380a = this.f2117a[i];
            int i3 = i2 + 1;
            int i4 = this.f2117a[i2];
            if (i4 >= 0) {
                aVar.f2381b = (Fragment) lVar.f2407f.get(i4);
            } else {
                aVar.f2381b = null;
            }
            int i5 = i3 + 1;
            aVar.f2382c = this.f2117a[i3];
            int i6 = i5 + 1;
            aVar.f2383d = this.f2117a[i5];
            int i7 = i6 + 1;
            aVar.f2384e = this.f2117a[i6];
            int i8 = i7 + 1;
            aVar.f2385f = this.f2117a[i7];
            eVar.f2361c = aVar.f2382c;
            eVar.f2362d = aVar.f2383d;
            eVar.f2363e = aVar.f2384e;
            eVar.f2364f = aVar.f2385f;
            eVar.mo2592a(aVar);
            i = i8;
        }
        eVar.f2365g = this.f2118b;
        eVar.f2366h = this.f2119c;
        eVar.f2369k = this.f2120d;
        eVar.f2371m = this.f2121e;
        eVar.f2367i = true;
        eVar.f2372n = this.f2122f;
        eVar.f2373o = this.f2123g;
        eVar.f2374p = this.f2124h;
        eVar.f2375q = this.f2125i;
        eVar.f2376r = this.f2126j;
        eVar.f2377s = this.f2127k;
        eVar.f2378t = this.f2128l;
        eVar.mo2590a(1);
        return eVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2117a);
        parcel.writeInt(this.f2118b);
        parcel.writeInt(this.f2119c);
        parcel.writeString(this.f2120d);
        parcel.writeInt(this.f2121e);
        parcel.writeInt(this.f2122f);
        TextUtils.writeToParcel(this.f2123g, parcel, 0);
        parcel.writeInt(this.f2124h);
        TextUtils.writeToParcel(this.f2125i, parcel, 0);
        parcel.writeStringList(this.f2126j);
        parcel.writeStringList(this.f2127k);
        parcel.writeInt(this.f2128l ? 1 : 0);
    }
}
