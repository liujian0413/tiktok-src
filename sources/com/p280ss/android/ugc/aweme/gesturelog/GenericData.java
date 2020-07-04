package com.p280ss.android.ugc.aweme.gesturelog;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.gesturelog.GenericData */
public class GenericData {
    @C6593c(mo15949a = "apk_version")
    public int apkVersion;
    @C6593c(mo15949a = "brand")
    public String brand;
    @C6593c(mo15949a = "country")
    public String country;
    @C6593c(mo15949a = "model")
    public String model;
    @C6593c(mo15949a = "screen_height")
    public int screenHeight;
    @C6593c(mo15949a = "screen_width")
    public int screenWidth;
    @C6593c(mo15949a = "sdk_version_code")
    public int sdkVersionCode;
    @C6593c(mo15949a = "user_id")
    public String userId;
    @C6593c(mo15949a = "xdpi")
    public float xdpi;
    @C6593c(mo15949a = "ydpi")
    public float ydpi;

    public GenericData(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, float f2) {
        this.brand = str;
        this.model = str2;
        this.userId = str3;
        this.country = str4;
        this.sdkVersionCode = i;
        this.apkVersion = i2;
        this.screenWidth = i3;
        this.screenHeight = i4;
        this.xdpi = f;
        this.ydpi = f2;
    }
}
