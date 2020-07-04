package com.p280ss.android.ugc.aweme.effect;

import com.google.common.base.C17434j;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectModel */
public class EffectModel implements Serializable {
    public String category;
    public int color;
    public int duration;
    public String extra;
    public String hint;
    public String iconUrl;
    public int imagePath;
    public String key;
    public String name;
    public String resDir;
    public int type;

    public int hashCode() {
        return C17434j.m57954a(this.name, this.hint, Integer.valueOf(this.imagePath), this.key, Integer.valueOf(this.type), this.iconUrl, this.resDir, Integer.valueOf(this.color), Integer.valueOf(this.duration), this.category, this.extra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EffectModel effectModel = (EffectModel) obj;
        if (this.imagePath != effectModel.imagePath || this.type != effectModel.type || this.color != effectModel.color || this.duration != effectModel.duration || !C17434j.m57955a(this.name, effectModel.name) || !C17434j.m57955a(this.hint, effectModel.hint) || !C17434j.m57955a(this.key, effectModel.key) || !C17434j.m57955a(this.iconUrl, effectModel.iconUrl) || !C17434j.m57955a(this.resDir, effectModel.resDir) || !C17434j.m57955a(this.category, effectModel.category) || !C17434j.m57955a(this.extra, effectModel.extra)) {
            return false;
        }
        return true;
    }
}
