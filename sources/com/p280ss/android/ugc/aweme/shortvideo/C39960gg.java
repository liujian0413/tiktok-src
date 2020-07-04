package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.asve.recorder.camera.C20703a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gg */
public final class C39960gg {
    /* renamed from: a */
    public static boolean m127843a(Context context) {
        int i;
        if (C20703a.m68740a(context, C35574k.m114859a().mo70091f().mo93343b(Property.WideCameraInfo), C35574k.m114859a().mo70096k().mo93305a(AVAB.Property.EnableUserVeRecoder)) == 0) {
            i = 7;
        } else {
            i = 8;
        }
        boolean a = C39805en.m127446a(context, i);
        if (C6399b.m19946v()) {
            if (!C35574k.m114859a().mo70096k().mo93305a(AVAB.Property.AddTextInMusically) || a) {
                return false;
            }
            return true;
        } else if (!a) {
            return true;
        } else {
            return false;
        }
    }
}
