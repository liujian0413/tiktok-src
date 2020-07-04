package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.vast.p673a.C13015c;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity.C38648a;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40129c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.a */
public final class C40406a implements C40129c {

    /* renamed from: a */
    private final Activity f105030a;

    public C40406a(Activity activity) {
        this.f105030a = activity;
    }

    /* renamed from: a */
    private static long m129199a(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.f99745af) {
            return C35574k.m114859a().mo70091f().mo93344c(Property.LongVideoThreshold);
        }
        return C40413c.f105051b;
    }

    /* renamed from: a */
    public final void mo88198a(int i, int i2, Intent intent) {
        boolean z;
        C7573i.m23587b(intent, "data");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        C7573i.m23582a((Object) parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
        List list = parcelableArrayListExtra;
        Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
        C7573i.m23582a((Object) parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
        ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !C13015c.m37973a(((MediaModel) list.get(0)).f88156b)) {
            Intent intent2 = new Intent();
            intent2.putExtra("file_path", ((MediaModel) list.get(0)).f88156b);
            intent2.putExtra("from_background_video", true);
            intent2.putExtra("background_video_max_length", m129199a(shortVideoContext));
            Activity activity = this.f105030a;
            if (activity != null) {
                C38648a.m123460a(activity, intent2, i);
            }
        }
    }
}
