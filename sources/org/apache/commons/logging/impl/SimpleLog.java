package org.apache.commons.logging.impl;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.logging.Log;

public class SimpleLog implements Serializable, Log {
    static /* synthetic */ Class class$java$lang$Thread;
    static /* synthetic */ Class class$org$apache$commons$logging$impl$SimpleLog;
    protected static DateFormat dateFormatter;
    protected static String dateTimeFormat;
    protected static boolean showDateTime;
    protected static boolean showLogName;
    protected static boolean showShortName;
    protected static final Properties simpleLogProps = new Properties();
    protected int currentLogLevel;
    protected String logName;
    private String shortLogName;

    public int getLevel() {
        return this.currentLogLevel;
    }

    public final boolean isDebugEnabled() {
        return isLevelEnabled(2);
    }

    public final boolean isErrorEnabled() {
        return isLevelEnabled(5);
    }

    public final boolean isFatalEnabled() {
        return isLevelEnabled(6);
    }

    public final boolean isInfoEnabled() {
        return isLevelEnabled(3);
    }

    public final boolean isTraceEnabled() {
        return isLevelEnabled(1);
    }

    public final boolean isWarnEnabled() {
        return isLevelEnabled(4);
    }

    static {
        showLogName = false;
        showShortName = true;
        showDateTime = false;
        dateTimeFormat = "yyyy/MM/dd HH:mm:ss:SSS zzz";
        dateFormatter = null;
        InputStream resourceAsStream = getResourceAsStream("simplelog.properties");
        if (resourceAsStream != null) {
            try {
                simpleLogProps.load(resourceAsStream);
                resourceAsStream.close();
            } catch (IOException unused) {
            }
        }
        showLogName = getBooleanProperty("org.apache.commons.logging.simplelog.showlogname", showLogName);
        showShortName = getBooleanProperty("org.apache.commons.logging.simplelog.showShortLogname", showShortName);
        boolean booleanProperty = getBooleanProperty("org.apache.commons.logging.simplelog.showdatetime", showDateTime);
        showDateTime = booleanProperty;
        if (booleanProperty) {
            dateTimeFormat = getStringProperty("org.apache.commons.logging.simplelog.dateTimeFormat", dateTimeFormat);
            try {
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            } catch (IllegalArgumentException unused2) {
                dateTimeFormat = "yyyy/MM/dd HH:mm:ss:SSS zzz";
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.ClassLoader getContextClassLoader() {
        /*
            r0 = 0
            java.lang.Class r1 = class$java$lang$Thread     // Catch:{ NoSuchMethodException -> 0x0038 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "java.lang.Thread"
            java.lang.Class r1 = class$(r1)     // Catch:{ NoSuchMethodException -> 0x0038 }
            class$java$lang$Thread = r1     // Catch:{ NoSuchMethodException -> 0x0038 }
            goto L_0x0010
        L_0x000e:
            java.lang.Class r1 = class$java$lang$Thread     // Catch:{ NoSuchMethodException -> 0x0038 }
        L_0x0010:
            java.lang.String r2 = "getContextClassLoader"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch:{ NoSuchMethodException -> 0x0038 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            r0 = r1
            goto L_0x0038
        L_0x0022:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getTargetException()     // Catch:{ NoSuchMethodException -> 0x0038 }
            boolean r2 = r2 instanceof java.lang.SecurityException     // Catch:{ NoSuchMethodException -> 0x0038 }
            if (r2 == 0) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            org.apache.commons.logging.LogConfigurationException r2 = new org.apache.commons.logging.LogConfigurationException     // Catch:{ NoSuchMethodException -> 0x0038 }
            java.lang.String r3 = "Unexpected InvocationTargetException"
            java.lang.Throwable r1 = r1.getTargetException()     // Catch:{ NoSuchMethodException -> 0x0038 }
            r2.<init>(r3, r1)     // Catch:{ NoSuchMethodException -> 0x0038 }
            throw r2     // Catch:{ NoSuchMethodException -> 0x0038 }
        L_0x0038:
            if (r0 != 0) goto L_0x004d
            java.lang.Class r0 = class$org$apache$commons$logging$impl$SimpleLog
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "org.apache.commons.logging.impl.SimpleLog"
            java.lang.Class r0 = class$(r0)
            class$org$apache$commons$logging$impl$SimpleLog = r0
            goto L_0x0049
        L_0x0047:
            java.lang.Class r0 = class$org$apache$commons$logging$impl$SimpleLog
        L_0x0049:
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.SimpleLog.getContextClassLoader():java.lang.ClassLoader");
    }

    public void setLevel(int i) {
        this.currentLogLevel = i;
    }

    /* access modifiers changed from: protected */
    public boolean isLevelEnabled(int i) {
        if (i >= this.currentLogLevel) {
            return true;
        }
        return false;
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static InputStream getResourceAsStream(final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                ClassLoader contextClassLoader = SimpleLog.getContextClassLoader();
                if (contextClassLoader != null) {
                    return contextClassLoader.getResourceAsStream(str);
                }
                return ClassLoader.getSystemResourceAsStream(str);
            }
        });
    }

    private static String getStringProperty(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return simpleLogProps.getProperty(str);
        }
        return str2;
    }

    public final void debug(Object obj) {
        if (isLevelEnabled(2)) {
            log(2, obj, null);
        }
    }

    public final void error(Object obj) {
        if (isLevelEnabled(5)) {
            log(5, obj, null);
        }
    }

    public final void fatal(Object obj) {
        if (isLevelEnabled(6)) {
            log(6, obj, null);
        }
    }

    public final void info(Object obj) {
        if (isLevelEnabled(3)) {
            log(3, obj, null);
        }
    }

    public final void trace(Object obj) {
        if (isLevelEnabled(1)) {
            log(1, obj, null);
        }
    }

    public final void warn(Object obj) {
        if (isLevelEnabled(4)) {
            log(4, obj, null);
        }
    }

    /* access modifiers changed from: protected */
    public void write(StringBuffer stringBuffer) {
        System.err.println(stringBuffer.toString());
    }

    public SimpleLog(String str) {
        this.logName = str;
        setLevel(3);
        StringBuffer stringBuffer = new StringBuffer("org.apache.commons.logging.simplelog.log.");
        stringBuffer.append(this.logName);
        String stringProperty = getStringProperty(stringBuffer.toString());
        int lastIndexOf = String.valueOf(str).lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        while (stringProperty == null && lastIndexOf >= 0) {
            str = str.substring(0, lastIndexOf);
            StringBuffer stringBuffer2 = new StringBuffer("org.apache.commons.logging.simplelog.log.");
            stringBuffer2.append(str);
            stringProperty = getStringProperty(stringBuffer2.toString());
            lastIndexOf = String.valueOf(str).lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        }
        if (stringProperty == null) {
            stringProperty = getStringProperty("org.apache.commons.logging.simplelog.defaultlog");
        }
        if ("all".equalsIgnoreCase(stringProperty)) {
            setLevel(0);
        } else if ("trace".equalsIgnoreCase(stringProperty)) {
            setLevel(1);
        } else if ("debug".equalsIgnoreCase(stringProperty)) {
            setLevel(2);
        } else if ("info".equalsIgnoreCase(stringProperty)) {
            setLevel(3);
        } else if ("warn".equalsIgnoreCase(stringProperty)) {
            setLevel(4);
        } else if ("error".equalsIgnoreCase(stringProperty)) {
            setLevel(5);
        } else if ("fatal".equalsIgnoreCase(stringProperty)) {
            setLevel(6);
        } else {
            if ("off".equalsIgnoreCase(stringProperty)) {
                setLevel(7);
            }
        }
    }

    private static String getStringProperty(String str, String str2) {
        String stringProperty = getStringProperty(str);
        if (stringProperty == null) {
            return str2;
        }
        return stringProperty;
    }

    private static boolean getBooleanProperty(String str, boolean z) {
        String stringProperty = getStringProperty(str);
        if (stringProperty == null) {
            return z;
        }
        return "true".equalsIgnoreCase(stringProperty);
    }

    public final void debug(Object obj, Throwable th) {
        if (isLevelEnabled(2)) {
            log(2, obj, th);
        }
    }

    public final void error(Object obj, Throwable th) {
        if (isLevelEnabled(5)) {
            log(5, obj, th);
        }
    }

    public final void fatal(Object obj, Throwable th) {
        if (isLevelEnabled(6)) {
            log(6, obj, th);
        }
    }

    public final void info(Object obj, Throwable th) {
        if (isLevelEnabled(3)) {
            log(3, obj, th);
        }
    }

    public final void trace(Object obj, Throwable th) {
        if (isLevelEnabled(1)) {
            log(1, obj, th);
        }
    }

    public final void warn(Object obj, Throwable th) {
        if (isLevelEnabled(4)) {
            log(4, obj, th);
        }
    }

    /* access modifiers changed from: protected */
    public void log(int i, Object obj, Throwable th) {
        String format;
        StringBuffer stringBuffer = new StringBuffer();
        if (showDateTime) {
            Date date = new Date();
            synchronized (dateFormatter) {
                format = dateFormatter.format(date);
            }
            stringBuffer.append(format);
            stringBuffer.append(" ");
        }
        switch (i) {
            case 1:
                stringBuffer.append("[TRACE] ");
                break;
            case 2:
                stringBuffer.append("[DEBUG] ");
                break;
            case 3:
                stringBuffer.append("[INFO] ");
                break;
            case 4:
                stringBuffer.append("[WARN] ");
                break;
            case 5:
                stringBuffer.append("[ERROR] ");
                break;
            case 6:
                stringBuffer.append("[FATAL] ");
                break;
        }
        if (showShortName) {
            if (this.shortLogName == null) {
                this.shortLogName = this.logName.substring(this.logName.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR) + 1);
                this.shortLogName = this.shortLogName.substring(this.shortLogName.lastIndexOf("/") + 1);
            }
            stringBuffer.append(String.valueOf(this.shortLogName));
            stringBuffer.append(" - ");
        } else if (showLogName) {
            stringBuffer.append(String.valueOf(this.logName));
            stringBuffer.append(" - ");
        }
        stringBuffer.append(String.valueOf(obj));
        if (th != null) {
            stringBuffer.append(" <");
            stringBuffer.append(th.toString());
            stringBuffer.append(">");
            StringWriter stringWriter = new StringWriter(PreloadTask.BYTE_UNIT_NUMBER);
            PrintWriter printWriter = new PrintWriter(stringWriter);
            C6497a.m20180a(th, printWriter);
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
        }
        write(stringBuffer);
    }
}
