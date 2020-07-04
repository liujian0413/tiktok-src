package com.p280ss.avframework.effect;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.p280ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener;
import com.p280ss.avframework.utils.AVLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.avframework.effect.VideoEffectUtilsWrapper */
public class VideoEffectUtilsWrapper {
    public static final Object[] NO_ARGS = new Object[0];
    private static VideoEffectUtilsWrapper mVideoEffectUtilsWrapper;
    Class<?> mEffectSdk;
    private List<ListenerHandler> mListenerHandlerList = new ArrayList();
    Class<?> mMessageCenter;
    Class<?> mMessageCenterListener;
    Method mMethodEffectSdkFlushAlgorithmModelFiles;
    Method mMethodMessageCenterAddListener;
    Method mMethodMessageCenterRemoveListener;
    Class<?> mResourceFinder;
    Method mResourceFinderCreateNativeFinder;
    Method mResourceFinderRelease;

    /* renamed from: com.ss.avframework.effect.VideoEffectUtilsWrapper$ListenerHandler */
    class ListenerHandler implements InvocationHandler {
        private WeakReference<Object> mEffectListener;
        private EffectMsgListener mEffectMsgListener;

        public Object getEffectListener() {
            return this.mEffectListener.get();
        }

        public void setEffectListener(WeakReference<Object> weakReference) {
            this.mEffectListener = weakReference;
        }

        public boolean sameEffectMsgListener(EffectMsgListener effectMsgListener) {
            if (effectMsgListener == this.mEffectMsgListener) {
                return true;
            }
            return false;
        }

        public ListenerHandler(EffectMsgListener effectMsgListener) {
            this.mEffectMsgListener = effectMsgListener;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String str;
            boolean z = true;
            if (method.getName().equals("onMessageReceived")) {
                StringBuilder sb = new StringBuilder("invoke method:");
                sb.append(method);
                sb.append(" args ");
                sb.append(objArr.length);
                sb.append(" listener ");
                sb.append(this.mEffectMsgListener);
                AVLog.m143696d("VideoEffectUtilsWrapper", sb.toString());
                int intValue = objArr[0].intValue();
                int intValue2 = objArr[1].intValue();
                int intValue3 = objArr[2].intValue();
                if (objArr[3] == null) {
                    str = "";
                } else {
                    str = objArr[3];
                }
                if (this.mEffectMsgListener != null) {
                    this.mEffectMsgListener.onMessageReceived(intValue, intValue2, intValue3, str);
                }
                return obj;
            }
            if (objArr == null) {
                objArr = VideoEffectUtilsWrapper.NO_ARGS;
            }
            if (objArr.length == 0 && method.getName().equals("hashCode")) {
                return Integer.valueOf(hashCode());
            }
            if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
                Object obj2 = objArr[0];
                if (obj2 == null) {
                    return Boolean.valueOf(false);
                }
                if (obj == obj2) {
                    return Boolean.valueOf(true);
                }
                if (!VideoEffectUtilsWrapper.isProxyOfSameInterfaces(obj2, obj.getClass()) || !equals(Proxy.getInvocationHandler(obj2))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (objArr.length != 0 || !method.getName().equals("toString")) {
                return obj;
            } else {
                return toString();
            }
        }
    }

    public static boolean haveEffect() {
        return get().onHaveEffect();
    }

    private boolean onHaveEffect() {
        if (this.mEffectSdk == null || this.mMethodEffectSdkFlushAlgorithmModelFiles == null) {
            return false;
        }
        return true;
    }

