package com.p280ss.android.socialbase.downloader.p906d;

import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.network.C20344c;

/* renamed from: com.ss.android.socialbase.downloader.d.e */
public interface C20203e {
    /* renamed from: a */
    RetryCheckStatus mo54092a(BaseException baseException, long j);

    /* renamed from: a */
    RetryCheckStatus mo54093a(DownloadChunk downloadChunk, BaseException baseException, long j);

    /* renamed from: a */
    DownloadChunk mo54094a(int i);

    /* renamed from: a */
    void mo54096a(C20197b bVar);

    /* renamed from: a */
    void mo54097a(BaseException baseException, boolean z);

    /* renamed from: a */
    void mo54098a(C20344c cVar);

    /* renamed from: a */
    boolean mo54100a(long j);

    /* renamed from: a */
    boolean mo54101a(BaseException baseException);

    /* renamed from: b */
    void mo54103b(BaseException baseException);

    /* renamed from: c */
    void mo54104c(BaseException baseException);
}
