package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Creator<DataHolder> CREATOR = new C15180c();

    /* renamed from: k */
    private static final C15177a f39258k = new C15179b(new String[0], null);

    /* renamed from: a */
    public final int f39259a;

    /* renamed from: b */
    public final Bundle f39260b;

    /* renamed from: c */
    public int f39261c;

    /* renamed from: d */
    private final int f39262d;

    /* renamed from: e */
    private final String[] f39263e;

    /* renamed from: f */
    private Bundle f39264f;

    /* renamed from: g */
    private final CursorWindow[] f39265g;

    /* renamed from: h */
    private int[] f39266h;

    /* renamed from: i */
    private boolean f39267i;

    /* renamed from: j */
    private boolean f39268j = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C15177a {

        /* renamed from: a */
        private final String[] f39269a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f39270b;

        /* renamed from: c */
        private final String f39271c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f39272d;

        /* renamed from: e */
        private boolean f39273e;

        /* renamed from: f */
        private String f39274f;

        private C15177a(String[] strArr, String str) {
            this.f39269a = (String[]) C15267r.m44384a(strArr);
            this.f39270b = new ArrayList<>();
            this.f39271c = null;
            this.f39272d = new HashMap<>();
            this.f39273e = false;
            this.f39274f = null;
        }

        /* synthetic */ C15177a(String[] strArr, String str, C15179b bVar) {
            this(strArr, null);
        }
    }

    public static class zaa extends RuntimeException {
        public zaa(String str) {
            super(str);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f39262d = i;
        this.f39263e = strArr;
        this.f39265g = cursorWindowArr;
        this.f39259a = i2;
        this.f39260b = bundle;
    }

    /* renamed from: a */
    public final void mo38470a() {
        this.f39264f = new Bundle();
        for (int i = 0; i < this.f39263e.length; i++) {
            this.f39264f.putInt(this.f39263e[i], i);
        }
        this.f39266h = new int[this.f39265g.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f39265g.length; i3++) {
            this.f39266h[i3] = i2;
            i2 += this.f39265g[i3].getNumRows() - (i2 - this.f39265g[i3].getStartPosition());
        }
        this.f39261c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44462a(parcel, 1, this.f39263e, false);
        C15269a.m44461a(parcel, 2, (T[]) this.f39265g, i, false);
        C15269a.m44447a(parcel, 3, this.f39259a);
        C15269a.m44449a(parcel, 4, this.f39260b, false);
        C15269a.m44447a(parcel, 1000, this.f39262d);
        C15269a.m44443a(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* renamed from: b */
    private boolean m44163b() {
        boolean z;
        synchronized (this) {
            z = this.f39267i;
        }
        return z;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f39267i) {
                this.f39267i = true;
                for (CursorWindow close : this.f39265g) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f39268j && this.f39265g.length > 0 && !m44163b()) {
                close();
            }
        } finally {
            super.finalize();
        }
    }
}
