package com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockStickerApi */
public final class UnlockStickerApi {

    /* renamed from: a */
    static final RetrofitApi f106463a = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockStickerApi$RetrofitApi */
    interface RetrofitApi {
        @C7729e
        @C7739o(mo20429a = "https://api2.musical.ly/aweme/v1/ug/event/record/")
        C18253l<C40960g> unlockSticker(@C7727c(mo20417a = "event_type") int i, @C7727c(mo20417a = "extra") String str);
    }

    /* renamed from: a */
    public static C18253l<C40960g> m130814a(String str) {
        return f106463a.unlockSticker(1, str);
    }
}
