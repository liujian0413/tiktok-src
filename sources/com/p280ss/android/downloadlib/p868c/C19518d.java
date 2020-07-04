package com.p280ss.android.downloadlib.p868c;

import android.text.TextUtils;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.p848c.p849a.p851b.C19236a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.c.d */
public final class C19518d {
    /* renamed from: a */
    public static C19236a m64286a(long j) {
        try {
            String string = C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0).getString(String.valueOf(j), "");
            if (!TextUtils.isEmpty(string)) {
                return C19236a.m63065a(new JSONObject(string));
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
