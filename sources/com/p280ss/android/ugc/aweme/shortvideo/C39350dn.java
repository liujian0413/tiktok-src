package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.JobIntentService;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.tools.policysecurity.C42579b;
import com.p280ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.p280ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dn */
public final class C39350dn {
    /* renamed from: a */
    public static void m125707a(Context context, String str, String str2, Object obj) {
        if ((obj instanceof VideoPublishEditModel) && C35563c.f93230L.mo93342a(Property.UploadOriginalAudioTrack)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel.shouldUploadOriginalSound()) {
                OriginalSoundUploadTask originalSoundUploadTask = new OriginalSoundUploadTask(str, str2, videoPublishEditModel.mEncodedAudioOutputFile, System.currentTimeMillis());
                C42579b.m135298a(context).mo104185a(originalSoundUploadTask);
            }
            try {
                JobIntentService.enqueueWork(context, OriginalSoundUploadService.class, 3008, new Intent());
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }
}
