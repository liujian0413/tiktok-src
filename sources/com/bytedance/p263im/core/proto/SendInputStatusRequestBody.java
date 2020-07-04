package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.SendInputStatusRequestBody */
public final class SendInputStatusRequestBody extends Message<SendInputStatusRequestBody, Builder> {
    public static final ProtoAdapter<SendInputStatusRequestBody> ADAPTER = new ProtoAdapter_SendInputStatusRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final InputStatus DEFAULT_STATUS = InputStatus.TYPING;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final Map<String, String> extra;
    @WireField(adapter = "com.bytedance.im.core.proto.InputStatus#ADAPTER", tag = 4)
    public final InputStatus status;

    /* renamed from: com.bytedance.im.core.proto.SendInputStatusRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SendInputStatusRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> extra = Internal.newMutableMap();
        public InputStatus status;

        public final SendInputStatusRequestBody build() {
            SendInputStatusRequestBody sendInputStatusRequestBody = new SendInputStatusRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.status, this.extra, super.buildUnknownFields());
            return sendInputStatusRequestBody;
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

        public final Builder status(InputStatus inputStatus) {
            this.status = inputStatus;
            return this;
        }

        public final Builder extra(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.extra = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SendInputStatusRequestBody$ProtoAdapter_SendInputStatusRequestBody */
    static final class ProtoAdapter_SendInputStatusRequestBody extends ProtoAdapter<SendInputStatusRequestBody> {
        private final ProtoAdapter<Map<String, String>> extra;

        public ProtoAdapter_SendInputStatusRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendInputStatusRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.extra = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final SendInputStatusRequestBody redact(SendInputStatusRequestBody sendInputStatusRequestBody) {
            Builder newBuilder = sendInputStatusRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SendInputStatusRequestBody sendInputStatusRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sendInputStatusRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendInputStatusRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, sendInputStatusRequestBody.conversation_short_id) + InputStatus.ADAPTER.encodedSizeWithTag(4, sendInputStatusRequestBody.status) + this.extra.encodedSizeWithTag(5, sendInputStatusRequestBody.extra) + sendInputStatusRequestBody.unknownFields().size();
        }

        public final SendInputStatusRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            try {
                                builder.status((InputStatus) InputStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            builder.extra.putAll((Map) this.extra.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SendInputStatusRequestBody sendInputStatusRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendInputStatusRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendInputStatusRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, sendInputStatusRequestBody.conversation_short_id);
            InputStatus.ADAPTER.encodeWithTag(protoWriter, 4, sendInputStatusRequestBody.status);
            this.extra.encodeWithTag(protoWriter, 5, sendInputStatusRequestBody.extra);
            protoWriter.writeBytes(sendInputStatusRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.status = this.status;
        builder.extra = Internal.copyOf("extra", this.extra);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.conversation_type != null) {
            i2 = this.conversation_type.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.conversation_short_id != null) {
            i3 = this.conversation_short_id.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.status != null) {
            i5 = this.status.hashCode();
        }
        int hashCode2 = ((i8 + i5) * 37) + this.extra.hashCode();
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
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "SendInputStatusRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendInputStatusRequestBody)) {
            return false;
        }
        SendInputStatusRequestBody sendInputStatusRequestBody = (SendInputStatusRequestBody) obj;
        if (!unknownFields().equals(sendInputStatusRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, sendInputStatusRequestBody.conversation_id) || !Internal.equals(this.conversation_type, sendInputStatusRequestBody.conversation_type) || !Internal.equals(this.conversation_short_id, sendInputStatusRequestBody.conversation_short_id) || !Internal.equals(this.status, sendInputStatusRequestBody.status) || !this.extra.equals(sendInputStatusRequestBody.extra)) {
            return false;
        }
        return true;
    }

    public SendInputStatusRequestBody(String str, Integer num, Long l, InputStatus inputStatus, Map<String, String> map) {
        this(str, num, l, inputStatus, map, ByteString.EMPTY);
    }

    public SendInputStatusRequestBody(String str, Integer num, Long l, InputStatus inputStatus, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.status = inputStatus;
        this.extra = Internal.immutableCopyOf("extra", map);
    }
}
