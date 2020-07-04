package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EventListener;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TooManyListenersException;

class StandardBeanInfo extends SimpleBeanInfo {
    private static PropertyComparator comparator = new PropertyComparator();
    BeanInfo[] additionalBeanInfo;
    private Class<?> beanClass;
    private BeanDescriptor beanDescriptor;
    private boolean canAddPropertyChangeListener;
    private boolean canRemovePropertyChangeListener;
    private int defaultEventIndex = -1;
    private int defaultPropertyIndex = -1;
    private EventSetDescriptor[] events;
    private BeanInfo explicitBeanInfo;
    private boolean explicitEvents;
    private boolean explicitMethods;
    private boolean explicitProperties;
    private MethodDescriptor[] methods;
    private PropertyDescriptor[] properties;

    static class PropertyComparator implements Comparator<PropertyDescriptor> {
        private PropertyComparator() {
        }

        public int compare(PropertyDescriptor propertyDescriptor, PropertyDescriptor propertyDescriptor2) {
            return propertyDescriptor.name.compareTo(propertyDescriptor2.name);
        }
    }

    public BeanInfo[] getAdditionalBeanInfo() {
        return null;
    }

    public int getDefaultEventIndex() {
        return this.defaultEventIndex;
    }

    public int getDefaultPropertyIndex() {
        return this.defaultPropertyIndex;
    }

    public EventSetDescriptor[] getEventSetDescriptors() {
        return this.events;
    }

    public MethodDescriptor[] getMethodDescriptors() {
        return this.methods;
    }

    public PropertyDescriptor[] getPropertyDescriptors() {
        return this.properties;
    }

    private MethodDescriptor[] introspectMethods() {
        return introspectMethods(false, this.beanClass);
    }

    public BeanDescriptor getBeanDescriptor() {
        if (this.beanDescriptor == null) {
            if (this.explicitBeanInfo != null) {
                this.beanDescriptor = this.explicitBeanInfo.getBeanDescriptor();
            }
            if (this.beanDescriptor == null) {
                this.beanDescriptor = new BeanDescriptor(this.beanClass);
            }
        }
        return this.beanDescriptor;
    }

    /* access modifiers changed from: 0000 */
    public void init() {
        String str;
        if (this.events == null) {
            this.events = new EventSetDescriptor[0];
        }
        if (this.properties == null) {
            this.properties = new PropertyDescriptor[0];
        }
        if (this.properties != null) {
            if (this.defaultPropertyIndex != -1) {
                str = this.properties[this.defaultPropertyIndex].name;
            } else {
                str = null;
            }
            Arrays.sort(this.properties, comparator);
            if (str != null) {
                for (int i = 0; i < this.properties.length; i++) {
                    if (str.equals(this.properties[i].name)) {
                        this.defaultPropertyIndex = i;
                        return;
                    }
                }
            }
        }
    }

    private EventSetDescriptor[] introspectEvents() throws IntrospectionException {
        boolean z;
        MethodDescriptor[] introspectMethods = introspectMethods();
        if (introspectMethods == null) {
            return null;
        }
        HashMap hashMap = new HashMap(introspectMethods.length);
        for (int i = 0; i < introspectMethods.length; i++) {
            introspectListenerMethods("add", introspectMethods[i].method, hashMap);
            introspectListenerMethods("remove", introspectMethods[i].method, hashMap);
            introspectGetListenerMethods(introspectMethods[i].method, hashMap);
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : hashMap.entrySet()) {
            HashMap hashMap2 = (HashMap) entry.getValue();
            Method method = (Method) hashMap2.get("add");
            Method method2 = (Method) hashMap2.get("remove");
            if (!(method == null || method2 == null)) {
                Class cls = (Class) hashMap2.get("listenerType");
                Method[] methodArr = (Method[]) hashMap2.get("listenerMethods");
                EventSetDescriptor eventSetDescriptor = new EventSetDescriptor(Introspector.decapitalize((String) entry.getKey()), cls, methodArr, method, method2, (Method) hashMap2.get("get"));
                if (hashMap2.get("isUnicast") != null) {
                    z = true;
                } else {
                    z = false;
                }
                eventSetDescriptor.unicast = z;
                arrayList.add(eventSetDescriptor);
            }
        }
        EventSetDescriptor[] eventSetDescriptorArr = new EventSetDescriptor[arrayList.size()];
        arrayList.toArray(eventSetDescriptorArr);
        return eventSetDescriptorArr;
    }

    private MethodDescriptor[] introspectMethods(boolean z) {
        return introspectMethods(z, this.beanClass);
    }

    private static boolean isValidProperty(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    private static HashMap<String, EventSetDescriptor> internalAsMap(EventSetDescriptor[] eventSetDescriptorArr) {
        HashMap<String, EventSetDescriptor> hashMap = new HashMap<>();
        for (int i = 0; i < eventSetDescriptorArr.length; i++) {
            hashMap.put(eventSetDescriptorArr[i].name, eventSetDescriptorArr[i]);
        }
        return hashMap;
    }

    private String capitalize(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        return new String(charArray);
    }

    private static String getQualifiedName(Method method) {
        String name = method.getName();
        Class[] parameterTypes = method.getParameterTypes();
        if (parameterTypes != null) {
            for (Class name2 : parameterTypes) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append("_");
                sb.append(name2.getName());
                name = sb.toString();
            }
        }
        return name;
    }

