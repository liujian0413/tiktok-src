package com.facebook.common.util;

import com.facebook.common.internal.C13307g;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.util.c */
public final class C13336c {
    /* renamed from: a */
    public static long m39029a(InputStream inputStream, long j) throws IOException {
        boolean z;
        C13307g.m38940a(inputStream);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else if (inputStream.read() == -1) {
                return j - j2;
            } else {
                j2--;
            }
        }
        return j;
    }
}
