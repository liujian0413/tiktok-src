package com.p280ss.android.ugc.aweme.web.jsbridge;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AuthClickCallBackWeb */
public interface AuthClickCallBackWeb extends Serializable {
    void onClick(String str);

    void onError(String str, String str2);
}
