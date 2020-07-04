package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareRankingListContent */
public class ShareRankingListContent extends BaseContent {
    protected static String AWEME_MSG_HINT = "";
    @C6593c(mo15949a = "update_time")
    String lastUpdateTime;

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return AWEME_MSG_HINT;
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("ranking");
        a.f20186l.putInt("aweme_type", getType());
        return a;
    }

    public void tryInit() {
        Context a = C6399b.m19921a();
        if (a != null) {
            int type = getType();
            if (type != 2301) {
                switch (type) {
                    case 1801:
                        AWEME_MSG_HINT = a.getString(R.string.bpl);
                        return;
                    case 1802:
                        AWEME_MSG_HINT = a.getString(R.string.bpm);
                        return;
                    case 1803:
                        AWEME_MSG_HINT = a.getString(R.string.bpi);
                        return;
                }
            } else {
                AWEME_MSG_HINT = C6399b.m19921a().getString(R.string.bph);
            }
        }
    }

    public void setLastUpdateTime(String str) {
        this.lastUpdateTime = str;
    }

    public static ShareRankingListContent fromSharePackage(SharePackage sharePackage) {
        ShareRankingListContent shareRankingListContent = new ShareRankingListContent();
        shareRankingListContent.lastUpdateTime = sharePackage.f20186l.getString("update_time");
        shareRankingListContent.type = sharePackage.f20186l.getInt("aweme_type");
        return shareRankingListContent;
    }
}
