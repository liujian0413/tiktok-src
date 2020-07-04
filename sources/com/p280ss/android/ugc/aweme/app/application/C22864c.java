package com.p280ss.android.ugc.aweme.app.application;

import android.content.Context;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.app.application.c */
public final class C22864c {

    /* renamed from: a */
    private static final AtomicBoolean f60590a = new AtomicBoolean(false);

    /* renamed from: b */
    private static void m75324b() {
        DownloaderManagerHolder.m75527a((Context) AwemeApplication.m21341a());
    }

    /* renamed from: a */
    public static void m75323a() {
        if (!f60590a.get()) {
            synchronized (f60590a) {
                if (f60590a.compareAndSet(false, true)) {
                    m75324b();
                }
            }
        }
    }
}
