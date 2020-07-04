package com.p280ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34974d;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34970f;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.ah */
public final class C43191ah {
    /* renamed from: a */
    private static C34970f m136944a(C34974d dVar) {
        if (dVar == null) {
            return null;
        }
        C34970f t = dVar.mo88651t();
        if (t == null) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    private static C34970f m136945a(C44960f fVar) {
        if (fVar == null) {
            return null;
        }
        C34970f ah = fVar.mo71676ah();
        if (ah == null) {
            return null;
        }
        return ah;
    }

    /* renamed from: a */
    private static String m136946a(C34970f fVar, String str) {
        if (fVar == null || fVar.f91265b != null || TextUtils.isEmpty(fVar.f91264a)) {
            return null;
        }
        try {
            return new JSONObject(fVar.f91264a).getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m136947a(C34974d dVar, String str) {
        return m136946a(m136944a(dVar), str);
    }

    /* renamed from: a */
    public static String m136948a(C44960f fVar, String str) {
        return m136946a(m136945a(fVar), str);
    }
}
