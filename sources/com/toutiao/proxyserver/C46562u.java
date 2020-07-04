package com.toutiao.proxyserver;

import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.toutiao.proxyserver.u */
final class C46562u {

    /* renamed from: a */
    private final RandomAccessFile f119997a;

    /* renamed from: com.toutiao.proxyserver.u$a */
    static class C46563a extends Exception {
        C46563a() {
        }

        C46563a(Throwable th) {
            super(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115744a() {
        C46476c.m146120a(this.f119997a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo115743a(byte[] bArr) throws C46563a {
        try {
            return this.f119997a.read(bArr);
        } catch (IOException e) {
            throw new C46563a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115745a(long j) throws C46563a {
        try {
            this.f119997a.seek(j);
        } catch (IOException e) {
            throw new C46563a(e);
        }
    }

    C46562u(File file, String str) throws C46563a {
        try {
            this.f119997a = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new C46563a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115746a(byte[] bArr, int i, int i2) throws C46563a {
        try {
            this.f119997a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C46563a(e);
        }
    }
}
