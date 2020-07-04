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

/* renamed from: com.ss.ugc.aweme.proto.LifeStoryBlockStructV2 */
public final class LifeStoryBlockStructV2 extends Message<LifeStoryBlockStructV2, Builder> {
    public static final ProtoAdapter<LifeStoryBlockStructV2> ADAPTER = new ProtoAdapter_LifeStoryBlockStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean life_story_block;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean life_story_blocked;

    /* renamed from: com.ss.ugc.aweme.proto.LifeStoryBlockStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LifeStoryBlockStructV2, Builder> {
        public Boolean life_story_block;
        public Boolean life_story_blocked;

        public final LifeStoryBlockStructV2 build() {
            return new LifeStoryBlockStructV2(this.life_story_block, this.life_story_blocked, super.buildUnknownFields());
        }

        public final Builder life_story_block(Boolean bool) {
            this.life_story_block = bool;
            return this;
        }

        public final Builder life_story_blocked(Boolean bool) {
            this.life_story_blocked = bool;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.LifeStoryBlockStructV2$ProtoAdapter_LifeStoryBlockStructV2 */
    static final class ProtoAdapter_LifeStoryBlockStructV2 extends ProtoAdapter<LifeStoryBlockStructV2> {
        public ProtoAdapter_LifeStoryBlockStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LifeStoryBlockStructV2.class);
        }

        public final int encodedSize(LifeStoryBlockStructV2 lifeStoryBlockStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, lifeStoryBlockStructV2.life_story_block) + ProtoAdapter.BOOL.encodedSizeWithTag(2, lifeStoryBlockStructV2.life_story_blocked) + lifeStoryBlockStructV2.unknownFields().size();
        }

        public final LifeStoryBlockStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.life_story_block((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.life_story_blocked((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, LifeStoryBlockStructV2 lifeStoryBlockStructV2) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, lifeStoryBlockStructV2.life_story_block);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, lifeStoryBlockStructV2.life_story_blocked);
            protoWriter.writeBytes(lifeStoryBlockStructV2.unknownFields());
        }
    }

    public LifeStoryBlockStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.life_story_block = this.life_story_block;
        builder.life_story_blocked = this.life_story_blocked;
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
        if (this.life_story_block != null) {
            i = this.life_story_block.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.life_story_blocked != null) {
            i3 = this.life_story_blocked.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.life_story_block != null) {
            sb.append(", life_story_block=");
            sb.append(this.life_story_block);
        }
        if (this.life_story_blocked != null) {
            sb.append(", life_story_blocked=");
            sb.append(this.life_story_blocked);
        }
        StringBuilder replace = sb.replace(0, 2, "LifeStoryBlockStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifeStoryBlockStructV2)) {
            return false;
        }
        LifeStoryBlockStructV2 lifeStoryBlockStructV2 = (LifeStoryBlockStructV2) obj;
        if (!unknownFields().equals(lifeStoryBlockStructV2.unknownFields()) || !Internal.equals(this.life_story_block, lifeStoryBlockStructV2.life_story_block) || !Internal.equals(this.life_story_blocked, lifeStoryBlockStructV2.life_story_blocked)) {
            return false;
        }
        return true;
    }

    public LifeStoryBlockStructV2(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public LifeStoryBlockStructV2(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.life_story_block = bool;
        this.life_story_blocked = bool2;
    }
}
