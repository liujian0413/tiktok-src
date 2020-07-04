package com.p280ss.android.ugc.aweme.setting.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting */
public class PopupSetting extends BaseResponse {
    @C6593c(mo15949a = "count")
    public int count;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public String f98129id;
    @C6593c(mo15949a = "text")
    public PopupText popupText;
    @C6593c(mo15949a = "show_interval")
    public int showInterval;
    @C6593c(mo15949a = "show_time")
    public int show_time;

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonActionStruct */
    public static class ButtonActionStruct {
        public ButtonActionType actionType;
        public String target;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonActionType */
    public enum ButtonActionType {
        ACTION_DEFAULT(1),
        ACTION_TOAST(2),
        ACTION_OPEN_URL(3),
        ACTION_CANCEL(4);
        
        private int value;

        private ButtonActionType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct */
    public static class ButtonStruct {
        @C6593c(mo15949a = "action")
        public ButtonActionStruct buttonActionStruct;
        @C6593c(mo15949a = "style")
        public StyleType style;
        @C6593c(mo15949a = "text")
        public String text;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$PopupText */
    public static class PopupText {
        @C6593c(mo15949a = "buttons")
        public List<ButtonStruct> buttons;
        @C6593c(mo15949a = "context")
        public String context;
        @C6593c(mo15949a = "image")
        public UrlStruct image;
        @C6593c(mo15949a = "title")
        public String title;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$ShowTime */
    public enum ShowTime {
        CREATE_AWEME(1);
        
        private int value;

        private ShowTime(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$StyleType */
    public enum StyleType {
        STYLE_ACTION(1),
        STYLE_NORMAL(2),
        STYLE_GREY(3);
        
        private int value;

        private StyleType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.PopupSetting$UrlStruct */
    public static class UrlStruct {
        @C6593c(mo15949a = "height")
        public int height;
        @C6593c(mo15949a = "uri")
        public String uri;
        @C6593c(mo15949a = "url_key")
        public String url_key;
        @C6593c(mo15949a = "url_list")
        public String[] url_list;
        @C6593c(mo15949a = "width")
        public int width;
    }

    public String getPopupContent() {
        try {
            return this.popupText.context;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPopupTitle() {
        try {
            return this.popupText.title;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getNegativeButtonText() {
        try {
            return ((ButtonStruct) this.popupText.buttons.get(1)).text;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPositiveButtonText() {
        try {
            return ((ButtonStruct) this.popupText.buttons.get(0)).text;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getNegativeActionUrl() {
        try {
            return ((ButtonStruct) this.popupText.buttons.get(1)).buttonActionStruct.target;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPositiveActionUrl() {
        try {
            return ((ButtonStruct) this.popupText.buttons.get(0)).buttonActionStruct.target;
        } catch (Exception unused) {
            return null;
        }
    }
}
