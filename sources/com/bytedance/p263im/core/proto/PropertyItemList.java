package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.PropertyItemList */
public final class PropertyItemList extends Message<PropertyItemList, Builder> {
    public static final ProtoAdapter<PropertyItemList> ADAPTER = new ProtoAdapter_PropertyItemList();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.PropertyItem#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<PropertyItem> Items;

    /* renamed from: com.bytedance.im.core.proto.PropertyItemList$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PropertyItemList, Builder> {
        public List<PropertyItem> Items = Internal.newMutableList();

        public final PropertyItemList build() {
            return new PropertyItemList(this.Items, super.buildUnknownFields());
        }

        public final Builder Items(List<PropertyItem> list) {
            Internal.checkElementsNotNull(list);
            this.Items = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.PropertyItemList$ProtoAdapter_PropertyItemList */
    static final class ProtoAdapter_PropertyItemList extends ProtoAdapter<PropertyItemList> {
        public ProtoAdapter_PropertyItemList() {
            super(FieldEncoding.LENGTH_DELIMITED, PropertyItemList.class);
        }

        public final int encodedSize(PropertyItemList propertyItemList) {
            return PropertyItem.ADAPTER.asRepeated().encodedSizeWithTag(1, propertyItemList.Items) + propertyItemList.unknownFields().size();
        }

        public final PropertyItemList redact(PropertyItemList propertyItemList) {
            Builder newBuilder = propertyItemList.newBuilder();
            Internal.redactElements(newBuilder.Items, PropertyItem.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final PropertyItemList decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.Items.add(PropertyItem.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PropertyItemList propertyItemList) throws IOException {
            PropertyItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, propertyItemList.Items);
            protoWriter.writeBytes(propertyItemList.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.Items.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.Items = Internal.copyOf("Items", this.Items);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.Items.isEmpty()) {
            sb.append(", Items=");
            sb.append(this.Items);
        }
        StringBuilder replace = sb.replace(0, 2, "PropertyItemList{");
        replace.append('}');
        return replace.toString();
    }

    public PropertyItemList(List<PropertyItem> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PropertyItemList)) {
            return false;
        }
        PropertyItemList propertyItemList = (PropertyItemList) obj;
        if (!unknownFields().equals(propertyItemList.unknownFields()) || !this.Items.equals(propertyItemList.Items)) {
            return false;
        }
        return true;
    }

    public PropertyItemList(List<PropertyItem> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.Items = Internal.immutableCopyOf("Items", list);
    }
}
