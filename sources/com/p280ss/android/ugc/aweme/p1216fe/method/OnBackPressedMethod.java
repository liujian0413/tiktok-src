package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.C25811a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod */
public final class OnBackPressedMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27898a f73497a = new C27898a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod$a */
    public static final class C27898a {
        private C27898a() {
        }

        public /* synthetic */ C27898a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod$b */
    static final class C27899b implements C25811a {

        /* renamed from: a */
        final /* synthetic */ OnBackPressedMethod f73498a;

        /* renamed from: b */
        final /* synthetic */ int f73499b;

        C27899b(OnBackPressedMethod onBackPressedMethod, int i) {
            this.f73498a = onBackPressedMethod;
            this.f73499b = i;
        }

        /* renamed from: a */
        public final boolean mo67106a() {
            this.f73498a.mo71359a("onBackPressed_event", new JSONObject(), 3);
            if (this.f73499b == 1) {
                return true;
            }
            return false;
        }
    }

    public OnBackPressedMethod() {
        this(null, 1, null);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m91400c();
    }

    /* renamed from: c */
    private final void m91400c() {
        Context context;
        WeakReference weakReference = this.f73443f;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        if (!(context instanceof CrossPlatformActivity)) {
            context = null;
        }
        CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) context;
        if (crossPlatformActivity != null) {
            crossPlatformActivity.f68247c = null;
        }
    }

    public OnBackPressedMethod(C11087a aVar) {
        super(aVar);
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

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        Context context;
        if (jSONObject != null) {
            WeakReference weakReference = this.f73443f;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            if (!(context instanceof CrossPlatformActivity)) {
                context = null;
            }
            CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) context;
            if (crossPlatformActivity != null) {
                int optInt = jSONObject.optInt("actionType", 0);
                if (optInt == 0) {
                    crossPlatformActivity.f68247c = null;
                } else {
                    crossPlatformActivity.f68247c = new C27899b(this, optInt);
                }
            }
        }
    }

    private /* synthetic */ OnBackPressedMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
