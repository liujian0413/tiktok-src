package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;

/* renamed from: com.google.android.gms.internal.ads.rm */
final class C16008rm implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ String f44933a;

    /* renamed from: b */
    private final /* synthetic */ String f44934b;

    /* renamed from: c */
    private final /* synthetic */ C16006rk f44935c;

    C16008rm(C16006rk rkVar, String str, String str2) {
        this.f44935c = rkVar;
        this.f44933a = str;
        this.f44934b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f44935c.f44931b.getSystemService("download");
        try {
            String str = this.f44933a;
            String str2 = this.f44934b;
            Request request = new Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f44935c.mo41951a("Could not store picture.");
        }
    }
}
