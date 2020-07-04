package com.p280ss.android.ugc.aweme.storage;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41941d;
import com.p280ss.android.ugc.aweme.storage.p1648f.p1649a.C41950a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.f */
public final class C41945f implements C41941d {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C41950a> f109008a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static List<String> m133397b() {
        List<String> gatherFilesToBeUploaded = ((IAVService) ServiceManager.get().getService(IAVService.class)).gatherFilesToBeUploaded(C35563c.f93238a);
        C7573i.m23582a((Object) gatherFilesToBeUploaded, "ServiceManager.get().get…ilesToBeUploaded(context)");
        return gatherFilesToBeUploaded;
    }

    /* renamed from: a */
    public final Set<String> mo102966a() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Collection<C41950a> values = this.f109008a.values();
        C7573i.m23582a((Object) values, "mWhiteListHolder.values");
        for (C41950a a : values) {
            linkedHashSet.addAll(a.mo102971a());
        }
        linkedHashSet.addAll(m133397b());
        return linkedHashSet;
    }

    /* renamed from: a */
    public final void mo102967a(C41950a aVar) {
        C7573i.m23587b(aVar, "whiteList");
        m133398b(aVar);
    }

    /* renamed from: a */
    public final boolean mo102968a(String str) {
        C7573i.m23587b(str, "name");
        return this.f109008a.containsKey(str);
    }

    /* renamed from: b */
    private final void m133398b(C41950a aVar) {
        Map map = this.f109008a;
        String name = aVar.getClass().getName();
        C7573i.m23582a((Object) name, "whiteList.javaClass.name");
        map.put(name, aVar);
    }
}
