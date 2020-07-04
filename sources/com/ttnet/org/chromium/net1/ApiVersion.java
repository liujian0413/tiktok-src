package com.ttnet.org.chromium.net1;

public class ApiVersion {
    public static String getVersion() {
        StringBuilder sb = new StringBuilder("58.0.2991.0@");
        sb.append("d6b50e9e8a775eca64d3e926cc9398df5b409282".substring(0, 8));
        return sb.toString();
    }
}
