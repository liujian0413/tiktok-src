package com.p280ss.android.ugc.aweme.miniapp_api;

import android.app.Activity;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroShareInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.event.MpCommonEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.e */
public class C33445e {

    /* renamed from: h */
    private static volatile C33445e f87282h;

    /* renamed from: a */
    public MicroShareInfo f87283a;

    /* renamed from: b */
    public Map<String, Boolean> f87284b = new HashMap();

    /* renamed from: c */
    public String f87285c;

    /* renamed from: d */
    public String f87286d;

    /* renamed from: e */
    public JSONObject f87287e;

    /* renamed from: f */
    public C33446a f87288f;

    /* renamed from: g */
    public MpCommonEvent f87289g;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.e$a */
    public interface C33446a {
    }

    private C33445e() {
    }

    /* renamed from: a */
    public static C33445e m108183a() {
        if (f87282h == null) {
            synchronized (C33445e.class) {
                if (f87282h == null) {
                    f87282h = new C33445e();
                }
            }
        }
        return f87282h;
    }

    /* renamed from: a */
    public final void mo85683a(Activity activity) {
        if (this.f87289g != null) {
            Intent intent = new Intent();
            intent.putExtra("pay_key_result_params", this.f87289g);
            activity.setResult(-1, intent);
        }
    }
}
