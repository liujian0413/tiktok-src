package com.bytedance.router.net;

public class NetResponse {
    public String content = "";
    public int errorCode = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder("[errorCode: ");
        sb.append(this.errorCode);
        sb.append(", content:");
        sb.append(this.content);
        sb.append("]");
        return sb.toString();
    }
}
