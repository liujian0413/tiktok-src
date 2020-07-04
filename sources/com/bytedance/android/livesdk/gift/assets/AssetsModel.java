package com.bytedance.android.livesdk.gift.assets;

import com.google.gson.p276a.C6593c;

public class AssetsModel {
    public static final int DOWNLOAD_TYPE_NO = 2;
    public static final int DOWNLOAD_TYPE_UNKONW = 0;
    public static final int DOWNLOAD_TYPE_YES = 1;
    private static final int NUM_31 = 31;
    private static final int NUM_32 = 32;
    public static final int RESOURCE_TYPE_ENTER_WEBP = 6;
    public static final int RESOURCE_TYPE_LOTTIE = 2;
    public static final int RESOURCE_TYPE_MP4 = 4;
    public static final int RESOURCE_TYPE_STICKER = 5;
    public static final int RESOURCE_TYPE_WEBP = 1;
    @C6593c(mo15949a = "describe")
    private String describe;
    @C6593c(mo15949a = "download_type")
    private int downloadType;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private long f21251id;
    @C6593c(mo15949a = "md5")
    private String md5;
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "resource_url")
    private C7876i resourceModel;
    @C6593c(mo15949a = "resource_type")
    private int resourceType;
    @C6593c(mo15949a = "resource_uri")
    private String resourceUri;
    @C6593c(mo15949a = "size")
    private long size;

    public String getDescribe() {
        return this.describe;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public long getId() {
        return this.f21251id;
    }

    public String getMD5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public C7876i getResourceModel() {
        return this.resourceModel;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public String getResourceUri() {
        return this.resourceUri;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = ((int) (this.f21251id ^ (this.f21251id >>> 32))) * 31;
        int i6 = 0;
        if (this.name != null) {
            i = this.name.hashCode();
        } else {
            i = 0;
        }
        int i7 = (i5 + i) * 31;
        if (this.describe != null) {
            i2 = this.describe.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        if (this.md5 != null) {
            i3 = this.md5.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (((i8 + i3) * 31) + this.resourceType) * 31;
        if (this.resourceUri != null) {
            i4 = this.resourceUri.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        if (this.resourceModel != null) {
            i6 = this.resourceModel.hashCode();
        }
        return ((((i10 + i6) * 31) + ((int) (this.size ^ (this.size >>> 32)))) * 31) + this.downloadType;
    }

    @C6593c(mo15949a = "describe")
    public void setDescribe(String str) {
        this.describe = str;
    }

    @C6593c(mo15949a = "download_type")
    public void setDownloadType(int i) {
        this.downloadType = i;
    }

    @C6593c(mo15949a = "id")
    public void setId(long j) {
        this.f21251id = j;
    }

    @C6593c(mo15949a = "md5")
    public void setMD5(String str) {
        this.md5 = str;
    }

    @C6593c(mo15949a = "name")
    public void setName(String str) {
        this.name = str;
    }

    @C6593c(mo15949a = "resource_url")
    public void setResourceModel(C7876i iVar) {
        this.resourceModel = iVar;
    }

    @C6593c(mo15949a = "resource_type")
    public void setResourceType(int i) {
        this.resourceType = i;
    }

    @C6593c(mo15949a = "resource_uri")
    public void setResourceUri(String str) {
        this.resourceUri = str;
    }

    @C6593c(mo15949a = "size")
    public void setSize(long j) {
        this.size = j;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AssetsModel)) {
            return false;
        }
        AssetsModel assetsModel = (AssetsModel) obj;
        if (this.f21251id == assetsModel.f21251id && this.md5.equals(assetsModel.getMD5()) && this.name.equals(assetsModel.getName()) && this.describe.equals(assetsModel.getDescribe()) && this.resourceType == assetsModel.getResourceType() && this.resourceUri.equals(assetsModel.getResourceUri()) && this.size == assetsModel.getSize() && this.downloadType == assetsModel.getDownloadType()) {
            return true;
        }
        return false;
    }
}
