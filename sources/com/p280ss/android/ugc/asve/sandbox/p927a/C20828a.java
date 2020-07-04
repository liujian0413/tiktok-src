package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.bef.effectsdk.C1942b;
import com.p280ss.android.ugc.asve.C15395c;
import com.p280ss.android.ugc.asve.IASPathAdaptor;
import com.p280ss.android.ugc.asve.IASPathAdaptor.MediaType;
import com.p280ss.android.ugc.asve.recorder.C20675b;
import com.p280ss.android.ugc.asve.sandbox.C21023f;
import com.p280ss.android.ugc.asve.sandbox.C21023f.C21024a;
import com.p280ss.android.ugc.asve.sandbox.C21044m.C21045a;
import com.p280ss.android.ugc.asve.sandbox.SandBoxResourceFinder;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21063b;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21063b.C21064a;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21066c;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21066c.C21067a;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21072e;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21072e.C21073a;
import com.p280ss.android.vesdk.VEListener.C45206b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.a */
public final class C20828a {

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$a */
    public static final class C20829a extends C21045a {

        /* renamed from: a */
        final /* synthetic */ C1942b f56249a;

        /* renamed from: b */
        private final Map<Long, Long> f56250b = new LinkedHashMap();

        /* renamed from: c */
        private SandBoxResourceFinder f56251c;

        /* renamed from: a */
        public final long mo56350a(long j) {
            return this.f56249a.createNativeResourceFinder(j);
        }

        C20829a(C1942b bVar) {
            this.f56249a = bVar;
        }

        /* renamed from: b */
        public final void mo56352b(long j) {
            SandBoxResourceFinder sandBoxResourceFinder = this.f56251c;
            if (sandBoxResourceFinder != null) {
                sandBoxResourceFinder.releaseLoacl(j);
            }
            this.f56249a.release(j);
        }

