package com.ixigua.downloader;

import android.content.Context;
import android.content.IntentFilter;
import com.ixigua.downloader.pojo.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ixigua.downloader.a */
public class C18462a {

    /* renamed from: c */
    private static volatile C18462a f50053c;

    /* renamed from: a */
    public Context f50054a;

    /* renamed from: b */
    public C18487l f50055b = new C18487l();

    /* renamed from: d */
    private volatile C18480g f50056d = new C18482a().mo47983a();

    /* renamed from: e */
    private C18475e f50057e = new C18475e();

    /* renamed from: f */
    private NetworkReceiver f50058f;

    /* renamed from: g */
    private final Map<Task, CopyOnWriteArraySet<C18484i>> f50059g = new HashMap();

    /* renamed from: a */
    public static C18462a m60789a() {
        if (f50053c == null) {
            synchronized (C18462a.class) {
                if (f50053c == null) {
                    f50053c = new C18462a();
                }
            }
        }
        return f50053c;
    }

    private C18462a() {
        this.f50055b.mo47985a(this.f50057e);
    }

    /* renamed from: b */
    public final ExecutorService mo47944b() {
        if (this.f50056d != null) {
            return this.f50056d.f50102a;
        }
        return C18480g.m60893a();
    }

    /* renamed from: c */
    public final void mo47946c(Task task) {
        if (task != null) {
            this.f50057e.mo47974a(task);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<C18484i> mo47940a(Task task) {
        Set<C18484i> set;
        synchronized (this.f50059g) {
            set = (Set) this.f50059g.get(task);
        }
        return set;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Set<C18484i> mo47943b(Task task) {
        Set<C18484i> set;
        synchronized (this.f50059g) {
            set = (Set) this.f50059g.remove(task);
        }
        return set;
    }

    /* renamed from: b */
    private void m60790b(Context context) {
        if (context != null) {
            this.f50058f = new NetworkReceiver();
            context.registerReceiver(this.f50058f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: a */
    public final synchronized void mo47941a(Context context) {
        if (this.f50054a == null && context != null) {
            this.f50054a = context.getApplicationContext();
            if (this.f50054a == null) {
                this.f50054a = context;
            }
            m60790b(this.f50054a);
        }
    }

    /* renamed from: a */
    public final void mo47942a(Task task, C18484i iVar) {
        if (task != null) {
            synchronized (this.f50059g) {
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f50059g.get(task);
                if (copyOnWriteArraySet == null) {
                    copyOnWriteArraySet = new CopyOnWriteArraySet();
                    this.f50059g.put(task, copyOnWriteArraySet);
                }
                copyOnWriteArraySet.add(iVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo47945b(Task task, C18484i iVar) {
        if (task != null && iVar != null) {
            synchronized (this.f50059g) {
                Set set = (Set) this.f50059g.get(task);
                if (set != null) {
                    set.remove(iVar);
                    if (set.isEmpty()) {
                        this.f50059g.remove(task);
                    }
                }
            }
        }
    }
}
