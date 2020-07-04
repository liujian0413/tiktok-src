package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@C6505uv
public final class anu extends MutableContextWrapper {

    /* renamed from: a */
    public Activity f40772a;

    /* renamed from: b */
    public Context f40773b;

    /* renamed from: c */
    private Context f40774c;

    public anu(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void setBaseContext(Context context) {
        this.f40774c = context.getApplicationContext();
        this.f40772a = context instanceof Activity ? (Activity) context : null;
        this.f40773b = context;
        super.setBaseContext(this.f40774c);
    }

    public final void startActivity(Intent intent) {
        if (this.f40772a != null) {
            this.f40772a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f40774c.startActivity(intent);
    }

    public final Object getSystemService(String str) {
        return this.f40773b.getSystemService(str);
    }
}
