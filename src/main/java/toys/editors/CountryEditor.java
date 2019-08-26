package toys.editors;

import toys.entity.Country;
import toys.service.CountryService;

import java.beans.PropertyEditorSupport;

/**
 * Created by Michail on 8/25/2019.
 */
public class CountryEditor extends PropertyEditorSupport {
    private final CountryService countryService;

    public CountryEditor(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public void setAsText(String idFromJsp) throws IllegalArgumentException {
        Country country=countryService.findOne(Integer.parseInt(idFromJsp));

        setValue(country);
    }
}
