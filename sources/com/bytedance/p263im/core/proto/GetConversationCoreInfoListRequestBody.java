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

/* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoListRequestBody */
public final class GetConversationCoreInfoListRequestBody extends Message<GetConversationCoreInfoListRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationCoreInfoListRequestBody> ADAPTER = new ProtoAdapter_GetConversationCoreInfoListRequestBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationCoreInfoRequestBody#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<GetConversationCoreInfoRequestBody> conversation_core_info_list;

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoListRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationCoreInfoListRequestBody, Builder> {
        public List<GetConversationCoreInfoRequestBody> conversation_core_info_list = Internal.newMutableList();

        public final GetConversationCoreInfoListRequestBody build() {
            return new GetConversationCoreInfoListRequestBody(this.conversation_core_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_core_info_list(List<GetConversationCoreInfoRequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_core_info_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoListRequestBody$ProtoAdapter_GetConversationCoreInfoListRequestBody */
    static final class ProtoAdapter_GetConversationCoreInfoListRequestBody extends ProtoAdapter<GetConversationCoreInfoListRequestBody> {
        public ProtoAdapter_GetConversationCoreInfoListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationCoreInfoListRequestBody.class);
        }

        public final int encodedSize(GetConversationCoreInfoListRequestBody getConversationCoreInfoListRequestBody) {
            return GetConversationCoreInfoRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationCoreInfoListRequestBody.conversation_core_info_list) + getConversationCoreInfoListRequestBody.unknownFields().size();
        }

        public final GetConversationCoreInfoListRequestBody redact(GetConversationCoreInfoListRequestBody getConversationCoreInfoListRequestBody) {
            Builder newBuilder = getConversationCoreInfoListRequestBody.newBuilder();
            Internal.redactElements(newBuilder.conversation_core_info_list, GetConversationCoreInfoRequestBody.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationCoreInfoListRequestBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation_core_info_list.add(GetConversationCoreInfoRequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationCoreInfoListRequestBody getConversationCoreInfoListRequestBody) throws IOException {
            GetConversationCoreInfoRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationCoreInfoListRequestBody.conversation_core_info_list);
            protoWriter.writeBytes(getConversationCoreInfoListRequestBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.conversation_core_info_list.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_core_info_list = Internal.copyOf("conversation_core_info_list", this.conversation_core_info_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.conversation_core_info_list.isEmpty()) {
            sb.append(", conversation_core_info_list=");
            sb.append(this.conversation_core_info_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationCoreInfoListRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationCoreInfoListRequestBody(List<GetConversationCoreInfoRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationCoreInfoListRequestBody)) {
            return false;
        }
        GetConversationCoreInfoListRequestBody getConversationCoreInfoListRequestBody = (GetConversationCoreInfoListRequestBody) obj;
        if (!unknownFields().equals(getConversationCoreInfoListRequestBody.unknownFields()) || !this.conversation_core_info_list.equals(getConversationCoreInfoListRequestBody.conversation_core_info_list)) {
            return false;
        }
        return true;
    }

    public GetConversationCoreInfoListRequestBody(List<GetConversationCoreInfoRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_core_info_list = Internal.immutableCopyOf("conversation_core_info_list", list);
    }
}
