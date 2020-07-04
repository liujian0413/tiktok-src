package com.p280ss.android.ugc.aweme.tools.beauty.manager;

import com.p280ss.android.ugc.aweme.beauty.BeautyCategory;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategoryGender;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48080as;
import kotlinx.coroutines.C48093bb;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.e */
public final class C42203e {

    /* renamed from: a */
    public static final C42203e f109780a = new C42203e();

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.e$a */
    public static final class C42204a implements C43757g {

        /* renamed from: a */
        final /* synthetic */ C43757g f109781a;

        @C7540d(mo19421b = "BeautyRequestPresenter.kt", mo19422c = {53, 55, 61, 62}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautyRequestPresenter$sendRequest$1$onSuccess$1")
        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.e$a$a */
        static final class C42205a extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

            /* renamed from: a */
            Object f109782a;

            /* renamed from: b */
            Object f109783b;

            /* renamed from: c */
            Object f109784c;

            /* renamed from: d */
            Object f109785d;

            /* renamed from: e */
            int f109786e;

            /* renamed from: f */
            final /* synthetic */ C42204a f109787f;

            /* renamed from: g */
            final /* synthetic */ EffectChannelResponse f109788g;

            /* renamed from: h */
            private C48056ad f109789h;

            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.e$a$a$a */
            static final class C42206a<T, R> implements C7327h<T, R> {

                /* renamed from: a */
                public static final C42206a f109790a = new C42206a();

                C42206a() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return m134274a((ArrayList) obj);
                }

                /* renamed from: a */
                private static List<ComposerBeauty> m134274a(ArrayList<ComposerBeauty> arrayList) {
                    C7573i.m23587b(arrayList, "it");
                    return C42212g.m134298a((List<ComposerBeauty>) arrayList);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.e$a$a$b */
            static final class C42207b<T, R> implements C7327h<T, R> {

                /* renamed from: a */
                public static final C42207b f109791a = new C42207b();

                C42207b() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return m134275a((List) obj);
                }

                /* renamed from: a */
                private static List<ComposerBeauty> m134275a(List<ComposerBeauty> list) {
                    C7573i.m23587b(list, "it");
                    C42191b.m134225a(list);
                    return list;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.e$a$a$c */
            static final class C42208c<T> implements C7326g<List<? extends ComposerBeauty>> {

                /* renamed from: a */
                final /* synthetic */ C42205a f109792a;

                C42208c(C42205a aVar) {
                    this.f109792a = aVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(List<ComposerBeauty> list) {
                    boolean z;
                    Collection collection = list;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C42191b.f109761b.mo103629a();
                        C43757g gVar = this.f109792a.f109787f.f109781a;
                        if (gVar != null) {
                            gVar.mo9275a(this.f109792a.f109788g);
                        }
                    }
                }
            }

            C42205a(C42204a aVar, EffectChannelResponse effectChannelResponse, C47919b bVar) {
                this.f109787f = aVar;
                this.f109788g = effectChannelResponse;
                super(2, bVar);
            }

            public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
                C7573i.m23587b(bVar, "completion");
                C42205a aVar = new C42205a(this.f109787f, this.f109788g, bVar);
                aVar.f109789h = (C48056ad) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C42205a) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
                r6 = r1.allCategoryEffects;
                kotlin.jvm.internal.C7573i.m23582a((java.lang.Object) r6, "allCategoryEffects");
                r8.f109782a = r5;
                r8.f109783b = r4;
                r8.f109784c = r1;
                r8.f109785d = r9;
                r8.f109786e = 4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
                if (com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c.m134242b(r6, (kotlin.coroutines.C47919b<? super kotlin.C7581n>) r8) != r0) goto L_0x00e1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
                return r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
                r0 = new java.util.ArrayList();
                r9 = r9.entrySet().iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f2, code lost:
                if (r9.hasNext() == false) goto L_0x0146;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f4, code lost:
                r1 = ((java.lang.Iterable) ((java.util.Map.Entry) r9.next()).getValue()).iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x0108, code lost:
                if (r1.hasNext() == false) goto L_0x00ee;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x010a, code lost:
                r4 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r1.next();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x0114, code lost:
                if (r4.isCollectionType() == false) goto L_0x0142;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x0116, code lost:
                r4 = r4.getChildList();
                r5 = r4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x011d, code lost:
                if (r5 == null) goto L_0x0128;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x0123, code lost:
                if (r5.isEmpty() == false) goto L_0x0126;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x0126, code lost:
                r5 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
                r5 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x0132, code lost:
                if (kotlin.coroutines.jvm.internal.C47951a.m148882a(!r5).booleanValue() == false) goto L_0x0135;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:0x0135, code lost:
                r4 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:60:0x0136, code lost:
                if (r4 == null) goto L_0x0104;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x0138, code lost:
                kotlin.coroutines.jvm.internal.C47951a.m148882a(r0.addAll(r4));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:62:0x0142, code lost:
                r0.add(r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x0146, code lost:
                com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.m134298a((java.util.List<com.p280ss.android.ugc.aweme.beauty.ComposerBeauty>) r0);
                p346io.reactivex.C7329e.m22973a(r0).mo19159b(p346io.reactivex.p351i.C7333a.m23044b()).mo19158b((p346io.reactivex.p348d.C7327h<? super T, ? extends R>) com.p280ss.android.ugc.aweme.tools.beauty.manager.C42203e.C42204a.C42205a.C42206a.f109790a).mo19152a(p346io.reactivex.p1865a.p1867b.C47549a.m148327a()).mo19158b((p346io.reactivex.p348d.C7327h<? super T, ? extends R>) com.p280ss.android.ugc.aweme.tools.beauty.manager.C42203e.C42204a.C42205a.C42207b.f109791a).mo19152a(p346io.reactivex.p351i.C7333a.m23044b()).mo19163d(new com.p280ss.android.ugc.aweme.tools.beauty.manager.C42203e.C42204a.C42205a.C42208c(r8));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:65:0x0184, code lost:
                return kotlin.C7581n.f20898a;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.C47948a.m148881a()
                    int r1 = r8.f109786e
                    r2 = 0
                    r3 = 1
                    switch(r1) {
                        case 0: goto L_0x0038;
                        case 1: goto L_0x002b;
                        case 2: goto L_0x002b;
                        case 3: goto L_0x0019;
                        case 4: goto L_0x0013;
                        default: goto L_0x000b;
                    }
                L_0x000b:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x0013:
                    java.lang.Object r9 = r8.f109785d
                    java.util.Map r9 = (java.util.Map) r9
                    goto L_0x00e1
                L_0x0019:
                    java.lang.Object r9 = r8.f109785d
                    java.util.Map r9 = (java.util.Map) r9
                    java.lang.Object r1 = r8.f109784c
                    com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
                    java.lang.Object r4 = r8.f109783b
                    com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r4 = (com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r4
                    java.lang.Object r5 = r8.f109782a
                    kotlinx.coroutines.ad r5 = (kotlinx.coroutines.C48056ad) r5
                    goto L_0x00c8
                L_0x002b:
                    java.lang.Object r1 = r8.f109784c
                    com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
                    java.lang.Object r4 = r8.f109783b
                    com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r4 = (com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r4
                    java.lang.Object r5 = r8.f109782a
                    kotlinx.coroutines.ad r5 = (kotlinx.coroutines.C48056ad) r5
                    goto L_0x0087
                L_0x0038:
                    kotlinx.coroutines.ad r5 = r8.f109789h
                    com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = r8.f109788g
                    if (r1 == 0) goto L_0x0182
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r9 = r1.categoryResponseList
                    java.util.Collection r9 = (java.util.Collection) r9
                    if (r9 == 0) goto L_0x004d
                    boolean r9 = r9.isEmpty()
                    if (r9 == 0) goto L_0x004b
                    goto L_0x004d
                L_0x004b:
                    r9 = 0
                    goto L_0x004e
                L_0x004d:
                    r9 = 1
                L_0x004e:
                    if (r9 == 0) goto L_0x0068
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r9 = r1.allCategoryEffects
                    java.util.Collection r9 = (java.util.Collection) r9
                    if (r9 == 0) goto L_0x005f
                    boolean r9 = r9.isEmpty()
                    if (r9 == 0) goto L_0x005d
                    goto L_0x005f
                L_0x005d:
                    r9 = 0
                    goto L_0x0060
                L_0x005f:
                    r9 = 1
                L_0x0060:
                    if (r9 == 0) goto L_0x0068
                    com.p280ss.android.ugc.aweme.beauty.C23536f.m77297a(r3)
                    kotlin.n r9 = kotlin.C7581n.f20898a
                    return r9
                L_0x0068:
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r9 = r1.categoryResponseList
                    int r9 = r9.size()
                    if (r9 <= 0) goto L_0x008a
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r9 = r1.categoryResponseList
                    java.lang.String r4 = "categoryResponseList"
                    kotlin.jvm.internal.C7573i.m23582a(r9, r4)
                    r8.f109782a = r5
                    r8.f109783b = r1
                    r8.f109784c = r1
                    r8.f109786e = r3
                    java.lang.Object r9 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.m134309b(r9, r8)
                    if (r9 != r0) goto L_0x0086
                    return r0
                L_0x0086:
                    r4 = r1
                L_0x0087:
                    java.util.Map r9 = (java.util.Map) r9
                    goto L_0x00a1
                L_0x008a:
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r9 = r1.allCategoryEffects
                    java.lang.String r4 = "allCategoryEffects"
                    kotlin.jvm.internal.C7573i.m23582a(r9, r4)
                    r8.f109782a = r5
                    r8.f109783b = r1
                    r8.f109784c = r1
                    r4 = 2
                    r8.f109786e = r4
                    java.lang.Object r9 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.m134294a(r9, r8)
                    if (r9 != r0) goto L_0x0086
                    return r0
                L_0x00a1:
                    com.ss.android.ugc.aweme.tools.beauty.manager.e r6 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42203e.f109780a
                    r6.mo103646a(r9)
                    boolean r6 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42203e.m134270b(r9)
                    if (r6 == 0) goto L_0x0182
                    com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.m134303a(r9)
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r6 = r1.categoryResponseList
                    java.lang.String r7 = "categoryResponseList"
                    kotlin.jvm.internal.C7573i.m23582a(r6, r7)
                    r8.f109782a = r5
                    r8.f109783b = r4
                    r8.f109784c = r1
                    r8.f109785d = r9
                    r7 = 3
                    r8.f109786e = r7
                    java.lang.Object r6 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c.m134237a(r6, r8)
                    if (r6 != r0) goto L_0x00c8
                    return r0
                L_0x00c8:
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r6 = r1.allCategoryEffects
                    java.lang.String r7 = "allCategoryEffects"
                    kotlin.jvm.internal.C7573i.m23582a(r6, r7)
                    r8.f109782a = r5
                    r8.f109783b = r4
                    r8.f109784c = r1
                    r8.f109785d = r9
                    r1 = 4
                    r8.f109786e = r1
                    java.lang.Object r1 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c.m134242b(r6, r8)
                    if (r1 != r0) goto L_0x00e1
                    return r0
                L_0x00e1:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Set r9 = r9.entrySet()
                    java.util.Iterator r9 = r9.iterator()
                L_0x00ee:
                    boolean r1 = r9.hasNext()
                    if (r1 == 0) goto L_0x0146
                    java.lang.Object r1 = r9.next()
                    java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                    java.lang.Object r1 = r1.getValue()
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.Iterator r1 = r1.iterator()
                L_0x0104:
                    boolean r4 = r1.hasNext()
                    if (r4 == 0) goto L_0x00ee
                    java.lang.Object r4 = r1.next()
                    com.ss.android.ugc.aweme.beauty.ComposerBeauty r4 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r4
                    boolean r5 = r4.isCollectionType()
                    if (r5 == 0) goto L_0x0142
                    java.util.List r4 = r4.getChildList()
                    r5 = r4
                    java.util.Collection r5 = (java.util.Collection) r5
                    if (r5 == 0) goto L_0x0128
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L_0x0126
                    goto L_0x0128
                L_0x0126:
                    r5 = 0
                    goto L_0x0129
                L_0x0128:
                    r5 = 1
                L_0x0129:
                    r5 = r5 ^ r3
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C47951a.m148882a(r5)
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x0135
                    goto L_0x0136
                L_0x0135:
                    r4 = 0
                L_0x0136:
                    if (r4 == 0) goto L_0x0104
                    java.util.Collection r4 = (java.util.Collection) r4
                    boolean r4 = r0.addAll(r4)
                    kotlin.coroutines.jvm.internal.C47951a.m148882a(r4)
                    goto L_0x0104
                L_0x0142:
                    r0.add(r4)
                    goto L_0x0104
                L_0x0146:
                    r9 = r0
                    java.util.List r9 = (java.util.List) r9
                    com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.m134298a(r9)
                    io.reactivex.e r9 = p346io.reactivex.C7329e.m22973a(r0)
                    io.reactivex.z r0 = p346io.reactivex.p351i.C7333a.m23044b()
                    io.reactivex.e r9 = r9.mo19159b(r0)
                    com.ss.android.ugc.aweme.tools.beauty.manager.e$a$a$a r0 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42203e.C42204a.C42205a.C42206a.f109790a
                    io.reactivex.d.h r0 = (p346io.reactivex.p348d.C7327h) r0
                    io.reactivex.e r9 = r9.mo19158b(r0)
                    io.reactivex.z r0 = p346io.reactivex.p1865a.p1867b.C47549a.m148327a()
                    io.reactivex.e r9 = r9.mo19152a(r0)
                    com.ss.android.ugc.aweme.tools.beauty.manager.e$a$a$b r0 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42203e.C42204a.C42205a.C42207b.f109791a
                    io.reactivex.d.h r0 = (p346io.reactivex.p348d.C7327h) r0
                    io.reactivex.e r9 = r9.mo19158b(r0)
                    io.reactivex.z r0 = p346io.reactivex.p351i.C7333a.m23044b()
                    io.reactivex.e r9 = r9.mo19152a(r0)
                    com.ss.android.ugc.aweme.tools.beauty.manager.e$a$a$c r0 = new com.ss.android.ugc.aweme.tools.beauty.manager.e$a$a$c
                    r0.<init>(r8)
                    io.reactivex.d.g r0 = (p346io.reactivex.p348d.C7326g) r0
                    r9.mo19163d(r0)
                L_0x0182:
                    kotlin.n r9 = kotlin.C7581n.f20898a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.beauty.manager.C42203e.C42204a.C42205a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        C42204a(C43757g gVar) {
            this.f109781a = gVar;
        }

        /* renamed from: a */
        public final void mo9274a(C43726c cVar) {
            C23536f.m77297a(true);
            if (cVar != null) {
                C41530am.m132281a((Throwable) cVar.f113222c);
            }
        }

        /* renamed from: a */
        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            C48145g.m149385a(C48093bb.f122957a, C48080as.m149073c(), null, new C42205a(this, effectChannelResponse, null), 2, null);
        }
    }

    private C42203e() {
    }

    /* renamed from: a */
    public final void mo103646a(Map<BeautyCategory, ? extends List<ComposerBeauty>> map) {
        C7573i.m23587b(map, "netMap");
        if (m134270b(map)) {
            C23536f.m77297a(false);
        } else {
            C23536f.m77297a(true);
        }
    }

    /* renamed from: a */
    public static void m134269a(C43757g gVar) {
        String str;
        EffectPlatform effectPlatform = new EffectPlatform(C35574k.m114861b(), C35574k.m114859a().mo70107v().mo83209c(), C35574k.m114859a().mo70078L().getOKHttpClient());
        if (C23536f.m77302e()) {
            str = "composer1";
        } else {
            str = "beautifynew1";
        }
        effectPlatform.mo70641b(str, false, new C42204a(gVar));
    }

    /* renamed from: b */
    public static boolean m134270b(Map<BeautyCategory, ? extends List<ComposerBeauty>> map) {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        boolean z2;
        Object obj4;
        boolean z3;
        Object obj5;
        boolean z4;
        boolean z5;
        boolean z6;
        C7573i.m23587b(map, "$this$isValid");
        Iterator it = map.keySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C7573i.m23585a((Object) ((BeautyCategory) obj2).getBeautyCategoryExtra().getGender(), (Object) BeautyCategoryGender.ALL.getFlag())) {
                break;
            }
        }
        if (((BeautyCategory) obj2) != null) {
            z = true;
        } else {
            z = false;
        }
        Iterator it2 = map.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (C7573i.m23585a((Object) ((BeautyCategory) obj3).getBeautyCategoryExtra().getGender(), (Object) BeautyCategoryGender.MALE.getFlag())) {
                break;
            }
        }
        if (((BeautyCategory) obj3) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = map.keySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it3.next();
            if (C7573i.m23585a((Object) ((BeautyCategory) obj4).getBeautyCategoryExtra().getGender(), (Object) BeautyCategoryGender.FEMALE.getFlag())) {
                break;
            }
        }
        if (((BeautyCategory) obj4) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Iterator it4 = map.keySet().iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it4.next();
            if (C42212g.m134305a(((BeautyCategory) obj5).getBeautyCategoryExtra())) {
                break;
            }
        }
        if (((BeautyCategory) obj5) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        Iterator it5 = map.keySet().iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next = it5.next();
            if (C42212g.m134313b(((BeautyCategory) next).getBeautyCategoryExtra())) {
                obj = next;
                break;
            }
        }
        if (((BeautyCategory) obj) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z || (z2 && z3)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!(!map.isEmpty()) || !z6 || !z4 || !z5) {
            return false;
        }
        return true;
    }
}
