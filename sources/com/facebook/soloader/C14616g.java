package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.g */
public final class C14616g implements Closeable {

    /* renamed from: a */
    private final FileOutputStream f37753a;

    /* renamed from: b */
    private final FileLock f37754b;

    public final void close() throws IOException {
        try {
            if (this.f37754b != null) {
                this.f37754b.release();
            }
        } finally {
            this.f37753a.close();
        }
    }

    /* renamed from: a */
    public static C14616g m42282a(File file) throws IOException {
        return new C14616g(file);
    }

    private C14616g(File file) throws IOException {
        this.f37753a = new FileOutputStream(file);
        try {
            FileLock lock = this.f37753a.getChannel().lock();
            if (lock == null) {
            }
            this.f37754b = lock;
        } finally {
            this.f37753a.close();
        }
    }
}
