package com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockedStickerListResponse */
public class UnlockedStickerListResponse {
    @C6593c(mo15949a = "status_code")
    int code;
    @C6593c(mo15949a = "sticker_ids")
    List<String> idList;
    @C6593c(mo15949a = "status_msg")
    String message;
    @C6593c(mo15949a = "texts")
    List<LockStickerTextBean> textBeanList;

    public int getCode() {
        return this.code;
    }

    public List<String> getIdList() {
        return this.idList;
    }

    public String getMessage() {
        return this.message;
    }

    public List<LockStickerTextBean> getTextBeanList() {
        return this.textBeanList;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setIdList(List<String> list) {
        this.idList = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTextBeanList(List<LockStickerTextBean> list) {
        this.textBeanList = list;
    }
}
