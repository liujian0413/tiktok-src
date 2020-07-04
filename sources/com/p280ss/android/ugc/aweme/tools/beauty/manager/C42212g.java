package com.p280ss.android.ugc.aweme.tools.beauty.manager;

import android.util.Log;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.asve.p754b.C15388c;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategory;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategoryExtra;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategoryGender;
import com.p280ss.android.ugc.aweme.beauty.C23530a;
import com.p280ss.android.ugc.aweme.beauty.C23532c;
import com.p280ss.android.ugc.aweme.beauty.C23537g;
import com.p280ss.android.ugc.aweme.beauty.C23538h;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27413a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43022cq;
import com.p280ss.android.ugc.aweme.utils.C43074dw;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48080as;
import kotlinx.coroutines.C48093bb;
import kotlinx.coroutines.C48143e;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g */
public final class C42212g {

    /* renamed from: a */
    public static final C42212g f109798a = new C42212g();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Map<BeautyCategory, ? extends List<ComposerBeauty>> f109799b;

    /* renamed from: c */
    private static final C43074dw<Map<BeautyCategory, List<ComposerBeauty>>> f109800c = new C43074dw<>();

    /* renamed from: d */
    private static C43074dw<List<ComposerInfo>> f109801d = new C43074dw<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static C23532c f109802e;

    /* renamed from: f */
    private static final ArrayList<ComposerBeauty> f109803f = new ArrayList<>();

    /* renamed from: g */
    private static C43074dw<List<ComposerInfo>> f109804g = new C43074dw<>();

    /* renamed from: h */
    private static final C42214a f109805h = new C42214a();

