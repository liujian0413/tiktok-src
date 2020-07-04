package com.p280ss.android.ugc.aweme.music.p1410ui.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34013b;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.music.ui.api.MusicAwemeApi */
public interface MusicAwemeApi {

    /* renamed from: a */
    public static final C33942a f88569a = C33942a.f88570a;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.api.MusicAwemeApi$a */
    public static final class C33942a {

        /* renamed from: a */
        static final /* synthetic */ C33942a f88570a = new C33942a();

        private C33942a() {
        }

        /* renamed from: a */
        public static MusicAwemeApi m109395a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(MusicAwemeApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…usicAwemeApi::class.java)");
            return (MusicAwemeApi) create;
        }
    }

    @C6457h(mo15740a = "/aweme/v1/similar/music/aweme/")
    C7492s<C34013b> queryRecommendMusicAwemeList(@C6474y(mo15757a = "music_id") String str, @C6474y(mo15757a = "cursor") long j, @C6474y(mo15757a = "count") int i, @C6474y(mo15757a = "enter_from") int i2);
}
