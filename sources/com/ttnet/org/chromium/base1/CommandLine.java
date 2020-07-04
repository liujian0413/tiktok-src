package com.ttnet.org.chromium.base1;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final AtomicReference<CommandLine> sCommandLine = new AtomicReference<>();
    public static final List<ResetListener> sResetListeners = new ArrayList();

    static class JavaCommandLine extends CommandLine {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private ArrayList<String> mArgs = new ArrayList<>();
        private int mArgsBegin = 1;
        private HashMap<String, String> mSwitches = new HashMap<>();

        static {
            Class<CommandLine> cls = CommandLine.class;
        }

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
        public boolean isNativeImplementation() {
            return true;
        }

        private NativeCommandLine() {
            super();
        }

        public void appendSwitch(String str) {
            CommandLine.nativeAppendSwitch(str);
        }

        public void appendSwitchesAndArguments(String[] strArr) {
            CommandLine.nativeAppendSwitchesAndArguments(strArr);
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

    public interface ResetListener {
        void onCommandLineReset();
    }

    private CommandLine() {
    }

    public static native void nativeAppendSwitch(String str);

    public static native void nativeAppendSwitchWithValue(String str, String str2);

    public static native void nativeAppendSwitchesAndArguments(String[] strArr);

    public static native String nativeGetSwitchValue(String str);

    public static native boolean nativeHasSwitch(String str);

    private static native void nativeReset();

    public abstract void appendSwitch(String str);

    public abstract void appendSwitchWithValue(String str, String str2);

    public abstract void appendSwitchesAndArguments(String[] strArr);

    public abstract String getSwitchValue(String str);

    public abstract boolean hasSwitch(String str);

    public boolean isNativeImplementation() {
        return false;
    }

    public static void enableNativeProxy() {
        sCommandLine.set(new NativeCommandLine());
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

    public static void reset() {
        setInstance(null);
        ThreadUtils.postOnUiThread((Runnable) new Runnable() {
            public final void run() {
                for (ResetListener onCommandLineReset : CommandLine.sResetListeners) {
                    onCommandLineReset.onCommandLineReset();
                }
            }
        });
    }

    public static String[] getJavaSwitchesOrNull() {
        CommandLine commandLine = (CommandLine) sCommandLine.get();
        if (commandLine != null) {
            return ((JavaCommandLine) commandLine).getCommandLineArguments();
        }
        return null;
    }

    public static void addResetListener(ResetListener resetListener) {
        sResetListeners.add(resetListener);
    }

    public static void removeResetListener(ResetListener resetListener) {
        sResetListeners.remove(resetListener);
    }

    public static void init(String[] strArr) {
        setInstance(new JavaCommandLine(strArr));
    }

    public static void initFromFile(String str) {
        String[] strArr;
        char[] readUtf8FileFully = readUtf8FileFully(str, VideoCacheReadBuffersizeExperiment.DEFAULT);
        if (readUtf8FileFully == null) {
            strArr = null;
        } else {
            strArr = tokenizeQuotedAruments(readUtf8FileFully);
        }
        init(strArr);
    }

    private static void setInstance(CommandLine commandLine) {
        CommandLine commandLine2 = (CommandLine) sCommandLine.getAndSet(commandLine);
        if (commandLine2 != null && commandLine2.isNativeImplementation()) {
            nativeReset();
        }
    }

    public static String[] tokenizeQuotedAruments(char[] cArr) {
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

    public String getSwitchValue(String str, String str2) {
        String switchValue = getSwitchValue(str);
        if (TextUtils.isEmpty(switchValue)) {
            return str2;
        }
        return switchValue;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[SYNTHETIC, Splitter:B:21:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0044 A[SYNTHETIC, Splitter:B:29:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004b A[SYNTHETIC, Splitter:B:37:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static char[] readUtf8FileFully(java.lang.String r6, int r7) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            long r1 = r0.length()
            r6 = 0
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0011
            return r6
        L_0x0011:
            long r3 = (long) r7
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0017
            return r6
        L_0x0017:
            int r7 = (int) r1
            char[] r7 = new char[r7]     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0041, all -> 0x003a }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0041, all -> 0x003a }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0041, all -> 0x003a }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0041, all -> 0x003a }
            java.lang.String r0 = "UTF-8"
            r1.<init>(r2, r0)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0041, all -> 0x003a }
            int r0 = r1.read(r7)     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0042, all -> 0x0036 }
            int r2 = r7.length     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0042, all -> 0x0036 }
            if (r0 >= r2) goto L_0x0032
            r2 = 0
            char[] r7 = java.util.Arrays.copyOfRange(r7, r2, r0)     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0042, all -> 0x0036 }
        L_0x0032:
            r1.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            return r7
        L_0x0036:
            r6 = move-exception
            r7 = r6
            r6 = r1
            goto L_0x003b
        L_0x003a:
            r7 = move-exception
        L_0x003b:
            if (r6 == 0) goto L_0x0040
            r6.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            throw r7
        L_0x0041:
            r1 = r6
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            return r6
        L_0x0048:
            r1 = r6
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base1.CommandLine.readUtf8FileFully(java.lang.String, int):char[]");
    }
}
