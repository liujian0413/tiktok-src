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

/* renamed from: com.bytedance.im.core.proto.ParticipantReadIndex */
public final class ParticipantReadIndex extends Message<ParticipantReadIndex, Builder> {
    public static final ProtoAdapter<ParticipantReadIndex> ADAPTER = new ProtoAdapter_ParticipantReadIndex();
    public static final Long DEFAULT_INDEX = Long.valueOf(0);
    public static final Long DEFAULT_USER_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long index;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.ParticipantReadIndex$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ParticipantReadIndex, Builder> {
        public Long index;
        public String sec_uid;
        public Long user_id;

        public final ParticipantReadIndex build() {
            return new ParticipantReadIndex(this.user_id, this.sec_uid, this.index, super.buildUnknownFields());
        }

        public final Builder index(Long l) {
            this.index = l;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ParticipantReadIndex$ProtoAdapter_ParticipantReadIndex */
    static final class ProtoAdapter_ParticipantReadIndex extends ProtoAdapter<ParticipantReadIndex> {
        public ProtoAdapter_ParticipantReadIndex() {
            super(FieldEncoding.LENGTH_DELIMITED, ParticipantReadIndex.class);
        }

        public final ParticipantReadIndex redact(ParticipantReadIndex participantReadIndex) {
            Builder newBuilder = participantReadIndex.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ParticipantReadIndex participantReadIndex) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, participantReadIndex.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, participantReadIndex.sec_uid) + ProtoAdapter.INT64.encodedSizeWithTag(3, participantReadIndex.index) + participantReadIndex.unknownFields().size();
        }

        public final ParticipantReadIndex decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.sec_uid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.index((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ParticipantReadIndex participantReadIndex) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, participantReadIndex.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, participantReadIndex.sec_uid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, participantReadIndex.index);
            protoWriter.writeBytes(participantReadIndex.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.sec_uid = this.sec_uid;
        builder.index = this.index;
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
        if (this.user_id != null) {
            i = this.user_id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.sec_uid != null) {
            i2 = this.sec_uid.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.index != null) {
            i4 = this.index.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.index != null) {
            sb.append(", index=");
            sb.append(this.index);
        }
        StringBuilder replace = sb.replace(0, 2, "ParticipantReadIndex{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ParticipantReadIndex)) {
            return false;
        }
        ParticipantReadIndex participantReadIndex = (ParticipantReadIndex) obj;
        if (!unknownFields().equals(participantReadIndex.unknownFields()) || !Internal.equals(this.user_id, participantReadIndex.user_id) || !Internal.equals(this.sec_uid, participantReadIndex.sec_uid) || !Internal.equals(this.index, participantReadIndex.index)) {
            return false;
        }
        return true;
    }

    public ParticipantReadIndex(Long l, String str, Long l2) {
        this(l, str, l2, ByteString.EMPTY);
    }

    public ParticipantReadIndex(Long l, String str, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.sec_uid = str;
        this.index = l2;
    }
}
