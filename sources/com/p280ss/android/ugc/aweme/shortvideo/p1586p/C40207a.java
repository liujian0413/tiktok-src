package com.p280ss.android.ugc.aweme.shortvideo.p1586p;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a */
public final class C40207a {
    /* renamed from: a */
    public static boolean m128516a(ASCameraView aSCameraView) {
        if ((aSCameraView.getWideStatus() != 2 || !C6399b.m19944t()) && !C35563c.f93230L.mo93342a(Property.ShutterSoundEnable)) {
            return false;
        }
        return true;
    }
}
