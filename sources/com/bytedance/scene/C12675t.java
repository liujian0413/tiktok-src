package com.bytedance.scene;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.scene.t */
public final class C12675t {

    /* renamed from: a */
    public static final C12677a f33650a = new C12677a() {
        /* renamed from: a */
        public final C12675t mo31128a() {
            return new C12675t(C12675t.m36852a());
        }
    };

    /* renamed from: f */
    private static final AtomicInteger f33651f = new AtomicInteger(0);

    /* renamed from: b */
    private final C12675t f33652b;

    /* renamed from: c */
    private final String f33653c;

    /* renamed from: d */
    private final Map<String, C12675t> f33654d;

    /* renamed from: e */
    private final Map<Object, Object> f33655e;

    /* renamed from: com.bytedance.scene.t$a */
    public interface C12677a {
        /* renamed from: a */
        C12675t mo31128a();
    }

    /* renamed from: com.bytedance.scene.t$b */
    public interface C12678b {
        /* renamed from: a */
        void mo31022a();
    }

    /* renamed from: a */
    public static String m36852a() {
        StringBuilder sb = new StringBuilder("Scene #");
        sb.append(f33651f.getAndIncrement());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31127b() {
        if (this.f33652b != null) {
            this.f33652b.m36853a(this.f33653c);
        }
        for (Object next : this.f33655e.values()) {
            if (next instanceof C12678b) {
                ((C12678b) next).mo31022a();
            }
        }
        this.f33655e.clear();
        this.f33654d.clear();
    }

    /* renamed from: a */
    private void m36853a(String str) {
        this.f33654d.remove(str);
    }

    /* renamed from: b */
    private static String m36854b(Bundle bundle) {
        return bundle.getString("scope_key");
    }

    /* renamed from: a */
    public final void mo31123a(Bundle bundle) {
        bundle.putString("scope_key", this.f33653c);
    }

    /* renamed from: b */
    public final <T> T mo31126b(Object obj) {
        C12675t tVar = this;
        while (true) {
            T t = tVar.f33655e.get(obj);
            if (t != null) {
                return t;
            }
            if (tVar.f33652b == null) {
                return null;
            }
            tVar = tVar.f33652b;
        }
    }

    /* renamed from: a */
    public final boolean mo31125a(Object obj) {
        return this.f33655e.containsKey(obj);
    }

    private C12675t(C12675t tVar, String str) {
        this.f33654d = new HashMap();
        this.f33655e = new HashMap();
        this.f33652b = tVar;
        this.f33653c = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C12675t mo31122a(C12629j jVar, Bundle bundle) {
        String str;
        if (bundle != null) {
            str = m36854b(bundle);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = m36852a();
        }
        C12675t tVar = (C12675t) this.f33654d.get(str);
        if (tVar != null) {
            return tVar;
        }
        C12675t tVar2 = new C12675t(this, str);
        this.f33654d.put(str, tVar2);
        return tVar2;
    }

    /* renamed from: a */
    public final void mo31124a(Object obj, Object obj2) {
        this.f33655e.put(obj, obj2);
    }
}
