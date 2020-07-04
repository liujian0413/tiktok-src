package com.ttnet.org.chromium.net;

import android.content.Context;
import com.ttnet.org.chromium.net.CronetEngine.Builder;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class CronetProvider {
    private static final String TAG = "CronetProvider";
    protected final Context mContext;

    private static void logReflectiveOperationException(String str, boolean z, Exception exc) {
    }

    public abstract Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public String toString() {
        StringBuilder sb = new StringBuilder("[class=");
        sb.append(getClass().getName());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", version=");
        sb.append(getVersion());
        sb.append(", enabled=");
        sb.append(isEnabled());
        sb.append("]");
        return sb.toString();
    }

    protected CronetProvider(Context context) {
        if (context != null) {
            this.mContext = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    public static List<CronetProvider> getAllProviders(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderImplByClassName(context, "com.google.android.gms.net.PlayServicesCronetProvider", linkedHashSet, false);
        addCronetProviderImplByClassName(context, "com.google.android.gms.net.GmsCoreCronetProvider", linkedHashSet, false);
        addCronetProviderImplByClassName(context, "com.ttnet.org.chromium.net.impl.NativeCronetProvider", linkedHashSet, false);
        addCronetProviderImplByClassName(context, "com.ttnet.org.chromium.net.impl.JavaCronetProvider", linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static boolean addCronetProviderFromResourceFile(Context context, Set<CronetProvider> set) {
        int identifier = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
        if (identifier == 0) {
            return false;
        }
        String string = context.getResources().getString(identifier);
        if (string == null || string.equals("com.google.android.gms.net.PlayServicesCronetProvider") || string.equals("com.google.android.gms.net.GmsCoreCronetProvider") || string.equals("com.ttnet.org.chromium.net.impl.JavaCronetProvider") || string.equals("com.ttnet.org.chromium.net.impl.NativeCronetProvider")) {
            return false;
        }
        addCronetProviderImplByClassName(context, string, set, true);
        return true;
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, Set<CronetProvider> set, boolean z) {
        try {
            set.add((CronetProvider) context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
            return true;
        } catch (InstantiationException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (InvocationTargetException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (NoSuchMethodException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (IllegalAccessException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (ClassNotFoundException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }
}
