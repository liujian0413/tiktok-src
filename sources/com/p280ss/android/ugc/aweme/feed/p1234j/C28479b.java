package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.j.b */
public final class C28479b {

    /* renamed from: a */
    private static Aweme f75076a;

    /* renamed from: b */
    private static List<Aweme> f75077b;

    /* renamed from: c */
    private static User f75078c;

    /* renamed from: a */
    public static Aweme m93592a() {
        return f75076a;
    }

    /* renamed from: b */
    public static List<Aweme> m93596b() {
        return f75077b;
    }

    /* renamed from: c */
    public static User m93599c() {
        return f75078c;
    }

    /* renamed from: a */
    public static void m93593a(Aweme aweme) {
        f75076a = aweme;
    }

    /* renamed from: a */
    public static void m93594a(User user) {
        f75078c = user;
    }

    /* renamed from: b */
    public static void m93597b(Aweme aweme) {
        if (f75076a == aweme) {
            f75076a = null;
        }
    }

    /* renamed from: a */
    public static void m93595a(List<Aweme> list) {
        f75077b = list;
    }

    /* renamed from: b */
    public static void m93598b(List<Aweme> list) {
        if (f75077b == list) {
            f75077b = null;
        }
    }
}
