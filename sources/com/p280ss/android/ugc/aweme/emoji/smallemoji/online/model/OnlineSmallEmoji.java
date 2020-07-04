package com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmoji */
public final class OnlineSmallEmoji implements Serializable {
    @C6593c(mo15949a = "display_name")
    private String displayName = "";
    @C6593c(mo15949a = "display_name_lang")
    private HashMap<String, String> displayNameLang;
    @C6593c(mo15949a = "height")
    private int height;
    @C6593c(mo15949a = "hide")
    private int hide;
    @C6593c(mo15949a = "uri")
    private String uri = "";
    @C6593c(mo15949a = "width")
    private int width;

    public final String getDisplayName() {
        return this.displayName;
    }

    public final HashMap<String, String> getDisplayNameLang() {
        return this.displayNameLang;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHide() {
        return this.hide;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean showInPanel() {
        if (this.hide != 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineSmallEmoji={uri=");
        sb.append(this.uri);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", displayNameLang=");
        sb.append(this.displayName);
        sb.append(", hide=");
        sb.append(this.hide);
        sb.append('}');
        return sb.toString();
    }

    public final void setDisplayNameLang(HashMap<String, String> hashMap) {
        this.displayNameLang = hashMap;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setHide(int i) {
        this.hide = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setDisplayName(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.displayName = str;
    }

    public final void setUri(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.uri = str;
    }
}
