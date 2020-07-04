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

/* renamed from: com.bytedance.im.core.proto.GetGroupInfoListRequestBody */
public final class GetGroupInfoListRequestBody extends Message<GetGroupInfoListRequestBody, Builder> {
    public static final ProtoAdapter<GetGroupInfoListRequestBody> ADAPTER = new ProtoAdapter_GetGroupInfoListRequestBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.GetGroupInfoRequestBody#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<GetGroupInfoRequestBody> group_info_list;

    /* renamed from: com.bytedance.im.core.proto.GetGroupInfoListRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetGroupInfoListRequestBody, Builder> {
        public List<GetGroupInfoRequestBody> group_info_list = Internal.newMutableList();

        public final GetGroupInfoListRequestBody build() {
            return new GetGroupInfoListRequestBody(this.group_info_list, super.buildUnknownFields());
        }

        public final Builder group_info_list(List<GetGroupInfoRequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.group_info_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetGroupInfoListRequestBody$ProtoAdapter_GetGroupInfoListRequestBody */
    static final class ProtoAdapter_GetGroupInfoListRequestBody extends ProtoAdapter<GetGroupInfoListRequestBody> {
        public ProtoAdapter_GetGroupInfoListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGroupInfoListRequestBody.class);
        }

        public final int encodedSize(GetGroupInfoListRequestBody getGroupInfoListRequestBody) {
            return GetGroupInfoRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getGroupInfoListRequestBody.group_info_list) + getGroupInfoListRequestBody.unknownFields().size();
        }

        public final GetGroupInfoListRequestBody redact(GetGroupInfoListRequestBody getGroupInfoListRequestBody) {
            Builder newBuilder = getGroupInfoListRequestBody.newBuilder();
            Internal.redactElements(newBuilder.group_info_list, GetGroupInfoRequestBody.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetGroupInfoListRequestBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.group_info_list.add(GetGroupInfoRequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetGroupInfoListRequestBody getGroupInfoListRequestBody) throws IOException {
            GetGroupInfoRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getGroupInfoListRequestBody.group_info_list);
            protoWriter.writeBytes(getGroupInfoListRequestBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.group_info_list.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.group_info_list = Internal.copyOf("group_info_list", this.group_info_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.group_info_list.isEmpty()) {
            sb.append(", group_info_list=");
            sb.append(this.group_info_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetGroupInfoListRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetGroupInfoListRequestBody(List<GetGroupInfoRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetGroupInfoListRequestBody)) {
            return false;
        }
        GetGroupInfoListRequestBody getGroupInfoListRequestBody = (GetGroupInfoListRequestBody) obj;
        if (!unknownFields().equals(getGroupInfoListRequestBody.unknownFields()) || !this.group_info_list.equals(getGroupInfoListRequestBody.group_info_list)) {
            return false;
        }
        return true;
    }

    public GetGroupInfoListRequestBody(List<GetGroupInfoRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_info_list = Internal.immutableCopyOf("group_info_list", list);
    }
}
