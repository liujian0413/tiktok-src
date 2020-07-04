package com.p280ss.avframework.livestreamv2.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: com.ss.avframework.livestreamv2.utils.UrlUtils */
public class UrlUtils {
    public static String DecodeUrl(String str) {
        try {
            int lastIndexOf = str.lastIndexOf(47) + 1;
            String substring = str.substring(lastIndexOf);
            if (substring.contains("%")) {
                substring = URLDecoder.decode(substring);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, lastIndexOf));
            sb.append(substring);
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String EncodeUrl(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        String str2 = new String();
        if (split != null && split.length >= 2) {
            try {
                str2 = URLEncoder.encode(split[split.length - 1], "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length - 1; i++) {
            sb.append(split[i]);
            sb.append("/");
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String AddParam(String str, String str2, String str3) {
        String str4;
        String[] split;
        String[] split2;
        try {
            int length = str.length();
            String str5 = "";
            if (str.lastIndexOf("?") >= 0) {
                length = str.lastIndexOf("?") + 1;
                str4 = str5;
                boolean z = false;
                for (String str6 : str.substring(length).split("&")) {
                    String[] split3 = str6.split("=");
                    if (split3.length != 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        sb.append(str6);
                        sb.append("&");
                        str4 = sb.toString();
                    } else {
                        if (split3[0].equals(str2)) {
                            split3[1] = str3;
                            z = true;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str4);
                        sb2.append(split3[0]);
                        sb2.append("=");
                        sb2.append(split3[1]);
                        sb2.append("&");
                        str4 = sb2.toString();
                    }
                }
                if (!z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str4);
                    sb3.append(str2);
                    sb3.append("=");
                    sb3.append(str3);
                    str4 = sb3.toString();
                }
                if (str4.endsWith("&")) {
                    str4 = str4.substring(0, str4.length() - 1);
                }
            } else if (str.toLowerCase().lastIndexOf("%3f") >= 0) {
                length = str.toLowerCase().lastIndexOf("%3f") + 3;
                String str7 = str5;
                boolean z2 = false;
                for (String str8 : str.substring(length).split("%26")) {
                    String[] split4 = str8.split("(%3d|%3D)");
                    if (split4.length != 2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str7);
                        sb4.append(str8);
                        sb4.append("%26");
                        str7 = sb4.toString();
                    } else {
                        if (split4[0].equals(str2)) {
                            split4[1] = str3;
                            z2 = true;
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str7);
                        sb5.append(split4[0]);
                        sb5.append("%3d");
                        sb5.append(split4[1]);
                        sb5.append("%26");
                        str7 = sb5.toString();
                    }
                }
                if (!z2) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str7);
                    sb6.append(str2);
                    sb6.append("%3d");
                    sb6.append(str3);
                    str7 = sb6.toString();
                }
                if (str4.endsWith("%26")) {
                    str4 = str4.substring(0, str4.length() - 3);
                }
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str5);
                sb7.append("?");
                sb7.append(str2);
                sb7.append("=");
                sb7.append(str3);
                str4 = sb7.toString();
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str.substring(0, length));
            sb8.append(str4);
            return sb8.toString();
        } catch (Exception unused) {
            return str;
        }
    }
}
