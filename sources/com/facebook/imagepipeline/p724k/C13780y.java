package com.facebook.imagepipeline.p724k;

import android.content.res.AssetManager;
import com.facebook.common.memory.C13322g;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.y */
public final class C13780y extends C13668ac {

    /* renamed from: a */
    private final AssetManager f36575a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33298a() {
        return "LocalAssetFetchProducer";
    }

    /* renamed from: c */
    private static String m40656c(ImageRequest imageRequest) {
        return imageRequest.mSourceUri.getPath().substring(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13647e mo33297a(ImageRequest imageRequest) throws IOException {
        return mo33304b(this.f36575a.open(m40656c(imageRequest), 2), m40655b(imageRequest));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001e A[SYNTHETIC, Splitter:B:15:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0025 A[SYNTHETIC, Splitter:B:23:0x0025] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m40655b(com.facebook.imagepipeline.request.ImageRequest r4) {
        /*
            r3 = this;
            r0 = 0
            android.content.res.AssetManager r1 = r3.f36575a     // Catch:{ IOException -> 0x0022, all -> 0x001b }
            java.lang.String r4 = m40656c(r4)     // Catch:{ IOException -> 0x0022, all -> 0x001b }
            android.content.res.AssetFileDescriptor r4 = r1.openFd(r4)     // Catch:{ IOException -> 0x0022, all -> 0x001b }
            long r0 = r4.getLength()     // Catch:{ IOException -> 0x0023, all -> 0x0016 }
            int r0 = (int) r0
            if (r4 == 0) goto L_0x0015
            r4.close()     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r0
        L_0x0016:
            r0 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
            goto L_0x001c
        L_0x001b:
            r4 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            throw r4
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r4 == 0) goto L_0x0028
            r4.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13780y.m40655b(com.facebook.imagepipeline.request.ImageRequest):int");
    }

    public C13780y(Executor executor, C13322g gVar, AssetManager assetManager) {
        super(executor, gVar);
        this.f36575a = assetManager;
    }
}
