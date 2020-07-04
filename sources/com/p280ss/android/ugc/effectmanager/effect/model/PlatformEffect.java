package com.p280ss.android.ugc.effectmanager.effect.model;

import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.PlatformEffect */
public class PlatformEffect {
    String file_uri;
    String hint;
    String hint_uri;
    String icon_uri;
    String name;
    List<String> requirements;
    List<String> types;

    public Effect toEffect(List<String> list) {
        Effect effect = new Effect();
        effect.setName(this.name);
        effect.setHint(this.hint);
        effect.setFileUrl(concatPrefixWithUri(list, this.file_uri));
        effect.setTypes(this.types);
        effect.setHintIcon(concatPrefixWithUri(list, this.hint_uri));
        effect.setIconUrl(concatPrefixWithUri(list, this.icon_uri));
        effect.setRequirements(this.requirements);
        effect.setId(this.file_uri);
        return effect;
    }

    /* access modifiers changed from: 0000 */
    public UrlModel concatPrefixWithUri(List<String> list, String str) {
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = (String) list.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            arrayList.add(sb.toString());
        }
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}
