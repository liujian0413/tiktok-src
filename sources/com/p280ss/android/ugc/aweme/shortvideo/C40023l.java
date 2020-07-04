package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.l */
public interface C40023l<T extends C38455ap> {
    void onError(VideoPublishException videoPublishException);

    void onProgressUpdate(int i, boolean z);

    void onSuccess(T t, boolean z);

    void onSynthetiseSuccess(String str);
}
