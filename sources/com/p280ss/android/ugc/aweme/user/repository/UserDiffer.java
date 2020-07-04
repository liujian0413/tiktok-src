package com.p280ss.android.ugc.aweme.user.repository;

import android.support.p029v7.util.C1143a.C1147c;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.user.repository.UserDiffer */
public final class UserDiffer extends C1147c<User> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
        return m135995a((User) obj, (User) obj2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
        return m135996b((User) obj, (User) obj2);
    }

    /* renamed from: a */
    private static boolean m135995a(User user, User user2) {
        C7573i.m23587b(user, "p0");
        C7573i.m23587b(user2, "p1");
        return TextUtils.equals(user.getUid(), user2.getUid());
    }

    /* renamed from: b */
    private static boolean m135996b(User user, User user2) {
        C7573i.m23587b(user, "p0");
        C7573i.m23587b(user2, "p1");
        return TextUtils.equals(user.getUid(), user2.getUid());
    }
}
