package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class bvg {

    /* renamed from: a */
    private ByteArrayOutputStream f43701a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    private Base64OutputStream f43702b = new Base64OutputStream(this.f43701a, 10);

    /* renamed from: a */
    public final void mo41388a(byte[] bArr) throws IOException {
        this.f43702b.write(bArr);
    }

    public final String toString() {
        try {
            this.f43702b.close();
        } catch (IOException e) {
            acd.m45778b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f43701a.close();
            return this.f43701a.toString();
        } catch (IOException e2) {
            acd.m45778b("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.f43701a = null;
            this.f43702b = null;
        }
    }
}
