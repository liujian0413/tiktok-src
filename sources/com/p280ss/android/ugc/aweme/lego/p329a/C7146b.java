package com.p280ss.android.ugc.aweme.lego.p329a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.lego.a.b */
public final class C7146b {

    /* renamed from: a */
    private Context f20046a;

    /* renamed from: b */
    private final Map<RequestType, List<C7152c>> f20047b = new HashMap();

    /* renamed from: a */
    private final void m22288a(C7152c cVar) {
        synchronized (this.f20047b) {
            Object obj = this.f20047b.get(cVar.mo18606a());
            if (obj == null) {
                C7573i.m23580a();
            }
            ((List) obj).remove(cVar);
        }
    }

    /* renamed from: a */
    public final void mo18585a(Context context) {
        C7573i.m23587b(context, "context");
        this.f20046a = context;
        for (RequestType put : RequestType.values()) {
            this.f20047b.put(put, new ArrayList());
        }
    }

    /* renamed from: b */
    public final C7152c mo18589b(RequestType requestType) {
        C7573i.m23587b(requestType, "type");
        synchronized (this.f20047b) {
            Object obj = this.f20047b.get(requestType);
            if (obj == null) {
                C7573i.m23580a();
            }
            if (!(!((Collection) obj).isEmpty())) {
                return null;
            }
            Object obj2 = this.f20047b.get(requestType);
            if (obj2 == null) {
                C7573i.m23580a();
            }
            C7152c cVar = (C7152c) ((List) obj2).get(0);
            return cVar;
        }
    }

    /* renamed from: a */
    public final boolean mo18588a(RequestType requestType) {
        C7573i.m23587b(requestType, "type");
        Object obj = this.f20047b.get(requestType);
        if (obj == null) {
            C7573i.m23580a();
        }
        if (!((Collection) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo18586a(RequestType requestType, C7152c cVar) {
        C7573i.m23587b(requestType, "type");
        C7573i.m23587b(cVar, "request");
        synchronized (this.f20047b) {
            Object obj = this.f20047b.get(requestType);
            if (obj == null) {
                C7573i.m23580a();
            }
            ((List) obj).add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo18587a(C7152c cVar, boolean z) {
        C7573i.m23587b(cVar, "request");
        synchronized (cVar) {
            Object obj = this.f20047b.get(cVar.mo18606a());
            if (obj == null) {
                C7573i.m23580a();
            }
            if (((List) obj).contains(cVar)) {
                m22288a(cVar);
                Context context = this.f20046a;
                if (context == null) {
                    C7573i.m23583a("context");
                }
                cVar.mo18607a(context, z);
            }
        }
    }
}
