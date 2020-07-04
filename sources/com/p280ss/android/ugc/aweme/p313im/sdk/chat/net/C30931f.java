package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.Response;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.f */
public final class C30931f {

    /* renamed from: a */
    public C30933a f81012a;

    /* renamed from: b */
    private OkHttpClient f81013b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.f$a */
    public interface C30933a {
        /* renamed from: a */
        void mo80605a(String str, UrlModel urlModel);

        /* renamed from: a */
        void mo80606a(Throwable th);
    }

    public C30931f(OkHttpClient okHttpClient) {
        this.f81013b = okHttpClient;
    }

    /* renamed from: a */
    private void m100689a(Throwable th) {
        if (this.f81012a != null) {
            this.f81012a.mo80606a(th);
        }
    }

    /* renamed from: b */
    private static boolean m100690b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return true;
    }

    /* renamed from: a */
    private Request m100688a(String str) {
        Request build = new Builder().url(str).addHeader("Host", URI.create(str).getHost()).build();
        if (this.f81013b == null) {
            this.f81013b = new OkHttpClient();
        }
        this.f81013b.setConnectTimeout(60000, TimeUnit.MILLISECONDS);
        this.f81013b.setWriteTimeout(60000, TimeUnit.MILLISECONDS);
        this.f81013b.setReadTimeout(60000, TimeUnit.MILLISECONDS);
        this.f81013b.setRetryOnConnectionFailure(true);
        return build;
    }

    /* renamed from: a */
    public final Response mo81290a(String str, UrlModel urlModel) {
        Response response = null;
        if (!m100691b(str, urlModel)) {
            return null;
        }
        for (int i = 0; i < urlModel.getUrlList().size(); i++) {
            try {
                response = this.f81013b.newCall(m100688a((String) urlModel.getUrlList().get(i))).execute();
            } catch (Exception unused) {
            }
            if (response != null && response.isSuccessful()) {
                break;
            }
        }
        return response;
    }

    /* renamed from: b */
    private boolean m100691b(String str, UrlModel urlModel) {
        if (!C30934g.m100696a(C6399b.m19921a())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.bna).mo25750a();
            m100689a((Throwable) new IllegalStateException("network is unavailable"));
            return false;
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            m100689a((Throwable) new IllegalStateException("url is null"));
            return false;
        } else {
            m100690b(str);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo81291a(String str, String str2, UrlModel urlModel) {
        String str3 = str;
        if (m100691b(str3, urlModel)) {
            boolean z = true;
            boolean[] zArr = {true};
            int i = 0;
            while (zArr[0] && i < urlModel.getUrlList().size()) {
                CountDownLatch countDownLatch = new CountDownLatch(z ? 1 : 0);
                String str4 = (String) urlModel.getUrlList().get(i);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new HttpHeader("Host", URI.create(str4).getHost()));
                DownloadTask retryCount = Downloader.with(C6399b.m19921a()).url(str4).name(str2).savePath(str3).extraHeaders(arrayList).force(z).retryCount(3);
                final String str5 = str;
                final String str6 = str2;
                final boolean[] zArr2 = zArr;
                C309321 r9 = r0;
                final CountDownLatch countDownLatch2 = countDownLatch;
                C309321 r0 = new IDownloadListener() {
                    public final void onFirstStart(DownloadInfo downloadInfo) {
                    }

                    public final void onFirstSuccess(DownloadInfo downloadInfo) {
                    }

                    public final void onPause(DownloadInfo downloadInfo) {
                    }

                    public final void onPrepare(DownloadInfo downloadInfo) {
                    }

                    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    }

                    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                    }

                    public final void onStart(DownloadInfo downloadInfo) {
                    }

                    public final void onProgress(DownloadInfo downloadInfo) {
                        downloadInfo.getCurBytes();
                        downloadInfo.getTotalBytes();
                    }

                    public final void onCanceled(DownloadInfo downloadInfo) {
                        zArr2[0] = false;
                        countDownLatch2.countDown();
                    }

                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        C30931f.this.f81012a.mo80605a(new File(str5, str6).getAbsolutePath(), null);
                        zArr2[0] = false;
                        countDownLatch2.countDown();
                    }

                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        C30931f.this.f81012a.mo80606a(baseException);
                        zArr2[0] = true;
                        countDownLatch2.countDown();
                    }
                };
                retryCount.mainThreadListener(r9).download();
                try {
                    countDownLatch.await();
                    i++;
                    z = true;
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
