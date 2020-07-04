package com.p280ss.video.rtc.base.net.request.feedback;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.gson.C6711m;
import com.p280ss.video.rtc.base.feedback.FeedbackManager;
import com.p280ss.video.rtc.base.feedback.FeedbackOptions;
import com.p280ss.video.rtc.base.net.RtcNet;
import com.p280ss.video.rtc.base.net.RtcNetBaseRequestModel;
import com.p280ss.video.rtc.base.net.bean.FeedbackOptionsModel.FeedbackOptionItem;
import com.p280ss.video.rtc.base.net.bean.FeedbackRequestBody;
import com.p280ss.video.rtc.base.net.bean.FeedbackRequestBody.ClientInfo;
import com.p280ss.video.rtc.base.net.bean.FeedbackRequestBody.RtcInfo;
import com.p280ss.video.rtc.base.utils.NetworkUtils;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: com.ss.video.rtc.base.net.request.feedback.SendFeedbackRequestModel */
public class SendFeedbackRequestModel extends RtcNetBaseRequestModel {
    private static final MediaType JSON_MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
    private FeedbackRequestBody body = new FeedbackRequestBody();
    private String feedbackAudioUrl;
    private String feedbackVideoUrl;

    public void addQueryParameter(HashMap<String, String> hashMap) {
    }

    public void addRequestHeader(HashMap<String, String> hashMap) {
    }

    public String getRequestMethod() {
        return "POST";
    }

    public RequestBody getRequestBody() throws Exception {
        return RequestBody.create(JSON_MEDIA_TYPE, RtcNet.toJson(this.body));
    }

    public String getRequestUrl() {
        String str;
        if (FeedbackManager.newInstance().sVideoEnabled) {
            str = this.feedbackVideoUrl;
        } else {
            str = this.feedbackAudioUrl;
        }
        if (str.startsWith(WebKitApi.SCHEME_HTTP)) {
            return str;
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str);
        return sb.toString();
    }

    private String getCarrierName(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return "";
    }

    private void addFeedback(FeedbackOptions feedbackOptions) {
        if (feedbackOptions == null) {
            this.body.satisfied = true;
            return;
        }
        this.body.satisfied = feedbackOptions.isSatisfied();
        if (!this.body.satisfied) {
            C6711m mVar = new C6711m();
            Iterator it = feedbackOptions.getOptions().iterator();
            while (it.hasNext()) {
                FeedbackOptionItem feedbackOptionItem = (FeedbackOptionItem) it.next();
                if (!(feedbackOptionItem.getValue() == null || feedbackOptionItem.getKey() == null)) {
                    if (!"bool".equals(feedbackOptionItem.getType())) {
                        mVar.mo16147a(feedbackOptionItem.getKey(), feedbackOptionItem.getValue());
                    } else if ("true".equals(feedbackOptionItem.getValue().toLowerCase())) {
                        mVar.mo16145a(feedbackOptionItem.getKey(), Boolean.valueOf(true));
                    } else {
                        mVar.mo16145a(feedbackOptionItem.getKey(), Boolean.valueOf(false));
                    }
                }
            }
            this.body.feedback = mVar;
        }
    }

    public SendFeedbackRequestModel(Context context, String str, String str2, String str3, String str4, String str5, String str6, FeedbackOptions feedbackOptions) {
        StringBuilder sb = new StringBuilder();
        sb.append(FeedbackManager.sHost);
        sb.append("/feedback/v1/audio");
        this.feedbackAudioUrl = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FeedbackManager.sHost);
        sb2.append("/feedback/v1/video");
        this.feedbackVideoUrl = sb2.toString();
        this.body.clientInfo = new ClientInfo().setOsType("android").setOsVersion(String.valueOf(VERSION.SDK_INT)).setDevice(Build.MODEL).setDeviceId(str).setNetworkType(NetworkUtils.getNetworkAccessType(context)).setManufacturerInfo(Build.MANUFACTURER).setCarrierName(getCarrierName(context));
        this.body.rtcInfo = new RtcInfo().setSdkVersion(str6).setSdkProvider(str2).setAppId(str3).setRoomId(str4).setUserId(str5).setTimestamp(String.valueOf(System.currentTimeMillis() / 1000));
        addFeedback(feedbackOptions);
    }
}
