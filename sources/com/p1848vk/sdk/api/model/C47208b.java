package com.p1848vk.sdk.api.model;

import android.os.Parcelable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.b */
final class C47208b {
    /* renamed from: a */
    public static boolean m147655a(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.optInt(str, 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m147656b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    /* renamed from: c */
    public static long m147657c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optLong(str, 0);
    }

    /* renamed from: a */
    private static Object m147654a(JSONArray jSONArray, Class cls) throws JSONException {
        Object newInstance = Array.newInstance(cls.getComponentType(), jSONArray.length());
        Class componentType = cls.getComponentType();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                Object opt = jSONArray.opt(i);
                if (VKApiModel.class.isAssignableFrom(componentType) && (opt instanceof JSONObject)) {
                    opt = ((VKApiModel) componentType.newInstance()).mo118445b((JSONObject) opt);
                }
                Array.set(newInstance, i, opt);
                i++;
            } catch (InstantiationException e) {
                throw new JSONException(e.getMessage());
            } catch (IllegalAccessException e2) {
                throw new JSONException(e2.getMessage());
            } catch (IllegalArgumentException e3) {
                throw new JSONException(e3.getMessage());
            }
        }
        return newInstance;
    }

    /* renamed from: a */
    public static <T> T m147653a(T t, JSONObject jSONObject) throws JSONException {
        Field[] fields;
        Object vKList;
        if (jSONObject.has("response")) {
            jSONObject = jSONObject.optJSONObject("response");
        }
        if (jSONObject == null) {
            return t;
        }
        for (Field field : t.getClass().getFields()) {
            boolean z = true;
            field.setAccessible(true);
            String name = field.getName();
            Class type = field.getType();
            Object opt = jSONObject.opt(name);
            if (opt != null) {
                try {
                    if (!type.isPrimitive() || !(opt instanceof Number)) {
                        Object obj = field.get(t);
                        if (!opt.getClass().equals(type)) {
                            if (type.isArray() && (opt instanceof JSONArray)) {
                                opt = m147654a((JSONArray) opt, type);
                            } else if (VKPhotoSizes.class.isAssignableFrom(type) && (opt instanceof JSONArray)) {
                                opt = type.getConstructor(new Class[]{JSONArray.class}).newInstance(new Object[]{(JSONArray) opt});
                            } else if (!VKAttachments.class.isAssignableFrom(type) || !(opt instanceof JSONArray)) {
                                if (VKList.class.equals(type)) {
                                    Class cls = (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
                                    if (VKApiModel.class.isAssignableFrom(cls) && Parcelable.class.isAssignableFrom(cls) && C47207a.class.isAssignableFrom(cls)) {
                                        if (opt instanceof JSONArray) {
                                            vKList = new VKList((JSONArray) opt, cls);
                                        } else if (opt instanceof JSONObject) {
                                            vKList = new VKList((JSONObject) opt, cls);
                                        }
                                        opt = vKList;
                                    }
                                } else if (VKApiModel.class.isAssignableFrom(type) && (opt instanceof JSONObject)) {
                                    opt = ((VKApiModel) type.newInstance()).mo118445b((JSONObject) opt);
                                }
                                opt = obj;
                            } else {
                                opt = type.getConstructor(new Class[]{JSONArray.class}).newInstance(new Object[]{(JSONArray) opt});
                            }
                        }
                        field.set(t, opt);
                    } else {
                        Number number = (Number) opt;
                        if (type.equals(Integer.TYPE)) {
                            field.setInt(t, number.intValue());
                        } else if (type.equals(Long.TYPE)) {
                            field.setLong(t, number.longValue());
                        } else if (type.equals(Float.TYPE)) {
                            field.setFloat(t, number.floatValue());
                        } else if (type.equals(Double.TYPE)) {
                            field.setDouble(t, number.doubleValue());
                        } else if (type.equals(Boolean.TYPE)) {
                            if (number.intValue() != 1) {
                                z = false;
                            }
                            field.setBoolean(t, z);
                        } else if (type.equals(Short.TYPE)) {
                            field.setShort(t, number.shortValue());
                        } else if (type.equals(Byte.TYPE)) {
                            field.setByte(t, number.byteValue());
                        }
                    }
                } catch (InstantiationException e) {
                    throw new JSONException(e.getMessage());
                } catch (IllegalAccessException e2) {
                    throw new JSONException(e2.getMessage());
                } catch (NoSuchMethodException e3) {
                    throw new JSONException(e3.getMessage());
                } catch (InvocationTargetException e4) {
                    throw new JSONException(e4.getMessage());
                } catch (NoSuchMethodError e5) {
                    throw new JSONException(e5.getMessage());
                }
            }
        }
        return t;
    }
}
