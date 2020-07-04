package com.facebook.react;

import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NativeModuleRegistryBuilder {
    private final List<Class<? extends NativeModule>> mCoreModules = new ArrayList();
    private final boolean mLazyNativeModulesEnabled;
    private final Map<Class<? extends NativeModule>, ModuleHolder> mModules = new HashMap();
    private final ReactApplicationContext mReactApplicationContext;
    private final ReactInstanceManager mReactInstanceManager;
    private final Map<String, Class<? extends NativeModule>> namesToType = new HashMap();

    public NativeModuleRegistry build() {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.mModules.entrySet()) {
            if (OnBatchCompleteListener.class.isAssignableFrom((Class) entry.getKey())) {
                arrayList.add(entry.getValue());
            }
        }
        return new NativeModuleRegistry(this.mReactApplicationContext, this.mModules, this.mCoreModules, arrayList);
    }

    public void addNativeModule(NativeModule nativeModule) {
        String name = nativeModule.getName();
        Class cls = nativeModule.getClass();
        if (this.namesToType.containsKey(name)) {
            Class cls2 = (Class) this.namesToType.get(name);
            if (nativeModule.canOverrideExistingModule()) {
                this.mModules.remove(cls2);
            } else {
                StringBuilder sb = new StringBuilder("Native module ");
                sb.append(cls.getSimpleName());
                sb.append(" tried to override ");
                sb.append(cls2.getSimpleName());
                sb.append(" for module name ");
                sb.append(name);
                sb.append(". If this was your intention, set canOverrideExistingModule=true");
                throw new IllegalStateException(sb.toString());
            }
        }
        this.namesToType.put(name, cls);
        this.mModules.put(cls, new ModuleHolder(nativeModule));
    }

    /* JADX INFO: finally extract failed */
    public void processPackage(ReactPackage reactPackage) {
        List<NativeModule> list;
        ModuleHolder moduleHolder;
        if (!this.mLazyNativeModulesEnabled) {
            StringBuilder sb = new StringBuilder();
            sb.append(reactPackage.getClass().getSimpleName());
            sb.append(" is not a LazyReactPackage, falling back to old version.");
            C13286a.m38842a("ReactNative", sb.toString());
            if (reactPackage instanceof ReactInstancePackage) {
                list = ((ReactInstancePackage) reactPackage).createNativeModules(this.mReactApplicationContext, this.mReactInstanceManager);
            } else {
                list = reactPackage.createNativeModules(this.mReactApplicationContext);
            }
            for (NativeModule addNativeModule : list) {
                addNativeModule(addNativeModule);
            }
        } else if (reactPackage instanceof LazyReactPackage) {
            LazyReactPackage lazyReactPackage = (LazyReactPackage) reactPackage;
            List<ModuleSpec> nativeModules = lazyReactPackage.getNativeModules(this.mReactApplicationContext);
            Map reactModuleInfos = lazyReactPackage.getReactModuleInfoProvider().getReactModuleInfos();
            for (ModuleSpec moduleSpec : nativeModules) {
                Class type = moduleSpec.getType();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) reactModuleInfos.get(type);
                if (reactModuleInfo != null) {
                    moduleHolder = new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
                } else if (!BaseJavaModule.class.isAssignableFrom(type)) {
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getType().getName());
                    try {
                        NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        moduleHolder = new ModuleHolder(nativeModule);
                    } catch (Throwable th) {
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        throw th;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Native Java module ");
                    sb2.append(type.getSimpleName());
                    sb2.append(" should be annotated with @ReactModule and added to a @ReactModuleList.");
                    throw new IllegalStateException(sb2.toString());
                }
                String name = moduleHolder.getName();
                if (this.namesToType.containsKey(name)) {
                    Class cls = (Class) this.namesToType.get(name);
                    if (moduleHolder.getCanOverrideExistingModule()) {
                        this.mModules.remove(cls);
                    } else {
                        StringBuilder sb3 = new StringBuilder("Native module ");
                        sb3.append(type.getSimpleName());
                        sb3.append(" tried to override ");
                        sb3.append(cls.getSimpleName());
                        sb3.append(" for module name ");
                        sb3.append(name);
                        sb3.append(". If this was your intention, set canOverrideExistingModule=true");
                        throw new IllegalStateException(sb3.toString());
                    }
                }
                this.namesToType.put(name, type);
                this.mModules.put(type, moduleHolder);
            }
        } else {
            throw new IllegalStateException("Lazy native modules requires all ReactPackage to inherit from LazyReactPackage");
        }
    }

    public void addCorePackages(List<LazyReactPackage> list, ReactApplicationContext reactApplicationContext) {
        for (LazyReactPackage nativeModules : list) {
            for (ModuleSpec type : nativeModules.getNativeModules(reactApplicationContext)) {
                this.mCoreModules.add(type.getType());
            }
        }
    }

    public NativeModuleRegistryBuilder(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager, boolean z) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mReactInstanceManager = reactInstanceManager;
        this.mLazyNativeModulesEnabled = z;
    }
}
