package com.p280ss.android.ugc.aweme.effect.p1194a;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.p280ss.android.ugc.aweme.effect.EffectModel;
import com.p280ss.android.ugc.aweme.effect.p1194a.p1195a.C27369a;
import com.p280ss.android.ugc.aweme.effect.p1194a.p1195a.C27370b;
import com.p280ss.android.ugc.aweme.effect.p1194a.p1195a.C27371c;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.a.a */
public final class C27359a {

    /* renamed from: f */
    public static EffectPlatform f72220f;

    /* renamed from: g */
    public static final C27360a f72221g = new C27360a(null);

    /* renamed from: a */
    public Queue<Effect> f72222a;

    /* renamed from: b */
    public final List<C27370b> f72223b;

    /* renamed from: c */
    public final AtomicBoolean f72224c;

    /* renamed from: d */
    public final AtomicInteger f72225d;

    /* renamed from: e */
    public final Handler f72226e;

    /* renamed from: h */
    private Queue<Effect> f72227h;

    /* renamed from: i */
    private Queue<Effect> f72228i;

    /* renamed from: j */
    private final AtomicBoolean f72229j;

    /* renamed from: k */
    private final C27371c f72230k;

    /* renamed from: com.ss.android.ugc.aweme.effect.a.a$a */
    public static final class C27360a {
        private C27360a() {
        }

        /* renamed from: a */
        public static EffectPlatform m89740a() {
            if (C27359a.f72220f == null) {
                C27359a.f72220f = new EffectPlatform(C35574k.m114861b(), C35574k.m114859a().mo70107v().mo83209c(), C35574k.m114859a().mo70078L().getOKHttpClient());
            }
            return C27359a.f72220f;
        }

        public /* synthetic */ C27360a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.a.a$b */
    public static final class C27361b {

        /* renamed from: a */
        public static final C27362a f72231a = new C27362a(null);

        /* renamed from: b */
        private Integer f72232b = Integer.valueOf(0);

        /* renamed from: c */
        private C27371c f72233c;

        /* renamed from: com.ss.android.ugc.aweme.effect.a.a$b$a */
        public static final class C27362a {
            private C27362a() {
            }

            public /* synthetic */ C27362a(C7571f fVar) {
                this();
            }
        }

        /* renamed from: a */
        public final C27359a mo70470a() {
            int i;
            Integer num = this.f72232b;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 3;
            }
            C27371c cVar = this.f72233c;
            if (cVar == null) {
                cVar = new C27369a();
            }
            return new C27359a(i, cVar, null);
        }

        /* renamed from: a */
        public final C27361b mo70468a(C27371c cVar) {
            this.f72233c = cVar;
            return this;
        }

