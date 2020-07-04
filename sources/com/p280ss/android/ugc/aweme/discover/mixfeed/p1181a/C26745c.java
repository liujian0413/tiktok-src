package com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a;

import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a.c */
public final class C26745c {

    /* renamed from: a */
    public static final C26745c f70481a = new C26745c();

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a.c$a */
    static final class C26746a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f70482a;

        /* renamed from: b */
        final /* synthetic */ String f70483b;

        /* renamed from: c */
        final /* synthetic */ String f70484c;

        /* renamed from: d */
        final /* synthetic */ String f70485d;

        /* renamed from: e */
        final /* synthetic */ String f70486e;

        /* renamed from: f */
        final /* synthetic */ C26501r f70487f;

        /* renamed from: g */
        final /* synthetic */ Map f70488g;

        C26746a(String str, String str2, String str3, String str4, String str5, C26501r rVar, Map map) {
            this.f70482a = str;
            this.f70483b = str2;
            this.f70484c = str3;
            this.f70485d = str4;
            this.f70486e = str5;
            this.f70487f = rVar;
            this.f70488g = map;
        }

        public final /* synthetic */ Object call() {
            m87805a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87805a() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f70482a);
            sb.append('_');
            sb.append(this.f70487f.mo68132e());
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "general_search").mo59973a("search_id", this.f70482a).mo59973a("search_keyword", this.f70483b).mo59973a("log_pb", this.f70484c).mo59973a("impr_id", this.f70485d).mo59973a("enter_from", this.f70486e).mo59973a("is_aladdin", "1").mo59973a("rank", String.valueOf(this.f70487f.mo68132e())).mo59973a("search_result_id", sb.toString());
            Map map = this.f70488g;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.mo59973a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C6907h.m21524a("search_result_click", (Map) a.f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a.c$b */
    static final class C26747b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f70489a;

        /* renamed from: b */
        final /* synthetic */ String f70490b;

        /* renamed from: c */
        final /* synthetic */ String f70491c;

        /* renamed from: d */
        final /* synthetic */ String f70492d;

        /* renamed from: e */
        final /* synthetic */ String f70493e;

        /* renamed from: f */
        final /* synthetic */ C26501r f70494f;

        /* renamed from: g */
        final /* synthetic */ Map f70495g;

        C26747b(String str, String str2, String str3, String str4, String str5, C26501r rVar, Map map) {
            this.f70489a = str;
            this.f70490b = str2;
            this.f70491c = str3;
            this.f70492d = str4;
            this.f70493e = str5;
            this.f70494f = rVar;
            this.f70495g = map;
        }

        public final /* synthetic */ Object call() {
            m87806a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87806a() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f70489a);
            sb.append('_');
            sb.append(this.f70494f.mo68132e());
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "general_search").mo59973a("search_id", this.f70489a).mo59973a("search_keyword", this.f70490b).mo59973a("log_pb", this.f70491c).mo59973a("impr_id", this.f70492d).mo59973a("enter_from", this.f70493e).mo59973a("is_aladdin", "1").mo59973a("rank", String.valueOf(this.f70494f.mo68132e())).mo59973a("search_result_id", sb.toString());
            Map map = this.f70495g;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.mo59973a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C6907h.m21524a("search_result_show", (Map) a.f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a.c$c */
    static final class C26748c<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f70496a;

        /* renamed from: b */
        final /* synthetic */ String f70497b;

        /* renamed from: c */
        final /* synthetic */ String f70498c;

        /* renamed from: d */
        final /* synthetic */ String f70499d;

        /* renamed from: e */
        final /* synthetic */ String f70500e;

        /* renamed from: f */
        final /* synthetic */ C26501r f70501f;

        /* renamed from: g */
        final /* synthetic */ int f70502g;

        /* renamed from: h */
        final /* synthetic */ Map f70503h;

        C26748c(String str, String str2, String str3, String str4, String str5, C26501r rVar, int i, Map map) {
            this.f70496a = str;
            this.f70497b = str2;
            this.f70498c = str3;
            this.f70499d = str4;
            this.f70500e = str5;
            this.f70501f = rVar;
            this.f70502g = i;
            this.f70503h = map;
        }

        public final /* synthetic */ Object call() {
            m87807a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87807a() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f70496a);
            sb.append('_');
            sb.append(this.f70501f.mo68132e());
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "general_search").mo59973a("search_id", this.f70496a).mo59973a("search_keyword", this.f70497b).mo59973a("log_pb", this.f70498c).mo59973a("impr_id", this.f70499d).mo59973a("enter_from", this.f70500e).mo59973a("is_aladdin", "1").mo59973a("rank", String.valueOf(this.f70501f.mo68132e())).mo59973a("search_result_id", sb.toString()).mo59973a("aladin_rank", String.valueOf(this.f70502g));
            Map map = this.f70503h;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.mo59973a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C6907h.m21524a("search_result_click", (Map) a.f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a.c$d */
    static final class C26749d<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f70504a;

        /* renamed from: b */
        final /* synthetic */ String f70505b;

        /* renamed from: c */
        final /* synthetic */ String f70506c;

        /* renamed from: d */
        final /* synthetic */ String f70507d;

        /* renamed from: e */
        final /* synthetic */ String f70508e;

        /* renamed from: f */
        final /* synthetic */ C26501r f70509f;

        /* renamed from: g */
        final /* synthetic */ int f70510g;

        /* renamed from: h */
        final /* synthetic */ Map f70511h;

        C26749d(String str, String str2, String str3, String str4, String str5, C26501r rVar, int i, Map map) {
            this.f70504a = str;
            this.f70505b = str2;
            this.f70506c = str3;
            this.f70507d = str4;
            this.f70508e = str5;
            this.f70509f = rVar;
            this.f70510g = i;
            this.f70511h = map;
        }

        public final /* synthetic */ Object call() {
            m87808a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87808a() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f70504a);
            sb.append('_');
            sb.append(this.f70509f.mo68132e());
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "general_search").mo59973a("search_id", this.f70504a).mo59973a("search_keyword", this.f70505b).mo59973a("log_pb", this.f70506c).mo59973a("impr_id", this.f70507d).mo59973a("enter_from", this.f70508e).mo59973a("is_aladdin", "1").mo59973a("rank", String.valueOf(this.f70509f.mo68132e())).mo59973a("search_result_id", sb.toString()).mo59973a("aladin_rank", String.valueOf(this.f70510g));
            Map map = this.f70511h;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.mo59973a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C6907h.m21524a("search_result_show", (Map) a.f60753a);
        }
    }

    private C26745c() {
    }

    /* renamed from: a */
    public static void m87802a(C26501r rVar, Map<String, String> map) {
        String str;
        C7573i.m23587b(rVar, "param");
        String a = SearchContext.m87922a(3);
        String a2 = C28199ae.m92689a().mo71791a(a);
        String d = rVar.mo68131d();
        String b = rVar.mo68129b();
        if (!TextUtils.isEmpty(rVar.f69900d)) {
            str = rVar.f69900d;
        } else {
            str = "general_search";
        }
        C26747b bVar = new C26747b(a, b, a2, d, str, rVar, map);
        C1592h.m7855a((Callable<TResult>) bVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: b */
    public static void m87804b(C26501r rVar, Map<String, String> map) {
        String str;
        C7573i.m23587b(rVar, "param");
        String a = SearchContext.m87922a(3);
        String a2 = C28199ae.m92689a().mo71791a(a);
        String d = rVar.mo68131d();
        String b = rVar.mo68129b();
        if (!TextUtils.isEmpty(rVar.f69900d)) {
            str = rVar.f69900d;
        } else {
            str = "general_search";
        }
        C26746a aVar = new C26746a(a, b, a2, d, str, rVar, map);
        C1592h.m7855a((Callable<TResult>) aVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87801a(C26501r rVar, int i, Map<String, String> map) {
        String str;
        C7573i.m23587b(rVar, "param");
        String a = SearchContext.m87922a(3);
        String a2 = C28199ae.m92689a().mo71791a(a);
        String d = rVar.mo68131d();
        String b = rVar.mo68129b();
        if (!TextUtils.isEmpty(rVar.f69900d)) {
            str = rVar.f69900d;
        } else {
            str = "general_search";
        }
        C26749d dVar = new C26749d(a, b, a2, d, str, rVar, i, map);
        C1592h.m7855a((Callable<TResult>) dVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: b */
    public static void m87803b(C26501r rVar, int i, Map<String, String> map) {
        String str;
        C7573i.m23587b(rVar, "param");
        String a = SearchContext.m87922a(3);
        String a2 = C28199ae.m92689a().mo71791a(a);
        String d = rVar.mo68131d();
        String b = rVar.mo68129b();
        if (!TextUtils.isEmpty(rVar.f69900d)) {
            str = rVar.f69900d;
        } else {
            str = "general_search";
        }
        C26748c cVar = new C26748c(a, b, a2, d, str, rVar, i, map);
        C1592h.m7855a((Callable<TResult>) cVar, (Executor) C6907h.m21516a());
    }
}
