package com.p280ss.android.ugc.aweme.framework.bridge;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.framework.bridge.b */
public final class C29954b {

    /* renamed from: a */
    private static Map<ReactContext, C29954b> f78746a = new HashMap();

    /* renamed from: b */
    private HashMap<String, C29953a> f78747b = new HashMap<>();

    /* renamed from: b */
    public static void m98217b(ReactContext reactContext) {
        f78746a.remove(reactContext);
    }

    /* renamed from: a */
    public static C29954b m98216a(ReactContext reactContext) {
        if (reactContext != null) {
            C29954b bVar = (C29954b) f78746a.get(reactContext);
            if (bVar != null) {
                return bVar;
            }
            C29954b bVar2 = new C29954b();
            f78746a.put(reactContext, bVar2);
            return bVar2;
        }
        throw new RuntimeException("reactContext should not be null!");
    }

    /* renamed from: a */
    public final C29954b mo76115a(String str, C29953a aVar) {
        this.f78747b.put(str, aVar);
        return this;
    }

    /* renamed from: a */
    public final void mo76116a(String str, ReadableMap readableMap, Callback callback) {
        C29953a aVar = (C29953a) this.f78747b.get(str);
        if (aVar != null) {
            aVar.mo67335a(str, readableMap, callback);
            return;
        }
        StringBuilder sb = new StringBuilder("method ");
        sb.append(str);
        sb.append("is not added!");
        throw new RuntimeException(sb.toString());
    }
}
