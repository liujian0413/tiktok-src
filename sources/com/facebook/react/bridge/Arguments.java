package com.facebook.react.bridge;

import android.os.Bundle;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Arguments {
    public static WritableArray createArray() {
        return new WritableNativeArray();
    }

    public static WritableMap createMap() {
        return new WritableNativeMap();
    }

    public static <T> WritableNativeArray makeNativeArray(final Object obj) {
        if (obj == null) {
            return new WritableNativeArray();
        }
        return makeNativeArray((List) new AbstractList() {
            public final int size() {
                return Array.getLength(obj);
            }

            public final Object get(int i) {
                return Array.get(obj, i);
            }
        });
    }

    public static WritableNativeMap makeNativeMap(Bundle bundle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle == null) {
            return writableNativeMap;
        }
        for (String str : bundle.keySet()) {
            addEntry(writableNativeMap, str, bundle.get(str));
        }
        return writableNativeMap;
    }

    public static WritableNativeMap makeNativeMap(Map<String, Object> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (map == null) {
            return writableNativeMap;
        }
        for (Entry entry : map.entrySet()) {
            addEntry(writableNativeMap, (String) entry.getKey(), entry.getValue());
        }
        return writableNativeMap;
    }

    private static Object makeNativeObject(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return new Double(((Number) obj).doubleValue());
        }
        if (obj.getClass().isArray()) {
            return makeNativeArray(obj);
        }
        if (obj instanceof List) {
            return makeNativeArray((List) obj);
        }
        if (obj instanceof Map) {
            return makeNativeMap((Map) obj);
        }
        if (obj instanceof Bundle) {
            return makeNativeMap((Bundle) obj);
        }
        return obj;
    }

    public static WritableArray fromArray(Object obj) {
        WritableArray createArray = createArray();
        int i = 0;
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            while (i < length) {
                createArray.pushString(strArr[i]);
                i++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            int length2 = bundleArr.length;
            while (i < length2) {
                createArray.pushMap(fromBundle(bundleArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                createArray.pushInt(iArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length4 = fArr.length;
            while (i < length4) {
                createArray.pushDouble((double) fArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i < length5) {
                createArray.pushDouble(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i < length6) {
                createArray.pushBoolean(zArr[i]);
                i++;
            }
        } else {
            StringBuilder sb = new StringBuilder("Unknown array type ");
            sb.append(obj.getClass());
            throw new IllegalArgumentException(sb.toString());
        }
        return createArray;
    }

    public static WritableMap fromBundle(Bundle bundle) {
        WritableMap createMap = createMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                createMap.putNull(str);
            } else if (obj.getClass().isArray()) {
                createMap.putArray(str, fromArray(obj));
            } else if (obj instanceof String) {
                createMap.putString(str, (String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    createMap.putInt(str, ((Integer) obj).intValue());
                } else {
                    createMap.putDouble(str, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Bundle) {
                createMap.putMap(str, fromBundle((Bundle) obj));
            } else if (obj instanceof List) {
                createMap.putArray(str, fromList((List) obj));
            } else {
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(obj.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return createMap;
    }

    public static WritableNativeArray fromJavaArgs(Object[] objArr) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Boolean bool : objArr) {
            if (bool == null) {
                writableNativeArray.pushNull();
            } else {
                Class<WritableNativeArray> cls = bool.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(bool.booleanValue());
                } else if (cls == Integer.class) {
                    writableNativeArray.pushDouble(((Integer) bool).doubleValue());
                } else if (cls == Double.class) {
                    writableNativeArray.pushDouble(((Double) bool).doubleValue());
                } else if (cls == Float.class) {
                    writableNativeArray.pushDouble(((Float) bool).doubleValue());
                } else if (cls == String.class) {
                    writableNativeArray.pushString(bool.toString());
                } else if (cls == WritableNativeMap.class) {
                    writableNativeArray.pushMap((WritableNativeMap) bool);
                } else if (cls == WritableNativeArray.class) {
                    writableNativeArray.pushArray((WritableNativeArray) bool);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot convert argument of type ");
                    sb.append(cls);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        return writableNativeArray;
    }

    public static WritableArray fromList(List list) {
        WritableArray createArray = createArray();
        for (Object next : list) {
            if (next == null) {
                createArray.pushNull();
            } else if (next.getClass().isArray()) {
                createArray.pushArray(fromArray(next));
            } else if (next instanceof Bundle) {
                createArray.pushMap(fromBundle((Bundle) next));
            } else if (next instanceof List) {
                createArray.pushArray(fromList((List) next));
            } else if (next instanceof String) {
                createArray.pushString((String) next);
            } else if (next instanceof Integer) {
                createArray.pushInt(((Integer) next).intValue());
            } else if (next instanceof Number) {
                createArray.pushDouble(((Number) next).doubleValue());
            } else if (next instanceof Boolean) {
                createArray.pushBoolean(((Boolean) next).booleanValue());
            } else {
                StringBuilder sb = new StringBuilder("Unknown value type ");
                sb.append(next.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return createArray;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r3v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.react.bridge.WritableNativeArray makeNativeArray(java.util.List<java.lang.Object> r3) {
        /*
            com.facebook.react.bridge.WritableNativeArray r0 = new com.facebook.react.bridge.WritableNativeArray
            r0.<init>()
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.util.Iterator r3 = r3.iterator()
        L_0x000c:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = makeNativeObject(r1)
            if (r1 != 0) goto L_0x0020
            r0.pushNull()
            goto L_0x000c
        L_0x0020:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x002e
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.pushBoolean(r1)
            goto L_0x000c
        L_0x002e:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x003c
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.pushInt(r1)
            goto L_0x000c
        L_0x003c:
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 == 0) goto L_0x004a
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r0.pushDouble(r1)
            goto L_0x000c
        L_0x004a:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0054
            java.lang.String r1 = (java.lang.String) r1
            r0.pushString(r1)
            goto L_0x000c
        L_0x0054:
            boolean r2 = r1 instanceof com.facebook.react.bridge.WritableNativeArray
            if (r2 == 0) goto L_0x005e
            com.facebook.react.bridge.WritableNativeArray r1 = (com.facebook.react.bridge.WritableNativeArray) r1
            r0.pushArray(r1)
            goto L_0x000c
        L_0x005e:
            boolean r2 = r1 instanceof com.facebook.react.bridge.WritableNativeMap
            if (r2 == 0) goto L_0x0068
            com.facebook.react.bridge.WritableNativeMap r1 = (com.facebook.react.bridge.WritableNativeMap) r1
            r0.pushMap(r1)
            goto L_0x000c
        L_0x0068:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not convert "
            r0.<init>(r2)
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.Arguments.makeNativeArray(java.util.List):com.facebook.react.bridge.WritableNativeArray");
    }

    public static Bundle toBundle(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle bundle = new Bundle();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey)) {
                case Null:
                    bundle.putString(nextKey, null);
                    break;
                case Boolean:
                    bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case Number:
                    bundle.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case String:
                    bundle.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case Map:
                    bundle.putBundle(nextKey, toBundle(readableMap.getMap(nextKey)));
                    break;
                case Array:
                    bundle.putSerializable(nextKey, toList(readableMap.getArray(nextKey)));
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Could not convert object with key: ");
                    sb.append(nextKey);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
        return bundle;
    }

    public static ArrayList toList(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i)) {
                case Null:
                    arrayList.add(null);
                    break;
                case Boolean:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case Number:
                    double d = readableArray.getDouble(i);
                    if (d != Math.rint(d)) {
                        arrayList.add(Double.valueOf(d));
                        break;
                    } else {
                        arrayList.add(Integer.valueOf((int) d));
                        break;
                    }
                case String:
                    arrayList.add(readableArray.getString(i));
                    break;
                case Map:
                    arrayList.add(toBundle(readableArray.getMap(i)));
                    break;
                case Array:
                    arrayList.add(toList(readableArray.getArray(i)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object in array.");
            }
        }
        return arrayList;
    }

    private static void addEntry(WritableNativeMap writableNativeMap, String str, Object obj) {
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableNativeMap.putNull(str);
        } else if (makeNativeObject instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) makeNativeObject).booleanValue());
        } else if (makeNativeObject instanceof Integer) {
            writableNativeMap.putInt(str, ((Integer) makeNativeObject).intValue());
        } else if (makeNativeObject instanceof Number) {
            writableNativeMap.putDouble(str, ((Number) makeNativeObject).doubleValue());
        } else if (makeNativeObject instanceof String) {
            writableNativeMap.putString(str, (String) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeArray) {
            writableNativeMap.putArray(str, (WritableNativeArray) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeMap) {
            writableNativeMap.putMap(str, (WritableNativeMap) makeNativeObject);
        } else {
            StringBuilder sb = new StringBuilder("Could not convert ");
            sb.append(makeNativeObject.getClass());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
