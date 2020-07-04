package com.p280ss.android.ugc.aweme.p339sp;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;

/* renamed from: com.ss.android.ugc.aweme.sp.g */
public class C7240g extends ContextWrapper {
    public C7240g(Context context) {
        super(context);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        return SharedPreferencesManager.getInstance().getSharedPreferences(this, str);
    }
}
