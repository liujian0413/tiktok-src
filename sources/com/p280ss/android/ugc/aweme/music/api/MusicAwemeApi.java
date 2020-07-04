package com.p280ss.android.ugc.aweme.music.api;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p280ss.android.ugc.aweme.music.model.OriginalMusicList;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.music.api.MusicAwemeApi */
public final class MusicAwemeApi {

    /* renamed from: a */
    private static final MusicService f88110a = ((MusicService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(MusicService.class));

    /* renamed from: b */
    private static final String f88111b;

    /* renamed from: c */
    private static final String f88112c;

    /* renamed from: com.ss.android.ugc.aweme.music.api.MusicAwemeApi$MusicService */
    public interface MusicService {
        @C6456g
        @C6468s(mo15750a = "/aweme/v1/music/create/")
        C12466b<String> createMusic(@C6455f Map<String, String> map);

        @C6457h(mo15740a = "/aweme/v1/original/music/list/")
        C18253l<OriginalMusicList> fetchOriginalMusicList(@C6474y(mo15757a = "user_id") String str, @C6474y(mo15757a = "cursor") int i, @C6474y(mo15757a = "count") int i2);

        @C6457h
        C18253l<MusicAwemeList> queryMusicAwemeList(@C6450ac String str, @C6474y(mo15757a = "music_id") String str2, @C6474y(mo15757a = "cursor") long j, @C6474y(mo15757a = "count") int i, @C6474y(mo15757a = "type") int i2);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/music/aweme/");
        f88111b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Api.f60502b);
        sb2.append("/aweme/v1/music/fresh/aweme/");
        f88112c = sb2.toString();
    }

    /* renamed from: a */
    public static OriginalMusicList m108893a(String str, int i, int i2) throws Exception {
        return (OriginalMusicList) f88110a.fetchOriginalMusicList(str, i, i2).get();
    }

    /* renamed from: a */
    public static MusicAwemeList m108892a(String str, long j, int i, int i2) throws Exception {
        String str2;
        if (i2 == 0) {
            str2 = f88111b;
        } else {
            str2 = f88112c;
        }
        String str3 = str2;
        MusicService musicService = f88110a;
        if (str != null) {
            str = str.trim();
        }
        return (MusicAwemeList) musicService.queryMusicAwemeList(str3, str, j, i, i2).get();
    }
}
