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

/* renamed from: com.bytedance.im.core.proto.ModifyPropertyBody */
public final class ModifyPropertyBody extends Message<ModifyPropertyBody, Builder> {
    public static final ProtoAdapter<ModifyPropertyBody> ADAPTER = new ProtoAdapter_ModifyPropertyBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_SERVER_MESSAGE_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String client_message_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer conversation_type;
    @WireField(adapter = "com.bytedance.im.core.proto.ModifyPropertyContent#ADAPTER", label = Label.REPEATED, tag = 6)
    public final List<ModifyPropertyContent> modify_property_content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long server_message_id;

    /* renamed from: com.bytedance.im.core.proto.ModifyPropertyBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ModifyPropertyBody, Builder> {
        public String client_message_id;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<ModifyPropertyContent> modify_property_content = Internal.newMutableList();
        public Long server_message_id;

        public final ModifyPropertyBody build() {
            ModifyPropertyBody modifyPropertyBody = new ModifyPropertyBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.server_message_id, this.client_message_id, this.modify_property_content, super.buildUnknownFields());
            return modifyPropertyBody;
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }

        public final Builder modify_property_content(List<ModifyPropertyContent> list) {
            Internal.checkElementsNotNull(list);
            this.modify_property_content = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ModifyPropertyBody$ProtoAdapter_ModifyPropertyBody */
    static final class ProtoAdapter_ModifyPropertyBody extends ProtoAdapter<ModifyPropertyBody> {
        public ProtoAdapter_ModifyPropertyBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyPropertyBody.class);
        }

        public final ModifyPropertyBody redact(ModifyPropertyBody modifyPropertyBody) {
            Builder newBuilder = modifyPropertyBody.newBuilder();
            Internal.redactElements(newBuilder.modify_property_content, ModifyPropertyContent.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ModifyPropertyBody modifyPropertyBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, modifyPropertyBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, modifyPropertyBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, modifyPropertyBody.conversation_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, modifyPropertyBody.server_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, modifyPropertyBody.client_message_id) + ModifyPropertyContent.ADAPTER.asRepeated().encodedSizeWithTag(6, modifyPropertyBody.modify_property_content) + modifyPropertyBody.unknownFields().size();
        }

        public final ModifyPropertyBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.server_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.client_message_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.modify_property_content.add(ModifyPropertyContent.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ModifyPropertyBody modifyPropertyBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, modifyPropertyBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, modifyPropertyBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, modifyPropertyBody.conversation_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, modifyPropertyBody.server_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, modifyPropertyBody.client_message_id);
            ModifyPropertyContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, modifyPropertyBody.modify_property_content);
            protoWriter.writeBytes(modifyPropertyBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.server_message_id = this.server_message_id;
        builder.client_message_id = this.client_message_id;
        builder.modify_property_content = Internal.copyOf("modify_property_content", this.modify_property_content);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.conversation_type != null) {
            i2 = this.conversation_type.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.conversation_short_id != null) {
            i3 = this.conversation_short_id.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.server_message_id != null) {
            i4 = this.server_message_id.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.client_message_id != null) {
            i6 = this.client_message_id.hashCode();
        }
        int hashCode2 = ((i10 + i6) * 37) + this.modify_property_content.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        if (!this.modify_property_content.isEmpty()) {
            sb.append(", modify_property_content=");
            sb.append(this.modify_property_content);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifyPropertyBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModifyPropertyBody)) {
            return false;
        }
        ModifyPropertyBody modifyPropertyBody = (ModifyPropertyBody) obj;
        if (!unknownFields().equals(modifyPropertyBody.unknownFields()) || !Internal.equals(this.conversation_id, modifyPropertyBody.conversation_id) || !Internal.equals(this.conversation_type, modifyPropertyBody.conversation_type) || !Internal.equals(this.conversation_short_id, modifyPropertyBody.conversation_short_id) || !Internal.equals(this.server_message_id, modifyPropertyBody.server_message_id) || !Internal.equals(this.client_message_id, modifyPropertyBody.client_message_id) || !this.modify_property_content.equals(modifyPropertyBody.modify_property_content)) {
            return false;
        }
        return true;
    }

    public ModifyPropertyBody(String str, Integer num, Long l, Long l2, String str2, List<ModifyPropertyContent> list) {
        this(str, num, l, l2, str2, list, ByteString.EMPTY);
    }

    public ModifyPropertyBody(String str, Integer num, Long l, Long l2, String str2, List<ModifyPropertyContent> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = l2;
        this.client_message_id = str2;
        this.modify_property_content = Internal.immutableCopyOf("modify_property_content", list);
    }
}
