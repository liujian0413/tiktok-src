package com.p280ss.android.ugc.aweme.beauty;

import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify */
public final class ComposerBeautyExtraBeautify {
    private List<ItemsBean> items;
    private String resource;

    /* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify$ItemsBean */
    public static final class ItemsBean {
        private boolean doubleDirectionin;
        private int max;
        private int min;
        private String name;
        private String tag;
        private int value;

        public ItemsBean() {
            this(false, 0, 0, 0, null, null, 63, null);
        }

        public static /* synthetic */ ItemsBean copy$default(ItemsBean itemsBean, boolean z, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z = itemsBean.doubleDirectionin;
            }
            if ((i4 & 2) != 0) {
                i = itemsBean.min;
            }
            int i5 = i;
            if ((i4 & 4) != 0) {
                i2 = itemsBean.max;
            }
            int i6 = i2;
            if ((i4 & 8) != 0) {
                i3 = itemsBean.value;
            }
            int i7 = i3;
            if ((i4 & 16) != 0) {
                str = itemsBean.tag;
            }
            String str3 = str;
            if ((i4 & 32) != 0) {
                str2 = itemsBean.name;
            }
            return itemsBean.copy(z, i5, i6, i7, str3, str2);
        }

        public final boolean component1() {
            return this.doubleDirectionin;
        }

        public final int component2() {
            return this.min;
        }

        public final int component3() {
            return this.max;
        }

        public final int component4() {
            return this.value;
        }

        public final String component5() {
            return this.tag;
        }

        public final String component6() {
            return this.name;
        }

        public final ItemsBean copy(boolean z, int i, int i2, int i3, String str, String str2) {
            C7573i.m23587b(str, "tag");
            C7573i.m23587b(str2, "name");
            ItemsBean itemsBean = new ItemsBean(z, i, i2, i3, str, str2);
            return itemsBean;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ItemsBean) {
                    ItemsBean itemsBean = (ItemsBean) obj;
                    if (this.doubleDirectionin == itemsBean.doubleDirectionin) {
                        if (this.min == itemsBean.min) {
                            if (this.max == itemsBean.max) {
                                if (!(this.value == itemsBean.value) || !C7573i.m23585a((Object) this.tag, (Object) itemsBean.tag) || !C7573i.m23585a((Object) this.name, (Object) itemsBean.name)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean getDoubleDirectionin() {
            return this.doubleDirectionin;
        }

        public final int getMax() {
            return this.max;
        }

        public final int getMin() {
            return this.min;
        }

        public final String getName() {
            return this.name;
        }

        public final String getTag() {
            return this.tag;
        }

        public final int getValue() {
            return this.value;
        }

        public final int hashCode() {
            boolean z = this.doubleDirectionin;
            if (z) {
                z = true;
            }
            int i = (((((((z ? 1 : 0) * true) + this.min) * 31) + this.max) * 31) + this.value) * 31;
            String str = this.tag;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemsBean(doubleDirectionin=");
            sb.append(this.doubleDirectionin);
            sb.append(", min=");
            sb.append(this.min);
            sb.append(", max=");
            sb.append(this.max);
            sb.append(", value=");
            sb.append(this.value);
            sb.append(", tag=");
            sb.append(this.tag);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(")");
            return sb.toString();
        }

        public final void setDoubleDirectionin(boolean z) {
            this.doubleDirectionin = z;
        }

        public final void setMax(int i) {
            this.max = i;
        }

        public final void setMin(int i) {
            this.min = i;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        public final void setName(String str) {
            C7573i.m23587b(str, "<set-?>");
            this.name = str;
        }

        public final void setTag(String str) {
            C7573i.m23587b(str, "<set-?>");
            this.tag = str;
        }

        public ItemsBean(boolean z, int i, int i2, int i3, String str, String str2) {
            C7573i.m23587b(str, "tag");
            C7573i.m23587b(str2, "name");
            this.doubleDirectionin = z;
            this.min = i;
            this.max = i2;
            this.value = i3;
            this.tag = str;
            this.name = str2;
        }

        public /* synthetic */ ItemsBean(boolean z, int i, int i2, int i3, String str, String str2, int i4, C7571f fVar) {
            boolean z2;
            int i5;
            int i6;
            int i7 = 0;
            if ((i4 & 1) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i4 & 2) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 4) != 0) {
                i6 = 0;
            } else {
                i6 = i2;
            }
            if ((i4 & 8) == 0) {
                i7 = i3;
            }
            if ((i4 & 16) != 0) {
                str = "";
            }
            String str3 = str;
            if ((i4 & 32) != 0) {
                str2 = "";
            }
            this(z2, i5, i6, i7, str3, str2);
        }
    }

    public ComposerBeautyExtraBeautify() {
        this(null, null, 3, null);
    }

    public final List<ItemsBean> getItems() {
        return this.items;
    }

    public final String getResource() {
        return this.resource;
    }

    public final void setItems(List<ItemsBean> list) {
        this.items = list;
    }

    public final void setResource(String str) {
        this.resource = str;
    }

    public ComposerBeautyExtraBeautify(String str, List<ItemsBean> list) {
        this.resource = str;
        this.items = list;
    }

    public /* synthetic */ ComposerBeautyExtraBeautify(String str, List list, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        this(str, list);
    }
}
