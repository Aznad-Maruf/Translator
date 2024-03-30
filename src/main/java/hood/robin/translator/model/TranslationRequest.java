package hood.robin.translator.model;

import lombok.*;

/**
 * Author: Khandaker Maruf
 * Date: 30 Mar 2024
 */
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class TranslationRequest {

    private String sourceWord;

    public TranslationRequest(String sourceWord) {
        this.sourceWord = sourceWord;
    }
}
