package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7104a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.CommandShareContent */
public class CommandShareContent extends BaseContent {
    @C6593c(mo15949a = "author_name")
    private String authorName;
    @C6593c(mo15949a = "cover_url")
    private UrlModel coverUrl;
    private boolean isSendMsg;
    @C6593c(mo15949a = "itemId")
    private String itemId;
    @C6593c(mo15949a = "title")
    private String title;

    public String getAuthorName() {
        return this.authorName;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isSendMsg() {
        return this.isSendMsg;
    }

    public String getMsgHint() {
        if (this.isSendMsg) {
            return C6399b.m19921a().getString(R.string.bi5);
        }
        return C6399b.m19921a().getString(R.string.bi4);
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setSendMsg(boolean z) {
        this.isSendMsg = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public static CommandShareContent obtain(C7104a aVar) {
        CommandShareContent commandShareContent = new CommandShareContent();
        commandShareContent.setItemId(aVar.f19953a);
        commandShareContent.setTitle(aVar.f19955c);
        commandShareContent.setAuthorName(aVar.f19957e);
        commandShareContent.setCoverUrl(aVar.f19954b);
        return commandShareContent;
    }
}
