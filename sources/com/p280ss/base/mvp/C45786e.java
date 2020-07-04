package com.p280ss.base.mvp;

import android.content.Context;
import android.os.Bundle;
import com.p280ss.base.mvp.C45784c;
import com.p280ss.base.mvp.p1787a.C45782a;
import com.p280ss.base.p1786b.C45780c;
import com.ss.base.mvp.e$a.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

/* renamed from: com.ss.base.mvp.e */
public class C45786e<T extends C45784c> implements C45781a {

    /* renamed from: a */
    protected Context f117113a;

    /* renamed from: b */
    T f117114b;

    /* renamed from: c */
    protected Bundle f117115c;

    /* renamed from: d */
    protected ArrayList<C45782a> f117116d = new ArrayList<>();

    /* renamed from: e */
    private String f117117e = UUID.randomUUID().toString();

    /* renamed from: f */
    private final Class<T> f117118f;

    /* renamed from: g */
    private final C45787a f117119g;

    /* renamed from: h */
    private T f117120h;

    /* renamed from: com.ss.base.mvp.e$a */
    class C45787a implements InvocationHandler {

        /* renamed from: a */
        Queue<a> f117121a;

        /* renamed from: com.ss.base.mvp.e$a$a */
        class C45788a {

            /* renamed from: a */
            Method f117123a;

            /* renamed from: b */
            Object[] f117124b;

            private C45788a() {
            }

            /* synthetic */ C45788a(C45787a aVar, byte b) {
                this();
            }
        }

        /* renamed from: a */
        public final void mo111004a() {
            if (C45786e.this.f117114b != null) {
                while (!this.f117121a.isEmpty()) {
                    C45788a aVar = (C45788a) this.f117121a.poll();
                    try {
                        aVar.f117123a.invoke(C45786e.this.f117114b, aVar.f117124b);
                    } catch (Exception e) {
                        throw new IllegalStateException("apply pending method invocation error when view attached", e);
                    }
                }
            }
        }

        private C45787a() {
            this.f117121a = new LinkedList();
        }

        /* synthetic */ C45787a(C45786e eVar, byte b) {
            this();
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C45780c.m143739a()) {
                C45788a aVar = new C45788a(this, 0);
                aVar.f117123a = method;
                aVar.f117124b = objArr;
                this.f117121a.offer(aVar);
                mo111004a();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final void mo110988a() {
        this.f117114b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo110999b(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo111000c(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo111001d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo111003f() {
        if (this.f117113a == null) {
            throw new IllegalStateException("Do not call this method before onInit");
        }
    }

    /* renamed from: b */
    public final void mo110993b() {
        Iterator it = this.f117116d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: c */
    public final void mo110994c() {
        mo111001d();
        this.f117114b = null;
        Iterator it = this.f117116d.iterator();
        while (it.hasNext()) {
            ((C45782a) it.next()).mo110995a();
        }
        this.f117119g.f117121a.clear();
        this.f117116d.clear();
    }

    /* renamed from: e */
    public final T mo111002e() {
        if (C45780c.m143739a()) {
            if (this.f117120h == null) {
                this.f117120h = (C45784c) Proxy.newProxyInstance(this.f117118f.getClassLoader(), new Class[]{this.f117118f}, this.f117119g);
            }
            return this.f117120h;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo110992a(C45784c cVar) {
        this.f117114b = cVar;
        this.f117119g.mo111004a();
    }

    /* renamed from: a */
    public final void mo110991a(Bundle bundle) {
        bundle.putString("SAVE_ID", this.f117117e);
        mo111000c(bundle);
    }

    public C45786e(Class<T> cls) {
        this.f117118f = cls;
        this.f117119g = new C45787a<>(this, 0);
    }

    /* renamed from: a */
    public final void mo110989a(int i, int i2, Bundle bundle) {
        Iterator it = this.f117116d.iterator();
        while (it.hasNext()) {
            ((C45782a) it.next()).mo110996a(i, i2, bundle);
        }
    }

    /* renamed from: a */
    public final void mo110990a(Context context, Bundle bundle, Bundle bundle2) {
        this.f117113a = context.getApplicationContext();
        this.f117115c = bundle;
        if (bundle2 != null) {
            this.f117117e = bundle2.getString("SAVE_ID");
        }
        mo110999b(bundle2);
    }
}
