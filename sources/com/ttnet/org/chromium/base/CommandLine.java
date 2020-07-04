package com.ttnet.org.chromium.base;

import android.text.TextUtils;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final AtomicReference<CommandLine> sCommandLine = new AtomicReference<>();

    static class JavaCommandLine extends CommandLine {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private ArrayList<String> mArgs = new ArrayList<>();
        private int mArgsBegin = 1;
        private HashMap<String, String> mSwitches = new HashMap<>();

        static {
            Class<CommandLine> cls = CommandLine.class;
        }

        /* access modifiers changed from: protected */
        public String[] getCommandLineArguments() {
            return (String[]) this.mArgs.toArray(new String[this.mArgs.size()]);
        }

        public void appendSwitch(String str) {
            appendSwitchWithValue(str, null);
        }

        public void appendSwitchesAndArguments(String[] strArr) {
            appendSwitchesInternal(strArr, 0);
        }

        public boolean hasSwitch(String str) {
            return this.mSwitches.containsKey(str);
        }

        public String getSwitchValue(String str) {
            String str2 = (String) this.mSwitches.get(str);
            if (str2 == null || str2.isEmpty()) {
                return null;
            }
            return str2;
        }

        JavaCommandLine(String[] strArr) {
            super();
            if (strArr == null || strArr.length == 0 || strArr[0] == null) {
                this.mArgs.add("");
                return;
            }
            this.mArgs.add(strArr[0]);
            appendSwitchesInternal(strArr, 1);
        }

        private void appendSwitchesInternal(String[] strArr, int i) {
            String str;
            int i2 = i;
            boolean z = true;
            for (String str2 : strArr) {
                if (i2 > 0) {
                    i2--;
                } else {
                    if (str2.equals("--")) {
                        z = false;
                    }
                    if (!z || !str2.startsWith("--")) {
                        this.mArgs.add(str2);
                    } else {
                        String[] split = str2.split("=", 2);
                        if (split.length > 1) {
                            str = split[1];
                        } else {
                            str = null;
                        }
                        appendSwitchWithValue(split[0].substring(2), str);
                    }
                }
            }
        }

        public void appendSwitchWithValue(String str, String str2) {
            String str3;
            HashMap<String, String> hashMap = this.mSwitches;
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            hashMap.put(str, str3);
            StringBuilder sb = new StringBuilder("--");
            sb.append(str);
            String sb2 = sb.toString();
            if (str2 != null && !str2.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("=");
                sb3.append(str2);
                sb2 = sb3.toString();
            }
            ArrayList<String> arrayList = this.mArgs;
            int i = this.mArgsBegin;
            this.mArgsBegin = i + 1;
            arrayList.add(i, sb2);
        }
    }

    static class NativeCommandLine extends CommandLine {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class<CommandLine> cls = CommandLine.class;
        }

        /* access modifiers changed from: protected */
        public String[] getCommandLineArguments() {
            return null;
        }

        public boolean isNativeImplementation() {
            return true;
        }

        /* access modifiers changed from: protected */
        public void destroy() {
            throw new IllegalStateException("Can't destroy native command line after startup");
        }

        public void appendSwitch(String str) {
            CommandLine.nativeAppendSwitch(str);
        }

        public void appendSwitchesAndArguments(String[] strArr) {
            CommandLine.nativeAppendSwitchesAndArguments(strArr);
        }

        public NativeCommandLine(String[] strArr) {
            super();
            CommandLine.nativeInit(strArr);
        }

        public String getSwitchValue(String str) {
            return CommandLine.nativeGetSwitchValue(str);
        }

        public boolean hasSwitch(String str) {
            return CommandLine.nativeHasSwitch(str);
        }

        public void appendSwitchWithValue(String str, String str2) {
            CommandLine.nativeAppendSwitchWithValue(str, str2);
        }
    }

    private CommandLine() {
    }

    public static native void nativeAppendSwitch(String str);

    public static native void nativeAppendSwitchWithValue(String str, String str2);

    public static native void nativeAppendSwitchesAndArguments(String[] strArr);

    public static native String nativeGetSwitchValue(String str);

    public static native boolean nativeHasSwitch(String str);

    public static native void nativeInit(String[] strArr);

    public abstract void appendSwitch(String str);

    public abstract void appendSwitchWithValue(String str, String str2);

    public abstract void appendSwitchesAndArguments(String[] strArr);

    /* access modifiers changed from: protected */
    public void destroy() {
    }

    /* access modifiers changed from: protected */
    public abstract String[] getCommandLineArguments();

    public abstract String getSwitchValue(String str);

    public abstract boolean hasSwitch(String str);

    public boolean isNativeImplementation() {
        return false;
    }

    public static void reset() {
        setInstance(null);
    }

    public static void enableNativeProxy() {
        sCommandLine.set(new NativeCommandLine(getJavaSwitchesOrNull()));
    }

    public static CommandLine getInstance() {
        return (CommandLine) sCommandLine.get();
    }

    public static boolean isInitialized() {
        if (sCommandLine.get() != null) {
            return true;
        }
        return false;
    }

    public static String[] getJavaSwitchesOrNull() {
        CommandLine commandLine = (CommandLine) sCommandLine.get();
        if (commandLine != null) {
            return commandLine.getCommandLineArguments();
        }
        return null;
    }

    public static void init(String[] strArr) {
        setInstance(new JavaCommandLine(strArr));
    }

    public static void initFromFile(String str) {
        String[] strArr;
        char[] readFileAsUtf8 = readFileAsUtf8(str);
        if (readFileAsUtf8 == null) {
            strArr = null;
        } else {
            strArr = tokenizeQuotedArguments(readFileAsUtf8);
        }
        init(strArr);
    }

    private static void setInstance(CommandLine commandLine) {
        CommandLine commandLine2 = (CommandLine) sCommandLine.getAndSet(commandLine);
        if (commandLine2 != null) {
            commandLine2.destroy();
        }
    }

    private static char[] readFileAsUtf8(String str) {
        Throwable th;
        Throwable th2;
        File file = new File(str);
        try {
            FileReader fileReader = new FileReader(file);
            try {
                char[] cArr = new char[((int) file.length())];
                char[] copyOfRange = Arrays.copyOfRange(cArr, 0, fileReader.read(cArr));
                fileReader.close();
                return copyOfRange;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th = r0;
                th2 = th4;
            }
            throw th2;
            if (th != null) {
                try {
                    fileReader.close();
                } catch (Throwable th5) {
                    C6497a.m20181a(th, th5);
                }
            } else {
                fileReader.close();
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    static String[] tokenizeQuotedArguments(char[] cArr) {
        if (cArr.length <= 65536) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = null;
            char c = 0;
            for (char c2 : cArr) {
                if ((c == 0 && (c2 == '\'' || c2 == '\"')) || c2 == c) {
                    if (sb == null || sb.length() <= 0 || sb.charAt(sb.length() - 1) != '\\') {
                        if (c != 0) {
                            c2 = 0;
                        }
                        c = c2;
                    } else {
                        sb.setCharAt(sb.length() - 1, c2);
                    }
                } else if (c != 0 || !Character.isWhitespace(c2)) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(c2);
                } else if (sb != null) {
                    arrayList.add(sb.toString());
                    sb = null;
                }
            }
            if (sb != null) {
                arrayList.add(sb.toString());
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        StringBuilder sb2 = new StringBuilder("Flags file too big: ");
        sb2.append(cArr.length);
        throw new RuntimeException(sb2.toString());
    }

    public String getSwitchValue(String str, String str2) {
        String switchValue = getSwitchValue(str);
        if (TextUtils.isEmpty(switchValue)) {
            return str2;
        }
        return switchValue;
    }
}
