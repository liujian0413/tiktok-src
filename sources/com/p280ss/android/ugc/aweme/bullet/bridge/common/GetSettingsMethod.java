package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.setting.C37562ao;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod */
public final class GetSettingsMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23574a f62187c = new C23574a(null);

    /* renamed from: d */
    private final String f62188d = "getSettings";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod$a */
    public static final class C23574a {
        private C23574a() {
        }

        public /* synthetic */ C23574a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62188d;
    }

    public GetSettingsMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        try {
            C37562ao a = C37562ao.m120324a();
            C7573i.m23582a((Object) a, "SettingManager.inst()");
            aVar.mo61494a((Object) new JSONObject(a.f97975f));
        } catch (Exception unused) {
            aVar.mo61493a(-1, "");
        }
    }
}
