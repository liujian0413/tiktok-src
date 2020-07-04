package com.facebook.imagepipeline.p724k;

import com.facebook.common.p686c.C13286a;

/* renamed from: com.facebook.imagepipeline.k.b */
public abstract class C13728b<T> implements C13748k<T> {

    /* renamed from: a */
    private boolean f36447a;

    /* renamed from: a */
    public static int m40490a(int i, int i2) {
        return i & -2;
    }

    /* renamed from: a */
    public static int m40491a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public static boolean m40493a(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: b */
    public static boolean m40495b(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: c */
    public static boolean m40496c(int i, int i2) {
        return (i & 10) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33254a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33255a(float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33256a(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33257a(Throwable th);

    /* renamed from: b */
    public final synchronized void mo33352b() {
        if (!this.f36447a) {
            this.f36447a = true;
            try {
                mo33254a();
            } catch (Exception e) {
                m40492a(e);
            }
        }
    }

    /* renamed from: a */
    private void m40492a(Exception exc) {
        C13286a.m38858c(getClass(), "unhandled exception", (Throwable) exc);
    }

    /* renamed from: b */
    public static boolean m40494b(int i) {
        if (!m40493a(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo33353b(float f) {
        if (!this.f36447a) {
            try {
                mo33255a(f);
            } catch (Exception e) {
                m40492a(e);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo33355b(Throwable th) {
        if (!this.f36447a) {
            this.f36447a = true;
            try {
                mo33257a(th);
            } catch (Exception e) {
                m40492a(e);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo33354b(T t, int i) {
        if (!this.f36447a) {
            this.f36447a = m40493a(i);
            try {
                mo33256a(t, i);
            } catch (Exception e) {
                m40492a(e);
            }
        }
    }
}
