package hood.robin.translator.service;

import hood.robin.translator.model.TranslationRequest;
import hood.robin.translator.model.TranslationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Khandaker Maruf
 * Date: 30 Mar 2024
 */
public class TranslationDao {

    public static Map<TranslationRequest, TranslationResponse> translationData = new HashMap<>();

    static {
        String sourceWord = "Artificial Intelligence";

        TranslationResponse demoResponse = new TranslationResponse();
        demoResponse.setSourceWord(sourceWord);
        demoResponse.setMeaning("Artificial intelligence is the simulation of human intelligence processes by machines, especially computer systems.");
        demoResponse.setSentences(new ArrayList<>(){{
            add("Artificial intelligence is the next revolution.");
            add("Artificial intelligence is a fascinating and exciting and at the same time dangerous topic.");
        }});

        translationData.put(new TranslationRequest(sourceWord), demoResponse);
    }
}
