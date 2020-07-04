package org.apache.http.impl.auth;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.params.AuthParams;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

public class DigestScheme extends RFC2617Scheme {
    private static final char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private String cnonce;
    private boolean complete;
    private int qopVariant;

    public String getSchemeName() {
        return "digest";
    }

    public boolean isConnectionBased() {
        return false;
    }

    private String getCnonce() {
        if (this.cnonce == null) {
            this.cnonce = createCnonce();
        }
        return this.cnonce;
    }

    private String getQopVariantString() {
        if (this.qopVariant == 1) {
            return "auth-int";
        }
        return "auth";
    }

    public static String createCnonce() {
        return encode(createMessageDigest("MD5").digest(EncodingUtils.getAsciiBytes(Long.toString(System.currentTimeMillis()))));
    }

    public boolean isComplete() {
        if ("true".equalsIgnoreCase(getParameter("stale"))) {
            return false;
        }
        return this.complete;
    }

    private static MessageDigest createMessageDigest(String str) throws UnsupportedDigestAlgorithmException {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("Unsupported algorithm in HTTP Digest authentication: ");
            sb.append(str);
            throw new UnsupportedDigestAlgorithmException(sb.toString());
        }
    }

    private static String encode(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i] & 15;
            int i2 = i * 2;
            cArr[i2] = HEXADECIMAL[(bArr[i] & 240) >> 4];
            cArr[i2 + 1] = HEXADECIMAL[b];
        }
        return new String(cArr);
    }

    public void processChallenge(Header header) throws MalformedChallengeException {
        super.processChallenge(header);
        if (getParameter("realm") == null) {
            throw new MalformedChallengeException("missing realm in challange");
        } else if (getParameter("nonce") != null) {
            boolean z = false;
            String parameter = getParameter("qop");
            if (parameter != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(parameter, ",");
                while (true) {
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String trim = stringTokenizer.nextToken().trim();
                    if (trim.equals("auth")) {
                        this.qopVariant = 2;
                        break;
                    } else if (trim.equals("auth-int")) {
                        this.qopVariant = 1;
                    } else {
                        z = true;
                    }
                }
            }
            if (!z || this.qopVariant != 0) {
                this.cnonce = null;
                this.complete = true;
                return;
            }
            throw new MalformedChallengeException("None of the qop methods is supported");
        } else {
            throw new MalformedChallengeException("missing nonce in challange");
        }
    }

    private String createDigest(Credentials credentials) throws AuthenticationException {
        String str;
        String str2;
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("methodname");
        String parameter5 = getParameter("algorithm");
        if (parameter == null) {
            throw new IllegalStateException("URI may not be null");
        } else if (parameter2 == null) {
            throw new IllegalStateException("Realm may not be null");
        } else if (parameter3 != null) {
            if (parameter5 == null) {
                parameter5 = "MD5";
            }
            String parameter6 = getParameter("charset");
            if (parameter6 == null) {
                parameter6 = "ISO-8859-1";
            }
            if (this.qopVariant != 1) {
                if (parameter5.equalsIgnoreCase("MD5-sess")) {
                    str = "MD5";
                } else {
                    str = parameter5;
                }
                MessageDigest createMessageDigest = createMessageDigest(str);
                String name = credentials.getUserPrincipal().getName();
                String password = credentials.getPassword();
                StringBuilder sb = new StringBuilder(name.length() + parameter2.length() + password.length() + 2);
                sb.append(name);
                sb.append(':');
                sb.append(parameter2);
                sb.append(':');
                sb.append(password);
                String sb2 = sb.toString();
                if (parameter5.equalsIgnoreCase("MD5-sess")) {
                    String cnonce2 = getCnonce();
                    String encode = encode(createMessageDigest.digest(EncodingUtils.getBytes(sb2, parameter6)));
                    StringBuilder sb3 = new StringBuilder(encode.length() + parameter3.length() + cnonce2.length() + 2);
                    sb3.append(encode);
                    sb3.append(':');
                    sb3.append(parameter3);
                    sb3.append(':');
                    sb3.append(cnonce2);
                    sb2 = sb3.toString();
                }
                String encode2 = encode(createMessageDigest.digest(EncodingUtils.getBytes(sb2, parameter6)));
                String str3 = null;
                if (this.qopVariant != 1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(parameter4);
                    sb4.append(':');
                    sb4.append(parameter);
                    str3 = sb4.toString();
                }
                String encode3 = encode(createMessageDigest.digest(EncodingUtils.getAsciiBytes(str3)));
                if (this.qopVariant == 0) {
                    StringBuilder sb5 = new StringBuilder(encode2.length() + parameter3.length() + encode2.length());
                    sb5.append(encode2);
                    sb5.append(':');
                    sb5.append(parameter3);
                    sb5.append(':');
                    sb5.append(encode3);
                    str2 = sb5.toString();
                } else {
                    String qopVariantString = getQopVariantString();
                    String cnonce3 = getCnonce();
                    StringBuilder sb6 = new StringBuilder(encode2.length() + parameter3.length() + 8 + cnonce3.length() + qopVariantString.length() + encode3.length() + 5);
                    sb6.append(encode2);
                    sb6.append(':');
                    sb6.append(parameter3);
                    sb6.append(':');
                    sb6.append("00000001");
                    sb6.append(':');
                    sb6.append(cnonce3);
                    sb6.append(':');
                    sb6.append(qopVariantString);
                    sb6.append(':');
                    sb6.append(encode3);
                    str2 = sb6.toString();
                }
                return encode(createMessageDigest.digest(EncodingUtils.getAsciiBytes(str2)));
            }
            throw new AuthenticationException("Unsupported qop in HTTP Digest authentication");
        } else {
            throw new IllegalStateException("Nonce may not be null");
        }
    }

    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        if (credentials == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (httpRequest != null) {
            getParameters().put("methodname", httpRequest.getRequestLine().getMethod());
            getParameters().put("uri", httpRequest.getRequestLine().getUri());
            if (getParameter("charset") == null) {
                getParameters().put("charset", AuthParams.getCredentialCharset(httpRequest.getParams()));
            }
            return createDigestHeader(credentials, createDigest(credentials));
        } else {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
    }

    private Header createDigestHeader(Credentials credentials, String str) {
        boolean z;
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        if (isProxy()) {
            charArrayBuffer.append("Proxy-Authorization");
        } else {
            charArrayBuffer.append("Authorization");
        }
        charArrayBuffer.append(": Digest ");
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("opaque");
        String parameter5 = getParameter("algorithm");
        String name = credentials.getUserPrincipal().getName();
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new BasicNameValuePair("username", name));
        arrayList.add(new BasicNameValuePair("realm", parameter2));
        arrayList.add(new BasicNameValuePair("nonce", parameter3));
        arrayList.add(new BasicNameValuePair("uri", parameter));
        arrayList.add(new BasicNameValuePair("response", str));
        if (this.qopVariant != 0) {
            arrayList.add(new BasicNameValuePair("qop", getQopVariantString()));
            arrayList.add(new BasicNameValuePair("nc", "00000001"));
            arrayList.add(new BasicNameValuePair("cnonce", getCnonce()));
        }
        if (parameter5 != null) {
            arrayList.add(new BasicNameValuePair("algorithm", parameter5));
        }
        if (parameter4 != null) {
            arrayList.add(new BasicNameValuePair("opaque", parameter4));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            BasicNameValuePair basicNameValuePair = (BasicNameValuePair) arrayList.get(i);
            if (i > 0) {
                charArrayBuffer.append(", ");
            }
            if ("nc".equals(basicNameValuePair.getName()) || "qop".equals(basicNameValuePair.getName())) {
                z = true;
            } else {
                z = false;
            }
            BasicHeaderValueFormatter.DEFAULT.formatNameValuePair(charArrayBuffer, basicNameValuePair, !z);
        }
        return new BufferedHeader(charArrayBuffer);
    }
}
