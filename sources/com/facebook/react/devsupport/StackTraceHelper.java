package com.facebook.react.devsupport;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.devsupport.interfaces.StackFrame;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StackTraceHelper {
    private static final Pattern STACK_FRAME_PATTERN = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");

    public static class StackFrameImpl implements StackFrame {
        private final int mColumn;
        private final String mFile;
        private final String mFileName;
        private final int mLine;
        private final String mMethod;

        public int getColumn() {
            return this.mColumn;
        }

        public String getFile() {
            return this.mFile;
        }

        public String getFileName() {
            return this.mFileName;
        }

        public int getLine() {
            return this.mLine;
        }

        public String getMethod() {
            return this.mMethod;
        }

        public JSONObject toJSON() {
            return new JSONObject(MapBuilder.m41791of("file", getFile(), "methodName", getMethod(), "lineNumber", Integer.valueOf(getLine()), "column", Integer.valueOf(getColumn())));
        }

        private StackFrameImpl(String str, String str2, int i, int i2) {
            String str3;
            this.mFile = str;
            this.mMethod = str2;
            this.mLine = i;
            this.mColumn = i2;
            if (str != null) {
                str3 = new File(str).getName();
            } else {
                str3 = "";
            }
            this.mFileName = str3;
        }

        private StackFrameImpl(String str, String str2, String str3, int i, int i2) {
            this.mFile = str;
            this.mFileName = str2;
            this.mMethod = str3;
            this.mLine = i;
            this.mColumn = i2;
        }
    }

    public static StackFrame[] convertJavaStackTrace(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StackFrame[] stackFrameArr = new StackFrame[stackTrace.length];
        for (int i = 0; i < stackTrace.length; i++) {
            StackFrameImpl stackFrameImpl = new StackFrameImpl(stackTrace[i].getClassName(), stackTrace[i].getFileName(), stackTrace[i].getMethodName(), stackTrace[i].getLineNumber(), -1);
            stackFrameArr[i] = stackFrameImpl;
        }
        return stackFrameArr;
    }

    public static String formatFrameSource(StackFrame stackFrame) {
        StringBuilder sb = new StringBuilder();
        sb.append(stackFrame.getFileName());
        int line = stackFrame.getLine();
        if (line > 0) {
            sb.append(":");
            sb.append(line);
            int column = stackFrame.getColumn();
            if (column > 0) {
                sb.append(":");
                sb.append(column);
            }
        }
        return sb.toString();
    }

    public static StackFrame[] convertJsStackTrace(ReadableArray readableArray) {
        int i;
        int i2;
        int i3;
        if (readableArray != null) {
            i = readableArray.size();
        } else {
            i = 0;
        }
        StackFrame[] stackFrameArr = new StackFrame[i];
        for (int i4 = 0; i4 < i; i4++) {
            ReadableType type = readableArray.getType(i4);
            if (type == ReadableType.Map) {
                ReadableMap map = readableArray.getMap(i4);
                String string = map.getString("methodName");
                String string2 = map.getString("file");
                if (!map.hasKey("lineNumber") || map.isNull("lineNumber")) {
                    i2 = -1;
                } else {
                    i2 = map.getInt("lineNumber");
                }
                if (!map.hasKey("column") || map.isNull("column")) {
                    i3 = -1;
                } else {
                    i3 = map.getInt("column");
                }
                StackFrameImpl stackFrameImpl = new StackFrameImpl(string2, string, i2, i3);
                stackFrameArr[i4] = stackFrameImpl;
            } else if (type == ReadableType.String) {
                StackFrameImpl stackFrameImpl2 = new StackFrameImpl((String) null, readableArray.getString(i4), -1, -1);
                stackFrameArr[i4] = stackFrameImpl2;
            }
        }
        return stackFrameArr;
    }

    public static StackFrame[] convertJsStackTrace(String str) {
        String group;
        String[] split = str.split("\n");
        StackFrame[] stackFrameArr = new StackFrame[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = STACK_FRAME_PATTERN.matcher(split[i]);
            if (matcher.find()) {
                String group2 = matcher.group(2);
                if (matcher.group(1) == null) {
                    group = "(unknown)";
                } else {
                    group = matcher.group(1);
                }
                StackFrameImpl stackFrameImpl = new StackFrameImpl(group2, group, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)));
                stackFrameArr[i] = stackFrameImpl;
            } else {
                StackFrameImpl stackFrameImpl2 = new StackFrameImpl((String) null, split[i], -1, -1);
                stackFrameArr[i] = stackFrameImpl2;
            }
        }
        return stackFrameArr;
    }

    public static StackFrame[] convertJsStackTrace(JSONArray jSONArray) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (jSONArray != null) {
            i = jSONArray.length();
        } else {
            i = 0;
        }
        StackFrame[] stackFrameArr = new StackFrame[i];
        while (i4 < i) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                String string = jSONObject.getString("methodName");
                String string2 = jSONObject.getString("file");
                if (!jSONObject.has("lineNumber") || jSONObject.isNull("lineNumber")) {
                    i2 = -1;
                } else {
                    i2 = jSONObject.getInt("lineNumber");
                }
                if (!jSONObject.has("column") || jSONObject.isNull("column")) {
                    i3 = -1;
                } else {
                    i3 = jSONObject.getInt("column");
                }
                StackFrameImpl stackFrameImpl = new StackFrameImpl(string2, string, i2, i3);
                stackFrameArr[i4] = stackFrameImpl;
                i4++;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return stackFrameArr;
    }

    public static String formatStackTrace(String str, StackFrame[] stackFrameArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        for (StackFrame stackFrame : stackFrameArr) {
            sb.append(stackFrame.getMethod());
            sb.append("\n    ");
            sb.append(formatFrameSource(stackFrame));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String formatStackTrace(StackFrame[] stackFrameArr, boolean z) {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        for (StackFrame stackFrame : stackFrameArr) {
            sb.append(stackFrame.getMethod());
            if (z) {
                str = "\n";
            } else {
                str = ":";
            }
            sb.append(str);
            if (z) {
                str2 = "    ";
            } else {
                str2 = "";
            }
            sb.append(str2);
            sb.append(formatFrameSource(stackFrame));
            if (z) {
                str3 = "\n";
            } else {
                str3 = "    ";
            }
            sb.append(str3);
        }
        return sb.toString();
    }
}
