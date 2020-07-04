package com.facebook.network.connectionclass;

import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.facebook.network.connectionclass.e */
final class C14151e {

    /* renamed from: a */
    private byte[] f37392a = new byte[512];

    /* renamed from: b */
    private FileInputStream f37393b;

    /* renamed from: c */
    private int f37394c;

    /* renamed from: d */
    private int f37395d;

    /* renamed from: a */
    public final void mo33908a() throws IOException {
        if (this.f37394c >= this.f37395d) {
            this.f37395d = this.f37393b.read(this.f37392a);
            this.f37394c = 0;
        }
        while (this.f37395d != -1 && this.f37392a[this.f37394c] != 10) {
            this.f37394c++;
            if (this.f37394c >= this.f37395d) {
                this.f37395d = this.f37393b.read(this.f37392a);
                this.f37394c = 0;
            }
        }
        this.f37394c++;
    }

    /* renamed from: a */
    public final void mo33909a(FileInputStream fileInputStream) {
        this.f37393b = fileInputStream;
        this.f37395d = 0;
        this.f37394c = 0;
    }

    /* renamed from: a */
    public final int mo33907a(byte[] bArr) throws IOException {
        if (this.f37394c >= this.f37395d) {
            this.f37395d = this.f37393b.read(this.f37392a);
            this.f37394c = 0;
        }
        int i = 0;
        while (this.f37395d != -1 && i < bArr.length && this.f37392a[this.f37394c] != 10) {
            bArr[i] = this.f37392a[this.f37394c];
            this.f37394c++;
            if (this.f37394c >= this.f37395d) {
                this.f37395d = this.f37393b.read(this.f37392a);
                this.f37394c = 0;
            }
            i++;
        }
        this.f37394c++;
        if (this.f37395d == -1) {
            return -1;
        }
        return i;
    }
}
