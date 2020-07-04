package com.p280ss.android.ugc.aweme.framework;

import android.app.Application;
import android.text.TextUtils;
import com.airbnb.android.react.lottie.C1658a;
import com.brentvatne.react.C2017a;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.RNDegradeExceptionHandler;
import com.facebook.react.bridge.RNJavaScriptRuntime.SplitCommonType;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainPackageConfig.Builder;
import com.facebook.react.shell.MainReactPackage;
import com.p280ss.android.ugc.aweme.animation.C22553b;
import com.p280ss.android.ugc.aweme.fastimage.C21727a;
import com.p280ss.android.ugc.aweme.framework.p1273b.C29950a;
import com.p280ss.android.ugc.aweme.iconfont.C30543a;
import com.p280ss.android.ugc.aweme.lineargradient.C32417a;
import com.p280ss.android.ugc.aweme.viewshot.C43389b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.framework.a */
public class C29943a extends ReactNativeHost implements NativeModuleCallExceptionHandler {

    /* renamed from: a */
    public Map<String, Object> f78723a;

    /* renamed from: b */
    public RNDegradeExceptionHandler f78724b;

    /* renamed from: c */
    public String f78725c = "";

    /* renamed from: d */
    private C29950a f78726d = ReactInstance.getConfig();

    public boolean getUseDeveloperSupport() {
        return false;
    }

    /* renamed from: a */
    private LifecycleState m98174a() {
        return this.f78726d.mo76110g();
    }

    public String getBundleAssetName() {
        return this.f78726d.mo76111h();
    }

    public RNDegradeExceptionHandler getDegradeExceptionHandler() {
        return new RNDegradeExceptionHandler() {
            public final void onDegrade(Exception exc) {
                if (C29943a.this.f78724b != null) {
                    C29943a.this.f78724b.onDegrade(exc);
                }
            }
        };
    }

    public String getJSMainModuleName() {
        return this.f78726d.mo76112i();
    }

    /* renamed from: b */
    private static String m98175b() {
        return ReactInstance.getProxy().mo67301b();
    }

    public String getJSBundleFile() {
        return ReactInstance.getProxy().mo67298a();
    }

    public ReactInstanceManager createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        ReactInstanceManagerBuilder degradeExceptionHandler = ReactInstanceManager.builder().setApplication(getApplication()).setJSMainModulePath(getJSMainModuleName()).setUseDeveloperSupport(getUseDeveloperSupport()).setRedBoxHandler(getRedBoxHandler()).setJavaScriptExecutorFactory(getJavaScriptExecutorFactory()).setUIImplementationProvider(getUIImplementationProvider()).setJSIModulesProvider(getJSIModulesProvider()).setNativeModuleCallExceptionHandler(this).setInitialLifecycleState(m98174a()).setDegradeExceptionHandler(getDegradeExceptionHandler());
        for (ReactPackage addPackage : getPackages()) {
            degradeExceptionHandler.addPackage(addPackage);
        }
        String b = m98175b();
        String jSBundleFile = getJSBundleFile();
        if (this.f78726d == null || !this.f78726d.mo67294c()) {
            if (!TextUtils.isEmpty(jSBundleFile)) {
                degradeExceptionHandler.setSplitCommonBundleFile(jSBundleFile, SplitCommonType.SPLIT_COMMONJS);
            } else {
                degradeExceptionHandler.setSplitCommonType(SplitCommonType.SPLIT_COMMONJS);
            }
        } else if (!TextUtils.isEmpty(b)) {
            degradeExceptionHandler.setSplitCommonBundleFile(b, SplitCommonType.SPLIT_SNAPSHOT);
        } else if (!TextUtils.isEmpty(jSBundleFile)) {
            degradeExceptionHandler.setSplitCommonBundleFile(jSBundleFile, SplitCommonType.SPLIT_COMMONJS);
        } else {
            degradeExceptionHandler.setSplitCommonType(SplitCommonType.SPLIT_SNAPSHOT);
        }
        ReactInstanceManager prebuild = degradeExceptionHandler.prebuild();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return prebuild;
    }

    public List<ReactPackage> getPackages() {
        Builder builder = new Builder();
        builder.setFrescoConfig(this.f78726d.mo76109f());
        ArrayList arrayList = new ArrayList(Arrays.asList(new ReactPackage[]{new C32417a(), new MainReactPackage(builder.build()), new C29955c(), new C30543a(), new C22553b(), new C1658a(), new C2017a(), new C21727a("FrescoFastImage"), new C43389b()}));
        if (this.f78726d.mo67289a() != null && this.f78726d.mo67289a().size() > 0) {
            arrayList.addAll(this.f78726d.mo67289a());
        }
        return arrayList;
    }

    public C29943a(Application application) {
        super(application);
    }

    public void handleException(Exception exc) {
        ReactInstance.getProxy().mo67300a(exc, this.f78723a);
    }
}
