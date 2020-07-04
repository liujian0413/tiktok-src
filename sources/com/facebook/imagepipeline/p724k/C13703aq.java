package com.facebook.imagepipeline.p724k;

import android.content.ContentResolver;
import com.facebook.common.memory.C13322g;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.aq */
public final class C13703aq extends C13668ac {

    /* renamed from: a */
    private final ContentResolver f36379a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33298a() {
        return "QualifiedResourceFetchProducer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13647e mo33297a(ImageRequest imageRequest) throws IOException {
        return mo33304b(this.f36379a.openInputStream(imageRequest.mSourceUri), -1);
    }

    public C13703aq(Executor executor, C13322g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f36379a = contentResolver;
    }
}
