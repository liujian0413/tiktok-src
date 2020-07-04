package com.facebook.drawee.backends.pipeline.p696b.p697a;

import com.facebook.common.time.C13331b;
import com.facebook.drawee.backends.pipeline.p696b.C13379h;
import com.facebook.imagepipeline.p721h.C13651a;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.facebook.drawee.backends.pipeline.b.a.c */
public final class C13372c extends C13651a {

    /* renamed from: a */
    private final C13331b f35338a;

    /* renamed from: b */
    private final C13379h f35339b;

    public final void onRequestCancellation(String str) {
        this.f35339b.f35382l = this.f35338a.now();
        this.f35339b.f35372b = str;
    }

    public C13372c(C13331b bVar, C13379h hVar) {
        this.f35338a = bVar;
        this.f35339b = hVar;
    }

    public final void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        this.f35339b.f35382l = this.f35338a.now();
        this.f35339b.f35373c = imageRequest;
        this.f35339b.f35372b = str;
        this.f35339b.f35384n = z;
    }

    public final void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        this.f35339b.f35382l = this.f35338a.now();
        this.f35339b.f35373c = imageRequest;
        this.f35339b.f35372b = str;
        this.f35339b.f35384n = z;
    }

    public final void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f35339b.f35381k = this.f35338a.now();
        this.f35339b.f35373c = imageRequest;
        this.f35339b.f35374d = obj;
        this.f35339b.f35372b = str;
        this.f35339b.f35384n = z;
    }
}
