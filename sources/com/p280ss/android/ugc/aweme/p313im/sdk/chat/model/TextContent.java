package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent */
public class TextContent extends BaseContent {
    @C6593c(mo15949a = "type")
    private int heartType;
    boolean isDefault;
    @C6593c(mo15949a = "text")
    String text;

    public int getHeartType() {
        return this.heartType;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.text)) {
            return true;
        }
        return false;
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("text");
        a.f20186l.putString("share_text", getText());
        return a;
    }

    public String getMsgHint() {
        if (this.heartType == 1 || this.heartType == 2) {
            return C6399b.m19921a().getString(R.string.brx);
        }
        return getText();
    }

    public String getText() {
        if (this.heartType == 1 || this.heartType == 2) {
            return C6399b.m19921a().getString(R.string.brx);
        }
        return this.text;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public void setHeartType(int i) {
        this.heartType = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public static TextContent obtain(String str) {
        TextContent textContent = new TextContent();
        textContent.setText(str);
        textContent.setType(700);
        return textContent;
    }

    public static TextContent obtain(TextContent textContent) {
        TextContent textContent2 = new TextContent();
        textContent2.setText(textContent.getText());
        textContent2.setType(700);
        textContent2.prevId = textContent.prevId;
        textContent2.rootId = textContent.rootId;
        return textContent2;
    }
}
