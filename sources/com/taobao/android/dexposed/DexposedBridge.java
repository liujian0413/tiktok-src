package com.taobao.android.dexposed;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.Log;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.taobao.android.dexposed.XC_MethodHook.MethodHookParam;
import com.taobao.android.dexposed.XC_MethodHook.Unhook;
import com.taobao.android.dexposed.XC_MethodHook.XC_MethodKeepHook;
import com.taobao.android.dexposed.XC_MethodReplacement.XC_MethodKeepReplacement;
import com.taobao.android.dexposed.XposedHelpers.InvocationTargetError;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class DexposedBridge {
    public static final ClassLoader BOOTCLASSLOADER = ClassLoader.getSystemClassLoader();
    public static final Object[] EMPTY_ARRAY = new Object[0];
    private static final ArrayList<Unhook> allUnhookCallbacks = new ArrayList<>();
    public static Map<Class, String> builtInMap = new HashMap<Class, String>() {
        {
            put(Integer.TYPE, "I");
            put(Long.TYPE, "J");
            put(Double.TYPE, "D");
            put(Float.TYPE, "F");
            put(Boolean.TYPE, "Z");
            put(Character.TYPE, "C");
            put(Byte.TYPE, "B");
            put(Void.TYPE, "V");
            put(Short.TYPE, "S");
        }
    };
    private static final Map<Member, CopyOnWriteSortedSet<XC_MethodHook>> hookedMethodCallbacks = new HashMap();
    private static int runtime;

    static class AdditionalHookInfo {
        final CopyOnWriteSortedSet<XC_MethodHook> callbacks;
        final Class<?>[] parameterTypes;
        final Class<?> returnType;
        String shorty;

        /* access modifiers changed from: 0000 */
        public String Class2Shorty(Class<?> cls) {
            if (cls.isPrimitive()) {
                return (String) DexposedBridge.builtInMap.get(cls);
            }
            return "L";
        }

        private AdditionalHookInfo(CopyOnWriteSortedSet<XC_MethodHook> copyOnWriteSortedSet, Class<?>[] clsArr, Class<?> cls) {
            this.callbacks = copyOnWriteSortedSet;
            this.parameterTypes = clsArr;
            this.returnType = cls;
            StringBuilder sb = new StringBuilder(64);
            sb.append(Class2Shorty(cls));
            for (Class<?> Class2Shorty : clsArr) {
                sb.append(Class2Shorty(Class2Shorty));
            }
            this.shorty = sb.toString();
        }
    }

    public static class CopyOnWriteSortedSet<E> {
        private volatile transient Object[] elements = DexposedBridge.EMPTY_ARRAY;

        public Object[] getSnapshot() {
            return this.elements;
        }

        public synchronized void clear() {
            this.elements = DexposedBridge.EMPTY_ARRAY;
        }

        private int indexOf(Object obj) {
            for (int i = 0; i < this.elements.length; i++) {
                if (obj.equals(this.elements[i])) {
                    return i;
                }
            }
            return -1;
        }

        public synchronized boolean add(E e) {
            if (indexOf(e) >= 0) {
                return false;
            }
            Object[] objArr = new Object[(this.elements.length + 1)];
            System.arraycopy(this.elements, 0, objArr, 0, this.elements.length);
            objArr[this.elements.length] = e;
            Arrays.sort(objArr);
            this.elements = objArr;
            return true;
        }

        public synchronized boolean remove(E e) {
            int indexOf = indexOf(e);
            if (indexOf == -1) {
                return false;
            }
            Object[] objArr = new Object[(this.elements.length - 1)];
            System.arraycopy(this.elements, 0, objArr, 0, indexOf);
            System.arraycopy(this.elements, indexOf + 1, objArr, indexOf, (this.elements.length - indexOf) - 1);
            this.elements = objArr;
            return true;
        }
    }

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private static native synchronized void hookMethodNative(Member member, Class<?> cls, int i, Object obj);

    private static native Object invokeOriginalMethodNative(Member member, int i, Class<?>[] clsArr, Class<?> cls, Object obj, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;

    private static native Object invokeSuperNative(Object obj, Object[] objArr, Member member, Class<?> cls, Class<?>[] clsArr, Class<?> cls2, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;

    private static int getRuntime() {
        if (VERSION.SDK_INT >= 21) {
            return 2;
        }
        if (VERSION.SDK_INT < 20 || !System.getProperty("persist.sys.dalvik.vm.lib", "").contains("art")) {
            return 1;
        }
        return 2;
    }

    public static void unhookAllMethods() {
        synchronized (allUnhookCallbacks) {
            for (int i = 0; i < allUnhookCallbacks.size(); i++) {
                ((Unhook) allUnhookCallbacks.get(i)).unhook();
            }
            allUnhookCallbacks.clear();
        }
    }

    public static synchronized void log(String str) {
        synchronized (DexposedBridge.class) {
        }
    }

    public static synchronized void log(Throwable th) {
        synchronized (DexposedBridge.class) {
            log(Log.getStackTraceString(th));
        }
    }

    public static synchronized boolean canDexposed(Context context) {
        synchronized (DexposedBridge.class) {
            if (!DeviceCheck.isDeviceSupport(context)) {
                return false;
            }
            boolean loadDexposedLib = loadDexposedLib(context);
            return loadDexposedLib;
        }
    }

    private static boolean loadDexposedLib(Context context) {
        try {
            if (VERSION.SDK_INT == 22) {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("dexposed_l51");
            } else if (VERSION.SDK_INT > 19 && VERSION.SDK_INT <= 21) {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("dexposed_l");
            } else if (VERSION.SDK_INT <= 14) {
                return false;
            } else {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("dexposed");
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Set<Unhook> hookAllConstructors(Class<?> cls, XC_MethodHook xC_MethodHook) {
        HashSet hashSet = new HashSet();
        for (Constructor hookMethod : cls.getDeclaredConstructors()) {
            hashSet.add(hookMethod(hookMethod, xC_MethodHook));
        }
        return hashSet;
    }

    public static void unhookMethod(Member member, XC_MethodHook xC_MethodHook) {
        synchronized (hookedMethodCallbacks) {
            CopyOnWriteSortedSet copyOnWriteSortedSet = (CopyOnWriteSortedSet) hookedMethodCallbacks.get(member);
            if (copyOnWriteSortedSet != null) {
                copyOnWriteSortedSet.remove(xC_MethodHook);
            }
        }
    }

    public static Unhook hookMethod(Member member, XC_MethodHook xC_MethodHook) {
        CopyOnWriteSortedSet copyOnWriteSortedSet;
        int i;
        boolean z;
        Class[] clsArr;
        Class cls;
        boolean z2 = member instanceof Method;
        if (z2 || (member instanceof Constructor)) {
            synchronized (hookedMethodCallbacks) {
                copyOnWriteSortedSet = (CopyOnWriteSortedSet) hookedMethodCallbacks.get(member);
                i = 0;
                if (copyOnWriteSortedSet == null) {
                    copyOnWriteSortedSet = new CopyOnWriteSortedSet();
                    hookedMethodCallbacks.put(member, copyOnWriteSortedSet);
                    z = true;
                } else {
                    z = false;
                }
            }
            copyOnWriteSortedSet.add(xC_MethodHook);
            if (z) {
                Class declaringClass = member.getDeclaringClass();
                if (runtime == 0) {
                    runtime = getRuntime();
                }
                if (runtime == 1) {
                    i = XposedHelpers.getIntField(member, "slot");
                }
                if (z2) {
                    Method method = (Method) member;
                    clsArr = method.getParameterTypes();
                    cls = method.getReturnType();
                } else {
                    clsArr = ((Constructor) member).getParameterTypes();
                    cls = null;
                }
                hookMethodNative(member, declaringClass, i, new AdditionalHookInfo(copyOnWriteSortedSet, clsArr, cls));
            }
            xC_MethodHook.getClass();
            return new Unhook(member);
        }
        throw new IllegalArgumentException("only methods and constructors can be hooked");
    }

    public static Unhook findAndHookMethod(Class<?> cls, String str, Object... objArr) {
        if (objArr.length == 0 || !(objArr[objArr.length - 1] instanceof XC_MethodHook)) {
            throw new IllegalArgumentException("no callback defined");
        }
        XC_MethodHook xC_MethodHook = objArr[objArr.length - 1];
        Unhook hookMethod = hookMethod(XposedHelpers.findMethodExact(cls, str, objArr), xC_MethodHook);
        if (!(xC_MethodHook instanceof XC_MethodKeepHook) && !(xC_MethodHook instanceof XC_MethodKeepReplacement)) {
            synchronized (allUnhookCallbacks) {
                allUnhookCallbacks.add(hookMethod);
            }
        }
        return hookMethod;
    }

    public static Set<Unhook> hookAllMethods(Class<?> cls, String str, XC_MethodHook xC_MethodHook) {
        Method[] declaredMethods;
        HashSet hashSet = new HashSet();
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                hashSet.add(hookMethod(method, xC_MethodHook));
            }
        }
        return hashSet;
    }

    public static Object invokeOriginalMethod(Member member, Object obj, Object[] objArr) throws NullPointerException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls;
        Class[] clsArr;
        if (objArr == null) {
            objArr = EMPTY_ARRAY;
        }
        Object[] objArr2 = objArr;
        if (member instanceof Method) {
            Method method = (Method) member;
            Class[] parameterTypes = method.getParameterTypes();
            cls = method.getReturnType();
            clsArr = parameterTypes;
        } else if (member instanceof Constructor) {
            clsArr = ((Constructor) member).getParameterTypes();
            cls = null;
        } else {
            throw new IllegalArgumentException("method must be of type Method or Constructor");
        }
        return invokeOriginalMethodNative(member, 0, clsArr, cls, obj, objArr2);
    }

    public static Object invokeSuper(Object obj, Member member, Object... objArr) throws NoSuchFieldException {
        int i;
        try {
            if (runtime == 0) {
                runtime = getRuntime();
            }
            if (runtime == 1) {
                i = XposedHelpers.getIntField(XposedHelpers.findMethodExact(obj.getClass().getSuperclass(), member.getName(), (Class<?>[]) ((Method) member).getParameterTypes()), "slot");
            } else {
                i = 0;
            }
            return invokeSuperNative(obj, objArr, member, member.getDeclaringClass(), ((Method) member).getParameterTypes(), ((Method) member).getReturnType(), i);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(e.getMessage());
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new InvocationTargetError(e3.getCause());
        }
    }

    private static Object handleHookedMethod(Member member, int i, Object obj, Object obj2, Object[] objArr) throws Throwable {
        AdditionalHookInfo additionalHookInfo = (AdditionalHookInfo) obj;
        Object[] snapshot = additionalHookInfo.callbacks.getSnapshot();
        int length = snapshot.length;
        if (length == 0) {
            try {
                return invokeOriginalMethodNative(member, i, additionalHookInfo.parameterTypes, additionalHookInfo.returnType, obj2, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        } else {
            MethodHookParam methodHookParam = new MethodHookParam();
            methodHookParam.method = member;
            methodHookParam.thisObject = obj2;
            methodHookParam.args = objArr;
            int i2 = 0;
            while (true) {
                try {
                    ((XC_MethodHook) snapshot[i2]).beforeHookedMethod(methodHookParam);
                    if (methodHookParam.returnEarly) {
                        i2++;
                        break;
                    }
                } catch (Throwable th) {
                    log(th);
                    methodHookParam.setResult(null);
                    methodHookParam.returnEarly = false;
                }
                i2++;
                if (i2 >= length) {
                    break;
                }
            }
            if (!methodHookParam.returnEarly) {
                try {
                    methodHookParam.setResult(invokeOriginalMethodNative(member, i, additionalHookInfo.parameterTypes, additionalHookInfo.returnType, methodHookParam.thisObject, methodHookParam.args));
                } catch (InvocationTargetException e2) {
                    methodHookParam.setThrowable(e2.getCause());
                }
            }
            int i3 = i2 - 1;
            do {
                Object result = methodHookParam.getResult();
                Throwable throwable = methodHookParam.getThrowable();
                try {
                    ((XC_MethodHook) snapshot[i3]).afterHookedMethod(methodHookParam);
                } catch (Throwable th2) {
                    log(th2);
                    if (throwable == null) {
                        methodHookParam.setResult(result);
                    } else {
                        methodHookParam.setThrowable(throwable);
                    }
                }
                i3--;
            } while (i3 >= 0);
            if (!methodHookParam.hasThrowable()) {
                return methodHookParam.getResult();
            }
            throw methodHookParam.getThrowable();
        }
    }
}
