package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.regex.Pattern;

/* renamed from: com.fasterxml.jackson.core.util.c */
public class C14682c {

    /* renamed from: a */
    private static final Pattern f37984a = Pattern.compile("[-_./;:]");

    /* renamed from: b */
    public final Version f37985b;

    protected C14682c() {
        Version version;
        try {
            version = m42493a(getClass());
        } catch (Exception unused) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder("ERROR: Failed to load Version information for bundle (via ");
            sb.append(getClass().getName());
            sb.append(").");
            printStream.println(sb.toString());
            version = null;
        }
        if (version == null) {
            version = Version.unknownVersion();
        }
        this.f37985b = version;
    }

    /* renamed from: a */
    private static int m42492a(String str) {
        String str2 = str.toString();
        int length = str2.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i = (i * 10) + (charAt - '0');
        }
        return i;
    }

    /* renamed from: a */
    private static Version m42493a(Class<?> cls) {
        InputStream resourceAsStream;
        String str;
        String str2;
        Version version = null;
        try {
            resourceAsStream = cls.getResourceAsStream("VERSION.txt");
            if (resourceAsStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8"));
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    str = bufferedReader.readLine();
                    if (str != null) {
                        str = str.trim();
                        str2 = bufferedReader.readLine();
                        if (str2 != null) {
                            str2 = str2.trim();
                        }
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                    str = null;
                }
                Version a = m42494a(readLine, str, str2);
                try {
                    resourceAsStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (IOException unused) {
                }
                version = a;
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (IOException unused2) {
        } catch (Throwable th) {
            resourceAsStream.close();
            throw th;
        }
        if (version == null) {
            return Version.unknownVersion();
        }
        return version;
    }

    /* renamed from: a */
    private static Version m42494a(String str, String str2, String str3) {
        int i;
        int i2;
        String str4 = null;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        String[] split = f37984a.split(trim);
        int a = m42492a(split[0]);
        if (split.length > 1) {
            i = m42492a(split[1]);
        } else {
            i = 0;
        }
        if (split.length > 2) {
            i2 = m42492a(split[2]);
        } else {
            i2 = 0;
        }
        if (split.length > 3) {
            str4 = split[3];
        }
        Version version = new Version(a, i, i2, str4, str2, str3);
        return version;
    }
}
