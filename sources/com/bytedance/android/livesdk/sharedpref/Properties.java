package com.bytedance.android.livesdk.sharedpref;

import com.bytedance.android.livesdkapi.IPropertyCache.C9283a;
import com.bytedance.android.livesdkapi.IPropertyCache.PropertyType;

public enum Properties implements C9283a {
    GIFT_LIST("gift_list", PropertyType.String, "", true),
    LAST_SHARE_CHANNEL("last_share_channel", PropertyType.String, "", true),
    SHOW_LIVE_PORTRAIT_GUIDE("show_live_portrait_guide", PropertyType.Boolean, Boolean.valueOf(false), true),
    SHOW_LIVE_LANDSCAPE_GUIDE("show_live_landscape_guide", PropertyType.Boolean, Boolean.valueOf(false), true),
    FIRST_ENTER_LIVE_START("first_enter_live_start", PropertyType.Boolean, Boolean.valueOf(true), true),
    CLICK_RECORD_BUTTON_IN_END_LIVE("click_record_button_in_end_live", PropertyType.Boolean, Boolean.valueOf(false), true),
    HAS_SHOW_FILTER_GUIDE("has_show_filter_guide", PropertyType.Boolean, Boolean.valueOf(false), true),
    FAST_GIFT_HIDE_CONFIRM_GIFT("fast_gift_hide_confirm_gift", PropertyType.Long, Long.valueOf(0), true),
    DECORATION_ANCHOR_ID("room_decoration_anchor_id", PropertyType.Long, Long.valueOf(0), true),
    DECORATION_TEXT_PASS_LEVEL("room_decoration_text_pass_level", PropertyType.Integer, Integer.valueOf(31), true),
    DECORATION_CUSTOMIZE_TEXT("room_decoration_customize_text", PropertyType.String, "", true),
    DECORATION_LIST("room_decoration_list", PropertyType.String, "", true),
    SHOW_INTERACT_GUIDE("has_shown_interact_guide", PropertyType.Long, Long.valueOf(0), true),
    SEND_DELAY_RED_ENVELOPE("send_delay_red_envelope", PropertyType.Boolean, Boolean.valueOf(true), true),
    NEED_FAST_GIFT_HINT("need_fast_gift_hint", PropertyType.Boolean, Boolean.valueOf(true), true),
    SHOW_ROOM_DECORATION_TOAST("show_room_decoration_toast", PropertyType.Boolean, Boolean.valueOf(true), true),
    LOCATION_HINT_SHOWN_COUNT("location_hint_shown_count", PropertyType.Integer, Integer.valueOf(0), true),
    LIVE_INTERACT_SETTING_RED_POINT("live_interact_red_point", PropertyType.Boolean, Boolean.valueOf(true), true),
    LIVE_INTERACT_PK_SETTING_RED_POINT("live_interact_pk_red_point", PropertyType.Boolean, Boolean.valueOf(true), true),
    LIVE_INTERACT_PK_AUTO_MATCH("live_interact_pk_auto_match", PropertyType.Boolean, Boolean.valueOf(true), true),
    LIVE_INTERACT_PK_AUTO_START_MATCH("live_interact_pk_auto_start_match", PropertyType.Boolean, Boolean.valueOf(false), true),
    LIVE_INTERACT_PK_THEME("live_interact_pk_theme", PropertyType.String, "", true),
    LIVE_INTERACT_PK_TIME_INDEX("live_interact_pk_time_index", PropertyType.Integer, Integer.valueOf(1), true),
    LIVE_LAST_SHOW_RED_POINT_TIME("live_last_show_red_point_time", PropertyType.Long, Integer.valueOf(0), true),
    LIVE_INTERACT_BEAUTY_LEVEL("live_interact_beauty_level", PropertyType.Integer, Integer.valueOf(2), true);
    
    private final Object defVal;
    private final String key;
    private final boolean supportPersist;
    private final PropertyType type;

    public final Object defValue() {
        return this.defVal;
    }

    public final String key() {
        return this.key;
    }

    public final boolean supportPersist() {
        return this.supportPersist;
    }

    public final PropertyType type() {
        return this.type;
    }

    private Properties(String str, PropertyType propertyType, Object obj, boolean z) {
        this.key = str;
        this.type = propertyType;
        this.defVal = obj;
        this.supportPersist = z;
    }
}
