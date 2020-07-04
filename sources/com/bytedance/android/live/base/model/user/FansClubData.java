package com.bytedance.android.live.base.model.user;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;
import java.util.List;
import java.util.Map;

public class FansClubData {
    public static final int BADGE_ICON_NORMAL = 1;
    public static final int BADGE_ICON_SMALL = 2;
    @C6593c(mo15949a = "anchor_id")
    public long anchorId;
    @C6593c(mo15949a = "available_gift_ids")
    public List<Long> availableGiftIds;
    @C6593c(mo15949a = "badge")
    public UserBadge badge;
    @C6593c(mo15949a = "club_name")
    public String clubName;
    @C6593c(mo15949a = "level")
    public int level;
    @C6593c(mo15949a = "user_fans_club_status")
    public int userFansClubStatus;

    public static class UserBadge {
        @C6593c(mo15949a = "icons")
        public Map<Integer, ImageModel> icons;
        @C6593c(mo15949a = "title")
        public String title;
    }

    public static boolean isValid(FansClubData fansClubData) {
        if (fansClubData == null || TextUtils.isEmpty(fansClubData.clubName)) {
            return false;
        }
        return true;
    }
}
