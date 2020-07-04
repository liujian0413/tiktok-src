package com.p280ss.android.usergrowth;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.ss.android.usergrowth.ApkUtils */
public final class ApkUtils {

    /* renamed from: a */
    public String f116053a;

    /* renamed from: b */
    public String f116054b;

    /* renamed from: c */
    public int f116055c;

    /* renamed from: d */
    public String f116056d;

    /* renamed from: e */
    public AssetManager f116057e;

    /* renamed from: f */
    private Resources f116058f;

    /* renamed from: com.ss.android.usergrowth.ApkUtils$ApkUtilsException */
    public static class ApkUtilsException extends Exception {
        private static final long serialVersionUID = -1169146753281314803L;

        public ApkUtilsException(String str) {
            super(str);
        }

        public ApkUtilsException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    public final void mo107731a() {
        this.f116057e.close();
    }

    /* renamed from: b */
    private Resources m142377b() {
        if (this.f116058f == null) {
            synchronized (this) {
                if (this.f116058f == null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    displayMetrics.setToDefaults();
                    this.f116058f = new Resources(this.f116057e, displayMetrics, null);
                }
            }
        }
        return this.f116058f;
    }

    public ApkUtils(File file) throws ApkUtilsException {
        m142378b(file.getAbsolutePath());
    }

    /* renamed from: a */
    public final CharSequence mo107730a(String str) throws ApkUtilsException {
        return m142377b().getText(m142377b().getIdentifier(str, "string", this.f116054b));
    }

    /* renamed from: a */
    private static void m142376a(XmlPullParser xmlPullParser) throws ApkUtilsException {
        int next;
        do {
            try {
                next = xmlPullParser.next();
                if (next == 1) {
                    throw new ApkUtilsException("No start tag found");
                }
            } catch (XmlPullParserException e) {
                throw new ApkUtilsException((Throwable) e);
            } catch (IOException e2) {
                throw new ApkUtilsException((Throwable) e2);
            }
        } while (next != 2);
    }

    /* renamed from: b */
    private void m142378b(String str) throws ApkUtilsException {
        try {
            this.f116057e = new AssetManager();
            int addAssetPath = this.f116057e.addAssetPath(str);
            if (addAssetPath != 0) {
                try {
                    XmlResourceParser openXmlResourceParser = this.f116057e.openXmlResourceParser(addAssetPath, "AndroidManifest.xml");
                    m142376a((XmlPullParser) openXmlResourceParser);
                    this.f116053a = str;
                    this.f116054b = m142375a(openXmlResourceParser, null, "package");
                    String a = m142375a(openXmlResourceParser, "http://schemas.android.com/apk/res/android", "versionCode");
                    if (!TextUtils.isEmpty(a) && TextUtils.isDigitsOnly(a)) {
                        this.f116055c = Integer.parseInt(a);
                    }
                    this.f116056d = m142375a(openXmlResourceParser, "http://schemas.android.com/apk/res/android", "versionName");
                    openXmlResourceParser.close();
                } catch (IOException e) {
                    throw new ApkUtilsException((Throwable) e);
                }
            } else {
                StringBuilder sb = new StringBuilder("cannot add ");
                sb.append(str);
                sb.append(" to asset manager.");
                throw new ApkUtilsException(sb.toString());
            }
        } catch (Throwable th) {
            throw new ApkUtilsException(th);
        }
    }

    /* renamed from: a */
    private static String m142375a(XmlPullParser xmlPullParser, String str, String str2) throws ApkUtilsException {
        if ("manifest".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(str, str2);
            if (attributeValue == null || attributeValue.length() == 0) {
                return "";
            }
            return attributeValue.intern();
        }
        throw new ApkUtilsException("No <manifest> tag");
    }
}
