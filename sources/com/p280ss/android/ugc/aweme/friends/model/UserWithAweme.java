package com.p280ss.android.ugc.aweme.friends.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.UserWithAweme */
public final class UserWithAweme implements Serializable, Cloneable {
    @C6593c(mo15949a = "aweme")
    private final Aweme aweme;
    @C6593c(mo15949a = "user")
    private final User user;

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final User getUser() {
        return this.user;
    }

    public final UserWithAweme clone() {
        try {
            Object clone = super.clone();
            if (clone != null) {
                return (UserWithAweme) clone;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.UserWithAweme");
        } catch (CloneNotSupportedException unused) {
            return new UserWithAweme(new User(), new Aweme());
        }
    }

    public UserWithAweme(User user2, Aweme aweme2) {
        C7573i.m23587b(user2, "user");
        C7573i.m23587b(aweme2, "aweme");
        this.user = user2;
        this.aweme = aweme2;
    }
}
