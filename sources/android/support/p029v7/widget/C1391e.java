package android.support.p029v7.widget;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.apm.C6159b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import org.json.JSONObject;

/* renamed from: android.support.v7.widget.e */
final class C1391e {
    /* renamed from: a */
    static void m6888a(AppCompatButton appCompatButton) {
        try {
            appCompatButton.ab_();
        } catch (Exception e) {
            if (!C7163a.m22363a()) {
                C6921a.m21559a((Throwable) e);
                JSONObject jSONObject = new JSONObject();
                View view = appCompatButton;
                jSONObject.put("targetViewId", view.getId());
                jSONObject.put("targetViewClassName", view.getClass().getName());
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    jSONObject.put("targetParentViewId", ((ViewGroup) parent).getId());
                    jSONObject.put("targetParentViewClassName", ((ViewGroup) parent).getClass().getName());
                }
                Activity g = C6405d.m19984g();
                jSONObject.put("currentActivity", g != null ? g.getClass().getName() : "");
                jSONObject.put("errorMsg", Log.getStackTraceString(e));
                C6159b.m19112a("detail_view_animation_crash", (JSONObject) null, (JSONObject) null, jSONObject);
            } else {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
