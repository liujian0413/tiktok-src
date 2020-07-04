package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;

public class GiftOperation {
    public static final int OPERATION_TYPE_PANEL = 1;
    public static final int OPERATION_TYPE_TAB = 0;
    @C6593c(mo15949a = "event_name")
    public String eventName;
    @C6593c(mo15949a = "left_image")
    public ImageModel leftImage;
    @C6593c(mo15949a = "right_image")
    public ImageModel rightImage;
    @C6593c(mo15949a = "scheme_url")
    public String schemeUrl;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "title_color")
    public String titleColor;
    @C6593c(mo15949a = "title_size")
    public int titleSize;
}
