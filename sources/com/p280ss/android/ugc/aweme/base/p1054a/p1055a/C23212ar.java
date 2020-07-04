package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ar */
final class C23212ar implements IPublishPermissionCache {

    /* renamed from: a */
    private Context f61199a;

    /* renamed from: b */
    private SharedPreferences f61200b = C7285c.m22838a(this.f61199a, "PublishPermissionManager", 0);

    public final int getPublishPermission(int i) {
        return this.f61200b.getInt("publish_permission", i);
    }

    public final void setPublishPermission(int i) {
        Editor edit = this.f61200b.edit();
        edit.putInt("publish_permission", i);
        edit.apply();
    }

    public C23212ar(Context context) {
        this.f61199a = context;
    }
}
