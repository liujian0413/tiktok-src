package com.p280ss.android.ugc.aweme.commercialize.model;

import com.bytedance.vast.model.Icon;
import com.bytedance.vast.model.VideoClick;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.NativeIcon */
public class NativeIcon implements Serializable {
    @C6593c(mo15949a = "icon_click")
    private IconClick iconClick;
    @C6593c(mo15949a = "static_resource")
    private Set<String> staticResource;
    @C6593c(mo15949a = "icon_view_tracking")
    private Set<String> viewTracking;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.NativeIcon$IconClick */
    public static class IconClick implements Serializable {
        @C6593c(mo15949a = "click_through")
        private String clickThrough;
        @C6593c(mo15949a = "click_tracking")
        private Set<String> clickTracking;

        public String getClickThrough() {
            return this.clickThrough;
        }

        public Set<String> getClickTracking() {
            return this.clickTracking;
        }

        public VideoClick toVideoClick() {
            VideoClick videoClick = new VideoClick();
            videoClick.clickThrough = this.clickThrough;
            videoClick.clickTracking = this.clickTracking;
            return videoClick;
        }

        public void setClickThrough(String str) {
            this.clickThrough = str;
        }

        public void setClickTracking(Set<String> set) {
            this.clickTracking = set;
        }
    }

    public IconClick getIconClick() {
        return this.iconClick;
    }

    public Set<String> getStaticResource() {
        return this.staticResource;
    }

    public Set<String> getViewTracking() {
        return this.viewTracking;
    }

    public void setIconClick(IconClick iconClick2) {
        this.iconClick = iconClick2;
    }

    public void setStaticResource(Set<String> set) {
        this.staticResource = set;
    }

    public void setViewTracking(Set<String> set) {
        this.viewTracking = set;
    }

    public Icon toIcon(String str) {
        Icon icon = new Icon();
        icon.program = str;
        icon.staticResource = this.staticResource;
        icon.viewTracking = this.viewTracking;
        if (this.iconClick != null) {
            icon.clickList = new LinkedList();
            icon.clickList.add(this.iconClick.toVideoClick());
        }
        return icon;
    }
}
