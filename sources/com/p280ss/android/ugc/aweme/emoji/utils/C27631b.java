package com.p280ss.android.ugc.aweme.emoji.utils;

import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.b */
public final class C27631b {

    /* renamed from: a */
    private static EmojiApi f72812a;

    /* renamed from: a */
    public static EmojiApi m90586a() {
        return f72812a;
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            f72812a = (EmojiApi) iRetrofitService.createNewRetrofit("https://api2.musical.ly/aweme/v1/").create(EmojiApi.class);
        }
    }
}
