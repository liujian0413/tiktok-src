package com.bytedance.ies.bullet.kit.p261rn.internal.wrapper;

import android.view.View;
import com.bytedance.ies.bullet.kit.p261rn.BulletProp;
import com.bytedance.ies.bullet.kit.p261rn.C10492c;
import com.bytedance.ies.bullet.kit.p261rn.C10498e;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.wrapper.SimpleViewManagerWrapper */
public final class SimpleViewManagerWrapper extends SimpleViewManager<View> {
    public static final C10563a Companion = new C10563a(null);
    public final Map<String, Method> methodMap;
    private final C10498e<View> real;
    public final Map<String, Class<?>> typeMap;
    public final Map<String, String> typeStringMap;

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.wrapper.SimpleViewManagerWrapper$a */
    public static final class C10563a {
        private C10563a() {
        }

        public /* synthetic */ C10563a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static String m30946a(Class<?> cls) {
            if (Integer.TYPE.isAssignableFrom(cls)) {
                return "number";
            }
            if (Double.TYPE.isAssignableFrom(cls)) {
                return "number";
            }
            if (Float.TYPE.isAssignableFrom(cls)) {
                return "number";
            }
            if (Boolean.TYPE.isAssignableFrom(cls)) {
                return "boolean";
            }
            if (String.class.isAssignableFrom(cls)) {
                return "String";
            }
            if (List.class.isAssignableFrom(cls)) {
                return "Array";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "Map";
            }
            return "custom";
        }

        /* renamed from: a */
        public static SimpleViewManager<View> m30945a(C10498e<View> eVar) {
            C7573i.m23587b(eVar, "real");
            SimpleViewManagerWrapper simpleViewManagerWrapper = new SimpleViewManagerWrapper(eVar, null);
            try {
                Method[] declaredMethods = eVar.getClass().getDeclaredMethods();
                C7573i.m23582a((Object) declaredMethods, "real.javaClass.declaredMethods");
                for (Method method : declaredMethods) {
                    BulletProp bulletProp = (BulletProp) method.getAnnotation(BulletProp.class);
                    if (bulletProp != null) {
                        C7573i.m23582a((Object) method, "method");
                        Class[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length != 2) {
                            StringBuilder sb = new StringBuilder("Wrong number of args for prop setter: ");
                            sb.append(simpleViewManagerWrapper.getName());
                            sb.append("#");
                            sb.append(method.getName());
                            throw new RuntimeException(sb.toString());
                        } else if (View.class.isAssignableFrom(parameterTypes[0])) {
                            Map<String, String> map = simpleViewManagerWrapper.typeStringMap;
                            String name = bulletProp.name();
                            Class cls = parameterTypes[1];
                            C7573i.m23582a((Object) cls, "it[1]");
                            map.put(name, m30946a(cls));
                            Map<String, Class<?>> map2 = simpleViewManagerWrapper.typeMap;
                            String name2 = bulletProp.name();
                            Class cls2 = parameterTypes[1];
                            C7573i.m23582a((Object) cls2, "it[1]");
                            map2.put(name2, cls2);
                            simpleViewManagerWrapper.methodMap.put(bulletProp.name(), method);
                        } else {
                            StringBuilder sb2 = new StringBuilder("First param should be a view subclass to be updated: ");
                            sb2.append(simpleViewManagerWrapper.getName());
                            sb2.append("#");
                            sb2.append(method.getName());
                            throw new RuntimeException(sb2.toString());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return simpleViewManagerWrapper;
        }
    }

    public final Map<String, Integer> getCommandsMap() {
        return null;
    }

    public final String getName() {
        return this.real.mo25288a();
    }

    public final Map<String, String> getNativeProps() {
        Map<String, String> nativeProps = super.getNativeProps();
        nativeProps.putAll(this.typeStringMap);
        C7573i.m23582a((Object) nativeProps, "super.getNativeProps().a…s $this\")\n        }\n    }");
        return nativeProps;
    }

    public final void onAfterUpdateTransaction(View view) {
        C7573i.m23587b(view, "view");
        C10498e.m30897b(view);
    }

    public final void onDropViewInstance(View view) {
        C7573i.m23587b(view, "view");
        C10498e.m30894a(view);
    }

    public final View createViewInstance(ThemedReactContext themedReactContext) {
        C7573i.m23587b(themedReactContext, "reactContext");
        return this.real.mo25287a((C10492c) new C10564a(themedReactContext));
    }

    private SimpleViewManagerWrapper(C10498e<View> eVar) {
        this.real = eVar;
        this.typeStringMap = new LinkedHashMap();
        this.typeMap = new LinkedHashMap();
        this.methodMap = new LinkedHashMap();
    }

    public /* synthetic */ SimpleViewManagerWrapper(C10498e eVar, C7571f fVar) {
        this(eVar);
    }

    public final void addEventEmitters(ThemedReactContext themedReactContext, View view) {
        C7573i.m23587b(themedReactContext, "reactContext");
        C7573i.m23587b(view, "view");
        C10498e.m30896a(new C10564a(themedReactContext), view);
    }

    public final void receiveCommand(View view, int i, ReadableArray readableArray) {
        ArrayList arrayList;
        C7573i.m23587b(view, "root");
        if (readableArray != null) {
            arrayList = readableArray.toArrayList();
        } else {
            arrayList = null;
        }
        C10498e.m30895a(view, i, arrayList);
    }

    public final void setProperty(View view, String str, ReactStylesDiffMap reactStylesDiffMap) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(str, "name");
        C7573i.m23587b(reactStylesDiffMap, "props");
        Class cls = (Class) this.typeMap.get(str);
        Method method = (Method) this.methodMap.get(str);
        if (!(cls == null || method == null)) {
            try {
                method.setAccessible(true);
                if (Integer.TYPE.isAssignableFrom(cls)) {
                    method.invoke(this.real, new Object[]{view, Integer.valueOf(reactStylesDiffMap.getInt(str, 0))});
                } else if (Double.TYPE.isAssignableFrom(cls)) {
                    method.invoke(this.real, new Object[]{view, Double.valueOf(reactStylesDiffMap.getDouble(str, 0.0d))});
                } else if (Float.TYPE.isAssignableFrom(cls)) {
                    method.invoke(this.real, new Object[]{view, Float.valueOf(reactStylesDiffMap.getFloat(str, 0.0f))});
                } else if (Boolean.TYPE.isAssignableFrom(cls)) {
                    method.invoke(this.real, new Object[]{view, Boolean.valueOf(reactStylesDiffMap.getBoolean(str, false))});
                } else if (String.class.isAssignableFrom(cls)) {
                    method.invoke(this.real, new Object[]{view, reactStylesDiffMap.getString(str)});
                } else {
                    Object obj = null;
                    if (List.class.isAssignableFrom(cls)) {
                        C10498e<View> eVar = this.real;
                        Object[] objArr = new Object[2];
                        objArr[0] = view;
                        ReadableArray array = reactStylesDiffMap.getArray(str);
                        if (array != null) {
                            obj = array.toArrayList();
                        }
                        objArr[1] = obj;
                        method.invoke(eVar, objArr);
                        return;
                    }
                    if (Map.class.isAssignableFrom(cls)) {
                        C10498e<View> eVar2 = this.real;
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = view;
                        ReadableMap map = reactStylesDiffMap.getMap(str);
                        if (map != null) {
                            obj = map.toHashMap();
                        }
                        objArr2[1] = obj;
                        method.invoke(eVar2, objArr2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
