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

/* renamed from: com.bytedance.im.core.proto.Participant */
public final class Participant extends Message<Participant, Builder> {
    public static final ProtoAdapter<Participant> ADAPTER = new ProtoAdapter_Participant();
    public static final Integer DEFAULT_ROLE = Integer.valueOf(0);
    public static final Long DEFAULT_SORT_ORDER = Long.valueOf(0);
    public static final Long DEFAULT_USER_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String alias;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer role;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long sort_order;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.Participant$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<Participant, Builder> {
        public String alias;
        public Integer role;
        public String sec_uid;
        public Long sort_order;
        public Long user_id;

        public final Participant build() {
            Participant participant = new Participant(this.user_id, this.sort_order, this.role, this.alias, this.sec_uid, super.buildUnknownFields());
            return participant;
        }

        public final Builder alias(String str) {
            this.alias = str;
            return this;
        }

        public final Builder role(Integer num) {
            this.role = num;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder sort_order(Long l) {
            this.sort_order = l;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.Participant$ProtoAdapter_Participant */
    static final class ProtoAdapter_Participant extends ProtoAdapter<Participant> {
        public ProtoAdapter_Participant() {
            super(FieldEncoding.LENGTH_DELIMITED, Participant.class);
        }

        public final Participant redact(Participant participant) {
            Builder newBuilder = participant.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(Participant participant) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, participant.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, participant.sort_order) + ProtoAdapter.INT32.encodedSizeWithTag(3, participant.role) + ProtoAdapter.STRING.encodedSizeWithTag(4, participant.alias) + ProtoAdapter.STRING.encodedSizeWithTag(5, participant.sec_uid) + participant.unknownFields().size();
        }

        public final Participant decode(ProtoReader protoReader) throws IOException {
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
                            builder.sort_order((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.role((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.alias((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
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

        public final void encode(ProtoWriter protoWriter, Participant participant) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, participant.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, participant.sort_order);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, participant.role);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, participant.alias);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, participant.sec_uid);
            protoWriter.writeBytes(participant.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.sort_order = this.sort_order;
        builder.role = this.role;
        builder.alias = this.alias;
        builder.sec_uid = this.sec_uid;
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
        if (this.user_id != null) {
            i = this.user_id.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.sort_order != null) {
            i2 = this.sort_order.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.role != null) {
            i3 = this.role.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.alias != null) {
            i4 = this.alias.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.sec_uid != null) {
            i6 = this.sec_uid.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.sort_order != null) {
            sb.append(", sort_order=");
            sb.append(this.sort_order);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        StringBuilder replace = sb.replace(0, 2, "Participant{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Participant)) {
            return false;
        }
        Participant participant = (Participant) obj;
        if (!unknownFields().equals(participant.unknownFields()) || !Internal.equals(this.user_id, participant.user_id) || !Internal.equals(this.sort_order, participant.sort_order) || !Internal.equals(this.role, participant.role) || !Internal.equals(this.alias, participant.alias) || !Internal.equals(this.sec_uid, participant.sec_uid)) {
            return false;
        }
        return true;
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2) {
        this(l, l2, num, str, str2, ByteString.EMPTY);
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.sort_order = l2;
        this.role = num;
        this.alias = str;
        this.sec_uid = str2;
    }
}
