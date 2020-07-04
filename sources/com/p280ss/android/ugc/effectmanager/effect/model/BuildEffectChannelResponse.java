package com.p280ss.android.ugc.effectmanager.effect.model;

import com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse */
public class BuildEffectChannelResponse {
    private String mFileDirectory;
    private boolean mIsCache;
    private String mPanel;

    public EffectChannelResponse buildChannelResponse(EffectChannelModel effectChannelModel) {
        System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Effect effect : effectChannelModel.effects) {
            hashMap.put(effect.getEffectId(), effect);
        }
        for (Effect effect2 : effectChannelModel.collection) {
            hashMap2.put(effect2.getEffectId(), effect2);
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse();
        effectChannelResponse.panel = this.mPanel;
        effectChannelResponse.version = effectChannelModel.version;
        effectChannelResponse.allCategoryEffects = effectChannelModel.effects;
        effectChannelResponse.collections = effectChannelModel.collection;
        effectChannelResponse.urlPrefix = effectChannelModel.url_prefix;
        effectChannelResponse.categoryResponseList = initCategory(effectChannelModel, hashMap);
        getChildEffect(effectChannelModel.effects, hashMap2);
        effectChannelResponse.setPanelModel(effectChannelModel.panel);
        effectChannelResponse.frontEffect = getEffect(effectChannelModel.front_effect_id, hashMap);
        effectChannelResponse.rearEffect = getEffect(effectChannelModel.rear_effect_id, hashMap);
        if (!this.mIsCache) {
            C43731c.m138584a(this.mFileDirectory, effectChannelModel.effects);
            C43731c.m138584a(this.mFileDirectory, effectChannelModel.collection);
        }
        return effectChannelResponse;
    }

    private Effect getEffect(String str, Map<String, Effect> map) {
        return (Effect) map.get(str);
    }

    private List<Effect> getCategoryAllEffects(EffectCategoryModel effectCategoryModel, Map<String, Effect> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : effectCategoryModel.effects) {
            Effect effect = (Effect) map.get(str);
            if (effect != null) {
                arrayList.add(effect);
            }
        }
        return arrayList;
    }

    private void getChildEffect(List<Effect> list, Map<String, Effect> map) {
        for (Effect effect : list) {
            if (effect.getEffectType() == 1) {
                ArrayList arrayList = new ArrayList();
                for (String str : effect.getChildren()) {
                    Effect effect2 = (Effect) map.get(str);
                    if (effect2 != null) {
                        arrayList.add(effect2);
                    }
                }
                effect.setChildEffects(arrayList);
            }
        }
    }

    private List<EffectCategoryResponse> initCategory(EffectChannelModel effectChannelModel, Map<String, Effect> map) {
        ArrayList arrayList = new ArrayList();
        if (!effectChannelModel.category.isEmpty()) {
            for (EffectCategoryModel effectCategoryModel : effectChannelModel.category) {
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
                effectCategoryResponse.f113500id = effectCategoryModel.f113499id;
                effectCategoryResponse.name = effectCategoryModel.name;
                effectCategoryResponse.key = effectCategoryModel.key;
                if (!effectCategoryModel.icon.url_list.isEmpty()) {
                    effectCategoryResponse.icon_normal_url = (String) effectCategoryModel.icon.url_list.get(0);
                }
                if (!effectCategoryModel.icon_selected.url_list.isEmpty()) {
                    effectCategoryResponse.icon_selected_url = (String) effectCategoryModel.icon_selected.url_list.get(0);
                }
                effectCategoryResponse.totalEffects = getCategoryAllEffects(effectCategoryModel, map);
                effectCategoryResponse.tags = effectCategoryModel.tags;
                effectCategoryResponse.tagsUpdateTime = effectCategoryModel.tags_updated_at;
                effectCategoryResponse.collectionEffect = effectChannelModel.collection;
                effectCategoryResponse.extra = effectCategoryModel.extra;
                effectCategoryResponse.is_default = effectCategoryModel.is_default;
                arrayList.add(effectCategoryResponse);
            }
        }
        return arrayList;
    }

    public BuildEffectChannelResponse(String str, String str2, boolean z) {
        this.mPanel = str;
        this.mFileDirectory = str2;
        this.mIsCache = z;
    }
}
