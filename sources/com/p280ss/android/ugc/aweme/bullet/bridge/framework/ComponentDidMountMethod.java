package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.core.kit.BulletKitType;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod */
public final class ComponentDidMountMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23590a f62247c = new C23590a(null);

    /* renamed from: d */
    private final String f62248d = "componentDidMount";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod$a */
    public static final class C23590a {
        private C23590a() {
        }

        public /* synthetic */ C23590a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62248d;
    }

    public ComponentDidMountMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        if (mo61492d() != BulletKitType.WEB) {
        }
    }
}
