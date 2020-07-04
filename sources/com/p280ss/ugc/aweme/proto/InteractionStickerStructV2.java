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

/* renamed from: com.ss.ugc.aweme.proto.InteractionStickerStructV2 */
public final class InteractionStickerStructV2 extends Message<InteractionStickerStructV2, Builder> {
    public static final ProtoAdapter<InteractionStickerStructV2> ADAPTER = new ProtoAdapter_InteractionStickerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String attr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer index;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PoiStructV2#ADAPTER", tag = 3)
    public PoiStructV2 poi_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String track_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VoteStructV2#ADAPTER", tag = 6)
    public VoteStructV2 vote_info;

    /* renamed from: com.ss.ugc.aweme.proto.InteractionStickerStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<InteractionStickerStructV2, Builder> {
        public String attr;
        public Integer index;
        public PoiStructV2 poi_info;
        public String track_info;
        public Integer type;
        public VoteStructV2 vote_info;

        public final InteractionStickerStructV2 build() {
            InteractionStickerStructV2 interactionStickerStructV2 = new InteractionStickerStructV2(this.type, this.index, this.poi_info, this.track_info, this.attr, this.vote_info, super.buildUnknownFields());
            return interactionStickerStructV2;
        }

        public final Builder attr(String str) {
            this.attr = str;
            return this;
        }

        public final Builder index(Integer num) {
            this.index = num;
            return this;
        }

        public final Builder poi_info(PoiStructV2 poiStructV2) {
            this.poi_info = poiStructV2;
            return this;
        }

        public final Builder track_info(String str) {
            this.track_info = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder vote_info(VoteStructV2 voteStructV2) {
            this.vote_info = voteStructV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.InteractionStickerStructV2$ProtoAdapter_InteractionStickerStructV2 */
    static final class ProtoAdapter_InteractionStickerStructV2 extends ProtoAdapter<InteractionStickerStructV2> {
        public ProtoAdapter_InteractionStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, InteractionStickerStructV2.class);
        }

        public final int encodedSize(InteractionStickerStructV2 interactionStickerStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, interactionStickerStructV2.type) + ProtoAdapter.INT32.encodedSizeWithTag(2, interactionStickerStructV2.index) + PoiStructV2.ADAPTER.encodedSizeWithTag(3, interactionStickerStructV2.poi_info) + ProtoAdapter.STRING.encodedSizeWithTag(4, interactionStickerStructV2.track_info) + ProtoAdapter.STRING.encodedSizeWithTag(5, interactionStickerStructV2.attr) + VoteStructV2.ADAPTER.encodedSizeWithTag(6, interactionStickerStructV2.vote_info) + interactionStickerStructV2.unknownFields().size();
        }

        public final InteractionStickerStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.index((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.poi_info((PoiStructV2) PoiStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.track_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.attr((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.vote_info((VoteStructV2) VoteStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, InteractionStickerStructV2 interactionStickerStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, interactionStickerStructV2.type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, interactionStickerStructV2.index);
            PoiStructV2.ADAPTER.encodeWithTag(protoWriter, 3, interactionStickerStructV2.poi_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, interactionStickerStructV2.track_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, interactionStickerStructV2.attr);
            VoteStructV2.ADAPTER.encodeWithTag(protoWriter, 6, interactionStickerStructV2.vote_info);
            protoWriter.writeBytes(interactionStickerStructV2.unknownFields());
        }
    }

    public InteractionStickerStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.index = this.index;
        builder.poi_info = this.poi_info;
        builder.track_info = this.track_info;
        builder.attr = this.attr;
        builder.vote_info = this.vote_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.index != null) {
            i2 = this.index.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.poi_info != null) {
            i3 = this.poi_info.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.track_info != null) {
            i4 = this.track_info.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.attr != null) {
            i5 = this.attr.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.vote_info != null) {
            i7 = this.vote_info.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.index != null) {
            sb.append(", index=");
            sb.append(this.index);
        }
        if (this.poi_info != null) {
            sb.append(", poi_info=");
            sb.append(this.poi_info);
        }
        if (this.track_info != null) {
            sb.append(", track_info=");
            sb.append(this.track_info);
        }
        if (this.attr != null) {
            sb.append(", attr=");
            sb.append(this.attr);
        }
        if (this.vote_info != null) {
            sb.append(", vote_info=");
            sb.append(this.vote_info);
        }
        StringBuilder replace = sb.replace(0, 2, "InteractionStickerStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InteractionStickerStructV2)) {
            return false;
        }
        InteractionStickerStructV2 interactionStickerStructV2 = (InteractionStickerStructV2) obj;
        if (!unknownFields().equals(interactionStickerStructV2.unknownFields()) || !Internal.equals(this.type, interactionStickerStructV2.type) || !Internal.equals(this.index, interactionStickerStructV2.index) || !Internal.equals(this.poi_info, interactionStickerStructV2.poi_info) || !Internal.equals(this.track_info, interactionStickerStructV2.track_info) || !Internal.equals(this.attr, interactionStickerStructV2.attr) || !Internal.equals(this.vote_info, interactionStickerStructV2.vote_info)) {
            return false;
        }
        return true;
    }

    public InteractionStickerStructV2(Integer num, Integer num2, PoiStructV2 poiStructV2, String str, String str2, VoteStructV2 voteStructV2) {
        this(num, num2, poiStructV2, str, str2, voteStructV2, ByteString.EMPTY);
    }

    public InteractionStickerStructV2(Integer num, Integer num2, PoiStructV2 poiStructV2, String str, String str2, VoteStructV2 voteStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.index = num2;
        this.poi_info = poiStructV2;
        this.track_info = str;
        this.attr = str2;
        this.vote_info = voteStructV2;
    }
}
