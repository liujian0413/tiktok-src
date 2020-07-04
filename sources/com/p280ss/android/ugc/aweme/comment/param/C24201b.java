package com.p280ss.android.ugc.aweme.comment.param;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.C28201af;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.param.b */
public final class C24201b {

    /* renamed from: a */
    public Aweme f63881a;

    /* renamed from: b */
    public String f63882b;

    /* renamed from: c */
    public boolean f63883c;

    /* renamed from: d */
    public boolean f63884d;

    /* renamed from: e */
    public boolean f63885e;

    /* renamed from: f */
    public String f63886f;

    /* renamed from: g */
    public boolean f63887g;

    /* renamed from: h */
    public String f63888h;

    /* renamed from: i */
    public String f63889i;

    /* renamed from: j */
    public boolean f63890j;

    /* renamed from: k */
    public C28201af f63891k;

    /* renamed from: l */
    public List<User> f63892l;

    /* renamed from: m */
    public boolean f63893m;

    /* renamed from: n */
    public String f63894n;

    /* renamed from: o */
    public String f63895o;

    /* renamed from: p */
    public String f63896p;

    /* renamed from: com.ss.android.ugc.aweme.comment.param.b$a */
    public static final class C24202a {

        /* renamed from: a */
        public String f63897a;

        /* renamed from: b */
        public String f63898b;

        /* renamed from: c */
        private List<String> f63899c;

        /* renamed from: d */
        private boolean f63900d;

        /* renamed from: e */
        private boolean f63901e;

        /* renamed from: f */
        private boolean f63902f;

        /* renamed from: g */
        private String f63903g;

        /* renamed from: h */
        private boolean f63904h;

        /* renamed from: i */
        private String f63905i;

        /* renamed from: j */
        private String f63906j;

        /* renamed from: k */
        private boolean f63907k;

        /* renamed from: l */
        private C28201af f63908l;

        /* renamed from: m */
        private List<User> f63909m;

        /* renamed from: n */
        private boolean f63910n;

        /* renamed from: o */
        private String f63911o;

        /* renamed from: p */
        private Aweme f63912p;

        public C24202a() {
            this(null, 1, null);
        }

        /* renamed from: a */
        public final C24201b mo62904a() {
            if (this.f63912p != null || !C6399b.m19928c()) {
                C24201b bVar = new C24201b(null);
                bVar.f63881a = this.f63912p;
                bVar.mo62899a(C7525m.m23492a(this.f63899c, ",", null, null, 0, null, null, 62, null));
                bVar.f63883c = this.f63900d;
                bVar.f63884d = this.f63901e;
                bVar.f63885e = this.f63902f;
                bVar.f63886f = this.f63903g;
                bVar.f63887g = this.f63904h;
                bVar.f63888h = this.f63905i;
                bVar.f63889i = this.f63906j;
                bVar.f63890j = this.f63907k;
                bVar.f63891k = this.f63908l;
                bVar.f63892l = this.f63909m;
                bVar.f63893m = this.f63910n;
                bVar.f63894n = this.f63897a;
                bVar.f63895o = this.f63898b;
                bVar.f63896p = this.f63911o;
                return bVar;
            }
            throw new RuntimeException("Cannot show a comment dialog with a null Aweme");
        }

        /* renamed from: a */
        public final C24202a mo62900a(C28201af afVar) {
            this.f63908l = afVar;
            return this;
        }

        /* renamed from: b */
        public final C24202a mo62905b(String str) {
            this.f63903g = str;
            return this;
        }

        /* renamed from: c */
        public final C24202a mo62908c(String str) {
            this.f63905i = str;
            return this;
        }

        /* renamed from: d */
        public final C24202a mo62910d(String str) {
            this.f63906j = str;
            return this;
        }

        /* renamed from: e */
        public final C24202a mo62912e(String str) {
            this.f63897a = str;
            return this;
        }

        /* renamed from: f */
        public final C24202a mo62914f(String str) {
            this.f63898b = str;
            return this;
        }

        /* renamed from: g */
        public final C24202a mo62916g(String str) {
            this.f63911o = str;
            return this;
        }

        /* renamed from: a */
        public final C24202a mo62903a(boolean z) {
            this.f63901e = true;
            return this;
        }

        /* renamed from: b */
        public final C24202a mo62907b(boolean z) {
            this.f63902f = z;
            return this;
        }

        /* renamed from: c */
        public final C24202a mo62909c(boolean z) {
            this.f63904h = z;
            return this;
        }

        /* renamed from: d */
        public final C24202a mo62911d(boolean z) {
            this.f63900d = z;
            return this;
        }

        /* renamed from: e */
        public final C24202a mo62913e(boolean z) {
            this.f63907k = false;
            return this;
        }

        /* renamed from: f */
        public final C24202a mo62915f(boolean z) {
            this.f63910n = true;
            return this;
        }

        /* renamed from: a */
        public final C24202a mo62901a(String str) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List<String> list = this.f63899c;
                if (str == null) {
                    C7573i.m23580a();
                }
                list.add(str);
            }
            return this;
        }

        /* renamed from: b */
        public final C24202a mo62906b(List<? extends User> list) {
            if (list != null) {
                this.f63909m = C7525m.m23509d((Collection<? extends T>) list);
            } else {
                this.f63909m = new ArrayList();
            }
            return this;
        }

        public C24202a(Aweme aweme) {
            this.f63912p = aweme;
            this.f63899c = new ArrayList();
            this.f63903g = "";
            this.f63905i = "";
            this.f63906j = "";
            this.f63907k = true;
            this.f63909m = new ArrayList();
            this.f63897a = "";
            this.f63898b = "";
            this.f63911o = "";
        }

        /* renamed from: a */
        public final C24202a mo62902a(List<String> list) {
            if (list != null) {
                this.f63899c = C7525m.m23509d((Collection<? extends T>) list);
            } else {
                this.f63899c = new ArrayList();
            }
            return this;
        }

        private /* synthetic */ C24202a(Aweme aweme, int i, C7571f fVar) {
            this(null);
        }
    }

    private C24201b() {
        this.f63882b = "";
        this.f63886f = "";
        this.f63888h = "";
        this.f63889i = "";
        this.f63890j = true;
        this.f63894n = "";
        this.f63895o = "";
        this.f63896p = "";
    }

    public /* synthetic */ C24201b(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final void mo62899a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f63882b = str;
    }
}
