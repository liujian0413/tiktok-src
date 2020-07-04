package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26105j;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26111o;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26114r;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.longvideonew.LongVideoActivity;
import com.p280ss.android.ugc.aweme.longvideonew.LongVideoActivity.C32763a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod */
public final class OpenLongVideoMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C43460a f112550b = new C43460a(null);

    /* renamed from: a */
    public String f112551a;

    /* renamed from: c */
    private C37121a f112552c;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod$a */
    public static final class C43460a {
        private C43460a() {
        }

        public /* synthetic */ C43460a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod$b */
    public static final class C43461b implements C26114r {

        /* renamed from: a */
        final /* synthetic */ OpenLongVideoMethod f112553a;

        /* renamed from: b */
        final /* synthetic */ C26111o f112554b;

        /* renamed from: c */
        final /* synthetic */ Context f112555c;

        /* renamed from: d */
        final /* synthetic */ String f112556d;

        /* renamed from: e */
        final /* synthetic */ int f112557e;

        /* renamed from: d */
        public final void mo67622d(Exception exc) {
            C7573i.m23587b(exc, "e");
            this.f112553a.mo71374c();
            this.f112554b.mo66535W_();
            this.f112554b.mo59134U_();
        }

        /* renamed from: a */
        public final void mo67610a(Aweme aweme) {
            C7573i.m23587b(aweme, "aweme");
            this.f112553a.mo71374c();
            C32763a aVar = LongVideoActivity.f85428a;
            Context context = this.f112555c;
            String str = this.f112556d;
            if (str == null) {
                str = "poi_mba";
            }
            String str2 = str;
            int i = this.f112557e;
            String str3 = this.f112553a.f112551a;
            if (str3 == null) {
                C7573i.m23580a();
            }
            aVar.mo84272a(context, aweme, str2, 0, i, str3);
            this.f112554b.mo66535W_();
            this.f112554b.mo59134U_();
        }

        C43461b(OpenLongVideoMethod openLongVideoMethod, C26111o oVar, Context context, String str, int i) {
            this.f112553a = openLongVideoMethod;
            this.f112554b = oVar;
            this.f112555c = context;
            this.f112556d = str;
            this.f112557e = i;
        }
    }

    public OpenLongVideoMethod() {
        this(null, 1, null);
    }

    /* renamed from: d */
    private void m137913d() {
        C42961az.m136383d(this);
    }

    /* renamed from: e */
    private void m137914e() {
        C42961az.m136382c(this);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m137913d();
    }

    /* renamed from: c */
    public final void mo71374c() {
        if (this.f112552c != null) {
            C37121a aVar = this.f112552c;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (aVar.isShowing()) {
                C37121a aVar2 = this.f112552c;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                aVar2.dismiss();
            }
        }
    }

    public OpenLongVideoMethod(C11087a aVar) {
        super(aVar);
        this.f112551a = "";
        m137914e();
    }

    /* renamed from: a */
    private final void m137911a(Context context) {
        String str;
        Resources resources = context.getResources();
        if (resources != null) {
            str = resources.getString(R.string.c4f);
        } else {
            str = null;
        }
        this.f112552c = C37121a.m119327a(context, str);
        C37121a aVar = this.f112552c;
        if (aVar == null) {
            C7573i.m23580a();
        }
        aVar.setIndeterminate(false);
    }

    /* renamed from: b */
    public final BaseCommonJavaMethod mo71360b(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        Context context = (Context) weakReference.get();
        if (context instanceof C0043i) {
            ((C0043i) context).getLifecycle().mo55a(this);
        }
        BaseCommonJavaMethod b = super.mo71360b(weakReference);
        C7573i.m23582a((Object) b, "super.attach(contextRef)");
        return b;
    }

    @C7709l
    public final void onEvent(C43527w wVar) {
        OpenLongVideoMethod openLongVideoMethod;
        C7573i.m23587b(wVar, "event");
        if (TextUtils.equals(wVar.f112692a, this.f112551a)) {
            openLongVideoMethod = this;
        } else {
            openLongVideoMethod = null;
        }
        OpenLongVideoMethod openLongVideoMethod2 = openLongVideoMethod;
        if (openLongVideoMethod2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", wVar.f112693b);
            jSONObject2.put("current_time", Float.valueOf(((float) C7551d.m23562a(wVar.f112694c, 0)) / 1000.0f));
            jSONObject2.put("current_item_id", wVar.f112695d);
            jSONObject2.put("react_id", openLongVideoMethod2.f112551a);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openLongVideoMethod2.mo71359a("notification", jSONObject, 3);
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        if (jSONObject != null) {
            if (!jSONObject.has("aweme_id")) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                this.f112551a = jSONObject.optString("react_id");
                String optString = jSONObject.optString("aweme_id");
                double optDouble = jSONObject.optDouble("current_time");
                String optString2 = jSONObject.optString("enter_from");
                WeakReference weakReference = this.f73443f;
                if (weakReference != null) {
                    Context context = (Context) weakReference.get();
                    if (context != null) {
                        C7573i.m23582a((Object) context, "this");
                        C7573i.m23582a((Object) optString, "awemeId");
                        m137912a(context, optString, (int) (optDouble * 1000.0d), optString2);
                    }
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", C29956a.f78750c);
        aVar.mo71365a(jSONObject2);
    }

    private /* synthetic */ OpenLongVideoMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }

    /* renamed from: a */
    private final void m137912a(Context context, String str, int i, String str2) {
        m137911a(context);
        C26111o oVar = new C26111o();
        C43461b bVar = new C43461b(this, oVar, context, str2, i);
        oVar.mo66537a(bVar);
        oVar.mo66536a(new C26105j());
        oVar.mo56976a(str);
    }
}
