package com.bytedance.frameworks.baselib.network.http.impl;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableHttpCookie implements Serializable {
    private static final String TAG = "SerializableHttpCookie";
    private static final long serialVersionUID = 6374381323722046732L;
    private transient C10163e cookie;
    private long whenCreated = System.currentTimeMillis();

    public C10163e getHttpCookie() {
        return this.cookie;
    }

    private boolean getHttpOnly() {
        return this.cookie.f27681j;
    }

    public Long getWhenCreated() {
        return Long.valueOf(this.whenCreated);
    }

    public int hashCode() {
        return this.cookie.hashCode();
    }

    public String encode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            return byteArrayToHexString(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean hasExpired() {
        long j = this.cookie.f27676e;
        if (j != -1 && (System.currentTimeMillis() - this.whenCreated) / 1000 > j) {
            return true;
        }
        return false;
    }

    private void setHttpOnly(boolean z) {
        this.cookie.f27681j = z;
    }

    public SerializableHttpCookie(C10163e eVar) {
        this.cookie = eVar;
    }

    public static SerializableHttpCookie decode(String str) {
        try {
            return (SerializableHttpCookie) new ObjectInputStream(new ByteArrayInputStream(hexStringToByteArray(str))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10163e) {
            return this.cookie.equals(obj);
        }
        if (obj instanceof SerializableHttpCookie) {
            return this.cookie.equals(((SerializableHttpCookie) obj).cookie);
        }
        return false;
    }

    private String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            byte b2 = b & 255;
            if (b2 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(b2));
        }
        return sb.toString();
    }

    private static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.cookie = new C10163e((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.cookie.f27672a = (String) objectInputStream.readObject();
        this.cookie.f27673b = (String) objectInputStream.readObject();
        this.cookie.mo24839b((String) objectInputStream.readObject());
        this.cookie.f27676e = objectInputStream.readLong();
        this.cookie.f27678g = (String) objectInputStream.readObject();
        this.cookie.f27679h = (String) objectInputStream.readObject();
        this.cookie.mo24836a(objectInputStream.readInt());
        this.cookie.f27680i = objectInputStream.readBoolean();
        this.cookie.f27674c = objectInputStream.readBoolean();
        setHttpOnly(objectInputStream.readBoolean());
        this.whenCreated = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.cookie.f27677f);
        objectOutputStream.writeObject(this.cookie.f27682k);
        objectOutputStream.writeObject(this.cookie.f27672a);
        objectOutputStream.writeObject(this.cookie.f27673b);
        objectOutputStream.writeObject(this.cookie.f27675d);
        objectOutputStream.writeLong(this.cookie.f27676e);
        objectOutputStream.writeObject(this.cookie.f27678g);
        objectOutputStream.writeObject(this.cookie.f27679h);
        objectOutputStream.writeInt(this.cookie.f27683l);
        objectOutputStream.writeBoolean(this.cookie.f27680i);
        objectOutputStream.writeBoolean(this.cookie.f27674c);
        objectOutputStream.writeBoolean(getHttpOnly());
        objectOutputStream.writeLong(this.whenCreated);
    }

    public static int getEffectivePort(String str, int i) {
        if (i != -1) {
            return i;
        }
        if (WebKitApi.SCHEME_HTTP.equalsIgnoreCase(str)) {
            return 80;
        }
        if (WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(str)) {
            return 443;
        }
        return -1;
    }
}
