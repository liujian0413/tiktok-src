package com.bytedance.android.livesdk.chatroom.p210c;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.d */
public final class C4301d<V extends View> implements C0053p<KVData> {

    /* renamed from: a */
    public V f12507a;

    /* renamed from: b */
    private DataCenter f12508b;

    /* renamed from: c */
    private Map<String, C4305b> f12509c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.c.d$a */
    public static final class C4303a<V extends View> {

        /* renamed from: a */
        public C4303a<V> f12510a;

        /* renamed from: b */
        public C4306c<V> f12511b;

        /* renamed from: c */
        public C4304a f12512c;

        /* renamed from: d */
        private C4307e f12513d;

        /* renamed from: e */
        private DataCenter f12514e;

        /* renamed from: f */
        private V f12515f;

        /* renamed from: com.bytedance.android.livesdk.chatroom.c.d$a$a */
        static final class C4304a<V extends View, T> {

            /* renamed from: a */
            public String f12516a;

            /* renamed from: b */
            public C4305b<V, T> f12517b;

            /* renamed from: c */
            public boolean f12518c;

            /* renamed from: d */
            public boolean f12519d;

            private C4304a(String str, C4305b<V, T> bVar, boolean z, boolean z2) {
                this.f12516a = str;
                this.f12517b = bVar;
                this.f12518c = z;
                this.f12519d = z2;
            }
        }

        /* renamed from: b */
        private C4303a<V> m14503b() {
            C4303a<V> aVar = new C4303a<>(this.f12514e, this.f12515f, this.f12513d);
            aVar.f12510a = this;
            aVar.f12511b = this.f12511b;
            return aVar;
        }

        /* renamed from: a */
        public final C4301d<V> mo11979a() {
            C4301d<V> dVar = new C4301d<>(this.f12514e, this.f12515f, this.f12510a);
            this.f12513d.mo11984a((C4301d) dVar);
            return dVar;
        }

        /* renamed from: a */
        public final C4303a<V> mo11977a(C4306c<V> cVar) {
            this.f12511b = cVar;
            return this;
        }

        /* renamed from: a */
        public final <T> C4303a<V> mo11978a(String str, C4305b<V, T> bVar) {
            C4304a aVar = new C4304a(str, bVar);
            this.f12512c = aVar;
            return m14503b();
        }

        C4303a(DataCenter dataCenter, V v, C4307e eVar) {
            this.f12514e = dataCenter;
            this.f12515f = v;
            this.f12513d = eVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.c.d$b */
    public interface C4305b<V extends View, T> {
        /* renamed from: a */
        void mo11980a(V v, T t);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.c.d$c */
    public interface C4306c<V extends View> {
        /* renamed from: a */
        void mo11981a(V v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11976a() {
        this.f12508b.removeObserver(this);
        this.f12509c.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            Object data = kVData.getData();
            if (this.f12509c.keySet().contains(key)) {
                ((C4305b) this.f12509c.get(key)).mo11980a(this.f12507a, data);
            }
        }
    }

    private C4301d(DataCenter dataCenter, V v, C4303a<V> aVar) {
        this.f12509c = new HashMap();
        this.f12508b = dataCenter;
        this.f12507a = v;
        if (aVar.f12511b != null) {
            aVar.f12511b.mo11981a(this.f12507a);
        }
        while (aVar != null) {
            C4304a aVar2 = aVar.f12512c;
            this.f12509c.put(aVar2.f12516a, aVar2.f12517b);
            if (aVar2.f12518c) {
                if (aVar2.f12519d) {
                    this.f12508b.observeForever(aVar2.f12516a, this, true);
                } else {
                    this.f12508b.observeForever(aVar2.f12516a, this);
                }
            } else if (aVar2.f12519d) {
                this.f12508b.observe(aVar2.f12516a, this, true);
            } else {
                this.f12508b.observe(aVar2.f12516a, this);
            }
            aVar = aVar.f12510a;
        }
    }
}
