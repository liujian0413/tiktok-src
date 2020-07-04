package p346io.reactivex.internal.util;

import org.p361a.C48293c;
import p346io.reactivex.C7498y;
import p346io.reactivex.p348d.C7328l;

/* renamed from: io.reactivex.internal.util.a */
public final class C47832a<T> {

    /* renamed from: a */
    final int f122618a = 4;

    /* renamed from: b */
    final Object[] f122619b = new Object[5];

    /* renamed from: c */
    Object[] f122620c = this.f122619b;

    /* renamed from: d */
    int f122621d;

    /* renamed from: io.reactivex.internal.util.a$a */
    public interface C7485a<T> extends C7328l<T> {
        /* renamed from: a */
        boolean mo9283a(T t);
    }

    /* renamed from: b */
    public final void mo119914b(T t) {
        this.f122619b[0] = t;
    }

    public C47832a(int i) {
    }

    /* renamed from: a */
    public final void mo119910a(C7485a<? super T> aVar) {
        int i = this.f122618a;
        for (Object[] objArr = this.f122619b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.mo9283a(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo119911a(T t) {
        int i = this.f122618a;
        int i2 = this.f122621d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.f122620c[i] = objArr;
            this.f122620c = objArr;
            i2 = 0;
        }
        this.f122620c[i2] = t;
        this.f122621d = i2 + 1;
    }

    /* renamed from: a */
    public final <U> boolean mo119912a(C7498y<? super U> yVar) {
        Object[] objArr = this.f122619b;
        int i = this.f122618a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (NotificationLite.acceptFull((Object) objArr2, yVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: a */
    public final <U> boolean mo119913a(C48293c<? super U> cVar) {
        Object[] objArr = this.f122619b;
        int i = this.f122618a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (NotificationLite.acceptFull((Object) objArr2, cVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }
}
