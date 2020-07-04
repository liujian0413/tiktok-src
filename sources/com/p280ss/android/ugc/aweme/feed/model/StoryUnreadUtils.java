package com.p280ss.android.ugc.aweme.feed.model;

import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

/* renamed from: com.ss.android.ugc.aweme.feed.model.StoryUnreadUtils */
public class StoryUnreadUtils {
    public static boolean hasUnreadStory(User user) {
        if (user == null || user.isHasUnreadStory() == null) {
            return false;
        }
        return user.isHasUnreadStory().booleanValue();
    }

    public static boolean hasUnreadStoryWithCheck(User user, User user2) {
        if (C43122ff.m136787r(user2) && C43122ff.m136787r(user) && user.isHasUnreadStory() != null) {
            user2.setHasUnreadStory(user.isHasUnreadStory().booleanValue());
        }
        return hasUnreadStory(user2);
    }
}
