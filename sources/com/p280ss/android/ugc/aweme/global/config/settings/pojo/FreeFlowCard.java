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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FreeFlowCard */
public final class FreeFlowCard extends Message<FreeFlowCard, Builder> {
    public static final DefaultValueProtoAdapter<FreeFlowCard> ADAPTER = new ProtoAdapter_FreeFlowCard();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String entry_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String entry_url_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String toast_slogan;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String toast_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer toast_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String toast_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String toast_url_text;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FreeFlowCard$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FreeFlowCard, Builder> {
        public String entry_url;
        public String entry_url_text;
        public String toast_slogan;
        public String toast_title;
        public Integer toast_type;
        public String toast_url;
        public String toast_url_text;

        public final FreeFlowCard build() {
            FreeFlowCard freeFlowCard = new FreeFlowCard(this.toast_url, this.entry_url_text, this.entry_url, this.toast_title, this.toast_url_text, this.toast_type, this.toast_slogan, super.buildUnknownFields());
            return freeFlowCard;
        }

        public final Builder entry_url(String str) {
            this.entry_url = str;
            return this;
        }

        public final Builder entry_url_text(String str) {
            this.entry_url_text = str;
            return this;
        }

        public final Builder toast_slogan(String str) {
            this.toast_slogan = str;
            return this;
        }

        public final Builder toast_title(String str) {
            this.toast_title = str;
            return this;
        }

        public final Builder toast_type(Integer num) {
            this.toast_type = num;
            return this;
        }

        public final Builder toast_url(String str) {
            this.toast_url = str;
            return this;
        }

        public final Builder toast_url_text(String str) {
            this.toast_url_text = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FreeFlowCard$ProtoAdapter_FreeFlowCard */
    static final class ProtoAdapter_FreeFlowCard extends DefaultValueProtoAdapter<FreeFlowCard> {
        public final FreeFlowCard redact(FreeFlowCard freeFlowCard) {
            return freeFlowCard;
        }

        public ProtoAdapter_FreeFlowCard() {
            super(FieldEncoding.LENGTH_DELIMITED, FreeFlowCard.class);
        }

        public final FreeFlowCard decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FreeFlowCard) null);
        }

