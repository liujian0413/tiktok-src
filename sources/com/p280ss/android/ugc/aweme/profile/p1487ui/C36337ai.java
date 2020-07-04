package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ai */
public final class C36337ai {
    /* renamed from: a */
    public static boolean m117567a(User user) {
        return m117570c(user);
    }

    /* renamed from: b */
    public static int m117568b(User user) {
        if (user == null) {
            return 0;
        }
        if (m117567a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    /* renamed from: a */
    public static List<FollowerDetail> m117566a(List<FollowerDetail> list) {
        ArrayList arrayList = new ArrayList();
        if (C6307b.m19566a((Collection<T>) list)) {
            return arrayList;
        }
        arrayList.clear();
        arrayList.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FollowerDetail followerDetail = (FollowerDetail) it.next();
            if (followerDetail != null && followerDetail.getFansCount() <= 0) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static FollowerDetail m117569b(List<FollowerDetail> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        for (FollowerDetail followerDetail : list) {
            if (followerDetail != null && TextUtils.equals(followerDetail.getPackageName(), "com.ss.android.ugc.aweme")) {
                return followerDetail;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m117570c(User user) {
        if (user == null || C6307b.m19566a((Collection<T>) user.getFollowerDetailList())) {
            return false;
        }
        List a = m117566a(user.getFollowerDetailList());
        if (!C6307b.m19566a((Collection<T>) a) && a.size() > 1) {
            return true;
        }
        return false;
    }
}
