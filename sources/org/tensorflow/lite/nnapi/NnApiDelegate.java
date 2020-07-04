package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.C7720a;

public class NnApiDelegate implements AutoCloseable, C7720a {

    /* renamed from: a */
    private long f123504a = createDelegate();

    private static native long createDelegate();

    /* renamed from: a */
    public final long mo20406a() {
        return this.f123504a;
    }

    public void close() {
        if (this.f123504a != 0) {
            this.f123504a = 0;
        }
    }
}
