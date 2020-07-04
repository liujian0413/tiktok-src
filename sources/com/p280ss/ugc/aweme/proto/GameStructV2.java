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

/* renamed from: com.ss.ugc.aweme.proto.GameStructV2 */
public final class GameStructV2 extends Message<GameStructV2, Builder> {
    public static final ProtoAdapter<GameStructV2> ADAPTER = new ProtoAdapter_GameStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer game_score;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer game_type;

    /* renamed from: com.ss.ugc.aweme.proto.GameStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GameStructV2, Builder> {
        public Integer game_score;
        public Integer game_type;

        public final GameStructV2 build() {
            return new GameStructV2(this.game_type, this.game_score, super.buildUnknownFields());
        }

        public final Builder game_score(Integer num) {
            this.game_score = num;
            return this;
        }

        public final Builder game_type(Integer num) {
            this.game_type = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.GameStructV2$ProtoAdapter_GameStructV2 */
    static final class ProtoAdapter_GameStructV2 extends ProtoAdapter<GameStructV2> {
        public ProtoAdapter_GameStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, GameStructV2.class);
        }

        public final int encodedSize(GameStructV2 gameStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, gameStructV2.game_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, gameStructV2.game_score) + gameStructV2.unknownFields().size();
        }

        public final GameStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.game_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.game_score((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GameStructV2 gameStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, gameStructV2.game_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, gameStructV2.game_score);
            protoWriter.writeBytes(gameStructV2.unknownFields());
        }
    }

    public GameStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.game_type = this.game_type;
        builder.game_score = this.game_score;
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
        if (this.game_type != null) {
            i = this.game_type.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.game_score != null) {
            i3 = this.game_score.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.game_type != null) {
            sb.append(", game_type=");
            sb.append(this.game_type);
        }
        if (this.game_score != null) {
            sb.append(", game_score=");
            sb.append(this.game_score);
        }
        StringBuilder replace = sb.replace(0, 2, "GameStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GameStructV2)) {
            return false;
        }
        GameStructV2 gameStructV2 = (GameStructV2) obj;
        if (!unknownFields().equals(gameStructV2.unknownFields()) || !Internal.equals(this.game_type, gameStructV2.game_type) || !Internal.equals(this.game_score, gameStructV2.game_score)) {
            return false;
        }
        return true;
    }

    public GameStructV2(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public GameStructV2(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.game_type = num;
        this.game_score = num2;
    }
}
