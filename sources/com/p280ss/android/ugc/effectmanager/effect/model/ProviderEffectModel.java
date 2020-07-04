package com.p280ss.android.ugc.effectmanager.effect.model;

import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel */
public class ProviderEffectModel {
    public int cursor;
    public boolean has_more;
    public String search_tips;
    public List<ProviderEffect> sticker_list;

    public String toString() {
        StringBuilder sb = new StringBuilder("ProviderEffectModel{search_tips='");
        sb.append(this.search_tips);
        sb.append('\'');
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.append(", has_more=");
        sb.append(this.has_more);
        sb.append('}');
        return sb.toString();
    }
}