    private static HashMap<String, MethodDescriptor> internalAsMap(MethodDescriptor[] methodDescriptorArr) {
        HashMap<String, MethodDescriptor> hashMap = new HashMap<>();
        for (int i = 0; i < methodDescriptorArr.length; i++) {
            hashMap.put(getQualifiedName(methodDescriptorArr[i].method), methodDescriptorArr[i]);
        }
        return hashMap;
    }

    private static Method[] introspectListenerMethods(Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < declaredMethods.length; i++) {
            Class[] parameterTypes = declaredMethods[i].getParameterTypes();
            if (parameterTypes.length == 1 && EventObject.class.isAssignableFrom(parameterTypes[0])) {
                arrayList.add(declaredMethods[i]);
            }
        }
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    private void introspectPropertyListener(Method method) {
        String name = method.getName();
        Class[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 1) {
            if (name.equals("addPropertyChangeListener") && parameterTypes[0].equals(PropertyChangeListener.class)) {
                this.canAddPropertyChangeListener = true;
            }
            if (name.equals("removePropertyChangeListener") && parameterTypes[0].equals(PropertyChangeListener.class)) {
                this.canRemovePropertyChangeListener = true;
            }
        }
    }

    private MethodDescriptor[] mergeMethods(MethodDescriptor[] methodDescriptorArr) {
        HashMap internalAsMap = internalAsMap(this.methods);
        for (MethodDescriptor methodDescriptor : methodDescriptorArr) {
            String qualifiedName = getQualifiedName(methodDescriptor.method);
            MethodDescriptor methodDescriptor2 = (MethodDescriptor) internalAsMap.get(qualifiedName);
            if (methodDescriptor2 == null) {
                internalAsMap.put(qualifiedName, methodDescriptor);
            } else {
                methodDescriptor2.merge(methodDescriptor);
            }
        }
        MethodDescriptor[] methodDescriptorArr2 = new MethodDescriptor[internalAsMap.size()];
        internalAsMap.values().toArray(methodDescriptorArr2);
        return methodDescriptorArr2;
    }

