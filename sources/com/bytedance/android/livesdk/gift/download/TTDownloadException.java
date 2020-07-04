package com.bytedance.android.livesdk.gift.download;

import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.exception.BaseGetResourceException;
import com.p280ss.ugc.live.gift.resource.p1828b.C46213a;

public class TTDownloadException extends BaseGetResourceException {
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

    public TTDownloadException(String str, Throwable th, C46220c cVar, int i, C46213a aVar) {
        super(str, th, cVar);
        this.mErrorCode = i;
        this.mDownloadRequest = aVar;
    }
}
