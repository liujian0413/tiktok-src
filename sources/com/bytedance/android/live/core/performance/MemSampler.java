package com.bytedance.android.live.core.performance;

import android.content.Context;
import android.os.Process;
import org.json.JSONObject;

public class MemSampler extends BaseSampler<JSONObject> {
    public void run() {
        JSONObject jSONObject = new JSONObject();
        if (this.f9892d != null && this.f9892d.get() != null) {
            C3221a.m12215a(jSONObject, (Context) this.f9892d.get(), Process.myPid());
            mo10119a(jSONObject);
            if (this.f9891c != null) {
                this.f9891c.postDelayed(this, (long) this.f9889a);
            }
        }
    }

    public MemSampler(int i, int i2) {
        super(i, 3000);
    }
}
