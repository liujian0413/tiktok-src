package com.p280ss.android.ugc.trill.language.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.List;

/* renamed from: com.ss.android.ugc.trill.language.model.ConfigListResponse */
public class ConfigListResponse extends BaseResponse {
    @C6593c(mo15949a = "content_languages")
    List<ContentLanguage> contentLanguage;

    public List<ContentLanguage> getContentLanguage() {
        return this.contentLanguage;
    }

    public void setContentLanguage(List<ContentLanguage> list) {
        this.contentLanguage = list;
    }
}
