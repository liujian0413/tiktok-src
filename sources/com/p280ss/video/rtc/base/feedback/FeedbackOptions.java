package com.p280ss.video.rtc.base.feedback;

import com.p280ss.video.rtc.base.net.bean.FeedbackOptionsModel.FeedbackOptionItem;
import java.util.ArrayList;

/* renamed from: com.ss.video.rtc.base.feedback.FeedbackOptions */
public class FeedbackOptions {
    private ArrayList<FeedbackOptionItem> options;
    private boolean satisfied = true;

    public ArrayList<FeedbackOptionItem> getOptions() {
        return this.options;
    }

    public boolean isSatisfied() {
        return this.satisfied;
    }

    public void setSatisfied(boolean z) {
        this.satisfied = z;
    }

    public FeedbackOptions(ArrayList<FeedbackOptionItem> arrayList) {
        this.options = arrayList;
    }
}
