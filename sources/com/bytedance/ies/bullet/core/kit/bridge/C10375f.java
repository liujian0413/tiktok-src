package com.bytedance.ies.bullet.core.kit.bridge;

import com.bytedance.ies.bullet.core.kit.bridge.IBridge.C10360a;
import com.bytedance.ies.bullet.core.model.C10401a;
import com.bytedance.ies.bullet.core.model.pipeline.C10410d;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.core.kit.bridge.f */
public interface C10375f extends C10401a {
    /* renamed from: a */
    void mo25140a(C10375f fVar, boolean z);

    /* renamed from: a */
    void mo25141a(String str, JSONObject jSONObject, C10360a aVar, C7562b<? super Throwable, C7581n> bVar);

    /* renamed from: a */
    void mo25143a(C7563m<? super String, ? super IBridge, C7581n> mVar);

    /* renamed from: b */
    Map<String, IBridgeScope> mo25144b();

    /* renamed from: c */
    Map<String, IBridge> mo25145c();

    /* renamed from: d */
    C10410d<C10361a> mo25146d();
}
