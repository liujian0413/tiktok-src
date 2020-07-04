package com.bytedance.android.live.broadcast.effect;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2425a;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2426b;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3409v;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.broadcast.effect.q */
public final class C2636q {

    /* renamed from: c */
    public static final C2637a f8441c = new C2637a(null);

    /* renamed from: a */
    public final ArrayList<C9355c> f8442a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C2638b> f8443b = new ArrayList<>();

    /* renamed from: com.bytedance.android.live.broadcast.effect.q$a */
    public static final class C2637a {
        private C2637a() {
        }

        public /* synthetic */ C2637a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static float m10781a(C9355c cVar, int i) {
            int i2;
            C7573i.m23587b(cVar, "sticker");
            if (i == 0) {
                return 0.0f;
            }
            int i3 = 100;
            boolean z = false;
            if (cVar.f25570i != null) {
                i3 = cVar.f25570i.f25590c;
                i2 = cVar.f25570i.f25591d;
            } else {
                i2 = 0;
            }
            if (i2 < 0) {
                z = true;
            }
            if (!z) {
                double d = (double) (i3 - i2);
                Double.isNaN(d);
                double d2 = (d * 1.0d) / 10000.0d;
                double d3 = (double) i;
                Double.isNaN(d3);
                return (float) (d2 * d3);
            } else if (i > 0) {
                double d4 = (double) i3;
                Double.isNaN(d4);
                double d5 = (d4 * 1.0d) / 5000.0d;
                double d6 = (double) i;
                Double.isNaN(d6);
                return (float) (d5 * d6 * 2.0d);
            } else {
                double d7 = (double) i2;
                Double.isNaN(d7);
                double d8 = (d7 * 1.0d) / -5000.0d;
                double d9 = (double) i;
                Double.isNaN(d9);
                return (float) (d8 * d9 * 2.0d);
            }
        }

