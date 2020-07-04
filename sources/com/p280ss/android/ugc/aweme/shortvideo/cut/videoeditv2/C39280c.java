package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.os.Vibrator;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35580p;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.setting.AllowLongVideo;
import com.p280ss.android.ugc.aweme.setting.AllowLongVideoThreshold;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.c */
public final class C39280c {

    /* renamed from: a */
    public static int f101999a = C23486n.m77122a(56.0d);

    /* renamed from: b */
    public static int f102000b = C23486n.m77122a(60.0d);

    /* renamed from: c */
    public static int f102001c = C23486n.m77122a(30.0d);

    /* renamed from: d */
    public static int f102002d = C23486n.m77122a(35.0d);

    /* renamed from: e */
    public static final C39280c f102003e = new C39280c();

    private C39280c() {
    }

    /* renamed from: c */
    public static final long m125555c() {
        return C39810eq.m127460a();
    }

    /* renamed from: d */
    private static boolean m125556d() {
        if (!C35563c.f93230L.mo93342a(Property.LongVideoPermitted)) {
            C35580p pVar = C35563c.f93259v;
            C7573i.m23582a((Object) pVar, "AVEnv.BRIDGE_SERVICE");
            if (!pVar.mo83149a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m125554b() {
        if (!C10292j.m30480a().mo25016a(AllowLongVideo.class, "allow_long_video", C6384b.m19835a().mo15294c().getAllowLongVideo()) || !C6399b.m19945u()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final long m125551a() {
        C35580p pVar = C35563c.f93259v;
        C7573i.m23582a((Object) pVar, "AVEnv.BRIDGE_SERVICE");
        if (pVar.mo83149a()) {
            return 300000;
        }
        if (m125554b()) {
            return Math.min((long) C10292j.m30480a().mo25012a(AllowLongVideoThreshold.class, "allow_long_video_threshold", C6384b.m19835a().mo15294c().getAllowLongVideoThreshold()), 900000);
        }
        if (m125556d()) {
            return C35563c.f93230L.mo93344c(Property.LongVideoThreshold);
        }
        return C40413c.f105051b;
    }

    /* renamed from: a */
    public static final void m125553a(Context context) {
        C7573i.m23587b(context, "context");
        Object systemService = context.getSystemService("vibrator");
        if (systemService != null) {
            ((Vibrator) systemService).vibrate(10);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
    }

    /* renamed from: a */
    public static final MediaModel m125552a(String str, CutMultiVideoViewModel cutMultiVideoViewModel) {
        C7573i.m23587b(str, "path");
        C7573i.m23587b(cutMultiVideoViewModel, "cutMultiVideoViewModel");
        if (cutMultiVideoViewModel.f100404k) {
            MediaModel mediaModel = new MediaModel(-1);
            mediaModel.f88156b = str;
            mediaModel.f88163i = 720;
            mediaModel.f88164j = 1280;
            mediaModel.f88159e = (long) cutMultiVideoViewModel.f100405l;
            return mediaModel;
        }
        int[] iArr = new int[10];
        if (C42133c.m134093a(str, iArr) != 0) {
            return null;
        }
        MediaModel mediaModel2 = new MediaModel(-1);
        mediaModel2.f88156b = str;
        mediaModel2.f88163i = iArr[0];
        mediaModel2.f88164j = iArr[1];
        mediaModel2.f88159e = (long) iArr[3];
        return mediaModel2;
    }
}
