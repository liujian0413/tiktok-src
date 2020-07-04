package com.p280ss.video.rtc.base.net.bean;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.video.rtc.base.net.bean.FeedbackOptionsModel */
public class FeedbackOptionsModel implements Serializable {
    @C6593c(mo15949a = "audioOptions")
    private ArrayList<FeedbackOptionItem> audioOptions;
    @C6593c(mo15949a = "satisfied")
    private boolean satisfied;
    @C6593c(mo15949a = "videoOptions")
    private ArrayList<FeedbackOptionItem> videoOptions;

    /* renamed from: com.ss.video.rtc.base.net.bean.FeedbackOptionsModel$FeedbackOptionItem */
    public static class FeedbackOptionItem {
        @C6593c(mo15949a = "key")
        private String key;
        @C6593c(mo15949a = "showText")
        private String showText;
        @C6593c(mo15949a = "type")
        private String type;
        @C6593c(mo15949a = "value")
        private String value;

        public String getKey() {
            return this.key;
        }

        public String getShowText() {
            return this.showText;
        }

        public String getType() {
            return this.type;
        }

        public String getValue() {
            return this.value;
        }

        public void setString(String str) {
            if (str != null || "string".equals(this.type)) {
                this.value = str;
            }
        }

        public void setBoolean(boolean z) {
            if (!"bool".equals(this.type) && !"boolean".equals(this.type)) {
                return;
            }
            if (z) {
                this.value = "true";
            } else {
                this.value = null;
            }
        }

        public void setNum(double d) {
            if ("num".equals(this.type)) {
                this.value = String.valueOf(d);
            }
        }

        public void setNum(float f) {
            if ("num".equals(this.type)) {
                this.value = String.valueOf(f);
            }
        }

        public void setNum(int i) {
            if ("num".equals(this.type)) {
                this.value = String.valueOf(i);
            }
        }

        public void setNum(long j) {
            if ("num".equals(this.type)) {
                this.value = String.valueOf(j);
            }
        }

        public void setNum(short s) {
            if ("num".equals(this.type)) {
                this.value = String.valueOf(s);
            }
        }

        public FeedbackOptionItem(String str, String str2, String str3) {
            this.key = str;
            this.showText = str2;
            this.type = str3;
        }
    }

    public ArrayList<FeedbackOptionItem> getAudioOptions() {
        return this.audioOptions;
    }

    public ArrayList<FeedbackOptionItem> getVideoOptions() {
        return this.videoOptions;
    }

    public boolean isSatisfied() {
        return this.satisfied;
    }

    public void setSatisfied(boolean z) {
        this.satisfied = z;
    }
}
