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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.MpTab */
public final class MpTab extends Message<MpTab, Builder> {
    public static final DefaultValueProtoAdapter<MpTab> ADAPTER = new ProtoAdapter_MpTab();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String publish;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.MpTab$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MpTab, Builder> {
        public String publish;

        public final MpTab build() {
            return new MpTab(this.publish, super.buildUnknownFields());
        }

        public final Builder publish(String str) {
            this.publish = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.MpTab$ProtoAdapter_MpTab */
    static final class ProtoAdapter_MpTab extends DefaultValueProtoAdapter<MpTab> {
        public final MpTab redact(MpTab mpTab) {
            return mpTab;
        }

        public ProtoAdapter_MpTab() {
            super(FieldEncoding.LENGTH_DELIMITED, MpTab.class);
        }

        public final MpTab decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (MpTab) null);
        }

        public final int encodedSize(MpTab mpTab) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, mpTab.publish) + mpTab.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, MpTab mpTab) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mpTab.publish);
            protoWriter.writeBytes(mpTab.unknownFields());
        }

        public final MpTab decode(ProtoReader protoReader, MpTab mpTab) throws IOException {
            Builder builder;
            MpTab mpTab2 = (MpTab) C10938a.m32097a().mo26425a(MpTab.class, mpTab);
            if (mpTab2 != null) {
                builder = mpTab2.newBuilder();
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
                        if (mpTab2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.publish((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getPublish() throws NullValueException {
        if (this.publish != null) {
            return this.publish;
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
        if (this.publish != null) {
            i = this.publish.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.publish = this.publish;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.publish != null) {
            sb.append(", publish=");
            sb.append(this.publish);
        }
        StringBuilder replace = sb.replace(0, 2, "MpTab{");
        replace.append('}');
        return replace.toString();
    }

    public MpTab(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MpTab)) {
            return false;
        }
        MpTab mpTab = (MpTab) obj;
        if (!unknownFields().equals(mpTab.unknownFields()) || !Internal.equals(this.publish, mpTab.publish)) {
            return false;
        }
        return true;
    }

    public MpTab(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.publish = str;
    }
}