        public final int encodedSize(FreeFlowCard freeFlowCard) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, freeFlowCard.toast_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, freeFlowCard.entry_url_text) + ProtoAdapter.STRING.encodedSizeWithTag(3, freeFlowCard.entry_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, freeFlowCard.toast_title) + ProtoAdapter.STRING.encodedSizeWithTag(5, freeFlowCard.toast_url_text) + ProtoAdapter.INT32.encodedSizeWithTag(6, freeFlowCard.toast_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, freeFlowCard.toast_slogan) + freeFlowCard.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FreeFlowCard freeFlowCard) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, freeFlowCard.toast_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, freeFlowCard.entry_url_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, freeFlowCard.entry_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, freeFlowCard.toast_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, freeFlowCard.toast_url_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, freeFlowCard.toast_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, freeFlowCard.toast_slogan);
            protoWriter.writeBytes(freeFlowCard.unknownFields());
        }

        public final FreeFlowCard decode(ProtoReader protoReader, FreeFlowCard freeFlowCard) throws IOException {
            Builder builder;
            FreeFlowCard freeFlowCard2 = (FreeFlowCard) C10938a.m32097a().mo26425a(FreeFlowCard.class, freeFlowCard);
            if (freeFlowCard2 != null) {
                builder = freeFlowCard2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.toast_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.entry_url_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.entry_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.toast_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.toast_url_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.toast_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.toast_slogan((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (freeFlowCard2 != null) {
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

    public final String getEntryUrl() throws NullValueException {
        if (this.entry_url != null) {
            return this.entry_url;
        }
        throw new NullValueException();
    }

    public final String getEntryUrlText() throws NullValueException {
        if (this.entry_url_text != null) {
            return this.entry_url_text;
        }
        throw new NullValueException();
    }

    public final String getToastSlogan() throws NullValueException {
        if (this.toast_slogan != null) {
            return this.toast_slogan;
        }
        throw new NullValueException();
    }

    public final String getToastTitle() throws NullValueException {
        if (this.toast_title != null) {
            return this.toast_title;
        }
        throw new NullValueException();
    }

    public final Integer getToastType() throws NullValueException {
        if (this.toast_type != null) {
            return this.toast_type;
        }
        throw new NullValueException();
    }

    public final String getToastUrl() throws NullValueException {
        if (this.toast_url != null) {
            return this.toast_url;
        }
        throw new NullValueException();
    }

    public final String getToastUrlText() throws NullValueException {
        if (this.toast_url_text != null) {
            return this.toast_url_text;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.toast_url = this.toast_url;
        builder.entry_url_text = this.entry_url_text;
        builder.entry_url = this.entry_url;
        builder.toast_title = this.toast_title;
        builder.toast_url_text = this.toast_url_text;
        builder.toast_type = this.toast_type;
        builder.toast_slogan = this.toast_slogan;
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
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i8 = 0;
        if (this.toast_url != null) {
            i = this.toast_url.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        if (this.entry_url_text != null) {
            i2 = this.entry_url_text.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        if (this.entry_url != null) {
            i3 = this.entry_url.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.toast_title != null) {
            i4 = this.toast_title.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        if (this.toast_url_text != null) {
            i5 = this.toast_url_text.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        if (this.toast_type != null) {
            i6 = this.toast_type.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        if (this.toast_slogan != null) {
            i8 = this.toast_slogan.hashCode();
        }
        int i15 = i14 + i8;
        this.hashCode = i15;
        return i15;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.toast_url != null) {
            sb.append(", toast_url=");
            sb.append(this.toast_url);
        }
        if (this.entry_url_text != null) {
            sb.append(", entry_url_text=");
            sb.append(this.entry_url_text);
        }
        if (this.entry_url != null) {
            sb.append(", entry_url=");
            sb.append(this.entry_url);
        }
        if (this.toast_title != null) {
            sb.append(", toast_title=");
            sb.append(this.toast_title);
        }
        if (this.toast_url_text != null) {
            sb.append(", toast_url_text=");
            sb.append(this.toast_url_text);
        }
        if (this.toast_type != null) {
            sb.append(", toast_type=");
            sb.append(this.toast_type);
        }
        if (this.toast_slogan != null) {
            sb.append(", toast_slogan=");
            sb.append(this.toast_slogan);
        }
        StringBuilder replace = sb.replace(0, 2, "FreeFlowCard{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeFlowCard)) {
            return false;
        }
        FreeFlowCard freeFlowCard = (FreeFlowCard) obj;
        if (!unknownFields().equals(freeFlowCard.unknownFields()) || !Internal.equals(this.toast_url, freeFlowCard.toast_url) || !Internal.equals(this.entry_url_text, freeFlowCard.entry_url_text) || !Internal.equals(this.entry_url, freeFlowCard.entry_url) || !Internal.equals(this.toast_title, freeFlowCard.toast_title) || !Internal.equals(this.toast_url_text, freeFlowCard.toast_url_text) || !Internal.equals(this.toast_type, freeFlowCard.toast_type) || !Internal.equals(this.toast_slogan, freeFlowCard.toast_slogan)) {
            return false;
        }
        return true;
    }

    public FreeFlowCard(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        this(str, str2, str3, str4, str5, num, str6, ByteString.EMPTY);
    }

    public FreeFlowCard(String str, String str2, String str3, String str4, String str5, Integer num, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.toast_url = str;
        this.entry_url_text = str2;
        this.entry_url = str3;
        this.toast_title = str4;
        this.toast_url_text = str5;
        this.toast_type = num;
        this.toast_slogan = str6;
    }
}
