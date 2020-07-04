package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.CacheControl.Builder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.picasso.Downloader.C18792a;
import com.squareup.picasso.Downloader.ResponseException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.p */
public final class C18842p implements Downloader {

    /* renamed from: a */
    public final OkHttpClient f50780a;

    /* renamed from: a */
    private static OkHttpClient m61536a() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(C40413c.f105051b, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(20000, TimeUnit.MILLISECONDS);
        okHttpClient.setWriteTimeout(20000, TimeUnit.MILLISECONDS);
        return okHttpClient;
    }

    public C18842p(Context context) {
        this(C18807ad.m61441b(context));
    }

    private C18842p(OkHttpClient okHttpClient) {
        this.f50780a = okHttpClient;
    }

    private C18842p(File file) {
        this(file, C18807ad.m61428a(file));
    }

    private C18842p(File file, long j) {
        this(m61536a());
        try {
            this.f50780a.setCache(new Cache(file, j));
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public final C18792a mo49974a(Uri uri, int i) throws IOException {
        CacheControl cacheControl;
        boolean z;
        if (i == 0) {
            cacheControl = null;
        } else if (NetworkPolicy.isOfflineOnly(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            Builder builder = new Builder();
            if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                builder.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f50780a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            if (execute.cacheResponse() != null) {
                z = true;
            } else {
                z = false;
            }
            ResponseBody body = execute.body();
            return new C18792a(body.byteStream(), z, body.contentLength());
        }
        execute.body().close();
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        sb.append(" ");
        sb.append(execute.message());
        throw new ResponseException(sb.toString(), i, code);
    }
}
