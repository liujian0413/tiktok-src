package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.s */
public final class C43168s {

    /* renamed from: a */
    public static final C43168s f111791a = new C43168s();

    private C43168s() {
    }

    /* renamed from: b */
    public static boolean m136910b(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getPrivateStatus() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m136911c(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getPrivateStatus() == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m136912d(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getPrivateStatus() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m136913e(Aweme aweme) {
        if (aweme != null) {
            User author = aweme.getAuthor();
            if (author != null && author.getFollowStatus() == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m136914f(Aweme aweme) {
        if (aweme != null) {
            User author = aweme.getAuthor();
            if (author != null && author.getFollowStatus() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m136909a(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getPrivateStatus() == 2) {
                User author = aweme.getAuthor();
                if ((author == null || author.getFollowStatus() != 2) && !C28482e.m93606a(aweme)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m136915g(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        if (C43122ff.m136763a(aweme.getAuthorUid())) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            User curUser = f.getCurUser();
            C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
            return curUser.isSecret();
        }
        User author = aweme.getAuthor();
        C7573i.m23582a((Object) author, "aweme.author");
        return author.isSecret();
    }
}
