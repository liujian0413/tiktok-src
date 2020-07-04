package com.p280ss.android.ugc.aweme.story.model;

import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.story.p1654b.C41984a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.story.model.StoryDetail */
public class StoryDetail implements Cloneable {
    @C6593c(mo15949a = "aweme_list")
    List<Aweme> awemeList;
    @C6593c(mo15949a = "requestId")
    String requestId;
    @C6593c(mo15949a = "status_code")
    int statusCode;

    public List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public JSONObject getRequestIdJsonObject() {
        return C41984a.m133445a(this.requestId);
    }

    public StoryDetail clone() {
        try {
            return (StoryDetail) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Aweme getFirstAweme() {
        if (getAwemeList() == null || getAwemeList().size() <= 0) {
            return null;
        }
        return (Aweme) getAwemeList().get(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StoryListResponse{statusCode=");
        sb.append(this.statusCode);
        sb.append(", awemeList=");
        sb.append(this.awemeList);
        sb.append('}');
        return sb.toString();
    }

    public boolean needDownloadFirstCover() {
        Aweme firstAweme = getFirstAweme();
        if (!(firstAweme == null || firstAweme.getVideo() == null)) {
            ImageRequest[] a = C23323e.m76522a(firstAweme.getVideo().getOriginCover(), (C13596d) null, (C13842b) null);
            if (a.length > 0) {
                C13606i c = C13380c.m39172c();
                for (ImageRequest a2 : a) {
                    if (c.mo33177a(a2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }
}
