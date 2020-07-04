package com.bytedance.ies.bullet.kit.p261rn;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.bytedance.ies.bullet.core.C10336c;
import com.bytedance.ies.bullet.core.kit.BulletKitType;
import com.bytedance.ies.bullet.core.kit.C10379d;
import com.bytedance.ies.bullet.core.kit.C10386k;
import com.bytedance.ies.bullet.core.kit.C10400u;
import com.bytedance.ies.bullet.core.kit.KitNotMatchException;
import com.bytedance.ies.bullet.core.kit.bridge.C10375f;
import com.bytedance.ies.bullet.core.kit.bridge.C10377h;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.monitor.C10420a;
import com.bytedance.ies.bullet.core.monitor.C10425c;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import com.bytedance.ies.bullet.core.params.C10471n;
import com.bytedance.ies.bullet.kit.p261rn.internal.C10543d;
import com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.C10545b;
import com.bytedance.ies.bullet.kit.p261rn.p544a.C10487a;
import com.bytedance.ies.bullet.kit.p261rn.p545b.C10491c;
import com.bytedance.ies.bullet.kit.p261rn.p546c.C10494b;
import com.bytedance.ies.bullet.kit.p261rn.p546c.C10496c;
import com.bytedance.ies.bullet.p551ui.common.C10675a;
import com.bytedance.ies.bullet.p551ui.common.C10689d;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10680b;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10682c;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.rn.o */
public final class C10583o extends C10680b<ReactRootView> {

    /* renamed from: i */
    public static final C10584a f28340i = new C10584a(null);

    /* renamed from: c */
    public final List<C10613q> f28341c = new ArrayList();

    /* renamed from: d */
    public final List<C10504h> f28342d = new ArrayList();

    /* renamed from: e */
    public final List<Object> f28343e = new ArrayList();

    /* renamed from: f */
    public final List<C10578j> f28344f = new ArrayList();

    /* renamed from: g */
    public C10503g f28345g;

    /* renamed from: h */
    public ReactInstanceManager f28346h;

    /* renamed from: j */
    private final BulletKitType f28347j = BulletKitType.RN;

    /* renamed from: k */
    private final C10585b f28348k = new C10585b(this);

    /* renamed from: com.bytedance.ies.bullet.kit.rn.o$a */
    public static final class C10584a {
        private C10584a() {
        }

        public /* synthetic */ C10584a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.o$b */
    public static final class C10585b extends C10675a {

        /* renamed from: a */
        final /* synthetic */ C10583o f28349a;

        C10585b(C10583o oVar) {
            this.f28349a = oVar;
        }

        /* renamed from: b */
        public final void mo25091b(Activity activity) {
            C7573i.m23587b(activity, "activity");
            ReactInstanceManager reactInstanceManager = this.f28349a.f28346h;
            if (reactInstanceManager != null) {
                reactInstanceManager.onHostResume(activity);
            }
        }

