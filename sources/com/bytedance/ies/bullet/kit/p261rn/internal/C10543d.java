package com.bytedance.ies.bullet.kit.p261rn.internal;

import android.net.Uri;
import android.text.TextUtils;
import bolts.C1590f;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.bullet.core.common.C10350d;
import com.bytedance.ies.bullet.core.common.YieldError;
import com.bytedance.ies.bullet.core.kit.bridge.C10375f;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import com.bytedance.ies.bullet.core.p539b.C10335b;
import com.bytedance.ies.bullet.kit.p261rn.C10499f;
import com.bytedance.ies.bullet.kit.p261rn.C10503g;
import com.bytedance.ies.bullet.kit.p261rn.C10504h;
import com.bytedance.ies.bullet.kit.p261rn.C10578j;
import com.bytedance.ies.bullet.kit.p261rn.C10583o;
import com.bytedance.ies.bullet.kit.p261rn.C10589p;
import com.bytedance.ies.bullet.kit.p261rn.C10613q;
import com.bytedance.ies.bullet.kit.p261rn.p544a.C10487a;
import com.bytedance.ies.bullet.kit.p261rn.p545b.C10491c;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactInstanceManager.ReactInstanceEventListener;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.PageFinishedListener;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d */
public final class C10543d {

    /* renamed from: o */
    public static C10499f f28271o;

    /* renamed from: p */
    public static final C10544a f28272p = new C10544a(null);

    /* renamed from: a */
    public File f28273a;

    /* renamed from: b */
    public C1590f f28274b = new C1590f();

    /* renamed from: c */
    public boolean f28275c;

    /* renamed from: d */
    public final C10583o f28276d;

    /* renamed from: e */
    public final C10403b f28277e;

    /* renamed from: f */
    public final C10491c f28278f;

    /* renamed from: g */
    public final String f28279g;

    /* renamed from: h */
    public C10334a f28280h;

    /* renamed from: i */
    public final C10487a f28281i;

    /* renamed from: j */
    public final C10375f f28282j;

    /* renamed from: k */
    public final List<Object> f28283k;

    /* renamed from: l */
    public final List<C10504h> f28284l;

    /* renamed from: m */
    public final List<C10578j> f28285m;

    /* renamed from: n */
    public C10503g f28286n;

    /* renamed from: q */
    private boolean f28287q;

    /* renamed from: r */
    private final List<C10613q> f28288r;

    /* renamed from: s */
    private C10545b f28289s;

    /* renamed from: t */
    private boolean f28290t;

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$a */
    public static final class C10544a {
        private C10544a() {
        }

        public /* synthetic */ C10544a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$b */
    public interface C10545b {
        /* renamed from: a */
        void mo25336a(C10543d dVar, ReactInstanceManager reactInstanceManager);

        /* renamed from: a */
        void mo25337a(C10543d dVar, Exception exc);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$c */
    static final class C10546c {

        /* renamed from: a */
        public String f28291a;

