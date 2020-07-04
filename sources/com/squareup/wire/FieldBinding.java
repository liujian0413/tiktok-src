package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField.Label;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

final class FieldBinding<M extends Message<M, B>, B extends Builder<M, B>> {
    private ProtoAdapter<Object> adapter;
    private final String adapterString;
    private final Field builderField;
    private final Method builderMethod;
    private ProtoAdapter<?> keyAdapter;
    private final String keyAdapterString;
    public final Label label;
    private final Field messageField;
    public final String name;
    public final boolean redacted;
    private ProtoAdapter<?> singleAdapter;
    public final int tag;

    /* access modifiers changed from: 0000 */
    public final boolean isMap() {
        if (!this.keyAdapterString.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final ProtoAdapter<?> keyAdapter() {
        ProtoAdapter<?> protoAdapter = this.keyAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.keyAdapterString);
        this.keyAdapter = protoAdapter2;
        return protoAdapter2;
    }

    /* access modifiers changed from: 0000 */
    public final ProtoAdapter<?> singleAdapter() {
        ProtoAdapter<?> protoAdapter = this.singleAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.adapterString);
        this.singleAdapter = protoAdapter2;
        return protoAdapter2;
    }

    /* access modifiers changed from: 0000 */
    public final ProtoAdapter<Object> adapter() {
        ProtoAdapter<Object> protoAdapter = this.adapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        if (isMap()) {
            ProtoAdapter<Object> newMapAdapter = ProtoAdapter.newMapAdapter(keyAdapter(), singleAdapter());
            this.adapter = newMapAdapter;
            return newMapAdapter;
        }
        ProtoAdapter<Object> withLabel = singleAdapter().withLabel(this.label);
        this.adapter = withLabel;
        return withLabel;
    }

    /* access modifiers changed from: 0000 */
    public final Object get(M m) {
        try {
            return this.messageField.get(m);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final Object getFromBuilder(B b) {
        try {
            return this.builderField.get(b);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    private static Field getBuilderField(Class<?> cls, String str) {
        try {
            return cls.getField(str);
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder("No builder field ");
            sb.append(cls.getName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str);
            throw new AssertionError(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void set(B b, Object obj) {
        try {
            if (this.label.isOneOf()) {
                this.builderMethod.invoke(b, new Object[]{obj});
                return;
            }
            this.builderField.set(b, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void value(B b, Object obj) {
        if (this.label.isRepeated()) {
            ((List) getFromBuilder(b)).add(obj);
        } else if (!this.keyAdapterString.isEmpty()) {
            ((Map) getFromBuilder(b)).putAll((Map) obj);
        } else {
            set(b, obj);
        }
    }

    FieldBinding(WireField wireField, Field field, Class<B> cls) {
        this.label = wireField.label();
        this.name = field.getName();
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.messageField = field;
        this.builderField = getBuilderField(cls, this.name);
        this.builderMethod = getBuilderMethod(cls, this.name, field.getType());
    }

    private static Method getBuilderMethod(Class<?> cls, String str, Class<?> cls2) {
        try {
            return cls.getMethod(str, new Class[]{cls2});
        } catch (NoSuchMethodException unused) {
            StringBuilder sb = new StringBuilder("No builder method ");
            sb.append(cls.getName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str);
            sb.append("(");
            sb.append(cls2.getName());
            sb.append(")");
            throw new AssertionError(sb.toString());
        }
    }
}
