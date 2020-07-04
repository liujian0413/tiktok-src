package com.p280ss.android.ugc.aweme.property;

import android.content.Context;
import android.view.View;
import com.p280ss.android.ugc.aweme.festival.C29120a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1877a.C47886a;

/* renamed from: com.ss.android.ugc.aweme.property.j */
public final class C36969j {

    /* renamed from: c */
    public static final C36970a f96872c = new C36970a(null);

    /* renamed from: a */
    public final int f96873a = this.f96874b.size();

    /* renamed from: b */
    public final ArrayList<C36957c> f96874b;

    /* renamed from: com.ss.android.ugc.aweme.property.j$a */
    public static final class C36970a {

        /* renamed from: com.ss.android.ugc.aweme.property.j$a$a */
        static final class C36971a extends Lambda implements C7562b<View, C7581n> {

            /* renamed from: a */
            public static final C36971a f96875a = new C36971a();

            C36971a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m118956a((View) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m118956a(View view) {
                C7573i.m23587b(view, "it");
                C29120a diamondGameService = ((IAVService) ServiceManager.get().getService(IAVService.class)).diamondGameService();
                Context context = view.getContext();
                C7573i.m23582a((Object) context, "it.context");
                diamondGameService.mo74578a(context);
            }
        }

        private C36970a() {
        }

        /* renamed from: b */
        public final C36969j mo93398b() {
            Object[] enumConstants = Property.class.getEnumConstants();
            C7573i.m23582a((Object) enumConstants, "AVSettings.Property::class.java.enumConstants");
            Collection arrayList = new ArrayList(enumConstants.length);
            for (Object obj : enumConstants) {
                Property property = (Property) obj;
                C7573i.m23582a((Object) property, "it");
                arrayList.add(new C36957c(property, C36961g.m118913a(property)));
            }
            ArrayList arrayList2 = new ArrayList((List) arrayList);
            m118953a(arrayList2);
            C36975l lVar = C36975l.f96877a;
            arrayList2.add(new C36956b(lVar, C36961g.m118915a(lVar), C36975l.m118959a()));
            arrayList2.add(new C36960f("diamond_game_entrance", "奇计划游戏测试入口", "yangjiehao", C36971a.f96875a));
            return new C36969j(arrayList2);
        }

        /* renamed from: a */
        public final C36969j mo93397a() {
            Object[] enumConstants = AVAB.Property.class.getEnumConstants();
            C7573i.m23582a((Object) enumConstants, "AVAB.Property::class.java.enumConstants");
            Collection arrayList = new ArrayList(enumConstants.length);
            for (Object obj : enumConstants) {
                AVAB.Property property = (AVAB.Property) obj;
                C7573i.m23582a((Object) property, "it");
                arrayList.add(new C36957c(property, C36961g.m118912a(property)));
            }
            ArrayList arrayList2 = new ArrayList((List) arrayList);
            m118953a(arrayList2);
            return new C36969j(arrayList2);
        }

        public /* synthetic */ C36970a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static void m118953a(ArrayList<C36957c> arrayList) {
            for (C36957c cVar : arrayList) {
                if (!C7573i.m23585a((Object) cVar.f96850d, (Object) "")) {
                    if (C7573i.m23585a((Object) cVar.f96849c, (Object) "")) {
                    }
                }
                StringBuilder sb = new StringBuilder("Item (");
                sb.append(cVar.f96852f.key());
                sb.append(") 的中文 key 或者英文 key 不能为空。有问题@liuhao.65537");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.j$b */
    public static final class C36972b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(((C36957c) t).mo93381a(), ((C36957c) t2).mo93381a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.j$c */
    public static final class C36973c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(((C36957c) t).f96850d, ((C36957c) t2).f96850d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.j$d */
    static final class C36974d extends Lambda implements C7562b<C36957c, String> {

        /* renamed from: a */
        public static final C36974d f96876a = new C36974d();

        C36974d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m118957a((C36957c) obj);
        }

        /* renamed from: a */
        private static String m118957a(C36957c cVar) {
            C7573i.m23587b(cVar, "it");
            return cVar.toString();
        }
    }

    /* renamed from: a */
    private static C36969j m118946a(ArrayList<C36957c> arrayList) {
        C7573i.m23587b(arrayList, "listOfItemBean");
        return new C36969j(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f96874b, (java.lang.Object) ((com.p280ss.android.ugc.aweme.property.C36969j) r2).f96874b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.property.C36969j
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.property.j r2 = (com.p280ss.android.ugc.aweme.property.C36969j) r2
            java.util.ArrayList<com.ss.android.ugc.aweme.property.c> r0 = r1.f96874b
            java.util.ArrayList<com.ss.android.ugc.aweme.property.c> r2 = r2.f96874b
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.property.C36969j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList<C36957c> arrayList = this.f96874b;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    /* renamed from: c */
    public final C36969j mo93393c() {
        return m118946a(new ArrayList<>(this.f96874b));
    }

    /* renamed from: b */
    public final void mo93392b() {
        List list = this.f96874b;
        if (list.size() > 1) {
            C7525m.m23474a(list, new C36973c());
        }
    }

    public final String toString() {
        String a = C7525m.m23492a(this.f96874b, "\n", null, null, 0, null, C36974d.f96876a, 30, null);
        StringBuilder sb = new StringBuilder("AllItems(_ItemBeanList=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo93390a() {
        List list = this.f96874b;
        if (list.size() > 1) {
            C7525m.m23474a(list, new C36972b());
        }
    }

    public C36969j(ArrayList<C36957c> arrayList) {
        C7573i.m23587b(arrayList, "listOfItemBean");
        this.f96874b = arrayList;
    }

    /* renamed from: a */
    public final C36957c mo93388a(int i) {
        Object obj = this.f96874b.get(i);
        C7573i.m23582a(obj, "listOfItemBean[index]");
        return (C36957c) obj;
    }

    /* renamed from: a */
    public final C36969j mo93389a(C7562b<? super C36957c, Boolean> bVar) {
        C7573i.m23587b(bVar, "predicate");
        Iterable iterable = this.f96874b;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Boolean) bVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return new C36969j(new ArrayList((List) arrayList));
    }

    /* renamed from: b */
    public final int mo93391b(C7562b<? super C36957c, Boolean> bVar) {
        C7573i.m23587b(bVar, "predicate");
        int i = 0;
        for (Object invoke : this.f96874b) {
            if (((Boolean) bVar.invoke(invoke)).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
