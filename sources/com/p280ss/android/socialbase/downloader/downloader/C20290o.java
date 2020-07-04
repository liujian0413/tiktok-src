package com.p280ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.p280ss.android.socialbase.downloader.downloader.DownloadService;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.o */
public interface C20290o<T extends DownloadService> {
    /* renamed from: a */
    IBinder mo54266a(Intent intent);

    /* renamed from: a */
    void mo54267a(int i);

    /* renamed from: a */
    void mo54268a(int i, Notification notification);

    /* renamed from: a */
    void mo54270a(Intent intent, int i, int i2);

    /* renamed from: a */
    void mo54271a(C20289n nVar);

    /* renamed from: a */
    void mo54273a(WeakReference<T> weakReference);

    /* renamed from: a */
    void mo54274a(boolean z);

    /* renamed from: a */
    boolean mo54275a();

    /* renamed from: b */
    void mo54276b();

    /* renamed from: b */
    void mo54277b(DownloadTask downloadTask);

    /* renamed from: c */
    void mo54278c();

    /* renamed from: c */
    void mo54279c(DownloadTask downloadTask);

    /* renamed from: e */
    void mo54281e();
}
