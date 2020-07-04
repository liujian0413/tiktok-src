package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadAuthKeyConfig */
public class UploadAuthKeyConfig implements Serializable {
    @C6593c(mo15949a = "extra")
    private UploadImageConfigExtraInfo extraInfo;
    @C6593c(mo15949a = "inner_image_config")
    private UploadImageConfig innerImageConfig;
    @C6593c(mo15949a = "public_image_config")
    private UploadImageConfig publicImageConfig;

    public UploadImageConfigExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public UploadImageConfig getInnerImageConfig() {
        return this.innerImageConfig;
    }

    public UploadImageConfig getPublicImageConfig() {
        return this.publicImageConfig;
    }

    public void setExtraInfo(UploadImageConfigExtraInfo uploadImageConfigExtraInfo) {
        this.extraInfo = uploadImageConfigExtraInfo;
    }

    public void setInnerImageConfig(UploadImageConfig uploadImageConfig) {
        this.innerImageConfig = uploadImageConfig;
    }

    public void setPublicImageConfig(UploadImageConfig uploadImageConfig) {
        this.publicImageConfig = uploadImageConfig;
    }
}
