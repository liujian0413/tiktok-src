package com.p280ss.android.ugc.aweme.story.api.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.api.model.DailyStory */
public class DailyStory implements Serializable {
    @C6593c(mo15949a = "date")
    long date;
    @C6593c(mo15949a = "story_list")
    List<AwemeWithComment> storyList;

    public long getDate() {
        return this.date;
    }

    public List<AwemeWithComment> getStoryList() {
        return this.storyList;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setStoryList(List<AwemeWithComment> list) {
        this.storyList = list;
    }
}
