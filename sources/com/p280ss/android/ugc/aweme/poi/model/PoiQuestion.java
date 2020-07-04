package com.p280ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiQuestion */
public final class PoiQuestion implements Serializable {
    @C6593c(mo15949a = "answer_total_count")
    private final int answerAmounts;
    @C6593c(mo15949a = "answers")
    private final List<PoiAnswer> answers;
    @C6593c(mo15949a = "text")
    private final String content;
    @C6593c(mo15949a = "create_time")
    private final long createTime;
    @C6593c(mo15949a = "follow_count")
    private Integer followCount;
    @C6593c(mo15949a = "is_user_follow")
    private final boolean isUserFollow;
    @C6593c(mo15949a = "poi_id")
    private final String poiId;
    @C6593c(mo15949a = "question_id")
    private final String questionId;
    @C6593c(mo15949a = "status")
    private final int status;
    @C6593c(mo15949a = "user")
    private final User user;

    public final int getAnswerAmounts() {
        return this.answerAmounts;
    }

    public final List<PoiAnswer> getAnswers() {
        return this.answers;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final Integer getFollowCount() {
        return this.followCount;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean isUserFollow() {
        return this.isUserFollow;
    }

    public final String getUserId() {
        if (TextUtils.isEmpty(this.user.getUid())) {
            return "";
        }
        String uid = this.user.getUid();
        C7573i.m23582a((Object) uid, "user.uid");
        return uid;
    }

    public final void setFollowCount(Integer num) {
        this.followCount = num;
    }

    public PoiQuestion(String str, String str2, String str3, long j, Integer num, int i, User user2, List<PoiAnswer> list, int i2, boolean z) {
        C7573i.m23587b(str, "poiId");
        C7573i.m23587b(str2, "questionId");
        C7573i.m23587b(str3, C38347c.f99553h);
        C7573i.m23587b(user2, "user");
        C7573i.m23587b(list, "answers");
        this.poiId = str;
        this.questionId = str2;
        this.content = str3;
        this.createTime = j;
        this.followCount = num;
        this.status = i;
        this.user = user2;
        this.answers = list;
        this.answerAmounts = i2;
        this.isUserFollow = z;
    }

    public /* synthetic */ PoiQuestion(String str, String str2, String str3, long j, Integer num, int i, User user2, List list, int i2, boolean z, int i3, C7571f fVar) {
        List list2;
        int i4;
        boolean z2;
        int i5 = i3;
        if ((i5 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            list2 = new ArrayList();
        } else {
            list2 = list;
        }
        if ((i5 & 256) != 0) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        if ((i5 & 512) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, str2, str3, j, num, i, user2, list2, i4, z2);
    }
}
