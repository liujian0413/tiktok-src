package com.bytedance.ies.bullet.kit.p261rn.internal;

import android.text.TextUtils;
import com.bytedance.ies.bullet.core.kit.bridge.C10375f;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge.C10360a;
import com.bytedance.ies.bullet.kit.p261rn.p546c.C10494b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "RNBridge")
/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.RnBridgeModule */
public final class RnBridgeModule extends ReactContextBaseJavaModule {
    public static final C10506a Companion = new C10506a(null);
    private final C10375f bridgeRegistry;

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.RnBridgeModule$a */
    public static final class C10506a {
        private C10506a() {
        }

        public /* synthetic */ C10506a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.RnBridgeModule$b */
    static final class C10507b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RnBridgeModule f28251a;

        /* renamed from: b */
        final /* synthetic */ String f28252b;

        /* renamed from: c */
        final /* synthetic */ ReadableMap f28253c;

        /* renamed from: d */
        final /* synthetic */ Callback f28254d;

        C10507b(RnBridgeModule rnBridgeModule, String str, ReadableMap readableMap, Callback callback) {
            this.f28251a = rnBridgeModule;
            this.f28252b = str;
            this.f28253c = readableMap;
            this.f28254d = callback;
        }

        public final void run() {
            C10375f bridgeRegistry = this.f28251a.getBridgeRegistry();
            if (bridgeRegistry != null) {
                String str = this.f28252b;
                JSONObject a = C10494b.m30890a(this.f28253c);
                C7573i.m23582a((Object) a, "JsonConvertHelper.reactToJSON(params)");
                bridgeRegistry.mo25141a(str, a, new C10360a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C10507b f28255a;

                    {
                        this.f28255a = r1;
                    }

                    /* renamed from: a */
                    public final void mo25129a(JSONObject jSONObject) {
                        C7573i.m23587b(jSONObject, "data");
                        try {
                            this.f28255a.f28254d.invoke(C10494b.m30888a(jSONObject));
                        } catch (JSONException unused) {
                        }
                    }

                    /* renamed from: a */
                    public final void mo25128a(int i, String str) {
                        C7573i.m23587b(str, "message");
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("code", i);
                        createMap.putString("message", str);
                        this.f28255a.f28254d.invoke(createMap);
                    }
                }, new C7562b<Throwable, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C10507b f28256a;

                    {
                        this.f28256a = r1;
                    }

                    /* renamed from: a */
                    private static void m30908a(Throwable th) {
                        C7573i.m23587b(th, "it");
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m30908a((Throwable) obj);
                        return C7581n.f20898a;
                    }
                });
            }
        }
    }

    public final C10375f getBridgeRegistry() {
        return this.bridgeRegistry;
    }

    public final String getName() {
        return "RNBridge";
    }

    public RnBridgeModule(ReactApplicationContext reactApplicationContext, C10375f fVar) {
        C7573i.m23587b(reactApplicationContext, "reactContext");
        super(reactApplicationContext);
        this.bridgeRegistry = fVar;
    }

    @ReactMethod
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        C7573i.m23587b(str, "func");
        C7573i.m23587b(readableMap, "params");
        C7573i.m23587b(callback, "callback");
        if (!TextUtils.isEmpty(str)) {
            UiThreadUtil.runOnUiThread(new C10507b(this, str, readableMap, callback));
        }
    }
}
