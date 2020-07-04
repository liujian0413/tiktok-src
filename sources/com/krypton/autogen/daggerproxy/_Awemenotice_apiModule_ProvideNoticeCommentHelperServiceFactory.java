package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNoticeCommentHelperServiceFactory implements C47373d<NoticeCommentHelperService> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50131a;

    public final NoticeCommentHelperService get() {
        return provideInstance(this.f50131a);
    }

    public _Awemenotice_apiModule_ProvideNoticeCommentHelperServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50131a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeCommentHelperServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeCommentHelperServiceFactory(_awemenotice_apimodule);
    }

    public static NoticeCommentHelperService provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeCommentHelperService(_awemenotice_apimodule);
    }

    public static NoticeCommentHelperService proxyProvideNoticeCommentHelperService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeCommentHelperService) C47375f.m147940a(_awemenotice_apimodule.provideNoticeCommentHelperService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
