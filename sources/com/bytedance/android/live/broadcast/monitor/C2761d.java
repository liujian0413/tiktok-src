package com.bytedance.android.live.broadcast.monitor;

import android.os.Build.VERSION;
import com.bytedance.android.live.base.p118b.C2325a;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.stream.p143b.C2965a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.live.model.Camera2AB;
import com.bytedance.android.livesdk.p368g.p370b.C7853a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.IPropertyCache;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.monitor.d */
public final class C2761d implements C2965a {

    /* renamed from: a */
    private IPropertyCache f8741a = ((C9439a) C3596c.m13172a(C9439a.class)).mo23190b();

    /* renamed from: c */
    private String m11040c(List<FilterModel> list) {
        return ((FilterModel) list.get(m11038a(list))).getName();
    }

    /* renamed from: a */
    private static int m11038a(List<FilterModel> list) {
        int intValue = ((Integer) C8946b.f24361M.mo22117a()).intValue();
        if (intValue >= list.size() || intValue >= list.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    /* renamed from: b */
    private String m11039b(List<FilterModel> list) {
        if (list.isEmpty()) {
            return "";
        }
        return ((FilterModel) list.get(m11038a(list))).getFilterPath();
    }

    /* renamed from: a */
    public final void mo9463a(String str, JSONObject jSONObject) {
        if (!"live_client_monitor_log".equals(str)) {
            ((C2325a) C3596c.m13172a(C2325a.class)).mo8144a(str, jSONObject);
            return;
        }
        try {
            int cameraType = ((Camera2AB) LiveConfigSettingKeys.CAMERA_AB_SETTING_KEY.mo10240a()).getCameraType();
            if (VERSION.SDK_INT >= 28) {
                cameraType = 2;
            }
            jSONObject.put("camera", cameraType);
            List<FilterModel> list = C2624k.m10736a().f8419b;
            if (!C6311g.m19573a(list)) {
                jSONObject.put("filter_opened", !C6319n.m19593a(m11039b(list)));
                jSONObject.put("filter_name", m11040c(list));
            }
            jSONObject.put("beauty_white", (double) (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * ((Float) C8946b.f24362N.mo22117a()).floatValue()));
            jSONObject.put("beauty_skin", (double) (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21218b.f21222a * ((Float) C8946b.f24363O.mo22117a()).floatValue()));
            jSONObject.put("beauty_eye", (double) (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21219c.f21222a * ((Float) C8946b.f24364P.mo22117a()).floatValue()));
            jSONObject.put("beauty_face", (double) (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21220d.f21222a * ((Float) C8946b.f24365Q.mo22117a()).floatValue()));
        } catch (Throwable th) {
            C3166a.m11963b("StreamLog", th);
        }
        try {
            jSONObject.put("live_platform_version", 1380);
        } catch (Throwable th2) {
            C3166a.m11963b("StreamLog", th2);
        }
        ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController().mo10503a(jSONObject);
    }
}
