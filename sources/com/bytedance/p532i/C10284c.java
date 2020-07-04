package com.bytedance.p532i;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.i.c */
public final class C10284c {

    /* renamed from: c */
    public static String f27931c = "TTVideoSettingsStoreKey";

    /* renamed from: f */
    private static C10284c f27932f;

    /* renamed from: a */
    public JSONObject f27933a;

    /* renamed from: b */
    public JSONObject f27934b;

    /* renamed from: d */
    public boolean f27935d = false;

    /* renamed from: e */
    private Context f27936e;

    /* renamed from: g */
    private final ReentrantReadWriteLock f27937g = new ReentrantReadWriteLock();

    /* renamed from: h */
    private final ReentrantReadWriteLock f27938h = new ReentrantReadWriteLock();

    /* renamed from: i */
    private ArrayList<C10283b> f27939i = new ArrayList<>();

    /* renamed from: a */
    public static synchronized C10284c m30450a(Context context) throws JSONException {
        C10284c cVar;
        synchronized (C10284c.class) {
            if (f27932f == null) {
                f27932f = new C10284c(context.getApplicationContext());
            }
            cVar = f27932f;
        }
        return cVar;
    }

    /* renamed from: a */
    private void m30451a(int i) {
        this.f27938h.readLock().lock();
        Iterator it = this.f27939i.iterator();
        while (it.hasNext()) {
            ((C10283b) it.next()).mo25005a(0);
        }
        this.f27938h.readLock().unlock();
    }

    private C10284c(Context context) throws JSONException {
        this.f27936e = context;
        if (this.f27935d) {
            String a = C10285d.m30456a(this.f27936e, f27931c);
            if (a == null || a.isEmpty()) {
                this.f27933a = new JSONObject();
                this.f27934b = new JSONObject();
            } else {
                this.f27933a = new JSONObject(a);
                this.f27934b = new JSONObject(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo25006a(C10283b bVar) {
        this.f27938h.writeLock().lock();
        this.f27939i.add(bVar);
        this.f27938h.writeLock().unlock();
    }

    /* renamed from: a */
    public final void mo25007a(JSONObject jSONObject) {
        this.f27937g.writeLock().lock();
        this.f27933a = jSONObject;
        if (this.f27935d) {
            C10285d.m30460a(this.f27936e, f27931c, jSONObject.toString());
        }
        this.f27937g.writeLock().unlock();
        m30451a(0);
    }
}
