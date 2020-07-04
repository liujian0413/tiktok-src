package com.bytedance.neverland.network;

import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class Reporter {
    private List<Pair<String, String>> paramsList = new ArrayList();

    public String buildParamsString() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Pair pair : this.paramsList) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            try {
                sb.append(URLEncoder.encode((String) pair.first, "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode((String) pair.second, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return sb.toString();
    }

    public boolean report(int i) {
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (Connector.connect(buildParamsString())) {
                return true;
            }
            i = i2;
        }
    }

    public static boolean report(int i, String str) {
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (Connector.connect(str)) {
                return true;
            }
            i = i2;
        }
    }

    public Reporter addParams(String str, Object obj) {
        this.paramsList.add(new Pair(str, String.valueOf(obj)));
        return this;
    }
}
