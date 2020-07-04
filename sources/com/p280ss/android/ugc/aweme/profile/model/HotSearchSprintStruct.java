package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct */
public class HotSearchSprintStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @C6593c(mo15949a = "followers")
    public List<User> hitRankPeoples;
    @C6593c(mo15949a = "sprint")
    public int sprint;

    public List<User> getHitRankPeoples() {
        return this.hitRankPeoples;
    }

    public int getSprint() {
        return this.sprint;
    }

    public void setHitRankPeoples(List<User> list) {
        this.hitRankPeoples = list;
    }

    public void setSprint(int i) {
        this.sprint = i;
    }
}
