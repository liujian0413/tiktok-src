package com.p280ss.android.ugc.aweme.setting.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.model.FollowTabGuideStruct */
public final class FollowTabGuideStruct implements Serializable {
    @C6593c(mo15949a = "follow_tab_guide_times")
    private int followTabGuideTime;
    @C6593c(mo15949a = "follow_tab_guide_word")
    private String followTabGuideWord = "";

    public final int getFollowTabGuideTime() {
        return this.followTabGuideTime;
    }

    public final String getFollowTabGuideWord() {
        return this.followTabGuideWord;
    }

    public final void setFollowTabGuideTime(int i) {
        this.followTabGuideTime = i;
    }

    public final void setFollowTabGuideWord(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.followTabGuideWord = str;
    }
}
