package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide */
public final class UgProfileTabGuide extends Message<UgProfileTabGuide, Builder> {
    public static final DefaultValueProtoAdapter<UgProfileTabGuide> ADAPTER = new ProtoAdapter_UgProfileTabGuide();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgBubble#ADAPTER", tag = 1)
    public final UgBubble bubble;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgProfileTabGuide, Builder> {
        public UgBubble bubble;

        public final UgProfileTabGuide build() {
            return new UgProfileTabGuide(this.bubble, super.buildUnknownFields());
        }

        public final Builder bubble(UgBubble ugBubble) {
            this.bubble = ugBubble;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide$ProtoAdapter_UgProfileTabGuide */
    static final class ProtoAdapter_UgProfileTabGuide extends DefaultValueProtoAdapter<UgProfileTabGuide> {
        public final UgProfileTabGuide redact(UgProfileTabGuide ugProfileTabGuide) {
            return ugProfileTabGuide;
        }

        public ProtoAdapter_UgProfileTabGuide() {
            super(FieldEncoding.LENGTH_DELIMITED, UgProfileTabGuide.class);
        }

        public final UgProfileTabGuide decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgProfileTabGuide) null);
        }

        public final int encodedSize(UgProfileTabGuide ugProfileTabGuide) {
            return UgBubble.ADAPTER.encodedSizeWithTag(1, ugProfileTabGuide.bubble) + ugProfileTabGuide.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgProfileTabGuide ugProfileTabGuide) throws IOException {
            UgBubble.ADAPTER.encodeWithTag(protoWriter, 1, ugProfileTabGuide.bubble);
            protoWriter.writeBytes(ugProfileTabGuide.unknownFields());
        }

        public final UgProfileTabGuide decode(ProtoReader protoReader, UgProfileTabGuide ugProfileTabGuide) throws IOException {
            Builder builder;
            UgProfileTabGuide ugProfileTabGuide2 = (UgProfileTabGuide) C10938a.m32097a().mo26425a(UgProfileTabGuide.class, ugProfileTabGuide);
            if (ugProfileTabGuide2 != null) {
                builder = ugProfileTabGuide2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (ugProfileTabGuide2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.bubble((UgBubble) UgBubble.ADAPTER.decode(protoReader, builder.bubble));
                }
            }
        }
    }

    public final UgBubble getBubble() throws NullValueException {
        if (this.bubble != null) {
            return this.bubble;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.bubble != null) {
            i = this.bubble.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.bubble = this.bubble;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bubble != null) {
            sb.append(", bubble=");
            sb.append(this.bubble);
        }
        StringBuilder replace = sb.replace(0, 2, "UgProfileTabGuide{");
        replace.append('}');
        return replace.toString();
    }

    public UgProfileTabGuide(UgBubble ugBubble) {
        this(ugBubble, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgProfileTabGuide)) {
            return false;
        }
        UgProfileTabGuide ugProfileTabGuide = (UgProfileTabGuide) obj;
        if (!unknownFields().equals(ugProfileTabGuide.unknownFields()) || !Internal.equals(this.bubble, ugProfileTabGuide.bubble)) {
            return false;
        }
        return true;
    }

    public UgProfileTabGuide(UgBubble ugBubble, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bubble = ugBubble;
    }
}
