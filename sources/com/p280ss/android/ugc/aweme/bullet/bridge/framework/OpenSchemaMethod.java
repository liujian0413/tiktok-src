package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.bullet.core.kit.BulletKitType;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge.Access;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.bullet.C23563b;
import com.p280ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27995l;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C43011cf;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod */
public final class OpenSchemaMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23595a f62257c = new C23595a(null);

    /* renamed from: d */
    private final String f62258d = "openSchema";

    /* renamed from: e */
    private Access f62259e = Access.PROTECT;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod$a */
    public static final class C23595a {
        private C23595a() {
        }

        public /* synthetic */ C23595a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod$b */
    static final class C23596b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f62260a;

        /* renamed from: b */
        final /* synthetic */ String f62261b;

        /* renamed from: c */
        final /* synthetic */ C23565a f62262c;

        C23596b(String str, String str2, C23565a aVar) {
            this.f62260a = str;
            this.f62261b = str2;
            this.f62262c = aVar;
        }

        public final void run() {
            String str;
            IBulletService a = C23563b.m77362a();
            String str2 = this.f62260a;
            if (str2 == null) {
                str2 = "";
            }
            Activity activityById = a.getActivityById(str2);
            if (TextUtils.isEmpty(this.f62261b) || activityById == null) {
                this.f62262c.mo61493a(C29956a.f78751d, "schema is not legal");
                return;
            }
            String str3 = this.f62261b;
            if (str3 != null && C7634n.m23721b(str3, "aweme://live/", false)) {
                Uri parse = Uri.parse(this.f62261b);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    C22912d.f60645e.mo59887a((Context) activityById, C7634n.m23711a(this.f62261b, "aweme", C22909c.f60637a, false), (String) null);
                    this.f62262c.mo61494a((Object) new JSONObject());
                    return;
                }
                this.f62262c.mo61493a(C29956a.f78751d, "");
            } else if (C43011cf.m136512a(this.f62261b)) {
                if (C32430a.m105071h()) {
                    this.f62262c.mo61494a((Object) new JSONObject());
                } else {
                    this.f62262c.mo61493a(C29956a.f78751d, "");
                }
            } else if (C27995l.m91593a(this.f62261b)) {
                this.f62262c.mo61494a((Object) new JSONObject());
            } else {
                boolean a2 = C7195s.m22438a().mo18679a(activityById, this.f62261b);
                if (!a2) {
                    String str4 = this.f62261b;
                    if (str4 != null) {
                        str = C7634n.m23711a(str4, "aweme", C22909c.f60637a, false);
                    } else {
                        str = null;
                    }
                    a2 = C22912d.f60645e.mo59887a((Context) activityById, str, (String) null);
                }
                if (a2) {
                    this.f62262c.mo61494a((Object) new JSONObject());
                } else {
                    this.f62262c.mo61493a(C29956a.f78751d, "");
                }
            }
        }
    }

    /* renamed from: b */
    public final Access mo25126b() {
        return this.f62259e;
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62258d;
    }

    /* renamed from: a */
    public final void mo25139a(Access access) {
        C7573i.m23587b(access, "<set-?>");
        this.f62259e = access;
    }

    public OpenSchemaMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: b */
    private final void m77469b(String str) {
        String str2;
        if (!(this.f28552b instanceof Activity)) {
            C7195s.m22438a().mo18682a(str);
        } else if (!C27995l.m91593a(str) && !C7195s.m22438a().mo18679a((Activity) this.f28552b, str)) {
            if (str != null) {
                str2 = C7634n.m23711a(str, "aweme", C22909c.f60637a, false);
            } else {
                str2 = null;
            }
            C22912d.f60645e.mo59887a(this.f28552b, str2, (String) null);
        }
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        String optString = jSONObject.optString("reactId");
        String optString2 = jSONObject.optString("schema");
        if (mo61492d() == BulletKitType.WEB) {
            m77469b(optString2);
        } else {
            m77468a(optString, optString2, aVar);
        }
    }

    /* renamed from: a */
    private static void m77468a(String str, String str2, C23565a aVar) {
        UiThreadUtil.runOnUiThread(new C23596b(str, str2, aVar));
    }
}
