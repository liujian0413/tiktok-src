package com.google.android.gms.internal.ads;

import com.C1642a;
import com.google.android.gms.internal.ads.axi;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class axs<T extends axi> {

    /* renamed from: a */
    private static final Logger f41192a = Logger.getLogger(zzccv.class.getName());

    /* renamed from: b */
    private static String f41193b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    axs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo40278a();

    /* renamed from: a */
    static <T extends axi> T m47689a(Class<T> cls) {
        String str;
        ClassLoader classLoader = axs.class.getClassLoader();
        if (cls.equals(axi.class)) {
            str = f41193b;
        } else if (cls.getPackage().equals(axs.class.getPackage())) {
            str = C1642a.m8034a("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (axi) cls.cast(((axs) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo40278a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(axs.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((axi) cls.cast(((axs) it.next()).mo40278a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f41192a;
                    Level level = Level.SEVERE;
                    String str2 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                    String str3 = "load";
                    String str4 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (axi) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (axi) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
