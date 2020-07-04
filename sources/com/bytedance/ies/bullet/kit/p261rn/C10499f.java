package com.bytedance.ies.bullet.kit.p261rn;

import android.app.Application;
import android.text.TextUtils;
import com.airbnb.android.react.lottie.C1658a;
import com.brentvatne.react.C2017a;
import com.bytedance.ies.bullet.core.common.YieldError;
import com.bytedance.ies.bullet.core.kit.bridge.C10375f;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.kit.p261rn.internal.C10538a;
import com.bytedance.ies.bullet.kit.p261rn.internal.C10540b;
import com.bytedance.ies.bullet.kit.p261rn.internal.wrapper.C10564a;
import com.bytedance.ies.bullet.kit.p261rn.internal.wrapper.NativeModuleWrapper.C10561a;
import com.bytedance.ies.bullet.kit.p261rn.internal.wrapper.SimpleViewManagerWrapper.C10563a;
import com.bytedance.ies.bullet.kit.p261rn.pkg.animation.C10593b;
import com.bytedance.ies.bullet.kit.p261rn.pkg.fastimage.C10599a;
import com.bytedance.ies.bullet.kit.p261rn.pkg.iconfont.C10604a;
import com.bytedance.ies.bullet.kit.p261rn.pkg.lineargradient.C10605a;
import com.bytedance.ies.bullet.kit.p261rn.pkg.viewshot.C10610b;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.RNDegradeExceptionHandler;
import com.facebook.react.bridge.RNJavaScriptRuntime.SplitCommonType;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainPackageConfig.Builder;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.uimanager.ViewManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.rn.f */
public final class C10499f extends ReactNativeHost {

    /* renamed from: a */
    public RNDegradeExceptionHandler f28233a;

    /* renamed from: b */
    public boolean f28234b;

    /* renamed from: c */
    public final C10583o f28235c;

    /* renamed from: d */
    public final C10403b f28236d;

    /* renamed from: e */
    public final C10375f f28237e;

    /* renamed from: f */
    public final List<Object> f28238f;

    /* renamed from: g */
    public final List<C10504h> f28239g;

    /* renamed from: h */
    public final List<C10578j> f28240h;

    /* renamed from: i */
    public C10503g f28241i;

    /* renamed from: j */
    public final File f28242j;

    /* renamed from: k */
    public final File f28243k;

    /* renamed from: l */
    private Map<String, ? extends Object> f28244l;

    /* renamed from: m */
    private String f28245m = "";

    /* renamed from: com.bytedance.ies.bullet.kit.rn.f$a */
    static final class C10500a implements NativeModuleCallExceptionHandler {

        /* renamed from: a */
        private final WeakReference<C10583o> f28246a;

        /* renamed from: b */
        private final List<Object> f28247b;

        public final void handleException(Exception exc) {
            C10583o oVar = (C10583o) this.f28246a.get();
            if (oVar != null) {
                Iterator it = C7525m.m23516h((Iterable<? extends T>) this.f28247b).iterator();
                while (it.hasNext()) {
                    it.next();
                    try {
                        C7573i.m23582a((Object) oVar, "instance");
                        new C10589p(oVar);
                        if (exc == null) {
                            new RuntimeException();
                        }
                    } catch (YieldError unused) {
                    }
                }
            }
        }

