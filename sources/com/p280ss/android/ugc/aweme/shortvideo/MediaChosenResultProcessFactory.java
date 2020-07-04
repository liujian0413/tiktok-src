package com.p280ss.android.ugc.aweme.shortvideo;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.photo.C34755i;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40120aa;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40121ab;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40129c;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40406a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40450c;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.choosemedia.C42525b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory */
public class MediaChosenResultProcessFactory implements IMediaChosenResultProcessFactory {
    public C40129c create(FragmentActivity fragmentActivity, int i, long j, long j2) {
        switch (i) {
            case 1:
                return new C42525b(fragmentActivity);
            case 2:
                C40121ab abVar = new C40121ab(fragmentActivity, j, j2);
                return abVar;
            case 3:
                return new C34755i(fragmentActivity);
            case 4:
                return new C40120aa(fragmentActivity);
            case 7:
                return new C40450c(fragmentActivity);
            case 8:
                return new C40406a(fragmentActivity);
            default:
                return new C42525b(fragmentActivity);
        }
    }
}
