package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetConversationSettingInfoRequestBody */
public final class GetConversationSettingInfoRequestBody extends Message<GetConversationSettingInfoRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationSettingInfoRequestBody> ADAPTER = new ProtoAdapter_GetConversationSettingInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;

    /* renamed from: com.bytedance.im.core.proto.GetConversationSettingInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationSettingInfoRequestBody, Builder> {
        public Long conversation_short_id;

        public final GetConversationSettingInfoRequestBody build() {
            return new GetConversationSettingInfoRequestBody(this.conversation_short_id, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationSettingInfoRequestBody$ProtoAdapter_GetConversationSettingInfoRequestBody */
    static final class ProtoAdapter_GetConversationSettingInfoRequestBody extends ProtoAdapter<GetConversationSettingInfoRequestBody> {
        public ProtoAdapter_GetConversationSettingInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationSettingInfoRequestBody.class);
        }

        public final GetConversationSettingInfoRequestBody redact(GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody) {
            Builder newBuilder = getConversationSettingInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationSettingInfoRequestBody.conversation_short_id) + getConversationSettingInfoRequestBody.unknownFields().size();
        }

        public final GetConversationSettingInfoRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getConversationSettingInfoRequestBody.conversation_short_id);
            protoWriter.writeBytes(getConversationSettingInfoRequestBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.conversation_short_id != null) {
            i = this.conversation_short_id.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationSettingInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationSettingInfoRequestBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationSettingInfoRequestBody)) {
            return false;
        }
        GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody = (GetConversationSettingInfoRequestBody) obj;
        if (!unknownFields().equals(getConversationSettingInfoRequestBody.unknownFields()) || !Internal.equals(this.conversation_short_id, getConversationSettingInfoRequestBody.conversation_short_id)) {
            return false;
        }
        return true;
    }

    public GetConversationSettingInfoRequestBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
    }
}
