package net.jpountz.util;

import java.nio.ByteOrder;

public enum Utils {
    ;
    
    public static final ByteOrder NATIVE_BYTE_ORDER = null;
    private static final boolean unalignedAccessAllowed = false;

    public static boolean isUnalignedAccessAllowed() {
        return unalignedAccessAllowed;
    }

    static {
        boolean z;
        NATIVE_BYTE_ORDER = ByteOrder.nativeOrder();
        String property = System.getProperty("os.arch");
        if (property.equals("i386") || property.equals("x86") || property.equals("amd64") || property.equals("x86_64") || property.equals("aarch64") || property.equals("ppc64le")) {
            z = true;
        }
        unalignedAccessAllowed = z;
    }
}
