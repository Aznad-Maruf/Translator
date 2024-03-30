package hood.robin.translator.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Khandaker Maruf
 * Date: 30 Mar 2024
 */
@Getter
@Setter
public class TranslationResponse {

    private String sourceWord;

    private String meaning;

    private List<String> sentences;

    public TranslationResponse() {
        sentences = new ArrayList<>();
    }
}
