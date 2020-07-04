package com.p280ss.android.ugc.aweme.bullet.bridge;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import com.bytedance.ies.bullet.core.C10331b;
import com.bytedance.ies.bullet.core.kit.BulletKitType;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.kit.bridge.C10377h;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge.C10360a;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.p551ui.common.C10689d;
import com.bytedance.ies.bullet.p551ui.common.p552a.C10676a;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10680b;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridge */
public abstract class BaseBridge extends C10676a implements C0042h {

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridge$a */
    public interface C23565a {
        /* renamed from: a */
        void mo61493a(int i, String str);

        /* renamed from: a */
        void mo61494a(Object obj);

        /* renamed from: a */
        void mo61495a(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridge$b */
    public static final class C23566b implements C23565a {

        /* renamed from: a */
        final /* synthetic */ C10360a f62168a;

        C23566b(C10360a aVar) {
            this.f62168a = aVar;
        }

        /* renamed from: a */
        public final void mo61495a(JSONObject jSONObject) {
            try {
                this.f62168a.mo25129a(jSONObject);
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo61494a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("data", obj);
                this.f62168a.mo25129a(jSONObject);
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo61493a(int i, String str) {
            C10360a aVar = this.f62168a;
            if (str == null) {
                str = "";
            }
            aVar.mo25128a(i, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridge$c */
    public static final class C23567c implements C10377h {

        /* renamed from: a */
        final /* synthetic */ String f62169a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f62170b;

        /* renamed from: c */
        private final String f62171c;

        /* renamed from: d */
        private final JSONObject f62172d;

        /* renamed from: a */
        public final String mo25151a() {
            return this.f62171c;
        }

        /* renamed from: b */
        public final JSONObject mo25152b() {
            return this.f62172d;
        }

        C23567c(String str, JSONObject jSONObject) {
            this.f62169a = str;
            this.f62170b = jSONObject;
            this.f62171c = str;
            this.f62172d = jSONObject;
        }
    }

    /* renamed from: a */
    public abstract void mo61491a(JSONObject jSONObject, C23565a aVar) throws JSONException;

    /* renamed from: e */
    private C10382g mo61509e() {
        return (C10382g) this.f28074a.mo25202b(C10382g.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final BulletKitType mo61492d() {
        C10382g e = mo61509e();
        if (e != null) {
            BulletKitType d = e.mo25162d();
            if (d != null) {
                return d;
            }
        }
        return BulletKitType.RN;
    }

    public BaseBridge(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Activity mo61489a(String str) {
        if (str == null) {
            return null;
        }
        C10331b bVar = (C10331b) this.f28074a.mo25202b(C10331b.class);
        if (bVar != null) {
            C10382g a = bVar.mo25068a(str);
            if (a != null) {
                if (!(a instanceof C10680b)) {
                    a = null;
                }
                C10680b bVar2 = (C10680b) a;
                if (bVar2 != null) {
                    C10689d v = bVar2.mo25556v();
                    if (v != null) {
                        return v.mo25551a();
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61490a(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(jSONObject, "params");
        C10382g e = mo61509e();
        if (e != null) {
            e.onEvent(new C23567c(str, jSONObject));
        }
    }

    /* renamed from: a */
    public final void mo25125a(JSONObject jSONObject, C10360a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "callback");
        mo61491a(jSONObject, (C23565a) new C23566b(aVar));
    }
}
