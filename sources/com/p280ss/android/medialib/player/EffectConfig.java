package com.p280ss.android.medialib.player;

import com.p280ss.android.medialib.model.EffectFileInfo;
import com.p280ss.android.medialib.model.EffectModel;

/* renamed from: com.ss.android.medialib.player.EffectConfig */
public class EffectConfig {
    String deviceName;
    String effect8File;
    String effect9File;
    int effectBuildChainType = 1;
    EffectFileInfo[] effectFileInfos;
    String effectModelDir;
    EffectModel[] effectModels;
    int effectType;
    float filterIntensity = -1.0f;
    String leftFilter;
    float pos;
    String rightFilter;
    String snowflakeFile;
    String vertigoFile;

    public String getEffect8File() {
        return this.effect8File;
    }

    public String getEffect9File() {
        return this.effect9File;
    }

    public int getEffectBuildChainType() {
        return this.effectBuildChainType;
    }

    public EffectFileInfo[] getEffectFileInfos() {
        return this.effectFileInfos;
    }

    public EffectModel[] getEffectModels() {
        return this.effectModels;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public float getFilterIntensity() {
        return this.filterIntensity;
    }

    public String getLeftFilter() {
        return this.leftFilter;
    }

    public float getPos() {
        return this.pos;
    }

    public String getRightFilter() {
        return this.rightFilter;
    }

    public String getSnowflakeFile() {
        return this.snowflakeFile;
    }

    public String getVertigoFile() {
        return this.vertigoFile;
    }

    public String getDeviceName() {
        if (this.deviceName == null) {
            return "";
        }
        return this.deviceName;
    }

    public String getEffectModelDir() {
        if (this.effectModelDir == null) {
            return "";
        }
        return this.effectModelDir;
    }

    public EffectConfig setDeviceName(String str) {
        this.deviceName = str;
        return this;
    }

    public void setEffect8File(String str) {
        this.effect8File = str;
    }

    public void setEffect9File(String str) {
        this.effect9File = str;
    }

    public EffectConfig setEffectBuildChainType(int i) {
        this.effectBuildChainType = i;
        return this;
    }

    public EffectConfig setEffectFileInfos(EffectFileInfo[] effectFileInfoArr) {
        this.effectFileInfos = effectFileInfoArr;
        return this;
    }

    public EffectConfig setEffectModelDir(String str) {
        this.effectModelDir = str;
        return this;
    }

    public EffectConfig setEffectModels(EffectModel[] effectModelArr) {
        this.effectModels = effectModelArr;
        return this;
    }

    public EffectConfig setEffectType(int i) {
        this.effectType = i;
        return this;
    }

    public EffectConfig setFilterIntensity(float f) {
        this.filterIntensity = f;
        return this;
    }

    public void setSnowflakeFile(String str) {
        this.snowflakeFile = str;
    }

    public void setVertigoFile(String str) {
        this.vertigoFile = str;
    }

    public EffectConfig setFilter(String str) {
        this.leftFilter = str;
        this.rightFilter = str;
        this.pos = 1.0f;
        return this;
    }

    public EffectConfig setEffectModels(String[] strArr) {
        if (strArr == null) {
            return this;
        }
        this.effectModels = new EffectModel[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null) {
                String[] split = str.split(",");
                if (split != null && split.length == 3) {
                    this.effectModels[i] = new EffectModel(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
                }
            }
        }
        return this;
    }

    public EffectConfig setFilter(String str, String str2, float f) {
        this.leftFilter = str;
        this.rightFilter = str2;
        this.pos = f;
        return this;
    }

    public EffectConfig setEffectModels(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return this;
        }
        int length = (iArr.length / 3) + 1;
        this.effectModels = new EffectModel[length];
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (i3 < i4) {
                int i5 = i3 * 3;
                this.effectModels[i3] = new EffectModel(iArr[i5], iArr[i5 + 1], iArr[i5 + 2]);
                i3++;
            } else {
                this.effectModels[i4] = new EffectModel(i, i2, i2);
                return this;
            }
        }
    }

    public EffectConfig setEffectFiles(String str, String str2, String str3, String str4) {
        this.effect8File = str;
        this.effect9File = str2;
        this.vertigoFile = str3;
        this.snowflakeFile = str4;
        return this;
    }
}
