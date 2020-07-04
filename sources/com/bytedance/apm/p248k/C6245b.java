package com.bytedance.apm.p248k;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.apm.C6159b;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p252m.C6273b;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.b */
public final class C6245b extends C6244a {

    /* renamed from: a */
    private BroadcastReceiver f18374a;

    /* renamed from: d */
    private IntentFilter f18375d;

    /* renamed from: e */
    private boolean f18376e;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo14865c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo14866d() {
        return 0;
    }

    /* renamed from: a */
    private void m19356a() {
        if (!this.f18376e) {
            try {
                C6174c.m19129a().registerReceiver(this.f18374a, this.f18375d);
                this.f18376e = true;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    private void m19357i() {
        if (this.f18376e) {
            try {
                C6174c.m19129a().unregisterReceiver(this.f18374a);
                this.f18376e = false;
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14863b() {
        this.f18374a = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                final float intExtra = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                if (C6174c.m19149g()) {
                    StringBuilder sb = new StringBuilder("BatteryTemperatureColle:  ");
                    sb.append(intExtra);
                    String[] strArr = {sb.toString()};
                }
                final String topActivityClassName = ActivityLifeObserver.getInstance().getTopActivityClassName();
                if (!TextUtils.isEmpty(topActivityClassName)) {
                    C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                        public final void run() {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("battery_temperature", (double) intExtra);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("scene", topActivityClassName);
                                C6159b.m19118b("temperature", jSONObject, jSONObject2, null);
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        };
        this.f18375d = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    /* renamed from: a */
    public final void mo14861a(Activity activity) {
        super.mo14861a(activity);
        m19357i();
    }

    /* renamed from: b */
    public final void mo14864b(Activity activity) {
        super.mo14864b(activity);
        m19356a();
    }
}
