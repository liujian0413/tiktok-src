package com.p280ss.android.ugc.aweme.framework;

import android.app.Application;
import android.text.TextUtils;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.RNDegradeExceptionHandler;
import com.p280ss.android.ugc.aweme.framework.activity.C29948b;
import com.p280ss.android.ugc.aweme.framework.p1273b.C29950a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.framework.ReactInstance */
public class ReactInstance {
    public static boolean isDev = false;
    private static Application mApplication;
    private static C29950a mConfig;
    private static Map<String, C29943a> mDevReactNativeHostMap = new HashMap();
    private static C29943a mPreparedReactNativeHost;
    private static C29957d mProxy;
    private static Map<String, C29943a> mReactNativeHostMap = new HashMap();
    private static Set<C29948b> mReactViews = new HashSet();

    private ReactInstance() {
    }

    public static C29950a getConfig() {
        return mConfig;
    }

    public static C29957d getProxy() {
        return mProxy;
    }

    public static void rePrepareReactContext() {
        mPreparedReactNativeHost = null;
        invokePreparedReactContext();
    }

    public static Map<String, C29943a> getHostMap() {
        if (isDev) {
            return mDevReactNativeHostMap;
        }
        return mReactNativeHostMap;
    }

    public static void invokePreparedReactContext() {
        C29943a aVar;
        if (mConfig.mo67293b() && !TextUtils.isEmpty(mProxy.mo67298a())) {
            if (mPreparedReactNativeHost == null) {
                if (isDev) {
                    aVar = new C29949b(mApplication);
                } else {
                    aVar = new C29943a(mApplication);
                }
                mPreparedReactNativeHost = aVar;
            }
            ReactInstanceManager reactInstanceManager = mPreparedReactNativeHost.getReactInstanceManager();
            if (reactInstanceManager.getCurrentReactContext() == null && !reactInstanceManager.hasStartedCreatingInitialContext()) {
                reactInstanceManager.createReactContextInBackground();
            }
        }
    }

    public static void attachReactView(C29948b bVar) {
        if (bVar != null) {
            mReactViews.add(bVar);
        }
    }

    public static ReactInstanceManager getReactInstanceManager(String str) {
        return getReactNativeHost(str).getReactInstanceManager();
    }

    public static C29948b getReactViewById(String str) {
        for (C29948b bVar : mReactViews) {
            if (bVar.mo67478a(str)) {
                return bVar;
            }
        }
        return null;
    }

    private static void recycleReactNativeHost(String str) {
        Map<String, C29943a> map;
        if (isDev) {
            map = mDevReactNativeHostMap;
        } else {
            map = mReactNativeHostMap;
        }
        C29943a aVar = (C29943a) map.get(str);
        if (aVar != null) {
            aVar.clear();
            map.remove(str);
        }
    }

    public static C29943a getReactNativeHost(String str) {
        Map<String, C29943a> map;
        if (isDev) {
            map = mDevReactNativeHostMap;
        } else {
            map = mReactNativeHostMap;
        }
        C29943a aVar = (C29943a) map.get(str);
        if (aVar == null) {
            if (mConfig.mo67293b()) {
                aVar = mPreparedReactNativeHost;
                if (aVar != null) {
                    mPreparedReactNativeHost = null;
                } else if (isDev) {
                    aVar = new C29949b(mApplication);
                } else {
                    aVar = new C29943a(mApplication);
                }
            } else if (isDev) {
                aVar = new C29949b(mApplication);
            } else {
                aVar = new C29943a(mApplication);
            }
            map.put(str, aVar);
            aVar.f78725c = str;
        }
        return aVar;
    }

    public static ReactInstanceManager getReactInstanceManager(String str, RNDegradeExceptionHandler rNDegradeExceptionHandler) {
        return getReactNativeHost(str, rNDegradeExceptionHandler).getReactInstanceManager();
    }

    public static void detachReactView(C29948b bVar, String str) {
        if (bVar != null) {
            mReactViews.remove(bVar);
            boolean z = true;
            Iterator it = mReactViews.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(((C29948b) it.next()).getReactId(), str)) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!TextUtils.isEmpty(str) && z) {
                recycleReactNativeHost(str);
            }
        }
    }

    public static C29943a getReactNativeHost(String str, RNDegradeExceptionHandler rNDegradeExceptionHandler) {
        Map<String, C29943a> map;
        if (isDev) {
            map = mDevReactNativeHostMap;
        } else {
            map = mReactNativeHostMap;
        }
        C29943a aVar = (C29943a) map.get(str);
        if (aVar == null) {
            if (mConfig.mo67293b()) {
                aVar = mPreparedReactNativeHost;
                if (aVar != null) {
                    mPreparedReactNativeHost = null;
                } else if (isDev) {
                    aVar = new C29949b(mApplication);
                } else {
                    aVar = new C29943a(mApplication);
                }
            } else if (isDev) {
                aVar = new C29949b(mApplication);
            } else {
                aVar = new C29943a(mApplication);
            }
            map.put(str, aVar);
            aVar.f78725c = str;
            aVar.f78724b = rNDegradeExceptionHandler;
        }
        return aVar;
    }

    public static void initReactInstanceManager(Application application, C29950a aVar, C29957d dVar) {
        mApplication = application;
        mConfig = aVar;
        mProxy = dVar;
    }
}
