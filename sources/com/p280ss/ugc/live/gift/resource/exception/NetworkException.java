package com.p280ss.ugc.live.gift.resource.exception;

import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.p1828b.C46213a;

/* renamed from: com.ss.ugc.live.gift.resource.exception.NetworkException */
public class NetworkException extends BaseGetResourceException {
    private C46213a mDownloadRequest;
    private int mErrorCode;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mDownloadRequest.toString());
        sb.append("\n");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public NetworkException(C46220c cVar, int i, C46213a aVar) {
        super(cVar);
        this.mErrorCode = i;
        this.mDownloadRequest = aVar;
    }

    public NetworkException(String str, C46220c cVar, int i, C46213a aVar) {
        super(str, cVar);
        this.mErrorCode = i;
        this.mDownloadRequest = aVar;
    }

    public NetworkException(String str, Throwable th, C46220c cVar, int i, C46213a aVar) {
        super(str, th, cVar);
        this.mErrorCode = i;
        this.mDownloadRequest = aVar;
    }
}
