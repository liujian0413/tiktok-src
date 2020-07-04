package com.p280ss.video.rtc.engine.utils;

import android.content.Context;
import com.p280ss.video.rtc.base.feedback.DefaultFeedbackGenerator;
import com.p280ss.video.rtc.base.feedback.FeedbackManager;
import com.p280ss.video.rtc.base.feedback.FeedbackOptions;

/* renamed from: com.ss.video.rtc.engine.utils.RtcFeedback */
public class RtcFeedback {
    public static void setFeedbackVideoEnabled(boolean z) {
        FeedbackManager.newInstance().sVideoEnabled = z;
    }

    public static FeedbackOptions getFeedbackContent(Context context) {
        FeedbackManager newInstance = FeedbackManager.newInstance();
        if (newInstance.sVideoEnabled) {
            if (newInstance.sFeedbackVideoOptions != null) {
                return newInstance.sFeedbackVideoOptions;
            }
            return new DefaultFeedbackGenerator().genLocaleBasedOptions(context, true);
        } else if (newInstance.sFeedbackAudioOptions != null) {
            return newInstance.sFeedbackAudioOptions;
        } else {
            return new DefaultFeedbackGenerator().genLocaleBasedOptions(context, false);
        }
    }

    public static void requestFeedbackAsync(Context context, String str) {
        FeedbackManager.newInstance().requestFeedbackAsync(context, str);
    }

    public static void sendFeedback(Context context, String str, String str2, String str3, FeedbackOptions feedbackOptions) {
        FeedbackManager newInstance = FeedbackManager.newInstance();
        newInstance.sDeviceID = str2;
        newInstance.sAppid = str;
        newInstance.sSdkVersion = str3;
        newInstance.sProvider = "byteRtc";
        newInstance.sendFeedbackAsync(context, feedbackOptions);
    }
}
