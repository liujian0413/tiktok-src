package com.p280ss.android.ugc.aweme.sharer.p338ui;

import android.view.View;
import com.google.common.collect.C17896ch;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.c */
public final class C38380c {

    /* renamed from: a */
    public final List<C38343b> f99628a;

    /* renamed from: b */
    public final List<C38389f> f99629b;

    /* renamed from: c */
    public final boolean f99630c;

    /* renamed from: d */
    public final boolean f99631d;

    /* renamed from: e */
    public final int f99632e;

    /* renamed from: f */
    public final int f99633f;

    /* renamed from: g */
    public final float f99634g;

    /* renamed from: h */
    public final int f99635h;

    /* renamed from: i */
    public final SharePackage f99636i;

    /* renamed from: j */
    public final boolean f99637j;

    /* renamed from: k */
    public final View f99638k;

    /* renamed from: l */
    public final C38386d f99639l;

    /* renamed from: m */
    public final C38371b f99640m;

    /* renamed from: n */
    public final C7561a<Boolean> f99641n;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.c$a */
    static final class C38381a extends Lambda implements C7562b<C38343b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38382b f99642a;

        C38381a(C38382b bVar) {
            this.f99642a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m122590a((C38343b) obj));
        }

        /* renamed from: a */
        private boolean m122590a(C38343b bVar) {
            C7573i.m23587b(bVar, "it");
            return this.f99642a.f99645c.contains(bVar.mo95739b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.c$b */
    public static final class C38382b {

        /* renamed from: a */
        public List<C38343b> f99643a = new ArrayList();

        /* renamed from: b */
        public List<C38389f> f99644b = new ArrayList();

        /* renamed from: c */
        public List<String> f99645c = new ArrayList();

        /* renamed from: d */
        public boolean f99646d;

        /* renamed from: e */
        public boolean f99647e = true;

        /* renamed from: f */
        public C17896ch<C38389f> f99648f;

        /* renamed from: g */
        public C17896ch<C38343b> f99649g;

        /* renamed from: h */
        public C7562b<? super C38343b, Boolean> f99650h;

        /* renamed from: i */
        public int f99651i;

        /* renamed from: j */
        public int f99652j;

        /* renamed from: k */
        public float f99653k;

        /* renamed from: l */
        public int f99654l;

        /* renamed from: m */
        public SharePackage f99655m;

        /* renamed from: n */
        public boolean f99656n;

        /* renamed from: o */
        public View f99657o;

        /* renamed from: p */
        public C38386d f99658p;

        /* renamed from: q */
        public C38371b f99659q;

        /* renamed from: r */
        public C7561a<Boolean> f99660r;

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.c$b$a */
        static final class C38383a<T> implements Comparator<T> {

            /* renamed from: a */
            public static final C38383a f99661a = new C38383a();

            C38383a() {
            }

            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.c$b$b */
        static final class C38384b<T> implements Comparator<T> {

            /* renamed from: a */
            public static final C38384b f99662a = new C38384b();

            C38384b() {
            }

            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.c$b$c */
        static final class C38385c extends Lambda implements C7562b<C38343b, Boolean> {

            /* renamed from: a */
            public static final C38385c f99663a = new C38385c();

            C38385c() {
                super(1);
            }

            /* renamed from: a */
            private static boolean m122608a(C38343b bVar) {
                C7573i.m23587b(bVar, "<anonymous parameter 0>");
                return true;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m122608a((C38343b) obj));
            }
        }

        /* renamed from: b */
        public final C38382b mo95974b() {
            this.f99646d = true;
            return this;
        }

        /* renamed from: a */
        public final void mo95973a(List<C38343b> list) {
            C7573i.m23587b(list, "<set-?>");
            this.f99643a = list;
        }

        /* renamed from: a */
        public final C38380c mo95972a() {
            return new C38380c(this, null);
        }

        public C38382b() {
            C17896ch<C38389f> a = C17896ch.m59496a((Comparator<T>) C38383a.f99661a);
            C7573i.m23582a((Object) a, "Ordering.from { _, _ -> 0 }");
            this.f99648f = a;
            C17896ch<C38343b> a2 = C17896ch.m59496a((Comparator<T>) C38384b.f99662a);
            C7573i.m23582a((Object) a2, "Ordering.from { _, _ -> 0 }");
            this.f99649g = a2;
            this.f99650h = C38385c.f99663a;
            this.f99652j = R.color.lw;
            this.f99653k = 1.0f;
            this.f99656n = true;
        }

        /* renamed from: a */
        public final C38382b mo95962a(int i) {
            this.f99651i = i;
            return this;
        }

        /* renamed from: a */
        public final C38382b mo95964a(SharePackage sharePackage) {
            C7573i.m23587b(sharePackage, "sharePackage");
            this.f99655m = sharePackage;
            return this;
        }

        /* renamed from: b */
        public final C38382b mo95975b(int i) {
            this.f99654l = R.string.w_;
            return this;
        }

        /* renamed from: a */
        public final C38382b mo95963a(C38343b bVar) {
            C7573i.m23587b(bVar, "channel");
            this.f99643a.add(bVar);
            return this;
        }

        /* renamed from: b */
        public final C38382b mo95977b(boolean z) {
            this.f99656n = z;
            return this;
        }

        /* renamed from: a */
        public final C38382b mo95965a(C38371b bVar) {
            C7573i.m23587b(bVar, "hooker");
            this.f99659q = bVar;
            return this;
        }

        /* renamed from: b */
        public final C38382b mo95976b(Comparator<C38343b> comparator) {
            C7573i.m23587b(comparator, "comparator");
            C17896ch<C38343b> a = C17896ch.m59496a(comparator);
            C7573i.m23582a((Object) a, "Ordering.from(comparator)");
            this.f99649g = a;
            return this;
        }

        /* renamed from: a */
        public final C38382b mo95966a(C38386d dVar) {
            C7573i.m23587b(dVar, "listener");
            this.f99658p = dVar;
            return this;
        }

        /* renamed from: b */
        public final void mo95978b(List<C38389f> list) {
            C7573i.m23587b(list, "<set-?>");
            this.f99644b = list;
        }

        /* renamed from: a */
        public final C38382b mo95967a(C38389f fVar) {
            C7573i.m23587b(fVar, "action");
            this.f99644b.add(fVar);
            return this;
        }

        /* renamed from: a */
        public final C38382b mo95968a(String str) {
            C7573i.m23587b(str, "channelKey");
            this.f99645c.add(str);
            return this;
        }

        /* renamed from: a */
        public final C38382b mo95969a(Comparator<C38389f> comparator) {
            C7573i.m23587b(comparator, "comparator");
            C17896ch<C38389f> a = C17896ch.m59496a(comparator);
            C7573i.m23582a((Object) a, "Ordering.from(comparator)");
            this.f99648f = a;
            return this;
        }

        /* renamed from: a */
        public final C38382b mo95970a(C7562b<? super C38343b, Boolean> bVar) {
            C7573i.m23587b(bVar, "filter");
            this.f99650h = bVar;
            return this;
        }

        /* renamed from: a */
        public final C38382b mo95971a(boolean z) {
            this.f99647e = true;
            return this;
        }
    }

    /* renamed from: a */
    public final C38382b mo95961a() {
        C38382b bVar = new C38382b();
        C38380c cVar = this;
        bVar.mo95973a(cVar.f99628a);
        bVar.mo95978b(cVar.f99629b);
        bVar.f99646d = cVar.f99630c;
        bVar.f99647e = cVar.f99631d;
        bVar.f99651i = cVar.f99632e;
        bVar.f99652j = cVar.f99633f;
        bVar.f99653k = cVar.f99634g;
        bVar.f99654l = cVar.f99635h;
        bVar.f99656n = cVar.f99637j;
        bVar.f99657o = cVar.f99638k;
        bVar.f99658p = cVar.f99639l;
        bVar.f99659q = cVar.f99640m;
        bVar.f99660r = cVar.f99641n;
        return bVar;
    }

    private C38380c(C38382b bVar) {
        C17896ch<C38343b> chVar = bVar.f99649g;
        List<C38343b> list = bVar.f99643a;
        C7525m.m23480a(list, (C7562b<? super T, Boolean>) new C38381a<Object,Boolean>(bVar));
        Iterable iterable = list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (hashSet.add(((C38343b) next).mo95739b())) {
                arrayList.add(next);
            }
        }
        Iterable iterable2 = arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next2 : iterable2) {
            if (((Boolean) bVar.f99650h.invoke((C38343b) next2)).booleanValue()) {
                arrayList2.add(next2);
            }
        }
        List<C38343b> a = chVar.mo46248a((Iterable<E>) (List) arrayList2);
        C7573i.m23582a((Object) a, "builder.channelComparato…lder.channelFilter(it) })");
        this.f99628a = a;
        C17896ch<C38389f> chVar2 = bVar.f99648f;
        Iterable iterable3 = bVar.f99644b;
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : iterable3) {
            if (hashSet2.add(((C38389f) next3).mo95715b())) {
                arrayList3.add(next3);
            }
        }
        List<C38389f> a2 = chVar2.mo46248a((Iterable<E>) arrayList3);
        C7573i.m23582a((Object) a2, "builder.actionComparator….distinctBy { it.key() })");
        this.f99629b = a2;
        this.f99630c = bVar.f99646d;
        this.f99631d = bVar.f99647e;
        this.f99632e = bVar.f99651i;
        this.f99633f = bVar.f99652j;
        this.f99634g = bVar.f99653k;
        this.f99635h = bVar.f99654l;
        SharePackage sharePackage = bVar.f99655m;
        if (sharePackage == null) {
            C7573i.m23580a();
        }
        this.f99636i = sharePackage;
        this.f99637j = bVar.f99656n;
        this.f99638k = bVar.f99657o;
        this.f99639l = bVar.f99658p;
        this.f99640m = bVar.f99659q;
        this.f99641n = bVar.f99660r;
    }

    public /* synthetic */ C38380c(C38382b bVar, C7571f fVar) {
        this(bVar);
    }
}
