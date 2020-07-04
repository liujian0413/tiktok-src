package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.google.gson.p276a.C6593c;

public class Prop {
    public static final int CNY_PROP_SEND_COUNT = 10;
    public static final long PROP_TYPE_POPULAR_CARD = 4;
    @C6593c(mo15949a = "banner")
    public C9357a banner;
    @C6593c(mo15949a = "count")
    public int count;
    @C6593c(mo15949a = "description")
    public String description;
    @C6593c(mo15949a = "diamond")
    public int diamond;
    @C6593c(mo15949a = "diamond_icon")
    public ImageModel diamondLabel;
    @C6593c(mo15949a = "gift")
    public C8149d gift = new C8149d();
    @C6593c(mo15949a = "guide_url")
    public String guideUrl;
    @C6593c(mo15949a = "icon")
    public ImageModel icon;
    @C6593c(mo15949a = "prop_def_id")

    /* renamed from: id */
    public long f22201id;
    @C6593c(mo15949a = "is_aweme_free_gift")
    public int isAwemeFreeGift;
    @C6593c(mo15949a = "label_icon")
    public ImageModel labelIcon;
    @C6593c(mo15949a = "manual")
    public String manual;
    @C6593c(mo15949a = "name")
    public String name;
    @C6593c(mo15949a = "next_expire")
    public long nextExpire;
    private long nowTimeDiff;
    @C6593c(mo15949a = "primary_effect_id")
    public int primaryEffectId;
    @C6593c(mo15949a = "prop_def_type")
    public long propType;
    @C6593c(mo15949a = "reddot_tip")
    public boolean reddotTip;

    public long getNowTimeDiff() {
        return this.nowTimeDiff;
    }

    public void setNowTimeDiff(long j) {
        this.nowTimeDiff = j;
    }

    public static Prop newInstance(Prop prop) {
        Prop prop2 = new Prop();
        if (prop == null) {
            return prop2;
        }
        prop2.primaryEffectId = prop.primaryEffectId;
        prop2.nextExpire = prop.nextExpire;
        prop2.description = prop.description;
        prop2.f22201id = prop.f22201id;
        prop2.manual = prop.manual;
        prop2.guideUrl = prop.guideUrl;
        prop2.diamond = prop.diamond;
        prop2.reddotTip = prop.reddotTip;
        prop2.icon = prop.icon;
        prop2.count = prop.count;
        prop2.name = prop.name;
        prop2.gift = prop.gift;
        prop2.labelIcon = prop.labelIcon;
        prop2.diamondLabel = prop.diamondLabel;
        prop2.isAwemeFreeGift = prop.isAwemeFreeGift;
        prop2.nowTimeDiff = prop.nowTimeDiff;
        prop2.banner = prop.banner;
        return prop2;
    }
}
