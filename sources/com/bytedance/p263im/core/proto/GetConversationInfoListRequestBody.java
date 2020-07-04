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

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoListRequestBody */
public final class GetConversationInfoListRequestBody extends Message<GetConversationInfoListRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoListRequestBody> ADAPTER = new ProtoAdapter_GetConversationInfoListRequestBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationInfoRequestBody#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<GetConversationInfoRequestBody> conversation_info_list;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationInfoListRequestBody, Builder> {
        public List<GetConversationInfoRequestBody> conversation_info_list = Internal.newMutableList();

        public final GetConversationInfoListRequestBody build() {
            return new GetConversationInfoListRequestBody(this.conversation_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_info_list(List<GetConversationInfoRequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListRequestBody$ProtoAdapter_GetConversationInfoListRequestBody */
    static final class ProtoAdapter_GetConversationInfoListRequestBody extends ProtoAdapter<GetConversationInfoListRequestBody> {
        public ProtoAdapter_GetConversationInfoListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListRequestBody.class);
        }

        public final int encodedSize(GetConversationInfoListRequestBody getConversationInfoListRequestBody) {
            return GetConversationInfoRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListRequestBody.conversation_info_list) + getConversationInfoListRequestBody.unknownFields().size();
        }

        public final GetConversationInfoListRequestBody redact(GetConversationInfoListRequestBody getConversationInfoListRequestBody) {
            Builder newBuilder = getConversationInfoListRequestBody.newBuilder();
            Internal.redactElements(newBuilder.conversation_info_list, GetConversationInfoRequestBody.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationInfoListRequestBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation_info_list.add(GetConversationInfoRequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoListRequestBody getConversationInfoListRequestBody) throws IOException {
            GetConversationInfoRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListRequestBody.conversation_info_list);
            protoWriter.writeBytes(getConversationInfoListRequestBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.conversation_info_list.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.conversation_info_list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationInfoListRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationInfoListRequestBody(List<GetConversationInfoRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationInfoListRequestBody)) {
            return false;
        }
        GetConversationInfoListRequestBody getConversationInfoListRequestBody = (GetConversationInfoListRequestBody) obj;
        if (!unknownFields().equals(getConversationInfoListRequestBody.unknownFields()) || !this.conversation_info_list.equals(getConversationInfoListRequestBody.conversation_info_list)) {
            return false;
        }
        return true;
    }

    public GetConversationInfoListRequestBody(List<GetConversationInfoRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
    }
}
