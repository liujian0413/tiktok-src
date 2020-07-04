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

/* renamed from: com.ss.ugc.aweme.proto.MixStatisStructV2 */
public final class MixStatisStructV2 extends Message<MixStatisStructV2, Builder> {
    public static final ProtoAdapter<MixStatisStructV2> ADAPTER = new ProtoAdapter_MixStatisStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long collect_vv;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long current_episode;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public Long has_updated_episode;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long play_vv;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long updated_to_episode;

    /* renamed from: com.ss.ugc.aweme.proto.MixStatisStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MixStatisStructV2, Builder> {
        public Long collect_vv;
        public Long current_episode;
        public Long has_updated_episode;
        public Long play_vv;
        public Long updated_to_episode;

        public final MixStatisStructV2 build() {
            MixStatisStructV2 mixStatisStructV2 = new MixStatisStructV2(this.play_vv, this.collect_vv, this.current_episode, this.updated_to_episode, this.has_updated_episode, super.buildUnknownFields());
            return mixStatisStructV2;
        }

        public final Builder collect_vv(Long l) {
            this.collect_vv = l;
            return this;
        }

        public final Builder current_episode(Long l) {
            this.current_episode = l;
            return this;
        }

        public final Builder has_updated_episode(Long l) {
            this.has_updated_episode = l;
            return this;
        }

        public final Builder play_vv(Long l) {
            this.play_vv = l;
            return this;
        }

        public final Builder updated_to_episode(Long l) {
            this.updated_to_episode = l;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.MixStatisStructV2$ProtoAdapter_MixStatisStructV2 */
    static final class ProtoAdapter_MixStatisStructV2 extends ProtoAdapter<MixStatisStructV2> {
        public ProtoAdapter_MixStatisStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MixStatisStructV2.class);
        }

        public final int encodedSize(MixStatisStructV2 mixStatisStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, mixStatisStructV2.play_vv) + ProtoAdapter.INT64.encodedSizeWithTag(2, mixStatisStructV2.collect_vv) + ProtoAdapter.INT64.encodedSizeWithTag(3, mixStatisStructV2.current_episode) + ProtoAdapter.INT64.encodedSizeWithTag(4, mixStatisStructV2.updated_to_episode) + ProtoAdapter.INT64.encodedSizeWithTag(5, mixStatisStructV2.has_updated_episode) + mixStatisStructV2.unknownFields().size();
        }

        public final MixStatisStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.play_vv((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.collect_vv((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.current_episode((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.updated_to_episode((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.has_updated_episode((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MixStatisStructV2 mixStatisStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, mixStatisStructV2.play_vv);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mixStatisStructV2.collect_vv);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mixStatisStructV2.current_episode);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, mixStatisStructV2.updated_to_episode);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, mixStatisStructV2.has_updated_episode);
            protoWriter.writeBytes(mixStatisStructV2.unknownFields());
        }
    }

    public MixStatisStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.play_vv = this.play_vv;
        builder.collect_vv = this.collect_vv;
        builder.current_episode = this.current_episode;
        builder.updated_to_episode = this.updated_to_episode;
        builder.has_updated_episode = this.has_updated_episode;
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
        if (this.play_vv != null) {
            i = this.play_vv.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.collect_vv != null) {
            i2 = this.collect_vv.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.current_episode != null) {
            i3 = this.current_episode.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.updated_to_episode != null) {
            i4 = this.updated_to_episode.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.has_updated_episode != null) {
            i6 = this.has_updated_episode.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.play_vv != null) {
            sb.append(", play_vv=");
            sb.append(this.play_vv);
        }
        if (this.collect_vv != null) {
            sb.append(", collect_vv=");
            sb.append(this.collect_vv);
        }
        if (this.current_episode != null) {
            sb.append(", current_episode=");
            sb.append(this.current_episode);
        }
        if (this.updated_to_episode != null) {
            sb.append(", updated_to_episode=");
            sb.append(this.updated_to_episode);
        }
        if (this.has_updated_episode != null) {
            sb.append(", has_updated_episode=");
            sb.append(this.has_updated_episode);
        }
        StringBuilder replace = sb.replace(0, 2, "MixStatisStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MixStatisStructV2)) {
            return false;
        }
        MixStatisStructV2 mixStatisStructV2 = (MixStatisStructV2) obj;
        if (!unknownFields().equals(mixStatisStructV2.unknownFields()) || !Internal.equals(this.play_vv, mixStatisStructV2.play_vv) || !Internal.equals(this.collect_vv, mixStatisStructV2.collect_vv) || !Internal.equals(this.current_episode, mixStatisStructV2.current_episode) || !Internal.equals(this.updated_to_episode, mixStatisStructV2.updated_to_episode) || !Internal.equals(this.has_updated_episode, mixStatisStructV2.has_updated_episode)) {
            return false;
        }
        return true;
    }

    public MixStatisStructV2(Long l, Long l2, Long l3, Long l4, Long l5) {
        this(l, l2, l3, l4, l5, ByteString.EMPTY);
    }

    public MixStatisStructV2(Long l, Long l2, Long l3, Long l4, Long l5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.play_vv = l;
        this.collect_vv = l2;
        this.current_episode = l3;
        this.updated_to_episode = l4;
        this.has_updated_episode = l5;
    }
}
