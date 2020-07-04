package com.bytedance.ies.bullet.core.kit.bridge;

import com.bytedance.ies.bullet.core.kit.bridge.IBridge.C10360a;
import com.bytedance.ies.bullet.core.model.C10401a;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONObject;

public interface IBridgeScope extends C10401a {

    public static final class BridgeNotFoundException extends Exception {
        public BridgeNotFoundException(String str) {
            C7573i.m23587b(str, "scope");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found");
            super(sb.toString());
        }
    }

    /* renamed from: a */
    void mo25130a(IBridgeScope iBridgeScope, boolean z);

    /* renamed from: a */
    void mo25131a(List<String> list, JSONObject jSONObject, C10360a aVar, C7562b<? super Throwable, C7581n> bVar);

    /* renamed from: a */
    void mo25132a(C7563m<? super List<? extends IBridgeScope>, ? super IBridge, C7581n> mVar);

    /* renamed from: b */
    String mo25133b();

    /* renamed from: c */
    Map<String, IBridgeScope> mo25134c();

    /* renamed from: d */
    Map<String, IBridge> mo25135d();
}
