package com.p280ss.android.ugc.aweme.bullet;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.text.TextUtils;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.kit.bridge.C10377h;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24465c;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.BulletEventObserver */
public final class BulletEventObserver implements C0042h {

    /* renamed from: a */
    public C10382g f62152a;

    /* renamed from: b */
    public final C10403b f62153b;

    /* renamed from: c */
    private boolean f62154c;

    /* renamed from: d */
    private long f62155d;

    /* renamed from: com.ss.android.ugc.aweme.bullet.BulletEventObserver$a */
    public static final class C23556a {

        /* renamed from: a */
        public final String f62156a;

        /* renamed from: b */
        public final JSONObject f62157b;

        public C23556a(String str, JSONObject jSONObject) {
            C7573i.m23587b(str, "event");
            this.f62156a = str;
            this.f62157b = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.BulletEventObserver$b */
    public static final class C23557b implements C10377h {

        /* renamed from: a */
        final /* synthetic */ String f62158a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f62159b;

        /* renamed from: c */
        private final String f62160c;

        /* renamed from: d */
        private final JSONObject f62161d;

        /* renamed from: a */
        public final String mo25151a() {
            return this.f62160c;
        }

        /* renamed from: b */
        public final JSONObject mo25152b() {
            return this.f62161d;
        }

        C23557b(String str, JSONObject jSONObject) {
            this.f62158a = str;
            this.f62159b = jSONObject;
            this.f62160c = str;
            this.f62161d = jSONObject;
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C7705c.m23799a().mo20393c((Object) this);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        this.f62154c = false;
        m77357a("viewDisappeared", null);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        this.f62154c = true;
        m77357a("viewAppeared", null);
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
        C10382g gVar;
        C7705c.m23799a().mo20389a((Object) this);
        this.f62155d = System.currentTimeMillis();
        C10403b bVar = this.f62153b;
        if (bVar != null) {
            gVar = (C10382g) bVar.mo25202b(C10382g.class);
        } else {
            gVar = null;
        }
        this.f62152a = gVar;
    }

    public BulletEventObserver(C10403b bVar) {
        this.f62153b = bVar;
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C23556a aVar) {
        String str;
        C7573i.m23587b(aVar, "event");
        StringBuilder sb = new StringBuilder("BulletEventObserver onJsBroadcastEvent event:");
        JSONObject jSONObject = aVar.f62157b;
        String str2 = null;
        if (jSONObject != null) {
            str = jSONObject.optString("eventName");
        } else {
            str = null;
        }
        sb.append(str);
        if (this.f62154c) {
            CharSequence charSequence = "goods_rn_page_monitor";
            JSONObject jSONObject2 = aVar.f62157b;
            if (jSONObject2 != null) {
                str2 = jSONObject2.optString("eventName");
            }
            if (TextUtils.equals(charSequence, str2)) {
                C24465c cVar = new C24465c();
                try {
                    JSONObject jSONObject3 = aVar.f62157b;
                    if (jSONObject3 != null) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
                        if (jSONObject4 != null) {
                            cVar.mo63547b(Long.valueOf(jSONObject4.optString("interact_render_ts")).longValue() - this.f62155d);
                            cVar.mo63548b(jSONObject4.optString("page_id"));
                            cVar.mo63545a(Long.valueOf(jSONObject4.optString("ender_render_ts")).longValue() - this.f62155d);
                            String optString = jSONObject4.optString("session_id");
                            C7573i.m23582a((Object) optString, "it.optString(\"session_id\")");
                            cVar.mo63546a(optString);
                            cVar.mo63549c();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        m77357a("notification", aVar.f62157b);
    }

    /* renamed from: a */
    private final void m77357a(String str, JSONObject jSONObject) {
        C10382g gVar = this.f62152a;
        if (gVar != null) {
            gVar.onEvent(new C23557b(str, jSONObject));
        }
    }
}
