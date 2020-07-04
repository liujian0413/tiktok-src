package com.p280ss.android.download.p856a;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.ss.android.download.a.h */
public final class C19368h<K, T, E, V, R> extends C19358a<K, T, E, V, R, Set<V>, C19367g<K, T, E, V, R>> {

    /* renamed from: g */
    private final WeakReference<C19369a<K, T, E, V, R>> f52415g;

    /* renamed from: h */
    private final Collection<V> f52416h = new ArrayList();

    /* renamed from: com.ss.android.download.a.h$a */
    public interface C19369a<K, T, E, V, R> {
        /* renamed from: a */
        R mo51341a(K k, T t, E e);

        /* renamed from: a */
        void mo51342a(K k, T t, E e, Collection<V> collection, R r);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo51329c() {
        super.mo51329c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo51330d() {
        super.mo51330d();
    }

    /* renamed from: e */
    private static C19367g<K, T, E, V, R> m63583e() {
        return new C19367g<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ C19361c mo51324a() {
        return m63583e();
    }

    /* renamed from: b */
    public final void mo51328b() {
        super.mo51328b();
        this.f52415g.clear();
    }

    public final /* bridge */ /* synthetic */ void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public C19368h(int i, int i2, C19369a<K, T, E, V, R> aVar) {
        super(i, i2, aVar.getClass().getName());
        this.f52415g = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final R mo51325a(K k, T t, E e) {
        C19369a aVar = (C19369a) this.f52415g.get();
        if (aVar != null) {
            return aVar.mo51341a(k, t, e);
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51326a(Object obj, Object obj2, Object obj3, Object obj4) {
        super.mo51326a(obj, obj2, obj3, obj4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo51327a(K k, T t, E e, Set<V> set, R r) {
        C19369a aVar = (C19369a) this.f52415g.get();
        if (aVar != null) {
            this.f52416h.clear();
            for (Object next : set) {
                if (next != null) {
                    this.f52416h.add(next);
                }
            }
            aVar.mo51342a(k, t, e, this.f52416h, r);
            this.f52416h.clear();
        }
    }
}