        /* renamed from: a */
        public final String mo56351a(long j, String str, String str2) {
            long longValue;
            C7573i.m23587b(str, "dir");
            C7573i.m23587b(str2, "name");
            if (!this.f56250b.containsKey(Long.valueOf(j))) {
                longValue = this.f56249a.createNativeResourceFinder(j);
                this.f56250b.put(Long.valueOf(j), Long.valueOf(longValue));
            } else {
                Object obj = this.f56250b.get(Long.valueOf(j));
                if (obj == null) {
                    C7573i.m23580a();
                }
                longValue = ((Number) obj).longValue();
            }
            long j2 = longValue;
            if (this.f56251c == null) {
                this.f56251c = new SandBoxResourceFinder(this);
            }
            SandBoxResourceFinder sandBoxResourceFinder = this.f56251c;
            if (sandBoxResourceFinder == null) {
                C7573i.m23580a();
            }
            return sandBoxResourceFinder.nativeGetResourceUrl(j2, j, str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$b */
    public static final class C20830b extends C21067a {

        /* renamed from: a */
        final /* synthetic */ C15395c f56252a;

        C20830b(C15395c cVar) {
            this.f56252a = cVar;
        }

        /* renamed from: a */
        public final void mo56353a(String str) {
            C7573i.m23587b(str, "msg");
            this.f56252a.mo38740a(str);
        }

        /* renamed from: b */
        public final void mo56354b(String str) {
            C7573i.m23587b(str, "msg");
            this.f56252a.mo38741b(str);
        }

        /* renamed from: c */
        public final void mo56355c(String str) {
            C7573i.m23587b(str, "msg");
            this.f56252a.mo38742c(str);
        }

        /* renamed from: d */
        public final void mo56356d(String str) {
            C7573i.m23587b(str, "msg");
            this.f56252a.mo38743d(str);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$c */
    public static final class C20831c extends C21073a {

        /* renamed from: a */
        final /* synthetic */ C20675b f56253a;

        C20831c(C20675b bVar) {
            this.f56253a = bVar;
        }

        /* renamed from: a */
        public final void mo56357a(String str, String str2) {
            C7573i.m23587b(str, "logType");
            C7573i.m23587b(str2, "JsonString");
            this.f56253a.mo56362a(str, new JSONObject(str2));
        }

        /* renamed from: a */
        public final void mo56359a(String str, Map<Object, Object> map) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(map, "map");
            this.f56253a.mo55881a(str, C7577n.m23626f(map));
        }

        /* renamed from: a */
        public final void mo56358a(String str, String str2, String str3, String str4) {
            this.f56253a.mo55880a(str, str2, str3, str4);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$d */
    public static final class C20832d extends C21064a {

        /* renamed from: a */
        final /* synthetic */ C45206b f56254a;

        C20832d(C45206b bVar) {
            this.f56254a = bVar;
        }

        /* renamed from: a */
        public final void mo56360a(String str, String str2, String str3, String str4, String str5) {
            if (str != null && str2 != null && str5 != null) {
                this.f56254a.mo56363a(str, new JSONObject(str2), str3, str4, str5);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$e */
    public static final class C20833e extends C21024a {

        /* renamed from: a */
        final /* synthetic */ IASPathAdaptor f56255a;

        C20833e(IASPathAdaptor iASPathAdaptor) {
            this.f56255a = iASPathAdaptor;
        }

        /* renamed from: a */
        public final String mo56361a(String str, int i) {
            C7573i.m23587b(str, "ori");
            return this.f56255a.mo38738a(str, MediaType.values()[i]);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$f */
    public static final class C20834f implements C15395c {

        /* renamed from: a */
        final /* synthetic */ C21066c f56256a;

        C20834f(C21066c cVar) {
            this.f56256a = cVar;
        }

        /* renamed from: a */
        public final void mo38740a(String str) {
            C7573i.m23587b(str, "message");
            this.f56256a.mo56353a(str);
        }

        /* renamed from: b */
        public final void mo38741b(String str) {
            C7573i.m23587b(str, "message");
            this.f56256a.mo56354b(str);
        }

        /* renamed from: c */
        public final void mo38742c(String str) {
            C7573i.m23587b(str, "message");
            this.f56256a.mo56355c(str);
        }

        /* renamed from: d */
        public final void mo38743d(String str) {
            C7573i.m23587b(str, "message");
            this.f56256a.mo56356d(str);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$g */
    public static final class C20835g implements C20675b {

        /* renamed from: a */
        final /* synthetic */ C21072e f56257a;

        /* renamed from: a */
        public final void mo55882a(Throwable th, String str) {
            C7573i.m23587b(th, "throwable");
            C7573i.m23587b(str, "key");
        }

        C20835g(C21072e eVar) {
            this.f56257a = eVar;
        }

        /* renamed from: a */
        public final void mo55881a(String str, Map<String, String> map) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(map, "map");
            this.f56257a.mo56359a(str, (Map) map);
        }

        /* renamed from: a */
        public final void mo56362a(String str, JSONObject jSONObject) {
            C7573i.m23587b(str, "logType");
            C7573i.m23587b(jSONObject, "logExtra");
            this.f56257a.mo56357a(str, jSONObject.toString());
        }

        /* renamed from: a */
        public final void mo55880a(String str, String str2, String str3, String str4) {
            this.f56257a.mo56358a(str, str2, str3, str4);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$h */
    static final class C20836h implements C45206b {

        /* renamed from: a */
        final /* synthetic */ C21063b f56258a;

        C20836h(C21063b bVar) {
            this.f56258a = bVar;
        }

        /* renamed from: a */
        public final void mo56363a(String str, JSONObject jSONObject, String str2, String str3, String str4) {
            C7573i.m23587b(str, "event");
            C7573i.m23587b(str4, "productType");
            this.f56258a.mo56360a(str, String.valueOf(jSONObject), str2, str3, str4);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$i */
    public static final class C20837i implements IASPathAdaptor {

        /* renamed from: a */
        final /* synthetic */ C21023f f56259a;

        C20837i(C21023f fVar) {
            this.f56259a = fVar;
        }

        /* renamed from: a */
        public final String mo38738a(String str, MediaType mediaType) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(mediaType, "type");
            String a = this.f56259a.mo56361a(str, mediaType.ordinal());
            C7573i.m23582a((Object) a, "this@stub.getAdaptionPath(path, type.ordinal)");
            return a;
        }
    }

    /* renamed from: a */
    public static final C45206b m69783a(C21063b bVar) {
        C7573i.m23587b(bVar, "$this$stub");
        return new C20836h(bVar);
    }

    /* renamed from: a */
    public static final IASPathAdaptor m69775a(C21023f fVar) {
        C7573i.m23587b(fVar, "$this$stub");
        return new C20837i(fVar);
    }

    /* renamed from: a */
    public static final C15395c m69776a(C21066c cVar) {
        C7573i.m23587b(cVar, "$this$stub");
        return new C20834f(cVar);
    }

    /* renamed from: a */
    public static final C20675b m69777a(C21072e eVar) {
        C7573i.m23587b(eVar, "$this$stub");
        return new C20835g(eVar);
    }

    /* renamed from: a */
    public static final C21024a m69778a(IASPathAdaptor iASPathAdaptor) {
        C7573i.m23587b(iASPathAdaptor, "$this$proxy");
        return new C20833e(iASPathAdaptor);
    }

    /* renamed from: a */
    public static final C21045a m69779a(C1942b bVar) {
        C7573i.m23587b(bVar, "$this$proxy");
        return new C20829a(bVar);
    }

    /* renamed from: a */
    public static final C21064a m69780a(C45206b bVar) {
        C7573i.m23587b(bVar, "$this$proxy");
        return new C20832d(bVar);
    }

    /* renamed from: a */
    public static final C21067a m69781a(C15395c cVar) {
        C7573i.m23587b(cVar, "$this$proxy");
        return new C20830b(cVar);
    }

    /* renamed from: a */
    public static final C21073a m69782a(C20675b bVar) {
        C7573i.m23587b(bVar, "$this$proxy");
        return new C20831c(bVar);
    }
}
