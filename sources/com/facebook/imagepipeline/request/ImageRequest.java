package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13303f;
import com.facebook.common.p687d.C13289a;
import com.facebook.common.util.C13337d;
import com.facebook.imagepipeline.common.C13593a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.p721h.C13653c;
import java.io.File;
import java.util.List;

public class ImageRequest {
    public final List<Uri> mBackupUris;
    public final C13593a mBytesRange;
    public final CacheChoice mCacheChoice;
    public final C13594b mImageDecodeOptions;
    public final boolean mIsDiskCacheEnabled;
    public final boolean mIsMemoryCacheEnabled;
    public final boolean mLocalThumbnailPreviewsEnabled;
    public final RequestLevel mLowestPermittedRequestLevel;
    public final C13842b mPostprocessor;
    public final boolean mProgressiveRenderingEnabled;
    public final C13653c mRequestListener;
    public final Priority mRequestPriority;
    public final C13596d mResizeOptions;
    public final C13597e mRotationOptions;
    private File mSourceFile;
    public final Uri mSourceUri;
    public final int mSourceUriType = getSourceUriType(this.mSourceUri);

    public enum CacheChoice {
        SMALL,
        DEFAULT
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        public static RequestLevel getMax(RequestLevel requestLevel, RequestLevel requestLevel2) {
            if (requestLevel.getValue() > requestLevel2.getValue()) {
                return requestLevel;
            }
            return requestLevel2;
        }

        private RequestLevel(int i) {
            this.mValue = i;
        }
    }

    public boolean getAutoRotateEnabled() {
        return this.mRotationOptions.mo33158d();
    }

    public int getPreferredHeight() {
        if (this.mResizeOptions != null) {
            return this.mResizeOptions.f36025b;
        }
        return 2048;
    }

    public int getPreferredWidth() {
        if (this.mResizeOptions != null) {
            return this.mResizeOptions.f36024a;
        }
        return 2048;
    }

    public synchronized File getSourceFile() {
        if (this.mSourceFile == null) {
            this.mSourceFile = new File(this.mSourceUri.getPath());
        }
        return this.mSourceFile;
    }

    public int hashCode() {
        C13265a aVar;
        if (this.mPostprocessor != null) {
            aVar = this.mPostprocessor.getPostprocessorCacheKey();
        } else {
            aVar = null;
        }
        return C13303f.m38929a(this.mCacheChoice, this.mSourceUri, this.mSourceFile, this.mBytesRange, this.mImageDecodeOptions, this.mResizeOptions, this.mRotationOptions, aVar);
    }

    public String toString() {
        return C13303f.m38930a((Object) this).mo32569a("uri", (Object) this.mSourceUri).mo32569a("cacheChoice", (Object) this.mCacheChoice).mo32569a("decodeOptions", (Object) this.mImageDecodeOptions).mo32569a("postprocessor", (Object) this.mPostprocessor).mo32569a("priority", (Object) this.mRequestPriority).mo32569a("resizeOptions", (Object) this.mResizeOptions).mo32569a("rotationOptions", (Object) this.mRotationOptions).mo32569a("bytesRange", (Object) this.mBytesRange).toString();
    }

    public static ImageRequest fromFile(File file) {
        if (file == null) {
            return null;
        }
        return fromUri(C13337d.m39031a(file));
    }

    public static ImageRequest fromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.m40865a(uri).mo33476b();
    }

    public static ImageRequest fromUri(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return fromUri(Uri.parse(str));
    }

    protected ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        C13597e eVar;
        this.mCacheChoice = imageRequestBuilder.f36697g;
        this.mSourceUri = imageRequestBuilder.f36691a;
        this.mBackupUris = imageRequestBuilder.f36692b;
        this.mProgressiveRenderingEnabled = imageRequestBuilder.f36698h;
        this.mLocalThumbnailPreviewsEnabled = imageRequestBuilder.f36699i;
        this.mImageDecodeOptions = imageRequestBuilder.f36696f;
        this.mResizeOptions = imageRequestBuilder.f36694d;
        if (imageRequestBuilder.f36695e == null) {
            eVar = C13597e.m40009a();
        } else {
            eVar = imageRequestBuilder.f36695e;
        }
        this.mRotationOptions = eVar;
        this.mBytesRange = imageRequestBuilder.f36704n;
        this.mRequestPriority = imageRequestBuilder.f36700j;
        this.mLowestPermittedRequestLevel = imageRequestBuilder.f36693c;
        this.mIsDiskCacheEnabled = imageRequestBuilder.mo33475a();
        this.mIsMemoryCacheEnabled = imageRequestBuilder.f36702l;
        this.mPostprocessor = imageRequestBuilder.f36701k;
        this.mRequestListener = imageRequestBuilder.f36703m;
    }

    private static int getSourceUriType(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (C13337d.m39034b(uri)) {
            return 0;
        }
        if (C13337d.m39035c(uri)) {
            if (C13289a.m38892a(C13289a.m38893b(uri.getPath()))) {
                return 2;
            }
            return 3;
        } else if (C13337d.m39036d(uri)) {
            return 4;
        } else {
            if (C13337d.m39039g(uri)) {
                return 5;
            }
            if (C13337d.m39040h(uri)) {
                return 6;
            }
            if (C13337d.m39042j(uri)) {
                return 7;
            }
            if (C13337d.m39041i(uri)) {
                return 8;
            }
            return -1;
        }
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (!C13303f.m38932a(this.mSourceUri, imageRequest.mSourceUri) || !C13303f.m38932a(this.mCacheChoice, imageRequest.mCacheChoice) || !C13303f.m38932a(this.mSourceFile, imageRequest.mSourceFile) || !C13303f.m38932a(this.mBytesRange, imageRequest.mBytesRange) || !C13303f.m38932a(this.mImageDecodeOptions, imageRequest.mImageDecodeOptions) || !C13303f.m38932a(this.mResizeOptions, imageRequest.mResizeOptions) || !C13303f.m38932a(this.mRotationOptions, imageRequest.mRotationOptions)) {
            return false;
        }
        C13265a aVar = null;
        if (this.mPostprocessor != null) {
            obj2 = this.mPostprocessor.getPostprocessorCacheKey();
        } else {
            obj2 = null;
        }
        if (imageRequest.mPostprocessor != null) {
            aVar = imageRequest.mPostprocessor.getPostprocessorCacheKey();
        }
        return C13303f.m38932a(obj2, aVar);
    }
}
