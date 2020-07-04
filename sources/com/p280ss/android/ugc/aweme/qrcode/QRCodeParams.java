package com.p280ss.android.ugc.aweme.qrcode;

import com.p280ss.android.ugc.aweme.i18n.C30537o;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.QRCodeParams */
public class QRCodeParams implements Serializable {
    public String describe;
    public String enterFrom;
    public String hashTagName;
    public boolean isEnterprisePoi;
    public boolean isEnterpriseUser;
    public boolean isHashTag;
    public String objectId;
    public String title;
    public int type;
    public String webDes;
    public String webImage;
    public String webUrl;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.QRCodeParams$a */
    public static class C36995a {

        /* renamed from: a */
        public QRCodeParams f96920a = new QRCodeParams();

        /* renamed from: b */
        public final C36995a mo93434b(String str, long j) {
            this.f96920a.title = str;
            this.f96920a.describe = C30537o.m99741b(j);
            return this;
        }

        /* renamed from: a */
        public final C36995a mo93430a(String str, int i) {
            this.f96920a.title = str;
            this.f96920a.describe = String.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public final C36995a mo93431a(String str, long j) {
            this.f96920a.title = str;
            this.f96920a.describe = String.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public final C36995a mo93432a(String str, String str2) {
            this.f96920a.title = str;
            this.f96920a.describe = str2;
            return this;
        }

        /* renamed from: a */
        public final C36995a mo93428a(int i, String str, String str2) {
            return mo93429a(i, str, false, "", str2);
        }

        /* renamed from: a */
        public final C36995a mo93433a(String str, String str2, boolean z) {
            this.f96920a.title = str;
            this.f96920a.describe = str2;
            this.f96920a.isEnterpriseUser = z;
            return this;
        }

        /* renamed from: a */
        public final C36995a mo93429a(int i, String str, boolean z, String str2, String str3) {
            this.f96920a.type = i;
            this.f96920a.objectId = str;
            this.f96920a.isHashTag = z;
            this.f96920a.hashTagName = str2;
            this.f96920a.enterFrom = str3;
            return this;
        }
    }

    private QRCodeParams() {
    }

    public String getWebDes() {
        return this.webDes;
    }

    public String getWebImage() {
        return this.webImage;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setWebDes(String str) {
        this.webDes = str;
    }

    public void setWebImage(String str) {
        this.webImage = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public QRCodeParams(int i, String str, String str2) {
        this.type = i;
        this.objectId = str;
        this.hashTagName = "";
        this.enterFrom = str2;
    }

    public QRCodeParams(int i, String str, boolean z, String str2, String str3) {
        this.type = i;
        this.objectId = str;
        this.isHashTag = z;
        this.hashTagName = str2;
        this.enterFrom = str3;
    }
}
