package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public interface Downloader {

    public static class ResponseException extends IOException {
        final boolean localCacheOnly;
        final int responseCode;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.localCacheOnly = NetworkPolicy.isOfflineOnly(i);
            this.responseCode = i2;
        }
    }

    /* renamed from: com.squareup.picasso.Downloader$a */
    public static class C18792a {

        /* renamed from: a */
        public final InputStream f50646a;

        /* renamed from: b */
        public final Bitmap f50647b;

        /* renamed from: c */
        final boolean f50648c;

        /* renamed from: d */
        public final long f50649d;

        public C18792a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f50646a = inputStream;
                this.f50647b = null;
                this.f50648c = z;
                this.f50649d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }

    /* renamed from: a */
    C18792a mo49974a(Uri uri, int i) throws IOException;
}
