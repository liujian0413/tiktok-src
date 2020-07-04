package org.webrtc;

import java.util.Map;
import java.util.Map.Entry;

public class RTCStats {

    /* renamed from: id */
    private final String f123509id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public String getId() {
        return this.f123509id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return (double) this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ timestampUs: ");
        sb.append(this.timestampUs);
        sb.append(", type: ");
        sb.append(this.type);
        sb.append(", id: ");
        sb.append(this.f123509id);
        for (Entry entry : this.members.entrySet()) {
            sb.append(", ");
            sb.append((String) entry.getKey());
            sb.append(": ");
            appendValue(sb, entry.getValue());
        }
        sb.append(" }");
        return sb.toString();
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                appendValue(sb, objArr[i]);
            }
            sb.append(']');
        } else if (obj instanceof String) {
            sb.append('\"');
            sb.append(obj);
            sb.append('\"');
        } else {
            sb.append(obj);
        }
    }

    public RTCStats(long j, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j;
        this.type = str;
        this.f123509id = str2;
        this.members = map;
    }

    static RTCStats create(long j, String str, String str2, Map map) {
        RTCStats rTCStats = new RTCStats(j, str, str2, map);
        return rTCStats;
    }
}
