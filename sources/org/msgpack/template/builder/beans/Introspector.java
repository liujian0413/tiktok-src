package org.msgpack.template.builder.beans;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class Introspector {
    private static String[] searchPath = {"sun.beans.infos"};
    private static Map<Class<?>, StandardBeanInfo> theCache = Collections.synchronizedMap(new WeakHashMap(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));

    public static BeanInfo getBeanInfo(Class<?> cls) throws IntrospectionException {
        StandardBeanInfo standardBeanInfo = (StandardBeanInfo) theCache.get(cls);
        if (standardBeanInfo != null) {
            return standardBeanInfo;
        }
        StandardBeanInfo beanInfoImplAndInit = getBeanInfoImplAndInit(cls, null, 1);
        theCache.put(cls, beanInfoImplAndInit);
        return beanInfoImplAndInit;
    }

    public static String decapitalize(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    private static BeanInfo getExplicitBeanInfo(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append("BeanInfo");
        String sb2 = sb.toString();
        try {
            return loadBeanInfo(sb2, cls);
        } catch (Exception unused) {
            int lastIndexOf = sb2.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                sb2 = sb2.substring(lastIndexOf + 1);
            }
            for (String append : searchPath) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(append);
                sb3.append(ClassUtils.PACKAGE_SEPARATOR);
                sb3.append(sb2);
                try {
                    BeanInfo loadBeanInfo = loadBeanInfo(sb3.toString(), cls);
                    BeanDescriptor beanDescriptor = loadBeanInfo.getBeanDescriptor();
                    if (beanDescriptor != null && cls == beanDescriptor.beanClass) {
                        return loadBeanInfo;
                    }
                } catch (Exception unused2) {
                }
            }
            if (BeanInfo.class.isAssignableFrom(cls)) {
                try {
                    return loadBeanInfo(cls.getName(), cls);
                } catch (Exception unused3) {
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.msgpack.template.builder.beans.BeanInfo loadBeanInfo(java.lang.String r2, java.lang.Class<?> r3) throws java.lang.Exception {
        /*
            r0 = 1
            java.lang.ClassLoader r1 = r3.getClassLoader()     // Catch:{ Exception -> 0x0016 }
            if (r1 == 0) goto L_0x0016
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ Exception -> 0x0016 }
            java.lang.Class r3 = java.lang.Class.forName(r2, r0, r3)     // Catch:{ Exception -> 0x0016 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x0016 }
            org.msgpack.template.builder.beans.BeanInfo r3 = (org.msgpack.template.builder.beans.BeanInfo) r3     // Catch:{ Exception -> 0x0016 }
            return r3
        L_0x0016:
            java.lang.ClassLoader r3 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0025 }
            java.lang.Class r3 = java.lang.Class.forName(r2, r0, r3)     // Catch:{ Exception -> 0x0025 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x0025 }
            org.msgpack.template.builder.beans.BeanInfo r3 = (org.msgpack.template.builder.beans.BeanInfo) r3     // Catch:{ Exception -> 0x0025 }
            return r3
        L_0x0025:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r3 = r3.getContextClassLoader()
            java.lang.Class r2 = java.lang.Class.forName(r2, r0, r3)
            java.lang.Object r2 = r2.newInstance()
            org.msgpack.template.builder.beans.BeanInfo r2 = (org.msgpack.template.builder.beans.BeanInfo) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.Introspector.loadBeanInfo(java.lang.String, java.lang.Class):org.msgpack.template.builder.beans.BeanInfo");
    }

    private static StandardBeanInfo getBeanInfoImplAndInit(Class<?> cls, Class<?> cls2, int i) throws IntrospectionException {
        StandardBeanInfo beanInfoImpl = getBeanInfoImpl(cls, cls2, i);
        beanInfoImpl.init();
        return beanInfoImpl;
    }

    private static StandardBeanInfo getBeanInfoImpl(Class<?> cls, Class<?> cls2, int i) throws IntrospectionException {
        BeanInfo beanInfo;
        if (i == 1) {
            beanInfo = getExplicitBeanInfo(cls);
        } else {
            beanInfo = null;
        }
        StandardBeanInfo standardBeanInfo = new StandardBeanInfo(cls, beanInfo, cls2);
        if (standardBeanInfo.additionalBeanInfo != null) {
            for (int length = standardBeanInfo.additionalBeanInfo.length - 1; length >= 0; length--) {
                standardBeanInfo.mergeBeanInfo(standardBeanInfo.additionalBeanInfo[length], true);
            }
        }
        Class<?> superclass = cls.getSuperclass();
        if (superclass != cls2) {
            if (superclass != null) {
                if (i == 2) {
                    i = 1;
                }
                StandardBeanInfo beanInfoImpl = getBeanInfoImpl(superclass, cls2, i);
                if (beanInfoImpl != null) {
                    standardBeanInfo.mergeBeanInfo(beanInfoImpl, false);
                }
            } else {
                throw new IntrospectionException("Stop class is not super class of bean class");
            }
        }
        return standardBeanInfo;
    }
}
