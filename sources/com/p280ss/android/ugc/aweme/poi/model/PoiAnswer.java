package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiAnswer */
public final class PoiAnswer implements Serializable {
    @C6593c(mo15949a = "answer_id")
    private final String answerId;
    @C6593c(mo15949a = "text")
    private final String content;
    @C6593c(mo15949a = "create_time")
    private final long createTime;
    @C6593c(mo15949a = "is_user_digg")
    private final Boolean isUserLike;
    @C6593c(mo15949a = "digg_count")
    private final Integer likeAmounts;
    @C6593c(mo15949a = "poi_id")
    private final String poiId;
    @C6593c(mo15949a = "status")
    private final int status;
    @C6593c(mo15949a = "user")
    private final User user;
    @C6593c(mo15949a = "user_label_text")
    private final String userLabelText;
    @C6593c(mo15949a = "user_label_type")
    private final String userLabelType;

    public static /* synthetic */ PoiAnswer copy$default(PoiAnswer poiAnswer, String str, String str2, String str3, long j, int i, User user2, String str4, String str5, Integer num, Boolean bool, int i2, Object obj) {
        PoiAnswer poiAnswer2 = poiAnswer;
        int i3 = i2;
        return poiAnswer.copy((i3 & 1) != 0 ? poiAnswer2.poiId : str, (i3 & 2) != 0 ? poiAnswer2.answerId : str2, (i3 & 4) != 0 ? poiAnswer2.content : str3, (i3 & 8) != 0 ? poiAnswer2.createTime : j, (i3 & 16) != 0 ? poiAnswer2.status : i, (i3 & 32) != 0 ? poiAnswer2.user : user2, (i3 & 64) != 0 ? poiAnswer2.userLabelText : str4, (i3 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? poiAnswer2.userLabelType : str5, (i3 & 256) != 0 ? poiAnswer2.likeAmounts : num, (i3 & 512) != 0 ? poiAnswer2.isUserLike : bool);
    }

    public final String component1() {
        return this.poiId;
    }

    public final Boolean component10() {
        return this.isUserLike;
    }

    public final String component2() {
        return this.answerId;
    }

    public final String component3() {
        return this.content;
    }

    public final long component4() {
        return this.createTime;
    }

    public final int component5() {
        return this.status;
    }

    public final User component6() {
        return this.user;
    }

    public final String component7() {
        return this.userLabelText;
    }

    public final String component8() {
        return this.userLabelType;
    }

    public final Integer component9() {
        return this.likeAmounts;
    }

    public final PoiAnswer copy(String str, String str2, String str3, long j, int i, User user2, String str4, String str5, Integer num, Boolean bool) {
        String str6 = str;
        C7573i.m23587b(str, "poiId");
        String str7 = str2;
        C7573i.m23587b(str2, "answerId");
        String str8 = str3;
        C7573i.m23587b(str8, C38347c.f99553h);
        User user3 = user2;
        C7573i.m23587b(user3, "user");
        PoiAnswer poiAnswer = new PoiAnswer(str6, str7, str8, j, i, user3, str4, str5, num, bool);
        return poiAnswer;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PoiAnswer) {
                PoiAnswer poiAnswer = (PoiAnswer) obj;
                if (C7573i.m23585a((Object) this.poiId, (Object) poiAnswer.poiId) && C7573i.m23585a((Object) this.answerId, (Object) poiAnswer.answerId) && C7573i.m23585a((Object) this.content, (Object) poiAnswer.content)) {
                    if (this.createTime == poiAnswer.createTime) {
                        if (!(this.status == poiAnswer.status) || !C7573i.m23585a((Object) this.user, (Object) poiAnswer.user) || !C7573i.m23585a((Object) this.userLabelText, (Object) poiAnswer.userLabelText) || !C7573i.m23585a((Object) this.userLabelType, (Object) poiAnswer.userLabelType) || !C7573i.m23585a((Object) this.likeAmounts, (Object) poiAnswer.likeAmounts) || !C7573i.m23585a((Object) this.isUserLike, (Object) poiAnswer.isUserLike)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAnswerId() {
        return this.answerId;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final Integer getLikeAmounts() {
        return this.likeAmounts;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserLabelText() {
        return this.userLabelText;
    }

    public final String getUserLabelType() {
        return this.userLabelType;
    }

    public final int hashCode() {
        String str = this.poiId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.answerId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.content;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j = this.createTime;
        int i2 = (((hashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.status) * 31;
        User user2 = this.user;
        int hashCode4 = (i2 + (user2 != null ? user2.hashCode() : 0)) * 31;
        String str4 = this.userLabelText;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.userLabelType;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.likeAmounts;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.isUserLike;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode7 + i;
    }

    public final Boolean isUserLike() {
        return this.isUserLike;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiAnswer(poiId=");
        sb.append(this.poiId);
        sb.append(", answerId=");
        sb.append(this.answerId);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", userLabelText=");
        sb.append(this.userLabelText);
        sb.append(", userLabelType=");
        sb.append(this.userLabelType);
        sb.append(", likeAmounts=");
        sb.append(this.likeAmounts);
        sb.append(", isUserLike=");
        sb.append(this.isUserLike);
        sb.append(")");
        return sb.toString();
    }

    public PoiAnswer(String str, String str2, String str3, long j, int i, User user2, String str4, String str5, Integer num, Boolean bool) {
        C7573i.m23587b(str, "poiId");
        C7573i.m23587b(str2, "answerId");
        C7573i.m23587b(str3, C38347c.f99553h);
        C7573i.m23587b(user2, "user");
        this.poiId = str;
        this.answerId = str2;
        this.content = str3;
        this.createTime = j;
        this.status = i;
        this.user = user2;
        this.userLabelText = str4;
        this.userLabelType = str5;
        this.likeAmounts = num;
        this.isUserLike = bool;
    }
}
