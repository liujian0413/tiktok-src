package com.bytedance.keva.adapter.xml;

import android.util.Xml;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class XmlUtils {
    public static final void nextElement(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return;
            }
        } while (next != 1);
    }

    public static final ArrayList readListXml(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (ArrayList) readValueXml(newPullParser, new String[1]);
    }

    public static final HashMap readMapXml(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (HashMap) readValueXml(newPullParser, new String[1]);
    }

    public static final HashSet readSetXml(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (HashSet) readValueXml(newPullParser, new String[1]);
    }

    public static void skipCurrentTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    public static final int parseUnsignedIntAttribute(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int length = charSequence2.length();
        int i = 0;
        int i2 = 16;
        if ('0' == charSequence2.charAt(0)) {
            if (length - 1 == 0) {
                return 0;
            }
            char charAt = charSequence2.charAt(1);
            if ('x' == charAt || 'X' == charAt) {
                i = 2;
                return (int) Long.parseLong(charSequence2.substring(i), i2);
            }
            i2 = 8;
        } else if ('#' != charSequence2.charAt(0)) {
            i2 = 10;
            return (int) Long.parseLong(charSequence2.substring(i), i2);
        }
        i = 1;
        return (int) Long.parseLong(charSequence2.substring(i), i2);
    }

    public static final int convertValueToUnsignedInt(String str, int i) {
        if (str == null) {
            return i;
        }
        return parseUnsignedIntAttribute(str);
    }

    public static final boolean convertValueToBoolean(CharSequence charSequence, boolean z) {
        boolean z2;
        if (charSequence == null) {
            return z;
        }
        if (charSequence.equals("1") || charSequence.equals("true") || charSequence.equals("TRUE")) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public static boolean nextElementWithin(XmlPullParser xmlPullParser, int i) throws IOException, XmlPullParserException {
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1 && (next != 3 || xmlPullParser.getDepth() != i)) {
                if (next == 2 && xmlPullParser.getDepth() == i + 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void writeListXml(List list, OutputStream outputStream) throws XmlPullParserException, IOException {
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(outputStream, "utf-8");
        newSerializer.startDocument(null, Boolean.valueOf(true));
        newSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeListXml(list, null, newSerializer);
        newSerializer.endDocument();
    }

    public static final void writeMapXml(Map map, OutputStream outputStream) throws XmlPullParserException, IOException {
        FastXmlSerializer fastXmlSerializer = new FastXmlSerializer();
        fastXmlSerializer.setOutput(outputStream, "utf-8");
        fastXmlSerializer.startDocument(null, Boolean.valueOf(true));
        fastXmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeMapXml(map, null, fastXmlSerializer);
        fastXmlSerializer.endDocument();
    }

    public static final void beginDocument(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        } else if (!xmlPullParser.getName().equals(str)) {
            StringBuilder sb = new StringBuilder("Unexpected start tag: found ");
            sb.append(xmlPullParser.getName());
            sb.append(", expected ");
            sb.append(str);
            throw new XmlPullParserException(sb.toString());
        }
    }

    public static final int convertValueToInt(CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4;
        if (charSequence == null) {
            return i;
        }
        String charSequence2 = charSequence.toString();
        int length = charSequence2.length();
        int i5 = 10;
        if ('-' == charSequence2.charAt(0)) {
            i3 = 1;
            i2 = -1;
        } else {
            i3 = 0;
            i2 = 1;
        }
        if ('0' != charSequence2.charAt(i3)) {
            if ('#' == charSequence2.charAt(i3)) {
                i4 = i3 + 1;
            }
            return Integer.parseInt(charSequence2.substring(i3), i5) * i2;
        } else if (i3 == length - 1) {
            return 0;
        } else {
            int i6 = i3 + 1;
            char charAt = charSequence2.charAt(i6);
            if ('x' == charAt || 'X' == charAt) {
                i4 = i3 + 2;
            } else {
                i5 = 8;
                i3 = i6;
                return Integer.parseInt(charSequence2.substring(i3), i5) * i2;
            }
        }
        i5 = 16;
        return Integer.parseInt(charSequence2.substring(i3), i5) * i2;
    }

    public static final Object readValueXml(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                StringBuilder sb = new StringBuilder("Unexpected end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            } else if (eventType != 4) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected text: ");
                sb2.append(xmlPullParser.getText());
                throw new XmlPullParserException(sb2.toString());
            }
        }
        return readThisValueXml(xmlPullParser, strArr);
    }

    private static final Object readThisValueXml(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int next;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals(TEVideoRecorder.FACE_BEAUTY_NULL)) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        StringBuilder sb = new StringBuilder("Unexpected end tag in <string>: ");
                        sb.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb.toString());
                    } else if (next2 == 4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(xmlPullParser.getText());
                        str = sb2.toString();
                    } else if (next2 == 2) {
                        StringBuilder sb3 = new StringBuilder("Unexpected start tag in <string>: ");
                        sb3.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb3.toString());
                    }
                }
            } else if (name.equals("int")) {
                obj = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                obj = Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("float")) {
                obj = Float.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                obj = Double.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("boolean")) {
                obj = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("int-array")) {
                xmlPullParser.next();
                int[] readThisIntArrayXml = readThisIntArrayXml(xmlPullParser, "int-array", strArr);
                strArr[0] = attributeValue;
                return readThisIntArrayXml;
            } else if (name.equals("map")) {
                xmlPullParser.next();
                HashMap readThisMapXml = readThisMapXml(xmlPullParser, "map", strArr);
                strArr[0] = attributeValue;
                return readThisMapXml;
            } else if (name.equals("list")) {
                xmlPullParser.next();
                ArrayList readThisListXml = readThisListXml(xmlPullParser, "list", strArr);
                strArr[0] = attributeValue;
                return readThisListXml;
            } else if (name.equals("set")) {
                xmlPullParser.next();
                HashSet readThisSetXml = readThisSetXml(xmlPullParser, "set", strArr);
                strArr[0] = attributeValue;
                return readThisSetXml;
            } else {
                StringBuilder sb4 = new StringBuilder("Unknown tag: ");
                sb4.append(name);
                throw new XmlPullParserException(sb4.toString());
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                StringBuilder sb5 = new StringBuilder("Unexpected end of document in <");
                sb5.append(name);
                sb5.append(">");
                throw new XmlPullParserException(sb5.toString());
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                StringBuilder sb6 = new StringBuilder("Unexpected end tag in <");
                sb6.append(name);
                sb6.append(">: ");
                sb6.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb6.toString());
            } else if (next == 4) {
                StringBuilder sb7 = new StringBuilder("Unexpected text in <");
                sb7.append(name);
                sb7.append(">: ");
                sb7.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb7.toString());
            }
        } while (next != 2);
        StringBuilder sb8 = new StringBuilder("Unexpected start tag in <");
        sb8.append(name);
        sb8.append(">: ");
        sb8.append(xmlPullParser.getName());
        throw new XmlPullParserException(sb8.toString());
    }

    public static final int convertValueToList(CharSequence charSequence, String[] strArr, int i) {
        if (charSequence != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (charSequence.equals(strArr[i2])) {
                    return i2;
                }
            }
        }
        return i;
    }

    public static final void writeListXml(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (list == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            writeValueXml(list.get(i), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<java.lang.Object>, for r2v0, types: [java.util.Set<java.lang.Object>, java.util.Set] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void writeSetXml(java.util.Set<java.lang.Object> r2, java.lang.String r3, org.xmlpull.v1.XmlSerializer r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x000e
            java.lang.String r2 = "null"
            r4.startTag(r0, r2)
            java.lang.String r2 = "null"
            r4.endTag(r0, r2)
            return
        L_0x000e:
            java.lang.String r1 = "set"
            r4.startTag(r0, r1)
            if (r3 == 0) goto L_0x001a
            java.lang.String r1 = "name"
            r4.attribute(r0, r1, r3)
        L_0x001a:
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()
            writeValueXml(r3, r0, r4)
            goto L_0x001e
        L_0x002c:
            java.lang.String r2 = "set"
            r4.endTag(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.adapter.xml.XmlUtils.writeSetXml(java.util.Set, java.lang.String, org.xmlpull.v1.XmlSerializer):void");
    }

    public static final ArrayList readThisListXml(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder("Expected ");
                sb.append(str);
                sb.append(" end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb2 = new StringBuilder("Document ended before ");
        sb2.append(str);
        sb2.append(" end tag");
        throw new XmlPullParserException(sb2.toString());
    }

    public static final HashSet readThisSetXml(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                StringBuilder sb = new StringBuilder("Expected ");
                sb.append(str);
                sb.append(" end tag at: ");
                sb.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb2 = new StringBuilder("Document ended before ");
        sb2.append(str);
        sb2.append(" end tag");
        throw new XmlPullParserException(sb2.toString());
    }

    public static final void writeByteArrayXml(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        int i;
        int i2;
        if (bArr == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        xmlSerializer.startTag(null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(r7));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i3 = b >> 4;
            if (i3 >= 10) {
                i = (i3 + 97) - 10;
            } else {
                i = i3 + 48;
            }
            sb.append(i);
            byte b2 = b & 255;
            if (b2 >= 10) {
                i2 = (b2 + 97) - 10;
            } else {
                i2 = b2 + 48;
            }
            sb.append(i2);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag(null, "byte-array");
    }

    public static final void writeIntArrayXml(int[] iArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (iArr == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        xmlSerializer.startTag(null, "int-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(r5));
        for (int num : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(num));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "int-array");
    }

    public static final void writeMapXml(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (map == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        for (Entry entry : map.entrySet()) {
            writeValueXml(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    public static final int[] readThisIntArrayXml(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Expected item tag at: ");
                        sb.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb.toString());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder("Expected ");
                        sb2.append(str);
                        sb2.append(" end tag at: ");
                        sb2.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sb2.toString());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            StringBuilder sb3 = new StringBuilder("Document ended before ");
            sb3.append(str);
            sb3.append(" end tag");
            throw new XmlPullParserException(sb3.toString());
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final HashMap readThisMapXml(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object readThisValueXml = readThisValueXml(xmlPullParser, strArr);
                if (strArr[0] != null) {
                    hashMap.put(strArr[0], readThisValueXml);
                } else {
                    StringBuilder sb = new StringBuilder("Map value without name attribute: ");
                    sb.append(xmlPullParser.getName());
                    throw new XmlPullParserException(sb.toString());
                }
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                StringBuilder sb2 = new StringBuilder("Expected ");
                sb2.append(str);
                sb2.append(" end tag at: ");
                sb2.append(xmlPullParser.getName());
                throw new XmlPullParserException(sb2.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sb3 = new StringBuilder("Document ended before ");
        sb3.append(str);
        sb3.append(" end tag");
        throw new XmlPullParserException(sb3.toString());
    }

    public static final void writeValueXml(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, TEVideoRecorder.FACE_BEAUTY_NULL);
        } else if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else if (obj instanceof byte[]) {
                writeByteArrayXml((byte[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof int[]) {
                writeIntArrayXml((int[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Map) {
                writeMapXml((Map) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof List) {
                writeListXml((List) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Set) {
                writeSetXml((Set) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof CharSequence) {
                xmlSerializer.startTag(null, "string");
                if (str != null) {
                    xmlSerializer.attribute(null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, "string");
                return;
            } else {
                StringBuilder sb = new StringBuilder("writeValueXml: unable to write ");
                sb.append(str);
                sb.append(", class ");
                sb.append(obj.getClass());
                sb.append(", value ");
                sb.append(obj);
                throw new RuntimeException(sb.toString());
            }
            xmlSerializer.startTag(null, str2);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, "value", obj.toString());
            xmlSerializer.endTag(null, str2);
        }
    }
}
