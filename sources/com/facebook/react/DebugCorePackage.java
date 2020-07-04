package com.facebook.react;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.JSCSamplingProfiler;
import com.facebook.react.devsupport.JSDevSupport;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.ArrayList;
import java.util.List;
import javax.p1876a.C47883a;

class DebugCorePackage extends LazyReactPackage {
    DebugCorePackage() {
    }

    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return LazyReactPackage.getReactModuleInfoProviderViaReflection(this);
    }

    public List<ModuleSpec> getNativeModules(final ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCHeapCapture.class, new C47883a<NativeModule>() {
            public NativeModule get() {
                return new JSCHeapCapture(reactApplicationContext);
            }
        }));
        arrayList.add(ModuleSpec.nativeModuleSpec(JSDevSupport.class, new C47883a<NativeModule>() {
            public NativeModule get() {
                return new JSDevSupport(reactApplicationContext);
            }
        }));
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCSamplingProfiler.class, new C47883a<NativeModule>() {
            public NativeModule get() {
                return new JSCSamplingProfiler(reactApplicationContext);
            }
        }));
        return arrayList;
    }
}
