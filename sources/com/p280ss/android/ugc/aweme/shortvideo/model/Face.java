package com.p280ss.android.ugc.aweme.shortvideo.model;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.Face */
public class Face {
    public long data_added;
    public int height;
    public String origin_path;
    public String path;
    public int width;

    public Face() {
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.path != null) {
            i = this.path.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.origin_path != null) {
            i2 = this.origin_path.hashCode();
        }
        return ((((((i3 + i2) * 31) + this.width) * 31) + this.height) * 31) + ((int) (this.data_added ^ (this.data_added >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Face face = (Face) obj;
        if (this.width != face.width || this.height != face.height || this.data_added != face.data_added) {
            return false;
        }
        if (this.path == null ? face.path != null : !this.path.equals(face.path)) {
            return false;
        }
        if (this.origin_path != null) {
            return this.origin_path.equals(face.origin_path);
        }
        if (face.origin_path == null) {
            return true;
        }
        return false;
    }

    public Face(String str, String str2, int i, int i2, long j) {
        this.path = str;
        this.origin_path = str2;
        this.width = i;
        this.height = i2;
        this.data_added = j;
    }
}
