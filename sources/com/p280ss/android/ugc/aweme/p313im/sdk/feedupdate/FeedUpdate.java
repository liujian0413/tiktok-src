package com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate */
public class FeedUpdate {
    @C6593c(mo15949a = "cursor")
    long cursor;
    @C6593c(mo15949a = "data")
    public List<UserUnreadItem> items;
    @C6593c(mo15949a = "status_code")
    int statusCode;
    @C6593c(mo15949a = "status_msg")
    String statusMsg;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$UserUnreadItem */
    public class UserUnreadItem implements Serializable {
        @C6593c(mo15949a = "aweme_list")
        List<C31201a> awemeSubsets;
        @C6593c(mo15949a = "last_aweme_info")
        C31203c lastAweme;
        @C6593c(mo15949a = "author_user_id")
        long uid;

        public List<C31201a> getAwemeSubsets() {
            return this.awemeSubsets;
        }

        public C31203c getLastAweme() {
            return this.lastAweme;
        }

        public long getUid() {
            return this.uid;
        }

        public void setAwemeSubsets(List<C31201a> list) {
            this.awemeSubsets = list;
        }

        public void setLastAweme(C31203c cVar) {
            this.lastAweme = cVar;
        }

        public void setUid(long j) {
            this.uid = j;
        }

        public UserUnreadItem() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$a */
    class C31201a implements Serializable {
        @C6593c(mo15949a = "aweme_id")

        /* renamed from: a */
        String f81831a;
        @C6593c(mo15949a = "create_time")

        /* renamed from: b */
        long f81832b;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$b */
    class C31202b {
        @C6593c(mo15949a = "label_thumb")

        /* renamed from: a */
        public UrlModel f81833a;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$c */
    public class C31203c {
        @C6593c(mo15949a = "aweme_id")

        /* renamed from: a */
        public String f81834a;
        @C6593c(mo15949a = "create_time")

        /* renamed from: b */
        public long f81835b;
        @C6593c(mo15949a = "desc")

        /* renamed from: c */
        public String f81836c;
        @C6593c(mo15949a = "video")

        /* renamed from: d */
        public C31204d f81837d;
        @C6593c(mo15949a = "image_infos")

        /* renamed from: e */
        public List<C31202b> f81838e;
        @C6593c(mo15949a = "aweme_type")

        /* renamed from: f */
        public int f81839f;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$d */
    class C31204d {
        @C6593c(mo15949a = "cover")

        /* renamed from: a */
        public UrlModel f81840a;
    }

    public long getCursor() {
        return this.cursor;
    }

    public List<UserUnreadItem> getItems() {
        return this.items;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setItems(List<UserUnreadItem> list) {
        this.items = list;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
