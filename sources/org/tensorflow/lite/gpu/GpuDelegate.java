package org.tensorflow.lite.gpu;

import java.io.Closeable;
import org.tensorflow.lite.C7720a;

public class GpuDelegate implements Closeable, C7720a {

    /* renamed from: a */
    private long f20974a;

    /* renamed from: org.tensorflow.lite.gpu.GpuDelegate$a */
    public static final class C7723a {

        /* renamed from: a */
        boolean f20975a = true;

        /* renamed from: b */
        boolean f20976b;

        /* renamed from: c */
        int f20977c;
    }

    /* renamed from: org.tensorflow.lite.gpu.GpuDelegate$b */
    public static final class C7724b {

        /* renamed from: b */
        private static final C7723a f20978b = new C7723a();

        /* renamed from: a */
        C7723a f20979a = f20978b;
    }

    private static native boolean bindGlBufferToTensor(long j, int i, int i2);

    private static native long createDelegate(boolean z, boolean z2, int i);

    private static native void deleteDelegate(long j);

    /* renamed from: a */
    public final long mo20406a() {
        return this.f20974a;
    }

    static {
        C48365a.m150043a("tensorflowlite_gpu_jni");
    }

    public GpuDelegate() {
        this(new C7724b());
    }

    public void close() {
        if (this.f20974a != 0) {
            deleteDelegate(this.f20974a);
            this.f20974a = 0;
        }
    }

    private GpuDelegate(C7724b bVar) {
        this.f20974a = createDelegate(bVar.f20979a.f20975a, bVar.f20979a.f20976b, bVar.f20979a.f20977c);
    }
}
