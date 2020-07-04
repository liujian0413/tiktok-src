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

/* renamed from: com.bytedance.im.core.proto.SyncContent */
public final class SyncContent extends Message<SyncContent, Builder> {
    public static final ProtoAdapter<SyncContent> ADAPTER = new ProtoAdapter_SyncContent();
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    public static final Long DEFAULT_TARGET_MESSAGE_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String target_client_message_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long target_message_id;

    /* renamed from: com.bytedance.im.core.proto.SyncContent$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SyncContent, Builder> {
        public Integer status;
        public String target_client_message_id;
        public Long target_message_id;

        public final SyncContent build() {
            return new SyncContent(this.status, this.target_message_id, this.target_client_message_id, super.buildUnknownFields());
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder target_client_message_id(String str) {
            this.target_client_message_id = str;
            return this;
        }

        public final Builder target_message_id(Long l) {
            this.target_message_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SyncContent$ProtoAdapter_SyncContent */
    static final class ProtoAdapter_SyncContent extends ProtoAdapter<SyncContent> {
        public ProtoAdapter_SyncContent() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncContent.class);
        }

        public final SyncContent redact(SyncContent syncContent) {
            Builder newBuilder = syncContent.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SyncContent syncContent) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, syncContent.status) + ProtoAdapter.INT64.encodedSizeWithTag(2, syncContent.target_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, syncContent.target_client_message_id) + syncContent.unknownFields().size();
        }

        public final SyncContent decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.target_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.target_client_message_id((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SyncContent syncContent) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, syncContent.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, syncContent.target_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, syncContent.target_client_message_id);
            protoWriter.writeBytes(syncContent.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.target_message_id = this.target_message_id;
        builder.target_client_message_id = this.target_client_message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.status != null) {
            i = this.status.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.target_message_id != null) {
            i2 = this.target_message_id.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.target_client_message_id != null) {
            i4 = this.target_client_message_id.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.target_message_id != null) {
            sb.append(", target_message_id=");
            sb.append(this.target_message_id);
        }
        if (this.target_client_message_id != null) {
            sb.append(", target_client_message_id=");
            sb.append(this.target_client_message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncContent{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncContent)) {
            return false;
        }
        SyncContent syncContent = (SyncContent) obj;
        if (!unknownFields().equals(syncContent.unknownFields()) || !Internal.equals(this.status, syncContent.status) || !Internal.equals(this.target_message_id, syncContent.target_message_id) || !Internal.equals(this.target_client_message_id, syncContent.target_client_message_id)) {
            return false;
        }
        return true;
    }

    public SyncContent(Integer num, Long l, String str) {
        this(num, l, str, ByteString.EMPTY);
    }

    public SyncContent(Integer num, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = num;
        this.target_message_id = l;
        this.target_client_message_id = str;
    }
}
