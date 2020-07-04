package com.facebook.react;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class LazyReactPackage implements ReactPackage {
    public abstract List<ModuleSpec> getNativeModules(ReactApplicationContext reactApplicationContext);

    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec provider : viewManagers) {
            arrayList.add((ViewManager) provider.getProvider().get());
        }
        return arrayList;
    }

    public static ReactModuleInfoProvider getReactModuleInfoProviderViaReflection(LazyReactPackage lazyReactPackage) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(lazyReactPackage.getClass().getCanonicalName());
            sb.append("$$ReactModuleInfoProvider");
            Class cls = Class.forName(sb.toString());
            if (cls != null) {
                try {
                    return (ReactModuleInfoProvider) cls.newInstance();
                } catch (InstantiationException e) {
                    StringBuilder sb2 = new StringBuilder("Unable to instantiate ReactModuleInfoProvider for ");
                    sb2.append(lazyReactPackage.getClass());
                    throw new RuntimeException(sb2.toString(), e);
                } catch (IllegalAccessException e2) {
                    StringBuilder sb3 = new StringBuilder("Unable to instantiate ReactModuleInfoProvider for ");
                    sb3.append(lazyReactPackage.getClass());
                    throw new RuntimeException(sb3.toString(), e2);
                }
            } else {
                StringBuilder sb4 = new StringBuilder("ReactModuleInfoProvider class for ");
                sb4.append(lazyReactPackage.getClass().getCanonicalName());
                sb4.append(" not found.");
                throw new RuntimeException(sb4.toString());
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: finally extract failed */
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : getNativeModules(reactApplicationContext)) {
            moduleSpec.getType();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getType().getSimpleName());
            try {
                NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                throw th;
            }
        }
        return arrayList;
    }
}
