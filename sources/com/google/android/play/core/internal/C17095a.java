package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;

/* renamed from: com.google.android.play.core.internal.a */
final class C17095a implements C6511ac {

    /* renamed from: a */
    private final FileChannel f47802a;

    /* renamed from: b */
    private final long f47803b;

    /* renamed from: c */
    private final long f47804c;

    public C17095a(FileChannel fileChannel, long j, long j2) {
        this.f47802a = fileChannel;
        this.f47803b = j;
        this.f47804c = j2;
    }

    /* renamed from: a */
    public final long mo15879a() {
        return this.f47804c;
    }

    /* renamed from: a */
    public final void mo15880a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f47802a.map(MapMode.READ_ONLY, this.f47803b + j, (long) i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
