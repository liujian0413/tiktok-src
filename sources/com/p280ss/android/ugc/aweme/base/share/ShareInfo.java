package com.p280ss.android.ugc.aweme.base.share;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.base.share.ShareInfo */
public class ShareInfo implements Serializable {
    @C6593c(mo15949a = "bool_persist")
    public int boolPersist;
    @C6593c(mo15949a = "manage_goods_url")
    public String goodsManagerUrl;
    @C6593c(mo15949a = "goods_rec_url")
    public String goodsRecUrl;
    @C6593c(mo15949a = "share_image_url")
    public UrlModel imageUrls;
    @C6593c(mo15949a = "share_qrcode_url")
    public UrlModel qrCodeUrls;
    @C6593c(mo15949a = "share_desc")
    public String shareDesc;
    @C6593c(mo15949a = "share_link_desc")
    public String shareLinkDesc;
    @C6593c(mo15949a = "share_quote")
    public String shareQuote;
    @C6593c(mo15949a = "share_signature_desc")
    public String shareSignatureDesc;
    @C6593c(mo15949a = "share_signature_url")
    public String shareSignatureUrl;
    @C6593c(mo15949a = "share_title")
    public String shareTitle;
    @C6593c(mo15949a = "share_title_myself")
    public String shareTitleMyself;
    @C6593c(mo15949a = "share_title_other")
    public String shareTitleOther;
    @C6593c(mo15949a = "share_toutiao_desc")
    public String shareToutiaoDesc;
    @C6593c(mo15949a = "share_url")
    public String shareUrl;
    @C6593c(mo15949a = "share_weibo_desc")
    public String shareWeiboDesc;
    @C6593c(mo15949a = "whatsapp_desc")
    public String whatsappShareDesc;

    public int getBoolPersist() {
        return this.boolPersist;
    }

    public String getGoodsManagerUrl() {
        return this.goodsManagerUrl;
    }

    public String getGoodsRecUrl() {
        return this.goodsRecUrl;
    }

    public UrlModel getImageUrls() {
        return this.imageUrls;
    }

    public UrlModel getQrCodeUrls() {
        return this.qrCodeUrls;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public String getShareLinkDesc() {
        return this.shareLinkDesc;
    }

    public String getShareQuote() {
        return this.shareQuote;
    }

    public String getShareSignatureDesc() {
        return this.shareSignatureDesc;
    }

    public String getShareSignatureUrl() {
        return this.shareSignatureUrl;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareTitleMyself() {
        return this.shareTitleMyself;
    }

    public String getShareTitleOther() {
        return this.shareTitleOther;
    }

    public String getShareToutiaoDesc() {
        return this.shareToutiaoDesc;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getShareWeiboDesc() {
        return this.shareWeiboDesc;
    }

    public String getWhatsappShareDesc() {
        return this.whatsappShareDesc;
    }

    public void setBoolPersist(int i) {
        this.boolPersist = i;
    }

    public void setGoodsManagerUrl(String str) {
        this.goodsManagerUrl = str;
    }

    public void setGoodsRecUrl(String str) {
        this.goodsRecUrl = str;
    }

    public void setImageUrls(UrlModel urlModel) {
        this.imageUrls = urlModel;
    }

    public void setQrCodeUrls(UrlModel urlModel) {
        this.qrCodeUrls = urlModel;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareLinkDesc(String str) {
        this.shareLinkDesc = str;
    }

    public void setShareQuote(String str) {
        this.shareQuote = str;
    }

    public void setShareSignatureDesc(String str) {
        this.shareSignatureDesc = str;
    }

    public void setShareSignatureUrl(String str) {
        this.shareSignatureUrl = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareTitleOther(String str) {
        this.shareTitleOther = str;
    }

    public void setShareToutiaoDesc(String str) {
        this.shareToutiaoDesc = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setShareWeiboDesc(String str) {
        this.shareWeiboDesc = str;
    }

    public void setWhatsappShareDesc(String str) {
        this.whatsappShareDesc = str;
    }

    public void setShareTitleMyself(String str) {
        this.shareTitleMyself = this.shareTitleMyself;
    }

    public ShareInfo buildUrl(String str, String str2, String str3) {
        if (!this.shareUrl.contains("utm_source")) {
            C19290j jVar = new C19290j(this.shareUrl);
            jVar.mo51188a("utm_source", str);
            jVar.mo51188a("utm_campaign", "client_share");
            jVar.mo51188a("utm_medium", "android");
            jVar.mo51188a("share_app_name", str3);
            jVar.mo51188a("iid", str2);
            this.shareUrl = jVar.mo51184a();
        } else {
            StringBuilder sb = new StringBuilder("utm_source=");
            sb.append(str);
            this.shareUrl = this.shareUrl.replaceAll("utm_source=\\w*_?\\w?", sb.toString());
        }
        return this;
    }
}
