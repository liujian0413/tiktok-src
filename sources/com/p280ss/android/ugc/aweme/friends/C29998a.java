package com.p280ss.android.ugc.aweme.friends;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.a */
public final class C29998a {
    /* renamed from: a */
    private static boolean m98353a(User user, User user2) {
        if (user == null || user2 == null) {
            return false;
        }
        return TextUtils.equals(user.getUid(), user2.getUid());
    }

    /* renamed from: a */
    public static int m98352a(List<User> list, User user) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (m98353a((User) list.get(i), user)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m98355b(List<User> list, User user) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (User user2 : list) {
            if (m98353a(user2, user)) {
                return list.remove(user2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m98354a(Collection<User> collection, User user) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        for (User a : collection) {
            if (m98353a(a, user)) {
                return true;
            }
        }
        return false;
    }
}
