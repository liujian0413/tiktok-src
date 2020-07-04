package com.p280ss.android.ugc.aweme.story.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.model.DateStory */
public class DateStory {
    @C6593c(mo15949a = "aweme_list")
    List<Aweme> awemeList;
    @C6593c(mo15949a = "story_date")
    long storyDate;

    public List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public long getStoryDate() {
        return this.storyDate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DateStory{storyDate=");
        sb.append(this.storyDate);
        sb.append(", awemeList=");
        sb.append(this.awemeList);
        sb.append('}');
        return sb.toString();
    }

    public void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public void setStoryDate(long j) {
        this.storyDate = j;
    }
}
