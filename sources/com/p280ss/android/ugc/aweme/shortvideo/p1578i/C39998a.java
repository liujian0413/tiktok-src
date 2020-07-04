package com.p280ss.android.ugc.aweme.shortvideo.p1578i;

import android.app.Application;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.p517a.p522e.C10231c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.a */
public final class C39998a {

    /* renamed from: c */
    public static final C39998a f103899c = new C39998a();

    /* renamed from: d */
    public static final C39999a f103900d = new C39999a(null);

    /* renamed from: a */
    public Effect f103901a;

    /* renamed from: b */
    public int f103902b = -1;

    /* renamed from: e */
    private EffectPlatform f103903e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.i.a$a */
    public static final class C39999a {
        private C39999a() {
        }

        /* renamed from: b */
        private static C39998a m127893b() {
            return C39998a.f103899c;
        }

        /* renamed from: a */
        public final C39998a mo99454a() {
            return m127893b();
        }

        public /* synthetic */ C39999a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.i.a$b */
    public static final class C40000b implements C43756f {

        /* renamed from: a */
        final /* synthetic */ C39998a f103904a;

        /* renamed from: b */
        final /* synthetic */ C0052o f103905b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.i.a$b$a */
        public static final class C40001a implements C43760j {
            C40001a() {
            }

            /* renamed from: a */
            public final void mo9280a(Effect effect) {
            }

            /* renamed from: a */
            public final void mo9281a(Effect effect, C43726c cVar) {
                C7573i.m23587b(cVar, "e");
            }

            /* renamed from: b */
            public final void mo9282b(Effect effect) {
            }
        }

