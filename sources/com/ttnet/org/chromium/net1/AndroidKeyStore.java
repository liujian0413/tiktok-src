package com.ttnet.org.chromium.net1;

import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;

@JNINamespace("net::android")
public class AndroidKeyStore {
    private static long getOpenSSLHandleForPrivateKey(PrivateKey privateKey) {
        Object openSSLKeyForPrivateKey = getOpenSSLKeyForPrivateKey(privateKey);
        if (openSSLKeyForPrivateKey == null) {
            return 0;
        }
        try {
            Method declaredMethod = openSSLKeyForPrivateKey.getClass().getDeclaredMethod("getPkeyContext", new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                long longValue = ((Number) declaredMethod.invoke(openSSLKeyForPrivateKey, new Object[0])).longValue();
                declaredMethod.setAccessible(false);
                if (longValue == 0) {
                    Log.m22891e("AndroidKeyStore", "getPkeyContext() returned null", new Object[0]);
                }
                return longValue;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Exception while trying to retrieve system EVP_PKEY handle: ");
                sb.append(e);
                Log.m22891e("AndroidKeyStore", sb.toString(), new Object[0]);
                return 0;
            } catch (Throwable th) {
                declaredMethod.setAccessible(false);
                throw th;
            }
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("No getPkeyContext() method on OpenSSLKey member:");
            sb2.append(e2);
            Log.m22891e("AndroidKeyStore", sb2.toString(), new Object[0]);
            return 0;
        }
    }

    private static Object getOpenSSLEngineForPrivateKey(PrivateKey privateKey) {
        try {
            Class cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLEngine");
            Object openSSLKeyForPrivateKey = getOpenSSLKeyForPrivateKey(privateKey);
            if (openSSLKeyForPrivateKey == null) {
                return null;
            }
            try {
                Method declaredMethod = openSSLKeyForPrivateKey.getClass().getDeclaredMethod("getEngine", new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(openSSLKeyForPrivateKey, new Object[0]);
                    declaredMethod.setAccessible(false);
                    if (invoke == null) {
                        Log.m22891e("AndroidKeyStore", "getEngine() returned null", new Object[0]);
                    }
                    if (cls.isInstance(invoke)) {
                        return invoke;
                    }
                    StringBuilder sb = new StringBuilder("Engine is not an OpenSSLEngine instance, its class name is:");
                    sb.append(invoke.getClass().getCanonicalName());
                    Log.m22891e("AndroidKeyStore", sb.toString(), new Object[0]);
                    return null;
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder("Exception while trying to retrieve OpenSSLEngine object: ");
                    sb2.append(e);
                    Log.m22891e("AndroidKeyStore", sb2.toString(), new Object[0]);
                    return null;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                    throw th;
                }
            } catch (Exception e2) {
                StringBuilder sb3 = new StringBuilder("No getEngine() method on OpenSSLKey member:");
                sb3.append(e2);
                Log.m22891e("AndroidKeyStore", sb3.toString(), new Object[0]);
                return null;
            }
        } catch (Exception e3) {
            StringBuilder sb4 = new StringBuilder("Cannot find system OpenSSLEngine class: ");
            sb4.append(e3);
            Log.m22891e("AndroidKeyStore", sb4.toString(), new Object[0]);
            return null;
        }
    }

    private static Object getOpenSSLKeyForPrivateKey(PrivateKey privateKey) {
        Method declaredMethod;
        if (privateKey == null) {
            Log.m22891e("AndroidKeyStore", "privateKey == null", new Object[0]);
            return null;
        } else if (!(privateKey instanceof RSAPrivateKey)) {
            Log.m22891e("AndroidKeyStore", "does not implement RSAPrivateKey", new Object[0]);
            return null;
        } else {
            try {
                Class cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLRSAPrivateKey");
                if (!cls.isInstance(privateKey)) {
                    StringBuilder sb = new StringBuilder("Private key is not an OpenSSLRSAPrivateKey instance, its class name is:");
                    sb.append(privateKey.getClass().getCanonicalName());
                    Log.m22891e("AndroidKeyStore", sb.toString(), new Object[0]);
                    return null;
                }
                try {
                    declaredMethod = cls.getDeclaredMethod("getOpenSSLKey", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(privateKey, new Object[0]);
                    declaredMethod.setAccessible(false);
                    if (invoke != null) {
                        return invoke;
                    }
                    Log.m22891e("AndroidKeyStore", "getOpenSSLKey() returned null", new Object[0]);
                    return null;
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder("Exception while trying to retrieve system EVP_PKEY handle: ");
                    sb2.append(e);
                    Log.m22891e("AndroidKeyStore", sb2.toString(), new Object[0]);
                    return null;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                    throw th;
                }
            } catch (Exception e2) {
                StringBuilder sb3 = new StringBuilder("Cannot find system OpenSSLRSAPrivateKey class: ");
                sb3.append(e2);
                Log.m22891e("AndroidKeyStore", sb3.toString(), new Object[0]);
                return null;
            }
        }
    }

    private static byte[] rawSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        Signature signature;
        try {
            String algorithm = privateKey.getAlgorithm();
            if ("RSA".equalsIgnoreCase(algorithm)) {
                signature = Signature.getInstance("NONEwithRSA");
            } else {
                if ("EC".equalsIgnoreCase(algorithm)) {
                    signature = Signature.getInstance("NONEwithECDSA");
                }
                signature = null;
            }
        } catch (NoSuchAlgorithmException unused) {
        }
        if (signature == null) {
            StringBuilder sb = new StringBuilder("Unsupported private key algorithm: ");
            sb.append(privateKey.getAlgorithm());
            Log.m22891e("AndroidKeyStore", sb.toString(), new Object[0]);
            return null;
        }
        try {
            signature.initSign(privateKey);
            signature.update(bArr);
            return signature.sign();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Exception while signing message with ");
            sb2.append(privateKey.getAlgorithm());
            sb2.append(" private key: ");
            sb2.append(e);
            Log.m22891e("AndroidKeyStore", sb2.toString(), new Object[0]);
            return null;
        }
    }
}
