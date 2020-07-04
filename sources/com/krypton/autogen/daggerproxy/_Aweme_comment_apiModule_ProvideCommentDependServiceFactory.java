package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.comment.services.C24219a;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Aweme_comment_apiModule_ProvideCommentDependServiceFactory implements C47373d<C24219a> {

    /* renamed from: a */
    private final _Aweme_comment_apiModule f50117a;

    public final C24219a get() {
        return provideInstance(this.f50117a);
    }

    public _Aweme_comment_apiModule_ProvideCommentDependServiceFactory(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        this.f50117a = _aweme_comment_apimodule;
    }

    public static _Aweme_comment_apiModule_ProvideCommentDependServiceFactory create(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return new _Aweme_comment_apiModule_ProvideCommentDependServiceFactory(_aweme_comment_apimodule);
    }

    public static C24219a provideInstance(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return proxyProvideCommentDependService(_aweme_comment_apimodule);
    }

    public static C24219a proxyProvideCommentDependService(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return (C24219a) C47375f.m147940a(_aweme_comment_apimodule.provideCommentDependService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
