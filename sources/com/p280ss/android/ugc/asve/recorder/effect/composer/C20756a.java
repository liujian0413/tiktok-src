package com.p280ss.android.ugc.asve.recorder.effect.composer;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a */
public final class C20756a implements C20761c {

    /* renamed from: c */
    public static final C20757a f56038c = new C20757a(null);

    /* renamed from: a */
    public final ArrayList<C20758b> f56039a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C20758b> f56040b = new ArrayList<>();

    /* renamed from: d */
    private final C20759b f56041d;

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a$a */
    public static final class C20757a {
        private C20757a() {
        }

        public /* synthetic */ C20757a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a$b */
    public final class C20758b {

        /* renamed from: a */
        public int f56042a;

        /* renamed from: b */
        public int f56043b;

        /* renamed from: c */
        public String f56044c;

        /* renamed from: d */
        public String f56045d;

        /* renamed from: e */
        public float f56046e;

        /* renamed from: f */
        public String f56047f;

        public C20758b(int i) {
            this.f56042a = 1;
            this.f56043b = -1;
            this.f56044c = "";
            this.f56045d = "";
            this.f56047f = "";
            this.f56042a = 0;
        }

        public C20758b(C20756a aVar, int i, String str) {
            C7573i.m23587b(str, "path");
            C20756a.this = aVar;
            this.f56042a = 1;
            this.f56043b = -1;
            this.f56044c = "";
            this.f56045d = "";
            this.f56047f = "";
            this.f56042a = 2;
            this.f56044c = str;
        }

        public C20758b(C20756a aVar, int i, int i2, String str) {
            C7573i.m23587b(str, "path");
            C20756a.this = aVar;
            this.f56042a = 1;
            this.f56043b = -1;
            this.f56044c = "";
            this.f56045d = "";
            this.f56047f = "";
            this.f56042a = 3;
            this.f56044c = str;
            this.f56043b = i2;
        }

        public C20758b(C20756a aVar, String str, String str2, float f) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(str2, "featureTag");
            C20756a.this = aVar;
            this.f56042a = 1;
            this.f56043b = -1;
            this.f56044c = "";
            this.f56045d = "";
            this.f56047f = "";
            this.f56042a = 4;
            this.f56044c = str;
            this.f56045d = str2;
            this.f56046e = f;
        }

        public C20758b(C20756a aVar, int i, int i2, String str, String str2) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(str2, "extra");
            C20756a.this = aVar;
            this.f56042a = 1;
            this.f56043b = -1;
            this.f56044c = "";
            this.f56045d = "";
            this.f56047f = "";
            this.f56042a = 1;
            this.f56044c = str;
            this.f56043b = i2;
            this.f56047f = str2;
        }
    }

    /* renamed from: b */
    public final C20761c mo56145b() {
        this.f56039a.add(new C20758b(0));
        return this;
    }

    /* renamed from: a */
    public final void mo56144a() {
        C20759b bVar = this.f56041d;
        if (bVar instanceof C20762d) {
            ((C20762d) this.f56041d).mo56146a(this);
        } else if (bVar instanceof C20763e) {
            ((C20763e) this.f56041d).mo56147a(this);
        } else {
            throw new Exception("should not go this case ");
        }
        this.f56039a.clear();
        this.f56040b.clear();
    }

    public C20756a(C20759b bVar) {
        C7573i.m23587b(bVar, "composerService");
        this.f56041d = bVar;
    }

    /* renamed from: a */
    public final C20761c mo56138a(int i) {
        this.f56039a.add(new C20758b(this, 3, i, ""));
        return this;
    }

    /* renamed from: a */
    public final C20761c mo56139a(String str) {
        C7573i.m23587b(str, "path");
        this.f56039a.add(new C20758b(this, 2, str));
        return this;
    }

    /* renamed from: a */
    public final C20761c mo56142a(List<String> list) {
        C7573i.m23587b(list, "paths");
        for (String a : list) {
            mo56139a(a);
        }
        return this;
    }

    /* renamed from: a */
    public final C20761c mo56143a(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "paths");
        for (ComposerInfo composerInfo : list) {
            mo56141a(composerInfo.f56036a, composerInfo.f56037b, i);
        }
        return this;
    }

    /* renamed from: a */
    public final C20761c mo56140a(String str, String str2, float f) {
        C7573i.m23587b(str, "path");
        C7573i.m23587b(str2, "featureTag");
        this.f56040b.add(new C20758b(this, str, str2, f));
        return this;
    }

    /* renamed from: a */
    public final C20761c mo56141a(String str, String str2, int i) {
        C7573i.m23587b(str, "path");
        C7573i.m23587b(str2, "extra");
        ArrayList<C20758b> arrayList = this.f56039a;
        C20758b bVar = new C20758b(this, 1, i, str, str2);
        arrayList.add(bVar);
        return this;
    }
}
