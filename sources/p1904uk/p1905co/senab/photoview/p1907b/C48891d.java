package p1904uk.p1905co.senab.photoview.p1907b;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: uk.co.senab.photoview.b.d */
public abstract class C48891d {
    /* renamed from: a */
    public abstract void mo123714a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    /* renamed from: a */
    public abstract void mo123715a(boolean z);

    /* renamed from: a */
    public abstract boolean mo123716a();

    /* renamed from: b */
    public abstract boolean mo123717b();

    /* renamed from: c */
    public abstract int mo123718c();

    /* renamed from: d */
    public abstract int mo123719d();

    /* renamed from: a */
    public static C48891d m150893a(Context context) {
        if (VERSION.SDK_INT < 9) {
            return new C48890c(context);
        }
        if (VERSION.SDK_INT < 14) {
            return new C48888a(context);
        }
        return new C48889b(context);
    }
}
