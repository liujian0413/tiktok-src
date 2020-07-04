package com.p280ss.android.ugc.aweme.user.repository;

import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.user.repository.a */
public final class C42844a {

    /* renamed from: a */
    public User f111320a;

    /* renamed from: b */
    public String f111321b;

    /* renamed from: c */
    public int f111322c;

    /* renamed from: a */
    public final void mo104548a(User user) {
        C7573i.m23587b(user, "<set-?>");
        this.f111320a = user;
    }

    private C42844a(User user, String str, int i) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "requestId");
        this.f111320a = user;
        this.f111321b = str;
        this.f111322c = i;
    }

    public /* synthetic */ C42844a(User user, String str, int i, int i2, C7571f fVar) {
        this(user, str, 0);
    }
}
