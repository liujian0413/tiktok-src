package com.p280ss.android.ugc.aweme.storage.p1645c;

import com.p280ss.android.ugc.aweme.draft.C27303b;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.storage.constants.StorageType;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1641a.C41896a;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41940c;
import java.io.File;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.c.d */
public final class C41919d extends C41913a {

    /* renamed from: com.ss.android.ugc.aweme.storage.c.d$a */
    public static final class C41920a implements C27303b {

        /* renamed from: a */
        final /* synthetic */ String f108997a;

        C41920a(String str) {
            this.f108997a = str;
        }

        /* renamed from: a */
        public final boolean mo70115a(C27311c cVar) {
            C7573i.m23587b(cVar, "draft");
            return !C7573i.m23585a((Object) cVar.mo70221aj(), (Object) this.f108997a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "draft";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.DRAFT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        return true;
    }

    /* renamed from: c */
    public final File mo31401c() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103470f;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sDraftDir");
        return c.mo102928a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo102953j() {
        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
        String publishingDraftKey = publishService.getPublishingDraftKey();
        C7573i.m23582a((Object) publishingDraftKey, "ServiceManager.get().get…vice().publishingDraftKey");
        List queryListWithFilter = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryListWithFilter(new C41920a(publishingDraftKey));
        C7573i.m23582a((Object) queryListWithFilter, "ServiceManager.get().get…\n            }\n        })");
        C41896a aVar = new C41896a();
        long j = 0;
        for (C27311c a : C7525m.m23510e(queryListWithFilter)) {
            aVar.mo102935a(a);
            j += aVar.mo102934a();
        }
        return j;
    }
}
