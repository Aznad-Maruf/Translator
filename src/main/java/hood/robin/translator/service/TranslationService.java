package hood.robin.translator.service;

import hood.robin.translator.model.TranslationRequest;
import hood.robin.translator.model.TranslationResponse;
import org.springframework.stereotype.Service;

/**
 * Author: Khandaker Maruf
 * Date: 30 Mar 2024
 */
@Service
public class TranslationService {

    public TranslationResponse translate(TranslationRequest translationRequest) {
        return TranslationDao.translationData.get(translationRequest);
    }
}
