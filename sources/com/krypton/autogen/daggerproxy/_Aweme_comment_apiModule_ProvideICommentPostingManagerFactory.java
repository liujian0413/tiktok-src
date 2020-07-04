package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.comment.list.C24182h;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Aweme_comment_apiModule_ProvideICommentPostingManagerFactory implements C47373d<C24182h> {

    /* renamed from: a */
    private final _Aweme_comment_apiModule f50119a;

    public final C24182h get() {
        return provideInstance(this.f50119a);
    }

    public _Aweme_comment_apiModule_ProvideICommentPostingManagerFactory(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        this.f50119a = _aweme_comment_apimodule;
    }

    public static _Aweme_comment_apiModule_ProvideICommentPostingManagerFactory create(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return new _Aweme_comment_apiModule_ProvideICommentPostingManagerFactory(_aweme_comment_apimodule);
    }

    public static C24182h provideInstance(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return proxyProvideICommentPostingManager(_aweme_comment_apimodule);
    }

    public static C24182h proxyProvideICommentPostingManager(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return (C24182h) C47375f.m147940a(_aweme_comment_apimodule.provideICommentPostingManager(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
