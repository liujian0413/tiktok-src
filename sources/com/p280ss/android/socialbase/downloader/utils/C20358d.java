package com.p280ss.android.socialbase.downloader.utils;

import android.util.SparseArray;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.utils.d */
public final class C20358d {
    /* renamed from: a */
    public static void m67537a(int i, SparseArray<IDownloadListener> sparseArray, boolean z, DownloadInfo downloadInfo, BaseException baseException) {
        SparseArray clone;
        if (z && sparseArray != null) {
            try {
                if (sparseArray.size() > 0) {
                    synchronized (sparseArray) {
                        clone = sparseArray.clone();
                    }
                    for (int i2 = 0; i2 < clone.size(); i2++) {
                        IDownloadListener iDownloadListener = (IDownloadListener) clone.get(clone.keyAt(i2));
                        if (iDownloadListener != null) {
                            switch (i) {
                                case -7:
                                    if (!(iDownloadListener instanceof AbsDownloadListener)) {
                                        break;
                                    } else {
                                        ((AbsDownloadListener) iDownloadListener).onIntercept(downloadInfo);
                                        break;
                                    }
                                case -6:
                                    iDownloadListener.onFirstSuccess(downloadInfo);
                                    break;
                                case -5:
                                case -2:
                                    iDownloadListener.onPause(downloadInfo);
                                    break;
                                case -4:
                                    iDownloadListener.onCanceled(downloadInfo);
                                    break;
                                case ImageFrame.NV21 /*-3*/:
                                    iDownloadListener.onSuccessed(downloadInfo);
                                    break;
                                case -1:
                                    iDownloadListener.onFailed(downloadInfo, baseException);
                                    break;
                                case 1:
                                    iDownloadListener.onPrepare(downloadInfo);
                                    break;
                                case 2:
                                    iDownloadListener.onStart(downloadInfo);
                                    break;
                                case 4:
                                    iDownloadListener.onProgress(downloadInfo);
                                    break;
                                case 5:
                                    iDownloadListener.onRetry(downloadInfo, baseException);
                                    break;
                                case 6:
                                    iDownloadListener.onFirstStart(downloadInfo);
                                    break;
                                case 7:
                                    iDownloadListener.onRetryDelay(downloadInfo, baseException);
                                    break;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
