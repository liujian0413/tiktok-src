package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.C13876aa;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.o */
final class C14154o {

    /* renamed from: a */
    private final SharedPreferences f37402a = C7285c.m22838a(C13499h.m39721g(), "com.facebook.AccessTokenManager.SharedPreferences", 0);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33914b() {
        this.f37402a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    C14154o() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Profile mo33912a() {
        String string = this.f37402a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33913a(Profile profile) {
        C13876aa.m40978a((Object) profile, "profile");
        JSONObject c = profile.mo31802c();
        if (c != null) {
            this.f37402a.edit().putString("com.facebook.ProfileManager.CachedProfile", c.toString()).apply();
        }
    }
}
