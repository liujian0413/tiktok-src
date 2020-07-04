package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class bjn implements bkc {

    /* renamed from: a */
    private final AssetManager f42316a;

    /* renamed from: b */
    private final bkb f42317b = null;

    /* renamed from: c */
    private String f42318c;

    /* renamed from: d */
    private InputStream f42319d;

    /* renamed from: e */
    private long f42320e;

    /* renamed from: f */
    private boolean f42321f;

    public bjn(Context context, bkb bkb) {
        this.f42316a = context.getAssets();
    }

    /* renamed from: a */
    public final long mo39543a(bjq bjq) throws zzjm {
        long j;
        try {
            this.f42318c = bjq.f42325a.toString();
            String path = bjq.f42325a.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            this.f42319d = this.f42316a.open(path, 1);
            bke.m49060b(this.f42319d.skip(bjq.f42327c) == bjq.f42327c);
            if (bjq.f42328d == -1) {
                j = (long) this.f42319d.available();
            } else {
                j = bjq.f42328d;
            }
            this.f42320e = j;
            if (this.f42320e >= 0) {
                this.f42321f = true;
                return this.f42320e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzjm(e);
        }
    }

    /* renamed from: a */
    public final int mo39542a(byte[] bArr, int i, int i2) throws zzjm {
        if (this.f42320e == 0) {
            return -1;
        }
        try {
            int read = this.f42319d.read(bArr, i, (int) Math.min(this.f42320e, (long) i2));
            if (read > 0) {
                this.f42320e -= (long) read;
            }
            return read;
        } catch (IOException e) {
            throw new zzjm(e);
        }
    }

    /* renamed from: a */
    public final void mo39544a() throws zzjm {
        if (this.f42319d != null) {
            try {
                this.f42319d.close();
                this.f42319d = null;
                if (this.f42321f) {
                    this.f42321f = false;
                    if (this.f42317b != null) {
                    }
                }
            } catch (IOException e) {
                throw new zzjm(e);
            } catch (Throwable th) {
                this.f42319d = null;
                if (this.f42321f) {
                    this.f42321f = false;
                }
                throw th;
            }
        }
    }
}
