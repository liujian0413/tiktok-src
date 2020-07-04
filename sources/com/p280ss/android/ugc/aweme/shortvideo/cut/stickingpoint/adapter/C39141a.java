package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter;

import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.a */
public class C39141a implements IDownloadListener {
    public void onCanceled(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    public void onFirstStart(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
    }

    public void onFirstSuccess(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
    }

    public void onPause(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
    }

    public void onPrepare(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
    }

    public void onProgress(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
    }

    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        C7573i.m23587b(downloadInfo, "entity");
        C7573i.m23587b(baseException, "e");
    }

    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        C7573i.m23587b(downloadInfo, "entity");
        C7573i.m23587b(baseException, "e");
    }

    public void onStart(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
    }
}