        /* renamed from: a */
        public final void mo70686a(C43726c cVar) {
            this.f103905b.setValue(LiveDataWrapper.m109596a(STATUS.ERROR, null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0011  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70687a(com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel r5) {
            /*
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L_0x000a
                com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = r5.category_effects
                if (r5 == 0) goto L_0x000a
                java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r5 = r5.effects
                goto L_0x000b
            L_0x000a:
                r5 = r0
            L_0x000b:
                boolean r1 = com.bytedance.common.utility.C6311g.m19573a(r5)
                if (r1 == 0) goto L_0x001d
                android.arch.lifecycle.o r5 = r4.f103905b
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r1 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.ERROR
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper r0 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.m109596a(r1, r0)
                r5.setValue(r0)
                return
            L_0x001d:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = (java.util.List) r1
                if (r5 != 0) goto L_0x0029
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0029:
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x002f:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L_0x004b
                java.lang.Object r2 = r5.next()
                com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r2
                if (r2 == 0) goto L_0x002f
                java.lang.String r3 = r2.getExtra()
                boolean r3 = com.p280ss.android.ugc.aweme.shortvideo.p1578i.C39998a.m127886a(r3)
                if (r3 == 0) goto L_0x002f
                r1.add(r2)
                goto L_0x002f
            L_0x004b:
                boolean r5 = com.bytedance.framwork.core.p517a.p522e.C10231c.m30354a(r1)
                if (r5 == 0) goto L_0x005d
                android.arch.lifecycle.o r5 = r4.f103905b
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r1 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.ERROR
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper r0 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.m109596a(r1, r0)
                r5.setValue(r0)
                return
            L_0x005d:
                com.ss.android.ugc.aweme.shortvideo.i.a r5 = r4.f103904a
                r2 = r1
                java.util.Collection r2 = (java.util.Collection) r2
                kotlin.e.c r2 = kotlin.collections.C7525m.m23462a(r2)
                kotlin.d.d$b r3 = kotlin.p355d.C7542d.f20874c
                kotlin.d.d r3 = (kotlin.p355d.C7542d) r3
                int r2 = kotlin.p356e.C7551d.m23561a(r2, r3)
                java.lang.Object r1 = r1.get(r2)
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r1
                r5.f103901a = r1
                com.ss.android.ugc.aweme.shortvideo.i.a r5 = r4.f103904a
                r1 = 1
                r5.f103902b = r1
                kotlin.Pair r5 = new kotlin.Pair
                com.ss.android.ugc.aweme.shortvideo.i.a r2 = r4.f103904a
                com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f103901a
                if (r2 == 0) goto L_0x0088
                java.lang.String r2 = r2.getExtra()
                goto L_0x0089
            L_0x0088:
                r2 = r0
            L_0x0089:
                boolean r2 = com.p280ss.android.ugc.aweme.shortvideo.p1578i.C39998a.m127886a(r2)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                r5.<init>(r2, r3)
                android.arch.lifecycle.o r2 = r4.f103905b
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r3 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.SUCCESS
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper r5 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.m109596a(r3, r5)
                r2.setValue(r5)
                com.ss.android.ugc.aweme.shortvideo.i.a r5 = r4.f103904a
                com.ss.android.ugc.aweme.effectplatform.EffectPlatform r5 = com.p280ss.android.ugc.aweme.shortvideo.p1578i.C39998a.m127885a(r5, r0, r1, r0)
                com.ss.android.ugc.aweme.shortvideo.i.a r0 = r4.f103904a
                com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f103901a
                com.ss.android.ugc.aweme.shortvideo.i.a$b$a r1 = new com.ss.android.ugc.aweme.shortvideo.i.a$b$a
                r1.<init>()
                com.ss.android.ugc.effectmanager.effect.b.j r1 = (com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j) r1
                r5.mo70620a(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1578i.C39998a.C40000b.mo70687a(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel):void");
        }

        C40000b(C39998a aVar, C0052o oVar) {
            this.f103904a = aVar;
            this.f103905b = oVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.i.a$c */
    public static final class C40002c implements C43759i {

        /* renamed from: a */
        final /* synthetic */ C39998a f103906a;

        /* renamed from: b */
        final /* synthetic */ C0052o f103907b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.i.a$c$a */
        public static final class C40003a implements C43760j {
            C40003a() {
            }

            /* renamed from: a */
            public final void mo9280a(Effect effect) {
            }

            /* renamed from: a */
            public final void mo9281a(Effect effect, C43726c cVar) {
                C7573i.m23587b(cVar, "e");
            }

            /* renamed from: b */
            public final void mo9282b(Effect effect) {
            }
        }

        /* renamed from: a */
        public final void mo95925a(C43726c cVar) {
            String str;
            StringBuilder sb = new StringBuilder("fetchReuseEffectMapToLive onFail:");
            if (cVar != null) {
                str = cVar.f113221b;
            } else {
                str = null;
            }
            sb.append(str);
            this.f103907b.setValue(LiveDataWrapper.m109596a(STATUS.ERROR, null));
        }

        /* renamed from: a */
        public final void mo95926a(List<Effect> list) {
            if (C10231c.m30354a(list)) {
                this.f103907b.setValue(LiveDataWrapper.m109596a(STATUS.ERROR, null));
                return;
            }
            StringBuilder sb = new StringBuilder("fetchReuseEffectMapToLive onSuccess effectsss:");
            if (list == null) {
                C7573i.m23580a();
            }
            boolean z = false;
            sb.append((Effect) list.get(0));
            if (list.get(0) == null) {
                this.f103907b.setValue(LiveDataWrapper.m109596a(STATUS.ERROR, null));
                return;
            }
            this.f103906a.f103901a = (Effect) list.get(0);
            this.f103906a.f103902b = 2;
            if (this.f103906a.f103901a != null) {
                z = true;
            }
            this.f103907b.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, new Pair(Boolean.valueOf(z), Integer.valueOf(2))));
            C39998a.m127885a(this.f103906a, null, 1, null).mo70620a(this.f103906a.f103901a, (C43760j) new C40003a());
        }

        C40002c(C39998a aVar, C0052o oVar) {
            this.f103906a = aVar;
            this.f103907b = oVar;
        }
    }

    /* renamed from: c */
    public static final C39998a m127889c() {
        return f103900d.mo99454a();
    }

    /* renamed from: b */
    public final void mo99453b() {
        this.f103901a = null;
        this.f103902b = -1;
        EffectPlatform effectPlatform = this.f103903e;
        if (effectPlatform != null) {
            effectPlatform.destroy();
        }
        this.f103903e = null;
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<Pair<Boolean, Integer>>> mo99451a() {
        C0052o oVar = new C0052o();
        m127885a(this, null, 1, null).mo70626a("livestreaming", "chunjie", 10, 0, 0, "0", new C40000b(this, oVar));
        return oVar;
    }

    /* renamed from: a */
    public static boolean m127886a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("is_blessing_sticker", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static String m127888b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).optString("map_to_live_sticker_id");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final EffectPlatform m127884a(Context context) {
        if (this.f103903e == null) {
            this.f103903e = new EffectPlatform(context, C35574k.m114859a().mo70107v().mo83209c(), C35574k.m114859a().mo70078L().getOKHttpClient());
        }
        EffectPlatform effectPlatform = this.f103903e;
        if (effectPlatform != null) {
            return effectPlatform;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.EffectPlatform");
    }

    /* renamed from: a */
    public final LiveData<LiveDataWrapper<Pair<Boolean, Integer>>> mo99452a(Effect effect) {
        C0052o oVar = new C0052o();
        if (effect == null) {
            oVar.setValue(LiveDataWrapper.m109596a(STATUS.ERROR, null));
            return oVar;
        }
        String b = m127888b(effect.getExtra());
        if (TextUtils.isEmpty(b)) {
            return oVar;
        }
        m127885a(this, null, 1, null).mo70639a(C7525m.m23466c(b), null, false, (C43759i) new C40002c(this, oVar));
        return oVar;
    }

    /* renamed from: a */
    public static boolean m127887a(boolean z, boolean z2) {
        if (C6399b.m19944t() || !z2 || z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ EffectPlatform m127885a(C39998a aVar, Context context, int i, Object obj) {
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        return aVar.m127884a((Context) b);
    }
}
