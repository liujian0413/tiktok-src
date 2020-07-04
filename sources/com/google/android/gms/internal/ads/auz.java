package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

public final class auz {
    /* renamed from: a */
    static void m47348a(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger b = m47350b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(b) != -1) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(b) != -1) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(b).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(b))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: a */
    static void m47347a(ECPublicKey eCPublicKey) throws GeneralSecurityException {
        m47348a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    /* renamed from: b */
    private static BigInteger m47350b(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: a */
    public static int m47341a(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (m47350b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    /* renamed from: a */
    private static ECParameterSpec m47346a(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* renamed from: a */
    public static ECParameterSpec m47345a(zzcag zzcag) throws NoSuchAlgorithmException {
        switch (ava.f41090b[zzcag.ordinal()]) {
            case 1:
                return m47346a("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
            case 2:
                return m47346a("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
            case 3:
                return m47346a("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
            default:
                String valueOf = String.valueOf(zzcag);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("curve not implemented:");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
        }
    }

    /* renamed from: a */
    public static ECPublicKey m47344a(zzcag zzcag, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec a = m47345a(zzcag);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m47348a(eCPoint, a.getCurve());
        return (ECPublicKey) ((KeyFactory) avc.f41100g.mo40070a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, a));
    }

    /* renamed from: a */
    public static ECPrivateKey m47343a(zzcag zzcag, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) ((KeyFactory) avc.f41100g.mo40070a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m47345a(zzcag)));
    }

    /* renamed from: a */
    public static KeyPair m47342a(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) avc.f41099f.mo40070a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* renamed from: a */
    public static byte[] m47349a(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        BigInteger bigInteger;
        m47348a(eCPoint, eCPrivateKey.getParams().getCurve());
        ECParameterSpec params = eCPrivateKey.getParams();
        params.getCurve();
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, params));
        KeyAgreement keyAgreement = (KeyAgreement) avc.f41098e.mo40070a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger2 = new BigInteger(1, generateSecret);
            if (bigInteger2.signum() == -1 || bigInteger2.compareTo(m47350b(curve)) != -1) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger b = m47350b(curve);
            BigInteger a = curve.getA();
            BigInteger mod = bigInteger2.multiply(bigInteger2).add(a).multiply(bigInteger2).add(curve.getB()).mod(b);
            if (b.signum() == 1) {
                BigInteger mod2 = mod.mod(b);
                BigInteger bigInteger3 = null;
                if (mod2.equals(BigInteger.ZERO)) {
                    bigInteger = BigInteger.ZERO;
                } else {
                    if (b.testBit(0) && b.testBit(1)) {
                        bigInteger3 = mod2.modPow(b.add(BigInteger.ONE).shiftRight(2), b);
                    } else if (b.testBit(0) && !b.testBit(1)) {
                        bigInteger = BigInteger.ONE;
                        BigInteger shiftRight = b.subtract(BigInteger.ONE).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger.multiply(bigInteger).subtract(mod2).mod(b);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, b);
                            if (modPow.add(BigInteger.ONE).equals(b)) {
                                BigInteger shiftRight2 = b.add(BigInteger.ONE).shiftRight(1);
                                BigInteger bigInteger4 = BigInteger.ONE;
                                BigInteger bigInteger5 = bigInteger;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                    bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(b).multiply(mod3)).mod(b);
                                    bigInteger4 = multiply.add(multiply).mod(b);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod4 = bigInteger5.multiply(bigInteger).add(bigInteger4.multiply(mod3)).mod(b);
                                        bigInteger4 = bigInteger.multiply(bigInteger4).add(bigInteger5).mod(b);
                                        bigInteger5 = mod4;
                                    }
                                }
                                bigInteger3 = bigInteger5;
                            } else if (modPow.equals(BigInteger.ONE)) {
                                bigInteger = bigInteger.add(BigInteger.ONE);
                                i++;
                                if (i == 128) {
                                    if (!b.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                    if (bigInteger != null) {
                        if (bigInteger.multiply(bigInteger).mod(b).compareTo(mod2) != 0) {
                            throw new GeneralSecurityException("Could not find a modular square root");
                        }
                    }
                }
                if (true != bigInteger.testBit(0)) {
                    b.subtract(bigInteger).mod(b);
                }
                return generateSecret;
            }
            throw new InvalidAlgorithmParameterException("p must be positive");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e.toString());
        }
    }
}
