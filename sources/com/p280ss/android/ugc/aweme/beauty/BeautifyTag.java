package com.p280ss.android.ugc.aweme.beauty;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.BeautifyTag */
public final class BeautifyTag {
    private final String tag;
    private final int value;

    public BeautifyTag() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ BeautifyTag copy$default(BeautifyTag beautifyTag, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = beautifyTag.tag;
        }
        if ((i2 & 2) != 0) {
            i = beautifyTag.value;
        }
        return beautifyTag.copy(str, i);
    }

    public final String component1() {
        return this.tag;
    }

    public final int component2() {
        return this.value;
    }

    public final BeautifyTag copy(String str, int i) {
        C7573i.m23587b(str, "tag");
        return new BeautifyTag(str, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BeautifyTag) {
                BeautifyTag beautifyTag = (BeautifyTag) obj;
                if (C7573i.m23585a((Object) this.tag, (Object) beautifyTag.tag)) {
                    if (this.value == beautifyTag.value) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int getValue() {
        return this.value;
    }

    public final int hashCode() {
        String str = this.tag;
        return ((str != null ? str.hashCode() : 0) * 31) + this.value;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautifyTag(tag=");
        sb.append(this.tag);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(")");
        return sb.toString();
    }

    public BeautifyTag(String str, int i) {
        C7573i.m23587b(str, "tag");
        this.tag = str;
        this.value = i;
    }

    public /* synthetic */ BeautifyTag(String str, int i, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        this(str, i);
    }
}
