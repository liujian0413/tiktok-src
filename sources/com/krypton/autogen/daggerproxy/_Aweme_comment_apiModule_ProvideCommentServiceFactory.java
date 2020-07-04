package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Aweme_comment_apiModule_ProvideCommentServiceFactory implements C47373d<CommentService> {

    /* renamed from: a */
    private final _Aweme_comment_apiModule f50118a;

    public final CommentService get() {
        return provideInstance(this.f50118a);
    }

    public _Aweme_comment_apiModule_ProvideCommentServiceFactory(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        this.f50118a = _aweme_comment_apimodule;
    }

    public static _Aweme_comment_apiModule_ProvideCommentServiceFactory create(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return new _Aweme_comment_apiModule_ProvideCommentServiceFactory(_aweme_comment_apimodule);
    }

    public static CommentService provideInstance(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return proxyProvideCommentService(_aweme_comment_apimodule);
    }

    public static CommentService proxyProvideCommentService(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return (CommentService) C47375f.m147940a(_aweme_comment_apimodule.provideCommentService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
