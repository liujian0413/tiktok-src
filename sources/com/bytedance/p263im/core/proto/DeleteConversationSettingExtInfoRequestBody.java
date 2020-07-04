package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DeleteConversationSettingExtInfoRequestBody */
public final class DeleteConversationSettingExtInfoRequestBody extends Message<DeleteConversationSettingExtInfoRequestBody, Builder> {
    public static final ProtoAdapter<DeleteConversationSettingExtInfoRequestBody> ADAPTER = new ProtoAdapter_DeleteConversationSettingExtInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, String> ext;

    /* renamed from: com.bytedance.im.core.proto.DeleteConversationSettingExtInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteConversationSettingExtInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Map<String, String> ext = Internal.newMutableMap();

        public final DeleteConversationSettingExtInfoRequestBody build() {
            return new DeleteConversationSettingExtInfoRequestBody(this.conversation_id, this.conversation_short_id, this.ext, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteConversationSettingExtInfoRequestBody$ProtoAdapter_DeleteConversationSettingExtInfoRequestBody */
    static final class ProtoAdapter_DeleteConversationSettingExtInfoRequestBody extends ProtoAdapter<DeleteConversationSettingExtInfoRequestBody> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_DeleteConversationSettingExtInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteConversationSettingExtInfoRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final DeleteConversationSettingExtInfoRequestBody redact(DeleteConversationSettingExtInfoRequestBody deleteConversationSettingExtInfoRequestBody) {
            Builder newBuilder = deleteConversationSettingExtInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(DeleteConversationSettingExtInfoRequestBody deleteConversationSettingExtInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteConversationSettingExtInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, deleteConversationSettingExtInfoRequestBody.conversation_short_id) + this.ext.encodedSizeWithTag(3, deleteConversationSettingExtInfoRequestBody.ext) + deleteConversationSettingExtInfoRequestBody.unknownFields().size();
        }

        public final DeleteConversationSettingExtInfoRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, DeleteConversationSettingExtInfoRequestBody deleteConversationSettingExtInfoRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteConversationSettingExtInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, deleteConversationSettingExtInfoRequestBody.conversation_short_id);
            this.ext.encodeWithTag(protoWriter, 3, deleteConversationSettingExtInfoRequestBody.ext);
            protoWriter.writeBytes(deleteConversationSettingExtInfoRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.conversation_short_id != null) {
            i3 = this.conversation_short_id.hashCode();
        }
        int hashCode2 = ((i4 + i3) * 37) + this.ext.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteConversationSettingExtInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteConversationSettingExtInfoRequestBody)) {
            return false;
        }
        DeleteConversationSettingExtInfoRequestBody deleteConversationSettingExtInfoRequestBody = (DeleteConversationSettingExtInfoRequestBody) obj;
        if (!unknownFields().equals(deleteConversationSettingExtInfoRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, deleteConversationSettingExtInfoRequestBody.conversation_id) || !Internal.equals(this.conversation_short_id, deleteConversationSettingExtInfoRequestBody.conversation_short_id) || !this.ext.equals(deleteConversationSettingExtInfoRequestBody.ext)) {
            return false;
        }
        return true;
    }

    public DeleteConversationSettingExtInfoRequestBody(String str, Long l, Map<String, String> map) {
        this(str, l, map, ByteString.EMPTY);
    }

    public DeleteConversationSettingExtInfoRequestBody(String str, Long l, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.ext = Internal.immutableCopyOf("ext", map);
    }
}
