package com.p280ss.video.rtc.base.feedback;

import android.content.Context;
import android.os.AsyncTask;
import com.p280ss.video.rtc.base.data.RtcPreferences;
import com.p280ss.video.rtc.base.net.RtcNet;
import com.p280ss.video.rtc.base.net.RtcNet.HttpCallBack;
import com.p280ss.video.rtc.base.net.RtcNet.RequestErrTime;
import com.p280ss.video.rtc.base.net.bean.FeedbackOptionsModel;
import com.p280ss.video.rtc.base.net.request.feedback.GetFeedbackOptionsRequestModel;
import com.p280ss.video.rtc.base.net.request.feedback.SendFeedbackRequestModel;
import com.p280ss.video.rtc.base.utils.LocaleUtility;

/* renamed from: com.ss.video.rtc.base.feedback.FeedbackManager */
public class FeedbackManager {
    public static String sHost = "https://rtc.bytedance.com";
    public String requestFeedbackTaskUUID;
    public String sAppid;
    public String sDeviceID;
    public FeedbackOptions sFeedbackAudioOptions;
    public FeedbackOptions sFeedbackVideoOptions;
    public String sProvider;
    public String sRoomID;
    public String sSdkVersion;
    public String sUserID;
    public boolean sVideoEnabled;

    /* renamed from: com.ss.video.rtc.base.feedback.FeedbackManager$FeedbackManagerHolder */
    static class FeedbackManagerHolder {
        public static FeedbackManager instance = new FeedbackManager();

        private FeedbackManagerHolder() {
        }
    }

    /* renamed from: com.ss.video.rtc.base.feedback.FeedbackManager$RequestFeedbackAsyncTask */
    static class RequestFeedbackAsyncTask extends AsyncTask<Void, Void, Void> {
        public Context mApplicationContext;
        private GetFeedbackOptionsRequestModel mRequest;
        private boolean needRequestNewData;

        private FeedbackOptionsModel checkOldFetch() {
            FeedbackStroageBean buildFromJson = FeedbackStroageBean.buildFromJson(RtcPreferences.instance(this.mApplicationContext).getString("pref_rtc_feedback_data", ""));
            if (buildFromJson != null && !buildFromJson.isExpired() && buildFromJson.isSameLanguage(this.mApplicationContext)) {
                return buildFromJson.getFeedbackOptionsModel();
            }
            this.needRequestNewData = true;
            if (buildFromJson == null || !buildFromJson.isExpired()) {
                return null;
            }
            return buildFromJson.getFeedbackOptionsModel();
        }

        public void setResult(FeedbackOptionsModel feedbackOptionsModel) {
            FeedbackManager.newInstance().sFeedbackVideoOptions = new FeedbackOptions(feedbackOptionsModel.getVideoOptions());
            FeedbackManager.newInstance().sFeedbackAudioOptions = new FeedbackOptions(feedbackOptionsModel.getAudioOptions());
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            FeedbackOptionsModel checkOldFetch = checkOldFetch();
            if (checkOldFetch != null) {
                setResult(checkOldFetch);
            }
            if (!this.needRequestNewData) {
                return null;
            }
            final long currentTimeMillis = System.currentTimeMillis() / 1000;
            RtcNet.request(this.mRequest, new HttpCallBack<FeedbackOptionsModel>() {
                public void onError(RequestErrTime requestErrTime, Exception exc, String str, int i) {
                }

                public void onUUIDGen(String str) {
                    FeedbackManager.newInstance().requestFeedbackTaskUUID = str;
                }

                public void onResponse(FeedbackOptionsModel feedbackOptionsModel, String str) {
                    FeedbackManager.newInstance().requestFeedbackTaskUUID = null;
                    if (feedbackOptionsModel != null) {
                        RtcPreferences.instance(RequestFeedbackAsyncTask.this.mApplicationContext).putString("pref_rtc_feedback_data", new FeedbackStroageBean().setLanguage(LocaleUtility.getLanguage(RequestFeedbackAsyncTask.this.mApplicationContext)).setRequestTime(Long.valueOf(currentTimeMillis)).setResponse(str).toJson());
                        RequestFeedbackAsyncTask.this.setResult(feedbackOptionsModel);
                    }
                }
            });
            return null;
        }

        public RequestFeedbackAsyncTask(Context context, String str) {
            this.mApplicationContext = context.getApplicationContext();
            this.mRequest = new GetFeedbackOptionsRequestModel(this.mApplicationContext, str);
        }
    }

    /* renamed from: com.ss.video.rtc.base.feedback.FeedbackManager$SendFeedbackAsyncTask */
    static class SendFeedbackAsyncTask extends AsyncTask<Void, Void, Void> {
        private SendFeedbackRequestModel mRequest;

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            RtcNet.request(this.mRequest, new HttpCallBack<Object>() {
                public void onError(RequestErrTime requestErrTime, Exception exc, String str, int i) {
                }

                public void onResponse(Object obj, String str) {
                }

                public void onUUIDGen(String str) {
                }
            });
            return null;
        }

        public SendFeedbackAsyncTask(Context context, FeedbackOptions feedbackOptions) {
            FeedbackManager newInstance = FeedbackManager.newInstance();
            SendFeedbackRequestModel sendFeedbackRequestModel = new SendFeedbackRequestModel(context, newInstance.sDeviceID, newInstance.sProvider, newInstance.sAppid, newInstance.sRoomID, newInstance.sUserID, newInstance.sSdkVersion, feedbackOptions);
            this.mRequest = sendFeedbackRequestModel;
        }
    }

    public static FeedbackManager newInstance() {
        return FeedbackManagerHolder.instance;
    }

    private FeedbackManager() {
        this.sVideoEnabled = true;
    }

    public void clearOldFeedbackData() {
        if (this.requestFeedbackTaskUUID != null) {
            RtcNet.cancelRequest(this.requestFeedbackTaskUUID);
            this.requestFeedbackTaskUUID = null;
        }
        this.sFeedbackAudioOptions = null;
        this.sFeedbackVideoOptions = null;
    }

    public FeedbackOptions getFeedbackOptins(boolean z) {
        if (z) {
            return this.sFeedbackVideoOptions;
        }
        return this.sFeedbackAudioOptions;
    }

    public void requestFeedbackAsync(Context context, String str) {
        clearOldFeedbackData();
        new RequestFeedbackAsyncTask(context, str).execute(new Void[0]);
    }

    public void sendFeedbackAsync(Context context, FeedbackOptions feedbackOptions) {
        new SendFeedbackAsyncTask(context, feedbackOptions).execute(new Void[0]);
    }
}
