package com.p280ss.android.ugc.aweme.storage.p1640b;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.b.c */
public final class C41911c {

    /* renamed from: a */
    public static final C41911c f108992a = new C41911c();

    private C41911c() {
    }

    /* renamed from: c */
    public final boolean mo102947c() {
        if (C7163a.m22363a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Set<String> m133283a() {
        return C35574k.m114859a().mo70094i().mo102931b().mo102969a();
    }

    /* renamed from: b */
    public static boolean m133284b() {
        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
        return publishService.isPublishing();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 == null) goto L_0x0017;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m133282a(com.p280ss.android.ugc.aweme.draft.model.C27311c r1) {
        /*
            java.lang.String r0 = "draft"
            kotlin.jvm.internal.C7573i.m23587b(r1, r0)
            boolean r0 = r1.mo70215ad()
            if (r0 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r1 = r1.mo70214ac()
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = r1.getDraftDir()
            if (r1 != 0) goto L_0x0019
        L_0x0017:
            java.lang.String r1 = ""
        L_0x0019:
            return r1
        L_0x001a:
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r0 = r1.f72034c
            boolean r0 = com.p280ss.android.ugc.aweme.storage.p1640b.C41902b.m133264a(r0)
            if (r0 == 0) goto L_0x002b
            com.ss.android.ugc.aweme.draft.model.b r1 = r1.f72031S
            java.lang.String r1 = r1.f71951O
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = ""
        L_0x002a:
            return r1
        L_0x002b:
            com.ss.android.ugc.aweme.draft.model.b r1 = r1.f72031S
            java.lang.String r1 = r1.f71951O
            java.lang.String r1 = com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace.m122803a(r1)
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = ""
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.storage.p1640b.C41911c.m133282a(com.ss.android.ugc.aweme.draft.model.c):java.lang.String");
    }
}
