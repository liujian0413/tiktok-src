package com.p280ss.video.rtc.base.net.request.feedback;

import android.content.Context;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.video.rtc.base.feedback.FeedbackManager;
import com.p280ss.video.rtc.base.net.RtcNetBaseRequestModel;
import com.p280ss.video.rtc.base.utils.LocaleUtility;
import java.util.HashMap;

/* renamed from: com.ss.video.rtc.base.net.request.feedback.GetFeedbackOptionsRequestModel */
public class GetFeedbackOptionsRequestModel extends RtcNetBaseRequestModel {
    private String host;
    private String mAppId;
    private Context mContext;

    public String getRequestUrl() {
        if (this.host.startsWith(WebKitApi.SCHEME_HTTP)) {
            return this.host;
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(this.host);
        return sb.toString();
    }

    public void addQueryParameter(HashMap<String, String> hashMap) {
        hashMap.put("appid", this.mAppId);
        hashMap.put("language", LocaleUtility.getLanguage(this.mContext));
    }

    public GetFeedbackOptionsRequestModel(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(FeedbackManager.sHost);
        sb.append("/feedback/v1/options");
        this.host = sb.toString();
        this.mAppId = str;
        this.mContext = context;
    }
}
