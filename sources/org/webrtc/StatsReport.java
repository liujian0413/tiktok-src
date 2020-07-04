package org.webrtc;

public class StatsReport {

    /* renamed from: id */
    public final String f123511id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public static class Value {
        public final String name;
        public final String value;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.name);
            sb.append(": ");
            sb.append(this.value);
            sb.append("]");
            return sb.toString();
        }

        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(this.f123511id);
        sb.append(", type: ");
        sb.append(this.type);
        sb.append(", timestamp: ");
        sb.append(this.timestamp);
        sb.append(", values: ");
        for (Value value : this.values) {
            sb.append(value.toString());
            sb.append(", ");
        }
        return sb.toString();
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.f123511id = str;
        this.type = str2;
        this.timestamp = d;
        this.values = valueArr;
    }
}
