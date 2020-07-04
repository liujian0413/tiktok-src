package com.bytedance.android.livesdk.utils;

import android.os.Bundle;
import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.utils.l */
public final class C9074l {
    /* renamed from: a */
    public static DouPlusEntry m27081a(DataCenter dataCenter) {
        if (dataCenter == null) {
            return DouPlusEntry.defaultOne();
        }
        return (DouPlusEntry) dataCenter.get("data_dou_plus_promote_entry", DouPlusEntry.defaultOne());
    }

    /* renamed from: b */
    public static boolean m27086b(DataCenter dataCenter) {
        if (dataCenter == null || !((Boolean) dataCenter.get("enter_from_dou_plus", Boolean.valueOf(false))).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static Map<String, String> m27087c(DataCenter dataCenter) {
        if (dataCenter == null) {
            return new HashMap();
        }
        return (Map) dataCenter.get("live_douplus_log_extra", new HashMap());
    }

    /* renamed from: d */
    public static boolean m27089d(DataCenter dataCenter) {
        if (dataCenter == null || !((Boolean) dataCenter.get("enter_from_effect_ad", Boolean.valueOf(false))).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static Map<String, String> m27090e(DataCenter dataCenter) {
        if (dataCenter == null) {
            return new HashMap();
        }
        return (Map) dataCenter.get("live_effect_ad_log_extra_map", new HashMap());
    }

    /* renamed from: b */
    public static void m27085b(DataCenter dataCenter, Bundle bundle) {
        if (dataCenter != null && bundle != null) {
            dataCenter.lambda$put$1$DataCenter("enter_from_effect_ad", Boolean.valueOf(bundle.getBoolean("enter_from_effect_ad", false)));
            dataCenter.lambda$put$1$DataCenter("live_effect_ad_log_extra_map", bundle.getSerializable("live_effect_ad_log_extra_map"));
        }
    }

    /* renamed from: a */
    public static void m27083a(DataCenter dataCenter, Bundle bundle) {
        if (dataCenter != null && bundle != null) {
            dataCenter.lambda$put$1$DataCenter("enter_from_dou_plus", Boolean.valueOf(bundle.getBoolean("enter_from_dou_plus", false)));
            dataCenter.lambda$put$1$DataCenter("live_douplus_log_extra", bundle.getSerializable("live_douplus_log_extra"));
        }
    }

    /* renamed from: c */
    public static void m27088c(DataCenter dataCenter, Bundle bundle) {
        if (bundle != null && dataCenter != null) {
            if (bundle.getBoolean("enter_from_effect_ad", false)) {
                bundle.remove("enter_from_effect_ad");
                bundle.remove("live_effect_ad_log_extra_map");
                dataCenter.lambda$put$1$DataCenter("enter_from_effect_ad", Boolean.valueOf(false));
                dataCenter.lambda$put$1$DataCenter("live_effect_ad_log_extra_map", new HashMap());
            }
            if (bundle.getBoolean("enter_from_dou_plus", false)) {
                bundle.remove("enter_from_dou_plus");
                bundle.remove("live_douplus_log_extra");
                dataCenter.lambda$put$1$DataCenter("enter_from_dou_plus", Boolean.valueOf(false));
                dataCenter.lambda$put$1$DataCenter("live_douplus_log_extra", new HashMap());
            }
        }
    }

    /* renamed from: a */
    public static boolean m27084a(Room room, DataCenter dataCenter) {
        if ((room == null || !room.isDouPlusPromotion) && (dataCenter == null || !((DouPlusEntry) dataCenter.get("data_dou_plus_promote_entry", DouPlusEntry.defaultOne())).hasDouPlusEntry)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m27082a(DouPlusEntry douPlusEntry, Room room, DataCenter dataCenter) {
        if (douPlusEntry == null) {
            douPlusEntry = DouPlusEntry.defaultOne();
        }
        if (room != null) {
            room.isDouPlusPromotion = douPlusEntry.hasDouPlusEntry;
        }
        if (dataCenter != null) {
            dataCenter.lambda$put$1$DataCenter("data_dou_plus_promote_entry", douPlusEntry);
        }
    }
}
