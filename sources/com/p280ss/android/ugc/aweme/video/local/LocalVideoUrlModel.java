package com.p280ss.android.ugc.aweme.video.local;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* renamed from: com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel */
public class LocalVideoUrlModel extends VideoUrlModel {
    @C6593c(mo15949a = "author_id")
    String authorId;
    @C6593c(mo15949a = "local_path")
    String localPath;

    public LocalVideoUrlModel() {
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public LocalVideoUrlModel(String str) {
        setSourceId(str);
    }
}
