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

/* renamed from: com.bytedance.im.core.proto.GetGroupInfoListResponseBody */
public final class GetGroupInfoListResponseBody extends Message<GetGroupInfoListResponseBody, Builder> {
    public static final ProtoAdapter<GetGroupInfoListResponseBody> ADAPTER = new ProtoAdapter_GetGroupInfoListResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.GroupInfo#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<GroupInfo> group_info_list;

    /* renamed from: com.bytedance.im.core.proto.GetGroupInfoListResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetGroupInfoListResponseBody, Builder> {
        public List<GroupInfo> group_info_list = Internal.newMutableList();

        public final GetGroupInfoListResponseBody build() {
            return new GetGroupInfoListResponseBody(this.group_info_list, super.buildUnknownFields());
        }

        public final Builder group_info_list(List<GroupInfo> list) {
            Internal.checkElementsNotNull(list);
            this.group_info_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetGroupInfoListResponseBody$ProtoAdapter_GetGroupInfoListResponseBody */
    static final class ProtoAdapter_GetGroupInfoListResponseBody extends ProtoAdapter<GetGroupInfoListResponseBody> {
        public ProtoAdapter_GetGroupInfoListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGroupInfoListResponseBody.class);
        }

        public final int encodedSize(GetGroupInfoListResponseBody getGroupInfoListResponseBody) {
            return GroupInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getGroupInfoListResponseBody.group_info_list) + getGroupInfoListResponseBody.unknownFields().size();
        }

        public final GetGroupInfoListResponseBody redact(GetGroupInfoListResponseBody getGroupInfoListResponseBody) {
            Builder newBuilder = getGroupInfoListResponseBody.newBuilder();
            Internal.redactElements(newBuilder.group_info_list, GroupInfo.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetGroupInfoListResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.group_info_list.add(GroupInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetGroupInfoListResponseBody getGroupInfoListResponseBody) throws IOException {
            GroupInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getGroupInfoListResponseBody.group_info_list);
            protoWriter.writeBytes(getGroupInfoListResponseBody.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "GetGroupInfoListResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetGroupInfoListResponseBody(List<GroupInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetGroupInfoListResponseBody)) {
            return false;
        }
        GetGroupInfoListResponseBody getGroupInfoListResponseBody = (GetGroupInfoListResponseBody) obj;
        if (!unknownFields().equals(getGroupInfoListResponseBody.unknownFields()) || !this.group_info_list.equals(getGroupInfoListResponseBody.group_info_list)) {
            return false;
        }
        return true;
    }

    public GetGroupInfoListResponseBody(List<GroupInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_info_list = Internal.immutableCopyOf("group_info_list", list);
    }
}
