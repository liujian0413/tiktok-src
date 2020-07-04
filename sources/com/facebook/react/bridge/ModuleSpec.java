package com.facebook.react.bridge;

import java.lang.reflect.Constructor;
import javax.p1876a.C47883a;

public class ModuleSpec {
    public static final Class[] CONTEXT_SIGNATURE = {ReactApplicationContext.class};
    public static final Class[] EMPTY_SIGNATURE = new Class[0];
    private final C47883a<? extends NativeModule> mProvider;
    private final Class<? extends NativeModule> mType;

    static abstract class ConstructorProvider implements C47883a<NativeModule> {
        protected Constructor<? extends NativeModule> mConstructor;

        public ConstructorProvider(Class<? extends NativeModule> cls, Class[] clsArr) {
        }

        /* access modifiers changed from: protected */
        public Constructor<? extends NativeModule> getConstructor(Class<? extends NativeModule> cls, Class[] clsArr) throws NoSuchMethodException {
            if (this.mConstructor != null) {
                return this.mConstructor;
            }
            return cls.getConstructor(clsArr);
        }
    }

    public C47883a<? extends NativeModule> getProvider() {
        return this.mProvider;
    }

    public Class<? extends NativeModule> getType() {
        return this.mType;
    }

    public static ModuleSpec viewManagerSpec(C47883a<? extends NativeModule> aVar) {
        return new ModuleSpec(null, aVar);
    }

    public static ModuleSpec simple(final Class<? extends NativeModule> cls) {
        return new ModuleSpec(cls, new ConstructorProvider(EMPTY_SIGNATURE, cls) {
            public final NativeModule get() {
                try {
                    return (NativeModule) getConstructor(cls, ModuleSpec.EMPTY_SIGNATURE).newInstance(new Object[0]);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("ModuleSpec with class: ");
                    sb.append(cls.getName());
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        });
    }

    private ModuleSpec(Class<? extends NativeModule> cls, C47883a<? extends NativeModule> aVar) {
        this.mType = cls;
        this.mProvider = aVar;
    }

    public static ModuleSpec nativeModuleSpec(Class<? extends NativeModule> cls, C47883a<? extends NativeModule> aVar) {
        return new ModuleSpec(cls, aVar);
    }

    public static ModuleSpec simple(final Class<? extends NativeModule> cls, final ReactApplicationContext reactApplicationContext) {
        return new ModuleSpec(cls, new ConstructorProvider(CONTEXT_SIGNATURE, cls) {
            public final NativeModule get() {
                try {
                    return (NativeModule) getConstructor(cls, ModuleSpec.CONTEXT_SIGNATURE).newInstance(new Object[]{reactApplicationContext});
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("ModuleSpec with class: ");
                    sb.append(cls.getName());
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        });
    }
}
