package com.p280ss.android.ugc.aweme.storage.p1648f.p1650b;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1641a.C41896a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.f.b.a */
public final class C41952a {
    /* renamed from: a */
    public static Set<String> m133420a() {
        List queryAllDraftList = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryAllDraftList();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        C41896a aVar = new C41896a();
        C7573i.m23582a((Object) queryAllDraftList, "drafts");
        for (C27311c a : C7525m.m23510e(queryAllDraftList)) {
            aVar.mo102935a(a);
            linkedHashSet.addAll(aVar.mo102936b());
        }
        return linkedHashSet;
    }
}
