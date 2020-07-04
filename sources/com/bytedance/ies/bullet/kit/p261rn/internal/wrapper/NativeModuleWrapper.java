package com.bytedance.ies.bullet.kit.p261rn.internal.wrapper;

import com.bytedance.ies.bullet.kit.p261rn.BulletMethod;
import com.bytedance.ies.bullet.kit.p261rn.C10488b;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.IDynamicJavaMethodsFactory;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModule.NativeMethod;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.wrapper.NativeModuleWrapper */
public final class NativeModuleWrapper extends BaseJavaModule implements IDynamicJavaMethodsFactory {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(NativeModuleWrapper.class), "dynamicMethodsTmp", "getDynamicMethodsTmp()Ljava/util/Map;"))};
    public static final C10561a Companion = new C10561a(null);
    public static List<String> DYNAMIC_METHODS = new ArrayList();
    public static Map<String, Method> DYNAMIC_METHODS_MAP = new LinkedHashMap();
    private final C7541d dynamicMethodsTmp$delegate;
    public final C10488b real;

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.wrapper.NativeModuleWrapper$a */
    public static final class C10561a {
        private C10561a() {
        }

        /* renamed from: a */
        public static Map<String, Method> m30943a() {
            return NativeModuleWrapper.DYNAMIC_METHODS_MAP;
        }

        public /* synthetic */ C10561a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static NativeModule m30942a(C10488b bVar) {
            C7573i.m23587b(bVar, "real");
            Method[] declaredMethods = bVar.getClass().getDeclaredMethods();
            C7573i.m23582a((Object) declaredMethods, "real.javaClass.declaredMethods");
            for (Method method : declaredMethods) {
                if (((BulletMethod) method.getAnnotation(BulletMethod.class)) != null) {
                    List<String> list = NativeModuleWrapper.DYNAMIC_METHODS;
                    C7573i.m23582a((Object) method, "method");
                    if (!list.contains(method.getName())) {
                        List<String> list2 = NativeModuleWrapper.DYNAMIC_METHODS;
                        String name = method.getName();
                        C7573i.m23582a((Object) name, "method.name");
                        list2.add(name);
                        Map a = m30943a();
                        String name2 = method.getName();
                        C7573i.m23582a((Object) name2, "method.name");
                        a.put(name2, method);
                    }
                }
            }
            return new NativeModuleWrapper(bVar, null);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.wrapper.NativeModuleWrapper$b */
    static final class C10562b extends Lambda implements C7561a<Map<String, NativeMethod>> {

        /* renamed from: a */
        final /* synthetic */ NativeModuleWrapper f28318a;

        C10562b(NativeModuleWrapper nativeModuleWrapper) {
            this.f28318a = nativeModuleWrapper;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Map<String, NativeMethod> invoke() {
            Map<String, NativeMethod> linkedHashMap = new LinkedHashMap<>();
            for (Entry entry : C10561a.m30943a().entrySet()) {
                linkedHashMap.put(entry.getKey(), new C10565b(this.f28318a.real, (Method) entry.getValue(), (String) entry.getKey()));
            }
            return linkedHashMap;
        }
    }

    private final Map<String, NativeMethod> getDynamicMethodsTmp() {
        return (Map) this.dynamicMethodsTmp$delegate.getValue();
    }

    public final Map<String, Object> getConstants() {
        return this.real.getConstants();
    }

    public final Map<String, NativeMethod> getDynamicMethods() {
        return getDynamicMethodsTmp();
    }

    public final String getName() {
        return this.real.getName();
    }

    public final boolean hasConstants() {
        return this.real.hasConstants();
    }

    public final void initialize() {
        this.real.initialize();
    }

    public final void onCatalystInstanceDestroy() {
        this.real.onCatalystInstanceDestroy();
    }

    private NativeModuleWrapper(C10488b bVar) {
        this.real = bVar;
        this.dynamicMethodsTmp$delegate = C7546e.m23569a(new C10562b(this));
    }

    public /* synthetic */ NativeModuleWrapper(C10488b bVar, C7571f fVar) {
        this(bVar);
    }
}
