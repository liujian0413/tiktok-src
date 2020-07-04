package com.p280ss.android.socialbase.downloader.model;

import com.p280ss.android.socialbase.downloader.exception.BaseException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.ss.android.socialbase.downloader.model.b */
public final class C20340b {

    /* renamed from: a */
    private BufferedOutputStream f54983a;

    /* renamed from: b */
    private FileDescriptor f54984b;

    /* renamed from: c */
    private RandomAccessFile f54985c;

    /* renamed from: b */
    public final void mo54897b() throws IOException {
        if (this.f54985c != null) {
            this.f54985c.close();
        }
        this.f54983a.close();
    }

    /* renamed from: a */
    public final void mo54894a() throws IOException {
        if (this.f54983a != null) {
            this.f54983a.flush();
        }
        if (this.f54984b != null) {
            this.f54984b.sync();
        }
    }

    /* renamed from: a */
    public final void mo54895a(long j) throws IOException {
        this.f54985c.seek(j);
    }

    /* renamed from: b */
    public final void mo54898b(long j) throws IOException {
        this.f54985c.setLength(j);
    }

    public C20340b(File file) throws BaseException {
        try {
            this.f54985c = new RandomAccessFile(file, "rw");
            this.f54984b = this.f54985c.getFD();
            this.f54983a = new BufferedOutputStream(new FileOutputStream(this.f54985c.getFD()));
        } catch (IOException e) {
            throw new BaseException(1039, (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo54896a(byte[] bArr, int i, int i2) throws IOException {
        this.f54983a.write(bArr, 0, i2);
    }
}
