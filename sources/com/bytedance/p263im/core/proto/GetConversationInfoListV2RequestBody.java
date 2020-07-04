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

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody */
public final class GetConversationInfoListV2RequestBody extends Message<GetConversationInfoListV2RequestBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoListV2RequestBody> ADAPTER = new ProtoAdapter_GetConversationInfoListV2RequestBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationInfoV2RequestBody#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<GetConversationInfoV2RequestBody> conversation_info_list;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationInfoListV2RequestBody, Builder> {
        public List<GetConversationInfoV2RequestBody> conversation_info_list = Internal.newMutableList();

        public final GetConversationInfoListV2RequestBody build() {
            return new GetConversationInfoListV2RequestBody(this.conversation_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_info_list(List<GetConversationInfoV2RequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody$ProtoAdapter_GetConversationInfoListV2RequestBody */
    static final class ProtoAdapter_GetConversationInfoListV2RequestBody extends ProtoAdapter<GetConversationInfoListV2RequestBody> {
        public ProtoAdapter_GetConversationInfoListV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListV2RequestBody.class);
        }

        public final int encodedSize(GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
            return GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListV2RequestBody.conversation_info_list) + getConversationInfoListV2RequestBody.unknownFields().size();
        }

        public final GetConversationInfoListV2RequestBody redact(GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
            Builder newBuilder = getConversationInfoListV2RequestBody.newBuilder();
            Internal.redactElements(newBuilder.conversation_info_list, GetConversationInfoV2RequestBody.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationInfoListV2RequestBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation_info_list.add(GetConversationInfoV2RequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) throws IOException {
            GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListV2RequestBody.conversation_info_list);
            protoWriter.writeBytes(getConversationInfoListV2RequestBody.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "GetConversationInfoListV2RequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationInfoListV2RequestBody(List<GetConversationInfoV2RequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationInfoListV2RequestBody)) {
            return false;
        }
        GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody = (GetConversationInfoListV2RequestBody) obj;
        if (!unknownFields().equals(getConversationInfoListV2RequestBody.unknownFields()) || !this.conversation_info_list.equals(getConversationInfoListV2RequestBody.conversation_info_list)) {
            return false;
        }
        return true;
    }

    public GetConversationInfoListV2RequestBody(List<GetConversationInfoV2RequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
    }
}
