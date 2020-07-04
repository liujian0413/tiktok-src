package android.support.p022v4.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.compat.R$styleable;
import android.support.p022v4.p025c.C0657a;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.p280ss.ttm.player.MediaPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.res.FontResourcesParserCompat */
public final class FontResourcesParserCompat {

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry */
    public static final class FontFamilyFilesResourceEntry implements C0693a {

        /* renamed from: a */
        public final C0694b[] f2650a;

        public FontFamilyFilesResourceEntry(C0694b[] bVarArr) {
            this.f2650a = bVarArr;
        }
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry */
    public static final class ProviderResourceEntry implements C0693a {

        /* renamed from: a */
        public final C0657a f2651a;

        /* renamed from: b */
        public final int f2652b;

        /* renamed from: c */
        public final int f2653c;

        public ProviderResourceEntry(C0657a aVar, int i, int i2) {
            this.f2651a = aVar;
            this.f2653c = i;
            this.f2652b = i2;
        }
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$a */
    public interface C0693a {
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$b */
    public static final class C0694b {

        /* renamed from: a */
        public final String f2654a;

        /* renamed from: b */
        public int f2655b;

        /* renamed from: c */
        public boolean f2656c;

        /* renamed from: d */
        public String f2657d;

        /* renamed from: e */
        public int f2658e;

        /* renamed from: f */
        public int f2659f;

        public C0694b(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2654a = str;
            this.f2655b = i;
            this.f2656c = z;
            this.f2657d = str2;
            this.f2658e = i2;
            this.f2659f = i3;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m2951a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m2952a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* renamed from: a */
    private static int m2948a(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(0);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(0, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    private static C0693a m2953b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m2954c(xmlPullParser, resources);
        }
        m2952a(xmlPullParser);
        return null;
    }

    /* renamed from: a */
    public static C0693a m2949a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m2953b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m2950a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m2948a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m2951a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m2951a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C0694b m2955d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.FontFamilyFont);
        int i = 8;
        if (!obtainAttributes.hasValue(8)) {
            i = 1;
        }
        int i2 = obtainAttributes.getInt(i, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
        int i3 = 6;
        if (!obtainAttributes.hasValue(6)) {
            i3 = 2;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 9;
        if (!obtainAttributes.hasValue(9)) {
            i4 = 3;
        }
        int i5 = 7;
        if (!obtainAttributes.hasValue(7)) {
            i5 = 4;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = 5;
        if (!obtainAttributes.hasValue(5)) {
            i7 = 0;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m2952a(xmlPullParser);
        }
        C0694b bVar = new C0694b(string2, i2, z, string, i6, resourceId);
        return bVar;
    }

    /* renamed from: c */
    private static C0693a m2954c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.FontFamily);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, VETransitionFilterParam.TransitionDuration_DEFAULT);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m2955d(xmlPullParser, resources));
                    } else {
                        m2952a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new FontFamilyFilesResourceEntry((C0694b[]) arrayList.toArray(new C0694b[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m2952a(xmlPullParser);
        }
        return new ProviderResourceEntry(new C0657a(string, string2, string3, m2950a(resources, resourceId)), integer, integer2);
    }
}
