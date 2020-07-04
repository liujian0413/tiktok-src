package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;
import java.util.List;

public class NobleLevelInfo {
    @C6593c(mo15949a = "expire_time")
    public long expireTime;
    @C6593c(mo15949a = "noble_background")
    ImageModel nobleBackground;
    @C6593c(mo15949a = "noble_background_color")
    public List<String> nobleBackgroundColor;
    @C6593c(mo15949a = "noble_big_icon")
    ImageModel nobleBigIcon;
    @C6593c(mo15949a = "noble_boarder")
    public ImageModel nobleBoarder;
    @C6593c(mo15949a = "noble_icon")
    ImageModel nobleIcon;
    @C6593c(mo15949a = "noble_icon_with_back")
    ImageModel nobleIconWithBack;
    @C6593c(mo15949a = "noble_level")
    long nobleLevel;
    @C6593c(mo15949a = "noble_name")
    String nobleName;

    public long getExpireTime() {
        return this.expireTime;
    }

    public ImageModel getNobleBackground() {
        return this.nobleBackground;
    }

    public List<String> getNobleBackgroundColor() {
        return this.nobleBackgroundColor;
    }

    public ImageModel getNobleBigIcon() {
        return this.nobleBigIcon;
    }

    public ImageModel getNobleBoarder() {
        return this.nobleBoarder;
    }

    public ImageModel getNobleIcon() {
        return this.nobleIcon;
    }

    public ImageModel getNobleIconWithBack() {
        return this.nobleIconWithBack;
    }

    public long getNobleLevel() {
        return this.nobleLevel;
    }

    public String getNobleName() {
        return this.nobleName;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setNobleBackground(ImageModel imageModel) {
        this.nobleBackground = imageModel;
    }

    public void setNobleBackgroundColor(List<String> list) {
        this.nobleBackgroundColor = list;
    }

    public void setNobleBigIcon(ImageModel imageModel) {
        this.nobleBigIcon = imageModel;
    }

    public void setNobleBoarder(ImageModel imageModel) {
        this.nobleBoarder = imageModel;
    }

    public void setNobleIcon(ImageModel imageModel) {
        this.nobleIcon = imageModel;
    }

    public void setNobleIconWithBack(ImageModel imageModel) {
        this.nobleIconWithBack = imageModel;
    }

    public void setNobleLevel(long j) {
        this.nobleLevel = j;
    }

    public void setNobleName(String str) {
        this.nobleName = str;
    }
}
