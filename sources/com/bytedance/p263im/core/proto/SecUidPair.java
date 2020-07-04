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

/* renamed from: com.bytedance.im.core.proto.SecUidPair */
public final class SecUidPair extends Message<SecUidPair, Builder> {
    public static final ProtoAdapter<SecUidPair> ADAPTER = new ProtoAdapter_SecUidPair();
    public static final Long DEFAULT_UID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long uid;

    /* renamed from: com.bytedance.im.core.proto.SecUidPair$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SecUidPair, Builder> {
        public String sec_uid;
        public Long uid;

        public final SecUidPair build() {
            return new SecUidPair(this.uid, this.sec_uid, super.buildUnknownFields());
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder uid(Long l) {
            this.uid = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SecUidPair$ProtoAdapter_SecUidPair */
    static final class ProtoAdapter_SecUidPair extends ProtoAdapter<SecUidPair> {
        public ProtoAdapter_SecUidPair() {
            super(FieldEncoding.LENGTH_DELIMITED, SecUidPair.class);
        }

        public final SecUidPair redact(SecUidPair secUidPair) {
            Builder newBuilder = secUidPair.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SecUidPair secUidPair) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, secUidPair.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, secUidPair.sec_uid) + secUidPair.unknownFields().size();
        }

        public final SecUidPair decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uid((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.sec_uid((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SecUidPair secUidPair) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, secUidPair.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, secUidPair.sec_uid);
            protoWriter.writeBytes(secUidPair.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.sec_uid = this.sec_uid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.uid != null) {
            i = this.uid.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.sec_uid != null) {
            i3 = this.sec_uid.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        StringBuilder replace = sb.replace(0, 2, "SecUidPair{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SecUidPair)) {
            return false;
        }
        SecUidPair secUidPair = (SecUidPair) obj;
        if (!unknownFields().equals(secUidPair.unknownFields()) || !Internal.equals(this.uid, secUidPair.uid) || !Internal.equals(this.sec_uid, secUidPair.sec_uid)) {
            return false;
        }
        return true;
    }

    public SecUidPair(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public SecUidPair(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.sec_uid = str;
    }
}
