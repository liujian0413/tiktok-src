package com.p280ss.android.ugc.aweme.p1216fe.registry.p1224rn;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.sdk.webview.C20136d;
import com.p280ss.android.sdk.webview.C20139g;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.framework.bridge.C29954b;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27873e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.fe.registry.rn.AmeRNBridgeModule */
public class AmeRNBridgeModule extends ReactContextBaseJavaModule {
    private final C20136d mContextProviderFactory = new C20136d();

    /* renamed from: com.ss.android.ugc.aweme.fe.registry.rn.AmeRNBridgeModule$a */
    static class C28058a implements C20139g<AbsActivityContainer> {

        /* renamed from: a */
        private WeakReference<AbsActivityContainer> f73916a;

        public final void release() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public AbsActivityContainer mo53898a() {
            if (this.f73916a != null) {
                return (AbsActivityContainer) this.f73916a.get();
            }
            return null;
        }

        C28058a(AbsActivityContainer absActivityContainer) {
            if (absActivityContainer != null) {
                this.f73916a = new WeakReference<>(absActivityContainer);
            }
        }
    }

    public String getName() {
        return "RNBridge";
    }

    public AmeRNBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void call(String str, ReadableMap readableMap, Callback callback) {
        if (!TextUtils.isEmpty(str)) {
            UiThreadUtil.runOnUiThread(new C28059a(this, str, readableMap, callback));
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$call$0$AmeRNBridgeModule(String str, ReadableMap readableMap, Callback callback) {
        try {
            C29954b.m98216a(getReactApplicationContext()).mo76116a(str, readableMap, callback);
        } catch (Exception e) {
            C25871a.m85133a().mo67245a(e, "native");
            workaroundForDevMode(e, str, readableMap, callback);
            C27873e.f73441a.mo71353a(e);
        }
    }

    private void workaroundForDevMode(Exception exc, String str, ReadableMap readableMap, Callback callback) {
        if (C7163a.m22363a() && ReactInstance.isDev && exc.getMessage().contains("is not added")) {
            Activity g = C6405d.m19984g();
            if (g != null) {
                AbsActivityContainer absActivityContainer = null;
                if (g instanceof CrossPlatformActivity) {
                    absActivityContainer = ((CrossPlatformActivity) g).f68246a;
                }
                this.mContextProviderFactory.mo53897a(AbsActivityContainer.class, new C28058a(absActivityContainer));
                new C28060b(getReactApplicationContext()).mo71504a((Context) g, this.mContextProviderFactory);
            }
            try {
                C29954b.m98216a(getReactApplicationContext()).mo76116a(str, readableMap, callback);
            } catch (Exception unused) {
            }
        }
    }
}