        /* renamed from: a */
        public final C27361b mo70469a(Integer num) {
            this.f72232b = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.a.a$c */
    static final class C27363c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27359a f72234a;

        /* renamed from: b */
        final /* synthetic */ Effect f72235b;

        /* renamed from: c */
        final /* synthetic */ C43726c f72236c;

        C27363c(C27359a aVar, Effect effect, C43726c cVar) {
            this.f72234a = aVar;
            this.f72235b = effect;
            this.f72236c = cVar;
        }

        public final void run() {
            List<C27370b> list = this.f72234a.f72223b;
            C7573i.m23582a((Object) list, "mCallbacks");
            for (C27370b a : list) {
                a.mo70397a(this.f72235b, this.f72236c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.a.a$d */
    static final class C27364d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27359a f72237a;

        /* renamed from: b */
        final /* synthetic */ Effect f72238b;

        /* renamed from: c */
        final /* synthetic */ Effect f72239c;

        /* renamed from: d */
        final /* synthetic */ boolean f72240d;

        C27364d(C27359a aVar, Effect effect, Effect effect2, boolean z) {
            this.f72237a = aVar;
            this.f72238b = effect;
            this.f72239c = effect2;
            this.f72240d = z;
        }

        public final void run() {
            List<C27370b> list = this.f72237a.f72223b;
            C7573i.m23582a((Object) list, "mCallbacks");
            for (C27370b a : list) {
                a.mo70398a(this.f72238b, this.f72239c, this.f72240d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.a.a$e */
    static final class C27365e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27359a f72241a;

        /* renamed from: b */
        final /* synthetic */ Effect f72242b;

        C27365e(C27359a aVar, Effect effect) {
            this.f72241a = aVar;
            this.f72242b = effect;
        }

        public final void run() {
            List<C27370b> list = this.f72241a.f72223b;
            C7573i.m23582a((Object) list, "mCallbacks");
            for (C27370b a : list) {
                a.mo70396a(this.f72242b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.a.a$f */
    static final class C27366f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27359a f72243a;

        C27366f(C27359a aVar) {
            this.f72243a = aVar;
        }

        public final void run() {
            this.f72243a.f72224c.set(true);
            this.f72243a.mo70464b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.a.a$g */
    public static final class C27367g implements C43760j {

        /* renamed from: a */
        final /* synthetic */ C27359a f72244a;

        /* renamed from: b */
        final /* synthetic */ Effect f72245b;

        /* renamed from: com.ss.android.ugc.aweme.effect.a.a$g$a */
        static final class C27368a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27367g f72246a;

            C27368a(C27367g gVar) {
                this.f72246a = gVar;
            }

            public final void run() {
                this.f72246a.f72244a.mo70464b();
            }
        }

        /* renamed from: b */
        public final void mo9282b(Effect effect) {
        }

        /* renamed from: a */
        public final void mo9280a(Effect effect) {
            this.f72244a.f72222a.remove(this.f72245b);
            this.f72244a.f72225d.incrementAndGet();
            this.f72244a.mo70461a(this.f72245b, effect, true);
            this.f72244a.f72224c.set(true);
            this.f72244a.f72226e.post(new C27368a(this));
        }

        C27367g(C27359a aVar, Effect effect) {
            this.f72244a = aVar;
            this.f72245b = effect;
        }

        /* renamed from: a */
        public final void mo9281a(Effect effect, C43726c cVar) {
            String str;
            C7573i.m23587b(cVar, "e");
            this.f72244a.f72222a.remove(this.f72245b);
            this.f72244a.f72225d.incrementAndGet();
            this.f72244a.mo70460a(effect, cVar);
            StringBuilder sb = new StringBuilder();
            sb.append(C7573i.m23585a((Object) this.f72245b, (Object) effect));
            sb.append(", name: ");
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", download failed, reason: ");
            sb.append(cVar.f113221b);
            sb.append(", ");
            sb.append(Log.getStackTraceString(cVar.f113222c));
            this.f72244a.f72224c.set(!this.f72244a.f72222a.isEmpty());
        }
    }

    /* renamed from: a */
    public static EffectPlatform m89722a() {
        return C27360a.m89740a();
    }

    /* renamed from: d */
    private static boolean m89729d() {
        return !C7573i.m23585a((Object) Looper.myLooper(), (Object) Looper.getMainLooper());
    }

    /* renamed from: b */
    public final void mo70464b() {
        Effect effect;
        boolean z = true;
        while (this.f72224c.get() && this.f72225d.get() > 0 && z) {
            if (!this.f72227h.isEmpty()) {
                effect = (Effect) this.f72227h.poll();
            } else if (!this.f72228i.isEmpty()) {
                if (this.f72230k.mo70395a()) {
                    effect = this.f72230k.mo70394a(this.f72222a);
                } else {
                    effect = (Effect) this.f72228i.poll();
                }
            } else if (this.f72230k.mo70395a()) {
                effect = this.f72230k.mo70394a(this.f72222a);
            } else {
                effect = null;
            }
            if (effect != null && m89726b(effect)) {
                m89727c(effect);
            }
            if (effect != null) {
                z = true;
            } else {
                z = false;
            }
            this.f72224c.set(!this.f72222a.isEmpty());
        }
    }

    /* renamed from: c */
    public final void mo70467c() {
        EffectPlatform a = C27360a.m89740a();
        if (a != null) {
            a.destroy();
        }
        f72220f = null;
        this.f72222a.clear();
        this.f72227h.clear();
        this.f72223b.clear();
        this.f72224c.set(false);
    }

    /* renamed from: b */
    public final void mo70465b(C27370b bVar) {
        this.f72223b.remove(bVar);
    }

    /* renamed from: b */
    private final boolean m89726b(Effect effect) {
        if (this.f72222a.contains(effect)) {
            return false;
        }
        this.f72222a.add(effect);
        return true;
    }

    /* renamed from: b */
    private final void m89725b(List<? extends Effect> list) {
        for (Effect effect : list) {
            if (!this.f72228i.contains(effect)) {
                this.f72228i.add(effect);
            }
        }
    }

    /* renamed from: c */
    private final void m89727c(Effect effect) {
        this.f72225d.decrementAndGet();
        m89728d(effect);
        EffectPlatform a = C27360a.m89740a();
        if (a != null) {
            a.mo70620a(effect, (C43760j) new C27372b("edit_effect_download_error_rate", new C27367g(this, effect)));
        }
    }

    /* renamed from: d */
    private final void m89728d(Effect effect) {
        if (m89729d()) {
            this.f72226e.post(new C27365e(this, effect));
            return;
        }
        List<C27370b> list = this.f72223b;
        C7573i.m23582a((Object) list, "mCallbacks");
        for (C27370b a : list) {
            a.mo70396a(effect);
        }
    }

    /* renamed from: a */
    public final void mo70458a(C27370b bVar) {
        this.f72223b.add(bVar);
    }

    /* renamed from: a */
    public final void mo70459a(Effect effect) {
        if (effect != null) {
            if (!this.f72227h.contains(effect) && !this.f72222a.contains(effect)) {
                this.f72227h.add(effect);
            }
            m89728d(effect);
            if (!this.f72224c.get()) {
                this.f72226e.post(new C27366f(this));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo70466b(EffectModel effectModel) {
        String str;
        if (effectModel == null) {
            return false;
        }
        for (Effect effect : this.f72227h) {
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            if (C7573i.m23585a((Object) str, (Object) effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70462a(List<? extends Effect> list) {
        C7573i.m23587b(list, "effects");
        m89725b(list);
        this.f72224c.set(true);
        this.f72229j.set(true);
        mo70464b();
    }

    /* renamed from: a */
    public final boolean mo70463a(EffectModel effectModel) {
        String str;
        if (effectModel == null) {
            return false;
        }
        for (Effect effect : this.f72222a) {
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            if (C7573i.m23585a((Object) str, (Object) effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    private C27359a(int i, C27371c cVar) {
        this.f72230k = cVar;
        this.f72222a = new ConcurrentLinkedQueue();
        this.f72227h = new ConcurrentLinkedQueue();
        this.f72228i = new ConcurrentLinkedQueue();
        this.f72223b = Collections.synchronizedList(new ArrayList());
        this.f72229j = new AtomicBoolean(false);
        this.f72224c = new AtomicBoolean(false);
        this.f72225d = new AtomicInteger(i);
        this.f72226e = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo70460a(Effect effect, C43726c cVar) {
        if (m89729d()) {
            this.f72226e.post(new C27363c(this, effect, cVar));
            return;
        }
        List<C27370b> list = this.f72223b;
        C7573i.m23582a((Object) list, "mCallbacks");
        for (C27370b a : list) {
            a.mo70397a(effect, cVar);
        }
    }

    public /* synthetic */ C27359a(int i, C27371c cVar, C7571f fVar) {
        this(i, cVar);
    }

    /* renamed from: a */
    public final void mo70461a(Effect effect, Effect effect2, boolean z) {
        C7573i.m23587b(effect, "rawEffect");
        if (m89729d()) {
            this.f72226e.post(new C27364d(this, effect, effect2, z));
            return;
        }
        List<C27370b> list = this.f72223b;
        C7573i.m23582a((Object) list, "mCallbacks");
        for (C27370b a : list) {
            a.mo70398a(effect, effect2, z);
        }
    }
}
