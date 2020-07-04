package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.C13307g;
import com.facebook.common.util.C13337d;
import com.facebook.imagepipeline.common.C13593a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.p717d.C13613j;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.List;

public final class ImageRequestBuilder {

    /* renamed from: a */
    public Uri f36691a;

    /* renamed from: b */
    public List<Uri> f36692b;

    /* renamed from: c */
    public RequestLevel f36693c = RequestLevel.FULL_FETCH;

    /* renamed from: d */
    public C13596d f36694d;

    /* renamed from: e */
    public C13597e f36695e;

    /* renamed from: f */
    public C13594b f36696f = C13594b.m40003a();

    /* renamed from: g */
    public CacheChoice f36697g = CacheChoice.DEFAULT;

    /* renamed from: h */
    public boolean f36698h = C13613j.m40073a().f36121a;

    /* renamed from: i */
    public boolean f36699i = false;

    /* renamed from: j */
    public Priority f36700j = Priority.HIGH;

    /* renamed from: k */
    public C13842b f36701k = null;

    /* renamed from: l */
    public boolean f36702l = true;

    /* renamed from: m */
    public C13653c f36703m;

    /* renamed from: n */
    public C13593a f36704n = null;

    /* renamed from: o */
    private boolean f36705o = true;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            StringBuilder sb = new StringBuilder("Invalid request builder: ");
            sb.append(str);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33472a(RequestLevel requestLevel) {
        this.f36693c = requestLevel;
        return this;
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33474a(boolean z) {
        if (z) {
            return mo33469a(C13597e.m40009a());
        }
        return mo33469a(C13597e.m40010b());
    }

    /* renamed from: a */
    public final boolean mo33475a() {
        return this.f36705o && C13337d.m39034b(this.f36691a);
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33473a(C13842b bVar) {
        this.f36701k = bVar;
        return this;
    }

    /* renamed from: b */
    public final ImageRequest mo33476b() {
        m40869c();
        return new ImageRequest(this);
    }

    private ImageRequestBuilder() {
    }

    /* renamed from: c */
    private void m40869c() {
        if (this.f36691a != null) {
            if (C13337d.m39040h(this.f36691a)) {
                if (!this.f36691a.isAbsolute()) {
                    throw new BuilderException("Resource URI path must be absolute.");
                } else if (!this.f36691a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f36691a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new BuilderException("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new BuilderException("Resource URI must not be empty");
                }
            }
            if (C13337d.m39039g(this.f36691a) && !this.f36691a.isAbsolute()) {
                throw new BuilderException("Asset URI path must be absolute.");
            }
            return;
        }
        throw new BuilderException("Source must be set!");
    }

    /* renamed from: c */
    private ImageRequestBuilder m40868c(boolean z) {
        this.f36699i = z;
        return this;
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33465a(Priority priority) {
        this.f36700j = priority;
        return this;
    }

    /* renamed from: b */
    public final ImageRequestBuilder mo33477b(boolean z) {
        this.f36698h = z;
        return this;
    }

    /* renamed from: b */
    private ImageRequestBuilder m40867b(Uri uri) {
        C13307g.m38940a(uri);
        this.f36691a = uri;
        return this;
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33466a(C13593a aVar) {
        this.f36704n = aVar;
        return this;
    }

    /* renamed from: a */
    public static ImageRequestBuilder m40864a(int i) {
        return m40865a(C13337d.m39030a(i));
    }

    /* renamed from: a */
    public static ImageRequestBuilder m40865a(Uri uri) {
        return new ImageRequestBuilder().m40867b(uri);
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33467a(C13594b bVar) {
        this.f36696f = bVar;
        return this;
    }

    /* renamed from: a */
    public static ImageRequestBuilder m40866a(ImageRequest imageRequest) {
        return m40865a(imageRequest.mSourceUri).mo33467a(imageRequest.mImageDecodeOptions).mo33466a(imageRequest.mBytesRange).mo33471a(imageRequest.mCacheChoice).m40868c(imageRequest.mLocalThumbnailPreviewsEnabled).mo33472a(imageRequest.mLowestPermittedRequestLevel).mo33473a(imageRequest.mPostprocessor).mo33477b(imageRequest.mProgressiveRenderingEnabled).mo33465a(imageRequest.mRequestPriority).mo33468a(imageRequest.mResizeOptions).mo33470a(imageRequest.mRequestListener).mo33469a(imageRequest.mRotationOptions);
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33468a(C13596d dVar) {
        this.f36694d = dVar;
        return this;
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33469a(C13597e eVar) {
        this.f36695e = eVar;
        return this;
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33470a(C13653c cVar) {
        this.f36703m = cVar;
        return this;
    }

    /* renamed from: a */
    public final ImageRequestBuilder mo33471a(CacheChoice cacheChoice) {
        this.f36697g = cacheChoice;
        return this;
    }
}
