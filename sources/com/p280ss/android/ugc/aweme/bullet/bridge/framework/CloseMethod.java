package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import com.bytedance.ies.bullet.core.kit.BulletKitType;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge.Access;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.live.p1359a.C32432a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod */
public final class CloseMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23589a f62244c = new C23589a(null);

    /* renamed from: d */
    private final String f62245d = "close";

    /* renamed from: e */
    private Access f62246e = Access.PUBLIC;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod$a */
    public static final class C23589a {
        private C23589a() {
        }

        public /* synthetic */ C23589a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final Access mo25126b() {
        return this.f62246e;
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62245d;
    }

    /* renamed from: a */
    public final void mo25139a(Access access) {
        C7573i.m23587b(access, "<set-?>");
        this.f62246e = access;
    }

    public CloseMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        boolean z;
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        if (mo61492d() == BulletKitType.WEB) {
            String optString = jSONObject.optString("reactId");
            CharSequence charSequence = optString;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                optString = null;
            }
            if (optString != null) {
                Activity a = mo61489a(optString);
                if (a != null) {
                    a.finish();
                }
            }
            if (!(this.f28552b instanceof Activity) || ((Activity) this.f28552b).isFinishing()) {
                C42961az.m136380a(new C32432a(C32432a.f84603b));
            } else {
                ((Activity) this.f28552b).finish();
            }
        } else {
            Activity a2 = mo61489a(jSONObject.optString("reactId"));
            if (a2 != null) {
                a2.finish();
                aVar.mo61494a(C29956a.f78748a);
                return;
            }
            aVar.mo61493a(C29956a.f78751d, "the target activity doesn't exist");
        }
    }
}
