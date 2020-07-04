package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.user.FansClubData;
import com.google.gson.p276a.C6593c;
import java.util.Map;

public class FansClubMember {
    public static final int OTHER_ROOM = 1;
    public static final int PERSONAL_PROFILE = 0;
    @C6593c(mo15949a = "cur_level_intimacy")
    int curLevelIntimacy;
    @C6593c(mo15949a = "data")
    FansClubData data;
    @C6593c(mo15949a = "intimacy")
    int intimacy;
    @C6593c(mo15949a = "level")
    int level;
    @C6593c(mo15949a = "next_level_intimacy")
    int nextLevelIntimacy;
    @C6593c(mo15949a = "prefer_data")
    Map<Integer, FansClubData> preferData;
    @C6593c(mo15949a = "status")
    int status;

    public int getCurLevelIntimacy() {
        return this.curLevelIntimacy;
    }

    public FansClubData getData() {
        return this.data;
    }

    public int getIntimacy() {
        return this.intimacy;
    }

    public int getLevel() {
        return this.level;
    }

    public int getNextLevelIntimacy() {
        return this.nextLevelIntimacy;
    }

    public Map<Integer, FansClubData> getPreferData() {
        return this.preferData;
    }

    public int getStatus() {
        return this.status;
    }

    public void setCurLevelIntimacy(int i) {
        this.curLevelIntimacy = i;
    }

    public void setData(FansClubData fansClubData) {
        this.data = fansClubData;
    }

    public void setIntimacy(int i) {
        this.intimacy = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setNextLevelIntimacy(int i) {
        this.nextLevelIntimacy = i;
    }

    public void setPreferData(Map<Integer, FansClubData> map) {
        this.preferData = map;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
