package com.google.android.play.core.internal;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.aq */
class C17102aq extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f47810a;

    public C17102aq(X509Certificate x509Certificate) {
        this.f47810a = x509Certificate;
    }

    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f47810a.checkValidity();
    }

    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f47810a.checkValidity(date);
    }

    public int getBasicConstraints() {
        return this.f47810a.getBasicConstraints();
    }

    public Set<String> getCriticalExtensionOIDs() {
        return this.f47810a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f47810a.getEncoded();
    }

    public byte[] getExtensionValue(String str) {
        return this.f47810a.getExtensionValue(str);
    }

    public Principal getIssuerDN() {
        return this.f47810a.getIssuerDN();
    }

    public boolean[] getIssuerUniqueID() {
        return this.f47810a.getIssuerUniqueID();
    }

    public boolean[] getKeyUsage() {
        return this.f47810a.getKeyUsage();
    }

    public Set<String> getNonCriticalExtensionOIDs() {
        return this.f47810a.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.f47810a.getNotAfter();
    }

    public Date getNotBefore() {
        return this.f47810a.getNotBefore();
    }

    public PublicKey getPublicKey() {
        return this.f47810a.getPublicKey();
    }

    public BigInteger getSerialNumber() {
        return this.f47810a.getSerialNumber();
    }

    public String getSigAlgName() {
        return this.f47810a.getSigAlgName();
    }

    public String getSigAlgOID() {
        return this.f47810a.getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return this.f47810a.getSigAlgParams();
    }

    public byte[] getSignature() {
        return this.f47810a.getSignature();
    }

    public Principal getSubjectDN() {
        return this.f47810a.getSubjectDN();
    }

    public boolean[] getSubjectUniqueID() {
        return this.f47810a.getSubjectUniqueID();
    }

    public byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f47810a.getTBSCertificate();
    }

    public int getVersion() {
        return this.f47810a.getVersion();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.f47810a.hasUnsupportedCriticalExtension();
    }

    public String toString() {
        return this.f47810a.toString();
    }

    public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f47810a.verify(publicKey);
    }

    public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f47810a.verify(publicKey, str);
    }
}
