package com.facebook.react.bridge;

import com.facebook.infer.p728a.C13854a;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NativeModuleRegistry {
    private final ArrayList<ModuleHolder> mBatchCompleteListenerModules;
    private final List<Class<? extends NativeModule>> mCoreModules;
    private final Map<Class<? extends NativeModule>, ModuleHolder> mModules;
    private final ReactApplicationContext mReactApplicationContext;

    private ArrayList<ModuleHolder> getBatchCompleteListenerModules() {
        return this.mBatchCompleteListenerModules;
    }

    private Map<Class<? extends NativeModule>, ModuleHolder> getModuleMap() {
        return this.mModules;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    public List<NativeModule> getAllModules() {
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder module : this.mModules.values()) {
            arrayList.add(module.getModule());
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public Collection<String> getCoreModules() {
        ArrayList arrayList = new ArrayList();
        for (Class cls : this.mCoreModules) {
            if (this.mModules.get(cls) != null) {
                arrayList.add(((ModuleHolder) this.mModules.get(cls)).getName());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public Collection<ModuleHolder> getCxxModules() {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.mModules.entrySet()) {
            if (CxxModuleWrapperBase.class.isAssignableFrom((Class) entry.getKey())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public void notifyJSInstanceDestroy() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread();
        Systrace.m42324a(0, "NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            for (ModuleHolder destroy : this.mModules.values()) {
                destroy.destroy();
            }
        } finally {
            Systrace.m42323a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void notifyJSInstanceInitialized() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        Systrace.m42324a(0, "NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            for (ModuleHolder markInitializable : this.mModules.values()) {
                markInitializable.markInitializable();
            }
        } finally {
            Systrace.m42323a(0);
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public void onBatchComplete() {
        Iterator it = this.mBatchCompleteListenerModules.iterator();
        while (it.hasNext()) {
            ModuleHolder moduleHolder = (ModuleHolder) it.next();
            if (moduleHolder.hasInstance()) {
                ((OnBatchCompleteListener) moduleHolder.getModule()).onBatchComplete();
            }
        }
    }

    public <T extends NativeModule> boolean hasModule(Class<T> cls) {
        return this.mModules.containsKey(cls);
    }

    public <T extends NativeModule> T getModule(Class<T> cls) {
        return ((ModuleHolder) C13854a.m40916b(this.mModules.get(cls))).getModule();
    }

    /* access modifiers changed from: 0000 */
    public Collection<JavaModuleWrapper> getJavaModules(JSInstance jSInstance) {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.mModules.entrySet()) {
            Class cls = (Class) entry.getKey();
            if (!CxxModuleWrapperBase.class.isAssignableFrom(cls)) {
                arrayList.add(new JavaModuleWrapper(jSInstance, cls, (ModuleHolder) entry.getValue()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public void registerModules(NativeModuleRegistry nativeModuleRegistry) {
        C13854a.m40915a(this.mReactApplicationContext.equals(nativeModuleRegistry.getReactApplicationContext()), "Extending native modules with non-matching application contexts.");
        Map moduleMap = nativeModuleRegistry.getModuleMap();
        ArrayList batchCompleteListenerModules = nativeModuleRegistry.getBatchCompleteListenerModules();
        for (Entry entry : moduleMap.entrySet()) {
            Class cls = (Class) entry.getKey();
            if (!this.mModules.containsKey(cls)) {
                ModuleHolder moduleHolder = (ModuleHolder) entry.getValue();
                if (batchCompleteListenerModules.contains(moduleHolder)) {
                    this.mBatchCompleteListenerModules.add(moduleHolder);
                }
                this.mModules.put(cls, moduleHolder);
            }
        }
    }

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<Class<? extends NativeModule>, ModuleHolder> map, List<Class<? extends NativeModule>> list, ArrayList<ModuleHolder> arrayList) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mModules = map;
        this.mBatchCompleteListenerModules = arrayList;
        this.mCoreModules = list;
    }
}
