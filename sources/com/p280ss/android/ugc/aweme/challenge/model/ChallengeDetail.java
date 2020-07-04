package com.p280ss.android.ugc.aweme.challenge.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeDetail */
public class ChallengeDetail extends BaseResponse {
    @C6593c(mo15949a = "ch_info")
    public Challenge challenge;
    @C6593c(mo15949a = "rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @C6593c(mo15949a = "slide_list")
    public List<Aweme> slideList;
    @C6593c(mo15949a = "slide_title")
    public String slideTitle;
}
