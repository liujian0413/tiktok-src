package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.effectplatform.C27491l;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c */
public final class C39440c {

    /* renamed from: b */
    public static final C7541d f102398b = C7546e.m23569a(C39442b.f102404a);

    /* renamed from: c */
    public static EffectPlatform f102399c;

    /* renamed from: d */
    public static final C7541d f102400d = C7546e.m23569a(C39443c.f102405a);

    /* renamed from: e */
    public static final C39441a f102401e = new C39441a(null);

    /* renamed from: a */
    public CategoryPageModel f102402a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$a */
    public static final class C39441a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f102403a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C39441a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C39441a.class), "mCache", "getMCache()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioPreprocessCache;"))};

        private C39441a() {
        }

        /* renamed from: a */
        public static C39440c m125976a() {
            return (C39440c) C39440c.f102398b.getValue();
        }

        /* renamed from: c */
        public static C39451f m125978c() {
            return (C39451f) C39440c.f102400d.getValue();
        }

        /* renamed from: b */
        public static EffectPlatform m125977b() {
            if (C39440c.f102399c == null) {
                EffectPlatform effectPlatform = new EffectPlatform(C35563c.f93238a, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
                C35563c.m114838e();
                C39440c.f102399c = effectPlatform;
            }
            return C39440c.f102399c;
        }

        public /* synthetic */ C39441a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$b */
    static final class C39442b extends Lambda implements C7561a<C39440c> {

        /* renamed from: a */
        public static final C39442b f102404a = new C39442b();

        C39442b() {
            super(0);
        }

        /* renamed from: a */
        private static C39440c m125979a() {
            return new C39440c(null);
        }

        public final /* synthetic */ Object invoke() {
            return m125979a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$c */
    static final class C39443c extends Lambda implements C7561a<C39451f> {

        /* renamed from: a */
        public static final C39443c f102405a = new C39443c();

        C39443c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m125980a();
        }

        /* renamed from: a */
        private static C39451f m125980a() {
            return new C39451f(0, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$d */
    public interface C39444d {
        /* renamed from: a */
        void mo98253a(Effect effect);

        /* renamed from: a */
        void mo98254a(Effect effect, C43726c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e */
    public interface C39445e {
        /* renamed from: a */
        void mo98275a(int i, String str);

        /* renamed from: a */
        void mo98276a(CategoryPageModel categoryPageModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$f */
    public static final class C39446f implements C43760j {

        /* renamed from: a */
        final /* synthetic */ C39444d f102406a;

        /* renamed from: b */
        public final void mo9282b(Effect effect) {
        }

        C39446f(C39444d dVar) {
            this.f102406a = dVar;
        }

        /* renamed from: a */
        public final void mo9280a(Effect effect) {
            C39444d dVar = this.f102406a;
            if (dVar != null) {
                dVar.mo98253a(effect);
            }
        }

        /* renamed from: a */
        public final void mo9281a(Effect effect, C43726c cVar) {
            C7573i.m23587b(cVar, "e");
            C39444d dVar = this.f102406a;
            if (dVar != null) {
                dVar.mo98254a(effect, cVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$g */
    public static final class C39447g implements C43756f {

        /* renamed from: a */
        final /* synthetic */ C39440c f102407a;

        /* renamed from: b */
        final /* synthetic */ C39445e f102408b;

        /* renamed from: a */
        public final void mo70687a(CategoryPageModel categoryPageModel) {
            this.f102407a.f102402a = categoryPageModel;
            C39445e eVar = this.f102408b;
            if (eVar != null) {
                eVar.mo98276a(categoryPageModel);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
            if (r3 == null) goto L_0x0010;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70686a(com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e r0 = r2.f102408b
                if (r0 == 0) goto L_0x0016
                if (r3 == 0) goto L_0x0009
                int r1 = r3.f113220a
                goto L_0x000a
            L_0x0009:
                r1 = 0
            L_0x000a:
                if (r3 == 0) goto L_0x0010
                java.lang.String r3 = r3.f113221b
                if (r3 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r3 = ""
            L_0x0012:
                r0.mo98275a(r1, r3)
                return
            L_0x0016:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39440c.C39447g.mo70686a(com.ss.android.ugc.effectmanager.common.d.c):void");
        }

        C39447g(C39440c cVar, C39445e eVar) {
            this.f102407a = cVar;
            this.f102408b = eVar;
        }
    }

    private C39440c() {
    }

    /* renamed from: c */
    public static final C39440c m125973c() {
        return C39441a.m125976a();
    }

    /* renamed from: a */
    public static void m125967a() {
        EffectPlatform b = C39441a.m125977b();
        if (b != null) {
            b.destroy();
        }
        f102399c = null;
    }

    /* renamed from: b */
    public final void mo98274b() {
        C39441a.m125978c().mo98277a();
        this.f102402a = null;
    }

    public /* synthetic */ C39440c(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public static void m125968a(int i) {
        C39441a.m125978c().mo98278a(1);
    }

    /* renamed from: a */
    public static boolean m125971a(Effect effect) {
        boolean z;
        if (C39428a.m125948a(effect)) {
            return true;
        }
        if (effect != null) {
            EffectPlatform b = C39441a.m125977b();
            if (b != null) {
                z = b.mo70640a(effect);
            } else {
                z = false;
            }
            if (z || effect.getEffectType() != 0 || effect.getTags().contains("hw_beauty")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m125972a(String str) {
        if (str == null) {
            return null;
        }
        return C39441a.m125978c().mo98280a(str);
    }

    /* renamed from: a */
    public final void mo98273a(C39445e eVar) {
        List<String> list;
        if (this.f102402a != null) {
            CategoryPageModel categoryPageModel = this.f102402a;
            if (categoryPageModel != null) {
                list = categoryPageModel.url_prefix;
            } else {
                list = null;
            }
            if (!C6307b.m19566a((Collection<T>) list)) {
                eVar.mo98276a(this.f102402a);
                return;
            }
        }
        EffectPlatform b = C39441a.m125977b();
        if (b != null) {
            b.mo70632a("voicechanger", "all", false, 8, 0, 0, "", new C39447g(this, eVar));
        }
    }

    /* renamed from: a */
    public static void m125970a(String str, byte[] bArr) {
        C39441a.m125978c().mo98279a(str, bArr);
    }

    /* renamed from: a */
    public static void m125969a(Effect effect, C39444d dVar) {
        C7573i.m23587b(effect, "effect");
        EffectPlatform b = C39441a.m125977b();
        if (b != null) {
            b.mo70620a(effect, (C43760j) C27491l.m90122a((C43760j) new C39446f(dVar)));
        }
    }
}