        /* renamed from: a */
        public final boolean mo25338a() {
            boolean z;
            CharSequence charSequence = this.f28291a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || !new File(this.f28291a).exists()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$d */
    static final class C10547d implements ReactInstanceEventListener {

        /* renamed from: a */
        final /* synthetic */ C10543d f28292a;

        /* renamed from: b */
        final /* synthetic */ C7562b f28293b;

        /* renamed from: c */
        final /* synthetic */ String f28294c;

        /* renamed from: d */
        final /* synthetic */ ReactInstanceManager f28295d;

        C10547d(C10543d dVar, C7562b bVar, String str, ReactInstanceManager reactInstanceManager) {
            this.f28292a = dVar;
            this.f28293b = bVar;
            this.f28294c = str;
            this.f28295d = reactInstanceManager;
        }

        public final void onReactContextInitialized(ReactContext reactContext) {
            try {
                C7562b bVar = this.f28293b;
                C7573i.m23582a((Object) reactContext, "context");
                bVar.invoke(reactContext);
                if (!this.f28292a.f28275c) {
                    this.f28292a.f28274b.mo6871c();
                    if (!TextUtils.isEmpty(this.f28294c)) {
                        C10543d.m30917a(reactContext, this.f28294c);
                    }
                    C10487a aVar = this.f28292a.f28281i;
                    if (aVar != null) {
                        aVar.mo25274g();
                    }
                    this.f28292a.mo25331a(this.f28295d);
                }
            } catch (Exception e) {
                this.f28292a.mo25333a(e);
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$e */
    static final class C10548e<TTaskResult, TContinuationResult> implements C1591g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28296a;

        C10548e(C10543d dVar) {
            this.f28296a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Void> hVar) {
            this.f28296a.f28275c = true;
            this.f28296a.mo25333a(new Exception("ReactInstanceEventListener callback timeout"));
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$f */
    static final class C10549f extends Lambda implements C7562b<ReactContext, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28297a;

        C10549f(C10543d dVar) {
            this.f28297a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30931a((ReactContext) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30931a(ReactContext reactContext) {
            C7573i.m23587b(reactContext, "$receiver");
            reactContext.getCatalystInstance().setPageFinishListener(new PageFinishedListener(this) {

                /* renamed from: a */
                final /* synthetic */ C10549f f28298a;

                {
                    this.f28298a = r1;
                }

                public final void upLoad(JSONObject jSONObject) {
                    C10487a aVar = this.f28298a.f28297a.f28281i;
                    if (aVar != null) {
                        aVar.mo25270a(jSONObject);
                    }
                    Iterator it = this.f28298a.f28297a.f28283k.iterator();
                    while (it.hasNext()) {
                        it.next();
                        try {
                            new C10589p(this.f28298a.f28297a.f28276d);
                            JSONObject jSONObject2 = new JSONObject();
                            if (jSONObject != null) {
                                C10350d.m30638a(jSONObject2, jSONObject);
                            }
                        } catch (YieldError unused) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$g */
    static final class C10551g extends Lambda implements C7562b<File, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28299a;

        /* renamed from: b */
        final /* synthetic */ C10546c f28300b;

        /* renamed from: c */
        final /* synthetic */ long f28301c;

        C10551g(C10543d dVar, C10546c cVar, long j) {
            this.f28299a = dVar;
            this.f28300b = cVar;
            this.f28301c = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30932a((File) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30932a(File file) {
            C7573i.m23587b(file, "file");
            this.f28299a.f28273a = file;
            if (this.f28299a.mo25335c(this.f28300b, this.f28301c)) {
                this.f28299a.mo25334b(this.f28300b, this.f28301c);
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$h */
    static final class C10552h extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28302a;

        C10552h(C10543d dVar) {
            this.f28302a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30933a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30933a(Throwable th) {
            C7573i.m23587b(th, "t");
            C10543d dVar = this.f28302a;
            StringBuilder sb = new StringBuilder("baseBundleFilePath not exist: ");
            sb.append(th);
            dVar.mo25333a(new Exception(sb.toString()));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$i */
    static final class C10553i extends Lambda implements C7562b<Uri, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28303a;

        /* renamed from: b */
        final /* synthetic */ C10546c f28304b;

        /* renamed from: c */
        final /* synthetic */ long f28305c;

        C10553i(C10543d dVar, C10546c cVar, long j) {
            this.f28303a = dVar;
            this.f28304b = cVar;
            this.f28305c = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30934a((Uri) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30934a(Uri uri) {
            C7573i.m23587b(uri, "it");
            C1592h.m7855a((Callable<TResult>) new Callable<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C10553i f28306a;

                {
                    this.f28306a = r1;
                }

                public final /* synthetic */ Object call() {
                    m30935a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m30935a() {
                    C10487a aVar = this.f28306a.f28303a.f28281i;
                    if (aVar != null) {
                        aVar.mo25272e();
                    }
                    if (this.f28306a.f28304b.mo25338a()) {
                        this.f28306a.f28303a.mo25330a(this.f28306a.f28304b, this.f28306a.f28305c);
                    } else {
                        this.f28306a.f28303a.mo25333a(new Exception("Patch data invalid"));
                    }
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$j */
    static final class C10555j extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28307a;

        C10555j(C10543d dVar) {
            this.f28307a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30936a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30936a(final Throwable th) {
            C7573i.m23587b(th, "it");
            C1592h.m7855a((Callable<TResult>) new Callable<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C10555j f28308a;

                {
                    this.f28308a = r1;
                }

                public final /* synthetic */ Object call() {
                    m30937a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m30937a() {
                    this.f28308a.f28307a.mo25333a(new Exception("Resouce update failed", th));
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$k */
    static final class C10557k extends Lambda implements C7562b<File, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28310a;

        /* renamed from: b */
        final /* synthetic */ C10546c f28311b;

        /* renamed from: c */
        final /* synthetic */ long f28312c;

        C10557k(C10543d dVar, C10546c cVar, long j) {
            this.f28310a = dVar;
            this.f28311b = cVar;
            this.f28312c = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30938a((File) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30938a(File file) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            CharSequence charSequence;
            C7573i.m23587b(file, "file");
            C10541c a = C10538a.m30909a(file);
            C10541c a2 = C10538a.m30909a(this.f28310a.f28273a);
            if (a == null) {
                this.f28311b.f28291a = C10538a.m30911a(file, (String) this.f28310a.f28278f.f28222c.mo25251b());
                if (this.f28311b.mo25338a()) {
                    this.f28310a.mo25330a(this.f28311b, this.f28312c);
                } else {
                    this.f28310a.mo25333a(new Exception("Patch data invalid"));
                }
            } else {
                Collection collection = a.f28268a;
                boolean z5 = false;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (a.f28269b.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (a.f28270c.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            List<String> list = a.f28268a;
                            Collection collection2 = list;
                            if (collection2 == null || collection2.isEmpty()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                C10543d dVar = this.f28310a;
                                StringBuilder sb = new StringBuilder("no such module: ");
                                sb.append(this.f28310a.f28278f.f28223d);
                                dVar.mo25333a(new Exception(sb.toString()));
                                return;
                            } else if (C7525m.m23496a((Iterable<? extends T>) list, this.f28310a.f28278f.f28223d.mo25251b())) {
                                C10543d dVar2 = this.f28310a;
                                StringBuilder sb2 = new StringBuilder("no such module: ");
                                sb2.append(this.f28310a.f28278f.f28223d);
                                dVar2.mo25333a(new Exception(sb2.toString()));
                                return;
                            } else {
                                String str = null;
                                if (a2 != null) {
                                    charSequence = a2.f28269b;
                                } else {
                                    charSequence = null;
                                }
                                CharSequence charSequence2 = charSequence;
                                if (charSequence2 == null || charSequence2.length() == 0) {
                                    z5 = true;
                                }
                                if (z5) {
                                    this.f28310a.mo25333a(new Exception("rn_base_android: bundle info args error"));
                                    return;
                                }
                                String str2 = a.f28270c;
                                if (a2 != null) {
                                    str = a2.f28269b;
                                }
                                if (!C7573i.m23585a((Object) str2, (Object) str)) {
                                    this.f28310a.mo25333a(new Exception("patch bundle is not compat with base bundle"));
                                    return;
                                }
                                this.f28311b.f28291a = C10538a.m30911a(file, (String) this.f28310a.f28278f.f28222c.mo25251b());
                                if (this.f28311b.mo25338a()) {
                                    this.f28310a.mo25330a(this.f28311b, this.f28312c);
                                    return;
                                } else {
                                    this.f28310a.mo25333a(new Exception("Patch data invalid"));
                                    return;
                                }
                            }
                        }
                    }
                }
                C10543d dVar3 = this.f28310a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f28310a.f28278f.f28221b);
                sb3.append(": bundle info args error");
                dVar3.mo25333a(new Exception(sb3.toString()));
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$l */
    static final class C10558l extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28313a;

        C10558l(C10543d dVar) {
            this.f28313a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30939a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30939a(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f28313a.mo25333a(new Exception(th));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$m */
    static final class C10559m extends Lambda implements C7562b<File, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28314a;

        /* renamed from: b */
        final /* synthetic */ C10546c f28315b;

        /* renamed from: c */
        final /* synthetic */ long f28316c;

        C10559m(C10543d dVar, C10546c cVar, long j) {
            this.f28314a = dVar;
            this.f28315b = cVar;
            this.f28316c = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30940a((File) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30940a(File file) {
            C7573i.m23587b(file, "file");
            if (file.exists()) {
                this.f28315b.f28291a = file.getPath();
                if (this.f28315b.mo25338a()) {
                    this.f28314a.mo25330a(this.f28315b, this.f28316c);
                } else {
                    this.f28314a.mo25333a(new Exception("Patch data invalid"));
                }
            } else {
                this.f28314a.mo25333a((Exception) new FileNotFoundException(file.getPath()));
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.d$n */
    static final class C10560n extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10543d f28317a;

        C10560n(C10543d dVar) {
            this.f28317a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30941a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30941a(Throwable th) {
            C7573i.m23587b(th, "it");
            this.f28317a.mo25333a(new Exception("Source url download error", th));
        }
    }

    /* renamed from: a */
    public final void mo25328a() {
        f28271o = null;
        C10334a aVar = this.f28280h;
        if (aVar != null) {
            Uri a = C10335b.m30619a("rn_base_android");
            Uri a2 = C10335b.m30619a("rn_snapshot");
            aVar.mo25100b(a, new C10532xcde24bb2(a2, aVar, this, this), new C10535xcde24bb3(a2, aVar, this, this));
        }
    }

    /* renamed from: a */
    public final void mo25331a(ReactInstanceManager reactInstanceManager) {
        this.f28289s.mo25336a(this, reactInstanceManager);
    }

    /* renamed from: a */
    public final void mo25329a(long j) {
        mo25330a(new C10546c(), 0);
    }

    /* renamed from: a */
    private final boolean m30918a(Uri uri) {
        boolean z;
        String host = uri.getHost();
        CharSequence charSequence = host;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        Iterable<C10613q> iterable = this.f28288r;
        Collection arrayList = new ArrayList();
        for (C10613q qVar : iterable) {
            C7525m.m23478a(arrayList, (Iterable<? extends T>) qVar.f28453a);
        }
        List<String> list = (List) arrayList;
        if (list.isEmpty()) {
            return true;
        }
        for (String c : list) {
            if (C7634n.m23776c(charSequence, (CharSequence) c, false)) {
                return true;
            }
        }
        if (this.f28288r.isEmpty() || !C7573i.m23585a((Object) host, (Object) ((C10613q) C7525m.m23511f(this.f28288r)).f28454b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo25333a(Exception exc) {
        this.f28289s.mo25337a(this, exc);
    }

    /* renamed from: a */
    public static void m30917a(ReactContext reactContext, String str) {
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        if (catalystInstance != null) {
            if (catalystInstance != null) {
                CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) catalystInstance;
                if (catalystInstanceImpl != null) {
                    catalystInstanceImpl.loadScriptFromFile(str, str, false);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.facebook.react.bridge.CatalystInstanceImpl");
            }
        }
    }

    /* renamed from: b */
    public final void mo25334b(C10546c cVar, long j) {
        if (this.f28287q || !C7573i.m23585a((Object) (Boolean) this.f28278f.f28227h.mo25251b(), (Object) Boolean.valueOf(true))) {
            C10334a aVar = this.f28280h;
            if (aVar != null) {
                String str = (String) this.f28278f.f28221b.mo25251b();
                if (str == null) {
                    str = "";
                }
                aVar.mo25100b(C10335b.m30619a(str), new C10557k(this, cVar, j), new C10558l(this));
                return;
            }
            return;
        }
        C10487a aVar2 = this.f28281i;
        if (aVar2 != null) {
            aVar2.mo25271d();
        }
        C10334a aVar3 = this.f28280h;
        if (aVar3 != null) {
            String str2 = (String) this.f28278f.f28221b.mo25251b();
            if (str2 == null) {
                str2 = "";
            }
            aVar3.mo25099a(C10335b.m30619a(str2), new C10553i(this, cVar, j), new C10555j(this));
        }
        this.f28287q = true;
    }

    /* renamed from: c */
    public final boolean mo25335c(C10546c cVar, long j) {
        String str = (String) this.f28278f.f28228i.mo25251b();
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "uri");
        if (!m30918a(parse)) {
            return true;
        }
        C10334a aVar = this.f28280h;
        if (aVar != null) {
            Uri parse2 = Uri.parse(str);
            C7573i.m23582a((Object) parse2, "Uri.parse(sourceUrl)");
            aVar.mo25100b(parse2, new C10559m(this, cVar, j), new C10560n(this));
        }
        return false;
    }

    /* renamed from: a */
    public final void mo25330a(C10546c cVar, long j) {
        boolean z;
        CharSequence charSequence = (CharSequence) this.f28278f.f28221b.mo25251b();
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CharSequence charSequence2 = (CharSequence) this.f28278f.f28223d.mo25251b();
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                if (!this.f28290t || cVar.mo25338a()) {
                    C10546c cVar2 = cVar;
                    long j2 = j;
                    C10334a aVar = this.f28280h;
                    if (aVar != null) {
                        Uri a = C10335b.m30619a("rn_base_android");
                        Uri a2 = C10335b.m30619a("rn_snapshot");
                        C10334a aVar2 = aVar;
                        C10546c cVar3 = cVar;
                        long j3 = j;
                        C10522xb7b319f rnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$1 = new C10522xb7b319f(a2, aVar2, this, this, cVar3, j3);
                        C10527xb7b31a0 rnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 = new C10527xb7b31a0(a2, aVar2, this, this, cVar3, j3);
                        aVar.mo25100b(a, rnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$1, rnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2);
                        return;
                    }
                    return;
                }
                C10334a aVar3 = this.f28280h;
                if (aVar3 != null) {
                    aVar3.mo25100b(C10335b.m30619a("rn_base_android"), new C10551g(this, cVar, j), new C10552h(this));
                    return;
                }
                return;
            }
        }
        mo25333a(new Exception("channel name or module name is null"));
    }

    /* renamed from: a */
    public final void mo25332a(ReactInstanceManager reactInstanceManager, String str, long j) {
        C10487a aVar = this.f28281i;
        if (aVar != null) {
            aVar.mo25273f();
        }
        C7562b fVar = new C10549f(this);
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        boolean z = false;
        if (currentReactContext != null) {
            try {
                fVar.invoke(currentReactContext);
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                if (!z) {
                    m30917a(currentReactContext, str);
                }
                C10487a aVar2 = this.f28281i;
                if (aVar2 != null) {
                    aVar2.mo25274g();
                }
                mo25331a(reactInstanceManager);
            } catch (Exception e) {
                mo25333a(e);
            }
        } else {
            reactInstanceManager.addReactInstanceEventListener(new C10547d(this, fVar, str, reactInstanceManager));
            if (!reactInstanceManager.hasStartedCreatingInitialContext()) {
                reactInstanceManager.createReactContextInBackground();
            }
            this.f28275c = false;
            if (j > 0) {
                this.f28274b = new C1590f();
                C1592h.m7848a(j).mo6877a((C1591g<TResult, TContinuationResult>) new C10548e<TResult,TContinuationResult>(this), C1592h.f5958b, this.f28274b.mo6870b());
            }
        }
    }

    public C10543d(C10583o oVar, C10403b bVar, C10491c cVar, String str, C10334a aVar, C10487a aVar2, C10375f fVar, List<C10613q> list, List<Object> list2, List<C10504h> list3, List<C10578j> list4, C10503g gVar, C10545b bVar2, boolean z) {
        C7573i.m23587b(oVar, "instance");
        C7573i.m23587b(bVar, "providerFactory");
        C7573i.m23587b(cVar, "params");
        C7573i.m23587b(str, "sessionId");
        C7573i.m23587b(list, "sourceUrlSettings");
        C7573i.m23587b(list2, "pageLifeCycleDelegates");
        C7573i.m23587b(list3, "exportReactPackageDelegates");
        C7573i.m23587b(list4, "reactPackageDelegates");
        C7573i.m23587b(bVar2, "callback");
        this.f28276d = oVar;
        this.f28277e = bVar;
        this.f28278f = cVar;
        this.f28279g = str;
        this.f28280h = aVar;
        this.f28281i = aVar2;
        this.f28282j = fVar;
        this.f28288r = list;
        this.f28283k = list2;
        this.f28284l = list3;
        this.f28285m = list4;
        this.f28286n = gVar;
        this.f28289s = bVar2;
        this.f28290t = z;
    }
}
