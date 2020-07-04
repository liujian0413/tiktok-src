package com.ttnet.org.chromium.net;

public class ApiVersion {
    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return "77.0.3844.0";
    }

    public static String getLastChange() {
        return "75ce914eec9114172da89f1390e9ab437ede0a6a-refs/heads/master@{#674799}";
    }

    public static int getMaximumAvailableApiLevel() {
        return 12;
    }

    public static String getCronetVersionWithLastChange() {
        StringBuilder sb = new StringBuilder("77.0.3844.0@");
        sb.append("75ce914eec9114172da89f1390e9ab437ede0a6a-refs/heads/master@{#674799}".substring(0, 8));
        return sb.toString();
    }
}
