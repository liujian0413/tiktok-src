package com.p280ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FeedCompoundConfig */
public class FeedCompoundConfig {
    @C6593c(mo15949a = "path")
    public String path;
    @C6593c(mo15949a = "replace_path")
    public String replacePath;
    @C6593c(mo15949a = "compound_request_domain")
    public List<String> requestDomains;
    @C6593c(mo15949a = "threshold")
    public int threshold;

    public boolean isFeedCompoundClose() {
        if (TextUtils.isEmpty(this.path) || TextUtils.isEmpty(this.replacePath) || this.threshold <= 0 || this.requestDomains == null || this.requestDomains.size() == 0) {
            return true;
        }
        return false;
    }
}