        public C10500a(C10583o oVar, List<Object> list) {
            C7573i.m23587b(oVar, "instance");
            C7573i.m23587b(list, "pageLifeCycleDelegates");
            this.f28247b = list;
            this.f28246a = new WeakReference<>(oVar);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.f$b */
    static final class C10501b implements RNDegradeExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ C10499f f28248a;

        C10501b(C10499f fVar) {
            this.f28248a = fVar;
        }

        public final void onDegrade(Exception exc) {
            RNDegradeExceptionHandler rNDegradeExceptionHandler = this.f28248a.f28233a;
            if (rNDegradeExceptionHandler != null) {
                rNDegradeExceptionHandler.onDegrade(exc);
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.f$c */
    public static final class C10502c implements ReactPackage {

        /* renamed from: a */
        final /* synthetic */ C10497d f28249a;

        C10502c(C10497d dVar) {
            this.f28249a = dVar;
        }

        public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
            C7573i.m23587b(reactApplicationContext, "reactContext");
            Iterable<C10488b> a = this.f28249a.mo25285a(new C10564a(reactApplicationContext));
            Collection arrayList = new ArrayList(C7525m.m23469a(a, 10));
            for (C10488b a2 : a) {
                arrayList.add(C10561a.m30942a(a2));
            }
            return (List) arrayList;
        }

        public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
            C7573i.m23587b(reactApplicationContext, "reactContext");
            Iterable<C10498e> b = this.f28249a.mo25286b(new C10564a(reactApplicationContext));
            Collection arrayList = new ArrayList(C7525m.m23469a(b, 10));
            for (C10498e eVar : b) {
                if (eVar != null) {
                    arrayList.add(C10563a.m30945a(eVar));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.BulletSimpleViewManager<android.view.View>");
                }
            }
            return (List) arrayList;
        }
    }

    public final String getBundleAssetName() {
        return "index.android.jsbundle";
    }

    public final String getJSMainModuleName() {
        return "index";
    }

    public final boolean getUseDeveloperSupport() {
        return this.f28234b;
    }

    public final RNDegradeExceptionHandler getDegradeExceptionHandler() {
        return new C10501b(this);
    }

    /* renamed from: a */
    private String m30900a() {
        File file = this.f28243k;
        if (file != null) {
            return C10538a.m30911a(file, "blobdata");
        }
        return null;
    }

    public final String getJSBundleFile() {
        File file = this.f28242j;
        if (file != null) {
            return C10538a.m30911a(file, null);
        }
        return null;
    }

    public final ReactInstanceManager createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        ReactInstanceManagerBuilder degradeExceptionHandler = ReactInstanceManager.builder().setApplication(getApplication()).setJSMainModulePath(getJSMainModuleName()).setUseDeveloperSupport(this.f28234b).setRedBoxHandler(getRedBoxHandler()).setJavaScriptExecutorFactory(getJavaScriptExecutorFactory()).setUIImplementationProvider(getUIImplementationProvider()).setJSIModulesProvider(getJSIModulesProvider()).setNativeModuleCallExceptionHandler(new C10500a(this.f28235c, this.f28238f)).setInitialLifecycleState(LifecycleState.RESUMED).setDegradeExceptionHandler(getDegradeExceptionHandler());
        for (ReactPackage addPackage : getPackages()) {
            degradeExceptionHandler.addPackage(addPackage);
        }
        String a = m30900a();
        String jSBundleFile = getJSBundleFile();
        if (!TextUtils.isEmpty(a)) {
            degradeExceptionHandler.setSplitCommonBundleFile(a, SplitCommonType.SPLIT_SNAPSHOT);
        } else if (!TextUtils.isEmpty(jSBundleFile)) {
            degradeExceptionHandler.setSplitCommonBundleFile(jSBundleFile, SplitCommonType.SPLIT_COMMONJS);
        } else {
            degradeExceptionHandler.setSplitCommonType(SplitCommonType.SPLIT_SNAPSHOT);
        }
        ReactInstanceManager prebuild = degradeExceptionHandler.prebuild();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        C7573i.m23582a((Object) prebuild, "reactInstanceManager");
        return prebuild;
    }

    public final List<ReactPackage> getPackages() {
        Builder builder = new Builder();
        C10503g gVar = this.f28241i;
        if (gVar != null) {
            builder.setFrescoConfig(gVar.f28250a);
        }
        MainReactPackage mainReactPackage = new MainReactPackage(builder.build());
        List<ReactPackage> arrayList = new ArrayList<>();
        Iterable<C10578j> iterable = this.f28240h;
        Collection arrayList2 = new ArrayList();
        for (C10578j a : iterable) {
            Iterable<C10497d> a2 = a.mo25360a(new C10589p(this.f28235c), this.f28236d);
            Collection arrayList3 = new ArrayList(C7525m.m23469a(a2, 10));
            for (C10497d cVar : a2) {
                arrayList3.add(new C10502c(cVar));
            }
            C7525m.m23478a(arrayList2, (Iterable<? extends T>) (List) arrayList3);
        }
        arrayList.addAll((List) arrayList2);
        arrayList.add(new C10605a());
        arrayList.add(new C10604a());
        arrayList.add(new C10593b());
        arrayList.add(new C1658a());
        arrayList.add(new C2017a());
        arrayList.add(new C10599a());
        arrayList.add(new C10610b());
        arrayList.add(mainReactPackage);
        arrayList.add(new C10540b(this.f28235c, this.f28237e, this.f28239g, this.f28236d));
        return arrayList;
    }

    /* renamed from: a */
    public final void mo25289a(RNDegradeExceptionHandler rNDegradeExceptionHandler) {
        C7573i.m23587b(rNDegradeExceptionHandler, "handler");
        this.f28233a = rNDegradeExceptionHandler;
    }

    /* renamed from: a */
    public final void mo25290a(String str) {
        C7573i.m23587b(str, "sessionId");
        this.f28245m = str;
    }

    /* renamed from: a */
    public final void mo25291a(Map<String, ? extends Object> map) {
        C7573i.m23587b(map, "extraParams");
        this.f28244l = map;
    }

    public C10499f(C10583o oVar, C10403b bVar, C10375f fVar, List<Object> list, List<C10504h> list2, List<C10578j> list3, C10503g gVar, File file, File file2) {
        C7573i.m23587b(oVar, "instance");
        C7573i.m23587b(bVar, "providerFactory");
        C7573i.m23587b(list, "pageLifeCycleDelegates");
        C7573i.m23587b(list2, "exportReactPackageDelegates");
        C7573i.m23587b(list3, "reactPackageDelegates");
        super((Application) bVar.mo25202b(Application.class));
        this.f28235c = oVar;
        this.f28236d = bVar;
        this.f28237e = fVar;
        this.f28238f = list;
        this.f28239g = list2;
        this.f28240h = list3;
        this.f28241i = gVar;
        this.f28242j = file;
        this.f28243k = file2;
    }
}
