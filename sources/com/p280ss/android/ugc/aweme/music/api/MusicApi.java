package com.p280ss.android.ugc.aweme.music.api;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.C33762b;
import com.p280ss.android.ugc.aweme.music.C33762b.C33765a;
import com.p280ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p280ss.android.ugc.aweme.music.model.MusicCollection;
import com.p280ss.android.ugc.aweme.music.model.MusicList;
import com.p280ss.android.ugc.aweme.music.model.SimpleMusicDetail;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import java.util.HashMap;
import java.util.Map;
import okhttp3.RequestBody;

/* renamed from: com.ss.android.ugc.aweme.music.api.MusicApi */
public final class MusicApi {

    /* renamed from: a */
    private static final MusicService f88109a = ((MusicService) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(TutorialVideoApiManager.f89507a).mo26430a().mo26435a(MusicService.class));

    /* renamed from: com.ss.android.ugc.aweme.music.api.MusicApi$MusicService */
    public interface MusicService {
        @C6457h(mo15740a = "/aweme/v1/music/collection/")
        C18253l<MusicCollection> fetchMusicCollection(@C6474y(mo15757a = "cursor") long j, @C6474y(mo15757a = "count") int i);

        @C6457h(mo15740a = "/aweme/v1/music/pick/")
        C18253l<MusicList> fetchMusicHotList(@C6474y(mo15757a = "radio_cursor") long j);

        @C6457h(mo15740a = "/aweme/v1/music/list/")
        C18253l<MusicList> fetchMusicList(@C6474y(mo15757a = "mc_id") String str, @C6474y(mo15757a = "cursor") long j, @C6474y(mo15757a = "count") int i);

        @C6457h(mo15740a = "/aweme/v1/music/beats/songs/")
        C18253l<com.p280ss.android.ugc.aweme.shortvideo.model.MusicList> fetchStickPointMusicList(@C6474y(mo15757a = "cursor") int i, @C6474y(mo15757a = "count") int i2, @C6474y(mo15757a = "video_count") int i3, @C6474y(mo15757a = "video_duration") String str);

        @C6457h(mo15740a = "/aweme/v1/user/music/collect/")
        C18253l<CollectedMusicList> fetchUserCollectedMusicList(@C6474y(mo15757a = "cursor") int i, @C6474y(mo15757a = "count") int i2);

        @C6457h(mo15740a = "/aweme/v1/music/detail/")
        C18253l<SimpleMusicDetail> queryMusic(@C6474y(mo15757a = "music_id") String str, @C6474y(mo15757a = "click_reason") int i);

        @C6468s(mo15750a = "/aweme/v1/upload/file/")
        C1592h<String> uploadLocalMusic(@C6451b RequestBody requestBody);

        @C6456g
        @C6468s(mo15750a = "/aweme/v1/music/user/create/")
        C12466b<String> uploadLocalMusicInfo(@C6455f Map<String, String> map);
    }

    /* renamed from: a */
    public static C1592h<String> m108883a(RequestBody requestBody) {
        return f88109a.uploadLocalMusic(requestBody);
    }

    /* renamed from: a */
    public static CollectedMusicList m108884a(int i, int i2) throws Exception {
        return (CollectedMusicList) f88109a.fetchUserCollectedMusicList(i, i2).get();
    }

    /* renamed from: b */
    public static MusicCollection m108891b(int i, int i2) throws Exception {
        return (MusicCollection) f88109a.fetchMusicCollection((long) i, i2).get();
    }

    /* renamed from: a */
    public static MusicList m108885a(long j, int i) throws Exception {
        return (MusicList) f88109a.fetchMusicHotList(j).get();
    }

    /* renamed from: a */
    public static SimpleMusicDetail m108887a(String str, int i) throws Exception {
        MusicService musicService = f88109a;
        if (str != null) {
            str = str.trim();
        }
        return (SimpleMusicDetail) musicService.queryMusic(str, i).get();
    }

    /* renamed from: a */
    public static void m108890a(String str, C33765a aVar) throws Exception {
        C33762b.m108899a(str, "https://api2.musical.ly/aweme/v1/upload/file/", aVar);
    }

    /* renamed from: a */
    public static MusicList m108886a(String str, int i, int i2) throws Exception {
        return (MusicList) f88109a.fetchMusicList(str, (long) i, i2).get();
    }

    /* renamed from: a */
    public static com.p280ss.android.ugc.aweme.shortvideo.model.MusicList m108888a(int i, int i2, int i3, String str) throws Exception {
        return (com.p280ss.android.ugc.aweme.shortvideo.model.MusicList) f88109a.fetchStickPointMusicList(i, i2, i3, str).get();
    }

    /* renamed from: a */
    public static String m108889a(int i, String str, String str2, String str3) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("upload_type", String.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("song_uri", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("source_url", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("title", str3);
        }
        NetUtil.putCommonParams(hashMap, true);
        f88109a.uploadLocalMusicInfo(hashMap).execute();
        return str3;
    }
}
