package com.p280ss.android.ugc.aweme.story.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.model.StoryResponse */
public class StoryResponse extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "enable_auto_open_window")
    public int autoOpenWindow = 1;
    @C6593c(mo15949a = "commerce_story_feed")
    C41999a commerceStoryFeed;
    @C6593c(mo15949a = "cursor")
    long cursor;
    @C6593c(mo15949a = "has_more")
    boolean hasMore;
    @C6593c(mo15949a = "latest_time")
    int latestTime;
    @C6593c(mo15949a = "request_id")
    String requestId;
    @C6593c(mo15949a = "story_feed")
    List<Story> storyFeed;
    @C6593c(mo15949a = "type")
    int type;

    /* renamed from: com.ss.android.ugc.aweme.story.model.StoryResponse$a */
    public static class C41999a {
        @C6593c(mo15949a = "entry_icon")

        /* renamed from: a */
        public UrlModel f109087a;
        @C6593c(mo15949a = "entry_text")

        /* renamed from: b */
        public String f109088b;
        @C6593c(mo15949a = "entry_open_url")

        /* renamed from: c */
        public String f109089c;
        @C6593c(mo15949a = "entry_web_url")

        /* renamed from: d */
        public String f109090d;
        @C6593c(mo15949a = "entry_web_title")

        /* renamed from: e */
        public String f109091e;
        @C6593c(mo15949a = "auto_open_window")

        /* renamed from: f */
        public boolean f109092f;
        @C6593c(mo15949a = "bubble_color")

        /* renamed from: g */
        public String f109093g;
        @C6593c(mo15949a = "bubble_text")

        /* renamed from: h */
        public String f109094h;
    }

    public C41999a getCommerceStoryFeed() {
        return this.commerceStoryFeed;
    }

    public long getCursor() {
        return this.cursor;
    }

    public int getLatestTime() {
        return this.latestTime;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public List<Story> getStoryFeed() {
        return this.storyFeed;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLatestTime(int i) {
        this.latestTime = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setStatusCode(int i) {
        this.status_code = i;
    }

    public void setStoryFeed(List<Story> list) {
        this.storyFeed = list;
    }
}
