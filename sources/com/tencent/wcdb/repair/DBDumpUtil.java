package com.tencent.wcdb.repair;

public class DBDumpUtil {
    private static native boolean nativeDumpDB(String str, String str2, String str3);

    private static native boolean nativeIsSqlComplete(String str);
}
