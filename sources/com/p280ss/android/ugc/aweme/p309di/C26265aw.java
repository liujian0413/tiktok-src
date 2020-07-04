package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.ss.android.ugc.aweme.di.aw */
public final class C26265aw implements C47373d<CommentService> {

    /* renamed from: a */
    private static final C26265aw f69263a = new C26265aw();

    /* renamed from: a */
    public static C26265aw m86332a() {
        return f69263a;
    }

    /* renamed from: b */
    private static CommentService m86333b() {
        return m86334c();
    }

    /* renamed from: c */
    private static CommentService m86334c() {
        return m86335d();
    }

    public final /* synthetic */ Object get() {
        return m86333b();
    }

    /* renamed from: d */
    private static CommentService m86335d() {
        return (CommentService) C47375f.m147940a(C26262at.m86322b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
