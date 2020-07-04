package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.p276a.C6593c;

public class RoomAuthStatus {
    @C6593c(mo15949a = "Chat")
    public boolean enableChat;
    @C6593c(mo15949a = "Danmaku")
    public boolean enableDanmaku;
    @C6593c(mo15949a = "Digg")
    public boolean enableDigg;
    @C6593c(mo15949a = "Gift")
    public boolean enableGift;
    @C6593c(mo15949a = "LuckMoney")
    boolean enableLuckMoney;
    @C6593c(mo15949a = "Props")
    public boolean enableProps;
    @C6593c(mo15949a = "RoomContributor")
    boolean enableRoomContributor;

    public boolean isEnableChat() {
        return this.enableChat;
    }

    public boolean isEnableDanmaku() {
        return this.enableDanmaku;
    }

    public boolean isEnableDigg() {
        return this.enableDigg;
    }

    public boolean isEnableGift() {
        return this.enableGift;
    }

    public boolean isEnableLuckMoney() {
        return this.enableLuckMoney;
    }

    public boolean isEnableProps() {
        return this.enableProps;
    }

    public boolean isEnableRoomContributor() {
        return this.enableRoomContributor;
    }

    public void setEnableChat(boolean z) {
        this.enableChat = z;
    }

    public void setEnableDanmaku(boolean z) {
        this.enableDanmaku = z;
    }

    public void setEnableDigg(boolean z) {
        this.enableDigg = z;
    }

    public void setEnableGift(boolean z) {
        this.enableGift = z;
    }

    public void setEnableLuckMoney(boolean z) {
        this.enableLuckMoney = z;
    }

    public void setEnableProps(boolean z) {
        this.enableProps = z;
    }

    public void setEnableRoomContributor(boolean z) {
        this.enableRoomContributor = z;
    }
}
