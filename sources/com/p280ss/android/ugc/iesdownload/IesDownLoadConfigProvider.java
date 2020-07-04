package com.p280ss.android.ugc.iesdownload;

import android.content.Context;
import com.p280ss.android.ugc.iesdownload.p1745b.C44847b;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.ugc.iesdownload.IesDownLoadConfigProvider */
public class IesDownLoadConfigProvider {
    private static IesDownLoadConfigProvider sInstance;
    public C44847b downloadClient;
    public Context mContext;
    private OkHttpClient mOkHttpClient;

    public Context getContext() {
        return C44845b.m141517a(this);
    }

    public OkHttpClient getOkHttpClient() {
        if (this.mOkHttpClient == null) {
            this.mOkHttpClient = getDefaultClient();
        }
        return this.mOkHttpClient;
    }

    public static IesDownLoadConfigProvider getInstance() {
        if (sInstance == null) {
            synchronized (IesDownLoadConfigProvider.class) {
                if (sInstance == null) {
                    sInstance = new IesDownLoadConfigProvider();
                }
            }
        }
        return sInstance;
    }

    private OkHttpClient getDefaultClient() {
        return new OkHttpClient().newBuilder().connectTimeout(60, TimeUnit.SECONDS).writeTimeout(120, TimeUnit.SECONDS).readTimeout(120, TimeUnit.SECONDS).retryOnConnectionFailure(true).build();
    }

    public IesDownLoadConfigProvider setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public IesDownLoadConfigProvider setDownloadClient(C44847b bVar) {
        this.downloadClient = bVar;
        return this;
    }

    public IesDownLoadConfigProvider setOkHttpClient(OkHttpClient okHttpClient) {
        this.mOkHttpClient = okHttpClient;
        return this;
    }
}