    @C7540d(mo19421b = "BeautySource.kt", mo19422c = {42}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$1")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$1 */
    static final class C422131 extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f109806a;

        /* renamed from: b */
        Object f109807b;

        /* renamed from: c */
        int f109808c;

        /* renamed from: d */
        private C48056ad f109809d;

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C422131 r0 = new C422131(bVar);
            r0.f109809d = (C48056ad) obj;
            return r0;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C422131) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            C42212g gVar;
            Object a = C47948a.m148881a();
            switch (this.f109808c) {
                case 0:
                    C48056ad adVar = this.f109809d;
                    C42212g gVar2 = C42212g.f109798a;
                    C42212g gVar3 = C42212g.f109798a;
                    this.f109806a = adVar;
                    this.f109807b = gVar2;
                    this.f109808c = 1;
                    obj = gVar3.mo103649a((C47919b<? super Map<BeautyCategory, ? extends List<ComposerBeauty>>>) this);
                    if (obj != a) {
                        gVar = gVar2;
                        break;
                    } else {
                        return a;
                    }
                case 1:
                    gVar = (C42212g) this.f109807b;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42212g.f109799b = (Map) obj;
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$a */
    public static final class C42214a implements C27413a<C23537g, Void> {

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$a$a */
        static final class C42215a extends Lambda implements C7562b<ComposerBeauty, List<? extends ComposerInfo>> {

            /* renamed from: a */
            final /* synthetic */ C23537g f109810a;

            C42215a(C23537g gVar) {
                this.f109810a = gVar;
                super(1);
            }

            /* renamed from: a */
            public final List<ComposerInfo> invoke(ComposerBeauty composerBeauty) {
                boolean z;
                C7573i.m23587b(composerBeauty, "$this$updateWhenDownloaded");
                ArrayList arrayList = new ArrayList();
                if (C7573i.m23585a((Object) this.f109810a.f62122b, (Object) composerBeauty.getEffect().getUnzipPath()) && !C42226h.m134341a(composerBeauty) && C42212g.m134314b(composerBeauty)) {
                    if (C42226h.m134344d(composerBeauty)) {
                        z = composerBeauty.getSelected();
                    } else if (!composerBeauty.getExtra().getDisableCache()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Collection a = C42212g.m134296a(composerBeauty, false, false);
                        if (!a.isEmpty()) {
                            composerBeauty.setAdd2Nodes(new C23530a(true, false, 2, null));
                            arrayList.addAll(a);
                        }
                    }
                }
                return arrayList;
            }
        }

        C42214a() {
        }

        /* renamed from: a */
        private static void m134329a(C23537g gVar) {
            C7573i.m23587b(gVar, "param");
        }

        /* renamed from: a */
        private static void m134330a(C23537g gVar, Integer num, String str, Exception exc) {
            C7573i.m23587b(gVar, "param");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo70519a(Object obj) {
            m134329a((C23537g) obj);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo70521a(Object obj, Object obj2) {
            m134331a((C23537g) obj, (Void) obj2);
        }

        /* renamed from: a */
        private static void m134331a(C23537g gVar, Void voidR) {
            C7573i.m23587b(gVar, "beautyDownload");
            C42215a aVar = new C42215a(gVar);
            ArrayList arrayList = new ArrayList();
            Map map = (Map) C42212g.m134292a().getValue();
            if (map != null) {
                Collection<List> values = map.values();
                if (values != null) {
                    for (List<ComposerBeauty> it : values) {
                        for (ComposerBeauty composerBeauty : it) {
                            if (composerBeauty.isCollectionType()) {
                                List<ComposerBeauty> childList = composerBeauty.getChildList();
                                if (childList != null) {
                                    for (ComposerBeauty a : childList) {
                                        arrayList.addAll(aVar.invoke(a));
                                    }
                                }
                            } else {
                                arrayList.addAll(aVar.invoke(composerBeauty));
                            }
                        }
                    }
                }
            }
            C43022cq.m136539a(C42212g.m134319d(), arrayList);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo70520a(Object obj, Integer num, String str, Exception exc) {
            m134330a((C23537g) obj, num, str, exc);
        }
    }

    @C7540d(mo19421b = "BeautySource.kt", mo19422c = {83}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$beautyInitController$1")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$b */
    static final class C42216b extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f109811a;

        /* renamed from: b */
        int f109812b;

        /* renamed from: c */
        final /* synthetic */ C23532c f109813c;

        /* renamed from: d */
        private C48056ad f109814d;

        C42216b(C23532c cVar, C47919b bVar) {
            this.f109813c = cVar;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42216b bVar2 = new C42216b(this.f109813c, bVar);
            bVar2.f109814d = (C48056ad) obj;
            return bVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42216b) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C47948a.m148881a();
            switch (this.f109812b) {
                case 0:
                    C48056ad adVar = this.f109814d;
                    if (this.f109813c.f62109b && this.f109813c.f62111d && this.f109813c.f62108a == BeautyCategoryGender.FEMALE) {
                        int c = C42194c.m134245c();
                        if (c < 3) {
                            C42194c.m134240a(c + 1);
                        }
                    }
                    if (this.f109813c.f62110c || !C7573i.m23585a((Object) this.f109813c, (Object) C42212g.f109802e)) {
                        C42212g.f109802e = this.f109813c;
                        if (!this.f109813c.f62109b) {
                            C42209f.f109793a.mo103647a(false);
                            C43022cq.m136539a(C42212g.m134308b(), new ArrayList());
                            C42194c.m134246d();
                            break;
                        } else {
                            C42209f.f109793a.mo103647a(true);
                            Map b = C42212g.f109799b;
                            BeautyCategoryGender beautyCategoryGender = this.f109813c.f62108a;
                            boolean z = this.f109813c.f62112e;
                            this.f109811a = adVar;
                            this.f109812b = 1;
                            if (C48143e.m149376a(C48080as.m149073c(), new C42220f(b, beautyCategoryGender, z, null), this) == a) {
                                return a;
                            }
                        }
                    } else {
                        return C7581n.f20898a;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C7581n.f20898a;
        }
    }

    @C7540d(mo19421b = "BeautySource.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$categoryRspList2BeautyCategoryMap$2")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$c */
    static final class C42217c extends SuspendLambda implements C7563m<C48056ad, C47919b<? super LinkedHashMap<BeautyCategory, List<? extends ComposerBeauty>>>, Object> {

        /* renamed from: a */
        int f109815a;

        /* renamed from: b */
        final /* synthetic */ List f109816b;

        /* renamed from: c */
        private C48056ad f109817c;

        C42217c(List list, C47919b bVar) {
            this.f109816b = list;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42217c cVar = new C42217c(this.f109816b, bVar);
            cVar.f109817c = (C48056ad) obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42217c) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f109815a == 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (BeautyCategory beautyCategory : C42212g.m134310b(this.f109816b)) {
                    C42212g gVar = C42212g.f109798a;
                    List<Effect> list = beautyCategory.getCategoryResponse().totalEffects;
                    C7573i.m23582a((Object) list, "beautyCategory.categoryResponse.totalEffects");
                    linkedHashMap.put(beautyCategory, gVar.mo103650a(list, beautyCategory));
                }
                return linkedHashMap;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$d */
    static final class C42218d extends Lambda implements C7562b<ComposerBeauty, C7581n> {

        /* renamed from: a */
        public static final C42218d f109818a = new C42218d();

        C42218d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m134336a((ComposerBeauty) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public static void m134336a(ComposerBeauty composerBeauty) {
            C7573i.m23587b(composerBeauty, "$this$clearBeautyState");
            composerBeauty.setSelected(false);
            composerBeauty.setShowDot(false);
            composerBeauty.setAdd2Nodes(new C23530a(false, false, 1, null));
            composerBeauty.setProgressValue(0);
            composerBeauty.setEnable(true);
        }
    }

    @C7540d(mo19421b = "BeautySource.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$createCategoryMap$2")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$e */
    static final class C42219e extends SuspendLambda implements C7563m<C48056ad, C47919b<? super LinkedHashMap<BeautyCategory, List<? extends ComposerBeauty>>>, Object> {

        /* renamed from: a */
        int f109819a;

        /* renamed from: b */
        final /* synthetic */ List f109820b;

        /* renamed from: c */
        private C48056ad f109821c;

        C42219e(List list, C47919b bVar) {
            this.f109820b = list;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42219e eVar = new C42219e(this.f109820b, bVar);
            eVar.f109821c = (C48056ad) obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42219e) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f109819a == 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
                BeautyCategoryExtra beautyCategoryExtra = new BeautyCategoryExtra(null, false, false, false, false, null, false, 127, null);
                BeautyCategory beautyCategory = new BeautyCategory(effectCategoryResponse, beautyCategoryExtra, false);
                linkedHashMap.put(beautyCategory, C42212g.f109798a.mo103650a(this.f109820b, beautyCategory));
                return linkedHashMap;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C7540d(mo19421b = "BeautySource.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$fillCategoryMapByGender$2")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$f */
    static final class C42220f extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        int f109822a;

        /* renamed from: b */
        final /* synthetic */ Map f109823b;

        /* renamed from: c */
        final /* synthetic */ BeautyCategoryGender f109824c;

        /* renamed from: d */
        final /* synthetic */ boolean f109825d;

        /* renamed from: e */
        private C48056ad f109826e;

        C42220f(Map map, BeautyCategoryGender beautyCategoryGender, boolean z, C47919b bVar) {
            this.f109823b = map;
            this.f109824c = beautyCategoryGender;
            this.f109825d = z;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42220f fVar = new C42220f(this.f109823b, this.f109824c, this.f109825d, bVar);
            fVar.f109826e = (C48056ad) obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42220f) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f109822a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (this.f109823b == null) {
                return C7581n.f20898a;
            } else {
                if (!C42212g.m134316c().f62109b) {
                    return C7581n.f20898a;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Entry entry : this.f109823b.entrySet()) {
                    if (C7573i.m23585a((Object) ((BeautyCategory) entry.getKey()).getBeautyCategoryExtra().getGender(), (Object) this.f109824c.getFlag()) || C7573i.m23585a((Object) ((BeautyCategory) entry.getKey()).getBeautyCategoryExtra().getGender(), (Object) BeautyCategoryGender.ALL.getFlag())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map map = linkedHashMap;
                C42212g.f109798a.mo103651b(map, this.f109825d);
                C42212g.m134304a(map, this.f109825d);
                C43022cq.m136539a(C42212g.m134292a(), linkedHashMap);
                return C7581n.f20898a;
            }
        }
    }

    @C7540d(mo19421b = "BeautySource.kt", mo19422c = {47, 49, 51, 52}, mo19423d = "getRepFromLocal", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$g */
    static final class C42221g extends ContinuationImpl {

        /* renamed from: a */
        /* synthetic */ Object f109827a;

        /* renamed from: b */
        int f109828b;

        /* renamed from: c */
        final /* synthetic */ C42212g f109829c;

        /* renamed from: d */
        Object f109830d;

        /* renamed from: e */
        Object f109831e;

        /* renamed from: f */
        Object f109832f;

        C42221g(C42212g gVar, C47919b bVar) {
            this.f109829c = gVar;
            super(bVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f109827a = obj;
            this.f109828b |= Integer.MIN_VALUE;
            return this.f109829c.mo103649a((C47919b<? super Map<BeautyCategory, ? extends List<ComposerBeauty>>>) this);
        }
    }

    @C7540d(mo19421b = "BeautySource.kt", mo19422c = {177}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$resetCategoryMap$1")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$h */
    static final class C42222h extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f109833a;

        /* renamed from: b */
        int f109834b;

        /* renamed from: c */
        final /* synthetic */ Map f109835c;

        /* renamed from: d */
        private C48056ad f109836d;

        C42222h(Map map, C47919b bVar) {
            this.f109835c = map;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42222h hVar = new C42222h(this.f109835c, bVar);
            hVar.f109836d = (C48056ad) obj;
            return hVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42222h) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C47948a.m148881a();
            switch (this.f109834b) {
                case 0:
                    C48056ad adVar = this.f109836d;
                    C42212g.f109799b = this.f109835c;
                    C42212g gVar = C42212g.f109798a;
                    Map b = C42212g.f109799b;
                    BeautyCategoryGender beautyCategoryGender = C42212g.m134316c().f62108a;
                    this.f109833a = adVar;
                    this.f109834b = 1;
                    if (C48143e.m149376a(C48080as.m149073c(), new C42220f(b, beautyCategoryGender, false, null), this) == a) {
                        return a;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$i */
    static final class C42223i extends Lambda implements C7562b<List<? extends ComposerBeauty>, C7581n> {

        /* renamed from: a */
        public static final C42223i f109837a = new C42223i();

        C42223i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m134337a((List) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public static void m134337a(List<ComposerBeauty> list) {
            Object obj;
            C7573i.m23587b(list, "beauties");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ComposerBeauty) obj).getExtra().getDefault()) {
                    break;
                }
            }
            ComposerBeauty composerBeauty = (ComposerBeauty) obj;
            if (composerBeauty != null) {
                composerBeauty.setSelected(true);
                C42212g.f109798a.mo103653d(composerBeauty);
                return;
            }
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                ((ComposerBeauty) list.get(0)).setSelected(true);
                C42212g.f109798a.mo103653d((ComposerBeauty) list.get(0));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$j */
    static final class C42224j extends Lambda implements C7562b<List<? extends ComposerBeauty>, C7581n> {

        /* renamed from: a */
        public static final C42224j f109838a = new C42224j();

        C42224j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m134338a((List) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public static void m134338a(List<ComposerBeauty> list) {
            Object obj;
            C7573i.m23587b(list, "composerBeauties");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ComposerBeauty) obj).getExtra().getDefault()) {
                    break;
                }
            }
            ComposerBeauty composerBeauty = (ComposerBeauty) obj;
            if (composerBeauty != null) {
                composerBeauty.setSelected(true);
                return;
            }
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                ((ComposerBeauty) list.get(0)).setSelected(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.g$k */
    static final class C42225k extends Lambda implements C7562b<List<? extends BeautyCategory>, C7581n> {

        /* renamed from: a */
        public static final C42225k f109839a = new C42225k();

        C42225k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m134339a((List) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public static void m134339a(List<BeautyCategory> list) {
            Object obj;
            C7573i.m23587b(list, "categories");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((BeautyCategory) obj).getBeautyCategoryExtra().getDefault()) {
                    break;
                }
            }
            BeautyCategory beautyCategory = (BeautyCategory) obj;
            if (beautyCategory != null) {
                beautyCategory.setSelected(true);
                return;
            }
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                ((BeautyCategory) list.get(0)).setSelected(true);
            }
        }
    }

    private C42212g() {
    }

    /* renamed from: b */
    public static C43074dw<List<ComposerInfo>> m134308b() {
        return f109801d;
    }

    /* renamed from: c */
    public static C23532c m134316c() {
        return f109802e;
    }

    /* renamed from: d */
    public static C43074dw<List<ComposerInfo>> m134319d() {
        return f109804g;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[PHI: r5 
      PHI: (r5v7 java.lang.Object) = (r5v1 java.lang.Object), (r5v13 java.lang.Object) binds: [B:7:0x0021, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084 A[PHI: r5 
      PHI: (r5v3 java.lang.Object) = (r5v1 java.lang.Object), (r5v6 java.lang.Object) binds: [B:7:0x0021, B:30:0x0081] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo103649a(kotlin.coroutines.C47919b<? super java.util.Map<com.p280ss.android.ugc.aweme.beauty.BeautyCategory, ? extends java.util.List<com.p280ss.android.ugc.aweme.beauty.ComposerBeauty>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.C42221g
            if (r0 == 0) goto L_0x0014
            r0 = r5
            com.ss.android.ugc.aweme.tools.beauty.manager.g$g r0 = (com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.C42221g) r0
            int r1 = r0.f109828b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.f109828b
            int r5 = r5 - r2
            r0.f109828b = r5
            goto L_0x0019
        L_0x0014:
            com.ss.android.ugc.aweme.tools.beauty.manager.g$g r0 = new com.ss.android.ugc.aweme.tools.beauty.manager.g$g
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.f109827a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.f109828b
            switch(r2) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0035;
                case 2: goto L_0x0061;
                case 3: goto L_0x002c;
                case 4: goto L_0x0084;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002c:
            java.lang.Object r2 = r0.f109831e
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.f109830d
            com.ss.android.ugc.aweme.tools.beauty.manager.g r3 = (com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g) r3
            goto L_0x0070
        L_0x0035:
            java.lang.Object r2 = r0.f109830d
            com.ss.android.ugc.aweme.tools.beauty.manager.g r2 = (com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g) r2
            r3 = r2
            goto L_0x0048
        L_0x003b:
            r0.f109830d = r4
            r5 = 1
            r0.f109828b = r5
            java.lang.Object r5 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c.m134238a(r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r3 = r4
        L_0x0048:
            r2 = r5
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0085
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x0062
            r0.f109830d = r3
            r0.f109831e = r2
            r5 = 2
            r0.f109828b = r5
            java.lang.Object r5 = m134309b(r2, r0)
            if (r5 != r1) goto L_0x0061
            return r1
        L_0x0061:
            return r5
        L_0x0062:
            r0.f109830d = r3
            r0.f109831e = r2
            r5 = 3
            r0.f109828b = r5
            java.lang.Object r5 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c.m134243b(r0)
            if (r5 != r1) goto L_0x0070
            return r1
        L_0x0070:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0085
            r0.f109830d = r3
            r0.f109831e = r2
            r0.f109832f = r5
            r2 = 4
            r0.f109828b = r2
            java.lang.Object r5 = m134294a(r5, r0)
            if (r5 != r1) goto L_0x0084
            return r1
        L_0x0084:
            return r5
        L_0x0085:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.mo103649a(kotlin.coroutines.b):java.lang.Object");
    }

    /* renamed from: a */
    public static void m134300a(C23532c cVar) {
        C7573i.m23587b(cVar, "value");
        C48145g.m149385a(C48093bb.f122957a, C15388c.m44889a(), null, new C42216b(cVar, null), 2, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m134304a(java.util.Map<com.p280ss.android.ugc.aweme.beauty.BeautyCategory, java.util.List<com.p280ss.android.ugc.aweme.beauty.ComposerBeauty>> r13, boolean r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x000d:
            boolean r1 = r13.hasNext()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x012e
            java.lang.Object r1 = r13.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            com.ss.android.ugc.aweme.beauty.BeautyCategory r5 = (com.p280ss.android.ugc.aweme.beauty.BeautyCategory) r5
            com.ss.android.ugc.aweme.beauty.BeautyCategoryExtra r5 = r5.getBeautyCategoryExtra()
            boolean r5 = r5.getExclusive()
            if (r5 == 0) goto L_0x0068
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0036:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004a
            java.lang.Object r2 = r1.next()
            r5 = r2
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r5 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r5
            boolean r5 = r5.getSelected()
            if (r5 == 0) goto L_0x0036
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            r1 = r2
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r1 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r1
            if (r1 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.tools.beauty.manager.g r5 = f109798a
            r7 = 0
            r8 = 0
            r9 = 3
            r10 = 0
            r6 = r1
            java.util.List r2 = m134296a(r6, false, false)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x000d
            r0.add(r1)
            goto L_0x000d
        L_0x0068:
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0072:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x000d
            java.lang.Object r5 = r1.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r5 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r5
            boolean r6 = m134306a(r5)
            if (r6 != 0) goto L_0x00ef
            if (r14 == 0) goto L_0x00ca
            com.ss.android.ugc.aweme.tools.beauty.manager.c r6 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c.f109764a
            com.ss.android.ugc.aweme.beauty.BeautyCategory r7 = r5.getCategory()
            if (r7 == 0) goto L_0x0097
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r7 = r7.getCategoryResponse()
            if (r7 == 0) goto L_0x0097
            java.lang.String r7 = r7.f113500id
            goto L_0x0098
        L_0x0097:
            r7 = r3
        L_0x0098:
            java.util.List r6 = r6.mo103643d(r7)
            if (r6 == 0) goto L_0x00c5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00a4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c0
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            com.ss.android.ugc.effectmanager.effect.model.Effect r9 = r5.getEffect()
            java.lang.String r9 = r9.getEffectId()
            boolean r8 = kotlin.jvm.internal.C7573i.m23585a(r8, r9)
            if (r8 == 0) goto L_0x00a4
            goto L_0x00c1
        L_0x00c0:
            r7 = r3
        L_0x00c1:
            r6 = r7
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x00c6
        L_0x00c5:
            r6 = r3
        L_0x00c6:
            if (r6 == 0) goto L_0x00ca
            r6 = 1
            goto L_0x00cb
        L_0x00ca:
            r6 = 0
        L_0x00cb:
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r7 = r5.getExtra()
            boolean r7 = r7.getDisableCache()
            if (r7 == 0) goto L_0x00d7
            if (r6 == 0) goto L_0x0072
        L_0x00d7:
            com.ss.android.ugc.aweme.tools.beauty.manager.g r6 = f109798a
            r8 = 0
            r9 = 0
            r10 = 3
            r11 = 0
            r7 = r5
            java.util.List r6 = m134296a(r7, false, false)
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x0072
            r0.add(r5)
            goto L_0x0072
        L_0x00ef:
            java.util.List r5 = r5.getChildList()
            if (r5 == 0) goto L_0x0072
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x00fb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x010f
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r7 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r7
            boolean r7 = r7.getSelected()
            if (r7 == 0) goto L_0x00fb
            goto L_0x0110
        L_0x010f:
            r6 = r3
        L_0x0110:
            r5 = r6
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r5 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r5
            if (r5 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.tools.beauty.manager.g r7 = f109798a
            r9 = 0
            r10 = 0
            r11 = 3
            r12 = 0
            r8 = r5
            java.util.List r6 = m134296a(r8, false, false)
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x0072
            r0.add(r5)
            goto L_0x0072
        L_0x012e:
            r13 = r0
            java.util.List r13 = (java.util.List) r13
            com.p280ss.android.ugc.aweme.tools.beauty.manager.C42209f.m134279a(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r14 = r0.iterator()
        L_0x013f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r0 = r14.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r0 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r0.getEffect()
            java.lang.String r1 = r1.getEffectId()
            java.lang.String r5 = "EFFECT_ID_TYPE_FILTER"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r5)
            if (r1 == 0) goto L_0x0168
            com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo r0 = new com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo
            java.lang.String r1 = "EFFECT_ID_TYPE_FILTER"
            java.lang.String r5 = ""
            r0.<init>(r1, r5)
            r13.add(r0)
            goto L_0x013f
        L_0x0168:
            com.ss.android.ugc.aweme.tools.beauty.manager.g r5 = f109798a
            r7 = 0
            r8 = 0
            r9 = 3
            r10 = 0
            r6 = r0
            java.util.List r1 = m134296a(r6, false, false)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r5 = r1.isEmpty()
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x013f
            com.ss.android.ugc.aweme.beauty.e r5 = new com.ss.android.ugc.aweme.beauty.e
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r0.getEffect()
            java.lang.String r6 = r6.getEffectId()
            java.lang.String r7 = "it.effect.effectId"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            r7 = 2
            r5.<init>(r6, r2, r7, r3)
            java.util.ArrayList r6 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42209f.m134277a()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x01a2
            com.ss.android.ugc.aweme.beauty.a r5 = new com.ss.android.ugc.aweme.beauty.a
            r5.<init>(r4, r2)
            r0.setAdd2Nodes(r5)
            goto L_0x01aa
        L_0x01a2:
            com.ss.android.ugc.aweme.beauty.a r5 = new com.ss.android.ugc.aweme.beauty.a
            r5.<init>(r4, r4)
            r0.setAdd2Nodes(r5)
        L_0x01aa:
            r13.addAll(r1)
            goto L_0x013f
        L_0x01ae:
            com.ss.android.ugc.aweme.utils.dw<java.util.List<com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo>> r14 = f109801d
            android.arch.lifecycle.o r14 = (android.arch.lifecycle.C0052o) r14
            com.p280ss.android.ugc.aweme.utils.C43022cq.m136539a(r14, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.m134304a(java.util.Map, boolean):void");
    }

    /* renamed from: a */
    public static void m134303a(Map<BeautyCategory, List<ComposerBeauty>> map) {
        C7573i.m23587b(map, "categoryMap");
        C48145g.m149385a(C48093bb.f122957a, C15388c.m44889a(), null, new C42222h(map, null), 2, null);
    }

    /* renamed from: a */
    public static List<ComposerBeauty> m134298a(List<ComposerBeauty> list) {
        C7573i.m23587b(list, "beautyBeans");
        f109803f.clear();
        for (ComposerBeauty composerBeauty : list) {
            if (!C42191b.f109761b.mo103631a(composerBeauty)) {
                C42191b.f109761b.mo103630a(new C23537g(composerBeauty, null, 2, null), f109805h);
                f109803f.add(composerBeauty);
            }
        }
        return f109803f;
    }

    /* renamed from: a */
    private static void m134299a(ComposerBeauty composerBeauty, boolean z) {
        String str;
        Object obj;
        String str2;
        if (composerBeauty.isCollectionType()) {
            List childList = composerBeauty.getChildList();
            Collection collection = childList;
            boolean z2 = false;
            if (!(!(collection == null || collection.isEmpty()))) {
                childList = null;
            }
            if (childList != null) {
                if (z) {
                    str = C42194c.f109764a.mo103645e(composerBeauty);
                } else {
                    C42194c cVar = C42194c.f109764a;
                    BeautyCategory category = composerBeauty.getCategory();
                    if (category != null) {
                        EffectCategoryResponse categoryResponse = category.getCategoryResponse();
                        if (categoryResponse != null) {
                            str2 = categoryResponse.f113500id;
                            str = cVar.mo103634a(str2, composerBeauty.getEffect().getEffectId());
                        }
                    }
                    str2 = null;
                    str = cVar.mo103634a(str2, composerBeauty.getEffect().getEffectId());
                }
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    C42223i.m134337a(childList);
                } else {
                    Iterator it = childList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C7573i.m23585a((Object) ((ComposerBeauty) obj).getEffect().getEffectId(), (Object) str)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                    if (composerBeauty2 != null) {
                        composerBeauty2.setSelected(true);
                        f109798a.mo103653d(composerBeauty2);
                    } else {
                        C42223i.m134337a(childList);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final List<ComposerBeauty> mo103650a(List<? extends Effect> list, BeautyCategory beautyCategory) {
        C7573i.m23587b(list, "effects");
        ArrayList arrayList = new ArrayList();
        for (Effect a : list) {
            ComposerBeauty a2 = m134288a(a, beautyCategory);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m134305a(BeautyCategoryExtra beautyCategoryExtra) {
        return beautyCategoryExtra != null && C23538h.m77304a(beautyCategoryExtra.getAbGroup()) == C35574k.m114859a().mo70096k().mo93306b(Property.StudioBeautyEffectComposerGroup);
    }

    /* renamed from: a */
    public static boolean m134306a(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "beautyBean");
        return 1 == composerBeauty.getEffect().getEffectType();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static List<ComposerInfo> m134296a(ComposerBeauty composerBeauty, boolean z, boolean z2) {
        C7573i.m23587b(composerBeauty, "$this$getAvailableNodeList");
        ArrayList arrayList = new ArrayList();
        if (!m134314b(composerBeauty)) {
            composerBeauty = null;
        }
        if (composerBeauty != null) {
            if (!composerBeauty.getExtra().isNone()) {
                List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        int b = C42194c.f109764a.mo103637b(composerBeauty, itemsBean.getTag(), itemsBean.getValue());
                        if (!z || b != 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(composerBeauty.getEffect().getUnzipPath());
                            sb.append(':');
                            sb.append(itemsBean.getTag());
                            sb.append(':');
                            sb.append(((float) b) / 100.0f);
                            String sb2 = sb.toString();
                            String extra = composerBeauty.getEffect().getExtra();
                            C7573i.m23582a((Object) extra, "effect.extra");
                            arrayList.add(new ComposerInfo(sb2, extra));
                        }
                    }
                }
            } else if (!z2) {
                String unzipPath = composerBeauty.getEffect().getUnzipPath();
                C7573i.m23582a((Object) unzipPath, "effect.unzipPath");
                String extra2 = composerBeauty.getEffect().getExtra();
                C7573i.m23582a((Object) extra2, "effect.extra");
                arrayList.add(new ComposerInfo(unzipPath, extra2));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C43074dw<Map<BeautyCategory, List<ComposerBeauty>>> m134292a() {
        return f109800c;
    }

    static {
        C48145g.m149385a(C48093bb.f122957a, C15388c.m44889a(), null, new C422131(null), 2, null);
        C23532c cVar = new C23532c(null, false, false, false, false, 31, null);
        f109802e = cVar;
    }

    /* renamed from: b */
    private static boolean m134315b(Effect effect) {
        C7573i.m23587b(effect, "effect");
        if (1 == effect.getEffectType()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private BeautyCategory m134286a(EffectCategoryResponse effectCategoryResponse) {
        C7573i.m23587b(effectCategoryResponse, "categoryResponse");
        BeautyCategoryExtra b = m134307b(effectCategoryResponse);
        if (b == null) {
            return null;
        }
        BeautyCategory beautyCategory = new BeautyCategory(effectCategoryResponse, b, false, 4, null);
        return beautyCategory;
    }

    /* renamed from: b */
    public static List<BeautyCategory> m134310b(List<? extends EffectCategoryResponse> list) {
        ArrayList arrayList = new ArrayList();
        for (EffectCategoryResponse a : list) {
            BeautyCategory a2 = f109798a.m134286a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static void m134317c(List<BeautyCategory> list) {
        Object obj;
        String b = C42194c.f109764a.mo103638b();
        if (b != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7573i.m23585a((Object) ((BeautyCategory) obj).getCategoryResponse().f113500id, (Object) b)) {
                    break;
                }
            }
            BeautyCategory beautyCategory = (BeautyCategory) obj;
            if (beautyCategory != null) {
                beautyCategory.setSelected(true);
            } else {
                C42225k.m134339a(list);
            }
        } else {
            C42225k.m134339a(list);
        }
    }

    /* renamed from: g */
    private List<ComposerBeauty> m134322g(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "$this$getAlbumExclusiveList");
        ArrayList arrayList = new ArrayList();
        if (!C42226h.m134342b(composerBeauty)) {
            return arrayList;
        }
        ComposerBeauty f = m134321f(composerBeauty);
        if (f != null) {
            List childList = f.getChildList();
            if (childList != null) {
                if (!(!childList.isEmpty())) {
                    childList = null;
                }
                if (childList != null) {
                    arrayList.addAll(childList);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private BeautyCategoryExtra m134307b(EffectCategoryResponse effectCategoryResponse) {
        boolean z;
        C7573i.m23587b(effectCategoryResponse, "categoryResponse");
        CharSequence charSequence = effectCategoryResponse.extra;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        BeautyCategoryExtra beautyCategoryExtra = null;
        if (z) {
            return null;
        }
        try {
            BeautyCategoryExtra beautyCategoryExtra2 = (BeautyCategoryExtra) C35574k.m114859a().mo70085S().mo15974a(effectCategoryResponse.extra, BeautyCategoryExtra.class);
            if (m134305a(beautyCategoryExtra2) && m134313b(beautyCategoryExtra2)) {
                beautyCategoryExtra = beautyCategoryExtra2;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("BeautyRequestPresenter , parseBeautyCategoryExtra , ");
            sb.append(Log.getStackTraceString(e));
            C41530am.m132283b(sb.toString());
        }
        return beautyCategoryExtra;
    }

    /* renamed from: e */
    private static void m134320e(ComposerBeauty composerBeauty) {
        if (composerBeauty.isCollectionType()) {
            ArrayList arrayList = new ArrayList();
            List<Effect> childEffects = composerBeauty.getEffect().getChildEffects();
            if (childEffects != null) {
                for (Effect effect : childEffects) {
                    C42212g gVar = f109798a;
                    C7573i.m23582a((Object) effect, "childEffect");
                    ComposerBeauty a = gVar.m134288a(effect, (BeautyCategory) null);
                    if (a != null) {
                        a.setParentId(composerBeauty.getEffect().getEffectId());
                        a.setParentName(composerBeauty.getEffect().getName());
                        a.setCategory(composerBeauty.getCategory());
                        arrayList.add(a);
                    }
                }
            }
            composerBeauty.setChildList(arrayList);
        }
    }

    /* renamed from: h */
    private static List<ComposerBeauty> m134323h(ComposerBeauty composerBeauty) {
        Collection collection;
        boolean z;
        C7573i.m23587b(composerBeauty, "$this$getCategoryExclusionList");
        ArrayList arrayList = new ArrayList();
        if (!C42226h.m134343c(composerBeauty)) {
            return arrayList;
        }
        BeautyCategory category = composerBeauty.getCategory();
        if (category != null) {
            BeautyCategoryExtra beautyCategoryExtra = category.getBeautyCategoryExtra();
            if (!beautyCategoryExtra.getExclusive()) {
                beautyCategoryExtra = null;
            }
            if (beautyCategoryExtra != null) {
                Map<BeautyCategory, ? extends List<ComposerBeauty>> map = f109799b;
                if (map != null) {
                    collection = (List) map.get(category);
                } else {
                    collection = null;
                }
                Collection collection2 = collection;
                if (collection2 == null || collection2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    collection = null;
                }
                if (collection != null) {
                    arrayList.addAll(collection);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List<ComposerBeauty> mo103652c(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "$this$getExclusiveList");
        if (!C42226h.m134344d(composerBeauty)) {
            return new ArrayList<>();
        }
        if (C42226h.m134342b(composerBeauty)) {
            return m134322g(composerBeauty);
        }
        if (C42226h.m134343c(composerBeauty)) {
            return m134323h(composerBeauty);
        }
        return new ArrayList<>();
    }

    /* renamed from: a */
    private static ComposerBeautyExtra m134289a(Effect effect) {
        boolean z;
        ComposerBeautyExtra composerBeautyExtra;
        C7573i.m23587b(effect, "effect");
        CharSequence extra = effect.getExtra();
        if (extra == null || extra.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            composerBeautyExtra = (ComposerBeautyExtra) C35574k.m114859a().mo70085S().mo15974a(effect.getExtra(), ComposerBeautyExtra.class);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("BeautyRequestPresenter , parseComposerBeautyExtra ,");
            sb.append(Log.getStackTraceString(e));
            C41530am.m132283b(sb.toString());
            composerBeautyExtra = null;
        }
        return composerBeautyExtra;
    }

    /* renamed from: b */
    private static void m134312b(Map<BeautyCategory, List<ComposerBeauty>> map) {
        for (BeautyCategory selected : map.keySet()) {
            selected.setSelected(false);
        }
        for (List<ComposerBeauty> it : map.values()) {
            for (ComposerBeauty composerBeauty : it) {
                if (composerBeauty.isCollectionType()) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null) {
                        for (ComposerBeauty a : childList) {
                            C42218d.m134336a(a);
                        }
                    }
                    C42218d.m134336a(composerBeauty);
                } else {
                    C42218d.m134336a(composerBeauty);
                }
            }
        }
    }

    /* renamed from: f */
    private static ComposerBeauty m134321f(ComposerBeauty composerBeauty) {
        boolean z;
        Object obj;
        C7573i.m23587b(composerBeauty, "$this$findBeautyParent");
        CharSequence parentId = composerBeauty.getParentId();
        if (parentId == null || parentId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Map<BeautyCategory, ? extends List<ComposerBeauty>> map = f109799b;
        if (map != null) {
            for (Iterable iterable : map.values()) {
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (((ComposerBeauty) next).isCollectionType()) {
                        arrayList.add(next);
                    }
                }
                Iterator it = ((List) arrayList).iterator();
                while (true) {
                    if (it.hasNext()) {
                        ComposerBeauty composerBeauty2 = (ComposerBeauty) it.next();
                        List childList = composerBeauty2.getChildList();
                        if (childList != null) {
                            Iterator it2 = childList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (C7573i.m23585a((Object) (ComposerBeauty) obj, (Object) composerBeauty)) {
                                    break;
                                }
                            }
                            if (((ComposerBeauty) obj) != null) {
                                return composerBeauty2;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r4 == null) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103653d(com.p280ss.android.ugc.aweme.beauty.ComposerBeauty r8) {
        /*
            r7 = this;
            java.lang.String r0 = "$this$setShowDot"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            boolean r0 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42226h.m134342b(r8)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0026
            boolean r0 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42226h.m134341a(r8)
            if (r0 != 0) goto L_0x0026
            boolean r0 = r8.getEnable()
            if (r0 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r0 = m134321f(r8)
            if (r0 == 0) goto L_0x0022
            r0.setShowDot(r1)
        L_0x0022:
            r8.setShowDot(r2)
            return
        L_0x0026:
            boolean r0 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42226h.m134343c(r8)
            if (r0 != 0) goto L_0x0090
            boolean r0 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42226h.m134341a(r8)
            if (r0 != 0) goto L_0x0090
            boolean r0 = r8.getEnable()
            if (r0 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra r0 = r8.getExtra()
            boolean r0 = r0.getDisableCache()
            if (r0 == 0) goto L_0x0083
            com.ss.android.ugc.aweme.tools.beauty.manager.c r0 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c.f109764a
            com.ss.android.ugc.aweme.beauty.BeautyCategory r3 = r8.getCategory()
            r4 = 0
            if (r3 == 0) goto L_0x0054
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r3 = r3.getCategoryResponse()
            if (r3 == 0) goto L_0x0054
            java.lang.String r3 = r3.f113500id
            goto L_0x0055
        L_0x0054:
            r3 = r4
        L_0x0055:
            java.util.List r0 = r0.mo103643d(r3)
            if (r0 == 0) goto L_0x0081
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0061:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x007d
            java.lang.Object r3 = r0.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r8.getEffect()
            java.lang.String r6 = r6.getEffectId()
            boolean r5 = kotlin.jvm.internal.C7573i.m23585a(r5, r6)
            if (r5 == 0) goto L_0x0061
            goto L_0x007e
        L_0x007d:
            r3 = r4
        L_0x007e:
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
        L_0x0081:
            if (r4 == 0) goto L_0x0090
        L_0x0083:
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r0 = m134321f(r8)
            if (r0 == 0) goto L_0x008c
            r0.setShowDot(r2)
        L_0x008c:
            r8.setShowDot(r1)
            return
        L_0x0090:
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r0 = m134321f(r8)
            if (r0 == 0) goto L_0x0099
            r0.setShowDot(r2)
        L_0x0099:
            r8.setShowDot(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.mo103653d(com.ss.android.ugc.aweme.beauty.ComposerBeauty):void");
    }

    /* renamed from: a */
    private static ComposerBeautyExtraBeautify m134290a(ComposerBeautyExtra composerBeautyExtra) {
        boolean z;
        ComposerBeautyExtraBeautify composerBeautyExtraBeautify;
        C7573i.m23587b(composerBeautyExtra, "beautyExtra");
        CharSequence beautify = composerBeautyExtra.getBeautify();
        if (beautify == null || beautify.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            composerBeautyExtraBeautify = (ComposerBeautyExtraBeautify) C35574k.m114859a().mo70085S().mo15974a(composerBeautyExtra.getBeautify(), ComposerBeautyExtraBeautify.class);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("BeautyRequestPresenter , parseComposerBeautyExtraBeautify , ");
            sb.append(Log.getStackTraceString(e));
            C41530am.m132283b(sb.toString());
            composerBeautyExtraBeautify = null;
        }
        return composerBeautyExtraBeautify;
    }

    /* renamed from: b */
    public static boolean m134313b(BeautyCategoryExtra beautyCategoryExtra) {
        if (beautyCategoryExtra == null) {
            return false;
        }
        if (C6399b.m19945u()) {
            return beautyCategoryExtra.getRegionD();
        }
        if (C6399b.m19947w()) {
            return beautyCategoryExtra.getRegionT();
        }
        if (C6399b.m19946v()) {
            return beautyCategoryExtra.getRegionM();
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m134314b(ComposerBeauty composerBeauty) {
        boolean z;
        boolean z2;
        C7573i.m23587b(composerBeauty, "$this$isCanUpdateComposerNode");
        Collection items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null || items.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || composerBeauty.getExtra().isNone()) {
            CharSequence unzipPath = composerBeauty.getEffect().getUnzipPath();
            if (unzipPath == null || unzipPath.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || !C42191b.f109761b.mo103631a(composerBeauty) || !composerBeauty.getEnable()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Object m134309b(List<? extends EffectCategoryResponse> list, C47919b<? super Map<BeautyCategory, List<ComposerBeauty>>> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C42217c(list, null), bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ComposerBeauty m134288a(Effect effect, BeautyCategory beautyCategory) {
        C7573i.m23587b(effect, "effect");
        if (m134315b(effect)) {
            ComposerBeautyExtra composerBeautyExtra = new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, false, false, 524287, null);
            ComposerBeauty composerBeauty = new ComposerBeauty(effect, composerBeautyExtra, new ComposerBeautyExtraBeautify(null, null, 3, null), beautyCategory, null, null, true, null, false, false, 0, false, 4016, null);
            m134320e(composerBeauty);
            return composerBeauty;
        }
        ComposerBeautyExtra a = m134289a(effect);
        if (a == null) {
            return null;
        }
        ComposerBeautyExtraBeautify a2 = m134290a(a);
        if (a2 == null) {
            return null;
        }
        ComposerBeauty composerBeauty2 = new ComposerBeauty(effect, a, a2, beautyCategory, null, null, false, null, false, false, 0, false, 4080, null);
        return composerBeauty2;
    }

    /* renamed from: c */
    private static void m134318c(Map<BeautyCategory, List<ComposerBeauty>> map, boolean z) {
        String str;
        boolean z2;
        Object obj;
        for (Entry entry : map.entrySet()) {
            if (((BeautyCategory) entry.getKey()).getBeautyCategoryExtra().getExclusive()) {
                if (z) {
                    str = C42194c.f109764a.mo103641c(((BeautyCategory) entry.getKey()).getCategoryResponse().f113500id);
                } else {
                    str = C42194c.f109764a.mo103639b(((BeautyCategory) entry.getKey()).getCategoryResponse().f113500id);
                }
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C42224j.m134338a((List) entry.getValue());
                } else {
                    Iterator it = ((Iterable) entry.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C7573i.m23585a((Object) ((ComposerBeauty) obj).getEffect().getEffectId(), (Object) str)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty = (ComposerBeauty) obj;
                    if (composerBeauty != null) {
                        composerBeauty.setSelected(true);
                    } else {
                        C42224j.m134338a((List) entry.getValue());
                    }
                }
            } else {
                for (ComposerBeauty d : (Iterable) entry.getValue()) {
                    f109798a.mo103653d(d);
                }
            }
        }
    }

    /* renamed from: a */
    public static Object m134294a(List<? extends Effect> list, C47919b<? super Map<BeautyCategory, List<ComposerBeauty>>> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C42219e(list, null), bVar);
    }

    /* renamed from: b */
    public final void mo103651b(Map<BeautyCategory, List<ComposerBeauty>> map, boolean z) {
        m134312b(map);
        m134317c(C7525m.m23509d((Collection<? extends T>) map.keySet()));
        m134318c(map, z);
        for (List<ComposerBeauty> it : map.values()) {
            for (ComposerBeauty a : it) {
                m134299a(a, z);
            }
        }
    }
}
