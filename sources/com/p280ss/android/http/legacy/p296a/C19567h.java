package com.p280ss.android.http.legacy.p296a;

import com.p280ss.android.http.legacy.p877d.C19574b;

/* renamed from: com.ss.android.http.legacy.a.h */
public final class C19567h {

    /* renamed from: a */
    public final int f52941a;

    /* renamed from: b */
    public final int f52942b;

    /* renamed from: c */
    public int f52943c;

    /* renamed from: a */
    public final boolean mo51729a() {
        if (this.f52943c >= this.f52942b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C19574b bVar = new C19574b(16);
        bVar.mo51737a('[');
        bVar.mo51739a(Integer.toString(this.f52941a));
        bVar.mo51737a('>');
        bVar.mo51739a(Integer.toString(this.f52943c));
        bVar.mo51737a('>');
        bVar.mo51739a(Integer.toString(this.f52942b));
        bVar.mo51737a(']');
        return bVar.toString();
    }

    /* renamed from: a */
    public final void mo51728a(int i) {
        if (i < this.f52941a) {
            throw new IndexOutOfBoundsException();
        } else if (i <= this.f52942b) {
            this.f52943c = i;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public C19567h(int i, int i2) {
        if (i2 >= 0) {
            this.f52941a = 0;
            this.f52942b = i2;
            this.f52943c = 0;
            return;
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
    }
}
