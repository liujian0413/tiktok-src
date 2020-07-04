package com.p280ss.android.ugc.aweme.services;

import android.content.Context;
import com.p280ss.android.common.config.AppConfig;
import com.p280ss.android.ugc.aweme.utils.C43120fd;
import com.p280ss.android.ugc.awemepushapi.C43587a;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceForPush */
public class MainServiceForPush implements C43587a {
    public String getDefaultUninstallQuestionUrl() {
        return C43120fd.m136749a().toString();
    }

    public String filterUrl(Context context, String str) {
        return AppConfig.getInstance(context).filterUrl(str);
    }
}
