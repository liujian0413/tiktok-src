package com.ixigua.downloader;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.p254b.C6304f;
import com.ixigua.downloader.p797a.C18466d;
import com.ixigua.downloader.p797a.C18467e;
import com.ixigua.downloader.pojo.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ixigua.downloader.e */
final class C18475e implements C18485j {

    /* renamed from: a */
    public final Handler f50094a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final List<C18468b> f50095b = new ArrayList();

    C18475e() {
    }

    /* renamed from: a */
    public final void mo47972a() {
        Task task;
        Context context = C18462a.m60789a().f50054a;
        boolean b = C18466d.m60825b(context);
        boolean c = C18466d.m60826c(context);
        synchronized (this.f50095b) {
            for (C18468b bVar : this.f50095b) {
                if (bVar != null) {
                    task = bVar.mo47948a();
                } else {
                    task = null;
                }
                if (task == null || !b || !bVar.mo47957f()) {
                    if (task != null && task.isOnlyWifi && c && bVar.mo47958g()) {
                        bVar.mo47960i();
                    }
                } else if (C18467e.m60827a(task)) {
                    m60878c(bVar);
                }
            }
        }
    }

    /* renamed from: b */
    private void m60876b(C18468b bVar) {
        synchronized (this.f50095b) {
            this.f50095b.add(bVar);
        }
    }

    /* renamed from: c */
    private static void m60878c(C18468b bVar) {
        bVar.mo47959h();
        C18462a.m60789a().mo47944b().execute(bVar);
    }

    /* renamed from: a */
    public final void mo47973a(C18468b bVar) {
        synchronized (this.f50095b) {
            this.f50095b.remove(bVar);
        }
    }

    /* renamed from: b */
    public static void m60877b(Task task) {
        if (task != null) {
            Set a = C18462a.m60789a().mo47940a(task);
            if (a != null) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* renamed from: c */
    public static void m60879c(Task task) {
        if (task != null) {
            Set b = C18462a.m60789a().mo47943b(task);
            if (b != null) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* renamed from: d */
    public static void m60880d(Task task) {
        if (task != null) {
            Set a = C18462a.m60789a().mo47940a(task);
            if (a != null) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* renamed from: e */
    private void m60881e(Task task) {
        C18468b bVar = new C18468b(task, new C18486k() {
            /* renamed from: a */
            public final void mo47975a(C18468b bVar) {
                C18475e.m60880d(bVar.mo47948a());
            }

            /* renamed from: b */
            public final void mo47979b(C18468b bVar) {
                C18475e.m60877b(bVar.mo47948a());
            }

            /* renamed from: c */
            public final void mo47980c(final C18468b bVar) {
                C18475e.this.mo47973a(bVar);
                final Task a = bVar.mo47948a();
                if (a != null) {
                    new C6304f(new Runnable() {
                        /* JADX INFO: finally extract failed */
                        public final void run() {
                            bVar.mo47962k();
                            bVar.f50069i.lock();
                            try {
                                C18467e.m60828b(a);
                                bVar.f50069i.unlock();
                                C18475e.this.f50094a.post(new Runnable() {
                                    public final void run() {
                                        C18475e.m60879c(a);
                                    }
                                });
                            } catch (Throwable th) {
                                bVar.f50069i.unlock();
                                throw th;
                            }
                        }
                    }, "downloader", false).start();
                }
            }

            /* renamed from: a */
            public final void mo47978a(C18468b bVar, Map<String, String> map) {
                C18475e.m60874a(bVar.mo47948a(), map);
                C18475e.this.mo47973a(bVar);
            }

            /* renamed from: a */
            public final void mo47976a(C18468b bVar, int i, Map<String, String> map) {
                if (C18475e.m60875a(bVar.mo47948a(), i, map)) {
                    C18475e.this.mo47973a(bVar);
                }
            }

            /* renamed from: a */
            public final void mo47977a(C18468b bVar, long j, long j2, int i, float f) {
                C18475e.m60873a(bVar.mo47948a(), j, j2, i, f);
            }
        });
        m60876b(bVar);
        m60878c(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47974a(Task task) {
        if (task != null) {
            C18468b f = m60882f(task);
            if (f == null) {
                m60881e(task);
            } else if (f.mo47957f() || f.mo47956e()) {
                f.f50061a = task;
                m60878c(f);
            }
        }
    }

    /* renamed from: f */
    private C18468b m60882f(Task task) {
        if (task != null) {
            synchronized (this.f50095b) {
                for (C18468b bVar : this.f50095b) {
                    if (bVar != null && task.equals(bVar.mo47948a())) {
                        return bVar;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m60874a(Task task, Map<String, String> map) {
        if (task != null) {
            Set<C18484i> b = C18462a.m60789a().mo47943b(task);
            if (b != null) {
                for (C18484i a : b) {
                    a.mo47921a(task, map);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m60875a(Task task, int i, Map<String, String> map) {
        boolean z = false;
        if (task == null) {
            return false;
        }
        C18462a a = C18462a.m60789a();
        Set<C18484i> a2 = a.mo47940a(task);
        if (a2 == null) {
            return false;
        }
        for (C18484i iVar : a2) {
            if (iVar.mo47922a(task, i, map)) {
                z = true;
            } else {
                a.mo47945b(task, iVar);
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m60873a(Task task, long j, long j2, int i, float f) {
        if (task != null) {
            Set<C18484i> a = C18462a.m60789a().mo47940a(task);
            if (a != null) {
                for (C18484i a2 : a) {
                    a2.mo47920a(task, j, j2, i, f);
                }
            }
        }
    }
}
