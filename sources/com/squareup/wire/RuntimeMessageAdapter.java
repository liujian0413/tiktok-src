package com.squareup.wire;

import com.C1642a;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class RuntimeMessageAdapter<M extends Message<M, B>, B extends Builder<M, B>> extends ProtoAdapter<M> {
    private final Class<B> builderType;
    private final Map<Integer, FieldBinding<M, B>> fieldBindings;
    private final Class<M> messageType;

    /* access modifiers changed from: 0000 */
    public final Map<Integer, FieldBinding<M, B>> fieldBindings() {
        return this.fieldBindings;
    }

    public final int hashCode() {
        return this.messageType.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public final B newBuilder() {
        try {
            return (Builder) this.builderType.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RuntimeMessageAdapter) || ((RuntimeMessageAdapter) obj).messageType != this.messageType) {
            return false;
        }
        return true;
    }

    static <M extends Message<M, B>, B extends Builder<M, B>> RuntimeMessageAdapter<M, B> create(Class<M> cls) {
        Field[] declaredFields;
        Class builderType2 = getBuilderType(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : cls.getDeclaredFields()) {
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, field, builderType2));
            }
        }
        return new RuntimeMessageAdapter<>(cls, builderType2, Collections.unmodifiableMap(linkedHashMap));
    }

    private static <M extends Message<M, B>, B extends Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append("$Builder");
            return Class.forName(sb.toString());
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder("No builder class found for message type ");
            sb2.append(cls.getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int encodedSize(M m) {
        int i = m.cachedSerializedSize;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        for (FieldBinding fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                i2 += fieldBinding.adapter().encodedSizeWithTag(fieldBinding.tag, obj);
            }
        }
        int size = i2 + m.unknownFields().size();
        m.cachedSerializedSize = size;
        return size;
    }

    public final M decode(ProtoReader protoReader) throws IOException {
        ProtoAdapter protoAdapter;
        Builder newBuilder = newBuilder();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldBinding fieldBinding = (FieldBinding) this.fieldBindings.get(Integer.valueOf(nextTag));
                if (fieldBinding != null) {
                    try {
                        if (fieldBinding.isMap()) {
                            protoAdapter = fieldBinding.adapter();
                        } else {
                            protoAdapter = fieldBinding.singleAdapter();
                        }
                        fieldBinding.value(newBuilder, protoAdapter.decode(protoReader));
                    } catch (EnumConstantNotFoundException e) {
                        newBuilder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    newBuilder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return newBuilder.build();
            }
        }
    }

    public final String toString(M m) {
        StringBuilder sb = new StringBuilder();
        for (FieldBinding fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                sb.append(", ");
                sb.append(fieldBinding.name);
                sb.append('=');
                if (fieldBinding.redacted) {
                    obj = "██";
                }
                sb.append(obj);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.messageType.getSimpleName());
        sb2.append('{');
        sb.replace(0, 2, sb2.toString());
        sb.append('}');
        return sb.toString();
    }

    public final M redact(M m) {
        Builder newBuilder = m.newBuilder();
        for (FieldBinding fieldBinding : this.fieldBindings.values()) {
            if (!fieldBinding.redacted || fieldBinding.label != Label.REQUIRED) {
                boolean isAssignableFrom = Message.class.isAssignableFrom(fieldBinding.singleAdapter().javaType);
                if (fieldBinding.redacted || (isAssignableFrom && !fieldBinding.label.isRepeated())) {
                    Object fromBuilder = fieldBinding.getFromBuilder(newBuilder);
                    if (fromBuilder != null) {
                        fieldBinding.set(newBuilder, fieldBinding.adapter().redact(fromBuilder));
                    }
                } else if (isAssignableFrom && fieldBinding.label.isRepeated()) {
                    Internal.redactElements((List) fieldBinding.getFromBuilder(newBuilder), fieldBinding.singleAdapter());
                }
            } else {
                throw new UnsupportedOperationException(C1642a.m8034a("Field '%s' in %s is required and cannot be redacted.", new Object[]{fieldBinding.name, this.javaType.getName()}));
            }
        }
        newBuilder.clearUnknownFields();
        return newBuilder.build();
    }

    public final void encode(ProtoWriter protoWriter, M m) throws IOException {
        for (FieldBinding fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                fieldBinding.adapter().encodeWithTag(protoWriter, fieldBinding.tag, obj);
            }
        }
        protoWriter.writeBytes(m.unknownFields());
    }

    RuntimeMessageAdapter(Class<M> cls, Class<B> cls2, Map<Integer, FieldBinding<M, B>> map) {
        super(FieldEncoding.LENGTH_DELIMITED, cls);
        this.messageType = cls;
        this.builderType = cls2;
        this.fieldBindings = map;
    }
}
