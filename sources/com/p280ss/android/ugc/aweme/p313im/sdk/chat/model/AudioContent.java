package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent */
public class AudioContent extends BaseContent {
    private static String VOICE_HINT = "";
    @C6593c(mo15949a = "duration")
    long duration;
    @C6593c(mo15949a = "md5")
    String md5;
    @C6593c(mo15949a = "resource_url")
    UrlModel url;

    public long getDuration() {
        return this.duration;
    }

    public String getMd5() {
        return this.md5;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return VOICE_HINT;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(VOICE_HINT)) {
            Context a = C6399b.m19921a();
            if (a != null) {
                VOICE_HINT = a.getString(R.string.bpn);
            }
        }
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }
}
