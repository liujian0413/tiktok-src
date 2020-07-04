package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.VPAInfo;
import com.p280ss.android.ugc.aweme.shortvideo.model.MvModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct */
public class AVUploadMiscInfoStruct implements Serializable {
    @C6593c(mo15949a = "diamond_game_id")
    public String diamondGameId;
    @C6593c(mo15949a = "hproject_info")
    public F2ProjectInfo f2ProjectInfo;
    @C6593c(mo15949a = "koi_fish")
    public int koiFish;
    @C6593c(mo15949a = "status_template_id")
    public String mStatusId;
    @C6593c(mo15949a = "mv_info")
    public MvModel mvInfo;
    @C6593c(mo15949a = "mv_id")
    public String mvThemeId;
    @C6593c(mo15949a = "vpa_info")
    public VPAInfo vpaInfo = new VPAInfo(false, 0);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct$F2ProjectInfo */
    public static class F2ProjectInfo implements Serializable {
        @C6593c(mo15949a = "icon_url")
        public UrlModel iconUrl;
        @C6593c(mo15949a = "schema_url")
        public String schemaUrl;
        @C6593c(mo15949a = "title")
        public String title;
    }

    public static AVUploadMiscInfoStruct createStruct(String str) {
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct;
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct2 = new AVUploadMiscInfoStruct();
        if (TextUtils.isEmpty(str)) {
            return aVUploadMiscInfoStruct2;
        }
        try {
            aVUploadMiscInfoStruct = (AVUploadMiscInfoStruct) new C6600e().mo15974a(str, AVUploadMiscInfoStruct.class);
        } catch (Exception unused) {
            aVUploadMiscInfoStruct = aVUploadMiscInfoStruct2;
        }
        return aVUploadMiscInfoStruct;
    }
}
