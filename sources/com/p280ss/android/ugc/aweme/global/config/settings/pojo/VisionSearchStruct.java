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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchStruct */
public final class VisionSearchStruct extends Message<VisionSearchStruct, Builder> {
    public static final DefaultValueProtoAdapter<VisionSearchStruct> ADAPTER = new ProtoAdapter_VisionSearchStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchPrivacy#ADAPTER", tag = 1)
    public final VisionSearchPrivacy privacy;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VisionSearchStruct, Builder> {
        public VisionSearchPrivacy privacy;

        public final VisionSearchStruct build() {
            return new VisionSearchStruct(this.privacy, super.buildUnknownFields());
        }

        public final Builder privacy(VisionSearchPrivacy visionSearchPrivacy) {
            this.privacy = visionSearchPrivacy;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchStruct$ProtoAdapter_VisionSearchStruct */
    static final class ProtoAdapter_VisionSearchStruct extends DefaultValueProtoAdapter<VisionSearchStruct> {
        public final VisionSearchStruct redact(VisionSearchStruct visionSearchStruct) {
            return visionSearchStruct;
        }

        public ProtoAdapter_VisionSearchStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, VisionSearchStruct.class);
        }

        public final VisionSearchStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (VisionSearchStruct) null);
        }

        public final int encodedSize(VisionSearchStruct visionSearchStruct) {
            return VisionSearchPrivacy.ADAPTER.encodedSizeWithTag(1, visionSearchStruct.privacy) + visionSearchStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, VisionSearchStruct visionSearchStruct) throws IOException {
            VisionSearchPrivacy.ADAPTER.encodeWithTag(protoWriter, 1, visionSearchStruct.privacy);
            protoWriter.writeBytes(visionSearchStruct.unknownFields());
        }

        public final VisionSearchStruct decode(ProtoReader protoReader, VisionSearchStruct visionSearchStruct) throws IOException {
            Builder builder;
            VisionSearchStruct visionSearchStruct2 = (VisionSearchStruct) C10938a.m32097a().mo26425a(VisionSearchStruct.class, visionSearchStruct);
            if (visionSearchStruct2 != null) {
                builder = visionSearchStruct2.newBuilder();
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
                        if (visionSearchStruct2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.privacy((VisionSearchPrivacy) VisionSearchPrivacy.ADAPTER.decode(protoReader, builder.privacy));
                }
            }
        }
    }

    public final VisionSearchPrivacy getPrivacy() throws NullValueException {
        if (this.privacy != null) {
            return this.privacy;
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
        if (this.privacy != null) {
            i = this.privacy.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.privacy = this.privacy;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.privacy != null) {
            sb.append(", privacy=");
            sb.append(this.privacy);
        }
        StringBuilder replace = sb.replace(0, 2, "VisionSearchStruct{");
        replace.append('}');
        return replace.toString();
    }

    public VisionSearchStruct(VisionSearchPrivacy visionSearchPrivacy) {
        this(visionSearchPrivacy, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisionSearchStruct)) {
            return false;
        }
        VisionSearchStruct visionSearchStruct = (VisionSearchStruct) obj;
        if (!unknownFields().equals(visionSearchStruct.unknownFields()) || !Internal.equals(this.privacy, visionSearchStruct.privacy)) {
            return false;
        }
        return true;
    }

    public VisionSearchStruct(VisionSearchPrivacy visionSearchPrivacy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.privacy = visionSearchPrivacy;
    }
}
