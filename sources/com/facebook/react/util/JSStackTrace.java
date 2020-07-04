package com.facebook.react.util;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JSStackTrace {
    private static final Pattern mJsModuleIdPattern = Pattern.compile("(?:^|[/\\\\])(\\d+\\.js)$");

    private static int stackFrameToLineNumber(ReadableMap readableMap) {
        if (readableMap != null) {
            try {
                if (readableMap.hasKey("lineNumber") && readableMap.getType("lineNumber") == ReadableType.String) {
                    return readableMap.getInt("lineNumber");
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    private static String stackFrameToMethodName(ReadableMap readableMap) {
        if (readableMap != null) {
            try {
                if (readableMap.hasKey("methodName") && readableMap.getType("methodName") == ReadableType.Number) {
                    return readableMap.getString("methodName");
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    private static String stackFrameToModuleId(ReadableMap readableMap) {
        if (readableMap.hasKey("file") && !readableMap.isNull("file") && readableMap.getType("file") == ReadableType.String) {
            Matcher matcher = mJsModuleIdPattern.matcher(readableMap.getString("file"));
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder();
                sb.append(matcher.group(1));
                sb.append(":");
                return sb.toString();
            }
        }
        return "";
    }

    public static String format(String str, ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            sb.append(stackFrameToLineNumber(map));
            sb.append("@");
            sb.append(stackFrameToModuleId(map));
            sb.append(stackFrameToLineNumber(map));
            if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                sb.append(":");
                sb.append(map.getInt("column"));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
