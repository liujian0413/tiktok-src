package com.p280ss.android.ugc.effectmanager.effect.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse */
public class EffectChannelResponse {
    public List<Effect> allCategoryEffects;
    public List<EffectCategoryResponse> categoryResponseList;
    public List<Effect> collections;
    public Effect frontEffect;
    public String panel;
    private EffectPanelModel panelModel;
    public Effect rearEffect;
    public List<String> urlPrefix;
    public String version;

    public EffectChannelResponse() {
        this.allCategoryEffects = new ArrayList();
        this.categoryResponseList = new ArrayList();
    }

    public EffectPanelModel getPanelModel() {
        if (this.panelModel == null) {
            this.panelModel = new EffectPanelModel();
        }
        this.panelModel.f113501id = this.panel;
        return this.panelModel;
    }

    public void setPanelModel(EffectPanelModel effectPanelModel) {
        if (effectPanelModel == null) {
            effectPanelModel = new EffectPanelModel();
        }
        this.panelModel = effectPanelModel;
    }

    public EffectChannelResponse(String str) {
        this.panel = str;
        this.allCategoryEffects = new ArrayList();
        this.categoryResponseList = new ArrayList();
    }

    public EffectChannelResponse(String str, List<Effect> list, List<EffectCategoryResponse> list2) {
        this.version = str;
        this.allCategoryEffects = list;
        this.categoryResponseList = list2;
    }
}
