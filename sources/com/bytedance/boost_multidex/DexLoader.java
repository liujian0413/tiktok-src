package com.bytedance.boost_multidex;

import android.content.SharedPreferences;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;

abstract class DexLoader {
    ElementConstructor mElementConstructor;

    interface ElementConstructor {
        Object newInstance(File file, Object obj);
    }

    static class ICSElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        ICSElementConstructor(Class<?> cls) {
            this.mConstructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
            this.mConstructor.setAccessible(true);
        }

        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(new Object[]{file, null, obj});
        }
    }

    static class JBMR11ElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        JBMR11ElementConstructor(Class<?> cls) {
            this.mConstructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
            this.mConstructor.setAccessible(true);
        }

        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(new Object[]{file, null, obj});
        }
    }

    static class JBMR2ElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        JBMR2ElementConstructor(Class<?> cls) {
            this.mConstructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
            this.mConstructor.setAccessible(true);
        }

        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(new Object[]{file, Boolean.valueOf(false), null, obj});
        }
    }

    static class KKElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        KKElementConstructor(Class<?> cls) {
            this.mConstructor = Utility.findConstructor(cls, File.class, Boolean.TYPE, File.class, DexFile.class);
            this.mConstructor.setAccessible(true);
        }

        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(new Object[]{file, Boolean.valueOf(false), null, obj});
        }
    }

    static class V14 extends DexLoader {
        private V14() {
            ElementConstructor elementConstructor;
            try {
                Class cls = Class.forName("dalvik.system.DexPathList$Element");
                try {
                    elementConstructor = new ICSElementConstructor(cls);
                } catch (Exception unused) {
                    elementConstructor = null;
                }
                if (elementConstructor == null) {
                    try {
                        elementConstructor = new JBMR11ElementConstructor(cls);
                    } catch (Exception unused2) {
                    }
                }
                if (elementConstructor == null) {
                    try {
                        elementConstructor = new JBMR2ElementConstructor(cls);
                    } catch (Exception unused3) {
                    }
                }
                this.mElementConstructor = elementConstructor;
            } catch (Exception e) {
                Monitor.get().logError("can not find DexPathList$Element", e);
            }
        }
    }

    static class V19 extends DexLoader {
        private V19() {
            try {
                this.mElementConstructor = new KKElementConstructor(Class.forName("dalvik.system.DexPathList$Element"));
            } catch (Throwable th) {
                Monitor.get().logError("fail to get Element constructor", th);
            }
        }
    }

    DexLoader() {
    }

    static DexLoader create(int i) {
        if (i >= 19) {
            return new V19();
        }
        if (i >= 14) {
            return new V14();
        }
        throw new UnsupportedOperationException("only support SDK_INT >= 14, give up when < 14");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[LOOP:0: B:1:0x0006->B:10:0x003e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0080 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object[] makeDexElements(java.util.List<com.bytedance.boost_multidex.DexHolder> r8, android.content.SharedPreferences r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r8.size()
            if (r1 >= r2) goto L_0x0094
            java.lang.Object r2 = r8.get(r1)
            com.bytedance.boost_multidex.DexHolder r2 = (com.bytedance.boost_multidex.DexHolder) r2
        L_0x0012:
            com.bytedance.boost_multidex.DexLoader$ElementConstructor r3 = r7.mElementConstructor
            java.lang.Object r3 = r2.toDexListElement(r3)
        L_0x0018:
            if (r3 != 0) goto L_0x003c
            if (r2 == 0) goto L_0x003c
            com.bytedance.boost_multidex.Monitor r4 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Load faster dex in holder "
            r5.<init>(r6)
            java.lang.String r6 = r2.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.logWarning(r5)
            com.bytedance.boost_multidex.DexHolder r2 = r2.toFasterHolder(r9)
            if (r2 == 0) goto L_0x0018
            goto L_0x0012
        L_0x003c:
            if (r3 == 0) goto L_0x0080
            com.bytedance.boost_multidex.Monitor r4 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Load dex in holder "
            r5.<init>(r6)
            java.lang.String r6 = r2.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.logInfo(r5)
            r8.set(r1, r2)
            r0.add(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.boost_multidex.Result r3 = com.bytedance.boost_multidex.Result.get()
            r3.addDexInfo(r2)
            com.bytedance.boost_multidex.Monitor r3 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Add info: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.logInfo(r2)
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0080:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Fail to load dex, index is "
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0094:
            java.lang.Object[] r8 = r0.toArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.DexLoader.makeDexElements(java.util.List, android.content.SharedPreferences):java.lang.Object[]");
    }

    /* access modifiers changed from: 0000 */
    public void install(ClassLoader classLoader, List<DexHolder> list) {
        Object obj = Utility.findFieldRecursively(classLoader.getClass(), "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            DexHolder dexHolder = (DexHolder) list.get(i);
            arrayList.add(dexHolder.toDexListElement(this.mElementConstructor));
            Monitor monitor = Monitor.get();
            StringBuilder sb = new StringBuilder("Install holder: ");
            sb.append(dexHolder.getClass().getName());
            sb.append(", index ");
            sb.append(i);
            monitor.logInfo(sb.toString());
        }
        Utility.expandFieldArray(obj, "dexElements", arrayList.toArray());
    }

    /* access modifiers changed from: 0000 */
    public void install(ClassLoader classLoader, List<DexHolder> list, SharedPreferences sharedPreferences) {
        Utility.expandFieldArray(Utility.findFieldRecursively(classLoader.getClass(), "pathList").get(classLoader), "dexElements", makeDexElements(list, sharedPreferences));
    }
}
