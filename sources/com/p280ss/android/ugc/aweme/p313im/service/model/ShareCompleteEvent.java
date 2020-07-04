package com.p280ss.android.ugc.aweme.p313im.service.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.ShareCompleteEvent */
public class ShareCompleteEvent implements Serializable {
    public String aid;
    public IMContact contact;
    public String enterFrom;
    public boolean isMulti;
    public String itemType;

    public ShareCompleteEvent(IMContact iMContact, boolean z, String str, String str2) {
        this.contact = iMContact;
        this.isMulti = z;
        this.itemType = str;
        this.enterFrom = str2;
    }

    public ShareCompleteEvent(IMContact iMContact, boolean z, String str, String str2, String str3) {
        this.contact = iMContact;
        this.isMulti = z;
        this.itemType = str;
        this.enterFrom = str2;
        this.aid = str3;
    }
}
