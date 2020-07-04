package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39448d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.aq */
final class C23211aq implements C39448d {

    /* renamed from: a */
    private Context f61197a;

    /* renamed from: b */
    private SharedPreferences f61198b = C7285c.m22838a(this.f61197a, "AudioEffect", 0);

    /* renamed from: a */
    public final int mo60405a(int i) {
        return this.f61198b.getInt("resource_version", i);
    }

    /* renamed from: b */
    public final void mo60406b(int i) {
        Editor edit = this.f61198b.edit();
        edit.putInt("resource_version", i);
        edit.apply();
    }

    public C23211aq(Context context) {
        this.f61197a = context;
    }
}
