package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.Map;

@C6505uv
public final class akx implements C15742hq<aik> {
    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        aik aik = (aik) obj;
        amy b = aik.mo39464b();
        if (b == null) {
            try {
                amy amy = new amy(aik, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                aik.mo39460a(amy);
                b = amy;
            } catch (NullPointerException | NumberFormatException e) {
                acd.m45778b("Unable to parse videoMeta message.", e);
                C14793ay.m42898d().mo39089a(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || 3 < parseInt) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (acd.m45776a(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(parseInt);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            acd.m45777b(sb.toString());
        }
        b.mo39829a(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
