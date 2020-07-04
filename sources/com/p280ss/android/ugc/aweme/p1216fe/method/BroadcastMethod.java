package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.bullet.BulletEventObserver.C23556a;
import com.p280ss.android.ugc.aweme.commercialize.star.C25086a;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26577d;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26584k;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27036bd;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27704h;
import com.p280ss.android.ugc.aweme.framework.C29959e;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.p1217a.C27864b;
import com.p280ss.android.ugc.aweme.p1216fe.p1217a.C27865c;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27868c;
import com.p280ss.android.ugc.aweme.poi.event.C35081d;
import com.p280ss.android.ugc.aweme.poi.event.C35082e;
import com.p280ss.android.ugc.aweme.profile.C35662a;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35670h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.greenrobot.eventbus.C7705c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.BroadcastMethod */
public class BroadcastMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public static void m91341a(JSONObject jSONObject) throws JSONException {
        C29959e.m98229a("notification", C27868c.m91294a(jSONObject));
        C42961az.m136380a(new C27994k("notification", jSONObject));
        C42961az.m136380a(new C23556a("notification", jSONObject));
        C6861a.m21338g().notifyFromRnAndH5(jSONObject);
        if (TextUtils.equals(jSONObject.getString("eventName"), "activity_view")) {
            C35662a.m115265a().mo90504a(jSONObject.getJSONObject("data"));
            C35662a.m115265a().mo90505a(false);
            C35662a.m115265a().mo90507b(false);
            C35662a.m115265a().mo90510c(false);
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "passPlaceholder")) {
            C7705c.m23799a().mo20394d(new C26577d(jSONObject.getJSONObject("data").getString("placeholder")));
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "updateKeyword")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String string = jSONObject2.getString("search_word");
            String string2 = jSONObject2.getString("type");
            Word word = new Word();
            word.setWord(string);
            C7705c.m23799a().mo20394d(new C26584k(word, string2));
        } else if (TextUtils.equals(jSONObject.getString("eventName"), "scrollToTop")) {
            C7705c.m23799a().mo20394d(new C27036bd());
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "proAccountUsePhone")) {
            C7705c.m23799a().mo20394d(new C27864b());
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "switchToProAccount")) {
            C7705c.m23799a().mo20394d(new C27865c());
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "poi_event_spu_collect_status")) {
            C42961az.m136380a(new C27704h());
            C42961az.m136380a(new C35670h());
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "movieDetailStateChange")) {
            C42961az.m136380a(new C35670h());
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "anchor_TCM_content")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                C25086a.m82626b(optJSONObject.optString("starAtlasHashTag"));
                C25086a.m82625a(optJSONObject.optString("campaignInfo"));
            }
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "poi_qa_update")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            C42961az.m136380a(new C35081d(new C35082e(jSONObject3.optString("poi_id", ""), jSONObject3.optString("question_id", ""), jSONObject3.optString("answer_id", ""), jSONObject3.optInt("action", -1))));
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        try {
            m91341a(jSONObject);
            aVar.mo71363a((Object) "");
        } catch (JSONException unused) {
            aVar.mo71362a(-1, "");
        }
    }
}
