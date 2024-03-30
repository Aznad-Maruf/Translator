package hood.robin.translator.controller;

import hood.robin.translator.model.TranslationRequest;
import hood.robin.translator.model.TranslationResponse;
import hood.robin.translator.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Khandaker Maruf
 * Date: 30 Mar 2024
 */
@RestController
@RequestMapping("dictionary")
public class DictionaryController {

    @Autowired
    private TranslationService translationService;

    @GetMapping("/translate")
    public TranslationResponse translate(@RequestBody TranslationRequest translationRequest) {
        return translationService.translate(translationRequest);
    }
}
