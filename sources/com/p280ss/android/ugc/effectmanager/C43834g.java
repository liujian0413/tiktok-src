package com.p280ss.android.ugc.effectmanager;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.common.C43740i;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43720b;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43722d;
import com.p280ss.android.ugc.effectmanager.effect.p1731a.C43749a;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43801b;
import com.p280ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration;
import com.p280ss.android.ugc.effectmanager.link.model.host.Host;
import com.p280ss.android.ugc.effectmanager.network.C43859a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.effectmanager.g */
public final class C43834g {

    /* renamed from: A */
    public String f113507A;

    /* renamed from: B */
    public C43846k f113508B;

    /* renamed from: C */
    public C43749a f113509C;

    /* renamed from: a */
    public String f113510a;

    /* renamed from: b */
    public String f113511b;

    /* renamed from: c */
    public String f113512c;

    /* renamed from: d */
    public String f113513d;

    /* renamed from: e */
    public String f113514e;

    /* renamed from: f */
    public String f113515f;

    /* renamed from: g */
    public String f113516g;

    /* renamed from: h */
    public String f113517h;

    /* renamed from: i */
    public String f113518i;

    /* renamed from: j */
    public File f113519j;

    /* renamed from: k */
    public String f113520k;

    /* renamed from: l */
    public String f113521l;

    /* renamed from: m */
    public String f113522m;

    /* renamed from: n */
    public String f113523n;

    /* renamed from: o */
    public String f113524o;

    /* renamed from: p */
    public String f113525p;

    /* renamed from: q */
    public String f113526q;

    /* renamed from: r */
    public C43740i f113527r;

    /* renamed from: s */
    public C43719a f113528s;

    /* renamed from: t */
    public int f113529t;

    /* renamed from: u */
    public ArrayList<String> f113530u;

    /* renamed from: v */
    public LinkSelectorConfiguration f113531v;

    /* renamed from: w */
    public C43721c f113532w;

    /* renamed from: x */
    public C43859a f113533x;

    /* renamed from: y */
    public C43722d f113534y;

    /* renamed from: z */
    public ExecutorService f113535z;

    /* renamed from: com.ss.android.ugc.effectmanager.g$a */
    public static final class C43836a {

        /* renamed from: a */
        public String f113536a;

        /* renamed from: b */
        public String f113537b;

        /* renamed from: c */
        public String f113538c;

        /* renamed from: d */
        public String f113539d;

        /* renamed from: e */
        public String f113540e;

        /* renamed from: f */
        public String f113541f;

        /* renamed from: g */
        public String f113542g;

        /* renamed from: h */
        public String f113543h;

        /* renamed from: i */
        public File f113544i;

        /* renamed from: j */
        public String f113545j;

        /* renamed from: k */
        public String f113546k;

        /* renamed from: l */
        public C43720b f113547l;

        /* renamed from: m */
        public C43721c f113548m;

        /* renamed from: n */
        public C43719a f113549n;

        /* renamed from: o */
        public int f113550o = 3;

        /* renamed from: p */
        public String f113551p;

        /* renamed from: q */
        public String f113552q;

        /* renamed from: r */
        public C43749a f113553r;

        /* renamed from: s */
        public C43722d f113554s;

        /* renamed from: t */
        public ExecutorService f113555t;

        /* renamed from: u */
        public String f113556u;

        /* renamed from: v */
        public String f113557v;

        /* renamed from: w */
        public String f113558w;

        /* renamed from: x */
        public String f113559x;

        /* renamed from: y */
        public LinkSelectorConfiguration f113560y = new LinkSelectorConfiguration();

        /* renamed from: z */
        public ArrayList<String> f113561z;

