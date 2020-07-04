package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ViewManagersPropertyCache {
    private static final Map<Class, Map<String, PropSetter>> CLASS_PROPS_CACHE = new HashMap();
    private static final Map<String, PropSetter> EMPTY_PROPS_MAP = new HashMap();

    static class ArrayPropSetter extends PropSetter {
        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getArray(this.mPropName);
        }

        public ArrayPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "Array", method);
        }
    }

    static class BooleanPropSetter extends PropSetter {
        private final boolean mDefaultValue;

        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            if (reactStylesDiffMap.getBoolean(this.mPropName, this.mDefaultValue)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public BooleanPropSetter(ReactProp reactProp, Method method, boolean z) {
            super(reactProp, "boolean", method);
            this.mDefaultValue = z;
        }
    }

    static class BoxedBooleanPropSetter extends PropSetter {
        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            if (reactStylesDiffMap.isNull(this.mPropName)) {
                return null;
            }
            if (reactStylesDiffMap.getBoolean(this.mPropName, false)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public BoxedBooleanPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "boolean", method);
        }
    }

    static class BoxedIntPropSetter extends PropSetter {
        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            if (!reactStylesDiffMap.isNull(this.mPropName)) {
                return Integer.valueOf(reactStylesDiffMap.getInt(this.mPropName, 0));
            }
            return null;
        }

        public BoxedIntPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "number", method);
        }

        public BoxedIntPropSetter(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "number", method, i);
        }
    }

    static class DoublePropSetter extends PropSetter {
        private final double mDefaultValue;

        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return Double.valueOf(reactStylesDiffMap.getDouble(this.mPropName, this.mDefaultValue));
        }

        public DoublePropSetter(ReactProp reactProp, Method method, double d) {
            super(reactProp, "number", method);
            this.mDefaultValue = d;
        }

        public DoublePropSetter(ReactPropGroup reactPropGroup, Method method, int i, double d) {
            super(reactPropGroup, "number", method, i);
            this.mDefaultValue = d;
        }
    }

    static class DynamicPropSetter extends PropSetter {
        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getDynamic(this.mPropName);
        }

        public DynamicPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "mixed", method);
        }

        public DynamicPropSetter(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "mixed", method, i);
        }
    }

    static class FloatPropSetter extends PropSetter {
        private final float mDefaultValue;

        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return Float.valueOf(reactStylesDiffMap.getFloat(this.mPropName, this.mDefaultValue));
        }

        public FloatPropSetter(ReactProp reactProp, Method method, float f) {
            super(reactProp, "number", method);
            this.mDefaultValue = f;
        }

        public FloatPropSetter(ReactPropGroup reactPropGroup, Method method, int i, float f) {
            super(reactPropGroup, "number", method, i);
            this.mDefaultValue = f;
        }
    }

    static class IntPropSetter extends PropSetter {
        private final int mDefaultValue;

        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return Integer.valueOf(reactStylesDiffMap.getInt(this.mPropName, this.mDefaultValue));
        }

        public IntPropSetter(ReactProp reactProp, Method method, int i) {
            super(reactProp, "number", method);
            this.mDefaultValue = i;
        }

        public IntPropSetter(ReactPropGroup reactPropGroup, Method method, int i, int i2) {
            super(reactPropGroup, "number", method, i);
            this.mDefaultValue = i2;
        }
    }

    static class MapPropSetter extends PropSetter {
        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getMap(this.mPropName);
        }

        public MapPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "Map", method);
        }
    }

    static abstract class PropSetter {
        private static final Object[] SHADOW_ARGS = new Object[1];
        private static final Object[] SHADOW_GROUP_ARGS = new Object[2];
        private static final Object[] VIEW_MGR_ARGS = new Object[2];
        private static final Object[] VIEW_MGR_GROUP_ARGS = new Object[3];
        protected final Integer mIndex;
        protected final String mPropName;
        protected final String mPropType;
        protected final Method mSetter;

        /* access modifiers changed from: protected */
        public abstract Object extractProperty(ReactStylesDiffMap reactStylesDiffMap);

        public String getPropName() {
            return this.mPropName;
        }

        public String getPropType() {
            return this.mPropType;
        }

        public void updateShadowNodeProp(ReactShadowNode reactShadowNode, ReactStylesDiffMap reactStylesDiffMap) {
            try {
                if (this.mIndex == null) {
                    SHADOW_ARGS[0] = extractProperty(reactStylesDiffMap);
                    this.mSetter.invoke(reactShadowNode, SHADOW_ARGS);
                    Arrays.fill(SHADOW_ARGS, null);
                    return;
                }
                SHADOW_GROUP_ARGS[0] = this.mIndex;
                SHADOW_GROUP_ARGS[1] = extractProperty(reactStylesDiffMap);
                this.mSetter.invoke(reactShadowNode, SHADOW_GROUP_ARGS);
                Arrays.fill(SHADOW_GROUP_ARGS, null);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Error while updating prop ");
                sb.append(this.mPropName);
                C13286a.m38850b(ViewManager.class, sb.toString(), th);
                StringBuilder sb2 = new StringBuilder("Error while updating property '");
                sb2.append(this.mPropName);
                sb2.append("' in shadow node of type: ");
                sb2.append(reactShadowNode.getViewClass());
                throw new JSApplicationIllegalArgumentException(sb2.toString(), th);
            }
        }

        private PropSetter(ReactProp reactProp, String str, Method method) {
            this.mPropName = reactProp.name();
            if (!"__default_type__".equals(reactProp.customType())) {
                str = reactProp.customType();
            }
            this.mPropType = str;
            this.mSetter = method;
            this.mIndex = null;
        }

        public void updateViewProp(ViewManager viewManager, View view, ReactStylesDiffMap reactStylesDiffMap) {
            try {
                if (this.mIndex == null) {
                    VIEW_MGR_ARGS[0] = view;
                    VIEW_MGR_ARGS[1] = extractProperty(reactStylesDiffMap);
                    this.mSetter.invoke(viewManager, VIEW_MGR_ARGS);
                    Arrays.fill(VIEW_MGR_ARGS, null);
                    return;
                }
                VIEW_MGR_GROUP_ARGS[0] = view;
                VIEW_MGR_GROUP_ARGS[1] = this.mIndex;
                VIEW_MGR_GROUP_ARGS[2] = extractProperty(reactStylesDiffMap);
                this.mSetter.invoke(viewManager, VIEW_MGR_GROUP_ARGS);
                Arrays.fill(VIEW_MGR_GROUP_ARGS, null);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Error while updating prop ");
                sb.append(this.mPropName);
                C13286a.m38850b(ViewManager.class, sb.toString(), th);
                StringBuilder sb2 = new StringBuilder("Error while updating property '");
                sb2.append(this.mPropName);
                sb2.append("' of a view managed by: ");
                sb2.append(viewManager.getName());
                throw new JSApplicationIllegalArgumentException(sb2.toString(), th);
            }
        }

        private PropSetter(ReactPropGroup reactPropGroup, String str, Method method, int i) {
            this.mPropName = reactPropGroup.names()[i];
            if (!"__default_type__".equals(reactPropGroup.customType())) {
                str = reactPropGroup.customType();
            }
            this.mPropType = str;
            this.mSetter = method;
            this.mIndex = Integer.valueOf(i);
        }
    }

    static class StringPropSetter extends PropSetter {
        /* access modifiers changed from: protected */
        public Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getString(this.mPropName);
        }

        public StringPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "String", method);
        }
    }

    ViewManagersPropertyCache() {
    }

    public static void clear() {
        CLASS_PROPS_CACHE.clear();
        EMPTY_PROPS_MAP.clear();
    }

    static Map<String, PropSetter> getNativePropSettersForShadowNodeClass(Class<? extends ReactShadowNode> cls) {
        for (Class<ReactShadowNode> cls2 : cls.getInterfaces()) {
            if (cls2 == ReactShadowNode.class) {
                return EMPTY_PROPS_MAP;
            }
        }
        Map<String, PropSetter> map = (Map) CLASS_PROPS_CACHE.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(getNativePropSettersForShadowNodeClass(cls.getSuperclass()));
        extractPropSettersFromShadowNodeClassDefinition(cls, hashMap);
        CLASS_PROPS_CACHE.put(cls, hashMap);
        return hashMap;
    }

    static Map<String, PropSetter> getNativePropSettersForViewManagerClass(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return EMPTY_PROPS_MAP;
        }
        Map<String, PropSetter> map = (Map) CLASS_PROPS_CACHE.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(getNativePropSettersForViewManagerClass(cls.getSuperclass()));
        extractPropSettersFromViewManagerClassDefinition(cls, hashMap);
        CLASS_PROPS_CACHE.put(cls, hashMap);
        return hashMap;
    }

    static Map<String, String> getNativePropsForView(Class<? extends ViewManager> cls, Class<? extends ReactShadowNode> cls2) {
        HashMap hashMap = new HashMap();
        for (PropSetter propSetter : getNativePropSettersForViewManagerClass(cls).values()) {
            hashMap.put(propSetter.getPropName(), propSetter.getPropType());
        }
        for (PropSetter propSetter2 : getNativePropSettersForShadowNodeClass(cls2).values()) {
            hashMap.put(propSetter2.getPropName(), propSetter2.getPropType());
        }
        return hashMap;
    }

    private static void extractPropSettersFromShadowNodeClassDefinition(Class<? extends ReactShadowNode> cls, Map<String, PropSetter> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(reactProp.name(), createPropSetter(reactProp, method, parameterTypes[0]));
                } else {
                    StringBuilder sb = new StringBuilder("Wrong number of args for prop setter: ");
                    sb.append(cls.getName());
                    sb.append("#");
                    sb.append(method.getName());
                    throw new RuntimeException(sb.toString());
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    StringBuilder sb2 = new StringBuilder("Wrong number of args for group prop setter: ");
                    sb2.append(cls.getName());
                    sb2.append("#");
                    sb2.append(method.getName());
                    throw new RuntimeException(sb2.toString());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    createPropSetters(reactPropGroup, method, parameterTypes2[1], map);
                } else {
                    StringBuilder sb3 = new StringBuilder("Second argument should be property index: ");
                    sb3.append(cls.getName());
                    sb3.append("#");
                    sb3.append(method.getName());
                    throw new RuntimeException(sb3.toString());
                }
            }
        }
    }

    private static void extractPropSettersFromViewManagerClassDefinition(Class<? extends ViewManager> cls, Map<String, PropSetter> map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    StringBuilder sb = new StringBuilder("Wrong number of args for prop setter: ");
                    sb.append(cls.getName());
                    sb.append("#");
                    sb.append(method.getName());
                    throw new RuntimeException(sb.toString());
                } else if (View.class.isAssignableFrom(parameterTypes[0])) {
                    map.put(reactProp.name(), createPropSetter(reactProp, method, parameterTypes[1]));
                } else {
                    StringBuilder sb2 = new StringBuilder("First param should be a view subclass to be updated: ");
                    sb2.append(cls.getName());
                    sb2.append("#");
                    sb2.append(method.getName());
                    throw new RuntimeException(sb2.toString());
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    StringBuilder sb3 = new StringBuilder("Wrong number of args for group prop setter: ");
                    sb3.append(cls.getName());
                    sb3.append("#");
                    sb3.append(method.getName());
                    throw new RuntimeException(sb3.toString());
                } else if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    StringBuilder sb4 = new StringBuilder("First param should be a view subclass to be updated: ");
                    sb4.append(cls.getName());
                    sb4.append("#");
                    sb4.append(method.getName());
                    throw new RuntimeException(sb4.toString());
                } else if (parameterTypes2[1] == Integer.TYPE) {
                    createPropSetters(reactPropGroup, method, parameterTypes2[2], map);
                } else {
                    StringBuilder sb5 = new StringBuilder("Second argument should be property index: ");
                    sb5.append(cls.getName());
                    sb5.append("#");
                    sb5.append(method.getName());
                    throw new RuntimeException(sb5.toString());
                }
            }
        }
    }

    private static PropSetter createPropSetter(ReactProp reactProp, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new DynamicPropSetter(reactProp, method);
        }
        if (cls == Boolean.TYPE) {
            return new BooleanPropSetter(reactProp, method, reactProp.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return new IntPropSetter(reactProp, method, reactProp.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new FloatPropSetter(reactProp, method, reactProp.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new DoublePropSetter(reactProp, method, reactProp.defaultDouble());
        }
        if (cls == String.class) {
            return new StringPropSetter(reactProp, method);
        }
        if (cls == Boolean.class) {
            return new BoxedBooleanPropSetter(reactProp, method);
        }
        if (cls == Integer.class) {
            return new BoxedIntPropSetter(reactProp, method);
        }
        if (cls == ReadableArray.class) {
            return new ArrayPropSetter(reactProp, method);
        }
        if (cls == ReadableMap.class) {
            return new MapPropSetter(reactProp, method);
        }
        StringBuilder sb = new StringBuilder("Unrecognized type: ");
        sb.append(cls);
        sb.append(" for method: ");
        sb.append(method.getDeclaringClass().getName());
        sb.append("#");
        sb.append(method.getName());
        throw new RuntimeException(sb.toString());
    }

    private static void createPropSetters(ReactPropGroup reactPropGroup, Method method, Class<?> cls, Map<String, PropSetter> map) {
        String[] names = reactPropGroup.names();
        int i = 0;
        if (cls == Dynamic.class) {
            while (i < names.length) {
                map.put(names[i], new DynamicPropSetter(reactPropGroup, method, i));
                i++;
            }
        } else if (cls == Integer.TYPE) {
            while (i < names.length) {
                map.put(names[i], new IntPropSetter(reactPropGroup, method, i, reactPropGroup.defaultInt()));
                i++;
            }
        } else if (cls == Float.TYPE) {
            while (i < names.length) {
                map.put(names[i], new FloatPropSetter(reactPropGroup, method, i, reactPropGroup.defaultFloat()));
                i++;
            }
        } else if (cls == Double.TYPE) {
            while (i < names.length) {
                String str = names[i];
                DoublePropSetter doublePropSetter = new DoublePropSetter(reactPropGroup, method, i, reactPropGroup.defaultDouble());
                map.put(str, doublePropSetter);
                i++;
            }
        } else if (cls == Integer.class) {
            while (i < names.length) {
                map.put(names[i], new BoxedIntPropSetter(reactPropGroup, method, i));
                i++;
            }
        } else {
            StringBuilder sb = new StringBuilder("Unrecognized type: ");
            sb.append(cls);
            sb.append(" for method: ");
            sb.append(method.getDeclaringClass().getName());
            sb.append("#");
            sb.append(method.getName());
            throw new RuntimeException(sb.toString());
        }
    }
}
