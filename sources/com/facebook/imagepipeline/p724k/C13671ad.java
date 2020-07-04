package com.facebook.imagepipeline.p724k;

import com.facebook.common.memory.C13322g;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.ad */
public final class C13671ad extends C13668ac {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33298a() {
        return "LocalFileFetchProducer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13647e mo33297a(ImageRequest imageRequest) throws IOException {
        return mo33304b(new FileInputStream(imageRequest.getSourceFile().toString()), (int) imageRequest.getSourceFile().length());
    }

    public C13671ad(Executor executor, C13322g gVar) {
        super(executor, gVar);
    }
}
