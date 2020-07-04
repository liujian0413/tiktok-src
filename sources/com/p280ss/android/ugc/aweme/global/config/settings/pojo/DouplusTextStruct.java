package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouplusTextStruct */
public final class DouplusTextStruct extends Message<DouplusTextStruct, Builder> {
    public static final DefaultValueProtoAdapter<DouplusTextStruct> ADAPTER = new ProtoAdapter_DouplusTextStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer type;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouplusTextStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DouplusTextStruct, Builder> {
        public String title;
        public Integer type;

        public final DouplusTextStruct build() {
            return new DouplusTextStruct(this.type, this.title, super.buildUnknownFields());
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouplusTextStruct$ProtoAdapter_DouplusTextStruct */
    static final class ProtoAdapter_DouplusTextStruct extends DefaultValueProtoAdapter<DouplusTextStruct> {
        public final DouplusTextStruct redact(DouplusTextStruct douplusTextStruct) {
            return douplusTextStruct;
        }

        public ProtoAdapter_DouplusTextStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, DouplusTextStruct.class);
        }

        public final DouplusTextStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (DouplusTextStruct) null);
        }

        public final int encodedSize(DouplusTextStruct douplusTextStruct) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, douplusTextStruct.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, douplusTextStruct.title) + douplusTextStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, DouplusTextStruct douplusTextStruct) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, douplusTextStruct.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, douplusTextStruct.title);
            protoWriter.writeBytes(douplusTextStruct.unknownFields());
        }

        public final DouplusTextStruct decode(ProtoReader protoReader, DouplusTextStruct douplusTextStruct) throws IOException {
            Builder builder;
            DouplusTextStruct douplusTextStruct2 = (DouplusTextStruct) C10938a.m32097a().mo26425a(DouplusTextStruct.class, douplusTextStruct);
            if (douplusTextStruct2 != null) {
                builder = douplusTextStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (douplusTextStruct2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getTitle() throws NullValueException {
        if (this.title != null) {
            return this.title;
        }
        throw new NullValueException();
    }

    public final Integer getType() throws NullValueException {
        if (this.type != null) {
            return this.type;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.title = this.title;
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
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.title != null) {
            i3 = this.title.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        StringBuilder replace = sb.replace(0, 2, "DouplusTextStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DouplusTextStruct)) {
            return false;
        }
        DouplusTextStruct douplusTextStruct = (DouplusTextStruct) obj;
        if (!unknownFields().equals(douplusTextStruct.unknownFields()) || !Internal.equals(this.type, douplusTextStruct.type) || !Internal.equals(this.title, douplusTextStruct.title)) {
            return false;
        }
        return true;
    }

    public DouplusTextStruct(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public DouplusTextStruct(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.title = str;
    }
}
