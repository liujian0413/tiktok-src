package com.p280ss.android.ugc.effectmanager.effect.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel */
public class EffectCategoryModel {
    public List<String> effects = new ArrayList();
    public String extra;
    public EffectCategoryIconsModel icon;
    public EffectCategoryIconsModel icon_selected;

    /* renamed from: id */
    public String f113499id;
    public boolean is_default;
    public String key;
    public String name;
    public List<String> tags;
    public String tags_updated_at;

    public boolean checkValued() {
        if (this.icon == null) {
            this.icon = new EffectCategoryIconsModel();
        }
        if (this.icon_selected == null) {
            this.icon_selected = new EffectCategoryIconsModel();
        }
        if (this.effects == null) {
            this.effects = new ArrayList();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (TextUtils.isEmpty(this.f113499id) || !this.icon.checkValued() || !this.icon_selected.checkValued()) {
            return false;
        }
        return true;
    }
}
