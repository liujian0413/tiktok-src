package com.p280ss.android.ugc.aweme.favorites.api;

import bolts.C1592h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.favorites.model.C27763b;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27708k;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi */
public final class UserFavoritesApi {

    /* renamed from: a */
    public static final RetrofitApi f73170a = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi$RetrofitApi */
    public interface RetrofitApi {
        @C7730f(mo20420a = "/aweme/v1/aweme/collect/")
        C1592h<BaseResponse> collectAweme(@C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "action") int i);

        @C7730f(mo20420a = "/aweme/v1/challenge/collect/")
        C1592h<BaseResponse> collectChallenge(@C7744t(mo20436a = "ch_id") String str, @C7744t(mo20436a = "action") int i);

        @C7730f(mo20420a = "/aweme/v1/mix/collect/")
        C1592h<BaseResponse> collectMix(@C7744t(mo20436a = "mix_id") String str, @C7744t(mo20436a = "action") int i);

        @C7730f(mo20420a = "/aweme/v1/music/collect/")
        C1592h<BaseResponse> collectMusic(@C7744t(mo20436a = "music_id") String str, @C7744t(mo20436a = "action") int i);

        @C7730f(mo20420a = "/aweme/v1/poi/collect/")
        C1592h<BaseResponse> collectPoi(@C7744t(mo20436a = "poi_id") String str, @C7744t(mo20436a = "action") int i);

        @C7730f(mo20420a = "/aweme/v2/shop/seeding/collect/")
        C1592h<BaseResponse> collectSeeding(@C7744t(mo20436a = "seed_id") String str, @C7744t(mo20436a = "operate_type") int i, @C7744t(mo20436a = "user_id") String str2);

        @C7730f(mo20420a = "/aweme/v1/aweme/listcollection/")
        C1592h<BaseResponse> fetchCollectAwemeList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "/aweme/v1/challenge/listcollection/")
        C1592h<C27763b> fetchCollectChallengeList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "/aweme/v1/music/listcollection/")
        C1592h<BaseResponse> fetchCollectMusicList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "/aweme/v1/poi/listcollection/")
        C1592h<Object> fetchCollectPoiList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "longitude") String str, @C7744t(mo20436a = "latitude") String str2);

        @C7730f(mo20420a = "/aweme/v1/sticker/listcollection/")
        C1592h<C27708k> fetchStickerList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);
    }

    /* renamed from: a */
    public static C27763b m90940a(int i, int i2) {
        C1592h fetchCollectChallengeList = f73170a.fetchCollectChallengeList(i, i2);
        try {
            fetchCollectChallengeList.mo6892g();
        } catch (InterruptedException unused) {
        }
        if (fetchCollectChallengeList.mo6889d()) {
            try {
                throw fetchCollectChallengeList.mo6891f();
            } catch (Exception unused2) {
            }
        }
        return (C27763b) fetchCollectChallengeList.mo6890e();
    }

    /* renamed from: b */
    public static C27708k m90941b(int i, int i2) {
        C1592h fetchStickerList = f73170a.fetchStickerList(i, i2);
        try {
            fetchStickerList.mo6892g();
        } catch (InterruptedException unused) {
        }
        if (fetchStickerList.mo6889d()) {
            try {
                throw fetchStickerList.mo6891f();
            } catch (Exception unused2) {
            }
        }
        return (C27708k) fetchStickerList.mo6890e();
    }
}
