package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Commodity */
public final class Commodity implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 42;
    @C6593c(mo15949a = "commodity_type")
    private int commodityType;
    @C6593c(mo15949a = "gid")
    private String gid = "";
    @C6593c(mo15949a = "img")
    private String image;
    private boolean isReportShow;
    private LogPbBean logPb;
    @C6593c(mo15949a = "name")
    private String name = "";
    @C6593c(mo15949a = "platform_name")
    private String platformName = "";
    @C6593c(mo15949a = "show_price")
    private long price;
    @C6593c(mo15949a = "schema")
    private String schema = "";
    @C6593c(mo15949a = "schema_type")
    private long schemaType;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.Commodity$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public final int getCommodityType() {
        return this.commodityType;
    }

    public final String getGid() {
        return this.gid;
    }

    public final String getImage() {
        return this.image;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlatformName() {
        return this.platformName;
    }

    public final long getPrice() {
        return this.price;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final long getSchemaType() {
        return this.schemaType;
    }

    public final boolean isReportShow() {
        return this.isReportShow;
    }

    public final int hashCode() {
        return this.gid.hashCode();
    }

    public final boolean isMiniApp() {
        if (this.schemaType == 1) {
            return true;
        }
        return false;
    }

    public final boolean isPreview() {
        if (this.schemaType == 2) {
            return true;
        }
        return false;
    }

    public final void setCommodityType(int i) {
        this.commodityType = i;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setPrice(long j) {
        this.price = j;
    }

    public final void setReportShow(boolean z) {
        this.isReportShow = z;
    }

    public final void setSchemaType(long j) {
        this.schemaType = j;
    }

    public final void setGid(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.gid = str;
    }

    public final void setName(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.name = str;
    }

    public final void setPlatformName(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.platformName = str;
    }

    public final void setSchema(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.schema = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Commodity)) {
            return false;
        }
        return C7573i.m23585a((Object) this.gid, (Object) ((Commodity) obj).gid);
    }
}
