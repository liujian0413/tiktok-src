package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.model.d */
public final class C8149d {
    @C6593c(mo15949a = "item_type")

    /* renamed from: A */
    public int f22222A;
    @C6593c(mo15949a = "scheme_url")

    /* renamed from: B */
    public String f22223B;
    @C6593c(mo15949a = "gift_operation")

    /* renamed from: C */
    public GiftOperation f22224C;
    @C6593c(mo15949a = "event_name")

    /* renamed from: D */
    public String f22225D;
    @C6593c(mo15949a = "for_portal")

    /* renamed from: E */
    public boolean f22226E;
    @C6593c(mo15949a = "business_text")

    /* renamed from: F */
    public String f22227F;
    @C6593c(mo15949a = "cny_gift")

    /* renamed from: G */
    public boolean f22228G;
    @C6593c(mo15949a = "duration")

    /* renamed from: H */
    private int f22229H;
    @C6593c(mo15949a = "name")

    /* renamed from: a */
    public String f22230a;
    @C6593c(mo15949a = "image")

    /* renamed from: b */
    public ImageModel f22231b;
    @C6593c(mo15949a = "describe")

    /* renamed from: c */
    public String f22232c;
    @C6593c(mo15949a = "id")

    /* renamed from: d */
    public long f22233d;
    @C6593c(mo15949a = "type")

    /* renamed from: e */
    public int f22234e;
    @C6593c(mo15949a = "diamond_count")

    /* renamed from: f */
    public int f22235f;
    @C6593c(mo15949a = "combo")

    /* renamed from: g */
    public boolean f22236g;
    @C6593c(mo15949a = "subs")

    /* renamed from: h */
    public List<Object> f22237h = new ArrayList();
    @C6593c(mo15949a = "doodle")

    /* renamed from: i */
    public boolean f22238i;
    @C6593c(mo15949a = "for_linkmic")

    /* renamed from: j */
    public boolean f22239j = true;
    @C6593c(mo15949a = "nameColor")

    /* renamed from: k */
    public int f22240k = -1;
    @C6593c(mo15949a = "describeColor")

    /* renamed from: l */
    public int f22241l = -1711276033;
    @C6593c(mo15949a = "action_type")

    /* renamed from: m */
    public int f22242m;
    @C6593c(mo15949a = "watermelon_seeds")

    /* renamed from: n */
    public int f22243n;
    @C6593c(mo15949a = "gift_label_icon")

    /* renamed from: o */
    public ImageModel f22244o;
    @C6593c(mo15949a = "is_displayed_on_panel")

    /* renamed from: p */
    public boolean f22245p = true;
    @C6593c(mo15949a = "special_effects")

    /* renamed from: q */
    public Map<String, Integer> f22246q;
    @C6593c(mo15949a = "primary_effect_id")

    /* renamed from: r */
    public long f22247r;
    @C6593c(mo15949a = "manual")

    /* renamed from: s */
    public String f22248s;
    @C6593c(mo15949a = "guide_url")

    /* renamed from: t */
    public String f22249t;
    @C6593c(mo15949a = "gold_effect")

    /* renamed from: u */
    public String f22250u;
    @C6593c(mo15949a = "golden_beans")

    /* renamed from: v */
    public long f22251v;
    @C6593c(mo15949a = "honor_level")

    /* renamed from: w */
    public long f22252w;
    @C6593c(mo15949a = "for_fansclub")

    /* renamed from: x */
    public boolean f22253x;
    @C6593c(mo15949a = "fansclub_info")

    /* renamed from: y */
    public C8154i f22254y;
    @C6593c(mo15949a = "noble_level")

    /* renamed from: z */
    public long f22255z;

    /* renamed from: b */
    public final int mo21279b() {
        if (this.f22229H <= 0) {
            this.f22229H = 3000;
        }
        return this.f22229H;
    }

    /* renamed from: c */
    public final boolean mo21280c() {
        if (this.f22252w > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo21281d() {
        if (this.f22255z > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo21278a() {
        if (this.f22234e == 2 || this.f22234e == 4 || this.f22234e == 8) {
            return true;
        }
        return false;
    }
}
