package com.kakao.util.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SharedPreferencesCache implements PersistentKVStore {
    private final SharedPreferences file;
    private final Bundle memory = new Bundle();

    public synchronized void clearAll() {
        this.file.edit().clear().apply();
        this.memory.clear();
    }

    public synchronized void reloadAll() {
        for (String deserializeKey : this.file.getAll().keySet()) {
            try {
                deserializeKey(deserializeKey);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Boolean getBoolean(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.os.Bundle r0 = r1.memory     // Catch:{ all -> 0x0018 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000c
            r1.deserializeKey(r2)     // Catch:{ JSONException -> 0x000c }
        L_0x000c:
            android.os.Bundle r0 = r1.memory     // Catch:{ all -> 0x0018 }
            boolean r2 = r0.getBoolean(r2)     // Catch:{ all -> 0x0018 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0018 }
            monitor-exit(r1)
            return r2
        L_0x0018:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.util.helper.SharedPreferencesCache.getBoolean(java.lang.String):java.lang.Boolean");
    }

    public synchronized Date getDate(String str) {
        long longValue = getLong(str).longValue();
        if (longValue <= 0) {
            return null;
        }
        return new Date(longValue);
    }

    public synchronized int getInt(String str) {
        int i;
        int i2 = this.memory.getInt(str);
        if (i2 == 0) {
            try {
                deserializeKey(str);
                i = this.memory.getInt(str);
            } catch (JSONException unused) {
            }
        }
        i = i2;
        return i;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|3|(3:5|6|7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Long getLong(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            android.os.Bundle r0 = r5.memory     // Catch:{ all -> 0x001d }
            long r0 = r0.getLong(r6)     // Catch:{ all -> 0x001d }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0017
            r5.deserializeKey(r6)     // Catch:{ JSONException -> 0x0017 }
            android.os.Bundle r2 = r5.memory     // Catch:{ JSONException -> 0x0017 }
            long r2 = r2.getLong(r6)     // Catch:{ JSONException -> 0x0017 }
            r0 = r2
        L_0x0017:
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x001d }
            monitor-exit(r5)
            return r6
        L_0x001d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.util.helper.SharedPreferencesCache.getLong(java.lang.String):java.lang.Long");
    }

    public synchronized String getString(String str) {
        String str2;
        String string = this.memory.getString(str);
        if (string == null) {
            try {
                deserializeKey(str);
                str2 = this.memory.getString(str);
            } catch (JSONException unused) {
            }
        }
        str2 = string;
        return str2;
    }

    public synchronized void remove(String str) {
        Editor edit = this.file.edit();
        edit.remove(str);
        edit.apply();
        this.memory.remove(str);
    }

    public synchronized void clear(List<String> list) {
        Editor edit = this.file.edit();
        for (String remove : list) {
            edit.remove(remove);
        }
        edit.apply();
        for (String remove2 : list) {
            this.memory.remove(remove2);
        }
    }

    public synchronized Map<String, String> getStringMap(String str) {
        HashMap hashMap;
        reloadAll();
        hashMap = new HashMap();
        for (String str2 : this.memory.keySet()) {
            if (str2.startsWith(str)) {
                hashMap.put(str2.substring(str.length()), (String) this.memory.get(str2));
            }
        }
        return hashMap;
    }

    public synchronized void save(Bundle bundle) {
        Utility.notNull(bundle, "bundle");
        Editor edit = this.file.edit();
        for (String str : bundle.keySet()) {
            try {
                serializeKey(str, bundle.get(str), edit);
            } catch (JSONException unused) {
                return;
            }
        }
        edit.apply();
        for (String deserializeKey : bundle.keySet()) {
            try {
                deserializeKey(deserializeKey);
            } catch (JSONException unused2) {
            }
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void deserializeKey(java.lang.String r8) throws org.json.JSONException {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.file
            java.lang.String r1 = "{}"
            java.lang.String r0 = r0.getString(r8, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "valueType"
            java.lang.String r0 = r1.getString(r0)
            int r2 = r0.hashCode()
            r3 = 1
            r4 = 0
            switch(r2) {
                case -1573317553: goto L_0x00e5;
                case -1383386164: goto L_0x00db;
                case -1374008726: goto L_0x00d1;
                case -1361632968: goto L_0x00c6;
                case -1325958191: goto L_0x00bb;
                case -1097129250: goto L_0x00b0;
                case -891985903: goto L_0x00a5;
                case -766441794: goto L_0x009a;
                case 104431: goto L_0x0090;
                case 3029738: goto L_0x0086;
                case 3039496: goto L_0x007b;
                case 3052374: goto L_0x006f;
                case 3118337: goto L_0x0063;
                case 3327612: goto L_0x0057;
                case 97526364: goto L_0x004b;
                case 100361105: goto L_0x0040;
                case 109413500: goto L_0x0035;
                case 1359468275: goto L_0x0029;
                case 2067161310: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x00f0
        L_0x001e:
            java.lang.String r2 = "short[]"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 5
            goto L_0x00f1
        L_0x0029:
            java.lang.String r2 = "double[]"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 13
            goto L_0x00f1
        L_0x0035:
            java.lang.String r2 = "short"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 4
            goto L_0x00f1
        L_0x0040:
            java.lang.String r2 = "int[]"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 7
            goto L_0x00f1
        L_0x004b:
            java.lang.String r2 = "float"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 10
            goto L_0x00f1
        L_0x0057:
            java.lang.String r2 = "long"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 8
            goto L_0x00f1
        L_0x0063:
            java.lang.String r2 = "enum"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 18
            goto L_0x00f1
        L_0x006f:
            java.lang.String r2 = "char"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 14
            goto L_0x00f1
        L_0x007b:
            java.lang.String r2 = "byte"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 2
            goto L_0x00f1
        L_0x0086:
            java.lang.String r2 = "bool"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 0
            goto L_0x00f1
        L_0x0090:
            java.lang.String r2 = "int"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 6
            goto L_0x00f1
        L_0x009a:
            java.lang.String r2 = "float[]"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 11
            goto L_0x00f1
        L_0x00a5:
            java.lang.String r2 = "string"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 16
            goto L_0x00f1
        L_0x00b0:
            java.lang.String r2 = "long[]"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 9
            goto L_0x00f1
        L_0x00bb:
            java.lang.String r2 = "double"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 12
            goto L_0x00f1
        L_0x00c6:
            java.lang.String r2 = "char[]"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 15
            goto L_0x00f1
        L_0x00d1:
            java.lang.String r2 = "byte[]"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 3
            goto L_0x00f1
        L_0x00db:
            java.lang.String r2 = "bool[]"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 1
            goto L_0x00f1
        L_0x00e5:
            java.lang.String r2 = "stringList"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f0
            r0 = 17
            goto L_0x00f1
        L_0x00f0:
            r0 = -1
        L_0x00f1:
            switch(r0) {
                case 0: goto L_0x02c4;
                case 1: goto L_0x02a6;
                case 2: goto L_0x0299;
                case 3: goto L_0x027a;
                case 4: goto L_0x026d;
                case 5: goto L_0x024e;
                case 6: goto L_0x0242;
                case 7: goto L_0x0224;
                case 8: goto L_0x0218;
                case 9: goto L_0x01fa;
                case 10: goto L_0x01ed;
                case 11: goto L_0x01ce;
                case 12: goto L_0x01c2;
                case 13: goto L_0x01a4;
                case 14: goto L_0x018c;
                case 15: goto L_0x0161;
                case 16: goto L_0x0155;
                case 17: goto L_0x012c;
                case 18: goto L_0x00f6;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            goto L_0x02d0
        L_0x00f6:
            java.lang.String r0 = "enumType"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x0110 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x0110 }
            java.lang.String r2 = "value"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x0110 }
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x0110 }
            android.os.Bundle r1 = r7.memory     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x0110 }
            r1.putSerializable(r8, r0)     // Catch:{ ClassNotFoundException | IllegalArgumentException -> 0x0110 }
            return
        L_0x0110:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SharedPreferences.deserializeKey: Error deserializing key '"
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = "' -- "
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            com.kakao.util.helper.log.Logger.m60933e(r8)
            goto L_0x02d0
        L_0x012c:
            java.lang.String r0 = "value"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            int r1 = r0.length()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x013b:
            if (r4 >= r1) goto L_0x014f
            java.lang.Object r3 = r0.get(r4)
            java.lang.Object r5 = org.json.JSONObject.NULL
            if (r3 != r5) goto L_0x0147
            r3 = 0
            goto L_0x0149
        L_0x0147:
            java.lang.String r3 = (java.lang.String) r3
        L_0x0149:
            r2.add(r4, r3)
            int r4 = r4 + 1
            goto L_0x013b
        L_0x014f:
            android.os.Bundle r0 = r7.memory
            r0.putStringArrayList(r8, r2)
            return
        L_0x0155:
            android.os.Bundle r0 = r7.memory
            java.lang.String r2 = "value"
            java.lang.String r1 = r1.getString(r2)
            r0.putString(r8, r1)
            return
        L_0x0161:
            java.lang.String r0 = "value"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            int r1 = r0.length()
            char[] r1 = new char[r1]
            r2 = 0
        L_0x016e:
            int r5 = r1.length
            if (r2 >= r5) goto L_0x0186
            java.lang.String r5 = r0.getString(r2)
            if (r5 == 0) goto L_0x0183
            int r6 = r5.length()
            if (r6 != r3) goto L_0x0183
            char r5 = r5.charAt(r4)
            r1[r2] = r5
        L_0x0183:
            int r2 = r2 + 1
            goto L_0x016e
        L_0x0186:
            android.os.Bundle r0 = r7.memory
            r0.putCharArray(r8, r1)
            return
        L_0x018c:
            java.lang.String r0 = "value"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x02d0
            int r1 = r0.length()
            if (r1 != r3) goto L_0x02d0
            android.os.Bundle r1 = r7.memory
            char r0 = r0.charAt(r4)
            r1.putChar(r8, r0)
            return
        L_0x01a4:
            java.lang.String r0 = "value"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            int r1 = r0.length()
            double[] r1 = new double[r1]
        L_0x01b0:
            int r2 = r1.length
            if (r4 >= r2) goto L_0x01bc
            double r2 = r0.getDouble(r4)
            r1[r4] = r2
            int r4 = r4 + 1
            goto L_0x01b0
        L_0x01bc:
            android.os.Bundle r0 = r7.memory
            r0.putDoubleArray(r8, r1)
            return
        L_0x01c2:
            android.os.Bundle r0 = r7.memory
            java.lang.String r2 = "value"
            double r1 = r1.getDouble(r2)
            r0.putDouble(r8, r1)
            return
        L_0x01ce:
            java.lang.String r0 = "value"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            int r1 = r0.length()
            float[] r1 = new float[r1]
        L_0x01da:
            int r2 = r1.length
            if (r4 >= r2) goto L_0x01e7
            double r2 = r0.getDouble(r4)
            float r2 = (float) r2
            r1[r4] = r2
            int r4 = r4 + 1
            goto L_0x01da
        L_0x01e7:
            android.os.Bundle r0 = r7.memory
            r0.putFloatArray(r8, r1)
            return
        L_0x01ed:
            android.os.Bundle r0 = r7.memory
            java.lang.String r2 = "value"
            double r1 = r1.getDouble(r2)
            float r1 = (float) r1
            r0.putFloat(r8, r1)
            return
        L_0x01fa:
            java.lang.String r0 = "value"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            int r1 = r0.length()
            long[] r1 = new long[r1]
        L_0x0206:
            int r2 = r1.length
            if (r4 >= r2) goto L_0x0212
            long r2 = r0.getLong(r4)
            r1[r4] = r2
            int r4 = r4 + 1
            goto L_0x0206
        L_0x0212:
            android.os.Bundle r0 = r7.memory
            r0.putLongArray(r8, r1)
            return
        L_0x0218:
            android.os.Bundle r0 = r7.memory
            java.lang.String r2 = "value"
            long r1 = r1.getLong(r2)
            r0.putLong(r8, r1)
            return
        L_0x0224:
            java.lang.String r0 = "value"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            int r1 = r0.length()
            int[] r1 = new int[r1]
        L_0x0230:
            int r2 = r1.length
            if (r4 >= r2) goto L_0x023c
            int r2 = r0.getInt(r4)
            r1[r4] = r2
            int r4 = r4 + 1
            goto L_0x0230
        L_0x023c:
            android.os.Bundle r0 = r7.memory
            r0.putIntArray(r8, r1)
            return
        L_0x0242:
            android.os.Bundle r0 = r7.memory
            java.lang.String r2 = "value"
            int r1 = r1.getInt(r2)
            r0.putInt(r8, r1)
            return
        L_0x024e:
            java.lang.String r0 = "value"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            int r1 = r0.length()
            short[] r1 = new short[r1]
        L_0x025a:
            int r2 = r1.length
            if (r4 >= r2) goto L_0x0267
            int r2 = r0.getInt(r4)
            short r2 = (short) r2
            r1[r4] = r2
            int r4 = r4 + 1
            goto L_0x025a
        L_0x0267:
            android.os.Bundle r0 = r7.memory
            r0.putShortArray(r8, r1)
            return
        L_0x026d:
            android.os.Bundle r0 = r7.memory
            java.lang.String r2 = "value"
            int r1 = r1.getInt(r2)
            short r1 = (short) r1
            r0.putShort(r8, r1)
            return
        L_0x027a:
            java.lang.String r0 = "value"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            int r1 = r0.length()
            byte[] r1 = new byte[r1]
        L_0x0286:
            int r2 = r1.length
            if (r4 >= r2) goto L_0x0293
            int r2 = r0.getInt(r4)
            byte r2 = (byte) r2
            r1[r4] = r2
            int r4 = r4 + 1
            goto L_0x0286
        L_0x0293:
            android.os.Bundle r0 = r7.memory
            r0.putByteArray(r8, r1)
            return
        L_0x0299:
            android.os.Bundle r0 = r7.memory
            java.lang.String r2 = "value"
            int r1 = r1.getInt(r2)
            byte r1 = (byte) r1
            r0.putByte(r8, r1)
            return
        L_0x02a6:
            java.lang.String r0 = "value"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            int r1 = r0.length()
            boolean[] r1 = new boolean[r1]
        L_0x02b2:
            int r2 = r1.length
            if (r4 >= r2) goto L_0x02be
            boolean r2 = r0.getBoolean(r4)
            r1[r4] = r2
            int r4 = r4 + 1
            goto L_0x02b2
        L_0x02be:
            android.os.Bundle r0 = r7.memory
            r0.putBooleanArray(r8, r1)
            return
        L_0x02c4:
            android.os.Bundle r0 = r7.memory
            java.lang.String r2 = "value"
            boolean r1 = r1.getBoolean(r2)
            r0.putBoolean(r8, r1)
            return
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.util.helper.SharedPreferencesCache.deserializeKey(java.lang.String):void");
    }

    public synchronized void put(String str, Object obj) {
        Editor edit = this.file.edit();
        try {
            serializeKey(str, obj, edit);
            edit.apply();
            try {
                deserializeKey(str);
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
        }
    }

    public SharedPreferencesCache(Context context, String str) {
        Utility.notNull(context, "context");
        Utility.notNull(str, "cacheName");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.file = C7285c.m22838a(context, str, 0);
        reloadAll();
    }

    private void serializeKey(String str, Object obj, Editor editor) throws JSONException {
        Object obj2;
        String str2;
        if (obj != null) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = null;
            if (obj instanceof Byte) {
                obj2 = "byte";
                jSONObject.put("value", ((Byte) obj).intValue());
            } else if (obj instanceof Short) {
                obj2 = "short";
                jSONObject.put("value", ((Short) obj).intValue());
            } else if (obj instanceof Integer) {
                obj2 = "int";
                jSONObject.put("value", ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                obj2 = "long";
                jSONObject.put("value", ((Long) obj).longValue());
            } else if (obj instanceof Float) {
                obj2 = "float";
                jSONObject.put("value", ((Float) obj).doubleValue());
            } else if (obj instanceof Double) {
                obj2 = "double";
                jSONObject.put("value", ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                obj2 = "bool";
                jSONObject.put("value", ((Boolean) obj).booleanValue());
            } else if (obj instanceof Character) {
                obj2 = "char";
                jSONObject.put("value", obj.toString());
            } else if (obj instanceof String) {
                obj2 = "string";
                jSONObject.put("value", obj);
            } else if (obj instanceof Enum) {
                obj2 = "enum";
                jSONObject.put("value", obj.toString());
                jSONObject.put("enumType", obj.getClass().getName());
            } else {
                JSONArray jSONArray2 = new JSONArray();
                int i = 0;
                if (obj instanceof byte[]) {
                    str2 = "byte[]";
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    while (i < length) {
                        jSONArray2.put(bArr[i]);
                        i++;
                    }
                } else if (obj instanceof short[]) {
                    str2 = "short[]";
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length;
                    while (i < length2) {
                        jSONArray2.put(sArr[i]);
                        i++;
                    }
                } else if (obj instanceof int[]) {
                    str2 = "int[]";
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length;
                    while (i < length3) {
                        jSONArray2.put(iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    str2 = "long[]";
                    long[] jArr = (long[]) obj;
                    int length4 = jArr.length;
                    while (i < length4) {
                        jSONArray2.put(jArr[i]);
                        i++;
                    }
                } else if (obj instanceof float[]) {
                    str2 = "float[]";
                    float[] fArr = (float[]) obj;
                    int length5 = fArr.length;
                    while (i < length5) {
                        jSONArray2.put((double) fArr[i]);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    str2 = "double[]";
                    double[] dArr = (double[]) obj;
                    int length6 = dArr.length;
                    while (i < length6) {
                        jSONArray2.put(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    str2 = "bool[]";
                    boolean[] zArr = (boolean[]) obj;
                    int length7 = zArr.length;
                    while (i < length7) {
                        jSONArray2.put(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof char[]) {
                    str2 = "char[]";
                    char[] cArr = (char[]) obj;
                    int length8 = cArr.length;
                    while (i < length8) {
                        jSONArray2.put(String.valueOf(cArr[i]));
                        i++;
                    }
                } else if (obj instanceof List) {
                    str2 = "stringList";
                    for (Object obj3 : (List) obj) {
                        if (obj3 == null) {
                            obj3 = JSONObject.NULL;
                        }
                        jSONArray2.put(obj3);
                    }
                } else {
                    obj2 = null;
                }
                Object obj4 = str2;
                jSONArray = jSONArray2;
                obj2 = obj4;
            }
            if (obj2 != null) {
                jSONObject.put("valueType", obj2);
                if (jSONArray != null) {
                    jSONObject.putOpt("value", jSONArray);
                }
                editor.putString(str, jSONObject.toString());
            }
        }
    }
}
