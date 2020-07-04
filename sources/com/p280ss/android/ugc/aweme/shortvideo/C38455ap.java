package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.video.C7276d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ap */
public class C38455ap extends BaseResponse {
    @C6593c(mo15949a = "save_model")
    public AVUploadSaveModel mSaveModel;
    public transient String materialId;
    @C6593c(mo15949a = "open_platform_name")
    public String openPlatformName;
    public String videoCoverPath;

    public String getVideoCoverPath() {
        if (C7276d.m22812b(this.videoCoverPath)) {
            return this.videoCoverPath;
        }
        return null;
    }
}
