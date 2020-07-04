package com.bytedance.frameworks.baselib.network.http.impl;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.d */
public final class C10162d implements C10161c {

    /* renamed from: a */
    private final Map<URI, List<C10163e>> f27666a = new HashMap();

    /* renamed from: b */
    private static URI m30166b(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URI(WebKitApi.SCHEME_HTTP, uri.getHost(), null, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    /* renamed from: a */
    public final synchronized List<C10163e> mo24834a(URI uri) {
        ArrayList arrayList;
        if (uri != null) {
            arrayList = new ArrayList();
            List list = (List) this.f27666a.get(uri);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C10163e eVar = (C10163e) it.next();
                    if (eVar.mo24838a()) {
                        it.remove();
                    } else {
                        arrayList.add(eVar);
                    }
                }
            }
            for (Entry entry : this.f27666a.entrySet()) {
                if (!uri.equals(entry.getKey())) {
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        C10163e eVar2 = (C10163e) it2.next();
                        if (C10163e.m30174a(eVar2.f27675d, uri.getHost())) {
                            if (eVar2.mo24838a()) {
                                it2.remove();
                            } else if (!arrayList.contains(eVar2)) {
                                arrayList.add(eVar2);
                            }
                        }
                    }
                }
            }
        } else {
            throw new NullPointerException("uri == null");
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final synchronized void mo24835a(URI uri, C10163e eVar) {
        if (eVar != null) {
            URI b = m30166b(uri);
            List list = (List) this.f27666a.get(b);
            if (list == null) {
                list = new ArrayList();
                this.f27666a.put(b, list);
            } else {
                list.remove(eVar);
            }
            list.add(eVar);
        } else {
            throw new NullPointerException("cookie == null");
        }
    }
}