        /* renamed from: a */
        public final C43836a mo105985a(boolean z) {
            this.f113560y.setLazy(true);
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105984a(ExecutorService executorService) {
            this.f113555t = executorService;
            return this;
        }

        /* renamed from: a */
        public final C43834g mo105986a() {
            return new C43834g(this);
        }

        /* renamed from: a */
        public final C43836a mo105974a(int i) {
            this.f113550o = 2;
            return this;
        }

        /* renamed from: b */
        public final C43836a mo105987b(String str) {
            this.f113537b = str;
            return this;
        }

        /* renamed from: c */
        public final C43836a mo105988c(String str) {
            this.f113538c = str;
            return this;
        }

        /* renamed from: d */
        public final C43836a mo105989d(String str) {
            this.f113539d = str;
            return this;
        }

        /* renamed from: e */
        public final C43836a mo105990e(String str) {
            this.f113540e = str;
            return this;
        }

        /* renamed from: f */
        public final C43836a mo105991f(String str) {
            this.f113541f = str;
            return this;
        }

        /* renamed from: g */
        public final C43836a mo105992g(String str) {
            this.f113542g = str;
            return this;
        }

        /* renamed from: h */
        public final C43836a mo105993h(String str) {
            this.f113545j = str;
            return this;
        }

        /* renamed from: i */
        public final C43836a mo105994i(String str) {
            this.f113546k = str;
            return this;
        }

        /* renamed from: j */
        public final C43836a mo105995j(String str) {
            this.f113551p = str;
            return this;
        }

        /* renamed from: k */
        public final C43836a mo105996k(String str) {
            this.f113552q = str;
            return this;
        }

        /* renamed from: l */
        public final C43836a mo105997l(String str) {
            this.f113556u = str;
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105975a(Context context) {
            this.f113560y.setContext(context);
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105976a(C43720b bVar) {
            this.f113547l = bVar;
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105977a(C43721c cVar) {
            this.f113548m = cVar;
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105978a(C43722d dVar) {
            this.f113554s = dVar;
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105979a(C43749a aVar) {
            this.f113553r = aVar;
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105980a(File file) {
            this.f113544i = file;
            if (file != null && !file.exists()) {
                file.mkdirs();
            }
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105981a(String str) {
            this.f113536a = str;
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105983a(List<Host> list) {
            this.f113560y.setOriginHosts(list);
            return this;
        }

        /* renamed from: a */
        public final C43836a mo105982a(String str, String str2, String str3) {
            this.f113557v = str;
            this.f113558w = str2;
            this.f113559x = str3;
            return this;
        }
    }

    private C43834g(C43836a aVar) {
        String str;
        C43749a aVar2;
        this.f113515f = "online";
        this.f113529t = 3;
        this.f113510a = "/effect/api";
        this.f113511b = aVar.f113536a;
        this.f113512c = aVar.f113537b;
        this.f113513d = aVar.f113538c;
        this.f113514e = aVar.f113539d;
        if (TextUtils.equals("test", aVar.f113540e) || TextUtils.equals("local_test", aVar.f113540e)) {
            str = "test";
        } else {
            str = "online";
        }
        this.f113515f = str;
        this.f113516g = aVar.f113541f;
        this.f113517h = aVar.f113542g;
        this.f113519j = aVar.f113544i;
        this.f113533x = new C43859a(aVar.f113547l);
        this.f113520k = aVar.f113545j;
        this.f113528s = aVar.f113549n;
        this.f113529t = aVar.f113550o;
        this.f113532w = aVar.f113548m;
        this.f113521l = aVar.f113546k;
        this.f113522m = aVar.f113551p;
        this.f113523n = aVar.f113552q;
        this.f113531v = aVar.f113560y;
        this.f113524o = aVar.f113557v;
        this.f113525p = aVar.f113558w;
        this.f113526q = aVar.f113559x;
        this.f113534y = aVar.f113554s;
        this.f113535z = aVar.f113555t;
        if (aVar.f113553r == null) {
            aVar2 = new C43801b(this.f113533x, this.f113534y, this.f113521l, this.f113511b);
        } else {
            aVar2 = aVar.f113553r;
        }
        this.f113509C = aVar2;
        this.f113507A = aVar.f113556u;
        this.f113508B = new C43846k();
        this.f113530u = aVar.f113561z;
        this.f113518i = aVar.f113543h;
    }
}
