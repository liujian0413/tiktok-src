package com.p280ss.android.ugc.asve.context;

/* renamed from: com.ss.android.ugc.asve.context.PreviewSize */
public final class PreviewSize {
    private final int height;
    private final int width;

    public static /* synthetic */ PreviewSize copy$default(PreviewSize previewSize, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = previewSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = previewSize.height;
        }
        return previewSize.copy(i, i2);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final PreviewSize copy(int i, int i2) {
        return new PreviewSize(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PreviewSize) {
                PreviewSize previewSize = (PreviewSize) obj;
                if (this.width == previewSize.width) {
                    if (this.height == previewSize.height) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return (this.width * 31) + this.height;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewSize(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(")");
        return sb.toString();
    }

    public PreviewSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
