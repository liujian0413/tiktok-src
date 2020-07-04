package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.p276a.C6593c;
import java.util.List;

public class LiveCoreSDKData {
    @C6593c(mo15949a = "pull_data")
    PullData pullData;

    public static class Options {
        @C6593c(mo15949a = "default_quality")
        Quality defaultQuality;
        @C6593c(mo15949a = "qualities")
        List<Quality> qualityList;

        public Quality getDefaultQuality() {
            return this.defaultQuality;
        }

        public List<Quality> getQualityList() {
            return this.qualityList;
        }

        public void setDefaultQuality(Quality quality) {
            this.defaultQuality = quality;
        }

        public void setQualityList(List<Quality> list) {
            this.qualityList = list;
        }
    }

    public static class PullData {
        @C6593c(mo15949a = "options")
        Options options;
        @C6593c(mo15949a = "stream_data")
        String streamData;

        public Options getOptions() {
            return this.options;
        }

        public String getStreamData() {
            return this.streamData;
        }

        public void setOptions(Options options2) {
            this.options = options2;
        }

        public void setStreamData(String str) {
            this.streamData = str;
        }
    }

    public static class Quality {
        @C6593c(mo15949a = "name")
        public String name;
        @C6593c(mo15949a = "sdk_key")
        public String sdkKey;
    }

    public PullData getPullData() {
        return this.pullData;
    }

    public Quality getDefaultQuality() {
        if (this.pullData == null || this.pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().defaultQuality;
    }

    public List<Quality> getQualityList() {
        if (this.pullData == null || this.pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().getQualityList();
    }

    public void setPullData(PullData pullData2) {
        this.pullData = pullData2;
    }
}
