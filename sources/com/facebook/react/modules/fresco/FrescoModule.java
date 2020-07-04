package com.facebook.react.modules.fresco;

import com.facebook.common.p686c.C13286a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.p710a.p711a.C13513a;
import com.facebook.imagepipeline.p717d.C13613j;
import com.facebook.imagepipeline.p717d.C13613j.C13615a;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.p724k.C13683ai;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner.Cleanable;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import java.util.HashSet;
import java.util.Set;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

@ReactModule(name = "FrescoModule")
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, Cleanable {
    private static boolean sHasBeenInitialized;
    private final boolean mClearOnDestroy;
    private C13613j mConfig;

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public String getName() {
        return "FrescoModule";
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public void clearSensitiveData() {
        C13380c.m39172c().mo33180b();
    }

    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            C13380c.m39172c().mo33175a();
        }
    }

    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            C13380c.m39168a(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            C13286a.m38860c("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, null);
    }

    private static C13613j getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).mo33200a();
    }

    public static C13615a getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new SystraceRequestListener());
        OkHttpClient createClient = OkHttpClientProvider.createClient();
        ((CookieJarContainer) createClient.cookieJar).setCookieJar(new JavaNetCookieJar(new ForwardingCookieHandler(reactContext)));
        return C13513a.m39766a(reactContext.getApplicationContext(), createClient).mo33196a((C13683ai) new ReactOkHttpNetworkFetcher(createClient)).mo33199a(false).mo33198a((Set<C13653c>) hashSet);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, C13613j jVar) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = jVar;
    }
}