    private static HashMap<String, PropertyDescriptor> internalAsMap(PropertyDescriptor[] propertyDescriptorArr) {
        HashMap<String, PropertyDescriptor> hashMap = new HashMap<>();
        for (int i = 0; i < propertyDescriptorArr.length; i++) {
            hashMap.put(propertyDescriptorArr[i].name, propertyDescriptorArr[i]);
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r5v14, types: [org.msgpack.template.builder.beans.PropertyDescriptor] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.msgpack.template.builder.beans.PropertyDescriptor[] introspectProperties(java.lang.Class<?> r15) throws org.msgpack.template.builder.beans.IntrospectionException {
        /*
            r14 = this;
            org.msgpack.template.builder.beans.MethodDescriptor[] r0 = r14.introspectMethods()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
        L_0x000f:
            int r5 = r0.length
            if (r4 >= r5) goto L_0x0028
            r5 = r0[r4]
            java.lang.reflect.Method r5 = r5.method
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L_0x0025
            r5 = r0[r4]
            r2.add(r5)
        L_0x0025:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0028:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0037
            org.msgpack.template.builder.beans.MethodDescriptor[] r0 = new org.msgpack.template.builder.beans.MethodDescriptor[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            org.msgpack.template.builder.beans.MethodDescriptor[] r0 = (org.msgpack.template.builder.beans.MethodDescriptor[]) r0
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            if (r0 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.length
            r1.<init>(r2)
            r2 = 0
        L_0x0042:
            int r4 = r0.length
            if (r2 >= r4) goto L_0x0056
            r4 = r0[r2]
            java.lang.reflect.Method r4 = r4.method
            introspectGet(r4, r1)
            r4 = r0[r2]
            java.lang.reflect.Method r4 = r4.method
            introspectSet(r4, r1)
            int r2 = r2 + 1
            goto L_0x0042
        L_0x0056:
            r14.fixGetSet(r1)
            r0 = 1
            org.msgpack.template.builder.beans.MethodDescriptor[] r2 = r14.introspectMethods(r0)
            if (r15 == 0) goto L_0x0086
            org.msgpack.template.builder.beans.MethodDescriptor[] r15 = r14.introspectMethods(r0, r15)
            if (r15 == 0) goto L_0x0086
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r2.length
            r6 = 0
        L_0x006d:
            if (r6 >= r5) goto L_0x007d
            r7 = r2[r6]
            boolean r8 = r14.isInSuper(r7, r15)
            if (r8 != 0) goto L_0x007a
            r4.add(r7)
        L_0x007a:
            int r6 = r6 + 1
            goto L_0x006d
        L_0x007d:
            org.msgpack.template.builder.beans.MethodDescriptor[] r15 = new org.msgpack.template.builder.beans.MethodDescriptor[r3]
            java.lang.Object[] r15 = r4.toArray(r15)
            r2 = r15
            org.msgpack.template.builder.beans.MethodDescriptor[] r2 = (org.msgpack.template.builder.beans.MethodDescriptor[]) r2
        L_0x0086:
            r15 = 0
        L_0x0087:
            int r4 = r2.length
            if (r15 >= r4) goto L_0x0094
            r4 = r2[r15]
            java.lang.reflect.Method r4 = r4.method
            r14.introspectPropertyListener(r4)
            int r15 = r15 + 1
            goto L_0x0087
        L_0x0094:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x012f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            java.util.HashMap r2 = (java.util.HashMap) r2
            if (r2 == 0) goto L_0x00a1
            java.lang.String r5 = "normal"
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "indexed"
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r5 != 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00a1
        L_0x00cf:
            java.lang.String r5 = "normalget"
            java.lang.Object r5 = r2.get(r5)
            r7 = r5
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r5 = "normalset"
            java.lang.Object r5 = r2.get(r5)
            r8 = r5
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r5 = "indexedget"
            java.lang.Object r5 = r2.get(r5)
            r11 = r5
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.String r5 = "indexedset"
            java.lang.Object r5 = r2.get(r5)
            r12 = r5
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r6 != 0) goto L_0x00fc
            org.msgpack.template.builder.beans.PropertyDescriptor r5 = new org.msgpack.template.builder.beans.PropertyDescriptor
            r5.<init>(r4, r7, r8)
            r13 = r5
            goto L_0x0111
        L_0x00fc:
            org.msgpack.template.builder.beans.IndexedPropertyDescriptor r13 = new org.msgpack.template.builder.beans.IndexedPropertyDescriptor     // Catch:{ IntrospectionException -> 0x0106 }
            r5 = r13
            r6 = r4
            r9 = r11
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ IntrospectionException -> 0x0106 }
            goto L_0x0111
        L_0x0106:
            org.msgpack.template.builder.beans.IndexedPropertyDescriptor r13 = new org.msgpack.template.builder.beans.IndexedPropertyDescriptor
            r7 = 0
            r8 = 0
            r5 = r13
            r6 = r4
            r9 = r11
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0111:
            boolean r4 = r14.canAddPropertyChangeListener
            if (r4 == 0) goto L_0x011c
            boolean r4 = r14.canRemovePropertyChangeListener
            if (r4 == 0) goto L_0x011c
            r13.bound = r0
            goto L_0x011e
        L_0x011c:
            r13.bound = r3
        L_0x011e:
            java.lang.String r4 = "isConstrained"
            java.lang.Object r2 = r2.get(r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            if (r2 != r4) goto L_0x012a
            r13.constrained = r0
        L_0x012a:
            r15.add(r13)
            goto L_0x00a1
        L_0x012f:
            int r0 = r15.size()
            org.msgpack.template.builder.beans.PropertyDescriptor[] r0 = new org.msgpack.template.builder.beans.PropertyDescriptor[r0]
            r15.toArray(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.StandardBeanInfo.introspectProperties(java.lang.Class):org.msgpack.template.builder.beans.PropertyDescriptor[]");
    }

    private void fixGetSet(HashMap<String, HashMap> hashMap) throws IntrospectionException {
        Method method;
        Method method2;
        Object obj;
        if (hashMap != null) {
            for (Entry value : hashMap.entrySet()) {
                HashMap hashMap2 = (HashMap) value.getValue();
                ArrayList arrayList = (ArrayList) hashMap2.get("getters");
                ArrayList arrayList2 = (ArrayList) hashMap2.get("setters");
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                Class cls = null;
                Method method3 = null;
                Method method4 = null;
                while (it.hasNext()) {
                    Method method5 = (Method) it.next();
                    Class[] parameterTypes = method5.getParameterTypes();
                    String name = method5.getName();
                    if ((parameterTypes == null || parameterTypes.length == 0) && (method3 == null || name.startsWith("is"))) {
                        method3 = method5;
                    }
                    if (parameterTypes != null && parameterTypes.length == 1 && parameterTypes[0] == Integer.TYPE) {
                        if (method4 == null || name.startsWith("get") || (name.startsWith("is") && !method4.getName().startsWith("get"))) {
                            method4 = method5;
                        }
                    }
                }
                if (method3 != null) {
                    Class returnType = method3.getReturnType();
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            method = null;
                            break;
                        }
                        Method method6 = (Method) it2.next();
                        if (method6.getParameterTypes().length == 1 && returnType.equals(method6.getParameterTypes()[0])) {
                            method = method6;
                            break;
                        }
                    }
                } else {
                    Iterator it3 = arrayList2.iterator();
                    method = null;
                    while (it3.hasNext()) {
                        Method method7 = (Method) it3.next();
                        if (method7.getParameterTypes().length == 1) {
                            method = method7;
                        }
                    }
                }
                if (method4 != null) {
                    Class returnType2 = method4.getReturnType();
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            method2 = null;
                            break;
                        }
                        Method method8 = (Method) it4.next();
                        if (method8.getParameterTypes().length == 2 && method8.getParameterTypes()[0] == Integer.TYPE && returnType2.equals(method8.getParameterTypes()[1])) {
                            method2 = method8;
                            break;
                        }
                    }
                } else {
                    Iterator it5 = arrayList2.iterator();
                    method2 = null;
                    while (it5.hasNext()) {
                        Method method9 = (Method) it5.next();
                        if (method9.getParameterTypes().length == 2 && method9.getParameterTypes()[0] == Integer.TYPE) {
                            method2 = method9;
                        }
                    }
                }
                if (method3 != null) {
                    obj = method3.getReturnType();
                } else if (method != null) {
                    obj = method.getParameterTypes()[0];
                } else {
                    obj = null;
                }
                if (method4 != null) {
                    cls = method4.getReturnType();
                } else if (method2 != null) {
                    cls = method2.getParameterTypes()[1];
                }
                if (method3 != null) {
                    method3.getReturnType().isArray();
                }
                if (method3 != null && method != null && (method4 == null || method2 == null)) {
                    hashMap2.put("normal", "valid");
                    hashMap2.put("normalget", method3);
                    hashMap2.put("normalset", method);
                    hashMap2.put("normalPropertyType", obj);
                } else if (!(method3 == null && method == null) && method4 == null && method2 == null) {
                    hashMap2.put("normal", "valid");
                    hashMap2.put("normalget", method3);
                    hashMap2.put("normalset", method);
                    hashMap2.put("normalPropertyType", obj);
                } else {
                    if (!((method3 == null && method == null) || (method4 == null && method2 == null))) {
                        if (method3 == null || method == null || method4 == null || method2 == null) {
                            if (method3 != null && method == null && method4 != null && method2 != null) {
                                hashMap2.put("normal", "valid");
                                hashMap2.put("normalget", method3);
                                hashMap2.put("normalset", method);
                                hashMap2.put("normalPropertyType", obj);
                                hashMap2.put("indexed", "valid");
                                if (method4.getName().startsWith("get")) {
                                    hashMap2.put("indexedget", method4);
                                }
                                hashMap2.put("indexedset", method2);
                                hashMap2.put("indexedPropertyType", cls);
                            } else if (method3 == null && method != null && method4 != null && method2 != null) {
                                hashMap2.put("indexed", "valid");
                                if (method4.getName().startsWith("get")) {
                                    hashMap2.put("indexedget", method4);
                                }
                                hashMap2.put("indexedset", method2);
                                hashMap2.put("indexedPropertyType", cls);
                            } else if (method3 == null || method != null || method4 == null || method2 != null) {
                                if (method3 != null || method == null || method4 == null || method2 != null) {
                                    if (method3 != null && method == null && method4 == null && method2 != null) {
                                        hashMap2.put("indexed", "valid");
                                        hashMap2.put("indexedget", method4);
                                        hashMap2.put("indexedset", method2);
                                        hashMap2.put("indexedPropertyType", cls);
                                    } else if (method3 == null && method != null && method4 == null && method2 != null) {
                                        hashMap2.put("indexed", "valid");
                                        hashMap2.put("indexedget", method4);
                                        hashMap2.put("indexedset", method2);
                                        hashMap2.put("indexedPropertyType", cls);
                                    }
                                } else if (method4.getName().startsWith("get")) {
                                    hashMap2.put("normal", "valid");
                                    hashMap2.put("normalget", method3);
                                    hashMap2.put("normalset", method);
                                    hashMap2.put("normalPropertyType", obj);
                                    hashMap2.put("indexed", "valid");
                                    hashMap2.put("indexedget", method4);
                                    hashMap2.put("indexedset", method2);
                                    hashMap2.put("indexedPropertyType", cls);
                                } else {
                                    hashMap2.put("normal", "valid");
                                    hashMap2.put("normalget", method3);
                                    hashMap2.put("normalset", method);
                                    hashMap2.put("normalPropertyType", obj);
                                }
                            } else if (method4.getName().startsWith("get")) {
                                hashMap2.put("normal", "valid");
                                hashMap2.put("normalget", method3);
                                hashMap2.put("normalset", method);
                                hashMap2.put("normalPropertyType", obj);
                                hashMap2.put("indexed", "valid");
                                hashMap2.put("indexedget", method4);
                                hashMap2.put("indexedset", method2);
                                hashMap2.put("indexedPropertyType", cls);
                            } else {
                                hashMap2.put("normal", "valid");
                                hashMap2.put("normalget", method3);
                                hashMap2.put("normalset", method);
                                hashMap2.put("normalPropertyType", obj);
                            }
                        } else if (method4.getName().startsWith("get")) {
                            hashMap2.put("normal", "valid");
                            hashMap2.put("normalget", method3);
                            hashMap2.put("normalset", method);
                            hashMap2.put("normalPropertyType", obj);
                            hashMap2.put("indexed", "valid");
                            hashMap2.put("indexedget", method4);
                            hashMap2.put("indexedset", method2);
                            hashMap2.put("indexedPropertyType", cls);
                        } else if (obj == Boolean.TYPE || !method3.getName().startsWith("is")) {
                            hashMap2.put("normal", "valid");
                            hashMap2.put("normalget", method3);
                            hashMap2.put("normalset", method);
                            hashMap2.put("normalPropertyType", obj);
                        } else {
                            hashMap2.put("indexed", "valid");
                            hashMap2.put("indexedset", method2);
                            hashMap2.put("indexedPropertyType", cls);
                        }
                    }
                    if (method == null && method3 == null && (method4 != null || method2 != null)) {
                        if (method4 == null || !method4.getName().startsWith("is")) {
                            hashMap2.put("indexed", "valid");
                            hashMap2.put("indexedget", method4);
                            hashMap2.put("indexedset", method2);
                            hashMap2.put("indexedPropertyType", cls);
                        } else if (method2 != null) {
                            hashMap2.put("indexed", "valid");
                            hashMap2.put("indexedset", method2);
                            hashMap2.put("indexedPropertyType", cls);
                        }
                    } else if ((method == null && method3 == null) || method4 == null || method2 == null) {
                        hashMap2.put("normal", "invalid");
                        hashMap2.put("indexed", "invalid");
                    } else {
                        hashMap2.put("indexed", "valid");
                        hashMap2.put("indexedget", method4);
                        hashMap2.put("indexedset", method2);
                        hashMap2.put("indexedPropertyType", cls);
                    }
                }
            }
        }
    }

    private boolean isInSuper(MethodDescriptor methodDescriptor, MethodDescriptor[] methodDescriptorArr) {
        for (MethodDescriptor methodDescriptor2 : methodDescriptorArr) {
            if (methodDescriptor.method.equals(methodDescriptor2.method)) {
                return true;
            }
        }
        return false;
    }

    private static void mergeAttributes(PropertyDescriptor propertyDescriptor, PropertyDescriptor propertyDescriptor2) {
        propertyDescriptor.hidden |= propertyDescriptor2.hidden;
        propertyDescriptor.expert |= propertyDescriptor2.expert;
        propertyDescriptor.preferred |= propertyDescriptor2.preferred;
        propertyDescriptor.bound |= propertyDescriptor2.bound;
        propertyDescriptor.constrained |= propertyDescriptor2.constrained;
        propertyDescriptor.name = propertyDescriptor2.name;
        if (propertyDescriptor.shortDescription == null && propertyDescriptor2.shortDescription != null) {
            propertyDescriptor.shortDescription = propertyDescriptor2.shortDescription;
        }
        if (propertyDescriptor.displayName == null && propertyDescriptor2.displayName != null) {
            propertyDescriptor.displayName = propertyDescriptor2.displayName;
        }
    }

    private static void introspectGet(Method method, HashMap<String, HashMap> hashMap) {
        int i;
        String name = method.getName();
        if (name != null) {
            if (name.startsWith("get")) {
                i = 3;
            } else {
                i = 0;
            }
            if (name.startsWith("is")) {
                i = 2;
            }
            if (i != 0) {
                String decapitalize = Introspector.decapitalize(name.substring(i));
                if (isValidProperty(decapitalize)) {
                    Class returnType = method.getReturnType();
                    if (returnType != null && returnType != Void.TYPE) {
                        if (i != 2 || returnType == Boolean.TYPE) {
                            Class[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length <= 1 && (parameterTypes.length != 1 || parameterTypes[0] == Integer.TYPE)) {
                                HashMap hashMap2 = (HashMap) hashMap.get(decapitalize);
                                if (hashMap2 == null) {
                                    hashMap2 = new HashMap();
                                    hashMap.put(decapitalize, hashMap2);
                                }
                                ArrayList arrayList = (ArrayList) hashMap2.get("getters");
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    hashMap2.put("getters", arrayList);
                                }
                                arrayList.add(method);
                            }
                        }
                    }
                }
            }
        }
    }

    private static void introspectGetListenerMethods(Method method, HashMap<String, HashMap> hashMap) {
        String str = "get";
        String name = method.getName();
        if (name != null && name.startsWith(str) && name.endsWith("Listeners")) {
            String substring = name.substring(str.length(), name.length() - 1);
            String substring2 = substring.substring(0, substring.lastIndexOf("Listener"));
            if (substring2 != null && substring2.length() != 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes != null && parameterTypes.length == 0) {
                    Class returnType = method.getReturnType();
                    if (returnType.getComponentType() != null && returnType.getComponentType().getName().endsWith(substring)) {
                        HashMap hashMap2 = (HashMap) hashMap.get(substring2);
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                        }
                        hashMap2.put(str, method);
                        hashMap.put(substring2, hashMap2);
                    }
                }
            }
        }
    }

    private MethodDescriptor[] introspectMethods(boolean z, Class<?> cls) {
        Method[] methodArr;
        if (z) {
            methodArr = cls.getMethods();
        } else {
            methodArr = cls.getDeclaredMethods();
        }
        MethodDescriptor[] methodDescriptorArr = null;
        if (methodArr == null || methodArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(methodArr.length);
        for (int i = 0; i < methodArr.length; i++) {
            if (Modifier.isPublic(methodArr[i].getModifiers())) {
                arrayList.add(new MethodDescriptor(methodArr[i]));
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            methodDescriptorArr = (MethodDescriptor[]) arrayList.toArray(new MethodDescriptor[size]);
        }
        return methodDescriptorArr;
    }

    private EventSetDescriptor[] mergeEvents(EventSetDescriptor[] eventSetDescriptorArr, int i) {
        String str;
        HashMap internalAsMap = internalAsMap(this.events);
        if (this.defaultEventIndex >= 0 && this.defaultEventIndex < this.events.length) {
            str = this.events[this.defaultEventIndex].name;
        } else if (i < 0 || i >= eventSetDescriptorArr.length) {
            str = null;
        } else {
            str = eventSetDescriptorArr[i].name;
        }
        int i2 = 0;
        for (EventSetDescriptor eventSetDescriptor : eventSetDescriptorArr) {
            String str2 = eventSetDescriptor.name;
            EventSetDescriptor eventSetDescriptor2 = (EventSetDescriptor) internalAsMap.get(str2);
            if (eventSetDescriptor2 == null) {
                internalAsMap.put(str2, eventSetDescriptor);
            } else {
                eventSetDescriptor2.merge(eventSetDescriptor);
            }
        }
        EventSetDescriptor[] eventSetDescriptorArr2 = new EventSetDescriptor[internalAsMap.size()];
        internalAsMap.values().toArray(eventSetDescriptorArr2);
        if (str != null && !this.explicitEvents) {
            while (true) {
                if (i2 >= eventSetDescriptorArr2.length) {
                    break;
                } else if (str.equals(eventSetDescriptorArr2[i2].name)) {
                    this.defaultEventIndex = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return eventSetDescriptorArr2;
    }

    /* access modifiers changed from: 0000 */
    public void mergeBeanInfo(BeanInfo beanInfo, boolean z) throws IntrospectionException {
        if (z || !this.explicitProperties) {
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            if (propertyDescriptors != null) {
                if (getPropertyDescriptors() != null) {
                    this.properties = mergeProps(propertyDescriptors, beanInfo.getDefaultPropertyIndex());
                } else {
                    this.properties = propertyDescriptors;
                    this.defaultPropertyIndex = beanInfo.getDefaultPropertyIndex();
                }
            }
        }
        if (z || !this.explicitMethods) {
            MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
            if (methodDescriptors != null) {
                if (this.methods != null) {
                    this.methods = mergeMethods(methodDescriptors);
                } else {
                    this.methods = methodDescriptors;
                }
            }
        }
        if (z || !this.explicitEvents) {
            EventSetDescriptor[] eventSetDescriptors = beanInfo.getEventSetDescriptors();
            if (eventSetDescriptors != null) {
                if (this.events != null) {
                    this.events = mergeEvents(eventSetDescriptors, beanInfo.getDefaultEventIndex());
                } else {
                    this.events = eventSetDescriptors;
                    this.defaultEventIndex = beanInfo.getDefaultEventIndex();
                }
            }
        }
    }

    private static void introspectSet(Method method, HashMap<String, HashMap> hashMap) {
        String name = method.getName();
        if (name != null && method.getReturnType() == Void.TYPE && name != null && name.startsWith("set")) {
            String decapitalize = Introspector.decapitalize(name.substring(3));
            if (isValidProperty(decapitalize)) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 0 && parameterTypes.length <= 2) {
                    if (parameterTypes.length != 2 || parameterTypes[0] == Integer.TYPE) {
                        HashMap hashMap2 = (HashMap) hashMap.get(decapitalize);
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                            hashMap.put(decapitalize, hashMap2);
                        }
                        ArrayList arrayList = (ArrayList) hashMap2.get("setters");
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            hashMap2.put("setters", arrayList);
                        }
                        for (Class equals : method.getExceptionTypes()) {
                            if (equals.equals(PropertyVetoException.class)) {
                                hashMap2.put("isConstrained", Boolean.TRUE);
                            }
                        }
                        arrayList.add(method);
                    }
                }
            }
        }
    }

    private PropertyDescriptor[] mergeProps(PropertyDescriptor[] propertyDescriptorArr, int i) throws IntrospectionException {
        String str;
        String str2;
        Class<?> cls;
        Class<?> cls2;
        Method method;
        Method method2;
        PropertyDescriptor propertyDescriptor;
        Method method3;
        PropertyDescriptor[] propertyDescriptorArr2 = propertyDescriptorArr;
        int i2 = i;
        HashMap internalAsMap = internalAsMap(this.properties);
        if (this.defaultPropertyIndex >= 0 && this.defaultPropertyIndex < this.properties.length) {
            str = this.properties[this.defaultPropertyIndex].name;
        } else if (i2 < 0 || i2 >= propertyDescriptorArr2.length) {
            str = null;
        } else {
            str = propertyDescriptorArr2[i2].name;
        }
        int i3 = 0;
        while (i3 < propertyDescriptorArr2.length) {
            PropertyDescriptor propertyDescriptor2 = propertyDescriptorArr2[i3];
            String str3 = propertyDescriptor2.name;
            if (!internalAsMap.containsKey(str3)) {
                internalAsMap.put(str3, propertyDescriptor2);
                str2 = str;
            } else {
                Object obj = internalAsMap.get(str3);
                PropertyDescriptor propertyDescriptor3 = (PropertyDescriptor) obj;
                Method method4 = propertyDescriptor3.getter;
                Method method5 = propertyDescriptor3.setter;
                Method method6 = propertyDescriptor2.getter;
                Method method7 = propertyDescriptor2.setter;
                Class propertyType = propertyDescriptor2.getPropertyType();
                Class propertyType2 = propertyDescriptor3.getPropertyType();
                if (obj instanceof IndexedPropertyDescriptor) {
                    cls = ((IndexedPropertyDescriptor) obj).indexedPropertyType;
                } else {
                    cls = null;
                }
                if (propertyDescriptor2 instanceof IndexedPropertyDescriptor) {
                    cls2 = ((IndexedPropertyDescriptor) propertyDescriptor2).indexedPropertyType;
                    str2 = str;
                } else {
                    str2 = str;
                    cls2 = null;
                }
                if (cls2 == null) {
                    if (cls != null) {
                        if (propertyType != null && propertyType.isArray() && propertyType.getComponentType().getName().equals(cls.getName())) {
                            if (method4 == null && method6 != null) {
                                propertyDescriptor3.setReadMethod(method6);
                            }
                            if (method5 == null && method7 != null) {
                                propertyDescriptor3.setWriteMethod(method7);
                            }
                        }
                        if (cls == Boolean.TYPE && propertyType == Boolean.TYPE) {
                            Method method8 = ((IndexedPropertyDescriptor) propertyDescriptor3).indexedSetter;
                            if (method4 == null && method5 == null && method8 != null && method6 != null) {
                                try {
                                    method3 = this.beanClass.getDeclaredMethod(method8.getName(), new Class[]{Boolean.TYPE});
                                } catch (Exception unused) {
                                    method3 = method5;
                                }
                                if (method3 != null) {
                                    propertyDescriptor = new PropertyDescriptor(str3, method6, method3);
                                    internalAsMap.put(str3, propertyDescriptor);
                                }
                            }
                        }
                    } else if (propertyType2 != null && propertyType != null && propertyType2.getName() != null && propertyType2.getName().equals(propertyType.getName())) {
                        if (method6 != null && (method4 == null || method6.equals(method4))) {
                            propertyDescriptor3.setReadMethod(method6);
                        }
                        if (method7 != null && (method5 == null || method7.equals(method5))) {
                            propertyDescriptor3.setWriteMethod(method7);
                        }
                        if (propertyType2 == Boolean.TYPE && method4 != null && method6 != null && method6.getName().startsWith("is")) {
                            propertyDescriptor3.setReadMethod(method6);
                        }
                    } else if ((method4 == null || method5 == null) && method6 != null) {
                        propertyDescriptor = new PropertyDescriptor(str3, method6, method7);
                        if (method4 != null) {
                            String name = method4.getName();
                            MethodDescriptor[] introspectMethods = introspectMethods();
                            int length = introspectMethods.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    break;
                                }
                                Method method9 = introspectMethods[i4].method;
                                if (method9 != method4 && name.equals(method9.getName()) && method9.getParameterTypes().length == 0 && method9.getReturnType() == propertyType) {
                                    propertyDescriptor.setReadMethod(method9);
                                    break;
                                }
                                i4++;
                            }
                        }
                        internalAsMap.put(str3, propertyDescriptor);
                    }
                    propertyDescriptor = propertyDescriptor3;
                    internalAsMap.put(str3, propertyDescriptor);
                } else {
                    if (cls == null) {
                        if (propertyType2 == null || !propertyType2.isArray() || !propertyType2.getComponentType().getName().equals(cls2.getName())) {
                            if (method4 == null || method5 == null) {
                                Class superclass = this.beanClass.getSuperclass();
                                String capitalize = capitalize(str3);
                                if (method4 == null) {
                                    if (propertyType2 == Boolean.TYPE) {
                                        try {
                                            StringBuilder sb = new StringBuilder("is");
                                            sb.append(capitalize);
                                            method2 = superclass.getDeclaredMethod(sb.toString(), new Class[0]);
                                        } catch (Exception unused2) {
                                            method2 = null;
                                        }
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("get");
                                        sb2.append(capitalize);
                                        method2 = superclass.getDeclaredMethod(sb2.toString(), new Class[0]);
                                    }
                                    if (method2 != null && !Modifier.isStatic(method2.getModifiers()) && method2.getReturnType() == propertyType2) {
                                        propertyDescriptor3.setReadMethod(method2);
                                    }
                                } else {
                                    try {
                                        StringBuilder sb3 = new StringBuilder("set");
                                        sb3.append(capitalize);
                                        String sb4 = sb3.toString();
                                        Class[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = propertyType2;
                                            method = superclass.getDeclaredMethod(sb4, clsArr);
                                        } catch (Exception unused3) {
                                            method = null;
                                            propertyDescriptor3.setWriteMethod(method);
                                            internalAsMap.put(str3, propertyDescriptor3);
                                            mergeAttributes(propertyDescriptor3, propertyDescriptor2);
                                            i3++;
                                            str = str2;
                                            propertyDescriptorArr2 = propertyDescriptorArr;
                                        }
                                    } catch (Exception unused4) {
                                        method = null;
                                        propertyDescriptor3.setWriteMethod(method);
                                        internalAsMap.put(str3, propertyDescriptor3);
                                        mergeAttributes(propertyDescriptor3, propertyDescriptor2);
                                        i3++;
                                        str = str2;
                                        propertyDescriptorArr2 = propertyDescriptorArr;
                                    }
                                    if (method != null && !Modifier.isStatic(method.getModifiers()) && method.getReturnType() == Void.TYPE) {
                                        propertyDescriptor3.setWriteMethod(method);
                                    }
                                    internalAsMap.put(str3, propertyDescriptor3);
                                }
                            }
                            internalAsMap.put(str3, propertyDescriptor3);
                        } else {
                            if (method4 != null) {
                                propertyDescriptor2.setReadMethod(method4);
                            }
                            if (method5 != null) {
                                propertyDescriptor2.setWriteMethod(method5);
                            }
                            internalAsMap.put(str3, propertyDescriptor2);
                        }
                    } else if (cls.getName().equals(cls2.getName())) {
                        IndexedPropertyDescriptor indexedPropertyDescriptor = (IndexedPropertyDescriptor) obj;
                        if (method4 == null && method6 != null) {
                            indexedPropertyDescriptor.setReadMethod(method6);
                        }
                        if (method5 == null && method7 != null) {
                            indexedPropertyDescriptor.setWriteMethod(method7);
                        }
                        IndexedPropertyDescriptor indexedPropertyDescriptor2 = (IndexedPropertyDescriptor) propertyDescriptor2;
                        if (indexedPropertyDescriptor.indexedGetter == null && indexedPropertyDescriptor2.indexedGetter != null) {
                            indexedPropertyDescriptor.setIndexedReadMethod(indexedPropertyDescriptor2.indexedGetter);
                        }
                        if (indexedPropertyDescriptor.indexedSetter == null && indexedPropertyDescriptor2.indexedSetter != null) {
                            indexedPropertyDescriptor.setIndexedWriteMethod(indexedPropertyDescriptor2.indexedSetter);
                        }
                        internalAsMap.put(str3, indexedPropertyDescriptor);
                    }
                    mergeAttributes(propertyDescriptor3, propertyDescriptor2);
                }
                mergeAttributes(propertyDescriptor3, propertyDescriptor2);
            }
            i3++;
            str = str2;
            propertyDescriptorArr2 = propertyDescriptorArr;
        }
        String str4 = str;
        int i5 = 0;
        PropertyDescriptor[] propertyDescriptorArr3 = new PropertyDescriptor[internalAsMap.size()];
        internalAsMap.values().toArray(propertyDescriptorArr3);
        if (str4 != null && !this.explicitProperties) {
            while (true) {
                if (i5 >= propertyDescriptorArr3.length) {
                    break;
                }
                String str5 = str4;
                if (str5.equals(propertyDescriptorArr3[i5].name)) {
                    this.defaultPropertyIndex = i5;
                    break;
                }
                i5++;
                str4 = str5;
            }
        }
        return propertyDescriptorArr3;
    }

    StandardBeanInfo(Class<?> cls, BeanInfo beanInfo, Class<?> cls2) throws IntrospectionException {
        this.beanClass = cls;
        if (beanInfo != null) {
            this.explicitBeanInfo = beanInfo;
            this.events = beanInfo.getEventSetDescriptors();
            this.methods = beanInfo.getMethodDescriptors();
            this.properties = beanInfo.getPropertyDescriptors();
            this.defaultEventIndex = beanInfo.getDefaultEventIndex();
            if (this.defaultEventIndex < 0 || this.defaultEventIndex >= this.events.length) {
                this.defaultEventIndex = -1;
            }
            this.defaultPropertyIndex = beanInfo.getDefaultPropertyIndex();
            if (this.defaultPropertyIndex < 0 || this.defaultPropertyIndex >= this.properties.length) {
                this.defaultPropertyIndex = -1;
            }
            this.additionalBeanInfo = beanInfo.getAdditionalBeanInfo();
            if (this.events != null) {
                this.explicitEvents = true;
            }
            if (this.methods != null) {
                this.explicitMethods = true;
            }
            if (this.properties != null) {
                this.explicitProperties = true;
            }
        }
        if (this.methods == null) {
            this.methods = introspectMethods();
        }
        if (this.properties == null) {
            this.properties = introspectProperties(cls2);
        }
        if (this.events == null) {
            this.events = introspectEvents();
        }
    }

    private static void introspectListenerMethods(String str, Method method, HashMap<String, HashMap> hashMap) {
        String name = method.getName();
        if (name != null && name.startsWith(str) && name.endsWith("Listener")) {
            String substring = name.substring(str.length());
            int i = 0;
            String substring2 = substring.substring(0, substring.lastIndexOf("Listener"));
            if (substring2 != null && substring2.length() != 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes != null && parameterTypes.length == 1) {
                    Class cls = parameterTypes[0];
                    if (EventListener.class.isAssignableFrom(cls) && cls.getName().endsWith(substring)) {
                        HashMap hashMap2 = (HashMap) hashMap.get(substring2);
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                        }
                        if (hashMap2.get("listenerType") == null) {
                            hashMap2.put("listenerType", cls);
                            hashMap2.put("listenerMethods", introspectListenerMethods(cls));
                        }
                        hashMap2.put(str, method);
                        if (str.equals("add")) {
                            Class[] exceptionTypes = method.getExceptionTypes();
                            if (exceptionTypes != null) {
                                while (true) {
                                    if (i >= exceptionTypes.length) {
                                        break;
                                    } else if (exceptionTypes[i].getName().equals(TooManyListenersException.class.getName())) {
                                        hashMap2.put("isUnicast", "true");
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                        hashMap.put(substring2, hashMap2);
                    }
                }
            }
        }
    }
}
