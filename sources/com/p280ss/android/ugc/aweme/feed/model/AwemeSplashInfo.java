package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo */
public class AwemeSplashInfo implements Serializable {
    public transient boolean adCardShownOnce;
    @C6593c(mo15949a = "awesome_splash_id")
    private String awesomeSplashId;
    public transient boolean contextTrackSent;
    @C6593c(mo15949a = "disable_hotstart_show")
    private boolean disableHotStartShow;
    @C6593c(mo15949a = "enable_splash_open")
    private boolean enableSplashOpen;
    @C6593c(mo15949a = "end_time")
    private int endTime;
    @C6593c(mo15949a = "hot_show_type")
    private int hotShowType;
    @C6593c(mo15949a = "is_invalid_ad")
    private boolean isInvalidAd;
    @C6591a(mo15945a = false, mo15946b = false)
    private transient boolean isShown;
    @C6593c(mo15949a = "label_info")
    private LabelInfo labelInfo;
    @C6593c(mo15949a = "predownload_text")
    private String predownloadText;
    @C6593c(mo15949a = "preload_type")
    private int preloadType;
    @C6593c(mo15949a = "skip_info")
    private SkipInfo skipInfo;
    @C6593c(mo15949a = "splash_show_time")
    private float splashShowTime = 3000.0f;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo$LabelInfo */
    public class LabelInfo implements Serializable {
        @C6593c(mo15949a = "background_color")
        private String backgroundColor;
        @C6593c(mo15949a = "position")
        private int position;
        @C6593c(mo15949a = "text")
        private String text;
        @C6593c(mo15949a = "text_color")
        private String textColor;

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public LabelInfo() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo$SkipInfo */
    public class SkipInfo implements Serializable {
        @C6593c(mo15949a = "background_color")
        private String backgroundColor;
        @C6593c(mo15949a = "countdown_unit")
        private String countdownUnit;
        @C6593c(mo15949a = "countdown_enable")
        private int countdown_enable;
        @C6593c(mo15949a = "height_extra_size")
        private int heightExtraSize;
        @C6593c(mo15949a = "text")
        private String text;
        @C6593c(mo15949a = "text_color")
        private String textColor;
        @C6593c(mo15949a = "width_extra_size")
        private int widthExtraSize;

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getCountdownUnit() {
            return this.countdownUnit;
        }

        public int getHeightExtraSize() {
            return this.heightExtraSize;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public int getWidthExtraSize() {
            return this.widthExtraSize;
        }

        public boolean isCountdown_enable() {
            if (this.countdown_enable == 1) {
                return true;
            }
            return false;
        }

        public SkipInfo() {
        }
    }

    public String getAwesomeSplashId() {
        return this.awesomeSplashId;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public int getHotShowType() {
        return this.hotShowType;
    }

    public LabelInfo getLabelInfo() {
        return this.labelInfo;
    }

    public String getPredownloadText() {
        return this.predownloadText;
    }

    public int getPreloadType() {
        return this.preloadType;
    }

    public SkipInfo getSkipInfo() {
        return this.skipInfo;
    }

    public float getSplashShowTime() {
        return this.splashShowTime;
    }

    public boolean isDisableHotStartShow() {
        return this.disableHotStartShow;
    }

    public boolean isEnableSplashOpen() {
        return this.enableSplashOpen;
    }

    public boolean isInvalidAd() {
        return this.isInvalidAd;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public void setAwesomeSplashId(String str) {
        this.awesomeSplashId = str;
    }

    public void setEnableSplashOpen(boolean z) {
        this.enableSplashOpen = z;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setHotShowType(int i) {
        this.hotShowType = i;
    }

    public void setInvalidAd(boolean z) {
        this.isInvalidAd = z;
    }

    public void setPreloadType(int i) {
        this.preloadType = i;
    }

    public void setShown(boolean z) {
        this.isShown = z;
    }

    public void setSplashShowTime(float f) {
        this.splashShowTime = f;
    }
}
