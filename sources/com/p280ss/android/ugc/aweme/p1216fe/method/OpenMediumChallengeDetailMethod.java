package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.p280ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa;
import com.p280ss.android.ugc.aweme.video.preload.C43304i;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenMediumChallengeDetailMethod */
public final class OpenMediumChallengeDetailMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject == null) {
            aVar.mo71362a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("tag_id");
        if (optString == null) {
            optString = "";
        }
        jSONObject.optBoolean("is_commerce");
        Object opt = jSONObject.opt("log");
        if (opt != null) {
            JSONObject jSONObject2 = (JSONObject) opt;
            ChallengeAwemeList a = ChallengeApi.m77598a(optString, 0, 1, 2, false, "test");
            C7573i.m23582a((Object) a, "ChallengeApi.getChalleng…HOT_AWEME, false, \"test\")");
            Aweme aweme = (Aweme) a.items.get(0);
            Intent intent = new Intent((Context) this.f73443f.get(), DetailActivity.class);
            C7573i.m23582a((Object) aweme, "aweme");
            intent.putExtra("id", aweme.getAid());
            intent.putExtra("refer", "entertainment");
            intent.putExtra("video_from", "entertainment");
            intent.putExtra("previous_page", "entertainment");
            intent.putExtra("page_type", "entertainment");
            intent.putExtra("challenge_id", optString);
            DetailActivity.m86050a((Context) this.f73443f.get(), intent, (View) null);
            C43304i.m137380a(aweme);
            C41513aa.m132242a(jSONObject2.optString("enter_from"), jSONObject2.optString("entertainment_id"), jSONObject2.optString("type"), jSONObject2.optString(POIService.KEY_ORDER));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.json.JSONObject");
    }
}
