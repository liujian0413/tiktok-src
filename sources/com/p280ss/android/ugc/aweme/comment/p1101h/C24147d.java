package com.p280ss.android.ugc.aweme.comment.p1101h;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.comment.h.d */
public final class C24147d {

    /* renamed from: a */
    public static final C24147d f63817a = new C24147d();

    private C24147d() {
    }

    /* renamed from: a */
    public static final void m79331a(String str, int i) {
        if (str != null) {
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateCommentCount(str, i);
            C42961az.m136380a(new C28318an(14, str));
        }
    }
}
