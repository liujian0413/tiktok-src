package com.p280ss.android.ugc.aweme.app.services;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.p1385g.C33016c;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.services.c */
public final class C23035c implements C33016c {
    /* renamed from: a */
    public final void mo60008a(String str) {
        C7573i.m23587b(str, "data");
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData(str);
    }
}
