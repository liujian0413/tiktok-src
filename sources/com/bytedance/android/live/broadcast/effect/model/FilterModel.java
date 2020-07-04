package com.bytedance.android.live.broadcast.effect.model;

import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilterModel {
    public static final String CONFIG_FILE = "config.json";
    public static final int TYPE_EDIT = 2;
    public static final int TYPE_LOCAL = 1;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_RECORD = 1;
    public static final int TYPE_REMOTE = 2;
    private Effect effect;
    private int filterType;
    private boolean isNew;
    private LocalFilterModel localFilter;
    private List<String> tags;
    private int usedType;

    public FilterModel() {
    }

    public Effect getEffect() {
        return this.effect;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public LocalFilterModel getLocalFilter() {
        return this.localFilter;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public int getUsedType() {
        return this.usedType;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public int hashCode() {
        return getFilterId().hashCode();
    }

    public String getFilterId() {
        switch (this.filterType) {
            case 0:
            case 1:
                if (this.localFilter == null) {
                    return null;
                }
                return this.localFilter.getId();
            case 2:
                return this.effect.getEffectId();
            default:
                return null;
        }
    }

    public String getName() {
        switch (this.filterType) {
            case 0:
            case 1:
                if (this.localFilter == null) {
                    return null;
                }
                return this.localFilter.getName();
            case 2:
                return this.effect.getName();
            default:
                return null;
        }
    }

    public String getFilterPath() {
        switch (this.filterType) {
            case 0:
            case 1:
                if (this.localFilter == null) {
                    return "";
                }
                return this.localFilter.getFilterFilePath();
            case 2:
                if (!new File(this.effect.getUnzipPath(), CONFIG_FILE).exists()) {
                    return "";
                }
                return new File(this.effect.getUnzipPath()).getAbsolutePath();
            default:
                return "";
        }
    }

    public void setEffect(Effect effect2) {
        this.effect = effect2;
    }

    public void setFilterType(int i) {
        this.filterType = i;
    }

    public void setLocalFilter(LocalFilterModel localFilterModel) {
        this.localFilter = localFilterModel;
    }

    public void setNew(boolean z) {
        this.isNew = z;
    }

    public void setUsedType(int i) {
        this.usedType = i;
    }

    public FilterModel(Effect effect2) {
        this.filterType = 2;
        this.effect = effect2;
    }

    public void setTags(List<String> list) {
        this.tags = new ArrayList();
        this.tags.addAll(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilterModel) {
            return TextUtils.equals(getFilterId(), ((FilterModel) obj).getFilterId());
        }
        return false;
    }
}
