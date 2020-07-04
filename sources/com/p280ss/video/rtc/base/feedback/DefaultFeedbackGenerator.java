package com.p280ss.video.rtc.base.feedback;

import android.content.Context;
import com.p280ss.video.rtc.base.net.bean.FeedbackOptionsModel.FeedbackOptionItem;
import com.p280ss.video.rtc.base.utils.LocaleUtility;
import java.util.ArrayList;

/* renamed from: com.ss.video.rtc.base.feedback.DefaultFeedbackGenerator */
public class DefaultFeedbackGenerator {
    public FeedbackOptions genChineseAudioFeedback() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(genOptionItem("onConnection", "无法接通", "bool"));
        arrayList.add(genOptionItem("breakOff", "意外断开", "bool"));
        arrayList.add(genOptionItem("noAudio", "听不到声音", "bool"));
        arrayList.add(genOptionItem("poorAudio", "声音质量差", "bool"));
        arrayList.add(genOptionItem("other", "其他问题...", "string"));
        return new FeedbackOptions(arrayList);
    }

    public FeedbackOptions genChineseVideoFeedback() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(genOptionItem("onConnection", "无法接通", "bool"));
        arrayList.add(genOptionItem("breakOff", "意外断开", "bool"));
        arrayList.add(genOptionItem("noVideo", "看不到画面", "bool"));
        arrayList.add(genOptionItem("noAudio", "听不到声音", "bool"));
        arrayList.add(genOptionItem("poorVideo", "视频质量差", "bool"));
        arrayList.add(genOptionItem("poorAudio", "声音质量差", "bool"));
        arrayList.add(genOptionItem("other", "其他问题...", "string"));
        return new FeedbackOptions(arrayList);
    }

    public FeedbackOptions genEnglishAudioFeedback() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(genOptionItem("onConnection", "Unable to make call", "bool"));
        arrayList.add(genOptionItem("breakOff", "Unexpected disconnection", "bool"));
        arrayList.add(genOptionItem("noAudio", "No sound", "bool"));
        arrayList.add(genOptionItem("poorAudio", "Poor audio quality", "bool"));
        arrayList.add(genOptionItem("other", "Others...", "string"));
        return new FeedbackOptions(arrayList);
    }

    public FeedbackOptions genEnglishVideoFeedback() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(genOptionItem("onConnection", "Unable to make call", "bool"));
        arrayList.add(genOptionItem("breakOff", "Unexpected disconnection", "bool"));
        arrayList.add(genOptionItem("noVideo", "No Video", "bool"));
        arrayList.add(genOptionItem("noAudio", "No sound", "bool"));
        arrayList.add(genOptionItem("poorVideo", "Poor video quality", "bool"));
        arrayList.add(genOptionItem("poorAudio", "Poor audio quality", "bool"));
        arrayList.add(genOptionItem("other", "Others...", "string"));
        return new FeedbackOptions(arrayList);
    }

    public FeedbackOptions genLocaleBasedOptions(Context context, boolean z) {
        if ("zh-CN".equals(LocaleUtility.getLanguage(context))) {
            if (z) {
                return genChineseVideoFeedback();
            }
            return genChineseAudioFeedback();
        } else if (z) {
            return genEnglishVideoFeedback();
        } else {
            return genEnglishAudioFeedback();
        }
    }

    private FeedbackOptionItem genOptionItem(String str, String str2, String str3) {
        return new FeedbackOptionItem(str, str2, str3);
    }
}
