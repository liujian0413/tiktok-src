package com.p280ss.android.ugc.aweme.story.shootvideo.p1655a;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41558k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.a.a */
public final class C42010a {
    /* renamed from: a */
    public static C22984d m133556a(String str, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4;
        String str5;
        C22984d a = C22984d.m75611a().mo59973a("creation_id", str2).mo59973a("shoot_way", str);
        String str6 = "content_type";
        if (z2) {
            str3 = "photo";
        } else {
            str3 = "video";
        }
        C22984d a2 = a.mo59973a(str6, str3);
        String str7 = "content_source";
        if (z) {
            str4 = "upload";
        } else {
            str4 = "shoot";
        }
        C22984d a3 = a2.mo59973a(str7, str4).mo59973a("camera_type", C41558k.m132344b()).mo59970a("camera_level", C35563c.f93230L.mo93343b(Property.RecordCameraCompatLevel));
        String str8 = "enter_from";
        if (z3) {
            str5 = "edit_post_page";
        } else {
            str5 = "video_shoot_page";
        }
        return a3.mo59973a(str8, str5);
    }
}
