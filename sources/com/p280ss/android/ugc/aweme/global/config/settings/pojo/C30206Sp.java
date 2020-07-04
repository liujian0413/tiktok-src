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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Sp */
public final class C30206Sp extends Message<C30206Sp, Builder> {
    public static final DefaultValueProtoAdapter<C30206Sp> ADAPTER = new ProtoAdapter_Sp();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String estr;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Sp$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C30206Sp, Builder> {
        public String estr;

        public final C30206Sp build() {
            return new C30206Sp(this.estr, super.buildUnknownFields());
        }

        public final Builder estr(String str) {
            this.estr = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Sp$ProtoAdapter_Sp */
    static final class ProtoAdapter_Sp extends DefaultValueProtoAdapter<C30206Sp> {
        public final C30206Sp redact(C30206Sp sp) {
            return sp;
        }

        public ProtoAdapter_Sp() {
            super(FieldEncoding.LENGTH_DELIMITED, C30206Sp.class);
        }

        public final C30206Sp decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C30206Sp) null);
        }

        public final int encodedSize(C30206Sp sp) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sp.estr) + sp.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C30206Sp sp) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sp.estr);
            protoWriter.writeBytes(sp.unknownFields());
        }

        public final C30206Sp decode(ProtoReader protoReader, C30206Sp sp) throws IOException {
            Builder builder;
            C30206Sp sp2 = (C30206Sp) C10938a.m32097a().mo26425a(C30206Sp.class, sp);
            if (sp2 != null) {
                builder = sp2.newBuilder();
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
                        if (sp2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.estr((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getEstr() throws NullValueException {
        if (this.estr != null) {
            return this.estr;
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
        if (this.estr != null) {
            i = this.estr.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.estr = this.estr;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.estr != null) {
            sb.append(", estr=");
            sb.append(this.estr);
        }
        StringBuilder replace = sb.replace(0, 2, "Sp{");
        replace.append('}');
        return replace.toString();
    }

    public C30206Sp(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30206Sp)) {
            return false;
        }
        C30206Sp sp = (C30206Sp) obj;
        if (!unknownFields().equals(sp.unknownFields()) || !Internal.equals(this.estr, sp.estr)) {
            return false;
        }
        return true;
    }

    public C30206Sp(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.estr = str;
    }
}
