package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.C13098Ad;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

class DynamicLoaderFallback {
    public static final WeakHashMap<Object, AdListener> sListenersMap = new WeakHashMap<>();

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$a */
    static class C13110a {

        /* renamed from: a */
        public Method f34739a;

        /* renamed from: b */
        private final InvocationHandler f34740b;

        private C13110a() {
            this.f34740b = new InvocationHandler() {
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    if (!"toString".equals(method.getName())) {
                        C13110a.this.f34739a = method;
                    }
                    return null;
                }
            };
        }

        /* renamed from: a */
        public final <T> T mo32233a(Class<T> cls) {
            return Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f34740b);
        }
    }

    DynamicLoaderFallback() {
    }

    static DynamicLoader makeFallbackLoader() {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final HashMap hashMap = new HashMap();
        C13110a aVar = new C13110a();
        DynamicLoader dynamicLoader = (DynamicLoader) aVar.mo32233a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList3.add(aVar.f34739a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList3.add(aVar.f34739a);
        dynamicLoader.createInstreamVideoAdViewApi(null, null, null, null);
        arrayList3.add(aVar.f34739a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList3.add(aVar.f34739a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList3.add(aVar.f34739a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = aVar.f34739a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        final Method method2 = aVar.f34739a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) aVar.mo32233a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(aVar.f34739a);
        nativeAdBaseApi.loadAd(null);
        arrayList.add(aVar.f34739a);
        nativeAdBaseApi.loadAdFromBid(null);
        arrayList.add(aVar.f34739a);
        nativeAdBaseApi.loadAdFromBid(null, null);
        arrayList.add(aVar.f34739a);
        nativeAdBaseApi.setAdListener(null, null);
        arrayList2.add(aVar.f34739a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) aVar.mo32233a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(aVar.f34739a);
        interstitialAdApi.loadAd(null);
        arrayList.add(aVar.f34739a);
        interstitialAdApi.loadAdFromBid(null, null);
        arrayList.add(aVar.f34739a);
        interstitialAdApi.setAdListener(null);
        arrayList2.add(aVar.f34739a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) aVar.mo32233a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(aVar.f34739a);
        rewardedVideoAdApi.loadAd(false);
        arrayList.add(aVar.f34739a);
        rewardedVideoAdApi.loadAdFromBid(null, false);
        arrayList.add(aVar.f34739a);
        rewardedVideoAdApi.setAdListener(null);
        arrayList2.add(aVar.f34739a);
        InstreamVideoAdViewApi instreamVideoAdViewApi = (InstreamVideoAdViewApi) aVar.mo32233a(InstreamVideoAdViewApi.class);
        instreamVideoAdViewApi.loadAd();
        arrayList.add(aVar.f34739a);
        instreamVideoAdViewApi.loadAdFromBid(null);
        arrayList.add(aVar.f34739a);
        instreamVideoAdViewApi.setAdListener(null);
        arrayList2.add(aVar.f34739a);
        AdViewApi adViewApi = (AdViewApi) aVar.mo32233a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(aVar.f34739a);
        adViewApi.loadAdFromBid(null);
        arrayList.add(aVar.f34739a);
        adViewApi.setAdListener(null);
        arrayList2.add(aVar.f34739a);
        final Method method3 = method;
        C131081 r0 = new InvocationHandler() {
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getReturnType().isPrimitive()) {
                    if (method.getReturnType().equals(Boolean.TYPE)) {
                        return Boolean.valueOf(false);
                    }
                    if (method.getReturnType().equals(Integer.TYPE)) {
                        return Integer.valueOf(-1);
                    }
                    if (method.getReturnType().equals(Byte.TYPE)) {
                        return Integer.valueOf(-1);
                    }
                    if (method.getReturnType().equals(Short.TYPE)) {
                        return Integer.valueOf(-1);
                    }
                    if (method.getReturnType().equals(Long.TYPE)) {
                        return Long.valueOf(-1);
                    }
                    if (method.getReturnType().equals(Double.TYPE)) {
                        return Double.valueOf(0.0d);
                    }
                    if (method.getReturnType().equals(Float.TYPE)) {
                        return Float.valueOf(0.0f);
                    }
                    if (method.getReturnType().equals(Character.TYPE)) {
                        return Integer.valueOf(0);
                    }
                    if (!method.getReturnType().equals(Void.TYPE)) {
                        return null;
                    }
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (DynamicLoaderFallback.equalsMethods(method, (Method) it.next())) {
                                DynamicLoaderFallback.sListenersMap.put(obj, objArr[0]);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) || !DynamicLoaderFallback.reportError(obj, hashMap))) {
                    }
                    return null;
                } else if (method.getReturnType().equals(String.class)) {
                    return "";
                } else {
                    Object newProxyInstance = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                    for (Method equalsMethods : arrayList3) {
                        if (DynamicLoaderFallback.equalsMethods(method, equalsMethods)) {
                            for (C13098Ad ad : objArr) {
                                if (ad instanceof C13098Ad) {
                                    hashMap.put(newProxyInstance, ad);
                                }
                            }
                        }
                    }
                    if (DynamicLoaderFallback.equalsMethods(method, method3)) {
                        hashMap.put(objArr[1], objArr[0]);
                    }
                    if (DynamicLoaderFallback.equalsMethods(method, method2)) {
                        hashMap.put(objArr[1], objArr[0]);
                    }
                    return newProxyInstance;
                }
            }
        };
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, r0);
    }

    public static boolean equalsMethods(Method method, Method method2) {
        if (!method.getDeclaringClass().equals(method2.getDeclaringClass()) || !method.getName().equals(method2.getName())) {
            return false;
        }
        return true;
    }

    public static boolean reportError(Object obj, Map<Object, C13098Ad> map) {
        final AdListener adListener = (AdListener) sListenersMap.get(obj);
        final C13098Ad ad = (C13098Ad) map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                adListener.onError(ad, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
            }
        }, 500);
        return true;
    }
}
