package org.webrtc;

public class Size {
    public int height;
    public int width;

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.width);
        sb.append("x");
        sb.append(this.height);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width == size.width && this.height == size.height) {
            return true;
        }
        return false;
    }

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
