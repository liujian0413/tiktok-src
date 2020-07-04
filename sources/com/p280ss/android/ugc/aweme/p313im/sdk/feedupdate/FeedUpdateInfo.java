package com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdateInfo */
public class FeedUpdateInfo {
    @C6593c(mo15949a = "last_aweme_info")

    /* renamed from: a */
    Object f81842a;
    @C6593c(mo15949a = "aweme_id")
    String aid;
    @C6593c(mo15949a = "author")
    User author;
    @C6593c(mo15949a = "create_time")
    long timeStamp;
    @C6593c(mo15949a = "desc")
    String title;
    @C6593c(mo15949a = "video")
    C31205a videoTemp;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdateInfo$a */
    class C31205a {
        @C6593c(mo15949a = "cover")

        /* renamed from: a */
        public UrlModel f81843a;
    }

    public String getAid() {
        return this.aid;
    }

    public User getAuthor() {
        return this.author;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String getTitle() {
        return this.title;
    }

    public C31205a getVideoTemp() {
        return this.videoTemp;
    }

    public UrlModel getCoverUrl() {
        if (this.videoTemp == null) {
            return null;
        }
        return this.videoTemp.f81843a;
    }

    public String getUid() {
        if (this.author == null) {
            return null;
        }
        return this.author.getUid();
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVideoTemp(C31205a aVar) {
        this.videoTemp = aVar;
    }
}
