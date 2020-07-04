package com.bytedance.android.livesdk.gift.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

public class GiftPage {
    public static final int PAGE_TYPE_FANSCLUB = 2;
    public static final int PAGE_TYPE_GIFT = 1;
    public static final int PAGE_TYPE_HONOR_LEVEL = 3;
    public static final int PAGE_TYPE_NOBLE = 4;
    public static final int PAGE_TYPE_PROPERTY = 5;
    @C6593c(mo15949a = "display")
    public boolean display;
    @C6593c(mo15949a = "event_name")
    public String eventName;
    @C6593c(mo15949a = "gifts")
    public List<C8149d> gifts;
    @C6593c(mo15949a = "page_operation")
    public GiftOperation operation;
    @C6593c(mo15949a = "page_name")
    public String pageName;
    @C6593c(mo15949a = "page_type")
    public int pageType;
}
