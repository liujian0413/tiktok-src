package com.google.common.p784io;

import com.google.common.base.C17439m;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.common.io.c */
public final class C18103c {

    /* renamed from: a */
    private static final OutputStream f49450a = new OutputStream() {
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public final void write(int i) {
        }

        public final void write(byte[] bArr) {
            C17439m.m57962a(bArr);
        }

        public final void write(byte[] bArr, int i, int i2) {
            C17439m.m57962a(bArr);
        }
    };

    /* renamed from: a */
    private static byte[] m59858a() {
        return new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
    }

    /* renamed from: a */
    public static long m59857a(InputStream inputStream, OutputStream outputStream) throws IOException {
        C17439m.m57962a(inputStream);
        C17439m.m57962a(outputStream);
        byte[] a = m59858a();
        long j = 0;
        while (true) {
            int read = inputStream.read(a);
            if (read == -1) {
                return j;
            }
            outputStream.write(a, 0, read);
            j += (long) read;
        }
    }
}
