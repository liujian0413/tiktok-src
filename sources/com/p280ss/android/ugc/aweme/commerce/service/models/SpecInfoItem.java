package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.SpecInfoItem */
public final class SpecInfoItem implements Serializable {
    private boolean enabled;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private String f64598id;
    @C6593c(mo15949a = "name")
    private String name;
    private boolean selected;

    public SpecInfoItem() {
        this(null, null, false, false, 15, null);
    }

    public static /* synthetic */ SpecInfoItem copy$default(SpecInfoItem specInfoItem, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = specInfoItem.f64598id;
        }
        if ((i & 2) != 0) {
            str2 = specInfoItem.name;
        }
        if ((i & 4) != 0) {
            z = specInfoItem.enabled;
        }
        if ((i & 8) != 0) {
            z2 = specInfoItem.selected;
        }
        return specInfoItem.copy(str, str2, z, z2);
    }

    public final String component1() {
        return this.f64598id;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final boolean component4() {
        return this.selected;
    }

    public final SpecInfoItem copy(String str, String str2, boolean z, boolean z2) {
        return new SpecInfoItem(str, str2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpecInfoItem) {
                SpecInfoItem specInfoItem = (SpecInfoItem) obj;
                if (C7573i.m23585a((Object) this.f64598id, (Object) specInfoItem.f64598id) && C7573i.m23585a((Object) this.name, (Object) specInfoItem.name)) {
                    if (this.enabled == specInfoItem.enabled) {
                        if (this.selected == specInfoItem.selected) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.f64598id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int hashCode() {
        String str = this.f64598id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.enabled;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.selected;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecInfoItem(id=");
        sb.append(this.f64598id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", selected=");
        sb.append(this.selected);
        sb.append(")");
        return sb.toString();
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setId(String str) {
        this.f64598id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public SpecInfoItem(String str, String str2, boolean z, boolean z2) {
        this.f64598id = str;
        this.name = str2;
        this.enabled = z;
        this.selected = z2;
    }

    public /* synthetic */ SpecInfoItem(String str, String str2, boolean z, boolean z2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        this(str, str2, z, z2);
    }
}