        /* renamed from: c */
        public final void mo25093c(Activity activity) {
            C7573i.m23587b(activity, "activity");
            ReactInstanceManager reactInstanceManager = this.f28349a.f28346h;
            if (reactInstanceManager != null) {
                reactInstanceManager.onHostPause(activity);
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.o$c */
    public static final class C10586c implements C10545b {

        /* renamed from: a */
        final /* synthetic */ C10583o f28350a;

        /* renamed from: b */
        final /* synthetic */ C7562b f28351b;

        /* renamed from: c */
        final /* synthetic */ Uri f28352c;

        /* renamed from: d */
        final /* synthetic */ C7562b f28353d;

        /* renamed from: a */
        public final void mo25337a(C10543d dVar, Exception exc) {
            C7573i.m23587b(dVar, "builder");
            C7573i.m23587b(exc, "e");
            this.f28353d.invoke(exc);
        }

        /* renamed from: a */
        public final void mo25336a(C10543d dVar, ReactInstanceManager reactInstanceManager) {
            Activity activity;
            C7573i.m23587b(dVar, "builder");
            C7573i.m23587b(reactInstanceManager, "manager");
            C10583o oVar = this.f28350a;
            C10689d v = this.f28350a.mo25556v();
            if (v != null) {
                activity = v.mo25551a();
            } else {
                activity = null;
            }
            reactInstanceManager.onHostResume(activity);
            oVar.f28346h = reactInstanceManager;
            this.f28351b.invoke(this.f28352c);
            if (!this.f28350a.mo25365s().mo25283b()) {
                dVar.mo25328a();
            }
        }

        C10586c(C10583o oVar, C7562b bVar, Uri uri, C7562b bVar2) {
            this.f28350a = oVar;
            this.f28351b = bVar;
            this.f28352c = uri;
            this.f28353d = bVar2;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.o$d */
    static final class C10587d extends Lambda implements C7562b<C10580l, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10583o f28354a;

        C10587d(C10583o oVar) {
            this.f28354a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30995a((C10580l) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30995a(C10580l lVar) {
            C7573i.m23587b(lVar, "$receiver");
            this.f28354a.f28342d.add(lVar.mo25361a());
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.o$e */
    static final class C10588e extends Lambda implements C7562b<C10582n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10583o f28355a;

        C10588e(C10583o oVar) {
            this.f28355a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30996a((C10582n) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30996a(C10582n nVar) {
            C7573i.m23587b(nVar, "$receiver");
            this.f28355a.f28341c.add(nVar.mo25051a());
        }
    }

    /* renamed from: a */
    public final void mo25363a(C10682c<ReactRootView> cVar) {
        C7573i.m23587b(cVar, "viewComponent");
    }

    /* renamed from: c */
    public final void mo25173c(List<String> list, C10336c cVar) {
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar, "newRegistryBundle");
    }

    /* renamed from: d */
    public final BulletKitType mo25162d() {
        return this.f28347j;
    }

    /* renamed from: t */
    private ReactContext m30979t() {
        ReactInstanceManager reactInstanceManager = this.f28346h;
        if (reactInstanceManager != null) {
            return reactInstanceManager.getCurrentReactContext();
        }
        return null;
    }

    /* renamed from: o */
    public final void mo25182o() {
        C10689d v = mo25556v();
        if (v != null) {
            v.mo25552a(this.f28348k);
        }
    }

    /* renamed from: s */
    public final C10491c mo25365s() {
        C10471n m = mo25180m();
        if (m == null) {
            C7573i.m23580a();
        }
        if (m != null) {
            return (C10491c) m;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.param.RnKitParamsBundle");
    }

    /* renamed from: p */
    public final void mo25183p() {
        Activity activity;
        C10689d v = mo25556v();
        if (v != null) {
            v.mo25553b(this.f28348k);
        }
        ReactInstanceManager reactInstanceManager = this.f28346h;
        if (reactInstanceManager != null) {
            C10689d v2 = mo25556v();
            if (v2 != null) {
                activity = v2.mo25551a();
            } else {
                activity = null;
            }
            reactInstanceManager.onHostDestroy(activity);
            reactInstanceManager.deleteJSBundleFile();
            for (C10682c cVar : mo25555u()) {
                reactInstanceManager.detachRootView((ReactRootView) cVar.f28561a);
            }
        }
    }

    public final void onEvent(C10377h hVar) {
        C7573i.m23587b(hVar, "event");
        JSONObject b = hVar.mo25152b();
        if (b != null) {
            C10496c.m30891a(m30979t(), hVar.mo25151a(), C10494b.m30888a(b));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r3 == false) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25364a(kotlin.jvm.p357a.C7562b<? super java.util.List<com.bytedance.ies.bullet.p551ui.common.p553b.C10682c<com.facebook.react.ReactRootView>>, kotlin.C7581n> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            com.bytedance.ies.bullet.core.model.a.b r0 = r4.mo25185r()
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r0 = r0.mo25202b(r1)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0034
            com.facebook.react.ReactInstanceManager r3 = r4.f28346h
            if (r3 == 0) goto L_0x0034
            com.bytedance.ies.bullet.kit.rn.b.c r3 = r4.mo25365s()
            com.bytedance.ies.bullet.core.params.f<java.lang.String> r3 = r3.f28223d
            java.lang.Object r3 = r3.mo25251b()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0030
            int r3 = r3.length()
            if (r3 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r3 = 0
            goto L_0x0031
        L_0x0030:
            r3 = 1
        L_0x0031:
            if (r3 != 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r1 == 0) goto L_0x004c
            com.facebook.react.ReactRootView r1 = new com.facebook.react.ReactRootView
            r1.<init>(r0)
            com.bytedance.ies.bullet.ui.common.b.c r0 = new com.bytedance.ies.bullet.ui.common.b.c
            android.view.View r1 = (android.view.View) r1
            r2 = 2
            r3 = 0
            r0.<init>(r1, r3, r2, r3)
            java.util.List r0 = kotlin.collections.C7525m.m23457a(r0)
            r5.invoke(r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p261rn.C10583o.mo25364a(kotlin.jvm.a.b):void");
    }

    /* renamed from: b */
    public final void mo25170b(Uri uri) {
        C7573i.m23587b(uri, "input");
        for (C10682c cVar : mo25555u()) {
            cVar.mo25557a(uri);
            ReactRootView reactRootView = (ReactRootView) cVar.f28561a;
            ReactInstanceManager reactInstanceManager = this.f28346h;
            String str = (String) mo25365s().f28223d.mo25251b();
            Bundle bundle = new Bundle();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C7573i.m23582a((Object) queryParameterNames, "input.queryParameterNames");
            for (String str2 : queryParameterNames) {
                bundle.putString(str2, uri.getQueryParameter(str2));
            }
            bundle.putString("reactId", mo25158a().f28131a);
            reactRootView.startReactApplication(reactInstanceManager, str, bundle);
            cVar.mo25560b(uri);
        }
    }

    /* renamed from: a */
    public final C10420a mo25167a(Uri uri, Uri uri2) {
        C7573i.m23587b(uri, "uri");
        C10403b bVar = new C10403b();
        bVar.mo25201a(C10425c.class, mo25179l());
        bVar.mo25203b(Uri.class, uri2);
        return new C10487a(uri, bVar);
    }

    /* renamed from: b */
    public final void mo25172b(List<String> list, C10336c cVar) {
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar, "kitPackageRegistryBundle");
        super.mo25172b(list, cVar);
        this.f28341c.clear();
        C7562b eVar = new C10588e(this);
        for (C10386k kVar : mo25176i()) {
            if (kVar != null) {
                eVar.invoke((C10582n) kVar);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.IRnKitSettingsProvider");
            }
        }
        C10386k g = mo25174g();
        if (g != null) {
            if (g != null) {
                C10582n nVar = (C10582n) g;
                if (nVar != null) {
                    eVar.invoke(nVar);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.IRnKitSettingsProvider");
            }
        }
        this.f28342d.clear();
        this.f28343e.clear();
        this.f28344f.clear();
        C7562b dVar = new C10587d(this);
        for (C10379d dVar2 : mo25177j()) {
            if (dVar2 != null) {
                dVar.invoke((C10580l) dVar2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.IRnKitDelegatesProvider");
            }
        }
        C10379d h = mo25175h();
        if (h != null) {
            if (h != null) {
                C10580l lVar = (C10580l) h;
                if (lVar != null) {
                    dVar.invoke(lVar);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.IRnKitDelegatesProvider");
            }
        }
    }

    /* renamed from: b */
    public final void mo25171b(Uri uri, C7562b<? super Uri, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        C10487a aVar;
        Editor editor;
        Uri uri2 = uri;
        C7562b<? super Uri, C7581n> bVar3 = bVar;
        C7562b<? super Throwable, C7581n> bVar4 = bVar2;
        C7573i.m23587b(uri2, "input");
        C7573i.m23587b(bVar3, "resolve");
        C7573i.m23587b(bVar4, "reject");
        if (C7573i.m23585a((Object) (Boolean) mo25365s().f28224e.mo25251b(), (Object) Boolean.valueOf(true))) {
            KitNotMatchException kitNotMatchException = new KitNotMatchException(mo25184q(), uri, null, 4, null);
            bVar4.invoke(kitNotMatchException);
            return;
        }
        String str = (String) mo25365s().f28226g.mo25251b();
        if (str != null) {
            if (!(!C7634n.m23713a(str))) {
                str = null;
            }
            if (str != null) {
                C10689d v = mo25556v();
                if (v != null) {
                    Activity a = v.mo25551a();
                    if (a != null) {
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(a);
                        if (defaultSharedPreferences != null) {
                            editor = defaultSharedPreferences.edit();
                        } else {
                            editor = null;
                        }
                        if (editor != null) {
                            editor.putString("debug_http_host", str);
                            if (editor != null) {
                                editor.apply();
                            }
                        }
                    }
                }
            }
        }
        C10586c cVar = new C10586c(this, bVar3, uri2, bVar4);
        C10403b r = mo25185r();
        C10491c s = mo25365s();
        String str2 = mo25158a().f28131a;
        C10334a k = mo25178k();
        C10420a n = mo25181n();
        if (n == null) {
            aVar = null;
        } else if (n != null) {
            aVar = (C10487a) n;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.monitor.RnKitMonitorSession");
        }
        C10375f c = mo25161c();
        List<C10613q> list = this.f28341c;
        C10503g gVar = this.f28345g;
        List<Object> list2 = this.f28343e;
        List<C10504h> list3 = this.f28342d;
        C10491c cVar2 = s;
        String str3 = str2;
        C10334a aVar2 = k;
        C10543d dVar = r0;
        C10487a aVar3 = aVar;
        C10543d dVar2 = dVar;
        C10375f fVar = c;
        C10543d dVar3 = dVar2;
        List<C10613q> list4 = list;
        C10543d dVar4 = dVar3;
        List<Object> list5 = list2;
        C10543d dVar5 = dVar4;
        List<C10504h> list6 = list3;
        C10543d dVar6 = dVar5;
        List<C10578j> list7 = this.f28344f;
        C10543d dVar7 = dVar6;
        C10543d dVar8 = new C10543d(this, r, cVar2, str3, aVar2, aVar3, fVar, list4, list5, list6, list7, gVar, cVar, !mo25365s().mo25283b());
        dVar7.mo25329a(0);
    }

    public C10583o(RnKitApi rnKitApi, C10400u uVar, List<String> list, C10336c cVar, C10403b bVar) {
        C7573i.m23587b(rnKitApi, "kitApi");
        C7573i.m23587b(uVar, "sessionInfo");
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar, "kitPackageRegistryBundle");
        C7573i.m23587b(bVar, "providerFactory");
        super(rnKitApi, uVar, list, cVar, bVar);
    }
}
