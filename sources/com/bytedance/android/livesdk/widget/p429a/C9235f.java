package com.bytedance.android.livesdk.widget.p429a;

import android.graphics.Typeface;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.widget.a.f */
final /* synthetic */ class C9235f implements Callable {

    /* renamed from: a */
    private final DownloadInfo f25332a;

    C9235f(DownloadInfo downloadInfo) {
        this.f25332a = downloadInfo;
    }

    public final Object call() {
        return Typeface.createFromFile(this.f25332a.getTargetFilePath());
    }
}
