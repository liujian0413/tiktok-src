package com.p280ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTExternNetLoaderListener */
public interface TTExternNetLoaderListener {
    void onComplete(TTExternResponseInfo tTExternResponseInfo);

    void onFailed(String str, Throwable th);
}
