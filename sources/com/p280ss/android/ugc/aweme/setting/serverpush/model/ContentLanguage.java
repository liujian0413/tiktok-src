package com.p280ss.android.ugc.aweme.setting.serverpush.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage */
public class ContentLanguage implements Serializable {
    @C6593c(mo15949a = "en_name")
    String englishName;
    @C6593c(mo15949a = "code")
    String languageCode;
    @C6593c(mo15949a = "local_name")
    String localName;

    public String getEnglishName() {
        return this.englishName;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public String getLocalName() {
        return this.localName;
    }

    public void setEnglishName(String str) {
        this.englishName = str;
    }

    public void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public void setLocalName(String str) {
        this.localName = str;
    }
}
