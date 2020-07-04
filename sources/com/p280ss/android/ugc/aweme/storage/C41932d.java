package com.p280ss.android.ugc.aweme.storage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.p359io.FileSystem;

/* renamed from: com.ss.android.ugc.aweme.storage.d */
public final class C41932d implements C41912c, Closeable {

    /* renamed from: a */
    public final DiskLruCache f109002a;

    public final void close() throws IOException {
        if (this.f109002a != null) {
            this.f109002a.close();
        }
    }

    public C41932d(File file, int i, long j) throws IOException {
        this.f109002a = DiskLruCache.create(FileSystem.SYSTEM, file, 1, 2, 16777216);
    }
}
