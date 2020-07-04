package com.bytedance.ies.bullet.kit.p261rn.internal.wrapper;

import com.bytedance.ies.bullet.kit.p261rn.C10486a;
import com.bytedance.ies.bullet.kit.p261rn.C10488b;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CallbackImpl;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromArray;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.NativeArgumentsParseException;
import com.facebook.react.bridge.NativeModule.NativeMethod;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.wrapper.b */
final class C10565b implements NativeMethod {

    /* renamed from: a */
    public static final C10577a<Callback> f28320a = new C10577a<Callback>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30955b(jSInstance, readableNativeArray, i);
        }

        /* renamed from: b */
        private static Callback m30955b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            if (readableNativeArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableNativeArray.getDouble(i));
        }
    };

    /* renamed from: b */
    private static final C10577a<Boolean> f28321b = new C10577a<Boolean>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30951b(jSInstance, readableNativeArray, i);
        }

        /* renamed from: b */
        private static Boolean m30951b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return Boolean.valueOf(readableNativeArray.getBoolean(i));
        }
    };

    /* renamed from: c */
    private static final C10577a<Double> f28322c = new C10577a<Double>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30961b(jSInstance, readableNativeArray, i);
        }

        /* renamed from: b */
        private static Double m30961b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return Double.valueOf(readableNativeArray.getDouble(i));
        }
    };

    /* renamed from: d */
    private static final C10577a<Float> f28323d = new C10577a<Float>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30963b(jSInstance, readableNativeArray, i);
        }

        /* renamed from: b */
        private static Float m30963b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return Float.valueOf((float) readableNativeArray.getDouble(i));
        }
    };

    /* renamed from: e */
    private static final C10577a<Integer> f28324e = new C10577a<Integer>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30965b(jSInstance, readableNativeArray, i);
        }

        /* renamed from: b */
        private static Integer m30965b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return Integer.valueOf((int) readableNativeArray.getDouble(i));
        }
    };

    /* renamed from: f */
    private static final C10577a<String> f28325f = new C10577a<String>() {
        /* renamed from: b */
        private static String m30967b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return readableNativeArray.getString(i);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30967b(jSInstance, readableNativeArray, i);
        }
    };

    /* renamed from: g */
    private static final C10577a<ReadableNativeArray> f28326g = new C10577a<ReadableNativeArray>() {
        /* renamed from: b */
        private static ReadableNativeArray m30969b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return readableNativeArray.getArray(i);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30969b(jSInstance, readableNativeArray, i);
        }
    };

    /* renamed from: h */
    private static final C10577a<Dynamic> f28327h = new C10577a<Dynamic>() {
        /* renamed from: b */
        private static Dynamic m30971b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return DynamicFromArray.create(readableNativeArray, i);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30971b(jSInstance, readableNativeArray, i);
        }
    };

    /* renamed from: i */
    private static final C10577a<ReadableMap> f28328i = new C10577a<ReadableMap>() {
        /* renamed from: b */
        private static ReadableMap m30953b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return readableNativeArray.getMap(i);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30953b(jSInstance, readableNativeArray, i);
        }
    };

    /* renamed from: j */
    private static final C10577a<Promise> f28329j = new C10577a<Promise>() {
        /* renamed from: a */
        public final int mo25359a() {
            return 2;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return m30957b(jSInstance, readableNativeArray, i);
        }

        /* renamed from: b */
        private static Promise m30957b(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return new PromiseImpl((Callback) C10565b.f28320a.mo25358a(jSInstance, readableNativeArray, i), (Callback) C10565b.f28320a.mo25358a(jSInstance, readableNativeArray, i + 1));
        }
    };

    /* renamed from: k */
    private final String f28330k;

    /* renamed from: l */
    private final C10488b f28331l;

    /* renamed from: m */
    private final Method f28332m;

    /* renamed from: n */
    private final Class[] f28333n;

    /* renamed from: o */
    private boolean f28334o;

    /* renamed from: p */
    private C10577a[] f28335p;

    /* renamed from: q */
    private Object[] f28336q;

    /* renamed from: r */
    private int f28337r;

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.wrapper.b$a */
    static abstract class C10577a<T> {
        private C10577a() {
        }

        /* renamed from: a */
        public int mo25359a() {
            return 1;
        }

        /* renamed from: a */
        public abstract T mo25358a(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i);
    }

    public final String getType() {
        return "async";
    }

    /* renamed from: a */
    private void m30948a() {
        if (!this.f28334o) {
            try {
                this.f28334o = true;
                this.f28335p = m30949a(this.f28333n);
                this.f28336q = new Object[this.f28333n.length];
                this.f28337r = m30950b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private int m30950b() {
        if (this.f28335p == null) {
            return 0;
        }
        int i = 0;
        for (C10577a a : this.f28335p) {
            i += a.mo25359a();
        }
        return i;
    }

    /* renamed from: a */
    private static C10577a[] m30949a(Class[] clsArr) {
        C10577a[] aVarArr = new C10577a[clsArr.length];
        for (int i = 0; i < clsArr.length; i += aVarArr[i].mo25359a()) {
            Class<Dynamic> cls = clsArr[i];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                aVarArr[i] = f28321b;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                aVarArr[i] = f28324e;
            } else if (cls == Double.class || cls == Double.TYPE) {
                aVarArr[i] = f28322c;
            } else if (cls == Float.class || cls == Float.TYPE) {
                aVarArr[i] = f28323d;
            } else if (cls == String.class) {
                aVarArr[i] = f28325f;
            } else if (cls == Callback.class) {
                aVarArr[i] = f28320a;
            } else if (cls == Promise.class) {
                aVarArr[i] = f28329j;
                boolean z = true;
                if (i != clsArr.length - 1) {
                    z = false;
                }
                C13854a.m40915a(z, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                aVarArr[i] = f28328i;
            } else if (cls == ReadableArray.class) {
                aVarArr[i] = f28326g;
            } else if (cls == Dynamic.class) {
                aVarArr[i] = f28327h;
            } else {
                StringBuilder sb = new StringBuilder("Got unknown argument class: ");
                sb.append(cls.getSimpleName());
                throw new RuntimeException(sb.toString());
            }
        }
        return aVarArr;
    }

    /* renamed from: a */
    private static String m30947a(int i, int i2) {
        if (i2 > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("-");
            sb.append((i + i2) - 1);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        return sb2.toString();
    }

    public final void invoke(JSInstance jSInstance, ReadableNativeArray readableNativeArray) {
        int i;
        int i2;
        try {
            if (!this.f28334o) {
                m30948a();
            }
            if (this.f28336q == null || this.f28335p == null) {
                throw new Error("processArguments failed");
            } else if (this.f28337r == readableNativeArray.size()) {
                i = 0;
                i2 = 0;
                while (i < this.f28335p.length) {
                    this.f28336q[i] = this.f28335p[i].mo25358a(jSInstance, readableNativeArray, i2);
                    i2 += this.f28335p[i].mo25359a();
                    i++;
                }
                for (int i3 = 0; i3 < this.f28333n.length; i3++) {
                    final Object obj = this.f28336q[i3];
                    if (obj instanceof ReadableArray) {
                        this.f28336q[i3] = ((ReadableArray) obj).toArrayList();
                    } else if (obj instanceof ReadableMap) {
                        this.f28336q[i3] = ((ReadableMap) obj).toHashMap();
                    } else if (obj instanceof Callback) {
                        this.f28336q[i3] = new C10486a() {
                            /* renamed from: a */
                            public final void mo25269a(Object... objArr) {
                                Object[] objArr2 = new Object[objArr.length];
                                for (int i = 0; i < objArr.length; i++) {
                                    if (objArr[i] instanceof List) {
                                        objArr2[i] = Arguments.makeNativeArray(objArr[i]);
                                    } else if (objArr[i] instanceof Map) {
                                        objArr2[i] = Arguments.makeNativeMap(objArr[i]);
                                    } else {
                                        objArr2[i] = objArr[i];
                                    }
                                }
                                ((Callback) obj).invoke(objArr2);
                            }
                        };
                    }
                }
                this.f28332m.invoke(this.f28331l, this.f28336q);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f28330k);
                sb.append(" got ");
                sb.append(readableNativeArray.size());
                sb.append(" arguments, expected ");
                sb.append(this.f28337r);
                throw new NativeArgumentsParseException(sb.toString());
            }
        } catch (UnexpectedNativeTypeException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e.getMessage());
            sb2.append(" (constructing arguments for ");
            sb2.append(this.f28330k);
            sb2.append(" at argument index ");
            sb2.append(m30947a(i2, this.f28335p[i].mo25359a()));
            sb2.append(")");
            throw new NativeArgumentsParseException(sb2.toString(), e);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            StringBuilder sb3 = new StringBuilder("Could not invoke ");
            sb3.append(this.f28330k);
            throw new RuntimeException(sb3.toString(), e2);
        } catch (Throwable unused) {
        }
    }

    public C10565b(C10488b bVar, Method method, String str) {
        this.f28330k = str;
        this.f28331l = bVar;
        this.f28332m = method;
        this.f28332m.setAccessible(true);
        Class[] parameterTypes = this.f28332m.getParameterTypes();
        this.f28333n = new Class[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            if (List.class.isAssignableFrom(parameterTypes[i])) {
                this.f28333n[i] = ReadableArray.class;
            } else if (Map.class.isAssignableFrom(parameterTypes[i])) {
                this.f28333n[i] = ReadableMap.class;
            } else if (C10486a.class.isAssignableFrom(parameterTypes[i])) {
                this.f28333n[i] = Callback.class;
            } else {
                this.f28333n[i] = parameterTypes[i];
            }
        }
    }
}
