package com.p280ss.android.ugc.aweme.lego.p329a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.LegoService;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.lego.a.c */
public final class C7147c {

    /* renamed from: a */
    private Context f20048a;

    /* renamed from: b */
    private final Map<Class<? extends LegoService>, LegoService> f20049b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Map<Class<? extends LegoService>, LegoService> f20050c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map<WorkType, List<Class<? extends LegoService>>> f20051d = new HashMap();

    /* renamed from: a */
    public final <T> T mo18590a(Class<? extends LegoService> cls) {
        C7573i.m23587b(cls, "name");
        T t = (LegoService) this.f20049b.get(cls);
        if (t == null) {
            t = mo18595b(cls);
        }
        return (Object) t;
    }

    /* renamed from: c */
    public final LegoService mo18597c(Class<? extends LegoService> cls) {
        C7573i.m23587b(cls, "name");
        if (this.f20049b.containsKey(cls)) {
            return null;
        }
        Object obj = this.f20050c.get(cls);
        if (obj == null) {
            C7573i.m23580a();
        }
        return (LegoService) obj;
    }

    /* renamed from: a */
    public final void mo18591a(Context context) {
        C7573i.m23587b(context, "context");
        this.f20048a = context;
        for (WorkType put : WorkType.values()) {
            this.f20051d.put(put, new ArrayList());
        }
    }

    /* renamed from: b */
    public final LegoService mo18595b(Class<? extends LegoService> cls) {
        LegoService legoService;
        C7573i.m23587b(cls, "name");
        Object obj = this.f20050c.get(cls);
        if (obj == null) {
            C7573i.m23580a();
        }
        LegoService legoService2 = (LegoService) obj;
        synchronized (legoService2) {
            if (!this.f20049b.containsKey(cls)) {
                Context context = this.f20048a;
                if (context == null) {
                    C7573i.m23583a("context");
                }
                legoService2.init(context);
                this.f20049b.put(cls, legoService2);
            }
            Object obj2 = this.f20049b.get(cls);
            if (obj2 == null) {
                C7573i.m23580a();
            }
            legoService = (LegoService) obj2;
        }
        return legoService;
    }

    /* renamed from: c */
    public final List<Class<? extends LegoService>> mo18598c(WorkType workType) {
        List<Class<? extends LegoService>> list;
        C7573i.m23587b(workType, "type");
        synchronized (this.f20051d) {
            Object obj = this.f20051d.get(workType);
            if (obj == null) {
                C7573i.m23580a();
            }
            ArrayList arrayList = new ArrayList((Collection) obj);
            Object obj2 = this.f20051d.get(workType);
            if (obj2 == null) {
                C7573i.m23580a();
            }
            ((List) obj2).clear();
            list = arrayList;
        }
        return list;
    }

    /* renamed from: b */
    public final Class<? extends LegoService> mo18596b(WorkType workType) {
        C7573i.m23587b(workType, "type");
        synchronized (this.f20051d) {
            Object obj = this.f20051d.get(workType);
            if (obj == null) {
                C7573i.m23580a();
            }
            if (((List) obj).isEmpty()) {
                return null;
            }
            Object obj2 = this.f20051d.get(workType);
            if (obj2 == null) {
                C7573i.m23580a();
            }
            Class<? extends LegoService> cls = (Class) ((List) obj2).remove(0);
            return cls;
        }
    }

    /* renamed from: a */
    public final boolean mo18594a(WorkType workType) {
        C7573i.m23587b(workType, "type");
        Object obj = this.f20051d.get(workType);
        if (obj == null) {
            C7573i.m23580a();
        }
        if (!((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo18592a(WorkType workType, List<? extends Class<? extends LegoService>> list) {
        C7573i.m23587b(workType, "type");
        C7573i.m23587b(list, "services");
        synchronized (this.f20051d) {
            Object obj = this.f20051d.get(workType);
            if (obj == null) {
                C7573i.m23580a();
            }
            ((List) obj).addAll(list);
        }
    }

    /* renamed from: a */
    public final void mo18593a(Class<? extends LegoService> cls, LegoService legoService) {
        C7573i.m23587b(cls, "name");
        C7573i.m23587b(legoService, "service");
        if (!this.f20050c.containsKey(cls)) {
            this.f20050c.put(cls, legoService);
        }
    }
}
