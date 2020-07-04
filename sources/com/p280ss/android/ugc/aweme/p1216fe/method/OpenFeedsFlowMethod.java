package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.C27976a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.p356e.C7551d;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod */
public final class OpenFeedsFlowMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27905a f73511a = new C27905a(null);

    /* renamed from: b */
    private String f73512b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod$a */
    public static final class C27905a {
        private C27905a() {
        }

        public /* synthetic */ C27905a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod$b */
    static final class C27906b<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C7203u f73513a;

        /* renamed from: b */
        final /* synthetic */ OpenFeedsFlowMethod f73514b;

        /* renamed from: c */
        final /* synthetic */ BooleanRef f73515c;

        C27906b(C7203u uVar, OpenFeedsFlowMethod openFeedsFlowMethod, BooleanRef booleanRef) {
            this.f73513a = uVar;
            this.f73514b = openFeedsFlowMethod;
            this.f73515c = booleanRef;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m91421a());
        }

        /* renamed from: a */
        private boolean m91421a() {
            C28503s.m93679a((C25673a) this.f73514b.mo71374c());
            C7195s a = C7195s.m22438a();
            Object obj = this.f73514b.f73443f.get();
            if (obj != null) {
                return a.mo18679a((Activity) obj, this.f73513a.mo18695a());
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public OpenFeedsFlowMethod() {
        this(null, 1, null);
    }

    /* renamed from: d */
    private void m91416d() {
        C42961az.m136383d(this);
    }

    /* renamed from: e */
    private void m91417e() {
        C42961az.m136382c(this);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m91416d();
    }

    /* renamed from: c */
    public final C27976a mo71374c() {
        Context context;
        WeakReference weakReference = this.f73443f;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            return (C27976a) activity.findViewById(16908290).getTag(R.id.ov);
        }
        return null;
    }

    public OpenFeedsFlowMethod(C11087a aVar) {
        super(aVar);
        this.f73512b = "";
        m91417e();
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
        OpenFeedsFlowMethod openFeedsFlowMethod;
        C7573i.m23587b(qVar, "event");
        if (TextUtils.equals(qVar.f73774a, this.f73512b)) {
            openFeedsFlowMethod = this;
        } else {
            openFeedsFlowMethod = null;
        }
        OpenFeedsFlowMethod openFeedsFlowMethod2 = openFeedsFlowMethod;
        if (openFeedsFlowMethod2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", qVar.f73775b);
            jSONObject2.put("current_time", Float.valueOf(((float) C7551d.m23562a(qVar.f73776c, 0)) / 1000.0f));
            jSONObject2.put("current_item_id", qVar.f73777d);
            jSONObject2.put("react_id", openFeedsFlowMethod2.f73512b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openFeedsFlowMethod2.mo71359a("notification", jSONObject, 3);
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        int i;
        BooleanRef booleanRef = new BooleanRef();
        boolean z = false;
        booleanRef.element = false;
        if (jSONObject != null) {
            if (jSONObject.has("react_id") && jSONObject.has("aweme_id") && jSONObject.has("enter_from")) {
                z = true;
            }
            if (!z) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                String optString = jSONObject.optString("react_id");
                C7573i.m23582a((Object) optString, "optString(FIELD_REACT_ID)");
                this.f73512b = optString;
                String optString2 = jSONObject.optString("aweme_id");
                String optString3 = jSONObject.optString("enter_from");
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(optString2);
                C7203u a = C7203u.m22460a(sb.toString()).mo18694a("react_session_id", this.f73512b).mo18694a("page_type", optString3).mo18694a("refer", optString3).mo18694a("video_from", "from_feeds_operate").mo18694a("from_group_id", jSONObject.optString("from_group_id")).mo18694a("carrier_type", jSONObject.optString("carrier_type")).mo18694a("refer_commodity_id", jSONObject.optString("refer_commodity_id")).mo18694a("data_type", jSONObject.optString("data_type")).mo18694a("previous_page", jSONObject.optString("previous_page"));
                if (!jSONObject.has("current_time")) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    a.mo18693a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
                }
                C1592h.m7855a((Callable<TResult>) new C27906b<TResult>(a, this, booleanRef), C1592h.f5958b);
                booleanRef.element = true;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = "code";
        if (booleanRef.element) {
            i = C29956a.f78750c;
        } else {
            i = C29956a.f78751d;
        }
        jSONObject2.put(str, i);
        aVar.mo71365a(jSONObject2);
    }

    private /* synthetic */ OpenFeedsFlowMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
