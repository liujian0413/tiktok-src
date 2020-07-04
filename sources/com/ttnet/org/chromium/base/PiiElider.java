package com.ttnet.org.chromium.base;

import android.text.TextUtils;
import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PiiElider {
    private static final String[] APP_NAMESPACE = {"org.chromium.", "com.google."};
    private static final Pattern CONSOLE_MSG = Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
    private static final Pattern DOMAIN_NAME;
    private static final Pattern IP_ADDRESS = Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
    private static final Pattern LIKELY_EXCEPTION_LOG = Pattern.compile("\\sat\\sorg\\.chromium\\.[^ ]+.");
    private static final Pattern MAC_ADDRESS = Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
    private static final String[] SYSTEM_NAMESPACE = {"android.accessibilityservice", "android.accounts", "android.animation", "android.annotation", "android.app", "android.appwidget", "android.bluetooth", "android.content", "android.database", "android.databinding", "android.drm", "android.gesture", "android.graphics", "android.hardware", "android.inputmethodservice", "android.location", "android.media", "android.mtp", "android.net", "android.nfc", "android.opengl", "android.os", "android.preference", "android.print", "android.printservice", "android.provider", "android.renderscript", "android.sax", "android.security", "android.service", "android.speech", "android.support", "android.system", "android.telecom", "android.telephony", "android.test", "android.text", "android.transition", "android.util", "android.view", "android.webkit", "android.widget", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};
    private static final Pattern WEB_URL;

    static {
        StringBuilder sb = new StringBuilder("(([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯\\-]{0,61}[a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]){0,1}\\.)+[a-zA-Z -퟿豈-﷏ﷰ-￯]{2,63}|");
        sb.append(IP_ADDRESS);
        sb.append(")");
        DOMAIN_NAME = Pattern.compile(sb.toString());
        StringBuilder sb2 = new StringBuilder("(?:\\b|^)((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:");
        sb2.append(DOMAIN_NAME);
        sb2.append(")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -퟿豈-﷏ﷰ-￯");
        sb2.append("\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
        WEB_URL = Pattern.compile(sb2.toString());
    }

    public static String elideConsole(String str) {
        return CONSOLE_MSG.matcher(str).replaceAll("[ELIDED:CONSOLE(0)] ELIDED CONSOLE MESSAGE");
    }

    public static String elideEmail(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).replaceAll("XXX@EMAIL.ELIDED");
    }

    public static String elideIp(String str) {
        return Patterns.IP_ADDRESS.matcher(str).replaceAll("1.2.3.4");
    }

    public static String elideMac(String str) {
        return MAC_ADDRESS.matcher(str).replaceAll("01:23:45:67:89:AB");
    }

    private static boolean likelyToBeAppNamespace(String str) {
        for (String startsWith : APP_NAMESPACE) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    private static boolean likelyToBeSystemNamespace(String str) {
        for (String startsWith : SYSTEM_NAMESPACE) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static String sanitizeStacktrace(String str) {
        String[] split = str.split("\\n");
        split[0] = elideUrl(split[0]);
        for (int i = 1; i < split.length; i++) {
            if (split[i].startsWith("Caused by:")) {
                split[i] = elideUrl(split[i]);
            }
        }
        return TextUtils.join("\n", split);
    }

    public static String elideUrl(String str) {
        if (LIKELY_EXCEPTION_LOG.matcher(str).find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = WEB_URL.matcher(sb);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            String substring = sb.substring(start, end);
            if (likelyToBeAppNamespace(substring) || likelyToBeSystemNamespace(substring)) {
                i = end;
            } else {
                sb.replace(start, end, "HTTP://WEBADDRESS.ELIDED");
                i = start + 24;
                matcher = WEB_URL.matcher(sb);
            }
        }
        return sb.toString();
    }
}