    public static VideoEffectUtilsWrapper get() {
        synchronized (VideoEffectUtilsWrapper.class) {
            if (mVideoEffectUtilsWrapper == null) {
                mVideoEffectUtilsWrapper = new VideoEffectUtilsWrapper();
            }
        }
        return mVideoEffectUtilsWrapper;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private VideoEffectUtilsWrapper() {
        /*
            r6 = this;
            r6.<init>()
            com.p280ss.avframework.engine.MediaEngineFactory.getVersion()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.mListenerHandlerList = r0
            r0 = 1
            r1 = 0
            java.lang.String r2 = "com.bef.effectsdk.message.MessageCenter"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r6.mMessageCenter = r2     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.String r2 = "com.bef.effectsdk.AssetResourceFinder"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r6.mResourceFinder = r2     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class<?> r2 = r6.mResourceFinder     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.String r3 = "createNativeResourceFinder"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r4[r1] = r5     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r6.mResourceFinderCreateNativeFinder = r2     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class<?> r2 = r6.mResourceFinder     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.String r3 = "release"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r4[r1] = r5     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r6.mResourceFinderRelease = r2     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.String r2 = "com.bef.effectsdk.EffectSDKUtils"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r6.mEffectSdk = r2     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.String r2 = "com.bef.effectsdk.message.MessageCenter$a"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r6.mMessageCenterListener = r2     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class<?> r2 = r6.mMessageCenter     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.String r3 = "addListener"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class<?> r5 = r6.mMessageCenterListener     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r4[r1] = r5     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r6.mMethodMessageCenterAddListener = r2     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class<?> r2 = r6.mMessageCenter     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.String r3 = "removeListener"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class<?> r5 = r6.mMessageCenterListener     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r4[r1] = r5     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r6.mMethodMessageCenterRemoveListener = r2     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class<?> r2 = r6.mEffectSdk     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.String r3 = "flushAlgorithmModelFiles"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r1] = r5     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            r6.mMethodEffectSdkFlushAlgorithmModelFiles = r2     // Catch:{ ClassNotFoundException -> 0x0090, NoSuchMethodException -> 0x0085 }
            goto L_0x009b
        L_0x0085:
            r0 = move-exception
            java.lang.String r2 = "VideoEffectUtilsWrapper"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            com.p280ss.avframework.utils.AVLog.ioe(r2, r0)
            goto L_0x009a
        L_0x0090:
            r0 = move-exception
            java.lang.String r2 = "VideoEffectUtilsWrapper"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            com.p280ss.avframework.utils.AVLog.ioe(r2, r0)
        L_0x009a:
            r0 = 0
        L_0x009b:
            java.lang.String r1 = "VideoEffectUtilsWrapper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Init EffectSDK class "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.p280ss.avframework.utils.AVLog.ioi(r1, r2)
            if (r0 != 0) goto L_0x00bf
            r0 = 0
            r6.mMessageCenter = r0
            r6.mResourceFinder = r0
            r6.mEffectSdk = r0
            r6.mMethodMessageCenterRemoveListener = r0
            r6.mMethodMessageCenterAddListener = r0
            r6.mMessageCenterListener = r0
            r6.mMethodEffectSdkFlushAlgorithmModelFiles = r0
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.effect.VideoEffectUtilsWrapper.<init>():void");
    }

    public static void addMessageCenterListener(EffectMsgListener effectMsgListener) {
        get().addListener(effectMsgListener);
    }

    public static void removeMessageCenterListener(EffectMsgListener effectMsgListener) {
        get().removeListener(effectMsgListener);
    }

    private ListenerHandler popListener(EffectMsgListener effectMsgListener) {
        ListenerHandler findListener = findListener(effectMsgListener);
        if (findListener != null) {
            synchronized (this.mListenerHandlerList) {
                this.mListenerHandlerList.remove(findListener);
            }
        }
        return findListener;
    }

    private ListenerHandler findListener(EffectMsgListener effectMsgListener) {
        synchronized (this.mListenerHandlerList) {
            for (ListenerHandler listenerHandler : this.mListenerHandlerList) {
                if (listenerHandler.sameEffectMsgListener(effectMsgListener)) {
                    return listenerHandler;
                }
            }
            return null;
        }
    }

    private synchronized void removeListener(EffectMsgListener effectMsgListener) {
        String str = "VideoEffectUtilsWrapper";
        StringBuilder sb = new StringBuilder("Remove listener: ");
        sb.append(effectMsgListener);
        AVLog.ioi(str, sb.toString());
        if (this.mMethodMessageCenterRemoveListener != null) {
            ListenerHandler popListener = popListener(effectMsgListener);
            if (popListener != null) {
                String str2 = "VideoEffectUtilsWrapper";
                try {
                    StringBuilder sb2 = new StringBuilder("Remove listener ");
                    sb2.append(popListener.getEffectListener());
                    AVLog.ioi(str2, sb2.toString());
                    this.mMethodMessageCenterRemoveListener.invoke(null, new Object[]{popListener.getEffectListener()});
                    popListener.setEffectListener(null);
                } catch (Throwable th) {
                    String str3 = "VideoEffectUtilsWrapper";
                    StringBuilder sb3 = new StringBuilder("RemoveListener failed ");
                    sb3.append(Log.getStackTraceString(th));
                    AVLog.ioi(str3, sb3.toString());
                }
            }
        }
    }

    private synchronized void addListener(EffectMsgListener effectMsgListener) {
        String str = "VideoEffectUtilsWrapper";
        StringBuilder sb = new StringBuilder("Add listener: ");
        sb.append(effectMsgListener);
        AVLog.iod(str, sb.toString());
        if (findListener(effectMsgListener) != null) {
            AVLog.m143700w("VideoEffectUtilsWrapper", "Already exist listener");
            return;
        } else if (!(this.mMethodMessageCenterAddListener == null || effectMsgListener == null)) {
            ListenerHandler listenerHandler = new ListenerHandler(effectMsgListener);
            Object newProxyInstance = Proxy.newProxyInstance(VideoEffectUtilsWrapper.class.getClassLoader(), new Class[]{this.mMessageCenterListener}, listenerHandler);
            if (newProxyInstance != null) {
                String str2 = "VideoEffectUtilsWrapper";
                try {
                    StringBuilder sb2 = new StringBuilder("Add listener ");
                    sb2.append(newProxyInstance);
                    AVLog.ioi(str2, sb2.toString());
                    this.mMethodMessageCenterAddListener.invoke(null, new Object[]{newProxyInstance});
                    listenerHandler.setEffectListener(new WeakReference(newProxyInstance));
                    synchronized (this.mListenerHandlerList) {
                        this.mListenerHandlerList.add(listenerHandler);
                    }
                } catch (Throwable th) {
                    String str3 = "VideoEffectUtilsWrapper";
                    StringBuilder sb3 = new StringBuilder("AddListener failed ");
                    sb3.append(Log.getStackTraceString(th));
                    AVLog.ioe(str3, sb3.toString());
                }
            }
        }
        return;
    }

    public static void flushAlgorithmModelFiles(Context context, String str) {
        get().onFlushAlgorithmModelFiles(context, str);
    }

    public static Object createResourceFinder(AssetManager assetManager, String str) {
        return get().onCreateResourceFinder(assetManager, str);
    }

    public static long createNativeResourceFinder(Object obj, long j) {
        if (obj == null || get().mResourceFinderCreateNativeFinder == null) {
            return 0;
        }
        try {
            Object invoke = get().mResourceFinderCreateNativeFinder.invoke(obj, new Object[]{Long.valueOf(j)});
            if (invoke instanceof Long) {
                return ((Long) invoke).longValue();
            }
        } catch (Throwable th) {
            AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(th));
        }
        return 0;
    }

    public static boolean isProxyOfSameInterfaces(Object obj, Class<?> cls) {
        if (cls.isInstance(obj) || (Proxy.isProxyClass(obj.getClass()) && Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces()))) {
            return true;
        }
        return false;
    }

    private void onFlushAlgorithmModelFiles(Context context, String str) {
        if (!(context == null || this.mMethodEffectSdkFlushAlgorithmModelFiles == null)) {
            try {
                this.mMethodEffectSdkFlushAlgorithmModelFiles.invoke(null, new Object[]{context, str});
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("onFlushAlgorithmModelFiles failed ctx ");
                sb.append(context);
                sb.append(" path ");
                sb.append(str);
                sb.append(" cause:");
                sb.append(Log.getStackTraceString(th));
                AVLog.ioe("VideoEffectUtilsWrapper", sb.toString());
            }
        }
    }

    public static void releaseFinder(Object obj, long j) {
        if (obj != null && get().mResourceFinderRelease != null) {
            try {
                get().mResourceFinderRelease.invoke(obj, new Object[]{Long.valueOf(j)});
            } catch (Throwable th) {
                AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(th));
            }
        }
    }

    private Object onCreateResourceFinder(AssetManager assetManager, String str) {
        Throwable th;
        if (this.mResourceFinder == null || assetManager == null) {
            th = null;
        } else {
            try {
                return this.mResourceFinder.getConstructor(new Class[]{AssetManager.class, String.class}).newInstance(new Object[]{assetManager, str});
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th != null) {
            StringBuilder sb = new StringBuilder("Create effectsdk resourcefinder failed ");
            sb.append(Log.getStackTraceString(th));
            AVLog.ioe("VideoEffectUtilsWrapper", sb.toString());
        }
        return null;
    }
}
