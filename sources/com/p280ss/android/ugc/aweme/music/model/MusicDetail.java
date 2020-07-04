package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicDetail */
public class MusicDetail extends BaseResponse {
    @C6593c(mo15949a = "billboard_type")
    public int billboardType;
    @C6593c(mo15949a = "edition_uid")
    public int editionUid;
    @C6593c(mo15949a = "similar_music")
    public List<SimilarMusicInfo> mSimilarMusicList;
    @C6593c(mo15949a = "music_info")
    public Music music;
    @C6593c(mo15949a = "rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @C6593c(mo15949a = "top_bodydance_avatars")
    public List<UrlModel> topBodydanceAvatars;
}
