package net.jpountz.lz4;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;

public final class LZ4Factory {
    private static LZ4Factory JAVA_SAFE_INSTANCE;
    private static LZ4Factory JAVA_UNSAFE_INSTANCE;
    private static LZ4Factory NATIVE_INSTANCE;
    private final LZ4Compressor fastCompressor;
    private final LZ4FastDecompressor fastDecompressor;
    private final LZ4Compressor highCompressor;
    private final LZ4Compressor[] highCompressors = new LZ4Compressor[18];
    private final String impl;
    private final LZ4SafeDecompressor safeDecompressor;

    public final LZ4Compressor fastCompressor() {
        return this.fastCompressor;
    }

    public final LZ4FastDecompressor fastDecompressor() {
        return this.fastDecompressor;
    }

    public final LZ4Compressor highCompressor() {
        return this.highCompressor;
    }

    public final LZ4SafeDecompressor safeDecompressor() {
        return this.safeDecompressor;
    }

    public final LZ4Decompressor decompressor() {
        return fastDecompressor();
    }

    public final LZ4UnknownSizeDecompressor unknownSizeDecompressor() {
        return safeDecompressor();
    }

    public static LZ4Factory fastestJavaInstance() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable unused) {
            return safeInstance();
        }
    }

    public static synchronized LZ4Factory nativeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
            lZ4Factory = NATIVE_INSTANCE;
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory safeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
            lZ4Factory = JAVA_SAFE_INSTANCE;
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory unsafeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
            lZ4Factory = JAVA_UNSAFE_INSTANCE;
        }
        return lZ4Factory;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(":");
        sb.append(this.impl);
        return sb.toString();
    }

    public static LZ4Factory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    private static LZ4Factory instance(String str) {
        try {
            return new LZ4Factory(str);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public final LZ4Compressor highCompressor(int i) {
        if (i > 17) {
            i = 17;
        } else if (i <= 0) {
            i = 9;
        }
        return this.highCompressors[i];
    }

    private static <T> T classInstance(String str) throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        ClassLoader classLoader = LZ4Factory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static void main(String[] strArr) {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("Fastest instance is ");
        sb.append(fastestInstance());
        printStream.println(sb.toString());
        PrintStream printStream2 = System.out;
        StringBuilder sb2 = new StringBuilder("Fastest Java instance is ");
        sb2.append(fastestJavaInstance());
        printStream2.println(sb2.toString());
    }

    private LZ4Factory(String str) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        String str2 = str;
        this.impl = str2;
        StringBuilder sb = new StringBuilder("net.jpountz.lz4.LZ4");
        sb.append(str2);
        sb.append("Compressor");
        this.fastCompressor = (LZ4Compressor) classInstance(sb.toString());
        StringBuilder sb2 = new StringBuilder("net.jpountz.lz4.LZ4HC");
        sb2.append(str2);
        sb2.append("Compressor");
        this.highCompressor = (LZ4Compressor) classInstance(sb2.toString());
        StringBuilder sb3 = new StringBuilder("net.jpountz.lz4.LZ4");
        sb3.append(str2);
        sb3.append("FastDecompressor");
        this.fastDecompressor = (LZ4FastDecompressor) classInstance(sb3.toString());
        StringBuilder sb4 = new StringBuilder("net.jpountz.lz4.LZ4");
        sb4.append(str2);
        sb4.append("SafeDecompressor");
        this.safeDecompressor = (LZ4SafeDecompressor) classInstance(sb4.toString());
        Constructor declaredConstructor = this.highCompressor.getClass().getDeclaredConstructor(new Class[]{Integer.TYPE});
        this.highCompressors[9] = this.highCompressor;
        for (int i = 1; i <= 17; i++) {
            if (i != 9) {
                this.highCompressors[i] = (LZ4Compressor) declaredConstructor.newInstance(new Object[]{Integer.valueOf(i)});
            }
        }
        byte[] bArr = {97, 98, 99, 100, 32, 32, 32, 32, 32, 32, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106};
        for (LZ4Compressor lZ4Compressor : Arrays.asList(new LZ4Compressor[]{this.fastCompressor, this.highCompressor})) {
            int maxCompressedLength = lZ4Compressor.maxCompressedLength(20);
            byte[] bArr2 = new byte[maxCompressedLength];
            int compress = lZ4Compressor.compress(bArr, 0, 20, bArr2, 0, maxCompressedLength);
            byte[] bArr3 = new byte[20];
            this.fastDecompressor.decompress(bArr2, 0, bArr3, 0, 20);
            if (Arrays.equals(bArr, bArr3)) {
                Arrays.fill(bArr3, 0);
                if (this.safeDecompressor.decompress(bArr2, 0, compress, bArr3, 0) == 20) {
                    if (!Arrays.equals(bArr, bArr3)) {
                    }
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
    }
}
