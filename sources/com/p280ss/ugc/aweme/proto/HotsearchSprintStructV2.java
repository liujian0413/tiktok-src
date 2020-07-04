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

/* renamed from: com.ss.ugc.aweme.proto.HotsearchSprintStructV2 */
public final class HotsearchSprintStructV2 extends Message<HotsearchSprintStructV2, Builder> {
    public static final ProtoAdapter<HotsearchSprintStructV2> ADAPTER = new ProtoAdapter_HotsearchSprintStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.SimpleUserStructV2#ADAPTER", label = Label.REPEATED, tag = 2)
    public List<SimpleUserStructV2> followers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer sprint;

    /* renamed from: com.ss.ugc.aweme.proto.HotsearchSprintStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<HotsearchSprintStructV2, Builder> {
        public List<SimpleUserStructV2> followers = Internal.newMutableList();
        public Integer sprint;

        public final HotsearchSprintStructV2 build() {
            return new HotsearchSprintStructV2(this.sprint, this.followers, super.buildUnknownFields());
        }

        public final Builder sprint(Integer num) {
            this.sprint = num;
            return this;
        }

        public final Builder followers(List<SimpleUserStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.followers = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.HotsearchSprintStructV2$ProtoAdapter_HotsearchSprintStructV2 */
    static final class ProtoAdapter_HotsearchSprintStructV2 extends ProtoAdapter<HotsearchSprintStructV2> {
        public ProtoAdapter_HotsearchSprintStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, HotsearchSprintStructV2.class);
        }

        public final int encodedSize(HotsearchSprintStructV2 hotsearchSprintStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, hotsearchSprintStructV2.sprint) + SimpleUserStructV2.ADAPTER.asRepeated().encodedSizeWithTag(2, hotsearchSprintStructV2.followers) + hotsearchSprintStructV2.unknownFields().size();
        }

        public final HotsearchSprintStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.sprint((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.followers.add(SimpleUserStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, HotsearchSprintStructV2 hotsearchSprintStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, hotsearchSprintStructV2.sprint);
            SimpleUserStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, hotsearchSprintStructV2.followers);
            protoWriter.writeBytes(hotsearchSprintStructV2.unknownFields());
        }
    }

    public HotsearchSprintStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.sprint = this.sprint;
        builder.followers = Internal.copyOf("followers", this.followers);
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
        if (this.sprint != null) {
            i = this.sprint.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = ((hashCode + i) * 37) + this.followers.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sprint != null) {
            sb.append(", sprint=");
            sb.append(this.sprint);
        }
        if (!this.followers.isEmpty()) {
            sb.append(", followers=");
            sb.append(this.followers);
        }
        StringBuilder replace = sb.replace(0, 2, "HotsearchSprintStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HotsearchSprintStructV2)) {
            return false;
        }
        HotsearchSprintStructV2 hotsearchSprintStructV2 = (HotsearchSprintStructV2) obj;
        if (!unknownFields().equals(hotsearchSprintStructV2.unknownFields()) || !Internal.equals(this.sprint, hotsearchSprintStructV2.sprint) || !this.followers.equals(hotsearchSprintStructV2.followers)) {
            return false;
        }
        return true;
    }

    public HotsearchSprintStructV2(Integer num, List<SimpleUserStructV2> list) {
        this(num, list, ByteString.EMPTY);
    }

    public HotsearchSprintStructV2(Integer num, List<SimpleUserStructV2> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sprint = num;
        this.followers = Internal.immutableCopyOf("followers", list);
    }
}
