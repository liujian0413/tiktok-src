package com.p280ss.android.ugc.aweme.lego.p329a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.C7153e;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.lego.a.d */
public final class C7148d {

    /* renamed from: a */
    private Context f20052a;

    /* renamed from: b */
    private final Map<WorkType, List<LegoTask>> f20053b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Map<WorkType, List<LegoTask>> f20054c = new ConcurrentHashMap();

    /* renamed from: a */
    public final boolean mo18602a(WorkType workType) {
        C7573i.m23587b(workType, "type");
        Object obj = this.f20053b.get(workType);
        if (obj == null) {
            C7573i.m23580a();
        }
        if (!((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo18600a(Context context) {
        WorkType[] values;
        C7573i.m23587b(context, "context");
        this.f20052a = context;
        for (WorkType workType : WorkType.values()) {
            this.f20053b.put(workType, new ArrayList());
            this.f20054c.put(workType, new ArrayList());
        }
    }

    /* renamed from: b */
    public final LegoTask mo18603b(WorkType workType) {
        C7573i.m23587b(workType, "type");
        synchronized (this.f20053b) {
            Object obj = this.f20053b.get(workType);
            if (obj == null) {
                C7573i.m23580a();
            }
            if (((List) obj).isEmpty()) {
                return null;
            }
            Object obj2 = this.f20053b.get(workType);
            if (obj2 == null) {
                C7573i.m23580a();
            }
            LegoTask legoTask = (LegoTask) ((List) obj2).remove(0);
            synchronized (this.f20054c) {
                Object obj3 = this.f20054c.get(legoTask.type());
                if (obj3 == null) {
                    C7573i.m23580a();
                }
                ((List) obj3).add(legoTask);
            }
            return legoTask;
        }
    }

    /* renamed from: a */
    public final void mo18601a(LegoTask legoTask) {
        C7573i.m23587b(legoTask, "task");
        Object obj = this.f20053b.get(legoTask.type());
        if (obj == null) {
            C7573i.m23580a();
        }
        if (((List) obj).contains(legoTask)) {
            synchronized (this.f20053b) {
                Object obj2 = this.f20053b.get(legoTask.type());
                if (obj2 == null) {
                    C7573i.m23580a();
                }
                ((List) obj2).remove(legoTask);
            }
            synchronized (this.f20054c) {
                Object obj3 = this.f20054c.get(legoTask.type());
                if (obj3 == null) {
                    C7573i.m23580a();
                }
                if (!((List) obj3).contains(legoTask)) {
                    Object obj4 = this.f20054c.get(legoTask.type());
                    if (obj4 == null) {
                        C7573i.m23580a();
                    }
                    ((List) obj4).add(legoTask);
                }
            }
        }
        Object obj5 = this.f20054c.get(legoTask.type());
        if (obj5 == null) {
            C7573i.m23580a();
        }
        if (((List) obj5).contains(legoTask)) {
            mo18604b(legoTask);
        }
    }

    /* renamed from: b */
    public final void mo18604b(LegoTask legoTask) {
        C7573i.m23587b(legoTask, "task");
        synchronized (legoTask) {
            Object obj = this.f20054c.get(legoTask.type());
            if (obj == null) {
                C7573i.m23580a();
            }
            if (((List) obj).contains(legoTask)) {
                StringBuilder sb = new StringBuilder("task_");
                sb.append(legoTask.getClass().getSimpleName());
                String sb2 = sb.toString();
                C7153e a = C7121a.m22242a();
                if (a != null) {
                    a.mo16891a(sb2);
                }
                Context context = this.f20052a;
                if (context == null) {
                    C7573i.m23583a("context");
                }
                legoTask.run(context);
                C7153e a2 = C7121a.m22242a();
                if (a2 != null) {
                    a2.mo16892b(sb2);
                }
                synchronized (this.f20054c) {
                    Object obj2 = this.f20054c.get(legoTask.type());
                    if (obj2 == null) {
                        C7573i.m23580a();
                    }
                    ((List) obj2).remove(legoTask);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo18605b(WorkType workType, List<? extends LegoTask> list) {
        C7573i.m23587b(workType, "type");
        C7573i.m23587b(list, "task");
        synchronized (this.f20053b) {
            Object obj = this.f20053b.get(workType);
            if (obj == null) {
                C7573i.m23580a();
            }
            ((List) obj).addAll(list);
        }
    }

    /* renamed from: a */
    public final List<LegoTask> mo18599a(WorkType workType, List<? extends LegoTask> list) {
        C7573i.m23587b(workType, "type");
        C7573i.m23587b(list, "tasks");
        synchronized (this.f20053b) {
            for (LegoTask legoTask : list) {
                Object obj = this.f20053b.get(workType);
                if (obj == null) {
                    C7573i.m23580a();
                }
                ((List) obj).remove(legoTask);
            }
            synchronized (this.f20054c) {
                Object obj2 = this.f20054c.get(workType);
                if (obj2 == null) {
                    C7573i.m23580a();
                }
                ((List) obj2).addAll(list);
            }
        }
        return list;
    }
}
