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

/* renamed from: com.ss.ugc.aweme.proto.AwemeSearchStructV2 */
public final class AwemeSearchStructV2 extends Message<AwemeSearchStructV2, Builder> {
    public static final ProtoAdapter<AwemeSearchStructV2> ADAPTER = new ProtoAdapter_AwemeSearchStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String challenge_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String group_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public Integer label;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String search_word;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String sentence;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long value;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer vb_rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long vb_rank_value;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeSearchStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeSearchStructV2, Builder> {
        public String challenge_id;
        public String group_id;
        public Integer label;
        public Integer rank;
        public String search_word;
        public String sentence;
        public Long value;
        public Integer vb_rank;
        public Long vb_rank_value;

        public final AwemeSearchStructV2 build() {
            AwemeSearchStructV2 awemeSearchStructV2 = new AwemeSearchStructV2(this.sentence, this.challenge_id, this.search_word, this.value, this.vb_rank, this.vb_rank_value, this.rank, this.group_id, this.label, super.buildUnknownFields());
            return awemeSearchStructV2;
        }

        public final Builder challenge_id(String str) {
            this.challenge_id = str;
            return this;
        }

        public final Builder group_id(String str) {
            this.group_id = str;
            return this;
        }

        public final Builder label(Integer num) {
            this.label = num;
            return this;
        }

        public final Builder rank(Integer num) {
            this.rank = num;
            return this;
        }

        public final Builder search_word(String str) {
            this.search_word = str;
            return this;
        }

        public final Builder sentence(String str) {
            this.sentence = str;
            return this;
        }

        public final Builder value(Long l) {
            this.value = l;
            return this;
        }

        public final Builder vb_rank(Integer num) {
            this.vb_rank = num;
            return this;
        }

        public final Builder vb_rank_value(Long l) {
            this.vb_rank_value = l;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeSearchStructV2$ProtoAdapter_AwemeSearchStructV2 */
    static final class ProtoAdapter_AwemeSearchStructV2 extends ProtoAdapter<AwemeSearchStructV2> {
        public ProtoAdapter_AwemeSearchStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeSearchStructV2.class);
        }

        public final int encodedSize(AwemeSearchStructV2 awemeSearchStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeSearchStructV2.sentence) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeSearchStructV2.challenge_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, awemeSearchStructV2.search_word) + ProtoAdapter.INT64.encodedSizeWithTag(4, awemeSearchStructV2.value) + ProtoAdapter.INT32.encodedSizeWithTag(5, awemeSearchStructV2.vb_rank) + ProtoAdapter.INT64.encodedSizeWithTag(6, awemeSearchStructV2.vb_rank_value) + ProtoAdapter.INT32.encodedSizeWithTag(7, awemeSearchStructV2.rank) + ProtoAdapter.STRING.encodedSizeWithTag(8, awemeSearchStructV2.group_id) + ProtoAdapter.INT32.encodedSizeWithTag(9, awemeSearchStructV2.label) + awemeSearchStructV2.unknownFields().size();
        }

        public final AwemeSearchStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.sentence((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.challenge_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.search_word((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.value((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.vb_rank((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.vb_rank_value((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            builder.rank((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.group_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.label((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeSearchStructV2 awemeSearchStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeSearchStructV2.sentence);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeSearchStructV2.challenge_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, awemeSearchStructV2.search_word);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, awemeSearchStructV2.value);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, awemeSearchStructV2.vb_rank);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, awemeSearchStructV2.vb_rank_value);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, awemeSearchStructV2.rank);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, awemeSearchStructV2.group_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, awemeSearchStructV2.label);
            protoWriter.writeBytes(awemeSearchStructV2.unknownFields());
        }
    }

    public AwemeSearchStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.sentence = this.sentence;
        builder.challenge_id = this.challenge_id;
        builder.search_word = this.search_word;
        builder.value = this.value;
        builder.vb_rank = this.vb_rank;
        builder.vb_rank_value = this.vb_rank_value;
        builder.rank = this.rank;
        builder.group_id = this.group_id;
        builder.label = this.label;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i10 = 0;
        if (this.sentence != null) {
            i = this.sentence.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 37;
        if (this.challenge_id != null) {
            i2 = this.challenge_id.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 37;
        if (this.search_word != null) {
            i3 = this.search_word.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        if (this.value != null) {
            i4 = this.value.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        if (this.vb_rank != null) {
            i5 = this.vb_rank.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        if (this.vb_rank_value != null) {
            i6 = this.vb_rank_value.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        if (this.rank != null) {
            i7 = this.rank.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 37;
        if (this.group_id != null) {
            i8 = this.group_id.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 37;
        if (this.label != null) {
            i10 = this.label.hashCode();
        }
        int i19 = i18 + i10;
        this.hashCode = i19;
        return i19;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sentence != null) {
            sb.append(", sentence=");
            sb.append(this.sentence);
        }
        if (this.challenge_id != null) {
            sb.append(", challenge_id=");
            sb.append(this.challenge_id);
        }
        if (this.search_word != null) {
            sb.append(", search_word=");
            sb.append(this.search_word);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.vb_rank != null) {
            sb.append(", vb_rank=");
            sb.append(this.vb_rank);
        }
        if (this.vb_rank_value != null) {
            sb.append(", vb_rank_value=");
            sb.append(this.vb_rank_value);
        }
        if (this.rank != null) {
            sb.append(", rank=");
            sb.append(this.rank);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (this.label != null) {
            sb.append(", label=");
            sb.append(this.label);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeSearchStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeSearchStructV2)) {
            return false;
        }
        AwemeSearchStructV2 awemeSearchStructV2 = (AwemeSearchStructV2) obj;
        if (!unknownFields().equals(awemeSearchStructV2.unknownFields()) || !Internal.equals(this.sentence, awemeSearchStructV2.sentence) || !Internal.equals(this.challenge_id, awemeSearchStructV2.challenge_id) || !Internal.equals(this.search_word, awemeSearchStructV2.search_word) || !Internal.equals(this.value, awemeSearchStructV2.value) || !Internal.equals(this.vb_rank, awemeSearchStructV2.vb_rank) || !Internal.equals(this.vb_rank_value, awemeSearchStructV2.vb_rank_value) || !Internal.equals(this.rank, awemeSearchStructV2.rank) || !Internal.equals(this.group_id, awemeSearchStructV2.group_id) || !Internal.equals(this.label, awemeSearchStructV2.label)) {
            return false;
        }
        return true;
    }

    public AwemeSearchStructV2(String str, String str2, String str3, Long l, Integer num, Long l2, Integer num2, String str4, Integer num3) {
        this(str, str2, str3, l, num, l2, num2, str4, num3, ByteString.EMPTY);
    }

    public AwemeSearchStructV2(String str, String str2, String str3, Long l, Integer num, Long l2, Integer num2, String str4, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sentence = str;
        this.challenge_id = str2;
        this.search_word = str3;
        this.value = l;
        this.vb_rank = num;
        this.vb_rank_value = l2;
        this.rank = num2;
        this.group_id = str4;
        this.label = num3;
    }
}
