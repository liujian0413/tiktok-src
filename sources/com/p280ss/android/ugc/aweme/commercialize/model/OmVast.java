package com.p280ss.android.ugc.aweme.commercialize.model;

import com.bytedance.vast.model.AdVerification;
import com.bytedance.vast.model.Creative;
import com.bytedance.vast.model.Vast;
import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.OmVast */
public class OmVast implements Serializable {
    @C6593c(mo15949a = "ad_choice")
    public NativeIcon adChoiceIcon;
    @C6593c(mo15949a = "adVerifications")
    public List<AdVerification> adVerificationList;
    @C6593c(mo15949a = "local_cache_loaded")
    public boolean loaded;
    public transient boolean loading;
    @C6593c(mo15949a = "providerType")
    public int providerType = 2;
    @C6593c(mo15949a = "local_cache_vast")
    public Vast vast;
    @C6593c(mo15949a = "vastContent")
    @C6591a(mo15945a = false)
    public String vastContent;
    @C6593c(mo15949a = "vastUrl")
    @C6591a(mo15945a = false)
    public String vastUrl;
    @C6593c(mo15949a = "vastWrapperCount")
    @C6591a(mo15945a = false)
    public int vastWrapperCount = 1;

    public List<Creative> getCreativeList() {
        if (this.vast == null) {
            return null;
        }
        return this.vast.creativeList;
    }

    public Set<String> getImpressions() {
        if (this.vast == null) {
            return null;
        }
        return this.vast.impressionSet;
    }
}
