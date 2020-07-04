package com.bytedance.neverland;

import android.content.Context;
import com.bytedance.neverland.internal.NeverlandImpl;
import org.json.JSONObject;

public abstract class Neverland {
    public abstract boolean isTooMuchNativeCrash();

    public abstract Neverland report(String str);

    public abstract Neverland setCallback(String str, Callback callback);

    public abstract Neverland setEnable(boolean z);

    public abstract Neverland setMultiDexInfo(long j, boolean z, String str, JSONObject jSONObject);

    public abstract Neverland setUp(Context context, Config config);

    public static Neverland getInstance() {
        return NeverlandImpl.getInstance();
    }
}
