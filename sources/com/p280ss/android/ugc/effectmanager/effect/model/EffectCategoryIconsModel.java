package com.p280ss.android.ugc.effectmanager.effect.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel */
public class EffectCategoryIconsModel {
    public String uri;
    public List<String> url_list;

    public EffectCategoryIconsModel() {
        this.url_list = new ArrayList();
        this.uri = "";
    }

    public boolean checkValued() {
        if (this.url_list == null) {
            this.url_list = new ArrayList();
        }
        return true;
    }

    public EffectCategoryIconsModel(List<String> list, String str) {
        this.url_list = list;
        this.uri = str;
    }
}
