package com.p280ss.android.ugc.aweme.feed.preload;

import android.content.Context;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.experiment.PreloadMediaCodecListExperiment;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.PreloadMediaCodecListTask */
public class PreloadMediaCodecListTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        if (VERSION.SDK_INT >= 21 && C6384b.m19835a().mo15292a(PreloadMediaCodecListExperiment.class, true, "preload_media_codec", C6384b.m19835a().mo15295d().preload_media_codec, false)) {
            new MediaCodecList(1).getCodecInfos();
        }
    }
}
