package com.p280ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct */
public class StreamUrlStruct implements Serializable {
    public static final int PROVIDER_CHINANETCENTER = 2;
    public static final int PROVIDER_KINGSOFT = 1;
    @C6593c(mo15949a = "candidate_resolution")
    public ArrayList<String> mCandidateResolutionList;
    @C6593c(mo15949a = "default_resolution")
    public String mDefaultResolution;
    @C6593c(mo15949a = "flv_pull_url")
    public HashMap<String, String> mFlvPullUrlMap;
    @C6593c(mo15949a = "provider")
    public int provider;
    @C6593c(mo15949a = "rtmp_pull_url")
    public String rtmp_pull_url;
    @C6593c(mo15949a = "rtmp_push_url")
    public String rtmp_push_url;
    @C6593c(mo15949a = "sid")
    public long sid;

    public String toString() {
        StringBuilder sb = new StringBuilder("StreamUrlStruct{sid=");
        sb.append(this.sid);
        sb.append(", rtmp_pull_url='");
        sb.append(this.rtmp_pull_url);
        sb.append('\'');
        sb.append(", rtmp_push_url='");
        sb.append(this.rtmp_push_url);
        sb.append('\'');
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append('}');
        return sb.toString();
    }
}
