package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7506ac;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenShortVideoMethod */
public final class OpenShortVideoMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27911a f73527a = new C27911a(null);

    /* renamed from: b */
    private String f73528b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenShortVideoMethod$a */
    public static final class C27911a {
        private C27911a() {
        }

        public /* synthetic */ C27911a(C7571f fVar) {
            this();
        }
    }

    public OpenShortVideoMethod() {
        this(null, 1, null);
    }

    /* renamed from: c */
    private void m91434c() {
        C42961az.m136383d(this);
    }

    /* renamed from: d */
    private void m91435d() {
        C42961az.m136382c(this);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m91434c();
    }

    public OpenShortVideoMethod(C11087a aVar) {
        super(aVar);
        this.f73528b = "";
        m91435d();
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
    public final void onEvent(C28012q qVar) {
        OpenShortVideoMethod openShortVideoMethod;
        C7573i.m23587b(qVar, "event");
        if (TextUtils.equals(qVar.f73774a, this.f73528b)) {
            openShortVideoMethod = this;
        } else {
            openShortVideoMethod = null;
        }
        OpenShortVideoMethod openShortVideoMethod2 = openShortVideoMethod;
        if (openShortVideoMethod2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", qVar.f73775b);
            jSONObject2.put("current_time", Float.valueOf(((float) C7551d.m23562a(qVar.f73776c, 0)) / 1000.0f));
            jSONObject2.put("current_item_id", qVar.f73777d);
            jSONObject2.put("react_id", openShortVideoMethod2.f73528b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openShortVideoMethod2.mo71359a("notification", jSONObject, 3);
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        boolean z;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject3 != null) {
            if (!jSONObject3.has("current_item_id") || !jSONObject3.has("item_ids") || !jSONObject3.has("react_id")) {
                z = false;
            } else {
                z = true;
            }
            JSONObject jSONObject4 = null;
            if (!z) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                this.f73528b = jSONObject3.optString("react_id");
                String optString = jSONObject3.optString("current_item_id");
                JSONArray optJSONArray = jSONObject3.optJSONArray("item_ids");
                String optString2 = jSONObject3.optString("enter_from");
                StringBuilder sb = new StringBuilder("aweme://aweme/detaillist/");
                sb.append(optString);
                C19290j jVar = new C19290j(sb.toString());
                jVar.mo51188a("react_session_id", this.f73528b);
                int length = optJSONArray.length();
                if (length > 0) {
                    String str = "ids";
                    Iterable b = C7551d.m23565b(0, length);
                    Collection arrayList = new ArrayList(C7525m.m23469a(b, 10));
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(optJSONArray.get(((C7506ac) it).mo19392a()));
                    }
                    jVar.mo51188a(str, C7525m.m23492a((List) arrayList, ",", null, null, 0, null, null, 62, null));
                }
                if (jSONObject3.has("current_time")) {
                    jSONObject2 = jSONObject3;
                } else {
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    jVar.mo51186a("video_current_position", (int) (jSONObject2.optDouble("current_time") * 1000.0d));
                }
                if (optString2 != null) {
                    jVar.mo51188a("enter_from", optString2);
                }
                if (jSONObject3.has("tracker_data")) {
                    jSONObject4 = jSONObject3;
                }
                if (jSONObject4 != null) {
                    jVar.mo51188a("tracker_data", jSONObject4.optString("tracker_data"));
                }
                jVar.mo51188a("video_from", "commerce_general");
                jVar.mo51188a("from_group_id", jSONObject3.optString("from_group_id"));
                jVar.mo51188a("carrier_type", jSONObject3.optString("carrier_type"));
                jVar.mo51188a("refer_commodity_id", jSONObject3.optString("refer_commodity_id"));
                jVar.mo51188a("data_type", jSONObject3.optString("data_type"));
                jVar.mo51188a("previous_page", jSONObject3.optString("previous_page"));
                C7195s.m22438a().mo18682a(jVar.toString());
            }
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("code", C29956a.f78750c);
        aVar.mo71365a(jSONObject5);
    }

    private /* synthetic */ OpenShortVideoMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
