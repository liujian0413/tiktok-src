package com.p280ss.android.socialbase.downloader.depend;

import com.C1642a;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;

/* renamed from: com.ss.android.socialbase.downloader.depend.AbsDownloadListener */
public abstract class AbsDownloadListener implements IDownloadListener {
    private static final String TAG = "AbsDownloadListener";

    public void onCanceled(DownloadInfo downloadInfo) {
        if (C20190a.m66501a() && downloadInfo != null) {
            new StringBuilder(" onCanceled -- ").append(downloadInfo.getName());
        }
    }

    public void onFirstStart(DownloadInfo downloadInfo) {
        if (C20190a.m66501a() && downloadInfo != null) {
            new StringBuilder(" onFirstStart -- ").append(downloadInfo.getName());
        }
    }

    public void onFirstSuccess(DownloadInfo downloadInfo) {
        if (C20190a.m66501a() && downloadInfo != null) {
            new StringBuilder(" onFirstSuccess -- ").append(downloadInfo.getName());
        }
    }

    public void onIntercept(DownloadInfo downloadInfo) {
        if (C20190a.m66501a() && downloadInfo != null) {
            new StringBuilder(" onIntercept -- ").append(downloadInfo.getName());
        }
    }

    public void onPause(DownloadInfo downloadInfo) {
        if (C20190a.m66501a() && downloadInfo != null) {
            new StringBuilder(" onPause -- ").append(downloadInfo.getName());
        }
    }

    public void onPrepare(DownloadInfo downloadInfo) {
        if (C20190a.m66501a() && downloadInfo != null) {
            new StringBuilder(" onPrepare -- ").append(downloadInfo.getName());
        }
    }

    public void onStart(DownloadInfo downloadInfo) {
        if (C20190a.m66501a() && downloadInfo != null) {
            new StringBuilder(" onStart -- ").append(downloadInfo.getName());
        }
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
        if (C20190a.m66501a() && downloadInfo != null) {
            new StringBuilder(" onSuccessed -- ").append(downloadInfo.getName());
        }
    }

    public void onProgress(DownloadInfo downloadInfo) {
        if (C20190a.m66501a() && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
            int curBytes = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
            StringBuilder sb = new StringBuilder();
            sb.append(downloadInfo.getName());
            sb.append(" onProgress -- %");
            sb.append(curBytes);
        }
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C20190a.m66501a() && downloadInfo != null) {
            String str2 = "onFailed on %s because of : %s";
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C1642a.m8034a(str2, objArr);
        }
    }

    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C20190a.m66501a() && downloadInfo != null) {
            String str2 = "onRetry on %s because of : %s";
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C1642a.m8034a(str2, objArr);
        }
    }

    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C20190a.m66501a() && downloadInfo != null) {
            String str2 = "onRetryDelay on %s because of : %s";
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C1642a.m8034a(str2, objArr);
        }
    }
}
