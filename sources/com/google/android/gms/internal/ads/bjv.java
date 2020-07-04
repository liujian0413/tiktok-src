package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class bjv implements bkc {

    /* renamed from: a */
    private final bkb f42356a;

    /* renamed from: b */
    private RandomAccessFile f42357b;

    /* renamed from: c */
    private String f42358c;

    /* renamed from: d */
    private long f42359d;

    /* renamed from: e */
    private boolean f42360e;

    public bjv() {
        this(null);
    }

    public bjv(bkb bkb) {
        this.f42356a = null;
    }

    /* renamed from: a */
    public final long mo39543a(bjq bjq) throws zzjv {
        long j;
        try {
            this.f42358c = bjq.f42325a.toString();
            this.f42357b = new RandomAccessFile(bjq.f42325a.getPath(), "r");
            this.f42357b.seek(bjq.f42327c);
            if (bjq.f42328d == -1) {
                j = this.f42357b.length() - bjq.f42327c;
            } else {
                j = bjq.f42328d;
            }
            this.f42359d = j;
            if (this.f42359d >= 0) {
                this.f42360e = true;
                return this.f42359d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzjv(e);
        }
    }

    /* renamed from: a */
    public final int mo39542a(byte[] bArr, int i, int i2) throws zzjv {
        if (this.f42359d == 0) {
            return -1;
        }
        try {
            int read = this.f42357b.read(bArr, i, (int) Math.min(this.f42359d, (long) i2));
            if (read > 0) {
                this.f42359d -= (long) read;
            }
            return read;
        } catch (IOException e) {
            throw new zzjv(e);
        }
    }

    /* renamed from: a */
    public final void mo39544a() throws zzjv {
        if (this.f42357b != null) {
            try {
                this.f42357b.close();
                this.f42357b = null;
                this.f42358c = null;
                if (this.f42360e) {
                    this.f42360e = false;
                    if (this.f42356a != null) {
                    }
                }
            } catch (IOException e) {
                throw new zzjv(e);
            } catch (Throwable th) {
                this.f42357b = null;
                this.f42358c = null;
                if (this.f42360e) {
                    this.f42360e = false;
                }
                throw th;
            }
        }
    }
}
