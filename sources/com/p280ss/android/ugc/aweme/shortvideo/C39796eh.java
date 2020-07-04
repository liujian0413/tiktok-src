package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.common.base.C17457s;
import com.google.common.base.Optional;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.story.api.IAVStoryService;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eh */
final /* synthetic */ class C39796eh implements C17457s {

    /* renamed from: a */
    static final C17457s f103446a = new C39796eh();

    private C39796eh() {
    }

    /* renamed from: a */
    public final Object mo44946a() {
        return Optional.fromNullable(ServiceManager.get().getService(IAVStoryService.class));
    }
}
