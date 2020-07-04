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

/* renamed from: com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody */
public final class UpsertConversationSettingExtInfoResponseBody extends Message<UpsertConversationSettingExtInfoResponseBody, Builder> {
    public static final ProtoAdapter<UpsertConversationSettingExtInfoResponseBody> ADAPTER = new ProtoAdapter_UpsertConversationSettingExtInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long check_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String check_message;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String extra_info;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationSettingInfo#ADAPTER", tag = 1)
    public final ConversationSettingInfo setting_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UpsertConversationSettingExtInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public ConversationSettingInfo setting_info;
        public Integer status;

        public final UpsertConversationSettingExtInfoResponseBody build() {
            UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody = new UpsertConversationSettingExtInfoResponseBody(this.setting_info, this.status, this.check_code, this.check_message, this.extra_info, super.buildUnknownFields());
            return upsertConversationSettingExtInfoResponseBody;
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

        public final Builder setting_info(ConversationSettingInfo conversationSettingInfo) {
            this.setting_info = conversationSettingInfo;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody$ProtoAdapter_UpsertConversationSettingExtInfoResponseBody */
    static final class ProtoAdapter_UpsertConversationSettingExtInfoResponseBody extends ProtoAdapter<UpsertConversationSettingExtInfoResponseBody> {
        public ProtoAdapter_UpsertConversationSettingExtInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationSettingExtInfoResponseBody.class);
        }

        public final UpsertConversationSettingExtInfoResponseBody redact(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            Builder newBuilder = upsertConversationSettingExtInfoResponseBody.newBuilder();
            if (newBuilder.setting_info != null) {
                newBuilder.setting_info = (ConversationSettingInfo) ConversationSettingInfo.ADAPTER.redact(newBuilder.setting_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            return ConversationSettingInfo.ADAPTER.encodedSizeWithTag(1, upsertConversationSettingExtInfoResponseBody.setting_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, upsertConversationSettingExtInfoResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, upsertConversationSettingExtInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, upsertConversationSettingExtInfoResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(5, upsertConversationSettingExtInfoResponseBody.extra_info) + upsertConversationSettingExtInfoResponseBody.unknownFields().size();
        }

        public final UpsertConversationSettingExtInfoResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.setting_info((ConversationSettingInfo) ConversationSettingInfo.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) throws IOException {
            ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 1, upsertConversationSettingExtInfoResponseBody.setting_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, upsertConversationSettingExtInfoResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, upsertConversationSettingExtInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, upsertConversationSettingExtInfoResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, upsertConversationSettingExtInfoResponseBody.extra_info);
            protoWriter.writeBytes(upsertConversationSettingExtInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setting_info = this.setting_info;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
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
        if (this.setting_info != null) {
            i = this.setting_info.hashCode();
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
        if (this.check_code != null) {
            i3 = this.check_code.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.check_message != null) {
            i4 = this.check_message.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.extra_info != null) {
            i6 = this.extra_info.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.setting_info != null) {
            sb.append(", setting_info=");
            sb.append(this.setting_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        StringBuilder replace = sb.replace(0, 2, "UpsertConversationSettingExtInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpsertConversationSettingExtInfoResponseBody)) {
            return false;
        }
        UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody = (UpsertConversationSettingExtInfoResponseBody) obj;
        if (!unknownFields().equals(upsertConversationSettingExtInfoResponseBody.unknownFields()) || !Internal.equals(this.setting_info, upsertConversationSettingExtInfoResponseBody.setting_info) || !Internal.equals(this.status, upsertConversationSettingExtInfoResponseBody.status) || !Internal.equals(this.check_code, upsertConversationSettingExtInfoResponseBody.check_code) || !Internal.equals(this.check_message, upsertConversationSettingExtInfoResponseBody.check_message) || !Internal.equals(this.extra_info, upsertConversationSettingExtInfoResponseBody.extra_info)) {
            return false;
        }
        return true;
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2) {
        this(conversationSettingInfo, num, l, str, str2, ByteString.EMPTY);
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting_info = conversationSettingInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
