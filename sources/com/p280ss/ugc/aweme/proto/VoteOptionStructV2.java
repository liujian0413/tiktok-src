package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.VoteOptionStructV2 */
public final class VoteOptionStructV2 extends Message<VoteOptionStructV2, Builder> {
    public static final ProtoAdapter<VoteOptionStructV2> ADAPTER = new ProtoAdapter_VoteOptionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String option;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long option_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String option_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long vote_count;

    /* renamed from: com.ss.ugc.aweme.proto.VoteOptionStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VoteOptionStructV2, Builder> {
        public String option;
        public Long option_id;
        public String option_text;
        public Long vote_count;

        public final VoteOptionStructV2 build() {
            VoteOptionStructV2 voteOptionStructV2 = new VoteOptionStructV2(this.option_text, this.option_id, this.vote_count, this.option, super.buildUnknownFields());
            return voteOptionStructV2;
        }

        public final Builder option(String str) {
            this.option = str;
            return this;
        }

        public final Builder option_id(Long l) {
            this.option_id = l;
            return this;
        }

        public final Builder option_text(String str) {
            this.option_text = str;
            return this;
        }

        public final Builder vote_count(Long l) {
            this.vote_count = l;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.VoteOptionStructV2$ProtoAdapter_VoteOptionStructV2 */
    static final class ProtoAdapter_VoteOptionStructV2 extends ProtoAdapter<VoteOptionStructV2> {
        public ProtoAdapter_VoteOptionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VoteOptionStructV2.class);
        }

        public final int encodedSize(VoteOptionStructV2 voteOptionStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, voteOptionStructV2.option_text) + ProtoAdapter.INT64.encodedSizeWithTag(2, voteOptionStructV2.option_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, voteOptionStructV2.vote_count) + ProtoAdapter.STRING.encodedSizeWithTag(4, voteOptionStructV2.option) + voteOptionStructV2.unknownFields().size();
        }

        public final VoteOptionStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.option_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.option_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.vote_count((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.option((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, VoteOptionStructV2 voteOptionStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, voteOptionStructV2.option_text);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, voteOptionStructV2.option_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, voteOptionStructV2.vote_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, voteOptionStructV2.option);
            protoWriter.writeBytes(voteOptionStructV2.unknownFields());
        }
    }

    public VoteOptionStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.option_text = this.option_text;
        builder.option_id = this.option_id;
        builder.vote_count = this.vote_count;
        builder.option = this.option;
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
        if (this.option_text != null) {
            i = this.option_text.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.option_id != null) {
            i2 = this.option_id.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.vote_count != null) {
            i3 = this.vote_count.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.option != null) {
            i5 = this.option.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.option_text != null) {
            sb.append(", option_text=");
            sb.append(this.option_text);
        }
        if (this.option_id != null) {
            sb.append(", option_id=");
            sb.append(this.option_id);
        }
        if (this.vote_count != null) {
            sb.append(", vote_count=");
            sb.append(this.vote_count);
        }
        if (this.option != null) {
            sb.append(", option=");
            sb.append(this.option);
        }
        StringBuilder replace = sb.replace(0, 2, "VoteOptionStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoteOptionStructV2)) {
            return false;
        }
        VoteOptionStructV2 voteOptionStructV2 = (VoteOptionStructV2) obj;
        if (!unknownFields().equals(voteOptionStructV2.unknownFields()) || !Internal.equals(this.option_text, voteOptionStructV2.option_text) || !Internal.equals(this.option_id, voteOptionStructV2.option_id) || !Internal.equals(this.vote_count, voteOptionStructV2.vote_count) || !Internal.equals(this.option, voteOptionStructV2.option)) {
            return false;
        }
        return true;
    }

    public VoteOptionStructV2(String str, Long l, Long l2, String str2) {
        this(str, l, l2, str2, ByteString.EMPTY);
    }

    public VoteOptionStructV2(String str, Long l, Long l2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.option_text = str;
        this.option_id = l;
        this.vote_count = l2;
        this.option = str2;
    }
}
