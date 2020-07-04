package org.webrtc;

public class IceCandidate {
    public final String sdp;
    public final int sdpMLineIndex;
    public final String sdpMid;
    public final String serverUrl;

    /* access modifiers changed from: 0000 */
    public String getSdp() {
        return this.sdp;
    }

    /* access modifiers changed from: 0000 */
    public String getSdpMid() {
        return this.sdpMid;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.sdpMid);
        sb.append(":");
        sb.append(this.sdpMLineIndex);
        sb.append(":");
        sb.append(this.sdp);
        sb.append(":");
        sb.append(this.serverUrl);
        return sb.toString();
    }

    public IceCandidate(String str, int i, String str2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = "";
    }

    IceCandidate(String str, int i, String str2, String str3) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = str3;
    }
}
