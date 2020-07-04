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

/* renamed from: com.bytedance.im.core.proto.SetGroupInfoResponseBody */
public final class SetGroupInfoResponseBody extends Message<SetGroupInfoResponseBody, Builder> {
    public static final ProtoAdapter<SetGroupInfoResponseBody> ADAPTER = new ProtoAdapter_SetGroupInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long check_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String check_message;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String extra_info;
    @WireField(adapter = "com.bytedance.im.core.proto.GroupInfo#ADAPTER", tag = 1)
    public final GroupInfo group_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.SetGroupInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SetGroupInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public GroupInfo group_info;
        public Integer status;

        public final SetGroupInfoResponseBody build() {
            SetGroupInfoResponseBody setGroupInfoResponseBody = new SetGroupInfoResponseBody(this.group_info, this.status, this.extra_info, this.check_code, this.check_message, super.buildUnknownFields());
            return setGroupInfoResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder group_info(GroupInfo groupInfo) {
            this.group_info = groupInfo;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SetGroupInfoResponseBody$ProtoAdapter_SetGroupInfoResponseBody */
    static final class ProtoAdapter_SetGroupInfoResponseBody extends ProtoAdapter<SetGroupInfoResponseBody> {
        public ProtoAdapter_SetGroupInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetGroupInfoResponseBody.class);
        }

        public final SetGroupInfoResponseBody redact(SetGroupInfoResponseBody setGroupInfoResponseBody) {
            Builder newBuilder = setGroupInfoResponseBody.newBuilder();
            if (newBuilder.group_info != null) {
                newBuilder.group_info = (GroupInfo) GroupInfo.ADAPTER.redact(newBuilder.group_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SetGroupInfoResponseBody setGroupInfoResponseBody) {
            return GroupInfo.ADAPTER.encodedSizeWithTag(1, setGroupInfoResponseBody.group_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, setGroupInfoResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, setGroupInfoResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, setGroupInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(5, setGroupInfoResponseBody.check_message) + setGroupInfoResponseBody.unknownFields().size();
        }

        public final SetGroupInfoResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.group_info((GroupInfo) GroupInfo.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SetGroupInfoResponseBody setGroupInfoResponseBody) throws IOException {
            GroupInfo.ADAPTER.encodeWithTag(protoWriter, 1, setGroupInfoResponseBody.group_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setGroupInfoResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setGroupInfoResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, setGroupInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, setGroupInfoResponseBody.check_message);
            protoWriter.writeBytes(setGroupInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.group_info = this.group_info;
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
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
        if (this.group_info != null) {
            i = this.group_info.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.status != null) {
            i2 = this.status.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.extra_info != null) {
            i3 = this.extra_info.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.check_code != null) {
            i4 = this.check_code.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.check_message != null) {
            i6 = this.check_message.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.group_info != null) {
            sb.append(", group_info=");
            sb.append(this.group_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        StringBuilder replace = sb.replace(0, 2, "SetGroupInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetGroupInfoResponseBody)) {
            return false;
        }
        SetGroupInfoResponseBody setGroupInfoResponseBody = (SetGroupInfoResponseBody) obj;
        if (!unknownFields().equals(setGroupInfoResponseBody.unknownFields()) || !Internal.equals(this.group_info, setGroupInfoResponseBody.group_info) || !Internal.equals(this.status, setGroupInfoResponseBody.status) || !Internal.equals(this.extra_info, setGroupInfoResponseBody.extra_info) || !Internal.equals(this.check_code, setGroupInfoResponseBody.check_code) || !Internal.equals(this.check_message, setGroupInfoResponseBody.check_message)) {
            return false;
        }
        return true;
    }

    public SetGroupInfoResponseBody(GroupInfo groupInfo, Integer num, String str, Long l, String str2) {
        this(groupInfo, num, str, l, str2, ByteString.EMPTY);
    }

    public SetGroupInfoResponseBody(GroupInfo groupInfo, Integer num, String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_info = groupInfo;
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}
