package com.p280ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.p280ss.android.socialbase.downloader.downloader.C20267a;
import com.p280ss.android.socialbase.downloader.downloader.DownloadService;
import com.p280ss.android.socialbase.downloader.utils.C20356b;

/* renamed from: com.ss.android.socialbase.downloader.impls.h */
public class C20311h extends C20267a {

    /* renamed from: f */
    private static final String f54876f = "h";

    /* renamed from: b */
    public final void mo54276b() {
        if (C20356b.m67535a(262144)) {
            this.f54726c = true;
            this.f54728e = false;
        }
    }

    /* renamed from: a */
    public final void mo54269a(Context context, ServiceConnection serviceConnection) {
        try {
            context.startService(new Intent(context, DownloadService.class));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo54270a(Intent intent, int i, int i2) {
        if (!C20356b.m67535a(262144)) {
            this.f54726c = true;
        }
        mo54280d();
    }
}
