package com.p280ss.ugc.aweme.proto;

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

/* renamed from: com.ss.ugc.aweme.proto.RelationLabelStructV2 */
public final class RelationLabelStructV2 extends Message<RelationLabelStructV2, Builder> {
    public static final ProtoAdapter<RelationLabelStructV2> ADAPTER = new ProtoAdapter_RelationLabelStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RelativeUserStructV2#ADAPTER", label = Label.REPEATED, tag = 1)
    public List<RelativeUserStructV2> user_list;

    /* renamed from: com.ss.ugc.aweme.proto.RelationLabelStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<RelationLabelStructV2, Builder> {
        public String extra;
        public Integer type;
        public List<RelativeUserStructV2> user_list = Internal.newMutableList();

        public final RelationLabelStructV2 build() {
            return new RelationLabelStructV2(this.user_list, this.type, this.extra, super.buildUnknownFields());
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder user_list(List<RelativeUserStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.user_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.RelationLabelStructV2$ProtoAdapter_RelationLabelStructV2 */
    static final class ProtoAdapter_RelationLabelStructV2 extends ProtoAdapter<RelationLabelStructV2> {
        public ProtoAdapter_RelationLabelStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RelationLabelStructV2.class);
        }

        public final int encodedSize(RelationLabelStructV2 relationLabelStructV2) {
            return RelativeUserStructV2.ADAPTER.asRepeated().encodedSizeWithTag(1, relationLabelStructV2.user_list) + ProtoAdapter.INT32.encodedSizeWithTag(2, relationLabelStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(3, relationLabelStructV2.extra) + relationLabelStructV2.unknownFields().size();
        }

        public final RelationLabelStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.user_list.add(RelativeUserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, RelationLabelStructV2 relationLabelStructV2) throws IOException {
            RelativeUserStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, relationLabelStructV2.user_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, relationLabelStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, relationLabelStructV2.extra);
            protoWriter.writeBytes(relationLabelStructV2.unknownFields());
        }
    }

    public RelationLabelStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.user_list = Internal.copyOf("user_list", this.user_list);
        builder.type = this.type;
        builder.extra = this.extra;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.user_list.hashCode()) * 37;
        int i3 = 0;
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.extra != null) {
            i3 = this.extra.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.user_list.isEmpty()) {
            sb.append(", user_list=");
            sb.append(this.user_list);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "RelationLabelStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelationLabelStructV2)) {
            return false;
        }
        RelationLabelStructV2 relationLabelStructV2 = (RelationLabelStructV2) obj;
        if (!unknownFields().equals(relationLabelStructV2.unknownFields()) || !this.user_list.equals(relationLabelStructV2.user_list) || !Internal.equals(this.type, relationLabelStructV2.type) || !Internal.equals(this.extra, relationLabelStructV2.extra)) {
            return false;
        }
        return true;
    }

    public RelationLabelStructV2(List<RelativeUserStructV2> list, Integer num, String str) {
        this(list, num, str, ByteString.EMPTY);
    }

    public RelationLabelStructV2(List<RelativeUserStructV2> list, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_list = Internal.immutableCopyOf("user_list", list);
        this.type = num;
        this.extra = str;
    }
}
