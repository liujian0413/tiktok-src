package com.tencent.wcdb;

import android.database.CharArrayBuffer;

/* renamed from: com.tencent.wcdb.b */
public abstract class C46399b extends C46397a {

    /* renamed from: g */
    protected CursorWindow f119464g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115365a() {
        super.mo115365a();
        mo115409c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo115368b() {
        super.mo115368b();
        if (this.f119464g == null) {
            throw new StaleDataException("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo115409c() {
        if (this.f119464g != null) {
            this.f119464g.close();
            this.f119464g = null;
        }
    }

    public byte[] getBlob(int i) {
        mo115368b();
        return this.f119464g.mo115351b(this.f119451b, i);
    }

    public double getDouble(int i) {
        mo115368b();
        return this.f119464g.mo115356e(this.f119451b, i);
    }

    public float getFloat(int i) {
        mo115368b();
        return this.f119464g.mo115360h(this.f119451b, i);
    }

    public int getInt(int i) {
        mo115368b();
        return this.f119464g.mo115359g(this.f119451b, i);
    }

    public long getLong(int i) {
        mo115368b();
        return this.f119464g.mo115354d(this.f119451b, i);
    }

    public short getShort(int i) {
        mo115368b();
        return this.f119464g.mo115357f(this.f119451b, i);
    }

    public String getString(int i) {
        mo115368b();
        return this.f119464g.mo115352c(this.f119451b, i);
    }

    public int getType(int i) {
        mo115368b();
        return this.f119464g.mo115347a(this.f119451b, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115408a(String str) {
        if (this.f119464g == null) {
            this.f119464g = new CursorWindow(str);
        } else {
            this.f119464g.mo115348a();
        }
    }

    public boolean isNull(int i) {
        mo115368b();
        if (this.f119464g.mo115347a(this.f119451b, i) == 0) {
            return true;
        }
        return false;
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        mo115368b();
        this.f119464g.mo115349a(this.f119451b, i, charArrayBuffer);
    }
}
