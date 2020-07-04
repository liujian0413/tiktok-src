package com.p280ss.android.ugc.aweme.choosemusic.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23872r;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23874t;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p280ss.android.ugc.aweme.music.model.MusicCollection;
import com.p280ss.android.ugc.aweme.music.model.MusicList;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi */
public final class ChooseMusicApi {

    /* renamed from: a */
    static API f62957a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi$API */
    public interface API {
        @C7730f(mo20420a = "/aweme/v1/music/collect/")
        C1592h<BaseResponse> collectMusic(@C7744t(mo20436a = "music_id") String str, @C7744t(mo20436a = "action") int i);

        @C7730f(mo20420a = "/aweme/v1/hot/music/")
        C1592h<MusicList> getHotMusicList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "/aweme/v1/music/collection/")
        C1592h<MusicCollection> getMusicSheet(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "/aweme/v1/music/recommend/by/video/")
        C1592h<MusicList> getRecommenLyricMusicListFromAI(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "from") String str, @C7744t(mo20436a = "zip_uri") String str2, @C7744t(mo20436a = "music_ailab_ab") String str3, @C7744t(mo20436a = "creation_id") String str4, @C7744t(mo20436a = "scene") String str5);

        @C7730f(mo20420a = "/aweme/v1/music/recommend/by/video/")
        C1592h<MusicList> getRecommenMusicListFromAI(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "from") String str, @C7744t(mo20436a = "zip_uri") String str2, @C7744t(mo20436a = "music_ailab_ab") String str3, @C7744t(mo20436a = "creation_id") String str4, @C7744t(mo20436a = "micro_app_id") String str5);

        @C7730f(mo20420a = "/aweme/v1/sticker/music")
        C1592h<MusicList> getStickerMusic(@C7744t(mo20436a = "sticker") String str);

        @C7730f(mo20420a = "/aweme/v1/music/collection/feed/")
        C1592h<C23872r> musicCollectionFeed(@C7744t(mo20436a = "cursor") Integer num, @C7744t(mo20436a = "count") Integer num2);

        @C7730f(mo20420a = "/aweme/v1/music/list/")
        C1592h<MusicList> musicList(@C7744t(mo20436a = "mc_id") String str, @C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "/aweme/v1/music/pick/")
        C1592h<C23874t> musicPick(@C7744t(mo20436a = "radio_cursor") Integer num, @C7744t(mo20436a = "extra_music_ids") String str, @C7744t(mo20436a = "is_commerce_music") Boolean bool);

        @C7730f(mo20420a = "/aweme/v1/user/music/collect/")
        C1592h<CollectedMusicList> userCollectedMusicList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);
    }

    /* renamed from: a */
    public static API m78099a() {
        return f62957a;
    }
}
