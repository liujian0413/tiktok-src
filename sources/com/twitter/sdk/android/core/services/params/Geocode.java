package com.twitter.sdk.android.core.services.params;

public final class Geocode {

    /* renamed from: a */
    public final double f120522a;

    /* renamed from: b */
    public final double f120523b;

    /* renamed from: c */
    public final int f120524c;

    /* renamed from: d */
    public final Distance f120525d;

    public enum Distance {
        MILES("mi"),
        KILOMETERS("km");
        
        public final String identifier;

        private Distance(String str) {
            this.identifier = str;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f120522a);
        sb.append(",");
        sb.append(this.f120523b);
        sb.append(",");
        sb.append(this.f120524c);
        sb.append(this.f120525d.identifier);
        return sb.toString();
    }
}