        /* renamed from: a */
        public static int m10782a(C9355c cVar, float f) {
            int i;
            C7573i.m23587b(cVar, "sticker");
            boolean z = false;
            if (f == 0.0f) {
                return 0;
            }
            int i2 = 100;
            if (cVar.f25570i != null) {
                i2 = cVar.f25570i.f25590c;
                i = cVar.f25570i.f25591d;
            } else {
                i = 0;
            }
            if (i < 0) {
                z = true;
            }
            if (!z) {
                return (int) ((f * 10000.0f) / ((float) (i2 - i)));
            }
            if (f > 0.0f) {
                return (int) ((f * ((float) (5000 / i2))) / 2.0f);
            }
            return (int) ((f * ((float) (-5000 / i))) / 2.0f);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.q$b */
    public interface C2638b {
        /* renamed from: a */
        void mo9220a(C9355c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.q$c */
    public interface C2639c {
        /* renamed from: a */
        void mo9233a();

        /* renamed from: a */
        void mo9234a(List<? extends C9355c> list);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.q$d */
    public static final class C2640d implements C2426b {

        /* renamed from: a */
        final /* synthetic */ C2636q f8444a;

        /* renamed from: b */
        final /* synthetic */ C2639c f8445b;

        /* renamed from: c */
        final /* synthetic */ Fragment f8446c;

        /* renamed from: com.bytedance.android.live.broadcast.effect.q$d$a */
        static final class C2641a<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            final /* synthetic */ C2640d f8447a;

            C2641a(C2640d dVar) {
                this.f8447a = dVar;
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.bytedance.android.livesdkapi.depend.model.C9355c apply(com.p280ss.android.ugc.effectmanager.effect.model.Effect r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.C7573i.m23587b(r11, r0)
                    int r0 = r11.getEffectType()
                    r1 = 0
                    r2 = 1
                    if (r0 != r2) goto L_0x001b
                    java.util.List r0 = r11.getChildEffects()
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
                    if (r0 != 0) goto L_0x001b
                    r0 = 1
                    goto L_0x001c
                L_0x001b:
                    r0 = 0
                L_0x001c:
                    com.bytedance.android.live.broadcast.effect.q$d r3 = r10.f8447a
                    com.bytedance.android.live.broadcast.effect.q r3 = r3.f8444a
                    r4 = r0 ^ 1
                    com.bytedance.android.livesdkapi.depend.model.c r3 = r3.mo9310a(r11, r4)
                    com.google.gson.n r4 = new com.google.gson.n     // Catch:{ Throwable -> 0x006d }
                    r4.<init>()     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = r11.getExtra()     // Catch:{ Throwable -> 0x006d }
                    com.google.gson.k r4 = r4.mo47346a(r5)     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = "JsonParser().parse(it.extra)"
                    kotlin.jvm.internal.C7573i.m23582a(r4, r5)     // Catch:{ Throwable -> 0x006d }
                    com.google.gson.m r4 = r4.mo16136m()     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = "ab_group"
                    boolean r5 = r4.mo16148a(r5)     // Catch:{ Throwable -> 0x006d }
                    if (r5 == 0) goto L_0x0074
                    com.bytedance.android.live.core.setting.l<java.lang.Integer> r6 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP"
                    kotlin.jvm.internal.C7573i.m23582a(r6, r7)     // Catch:{ Throwable -> 0x006b }
                    java.lang.Object r6 = r6.mo10240a()     // Catch:{ Throwable -> 0x006b }
                    java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "ab_group"
                    com.google.gson.k r4 = r4.mo16149b(r7)     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "jsonObject.get(AB_GROUP)"
                    kotlin.jvm.internal.C7573i.m23582a(r4, r7)     // Catch:{ Throwable -> 0x006b }
                    int r4 = r4.mo16003g()     // Catch:{ Throwable -> 0x006b }
                    if (r6 != 0) goto L_0x0063
                    goto L_0x0074
                L_0x0063:
                    int r6 = r6.intValue()     // Catch:{ Throwable -> 0x006b }
                    if (r6 != r4) goto L_0x0074
                    r4 = 1
                    goto L_0x0075
                L_0x006b:
                    r4 = move-exception
                    goto L_0x006f
                L_0x006d:
                    r4 = move-exception
                    r5 = 0
                L_0x006f:
                    java.lang.String r6 = "LiveSmallItemBeautyDialogFragment"
                    com.bytedance.android.live.core.p147c.C3166a.m11963b(r6, r4)
                L_0x0074:
                    r4 = 0
                L_0x0075:
                    if (r0 == 0) goto L_0x00ce
                    if (r5 == 0) goto L_0x007b
                    if (r4 == 0) goto L_0x00ce
                L_0x007b:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.List r0 = (java.util.List) r0
                    java.util.List r4 = r11.getChildEffects()
                    int r4 = r4.size()
                    r5 = 0
                L_0x008b:
                    if (r5 >= r4) goto L_0x00cc
                    com.bytedance.android.live.broadcast.c.c r6 = com.bytedance.android.live.broadcast.p132c.C2515f.m10417f()
                    com.bytedance.android.live.broadcast.api.b.c r6 = r6.mo9074a()
                    java.util.List r7 = r11.getChildEffects()
                    java.lang.Object r7 = r7.get(r5)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r7 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r7
                    java.lang.Integer r6 = r6.mo8883a(r7)
                    com.bytedance.android.live.broadcast.effect.q$d r7 = r10.f8447a
                    com.bytedance.android.live.broadcast.effect.q r7 = r7.f8444a
                    java.util.List r8 = r11.getChildEffects()
                    java.lang.Object r8 = r8.get(r5)
                    java.lang.String r9 = "it.childEffects[index]"
                    kotlin.jvm.internal.C7573i.m23582a(r8, r9)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r8 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r8
                    if (r6 != 0) goto L_0x00b9
                    goto L_0x00c1
                L_0x00b9:
                    int r6 = r6.intValue()
                    if (r5 != r6) goto L_0x00c1
                    r6 = 1
                    goto L_0x00c2
                L_0x00c1:
                    r6 = 0
                L_0x00c2:
                    com.bytedance.android.livesdkapi.depend.model.c r6 = r7.mo9310a(r8, r6)
                    r0.add(r6)
                    int r5 = r5 + 1
                    goto L_0x008b
                L_0x00cc:
                    r3.f25571j = r0
                L_0x00ce:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.C2636q.C2640d.C2641a.apply(com.ss.android.ugc.effectmanager.effect.model.Effect):com.bytedance.android.livesdkapi.depend.model.c");
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.q$d$b */
        static final class C2642b<T> implements C7328l<C9355c> {

            /* renamed from: a */
            public static final C2642b f8448a = new C2642b();

            C2642b() {
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
                return m10789a((C9355c) obj);
            }

            /* renamed from: a */
            private static boolean m10789a(C9355c cVar) {
                C7573i.m23587b(cVar, "it");
                if (cVar.f25570i != null || !C6307b.m19566a((Collection<T>) cVar.f25571j)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.q$d$c */
        static final class C2643c<T> implements C7326g<List<C9355c>> {

            /* renamed from: a */
            final /* synthetic */ C2640d f8449a;

            C2643c(C2640d dVar) {
                this.f8449a = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(List<C9355c> list) {
                if (C6311g.m19573a(list)) {
                    C2639c cVar = this.f8449a.f8445b;
                    if (cVar != null) {
                        cVar.mo9233a();
                        return;
                    }
                    return;
                }
                C2639c cVar2 = this.f8449a.f8445b;
                if (cVar2 != null) {
                    C7573i.m23582a((Object) list, "it");
                    cVar2.mo9234a(list);
                }
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.q$d$d */
        static final class C2644d<T> implements C7326g<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C2640d f8450a;

            C2644d(C2640d dVar) {
                this.f8450a = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) {
                C2639c cVar = this.f8450a.f8445b;
                if (cVar != null) {
                    cVar.mo9233a();
                }
            }
        }

        /* renamed from: a */
        public final void mo8910a() {
            C2639c cVar = this.f8445b;
            if (cVar != null) {
                cVar.mo9233a();
            }
        }

        /* renamed from: a */
        public final void mo8911a(EffectChannelResponse effectChannelResponse) {
            if (effectChannelResponse == null || C3409v.m12670a(effectChannelResponse.allCategoryEffects)) {
                C2639c cVar = this.f8445b;
                if (cVar != null) {
                    cVar.mo9233a();
                    return;
                }
                return;
            }
            this.f8444a.f8442a.clear();
            ((C3247af) C7492s.m23300b((Iterable<? extends T>) effectChannelResponse.allCategoryEffects).mo19317d((C7327h<? super T, ? extends R>) new C2641a<Object,Object>(this)).mo19291a((C7328l<? super T>) C2642b.f8448a).mo19334m().mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19131a((C47555ab<T, ? extends R>) C3255e.m12294a(this.f8446c))).mo10187a(new C2643c(this), new C2644d(this));
        }

        C2640d(C2636q qVar, C2639c cVar, Fragment fragment) {
            this.f8444a = qVar;
            this.f8445b = cVar;
            this.f8446c = fragment;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.q$e */
    public static final class C2645e implements C2426b {

        /* renamed from: a */
        final /* synthetic */ C2636q f8451a;

        /* renamed from: b */
        final /* synthetic */ C2639c f8452b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f8453c;

        /* renamed from: com.bytedance.android.live.broadcast.effect.q$e$a */
        static final class C2646a<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            final /* synthetic */ C2645e f8454a;

            C2646a(C2645e eVar) {
                this.f8454a = eVar;
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.bytedance.android.livesdkapi.depend.model.C9355c apply(com.p280ss.android.ugc.effectmanager.effect.model.Effect r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.C7573i.m23587b(r11, r0)
                    int r0 = r11.getEffectType()
                    r1 = 0
                    r2 = 1
                    if (r0 != r2) goto L_0x001b
                    java.util.List r0 = r11.getChildEffects()
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
                    if (r0 != 0) goto L_0x001b
                    r0 = 1
                    goto L_0x001c
                L_0x001b:
                    r0 = 0
                L_0x001c:
                    com.bytedance.android.live.broadcast.effect.q$e r3 = r10.f8454a
                    com.bytedance.android.live.broadcast.effect.q r3 = r3.f8451a
                    r4 = r0 ^ 1
                    com.bytedance.android.livesdkapi.depend.model.c r3 = r3.mo9310a(r11, r4)
                    com.google.gson.n r4 = new com.google.gson.n     // Catch:{ Throwable -> 0x006d }
                    r4.<init>()     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = r11.getExtra()     // Catch:{ Throwable -> 0x006d }
                    com.google.gson.k r4 = r4.mo47346a(r5)     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = "JsonParser().parse(it.extra)"
                    kotlin.jvm.internal.C7573i.m23582a(r4, r5)     // Catch:{ Throwable -> 0x006d }
                    com.google.gson.m r4 = r4.mo16136m()     // Catch:{ Throwable -> 0x006d }
                    java.lang.String r5 = "ab_group"
                    boolean r5 = r4.mo16148a(r5)     // Catch:{ Throwable -> 0x006d }
                    if (r5 == 0) goto L_0x0074
                    com.bytedance.android.live.core.setting.l<java.lang.Integer> r6 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP"
                    kotlin.jvm.internal.C7573i.m23582a(r6, r7)     // Catch:{ Throwable -> 0x006b }
                    java.lang.Object r6 = r6.mo10240a()     // Catch:{ Throwable -> 0x006b }
                    java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "ab_group"
                    com.google.gson.k r4 = r4.mo16149b(r7)     // Catch:{ Throwable -> 0x006b }
                    java.lang.String r7 = "jsonObject.get(AB_GROUP)"
                    kotlin.jvm.internal.C7573i.m23582a(r4, r7)     // Catch:{ Throwable -> 0x006b }
                    int r4 = r4.mo16003g()     // Catch:{ Throwable -> 0x006b }
                    if (r6 != 0) goto L_0x0063
                    goto L_0x0074
                L_0x0063:
                    int r6 = r6.intValue()     // Catch:{ Throwable -> 0x006b }
                    if (r6 != r4) goto L_0x0074
                    r4 = 1
                    goto L_0x0075
                L_0x006b:
                    r4 = move-exception
                    goto L_0x006f
                L_0x006d:
                    r4 = move-exception
                    r5 = 0
                L_0x006f:
                    java.lang.String r6 = "LiveSmallItemBeautyDialogFragment"
                    com.bytedance.android.live.core.p147c.C3166a.m11963b(r6, r4)
                L_0x0074:
                    r4 = 0
                L_0x0075:
                    if (r0 == 0) goto L_0x00ce
                    if (r5 == 0) goto L_0x007b
                    if (r4 == 0) goto L_0x00ce
                L_0x007b:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.List r0 = (java.util.List) r0
                    java.util.List r4 = r11.getChildEffects()
                    int r4 = r4.size()
                    r5 = 0
                L_0x008b:
                    if (r5 >= r4) goto L_0x00cc
                    com.bytedance.android.live.broadcast.c.c r6 = com.bytedance.android.live.broadcast.p132c.C2515f.m10417f()
                    com.bytedance.android.live.broadcast.api.b.c r6 = r6.mo9074a()
                    java.util.List r7 = r11.getChildEffects()
                    java.lang.Object r7 = r7.get(r5)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r7 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r7
                    java.lang.Integer r6 = r6.mo8883a(r7)
                    com.bytedance.android.live.broadcast.effect.q$e r7 = r10.f8454a
                    com.bytedance.android.live.broadcast.effect.q r7 = r7.f8451a
                    java.util.List r8 = r11.getChildEffects()
                    java.lang.Object r8 = r8.get(r5)
                    java.lang.String r9 = "it.childEffects[index]"
                    kotlin.jvm.internal.C7573i.m23582a(r8, r9)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r8 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r8
                    if (r6 != 0) goto L_0x00b9
                    goto L_0x00c1
                L_0x00b9:
                    int r6 = r6.intValue()
                    if (r5 != r6) goto L_0x00c1
                    r6 = 1
                    goto L_0x00c2
                L_0x00c1:
                    r6 = 0
                L_0x00c2:
                    com.bytedance.android.livesdkapi.depend.model.c r6 = r7.mo9310a(r8, r6)
                    r0.add(r6)
                    int r5 = r5 + 1
                    goto L_0x008b
                L_0x00cc:
                    r3.f25571j = r0
                L_0x00ce:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.C2636q.C2645e.C2646a.apply(com.ss.android.ugc.effectmanager.effect.model.Effect):com.bytedance.android.livesdkapi.depend.model.c");
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.q$e$b */
        static final class C2647b<T> implements C7328l<C9355c> {

            /* renamed from: a */
            public static final C2647b f8455a = new C2647b();

            C2647b() {
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
                return m10796a((C9355c) obj);
            }

            /* renamed from: a */
            private static boolean m10796a(C9355c cVar) {
                C7573i.m23587b(cVar, "it");
                if (cVar.f25570i != null || !C6307b.m19566a((Collection<T>) cVar.f25571j)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.q$e$c */
        static final class C2648c<T> implements C7326g<List<C9355c>> {

            /* renamed from: a */
            final /* synthetic */ C2645e f8456a;

            C2648c(C2645e eVar) {
                this.f8456a = eVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(List<C9355c> list) {
                if (C6311g.m19573a(list)) {
                    C2639c cVar = this.f8456a.f8452b;
                    if (cVar != null) {
                        cVar.mo9233a();
                        return;
                    }
                    return;
                }
                C2639c cVar2 = this.f8456a.f8452b;
                if (cVar2 != null) {
                    C7573i.m23582a((Object) list, "it");
                    cVar2.mo9234a(list);
                }
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.effect.q$e$d */
        static final class C2649d<T> implements C7326g<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C2645e f8457a;

            C2649d(C2645e eVar) {
                this.f8457a = eVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) {
                C2639c cVar = this.f8457a.f8452b;
                if (cVar != null) {
                    cVar.mo9233a();
                }
            }
        }

        /* renamed from: a */
        public final void mo8910a() {
            C2639c cVar = this.f8452b;
            if (cVar != null) {
                cVar.mo9233a();
            }
        }

        /* renamed from: a */
        public final void mo8911a(EffectChannelResponse effectChannelResponse) {
            if (effectChannelResponse == null || C3409v.m12670a(effectChannelResponse.allCategoryEffects)) {
                C2639c cVar = this.f8452b;
                if (cVar != null) {
                    cVar.mo9233a();
                    return;
                }
                return;
            }
            this.f8451a.f8442a.clear();
            ((C3247af) C7492s.m23300b((Iterable<? extends T>) effectChannelResponse.allCategoryEffects).mo19317d((C7327h<? super T, ? extends R>) new C2646a<Object,Object>(this)).mo19291a((C7328l<? super T>) C2647b.f8455a).mo19334m().mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19131a((C47555ab<T, ? extends R>) C3255e.m12295a(this.f8453c))).mo10187a(new C2648c(this), new C2649d(this));
        }

        C2645e(C2636q qVar, C2639c cVar, FragmentActivity fragmentActivity) {
            this.f8451a = qVar;
            this.f8452b = cVar;
            this.f8453c = fragmentActivity;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.q$f */
    public static final class C2650f implements C2425a {

        /* renamed from: a */
        final /* synthetic */ C2636q f8458a;

        /* renamed from: b */
        final /* synthetic */ C2638b f8459b;

        /* renamed from: c */
        final /* synthetic */ boolean f8460c;

        /* renamed from: a */
        public final void mo8907a(String str, C9355c cVar) {
        }

        /* renamed from: b */
        public final void mo8908b(String str, C9355c cVar) {
            if (C7573i.m23585a((Object) C2418b.f7953d, (Object) str)) {
                Iterator it = this.f8458a.f8443b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        /* renamed from: c */
        public final void mo8909c(String str, C9355c cVar) {
            if (C7573i.m23585a((Object) C2418b.f7953d, (Object) str)) {
                if (cVar == null) {
                    Iterator it = this.f8458a.f8443b.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                if (this.f8460c) {
                    this.f8458a.mo9314a(cVar);
                }
                C2638b bVar = this.f8459b;
                if (bVar != null) {
                    bVar.mo9220a(cVar);
                }
                for (C2638b a : this.f8458a.f8443b) {
                    a.mo9220a(cVar);
                }
            }
        }

        C2650f(C2636q qVar, C2638b bVar, boolean z) {
            this.f8458a = qVar;
            this.f8459b = bVar;
            this.f8460c = z;
        }
    }

    /* renamed from: a */
    public static final float m10771a(C9355c cVar, int i) {
        return C2637a.m10781a(cVar, i);
    }

    /* renamed from: a */
    public final void mo9313a(FragmentActivity fragmentActivity) {
        m10772a(fragmentActivity, (C2639c) null);
    }

    /* renamed from: a */
    public final void mo9315a(C9355c cVar, boolean z, C2638b bVar) {
        C7573i.m23587b(cVar, "sticker");
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        if (b.mo9212a().mo8906a(cVar)) {
            if (z) {
                mo9314a(cVar);
            }
            if (bVar != null) {
                bVar.mo9220a(cVar);
            }
            for (C2638b a : this.f8443b) {
                a.mo9220a(cVar);
            }
            return;
        }
        C2588b b2 = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b2, "LiveInternalService.inst().liveEffectService()");
        b2.mo9212a().mo8905a(C2418b.f7953d, cVar, (C2425a) new C2650f(this, bVar, z));
    }

    /* renamed from: a */
    public final void mo9311a() {
        this.f8442a.clear();
        this.f8443b.clear();
    }

    /* renamed from: a */
    public final void mo9314a(C9355c cVar) {
        C7573i.m23587b(cVar, "sticker");
        C2421c a = C2515f.m10417f().mo9074a();
        Iterable iterable = this.f8442a;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (C6319n.m19594a(((C9355c) next).f25581t, cVar.f25581t)) {
                arrayList.add(next);
            }
        }
        for (C9355c cVar2 : (List) arrayList) {
            Float c = a.mo8899c(cVar2.f25570i.f25589b);
            if (c == null) {
                a.mo8892a(C2418b.f7953d, cVar2);
                a.mo8891a(cVar2.f25570i.f25589b, C2637a.m10781a(cVar2, cVar2.f25570i.f25588a));
            } else {
                a.mo8889a(cVar2, cVar2.f25570i.f25589b, c.floatValue(), true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10772a(FragmentActivity fragmentActivity, C2639c cVar) {
        C7573i.m23587b(fragmentActivity, "activity");
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo9212a().mo8904a(C2418b.f7953d, (C2426b) new C2645e(this, cVar, fragmentActivity));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        if (r1.intValue() != r2) goto L_0x004c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdkapi.depend.model.C9355c mo9310a(com.p280ss.android.ugc.effectmanager.effect.model.Effect r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "effect"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            com.bytedance.android.livesdkapi.depend.model.c r0 = com.bytedance.android.live.broadcast.effect.sticker.C2663f.m10852a(r8)
            com.google.gson.n r1 = new com.google.gson.n     // Catch:{ Throwable -> 0x00c7 }
            r1.<init>()     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r8 = r8.getExtra()     // Catch:{ Throwable -> 0x00c7 }
            com.google.gson.k r8 = r1.mo47346a(r8)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r1 = "JsonParser().parse(effect.extra)"
            kotlin.jvm.internal.C7573i.m23582a(r8, r1)     // Catch:{ Throwable -> 0x00c7 }
            com.google.gson.m r8 = r8.mo16136m()     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r1 = "ab_group"
            boolean r1 = r8.mo16148a(r1)     // Catch:{ Throwable -> 0x00c7 }
            if (r1 == 0) goto L_0x0052
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r1 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = "LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.Object r1 = r1.mo10240a()     // Catch:{ Throwable -> 0x00c7 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = "ab_group"
            com.google.gson.k r2 = r8.mo16149b(r2)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r3 = "jsonObject.get(AB_GROUP)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Throwable -> 0x00c7 }
            int r2 = r2.mo16003g()     // Catch:{ Throwable -> 0x00c7 }
            if (r1 != 0) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            int r1 = r1.intValue()     // Catch:{ Throwable -> 0x00c7 }
            if (r1 == r2) goto L_0x0052
        L_0x004c:
            java.lang.String r8 = "stickerBean"
            kotlin.jvm.internal.C7573i.m23582a(r0, r8)     // Catch:{ Throwable -> 0x00c7 }
            return r0
        L_0x0052:
            java.lang.String r1 = "beautyConfig"
            com.google.gson.k r8 = r8.mo16149b(r1)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r1 = "jsonObject.get(BEAUTY_CONFIG)"
            kotlin.jvm.internal.C7573i.m23582a(r8, r1)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r8 = r8.mo15998c()     // Catch:{ Throwable -> 0x00c7 }
            com.google.gson.n r1 = new com.google.gson.n     // Catch:{ Throwable -> 0x00c7 }
            r1.<init>()     // Catch:{ Throwable -> 0x00c7 }
            com.google.gson.k r8 = r1.mo47346a(r8)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r1 = "JsonParser().parse(beautyConfig)"
            kotlin.jvm.internal.C7573i.m23582a(r8, r1)     // Catch:{ Throwable -> 0x00c7 }
            com.google.gson.m r8 = r8.mo16136m()     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r1 = "items"
            com.google.gson.h r8 = r8.mo16151d(r1)     // Catch:{ Throwable -> 0x00c7 }
            r1 = 0
            com.google.gson.k r8 = r8.mo15995a(r1)     // Catch:{ Throwable -> 0x00c7 }
            com.google.gson.e r1 = com.bytedance.android.live.C2317a.m9932a()     // Catch:{ Throwable -> 0x00c7 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.c$a> r2 = com.bytedance.android.livesdkapi.depend.model.C9355c.C9356a.class
            java.lang.Object r8 = r1.mo15970a(r8, r2)     // Catch:{ Throwable -> 0x00c7 }
            com.bytedance.android.livesdkapi.depend.model.c$a r8 = (com.bytedance.android.livesdkapi.depend.model.C9355c.C9356a) r8     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r1 = "stickerBean"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ Throwable -> 0x00c7 }
            r0.f25570i = r8     // Catch:{ Throwable -> 0x00c7 }
            java.util.List<java.lang.String> r1 = r0.f25572k     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r8 = r8.f25589b     // Catch:{ Throwable -> 0x00c7 }
            r1.add(r8)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r8 = "beautyTag"
            java.lang.String r8 = com.bytedance.android.live.broadcast.effect.sticker.C2663f.m10857a(r8, r0)     // Catch:{ Throwable -> 0x00c7 }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r8)     // Catch:{ Throwable -> 0x00c7 }
            if (r1 != 0) goto L_0x00b8
            com.bytedance.android.live.broadcast.c.c r1 = com.bytedance.android.live.broadcast.p132c.C2515f.m10417f()     // Catch:{ Throwable -> 0x00c7 }
            com.bytedance.android.live.broadcast.effect.b r1 = r1.mo9075b()     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = "LiveInternalService.inst().liveEffectService()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ Throwable -> 0x00c7 }
            com.bytedance.android.live.broadcast.effect.sticker.a.b r1 = r1.mo9212a()     // Catch:{ Throwable -> 0x00c7 }
            r1.mo9320a(r8, r0)     // Catch:{ Throwable -> 0x00c7 }
        L_0x00b8:
            java.util.ArrayList<com.bytedance.android.livesdkapi.depend.model.c> r8 = r7.f8442a     // Catch:{ Throwable -> 0x00c7 }
            r8.add(r0)     // Catch:{ Throwable -> 0x00c7 }
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r2 = r0
            r3 = r9
            r1.mo9315a(r2, r3, null)     // Catch:{ Throwable -> 0x00c7 }
            goto L_0x00cd
        L_0x00c7:
            r8 = move-exception
            java.lang.String r9 = "LiveSmallItemBeautyDialogFragment"
            com.bytedance.android.live.core.p147c.C3166a.m11963b(r9, r8)
        L_0x00cd:
            java.lang.String r8 = "stickerBean"
            kotlin.jvm.internal.C7573i.m23582a(r0, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.C2636q.mo9310a(com.ss.android.ugc.effectmanager.effect.model.Effect, boolean):com.bytedance.android.livesdkapi.depend.model.c");
    }

    /* renamed from: a */
    public final void mo9312a(Fragment fragment, C2639c cVar) {
        C7573i.m23587b(fragment, "fragment");
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo9212a().mo8904a(C2418b.f7953d, (C2426b) new C2640d(this, cVar, fragment));
    }
}
