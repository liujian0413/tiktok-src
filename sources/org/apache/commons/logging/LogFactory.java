package org.apache.commons.logging;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

public abstract class LogFactory {
    static /* synthetic */ Class class$java$lang$Thread;
    static /* synthetic */ Class class$org$apache$commons$logging$LogFactory;
    private static String diagnosticPrefix;
    private static PrintStream diagnosticsStream;
    protected static Hashtable factories = createFactoryStore();
    protected static LogFactory nullClassLoaderFactory;
    private static ClassLoader thisClassLoader;

    protected LogFactory() {
    }

    public abstract Log getInstance(Class cls) throws LogConfigurationException;

    public abstract Log getInstance(String str) throws LogConfigurationException;

    public abstract void setAttribute(String str, Object obj);

    protected static boolean isDiagnosticsEnabled() {
        if (diagnosticsStream != null) {
            return true;
        }
        return false;
    }

    private static ClassLoader getContextClassLoaderInternal() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    static {
        Class cls;
        Class cls2;
        if (class$org$apache$commons$logging$LogFactory == null) {
            cls = class$("org.apache.commons.logging.LogFactory");
            class$org$apache$commons$logging$LogFactory = cls;
        } else {
            cls = class$org$apache$commons$logging$LogFactory;
        }
        thisClassLoader = getClassLoader(cls);
        initDiagnostics();
        if (class$org$apache$commons$logging$LogFactory == null) {
            cls2 = class$("org.apache.commons.logging.LogFactory");
            class$org$apache$commons$logging$LogFactory = cls2;
        } else {
            cls2 = class$org$apache$commons$logging$LogFactory;
        }
        logClassLoaderEnvironment(cls2);
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    private static final Hashtable createFactoryStore() {
        String str;
        Hashtable hashtable = null;
        try {
            str = getSystemProperty("org.apache.commons.logging.LogFactory.HashtableImpl", null);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "org.apache.commons.logging.impl.WeakHashtable";
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable unused2) {
            if (!"org.apache.commons.logging.impl.WeakHashtable".equals(str)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        if (hashtable == null) {
            return new Hashtable();
        }
        return hashtable;
    }

    public static ClassLoader directGetContextClassLoader() throws LogConfigurationException {
        Class cls;
        Class cls2;
        try {
            if (class$java$lang$Thread == null) {
                cls2 = class$("java.lang.Thread");
                class$java$lang$Thread = cls2;
            } else {
                cls2 = class$java$lang$Thread;
            }
            return (ClassLoader) cls2.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
        } catch (IllegalAccessException e) {
            throw new LogConfigurationException("Unexpected IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getTargetException() instanceof SecurityException) {
                return null;
            }
            throw new LogConfigurationException("Unexpected InvocationTargetException", e2.getTargetException());
        } catch (NoSuchMethodException unused) {
            if (class$org$apache$commons$logging$LogFactory == null) {
                cls = class$("org.apache.commons.logging.LogFactory");
                class$org$apache$commons$logging$LogFactory = cls;
            } else {
                cls = class$org$apache$commons$logging$LogFactory;
            }
            return getClassLoader(cls);
        }
    }

    private static void initDiagnostics() {
        String str;
        try {
            String systemProperty = getSystemProperty("org.apache.commons.logging.diagnostics.dest", null);
            if (systemProperty != null) {
                if (systemProperty.equals("STDOUT")) {
                    diagnosticsStream = System.out;
                } else if (systemProperty.equals("STDERR")) {
                    diagnosticsStream = System.err;
                } else {
                    try {
                        diagnosticsStream = new PrintStream(new FileOutputStream(systemProperty, true));
                    } catch (IOException unused) {
                        return;
                    }
                }
                try {
                    ClassLoader classLoader = thisClassLoader;
                    if (thisClassLoader == null) {
                        str = "BOOTLOADER";
                    } else {
                        str = objectId(classLoader);
                    }
                } catch (SecurityException unused2) {
                    str = "UNKNOWN";
                }
                StringBuffer stringBuffer = new StringBuffer("[LogFactory from ");
                stringBuffer.append(str);
                stringBuffer.append("] ");
                diagnosticPrefix = stringBuffer.toString();
            }
        } catch (SecurityException unused3) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:50|51|52|53|54|(3:58|(1:60)|61)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0105 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a A[Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.apache.commons.logging.LogFactory getFactory() throws org.apache.commons.logging.LogConfigurationException {
        /*
            java.lang.ClassLoader r0 = getContextClassLoaderInternal()
            if (r0 != 0) goto L_0x0011
            boolean r1 = isDiagnosticsEnabled()
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = "Context classloader is null."
            logDiagnostic(r1)
        L_0x0011:
            org.apache.commons.logging.LogFactory r1 = getCachedFactory(r0)
            if (r1 == 0) goto L_0x0018
            return r1
        L_0x0018:
            boolean r2 = isDiagnosticsEnabled()
            if (r2 == 0) goto L_0x0038
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            java.lang.String r3 = "[LOOKUP] LogFactory implementation requested for the first time for context classloader "
            r2.<init>(r3)
            java.lang.String r3 = objectId(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            logDiagnostic(r2)
            java.lang.String r2 = "[LOOKUP] "
            logHierarchy(r2, r0)
        L_0x0038:
            java.lang.String r2 = "commons-logging.properties"
            java.util.Properties r2 = getConfigurationFile(r0, r2)
            if (r2 == 0) goto L_0x0055
            java.lang.String r3 = "use_tccl"
            java.lang.String r3 = r2.getProperty(r3)
            if (r3 == 0) goto L_0x0055
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0055
            java.lang.ClassLoader r3 = thisClassLoader
            goto L_0x0056
        L_0x0055:
            r3 = r0
        L_0x0056:
            boolean r4 = isDiagnosticsEnabled()
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = "[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            logDiagnostic(r4)
        L_0x0061:
            java.lang.String r4 = "org.apache.commons.logging.LogFactory"
            r5 = 0
            java.lang.String r4 = getSystemProperty(r4, r5)     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            if (r4 == 0) goto L_0x008c
            boolean r5 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            if (r5 == 0) goto L_0x0086
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            java.lang.String r6 = "[LOOKUP] Creating an instance of LogFactory class '"
            r5.<init>(r6)     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            r5.append(r4)     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            java.lang.String r6 = "' as specified by system property org.apache.commons.logging.LogFactory"
            r5.append(r6)     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            java.lang.String r5 = r5.toString()     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            logDiagnostic(r5)     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
        L_0x0086:
            org.apache.commons.logging.LogFactory r4 = newFactory(r4, r3, r0)     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            r1 = r4
            goto L_0x00e3
        L_0x008c:
            boolean r4 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            if (r4 == 0) goto L_0x00e3
            java.lang.String r4 = "[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined."
            logDiagnostic(r4)     // Catch:{ SecurityException -> 0x00be, RuntimeException -> 0x0098 }
            goto L_0x00e3
        L_0x0098:
            r0 = move-exception
            boolean r1 = isDiagnosticsEnabled()
            if (r1 == 0) goto L_0x00bd
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            java.lang.String r2 = "[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: ["
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = trim(r2)
            r1.append(r2)
            java.lang.String r2 = "] as specified by a system property."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            logDiagnostic(r1)
        L_0x00bd:
            throw r0
        L_0x00be:
            r4 = move-exception
            boolean r5 = isDiagnosticsEnabled()
            if (r5 == 0) goto L_0x00e3
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            java.lang.String r6 = "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
            r5.<init>(r6)
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = trim(r4)
            r5.append(r4)
            java.lang.String r4 = "]. Trying alternative implementations..."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            logDiagnostic(r4)
        L_0x00e3:
            if (r1 != 0) goto L_0x0178
            boolean r4 = isDiagnosticsEnabled()
            if (r4 == 0) goto L_0x00f0
            java.lang.String r4 = "[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            logDiagnostic(r4)
        L_0x00f0:
            java.lang.String r4 = "META-INF/services/org.apache.commons.logging.LogFactory"
            java.io.InputStream r4 = getResourceAsStream(r0, r4)     // Catch:{ Exception -> 0x0153 }
            if (r4 == 0) goto L_0x0147
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x0105 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x0105 }
            java.lang.String r7 = "UTF-8"
            r6.<init>(r4, r7)     // Catch:{ UnsupportedEncodingException -> 0x0105 }
            r5.<init>(r6)     // Catch:{ UnsupportedEncodingException -> 0x0105 }
            goto L_0x010f
        L_0x0105:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0153 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0153 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0153 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0153 }
        L_0x010f:
            java.lang.String r4 = r5.readLine()     // Catch:{ Exception -> 0x0153 }
            r5.close()     // Catch:{ Exception -> 0x0153 }
            if (r4 == 0) goto L_0x0178
            java.lang.String r5 = ""
            boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x0153 }
            if (r5 != 0) goto L_0x0178
            boolean r5 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x0153 }
            if (r5 == 0) goto L_0x0141
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0153 }
            java.lang.String r6 = "[LOOKUP]  Creating an instance of LogFactory class "
            r5.<init>(r6)     // Catch:{ Exception -> 0x0153 }
            r5.append(r4)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r6 = " as specified by file 'META-INF/services/org.apache.commons.logging.LogFactory"
            r5.append(r6)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r6 = "' which was present in the path of the context classloader."
            r5.append(r6)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0153 }
            logDiagnostic(r5)     // Catch:{ Exception -> 0x0153 }
        L_0x0141:
            org.apache.commons.logging.LogFactory r4 = newFactory(r4, r3, r0)     // Catch:{ Exception -> 0x0153 }
            r1 = r4
            goto L_0x0178
        L_0x0147:
            boolean r4 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x0153 }
            if (r4 == 0) goto L_0x0178
            java.lang.String r4 = "[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found."
            logDiagnostic(r4)     // Catch:{ Exception -> 0x0153 }
            goto L_0x0178
        L_0x0153:
            r4 = move-exception
            boolean r5 = isDiagnosticsEnabled()
            if (r5 == 0) goto L_0x0178
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            java.lang.String r6 = "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
            r5.<init>(r6)
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = trim(r4)
            r5.append(r4)
            java.lang.String r4 = "]. Trying alternative implementations..."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            logDiagnostic(r4)
        L_0x0178:
            if (r1 != 0) goto L_0x01c7
            if (r2 == 0) goto L_0x01bc
            boolean r4 = isDiagnosticsEnabled()
            if (r4 == 0) goto L_0x0187
            java.lang.String r4 = "[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use..."
            logDiagnostic(r4)
        L_0x0187:
            java.lang.String r4 = "org.apache.commons.logging.LogFactory"
            java.lang.String r4 = r2.getProperty(r4)
            if (r4 == 0) goto L_0x01b0
            boolean r1 = isDiagnosticsEnabled()
            if (r1 == 0) goto L_0x01ab
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            java.lang.String r5 = "[LOOKUP] Properties file specifies LogFactory subclass '"
            r1.<init>(r5)
            r1.append(r4)
            java.lang.String r5 = "'"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            logDiagnostic(r1)
        L_0x01ab:
            org.apache.commons.logging.LogFactory r1 = newFactory(r4, r3, r0)
            goto L_0x01c7
        L_0x01b0:
            boolean r3 = isDiagnosticsEnabled()
            if (r3 == 0) goto L_0x01c7
            java.lang.String r3 = "[LOOKUP] Properties file has no entry specifying LogFactory subclass."
            logDiagnostic(r3)
            goto L_0x01c7
        L_0x01bc:
            boolean r3 = isDiagnosticsEnabled()
            if (r3 == 0) goto L_0x01c7
            java.lang.String r3 = "[LOOKUP] No properties file available to determine LogFactory subclass from.."
            logDiagnostic(r3)
        L_0x01c7:
            if (r1 != 0) goto L_0x01dc
            boolean r1 = isDiagnosticsEnabled()
            if (r1 == 0) goto L_0x01d4
            java.lang.String r1 = "[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader)."
            logDiagnostic(r1)
        L_0x01d4:
            java.lang.String r1 = "org.apache.commons.logging.impl.LogFactoryImpl"
            java.lang.ClassLoader r3 = thisClassLoader
            org.apache.commons.logging.LogFactory r1 = newFactory(r1, r3, r0)
        L_0x01dc:
            if (r1 == 0) goto L_0x01fb
            cacheFactory(r0, r1)
            if (r2 == 0) goto L_0x01fb
            java.util.Enumeration r0 = r2.propertyNames()
        L_0x01e7:
            boolean r3 = r0.hasMoreElements()
            if (r3 == 0) goto L_0x01fb
            java.lang.Object r3 = r0.nextElement()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r2.getProperty(r3)
            r1.setAttribute(r3, r4)
            goto L_0x01e7
        L_0x01fb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getFactory():org.apache.commons.logging.LogFactory");
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static LogFactory getCachedFactory(ClassLoader classLoader) {
        if (classLoader == null) {
            return nullClassLoaderFactory;
        }
        return (LogFactory) factories.get(classLoader);
    }

    public static Log getLog(Class cls) throws LogConfigurationException {
        return getFactory().getInstance(cls);
    }

    private static Properties getProperties(final URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                try {
                    InputStream openStream = url.openStream();
                    if (openStream != null) {
                        Properties properties = new Properties();
                        properties.load(openStream);
                        openStream.close();
                        return properties;
                    }
                } catch (IOException unused) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        StringBuffer stringBuffer = new StringBuffer("Unable to read URL ");
                        stringBuffer.append(url);
                        LogFactory.logDiagnostic(stringBuffer.toString());
                    }
                }
                return null;
            }
        });
    }

    private static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static Log getLog(String str) throws LogConfigurationException {
        return getFactory().getInstance(str);
    }

    public static final void logDiagnostic(String str) {
        if (diagnosticsStream != null) {
            diagnosticsStream.print(diagnosticPrefix);
            diagnosticsStream.println(str);
            diagnosticsStream.flush();
        }
    }

    protected static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw e;
        }
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    private static boolean implementsLogFactory(Class cls) {
        boolean z = false;
        if (cls == null) {
            return false;
        }
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader == null) {
                logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                return false;
            }
            logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
            boolean isAssignableFrom = Class.forName("org.apache.commons.logging.LogFactory", false, classLoader).isAssignableFrom(cls);
            if (isAssignableFrom) {
                try {
                    StringBuffer stringBuffer = new StringBuffer("[CUSTOM LOG FACTORY] ");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                    logDiagnostic(stringBuffer.toString());
                } catch (SecurityException e) {
                    e = e;
                    z = isAssignableFrom;
                    StringBuffer stringBuffer2 = new StringBuffer("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                    stringBuffer2.append(e.getMessage());
                    logDiagnostic(stringBuffer2.toString());
                    return z;
                } catch (LinkageError e2) {
                    e = e2;
                    z = isAssignableFrom;
                    StringBuffer stringBuffer3 = new StringBuffer("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                    stringBuffer3.append(e.getMessage());
                    logDiagnostic(stringBuffer3.toString());
                    return z;
                } catch (ClassNotFoundException unused) {
                    z = isAssignableFrom;
                    logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
                    return z;
                }
            } else {
                StringBuffer stringBuffer4 = new StringBuffer("[CUSTOM LOG FACTORY] ");
                stringBuffer4.append(cls.getName());
                stringBuffer4.append(" does not implement LogFactory.");
                logDiagnostic(stringBuffer4.toString());
            }
            return isAssignableFrom;
        } catch (SecurityException e3) {
            e = e3;
            StringBuffer stringBuffer22 = new StringBuffer("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
            stringBuffer22.append(e.getMessage());
            logDiagnostic(stringBuffer22.toString());
            return z;
        } catch (LinkageError e4) {
            e = e4;
            StringBuffer stringBuffer32 = new StringBuffer("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
            stringBuffer32.append(e.getMessage());
            logDiagnostic(stringBuffer32.toString());
            return z;
        } catch (ClassNotFoundException unused2) {
            logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            return z;
        }
    }

    private static void logClassLoaderEnvironment(Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                StringBuffer stringBuffer = new StringBuffer("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(System.getProperty("java.ext.dir"));
                logDiagnostic(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(System.getProperty("java.class.path"));
                logDiagnostic(stringBuffer2.toString());
            } catch (SecurityException unused) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoader = getClassLoader(cls);
                StringBuffer stringBuffer3 = new StringBuffer("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(objectId(classLoader));
                logDiagnostic(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                logHierarchy(stringBuffer4.toString(), classLoader);
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                logDiagnostic(stringBuffer5.toString());
            }
        }
    }

    private static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                nullClassLoaderFactory = logFactory;
                return;
            }
            factories.put(classLoader, logFactory);
        }
    }

    private static InputStream getResourceAsStream(final ClassLoader classLoader, final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                if (classLoader != null) {
                    return classLoader.getResourceAsStream(str);
                }
                return ClassLoader.getSystemResourceAsStream(str);
            }
        });
    }

    private static Enumeration getResources(final ClassLoader classLoader, final String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                try {
                    if (classLoader != null) {
                        return classLoader.getResources(str);
                    }
                    return ClassLoader.getSystemResources(str);
                } catch (IOException e) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        StringBuffer stringBuffer = new StringBuffer("Exception while trying to find configuration file ");
                        stringBuffer.append(str);
                        stringBuffer.append(":");
                        stringBuffer.append(e.getMessage());
                        LogFactory.logDiagnostic(stringBuffer.toString());
                    }
                    return null;
                } catch (NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    private static String getSystemProperty(final String str, final String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return System.getProperty(str, str2);
            }
        });
    }

    private static void logHierarchy(String str, ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                String obj = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(objectId(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(obj);
                stringBuffer.append("'");
                logDiagnostic(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    logDiagnostic(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                logDiagnostic(stringBuffer4.toString());
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00aa */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137 A[Catch:{ Exception -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0168 A[Catch:{ Exception -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0193 A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.Object createFactory(java.lang.String r5, java.lang.ClassLoader r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x018d
            java.lang.Class r1 = r6.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x0160, NoClassDefFoundError -> 0x012f, ClassCastException -> 0x00aa }
            java.lang.Class r0 = class$org$apache$commons$logging$LogFactory     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "org.apache.commons.logging.LogFactory"
            java.lang.Class r0 = class$(r0)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            class$org$apache$commons$logging$LogFactory = r0     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            goto L_0x0016
        L_0x0014:
            java.lang.Class r0 = class$org$apache$commons$logging$LogFactory     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
        L_0x0016:
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            if (r0 == 0) goto L_0x0044
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            if (r0 == 0) goto L_0x0094
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = "Loaded class "
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = r1.getName()     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = " from classloader "
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = objectId(r6)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            logDiagnostic(r0)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            goto L_0x0094
        L_0x0044:
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            if (r0 == 0) goto L_0x0094
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = "Factory class "
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = r1.getName()     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = " loaded from classloader "
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.ClassLoader r2 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = objectId(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = " does not extend '"
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.Class r2 = class$org$apache$commons$logging$LogFactory     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            if (r2 != 0) goto L_0x007a
            java.lang.String r2 = "org.apache.commons.logging.LogFactory"
            java.lang.Class r2 = class$(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            class$org$apache$commons$logging$LogFactory = r2     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            goto L_0x007c
        L_0x007a:
            java.lang.Class r2 = class$org$apache$commons$logging$LogFactory     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
        L_0x007c:
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r2 = "' as loaded by this classloader."
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            logDiagnostic(r0)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            java.lang.String r0 = "[BAD CL TREE] "
            logHierarchy(r0, r6)     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
        L_0x0094:
            java.lang.Object r0 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            org.apache.commons.logging.LogFactory r0 = (org.apache.commons.logging.LogFactory) r0     // Catch:{ ClassNotFoundException -> 0x00a3, NoClassDefFoundError -> 0x00a0, ClassCastException -> 0x009e }
            return r0
        L_0x009b:
            r5 = move-exception
            goto L_0x01bb
        L_0x009e:
            r0 = r1
            goto L_0x00aa
        L_0x00a0:
            r0 = move-exception
            goto L_0x0133
        L_0x00a3:
            r0 = move-exception
            goto L_0x0164
        L_0x00a6:
            r5 = move-exception
            r1 = r0
            goto L_0x01bb
        L_0x00aa:
            java.lang.ClassLoader r1 = thisClassLoader     // Catch:{ Exception -> 0x00a6 }
            if (r6 != r1) goto L_0x018d
            boolean r6 = implementsLogFactory(r0)     // Catch:{ Exception -> 0x00a6 }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r2 = "The application has specified that a custom LogFactory implementation should be used but Class '"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00a6 }
            r1.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = "' cannot be converted to '"
            r1.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.Class r5 = class$org$apache$commons$logging$LogFactory     // Catch:{ Exception -> 0x00a6 }
            if (r5 != 0) goto L_0x00ce
            java.lang.String r5 = "org.apache.commons.logging.LogFactory"
            java.lang.Class r5 = class$(r5)     // Catch:{ Exception -> 0x00a6 }
            class$org$apache$commons$logging$LogFactory = r5     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00d0
        L_0x00ce:
            java.lang.Class r5 = class$org$apache$commons$logging$LogFactory     // Catch:{ Exception -> 0x00a6 }
        L_0x00d0:
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x00a6 }
            r1.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = "'. "
            r1.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x00a6 }
            if (r6 == 0) goto L_0x00fe
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00a6 }
            r6.<init>()     // Catch:{ Exception -> 0x00a6 }
            r6.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = "The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. Background can be found in http://commons.apache.org/logging/tech.html. "
            r6.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = "If you have not explicitly specified a custom LogFactory then it is likely that the container has set one without your knowledge. "
            r6.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = "In this case, consider using the commons-logging-adapters.jar file or specifying the standard LogFactory from the command line. "
            r6.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x010f
        L_0x00fe:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00a6 }
            r6.<init>()     // Catch:{ Exception -> 0x00a6 }
            r6.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = "Please check the custom implementation. "
            r6.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00a6 }
        L_0x010f:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00a6 }
            r6.<init>()     // Catch:{ Exception -> 0x00a6 }
            r6.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = "Help can be found @http://commons.apache.org/logging/troubleshooting.html."
            r6.append(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00a6 }
            boolean r6 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x00a6 }
            if (r6 == 0) goto L_0x0129
            logDiagnostic(r5)     // Catch:{ Exception -> 0x00a6 }
        L_0x0129:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x00a6 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00a6 }
            throw r6     // Catch:{ Exception -> 0x00a6 }
        L_0x012f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0133:
            java.lang.ClassLoader r2 = thisClassLoader     // Catch:{ Exception -> 0x009b }
            if (r6 != r2) goto L_0x018c
            boolean r2 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x009b }
            if (r2 == 0) goto L_0x015f
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x009b }
            java.lang.String r3 = "Class '"
            r2.<init>(r3)     // Catch:{ Exception -> 0x009b }
            r2.append(r5)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = "' cannot be loaded via classloader "
            r2.append(r5)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = objectId(r6)     // Catch:{ Exception -> 0x009b }
            r2.append(r5)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = " - it depends on some other class that cannot be found."
            r2.append(r5)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x009b }
            logDiagnostic(r5)     // Catch:{ Exception -> 0x009b }
        L_0x015f:
            throw r0     // Catch:{ Exception -> 0x009b }
        L_0x0160:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0164:
            java.lang.ClassLoader r2 = thisClassLoader     // Catch:{ Exception -> 0x009b }
            if (r6 != r2) goto L_0x018c
            boolean r2 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x009b }
            if (r2 == 0) goto L_0x018b
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x009b }
            java.lang.String r3 = "Unable to locate any class called '"
            r2.<init>(r3)     // Catch:{ Exception -> 0x009b }
            r2.append(r5)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = "' via classloader "
            r2.append(r5)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = objectId(r6)     // Catch:{ Exception -> 0x009b }
            r2.append(r5)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x009b }
            logDiagnostic(r5)     // Catch:{ Exception -> 0x009b }
        L_0x018b:
            throw r0     // Catch:{ Exception -> 0x009b }
        L_0x018c:
            r0 = r1
        L_0x018d:
            boolean r1 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x01ad
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r2 = "Unable to load factory class via classloader "
            r1.<init>(r2)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r6 = objectId(r6)     // Catch:{ Exception -> 0x00a6 }
            r1.append(r6)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r6 = " - trying the classloader associated with this LogFactory."
            r1.append(r6)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x00a6 }
            logDiagnostic(r6)     // Catch:{ Exception -> 0x00a6 }
        L_0x01ad:
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r6 = r5.newInstance()     // Catch:{ Exception -> 0x01b8 }
            org.apache.commons.logging.LogFactory r6 = (org.apache.commons.logging.LogFactory) r6     // Catch:{ Exception -> 0x01b8 }
            return r6
        L_0x01b8:
            r6 = move-exception
            r1 = r5
            r5 = r6
        L_0x01bb:
            boolean r6 = isDiagnosticsEnabled()
            if (r6 == 0) goto L_0x01c6
            java.lang.String r6 = "Unable to create LogFactory instance."
            logDiagnostic(r6)
        L_0x01c6:
            if (r1 == 0) goto L_0x01e5
            java.lang.Class r6 = class$org$apache$commons$logging$LogFactory
            if (r6 != 0) goto L_0x01d5
            java.lang.String r6 = "org.apache.commons.logging.LogFactory"
            java.lang.Class r6 = class$(r6)
            class$org$apache$commons$logging$LogFactory = r6
            goto L_0x01d7
        L_0x01d5:
            java.lang.Class r6 = class$org$apache$commons$logging$LogFactory
        L_0x01d7:
            boolean r6 = r6.isAssignableFrom(r1)
            if (r6 != 0) goto L_0x01e5
            org.apache.commons.logging.LogConfigurationException r6 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r0 = "The chosen LogFactory implementation does not extend LogFactory. Please check your configuration."
            r6.<init>(r0, r5)
            return r6
        L_0x01e5:
            org.apache.commons.logging.LogConfigurationException r6 = new org.apache.commons.logging.LogConfigurationException
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.createFactory(java.lang.String, java.lang.ClassLoader):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.Properties getConfigurationFile(java.lang.ClassLoader r12, java.lang.String r13) {
        /*
            r0 = 0
            java.util.Enumeration r12 = getResources(r12, r13)     // Catch:{ SecurityException -> 0x00ce }
            if (r12 != 0) goto L_0x0008
            return r0
        L_0x0008:
            r1 = 0
            r3 = r0
            r4 = r1
        L_0x000c:
            boolean r6 = r12.hasMoreElements()     // Catch:{ SecurityException -> 0x00cc }
            if (r6 == 0) goto L_0x00da
            java.lang.Object r6 = r12.nextElement()     // Catch:{ SecurityException -> 0x00cc }
            java.net.URL r6 = (java.net.URL) r6     // Catch:{ SecurityException -> 0x00cc }
            java.util.Properties r7 = getProperties(r6)     // Catch:{ SecurityException -> 0x00cc }
            if (r7 == 0) goto L_0x000c
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "priority"
            java.lang.String r0 = r7.getProperty(r0)     // Catch:{ SecurityException -> 0x0051 }
            if (r0 == 0) goto L_0x002e
            double r3 = java.lang.Double.parseDouble(r0)     // Catch:{ SecurityException -> 0x0051 }
            r4 = r3
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x0051 }
            if (r0 == 0) goto L_0x004e
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x0051 }
            java.lang.String r3 = "[LOOKUP] Properties file found at '"
            r0.<init>(r3)     // Catch:{ SecurityException -> 0x0051 }
            r0.append(r6)     // Catch:{ SecurityException -> 0x0051 }
            java.lang.String r3 = "' with priority "
            r0.append(r3)     // Catch:{ SecurityException -> 0x0051 }
            r0.append(r4)     // Catch:{ SecurityException -> 0x0051 }
            java.lang.String r0 = r0.toString()     // Catch:{ SecurityException -> 0x0051 }
            logDiagnostic(r0)     // Catch:{ SecurityException -> 0x0051 }
        L_0x004e:
            r3 = r6
            r0 = r7
            goto L_0x000c
        L_0x0051:
            r3 = r6
            r0 = r7
            goto L_0x00cf
        L_0x0055:
            java.lang.String r8 = "priority"
            java.lang.String r8 = r7.getProperty(r8)     // Catch:{ SecurityException -> 0x00cc }
            if (r8 == 0) goto L_0x0062
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ SecurityException -> 0x00cc }
            goto L_0x0063
        L_0x0062:
            r8 = r1
        L_0x0063:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x009b
            boolean r10 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00cc }
            if (r10 == 0) goto L_0x0096
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r11 = "[LOOKUP] Properties file at '"
            r10.<init>(r11)     // Catch:{ SecurityException -> 0x00cc }
            r10.append(r6)     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r11 = "' with priority "
            r10.append(r11)     // Catch:{ SecurityException -> 0x00cc }
            r10.append(r8)     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r11 = " overrides file at '"
            r10.append(r11)     // Catch:{ SecurityException -> 0x00cc }
            r10.append(r3)     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r11 = "' with priority "
            r10.append(r11)     // Catch:{ SecurityException -> 0x00cc }
            r10.append(r4)     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r4 = r10.toString()     // Catch:{ SecurityException -> 0x00cc }
            logDiagnostic(r4)     // Catch:{ SecurityException -> 0x00cc }
        L_0x0096:
            r3 = r6
            r0 = r7
            r4 = r8
            goto L_0x000c
        L_0x009b:
            boolean r7 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x00cc }
            if (r7 == 0) goto L_0x000c
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r10 = "[LOOKUP] Properties file at '"
            r7.<init>(r10)     // Catch:{ SecurityException -> 0x00cc }
            r7.append(r6)     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r6 = "' with priority "
            r7.append(r6)     // Catch:{ SecurityException -> 0x00cc }
            r7.append(r8)     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r6 = " does not override file at '"
            r7.append(r6)     // Catch:{ SecurityException -> 0x00cc }
            r7.append(r3)     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r6 = "' with priority "
            r7.append(r6)     // Catch:{ SecurityException -> 0x00cc }
            r7.append(r4)     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r6 = r7.toString()     // Catch:{ SecurityException -> 0x00cc }
            logDiagnostic(r6)     // Catch:{ SecurityException -> 0x00cc }
            goto L_0x000c
        L_0x00cc:
            goto L_0x00cf
        L_0x00ce:
            r3 = r0
        L_0x00cf:
            boolean r12 = isDiagnosticsEnabled()
            if (r12 == 0) goto L_0x00da
            java.lang.String r12 = "SecurityException thrown while trying to find/read config files."
            logDiagnostic(r12)
        L_0x00da:
            boolean r12 = isDiagnosticsEnabled()
            if (r12 == 0) goto L_0x0117
            if (r0 != 0) goto L_0x00f9
            java.lang.StringBuffer r12 = new java.lang.StringBuffer
            java.lang.String r1 = "[LOOKUP] No properties file of name '"
            r12.<init>(r1)
            r12.append(r13)
            java.lang.String r13 = "' found."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            logDiagnostic(r12)
            goto L_0x0117
        L_0x00f9:
            java.lang.StringBuffer r12 = new java.lang.StringBuffer
            java.lang.String r1 = "[LOOKUP] Properties file of name '"
            r12.<init>(r1)
            r12.append(r13)
            java.lang.String r13 = "' found at '"
            r12.append(r13)
            r12.append(r3)
            r13 = 34
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            logDiagnostic(r12)
        L_0x0117:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getConfigurationFile(java.lang.ClassLoader, java.lang.String):java.util.Properties");
    }

    protected static LogFactory newFactory(final String str, final ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return LogFactory.createFactory(str, classLoader);
            }
        });
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer("An error occurred while loading the factory class:");
                stringBuffer.append(logConfigurationException.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer2 = new StringBuffer("Created object ");
            stringBuffer2.append(objectId(doPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(objectId(classLoader2));
            logDiagnostic(stringBuffer2.toString());
        }
        return (LogFactory) doPrivileged;
    }
}
