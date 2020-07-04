package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

public class ViewManagerPropertyUpdater {
    private static final Map<Class<?>, ShadowNodeSetter<?>> SHADOW_NODE_SETTER_MAP = new HashMap();
    private static final Map<Class<?>, ViewManagerSetter<?, ?>> VIEW_MANAGER_SETTER_MAP = new HashMap();

    static class FallbackShadowNodeSetter<T extends ReactShadowNode> implements ShadowNodeSetter<T> {
        private final Map<String, PropSetter> mPropSetters;

        private FallbackShadowNodeSetter(Class<? extends ReactShadowNode> cls) {
            this.mPropSetters = ViewManagersPropertyCache.getNativePropSettersForShadowNodeClass(cls);
        }

        public void getProperties(Map<String, String> map) {
            for (PropSetter propSetter : this.mPropSetters.values()) {
                map.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        public void setProperty(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
            PropSetter propSetter = (PropSetter) this.mPropSetters.get(str);
            if (propSetter != null) {
                propSetter.updateShadowNodeProp(reactShadowNode, reactStylesDiffMap);
            }
        }
    }

    static class FallbackViewManagerSetter<T extends ViewManager, V extends View> implements ViewManagerSetter<T, V> {
        private final Map<String, PropSetter> mPropSetters;

        private FallbackViewManagerSetter(Class<? extends ViewManager> cls) {
            this.mPropSetters = ViewManagersPropertyCache.getNativePropSettersForViewManagerClass(cls);
        }

        public void getProperties(Map<String, String> map) {
            for (PropSetter propSetter : this.mPropSetters.values()) {
                map.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        public void setProperty(T t, V v, String str, ReactStylesDiffMap reactStylesDiffMap) {
            PropSetter propSetter = (PropSetter) this.mPropSetters.get(str);
            if (propSetter != null) {
                propSetter.updateViewProp(t, v, reactStylesDiffMap);
            }
        }
    }

    public interface Settable {
        void getProperties(Map<String, String> map);
    }

    public interface ShadowNodeSetter<T extends ReactShadowNode> extends Settable {
        void setProperty(T t, String str, ReactStylesDiffMap reactStylesDiffMap);
    }

    public interface ViewManagerSetter<T extends ViewManager, V extends View> extends Settable {
        void setProperty(T t, V v, String str, ReactStylesDiffMap reactStylesDiffMap);
    }

    public static void clear() {
        ViewManagersPropertyCache.clear();
        VIEW_MANAGER_SETTER_MAP.clear();
        SHADOW_NODE_SETTER_MAP.clear();
    }

    private static <T extends ViewManager, V extends View> ViewManagerSetter<T, V> findManagerSetter(Class<? extends ViewManager> cls) {
        ViewManagerSetter<T, V> viewManagerSetter = (ViewManagerSetter) VIEW_MANAGER_SETTER_MAP.get(cls);
        if (viewManagerSetter == null) {
            viewManagerSetter = (ViewManagerSetter) findGeneratedSetter(cls);
            if (viewManagerSetter == null) {
                viewManagerSetter = new FallbackViewManagerSetter<>(cls);
            }
            VIEW_MANAGER_SETTER_MAP.put(cls, viewManagerSetter);
        }
        return viewManagerSetter;
    }

    private static <T extends ReactShadowNode> ShadowNodeSetter<T> findNodeSetter(Class<? extends ReactShadowNode> cls) {
        ShadowNodeSetter<T> shadowNodeSetter = (ShadowNodeSetter) SHADOW_NODE_SETTER_MAP.get(cls);
        if (shadowNodeSetter == null) {
            shadowNodeSetter = (ShadowNodeSetter) findGeneratedSetter(cls);
            if (shadowNodeSetter == null) {
                shadowNodeSetter = new FallbackShadowNodeSetter<>(cls);
            }
            SHADOW_NODE_SETTER_MAP.put(cls, shadowNodeSetter);
        }
        return shadowNodeSetter;
    }

    private static <T> T findGeneratedSetter(Class<?> cls) {
        String name = cls.getName();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("$$PropsSetter");
            return Class.forName(sb.toString()).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder("Could not find generated setter for ");
            sb2.append(cls);
            C13286a.m38860c("ViewManagerPropertyUpdater", sb2.toString());
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate methods getter for ");
            sb3.append(name);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    public static synchronized Map<String, String> getNativeProps(Class<? extends ViewManager> cls, Class<? extends ReactShadowNode> cls2) {
        HashMap hashMap;
        synchronized (ViewManagerPropertyUpdater.class) {
            hashMap = new HashMap();
            findManagerSetter(cls).getProperties(hashMap);
            findNodeSetter(cls2).getProperties(hashMap);
        }
        return hashMap;
    }

    public static <T extends ReactShadowNode> void updateProps(T t, ReactStylesDiffMap reactStylesDiffMap) {
        ShadowNodeSetter findNodeSetter = findNodeSetter(t.getClass());
        ReadableMapKeySetIterator keySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            findNodeSetter.setProperty(t, keySetIterator.nextKey(), reactStylesDiffMap);
        }
    }

    public static <T extends ViewManager, V extends View> void updateProps(T t, V v, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerSetter findManagerSetter = findManagerSetter(t.getClass());
        ReadableMapKeySetIterator keySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            findManagerSetter.setProperty(t, v, keySetIterator.nextKey(), reactStylesDiffMap);
        }
    }
}
