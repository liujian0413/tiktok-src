package com.p280ss.android.ugc.effectmanager.effect.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel */
public class EffectChannelModel {
    public List<EffectCategoryModel> category;
    public List<Effect> collection;
    public List<Effect> effects;
    public String front_effect_id;
    public EffectPanelModel panel;
    public String rear_effect_id;
    public List<String> url_prefix;
    public String version;

    public EffectChannelModel() {
        this.effects = new ArrayList();
        this.category = new ArrayList();
        this.url_prefix = new ArrayList();
    }

    public boolean checkValued() {
        if (this.effects == null) {
            this.effects = new ArrayList();
        }
        if (this.category == null) {
            this.category = new ArrayList();
        }
        if (this.panel == null) {
            this.panel = new EffectPanelModel();
        }
        if (this.collection == null) {
            this.collection = new ArrayList();
        }
        this.panel.checkValued();
        return true;
    }

    public EffectChannelModel(String str, List<Effect> list, List<EffectCategoryModel> list2) {
        this.version = str;
        this.effects = list;
        this.category = list2;
    }
}
