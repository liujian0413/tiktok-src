package com.p280ss.android.ugc.aweme.favorites.api.notice;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNotice */
public class CollectionNotice implements Serializable {
    public static final int MIX_TYPE = 1;
    @C6593c(mo15949a = "collect_notice")
    public ArrayList<C27738a> collectNoticeList;
    @C6593c(mo15949a = "status_code")
    public int statusCode;
    @C6593c(mo15949a = "status_msg")
    public String statusMsg;

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNotice$a */
    static class C27738a implements Serializable {
        @C6593c(mo15949a = "type")

        /* renamed from: a */
        public int f73171a;
        @C6593c(mo15949a = "status")

        /* renamed from: b */
        public boolean f73172b;

        C27738a() {
        }
    }

    public boolean getMixStatus() {
        if (this.collectNoticeList == null) {
            return false;
        }
        for (int i = 0; i < this.collectNoticeList.size(); i++) {
            C27738a aVar = (C27738a) this.collectNoticeList.get(i);
            if (aVar.f73171a == 1) {
                return aVar.f73172b;
            }
        }
        return false;
    }
}
